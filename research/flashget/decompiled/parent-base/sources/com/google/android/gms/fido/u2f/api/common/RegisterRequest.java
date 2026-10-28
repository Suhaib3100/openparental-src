package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fido.u2f.api.common.ProtocolVersion;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@SafeParcelable.Class(creator = "RegisterRequestCreator")
@Deprecated
/* loaded from: classes5.dex */
public class RegisterRequest extends AbstractSafeParcelable {

    @o0
    public static final Parcelable.Creator<RegisterRequest> CREATOR = new zzg();
    public static final int U2F_V1_CHALLENGE_BYTE_LENGTH = 65;

    @SafeParcelable.VersionField(getter = "getVersionCode", id = 1)
    private final int zza;

    @SafeParcelable.Field(getter = "getProtocolVersionAsString", id = 2, type = "java.lang.String")
    private final ProtocolVersion zzb;

    @SafeParcelable.Field(getter = "getChallengeValue", id = 3)
    private final byte[] zzc;

    @SafeParcelable.Field(getter = "getAppId", id = 4)
    private final String zzd;

    @SafeParcelable.Constructor
    RegisterRequest(@SafeParcelable.Param(id = 1) int i4, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) byte[] bArr, @SafeParcelable.Param(id = 4) String str2) {
        this.zza = i4;
        try {
            this.zzb = ProtocolVersion.fromString(str);
            this.zzc = bArr;
            this.zzd = str2;
        } catch (ProtocolVersion.UnsupportedProtocolException e4) {
            throw new IllegalArgumentException(e4);
        }
    }

    @o0
    public static RegisterRequest parseFromJson(@o0 JSONObject jSONObject) throws JSONException {
        String s4 = ProtectedSandApp.s("췰");
        try {
            ProtocolVersion fromString = ProtocolVersion.fromString(jSONObject.has(s4) ? jSONObject.getString(s4) : null);
            try {
                byte[] decode = Base64.decode(jSONObject.getString(ProtectedSandApp.s("췱")), 8);
                String s5 = ProtectedSandApp.s("췲");
                try {
                    return new RegisterRequest(fromString, decode, jSONObject.has(s5) ? jSONObject.getString(s5) : null);
                } catch (IllegalArgumentException e4) {
                    throw new JSONException(e4.getMessage());
                }
            } catch (IllegalArgumentException e5) {
                throw new JSONException(e5.toString());
            }
        } catch (ProtocolVersion.UnsupportedProtocolException e6) {
            throw new JSONException(e6.toString());
        }
    }

    public boolean equals(@o0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterRequest)) {
            return false;
        }
        RegisterRequest registerRequest = (RegisterRequest) obj;
        if (!Arrays.equals(this.zzc, registerRequest.zzc) || this.zzb != registerRequest.zzb) {
            return false;
        }
        String str = this.zzd;
        if (str == null) {
            if (registerRequest.zzd != null) {
                return false;
            }
        } else if (!str.equals(registerRequest.zzd)) {
            return false;
        }
        return true;
    }

    @o0
    public String getAppId() {
        return this.zzd;
    }

    @o0
    public byte[] getChallengeValue() {
        return this.zzc;
    }

    @o0
    public ProtocolVersion getProtocolVersion() {
        return this.zzb;
    }

    public int getVersionCode() {
        return this.zza;
    }

    public int hashCode() {
        int hashCode = this.zzb.hashCode() + ((Arrays.hashCode(this.zzc) + 31) * 31);
        String str = this.zzd;
        return (hashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    @o0
    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ProtectedSandApp.s("췰"), this.zzb.toString());
            jSONObject.put(ProtectedSandApp.s("췱"), Base64.encodeToString(this.zzc, 11));
            String str = this.zzd;
            if (str != null) {
                jSONObject.put(ProtectedSandApp.s("췲"), str);
            }
            return jSONObject;
        } catch (JSONException e4) {
            throw new RuntimeException(e4);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getVersionCode());
        SafeParcelWriter.writeString(parcel, 2, this.zzb.toString(), false);
        SafeParcelWriter.writeByteArray(parcel, 3, getChallengeValue(), false);
        SafeParcelWriter.writeString(parcel, 4, getAppId(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public RegisterRequest(@o0 ProtocolVersion protocolVersion, @o0 byte[] bArr, @o0 String str) {
        this.zza = 1;
        this.zzb = (ProtocolVersion) Preconditions.checkNotNull(protocolVersion);
        this.zzc = (byte[]) Preconditions.checkNotNull(bArr);
        if (protocolVersion == ProtocolVersion.V1) {
            Preconditions.checkArgument(bArr.length == 65, ProtectedSandApp.s("췯"));
        }
        this.zzd = str;
    }
}
