package com.google.android.gms.common;

import android.annotation.TargetApi;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.HideFirstParty;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.zzag;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.UidVerifier;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@ShowFirstParty
@KeepForSdk
/* loaded from: classes2.dex */
public class GooglePlayServicesUtilLight {

    @KeepForSdk
    static final int GMS_AVAILABILITY_NOTIFICATION_ID = 10436;

    @KeepForSdk
    static final int GMS_GENERAL_ERROR_NOTIFICATION_ID = 39789;

    @KeepForSdk
    @Deprecated
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = 12451000;

    @VisibleForTesting
    static boolean zza;
    private static boolean zzb;

    @o0
    @KeepForSdk
    public static final String GOOGLE_PLAY_GAMES_PACKAGE = ProtectedSandApp.s("ੋ");

    @o0
    @KeepForSdk
    @Deprecated
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = ProtectedSandApp.s("ੌ");

    @o0
    @KeepForSdk
    public static final String GOOGLE_PLAY_STORE_PACKAGE = ProtectedSandApp.s("੍");

    @VisibleForTesting
    @KeepForSdk
    static final AtomicBoolean sCanceledAvailabilityNotification = new AtomicBoolean();
    private static final AtomicBoolean zzc = new AtomicBoolean();

    @KeepForSdk
    GooglePlayServicesUtilLight() {
    }

    @KeepForSdk
    @Deprecated
    public static void cancelAvailabilityErrorNotifications(@o0 Context context) {
        if (sCanceledAvailabilityNotification.getAndSet(true)) {
            return;
        }
        try {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(ProtectedSandApp.s("\u0a4e"));
            if (notificationManager != null) {
                notificationManager.cancel(GMS_AVAILABILITY_NOTIFICATION_ID);
            }
        } catch (SecurityException unused) {
        }
    }

    @ShowFirstParty
    @KeepForSdk
    public static void enableUsingApkIndependentContext() {
        zzc.set(true);
    }

    @KeepForSdk
    @Deprecated
    public static void ensurePlayServicesAvailable(@o0 Context context, int i5) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        int isGooglePlayServicesAvailable = GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, i5);
        if (isGooglePlayServicesAvailable != 0) {
            Intent errorResolutionIntent = GoogleApiAvailabilityLight.getInstance().getErrorResolutionIntent(context, isGooglePlayServicesAvailable, ProtectedSandApp.s("\u0a4f"));
            if (errorResolutionIntent != null) {
                throw new GooglePlayServicesRepairableException(isGooglePlayServicesAvailable, ProtectedSandApp.s("\u0a50"), errorResolutionIntent);
            }
            throw new GooglePlayServicesNotAvailableException(isGooglePlayServicesAvailable);
        }
    }

    @ShowFirstParty
    @KeepForSdk
    @Deprecated
    public static int getApkVersion(@o0 Context context) {
        try {
            return context.getPackageManager().getPackageInfo(ProtectedSandApp.s("ੑ"), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    @ShowFirstParty
    @KeepForSdk
    @Deprecated
    public static int getClientVersion(@o0 Context context) {
        Preconditions.checkState(true);
        return ClientLibraryUtils.getClientVersion(context, context.getPackageName());
    }

    @q0
    @KeepForSdk
    @Deprecated
    public static PendingIntent getErrorPendingIntent(int i5, @o0 Context context, int i6) {
        return GoogleApiAvailabilityLight.getInstance().getErrorResolutionPendingIntent(context, i5, i6);
    }

    @VisibleForTesting
    @Deprecated
    @o0
    @KeepForSdk
    public static String getErrorString(int i5) {
        return ConnectionResult.zza(i5);
    }

    @Deprecated
    @q0
    @ShowFirstParty
    @KeepForSdk
    public static Intent getGooglePlayServicesAvailabilityRecoveryIntent(int i5) {
        return GoogleApiAvailabilityLight.getInstance().getErrorResolutionIntent(null, i5, null);
    }

    @q0
    @KeepForSdk
    public static Context getRemoteContext(@o0 Context context) {
        try {
            return context.createPackageContext(ProtectedSandApp.s("\u0a52"), 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @q0
    @KeepForSdk
    public static Resources getRemoteResource(@o0 Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication(ProtectedSandApp.s("\u0a53"));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @ShowFirstParty
    @KeepForSdk
    public static boolean honorsDebugCertificates(@o0 Context context) {
        if (!zza) {
            try {
                PackageInfo packageInfo = Wrappers.packageManager(context).getPackageInfo(ProtectedSandApp.s("\u0a54"), 64);
                GoogleSignatureVerifier.getInstance(context);
                if (packageInfo == null || GoogleSignatureVerifier.zzb(packageInfo, false) || !GoogleSignatureVerifier.zzb(packageInfo, true)) {
                    zzb = false;
                } else {
                    zzb = true;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            } finally {
                zza = true;
            }
        }
        return zzb || !DeviceProperties.isUserBuild();
    }

    @HideFirstParty
    @KeepForSdk
    @Deprecated
    public static int isGooglePlayServicesAvailable(@o0 Context context) {
        return isGooglePlayServicesAvailable(context, GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    @KeepForSdk
    @Deprecated
    public static boolean isGooglePlayServicesUid(@o0 Context context, int i5) {
        return UidVerifier.isGooglePlayServicesUid(context, i5);
    }

    @ShowFirstParty
    @KeepForSdk
    @Deprecated
    public static boolean isPlayServicesPossiblyUpdating(@o0 Context context, int i5) {
        if (i5 == 18) {
            return true;
        }
        if (i5 == 1) {
            return zza(context, ProtectedSandApp.s("ਫ਼"));
        }
        return false;
    }

    @ShowFirstParty
    @KeepForSdk
    @Deprecated
    public static boolean isPlayStorePossiblyUpdating(@o0 Context context, int i5) {
        if (i5 == 9) {
            return zza(context, ProtectedSandApp.s("\u0a5f"));
        }
        return false;
    }

    @KeepForSdk
    @TargetApi(18)
    public static boolean isRestrictedUserProfile(@o0 Context context) {
        if (!PlatformVersion.isAtLeastJellyBeanMR2()) {
            return false;
        }
        Object systemService = context.getSystemService(ProtectedSandApp.s("\u0a60"));
        Preconditions.checkNotNull(systemService);
        Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
        if (applicationRestrictions != null) {
            return ProtectedSandApp.s("\u0a62").equals(applicationRestrictions.getString(ProtectedSandApp.s("\u0a61")));
        }
        return false;
    }

    @VisibleForTesting
    @Deprecated
    @ShowFirstParty
    @KeepForSdk
    public static boolean isSidewinderDevice(@o0 Context context) {
        return DeviceProperties.isSidewinder(context);
    }

    @KeepForSdk
    @Deprecated
    public static boolean isUserRecoverableError(int i5) {
        return i5 == 1 || i5 == 2 || i5 == 3 || i5 == 9;
    }

    @KeepForSdk
    @TargetApi(19)
    @Deprecated
    public static boolean uidHasPackageName(@o0 Context context, int i5, @o0 String str) {
        return UidVerifier.uidHasPackageName(context, i5, str);
    }

    @TargetApi(21)
    static boolean zza(Context context, String str) {
        ApplicationInfo applicationInfo;
        boolean equals = str.equals(ProtectedSandApp.s("\u0a63"));
        if (PlatformVersion.isAtLeastLollipop()) {
            try {
                Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
                while (it.hasNext()) {
                    if (str.equals(it.next().getAppPackageName())) {
                        return true;
                    }
                }
            } catch (Exception unused) {
                return false;
            }
        }
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        return equals ? applicationInfo.enabled : applicationInfo.enabled && !isRestrictedUserProfile(context);
    }

    @KeepForSdk
    @Deprecated
    public static int isGooglePlayServicesAvailable(@o0 Context context, int i5) {
        PackageInfo packageInfo;
        try {
            context.getResources().getString(R.string.common_google_play_services_unknown_issue);
        } catch (Throwable unused) {
        }
        String packageName = context.getPackageName();
        String s5 = ProtectedSandApp.s("\u0a55");
        if (!s5.equals(packageName) && !zzc.get()) {
            int zza2 = zzag.zza(context);
            if (zza2 == 0) {
                throw new GooglePlayServicesMissingManifestValueException();
            }
            if (zza2 != GOOGLE_PLAY_SERVICES_VERSION_CODE) {
                throw new GooglePlayServicesIncorrectManifestValueException(zza2);
            }
        }
        boolean z5 = (DeviceProperties.isWearableWithoutPlayStore(context) || DeviceProperties.zzb(context)) ? false : true;
        Preconditions.checkArgument(i5 >= 0);
        String packageName2 = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        if (z5) {
            try {
                packageInfo = packageManager.getPackageInfo(ProtectedSandApp.s("\u0a56"), 8256);
            } catch (PackageManager.NameNotFoundException unused2) {
                String.valueOf(packageName2).concat(ProtectedSandApp.s("\u0a57"));
            }
        } else {
            packageInfo = null;
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo(s5, 64);
            GoogleSignatureVerifier.getInstance(context);
            if (GoogleSignatureVerifier.zzb(packageInfo2, true)) {
                if (z5) {
                    Preconditions.checkNotNull(packageInfo);
                    if (!GoogleSignatureVerifier.zzb(packageInfo, true)) {
                        String.valueOf(packageName2).concat(ProtectedSandApp.s("ਖ਼"));
                    }
                }
                if (!z5 || packageInfo == null || packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                    if (com.google.android.gms.common.util.zza.zza(packageInfo2.versionCode) < com.google.android.gms.common.util.zza.zza(i5)) {
                        return 2;
                    }
                    ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                    if (applicationInfo == null) {
                        try {
                            applicationInfo = packageManager.getApplicationInfo(s5, 0);
                        } catch (PackageManager.NameNotFoundException e6) {
                            Log.wtf(ProtectedSandApp.s("ੜ"), String.valueOf(packageName2).concat(ProtectedSandApp.s("ਜ਼")), e6);
                            return 1;
                        }
                    }
                    return !applicationInfo.enabled ? 3 : 0;
                }
                String.valueOf(packageName2).concat(ProtectedSandApp.s("ਗ਼"));
            } else {
                String.valueOf(packageName2).concat(ProtectedSandApp.s("\u0a58"));
            }
            return 9;
        } catch (PackageManager.NameNotFoundException unused3) {
            String.valueOf(packageName2).concat(ProtectedSandApp.s("\u0a5d"));
            return 1;
        }
    }
}
