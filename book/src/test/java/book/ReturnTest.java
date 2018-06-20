package book;

import java.util.ArrayList;

import model.Loan;
import model.Member;
import model.Book;
public class ReturnTest {
	 public static void main(String[] args){ 
	Member member = new Member(); 
	 }
	 ArrayList<Loan> loans =member.getLoans(); 
	 for (Loan loan : loans){ 
	 member.returnBook(loan.getBook()); 
	 }
		          } 
}
