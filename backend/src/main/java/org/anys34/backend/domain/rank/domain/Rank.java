package org.anys34.backend.domain.rank.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.anys34.backend.global.entity.BaseTimeEntity;

@Getter
@NoArgsConstructor
@Table(name = "rhythm_rank")
@Entity
public class Rank extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private int score;

    @Builder
    public Rank(String name, int score) {
        this.name = name;
        this.score = score;
    }
}
