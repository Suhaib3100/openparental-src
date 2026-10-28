package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import androidx.annotation.l0;
import androidx.annotation.m1;
import androidx.annotation.n1;
import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
@m1
/* loaded from: classes3.dex */
public final class zzjy implements ServiceConnection, BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzjz zza;
    private volatile boolean zzb;
    private volatile zzep zzc;

    protected zzjy(zzjz zzjzVar) {
        this.zza = zzjzVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    @l0
    public final void onConnected(Bundle bundle) {
        Preconditions.checkMainThread(ProtectedSandApp.s("⓵"));
        synchronized (this) {
            try {
                Preconditions.checkNotNull(this.zzc);
                this.zza.zzt.zzaB().zzp(new zzjv(this, (zzej) this.zzc.getService()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.zzc = null;
                this.zzb = false;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    @l0
    public final void onConnectionFailed(@o0 ConnectionResult connectionResult) {
        Preconditions.checkMainThread(ProtectedSandApp.s("⓶"));
        zzet zzl = this.zza.zzt.zzl();
        if (zzl != null) {
            zzl.zzk().zzb(ProtectedSandApp.s("⓷"), connectionResult);
        }
        synchronized (this) {
            this.zzb = false;
            this.zzc = null;
        }
        this.zza.zzt.zzaB().zzp(new zzjx(this));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    @l0
    public final void onConnectionSuspended(int i5) {
        Preconditions.checkMainThread(ProtectedSandApp.s("⓸"));
        this.zza.zzt.zzaA().zzc().zza(ProtectedSandApp.s("⓹"));
        this.zza.zzt.zzaB().zzp(new zzjw(this));
    }

    @Override // android.content.ServiceConnection
    @l0
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzjy zzjyVar;
        Preconditions.checkMainThread(ProtectedSandApp.s("⓺"));
        synchronized (this) {
            if (iBinder == null) {
                this.zzb = false;
                this.zza.zzt.zzaA().zzd().zza(ProtectedSandApp.s("⓻"));
                return;
            }
            zzej zzejVar = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if (ProtectedSandApp.s("⓼").equals(interfaceDescriptor)) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface(ProtectedSandApp.s("⓽"));
                    zzejVar = queryLocalInterface instanceof zzej ? (zzej) queryLocalInterface : new zzeh(iBinder);
                    this.zza.zzt.zzaA().zzj().zza(ProtectedSandApp.s("⓾"));
                } else {
                    this.zza.zzt.zzaA().zzd().zzb(ProtectedSandApp.s("⓿"), interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.zza.zzt.zzaA().zzd().zza(ProtectedSandApp.s("─"));
            }
            if (zzejVar == null) {
                this.zzb = false;
                try {
                    ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
                    Context zzaw = this.zza.zzt.zzaw();
                    zzjyVar = this.zza.zza;
                    connectionTracker.unbindService(zzaw, zzjyVar);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.zza.zzt.zzaB().zzp(new zzjt(this, zzejVar));
            }
        }
    }

    @Override // android.content.ServiceConnection
    @l0
    public final void onServiceDisconnected(ComponentName componentName) {
        Preconditions.checkMainThread(ProtectedSandApp.s("━"));
        this.zza.zzt.zzaA().zzc().zza(ProtectedSandApp.s("│"));
        this.zza.zzt.zzaB().zzp(new zzju(this, componentName));
    }

    @n1
    public final void zzb(Intent intent) {
        zzjy zzjyVar;
        this.zza.zzg();
        Context zzaw = this.zza.zzt.zzaw();
        ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
        synchronized (this) {
            if (this.zzb) {
                this.zza.zzt.zzaA().zzj().zza(ProtectedSandApp.s("┃"));
                return;
            }
            this.zza.zzt.zzaA().zzj().zza(ProtectedSandApp.s("┄"));
            this.zzb = true;
            zzjyVar = this.zza.zza;
            connectionTracker.bindService(zzaw, intent, zzjyVar, 129);
        }
    }

    @n1
    public final void zzc() {
        this.zza.zzg();
        Context zzaw = this.zza.zzt.zzaw();
        synchronized (this) {
            if (this.zzb) {
                this.zza.zzt.zzaA().zzj().zza(ProtectedSandApp.s("┅"));
                return;
            }
            if (this.zzc != null && (this.zzc.isConnecting() || this.zzc.isConnected())) {
                this.zza.zzt.zzaA().zzj().zza(ProtectedSandApp.s("┆"));
                return;
            }
            this.zzc = new zzep(zzaw, Looper.getMainLooper(), this, this);
            this.zza.zzt.zzaA().zzj().zza(ProtectedSandApp.s("┇"));
            this.zzb = true;
            Preconditions.checkNotNull(this.zzc);
            this.zzc.checkAvailabilityAndConnect();
        }
    }

    @n1
    public final void zzd() {
        if (this.zzc != null && (this.zzc.isConnected() || this.zzc.isConnecting())) {
            this.zzc.disconnect();
        }
        this.zzc = null;
    }
}
