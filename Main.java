import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args)  {
       Scanner in = new Scanner(new File("test.in"));
       PrintWriter out = new PrintWriter("test.out");
       while (in.hasNextLine()) {      
           out.println(in.nextLine());   
       }   
        in.close();   
        out.close();
        
    }
}
