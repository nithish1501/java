class Demo {

    void add(int a,int b){
        System.out.println(a+b);
    }

    void add(double a,double b){
        System.out.println(a+b);
    }
}

public class Overloading {
    public static void main(String[] args){
        Demo d=new Demo();
        d.add(5,6);
        d.add(5.5,4.5);
    }
}