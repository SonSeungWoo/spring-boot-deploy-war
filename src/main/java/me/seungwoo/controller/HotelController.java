package me.seungwoo.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import me.seungwoo.ExResponse;
import me.seungwoo.dto.ParamDto;
import me.seungwoo.dto.ResponseData;
import me.seungwoo.service.CityCodeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Leo.
 * User: ssw
 * Date: 2019-01-30
 * Time: 14:41
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/hotel")
public class HotelController {

    private final CityCodeService cityCodeService;

    @GetMapping("/code")
    public ResponseEntity<ExResponse> selectHotelCode(@ModelAttribute ParamDto paramDto) {
        ResponseData response = cityCodeService.selectCityCode();
        log.info("==============start=============");
        return ResponseEntity.ok(
                new ExResponse
                        .Builder<>(response.getData())
                        .setResponse(paramDto)
                        .setIsSucceed(true)
                        .setIsWarning(false)
                        .build());
    }

    @PostMapping("/code")
    public ResponseEntity<ExResponse> postHotelCode(@RequestBody ParamDto paramDto) {
        ResponseData response = cityCodeService.selectCityCode();
        return ResponseEntity.ok(
                new ExResponse
                        .Builder<>(response.getData())
                        .setResponse(paramDto)
                        .setIsSucceed(true)
                        .setIsWarning(false)
                        .build());
    }

}
