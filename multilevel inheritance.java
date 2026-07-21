 class A{
    void a(){
        System.out.println("Class A");
    }
}

class B extends A{
    void b(){
        System.out.println("Class B");
    }
}

class C extends B{
    void c(){
        System.out.println("Class C");
    }
}
 class MultiLevel{
    public static void main(String[] args){
        C obj=new C();
        obj.a();
        obj.b();
        obj.c();
    }
}
