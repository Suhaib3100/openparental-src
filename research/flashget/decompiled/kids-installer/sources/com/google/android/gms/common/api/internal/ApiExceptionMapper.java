package com.google.android.gms.common.api.internal;

import androidx.annotation.o0;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ApiExceptionUtil;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
/* loaded from: classes3.dex */
public class ApiExceptionMapper implements StatusExceptionMapper {
    @Override // com.google.android.gms.common.api.internal.StatusExceptionMapper
    @o0
    public final Exception getException(@o0 Status status) {
        return ApiExceptionUtil.fromStatus(status);
    }
}
