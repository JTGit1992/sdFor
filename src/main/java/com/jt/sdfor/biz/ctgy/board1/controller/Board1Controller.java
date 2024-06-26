package com.jt.sdfor.biz.ctgy.board1.controller;


import com.jt.sdfor.biz.ctgy.board1.service.Board1Service;
import com.jt.sdfor.framework.core.response.IRestResponse;
import com.jt.sdfor.framework.core.response.RestResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/board")
public class Board1Controller {

    private final Board1Service board1Service;


    @GetMapping
    public ResponseEntity<? extends IRestResponse> findBoardList () {

        return new ResponseEntity<>(null);
    }

    @GetMapping("/sample1")
    public ResponseEntity<? extends IRestResponse> sample1 () {

        return RestResponse.of(board1Service.sample1());
    }

    @GetMapping("/sample-mybatis")
    public ResponseEntity<? extends IRestResponse> sample2 () {

        return RestResponse.of(board1Service.sampleForMyBatis());
    }
}
