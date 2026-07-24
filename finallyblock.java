public class FinallyDemo{
    public static void main(String[] args){
        try{
            System.out.println(10/0);
        }
        catch(Exception e){
            System.out.println("Error");
        }
        finally{
            System.out.println("Finally Executed");
        }
    }
}