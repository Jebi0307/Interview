package com.example.demo.service;

import com.example.demo.exception.MenuItemAlreadyExistsException;
import com.example.demo.model.MenuItem;
import com.example.demo.repository.MenuItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {

    @Autowired
    private MenuItemRepository menuItemRepository;

    public MenuItem createMenuItem (MenuItem menuItem) {

        if(menuItemRepository.findByName(menuItem.getName()).isPresent()) {
            throw new MenuItemAlreadyExistsException("MenuItem with name " + menuItem.getName() + " already exists");
        }

        return menuItemRepository.save(menuItem);
    }

    public List<MenuItem> getAllMenuItems () {
        return menuItemRepository.findAll();
    }
}
