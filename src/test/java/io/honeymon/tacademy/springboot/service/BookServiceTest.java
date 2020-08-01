package io.honeymon.tacademy.springboot.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

import io.honeymon.tacademy.springboot.domain.Book;
//import io.honeymon.tacademy.springboot.domain.Book;
import io.honeymon.tacademy.springboot.domain.BookRepository;

@RunWith(SpringRunner.class)
//@SpringBootTest(webEnvironment = WebEnvironment.NONE)
@DataJpaTest
public class BookServiceTest {
	@Autowired
	BookService bookService;
	
	@Autowired
	BookRepository repository;
	
	@Autowired
	Book book;
	
	@Test
	public void testFineById() {
		Long id = (long) 1L;
		
//		Book book = new Book();
		book.setName("boot-spring-book");
		book.setIsbn10("0123456789");
		book.setIsbn13("012345678912");
		repository.save(book);
		
		bookService.findById(id).orElseThrow(() -> new RuntimeException("Not found"));
	}
}
