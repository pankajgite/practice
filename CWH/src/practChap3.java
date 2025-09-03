
import java.util.Scanner;

public class practChap3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sent = sc.nextLine();
        System.out.println(sent.toLowerCase());
        System.out.println(sent.replace(' ', '_'));
        System.out.printf("This is the %s fhshsbshbscs",sent);
        System.out.println();
        int indexdouble = sent.indexOf("  ");
        int indextriple = sent.indexOf("   ");
        if(indextriple>0){
            System.out.println("Sentance has Triple Space");
        }
        else if(indexdouble>0){
            System.out.println("Sentance had double Space");
        }
        else{
            System.out.println("NO Double or Triple Space");
        }

        String letter = "Dear Pankaj \n \t This java Course is nice \n thanks";
        System.out.println(letter);

    }
}
