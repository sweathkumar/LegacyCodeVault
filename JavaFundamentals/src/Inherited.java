import java.util.Scanner;
public class Inherited extends Inheritance {
    static void Dog(){
        System.out.println("Bark!");
    }

    static void Lion(){
        System.out.println("Roar!");
    }

    static void Cat(){
        System.out.println("Meow!");
    }

    public static void main(String [] args){
        boolean repeat = true;
        do{
            Scanner myObj = new Scanner(System.in);
            System.out.println("To get details of Dog press 1.\nTo get details of Lion press 2.\nTo get details of cat press 3.");
            String userInput1 = myObj.nextLine();
            switch (userInput1) {

                case "1":
                    eat();
                    Dog();
                    break;

                case "2":
                    eat();
                    Lion();
                    break;

                case "3":
                    eat();
                    Cat();
                    break;

                default:
                    System.out.println("Enter only any one allowed number 1, 2 or 3.");
            }
            System.out.println("Do you want to retry type Yes or No");
            String userInput2 = myObj.nextLine();
            if(userInput2.equals("yes")){
                repeat = true;
            } else if (userInput2.equals("no")) {
                repeat = false;
            }
        }while(repeat);
    }
}
