public class Polymorphism {
    public static void main(String[] args) {
        Animal objAni = new Animal();
        objAni.makesSound();

        Animal objDog = new dog();
        objDog.makesSound();

        Animal objCat = new cat();
        objCat.makesSound();

        Animal objCow = new cow();
        objCow.makesSound();

        String green = "\u001B[32m";
        System.out.println(green + "\nEverything Executed Sucessfully!");
    }
}