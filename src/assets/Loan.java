package assets;

public class Loan {

private String book;
private String user;
private Integer loandate;
private Integer returndate;

public String getBook(){
    return book;
}
public void setBook(String book){
    this.book = book;
}
public String getUser(){
    return user;
}
public void setUser(String user){
    this.user = user;
}
public Integer getLoandate(){
    return loandate;
}
public void setLoandate(Integer loandate){
    this.loandate = loandate;
}
public Integer getReturndate(){
    return returndate;
}
public void setReturndate(Integer returndate){
    this.returndate = returndate;
}
}
