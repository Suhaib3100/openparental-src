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
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@SafeParcelable.Class(creator = "RegisteredKeyCreator")
@SafeParcelable.Reserved({1})
@Deprecated
/* loaded from: classes5.dex */
public class RegisteredKey extends AbstractSafeParcelable {

    @o0
    public static final Parcelable.Creator<RegisteredKey> CREATOR = new zzj();

    @SafeParcelable.Field(getter = "getChallengeValue", id = 3)
    String zza;

    @SafeParcelable.Field(getter = "getKeyHandle", id = 2)
    private final KeyHandle zzb;

    @SafeParcelable.Field(getter = "getAppId", id = 4)
    private final String zzc;

    public RegisteredKey(@o0 KeyHandle keyHandle) {
        this(keyHandle, null, null);
    }

    @o0
    public static RegisteredKey parseFromJson(@o0 JSONObject jSONObject) throws JSONException {
        String s4 = ProtectedSandApp.s("췽");
        String string = jSONObject.has(s4) ? jSONObject.getString(s4) : null;
        KeyHandle parseFromJson = KeyHandle.parseFromJson(jSONObject);
        String s5 = ProtectedSandApp.s("췾");
        return new RegisteredKey(parseFromJson, string, jSONObject.has(s5) ? jSONObject.getString(s5) : null);
    }

    public boolean equals(@o0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisteredKey)) {
            return false;
        }
        RegisteredKey registeredKey = (RegisteredKey) obj;
        String str = this.zza;
        if (str == null) {
            if (registeredKey.zza != null) {
                return false;
            }
        } else if (!str.equals(registeredKey.zza)) {
            return false;
        }
        if (!this.zzb.equals(registeredKey.zzb)) {
            return false;
        }
        String str2 = this.zzc;
        if (str2 == null) {
            if (registeredKey.zzc != null) {
                return false;
            }
        } else if (!str2.equals(registeredKey.zzc)) {
            return false;
        }
        return true;
    }

    @o0
    public String getAppId() {
        return this.zzc;
    }

    @o0
    public String getChallengeValue() {
        return this.zza;
    }

    @o0
    public KeyHandle getKeyHandle() {
        return this.zzb;
    }

    public int hashCode() {
        String str = this.zza;
        int hashCode = this.zzb.hashCode() + (((str == null ? 0 : str.hashCode()) + 31) * 31);
        String str2 = this.zzc;
        return (hashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    @o0
    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.zza;
            if (str != null) {
                jSONObject.put(ProtectedSandApp.s("췽"), str);
            }
            JSONObject zza = this.zzb.zza();
            Iterator<String> keys = zza.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject.put(next, zza.get(next));
            }
            String str2 = this.zzc;
            if (str2 != null) {
                jSONObject.put(ProtectedSandApp.s("췾"), str2);
            }
            return jSONObject;
        } catch (JSONException e4) {
            throw new RuntimeException(e4);
        }
    }

    @o0
    public String toString() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(ProtectedSandApp.s("췿"), Base64.encodeToString(this.zzb.getBytes(), 11));
            if (this.zzb.getProtocolVersion() != ProtocolVersion.UNKNOWN) {
                jSONObject.put(ProtectedSandApp.s("츀"), this.zzb.getProtocolVersion().toString());
            }
            if (this.zzb.getTransports() != null) {
                jSONObject.put(ProtectedSandApp.s("츁"), this.zzb.getTransports().toString());
            }
            String str = this.zza;
            if (str != null) {
                jSONObject.put(ProtectedSandApp.s("췽"), str);
            }
            String str2 = this.zzc;
            if (str2 != null) {
                jSONObject.put(ProtectedSandApp.s("췾"), str2);
            }
            return jSONObject.toString();
        } catch (JSONException e4) {
            throw new RuntimeException(e4);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, getKeyHandle(), i4, false);
        SafeParcelWriter.writeString(parcel, 3, getChallengeValue(), false);
        SafeParcelWriter.writeString(parcel, 4, getAppId(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public RegisteredKey(@SafeParcelable.Param(id = 2) @o0 KeyHandle keyHandle, @SafeParcelable.Param(id = 3) @o0 String str, @SafeParcelable.Param(id = 4) @o0 String str2) {
        this.zzb = (KeyHandle) Preconditions.checkNotNull(keyHandle);
        this.zza = str;
        this.zzc = str2;
    }
}
