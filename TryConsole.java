import java.io.*;
import java.util.Date;


class TryConsole{

public static void main(String[]args){
String s1 = null;
String s2 = null;
int a=0;
int b=0;
int c=0;

try{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Please Enter value for a: ");
s1=br.readLine();
a=Integer.parseInt(s1);

System.out.println("Please Enter value for b: ");
s2=br.readLine();
b=Integer.parseInt(s2);

System.out.println("Addition result :"+(a+b));
Date currentDate = new Date();
System.out.println("current Date & Time :"+currentDate);

}
catch(IOException e){
System.out.println("Some Exception in Reading" +e);

}

catch(NumberFormatException e1){
System.out.println("Invalid input" +e1);

}


try {
    a = Integer.parseInt(s1);
} catch (NumberFormatException e) {
    System.out.println("Invalid number entered for a.");
    return;
}

}
}




