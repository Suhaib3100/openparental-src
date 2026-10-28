package com.google.android.gms.auth.api.signin;

import android.os.Bundle;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Scope;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
@Deprecated
/* loaded from: classes5.dex */
public interface GoogleSignInOptionsExtension {

    @KeepForSdk
    public static final int FITNESS = 3;

    @KeepForSdk
    public static final int GAMES = 1;

    @KeepForSdk
    int getExtensionType();

    @q0
    @KeepForSdk
    List<Scope> getImpliedScopes();

    @o0
    @KeepForSdk
    Bundle toBundle();
}
