package me.seungwoo.service;

import me.seungwoo.domain.CityCode;
import me.seungwoo.dto.ResponseData;

import java.util.List;

public interface CityCodeService {

    CityCode findByCityCode(String cityCode);

    List<CityCode> findAll();

    void save(CityCode cityCode);

    void update(CityCode cityCode);

    void delete(CityCode cityCode);

    ResponseData selectCityCode();

}
