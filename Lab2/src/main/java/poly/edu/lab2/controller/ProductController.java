package poly.edu.lab2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.Arrays;
import poly.edu.lab2.entity.Product;
import java.util.List;

@Controller
public class ProductController {

    private List<Product> items = new ArrayList<>();

    private Product p1 = new Product();

    public ProductController(){
         p1 = new Product("iPhone 30", 5000.0);
         items.add(new Product("A", 1.0));
         items.add(new Product("B", 12.0));

    }

    @GetMapping("/product/form")
    public String form(Model model) {

        model.addAttribute("p1", p1);
        model.addAttribute("items",items);

        return "product/form";
    }

    @PostMapping("/product/save")
    public String save(@ModelAttribute("p2") Product p2,Model model) {
        model.addAttribute("p1", p1);

        items.add(p2);
        model.addAttribute("p2",p2);
        model.addAttribute("items",items);



        return "product/form";
    }

    @ModelAttribute("items")
    public List<Product> getItems() {
        return items;
    }
}
