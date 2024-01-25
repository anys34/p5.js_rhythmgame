package org.anys34.backend.domain.rank.presentation.dto.res;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.anys34.backend.domain.rank.domain.Rank;

@AllArgsConstructor
@Getter
public class RankListResponse {
    private String name;
    private int score;

    public RankListResponse(Rank rank) {
        this.name = rank.getName();
        this.score = rank.getScore();
    }
}
