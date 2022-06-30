package com.libraryapp;
import java.time.LocalDate; 
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.libraryapp.entities.Book;
import com.libraryapp.entities.User;
import com.libraryapp.services.BookService;
import com.libraryapp.services.NotificationService;
import com.libraryapp.services.UserService;
import com.libraryapp.utils.MidnightApplicationRefresh;

@SpringBootApplication
public class LibraryApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryApplication.class, args);
	}

	@Autowired
	BookService bookService;
	
	@Autowired
	UserService usService;
	
	@Autowired
	NotificationService notifService;
	
	@Autowired
	BCryptPasswordEncoder pwEncoder;
	
	@Autowired
	MidnightApplicationRefresh midAppRef;
	
	@Bean
	CommandLineRunner runner() {
		return args -> {
		
			User user1 = new User("admin", pwEncoder.encode("test"), "ab17.cl@gmail.com", "Abhinav", "Gupta", " 5 Nityanand Nagar", "+91 7887897363", "Agra");
			user1.setRole("ROLE_ADMIN");
			
			User user2 = new User("employee", pwEncoder.encode("test"), "raj@gamail.com", "Anwesan", "De", "B/10, Apmc Complex", "+91 8327017685", "Sonipat");
			user2.setRole("ROLE_EMPLOYEE");
			
			User user3 = new User("user", pwEncoder.encode("test"), "bhratag@gmail.com", "Bharat", "Agarwal", "12 Skm House", "+91 6127985318", "Mumbai");
			user3.setRole("ROLE_USER");	
			User user4 = new User("bharat", pwEncoder.encode("test"), "devraj91@gmail.com", "Devraj", "Anand", " 497, Kathriguppa", "+91 6740084357", "Amravati");
			User user5 = new User("madhav", pwEncoder.encode("test"), "madhav769@gmail.com", "Madhav", "Patel", " 274, Mohan Mansion", "+91 6127910057", "Hyderabad");
			User user6 = new User("vimla", pwEncoder.encode("test"), "vreddy@gmail.com", "Vimla", "Reddy", "Sb/21 Rajdeep Complex", "+91 6127989352", "Puducherry");
			User user7 = new User("chetan", pwEncoder.encode("test"), "chetanbanerjee@gmail.com", "Chetan", "Banerjee", "26, Rajendra Place", "+91 8079067765", "Ajmer");
			User user8 = new User("rajesh", pwEncoder.encode("test"), "vrajesh@gmail.com", "Rajesh", "Verma", "1/10, Lal Quarter", "+91 8708827833", "Durgapur");
			User user9 = new User("ajeet", pwEncoder.encode("test"), "ajeetchawla121@gmail.com", "Ajeet", "Chawla", "9/11 Shakti Sadan", "+91 8917856212", "Jammu");
			User user10 = new User("priyanka", pwEncoder.encode("test"), "singhpriyanka@gmail.com", "Priyanka", "Singh", "A/2, Shah And Nahar Indl Est", "+91 6127955575", "Agartala");
			User user11 = new User("adigo", pwEncoder.encode("test"), "grohan@gmail.com", "Aditya", "Goyal", "106, Netaji Subhas Road", "+91 70975 56717", "Mumbai");
			usService.save(user1);
			usService.save(user2);
			usService.save(user3);
			usService.save(user4);
			usService.save(user5);
			usService.save(user6);
			usService.save(user7);
			usService.save(user8);
			usService.save(user9);
			usService.save(user10);
			usService.save(user11);
			
			Book book1 = new Book("The Pragmatic Programmer", "David Thomas, Andrew Hunt", 2006, 1);
			Book book2 = new Book("Clean Code", "Robert C. Martin", 2020, 2);
			Book book3 = new Book("Code Complete", "Steve McConnell", 2012, 1);
			Book book4 = new Book("Refactoring", "Martin Fowler", 2017, 4);
			Book book5 = new Book("Head First Design Patterns", "Eric Freeman, Bert Bates, Kathy Sierra, Elisabeth Robson", 2019, 5);
			Book book6 = new Book("The Mythical Man-Month", "Frederick P. Brooks Jr", 1999, 1);
			Book book7 = new Book("The Clean Coder", "Robert Martin", 2021, 3);
			Book book8 = new Book("Working Effectively with Legacy Code", "Micheal Feathers", 2015, 1);
			Book book9 = new Book("Design Patterns", "Erich Gamma, Richard Helm. Ralph Johnson, John Vlissides", 2019, 2);
			Book book10 = new Book("Cracking the Coding Interview", "Gayle Laakmann McDowell", 2018, 3);
			Book book11 = new Book("Rework", "Jason Fried, David Heinemeier Hansson", 2011, 1);
			Book book12 = new Book("Don't Make Me Think", "Steve Krug", 2005, 1);
			Book book13 = new Book("Code", "Charles Petzold", 2017, 1);
			Book book14 = new Book("Peopleware", "Tom DeMarco, Tim Lister", 2013, 3);
			Book book15 = new Book("Introduction to Algorithms", "Thomas H. Cormen", 2020, 2);
			Book book16 = new Book("Programming Pearls", "Jon Bently", 1998, 1);
			Book book17 = new Book("Patterns of Enterprice Application Architecture", "Martin Fowler", 2020, 2);
			Book book18 = new Book("Structure and Interpretation of Computer Programs", "Harold Abelson, Gerald Jay Sussman, Julie Sussman", 2013, 1);
			Book book19 = new Book("The Art of Computer Programming", "Donald E. Knuth", 2014, 4);
			Book book20 = new Book("Domain-Driven Design", "Eric Evans", 2010, 2);
			Book book21 = new Book("Coders at Work", "Peter Seibel", 2009, 1);
			Book book22 = new Book("Rapid Development", "Steve McConnell", 1995, 6);
			Book book23 = new Book("The Self-Taught Programmer", "Cory Althoff", 2021, 1);
			Book book24 = new Book("Algorithms", "Robert Sedgewick, Kevin Wayne", 2000, 3);
			Book book25 = new Book("Continuous Delivery", "Jez Humble, David Farley", 2003, 1);
			
			bookService.save(book1);
			bookService.save(book2);
			bookService.save(book3);
			bookService.save(book4);
			bookService.save(book5);
			bookService.save(book6);
			bookService.save(book7);
			bookService.save(book8);
			bookService.save(book9);
			bookService.save(book10);
			bookService.save(book11);
			bookService.save(book12);
			bookService.save(book13);
			bookService.save(book14);
			bookService.save(book15);
			bookService.save(book16);
			bookService.save(book17);
			bookService.save(book18);
			bookService.save(book19);
			bookService.save(book20);
			bookService.save(book21);
			bookService.save(book22);
			bookService.save(book23);
			bookService.save(book24);
			bookService.save(book25);
			
			book10.setTheUser(user3);
			book10.setReturnDate(LocalDate.of(2022, 5, 23));
			
			book1.setTheUser(user3);
			book1.setReturnDate(LocalDate.of(2022, 5, 05));
			
			user3.setBooks(Arrays.asList(book10, book1));
			
			bookService.save(book1);
			bookService.save(book10);
			usService.save(user3);
						
			midAppRef.midnightApplicationRefresher();	
		};
	}
}
