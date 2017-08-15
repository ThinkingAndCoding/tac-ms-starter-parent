package org.tac.ms.tacmscommonstartbase.util;

import java.util.UUID;

/**
 * Created by zhangdong on 2017/7/3.
 */
public class UuidUtil {
    public static String getUuid(){
        UUID uuid = UUID.randomUUID();
        String uuidStr =  uuid.toString();
        uuidStr = uuidStr.replace("-", "");
        return uuidStr;
    }
}
