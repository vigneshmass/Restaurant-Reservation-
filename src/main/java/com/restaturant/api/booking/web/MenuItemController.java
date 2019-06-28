package com.restaturant.api.booking.web;

import com.restaturant.api.booking.model.MenuItem;
import com.restaturant.api.booking.service.MenuItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class MenuItemController {
    @Autowired
    private MenuItemService menuItemService;


    @RequestMapping(value="/menuitem",method= RequestMethod.POST,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<MenuItem> createMenuItem(@RequestBody MenuItem menuItem ){
        MenuItem createMenuItem = menuItemService.createMenuItem (menuItem);
        return Optional.ofNullable(createMenuItem)
                .map(c ->ResponseEntity.ok().body(c))
                .orElse(ResponseEntity.notFound(). build());
    }
    @CrossOrigin
    @RequestMapping(value="/menuitem",method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<MenuItem> getMenuItem() {
        return (List<MenuItem>) menuItemService.getAllmenuitem();
    }

    @CrossOrigin
    @RequestMapping(value="/menuitem/{id}",method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public MenuItem getMenuItemById(@PathVariable Long id) {
        return  menuItemService.getAllmenuItemById(id);

    }



}
