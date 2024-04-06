package com.task.task.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({
        "id",
        "label",
        "value"
})
public interface DistrictDDResponce {
    @JsonProperty("id")
    Long getid();

    @JsonProperty("label")
    String getlabel();

    @JsonProperty("value")
    String getvalue();
}
