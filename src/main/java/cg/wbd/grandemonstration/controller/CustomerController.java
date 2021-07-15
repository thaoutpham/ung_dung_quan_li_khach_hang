package cg.wbd.grandemonstration.controller;

import cg.wbd.grandemonstration.model.Customer;
import cg.wbd.grandemonstration.service.CustomerService;
import cg.wbd.grandemonstration.service.impl.SimpleCustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/customers")
    public String getAll(Model model) {
        model.addAttribute("customers", customerService.findAll());
        return "list2";
    }
    @GetMapping("/edit")
    public String findById(Model model, @RequestParam long id){
        Customer customer=customerService.findOne(id);
        model.addAttribute("customer",customer);
        return "info2";
    }
    @PostMapping("/edit")
    public String edit(Model model,@RequestParam long id,String name,String address,String email){
        Customer customer=customerService.findOne(id);
        customer.setName(name);
        customer.setAddress(address);
        customer.setEmail(email);
        customerService.save(customer);
        model.addAttribute("customers",customerService.findAll());
        return "list2";
    }
}
