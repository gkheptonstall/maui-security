package org.heliogator.mauisecurity.repository;

import java.util.Collection;

import org.heliogator.mauisecurity.entity.Bookmark;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookmarkRepository extends JpaRepository<Bookmark, Long> {
    Collection<Bookmark> findByAccountUsername(String username);
}
