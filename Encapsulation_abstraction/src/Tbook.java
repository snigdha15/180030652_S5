import java.util.*;
class Book {
   private String name;
   private Author author;
   private double price;
   private int qty;
 
   public Book(String name, Author author, double price, int qty) {
      this.name = name;
      this.author = author;
      this.price = price;
      this.qty = qty;
   }
 
   public String getName() {
      return name;
   }

   public Author getAuthor() {
      return author; 
   }
  
   public double getPrice() {
      return price;
   }
   
   public void setPrice(double price) {
      this.price = price;
   }
   
   public int getQty() {
      return qty;
   }
  
   public void setQty(int qty) {
      this.qty = qty;
   }
 

   public String toString() {
      return "'" + name + "' by " + author;
   }
}
public class Tbook {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		   System.out.println("Enter name = ");
		   String name=sc.nextLine();
		   System.out.println("Enter Email = ");
		   String email=sc.nextLine();
		   System.out.println("Enter Gender = ");
		   char gender=sc.next().charAt(0);
	      Author ahTeck = new Author(name, email, gender);
	      System.out.println(ahTeck);  
	      Book dummyBook = new Book("Java for dummies", ahTeck, 9.99, 99);
	      System.out.println(dummyBook);  
	      dummyBook.setPrice(8.88);
	      dummyBook.setQty(88);
	      System.out.println("name is: " + dummyBook.getName());
	      System.out.println("price is: " + dummyBook.getPrice());
	      System.out.println("qty is: " + dummyBook.getQty());
	      System.out.println("author is: " + dummyBook.getAuthor());  
	      System.out.println("author's name is: " + dummyBook.getAuthor().getName());
	      System.out.println("author's email is: " + dummyBook.getAuthor().getEmail());
	      System.out.println("author's gender is: " + dummyBook.getAuthor().getGender());
	   }
}
