package org.heliogator.mauisecurity.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.Generated;

@Entity
@Data
public class Bookmark {
    
    @JsonIgnore
    @ManyToOne
    private Account account;
    
    @Id
    @GeneratedValue
    private Long id;
    
    Bookmark() {
        
    }
    
    public Bookmark(Account account, String uri, String description) {
        this.uri = uri;
        this.description = description;
        this.account = account;
    }
    
    public String uri;
    public String description;
}
