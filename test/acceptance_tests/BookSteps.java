package acceptance_tests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import planner.app.Book;

import static org.junit.Assert.assertFalse;

public class BookSteps {

    public Book book;
    public Book tmpBook;


    @Given("a book exists")
    public void aBookExists() {
        book = new Book("1","2","3");
    }

    @When("the book changes")
    public void theBookChanges() {
        tmpBook = new Book(book.getTitle(),book.getAuthor(),book.getSignature());
        book.setTitle("100");
    }

    @Then("the book is changed")
    public void theBookIsChanged() {
        assertFalse(tmpBook.getTitle().equals(book.getTitle()));
    }

}
