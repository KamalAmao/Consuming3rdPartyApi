package com.thatblackbwoy.searchanddata.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Location {
    private String address;
    private String address_extended;
//    private String admin_region;
    private String census_block;
    private String country;
    private String cross_street;
    private String dma;
    private String formatted_address;
    private String locality;
//    private List<String> neighborhood;
//    private String po_box;
//    private String post_town;
    private String postcode;
    private String region;

}
