import java.util.Scanner;

public class PetAge
{
    public static void main(String[] args)
    {
        replayPetAges();
    }

    private static void replayPetAges()
    {
        Scanner in = new Scanner(System.in);

        System.out.println("How many pets do you have? ");
        int numberOfPets = in.nextInt();

        int[] petAge = new int[numberOfPets];
        System.out.println("Length is: " + petAge.length);

        int currentPet = 0;

        while (currentPet < petAge.length)
        {
            System.out.println("Enter age of pet " + (currentPet + 1));
            petAge[currentPet] = in.nextInt();
            currentPet++;
        }

      //  currentPet = 0;

        printArray(petAge, "Age ");
    }

    private static void printArray(int[] values, String prefix)
    {
        System.out.println("Welcome to printArray");

        int index = 0;
        while (index < values.length) {
            System.out.println(prefix + (index + 1) + " is " + values[index]);
            index++;
        }
    }
}

