
//You have to implement a library using java class library
//Methods: addBook, issueBoook, returnBook, showAvailableBook
//Properties: Array to store the available book
//Array to store the issued books

import java.util.Scanner;

class addBook{
    public String books[] = new String[100];
    private String book_name;
    public int add_book(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the no. of book you want to add");
        int num = sc.nextInt();
        
        for(int i=0; i<num; i++){
            System.out.println("Please enter the Book Name");
            book_name = sc.next();
            books[i] = book_name;
        }
        sc.close();
        return num;
    }
}

class issueBook{
    private int book_id;
    private String book_name;
    public String issue_book(){
        System.out.println(book_id);
        return book_name;
    }
}

class returnBook{
    private int book_id;
    private String book_name;
    public String return_book(){
        System.out.println(book_id);
        return book_name;
    }
}

class showAvailableBook{
    private int book_id;
    private String book_name;
    public String show_available_book(){
        System.out.println(book_id);
        return book_name;
    }
}

class menu{
    Scanner option = new Scanner(System.in);
    public int get_menu(){
        System.out.println("Welcome to online library\nPlease choose from below option");
        System.out.println("1. Show Available Books\n2. Add Book\n3. Issue Book\n4. Return Book");
        return option.nextInt();
    }
}

class Library{
    String[] books;
    int no_of_books;
    Library(){
        this.books = new String[100];
        this.no_of_books = 0;
    }
    void addBook(String book){
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book+" has been added.");
    }
    void showAvailableBook(){
        System.out.println("Available books are:");
        for(String item: this.books){
            if(item != null){
                continue;
            }
            System.out.println(item);
        }
    }
    void issueBook(String book){
        for (int i=0; i<=books.length; i++){
            if(this.books[i].equals(book)){
                System.out.println("This "+book+" is issued");
                this.books[i] = null;
            }
        }
        System.out.println("This book does not exist");
    }

    void returnBook(String book){
        System.out.println("This "+book+" has been returned");
        addBook(book);
    }
}

public class J51_Online_Library {
    public static void main(String[] args) {
        int cnt = 1;
        menu m = new menu();
        Scanner bool = new Scanner(System.in);
        do{
            int input = m.get_menu();
            if(input==1){
            showAvailableBook sab = new showAvailableBook();
            sab.show_available_book();
            }
            else if(input==2){
                addBook ab = new addBook();
                int num = ab.add_book();
                System.out.println("Total "+num+" books are added");
            }
            else if(input==3){
                issueBook ib = new issueBook();
                ib.issue_book();
            }
            else if(input==4){
                returnBook rb = new returnBook();
                rb.return_book();
            }
            else{
                System.out.println("This is not a valid choice");
            }
            System.out.println("Do you want to go back to menu? 1. Yes    2. No");
            // int choice = bool.nextInt();
            // if(choice==0){
            //     cnt--;
            // }
        } while(cnt == 1 );
        bool.close();
    }
}
