package com.entitylis;

import jakarta.persistence.PrePersist;
import jakarta.persistence.PreRemove;
import jakarta.persistence.PreUpdate;

public class BookEntityListener {

    @PrePersist
    public void prePersist(Book book) {
        System.out.println("PrePersist callback invoked for Book entity: " + book.getTitle());
        // Custom logic before persisting the entity
    }

    @PreUpdate
    public void preUpdate(Book book) {
        System.out.println("PreUpdate callback invoked for Book entity: " + book.getTitle());
        // Custom logic before updating the entity
    }

    @PreRemove
    public void preRemove(Book book) {
        System.out.println("PreRemove callback invoked for Book entity: " + book.getTitle());
        // Custom logic before removing the entity
    }
}