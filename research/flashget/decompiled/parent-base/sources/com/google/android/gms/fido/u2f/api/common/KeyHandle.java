package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.u2f.api.common.ProtocolVersion;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@SafeParcelable.Class(creator = "KeyHandleCreator")
@Deprecated
/* loaded from: classes5.dex */
public class KeyHandle extends AbstractSafeParcelable {

    @o0
    public static final Parcelable.Creator<KeyHandle> CREATOR = new zze();

    @SafeParcelable.VersionField(getter = "getVersionCode", id = 1)
    private final int zza;

    @SafeParcelable.Field(getter = "getBytes", id = 2)
    private final byte[] zzb;

    @SafeParcelable.Field(getter = "getProtocolVersionAsString", id = 3, type = "java.lang.String")
    private final ProtocolVersion zzc;

    @q0
    @SafeParcelable.Field(getter = "getTransports", id = 4)
    private final List zzd;

    @SafeParcelable.Constructor
    KeyHandle(@SafeParcelable.Param(id = 1) int i4, @SafeParcelable.Param(id = 2) byte[] bArr, @SafeParcelable.Param(id = 3) String str, @q0 @SafeParcelable.Param(id = 4) List list) {
        this.zza = i4;
        this.zzb = bArr;
        try {
            this.zzc = ProtocolVersion.fromString(str);
            this.zzd = list;
        } catch (ProtocolVersion.UnsupportedProtocolException e4) {
            throw new IllegalArgumentException(e4);
        }
    }

    @o0
    public static KeyHandle parseFromJson(@o0 JSONObject jSONObject) throws JSONException {
        String s4 = ProtectedSandApp.s("췣");
        try {
            ProtocolVersion fromString = ProtocolVersion.fromString(jSONObject.has(s4) ? jSONObject.getString(s4) : null);
            try {
                byte[] decode = Base64.decode(jSONObject.getString(ProtectedSandApp.s("췤")), 8);
                String s5 = ProtectedSandApp.s("췥");
                return new KeyHandle(decode, fromString, jSONObject.has(s5) ? Transport.parseTransports(jSONObject.getJSONArray(s5)) : null);
            } catch (IllegalArgumentException e4) {
                throw new JSONException(e4.toString());
            }
        } catch (ProtocolVersion.UnsupportedProtocolException e5) {
            throw new JSONException(e5.toString());
        }
    }

    public boolean equals(@o0 Object obj) {
        List list;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyHandle)) {
            return false;
        }
        KeyHandle keyHandle = (KeyHandle) obj;
        if (!Arrays.equals(this.zzb, keyHandle.zzb) || !this.zzc.equals(keyHandle.zzc)) {
            return false;
        }
        List list2 = this.zzd;
        if (list2 == null && keyHandle.zzd == null) {
            return true;
        }
        return list2 != null && (list = keyHandle.zzd) != null && list2.containsAll(list) && keyHandle.zzd.containsAll(this.zzd);
    }

    @o0
    public byte[] getBytes() {
        return this.zzb;
    }

    @o0
    public ProtocolVersion getProtocolVersion() {
        return this.zzc;
    }

    @o0
    public List<Transport> getTransports() {
        return this.zzd;
    }

    public int getVersionCode() {
        return this.zza;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(Arrays.hashCode(this.zzb)), this.zzc, this.zzd);
    }

    @o0
    public JSONObject toJson() {
        return zza();
    }

    @o0
    public String toString() {
        List list = this.zzd;
        return String.format(ProtectedSandApp.s("췧"), Base64Utils.encode(this.zzb), this.zzc, list == null ? ProtectedSandApp.s("췦") : list.toString());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getVersionCode());
        SafeParcelWriter.writeByteArray(parcel, 2, getBytes(), false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc.toString(), false);
        SafeParcelWriter.writeTypedList(parcel, 4, getTransports(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @o0
    public final JSONObject zza() {
        JSONObject jSONObject = new JSONObject();
        try {
            byte[] bArr = this.zzb;
            if (bArr != null) {
                jSONObject.put(ProtectedSandApp.s("췤"), Base64.encodeToString(bArr, 11));
            }
            ProtocolVersion protocolVersion = this.zzc;
            if (protocolVersion != null) {
                jSONObject.put(ProtectedSandApp.s("췣"), protocolVersion.toString());
            }
            if (this.zzd != null) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = this.zzd.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((Transport) it.next()).toString());
                }
                jSONObject.put(ProtectedSandApp.s("췥"), jSONArray);
            }
            return jSONObject;
        } catch (JSONException e4) {
            throw new RuntimeException(e4);
        }
    }

    public KeyHandle(@o0 byte[] bArr, @o0 ProtocolVersion protocolVersion, @q0 List<Transport> list) {
        this.zza = 1;
        this.zzb = bArr;
        this.zzc = protocolVersion;
        this.zzd = list;
    }
}
