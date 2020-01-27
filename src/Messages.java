//Timothy Wilks
public class Messages
{
    public static void main(String[] args)
    {
        Thought thinking = new Thought();
        Advice speaking = new Advice();

        thinking.message();
        speaking.message();// overridden method

    }// end of main method
}// end of messages class
