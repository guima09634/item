package com.controller;

import com.entity.Item;
import com.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 *商品控制器
 *@date 2019/8/10
 *@author danielHua
 */
@RestController
@RequestMapping(value = "/item")
public class ItemController
{
    @Autowired
    private ItemService itemService;

    @RequestMapping(value = "/{id}")
    public Item queryById(@PathVariable Long id) {
        return itemService.queryItemById(id);
    }
}
