package com.thatblackbwoy.searchanddata.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Photos {
    private String id;
    private LocalDateTime created_at;
    private String prefix;
    private String suffix;
    private int width;
    private int height;

}
