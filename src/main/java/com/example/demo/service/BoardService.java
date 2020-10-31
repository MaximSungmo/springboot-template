package com.example.demo.service;

import com.example.demo.database.board.Board;
import com.example.demo.database.board.BoardRepository;
import java.util.Base64;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardService {


  private final BoardRepository boardRepository;

  public Board createBoard(Board board) {
    return null;
  }


}
