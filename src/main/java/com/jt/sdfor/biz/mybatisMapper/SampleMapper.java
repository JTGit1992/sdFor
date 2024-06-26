package com.jt.sdfor.biz.mybatisMapper;

import com.jt.sdfor.biz.ctgy.board1.dto.Board1Dto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SampleMapper {

    List<Board1Dto.Response.Search> findById(Long id);
}
