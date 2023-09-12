# Task 3709
# Security Proxy

You need to create a SecurityProxyConnector class in the connectors package that will check
security before connecting. If the check fails, the connection should not be established.

For the client (in this case the Solution class), using the SecurityProxyConnector should be no different
from using the SimpleConnector class.

P.S. You will need fields of types SecurityChecker and SimpleConnector in the SecurityProxyConnector class.


Requirements:
1. A field of type SimpleConnector must be created in the SecurityProxyConnector class.
2. A field of type SecurityChecker must be created in the SecurityProxyConnector class.
3. The constructor of the SecurityProxyConnector class must take one parameter of the 
	String type and initialize a field of the SimpleConnector type.
4. The connect method of the SecurityProxyConnector class must perform a security check by calling 
	the performSecurityCheck method on an object of type SecurityChecker.
5. If the security check was passed, the connection should be made.
6. If the security check fails, the connection should not be made.
7. The SecurityProxyConnector class must support the Connector interface.