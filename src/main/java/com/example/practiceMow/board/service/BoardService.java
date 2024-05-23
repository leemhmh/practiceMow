package com.example.practiceMow.board.service;

import com.example.practiceMow.board.model.dto.BoardDto;
import com.example.practiceMow.board.repository.TbBoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final TbBoardRepository tbBoardRepository;
    public BoardDto getBoard(String boardId) {

        return null;
    }
}
