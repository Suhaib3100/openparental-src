package com.google.android.gms.fido.u2f.api.common;

import androidx.annotation.m1;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@Deprecated
/* loaded from: classes5.dex */
public class Error {

    @o0
    @m1
    public static final String JSON_ERROR_CODE = ProtectedSandApp.s("췖");

    @o0
    @m1
    public static final String JSON_ERROR_MESSAGE = ProtectedSandApp.s("췗");
    private final ErrorCode zza;
    private final String zzb;

    public Error(@o0 ErrorCode errorCode) {
        this.zza = errorCode;
        this.zzb = null;
    }

    @o0
    public ErrorCode getErrorCode() {
        return this.zza;
    }

    @o0
    public String getErrorMessage() {
        return this.zzb;
    }

    @o0
    public JSONObject toJsonObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ProtectedSandApp.s("췖"), this.zza.getCode());
            String str = this.zzb;
            if (str != null) {
                jSONObject.put(ProtectedSandApp.s("췗"), str);
            }
            return jSONObject;
        } catch (JSONException e4) {
            throw new RuntimeException(e4);
        }
    }

    @o0
    public String toString() {
        if (this.zzb == null) {
            return String.format(Locale.ENGLISH, ProtectedSandApp.s("췘"), Integer.valueOf(this.zza.getCode()));
        }
        ErrorCode errorCode = this.zza;
        return String.format(Locale.ENGLISH, ProtectedSandApp.s("췙"), Integer.valueOf(errorCode.getCode()), this.zzb);
    }

    public Error(@o0 ErrorCode errorCode, @o0 String str) {
        this.zza = errorCode;
        this.zzb = str;
    }
}
