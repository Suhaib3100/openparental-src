package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fido.u2f.api.common.ProtocolVersion;
import com.google.android.gms.internal.fido.zzbi;
import com.google.android.gms.internal.fido.zzbj;
import com.google.android.gms.internal.fido.zzgf;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@SafeParcelable.Class(creator = "RegisterResponseDataCreator")
@SafeParcelable.Reserved({1})
@Deprecated
/* loaded from: classes5.dex */
public class RegisterResponseData extends ResponseData {

    @o0
    public static final Parcelable.Creator<RegisterResponseData> CREATOR = new zzi();

    @SafeParcelable.Field(getter = "getRegisterData", id = 2)
    private final byte[] zza;

    @SafeParcelable.Field(getter = "getProtocolVersionAsString", id = 3, type = "java.lang.String")
    private final ProtocolVersion zzb;

    @q0
    @SafeParcelable.Field(getter = "getClientDataString", id = 4)
    private final String zzc;

    public RegisterResponseData(@o0 byte[] bArr) {
        this.zza = (byte[]) Preconditions.checkNotNull(bArr);
        this.zzb = ProtocolVersion.V1;
        this.zzc = null;
    }

    public boolean equals(@q0 Object obj) {
        if (!(obj instanceof RegisterResponseData)) {
            return false;
        }
        RegisterResponseData registerResponseData = (RegisterResponseData) obj;
        return Objects.equal(this.zzb, registerResponseData.zzb) && Arrays.equals(this.zza, registerResponseData.zza) && Objects.equal(this.zzc, registerResponseData.zzc);
    }

    @o0
    public String getClientDataString() {
        return this.zzc;
    }

    @o0
    public ProtocolVersion getProtocolVersion() {
        return this.zzb;
    }

    @o0
    public byte[] getRegisterData() {
        return this.zza;
    }

    public int getVersionCode() {
        ProtocolVersion protocolVersion = ProtocolVersion.UNKNOWN;
        int ordinal = this.zzb.ordinal();
        int i4 = 1;
        if (ordinal != 1) {
            i4 = 2;
            if (ordinal != 2) {
                return -1;
            }
        }
        return i4;
    }

    public int hashCode() {
        return Objects.hashCode(this.zzb, Integer.valueOf(Arrays.hashCode(this.zza)), this.zzc);
    }

    @Override // com.google.android.gms.fido.u2f.api.common.ResponseData
    @o0
    public JSONObject toJsonObject() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(ProtectedSandApp.s("췷"), Base64.encodeToString(this.zza, 11));
            jSONObject.put(ProtectedSandApp.s("췸"), this.zzb.toString());
            String str = this.zzc;
            if (str != null) {
                jSONObject.put(ProtectedSandApp.s("췹"), Base64.encodeToString(str.getBytes(), 11));
            }
            return jSONObject;
        } catch (JSONException e4) {
            throw new RuntimeException(e4);
        }
    }

    @o0
    public String toString() {
        zzbi zza = zzbj.zza(this);
        zza.zzb(ProtectedSandApp.s("췺"), this.zzb);
        zzgf zzf = zzgf.zzf();
        byte[] bArr = this.zza;
        zza.zzb(ProtectedSandApp.s("췻"), zzf.zzg(bArr, 0, bArr.length));
        String str = this.zzc;
        if (str != null) {
            zza.zzb(ProtectedSandApp.s("췼"), str);
        }
        return zza.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 2, getRegisterData(), false);
        SafeParcelWriter.writeString(parcel, 3, this.zzb.toString(), false);
        SafeParcelWriter.writeString(parcel, 4, getClientDataString(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public RegisterResponseData(@o0 byte[] bArr, @o0 ProtocolVersion protocolVersion, @q0 String str) {
        this.zza = (byte[]) Preconditions.checkNotNull(bArr);
        this.zzb = (ProtocolVersion) Preconditions.checkNotNull(protocolVersion);
        Preconditions.checkArgument(protocolVersion != ProtocolVersion.UNKNOWN);
        if (protocolVersion == ProtocolVersion.V1) {
            Preconditions.checkArgument(str == null);
            this.zzc = null;
        } else {
            this.zzc = (String) Preconditions.checkNotNull(str);
        }
    }

    @SafeParcelable.Constructor
    RegisterResponseData(@SafeParcelable.Param(id = 2) byte[] bArr, @SafeParcelable.Param(id = 3) String str, @q0 @SafeParcelable.Param(id = 4) String str2) {
        this.zza = bArr;
        try {
            this.zzb = ProtocolVersion.fromString(str);
            this.zzc = str2;
        } catch (ProtocolVersion.UnsupportedProtocolException e4) {
            throw new IllegalArgumentException(e4);
        }
    }
}
