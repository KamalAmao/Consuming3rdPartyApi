package com.thatblackbwoy.searchanddata.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PlaceDetails {
    private String fsq_id;
    private List<Categories> categories;
    private List<String> chain;
    private Long distance;
    private Geocodes geocodes;
    private String link;
    private Location location;
    private String name;
    private RelatedPlaces related_laces;
    private String timezone;
}
