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
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.HideFirstParty;
import com.google.android.gms.common.internal.zag;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import f9.l;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes5.dex */
public final class GooglePlayServicesUtil extends GooglePlayServicesUtilLight {

    @o0
    @Deprecated
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = ProtectedSandApp.s("즃");

    @o0
    public static final String GMS_ERROR_DIALOG = ProtectedSandApp.s("즄");

    @o0
    public static final String GOOGLE_PLAY_STORE_PACKAGE = ProtectedSandApp.s("즅");

    @Deprecated
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;

    private GooglePlayServicesUtil() {
    }

    @q0
    @Deprecated
    public static Dialog getErrorDialog(int i4, @o0 Activity activity, int i5) {
        return getErrorDialog(i4, activity, i5, null);
    }

    @o0
    @Deprecated
    public static PendingIntent getErrorPendingIntent(int i4, @o0 Context context, int i5) {
        return GoogleApiAvailabilityLight.getInstance().getErrorResolutionPendingIntent(context, i4, i5);
    }

    @o0
    @Deprecated
    public static String getErrorString(int i4) {
        return GooglePlayServicesUtilLight.getErrorString(i4);
    }

    @o0
    public static Context getRemoteContext(@o0 Context context) {
        return GooglePlayServicesUtilLight.getRemoteContext(context);
    }

    @o0
    public static Resources getRemoteResource(@o0 Context context) {
        return GooglePlayServicesUtilLight.getRemoteResource(context);
    }

    @ResultIgnorabilityUnspecified
    @HideFirstParty
    @Deprecated
    public static int isGooglePlayServicesAvailable(@o0 Context context) {
        return GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(context);
    }

    @Deprecated
    public static boolean isUserRecoverableError(int i4) {
        return GooglePlayServicesUtilLight.isUserRecoverableError(i4);
    }

    @ResultIgnorabilityUnspecified
    @Deprecated
    public static boolean showErrorDialogFragment(int i4, @o0 Activity activity, int i5) {
        return showErrorDialogFragment(i4, activity, i5, null);
    }

    @Deprecated
    public static void showErrorNotification(int i4, @o0 Context context) {
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        if (GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(context, i4) || GooglePlayServicesUtilLight.isPlayStorePossiblyUpdating(context, i4)) {
            googleApiAvailability.zaf(context);
        } else {
            googleApiAvailability.showErrorNotification(context, i4);
        }
    }

    @q0
    @Deprecated
    public static Dialog getErrorDialog(int i4, @o0 Activity activity, int i5, @q0 DialogInterface.OnCancelListener onCancelListener) {
        if (true == GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(activity, i4)) {
            i4 = 18;
        }
        return GoogleApiAvailability.getInstance().getErrorDialog(activity, i4, i5, onCancelListener);
    }

    @KeepForSdk
    @Deprecated
    public static int isGooglePlayServicesAvailable(@o0 Context context, int i4) {
        return GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(context, i4);
    }

    @ResultIgnorabilityUnspecified
    @l(imports = {"androidx.fragment.app.Fragment", "com.google.android.gms.common.GooglePlayServicesUtil"}, replacement = "GooglePlayServicesUtil.showErrorDialogFragment(errorCode, activity, (Fragment) null, requestCode, cancelListener)")
    @Deprecated
    public static boolean showErrorDialogFragment(int i4, @o0 Activity activity, int i5, @q0 DialogInterface.OnCancelListener onCancelListener) {
        return showErrorDialogFragment(i4, activity, null, i5, onCancelListener);
    }

    @ResultIgnorabilityUnspecified
    public static boolean showErrorDialogFragment(int i4, @o0 Activity activity, @q0 Fragment fragment, int i5, @q0 DialogInterface.OnCancelListener onCancelListener) {
        if (true == GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(activity, i4)) {
            i4 = 18;
        }
        int i6 = i4;
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        if (fragment == null) {
            return googleApiAvailability.showErrorDialogFragment(activity, i6, i5, onCancelListener);
        }
        Dialog zaa = googleApiAvailability.zaa(activity, i6, zag.zac(fragment, GoogleApiAvailability.getInstance().getErrorResolutionIntent(activity, i6, ProtectedSandApp.s("즆")), i5), onCancelListener, null);
        if (zaa == null) {
            return false;
        }
        googleApiAvailability.zad(activity, zaa, ProtectedSandApp.s("즄"), onCancelListener);
        return true;
    }
}
