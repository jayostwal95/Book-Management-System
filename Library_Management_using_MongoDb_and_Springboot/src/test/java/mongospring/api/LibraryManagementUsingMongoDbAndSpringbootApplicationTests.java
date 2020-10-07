package mongospring.api;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;


import mongospring.api.controller.BookController;
import mongospring.api.entity.Book;
import mongospring.api.service.BookRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
class LibraryManagementUsingMongoDbAndSpringbootApplicationTests {

	@Autowired
	private BookController controller;
	
	@MockBean
	private BookRepository repository;
	
	//@Test
	//public void saveBookTest() {
		//Book book = new Book(999, "R", "tyan", 1990);
		//when(repository.save(book)).thenReturn(book);
		//assertEquals(book, controller.saveBook(book));
		
	//}
	
	//@Test
	//public void deleteBookTest(int id ) {
		//Book book = new Book(999, "R", "tyan", 1990);
		//controller.deleteBook(id);
		//verify(repository, times(1)).delete(book);
	}
	
	

	

