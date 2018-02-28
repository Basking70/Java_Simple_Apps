
package library.catalogue;

import java.util.HashMap;
import java.util.Map;


public class LibraryCatalogue {

    Map<String,Book> bookCollection = new HashMap<String,Book>();
    int currentDay = 0;
    int lengthOfCheckedoutPeriod = 7;
    double initialLateFee = 0.5;
    double feePerLateDate = 1.00;
    
    //Constructors 
    public LibraryCatalogue(Map<String,Book> collection){
        this.bookCollection = collection;
    }
    
    public LibraryCatalogue(Map<String,Book> collection, int lengthOfCheckedoutPeriod,
            double initialLateFee, double feePerLateDate){
        this.bookCollection = collection;
        this.lengthOfCheckedoutPeriod = lengthOfCheckedoutPeriod;
        this.initialLateFee = initialLateFee;
        this.feePerLateDate = feePerLateDate;
    }
    
    //Getters 
    
    public int getCurrentDay(){
        return this.currentDay;
    }
    
    public Map<String,Book> getBookCollection(){
        return this.bookCollection;
    }
 
    public Book getBook(String bookTitle){
        return getBookCollection().get(bookTitle);
    }
    
    public int getLengthOfCheckoutPeriod(){
        return this.getLengthOfCheckoutPeriod();
    }
    
    public double getInitialLateFee(){
        return this.initialLateFee;
    }
    
    public double getFeePerLateDay(){
        return this.getCurrentDay();
    }
    
    //setters
    public void nextDay(){
        currentDay++;
    }
    public void setDay (int day){
        currentDay = day;
    }
    
    //Instance methodes:
    
    public void checkOut(String title){
        Book book = getBook(title);
        if(book.getIsCheckedOut()){
            sorryBookAlreadyCheckedOut(book);
        }else{
            book.setIsCheckedOut(true, currentDay);
            System.out.println("You just checked out " + title + ". It is due on day" + 
                    (getCurrentDay() + getLengthOfCheckoutPeriod()) + ".");
        }
    }
    
    public void returnBook(String title){
        Book book = getBook(title);
        int daysLate = currentDay - (book.getDayCheckedOut() + getLengthOfCheckoutPeriod());
        if (daysLate > 0){
            System.out.println("You owe the Library $" + (getInitialLateFee() + daysLate * getFeePerLateDay()) + "becuase your book is" + daysLate + "days overdue");
        }else{
            System.out.println("Book Returned. Thank you!");
        }
        book.setIsCheckedOut(false, -1);
    }
    
    public void sorryBookAlreadyCheckedOut(Book book){
        System.out.println("Sorry, " + book.getTitle() + " is already checked out. "
        + "It should be back on day" + (book.getDayCheckedOut()+
                getLengthOfCheckoutPeriod() + "."));
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Map<String,Book> bookCollection = new HashMap<String,Book>();
        Book harry = new Book("Harry Potter",876546, 9999999 );
        bookCollection.put("Harry Poter", harry);
        LibraryCatalogue lib = new LibraryCatalogue(bookCollection);
        lib.checkOut("Harry Potter");
        lib.nextDay();
        lib.nextDay();
        lib.checkOut("Harry Potter");
        lib.setDay(17);
        lib.returnBook("Harry Potter");
        lib.checkOut("Harry Potter");
    }
    
}
