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
import androidx.annotation.n1;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes5.dex */
public final class zzmq implements ServiceConnection, BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzls zza;
    private volatile boolean zzb;
    private volatile zzgj zzc;

    protected zzmq(zzls zzlsVar) {
        this.zza = zzlsVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    @l0
    public final void onConnected(Bundle bundle) {
        Preconditions.checkMainThread(ProtectedSandApp.s("\ue1ce"));
        synchronized (this) {
            try {
                Preconditions.checkNotNull(this.zzc);
                this.zza.zzl().zzb(new zzmr(this, this.zzc.getService()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.zzc = null;
                this.zzb = false;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    @l0
    public final void onConnectionFailed(@o0 ConnectionResult connectionResult) {
        Preconditions.checkMainThread(ProtectedSandApp.s("\ue1cf"));
        zzgo zzm = this.zza.zzu.zzm();
        if (zzm != null) {
            zzm.zzu().zza(ProtectedSandApp.s("\ue1d0"), connectionResult);
        }
        synchronized (this) {
            this.zzb = false;
            this.zzc = null;
        }
        this.zza.zzl().zzb(new zzmt(this));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    @l0
    public final void onConnectionSuspended(int i4) {
        Preconditions.checkMainThread(ProtectedSandApp.s("\ue1d1"));
        this.zza.zzj().zzc().zza(ProtectedSandApp.s("\ue1d2"));
        this.zza.zzl().zzb(new zzmu(this));
    }

    @Override // android.content.ServiceConnection
    @l0
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzmq zzmqVar;
        Preconditions.checkMainThread(ProtectedSandApp.s("\ue1d3"));
        synchronized (this) {
            if (iBinder == null) {
                this.zzb = false;
                this.zza.zzj().zzg().zza(ProtectedSandApp.s("\ue1d4"));
                return;
            }
            zzgb zzgbVar = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if (ProtectedSandApp.s("\ue1d5").equals(interfaceDescriptor)) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface(ProtectedSandApp.s("\ue1d5"));
                    zzgbVar = queryLocalInterface instanceof zzgb ? (zzgb) queryLocalInterface : new zzgd(iBinder);
                    this.zza.zzj().zzp().zza(ProtectedSandApp.s("\ue1d6"));
                } else {
                    this.zza.zzj().zzg().zza(ProtectedSandApp.s("\ue1d7"), interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.zza.zzj().zzg().zza(ProtectedSandApp.s("\ue1d8"));
            }
            if (zzgbVar == null) {
                this.zzb = false;
                try {
                    ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
                    Context zza = this.zza.zza();
                    zzmqVar = this.zza.zza;
                    connectionTracker.unbindService(zza, zzmqVar);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.zza.zzl().zzb(new zzmp(this, zzgbVar));
            }
        }
    }

    @Override // android.content.ServiceConnection
    @l0
    public final void onServiceDisconnected(ComponentName componentName) {
        Preconditions.checkMainThread(ProtectedSandApp.s("\ue1d9"));
        this.zza.zzj().zzc().zza(ProtectedSandApp.s("\ue1da"));
        this.zza.zzl().zzb(new zzms(this, componentName));
    }

    @n1
    public final void zzb() {
        if (this.zzc != null && (this.zzc.isConnected() || this.zzc.isConnecting())) {
            this.zzc.disconnect();
        }
        this.zzc = null;
    }

    @n1
    public final void zza(Intent intent) {
        zzmq zzmqVar;
        this.zza.zzt();
        Context zza = this.zza.zza();
        ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
        synchronized (this) {
            try {
                if (this.zzb) {
                    this.zza.zzj().zzp().zza(ProtectedSandApp.s("\ue1db"));
                    return;
                }
                this.zza.zzj().zzp().zza(ProtectedSandApp.s("\ue1de"));
                this.zzb = true;
                zzmqVar = this.zza.zza;
                connectionTracker.bindService(zza, intent, zzmqVar, 129);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @n1
    public final void zza() {
        this.zza.zzt();
        Context zza = this.zza.zza();
        synchronized (this) {
            try {
                if (this.zzb) {
                    this.zza.zzj().zzp().zza(ProtectedSandApp.s("\ue1db"));
                    return;
                }
                if (this.zzc != null && (this.zzc.isConnecting() || this.zzc.isConnected())) {
                    this.zza.zzj().zzp().zza(ProtectedSandApp.s("\ue1dc"));
                    return;
                }
                this.zzc = new zzgj(zza, Looper.getMainLooper(), this, this);
                this.zza.zzj().zzp().zza(ProtectedSandApp.s("\ue1dd"));
                this.zzb = true;
                Preconditions.checkNotNull(this.zzc);
                this.zzc.checkAvailabilityAndConnect();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
