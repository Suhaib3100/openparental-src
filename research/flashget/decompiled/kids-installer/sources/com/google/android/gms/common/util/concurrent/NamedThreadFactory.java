package com.google.android.gms.common.util.concurrent;

import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public class NamedThreadFactory implements ThreadFactory {
    private final String zza;
    private final ThreadFactory zzb = Executors.defaultThreadFactory();

    @KeepForSdk
    public NamedThreadFactory(@o0 String str) {
        Preconditions.checkNotNull(str, ProtectedSandApp.s("ಒ"));
        this.zza = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    @o0
    public final Thread newThread(@o0 Runnable runnable) {
        Thread newThread = this.zzb.newThread(new zza(runnable, 0));
        newThread.setName(this.zza);
        return newThread;
    }
}
