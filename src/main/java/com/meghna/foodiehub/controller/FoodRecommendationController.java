package com.meghna.foodiehub.controller;

import com.meghna.foodiehub.io.FoodRecommendationRequest;
import com.meghna.foodiehub.service.FoodRecommendationService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/ai")
public class FoodRecommendationController {

    private final FoodRecommendationService recommendationService;

    public FoodRecommendationController(
            FoodRecommendationService recommendationService
    ) {
        this.recommendationService = recommendationService;
    }

    @PostMapping("/recommendations")
    public ResponseEntity<Map<String, String>> recommend(
            @Valid @RequestBody FoodRecommendationRequest request
    ) {
        String recommendation =
                recommendationService.recommend(request.message().trim());

        return ResponseEntity.ok(
                Map.of("recommendation", recommendation)
        );
    }
}