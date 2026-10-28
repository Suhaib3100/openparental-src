package com.google.android.gms.internal.auth;

import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.io.UnsupportedEncodingException;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes5.dex */
public abstract class zzbz extends FastSafeParcelableJsonResponse {
    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    @q0
    public final byte[] toByteArray() {
        try {
            return toString().getBytes(ProtectedSandApp.s("잗"));
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }
}
