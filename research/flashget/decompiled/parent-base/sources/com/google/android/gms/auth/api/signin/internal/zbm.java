package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.PendingResults;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.logging.Logger;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
/* loaded from: classes5.dex */
public final class zbm {
    private static final Logger zba = new Logger(ProtectedSandApp.s("조"), new String[0]);

    public static Intent zba(Context context, GoogleSignInOptions googleSignInOptions) {
        zba.d(ProtectedSandApp.s("족"), new Object[0]);
        Intent zbc = zbc(context, googleSignInOptions);
        zbc.setAction(ProtectedSandApp.s("졲"));
        return zbc;
    }

    public static Intent zbb(Context context, GoogleSignInOptions googleSignInOptions) {
        zba.d(ProtectedSandApp.s("졳"), new Object[0]);
        Intent zbc = zbc(context, googleSignInOptions);
        zbc.setAction(ProtectedSandApp.s("존"));
        return zbc;
    }

    public static Intent zbc(Context context, GoogleSignInOptions googleSignInOptions) {
        zba.d(ProtectedSandApp.s("졵"), new Object[0]);
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), googleSignInOptions);
        Intent intent = new Intent(ProtectedSandApp.s("졶"));
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        String s4 = ProtectedSandApp.s("졷");
        bundle.putParcelable(s4, signInConfiguration);
        intent.putExtra(s4, bundle);
        return intent;
    }

    @q0
    public static GoogleSignInResult zbd(@q0 Intent intent) {
        if (intent == null) {
            return new GoogleSignInResult(null, Status.RESULT_INTERNAL_ERROR);
        }
        Status status = (Status) intent.getParcelableExtra(ProtectedSandApp.s("졸"));
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) intent.getParcelableExtra(ProtectedSandApp.s("졹"));
        if (googleSignInAccount != null) {
            return new GoogleSignInResult(googleSignInAccount, Status.RESULT_SUCCESS);
        }
        if (status == null) {
            status = Status.RESULT_INTERNAL_ERROR;
        }
        return new GoogleSignInResult(null, status);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.common.api.OptionalPendingResult zbe(com.google.android.gms.common.api.GoogleApiClient r6, android.content.Context r7, com.google.android.gms.auth.api.signin.GoogleSignInOptions r8, boolean r9) {
        /*
            com.google.android.gms.common.logging.Logger r0 = com.google.android.gms.auth.api.signin.internal.zbm.zba
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = "졺"
            java.lang.String r3 = com.flashget.parentalcontrol.ProtectedSandApp.s(r3)
            r0.d(r3, r2)
            java.lang.String r2 = "졻"
            java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)
            java.lang.Object[] r3 = new java.lang.Object[r1]
            r0.d(r2, r3)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r8)
            com.google.android.gms.auth.api.signin.internal.zbn r2 = com.google.android.gms.auth.api.signin.internal.zbn.zbc(r7)
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r2 = r2.zbb()
            r3 = 0
            if (r2 != 0) goto L2a
        L27:
            r4 = r3
            goto L91
        L2a:
            android.accounts.Account r4 = r2.getAccount()
            android.accounts.Account r5 = r8.getAccount()
            if (r4 != 0) goto L37
            if (r5 != 0) goto L27
            goto L3e
        L37:
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L3e
            goto L27
        L3e:
            boolean r4 = r8.isServerAuthCodeRequested()
            if (r4 == 0) goto L45
            goto L27
        L45:
            boolean r4 = r8.isIdTokenRequested()
            if (r4 == 0) goto L61
            boolean r4 = r2.isIdTokenRequested()
            if (r4 != 0) goto L52
            goto L27
        L52:
            java.lang.String r4 = r8.getServerClientId()
            java.lang.String r5 = r2.getServerClientId()
            boolean r4 = com.google.android.gms.common.internal.Objects.equal(r4, r5)
            if (r4 != 0) goto L61
            goto L27
        L61:
            java.util.HashSet r4 = new java.util.HashSet
            java.util.ArrayList r2 = r2.getScopes()
            r4.<init>(r2)
            java.util.HashSet r2 = new java.util.HashSet
            java.util.ArrayList r5 = r8.getScopes()
            r2.<init>(r5)
            boolean r2 = r4.containsAll(r2)
            if (r2 != 0) goto L7a
            goto L27
        L7a:
            com.google.android.gms.auth.api.signin.internal.zbn r2 = com.google.android.gms.auth.api.signin.internal.zbn.zbc(r7)
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r2 = r2.zba()
            if (r2 == 0) goto L27
            boolean r4 = r2.isExpired()
            if (r4 != 0) goto L27
            com.google.android.gms.auth.api.signin.GoogleSignInResult r4 = new com.google.android.gms.auth.api.signin.GoogleSignInResult
            com.google.android.gms.common.api.Status r5 = com.google.android.gms.common.api.Status.RESULT_SUCCESS
            r4.<init>(r2, r5)
        L91:
            if (r4 == 0) goto La3
            java.lang.Object[] r7 = new java.lang.Object[r1]
            java.lang.String r8 = "졼"
            java.lang.String r8 = com.flashget.parentalcontrol.ProtectedSandApp.s(r8)
            r0.d(r8, r7)
            com.google.android.gms.common.api.OptionalPendingResult r6 = com.google.android.gms.common.api.PendingResults.immediatePendingResult(r4, r6)
            return r6
        La3:
            if (r9 == 0) goto Lb5
            com.google.android.gms.auth.api.signin.GoogleSignInResult r7 = new com.google.android.gms.auth.api.signin.GoogleSignInResult
            com.google.android.gms.common.api.Status r8 = new com.google.android.gms.common.api.Status
            r9 = 4
            r8.<init>(r9)
            r7.<init>(r3, r8)
            com.google.android.gms.common.api.OptionalPendingResult r6 = com.google.android.gms.common.api.PendingResults.immediatePendingResult(r7, r6)
            return r6
        Lb5:
            java.lang.Object[] r9 = new java.lang.Object[r1]
            java.lang.String r1 = "졽"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
            r0.d(r1, r9)
            com.google.android.gms.auth.api.signin.internal.zbg r9 = new com.google.android.gms.auth.api.signin.internal.zbg
            r9.<init>(r6, r7, r8)
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r6 = r6.enqueue(r9)
            com.google.android.gms.common.api.internal.OptionalPendingResultImpl r7 = new com.google.android.gms.common.api.internal.OptionalPendingResultImpl
            r7.<init>(r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.internal.zbm.zbe(com.google.android.gms.common.api.GoogleApiClient, android.content.Context, com.google.android.gms.auth.api.signin.GoogleSignInOptions, boolean):com.google.android.gms.common.api.OptionalPendingResult");
    }

    public static PendingResult zbf(GoogleApiClient googleApiClient, Context context, boolean z4) {
        zba.d(ProtectedSandApp.s("졾"), new Object[0]);
        String savedRefreshToken = Storage.getInstance(context).getSavedRefreshToken();
        zbh(context);
        return z4 ? zbb.zba(savedRefreshToken) : googleApiClient.execute(new zbk(googleApiClient));
    }

    public static PendingResult zbg(GoogleApiClient googleApiClient, Context context, boolean z4) {
        zba.d(ProtectedSandApp.s("졿"), new Object[0]);
        zbh(context);
        return z4 ? PendingResults.immediatePendingResult(Status.RESULT_SUCCESS, googleApiClient) : googleApiClient.execute(new zbi(googleApiClient));
    }

    private static void zbh(Context context) {
        zbn.zbc(context).zbd();
        Iterator<GoogleApiClient> it = GoogleApiClient.getAllClients().iterator();
        while (it.hasNext()) {
            it.next().maybeSignOut();
        }
        GoogleApiManager.reportSignOut();
    }
}
