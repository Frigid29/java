import java.util.*;

class Library{
    Map<String,String> books;
    public Library(){
        books = new LinkedHashMap<>();
    }

    public void addBooks(String name){
        books.put(name,"available");
    }

    public void showAvailableBooks(){
        Set<String> set= books.keySet();
        String[] ar = set.toArray(new String[set.size()]);
        if(ar.length==0){
            System.out.println("No books available");
            return;
        }
        System.out.println("\n*Available Books are: ");
        for (int i = 0; i < ar.length; i++) {
            String k=ar[i];
            if(books.get(k)=="available"){
                System.out.println(k);
            }
        }
    }

    public void issueBook(String name){
        if(books.get(name) == "available"){
            books.put(name,"issued");
            System.out.println("\n*" + name + " issued");
        }else{
            System.out.println("\n*Sorry, the book is not available.\n");
        }
    }

    public void returnBook(String name){
        Set<String> set= books.keySet();
        String[] ar = set.toArray(new String[set.size()]);
        if(ar.length==0){
            System.out.println("\n* This book is not issued from us.");
            return;
        }
        if(books.containsKey(name)){
            books.put(name,"available");
            System.out.println("\n*"+ name + " is returned.");
        }else{
            System.out.println("\n*Sorry, the book is not issued from us.");
        }
    }

    public static void main(String[] args) {
        Library lib = new Library();
        lib.addBooks("Book1");
        lib.addBooks("Book2");
        lib.addBooks("Book3");
        lib.showAvailableBooks();
        lib.issueBook("Book1");
        lib.showAvailableBooks();
        lib.returnBook("Book1");
        lib.showAvailableBooks();
    }
}