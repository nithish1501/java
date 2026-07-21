class A{
    void display(){
        System.out.println("Parent Class");
    }
}

class B extends A{
    void show(){
        System.out.println("Child Class");
    }
}

public class SingleInheritance{
    public static void main(String[] args){
        B obj=new B();
        obj.display();
        obj.show();
    }
}