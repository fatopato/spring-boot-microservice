package com.example.itemmanagement.service;

import com.example.itemmanagement.entity.Item;
import com.example.itemmanagement.repository.ItemRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ItemServiceImpl implements ItemService {

    @NonNull
    ItemRepository repository;

    @Override
    public Item addItem(Item profile) {
        return repository.save(profile);
    }

    @Override
    public List<Item> getItems() {
        return repository.findAll();
    }
}
