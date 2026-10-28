package com.google.android.gms.fido.u2f.api.messagebased;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.fido.u2f.api.messagebased.RequestType;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@Deprecated
/* loaded from: classes5.dex */
public enum ResponseType {
    REGISTER(ProtectedSandApp.s("츐")),
    SIGN(ProtectedSandApp.s("츒"));

    private final String zzb;

    ResponseType(String str) {
        this.zzb = str;
    }

    @o0
    public static ResponseType getResponseTypeForRequestType(@o0 RequestType requestType) throws RequestType.UnsupportedRequestTypeException {
        if (requestType == null) {
            throw new RequestType.UnsupportedRequestTypeException(null);
        }
        int ordinal = requestType.ordinal();
        if (ordinal == 0) {
            return REGISTER;
        }
        if (ordinal == 1) {
            return SIGN;
        }
        throw new RequestType.UnsupportedRequestTypeException(requestType.toString());
    }

    @Override // java.lang.Enum
    @o0
    public String toString() {
        return this.zzb;
    }
}
