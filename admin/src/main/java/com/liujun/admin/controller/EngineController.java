package com.liujun.admin.controller;

import com.liujun.admin.service.EngineService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * 通过openFeign调用微服务，然后在对外提供服务。
 */
@RestController
public class EngineController {
    private static Logger log = LoggerFactory.getLogger(EngineController.class);
    private EngineService engineService;

    @PostMapping("/engine_start")
    public Map<String, String> startEngine() {
        return engineService.startEngine();
    }

    @PostMapping("/engine_stop")
    public Map<String, String> stopEngine() {
        return engineService.stopEngine();
    }


    @PostMapping("/engine_adjustPrice")
    public Map<String, String> saveAdjustPrice(@RequestParam String adjustPrice) {
        return engineService.saveAdjustPrice(adjustPrice);
    }

    /**
     * 查询各平台的价格偏差（与平均值的差距）
     *
     * @param unit    横坐标一个单元代表几分钟
     * @param maxCell 横坐标最多有多少格
     * @return 生成曲线图需要的各参数
     */
    @GetMapping("/engine_queryDiffPrice")
    public Map<String, Object> queryDiffPrice(@RequestParam int unit, @RequestParam int maxCell) {
        return engineService.queryDiffPrice(unit, maxCell);
    }


}
