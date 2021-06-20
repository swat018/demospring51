package swat018.demospring51;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class BookService{

    @Autowired
//    List<BookRepository> bookRepositories;
    BookRepository myBookRepository;

    public void printBookRepository() {
//        this.bookRepositories .forEach(System.out::println);
        System.out.println(myBookRepository.getClass());
    }

    @PostConstruct
    public void setup() {
        System.out.println(myBookRepository.getClass());
    }
}
