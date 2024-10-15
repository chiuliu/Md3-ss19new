package hibernate_demo.controller;

import hibernate_demo.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import hibernate_demo.service.IAccountService;

@Controller // tiếp nhận
@RequestMapping // http://localhost:8080/

public class AccountController {
    @Autowired
    private IAccountService accountService;

    @GetMapping
    public String findAll(Model model) {
        model.addAttribute("accounts", accountService.findAll());
        return "accounts";
    }

    @GetMapping("/add")
    public String viewAdd() {
        return "add_account";


    }

    @PostMapping("/add")
    public String doAddAccount(@ModelAttribute Account account){
        accountService.save(account);
        return "redirect:/";

    }

}
