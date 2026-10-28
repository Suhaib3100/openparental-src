package com.tencent.qcloud.core.auth;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* loaded from: classes7.dex */
public class AuthConstants {
    static final int EXPIRE_TIME_RESERVE_IN_SECONDS = 60;
    public static final String Q_KEY_TIME = ProtectedSandApp.s("墶\u0001");
    public static final String SHA1 = ProtectedSandApp.s("墷\u0001");
    public static final String Q_SIGN_TIME = ProtectedSandApp.s("墸\u0001");
    public static final String Q_SIGNATURE = ProtectedSandApp.s("墹\u0001");
    public static final String Q_URL_PARAM_LIST = ProtectedSandApp.s("墺\u0001");
    public static final String Q_HEADER_LIST = ProtectedSandApp.s("墻\u0001");
    public static final String Q_AK = ProtectedSandApp.s("墼\u0001");
    public static final String Q_SIGN_ALGORITHM = ProtectedSandApp.s("墽\u0001");

    private AuthConstants() {
        throw new AssertionError(ProtectedSandApp.s("墵\u0001"));
    }
}
