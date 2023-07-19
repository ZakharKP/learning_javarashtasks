package com.javarush.bigtask.task39.task3913.query;

import java.util.Date;
import java.util.Set;

import com.javarush.bigtask.task39.task3913.Event;
import com.javarush.bigtask.task39.task3913.Status;

public interface IPQuery {
	int getNumberOfUniqueIPs(Date after, Date before);

	Set<String> getUniqueIPs(Date after, Date before);

	Set<String> getIPsForUser(String user, Date after, Date before);

	Set<String> getIPsForEvent(Event event, Date after, Date before);

	Set<String> getIPsForStatus(Status status, Date after, Date before);
}