public class MyStringExercises
{
    public static void main(String[] args){

        printFirstCharacter("Hello");
        printFirstCharacter("Goodbye");

    }

    private static void printFirstCharacter(String first)
    {
        System.out.println("Print the first character in " + first);
        System.out.println(first.charAt(0));
    }
}
