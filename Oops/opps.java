package Oops;

public class opps {

    public static void main(String args[]) {
     Bc b= new Bc();
    }

}


class Abc {
    Abc(){
        System.out.println("abc constructed");
    }
}

class Bc extends Abc{
    Bc(){
        super();
        System.out.println("bc constructed");
    }
}


class Student{
    int rollno;
    String name;

    static String schoolName="sskp";

    void getname(){
        System.out.println(this.name);
    }

     void getroll(){
        System.out.println(this.rollno);
    }

}




interface herbivorous{
    void eat();
}

interface carnivorous{
    void eat();
}

class cat implements herbivorous,carnivorous{

    public void eat(){
        System.out.println("eats both grass and meat");
    }

}




class Student {
    int rollno;
    String name;
    private String password;

    void setPass(String password){
        this.password=password;
    }

    void getPass(){
        System.out.println(this.password);
    }

   
}



// class Animal {
//     String color;

//     void eats() {
//         System.out.println(" eats anything.....");
//     }

//     void breaths() {
//         System.out.println("Breathing....");
//     }
// }

class Deer extends Animal{
    void eats(){
        System.out.println("eats grass....");
    }
}

class Fish extends Animal {
    void swim() {
        System.out.println("Swiming....");
    }
}



class Pen {
    String colour = "black";
    int tip;

    String getColour() {
        return this.colour;
    }

    void setTip(int newTip) {
        tip = newTip;
    }

    void setColour(String newColour) {
        colour = newColour;
    }
}
