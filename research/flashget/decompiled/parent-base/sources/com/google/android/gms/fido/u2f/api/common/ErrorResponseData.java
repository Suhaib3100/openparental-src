package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.fido.zzbi;
import com.google.android.gms.internal.fido.zzbj;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@SafeParcelable.Class(creator = "ErrorResponseDataCreator")
@SafeParcelable.Reserved({1})
@Deprecated
/* loaded from: classes5.dex */
public class ErrorResponseData extends ResponseData {

    @SafeParcelable.Field(getter = "getErrorCodeAsInt", id = 2, type = "int")
    private final ErrorCode zza;

    @SafeParcelable.Field(getter = "getErrorMessage", id = 3)
    private final String zzb;

    @o0
    @m1
    public static final String JSON_ERROR_CODE = ProtectedSandApp.s("췡");

    @o0
    @m1
    public static final String JSON_ERROR_MESSAGE = ProtectedSandApp.s("췢");

    @o0
    public static final Parcelable.Creator<ErrorResponseData> CREATOR = new zzd();

    @SafeParcelable.Constructor
    ErrorResponseData(@SafeParcelable.Param(id = 2) int i4, @SafeParcelable.Param(id = 3) String str) {
        this.zza = ErrorCode.toErrorCode(i4);
        this.zzb = str;
    }

    public boolean equals(@q0 Object obj) {
        if (!(obj instanceof ErrorResponseData)) {
            return false;
        }
        ErrorResponseData errorResponseData = (ErrorResponseData) obj;
        return Objects.equal(this.zza, errorResponseData.zza) && Objects.equal(this.zzb, errorResponseData.zzb);
    }

    @o0
    public ErrorCode getErrorCode() {
        return this.zza;
    }

    public int getErrorCodeAsInt() {
        return this.zza.getCode();
    }

    @o0
    public String getErrorMessage() {
        return this.zzb;
    }

    public int hashCode() {
        return Objects.hashCode(this.zza, this.zzb);
    }

    @Override // com.google.android.gms.fido.u2f.api.common.ResponseData
    @o0
    public final JSONObject toJsonObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ProtectedSandApp.s("췡"), this.zza.getCode());
            String str = this.zzb;
            if (str != null) {
                jSONObject.put(ProtectedSandApp.s("췢"), str);
            }
            return jSONObject;
        } catch (JSONException e4) {
            throw new RuntimeException(e4);
        }
    }

    @o0
    public String toString() {
        zzbi zza = zzbj.zza(this);
        zza.zza(ProtectedSandApp.s("췡"), this.zza.getCode());
        String str = this.zzb;
        if (str != null) {
            zza.zzb(ProtectedSandApp.s("췢"), str);
        }
        return zza.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, getErrorCodeAsInt());
        SafeParcelWriter.writeString(parcel, 3, getErrorMessage(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public ErrorResponseData(@o0 ErrorCode errorCode) {
        this.zza = (ErrorCode) Preconditions.checkNotNull(errorCode);
        this.zzb = null;
    }

    public ErrorResponseData(@o0 ErrorCode errorCode, @o0 String str) {
        this.zza = (ErrorCode) Preconditions.checkNotNull(errorCode);
        this.zzb = str;
    }
}
