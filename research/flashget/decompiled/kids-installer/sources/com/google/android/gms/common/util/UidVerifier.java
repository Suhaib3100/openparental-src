package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.GoogleSignatureVerifier;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.wrappers.Wrappers;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public final class UidVerifier {
    private UidVerifier() {
    }

    @KeepForSdk
    public static boolean isGooglePlayServicesUid(@o0 Context context, int i5) {
        String s5 = ProtectedSandApp.s("౻");
        if (!uidHasPackageName(context, i5, s5)) {
            return false;
        }
        try {
            return GoogleSignatureVerifier.getInstance(context).isGooglePublicSignedPackage(context.getPackageManager().getPackageInfo(s5, 64));
        } catch (PackageManager.NameNotFoundException unused) {
            Log.isLoggable(ProtectedSandApp.s("౼"), 3);
            return false;
        }
    }

    @KeepForSdk
    @TargetApi(19)
    public static boolean uidHasPackageName(@o0 Context context, int i5, @o0 String str) {
        return Wrappers.packageManager(context).zza(i5, str);
    }
}
