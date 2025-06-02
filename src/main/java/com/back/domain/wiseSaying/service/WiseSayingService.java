package com.back.domain.wiseSaying.service;

import com.back.domain.wiseSaying.entity.WiseSaying;

import java.util.List;

public class WiseSayingService {
    private final WiseSayingRepository wiseSayingRepository;

    public WiseSayingService() {
        this.wiseSayingRepository = new WiseSayingRepository();
    }

    public WiseSaying write(String content, String author) {
        WiseSaying wiseSaying = new WiseSaying(content, author);
        return wiseSayingRepository.save(wiseSaying);
    }

    public List<WiseSaying> findForList() {
        return wiseSayingRepository.findForList();
    }
}
