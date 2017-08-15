package org.tac.ms.tacmsrobotlogic.client.fallback;

import org.springframework.stereotype.Component;
import org.tac.ms.tacmsrobotlogic.client.UserCenterClient;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhangdong on 2017/7/25.
 */
@Component
public class UserCenterClientFb implements UserCenterClient {
    @Override
    public Map dely(long time) {
        Map re = new HashMap();
        re.put("code","500");
        return re;
    }
}
