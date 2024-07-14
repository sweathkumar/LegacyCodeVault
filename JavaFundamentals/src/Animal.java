public class Animal{
    public void makesSound(){
        System.out.println("Animal Makes sound!\n");
    }
}

class dog extends Animal{
    //@override
    public void makesSound(){
        System.out.println("Dog Makes sound like Wow-Wow!\n");
    }
}

class cat extends Animal{
    //@override
    public void makesSound(){
        System.out.println("cat Makes sound like Meow-Meow!\n");
    }
}

class cow extends Animal{
    //@override
    public void makesSound(){
        System.out.println("cow Makes sound like Moo-Moo!\n");
    }
}
