package com.example.practiceMow.board.controller;

import com.example.practiceMow.board.model.dto.BoardDto;
import com.example.practiceMow.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {

    private final BoardService boardService;

    @GetMapping("")
    public BoardDto getBoard(@RequestParam(name = "boardId")
                             String boardId) {
        return boardService.getBoard(boardId);
    }
}
