package com.google.android.gms.fido.fido2.api.common;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes5.dex */
public abstract class RequestOptions extends AbstractSafeParcelable {
    @q0
    public abstract AuthenticationExtensions getAuthenticationExtensions();

    @o0
    public abstract byte[] getChallenge();

    @q0
    public abstract Integer getRequestId();

    @q0
    public abstract Double getTimeoutSeconds();

    @q0
    public abstract TokenBinding getTokenBinding();

    @o0
    public byte[] serializeToBytes() {
        return SafeParcelableSerializer.serializeToBytes(this);
    }
}
