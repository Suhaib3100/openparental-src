package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
@KeepForSdk
/* loaded from: classes5.dex */
public abstract class GmsClientSupervisor {

    @q0
    @m1
    static HandlerThread zza = null;
    private static final Object zzb = new Object();
    private static int zzc = 9;

    @q0
    private static zzq zzd;

    @q0
    private static Executor zze;
    private static boolean zzf;

    @KeepForSdk
    public static int getDefaultBindFlags() {
        return 4225;
    }

    @o0
    @KeepForSdk
    public static GmsClientSupervisor getInstance(@o0 Context context) {
        synchronized (zzb) {
            try {
                if (zzd == null) {
                    zzd = new zzq(context.getApplicationContext(), zzf ? getOrStartHandlerThread().getLooper() : context.getMainLooper(), zze);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzd;
    }

    @o0
    @KeepForSdk
    public static HandlerThread getOrStartHandlerThread() {
        synchronized (zzb) {
            try {
                HandlerThread handlerThread = zza;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread(ProtectedSandApp.s("쫘"), zzc);
                zza = handlerThread2;
                handlerThread2.start();
                return zza;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @KeepForSdk
    public static void setDefaultBindExecutor(@q0 Executor executor) {
        synchronized (zzb) {
            try {
                zzq zzqVar = zzd;
                if (zzqVar != null) {
                    zzqVar.zze(executor);
                }
                zze = executor;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @KeepForSdk
    public static boolean setGamHandlerThreadPriorityIfNotInitialized(int i4) {
        synchronized (zzb) {
            try {
                if (zza != null) {
                    return false;
                }
                zzc = i4;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @KeepForSdk
    public static void setUseHandlerThreadForCallbacks() {
        synchronized (zzb) {
            try {
                zzq zzqVar = zzd;
                if (zzqVar != null && !zzf) {
                    zzqVar.zzd(getOrStartHandlerThread().getLooper());
                }
                zzf = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @KeepForSdk
    public boolean bindService(@o0 ComponentName componentName, @o0 ServiceConnection serviceConnection, @o0 String str) {
        return zza(new zzn(componentName, 4225), serviceConnection, str, null).isSuccess();
    }

    @KeepForSdk
    public void unbindService(@o0 ComponentName componentName, @o0 ServiceConnection serviceConnection, @o0 String str) {
        zzc(new zzn(componentName, 4225), serviceConnection, str);
    }

    protected abstract ConnectionResult zza(zzn zznVar, ServiceConnection serviceConnection, String str, @q0 Executor executor);

    public final void zzb(@o0 String str, @o0 String str2, int i4, @o0 ServiceConnection serviceConnection, @o0 String str3, boolean z4) {
        zzc(new zzn(str, str2, 4225, z4), serviceConnection, str3);
    }

    protected abstract void zzc(zzn zznVar, ServiceConnection serviceConnection, String str);

    @KeepForSdk
    public void unbindService(@o0 String str, @o0 ServiceConnection serviceConnection, @o0 String str2) {
        zzc(new zzn(str, 4225, false), serviceConnection, str2);
    }

    @KeepForSdk
    public boolean bindService(@o0 ComponentName componentName, @o0 ServiceConnection serviceConnection, @o0 String str, @q0 Executor executor) {
        return zza(new zzn(componentName, 4225), serviceConnection, str, executor).isSuccess();
    }

    @o0
    @KeepForSdk
    public static HandlerThread getOrStartHandlerThread(int i4) {
        synchronized (zzb) {
            try {
                HandlerThread handlerThread = zza;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread(ProtectedSandApp.s("쫘"), i4);
                zza = handlerThread2;
                handlerThread2.start();
                return zza;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @KeepForSdk
    public boolean bindService(@o0 String str, @o0 ServiceConnection serviceConnection, @o0 String str2) {
        return zza(new zzn(str, 4225, false), serviceConnection, str2, null).isSuccess();
    }
}
