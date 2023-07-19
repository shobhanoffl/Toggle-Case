import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String given = sc.next();
        String finalText="";
        for(int i=0;i<given.length();i++){
            finalText+=(char)((int)given.charAt(i)^(1<<5));
        }
        System.out.println(finalText);
    }
}