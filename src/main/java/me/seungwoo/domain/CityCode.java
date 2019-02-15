package me.seungwoo.domain;

import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.io.Serializable;

@Data
@Alias("cityCode")
public class CityCode implements Serializable{

    private String cityCode;

    private String countryCode;

    private String stateCode;

    private String cityFileName;

    private String cityNameEn;

    private String cityNameKo;

    private String cityNameJa;

    private String cityNameZh;

    private String cityNameFr;

    private String cityNameEs;

    private String cityNameDe;

}
