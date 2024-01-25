package org.anys34.backend.domain.rank.service;

import lombok.RequiredArgsConstructor;
import org.anys34.backend.domain.rank.domain.repository.RankRepository;
import org.anys34.backend.domain.rank.presentation.dto.req.SaveRankRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class SaveRankService {
    private final RankRepository rankRepository;

    @Transactional
    public void execute(SaveRankRequest saveRankRequest) {
        rankRepository.save(saveRankRequest.toEntity());
    }
}
