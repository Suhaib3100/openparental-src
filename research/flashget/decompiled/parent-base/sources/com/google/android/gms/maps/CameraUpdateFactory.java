package com.google.android.gms.maps;

import android.graphics.Point;
import android.os.RemoteException;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
/* loaded from: classes5.dex */
public final class CameraUpdateFactory {
    private static ICameraUpdateFactoryDelegate zza;

    private CameraUpdateFactory() {
    }

    @o0
    public static CameraUpdate newCameraPosition(@o0 CameraPosition cameraPosition) {
        Preconditions.checkNotNull(cameraPosition, ProtectedSandApp.s("\uda21"));
        try {
            return new CameraUpdate(zzb().newCameraPosition(cameraPosition));
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    @o0
    public static CameraUpdate newLatLng(@o0 LatLng latLng) {
        Preconditions.checkNotNull(latLng, ProtectedSandApp.s("\uda22"));
        try {
            return new CameraUpdate(zzb().newLatLng(latLng));
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    @o0
    public static CameraUpdate newLatLngBounds(@o0 LatLngBounds latLngBounds, int i4) {
        Preconditions.checkNotNull(latLngBounds, ProtectedSandApp.s("\uda23"));
        try {
            return new CameraUpdate(zzb().newLatLngBounds(latLngBounds, i4));
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    @o0
    public static CameraUpdate newLatLngZoom(@o0 LatLng latLng, float f4) {
        Preconditions.checkNotNull(latLng, ProtectedSandApp.s("\uda22"));
        try {
            return new CameraUpdate(zzb().newLatLngZoom(latLng, f4));
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    @o0
    public static CameraUpdate scrollBy(float f4, float f5) {
        try {
            return new CameraUpdate(zzb().scrollBy(f4, f5));
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    @o0
    public static CameraUpdate zoomBy(float f4) {
        try {
            return new CameraUpdate(zzb().zoomBy(f4));
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    @o0
    public static CameraUpdate zoomIn() {
        try {
            return new CameraUpdate(zzb().zoomIn());
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    @o0
    public static CameraUpdate zoomOut() {
        try {
            return new CameraUpdate(zzb().zoomOut());
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    @o0
    public static CameraUpdate zoomTo(float f4) {
        try {
            return new CameraUpdate(zzb().zoomTo(f4));
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public static void zza(@o0 ICameraUpdateFactoryDelegate iCameraUpdateFactoryDelegate) {
        zza = (ICameraUpdateFactoryDelegate) Preconditions.checkNotNull(iCameraUpdateFactoryDelegate);
    }

    private static ICameraUpdateFactoryDelegate zzb() {
        return (ICameraUpdateFactoryDelegate) Preconditions.checkNotNull(zza, ProtectedSandApp.s("\uda25"));
    }

    @o0
    public static CameraUpdate zoomBy(float f4, @o0 Point point) {
        Preconditions.checkNotNull(point, ProtectedSandApp.s("\uda24"));
        try {
            return new CameraUpdate(zzb().zoomByWithFocus(f4, point.x, point.y));
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    @o0
    public static CameraUpdate newLatLngBounds(@o0 LatLngBounds latLngBounds, int i4, int i5, int i6) {
        Preconditions.checkNotNull(latLngBounds, ProtectedSandApp.s("\uda23"));
        try {
            return new CameraUpdate(zzb().newLatLngBoundsWithSize(latLngBounds, i4, i5, i6));
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }
}
