#Determine the network address

1) Given an IP address and a subnet mask, you need to calculate the network address - implement the getNetAddress method.
Use the bitwise conjunction (logical AND) operation.
##Example:
IP address: 11000000 10101000 00000001 00000010 (192.168.1.2)
Subnet mask: 11111111 11111111 11111110 00000000 (255.255.254.0)
Network address: 11000000 10101000 00000000 00000000 (192.168.0.0)
2) Implement the print method, which will output data to the console in binary code. For IP address(192.168.1.2)
the string "11000000 10101000 00000001 00000010" should be displayed
3) The main method is not involved in testing


##Requirements:
1. The getNetAddress method must calculate and return the network address according to the passed parameters (IP address and subnet mask).
2. The getNetAddress method must be static and public.
3. The print method must be static and public.
4. The print method must convert the IP address passed to it into binary code and display it on the screen (as in the condition).