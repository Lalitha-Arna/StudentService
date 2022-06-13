package com.assessment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.assessment.entity.Book;



@RestController
@RequestMapping(value="/studentservice")
public class StudentController {

	@Autowired
	private BookClient bookClient;
	
	@RequestMapping(method = RequestMethod.GET, value = "/findcost/{bookname}/quantity/{quantity}")
	public Double getbook(@PathVariable("bookname") String bookName, @PathVariable("quantity") Integer quantity ) {
		Book book = bookClient.getBook(bookName);
		return book.getBookCost()*quantity;
	}
	
}
