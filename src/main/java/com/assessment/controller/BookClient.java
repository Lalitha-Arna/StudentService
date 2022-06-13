package com.assessment.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.assessment.entity.Book;

@FeignClient(name="bookservice",url="localhost:8762/bookservice")
public interface BookClient {

	 @RequestMapping(method = RequestMethod.GET, value = "/getbookcost/{bookname}")
	 Book getBook(@PathVariable("bookname") String bookName);
	 
}
