package com.liujun.admin.service;

import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

@FeignClient("service-engine")
public interface EngineService {

    @PostMapping("/start")
    Map<String, String> startEngine();

    @PostMapping("/stop")
    Map<String, String> stopEngine();

    @PostMapping("/adjustPrice")
    Map<String, String> saveAdjustPrice(@Param("adjustPrice") String adjustPrice);

    @GetMapping("/queryDiffPrice")
    Map<String, Object> queryDiffPrice(@Param("unit") int unit, @Param("maxCell") int maxCell);
}
