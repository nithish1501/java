import java.io.*;

public class FileWrite{
    public static void main(String[] args)throws Exception{
        FileWriter fw=new FileWriter("test.txt");
        fw.write("Hello Java");
        fw.close();
    }
}