public class MyStringExercises
{

    public static void main(String[] args){

        printFirstCharacter("Hello");
        printFirstCharacter("Goodbye");

        printLastCharacter("Hello");
        printLastCharacter("Goodbye");

        printCharacters("Hello");
        printCharacters("Goodbye");


        printAllButFirstThree("Hello");
        printAllButFirstThree("Goodbye");

        printFirstThree("Hello");
        printFirstThree("Goodbye");

        printPhoneNumber("501-555-0100");

        findFirstE("Hello");
        findFirstE("Goodbye");


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

    private static void printCharacters(String allCharacters)
    {
        System.out.println("Print each character and position");

        for (int i = 0; i < allCharacters.length(); i++)
        {
            char letter = allCharacters.charAt(i);
            System.out.println("The letter " + letter + " is at the index " + i);
        }
    }

    private static void printAllButFirstThree(String after)
    {
        System.out.println(after.substring(3));
    }

    private static void printFirstThree(String before)
    {
        System.out.println(before.substring(0,3));
    }

    private static void printPhoneNumber(String phoneNumber)
    {
        System.out.println("Area Code: " + phoneNumber.substring(0, 3));
        System.out.println("Exchange: " + phoneNumber.substring(4, 7));
        System.out.println("Line Number: " + phoneNumber.substring(8, 12));
    }

    private static void findFirstE(String firstE)
    {
        int index = firstE.indexOf('e');

        System.out.println(index);
        System.out.println(index);
    }
}
