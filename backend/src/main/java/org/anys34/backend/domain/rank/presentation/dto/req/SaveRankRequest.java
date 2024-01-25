package org.anys34.backend.domain.rank.presentation.dto.req;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.anys34.backend.domain.rank.domain.Rank;

@Getter
@NoArgsConstructor
public class SaveRankRequest {
    private String name;
    private int score;

    public Rank toEntity() {
        return Rank.builder()
                .name(name)
                .score(score)
                .build();
    }
}
