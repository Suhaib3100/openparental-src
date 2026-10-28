package com.google.android.gms.maps;

import android.graphics.Point;
import android.os.RemoteException;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;
import com.google.android.gms.maps.model.StreetViewSource;

/* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
/* loaded from: classes5.dex */
public class StreetViewPanorama {
    private final IStreetViewPanoramaDelegate zza;

    /* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
    public interface OnStreetViewPanoramaCameraChangeListener {
        void onStreetViewPanoramaCameraChange(@o0 StreetViewPanoramaCamera streetViewPanoramaCamera);
    }

    /* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
    public interface OnStreetViewPanoramaChangeListener {
        void onStreetViewPanoramaChange(@o0 StreetViewPanoramaLocation streetViewPanoramaLocation);
    }

    /* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
    public interface OnStreetViewPanoramaClickListener {
        void onStreetViewPanoramaClick(@o0 StreetViewPanoramaOrientation streetViewPanoramaOrientation);
    }

    /* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
    public interface OnStreetViewPanoramaLongClickListener {
        void onStreetViewPanoramaLongClick(@o0 StreetViewPanoramaOrientation streetViewPanoramaOrientation);
    }

    public StreetViewPanorama(@o0 IStreetViewPanoramaDelegate iStreetViewPanoramaDelegate) {
        this.zza = (IStreetViewPanoramaDelegate) Preconditions.checkNotNull(iStreetViewPanoramaDelegate, ProtectedSandApp.s("\uda50"));
    }

    public void animateTo(@o0 StreetViewPanoramaCamera streetViewPanoramaCamera, long j4) {
        Preconditions.checkNotNull(streetViewPanoramaCamera);
        try {
            this.zza.animateTo(streetViewPanoramaCamera, j4);
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    @o0
    public StreetViewPanoramaLocation getLocation() {
        try {
            return this.zza.getStreetViewPanoramaLocation();
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    @o0
    public StreetViewPanoramaCamera getPanoramaCamera() {
        try {
            return this.zza.getPanoramaCamera();
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public boolean isPanningGesturesEnabled() {
        try {
            return this.zza.isPanningGesturesEnabled();
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public boolean isStreetNamesEnabled() {
        try {
            return this.zza.isStreetNamesEnabled();
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public boolean isUserNavigationEnabled() {
        try {
            return this.zza.isUserNavigationEnabled();
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public boolean isZoomGesturesEnabled() {
        try {
            return this.zza.isZoomGesturesEnabled();
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    @q0
    public Point orientationToPoint(@o0 StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
        try {
            IObjectWrapper orientationToPoint = this.zza.orientationToPoint(streetViewPanoramaOrientation);
            if (orientationToPoint == null) {
                return null;
            }
            return (Point) ObjectWrapper.unwrap(orientationToPoint);
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    @o0
    public StreetViewPanoramaOrientation pointToOrientation(@o0 Point point) {
        try {
            return this.zza.pointToOrientation(ObjectWrapper.wrap(point));
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public final void setOnStreetViewPanoramaCameraChangeListener(@q0 OnStreetViewPanoramaCameraChangeListener onStreetViewPanoramaCameraChangeListener) {
        try {
            if (onStreetViewPanoramaCameraChangeListener == null) {
                this.zza.setOnStreetViewPanoramaCameraChangeListener(null);
            } else {
                this.zza.setOnStreetViewPanoramaCameraChangeListener(new zzak(this, onStreetViewPanoramaCameraChangeListener));
            }
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public final void setOnStreetViewPanoramaChangeListener(@q0 OnStreetViewPanoramaChangeListener onStreetViewPanoramaChangeListener) {
        try {
            if (onStreetViewPanoramaChangeListener == null) {
                this.zza.setOnStreetViewPanoramaChangeListener(null);
            } else {
                this.zza.setOnStreetViewPanoramaChangeListener(new zzaj(this, onStreetViewPanoramaChangeListener));
            }
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public final void setOnStreetViewPanoramaClickListener(@q0 OnStreetViewPanoramaClickListener onStreetViewPanoramaClickListener) {
        try {
            if (onStreetViewPanoramaClickListener == null) {
                this.zza.setOnStreetViewPanoramaClickListener(null);
            } else {
                this.zza.setOnStreetViewPanoramaClickListener(new zzal(this, onStreetViewPanoramaClickListener));
            }
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public final void setOnStreetViewPanoramaLongClickListener(@q0 OnStreetViewPanoramaLongClickListener onStreetViewPanoramaLongClickListener) {
        try {
            if (onStreetViewPanoramaLongClickListener == null) {
                this.zza.setOnStreetViewPanoramaLongClickListener(null);
            } else {
                this.zza.setOnStreetViewPanoramaLongClickListener(new zzam(this, onStreetViewPanoramaLongClickListener));
            }
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public void setPanningGesturesEnabled(boolean z4) {
        try {
            this.zza.enablePanning(z4);
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public void setPosition(@o0 LatLng latLng) {
        try {
            this.zza.setPosition(latLng);
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public void setStreetNamesEnabled(boolean z4) {
        try {
            this.zza.enableStreetNames(z4);
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public void setUserNavigationEnabled(boolean z4) {
        try {
            this.zza.enableUserNavigation(z4);
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public void setZoomGesturesEnabled(boolean z4) {
        try {
            this.zza.enableZoom(z4);
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public void setPosition(@o0 LatLng latLng, int i4) {
        try {
            this.zza.setPositionWithRadius(latLng, i4);
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public void setPosition(@o0 LatLng latLng, int i4, @q0 StreetViewSource streetViewSource) {
        try {
            this.zza.setPositionWithRadiusAndSource(latLng, i4, streetViewSource);
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public void setPosition(@o0 LatLng latLng, @q0 StreetViewSource streetViewSource) {
        try {
            this.zza.setPositionWithSource(latLng, streetViewSource);
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public void setPosition(@o0 String str) {
        try {
            this.zza.setPositionWithID(str);
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }
}
