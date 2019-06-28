package com.restaturant.api.booking.service;

import com.restaturant.api.booking.model.MenuItem;
import com.restaturant.api.booking.repository.MenuItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuItemService {
    @Autowired
    private MenuItemRepository menuItemRepository;

    public MenuItem createMenuItem(MenuItem menuItem) {
        return menuItemRepository.save(menuItem);
    }

    public List<MenuItem> getAllmenuitem() {
        return (List<MenuItem>) menuItemRepository.findAll();
    }


    public MenuItem getAllmenuItemById(Long id) {
        return menuItemRepository.findById(id).get();
    }
}
