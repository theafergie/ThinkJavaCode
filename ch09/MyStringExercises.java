public class MyStringExercises
{
    public static void main(String[] args){

        printFirstCharacter("Hello");
        printFirstCharacter("Goodbye");

        printLastCharacter("Hello");
        printLastCharacter("Goodbye");

    }

    private static void printFirstCharacter(String first)
    {
        System.out.println("Print the first character in " + first);
        System.out.println(first.charAt(0));
    }

    private static void printLastCharacter(String last)
    {
        int length = last.length();
        System.out.println("Print the last character in " + last);
        System.out.println(last.charAt(length - 1));
    }
}
