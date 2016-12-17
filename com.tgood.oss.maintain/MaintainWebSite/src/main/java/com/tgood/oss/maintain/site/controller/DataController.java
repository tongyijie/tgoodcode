package com.tgood.oss.maintain.site.controller;

import com.tgood.oss.platform.common.model.RestResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2016/12/14 0014.
 */

@RestController
@RequestMapping("/rest/v1")
public class DataController {
    @ResponseBody
    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public RestResult getAllUsers(HttpServletRequest request) {
        RestResult result = new RestResult();
        result.setCode(0);
        result.setDescription("operation success.");
        result.setData(100);
        return result;
    }
}
