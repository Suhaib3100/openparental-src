package com.google.android.gms.auth.api.identity;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.o0;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p000authapi.zbaa;
import com.google.android.gms.internal.p000authapi.zbag;
import com.google.android.gms.internal.p000authapi.zbaq;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
/* loaded from: classes5.dex */
public final class Identity {
    private Identity() {
    }

    @o0
    public static AuthorizationClient getAuthorizationClient(@o0 Activity activity) {
        return new zbaa((Activity) Preconditions.checkNotNull(activity), new zbb(null).zbb());
    }

    @o0
    public static CredentialSavingClient getCredentialSavingClient(@o0 Activity activity) {
        return new zbag((Activity) Preconditions.checkNotNull(activity), new zbi());
    }

    @o0
    public static SignInClient getSignInClient(@o0 Activity activity) {
        return new zbaq((Activity) Preconditions.checkNotNull(activity), new zbv());
    }

    @o0
    public static AuthorizationClient getAuthorizationClient(@o0 Context context) {
        return new zbaa((Context) Preconditions.checkNotNull(context), new zbb(null).zbb());
    }

    @o0
    public static CredentialSavingClient getCredentialSavingClient(@o0 Context context) {
        return new zbag((Context) Preconditions.checkNotNull(context), new zbi());
    }

    @o0
    public static SignInClient getSignInClient(@o0 Context context) {
        return new zbaq((Context) Preconditions.checkNotNull(context), new zbv());
    }
}
