package com.thatblackbwoy.searchanddata.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FrontDoor {
    private Double latitude;
    private Double longitude;
}
