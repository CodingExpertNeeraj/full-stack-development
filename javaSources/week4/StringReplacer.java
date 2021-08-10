import java.io.BufferedReader;
import java.io.FileReader;

public class StringReplacer
{
          public static void main(String args[])throws Exception{    
          FileReader fr=new FileReader("Test.html");    
          BufferedReader br=new BufferedReader(fr);    
  
          int i;    
          while ((i = br.read()) != -1) {
            if((char) i=="\\")
            System.out.print((char)i);  
          }  
          br.close();    
          fr.close();    
    }    
}