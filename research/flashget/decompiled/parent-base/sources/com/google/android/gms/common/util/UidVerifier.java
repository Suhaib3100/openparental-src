package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.GoogleSignatureVerifier;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.wrappers.Wrappers;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
@KeepForSdk
/* loaded from: classes5.dex */
public final class UidVerifier {
    private UidVerifier() {
    }

    @KeepForSdk
    public static boolean isGooglePlayServicesUid(@o0 Context context, int i4) {
        String s4 = ProtectedSandApp.s("찗");
        if (!uidHasPackageName(context, i4, s4)) {
            return false;
        }
        try {
            return GoogleSignatureVerifier.getInstance(context).isGooglePublicSignedPackage(context.getPackageManager().getPackageInfo(s4, 64));
        } catch (PackageManager.NameNotFoundException unused) {
            Log.isLoggable(ProtectedSandApp.s("찘"), 3);
            return false;
        }
    }

    @KeepForSdk
    public static boolean uidHasPackageName(@o0 Context context, int i4, @o0 String str) {
        return Wrappers.packageManager(context).zza(i4, str);
    }
}
