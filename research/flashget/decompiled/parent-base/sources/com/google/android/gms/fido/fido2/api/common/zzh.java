package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.d;
import android.util.Base64;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.fido.zzgx;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@SafeParcelable.Class(creator = "AuthenticationExtensionsPrfOutputsCreator")
/* loaded from: classes5.dex */
public final class zzh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzh> CREATOR = new zzi();

    @SafeParcelable.Field(getter = "getSupported", id = 1)
    private final boolean zza;

    @q0
    @SafeParcelable.Field(getter = "getOutputs", id = 2, type = "byte[]")
    private final zzgx zzb;

    public zzh(boolean z4, @q0 zzgx zzgxVar) {
        this.zza = z4;
        this.zzb = zzgxVar;
    }

    public final boolean equals(@q0 Object obj) {
        if (!(obj instanceof zzh)) {
            return false;
        }
        zzh zzhVar = (zzh) obj;
        return this.zza == zzhVar.zza && Objects.equal(this.zzb, zzhVar.zzb);
    }

    public final int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.zza), this.zzb);
    }

    public final String toString() {
        return d.a(ProtectedSandApp.s("춽"), zza().toString(), ProtectedSandApp.s("춾"));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@o0 Parcel parcel, int i4) {
        boolean z4 = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, z4);
        SafeParcelWriter.writeByteArray(parcel, 2, zzb(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final JSONObject zza() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.zza) {
                jSONObject.put(ProtectedSandApp.s("춿"), true);
            }
            byte[] zzb = zzb();
            if (zzb != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(ProtectedSandApp.s("췀"), Base64.encodeToString(Arrays.copyOf(zzb, 32), 11));
                if (zzb.length == 64) {
                    jSONObject2.put(ProtectedSandApp.s("췁"), Base64.encodeToString(Arrays.copyOfRange(zzb, 32, 64), 11));
                }
                jSONObject.put(ProtectedSandApp.s("췂"), jSONObject2);
            }
            return jSONObject;
        } catch (JSONException e4) {
            throw new RuntimeException(ProtectedSandApp.s("췃"), e4);
        }
    }

    @q0
    public final byte[] zzb() {
        zzgx zzgxVar = this.zzb;
        if (zzgxVar == null) {
            return null;
        }
        return zzgxVar.zzm();
    }
}
