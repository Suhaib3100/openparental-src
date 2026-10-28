package com.google.android.gms.maps.model;

import android.os.RemoteException;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
/* loaded from: classes5.dex */
public final class GroundOverlay {
    private final com.google.android.gms.internal.maps.zzr zza;

    public GroundOverlay(com.google.android.gms.internal.maps.zzr zzrVar) {
        this.zza = (com.google.android.gms.internal.maps.zzr) Preconditions.checkNotNull(zzrVar);
    }

    public boolean equals(@q0 Object obj) {
        if (!(obj instanceof GroundOverlay)) {
            return false;
        }
        try {
            return this.zza.zzz(((GroundOverlay) obj).zza);
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public float getBearing() {
        try {
            return this.zza.zzd();
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    @o0
    public LatLngBounds getBounds() {
        try {
            return this.zza.zzl();
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public float getHeight() {
        try {
            return this.zza.zze();
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    @o0
    public String getId() {
        try {
            return this.zza.zzm();
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    @o0
    public LatLng getPosition() {
        try {
            return this.zza.zzk();
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    @q0
    public Object getTag() {
        try {
            return ObjectWrapper.unwrap(this.zza.zzj());
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public float getTransparency() {
        try {
            return this.zza.zzf();
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public float getWidth() {
        try {
            return this.zza.zzg();
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public float getZIndex() {
        try {
            return this.zza.zzh();
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public int hashCode() {
        try {
            return this.zza.zzi();
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public boolean isClickable() {
        try {
            return this.zza.zzA();
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public boolean isVisible() {
        try {
            return this.zza.zzB();
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public void remove() {
        try {
            this.zza.zzn();
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public void setBearing(float f4) {
        try {
            this.zza.zzo(f4);
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public void setClickable(boolean z4) {
        try {
            this.zza.zzp(z4);
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public void setDimensions(float f4) {
        try {
            this.zza.zzq(f4);
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public void setImage(@o0 BitmapDescriptor bitmapDescriptor) {
        Preconditions.checkNotNull(bitmapDescriptor, ProtectedSandApp.s("\udadd"));
        try {
            this.zza.zzs(bitmapDescriptor.zza());
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public void setPosition(@o0 LatLng latLng) {
        try {
            this.zza.zzt(latLng);
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public void setPositionFromBounds(@o0 LatLngBounds latLngBounds) {
        try {
            this.zza.zzu(latLngBounds);
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public void setTag(@q0 Object obj) {
        try {
            this.zza.zzv(ObjectWrapper.wrap(obj));
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public void setTransparency(float f4) {
        try {
            this.zza.zzw(f4);
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public void setVisible(boolean z4) {
        try {
            this.zza.zzx(z4);
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public void setZIndex(float f4) {
        try {
            this.zza.zzy(f4);
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public void setDimensions(float f4, float f5) {
        try {
            this.zza.zzr(f4, f5);
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }
}
