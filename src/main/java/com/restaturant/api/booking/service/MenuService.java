package com.restaturant.api.booking.service;

import com.restaturant.api.booking.model.Menu;
import com.restaturant.api.booking.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {
    @Autowired
    private MenuRepository menuRepository;

    public List<Menu> getAllcustomer() {
        return (List<Menu>) menuRepository.findAll();
    }

    public Menu getAllmenuById(Long id) {
        return menuRepository.findById(id).get();
    }

    public Menu createMenu(Menu menu) {
        return menuRepository.save(menu);
    }
}
