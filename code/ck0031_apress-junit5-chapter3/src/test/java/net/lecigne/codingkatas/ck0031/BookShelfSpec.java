package net.lecigne.codingkatas.ck0031;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("A bookshelf")
class BookShelfSpec {

    @Test
    @DisplayName("is empty when no book is added to it")
    void shelfEmptyWhenNoBookAdded() {
        BookShelf shelf = new BookShelf();
        List<String> books = shelf.books();
        assertTrue(books.isEmpty(), "BookShelf should be empty.");
    }

}
