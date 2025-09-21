
import java.util.Scanner;

class Library{
    private String[] AvailableBooks = new String[5];
    private String[] IssuedBooks = new String[5];

    Scanner sc = new Scanner(System.in);
    public Library() {
        startLibrary();
    }

    public void startLibrary(){
        int choise;
        System.out.println("=======================================");
        System.out.println("Enter Action to perform");
        System.out.println(" 1) Available Books");
        System.out.println(" 2) Add Book");
        System.out.println(" 3) Issue book");
        System.out.println(" 4) Return book");
        choise=sc.nextInt();
        switch (choise) {
            case 1 :
                showAvailableBooks();
                startLibrary();
                break;
            case 2 :
                addbookin();
                startLibrary();
                break;

            case 3:
                issueBookin();
                startLibrary();
                break;

            case 4:
                returnBook();
                startLibrary();
            default:
                System.out.print("Not a Valid Choise please re-enter the chooise:");
                startLibrary();
                break;
        }
    }
   

    public void addbookin(){
        System.out.println("Enter Book Name");
        sc.nextLine();
        String bookname=sc.nextLine();
        addBook(bookname);
    }

    public void addBook(String book) {
        boolean isnull=false;
        int id=-1;
        for(int i=0; i<AvailableBooks.length;i++){
            if(AvailableBooks[i]==null){
                isnull=true;
                id=i;
                AvailableBooks[i]= book;
                break;
            }
        }
        if(isnull==false){
            System.out.println("Library capacity full cant add '"+book+"' books!!");

        }else{
            System.out.println("book '"+book+ "' Successfully added With id: "+id);
        }
    }

    public String[] showAvailableBooks() {
        for(int i=0;i<AvailableBooks.length;i++){
            System.out.println(i+") "+AvailableBooks[i]);
        }

        return AvailableBooks;
    }

    public String[] showIssuedBooks() {
        for(int i=0;i<IssuedBooks.length;i++){
            System.out.println(i+") "+IssuedBooks[i]);
        }
        return IssuedBooks;
    }


    public void issueBookin(){
        showAvailableBooks();
        System.out.print("Enter Book id You want to issue: ");
        int choise= sc.nextInt();
        issueBook(choise);

    }

    public void issueBook(int in){
        
        boolean isnull=false;
        for(int i=0; i<IssuedBooks.length;i++){
            if(IssuedBooks[i]==null){
                isnull=true;
                IssuedBooks[i]= AvailableBooks[in];
                AvailableBooks[in]=null;
                break;
            }
        }
        if(isnull==false){
            System.out.println("Cant issue '"+ AvailableBooks[in]+"' books!!");

        }else{
            System.out.println("book issued Successfully ");
        }
    }

    public void returnBook(){
        showIssuedBooks();

        System.out.print("Enter Issued Book id You want to return: ");
        int choise= sc.nextInt();
        addBook(IssuedBooks[choise]);

    }




}

public class excLab {
    
    public static void main(String[] args) {
        // You have to implement a library using Java Class Library
        // Methods: addBook, issueBook, returnBook, showAvailableBooks
        // Properties: Array to store the available books,
        // Array to store the issued books
        
        Library lib = new Library();
        
    }
}
