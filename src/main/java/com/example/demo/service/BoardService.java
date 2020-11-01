package com.example.demo.service;

import com.example.demo.database.board.Board;
import com.example.demo.database.board.BoardRepository;
import java.util.Base64;
import java.util.List;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardService {


  private final BoardRepository boardRepository;

  public Board createBoard(Board board) {
    return boardRepository.save(board);
  }


  public Board getBoard(Long id) {
    return boardRepository.findById(id).orElseGet(Board::new);
  }

  public List<Board> getBoardList() {
    return boardRepository.findAll(Sort.by(Sort.Order.desc("id")));
  }
}
