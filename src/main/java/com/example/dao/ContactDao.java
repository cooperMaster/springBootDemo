package com.example.dao;

import com.example.dto.Contact;

import java.util.List;

/**
 * Created by Administrator on 2017/6/14 0014.
 */
public interface ContactDao {
    List<Contact> findAll();
    void save(Contact contact);
}
