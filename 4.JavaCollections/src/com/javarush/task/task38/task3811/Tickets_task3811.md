# Task 3811
# Tickets

Implement the Ticket annotation in a separate file.

Its requirements are as follows:
1) Must be public and available during program execution.
2) Can only be applied to new data types (Class, interface (including annotation type), or enum declaration).
3) Must contain enum Priority with elements LOW, MEDIUM, HIGH.
4) The priority will set the priority property - by default Priority.MEDIUM.
5) The tags property will be an array of strings and will hold the tags associated with the ticket.
6) The createdBy property will be a string - Amigo by default.


## Requirements:
1. Annotation Ticket must be public and available during program execution.
2. The Ticket annotation should only apply to new data types.
3. Annotation Ticket should contain enum Priority with elements LOW, MEDIUM, HIGH.
4. The Ticket annotation must contain the priority property - Priority.MEDIUM by default.
5. The Ticket annotation must contain the tags property - an array of strings, empty by default.
6. The Ticket annotation must contain the createdBy property - a string equal to "Amigo" default.