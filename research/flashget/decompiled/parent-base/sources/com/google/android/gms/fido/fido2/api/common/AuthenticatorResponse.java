package com.google.android.gms.fido.fido2.api.common;

import androidx.annotation.o0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes5.dex */
public abstract class AuthenticatorResponse extends AbstractSafeParcelable {
    @o0
    public abstract byte[] getClientDataJSON();

    @o0
    public abstract byte[] serializeToBytes();
}
