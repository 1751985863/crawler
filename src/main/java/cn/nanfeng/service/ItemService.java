package cn.nanfeng.service;

import cn.nanfeng.pojo.Item;

import java.util.List;

public interface ItemService {
    public List<Item> findAll(Item item);
    public void save(Item item);
}
