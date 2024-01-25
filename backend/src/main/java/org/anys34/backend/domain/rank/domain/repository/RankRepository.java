package org.anys34.backend.domain.rank.domain.repository;

import org.anys34.backend.domain.rank.domain.Rank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RankRepository extends JpaRepository<Rank, Long> {
    @Query("SELECt r FROM Rank r ORDER BY r.score DESC")
    List<Rank> findByList();
}
