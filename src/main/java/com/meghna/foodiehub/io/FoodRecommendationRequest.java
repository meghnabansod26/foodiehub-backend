package com.meghna.foodiehub.io;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record FoodRecommendationRequest(
        @NotBlank(message = "Please enter your food preferences.")
        @Size(max = 500, message = "Message must be at most 500 characters.")
        String message
) {
}