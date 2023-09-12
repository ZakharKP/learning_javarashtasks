# Task 3008
# Chat

## Chat (17)

The last but most important method of the SocketThread class &ndash; it is the void run() method. Add
his. Its implementation, taking into account the already created methods, looks very simple.

Let's write it down:
1) Request the server address and port using the getServerAddress() and
getServerPort().
2) Create a new java.net.Socket class object using the data received in
the previous paragraph.
3) Create an object of the Connection class using the socket from p.17.2.
4) Call the method that implements the "handshake" client with server
(clientHandshake()).
5) Call the method that implements the main server message processing loop.
6) When an IOException or ClassNotFoundException occurs
notify the main thread about the problem using notifyConnectionStatusChanged() and false
as a parameter.

The client is ready, you can start the server, several clients and check how everything works.

## Chat (18)

Sometimes there are moments when there is no worthy interlocutor. Do not communicate with
yourself :). Let's write a bot that will be a client that
will automatically respond to some commands. The easiest way to implement a bot,
which will be able to send the current time or date when someone asks him about it.

Let's start with it:
1) Create a new BotClient class in the client package. It must be inherited from
client.
2) In the BotClient class, create an inner class BotSocketThread inherited from
SocketThread. The BotSocketThread class must be public.
3) Override methods:
a) getSocketThread(). It must create and return an object of the class
BotSocketThread.
b) shouldSendTextFromConsole(). It should always return false. We do not want,
so that the bot sends the text entered into the console.
c) getUserName(), the method should generate a new bot name, for example:
date_bot_X, where X &ndash; any number between 0 and 99. To generate X, use the Math.random() method.
4) Add the main() method. It should create a new BotClient object and call
its run() method.

## Chat (19)

Now we will implement the BotSocketThread class, or rather, redefine some
its methods, all the main functionality it has already inherited from SocketThread.

1) Redefine clientMainLoop() method:
a) Use the sendTextMessage() method to send a message with text
&quot;Hello chat. I am a bot. I understand commands: date, day, month, year, time, hour, minutes, seconds.
b) Call the clientMainLoop() implementation of the parent class.
2) Override the processIncomingMessage(String message) method. He must
process incoming messages as follows:
a) Output the text of the received message to the console.
b) Get the sender's name and message text from message. They are separated by &quot;: &quot;.
c) Send a response depending on the text of the received message. If the text
messages:
"date" &ndash; send a message containing the current date in the format &quot;d.MM.YYYY&quot;;
"day" &ndash; in the format &quot;d&quot;;
"month" -&quot;MMMM&quot;;
"year" - &quot;YYYY&quot;;
"time" - &quot;H:mm:ss&quot;;
"hour" -&quot;H&quot;;
"minutes" - &quot;m&quot;;
"seconds" - &quot;s&quot;.
Use the above format to create a SimpleDateFormat object. For
to get the current date, you must use the Calendar class and the method
getTime().
The response must contain the name of the client who sent the request and is waiting for a response,
for example, if Bob sent the request "time", we should send a response
"Information for Bob: 12:30:47."

Our bot is ready. Start the server, start the bot, start the normal client, and make sure everything works correctly.
Keep in mind that messages come in many different types and do not always contain ":".

## Chat (20)

We have already implemented the console client, we also did the chat bot, why not do it
GUI client? It will also work with our server, but
have a graphics window, buttons, etc.
So let's get started. When writing a graphical client, it would be very appropriate to use
MVC (Model-View-Controller) pattern. You should have faced him already, if necessary.
Refresh your knowledge of MVC with the help of the Internet. In our task, the simplest implementation
will be in the class responsible for the model (Model).

Let's write it:
1) Create a ClientGuiModel class in the client package. All client classes must be created in this
package.
2) Add a set of strings to it as the final field allUserNames.
It will store a list of all chat participants. Initialize it.
3) Add the String newMessage field, which will store the new message,
received by the client.
4) Add a getter for allUserNames, forbidding to modify the returned
a bunch of. See how this can be done using the Collections class method.
5) Before Add a setter and getter for the newMessage field.
6) Add a public method void addUser(String newUserName) which should add
member name to a set containing all members.
7) Add a public method void deleteUser(String userName) that will delete the name
participant from the set.

## Chat (21)

I have great news for you. The View component is ready. I
added the ClientGuiView class. It uses the javax.swing library. You must properly
understand each line of this class. If you understand everything &ndash; it's great if
no &ndash; be sure to find answers to your questions with the help of debug, documentation or
Internet search.

It remains to write the controller component (Controller):
1) Create a class ClientGuiController inherited from Client.
2) Create and initialize the field responsible for the ClientGuiModel
model.
3) Create and initialize the field responsible for the ClientGuiView view
view. Think about what you need to pass to the constructor when the object is initialized.
4) Add an inner class GuiSocketThread inherited from SocketThread.
The GuiSocketThread class must be public. In it, redefine the following
methods:
a) void processIncomingMessage(String message) &ndash; must install new
message on the model and update the output of messages on
representation.
b) void informAboutAddingNewUser(String userName) &ndash; should add new
user into the model and call to update the output of users from
display.
c) void informAboutDeletingNewUser(String userName) &ndash; must delete
user from the model and call to update the output of users from
display.
d) void notifyConnectionStatusChanged(boolean clientConnected) &ndash; must call
a similar method for the view.
5) Override the methods in the ClientGuiController class:
a) SocketThread getSocketThread() &ndash; must create and return an object of type
GuiSocketThread.
b) void run() &ndash; must receive the SocketThread object via the getSocketThread() method
and call its run() method. Figure out why there's no need to call
the run() method in a separate thread, as we did for the console client.
c) getServerAddress(), getServerPort(), getUserName(). They must call
methods of the same name from the view.
6) Implement the ClientGuiModel getModel() method, which should return a model.
7) Implement the main() method, which should create a new object
ClientGuiController and call its run() method.
Start a client with a graphical window, several console clients and make sure that
everything works correctly.

## Chat (22)

So let's sum it up:
x You wrote a text messaging server.
x You wrote a console client that can connect to the server and
exchange messages with other participants.
x You wrote a client bot that can receive requests and send data about
current date and time.
x You wrote a GUI chat client.

What can be added or improved:
x You can add support for private messages (when a message is not sent
to everyone, but to a specific participant).
x You can expand the capabilities of the bot, try to teach it to respond to
simple questions or send jokes from time to time.
x Add the ability to transfer files between users.
x Add a context menu to the graphical client, e.g. to send
private message to someone from the list of participants.
x Add message coloring in the graphical client depending on the sender.
x Add server blocking of members for something like profanity
vocabulary in messages.
x Add a million more features and usefulness!

You have learned:
x Work with sockets.
x Use serialization and deserialization.
x Create multi-threaded applications, synchronize them, apply a modifier
volatile, use classes from the java.util.concurrent library.
x Apply the MVC pattern.
x Use inner and nested classes.
x Work with the Swing library.
x Use the Calendar and SimpleDateFormat classes.

Keep it up!


Requirements:
1. Congratulations, the chat is ready!