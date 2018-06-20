package model;

import java.util.ArrayList;

public class Member {
public final void Return(Book book)
{
	model.Loan loan=FindCurrentLoanFor(book);
	if (loan!=null)
	{
		loan.MarkAsReturn();
		book.setLoanTO(null);
	}
}
private Loan FindCurrentLoanFor(Book book) {
	// TODO Auto-generated method stub
	return null;
}
    private Integer id; 
    private String name; 
    private ArrayList<Loan> loans = new ArrayList<>(); 

public final Boolean CanLoan(Book book)
{
	return book.getLoanTO()==null;
}
public final Loan loan(Book book )
{
	Loan loan = null;
	if (CanLoan(book))
	{
		loan=LoanFactory.CreateLoan(book, this);
		getLoans().add(loan);
	}
	return loan;
}
public void returnBook(Book book){ 
       Loan loan = findCurrentLoanFor(book); 
       if(loan != null){ 
        loan.MarkAsReturn(); 
        book.setLoanTO(null); 
         } 
     } 
public Loan findCurrentLoanFor(Book book){ 
      for (Loan loan:loans){ 
      if(loan.getBook().getId() == book.getId()){ 
                return loan; 
             } 
         } 
         return null; 
     } 

public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public ArrayList<Loan> getLoans() {
	return loans;
}
public void setLoans(ArrayList<Loan> loans) {
	this.loans = loans;
}

}
