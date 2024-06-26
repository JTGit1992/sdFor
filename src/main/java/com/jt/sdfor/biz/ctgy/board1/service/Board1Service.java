package com.jt.sdfor.biz.ctgy.board1.service;


import com.jt.sdfor.biz.ctgy.board1.dto.Board1Dto;
import com.jt.sdfor.biz.ctgy.board1.repository.Board1QueryDslRepository;
import com.jt.sdfor.biz.domain.board.Board;
import com.jt.sdfor.biz.domain.board.BoardRepository;
import com.jt.sdfor.biz.mybatisMapper.SampleMapper;
import com.jt.sdfor.framework.core.exception.BaseException;
import com.jt.sdfor.framework.core.exception.ErrorCode;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class Board1Service {

    private final BoardRepository boardRepository;
    private final Board1QueryDslRepository board1QueryDslRepository;
    private final SampleMapper sampleMapper;


    @Transactional
    public List<Board1Dto.Response.Search> sample1() {

        List<Board1Dto.Response.Search> result = new ArrayList<>();
        result = board1QueryDslRepository.sample1();

        return result;
    }

    @Transactional
    public List<Board> sample2() {
        return boardRepository.findAll();
    }

    public Board sample3() {
        return boardRepository.findById(9999L).orElseThrow(() -> new BaseException(ErrorCode.DATA_NOT_FOUND));
    }

    public List<Board1Dto.Response.Search> sampleForMyBatis() {
        List<Board1Dto.Response.Search> result = sampleMapper.findById(1L);
        return result;
    }

}
