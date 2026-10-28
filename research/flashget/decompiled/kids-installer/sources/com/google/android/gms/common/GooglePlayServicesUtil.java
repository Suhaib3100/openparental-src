package com.google.android.gms.common;

import android.app.Activity;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.fragment.app.Fragment;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.HideFirstParty;
import com.google.android.gms.common.internal.zag;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes3.dex */
public final class GooglePlayServicesUtil extends GooglePlayServicesUtilLight {

    @o0
    @Deprecated
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = ProtectedSandApp.s("Ⅽ");

    @o0
    public static final String GMS_ERROR_DIALOG = ProtectedSandApp.s("Ⅾ");

    @o0
    public static final String GOOGLE_PLAY_STORE_PACKAGE = ProtectedSandApp.s("Ⅿ");

    @Deprecated
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;

    private GooglePlayServicesUtil() {
    }

    @q0
    @Deprecated
    public static Dialog getErrorDialog(int i5, @o0 Activity activity, int i6) {
        return getErrorDialog(i5, activity, i6, null);
    }

    @o0
    @Deprecated
    public static PendingIntent getErrorPendingIntent(int i5, @o0 Context context, int i6) {
        return GooglePlayServicesUtilLight.getErrorPendingIntent(i5, context, i6);
    }

    @VisibleForTesting
    @o0
    @Deprecated
    public static String getErrorString(int i5) {
        return GooglePlayServicesUtilLight.getErrorString(i5);
    }

    @o0
    public static Context getRemoteContext(@o0 Context context) {
        return GooglePlayServicesUtilLight.getRemoteContext(context);
    }

    @o0
    public static Resources getRemoteResource(@o0 Context context) {
        return GooglePlayServicesUtilLight.getRemoteResource(context);
    }

    @HideFirstParty
    @Deprecated
    public static int isGooglePlayServicesAvailable(@o0 Context context) {
        return GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(context);
    }

    @Deprecated
    public static boolean isUserRecoverableError(int i5) {
        return GooglePlayServicesUtilLight.isUserRecoverableError(i5);
    }

    @Deprecated
    public static boolean showErrorDialogFragment(int i5, @o0 Activity activity, int i6) {
        return showErrorDialogFragment(i5, activity, i6, null);
    }

    @Deprecated
    public static void showErrorNotification(int i5, @o0 Context context) {
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        if (GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(context, i5) || GooglePlayServicesUtilLight.isPlayStorePossiblyUpdating(context, i5)) {
            googleApiAvailability.zaf(context);
        } else {
            googleApiAvailability.showErrorNotification(context, i5);
        }
    }

    @q0
    @Deprecated
    public static Dialog getErrorDialog(int i5, @o0 Activity activity, int i6, @q0 DialogInterface.OnCancelListener onCancelListener) {
        if (true == GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(activity, i5)) {
            i5 = 18;
        }
        return GoogleApiAvailability.getInstance().getErrorDialog(activity, i5, i6, onCancelListener);
    }

    @KeepForSdk
    @Deprecated
    public static int isGooglePlayServicesAvailable(@o0 Context context, int i5) {
        return GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(context, i5);
    }

    @Deprecated
    public static boolean showErrorDialogFragment(int i5, @o0 Activity activity, int i6, @q0 DialogInterface.OnCancelListener onCancelListener) {
        return showErrorDialogFragment(i5, activity, null, i6, onCancelListener);
    }

    public static boolean showErrorDialogFragment(int i5, @o0 Activity activity, @q0 Fragment fragment, int i6, @q0 DialogInterface.OnCancelListener onCancelListener) {
        if (true == GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(activity, i5)) {
            i5 = 18;
        }
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        if (fragment == null) {
            return googleApiAvailability.showErrorDialogFragment(activity, i5, i6, onCancelListener);
        }
        Dialog zaa = googleApiAvailability.zaa(activity, i5, zag.zac(fragment, GoogleApiAvailability.getInstance().getErrorResolutionIntent(activity, i5, ProtectedSandApp.s("ⅰ")), i6), onCancelListener);
        if (zaa == null) {
            return false;
        }
        googleApiAvailability.zad(activity, zaa, ProtectedSandApp.s("ⅱ"), onCancelListener);
        return true;
    }
}
