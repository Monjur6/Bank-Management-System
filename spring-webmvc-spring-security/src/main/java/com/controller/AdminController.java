package com.controller;

import com.domain.Admin;
import com.exception.BadRequestAlertException;
import com.exception.NotFoundAlertException;
import com.service.AdminInterfaceService;
//import com.service.AdminService;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;
//import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@RestController
//@Controller
@RequestMapping("/api")
public class AdminController {


    private AdminInterfaceService adminInterfaceService;

    public AdminController(AdminInterfaceService adminInterfaceService) {
        this.adminInterfaceService = adminInterfaceService;
    }

    @InitBinder
    public void initBinder(WebDataBinder webDataBinder) {
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        webDataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }

    @PostMapping("/admins")
    public ResponseEntity<Admin> createAdmin(@Valid @RequestBody Admin admin) throws Exception {

        adminInterfaceService.insert(admin);
        return ResponseEntity.created(new URI("/admins/"))
                .body(admin);
    }

    @PutMapping("/admins")
    public ResponseEntity<Admin> updateAdmin(@Valid @RequestBody Admin admin) throws Exception {

        adminInterfaceService.update(admin);
        return ResponseEntity.created(new URI("/update/"))
                .body(admin);
    }

    @GetMapping("/admins")
    public ResponseEntity<List<Admin>> getAllAdmins() {
        List<Admin> admins = adminInterfaceService.getAll();
        return ResponseEntity.ok().body(admins);
    }

    @GetMapping("/admins/{id}")
    public ResponseEntity<Admin> getAdmin(@PathVariable Long id) {
        Optional<Admin> admin = Optional.ofNullable(adminInterfaceService.get(id));
        if (admin.isPresent()) {
            return ResponseEntity.ok().body(admin.get());
        }
        else
            return null;
    }

    @DeleteMapping("/admins/{id}")
    public ResponseEntity<Admin> deleteAdmin(@PathVariable Long id) {
        adminInterfaceService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
