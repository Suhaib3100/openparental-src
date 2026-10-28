package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public abstract class GmsClientSupervisor {

    @q0
    @VisibleForTesting
    static HandlerThread zza = null;
    private static int zzb = 4225;
    private static final Object zzc = new Object();

    @q0
    private static zzr zzd;
    private static boolean zze;

    @KeepForSdk
    public static int getDefaultBindFlags() {
        return zzb;
    }

    @o0
    @KeepForSdk
    public static GmsClientSupervisor getInstance(@o0 Context context) {
        synchronized (zzc) {
            if (zzd == null) {
                zzd = new zzr(context.getApplicationContext(), zze ? getOrStartHandlerThread().getLooper() : context.getMainLooper());
            }
        }
        return zzd;
    }

    @o0
    @KeepForSdk
    public static HandlerThread getOrStartHandlerThread() {
        synchronized (zzc) {
            HandlerThread handlerThread = zza;
            if (handlerThread != null) {
                return handlerThread;
            }
            HandlerThread handlerThread2 = new HandlerThread(ProtectedSandApp.s("୧"), 9);
            zza = handlerThread2;
            handlerThread2.start();
            return zza;
        }
    }

    @KeepForSdk
    public static void setUseHandlerThreadForCallbacks() {
        synchronized (zzc) {
            zzr zzrVar = zzd;
            if (zzrVar != null && !zze) {
                zzrVar.zzi(getOrStartHandlerThread().getLooper());
            }
            zze = true;
        }
    }

    @KeepForSdk
    public boolean bindService(@o0 ComponentName componentName, @o0 ServiceConnection serviceConnection, @o0 String str) {
        return zzc(new zzn(componentName, getDefaultBindFlags()), serviceConnection, str, null);
    }

    @KeepForSdk
    public void unbindService(@o0 ComponentName componentName, @o0 ServiceConnection serviceConnection, @o0 String str) {
        zza(new zzn(componentName, getDefaultBindFlags()), serviceConnection, str);
    }

    protected abstract void zza(zzn zznVar, ServiceConnection serviceConnection, String str);

    public final void zzb(@o0 String str, @o0 String str2, int i5, @o0 ServiceConnection serviceConnection, @o0 String str3, boolean z5) {
        zza(new zzn(str, str2, i5, z5), serviceConnection, str3);
    }

    protected abstract boolean zzc(zzn zznVar, ServiceConnection serviceConnection, String str, @q0 Executor executor);

    @KeepForSdk
    public boolean bindService(@o0 String str, @o0 ServiceConnection serviceConnection, @o0 String str2) {
        return zzc(new zzn(str, getDefaultBindFlags(), false), serviceConnection, str2, null);
    }

    @KeepForSdk
    public void unbindService(@o0 String str, @o0 ServiceConnection serviceConnection, @o0 String str2) {
        zza(new zzn(str, getDefaultBindFlags(), false), serviceConnection, str2);
    }
}
