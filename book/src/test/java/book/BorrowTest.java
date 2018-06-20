package book;

import model.Book;
import model.Loan;
import model.Member;

public class BorrowTest {
public static void main(String[]args){
	Book book=new Book();
	book.setId("1");
	book.setIsbn("2222");
	book.setTitle("信息系统");
	Member member=new Member();
	if (member.CanLoan(book)) { 
		  
	Loan loan =member.loan(book); 
    System.out.println(loan); 
	member.getLoans().add(loan); 
		           } 

}
}
