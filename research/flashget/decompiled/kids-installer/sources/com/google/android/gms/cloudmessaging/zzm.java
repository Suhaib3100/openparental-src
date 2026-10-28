package com.google.android.gms.cloudmessaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.l0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* loaded from: classes2.dex */
final class zzm implements ServiceConnection {
    zzn zzc;
    final /* synthetic */ zzs zzf;

    @GuardedBy("this")
    int zza = 0;
    final Messenger zzb = new Messenger(new com.google.android.gms.internal.cloudmessaging.zzf(Looper.getMainLooper(), new Handler.Callback() { // from class: com.google.android.gms.cloudmessaging.zzf
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            zzm zzmVar = zzm.this;
            int i5 = message.arg1;
            Log.isLoggable(ProtectedSandApp.s("৮"), 3);
            synchronized (zzmVar) {
                zzp<?> zzpVar = zzmVar.zze.get(i5);
                if (zzpVar == null) {
                    return true;
                }
                zzmVar.zze.remove(i5);
                zzmVar.zzf();
                Bundle data = message.getData();
                if (data.getBoolean(ProtectedSandApp.s("৯"), false)) {
                    zzpVar.zzc(new zzq(4, ProtectedSandApp.s("ৰ"), null));
                    return true;
                }
                zzpVar.zza(data);
                return true;
            }
        }
    }));

    @GuardedBy("this")
    final Queue<zzp<?>> zzd = new ArrayDeque();

    @GuardedBy("this")
    final SparseArray<zzp<?>> zze = new SparseArray<>();

    /* synthetic */ zzm(zzs zzsVar, zzl zzlVar) {
        this.zzf = zzsVar;
    }

    @Override // android.content.ServiceConnection
    @l0
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        ScheduledExecutorService scheduledExecutorService;
        Log.isLoggable(ProtectedSandApp.s("৷"), 2);
        scheduledExecutorService = this.zzf.zzc;
        scheduledExecutorService.execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzj
            @Override // java.lang.Runnable
            public final void run() {
                zzm zzmVar = zzm.this;
                IBinder iBinder2 = iBinder;
                synchronized (zzmVar) {
                    try {
                        if (iBinder2 == null) {
                            zzmVar.zza(0, ProtectedSandApp.s("৶"));
                            return;
                        }
                        try {
                            zzmVar.zzc = new zzn(iBinder2);
                            zzmVar.zza = 2;
                            zzmVar.zzc();
                        } catch (RemoteException e6) {
                            zzmVar.zza(0, e6.getMessage());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    @l0
    public final void onServiceDisconnected(ComponentName componentName) {
        ScheduledExecutorService scheduledExecutorService;
        Log.isLoggable(ProtectedSandApp.s("৸"), 2);
        scheduledExecutorService = this.zzf.zzc;
        scheduledExecutorService.execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzg
            @Override // java.lang.Runnable
            public final void run() {
                zzm.this.zza(2, ProtectedSandApp.s("ৱ"));
            }
        });
    }

    final synchronized void zza(int i5, @q0 String str) {
        zzb(i5, str, null);
    }

    final synchronized void zzb(int i5, @q0 String str, @q0 Throwable th) {
        Context context;
        if (Log.isLoggable(ProtectedSandApp.s("৹"), 3)) {
            String valueOf = String.valueOf(str);
            String s5 = ProtectedSandApp.s("৺");
            if (valueOf.length() != 0) {
                s5.concat(valueOf);
            }
        }
        int i6 = this.zza;
        if (i6 == 0) {
            throw new IllegalStateException();
        }
        if (i6 != 1 && i6 != 2) {
            if (i6 != 3) {
                return;
            }
            this.zza = 4;
            return;
        }
        Log.isLoggable(ProtectedSandApp.s("৻"), 2);
        this.zza = 4;
        ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
        context = this.zzf.zzb;
        connectionTracker.unbindService(context, this);
        zzq zzqVar = new zzq(i5, str, th);
        Iterator<zzp<?>> it = this.zzd.iterator();
        while (it.hasNext()) {
            it.next().zzc(zzqVar);
        }
        this.zzd.clear();
        for (int i7 = 0; i7 < this.zze.size(); i7++) {
            this.zze.valueAt(i7).zzc(zzqVar);
        }
        this.zze.clear();
    }

    final void zzc() {
        ScheduledExecutorService scheduledExecutorService;
        scheduledExecutorService = this.zzf.zzc;
        scheduledExecutorService.execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzh
            @Override // java.lang.Runnable
            public final void run() {
                final zzp<?> poll;
                ScheduledExecutorService scheduledExecutorService2;
                Context context;
                final zzm zzmVar = zzm.this;
                while (true) {
                    synchronized (zzmVar) {
                        if (zzmVar.zza != 2) {
                            return;
                        }
                        if (zzmVar.zzd.isEmpty()) {
                            zzmVar.zzf();
                            return;
                        }
                        poll = zzmVar.zzd.poll();
                        zzmVar.zze.put(poll.zza, poll);
                        scheduledExecutorService2 = zzmVar.zzf.zzc;
                        scheduledExecutorService2.schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzk
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzm.this.zze(poll.zza);
                            }
                        }, 30L, TimeUnit.SECONDS);
                    }
                    if (Log.isLoggable(ProtectedSandApp.s("৲"), 3)) {
                        new StringBuilder(String.valueOf(poll).length() + 8);
                    }
                    context = zzmVar.zzf.zzb;
                    Messenger messenger = zzmVar.zzb;
                    Message obtain = Message.obtain();
                    obtain.what = poll.zzc;
                    obtain.arg1 = poll.zza;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean(ProtectedSandApp.s("৳"), poll.zzb());
                    bundle.putString(ProtectedSandApp.s("৴"), context.getPackageName());
                    bundle.putBundle(ProtectedSandApp.s("৵"), poll.zzd);
                    obtain.setData(bundle);
                    try {
                        zzmVar.zzc.zza(obtain);
                    } catch (RemoteException e6) {
                        zzmVar.zza(2, e6.getMessage());
                    }
                }
            }
        });
    }

    final synchronized void zzd() {
        if (this.zza == 1) {
            zza(1, ProtectedSandApp.s("ৼ"));
        }
    }

    final synchronized void zze(int i5) {
        zzp<?> zzpVar = this.zze.get(i5);
        if (zzpVar != null) {
            this.zze.remove(i5);
            zzpVar.zzc(new zzq(3, ProtectedSandApp.s("৽"), null));
            zzf();
        }
    }

    final synchronized void zzf() {
        Context context;
        if (this.zza == 2 && this.zzd.isEmpty() && this.zze.size() == 0) {
            Log.isLoggable(ProtectedSandApp.s("৾"), 2);
            this.zza = 3;
            ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
            context = this.zzf.zzb;
            connectionTracker.unbindService(context, this);
        }
    }

    final synchronized boolean zzg(zzp<?> zzpVar) {
        Context context;
        ScheduledExecutorService scheduledExecutorService;
        int i5 = this.zza;
        if (i5 != 0) {
            if (i5 == 1) {
                this.zzd.add(zzpVar);
                return true;
            }
            if (i5 != 2) {
                return false;
            }
            this.zzd.add(zzpVar);
            zzc();
            return true;
        }
        this.zzd.add(zzpVar);
        Preconditions.checkState(this.zza == 0);
        Log.isLoggable(ProtectedSandApp.s("\u09ff"), 2);
        this.zza = 1;
        Intent intent = new Intent(ProtectedSandApp.s("\u0a00"));
        intent.setPackage(ProtectedSandApp.s("ਁ"));
        try {
            ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
            context = this.zzf.zzb;
            if (connectionTracker.bindService(context, intent, this, 1)) {
                scheduledExecutorService = this.zzf.zzc;
                scheduledExecutorService.schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzi
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzm.this.zzd();
                    }
                }, 30L, TimeUnit.SECONDS);
            } else {
                zza(0, ProtectedSandApp.s("ਂ"));
            }
        } catch (SecurityException e6) {
            zzb(0, ProtectedSandApp.s("ਃ"), e6);
        }
        return true;
    }
}
