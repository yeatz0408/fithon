package com.gmail.yeatz0408.backToshokan.service;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gmail.yeatz0408.backToshokan.dao.BookRepository;
import com.gmail.yeatz0408.backToshokan.dao.CheckoutRepository;
import com.gmail.yeatz0408.backToshokan.entity.Book;
import com.gmail.yeatz0408.backToshokan.entity.Checkout;



@Service
@Transactional
public class BookService {

    @Autowired
    private BookRepository bookRepo;

    @Autowired
    private CheckoutRepository checkoutRepo;

    // public BookService(BookRepository bookRepo, CheckoutRepository checkoutRepo) {
    //     this.bookRepo = bookRepo;
    //     this.checkoutRepo = checkoutRepo;
    // }

    public Book checkoutBook(String userEmail, Long bookId) throws Exception {
        
        Optional<Book> book = bookRepo.findById(bookId);

        Checkout validateCheckout = checkoutRepo.findByUserEmailAndBookId(userEmail, bookId);

        if (!book.isPresent() || validateCheckout != null || book.get().getCopiesAvailable() <= 0) {
            throw new Exception("本が存在しないかすでにチェックアウトされました。");
        }

        book.get().setCopiesAvailable(book.get().getCopiesAvailable() - 1);
        bookRepo.save(book.get());

        Checkout checkout = new Checkout(
            userEmail,
            LocalDate.now().toString(),
            LocalDate.now().plusDays(7).toString(),
            book.get().getId()
        );

        checkoutRepo.save(checkout);

        return book.get();

    }
    
}
