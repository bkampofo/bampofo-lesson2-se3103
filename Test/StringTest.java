package Test;

public class StringTest {
    
    public static void main(String[] args) {
        
        String a = "hello World ";
        //String a = new String("hello World");
        String b = "hello World ";

        System.out.println(a == b);

        String c = "hello";
        c = c + "World";
        System.out.println(a == c);
        System.out.println(c.equals(b));

    }
}
