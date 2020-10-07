package mongospring.api.entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import io.swagger.annotations.ApiModelProperty;



//For mongoDB
@Document(collection = "Book")
public class Book {
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int i, String string, String string2, int j) {
		// TODO Auto-generated constructor stub
	}
	@Id
	@ApiModelProperty(value="A unique number for the book")
	private int id;
	@ApiModelProperty(value="Name of the book")
	private String bookName;
	@ApiModelProperty(value="Name of the Author who published the book")
	private String authorname;
	@ApiModelProperty(value="Year in which book was Published")
	private int publishedyear;
	@Override
	public String toString() {
		return "Book [id=" + id + ", bookName=" + bookName + ", authorname=" + authorname + ", publishedyear="
				+ publishedyear + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorname() {
		return authorname;
	}
	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}
	public int getPublishedyear() {
		return publishedyear;
	}
	public void setPublishedyear(int publishedyear) {
		this.publishedyear = publishedyear;
	}
}
