package org.heliogator.mauisecurity;

import java.util.Arrays;

import org.heliogator.mauisecurity.entity.Account;
import org.heliogator.mauisecurity.entity.Bookmark;
import org.heliogator.mauisecurity.repository.AccountRepository;
import org.heliogator.mauisecurity.repository.BookmarkRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MauiSecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(MauiSecurityApplication.class, args);
    }

    @Bean
    CommandLineRunner init(AccountRepository accountRepository, BookmarkRepository bookmarkRepository) {
        return (evt) -> Arrays.asList("jhoeller,dsyer,pwebb,ogierke,rwinch,mfisher,mpollack,jlong".split(","))
                .forEach(s -> {
                    Account account = accountRepository.save(new Account(s, "password"));
                    bookmarkRepository.save(new Bookmark(
                            account, 
                            "http://bookmark.com/1/" + s, 
                            "A description"
                    ));
                    bookmarkRepository.save(new Bookmark(
                            account,
                            "http://bookmark.com/2/" + s,
                            "A description"
                    ));
                });
    }
}
