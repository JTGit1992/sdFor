package com.jt.sdfor.framework.support.menu.controller;

import com.jt.sdfor.framework.core.response.IRestResponse;
import com.jt.sdfor.framework.core.response.RestResponse;
import com.jt.sdfor.framework.support.domain.MenuMng;
import com.jt.sdfor.framework.support.menu.service.MenuMngService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MenuApiController {

    private final MenuMngService menuMngService;

    @GetMapping(value = "/f/api/menu/tree", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<? extends IRestResponse> menuTree() {
        List<MenuMng> menuTree = menuMngService.findMenuTree();

        return RestResponse.of(menuTree);
    }

}
