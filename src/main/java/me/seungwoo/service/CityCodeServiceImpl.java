package me.seungwoo.service;

import lombok.RequiredArgsConstructor;
import me.seungwoo.ParserUtil;
import me.seungwoo.domain.CityCode;
import me.seungwoo.dto.ResponseData;
import me.seungwoo.mapper.CityCodeMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
@RequiredArgsConstructor
public class CityCodeServiceImpl implements CityCodeService {

    private final CityCodeMapper cityCodeMapper;

    @Override
    public CityCode findByCityCode(String cityCode) {
        return cityCodeMapper.findByCityCode(cityCode);
    }

    @Override
    public List<CityCode> findAll() {
        return cityCodeMapper.findAll();
    }

    @Override
    public void save(CityCode cityCode) {
        cityCodeMapper.save(cityCode);
    }

    @Override
    public void update(CityCode cityCode) {
        cityCodeMapper.update(cityCode);
    }

    @Override
    public void delete(CityCode cityCode) {
        cityCodeMapper.delete(cityCode);
    }

    @Override
    public ResponseData selectCityCode() {
        Map<String, String> map = new HashMap();
        map.put("serviceName", "cityCode");
        map.put("inputString", "<Input Code=\"5J\"/>");
        cityCodeMapper.selectCityCode(map);
        ResponseData response = ParserUtil.xmlResultParser(map.get("result"));
        response.setData(ParserUtil.xmlToJsonParser(map.get("xmlString")));
        return response;
    }

}
