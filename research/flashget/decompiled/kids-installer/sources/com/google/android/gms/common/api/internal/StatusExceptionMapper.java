package com.google.android.gms.common.api.internal;

import androidx.annotation.o0;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public interface StatusExceptionMapper {
    @o0
    @KeepForSdk
    Exception getException(@o0 Status status);
}
