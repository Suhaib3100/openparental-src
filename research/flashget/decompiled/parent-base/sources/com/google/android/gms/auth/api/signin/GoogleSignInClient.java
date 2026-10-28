package com.google.android.gms.auth.api.signin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.m1;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.internal.zbm;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
@Deprecated
/* loaded from: classes5.dex */
public class GoogleSignInClient extends GoogleApi<GoogleSignInOptions> {
    private static final zbb zbb = new zbb(null);

    @m1
    static int zba = 1;

    GoogleSignInClient(@o0 Activity activity, GoogleSignInOptions googleSignInOptions) {
        super(activity, Auth.GOOGLE_SIGN_IN_API, googleSignInOptions, (StatusExceptionMapper) new ApiExceptionMapper());
    }

    private final synchronized int zba() {
        int i4;
        try {
            i4 = zba;
            if (i4 == 1) {
                Context applicationContext = getApplicationContext();
                GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
                int isGooglePlayServicesAvailable = googleApiAvailability.isGooglePlayServicesAvailable(applicationContext, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
                if (isGooglePlayServicesAvailable == 0) {
                    i4 = 4;
                    zba = 4;
                } else if (googleApiAvailability.getErrorResolutionIntent(applicationContext, isGooglePlayServicesAvailable, null) != null || DynamiteModule.getLocalVersion(applicationContext, ProtectedSandApp.s("쟾")) == 0) {
                    i4 = 2;
                    zba = 2;
                } else {
                    i4 = 3;
                    zba = 3;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return i4;
    }

    @o0
    public Intent getSignInIntent() {
        Context applicationContext = getApplicationContext();
        int zba2 = zba();
        int i4 = zba2 - 1;
        if (zba2 != 0) {
            return i4 != 2 ? i4 != 3 ? zbm.zbb(applicationContext, getApiOptions()) : zbm.zbc(applicationContext, getApiOptions()) : zbm.zba(applicationContext, getApiOptions());
        }
        throw null;
    }

    @o0
    public Task<Void> revokeAccess() {
        return PendingResultUtil.toVoidTask(zbm.zbf(asGoogleApiClient(), getApplicationContext(), zba() == 3));
    }

    @o0
    public Task<Void> signOut() {
        return PendingResultUtil.toVoidTask(zbm.zbg(asGoogleApiClient(), getApplicationContext(), zba() == 3));
    }

    @o0
    public Task<GoogleSignInAccount> silentSignIn() {
        return PendingResultUtil.toTask(zbm.zbe(asGoogleApiClient(), getApplicationContext(), getApiOptions(), zba() == 3), zbb);
    }

    GoogleSignInClient(@o0 Context context, GoogleSignInOptions googleSignInOptions) {
        super(context, Auth.GOOGLE_SIGN_IN_API, googleSignInOptions, new GoogleApi.Settings.Builder().setMapper(new ApiExceptionMapper()).build());
    }
}
