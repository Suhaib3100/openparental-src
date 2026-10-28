package com.google.android.gms.fido.fido2.api.common;

import android.net.Uri;
import androidx.annotation.o0;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes5.dex */
public abstract class BrowserRequestOptions extends RequestOptions {
    @o0
    public abstract byte[] getClientDataHash();

    @o0
    public abstract Uri getOrigin();
}
