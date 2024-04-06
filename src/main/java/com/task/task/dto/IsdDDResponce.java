package com.task.task.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({
        "id",
        "label",
        "value"
})

public interface IsdDDResponce {

    @JsonProperty
    Long getid();

    @JsonProperty
    String getvalue();

    @JsonProperty
    String getlabel();

}
