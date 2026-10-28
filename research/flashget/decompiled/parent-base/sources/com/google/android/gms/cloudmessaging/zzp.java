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
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.2.0 */
/* loaded from: classes5.dex */
final class zzp implements ServiceConnection {
    zzq zzc;
    final /* synthetic */ zzv zzf;
    int zza = 0;
    final Messenger zzb = new Messenger(new com.google.android.gms.internal.cloudmessaging.zzf(Looper.getMainLooper(), new Handler.Callback() { // from class: com.google.android.gms.cloudmessaging.zzm
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            String s4 = ProtectedSandApp.s("죲");
            int i4 = message.arg1;
            Log.isLoggable(s4, 3);
            zzp zzpVar = zzp.this;
            synchronized (zzpVar) {
                try {
                    zzs zzsVar = (zzs) zzpVar.zze.get(i4);
                    if (zzsVar == null) {
                        return true;
                    }
                    zzpVar.zze.remove(i4);
                    zzpVar.zzf();
                    Bundle data = message.getData();
                    if (data.getBoolean(ProtectedSandApp.s("죳"), false)) {
                        zzsVar.zzc(new zzt(4, ProtectedSandApp.s("죴"), null));
                        return true;
                    }
                    zzsVar.zza(data);
                    return true;
                } finally {
                }
            }
        }
    }));
    final Queue zzd = new ArrayDeque();
    final SparseArray zze = new SparseArray();

    /* synthetic */ zzp(zzv zzvVar, zzo zzoVar) {
        this.zzf = zzvVar;
    }

    @Override // android.content.ServiceConnection
    @l0
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        ScheduledExecutorService scheduledExecutorService;
        Log.isLoggable(ProtectedSandApp.s("죵"), 2);
        scheduledExecutorService = this.zzf.zzc;
        scheduledExecutorService.execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzi
            @Override // java.lang.Runnable
            public final void run() {
                zzp zzpVar = zzp.this;
                IBinder iBinder2 = iBinder;
                synchronized (zzpVar) {
                    if (iBinder2 == null) {
                        zzpVar.zza(0, ProtectedSandApp.s("죫"));
                        return;
                    }
                    try {
                        zzpVar.zzc = new zzq(iBinder2);
                        zzpVar.zza = 2;
                        zzpVar.zzc();
                    } catch (RemoteException e4) {
                        zzpVar.zza(0, e4.getMessage());
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    @l0
    public final void onServiceDisconnected(ComponentName componentName) {
        ScheduledExecutorService scheduledExecutorService;
        Log.isLoggable(ProtectedSandApp.s("죵"), 2);
        scheduledExecutorService = this.zzf.zzc;
        scheduledExecutorService.execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzl
            @Override // java.lang.Runnable
            public final void run() {
                zzp.this.zza(2, ProtectedSandApp.s("죱"));
            }
        });
    }

    final synchronized void zza(int i4, @q0 String str) {
        zzb(i4, str, null);
    }

    final synchronized void zzb(int i4, @q0 String str, @q0 Throwable th) {
        Context context;
        try {
            if (Log.isLoggable(ProtectedSandApp.s("죵"), 3)) {
                ProtectedSandApp.s("죶").concat(String.valueOf(str));
            }
            int i5 = this.zza;
            if (i5 == 0) {
                throw new IllegalStateException();
            }
            if (i5 != 1 && i5 != 2) {
                if (i5 != 3) {
                    return;
                }
                this.zza = 4;
                return;
            }
            Log.isLoggable(ProtectedSandApp.s("죵"), 2);
            this.zza = 4;
            zzv zzvVar = this.zzf;
            ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
            context = zzvVar.zzb;
            connectionTracker.unbindService(context, this);
            zzt zztVar = new zzt(i4, str, th);
            Iterator it = this.zzd.iterator();
            while (it.hasNext()) {
                ((zzs) it.next()).zzc(zztVar);
            }
            this.zzd.clear();
            for (int i6 = 0; i6 < this.zze.size(); i6++) {
                ((zzs) this.zze.valueAt(i6)).zzc(zztVar);
            }
            this.zze.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    final void zzc() {
        ScheduledExecutorService scheduledExecutorService;
        scheduledExecutorService = this.zzf.zzc;
        scheduledExecutorService.execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzj
            @Override // java.lang.Runnable
            public final void run() {
                final zzs zzsVar;
                ScheduledExecutorService scheduledExecutorService2;
                Context context;
                while (true) {
                    final zzp zzpVar = zzp.this;
                    synchronized (zzpVar) {
                        try {
                            if (zzpVar.zza != 2) {
                                return;
                            }
                            if (zzpVar.zzd.isEmpty()) {
                                zzpVar.zzf();
                                return;
                            }
                            zzsVar = (zzs) zzpVar.zzd.poll();
                            zzpVar.zze.put(zzsVar.zza, zzsVar);
                            scheduledExecutorService2 = zzpVar.zzf.zzc;
                            scheduledExecutorService2.schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzn
                                @Override // java.lang.Runnable
                                public final void run() {
                                    zzp.this.zze(zzsVar.zza);
                                }
                            }, 30L, TimeUnit.SECONDS);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (Log.isLoggable(ProtectedSandApp.s("죬"), 3)) {
                        ProtectedSandApp.s("죭").concat(String.valueOf(zzsVar));
                    }
                    zzv zzvVar = zzpVar.zzf;
                    Messenger messenger = zzpVar.zzb;
                    int i4 = zzsVar.zzc;
                    context = zzvVar.zzb;
                    Message obtain = Message.obtain();
                    obtain.what = i4;
                    obtain.arg1 = zzsVar.zza;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean(ProtectedSandApp.s("죮"), zzsVar.zzb());
                    bundle.putString(ProtectedSandApp.s("죯"), context.getPackageName());
                    bundle.putBundle(ProtectedSandApp.s("죰"), zzsVar.zzd);
                    obtain.setData(bundle);
                    try {
                        zzpVar.zzc.zza(obtain);
                    } catch (RemoteException e4) {
                        zzpVar.zza(2, e4.getMessage());
                    }
                }
            }
        });
    }

    final synchronized void zzd() {
        if (this.zza == 1) {
            zza(1, ProtectedSandApp.s("죷"));
        }
    }

    final synchronized void zze(int i4) {
        zzs zzsVar = (zzs) this.zze.get(i4);
        if (zzsVar != null) {
            this.zze.remove(i4);
            zzsVar.zzc(new zzt(3, ProtectedSandApp.s("죸"), null));
            zzf();
        }
    }

    final synchronized void zzf() {
        Context context;
        if (this.zza == 2 && this.zzd.isEmpty() && this.zze.size() == 0) {
            Log.isLoggable(ProtectedSandApp.s("죵"), 2);
            this.zza = 3;
            zzv zzvVar = this.zzf;
            ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
            context = zzvVar.zzb;
            connectionTracker.unbindService(context, this);
        }
    }

    final synchronized boolean zzg(zzs zzsVar) {
        Context context;
        ScheduledExecutorService scheduledExecutorService;
        int i4 = this.zza;
        if (i4 != 0) {
            if (i4 == 1) {
                this.zzd.add(zzsVar);
                return true;
            }
            if (i4 != 2) {
                return false;
            }
            this.zzd.add(zzsVar);
            zzc();
            return true;
        }
        this.zzd.add(zzsVar);
        Preconditions.checkState(this.zza == 0);
        Log.isLoggable(ProtectedSandApp.s("죵"), 2);
        this.zza = 1;
        Intent intent = new Intent(ProtectedSandApp.s("죹"));
        intent.setPackage(ProtectedSandApp.s("죺"));
        try {
            ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
            context = this.zzf.zzb;
            if (connectionTracker.bindService(context, intent, this, 1)) {
                scheduledExecutorService = this.zzf.zzc;
                scheduledExecutorService.schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzk
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzp.this.zzd();
                    }
                }, 30L, TimeUnit.SECONDS);
            } else {
                zza(0, ProtectedSandApp.s("죻"));
            }
        } catch (SecurityException e4) {
            zzb(0, ProtectedSandApp.s("죻"), e4);
        }
        return true;
    }
}
