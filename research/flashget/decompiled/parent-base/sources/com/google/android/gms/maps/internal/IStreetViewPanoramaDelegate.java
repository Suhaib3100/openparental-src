package com.google.android.gms.maps.internal;

import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;
import com.google.android.gms.maps.model.StreetViewSource;
import zc.h;

/* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
/* loaded from: classes5.dex */
public interface IStreetViewPanoramaDelegate extends IInterface {
    void animateTo(@o0 StreetViewPanoramaCamera streetViewPanoramaCamera, long j4) throws RemoteException;

    void enablePanning(boolean z4) throws RemoteException;

    void enableStreetNames(boolean z4) throws RemoteException;

    void enableUserNavigation(boolean z4) throws RemoteException;

    void enableZoom(boolean z4) throws RemoteException;

    @o0
    StreetViewPanoramaCamera getPanoramaCamera() throws RemoteException;

    @o0
    StreetViewPanoramaLocation getStreetViewPanoramaLocation() throws RemoteException;

    boolean isPanningGesturesEnabled() throws RemoteException;

    boolean isStreetNamesEnabled() throws RemoteException;

    boolean isUserNavigationEnabled() throws RemoteException;

    boolean isZoomGesturesEnabled() throws RemoteException;

    @q0
    IObjectWrapper orientationToPoint(@o0 StreetViewPanoramaOrientation streetViewPanoramaOrientation) throws RemoteException;

    @o0
    StreetViewPanoramaOrientation pointToOrientation(@o0 IObjectWrapper iObjectWrapper) throws RemoteException;

    void setOnStreetViewPanoramaCameraChangeListener(@h zzbl zzblVar) throws RemoteException;

    void setOnStreetViewPanoramaChangeListener(@h zzbn zzbnVar) throws RemoteException;

    void setOnStreetViewPanoramaClickListener(@h zzbp zzbpVar) throws RemoteException;

    void setOnStreetViewPanoramaLongClickListener(@h zzbr zzbrVar) throws RemoteException;

    void setPosition(@o0 LatLng latLng) throws RemoteException;

    void setPositionWithID(@o0 String str) throws RemoteException;

    void setPositionWithRadius(@o0 LatLng latLng, int i4) throws RemoteException;

    void setPositionWithRadiusAndSource(@o0 LatLng latLng, int i4, @h StreetViewSource streetViewSource) throws RemoteException;

    void setPositionWithSource(@o0 LatLng latLng, @h StreetViewSource streetViewSource) throws RemoteException;
}
