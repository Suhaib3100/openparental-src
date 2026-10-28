package com.google.android.gms.common.stats;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import androidx.annotation.m1;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzr;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import zc.h;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
@KeepForSdk
/* loaded from: classes5.dex */
public class ConnectionTracker {
    private static final Object zzb = new Object();

    @h
    private static volatile ConnectionTracker zzc;

    @o0
    @m1
    public final ConcurrentHashMap zza = new ConcurrentHashMap();

    private ConnectionTracker() {
    }

    @o0
    @KeepForSdk
    public static ConnectionTracker getInstance() {
        if (zzc == null) {
            synchronized (zzb) {
                try {
                    if (zzc == null) {
                        zzc = new ConnectionTracker();
                    }
                } finally {
                }
            }
        }
        ConnectionTracker connectionTracker = zzc;
        Preconditions.checkNotNull(connectionTracker);
        return connectionTracker;
    }

    private final boolean zzb(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i4, boolean z4, @h Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            ProtectedSandApp.s("쯅").equals(packageName);
            try {
                if ((Wrappers.packageManager(context).getApplicationInfo(packageName, 0).flags & 2097152) != 0) {
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (!zzc(serviceConnection)) {
            return zze(context, intent, serviceConnection, i4, executor);
        }
        ServiceConnection serviceConnection2 = (ServiceConnection) this.zza.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            String.format(ProtectedSandApp.s("쯆"), serviceConnection, str, intent.getAction());
        }
        try {
            boolean zze = zze(context, intent, serviceConnection, i4, executor);
            if (zze) {
                return zze;
            }
            return false;
        } finally {
            this.zza.remove(serviceConnection, serviceConnection);
        }
    }

    private static boolean zzc(ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof zzr);
    }

    private static void zzd(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    private static final boolean zze(Context context, Intent intent, ServiceConnection serviceConnection, int i4, @h Executor executor) {
        boolean bindService;
        if (executor == null) {
            executor = null;
        }
        if (!PlatformVersion.isAtLeastQ() || executor == null) {
            return context.bindService(intent, serviceConnection, i4);
        }
        bindService = context.bindService(intent, i4, executor, serviceConnection);
        return bindService;
    }

    @KeepForSdk
    public boolean bindService(@o0 Context context, @o0 Intent intent, @o0 ServiceConnection serviceConnection, int i4) {
        return zzb(context, context.getClass().getName(), intent, serviceConnection, i4, true, null);
    }

    @KeepForSdk
    public void unbindService(@o0 Context context, @o0 ServiceConnection serviceConnection) {
        if (zzc(serviceConnection)) {
            ConcurrentHashMap concurrentHashMap = this.zza;
            if (concurrentHashMap.containsKey(serviceConnection)) {
                try {
                    zzd(context, (ServiceConnection) concurrentHashMap.get(serviceConnection));
                    return;
                } finally {
                    this.zza.remove(serviceConnection);
                }
            }
        }
        zzd(context, serviceConnection);
    }

    @KeepForSdk
    public void unbindServiceSafe(@o0 Context context, @o0 ServiceConnection serviceConnection) {
        try {
            unbindService(context, serviceConnection);
        } catch (IllegalArgumentException unused) {
        }
    }

    public final boolean zza(@o0 Context context, @o0 String str, @o0 Intent intent, @o0 ServiceConnection serviceConnection, int i4, @h Executor executor) {
        return zzb(context, str, intent, serviceConnection, 4225, true, executor);
    }
}
