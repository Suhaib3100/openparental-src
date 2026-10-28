package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzaf;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import java.security.MessageDigest;
import java.util.concurrent.Callable;
import x1.b;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@b
/* loaded from: classes2.dex */
final class zzn {
    private static volatile zzaf zze;
    private static Context zzg;
    static final zzl zza = new zzf(zzj.zze(ProtectedSandApp.s("ಛ")));
    static final zzl zzb = new zzg(zzj.zze(ProtectedSandApp.s("ಜ")));
    static final zzl zzc = new zzh(zzj.zze(ProtectedSandApp.s("ಝ")));
    static final zzl zzd = new zzi(zzj.zze(ProtectedSandApp.s("ಞ")));
    private static final Object zzf = new Object();

    static zzx zza(String str, zzj zzjVar, boolean z5, boolean z6) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return zzh(str, zzjVar, z5, z6);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    static zzx zzb(String str, boolean z5, boolean z6, boolean z7) {
        return zzi(str, z5, false, false, true);
    }

    static zzx zzc(String str, boolean z5, boolean z6, boolean z7) {
        return zzi(str, z5, false, false, false);
    }

    static /* synthetic */ String zzd(boolean z5, String str, zzj zzjVar) throws Exception {
        String s5 = true != (!z5 && zzh(str, zzjVar, true, false).zza) ? ProtectedSandApp.s("ಟ") : ProtectedSandApp.s("ಠ");
        MessageDigest zza2 = AndroidUtilsLight.zza(ProtectedSandApp.s("ಡ"));
        Preconditions.checkNotNull(zza2);
        return String.format(ProtectedSandApp.s("ಣ"), s5, str, Hex.bytesToStringLowercase(zza2.digest(zzjVar.zzf())), Boolean.valueOf(z5), ProtectedSandApp.s("ಢ"));
    }

    static synchronized void zze(Context context) {
        synchronized (zzn.class) {
            if (zzg == null) {
                if (context != null) {
                    zzg = context.getApplicationContext();
                }
            }
        }
    }

    static boolean zzf() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            zzj();
            boolean zzg2 = zze.zzg();
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return zzg2;
        } catch (RemoteException | DynamiteModule.LoadingException unused) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return false;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }

    static boolean zzg() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            zzj();
            boolean zzi = zze.zzi();
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return zzi;
        } catch (RemoteException | DynamiteModule.LoadingException unused) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return false;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }

    private static zzx zzh(final String str, final zzj zzjVar, final boolean z5, boolean z6) {
        try {
            zzj();
            Preconditions.checkNotNull(zzg);
            try {
                return zze.zzh(new zzs(str, zzjVar, z5, z6), ObjectWrapper.wrap(zzg.getPackageManager())) ? zzx.zzb() : new zzv(new Callable() { // from class: com.google.android.gms.common.zze
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return zzn.zzd(z5, str, zzjVar);
                    }
                }, null);
            } catch (RemoteException e6) {
                return zzx.zzd(ProtectedSandApp.s("ತ"), e6);
            }
        } catch (DynamiteModule.LoadingException e7) {
            return zzx.zzd(ProtectedSandApp.s("ಥ").concat(String.valueOf(e7.getMessage())), e7);
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [android.os.IBinder, com.google.android.gms.dynamic.IObjectWrapper] */
    private static zzx zzi(String str, boolean z5, boolean z6, boolean z7, boolean z8) {
        zzx zzd2;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            Preconditions.checkNotNull(zzg);
            try {
                zzj();
                zzo zzoVar = new zzo(str, z5, false, ObjectWrapper.wrap(zzg), false);
                try {
                    zzq zze2 = z8 ? zze.zze(zzoVar) : zze.zzf(zzoVar);
                    if (zze2.zzb()) {
                        zzd2 = zzx.zzf(zze2.zzc());
                    } else {
                        String zza2 = zze2.zza();
                        PackageManager.NameNotFoundException nameNotFoundException = zze2.zzd() == 4 ? new PackageManager.NameNotFoundException() : null;
                        String s5 = ProtectedSandApp.s("ದ");
                        if (zza2 == null) {
                            zza2 = s5;
                        }
                        zzd2 = zzx.zzg(zze2.zzc(), zze2.zzd(), zza2, nameNotFoundException);
                    }
                } catch (RemoteException e6) {
                    zzd2 = zzx.zzd(ProtectedSandApp.s("ಧ"), e6);
                }
            } catch (DynamiteModule.LoadingException e7) {
                zzd2 = zzx.zzd(ProtectedSandApp.s("ನ").concat(String.valueOf(e7.getMessage())), e7);
            }
            return zzd2;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    private static void zzj() throws DynamiteModule.LoadingException {
        if (zze != null) {
            return;
        }
        Preconditions.checkNotNull(zzg);
        synchronized (zzf) {
            if (zze == null) {
                zze = com.google.android.gms.common.internal.zzae.zzb(DynamiteModule.load(zzg, DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING, ProtectedSandApp.s("\u0ca9")).instantiate(ProtectedSandApp.s("ಪ")));
            }
        }
    }
}
