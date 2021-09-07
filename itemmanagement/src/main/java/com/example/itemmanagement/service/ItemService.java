package com.example.itemmanagement.service;

import com.example.itemmanagement.entity.Item;

import java.util.List;

public interface ItemService {
    Item addItem(Item item);
    List<Item> getItems();
}
