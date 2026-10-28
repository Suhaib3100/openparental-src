package com.google.android.gms.auth;

import android.accounts.Account;
import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.b1;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes5.dex */
public final class GoogleAuthUtil extends zzl {
    public static final int CHANGE_TYPE_ACCOUNT_ADDED = 1;
    public static final int CHANGE_TYPE_ACCOUNT_REMOVED = 2;
    public static final int CHANGE_TYPE_ACCOUNT_RENAMED_FROM = 3;
    public static final int CHANGE_TYPE_ACCOUNT_RENAMED_TO = 4;

    @o0
    public static final String GOOGLE_ACCOUNT_TYPE = ProtectedSandApp.s("윿");

    @o0
    public static final String WORK_ACCOUNT_TYPE = ProtectedSandApp.s("읁");

    @o0
    public static final String KEY_SUPPRESS_PROGRESS_SCREEN = ProtectedSandApp.s("읂");

    private GoogleAuthUtil() {
    }

    public static void clearToken(@o0 Context context, @o0 String str) throws GooglePlayServicesAvailabilityException, GoogleAuthException, IOException {
        zzl.clearToken(context, str);
    }

    @o0
    public static List<AccountChangeEvent> getAccountChangeEvents(@o0 Context context, int i4, @o0 String str) throws GoogleAuthException, IOException {
        return zzl.getAccountChangeEvents(context, i4, str);
    }

    @o0
    public static String getAccountId(@o0 Context context, @o0 String str) throws GoogleAuthException, IOException {
        return zzl.getAccountId(context, str);
    }

    @o0
    public static String getToken(@o0 Context context, @o0 Account account, @o0 String str) throws IOException, UserRecoverableAuthException, GoogleAuthException {
        return zzl.getToken(context, account, str);
    }

    @o0
    public static String getTokenWithNotification(@o0 Context context, @o0 Account account, @o0 String str, @o0 Bundle bundle) throws IOException, UserRecoverableNotifiedException, GoogleAuthException {
        if (bundle == null) {
            bundle = new Bundle();
        }
        Bundle bundle2 = bundle;
        bundle2.putBoolean(ProtectedSandApp.s("윺"), true);
        return zzg(context, account, str, bundle2, 0L).zza();
    }

    @b1("android.permission.MANAGE_ACCOUNTS")
    @Deprecated
    public static void invalidateToken(@o0 Context context, @o0 String str) {
        zzl.invalidateToken(context, str);
    }

    @o0
    @TargetApi(23)
    public static Bundle removeAccount(@o0 Context context, @o0 Account account) throws GoogleAuthException, IOException {
        return zzl.removeAccount(context, account);
    }

    @o0
    @TargetApi(26)
    public static Boolean requestGoogleAccountsAccess(@o0 Context context) throws GoogleAuthException, IOException {
        return zzl.requestGoogleAccountsAccess(context);
    }

    private static TokenData zzg(Context context, Account account, String str, Bundle bundle, long j4) throws IOException, GoogleAuthException {
        String s4 = ProtectedSandApp.s("은");
        try {
            TokenData zza = zzl.zza(context, account, str, bundle, 0L, null);
            GooglePlayServicesUtilLight.cancelAvailabilityErrorNotifications(context);
            return zza;
        } catch (GooglePlayServicesAvailabilityException e4) {
            GooglePlayServicesUtil.showErrorNotification(e4.getConnectionStatusCode(), context);
            throw new UserRecoverableNotifiedException(s4, e4);
        } catch (UserRecoverableAuthException e5) {
            GooglePlayServicesUtilLight.cancelAvailabilityErrorNotifications(context);
            throw new UserRecoverableNotifiedException(s4, e5);
        }
    }

    @o0
    public static String getToken(@o0 Context context, @o0 Account account, @o0 String str, @o0 Bundle bundle) throws IOException, UserRecoverableAuthException, GoogleAuthException {
        return zzl.getToken(context, account, str, bundle);
    }

    @o0
    @Deprecated
    public static String getToken(@o0 Context context, @o0 String str, @o0 String str2) throws IOException, UserRecoverableAuthException, GoogleAuthException {
        return zzl.getToken(context, str, str2);
    }

    @o0
    @Deprecated
    public static String getToken(@o0 Context context, @o0 String str, @o0 String str2, @o0 Bundle bundle) throws IOException, UserRecoverableAuthException, GoogleAuthException {
        return zzl.getToken(context, str, str2, bundle);
    }

    @o0
    public static String getTokenWithNotification(@o0 Context context, @o0 Account account, @o0 String str, @o0 Bundle bundle, @o0 Intent intent) throws IOException, UserRecoverableNotifiedException, GoogleAuthException {
        zzl.zzf(intent);
        if (bundle == null) {
            bundle = new Bundle();
        }
        Bundle bundle2 = bundle;
        bundle2.putParcelable(ProtectedSandApp.s("윻"), intent);
        bundle2.putBoolean(ProtectedSandApp.s("윺"), true);
        return zzg(context, account, str, bundle2, 0L).zza();
    }

    @o0
    public static String getTokenWithNotification(@o0 Context context, @o0 Account account, @o0 String str, @o0 Bundle bundle, @o0 String str2, @o0 Bundle bundle2) throws IOException, UserRecoverableNotifiedException, GoogleAuthException {
        Preconditions.checkNotEmpty(str2, ProtectedSandApp.s("으"));
        if (bundle == null) {
            bundle = new Bundle();
        }
        Bundle bundle3 = bundle;
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        ContentResolver.validateSyncExtrasBundle(bundle2);
        bundle3.putString(ProtectedSandApp.s("윽"), str2);
        bundle3.putBundle(ProtectedSandApp.s("윾"), bundle2);
        bundle3.putBoolean(ProtectedSandApp.s("윺"), true);
        return zzg(context, account, str, bundle3, 0L).zza();
    }

    @o0
    @Deprecated
    public static String getTokenWithNotification(@o0 Context context, @o0 String str, @o0 String str2, @o0 Bundle bundle) throws IOException, UserRecoverableNotifiedException, GoogleAuthException {
        return getTokenWithNotification(context, new Account(str, ProtectedSandApp.s("윿")), str2, bundle);
    }

    @o0
    @Deprecated
    public static String getTokenWithNotification(@o0 Context context, @o0 String str, @o0 String str2, @o0 Bundle bundle, @o0 Intent intent) throws IOException, UserRecoverableNotifiedException, GoogleAuthException {
        return getTokenWithNotification(context, new Account(str, ProtectedSandApp.s("윿")), str2, bundle, intent);
    }

    @o0
    @Deprecated
    public static String getTokenWithNotification(@o0 Context context, @o0 String str, @o0 String str2, @o0 Bundle bundle, @o0 String str3, @o0 Bundle bundle2) throws IOException, UserRecoverableNotifiedException, GoogleAuthException {
        return getTokenWithNotification(context, new Account(str, ProtectedSandApp.s("윿")), str2, bundle, str3, bundle2);
    }
}
