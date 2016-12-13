package com.tgood.oss.base.twoService.controller;

import com.tgood.oss.platform.common.model.RestResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2016/11/17 0017.
 */

@RestController
@RequestMapping("/v1/health")
public class HealthController {
    private static Logger logger = LoggerFactory.getLogger(HealthController.class);

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public RestResult getAllUsers(HttpServletRequest request) {
        logger.info("begin check health of service.");
        RestResult result = new RestResult();
        result.setCode(0);
        result.setDescription("operation success.");
        result.setData(100);
        logger.info("end check health of service.");
        return result;
    }
}
