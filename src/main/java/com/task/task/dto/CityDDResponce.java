package com.task.task.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({
        "id",
        "label",
        "value"
})
public interface CityDDResponce {

    @JsonProperty("id")
    Long getid();

    @JsonProperty("label")
    String getlabel();

    @JsonProperty("value")
    String getvalue();
}
