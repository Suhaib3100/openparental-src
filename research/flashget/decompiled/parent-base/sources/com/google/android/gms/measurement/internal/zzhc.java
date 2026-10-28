package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.annotation.n1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzpn;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes5.dex */
public final class zzhc {
    private final String zza;
    private final Bundle zzb;
    private Bundle zzc;
    private final /* synthetic */ zzha zzd;

    public zzhc(zzha zzhaVar, String str, Bundle bundle) {
        this.zzd = zzhaVar;
        Preconditions.checkNotEmpty(str);
        this.zza = str;
        if (zzhaVar.zze().zza(zzbh.zzdk)) {
            this.zzb = new Bundle();
        } else {
            this.zzb = new Bundle();
        }
    }

    private final String zzb(Bundle bundle) {
        JSONArray jSONArray = new JSONArray();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(ProtectedSandApp.s("\udeb5"), str);
                    boolean zza = zzpn.zza();
                    String s4 = ProtectedSandApp.s("\udeb6");
                    String s5 = ProtectedSandApp.s("\udeb7");
                    String s6 = ProtectedSandApp.s("\udeb8");
                    String s7 = ProtectedSandApp.s("\udeb9");
                    String s10 = ProtectedSandApp.s("\udeba");
                    String s11 = ProtectedSandApp.s("\udebb");
                    if (!zza || !this.zzd.zze().zza(zzbh.zzci)) {
                        jSONObject.put(s10, String.valueOf(obj));
                        if (obj instanceof String) {
                            jSONObject.put(s11, s7);
                        } else if (obj instanceof Long) {
                            jSONObject.put(s11, s6);
                        } else if (obj instanceof Double) {
                            jSONObject.put(s11, s5);
                        } else {
                            this.zzd.zzj().zzg().zza(s4, obj.getClass());
                        }
                    } else if (obj instanceof String) {
                        jSONObject.put(s10, String.valueOf(obj));
                        jSONObject.put(s11, s7);
                    } else if (obj instanceof Long) {
                        jSONObject.put(s10, String.valueOf(obj));
                        jSONObject.put(s11, s6);
                    } else if (obj instanceof int[]) {
                        jSONObject.put(s10, Arrays.toString((int[]) obj));
                        jSONObject.put(s11, ProtectedSandApp.s("\udebc"));
                    } else if (obj instanceof long[]) {
                        jSONObject.put(s10, Arrays.toString((long[]) obj));
                        jSONObject.put(s11, ProtectedSandApp.s("\udebd"));
                    } else if (obj instanceof Double) {
                        jSONObject.put(s10, String.valueOf(obj));
                        jSONObject.put(s11, s5);
                    } else {
                        this.zzd.zzj().zzg().zza(s4, obj.getClass());
                    }
                    jSONArray.put(jSONObject);
                } catch (JSONException e4) {
                    this.zzd.zzj().zzg().zza(ProtectedSandApp.s("\udebe"), e4);
                }
            }
        }
        return jSONArray.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0144 A[Catch: NumberFormatException | JSONException -> 0x014c, NumberFormatException | JSONException -> 0x014c, TRY_LEAVE, TryCatch #1 {NumberFormatException | JSONException -> 0x014c, blocks: (B:13:0x0025, B:31:0x00b1, B:31:0x00b1, B:34:0x00c6, B:34:0x00c6, B:36:0x00cc, B:36:0x00cc, B:38:0x00da, B:38:0x00da, B:40:0x00ec, B:40:0x00ec, B:42:0x00f5, B:42:0x00f5, B:46:0x00f9, B:46:0x00f9, B:48:0x00ff, B:48:0x00ff, B:50:0x010d, B:50:0x010d, B:52:0x011f, B:52:0x011f, B:54:0x0128, B:54:0x0128, B:58:0x012c, B:58:0x012c, B:60:0x0138, B:60:0x0138, B:62:0x0144, B:62:0x0144, B:64:0x005a, B:67:0x0068, B:70:0x0076, B:73:0x0084, B:76:0x0092), top: B:12:0x0025, outer: #0 }] */
    @androidx.annotation.n1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Bundle zza() {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzhc.zza():android.os.Bundle");
    }

    @n1
    public final void zza(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        } else if (this.zzd.zze().zza(zzbh.zzdk)) {
            bundle = new Bundle(bundle);
        }
        SharedPreferences.Editor edit = this.zzd.zzg().edit();
        if (bundle.size() == 0) {
            edit.remove(this.zza);
        } else {
            edit.putString(this.zza, zzb(bundle));
        }
        edit.apply();
        this.zzc = bundle;
    }
}
