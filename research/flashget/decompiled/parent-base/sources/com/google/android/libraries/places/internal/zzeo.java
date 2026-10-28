package com.google.android.libraries.places.internal;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzeo {
    @q0
    public static String zza(PackageManager packageManager, String str) {
        Signature[] signatureArr;
        Signature signature;
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 64);
            if (packageInfo != null && (signatureArr = packageInfo.signatures) != null && signatureArr.length != 0 && (signature = signatureArr[0]) != null) {
                return zzb(signature);
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                ProtectedSandApp.s("\ue94d").concat(valueOf);
            }
            return null;
        }
    }

    @q0
    private static String zzb(Signature signature) {
        try {
            byte[] digest = MessageDigest.getInstance(ProtectedSandApp.s("\ue94e")).digest(signature.toByteArray());
            return zzlc.zzd().zze(digest, 0, digest.length);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }
}
