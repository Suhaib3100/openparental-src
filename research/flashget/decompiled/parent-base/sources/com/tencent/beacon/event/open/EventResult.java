package com.tencent.beacon.event.open;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* loaded from: classes6.dex */
public final class EventResult {
    public static final int ERROR_CODE_LOGID_NOT_INIT = 107;
    public static final int ERROR_CODE_NAME_NULL = 106;
    public static final int ERROR_CODE_NOT_ENABLE = 102;
    public static final int ERROR_CODE_OFFER_FAIL = 103;
    public static final int ERROR_CODE_OTHER = 199;
    public static final int ERROR_CODE_PREVENT = 100;
    public static final int ERROR_CODE_SAMPLE = 101;
    public static final int ERROR_CODE_SAMPLE_BY_USER = 108;
    public static final int ERROR_CODE_SUCCESS = 0;
    public static final int ERROR_PARAMS_LONG = 105;
    public String errMsg;
    public int errorCode;
    public long eventID;

    public EventResult(int i4, long j4, String str) {
        this.errorCode = i4;
        this.eventID = j4;
        this.errMsg = str;
    }

    public boolean isSuccess() {
        return this.errorCode == 0;
    }

    public static final class a {
        public static EventResult a(int i4) {
            EventResult eventResult;
            switch (i4) {
                case 100:
                    eventResult = new EventResult(i4, -1L, ProtectedSandApp.s("㎌\u0001"));
                    break;
                case 101:
                    eventResult = new EventResult(i4, -1L, ProtectedSandApp.s("㎋\u0001"));
                    break;
                case 102:
                    eventResult = new EventResult(i4, -1L, ProtectedSandApp.s("㎊\u0001"));
                    break;
                case 103:
                    eventResult = new EventResult(i4, -1L, ProtectedSandApp.s("㎉\u0001"));
                    break;
                case 104:
                default:
                    return null;
                case 105:
                    eventResult = new EventResult(i4, -1L, ProtectedSandApp.s("㎈\u0001"));
                    break;
                case 106:
                    eventResult = new EventResult(i4, -1L, ProtectedSandApp.s("㎇\u0001"));
                    break;
                case 107:
                    eventResult = new EventResult(i4, -1L, ProtectedSandApp.s("㎆\u0001"));
                    break;
                case 108:
                    eventResult = new EventResult(i4, -1L, ProtectedSandApp.s("㎅\u0001"));
                    break;
            }
            return eventResult;
        }

        public static EventResult a(long j4) {
            return new EventResult(0, j4, null);
        }
    }
}
