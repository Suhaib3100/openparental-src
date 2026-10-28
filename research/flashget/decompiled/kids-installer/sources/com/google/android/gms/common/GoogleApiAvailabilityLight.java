package com.google.android.gms.common;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.HideFirstParty;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@ShowFirstParty
@KeepForSdk
/* loaded from: classes2.dex */
public class GoogleApiAvailabilityLight {

    @KeepForSdk
    static final String TRACKING_SOURCE_DIALOG = ProtectedSandApp.s("\u0a44");

    @KeepForSdk
    static final String TRACKING_SOURCE_NOTIFICATION = ProtectedSandApp.s("\u0a45");

    @o0
    @KeepForSdk
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = ProtectedSandApp.s("\u0a46");

    @o0
    @KeepForSdk
    public static final String GOOGLE_PLAY_STORE_PACKAGE = ProtectedSandApp.s("ੇ");

    @KeepForSdk
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    private static final GoogleApiAvailabilityLight zza = new GoogleApiAvailabilityLight();

    @KeepForSdk
    GoogleApiAvailabilityLight() {
    }

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
    public Intent getErrorResolutionIntent(int i5) {
        return getErrorResolutionIntent(null, i5, null);
    }

    @q0
    @KeepForSdk
    public PendingIntent getErrorResolutionPendingIntent(@o0 Context context, int i5, int i6) {
        return getErrorResolutionPendingIntent(context, i5, i6, null);
    }

    @o0
    @KeepForSdk
    public String getErrorString(int i5) {
        return GooglePlayServicesUtilLight.getErrorString(i5);
    }

    @HideFirstParty
    @KeepForSdk
    public int isGooglePlayServicesAvailable(@o0 Context context) {
        return isGooglePlayServicesAvailable(context, GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    @ShowFirstParty
    @KeepForSdk
    public boolean isPlayServicesPossiblyUpdating(@o0 Context context, int i5) {
        return GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(context, i5);
    }

    @ShowFirstParty
    @KeepForSdk
    public boolean isPlayStorePossiblyUpdating(@o0 Context context, int i5) {
        return GooglePlayServicesUtilLight.isPlayStorePossiblyUpdating(context, i5);
    }

    @KeepForSdk
    public boolean isUninstalledAppPossiblyUpdating(@o0 Context context, @o0 String str) {
        return GooglePlayServicesUtilLight.zza(context, str);
    }

    @KeepForSdk
    public boolean isUserResolvableError(int i5) {
        return GooglePlayServicesUtilLight.isUserRecoverableError(i5);
    }

    @KeepForSdk
    public void verifyGooglePlayServicesIsAvailable(@o0 Context context, int i5) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        GooglePlayServicesUtilLight.ensurePlayServicesAvailable(context, i5);
    }

    @q0
    @ShowFirstParty
    @KeepForSdk
    public Intent getErrorResolutionIntent(@q0 Context context, int i5, @q0 String str) {
        String s5 = ProtectedSandApp.s("ੈ");
        if (i5 != 1 && i5 != 2) {
            if (i5 != 3) {
                return null;
            }
            return com.google.android.gms.common.internal.zzt.zzc(s5);
        }
        if (context != null && DeviceProperties.isWearableWithoutPlayStore(context)) {
            return com.google.android.gms.common.internal.zzt.zza();
        }
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("\u0a49"));
        sb.append(GOOGLE_PLAY_SERVICES_VERSION_CODE);
        String s6 = ProtectedSandApp.s("\u0a4a");
        sb.append(s6);
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append(s6);
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append(s6);
        if (context != null) {
            try {
                sb.append(Wrappers.packageManager(context).getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return com.google.android.gms.common.internal.zzt.zzb(s5, sb.toString());
    }

    @q0
    @ShowFirstParty
    @KeepForSdk
    public PendingIntent getErrorResolutionPendingIntent(@o0 Context context, int i5, int i6, @q0 String str) {
        Intent errorResolutionIntent = getErrorResolutionIntent(context, i5, str);
        if (errorResolutionIntent == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i6, errorResolutionIntent, com.google.android.gms.internal.common.zzd.zza | 134217728);
    }

    @KeepForSdk
    public int isGooglePlayServicesAvailable(@o0 Context context, int i5) {
        int isGooglePlayServicesAvailable = GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(context, i5);
        if (GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(context, isGooglePlayServicesAvailable)) {
            return 18;
        }
        return isGooglePlayServicesAvailable;
    }
}
