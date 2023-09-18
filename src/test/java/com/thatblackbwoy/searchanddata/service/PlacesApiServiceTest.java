package com.thatblackbwoy.searchanddata.service;

import com.thatblackbwoy.searchanddata.model.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import javax.xml.ws.Response;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@SpringBootTest
class PlacesApiServiceTest {
    private static RestTemplate restTemplate;
    private PlacesApiService placesApiService;
    HttpHeaders headers = new HttpHeaders();

    @Value("${search.api}")
    private String search;
    @Value("${api.key.value}")
    private String token;

    @BeforeAll
    public static void init() {
        restTemplate = new RestTemplate();
    }

//    @Test
//    void placeSearch() {
//        headers.set("Authorization", token);
////        List<PlaceSearchResults> placeSearchResults = Stream.of(new PlaceSearchResults()).collect(Collectors.toList());
//        PlaceSearch expectedResponse = PlaceSearch.builder().results((List<PlaceSearchResults>) PlaceSearchResults.builder()
//                    .fsq_id("")
//                    .categories((List<Categories>) Categories.builder().id(1).name("").icon(Icon.builder().prefix("").suffix("").build()).build())
//                    .chains()
//                    .distance(1L)
//                    .geocodes(Geocodes.builder().main(Main.builder().latitude(1D).longitude(1D).build()).roof(Roof.builder().latitude(1D).longitude(1D).build()).build())
//                    .link("")
//                    .location(Location.builder().address("").address_extended("").census_block("").country("").cross_street("").dma("").formatted_address("").locality("").postcode("").region("").build())
//                    .name("")
//                    .related_places(RelatedPlaces.builder().children((List<Children>) Children.builder().fsq_id("").name("").build()).parent((List<Parent>) Parent.builder().fsq_id("").name("").build()).build())
//                    .timezone(""))
//            .context(Context.builder().geo_bounds(GeoBounds.builder().build())
//                    .build())
//            .build();
//        HttpEntity<PlaceSearch> entity = new HttpEntity<>(expectedResponse,headers);
//        ResponseEntity<PlaceSearch> response = restTemplate.exchange(search, HttpMethod.GET, entity, new ParameterizedTypeReference<PlaceSearch>() {
//        });
//        PlaceSearch actualResponse = placesApiService.placeSearch();
//        assertEquals(response, actualResponse);
//    }

    @Test
    void getPlacePhotos() {
    }
//    PlaceSearch expectedResponse = PlaceSearch.builder().results((List<PlaceSearchResults>) PlaceSearchResults.builder()
//                    .fsq_id("")
//                    .categories((List<Categories>) Categories.builder().id(1).name("").icon(Icon.builder().prefix("").suffix("").build()).build())
//                    .chain(Collections.singletonList(""))
//                    .distance(1L)
//                    .geocodes(Geocodes.builder().main(Main.builder().latitude(1D).longitude(1D).build()).roof(Roof.builder().latitude(1D).longitude(1D).build()).build())
//                    .link("")
//                    .location(Location.builder().address("").address_extended("").census_block("").country("").cross_street("").dma("").formatted_address("").locality("").postcode("").region("").build())
//                    .name("")
//                    .related_places(RelatedPlaces.builder().children((List<Children>) Children.builder().fsq_id("").name("").build()).parent((List<Parent>) Parent.builder().fsq_id("").name("").build()).build())
//                    .timezone(""))
//            .context(Context.builder().geo_bounds(GeoBounds.builder().build())
//                    .build())
//            .build()
    @Test
    void getPlaceTips() {
    }
}