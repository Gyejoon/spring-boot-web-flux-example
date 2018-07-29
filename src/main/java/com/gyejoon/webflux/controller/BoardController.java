package com.gyejoon.webflux.controller;

import com.gyejoon.webflux.model.Board;
import com.gyejoon.webflux.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.awt.print.Pageable;

@RestController
@RequestMapping(value = "/boards")
public class BoardController {

    @Autowired
    private BoardRepository boardRepository;

    @GetMapping
    public Flux<Board> findBoard(@PageableDefault Pageable pageable) {
        return boardRepository.findAll();
    }

}
