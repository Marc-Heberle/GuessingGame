import java.util.Random;
import java.util.Scanner;

import static java.lang.System.out;

public class GuessingGame {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int numguesses =1;

        int dice = new Random().nextInt(5) + 1;

        int inputNumber = -1;
        do{
            out.print("Zahl zwischen 1 to 6: ");
            inputNumber = keyboard.nextInt();
            if(inputNumber != dice){
                out.println("nochmal");
                numguesses++;
                out.println( numguesses + " . Versuch ");
            }
        }while(inputNumber != dice);
        out.println("**********");
        out.println("*Du hast gewonnen.*");
        out.println("**********");
        out.print("Danke fürs spielen Sie haben " );
        out.println(numguesses + " versuche gebraucht");



        keyboard.close();
    }
}

