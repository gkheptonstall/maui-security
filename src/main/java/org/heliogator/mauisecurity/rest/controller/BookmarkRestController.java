package org.heliogator.mauisecurity.rest.controller;

import org.heliogator.mauisecurity.repository.AccountRepository;
import org.heliogator.mauisecurity.repository.BookmarkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/{userId}/bookmarks")
public class BookmarkRestController {
    private final BookmarkRepository bookmarkRepository;
    
    private final AccountRepository accountRepository;
    
    @Autowired
    BookmarkRestController(BookmarkRepository bookmarkRepository, AccountRepository accountRepository) {
        this.bookmarkRepository = bookmarkRepository;
        this.accountRepository = accountRepository;
    }
}
