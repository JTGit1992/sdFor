package com.jt.sdfor.framework.support.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import org.hibernate.annotations.Comment;

@Getter
@Entity
@Table(name = "com_menu_mng")
public class MenuMng {

    @Id
    @Column(name = "menu_id")
    @Comment("메뉴ID")
    private String menuId;

    @Column(name = "menu_dc")
    @Comment("메뉴 설명")
    private String menuDc;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent")
    private MenuMng parent;

    @Column(name = "list_order")
    @Comment("메뉴정렬순서")
    private Integer listOrder;

    @Column(name = "menu_url")
    @Comment("메뉴URL")
    private String menuUrl;

    @Column(name = "menu_cd")
    @Comment("메뉴코드")
    private String menuCd;

}
