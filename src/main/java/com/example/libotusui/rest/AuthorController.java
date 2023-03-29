package com.example.libotusui.rest;

import com.example.libotusui.entity.Author;
import com.example.libotusui.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class AuthorController {

    @Autowired
    private AuthorRepository authorRepository;

    @GetMapping("/authors")
    public String listPage(Model model) {
        List<Author> authors = authorRepository.findAll();
        model.addAttribute("authors", authors);
        return "authors/authors-list";
    }

    @GetMapping("/authors/edit")
    public String editPageGet(@RequestParam("id") Long id, Model model) {
        Author author = authorRepository.findById(id).get();
        model.addAttribute("author", author);
        return "authors/authors-edit";
    }

//    @PostMapping("/edit")
//    public String editPagePost(@RequestParam("id") Long id, @RequestParam("name") String name, Model model) {
//        Author author = new Author(id, name);
//        authorRepository.save(author);
//        model.addAttribute("author", author);
//        return "edit";
//    }

    @PostMapping("/authors/edit")
    public String editPagePost(@ModelAttribute("author") Author author, Model model) {
        authorRepository.save(author);
        model.addAttribute("author", author);
        return "authors/authors-edit";
    }

    @PostMapping("/authors/add")
    public String addAuthor(@ModelAttribute("author") Author author, Model model) {
        authorRepository.save(author);
        model.addAttribute("author", author);
        return "redirect:/authors";
    }

    @GetMapping("/authors/addGet")
    public String addGetAuthor(Model model) {
        return "authors/authors-add";
    }
}
