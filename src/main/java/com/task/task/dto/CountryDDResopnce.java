package com.task.task.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonPropertyOrder({
        "id",
        "label",
        "value",

})
public interface CountryDDResopnce {

    @JsonProperty("id")
    Long getid() ;

    @JsonProperty("label")
    String getlabel();

    @JsonProperty("value")
    String getvalue();

}
