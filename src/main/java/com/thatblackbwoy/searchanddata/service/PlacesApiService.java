package com.thatblackbwoy.searchanddata.service;

import com.thatblackbwoy.searchanddata.model.Photos;
import com.thatblackbwoy.searchanddata.model.PlaceDetails;
import com.thatblackbwoy.searchanddata.model.PlaceSearch;
import com.thatblackbwoy.searchanddata.model.Tips;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class PlacesApiService {
    private final RestTemplate restTemplate;
    @Value("${search.api}")
    private String searchApiUrl;

    @Value("${api.key.value}")
    private String token;
    public PlaceSearch placeSearch(){
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("Authorization", token);
        ResponseEntity<PlaceSearch> response = restTemplate.exchange(searchApiUrl, HttpMethod.GET, new HttpEntity<>(httpHeaders), new ParameterizedTypeReference<PlaceSearch>() {
        });

        return response.getBody();
    }

    @Value("${details.api}")
    private String detailsApiUrl;

    public PlaceDetails getPlaceDetails(String fsq_id){
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("Authorization", token);
        ResponseEntity<PlaceDetails> response = restTemplate.exchange(detailsApiUrl +"/"+ fsq_id, HttpMethod.GET, new HttpEntity<>(httpHeaders), new ParameterizedTypeReference<PlaceDetails>() {
        });
        return response.getBody();
    }
    @Value("${photos.api}")
    private String photosApiUrl;
    public List<Photos> getPlacePhotos(String fsq_id){
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("Authorization", token);
        ResponseEntity<List<Photos>> response = restTemplate.exchange(photosApiUrl + "/" + fsq_id + "/photos", HttpMethod.GET, new HttpEntity<>(httpHeaders), new ParameterizedTypeReference<List<Photos>>() {
        });
        return response.getBody();
    }
    @Value("${tips.api}")
    private String tipsApiUri;
    public List<Tips> getPlaceTips(String fsq_id){
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("Authorization", token);
        ResponseEntity<List<Tips>> response = restTemplate.exchange(tipsApiUri + "/" + fsq_id + "/tips", HttpMethod.GET, new HttpEntity<>(httpHeaders), new ParameterizedTypeReference<List<Tips>>() {
        });
        return response.getBody();
    }
}
