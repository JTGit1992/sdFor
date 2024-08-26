package com.jt.sdfor.framework.support.menu.service;


import com.jt.sdfor.framework.support.menu.dto.MenuMngDTO;

import java.util.List;

public interface MenuMngService {

    List<MenuMngDTO> findMenuTree();


}
