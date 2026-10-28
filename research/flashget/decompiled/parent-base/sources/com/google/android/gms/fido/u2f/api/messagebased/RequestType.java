package com.google.android.gms.fido.u2f.api.messagebased;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@Deprecated
/* loaded from: classes5.dex */
public enum RequestType {
    REGISTER(ProtectedSandApp.s("츌")),
    SIGN(ProtectedSandApp.s("츎"));

    private final String zzb;

    /* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
    public static class UnsupportedRequestTypeException extends Exception {
        public UnsupportedRequestTypeException(@o0 String str) {
            super(ProtectedSandApp.s("츊").concat(String.valueOf(str)));
        }
    }

    RequestType(String str) {
        this.zzb = str;
    }

    @o0
    public static RequestType fromString(@o0 String str) throws UnsupportedRequestTypeException {
        for (RequestType requestType : values()) {
            if (str.equals(requestType.zzb)) {
                return requestType;
            }
        }
        throw new UnsupportedRequestTypeException(str);
    }

    @Override // java.lang.Enum
    @o0
    public String toString() {
        return this.zzb;
    }
}
