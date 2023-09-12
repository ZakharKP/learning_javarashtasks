# Task 3209
# Html Editor

## HTML Editor (19)

We implement the actionPerformed(ActionEvent actionEvent) method on the view, this method
inherited from the ActionListener interface and will be called when selecting menu items,
which our view is specified as an event listener.
19.1. Get a command from the event using the getActionCommand() method. It will be
regular string. By this line you can understand which menu item created this
event.
19.2. If the command is "New", call the controller's createNewDocument() method. In that
point and further, if the required method is not yet in the controller, create stubs.
19.3. If it is an "Open" command, call the openDocument() method.
19.4. If "Save", then call saveDocument().
19.5. If "Save As..." - saveDocumentAs().
19.6. If &quot;Exit&quot; - exit().
19.7. If "About", then call the showAbout() method on the view.
Check that the menu items Exit and About the program are working.

## HTML Editor (20)

20.1. Implement the createNewDocument() method for creating a new document in the controller. He
must:
20.1.1. Select the html tab of the view.
20.1.2. Reset the current document.
20.1.3. Set a new window title, for example: "HTML editor". Take advantage
setTitle() method, which is inherited in our view.
20.1.4. Zero out the currentFile variable (set it to null).
20.2. Implement the controller's init() initialization method. It should just call the method
creating a new document.
Check the operation of the New menu item.

## HTML Editor (21)

To open or save a file, we will use JFileChooser from the swing library.
Objects of this type support filters inherited from FileFilter. Now we will write
your filter:
21.1. Create a public class HTMLFileFilter inherited from FileFilter.
21.2. We want the file selector to display only html/htm files or folders.
Override the accept(File f) method to return true if the passed file
directory or contains ".html" at the end of the name or ".htm" case insensitive.
21.3. To display the text in the file selection window in the description of available file types
"HTML and HTM files" override the getDescription() method appropriately.

## HTML Editor (22)

Let's implement a method in the controller to save the file under the new name saveDocumentAs().
The implementation must:
22.1. Switch view to html tab.
22.2. Create a new JFileChooser object to select a file.
22.3. Set it as a filter object HTMLFileFilter.
22.4. Show "Save File" dialog box to select a file.
22.5. If the user confirms the file selection:
22.5.1. Save the selected file in the currentFile field.
22.5.2. Set the file name as the title of the view window.
22.5.3. Create a FileWriter based on currentFile.
22.5.4. Rewrite data from the document document into a FileWriter object in the same way as
as we did in the getPlainText() method.
22.6. The method must not throw exceptions.
Check the operation of the menu item Save As...

## HTML Editor (23)

23.1. Let's write a method to save an open file saveDocument(). The method must
work the same way as saveDocumentAs(), but don't prompt the user for the file, but
use currentFile. If currentFile is null, then call the saveDocumentAs() method.
23.2. It's time to implement the openDocument() method. The method should work
similar to the saveDocumentAs() method, in the part that is responsible for choosing a file.
Hint: Pay attention to the method name for showing the dialog box.
When the file is selected, you must:
23.2.1. Set the new value of currentFile.
23.2.2. Reset document.
23.2.3. Set the filename to the title of the view.
23.2.4. Create a FileReader using currentFile.
23.2.5. Subtract data from FileReader into document using class object
HTMLEditorKit.
23.2.6. Reset edits (call the view's resetUndo method).
23.2.7. If exceptions occur, log them and do not throw them out.
Check the operation of the Save and Open menu items.

## HTML Editor (24)

Your html editor is ready!
You have learned:
- Create applications with a graphical interface.
- Work with dialog boxes.
- Use classes from the Swing library.
- Implement the interaction of program components using events, listeners,
actions.
- Strengthened my knowledge in the field of MVC.

What can be improved in the developed editor:
- Add a toolbar that repeats the functionality of the menu.
- Add highlighting html tags on the second tab.
- Add the ability to download a document from the Internet.
- Expand the editor's capabilities (insert pictures, links, etc.)

Congratulations, keep it up!


Requirements:
1. html editor is ready!