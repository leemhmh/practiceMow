package com.example.practiceMow.board.service;

import com.example.practiceMow.board.model.dto.BoardDto;
import com.example.practiceMow.board.model.entity.TbBoardEntity;
import com.example.practiceMow.board.repository.TbBoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final TbBoardRepository tbBoardRepository;
    public BoardDto getBoard(String boardId) {

        if (boardId == null) {
            List<TbBoardEntity> tbBoardEntities = tbBoardRepository.findAll();

            BoardDto result = BoardDto.builder()
                    .boardId(tbBoardEntities.get(0).getBoardId())
                    .description(tbBoardEntities.get(0).getDescription())
                    .userId(tbBoardEntities.get(0).getUserId())
                    .build();

//            BoardDto result2 = new BoardDto(tbBoardEntities.get(0));

            return result;
        }

        TbBoardEntity tbBoardEntity = tbBoardRepository.findByBoardId(boardId);

        BoardDto result = new BoardDto(tbBoardEntity);

        return result;
    }
}
