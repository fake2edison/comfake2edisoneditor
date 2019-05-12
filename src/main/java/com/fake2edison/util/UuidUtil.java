package com.fake2edison.util;

import java.util.UUID;

/**
 * Created by fake2edison on 2019/4/22.
 */
public class UuidUtil {

    public static String getUUID() {
        UUID uuid = UUID.randomUUID();
        String str = uuid.toString();
        String uuidStr = str.replace("-", "");
        return uuidStr;
    }
}
