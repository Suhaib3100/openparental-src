package com.google.android.gms.auth.api.signin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.fragment.app.Fragment;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.zbm;
import com.google.android.gms.auth.api.signin.internal.zbn;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
@Deprecated
/* loaded from: classes5.dex */
public final class GoogleSignIn {
    private GoogleSignIn() {
    }

    @o0
    public static GoogleSignInAccount getAccountForExtension(@o0 Context context, @o0 GoogleSignInOptionsExtension googleSignInOptionsExtension) {
        Preconditions.checkNotNull(context, ProtectedSandApp.s("쟩"));
        Preconditions.checkNotNull(googleSignInOptionsExtension, ProtectedSandApp.s("쟪"));
        GoogleSignInAccount lastSignedInAccount = getLastSignedInAccount(context);
        if (lastSignedInAccount == null) {
            lastSignedInAccount = GoogleSignInAccount.createDefault();
        }
        return lastSignedInAccount.requestExtraScopes(zbb(googleSignInOptionsExtension.getImpliedScopes()));
    }

    @o0
    public static GoogleSignInAccount getAccountForScopes(@o0 Context context, @o0 Scope scope, @o0 Scope... scopeArr) {
        Preconditions.checkNotNull(context, ProtectedSandApp.s("쟩"));
        Preconditions.checkNotNull(scope, ProtectedSandApp.s("쟫"));
        GoogleSignInAccount lastSignedInAccount = getLastSignedInAccount(context);
        if (lastSignedInAccount == null) {
            lastSignedInAccount = GoogleSignInAccount.createDefault();
        }
        lastSignedInAccount.requestExtraScopes(scope);
        lastSignedInAccount.requestExtraScopes(scopeArr);
        return lastSignedInAccount;
    }

    @o0
    public static GoogleSignInClient getClient(@o0 Activity activity, @o0 GoogleSignInOptions googleSignInOptions) {
        return new GoogleSignInClient(activity, (GoogleSignInOptions) Preconditions.checkNotNull(googleSignInOptions));
    }

    @q0
    public static GoogleSignInAccount getLastSignedInAccount(@o0 Context context) {
        return zbn.zbc(context).zba();
    }

    @o0
    public static Task<GoogleSignInAccount> getSignedInAccountFromIntent(@q0 Intent intent) {
        GoogleSignInResult zbd = zbm.zbd(intent);
        GoogleSignInAccount signInAccount = zbd.getSignInAccount();
        return (!zbd.getStatus().isSuccess() || signInAccount == null) ? Tasks.forException(ApiExceptionUtil.fromStatus(zbd.getStatus())) : Tasks.forResult(signInAccount);
    }

    public static boolean hasPermissions(@q0 GoogleSignInAccount googleSignInAccount, @o0 GoogleSignInOptionsExtension googleSignInOptionsExtension) {
        Preconditions.checkNotNull(googleSignInOptionsExtension, ProtectedSandApp.s("쟬"));
        return hasPermissions(googleSignInAccount, zbb(googleSignInOptionsExtension.getImpliedScopes()));
    }

    public static void requestPermissions(@o0 Activity activity, int i4, @q0 GoogleSignInAccount googleSignInAccount, @o0 GoogleSignInOptionsExtension googleSignInOptionsExtension) {
        Preconditions.checkNotNull(activity, ProtectedSandApp.s("쟭"));
        Preconditions.checkNotNull(googleSignInOptionsExtension, ProtectedSandApp.s("쟬"));
        requestPermissions(activity, i4, googleSignInAccount, zbb(googleSignInOptionsExtension.getImpliedScopes()));
    }

    @o0
    private static Intent zba(@o0 Activity activity, @q0 GoogleSignInAccount googleSignInAccount, @o0 Scope... scopeArr) {
        GoogleSignInOptions.Builder builder = new GoogleSignInOptions.Builder();
        if (scopeArr.length > 0) {
            builder.requestScopes(scopeArr[0], scopeArr);
        }
        if (googleSignInAccount != null && !TextUtils.isEmpty(googleSignInAccount.getEmail())) {
            builder.setAccountName((String) Preconditions.checkNotNull(googleSignInAccount.getEmail()));
        }
        return new GoogleSignInClient(activity, builder.build()).getSignInIntent();
    }

    @o0
    private static Scope[] zbb(@q0 List list) {
        return list == null ? new Scope[0] : (Scope[]) list.toArray(new Scope[list.size()]);
    }

    @o0
    public static GoogleSignInClient getClient(@o0 Context context, @o0 GoogleSignInOptions googleSignInOptions) {
        return new GoogleSignInClient(context, (GoogleSignInOptions) Preconditions.checkNotNull(googleSignInOptions));
    }

    public static boolean hasPermissions(@q0 GoogleSignInAccount googleSignInAccount, @o0 Scope... scopeArr) {
        if (googleSignInAccount == null) {
            return false;
        }
        HashSet hashSet = new HashSet();
        Collections.addAll(hashSet, scopeArr);
        return googleSignInAccount.getGrantedScopes().containsAll(hashSet);
    }

    public static void requestPermissions(@o0 Activity activity, int i4, @q0 GoogleSignInAccount googleSignInAccount, @o0 Scope... scopeArr) {
        Preconditions.checkNotNull(activity, ProtectedSandApp.s("쟭"));
        Preconditions.checkNotNull(scopeArr, ProtectedSandApp.s("쟮"));
        activity.startActivityForResult(zba(activity, googleSignInAccount, scopeArr), i4);
    }

    public static void requestPermissions(@o0 Fragment fragment, int i4, @q0 GoogleSignInAccount googleSignInAccount, @o0 GoogleSignInOptionsExtension googleSignInOptionsExtension) {
        Preconditions.checkNotNull(fragment, ProtectedSandApp.s("쟯"));
        Preconditions.checkNotNull(googleSignInOptionsExtension, ProtectedSandApp.s("쟬"));
        requestPermissions(fragment, i4, googleSignInAccount, zbb(googleSignInOptionsExtension.getImpliedScopes()));
    }

    public static void requestPermissions(@o0 Fragment fragment, int i4, @q0 GoogleSignInAccount googleSignInAccount, @o0 Scope... scopeArr) {
        Preconditions.checkNotNull(fragment, ProtectedSandApp.s("쟯"));
        Preconditions.checkNotNull(scopeArr, ProtectedSandApp.s("쟮"));
        fragment.startActivityForResult(zba(fragment.getActivity(), googleSignInAccount, scopeArr), i4);
    }
}
