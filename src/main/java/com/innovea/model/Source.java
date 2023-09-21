package com.innovea.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Source {

    private Long id;
    private String name;
}
