import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a alphate ");

        char c = sc.next().charAt(0);

        if (c =>'A' || c =<'Z'){
            System.out.println("Upper case");
        }else{
            System.out.println("Lower case");
        }
    }
}