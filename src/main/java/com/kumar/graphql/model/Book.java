package com.kumar.graphql.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Table
@Entity
public class Book {

    @Id
    private String isbn;
    private String title;
    private String publisher;
    private String[] authors;
    private String publishedDate;

}