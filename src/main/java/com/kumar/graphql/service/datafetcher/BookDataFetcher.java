package com.kumar.graphql.service.datafetcher;

import com.kumar.graphql.model.Book;
import com.kumar.graphql.repository.BookRepository;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookDataFetcher implements DataFetcher<Book>{

    @Autowired
    BookRepository bookRepository;

    @Override
    public Book get(DataFetchingEnvironment dataFetchingEnvironment) {

        String isbn = dataFetchingEnvironment.getArgument("id");

        return bookRepository.findById(isbn).get();
    }
}