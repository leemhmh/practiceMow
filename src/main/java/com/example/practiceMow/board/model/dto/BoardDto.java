package com.example.practiceMow.board.model.dto;

import com.example.practiceMow.board.model.entity.TbBoardEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BoardDto {

    private String boardId;
    private String description;
    private String userId;

    public BoardDto(TbBoardEntity tbBoardEntity) {
        this.boardId = tbBoardEntity.getBoardId();
        this.description = tbBoardEntity.getDescription();
        this.userId = tbBoardEntity.getUserId();
    }
}
