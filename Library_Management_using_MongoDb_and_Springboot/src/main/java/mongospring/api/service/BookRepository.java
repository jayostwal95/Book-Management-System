package mongospring.api.service;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

import mongospring.api.entity.Book;

public interface BookRepository extends MongoRepository<Book,Integer> {

	



}
