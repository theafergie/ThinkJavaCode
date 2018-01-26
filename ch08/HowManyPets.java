import java.util.Scanner;

public class HowManyPets
{
    public static void main(String[] args)
    {
        numberOfPets();
        System.out.println();
    }


    private static void numberOfPets()
    {
        Scanner in = new Scanner(System.in);

        System.out.println("How many pets?");
        int numberOfPets = in.nextInt();
        in.nextLine();


        int[] numPets = new int[numberOfPets];
        //System.out.println("Length is: " + numPets.length);

        int currentPet = 0;

        String[] petNames = new String[numPets.length];

        while (currentPet < numPets.length)
        {
            System.out.println("Enter name of pet #" + (currentPet + 1));
            petNames[currentPet] = in.nextLine();
            currentPet++;

        }
        getNames(petNames);
    }
    private static void getNames(String[] names)
    {
        int index = 0;
        while(index < names.length)
        {
            System.out.println("Animal #" + (index + 1) + ": " + names[index]);
            index++;
        }
    }

}
