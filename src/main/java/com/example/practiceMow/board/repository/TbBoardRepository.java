package com.example.practiceMow.board.repository;

import com.example.practiceMow.board.model.entity.TbBoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TbBoardRepository extends JpaRepository<TbBoardEntity, String> {

    TbBoardEntity findByBoardId(String boardId);
}
