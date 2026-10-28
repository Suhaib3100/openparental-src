package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import java.util.Set;
import zc.h;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
@ShowFirstParty
@KeepForSdk
/* loaded from: classes5.dex */
public class GoogleSignatureVerifier {

    @h
    private static GoogleSignatureVerifier zza;

    @h
    private static volatile Set zzd;

    @h
    private static volatile Set zze;
    private final Context zzb;
    private volatile String zzc;

    public GoogleSignatureVerifier(@o0 Context context) {
        this.zzb = context.getApplicationContext();
    }

    @o0
    @KeepForSdk
    public static GoogleSignatureVerifier getInstance(@o0 Context context) {
        Preconditions.checkNotNull(context);
        synchronized (GoogleSignatureVerifier.class) {
            try {
                if (zza == null) {
                    zzo.zza(context);
                    zza = new GoogleSignatureVerifier(context);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zza;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        if (com.flashget.parentalcontrol.ProtectedSandApp.s("즈").equals(r10.packageName) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c9, code lost:
    
        r5 = r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static final boolean zza(android.content.pm.PackageInfo r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.GoogleSignatureVerifier.zza(android.content.pm.PackageInfo, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00c1  */
    @android.annotation.SuppressLint({"PackageManagerGetSignatures"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.google.android.gms.common.zzy zzb(@zc.h java.lang.String r6, boolean r7, boolean r8) {
        /*
            r5 = this;
            java.lang.String r7 = "즊"
            java.lang.String r7 = com.flashget.parentalcontrol.ProtectedSandApp.s(r7)
            if (r6 != 0) goto Ld
            com.google.android.gms.common.zzy r6 = com.google.android.gms.common.zzy.zzc(r7)
            return r6
        Ld:
            java.lang.String r8 = r5.zzc
            boolean r8 = r6.equals(r8)
            if (r8 != 0) goto Ld4
            int r8 = com.google.android.gms.common.zzo.zzh
            android.os.StrictMode$ThreadPolicy r8 = android.os.StrictMode.allowThreadDiskReads()
            r0 = 1
            com.google.android.gms.common.zzo.zzb()     // Catch: java.lang.Throwable -> L49 java.lang.Throwable -> L4e
            com.google.android.gms.common.internal.zzad r1 = com.google.android.gms.common.zzo.zzg     // Catch: java.lang.Throwable -> L49 java.lang.Throwable -> L4e
            boolean r1 = r1.zzg()     // Catch: java.lang.Throwable -> L49 java.lang.Throwable -> L4e
            android.os.StrictMode.setThreadPolicy(r8)
            if (r1 == 0) goto L51
            com.google.android.gms.common.zzv r7 = new com.google.android.gms.common.zzv
            r8 = 0
            r7.<init>(r8)
            r7.zza(r6)
            android.content.Context r8 = r5.zzb
            boolean r8 = com.google.android.gms.common.GooglePlayServicesUtilLight.honorsDebugCertificates(r8)
            r7.zzb(r8)
            r7.zzc(r0)
            com.google.android.gms.common.zzw r7 = r7.zzd()
            com.google.android.gms.common.zzy r7 = com.google.android.gms.common.zzo.zzc(r7)
            goto Lbd
        L49:
            r6 = move-exception
            android.os.StrictMode.setThreadPolicy(r8)
            throw r6
        L4e:
            android.os.StrictMode.setThreadPolicy(r8)
        L51:
            int r8 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r8 < r1) goto L5b
            r8 = 134217792(0x8000040, float:3.8518893E-34)
            goto L5d
        L5b:
            r8 = 64
        L5d:
            android.content.Context r1 = r5.zzb     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lc4
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lc4
            android.content.pm.PackageInfo r8 = r1.getPackageInfo(r6, r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lc4
            android.content.Context r1 = r5.zzb
            boolean r1 = com.google.android.gms.common.GooglePlayServicesUtilLight.honorsDebugCertificates(r1)
            if (r8 != 0) goto L74
            com.google.android.gms.common.zzy r7 = com.google.android.gms.common.zzy.zzc(r7)
            goto Lbd
        L74:
            android.content.pm.Signature[] r7 = r8.signatures
            if (r7 == 0) goto Lb3
            int r7 = r7.length
            if (r7 == r0) goto L7c
            goto Lb3
        L7c:
            com.google.android.gms.common.zzk r7 = new com.google.android.gms.common.zzk
            android.content.pm.Signature[] r2 = r8.signatures
            r3 = 0
            r2 = r2[r3]
            byte[] r2 = r2.toByteArray()
            r7.<init>(r2)
            java.lang.String r2 = r8.packageName
            com.google.android.gms.common.zzy r1 = com.google.android.gms.common.zzo.zzd(r2, r7, r1, r3)
            boolean r4 = r1.zza
            if (r4 == 0) goto Lb1
            android.content.pm.ApplicationInfo r8 = r8.applicationInfo
            if (r8 == 0) goto Lb1
            int r8 = r8.flags
            r8 = r8 & 2
            if (r8 == 0) goto Lb1
            com.google.android.gms.common.zzy r7 = com.google.android.gms.common.zzo.zzd(r2, r7, r3, r0)
            boolean r7 = r7.zza
            if (r7 == 0) goto Lb1
            java.lang.String r7 = "즋"
            java.lang.String r7 = com.flashget.parentalcontrol.ProtectedSandApp.s(r7)
            com.google.android.gms.common.zzy r7 = com.google.android.gms.common.zzy.zzc(r7)
            goto Lbd
        Lb1:
            r7 = r1
            goto Lbd
        Lb3:
            java.lang.String r7 = "즌"
            java.lang.String r7 = com.flashget.parentalcontrol.ProtectedSandApp.s(r7)
            com.google.android.gms.common.zzy r7 = com.google.android.gms.common.zzy.zzc(r7)
        Lbd:
            boolean r8 = r7.zza
            if (r8 == 0) goto Lc3
            r5.zzc = r6
        Lc3:
            return r7
        Lc4:
            r7 = move-exception
            java.lang.String r8 = "즍"
            java.lang.String r8 = com.flashget.parentalcontrol.ProtectedSandApp.s(r8)
            java.lang.String r6 = r8.concat(r6)
            com.google.android.gms.common.zzy r6 = com.google.android.gms.common.zzy.zzd(r6, r7)
            return r6
        Ld4:
            com.google.android.gms.common.zzy r6 = com.google.android.gms.common.zzy.zzb()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.GoogleSignatureVerifier.zzb(java.lang.String, boolean, boolean):com.google.android.gms.common.zzy");
    }

    @h
    private static zzj zzc(PackageInfo packageInfo, zzj... zzjVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null || signatureArr.length != 1) {
            return null;
        }
        zzk zzkVar = new zzk(packageInfo.signatures[0].toByteArray());
        for (int i4 = 0; i4 < zzjVarArr.length; i4++) {
            if (zzjVarArr[i4].equals(zzkVar)) {
                return zzjVarArr[i4];
            }
        }
        return null;
    }

    @KeepForSdk
    public boolean isGooglePublicSignedPackage(@o0 PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (zza(packageInfo, false)) {
            return true;
        }
        return zza(packageInfo, true) && GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzb);
    }

    @ShowFirstParty
    @KeepForSdk
    public boolean isPackageGoogleSigned(@h String str) {
        zzy zzb = zzb(str, false, false);
        zzb.zze();
        return zzb.zza;
    }

    @ShowFirstParty
    @KeepForSdk
    public boolean isUidGoogleSigned(int i4) {
        zzy zzc;
        int length;
        String[] packagesForUid = this.zzb.getPackageManager().getPackagesForUid(i4);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            zzc = null;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    Preconditions.checkNotNull(zzc);
                    break;
                }
                zzc = zzb(packagesForUid[i5], false, false);
                if (zzc.zza) {
                    break;
                }
                i5++;
            }
        } else {
            zzc = zzy.zzc(ProtectedSandApp.s("즎"));
        }
        zzc.zze();
        return zzc.zza;
    }
}
