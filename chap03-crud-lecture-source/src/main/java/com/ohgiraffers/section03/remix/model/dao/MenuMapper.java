package com.ohgiraffers.section03.remix.model.dao;

import com.ohgiraffers.section03.remix.model.dto.MenuDTO;

import java.util.List;

public interface MenuMapper<S, S1> {

    List<MenuDTO> selectAllMenu();
    MenuDTO selectMenuByMenuCode(int code);
    List<MenuDTO> insertNewMenu();
    List<MenuDTO> updateMenu();
    List<MenuDTO> deleteMenu();



}
