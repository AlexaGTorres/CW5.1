public class Slogan
{
    private String phrase;
    private static int count = 0;

    public Slogan (String str)
    {
        phrase = str;
        count++;
    }//Sets up the slogan and counts the number of instances created

    public String toString ()
    {
        return phrase;
    }//Returns this slogan as a string

    public static int getCount ()
    {
        return count;
    }//Returns the number of instances of this class that have been created
}//End class Slogan
