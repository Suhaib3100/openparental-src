package com.google.android.gms.signin;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes4.dex */
public final class SignInOptions implements Api.ApiOptions.Optional {

    @o0
    public static final SignInOptions zaa = new SignInOptions(false, false, null, false, null, null, false, null, null, null);
    private final boolean zab = false;
    private final boolean zac = false;

    @q0
    private final String zad = null;
    private final boolean zae = false;
    private final boolean zah = false;

    @q0
    private final String zaf = null;

    @q0
    private final String zag = null;

    @q0
    private final Long zai = null;

    @q0
    private final Long zaj = null;

    /* synthetic */ SignInOptions(boolean z5, boolean z6, String str, boolean z7, String str2, String str3, boolean z8, Long l5, Long l6, zaf zafVar) {
    }

    public final boolean equals(@q0 Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SignInOptions)) {
            return false;
        }
        boolean z5 = ((SignInOptions) obj).zab;
        return Objects.equal(null, null) && Objects.equal(null, null) && Objects.equal(null, null) && Objects.equal(null, null) && Objects.equal(null, null);
    }

    public final int hashCode() {
        Boolean bool = Boolean.FALSE;
        return Objects.hashCode(bool, bool, null, bool, bool, null, null, null, null);
    }
}
