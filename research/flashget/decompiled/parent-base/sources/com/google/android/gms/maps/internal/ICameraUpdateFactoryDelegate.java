package com.google.android.gms.maps.internal;

import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.o0;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
/* loaded from: classes5.dex */
public interface ICameraUpdateFactoryDelegate extends IInterface {
    @o0
    IObjectWrapper newCameraPosition(@o0 CameraPosition cameraPosition) throws RemoteException;

    @o0
    IObjectWrapper newLatLng(@o0 LatLng latLng) throws RemoteException;

    @o0
    IObjectWrapper newLatLngBounds(@o0 LatLngBounds latLngBounds, int i4) throws RemoteException;

    @o0
    IObjectWrapper newLatLngBoundsWithSize(@o0 LatLngBounds latLngBounds, int i4, int i5, int i6) throws RemoteException;

    @o0
    IObjectWrapper newLatLngZoom(@o0 LatLng latLng, float f4) throws RemoteException;

    @o0
    IObjectWrapper scrollBy(float f4, float f5) throws RemoteException;

    @o0
    IObjectWrapper zoomBy(float f4) throws RemoteException;

    @o0
    IObjectWrapper zoomByWithFocus(float f4, int i4, int i5) throws RemoteException;

    @o0
    IObjectWrapper zoomIn() throws RemoteException;

    @o0
    IObjectWrapper zoomOut() throws RemoteException;

    @o0
    IObjectWrapper zoomTo(float f4) throws RemoteException;
}
