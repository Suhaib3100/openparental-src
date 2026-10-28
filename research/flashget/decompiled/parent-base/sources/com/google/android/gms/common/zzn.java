package com.google.android.gms.common;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.internal.common.zzah;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes5.dex */
final class zzn {
    static final zzj[] zza = {zzo.zze, zzo.zzf};
    static final zzah zzb;
    static final zzah zzc;

    static {
        String s4 = ProtectedSandApp.s("찹");
        byte[] zzf = zzj.zzf(s4);
        String s5 = ProtectedSandApp.s("찺");
        byte[] zzf2 = zzj.zzf(s5);
        String s6 = ProtectedSandApp.s("찻");
        zzb = zzah.zzm(zzf, zzf2, zzj.zzf(s6));
        zzc = zzah.zzn(zzj.zzf(s4), zzj.zzf(s5), zzj.zzf(s6), zzj.zzf(ProtectedSandApp.s("찼")), zzj.zzf(ProtectedSandApp.s("창")), zzj.zzf(ProtectedSandApp.s("찾")));
    }
}
