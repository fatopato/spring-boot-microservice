package com.example.itemmanagement.controller;

import com.example.itemmanagement.entity.Item;
import com.example.itemmanagement.service.ItemService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api/v1/item")
public class ItemController {

    @NonNull ItemService itemService;

    @PostMapping(value = "/")
    public Item save(@RequestBody Item item){
        return itemService.addItem(item);
    }

    @GetMapping(value = "/")
    public List<Item> getAll(){
        return itemService.getItems();
    }
}
