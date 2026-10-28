package com.google.android.gms.common.util.concurrent;

import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public class NumberedThreadFactory implements ThreadFactory {
    private final String zza;
    private final AtomicInteger zzb = new AtomicInteger();
    private final ThreadFactory zzc = Executors.defaultThreadFactory();

    @KeepForSdk
    public NumberedThreadFactory(@o0 String str) {
        Preconditions.checkNotNull(str, ProtectedSandApp.s("ಓ"));
        this.zza = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    @o0
    public final Thread newThread(@o0 Runnable runnable) {
        Thread newThread = this.zzc.newThread(new zza(runnable, 0));
        newThread.setName(this.zza + ProtectedSandApp.s("ಔ") + this.zzb.getAndIncrement() + ProtectedSandApp.s("ಕ"));
        return newThread;
    }
}
