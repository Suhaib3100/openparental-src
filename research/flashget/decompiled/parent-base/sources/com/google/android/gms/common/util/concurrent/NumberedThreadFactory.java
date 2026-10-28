package com.google.android.gms.common.util.concurrent;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
@KeepForSdk
/* loaded from: classes5.dex */
public class NumberedThreadFactory implements ThreadFactory {
    private final String zza;
    private final AtomicInteger zzb = new AtomicInteger();
    private final ThreadFactory zzc = Executors.defaultThreadFactory();

    @KeepForSdk
    public NumberedThreadFactory(@o0 String str) {
        Preconditions.checkNotNull(str, ProtectedSandApp.s("찧"));
        this.zza = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    @o0
    public final Thread newThread(@o0 Runnable runnable) {
        Thread newThread = this.zzc.newThread(new zza(runnable, 0));
        int andIncrement = this.zzb.getAndIncrement();
        int length = String.valueOf(andIncrement).length();
        String str = this.zza;
        StringBuilder sb = new StringBuilder(str.length() + 1 + length + 1);
        sb.append(str);
        sb.append(ProtectedSandApp.s("차"));
        sb.append(andIncrement);
        sb.append(ProtectedSandApp.s("착"));
        newThread.setName(sb.toString());
        return newThread;
    }
}
