package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
@KeepForSdk
/* loaded from: classes5.dex */
public class BlockingServiceConnection implements ServiceConnection {
    boolean zza = false;
    private final BlockingQueue zzb = new LinkedBlockingQueue();

    @o0
    @KeepForSdk
    public IBinder getService() throws InterruptedException {
        Preconditions.checkNotMainThread(ProtectedSandApp.s("줥"));
        if (this.zza) {
            throw new IllegalStateException(ProtectedSandApp.s("줦"));
        }
        this.zza = true;
        return (IBinder) this.zzb.take();
    }

    @o0
    @KeepForSdk
    public IBinder getServiceWithTimeout(long j4, @o0 TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        Preconditions.checkNotMainThread(ProtectedSandApp.s("줧"));
        if (this.zza) {
            throw new IllegalStateException(ProtectedSandApp.s("줦"));
        }
        this.zza = true;
        IBinder iBinder = (IBinder) this.zzb.poll(j4, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException(ProtectedSandApp.s("줨"));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(@o0 ComponentName componentName, @o0 IBinder iBinder) {
        this.zzb.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(@o0 ComponentName componentName) {
    }
}
