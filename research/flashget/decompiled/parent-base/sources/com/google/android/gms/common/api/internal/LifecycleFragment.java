package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
@KeepForSdk
/* loaded from: classes5.dex */
public interface LifecycleFragment {
    @KeepForSdk
    void addCallback(@o0 String str, @o0 LifecycleCallback lifecycleCallback);

    @q0
    @KeepForSdk
    <T extends LifecycleCallback> T getCallbackOrNull(@o0 String str, @o0 Class<T> cls);

    @q0
    @KeepForSdk
    Activity getLifecycleActivity();

    @KeepForSdk
    boolean isCreated();

    @KeepForSdk
    boolean isStarted();

    @KeepForSdk
    void startActivityForResult(@o0 Intent intent, int i4);
}
