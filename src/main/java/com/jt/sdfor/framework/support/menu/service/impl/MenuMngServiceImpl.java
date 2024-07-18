package com.jt.sdfor.framework.support.menu.service.impl;

import com.jt.sdfor.framework.support.domain.MenuMng;
import com.jt.sdfor.framework.support.domain.MenuMngRepository;
import com.jt.sdfor.framework.support.menu.service.MenuMngService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MenuMngServiceImpl implements MenuMngService {

    private final MenuMngRepository menuMngRepository;

    @Override
    public List<MenuMng> findMenuTree() {
        return menuMngRepository.findAll();
    }
}
