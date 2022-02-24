package qa.automation;

import java.util.Arrays;
import java.util.Scanner;

public class MyFirstJava {
    public static void main(String[] args) {
// writes text in the console);
        System.out.println(" Please enter your name");
// a string variable that will store the value entered from the user
        Scanner scanner = new Scanner(System.in) ;
        String firstname = scanner.next ();
        //System.out.println(" Your name is" +" " + firstname);

        System.out.println(" please enter your age ");

        //integer variable that will store the age entered from the user
        int userAge = scanner.nextInt();

        //System.out.println(" Your age is" +" " + userAge);

        //System.out.println(" Your name is " + firstname + "\n Your age is " + userAge);

        if (userAge >=18){
            System.out.println(firstname + " can drink alcohol");
        }

        if(userAge < 18){
            System.out.println(firstname + " can't by alcohol legally");
        }

        if(userAge >=65 ){
            System.out.println(firstname +" is rentner");
        }


    }
}
