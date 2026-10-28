package com.google.android.gms.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.errorprone.annotations.RestrictedInheritance;
import java.util.Set;
import javax.annotation.Nullable;
import x1.b;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@b
@ShowFirstParty
@KeepForSdk
@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms/common/testing/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
/* loaded from: classes2.dex */
public class GoogleSignatureVerifier {

    @Nullable
    private static GoogleSignatureVerifier zza;

    @Nullable
    private static volatile Set zzb;
    private final Context zzc;
    private volatile String zzd;

    public GoogleSignatureVerifier(@o0 Context context) {
        this.zzc = context.getApplicationContext();
    }

    @o0
    @KeepForSdk
    public static GoogleSignatureVerifier getInstance(@o0 Context context) {
        Preconditions.checkNotNull(context);
        synchronized (GoogleSignatureVerifier.class) {
            if (zza == null) {
                zzn.zze(context);
                zza = new GoogleSignatureVerifier(context);
            }
        }
        return zza;
    }

    @Nullable
    static final zzj zza(PackageInfo packageInfo, zzj... zzjVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null || signatureArr.length != 1) {
            return null;
        }
        zzk zzkVar = new zzk(packageInfo.signatures[0].toByteArray());
        for (int i5 = 0; i5 < zzjVarArr.length; i5++) {
            if (zzjVarArr[i5].equals(zzkVar)) {
                return zzjVarArr[i5];
            }
        }
        return null;
    }

    public static final boolean zzb(@o0 PackageInfo packageInfo, boolean z5) {
        if (z5 && packageInfo != null && (ProtectedSandApp.s("\u0a64").equals(packageInfo.packageName) || ProtectedSandApp.s("\u0a65").equals(packageInfo.packageName))) {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            z5 = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
        }
        if (packageInfo != null && packageInfo.signatures != null) {
            if ((z5 ? zza(packageInfo, zzm.zza) : zza(packageInfo, zzm.zza[0])) != null) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    private final zzx zzc(String str, boolean z5, boolean z6) {
        zzx zzc;
        ApplicationInfo applicationInfo;
        String s5 = ProtectedSandApp.s("੦");
        if (str == null) {
            return zzx.zzc(s5);
        }
        if (str.equals(this.zzd)) {
            return zzx.zzb();
        }
        if (zzn.zzg()) {
            zzc = zzn.zzb(str, GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzc), false, false);
        } else {
            try {
                PackageInfo packageInfo = this.zzc.getPackageManager().getPackageInfo(str, 64);
                boolean honorsDebugCertificates = GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzc);
                if (packageInfo == null) {
                    zzc = zzx.zzc(s5);
                } else {
                    Signature[] signatureArr = packageInfo.signatures;
                    if (signatureArr == null || signatureArr.length != 1) {
                        zzc = zzx.zzc(ProtectedSandApp.s("੨"));
                    } else {
                        zzk zzkVar = new zzk(packageInfo.signatures[0].toByteArray());
                        String str2 = packageInfo.packageName;
                        zzx zza2 = zzn.zza(str2, zzkVar, honorsDebugCertificates, false);
                        zzc = (!zza2.zza || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0 || !zzn.zza(str2, zzkVar, false, true).zza) ? zza2 : zzx.zzc(ProtectedSandApp.s("੧"));
                    }
                }
            } catch (PackageManager.NameNotFoundException e6) {
                return zzx.zzd(ProtectedSandApp.s("੩").concat(str), e6);
            }
        }
        if (zzc.zza) {
            this.zzd = str;
        }
        return zzc;
    }

    @KeepForSdk
    public boolean isGooglePublicSignedPackage(@o0 PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (zzb(packageInfo, false)) {
            return true;
        }
        return zzb(packageInfo, true) && GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzc);
    }

    @ShowFirstParty
    @KeepForSdk
    public boolean isPackageGoogleSigned(@o0 String str) {
        zzx zzc = zzc(str, false, false);
        zzc.zze();
        return zzc.zza;
    }

    @ShowFirstParty
    @KeepForSdk
    public boolean isUidGoogleSigned(int i5) {
        zzx zzc;
        int length;
        String[] packagesForUid = this.zzc.getPackageManager().getPackagesForUid(i5);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            zzc = null;
            int i6 = 0;
            while (true) {
                if (i6 >= length) {
                    Preconditions.checkNotNull(zzc);
                    break;
                }
                zzc = zzc(packagesForUid[i6], false, false);
                if (zzc.zza) {
                    break;
                }
                i6++;
            }
        } else {
            zzc = zzx.zzc(ProtectedSandApp.s("੪"));
        }
        zzc.zze();
        return zzc.zza;
    }
}
