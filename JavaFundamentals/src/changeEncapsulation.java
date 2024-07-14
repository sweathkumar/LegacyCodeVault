public class changeEncapsulation{
    public static void main(String[] args) {
        //object created
        Encapsulation objEncap = new Encapsulation();

        // Setting name on Encapsulation class
        objEncap.setName("Sweath Sucessfully Achived Encapsulation by Getting Data from private Variable!");
        // Getting name from Encapsulation class
        String getName = objEncap.getName();
        System.out.println("Here is the result: " + getName);

        //Once again Setting and Getting
        objEncap.setName("Now its changed again!");
        String getName1 = objEncap.getName();
        System.out.println("Here is the result after variable changed: " + getName1);
    }
}