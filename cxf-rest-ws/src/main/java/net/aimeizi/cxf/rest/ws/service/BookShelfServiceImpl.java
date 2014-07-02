package net.aimeizi.cxf.rest.ws.service;

/**
 * Created by Administrator on 2014/7/1 0001.
 */

import net.aimeizi.cxf.rest.ws.HashDB;
import net.aimeizi.cxf.rest.ws.model.Book;

import javax.jws.WebService;

@WebService(endpointInterface = "net.aimeizi.cxf.rest.ws.service.BookShelfService",serviceName="bookShelfService")
public class BookShelfServiceImpl implements BookShelfService {

    public String insertBook(Book book) {
        HashDB.insertBook(book);
        return "Book with name : " + book.getBookName() + " is now available on the shelf";
    }

    public Book getBook(String title) {

        return HashDB.getBook(title);
    }

}