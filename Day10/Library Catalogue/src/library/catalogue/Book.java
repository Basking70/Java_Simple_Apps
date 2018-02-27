
package library.catalogue;

public class Book {
    
    // properties, fileds, globals variables
    String title;
    int pageCount;
    int ISBN;
    boolean isCheckedOut; //whether it is checked out or not
    int dayChackedOut = -1;

    //constractures 
    public Book(String bookTitle, int bookPageCount, int bookISBN){
        this.title = bookTitle;
        this.pageCount = bookPageCount;
        this.ISBN = bookISBN;
        isCheckedOut = false;
    }
    
    //Getters --> instance methods
    public String getTitle(){
        return this.title;
    }
    public int getPageCount(){
        return this.pageCount;
    }
    public boolean getIsCheckedOut(){
        return this.isCheckedOut;
    }
    public int getDayCheckedOut(){
        return this.ISBN;
    }
    
    //Setters
    public void setIsCheckedOut(boolean newIsCheckedOut, int currentDayCheckedOut){
        this.isCheckedOut = newIsCheckedOut;
        setDayCheckedOut(currentDayCheckedOut);
    }
    private void setDayCheckedOut(int day){
        this.dayChackedOut = day;
    }
}
