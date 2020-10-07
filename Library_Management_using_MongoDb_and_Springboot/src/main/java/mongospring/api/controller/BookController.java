package mongospring.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import mongospring.api.entity.Book;
import mongospring.api.service.BookRepository;


@RestController
@RequestMapping("/api")
@Api(value="The Book System", description="Test the CRUD operations")

public class BookController {
	
	@Autowired
	private BookRepository repository;

	//For post method
	@PostMapping("/addBook")
	@ApiOperation(value="Add book for API" )
	public String saveBook(@RequestBody Book book) {
	
		repository.save(book);
		return "Book added with ID : "+book.getId();
		
	}
	
	@GetMapping("/findAllBooks")
	@ApiOperation(value="Find all Books in API" )
	public List<Book> getBooks(){
		return repository.findAll();
	}
	
	
	@GetMapping("/findAllBooks/{id}")
	@ApiOperation(value="Find Book by ID" )
	public Optional<Book> getBook(@PathVariable int id){
		return repository.findById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	@ApiOperation(value="Delete book by ID" )
	public String deleteBook(@PathVariable int id) {
		repository.deleteById(id);
		return "Book is deleted with id : "+id;
	}
	@PutMapping("/update")
	@ApiOperation(value="Update book in the API" )
	public Book updateBook(@RequestBody Book book) {
		return repository.save(book);
	}
}

