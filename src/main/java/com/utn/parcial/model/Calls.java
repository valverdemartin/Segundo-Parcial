package com.utn.parcial.model;

import io.swagger.annotations.ApiModelProperty;

import java.sql.Date;

public class Calls {
    @ApiModelProperty(value = "Id of Rate", required = true, example = "1")
    public Integer idRate;
    @ApiModelProperty(value = "Id of Origin Line", required = true, example = "1")
    public Integer originLine;
    @ApiModelProperty(value = "Id of Destination Line", required = true, example = "1")
    public Integer destLine;
    @ApiModelProperty(value = "Origin Number", required = true, example = "2235560078")
    public String originNumber;
    @ApiModelProperty(value = "Destination Number", required = true, example = "2234475594")
    public String destNumber;
    @ApiModelProperty(value = "Duration of call in seconds", required = true, example = "100")
    public Integer duration;
    @ApiModelProperty(value = "Total price", required = true, example = "10.50")
    public Double totalPrice;
    @ApiModelProperty(value = "Date of call", required = true, example = "2020/06/12")
    public String callDate;
}
