package Behavioural.Interpretor;

import java.util.ArrayList;

/**
 * Created by chetan on 2/10/15.
 */
//I'll use a simple example to illustrate this pattern.
// We're going to create our own DSL for searching Amazon.

//This from line 12-41 fake webservices to remove errors and support the pattern
class Book
{
private String author;
public String getAuthor()
{
    return author;
}
}

class Movie
{
}

class AmazonWebService
{
   public ArrayList<Movie> getAllMovies()
   {
       ArrayList movies=new ArrayList();
       movies.add("tropic thunder");
       movies.add("avatar");
       return  movies;
   }
    public ArrayList<Book> getAllBooks()
    {
        ArrayList books=new ArrayList();
        books.add("tropic thunder");
        books.add("avatar");
        return  books;
    }
}
/*
Context




*/
// To do this, we'll need to have a context that uses an Amazon web service to run our queries.
//Context contains information that is global to the interpreter.
class InterpreterContext {
    //assume web service is setup
    private AmazonWebService webService;

    public InterpreterContext(String endpoint) {
        //create the web service.
    }
        public ArrayList<Movie> getAllMovies()
        {
            return webService.getAllMovies();
        }
        public ArrayList<Book> getAllBooks()
        {
            return webService.getAllBooks();
        }
    }

//        Next, we'll need to create an abstract expression:
//Abstract Expression
abstract class AbstractExpression {
    //The AbstractExpression provides an interface for executing an operation.
    //interpret is the operation which is an interpretor
    public abstract String interpret(InterpreterContext context);
}

// We'll have many different expressions to interpret our queries. For illustration,let's create just one:
//Concrete Expression
class BookAuthorExpression extends AbstractExpression {
    //TerminalExpression implements the interpret interface associated
   // with any terminal expressions(searchString) in the defined grammar.
    private String searchString;

    public BookAuthorExpression(String searchString) {
        this.searchString = searchString;
    }

    public String interpret(InterpreterContext context) {
        ArrayList<Book> books = context.getAllBooks();
        StringBuffer result = new StringBuffer();
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(searchString)) {
                result.append(book.toString());
            }
        }
        return result.toString();
    }
}

//Finally, we need a client to drive all of this. Let's assume that our language is of the following type of syntax:
//books by author 'author name'
//The client will determine which expression to use to get our results:
//
//The Client either builds the Abstract Syntax Tree, or the AST is passed through to the client.
//        An AST is composed of both TerminalExpressions and NonTerminalExpressions.
//        The client will kick off the interpret operation.
//        Note that the syntax tree is usually implemented using the Structural.Composite pattern
//        The pattern allows you to decouple the underlying expressions from the grammar.
public class AmazonClient {
    private InterpreterContext context;

    public AmazonClient(InterpreterContext context) {
        this.context = context;
    }

    /**
     * Interprets a string input of the form   *   movies | books by title | year | name '<string>'
     */
    public String interpret(String expression) {
    //we need to parse the string to determine which expression to use
        AbstractExpression exp = null;
        String[] stringParts = expression.split(" ");
        String main = stringParts[0];
        String sub = stringParts[2];
        //get the query part
        String query = expression.substring(expression.indexOf("'"), expression.lastIndexOf("'"));
        if (main.equals("books")) {

            if (sub.equals("author")) {
                exp = new BookAuthorExpression(query);
            }
//            if (sub.equals("year")) {
//                exp = new BookYearExpression(query);
//            }
        } else if (main.equals("movie")) {
            //similar statements to create movie expressions
        } if (exp != null) {
            exp.interpret(context);
        }
        return  query;
    }

    public static void main(String[] args) {
        InterpreterContext context = new InterpreterContext("http://aws.amazon.com/");
        AmazonClient client = new AmazonClient(context);//run a query
        String result = client.interpret("books by author 'John Connolly'");
        System.out.println(result);
    }
}

// I admit the example is a bit simple, and you would probably have a more intelligent context, but that should
// give you the idea of how this pattern works.

