package com.google.android.gms.common;

import android.content.Context;
import android.os.RemoteException;
import android.os.StrictMode;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.signatureverification.SignatureVerificationConfigurationProvider;
import com.google.android.gms.dynamite.DynamiteModule;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
@ShowFirstParty
@KeepForSdk
/* loaded from: classes5.dex */
public class PackageSignatureVerifier {

    @q0
    @m1
    static volatile zzac zza;

    @q0
    private static zzad zzb;

    private static synchronized zzad zza(Context context) {
        zzad zzadVar;
        synchronized (PackageSignatureVerifier.class) {
            try {
                if (zzb == null) {
                    zzb = new zzad(context);
                }
                zzadVar = zzb;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzadVar;
    }

    @ShowFirstParty
    @o0
    @KeepForSdk
    public PackageVerificationResult queryPackageSignatureVerified(@o0 Context context, @o0 String str) {
        boolean honorsDebugCertificates = GooglePlayServicesUtilLight.honorsDebugCertificates(context);
        zza(context);
        int i4 = zzo.zzh;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            zzo.zzb();
            if (zzo.zzg.zzi()) {
                SignatureVerificationConfigurationProvider.zza().zza();
                String concat = String.valueOf(str).concat(true != honorsDebugCertificates ? ProtectedSandApp.s("즏") : ProtectedSandApp.s("즐"));
                if (zza != null && zza.zza().equals(concat)) {
                    return zza.zzb();
                }
                str.getClass();
                zza(context);
                zzv zzvVar = new zzv(null);
                zzvVar.zza(str);
                zzvVar.zzb(honorsDebugCertificates);
                zzvVar.zzc(false);
                zzy zzc = zzo.zzc(zzvVar.zzd());
                if (zzc.zza) {
                    PackageVerificationResult zzd = PackageVerificationResult.zzd(str, zzc.zzd, null);
                    zza = new zzac(concat, zzd);
                    return zzd;
                }
                String str2 = zzc.zzb;
                Preconditions.checkNotNull(str2);
                return PackageVerificationResult.zza(str, str2, zzc.zzc, null);
            }
        } catch (RemoteException | DynamiteModule.LoadingException unused) {
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
        throw new zzae();
    }

    @ShowFirstParty
    @o0
    @KeepForSdk
    public PackageVerificationResult queryPackageSignatureVerifiedWithRetry(@o0 Context context, @o0 String str) {
        try {
            PackageVerificationResult queryPackageSignatureVerified = queryPackageSignatureVerified(context, str);
            queryPackageSignatureVerified.zzc();
            return queryPackageSignatureVerified;
        } catch (SecurityException unused) {
            PackageVerificationResult queryPackageSignatureVerified2 = queryPackageSignatureVerified(context, str);
            if (queryPackageSignatureVerified2.zzb()) {
            }
            return queryPackageSignatureVerified2;
        }
    }
}
