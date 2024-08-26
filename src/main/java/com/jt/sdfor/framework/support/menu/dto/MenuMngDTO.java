package com.jt.sdfor.framework.support.menu.dto;

import com.jt.sdfor.framework.support.domain.MenuMng;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class MenuMngDTO {

    private String menuNm;
    private String menuUrl;
    private List<MenuMng> chlidren;
}
