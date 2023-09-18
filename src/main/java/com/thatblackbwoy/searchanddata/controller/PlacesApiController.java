package com.thatblackbwoy.searchanddata.controller;

import com.thatblackbwoy.searchanddata.model.Photos;
import com.thatblackbwoy.searchanddata.model.PlaceDetails;
import com.thatblackbwoy.searchanddata.model.PlaceSearch;
import com.thatblackbwoy.searchanddata.model.Tips;
import com.thatblackbwoy.searchanddata.service.PlacesApiService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class PlacesApiController {

    private final PlacesApiService placesApiService;

    @GetMapping("/search")
    public PlaceSearch placeSearch(){
        return placesApiService.placeSearch();
    }
    @GetMapping("/{fsq_id}")
    public PlaceDetails getPlaceDetails(@PathVariable String fsq_id){
        return placesApiService.getPlaceDetails(fsq_id);
    }
    @GetMapping("/{fsq_id}/photos")
    public List<Photos> getPlacePhotos(@PathVariable String fsq_id){
        return placesApiService.getPlacePhotos(fsq_id);
    }
    @GetMapping("/{fsq_id}/tips")
    public List<Tips> getPlaceTips(@PathVariable String fsq_id){
        return placesApiService.getPlaceTips(fsq_id);
    }
}
