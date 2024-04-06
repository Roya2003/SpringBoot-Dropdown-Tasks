package com.task.task.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.task.task.entity.CountryEntity;
import lombok.Getter;
import lombok.Setter;

@JsonPropertyOrder({

        "countryId",
        "countryName",
        "stateId",
        "stateName",
        "districtId",
        "districtName",
        "talukaId",
        "talukaName",
        "cityId",
        "cityName",
        "pincodeNo"
})


public interface AreasDataDto {

    @JsonProperty("countryId")
     Long getCountry_id();
    @JsonProperty("countryName")
     String getCountry_name();
    @JsonProperty("stateId")
     Long getState_id();
    @JsonProperty("stateName")
     String getState_name();
    @JsonProperty("districtId")
     Long getDistrict_id();
    @JsonProperty("districtName")
     String getDistrict_name();
    @JsonProperty("talukaId")
     Long getTaluka_id();
    @JsonProperty("talukaName")
     String getTaluka_name();
    @JsonProperty("cityId")
     Long getCity_id();
    @JsonProperty("cityName")
     String getCity_name();
    @JsonProperty("pincodeNo")
    Long getPincode_no();
}
