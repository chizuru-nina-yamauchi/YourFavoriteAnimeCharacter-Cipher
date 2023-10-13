import java.util.Scanner;

public class Anime {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Let's make a cipher together.");
        System.out.println("Enter your favourite anime character's name(* use '_' if the name has more than two words): ");
        // the users type their favourite character
        String animeChar = input.nextLine();

        System.out.println("Enter the reason why you love that character.(* use '_' between the words):");
        // the users type their reasons
        String reason = input.nextLine();

        System.out.println("Enter the age of your favorite character: ");
        // the users type their favourite character's age
        double age = input.nextDouble();

        String cipher = FavouriteCharacter(animeChar, reason, age);

        System.out.println("Your cipher: " + cipher);

    }


    public static String FavouriteCharacter(String animeChar, String reason, double age) {

        // concatenate the user's favourite character and the reason
        String concatenate1, reverse, concatenate2;

        concatenate1 = animeChar + reason;

        // reverse concatenate1
        reverse = "";

        for (int i = concatenate1.length() -1; i >= 0; i--){

            reverse += concatenate1.charAt(i);

        }

        /*
         // Reverse concatenate1
        StringBuilder reverse = new StringBuilder(concatenate1).reverse();

        // Concatenate the reversed string with the age
        String concatenate2 = reverse.toString() + age;


        */


        concatenate2 = reverse + age;


     return concatenate2;


    }


}
