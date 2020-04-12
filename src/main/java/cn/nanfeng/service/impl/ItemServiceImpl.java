package cn.nanfeng.service.impl;

import cn.nanfeng.dao.ItemDao;
import cn.nanfeng.pojo.Item;
import cn.nanfeng.service.ItemService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemDao itemDao;
    @Override
    public List<Item> findAll(Item item) {
        Example<Item> example=Example.of(item);
        List<Item> all = itemDao.findAll(example);
        return all;

    }

    @Override
    @Transactional
    public void save(Item item) {
        itemDao.save(item);

    }
}
