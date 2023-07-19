package com.javarush.bigtask.task39.task3913.executors;

import java.util.HashSet;
import java.util.Set;

import com.javarush.bigtask.task39.task3913.Argument;
import com.javarush.bigtask.task39.task3913.Log;
import com.javarush.bigtask.task39.task3913.LogParser;

public class UserExecute extends AbstractExecute<String> {
	public UserExecute(LogParser logParser, Argument<String> argument) {
		super(logParser, argument);
	}

	@Override
	public Set<String> getUnique() {
		return logParser.getAllUsers();
	}

	@Override
	public Set<String> getForIP() {
		return logParser.getUsersForIP((String) this.argument.getArg(), this.argument.getAfter(),
				this.argument.getBefore());
	}

	@Override
	public Set<String> getForEvent() {
		Set<String> users = new HashSet<>();
		for (Log log : logs) {
			if (this.argument.getArg().equals(log.getEvent())) {
				users.add(log.getUser());
			}
		}
		return users;
	}

	@Override
	public Set<String> getForStatus() {
		Set<String> users = new HashSet<>();
		for (Log log : logs) {
			if (this.argument.getArg().equals(log.getStatus())) {
				users.add(log.getUser());
			}
		}
		return users;
	}

	@Override
	public Set<String> getForUser() {
		return null;
	}

	@Override
	public Set<String> getForDate() {
		Set<String> users = new HashSet<>();
		for (Log log : logs) {
			if (this.argument.getArg().equals(log.getDate())) {
				users.add(log.getUser());
			}
		}
		return users;
	}
}
