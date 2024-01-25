package org.anys34.backend.domain.rank.presentation;

import lombok.RequiredArgsConstructor;
import org.anys34.backend.domain.rank.presentation.dto.req.SaveRankRequest;
import org.anys34.backend.domain.rank.presentation.dto.res.RankListResponse;
import org.anys34.backend.domain.rank.service.RankListService;
import org.anys34.backend.domain.rank.service.SaveRankService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/rank")
@RestController
public class RankController {
    private final SaveRankService saveRankService;
    private final RankListService rankListService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/save")
    public void save(@RequestBody SaveRankRequest saveRankRequest) {
        saveRankService.execute(saveRankRequest);
    }

    @GetMapping("/list")
    public List<RankListResponse> list() {
        return rankListService.execute();
    }
}
