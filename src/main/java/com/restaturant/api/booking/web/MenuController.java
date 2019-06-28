package com.restaturant.api.booking.web;

import com.restaturant.api.booking.model.Menu;
import com.restaturant.api.booking.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class MenuController {
    @Autowired
    private MenuService menuService;


   @CrossOrigin
    @RequestMapping(value="/menu",method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Menu> getMenu() {
        return (List<Menu>) menuService.getAllcustomer();
    }




    @RequestMapping(value="/menu",method= RequestMethod.POST,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Menu> createMenu(@RequestBody Menu menu ){
        Menu createMenu = menuService.createMenu (menu);
        return Optional.ofNullable(createMenu)
                .map(c ->ResponseEntity.ok().body(c))
                .orElse(ResponseEntity.notFound(). build());
    }
    @CrossOrigin
    @RequestMapping(value="/menu/{id}",method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Menu getMenuById(@PathVariable Long id) {
        return  menuService.getAllmenuById(id);

    }

}
