package com.example.jswithspring.service;

import com.example.jswithspring.entity.Board;
import org.springframework.stereotype.Service;

public interface BoardService {
    public void register(Board board) throws Exception;
}
