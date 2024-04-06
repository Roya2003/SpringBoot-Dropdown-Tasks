package com.task.task.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({
        "id",
        "label",
        "value"
})

public interface StateAllDDResponce {
    @JsonProperty("id")
    Long getId();

    @JsonProperty("label")
    String getLabel();

    @JsonProperty("value")
    String getValue();

}
