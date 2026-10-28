package com.google.android.gms.maps.internal;

import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.o0;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.VisibleRegion;

/* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
/* loaded from: classes5.dex */
public interface IProjectionDelegate extends IInterface {
    @o0
    LatLng fromScreenLocation(@o0 IObjectWrapper iObjectWrapper) throws RemoteException;

    @o0
    VisibleRegion getVisibleRegion() throws RemoteException;

    @o0
    IObjectWrapper toScreenLocation(@o0 LatLng latLng) throws RemoteException;

    @o0
    IObjectWrapper toScreenLocationWithAltitude(@o0 LatLng latLng, float f4) throws RemoteException;
}
