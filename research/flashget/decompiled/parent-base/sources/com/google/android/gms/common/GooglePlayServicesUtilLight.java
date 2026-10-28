package com.google.android.gms.common;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.HideFirstParty;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.UidVerifier;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
@ShowFirstParty
@KeepForSdk
/* loaded from: classes5.dex */
public class GooglePlayServicesUtilLight {

    @KeepForSdk
    static final int GMS_AVAILABILITY_NOTIFICATION_ID = 10436;

    @KeepForSdk
    static final int GMS_GENERAL_ERROR_NOTIFICATION_ID = 39789;

    @KeepForSdk
    @Deprecated
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = 12451000;

    @m1
    public static boolean zza;

    @m1
    public static boolean zzb;

    @o0
    @KeepForSdk
    public static final String GOOGLE_PLAY_GAMES_PACKAGE = ProtectedSandApp.s("쥲");

    @o0
    @KeepForSdk
    @Deprecated
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = ProtectedSandApp.s("쥳");

    @o0
    @KeepForSdk
    public static final String GOOGLE_SERVICES_FRAMEWORK_PACKAGE = ProtectedSandApp.s("쥴");

    @o0
    @KeepForSdk
    public static final String GOOGLE_PLAY_STORE_PACKAGE = ProtectedSandApp.s("쥵");

    @KeepForSdk
    @Deprecated
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
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(ProtectedSandApp.s("쥶"));
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
    public static void ensurePlayServicesAvailable(@o0 Context context, int i4) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        int isGooglePlayServicesAvailable = GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, i4);
        if (isGooglePlayServicesAvailable != 0) {
            Intent errorResolutionIntent = GoogleApiAvailabilityLight.getInstance().getErrorResolutionIntent(context, isGooglePlayServicesAvailable, ProtectedSandApp.s("쥷"));
            new StringBuilder(String.valueOf(isGooglePlayServicesAvailable).length() + 46);
            if (errorResolutionIntent != null) {
                throw new GooglePlayServicesRepairableException(isGooglePlayServicesAvailable, ProtectedSandApp.s("쥸"), errorResolutionIntent);
            }
            throw new GooglePlayServicesNotAvailableException(isGooglePlayServicesAvailable);
        }
    }

    @ShowFirstParty
    @KeepForSdk
    @Deprecated
    public static int getApkVersion(@o0 Context context) {
        try {
            return context.getPackageManager().getPackageInfo(ProtectedSandApp.s("쥳"), 0).versionCode;
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
    public static PendingIntent getErrorPendingIntent(int i4, @o0 Context context, int i5) {
        return GoogleApiAvailabilityLight.getInstance().getErrorResolutionPendingIntent(context, i4, i5);
    }

    @o0
    @KeepForSdk
    @Deprecated
    public static String getErrorString(int i4) {
        return ConnectionResult.zza(i4);
    }

    @Deprecated
    @q0
    @ShowFirstParty
    @KeepForSdk
    public static Intent getGooglePlayServicesAvailabilityRecoveryIntent(int i4) {
        return GoogleApiAvailabilityLight.getInstance().getErrorResolutionIntent(null, i4, null);
    }

    @q0
    @KeepForSdk
    public static Context getRemoteContext(@o0 Context context) {
        try {
            return context.createPackageContext(ProtectedSandApp.s("쥳"), 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @q0
    @KeepForSdk
    public static Resources getRemoteResource(@o0 Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication(ProtectedSandApp.s("쥳"));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @ShowFirstParty
    @KeepForSdk
    public static boolean honorsDebugCertificates(@o0 Context context) {
        if (!zzb) {
            try {
                PackageInfo packageInfo = Wrappers.packageManager(context).getPackageInfo(ProtectedSandApp.s("쥳"), Build.VERSION.SDK_INT >= 28 ? 134217792 : 64);
                GoogleSignatureVerifier.getInstance(context);
                if (packageInfo == null || GoogleSignatureVerifier.zza(packageInfo, false) || !GoogleSignatureVerifier.zza(packageInfo, true)) {
                    zza = false;
                } else {
                    zza = true;
                }
                zzb = true;
            } catch (PackageManager.NameNotFoundException unused) {
                zzb = true;
            } catch (Throwable th) {
                zzb = true;
                throw th;
            }
        }
        return zza || !DeviceProperties.isUserBuild();
    }

    @HideFirstParty
    @KeepForSdk
    @Deprecated
    public static int isGooglePlayServicesAvailable(@o0 Context context) {
        return isGooglePlayServicesAvailable(context, GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    @KeepForSdk
    @Deprecated
    public static boolean isGooglePlayServicesUid(@o0 Context context, int i4) {
        return UidVerifier.isGooglePlayServicesUid(context, i4);
    }

    @ShowFirstParty
    @KeepForSdk
    @Deprecated
    public static boolean isPlayServicesPossiblyUpdating(@o0 Context context, int i4) {
        if (i4 == 18) {
            return true;
        }
        if (i4 == 1) {
            return zza(context, ProtectedSandApp.s("쥳"));
        }
        return false;
    }

    @ShowFirstParty
    @KeepForSdk
    @Deprecated
    public static boolean isPlayStorePossiblyUpdating(@o0 Context context, int i4) {
        if (i4 == 9) {
            return zza(context, ProtectedSandApp.s("쥵"));
        }
        return false;
    }

    @KeepForSdk
    public static boolean isRestrictedUserProfile(@o0 Context context) {
        Object systemService = context.getSystemService(ProtectedSandApp.s("즀"));
        Preconditions.checkNotNull(systemService);
        Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
        return applicationRestrictions != null && ProtectedSandApp.s("즁").equals(applicationRestrictions.getString(ProtectedSandApp.s("즂")));
    }

    @ShowFirstParty
    @KeepForSdk
    @Deprecated
    public static boolean isSidewinderDevice(@o0 Context context) {
        return DeviceProperties.isSidewinder(context);
    }

    @KeepForSdk
    @Deprecated
    public static boolean isUserRecoverableError(int i4) {
        return i4 == 1 || i4 == 2 || i4 == 3 || i4 == 9;
    }

    @KeepForSdk
    @Deprecated
    public static boolean uidHasPackageName(@o0 Context context, int i4, @o0 String str) {
        return UidVerifier.uidHasPackageName(context, i4, str);
    }

    static boolean zza(Context context, String str) {
        ApplicationInfo applicationInfo;
        boolean equals = str.equals(ProtectedSandApp.s("쥳"));
        try {
            Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            while (it.hasNext()) {
                if (str.equals(it.next().getAppPackageName())) {
                    return true;
                }
            }
            applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
        } catch (PackageManager.NameNotFoundException | Exception unused) {
        }
        return equals ? applicationInfo.enabled : applicationInfo.enabled && !isRestrictedUserProfile(context);
    }

    @KeepForSdk
    @Deprecated
    public static int isGooglePlayServicesAvailable(@o0 Context context, int i4) {
        PackageInfo packageInfo;
        try {
            context.getResources().getString(R.string.common_google_play_services_unknown_issue);
        } catch (Throwable unused) {
        }
        String packageName = context.getPackageName();
        String s4 = ProtectedSandApp.s("쥳");
        if (!s4.equals(packageName) && !zzc.get()) {
            int zzb2 = com.google.android.gms.common.internal.zzae.zzb(context);
            if (zzb2 == 0) {
                throw new GooglePlayServicesMissingManifestValueException();
            }
            if (zzb2 != GOOGLE_PLAY_SERVICES_VERSION_CODE) {
                throw new GooglePlayServicesIncorrectManifestValueException(zzb2);
            }
        }
        boolean z4 = (DeviceProperties.isWearableWithoutPlayStore(context) || DeviceProperties.zzd(context)) ? false : true;
        Preconditions.checkArgument(i4 >= 0);
        String packageName2 = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        if (z4) {
            try {
                packageInfo = packageManager.getPackageInfo(ProtectedSandApp.s("쥵"), Build.VERSION.SDK_INT >= 28 ? 134225984 : 8256);
            } catch (PackageManager.NameNotFoundException unused2) {
                String.valueOf(packageName2).concat(ProtectedSandApp.s("쥹"));
            }
        } else {
            packageInfo = null;
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo(s4, Build.VERSION.SDK_INT >= 28 ? 134217792 : 64);
            GoogleSignatureVerifier.getInstance(context);
            if (GoogleSignatureVerifier.zza(packageInfo2, true)) {
                if (z4) {
                    Preconditions.checkNotNull(packageInfo);
                    if (!GoogleSignatureVerifier.zza(packageInfo, true)) {
                        String.valueOf(packageName2).concat(ProtectedSandApp.s("쥻"));
                    }
                }
                if (!z4 || packageInfo == null || packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                    if (com.google.android.gms.common.util.zzb.zza(packageInfo2.versionCode) < com.google.android.gms.common.util.zzb.zza(i4)) {
                        int i5 = packageInfo2.versionCode;
                        new StringBuilder(String.valueOf(packageName2).length() + 49 + String.valueOf(i4).length() + 11 + String.valueOf(i5).length());
                        return 2;
                    }
                    ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                    if (applicationInfo == null) {
                        try {
                            applicationInfo = packageManager.getApplicationInfo(s4, 0);
                        } catch (PackageManager.NameNotFoundException e4) {
                            Log.wtf(ProtectedSandApp.s("쥽"), String.valueOf(packageName2).concat(ProtectedSandApp.s("쥾")), e4);
                            return 1;
                        }
                    }
                    return !applicationInfo.enabled ? 3 : 0;
                }
                String.valueOf(packageName2).concat(ProtectedSandApp.s("쥼"));
            } else {
                String.valueOf(packageName2).concat(ProtectedSandApp.s("쥺"));
            }
            return 9;
        } catch (PackageManager.NameNotFoundException unused3) {
            String.valueOf(packageName2).concat(ProtectedSandApp.s("쥿"));
            return 1;
        }
    }
}
