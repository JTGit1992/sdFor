package com.jt.sdfor.board.unit;

import com.jt.sdfor.biz.ctgy.board1.controller.Board1Controller;
import com.jt.sdfor.biz.ctgy.board1.service.Board1Service;
import com.jt.sdfor.framework.core.security.SecurityConfig;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(value = Board1Controller.class, excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = SecurityConfig.class),
})
public class BoardControllerTest {

    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private Board1Service board1Service;

//    @Test
//    @DisplayName("컨트롤러 단위 테스트: ")
//    public void test() throws Exception {
//
//        mockMvc.perform(get("/board/sample1")
//                        .accept(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.code").value(200))
//                .andDo(print());
//    }
}
