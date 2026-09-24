import java.util.Scanner;
public class PartyAffiliation
{
    void main(){
        Scanner in = new Scanner(System.in);

       String D;
       String R;
       String I;
       String partyAfil = "";

       IO.print("Enter your party affiliation [DRI]: ");
       partyAfil = in.nextLine();

       /*
       if(partyAfil.equalsIgnoreCase("D"))
            IO.println("You get a democratic donkey! ");
       else if(partyAfil.equalsIgnoreCase("R"))
           IO.println("You get a republican elephant! ");
       else if(partyAfil.equalsIgnoreCase("I"))
           IO.println("You get an independent person! ");
       else
           IO.println("I don't know that party! ");
       */

        switch(partyAfil)
        {
            case "D", "d":
                IO.println("You get a democratic donkey! ");
                return;
            case "R", "r":
                IO.println("You get a republican elephant! ");
            case "I", "i":
                IO.println("You get an independent person! ");
            default:
                IO.println("I don't know that party! ");
        }
    }
}
