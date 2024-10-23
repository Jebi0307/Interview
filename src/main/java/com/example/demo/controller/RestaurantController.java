package com.example.demo.controller;

import com.example.demo.model.MenuItem;
import com.example.demo.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;

    @PostMapping("/menu-items")
    public ResponseEntity<MenuItem> createMenuItem(@RequestBody MenuItem menuItem) {
        return ResponseEntity.ok(restaurantService.createMenuItem(menuItem));
    }

    @GetMapping("/menu-items")
    public ResponseEntity<List<MenuItem>> getAllMenuItems () {
        return ResponseEntity.ok(restaurantService.getAllMenuItems());
    }
}
