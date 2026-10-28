package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import androidx.annotation.m1;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import java.security.MessageDigest;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes5.dex */
final class zzo {

    @m1(otherwise = 2)
    static volatile com.google.android.gms.common.internal.zzad zzg;
    public static final /* synthetic */ int zzh = 0;

    @q0
    private static Context zzj;
    static final zzm zza = new zzd(zzj.zzf(ProtectedSandApp.s("찿")));
    static final zzm zzb = new zze(zzj.zzf(ProtectedSandApp.s("챀")));
    static final zzm zzc = new zzf(zzj.zzf(ProtectedSandApp.s("챁")));
    static final zzm zzd = new zzg(zzj.zzf(ProtectedSandApp.s("챂")));
    static final zzm zze = new zzh(zzj.zzf(ProtectedSandApp.s("챃")));
    static final zzm zzf = new zzi(zzj.zzf(ProtectedSandApp.s("채")));
    private static final Object zzi = new Object();

    static synchronized void zza(Context context) {
        synchronized (zzo.class) {
            if (zzj == null) {
                if (context != null) {
                    zzj = context.getApplicationContext();
                }
            }
        }
    }

    @m1(otherwise = 2)
    static void zzb() throws DynamiteModule.LoadingException {
        if (zzg != null) {
            return;
        }
        Preconditions.checkNotNull(zzj);
        synchronized (zzi) {
            try {
                if (zzg == null) {
                    zzg = com.google.android.gms.common.internal.zzac.zzb(DynamiteModule.load(zzj, DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING, ProtectedSandApp.s("책")).instantiate(ProtectedSandApp.s("챆")));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static zzy zzc(zzw zzwVar) {
        zzy zzd2;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            String s4 = ProtectedSandApp.s("챇");
            Preconditions.checkNotNull(zzj);
            try {
                zzb();
                Preconditions.checkNotNull(zzj);
                zzp zzb2 = zzwVar.zzb(zzj);
                try {
                    zzr zzf2 = zzwVar.zza() ? zzg.zzf(zzb2) : zzg.zzh(zzb2);
                    if (zzf2.zza()) {
                        zzd2 = zzy.zzf(zzf2.zze(), zzf2.zzc());
                    } else {
                        String zzb3 = zzf2.zzb();
                        PackageManager.NameNotFoundException nameNotFoundException = zzf2.zzd() == 4 ? new PackageManager.NameNotFoundException() : null;
                        String s5 = ProtectedSandApp.s("챈");
                        if (zzb3 == null) {
                            zzb3 = s5;
                        }
                        zzd2 = zzy.zzg(zzf2.zze(), zzf2.zzd(), zzb3, nameNotFoundException);
                    }
                } catch (RemoteException e4) {
                    zzd2 = zzy.zzd(ProtectedSandApp.s("챉"), e4);
                }
            } catch (DynamiteModule.LoadingException e5) {
                zzd2 = zzy.zzd(s4.concat(String.valueOf(e5.getMessage())), e5);
            }
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return zzd2;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }

    @Deprecated
    static zzy zzd(String str, zzj zzjVar, boolean z4, boolean z5) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return zzf(str, zzjVar, z4, z5);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    static /* synthetic */ String zze(boolean z4, String str, zzj zzjVar) {
        String s4 = (z4 || !zzf(str, zzjVar, true, false).zza) ? ProtectedSandApp.s("챋") : ProtectedSandApp.s("챊");
        MessageDigest zza2 = AndroidUtilsLight.zza(ProtectedSandApp.s("챌"));
        Preconditions.checkNotNull(zza2);
        return String.format(ProtectedSandApp.s("챎"), s4, str, Hex.bytesToStringLowercase(zza2.digest(zzjVar.zzc())), Boolean.valueOf(z4), ProtectedSandApp.s("챍"));
    }

    @Deprecated
    private static zzy zzf(final String str, final zzj zzjVar, final boolean z4, boolean z5) {
        try {
            zzb();
            Preconditions.checkNotNull(zzj);
            try {
                return zzg.zze(new zzt(str, zzjVar, z4, z5), ObjectWrapper.wrap(zzj.getPackageManager())) ? zzy.zzb() : new zzx(new Callable() { // from class: com.google.android.gms.common.zzl
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        return zzo.zze(z4, str, zzjVar);
                    }
                }, null);
            } catch (RemoteException e4) {
                return zzy.zzd(ProtectedSandApp.s("챉"), e4);
            }
        } catch (DynamiteModule.LoadingException e5) {
            return zzy.zzd(ProtectedSandApp.s("챇").concat(String.valueOf(e5.getMessage())), e5);
        }
    }
}
