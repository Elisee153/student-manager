package com.ericampire.web.controller;

import com.ericampire.web.dao.EtudiantDao;
import com.ericampire.web.entity.Etudiant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class EtudiantController {

    @Autowired
    EtudiantDao etudiantDao;

    @GetMapping("/index")
    String index(Model model) {
        model.addAttribute("etudiants", etudiantDao.findAll());
        return "index";
    }

    @GetMapping("/add")
    String afficheFormulaire(Model model) {
        Etudiant etudiant = new Etudiant();
        model.addAttribute("etudiant", etudiant);
        return "form";
    }

    @PostMapping("/save")
    String save(Etudiant etudiant) {
        etudiantDao.save(etudiant);
        return "redirect:/index";
    }
}
