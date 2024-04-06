package com.task.task.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({
        "countryId",
       "countryName",
        "stateName",
        "districtName",
        "cityName"

})



public interface PincodeDDResponce {


    @JsonProperty("countryName")
    String getCountry_name();

    @JsonProperty("stateName")
    String getState_name();

    @JsonProperty("districtName")
    String getDistrict_name();

    @JsonProperty("talukaName")
    String getTaluka_name();

    @JsonProperty("cityName")
    String getCity_name();


}
