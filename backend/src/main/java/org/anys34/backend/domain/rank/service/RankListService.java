package org.anys34.backend.domain.rank.service;

import lombok.RequiredArgsConstructor;
import org.anys34.backend.domain.rank.domain.repository.RankRepository;
import org.anys34.backend.domain.rank.presentation.dto.res.RankListResponse;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class RankListService {
    private final RankRepository rankRepository;

    @Transactional(readOnly = true)
    public List<RankListResponse> execute() {
        return rankRepository.findByList().stream()
                .map(RankListResponse::new)
                .collect(Collectors.toList());
    }
}
