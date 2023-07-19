package com.javarush.bigtask.task39.task3913.executors;

import java.util.HashSet;
import java.util.Set;

import com.javarush.bigtask.task39.task3913.Argument;
import com.javarush.bigtask.task39.task3913.Event;
import com.javarush.bigtask.task39.task3913.Log;
import com.javarush.bigtask.task39.task3913.LogParser;
import com.javarush.bigtask.task39.task3913.Status;

public class IPExecute extends AbstractExecute<String> {
	public IPExecute(LogParser logParser, Argument<String> argument) {
		super(logParser, argument);
	}

	@Override
	public Set<String> getUnique() {
		return logParser.getUniqueIPs(this.argument.getAfter(), this.argument.getBefore());
	}

	@Override
	public Set<String> getForIP() {
		return null;
	}

	@Override
	public Set<String> getForEvent() {
		return logParser.getIPsForEvent((Event) this.argument.getArg(), this.argument.getAfter(),
				this.argument.getBefore());
	}

	@Override
	public Set<String> getForStatus() {
		return logParser.getIPsForStatus((Status) this.argument.getArg(), this.argument.getAfter(),
				this.argument.getBefore());
	}

	@Override
	public Set<String> getForUser() {
		return logParser.getIPsForUser((String) this.argument.getArg(), this.argument.getAfter(),
				this.argument.getBefore());
	}

	@Override
	public Set<String> getForDate() {
		Set<String> IPs = new HashSet<>();
		for (Log log : logs) {
			if (this.argument.getArg().equals(log.getDate())) {
				IPs.add(log.getIp());
			}
		}
		return IPs;
	}
}
