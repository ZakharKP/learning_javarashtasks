# Arrange wait-notify

Arrange wait-notify.
Sample output:
Thread-0 MailServer received: [Person [Thread-1] wrote an email &#39;AAA&#39;] in 1001 ms after start


## Requirements:
1. Objects of the MailServer class must work correctly in a multi-threaded environment.
2. Objects of the Person class must work correctly in a multi-threaded environment.
3. The run method of the MailServer class must contain a synchronized block, the monitor is mail.
4. The run method of the Person class must contain a synchronized block, the monitor is mail.