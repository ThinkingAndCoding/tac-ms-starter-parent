package org.tac.ms.tacmsrobotlogic.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.tac.ms.tacmsrobotlogic.client.fallback.UserCenterClientFb;

import java.util.Map;


/**
 * feign依赖的接口，模拟http请求，对应定义出服务提供方的出入参，请求方式等即可
 * Created by zhangdong on 2017/4/19.
 */
// 此处对应eureka中注册的小写名称
@FeignClient(value = "usercenter", fallback = UserCenterClientFb.class)
public interface UserCenterClient {

    @RequestMapping(method = RequestMethod.GET, value = "/delytime")
    Map dely(@RequestParam(value = "time") long time);

}
