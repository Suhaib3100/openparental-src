package com.tencent.qcloud.network.sonar;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* loaded from: classes7.dex */
public interface Sonar<T> {
    public static final String ERROR_MSG_HOST_IS_EMPTY = ProtectedSandApp.s("嫑\u0001");
    public static final String ERROR_MSG_NO_NETWORK = ProtectedSandApp.s("嫒\u0001");
    public static final String ERROR_MSG_PING_PROCESS_IS_NULL = ProtectedSandApp.s("嫓\u0001");
    public static final String ERROR_MSG_IP_IS_EMPTY = ProtectedSandApp.s("嫔\u0001");

    SonarResult<T> start(SonarRequest sonarRequest);

    void stop();
}
