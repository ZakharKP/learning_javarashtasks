package com.javarush.bigtask.task39.task3913;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.javarush.bigtask.task39.task3913.executors.AbstractExecute;
import com.javarush.bigtask.task39.task3913.executors.ExecuteFactory;
import com.javarush.bigtask.task39.task3913.query.DateQuery;
import com.javarush.bigtask.task39.task3913.query.EventQuery;
import com.javarush.bigtask.task39.task3913.query.IPQuery;
import com.javarush.bigtask.task39.task3913.query.QLQuery;
import com.javarush.bigtask.task39.task3913.query.UserQuery;

public class LogParser implements IPQuery, UserQuery, DateQuery, EventQuery, QLQuery {
	Path logDir;
	SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

	public LogParser(Path logDir) {
		this.logDir = logDir;
	}

	public Set<Log> readLogs(Date after, Date before) {
		Set<Log> logs = new HashSet<>();
		Log log;
		long lDate;
		long lAfter = after != null ? after.getTime() : 0;
		long lBefore = before != null ? before.getTime() : Long.MAX_VALUE;
		try (DirectoryStream<Path> stream = Files.newDirectoryStream(logDir)) {
			for (Path path : stream) {
				if (path.toString().endsWith(".log")) {
					try (BufferedReader reader = Files.newBufferedReader(path)) {
						while (reader.ready()) {
							log = readLog(reader.readLine());
							lDate = log.getDate().getTime();
							if (lAfter < lDate && lDate < lBefore) {
								logs.add(log);
							}
						}
					}
				}
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		return logs;
	}

	private Log readLog(String line) {
		Log log = null;
		String[] eventString;
		String ip;
		String user;
		Date date;
		Event event;
		String taskNumber;
		Status status;
		String[] logString = line.split("\t");
		if (logString.length >= 5) {
			ip = logString[0];
			user = logString[1];
			try {
				date = format.parse(logString[2]);
			} catch (ParseException e) {
				throw new RuntimeException(e);
			}
			eventString = logString[3].split(" ");
			event = Event.valueOf(eventString[0]);
			if (eventString.length == 2) {
				taskNumber = eventString[1];
			} else {
				taskNumber = "";
			}
			status = Status.valueOf(logString[4]);
			log = new Log(ip, user, date, event, taskNumber, status);
		}

		return log;
	}

	@Override
	public int getNumberOfUniqueIPs(Date after, Date before) {

		return getUniqueIPs(after, before).size();
	}

	@Override
	public Set<String> getUniqueIPs(Date after, Date before) {
		Set<String> IPs = new HashSet<>();
		for (Log log : readLogs(after, before)) {
			IPs.add(log.getIp());
		}
		return IPs;
	}

	@Override
	public Set<String> getIPsForUser(String user, Date after, Date before) {
		Set<String> IPs = new HashSet<>();
		for (Log log : readLogs(after, before)) {
			if (user.equals(log.getUser())) {
				IPs.add(log.getIp());
			}
		}
		return IPs;
	}

	@Override
	public Set<String> getIPsForEvent(Event event, Date after, Date before) {
		Set<String> IPs = new HashSet<>();
		for (Log log : readLogs(after, before)) {
			if (event.equals(log.getEvent())) {
				IPs.add(log.getIp());
			}
		}
		return IPs;
	}

	@Override
	public Set<String> getIPsForStatus(Status status, Date after, Date before) {

		Set<String> IPs = new HashSet<>();
		for (Log log : readLogs(after, before)) {
			if (status.equals(log.getStatus())) {
				IPs.add(log.getIp());
			}
		}
		return IPs;
	}

	@Override
	public Set<String> getAllUsers() {
		Set<String> users = new HashSet<>();
		for (Log log : readLogs(null, null)) {
			users.add(log.getUser());
		}
		return users;
	}

	@Override
	public int getNumberOfUsers(Date after, Date before) {
		Set<String> users = new HashSet<>();
		for (Log log : readLogs(after, before)) {
			users.add(log.getUser());
		}
		return users.size();
	}

	@Override
	public int getNumberOfUserEvents(String user, Date after, Date before) {
		Set<Event> events = new HashSet<>();
		for (Log log : readLogs(after, before)) {
			if (user.equals(log.getUser())) {
				events.add(log.getEvent());
			}
		}
		return events.size();
	}

	@Override
	public Set<String> getUsersForIP(String ip, Date after, Date before) {
		Set<String> users = new HashSet<>();
		for (Log log : readLogs(after, before)) {
			if (ip.equals(log.getIp())) {
				users.add(log.getUser());
			}
		}
		return users;
	}

	@Override
	public Set<String> getLoggedUsers(Date after, Date before) {
		Set<String> users = new HashSet<>();
		for (Log log : readLogs(after, before)) {
			if (Event.LOGIN.equals(log.getEvent())) {
				users.add(log.getUser());
			}
		}
		return users;
	}

	@Override
	public Set<String> getDownloadedPluginUsers(Date after, Date before) {
		Set<String> users = new HashSet<>();
		for (Log log : readLogs(after, before)) {
			if (Event.DOWNLOAD_PLUGIN.equals(log.getEvent())) {
				users.add(log.getUser());
			}
		}
		return users;
	}

	@Override
	public Set<String> getWroteMessageUsers(Date after, Date before) {
		Set<String> users = new HashSet<>();
		for (Log log : readLogs(after, before)) {
			if (Event.WRITE_MESSAGE.equals(log.getEvent())) {
				users.add(log.getUser());
			}
		}
		return users;
	}

	@Override
	public Set<String> getSolvedTaskUsers(Date after, Date before) {
		Set<String> users = new HashSet<>();
		for (Log log : readLogs(after, before)) {
			if (Event.SOLVE_TASK.equals(log.getEvent())) {
				users.add(log.getUser());
			}
		}
		return users;
	}

	@Override
	public Set<String> getSolvedTaskUsers(Date after, Date before, int task) {
		Set<String> users = new HashSet<>();
		for (Log log : readLogs(after, before)) {
			if (String.valueOf(task).equals(log.getTaskNumber()) && Event.SOLVE_TASK.equals(log.getEvent())) {
				users.add(log.getUser());
			}
		}
		return users;
	}

	@Override
	public Set<String> getDoneTaskUsers(Date after, Date before) {
		Set<String> users = new HashSet<>();
		for (Log log : readLogs(after, before)) {
			if (Event.DONE_TASK.equals(log.getEvent())) {
				users.add(log.getUser());
			}
		}
		return users;
	}

	@Override
	public Set<String> getDoneTaskUsers(Date after, Date before, int task) {
		Set<String> users = new HashSet<>();
		for (Log log : readLogs(after, before)) {
			if (String.valueOf(task).equals(log.getTaskNumber()) && Event.DONE_TASK.equals(log.getEvent())) {
				users.add(log.getUser());
			}
		}
		return users;
	}

	@Override
	public Set<Date> getDatesForUserAndEvent(String user, Event event, Date after, Date before) {
		Set<Date> dates = new HashSet<>();
		for (Log log : readLogs(after, before)) {
			if (user.equals(log.getUser()) && event.equals(log.getEvent())) {
				dates.add(log.getDate());
			}
		}
		return dates;
	}

	@Override
	public Set<Date> getDatesWhenSomethingFailed(Date after, Date before) {
		Set<Date> dates = new HashSet<>();
		for (Log log : readLogs(after, before)) {
			if (Status.FAILED.equals(log.getStatus())) {
				dates.add(log.getDate());
			}
		}
		return dates;
	}

	@Override
	public Set<Date> getDatesWhenErrorHappened(Date after, Date before) {
		Set<Date> dates = new HashSet<>();
		for (Log log : readLogs(after, before)) {
			if (Status.ERROR.equals(log.getStatus())) {
				dates.add(log.getDate());
			}
		}
		return dates;
	}

	@Override
	public Date getDateWhenUserLoggedFirstTime(String user, Date after, Date before) {
		Date date = null;
		long firstDate = Long.MAX_VALUE;
		for (Date date1 : getDatesForUserAndEvent(user, Event.LOGIN, after, before)) {
			if (firstDate > date1.getTime()) {
				date = date1;
				firstDate = date.getTime();
			}
		}
		return date;
	}

	@Override
	public Date getDateWhenUserSolvedTask(String user, int task, Date after, Date before) {
		Date date = null;
		long firstDate = Long.MAX_VALUE;
		for (Log log : readLogs(after, before)) {
			if (user.equals(log.getUser()) && Event.SOLVE_TASK.equals(log.getEvent())
					&& String.valueOf(task).equals(log.getTaskNumber())) {
				if (firstDate > log.getDate().getTime()) {
					date = log.getDate();
					firstDate = date.getTime();
				}
			}
		}
		return date;
	}

	@Override
	public Date getDateWhenUserDoneTask(String user, int task, Date after, Date before) {
		Date date = null;
		long firstDate = Long.MAX_VALUE;
		for (Log log : readLogs(after, before)) {
			if (user.equals(log.getUser()) && Event.DONE_TASK.equals(log.getEvent())
					&& String.valueOf(task).equals(log.getTaskNumber())) {
				if (firstDate > log.getDate().getTime()) {
					date = log.getDate();
					firstDate = date.getTime();
				}
			}
		}
		return date;
	}

	@Override
	public Set<Date> getDatesWhenUserWroteMessage(String user, Date after, Date before) {
		return getDatesForUserAndEvent(user, Event.WRITE_MESSAGE, after, before);
	}

	@Override
	public Set<Date> getDatesWhenUserDownloadedPlugin(String user, Date after, Date before) {
		return getDatesForUserAndEvent(user, Event.DOWNLOAD_PLUGIN, after, before);
	}

	@Override
	public int getNumberOfAllEvents(Date after, Date before) {
		return getAllEvents(after, before).size();
	}

	@Override
	public Set<Event> getAllEvents(Date after, Date before) {
		Set<Event> events = new HashSet<>();
		for (Log log : readLogs(after, before)) {
			events.add(log.getEvent());
		}
		return events;
	}

	@Override
	public Set<Event> getEventsForIP(String ip, Date after, Date before) {
		Set<Event> events = new HashSet<>();
		for (Log log : readLogs(after, before)) {
			if (ip.equals(log.getIp())) {
				events.add(log.getEvent());
			}
		}
		return events;
	}

	@Override
	public Set<Event> getEventsForUser(String user, Date after, Date before) {
		Set<Event> events = new HashSet<>();
		for (Log log : readLogs(after, before)) {
			if (user.equals(log.getUser())) {
				events.add(log.getEvent());
			}
		}
		return events;
	}

	@Override
	public Set<Event> getFailedEvents(Date after, Date before) {
		Set<Event> events = new HashSet<>();
		for (Log log : readLogs(after, before)) {
			if (Status.FAILED.equals(log.getStatus())) {
				events.add(log.getEvent());
			}
		}
		return events;
	}

	@Override
	public Set<Event> getErrorEvents(Date after, Date before) {
		Set<Event> events = new HashSet<>();
		for (Log log : readLogs(after, before)) {
			if (Status.ERROR.equals(log.getStatus())) {
				events.add(log.getEvent());
			}
		}
		return events;
	}

	@Override
	public int getNumberOfAttemptToSolveTask(int task, Date after, Date before) {
		Map<Integer, Integer> map = getAllSolvedTasksAndTheirNumber(after, before);
		int n = map.containsKey(task) ? map.get(task) : 0;
		return n;
	}

	@Override
	public int getNumberOfSuccessfulAttemptToSolveTask(int task, Date after, Date before) {
		Map<Integer, Integer> map = getAllDoneTasksAndTheirNumber(after, before);
		int n = map.containsKey(task) ? map.get(task) : 0;
		return n;
	}

	@Override
	public Map<Integer, Integer> getAllSolvedTasksAndTheirNumber(Date after, Date before) {
		Map<Integer, Integer> map = new HashMap<>();
		for (Log log : readLogs(after, before)) {
			if (Event.SOLVE_TASK.equals(log.getEvent())) {
				int key = Integer.parseInt(log.getTaskNumber());
				if (!map.containsKey(key)) {
					map.put(key, 1);
				} else {
					int count = map.get(key) + 1;
					map.put(key, count);
				}
			}
		}
		return map;
	}

	@Override
	public Map<Integer, Integer> getAllDoneTasksAndTheirNumber(Date after, Date before) {
		Map<Integer, Integer> map = new HashMap<>();
		for (Log log : readLogs(after, before)) {
			if (Event.DONE_TASK.equals(log.getEvent())) {
				int key = Integer.parseInt(log.getTaskNumber());
				if (!map.containsKey(key)) {
					map.put(key, 1);
				} else {
					int count = map.get(key) + 1;
					map.put(key, count);
				}
			}
		}
		return map;
	}

	@Override
	public Set<Object> execute(String query) {
		if (!query.startsWith("get"))
			return new HashSet<>();
		;

		String[] queryes = query.split("=");
		String arg = null;
		AbstractExecute execute = null;
		AbstractExecute.DataType type = null;
		AbstractExecute.DataType argType = null;
		Argument argument = null;
		if (queryes.length == 2) {
			arg = queryes[1];
		} else {
			arg = null;
		}
		queryes = queryes[0].split(" ");

		if (arg != null) {
			argType = AbstractExecute.DataType.valueOf(queryes[3].toUpperCase());
		} else {
			argType = AbstractExecute.DataType.NULL;
		}

		argument = createArgument(arg, argType);
		type = AbstractExecute.DataType.valueOf(queryes[1].toUpperCase());
		execute = ExecuteFactory.createExecuteType(type, this, argument);

		return new HashSet<>(execute.getData());

	}

	private Argument createArgument(String arg, AbstractExecute.DataType type) {
		if (arg != null) {

			String[] argument = arg.split("\"");
			Date after = null;
			Date before = null;
			if (argument.length > 2) {
				try {
					after = format.parse(argument[3]);
					before = format.parse(argument[5]);
				} catch (ParseException e) {
					throw new RuntimeException(e);
				}
			}

			switch (type) {
			case IP:
			case USER:
				return new Argument<String>(argument[1], type, after, before);
			case DATE:
				try {
					return new Argument<Date>(format.parse(argument[1]), type, after, before);
				} catch (ParseException e) {
					throw new RuntimeException(e);
				}
			case EVENT:
				return new Argument<Event>(Event.valueOf(argument[1]), type, after, before);
			case STATUS:
				return new Argument<Status>(Status.valueOf(argument[1]), type, after, before);
			}
		}
		return new Argument<>(null, type, null, null);
	}

}