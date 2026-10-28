package com.google.android.gms.common;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.core.app.p0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.HideFirstParty;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
@ShowFirstParty
@KeepForSdk
/* loaded from: classes5.dex */
public class GoogleApiAvailabilityLight {

    @KeepForSdk
    static final String TRACKING_SOURCE_DIALOG = ProtectedSandApp.s("쥒");

    @KeepForSdk
    static final String TRACKING_SOURCE_NOTIFICATION = ProtectedSandApp.s("쥓");

    @o0
    @KeepForSdk
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = ProtectedSandApp.s("쥔");

    @o0
    @KeepForSdk
    public static final String GOOGLE_PLAY_STORE_PACKAGE = ProtectedSandApp.s("쥕");

    @KeepForSdk
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    private static final GoogleApiAvailabilityLight zza = new GoogleApiAvailabilityLight();

    @KeepForSdk
    GoogleApiAvailabilityLight() {
    }

    @ShowFirstParty
    @o0
    @KeepForSdk
    public static GoogleApiAvailabilityLight getInstance() {
        return zza;
    }

    @KeepForSdk
    public void cancelAvailabilityErrorNotifications(@o0 Context context) {
        GooglePlayServicesUtilLight.cancelAvailabilityErrorNotifications(context);
    }

    @ShowFirstParty
    @KeepForSdk
    public int getApkVersion(@o0 Context context) {
        return GooglePlayServicesUtilLight.getApkVersion(context);
    }

    @ShowFirstParty
    @KeepForSdk
    public int getClientVersion(@o0 Context context) {
        return GooglePlayServicesUtilLight.getClientVersion(context);
    }

    @Deprecated
    @q0
    @ShowFirstParty
    @KeepForSdk
    public Intent getErrorResolutionIntent(int i4) {
        return getErrorResolutionIntent(null, i4, null);
    }

    @q0
    @KeepForSdk
    public PendingIntent getErrorResolutionPendingIntent(@o0 Context context, int i4, int i5) {
        return getErrorResolutionPendingIntent(context, i4, i5, null);
    }

    @o0
    @KeepForSdk
    public String getErrorString(int i4) {
        return GooglePlayServicesUtilLight.getErrorString(i4);
    }

    @HideFirstParty
    @KeepForSdk
    public int isGooglePlayServicesAvailable(@o0 Context context) {
        return isGooglePlayServicesAvailable(context, GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    @ShowFirstParty
    @KeepForSdk
    public boolean isPlayServicesPossiblyUpdating(@o0 Context context, int i4) {
        return GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(context, i4);
    }

    @ShowFirstParty
    @KeepForSdk
    public boolean isPlayStorePossiblyUpdating(@o0 Context context, int i4) {
        return GooglePlayServicesUtilLight.isPlayStorePossiblyUpdating(context, i4);
    }

    @KeepForSdk
    public boolean isUninstalledAppPossiblyUpdating(@o0 Context context, @o0 String str) {
        return GooglePlayServicesUtilLight.zza(context, str);
    }

    @KeepForSdk
    public boolean isUserResolvableError(int i4) {
        return GooglePlayServicesUtilLight.isUserRecoverableError(i4);
    }

    @KeepForSdk
    public void verifyGooglePlayServicesIsAvailable(@o0 Context context, int i4) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        GooglePlayServicesUtilLight.ensurePlayServicesAvailable(context, i4);
    }

    @q0
    @ShowFirstParty
    @KeepForSdk
    public Intent getErrorResolutionIntent(@q0 Context context, int i4, @q0 String str) {
        String s4 = ProtectedSandApp.s("쥔");
        if (i4 != 1 && i4 != 2) {
            if (i4 != 3) {
                return null;
            }
            Uri fromParts = Uri.fromParts(ProtectedSandApp.s("쥖"), s4, null);
            Intent intent = new Intent(ProtectedSandApp.s("쥗"));
            intent.setData(fromParts);
            return intent;
        }
        if (context != null && DeviceProperties.isWearableWithoutPlayStore(context)) {
            Intent intent2 = new Intent(ProtectedSandApp.s("쥘"));
            intent2.setPackage(ProtectedSandApp.s("쥙"));
            return intent2;
        }
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("쥚"));
        sb.append(GOOGLE_PLAY_SERVICES_VERSION_CODE);
        String s5 = ProtectedSandApp.s("쥛");
        sb.append(s5);
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append(s5);
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append(s5);
        if (context != null) {
            try {
                sb.append(Wrappers.packageManager(context).getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String sb2 = sb.toString();
        Intent intent3 = new Intent(ProtectedSandApp.s("쥜"));
        Uri.Builder appendQueryParameter = Uri.parse(ProtectedSandApp.s("쥝")).buildUpon().appendQueryParameter(ProtectedSandApp.s("쥞"), s4);
        if (!TextUtils.isEmpty(sb2)) {
            appendQueryParameter.appendQueryParameter(ProtectedSandApp.s("쥟"), sb2);
        }
        intent3.setData(appendQueryParameter.build());
        intent3.setPackage(ProtectedSandApp.s("쥕"));
        intent3.addFlags(524288);
        return intent3;
    }

    @q0
    @ShowFirstParty
    @KeepForSdk
    public PendingIntent getErrorResolutionPendingIntent(@o0 Context context, int i4, int i5, @q0 String str) {
        Intent errorResolutionIntent = getErrorResolutionIntent(context, i4, str);
        if (errorResolutionIntent == null) {
            return null;
        }
        return p0.e(context, i5, errorResolutionIntent, 134217728, false);
    }

    @KeepForSdk
    public int isGooglePlayServicesAvailable(@o0 Context context, int i4) {
        int isGooglePlayServicesAvailable = GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(context, i4);
        if (GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(context, isGooglePlayServicesAvailable)) {
            return 18;
        }
        return isGooglePlayServicesAvailable;
    }
}
