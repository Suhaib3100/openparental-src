package com.google.android.gms.maps.model;

import android.os.RemoteException;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
/* loaded from: classes5.dex */
public final class Polygon {
    private final com.google.android.gms.internal.maps.zzag zza;

    public Polygon(com.google.android.gms.internal.maps.zzag zzagVar) {
        this.zza = (com.google.android.gms.internal.maps.zzag) Preconditions.checkNotNull(zzagVar);
    }

    public boolean equals(@q0 Object obj) {
        if (!(obj instanceof Polygon)) {
            return false;
        }
        try {
            return this.zza.zzB(((Polygon) obj).zza);
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public int getFillColor() {
        try {
            return this.zza.zzf();
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    @o0
    public List<List<LatLng>> getHoles() {
        try {
            return this.zza.zzl();
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    @o0
    public String getId() {
        try {
            return this.zza.zzk();
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    @o0
    public List<LatLng> getPoints() {
        try {
            return this.zza.zzm();
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public int getStrokeColor() {
        try {
            return this.zza.zzg();
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public int getStrokeJointType() {
        try {
            return this.zza.zzh();
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    @q0
    public List<PatternItem> getStrokePattern() {
        try {
            return PatternItem.zza(this.zza.zzn());
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public float getStrokeWidth() {
        try {
            return this.zza.zzd();
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

    public float getZIndex() {
        try {
            return this.zza.zze();
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
            return this.zza.zzC();
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public boolean isGeodesic() {
        try {
            return this.zza.zzD();
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public boolean isVisible() {
        try {
            return this.zza.zzE();
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public void remove() {
        try {
            this.zza.zzo();
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

    public void setFillColor(int i4) {
        try {
            this.zza.zzq(i4);
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public void setGeodesic(boolean z4) {
        try {
            this.zza.zzr(z4);
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public void setHoles(@o0 List<? extends List<LatLng>> list) {
        try {
            this.zza.zzs(list);
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public void setPoints(@o0 List<LatLng> list) {
        try {
            Preconditions.checkNotNull(list, ProtectedSandApp.s("\udaf7"));
            this.zza.zzt(list);
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public void setStrokeColor(int i4) {
        try {
            this.zza.zzu(i4);
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public void setStrokeJointType(int i4) {
        try {
            this.zza.zzv(i4);
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public void setStrokePattern(@q0 List<PatternItem> list) {
        try {
            this.zza.zzw(list);
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public void setStrokeWidth(float f4) {
        try {
            this.zza.zzx(f4);
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public void setTag(@q0 Object obj) {
        try {
            this.zza.zzy(ObjectWrapper.wrap(obj));
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public void setVisible(boolean z4) {
        try {
            this.zza.zzz(z4);
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public void setZIndex(float f4) {
        try {
            this.zza.zzA(f4);
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }
}
