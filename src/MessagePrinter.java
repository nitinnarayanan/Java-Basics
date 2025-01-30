/*Create a class with a method printMessage(String name)
which prints the message "hello <name>".*/

public class MessagePrinter{
    public void printMessage(String name){
        System.out.println("hello "+name);

    }
    public static void main(String[] args){
        MessagePrinter obj = new MessagePrinter();
        obj.printMessage("Nitin");
    }

}