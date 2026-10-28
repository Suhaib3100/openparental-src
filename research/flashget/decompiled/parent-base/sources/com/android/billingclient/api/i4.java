package com.android.billingclient.api;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.internal.play_billing.zzbo;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzjj;
import com.google.android.gms.internal.play_billing.zzjl;
import com.google.android.gms.internal.play_billing.zzjn;
import com.google.android.gms.internal.play_billing.zzjp;
import com.google.android.gms.internal.play_billing.zzjq;
import com.google.android.gms.internal.play_billing.zzjs;
import com.google.android.gms.internal.play_billing.zzju;
import com.google.android.gms.internal.play_billing.zzjz;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i4 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f40395a = 0;

    static {
        int i4 = j4.f40440a;
    }

    @androidx.annotation.q0
    public static String a(Exception exc) {
        if (exc == null) {
            return null;
        }
        try {
            String str = exc.getClass().getSimpleName() + ProtectedSandApp.s("ұ") + zzbo.zzc(exc.getMessage());
            int i4 = zzc.zza;
            return str.length() > 40 ? str.substring(0, 40) : str;
        } catch (Throwable th) {
            zzc.zzo(ProtectedSandApp.s("Ҳ"), ProtectedSandApp.s("ҳ"), th);
            return null;
        }
    }

    @androidx.annotation.q0
    public static zzjl b(@androidx.annotation.q0 zzjs zzjsVar, int i4, y yVar, @androidx.annotation.q0 String str, zzjz zzjzVar) {
        try {
            zzjq zza = zzju.zza();
            zza.zzp(yVar.c());
            zza.zzb(yVar.a());
            if (yVar.b() != 0) {
                zza.zzd(yVar.b());
            }
            if (zzjsVar != null) {
                zza.zze(zzjsVar);
            }
            if (str != null) {
                zza.zza(str);
            }
            zzjj zza2 = zzjl.zza();
            zza2.zzb(zza);
            zza2.zzp(i4);
            if (!zzjzVar.equals(zzjz.zza)) {
                zza2.zza(zzjzVar);
            }
            return (zzjl) zza2.zzi();
        } catch (Throwable th) {
            zzc.zzo(ProtectedSandApp.s("Ҳ"), ProtectedSandApp.s("Ҵ"), th);
            return null;
        }
    }

    @androidx.annotation.q0
    public static zzjp c(int i4, zzjz zzjzVar) {
        try {
            zzjn zza = zzjp.zza();
            zza.zze(i4);
            if (!zzjzVar.equals(zzjz.zza)) {
                zza.zza(zzjzVar);
            }
            return (zzjp) zza.zzi();
        } catch (Exception e4) {
            zzc.zzo(ProtectedSandApp.s("Ҳ"), ProtectedSandApp.s("Ҵ"), e4);
            return null;
        }
    }
}
