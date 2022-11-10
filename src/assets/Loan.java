package assets;

public class Loan {

private Book book;
private User user   ;
private String loandate;
private String returndate;

public Book getBook(){
    return book;
}
public void setBook(Book book){
    this.book = book;
}
public User getUser(){
    return user;
}
public void setUser(User user){
    this.user = user;
}
public String getLoandate(){
    return loandate;
}
public void setLoandate(String loandate){
    this.loandate = loandate;
}
public String getReturndate(){
    return returndate;
}
public void setReturndate(String returndate){
    this.returndate = returndate;
}
}
