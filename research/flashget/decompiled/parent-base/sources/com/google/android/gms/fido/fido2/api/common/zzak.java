package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.d;
import android.util.Base64;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.internal.fido.zzfv;
import com.google.android.gms.internal.fido.zzfx;
import com.google.android.gms.internal.fido.zzgj;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@SafeParcelable.Class(creator = "PrfExtensionCreator")
/* loaded from: classes5.dex */
public final class zzak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzak> CREATOR = new zzal();
    private static final byte[] zza = ProtectedSandApp.s("춲").getBytes(StandardCharsets.UTF_8);

    @SafeParcelable.Field(getter = "getEvaluationPoints", id = 1)
    private final byte[][] zzb;

    @SafeParcelable.Constructor
    public zzak(@SafeParcelable.Param(id = 1) byte[][] bArr) {
        Preconditions.checkArgument(bArr != null);
        Preconditions.checkArgument(1 == ((bArr.length & 1) ^ 1));
        int i4 = 0;
        while (i4 < bArr.length) {
            Preconditions.checkArgument(i4 == 0 || bArr[i4] != null);
            int i5 = i4 + 1;
            Preconditions.checkArgument(bArr[i5] != null);
            int length = bArr[i5].length;
            Preconditions.checkArgument(length == 32 || length == 64);
            i4 += 2;
        }
        this.zzb = bArr;
    }

    public static zzak zza(JSONObject jSONObject, boolean z4) throws JSONException {
        String s4 = ProtectedSandApp.s("춳");
        String s5 = ProtectedSandApp.s("춴");
        ArrayList arrayList = new ArrayList();
        try {
            if (jSONObject.has(s5)) {
                arrayList.add(null);
                if (z4) {
                    arrayList.add(zzd(jSONObject.getJSONObject(s5)));
                } else {
                    arrayList.add(zze(jSONObject.getJSONObject(s5)));
                }
            }
            if (jSONObject.has(s4)) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(s4);
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    arrayList.add(Base64Utils.decodeUrlSafeNoPadding(next));
                    if (z4) {
                        arrayList.add(zzd(jSONObject2.getJSONObject(next)));
                    } else {
                        arrayList.add(zze(jSONObject2.getJSONObject(next)));
                    }
                }
            }
            return new zzak((byte[][]) arrayList.toArray(new byte[0][]));
        } catch (IllegalArgumentException unused) {
            throw new JSONException(ProtectedSandApp.s("춵"));
        }
    }

    private static JSONObject zzb(byte[] bArr) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        int length = bArr.length;
        String s4 = ProtectedSandApp.s("춶");
        if (length == 32) {
            jSONObject.put(s4, Base64Utils.encodeUrlSafeNoPadding(bArr));
        } else {
            jSONObject.put(s4, Base64.encodeToString(bArr, 0, 32, 11));
            jSONObject.put(ProtectedSandApp.s("춷"), Base64.encodeToString(bArr, 32, 32, 11));
        }
        return jSONObject;
    }

    private static byte[] zzc(byte[] bArr) {
        zzfv zza2 = zzfx.zza().zza();
        zza2.zza(zza);
        zza2.zza(bArr);
        return zza2.zzc().zzd();
    }

    private static byte[] zzd(JSONObject jSONObject) throws JSONException {
        byte[] decodeUrlSafeNoPadding = Base64Utils.decodeUrlSafeNoPadding(jSONObject.getString(ProtectedSandApp.s("춶")));
        int length = decodeUrlSafeNoPadding.length;
        String s4 = ProtectedSandApp.s("춸");
        if (length != 32) {
            throw new JSONException(s4);
        }
        String s5 = ProtectedSandApp.s("춷");
        if (!jSONObject.has(s5)) {
            return decodeUrlSafeNoPadding;
        }
        byte[] decodeUrlSafeNoPadding2 = Base64Utils.decodeUrlSafeNoPadding(jSONObject.getString(s5));
        if (decodeUrlSafeNoPadding2.length == 32) {
            return zzgj.zza(decodeUrlSafeNoPadding, decodeUrlSafeNoPadding2);
        }
        throw new JSONException(s4);
    }

    private static byte[] zze(JSONObject jSONObject) throws JSONException {
        byte[] zzc = zzc(Base64Utils.decodeUrlSafeNoPadding(jSONObject.getString(ProtectedSandApp.s("춶"))));
        String s4 = ProtectedSandApp.s("춷");
        return !jSONObject.has(s4) ? zzc : zzgj.zza(zzc, zzc(Base64Utils.decodeUrlSafeNoPadding(jSONObject.getString(s4))));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzak) {
            return Arrays.deepEquals(this.zzb, ((zzak) obj).zzb);
        }
        return false;
    }

    public final int hashCode() {
        int i4 = 0;
        for (byte[] bArr : this.zzb) {
            if (bArr != null) {
                i4 ^= Objects.hashCode(bArr);
            }
        }
        return i4;
    }

    public final String toString() {
        String s4 = ProtectedSandApp.s("춹");
        try {
            JSONObject jSONObject = new JSONObject();
            int i4 = 0;
            JSONObject jSONObject2 = null;
            while (true) {
                byte[][] bArr = this.zzb;
                if (i4 >= bArr.length) {
                    return ProtectedSandApp.s("춺") + jSONObject.toString() + s4;
                }
                if (bArr[i4] == null) {
                    jSONObject.put(ProtectedSandApp.s("춴"), zzb(bArr[i4 + 1]));
                } else {
                    if (jSONObject2 == null) {
                        jSONObject2 = new JSONObject();
                        jSONObject.put(ProtectedSandApp.s("춳"), jSONObject2);
                    }
                    jSONObject2.put(Base64Utils.encodeUrlSafeNoPadding(this.zzb[i4]), zzb(this.zzb[i4 + 1]));
                }
                i4 += 2;
            }
        } catch (JSONException e4) {
            return d.a(ProtectedSandApp.s("춻"), e4.getMessage(), s4);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        byte[][] bArr = this.zzb;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArrayArray(parcel, 1, bArr, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
