package me.seungwoo.mapper;

import me.seungwoo.domain.CityCode;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface CityCodeMapper {

    CityCode findByCityCode(String cityCode);

    List<CityCode> findAll();

    void save(CityCode cityCode);

    void update(CityCode cityCode);

    void delete(CityCode cityCode);

    @Select("select * from BTMS.BS_CITY_CODE where CITY_FILE_NAME = #{name}")
    List<CityCode> findByName(@Param("name") String name);

    void selectCityCode(Map<String, String> map);

}
