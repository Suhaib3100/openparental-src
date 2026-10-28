package com.tencent.cos.xml.common;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.network.sonar.BuildConfig;
import org.apache.log4j.Priority;

/* loaded from: classes6.dex */
public enum ClientErrorCode {
    UNKNOWN(-10000, ProtectedSandApp.s("㔟\u0001")),
    INVALID_ARGUMENT(10000, ProtectedSandApp.s("㔡\u0001")),
    INVALID_CREDENTIALS(BuildConfig.VERSION_CODE, ProtectedSandApp.s("㔣\u0001")),
    BAD_REQUEST(10002, ProtectedSandApp.s("㔥\u0001")),
    SINK_SOURCE_NOT_FOUND(com.tencent.qcloud.track.BuildConfig.VERSION_CODE, ProtectedSandApp.s("㔧\u0001")),
    ETAG_NOT_FOUND(10004, ProtectedSandApp.s("㔩\u0001")),
    INTERNAL_ERROR(20000, ProtectedSandApp.s("㔫\u0001")),
    SERVERERROR(20001, ProtectedSandApp.s("㔭\u0001")),
    IO_ERROR(20002, ProtectedSandApp.s("㔯\u0001")),
    POOR_NETWORK(20003, ProtectedSandApp.s("㔱\u0001")),
    USER_CANCELLED(Priority.WARN_INT, ProtectedSandApp.s("㔳\u0001")),
    ALREADY_FINISHED(30001, ProtectedSandApp.s("㔵\u0001")),
    DUPLICATE_TASK(30002, ProtectedSandApp.s("㔷\u0001")),
    KMS_ERROR(Priority.ERROR_INT, ProtectedSandApp.s("㔹\u0001"));

    private int code;
    private String errorMsg;

    ClientErrorCode(int i4, String str) {
        this.code = i4;
        this.errorMsg = str;
    }

    public static ClientErrorCode to(int i4) {
        for (ClientErrorCode clientErrorCode : values()) {
            if (clientErrorCode.code == i4) {
                return clientErrorCode;
            }
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("㔻\u0001"));
    }

    public int getCode() {
        return this.code;
    }

    public String getErrorMsg() {
        return this.errorMsg;
    }

    public void setErrorMsg(String str) {
        this.errorMsg = str;
    }
}
