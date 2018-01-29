public class MyStringExercises
{

    public static void main(String[] args){

        printFirstCharacter("Hello");
        printFirstCharacter("Goodbye");

        printLastCharacter("Hello");
        printLastCharacter("Goodbye");

        printCharacters("Hello");

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

    public static void printCharacters(String allCharacters)
    {
        System.out.println("Print each character and position");

        for (int i = 0; i < allCharacters.length(); i++)
        {
            char letter = allCharacters.charAt(i);
            System.out.println("The letter " + letter + " is at the index " + i);
        }
    }
}
