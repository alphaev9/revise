package com.revise.app.web;

import com.revise.domain.model.Book;
import com.revise.domain.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

@RequestMapping(value = "/book")
@Controller
public class BookController {
    @Autowired
    private BookService bookService;

    @RequestMapping(value = "onSale")
    public String onSale(@Valid Book book) {
        bookService.onSale(book);
        return "index";
    }

    @RequestMapping(value = "statistic")
    @ModelAttribute("statistic")
    public Integer statistic(@RequestParam("author") String writer) {
        return bookService.count(writer).size();
    }

    @RequestMapping("off/{id}")
    public void off(@PathVariable Integer id) {
        System.out.println("id:  "+id);
        bookService.off(id);
    }


}
