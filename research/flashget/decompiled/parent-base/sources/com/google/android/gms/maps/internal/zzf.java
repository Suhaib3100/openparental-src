package com.google.android.gms.maps.internal;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.StreetViewPanoramaOptions;
import zc.h;

/* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
/* loaded from: classes5.dex */
public interface zzf extends IInterface {
    int zzd() throws RemoteException;

    ICameraUpdateFactoryDelegate zze() throws RemoteException;

    IMapFragmentDelegate zzf(IObjectWrapper iObjectWrapper) throws RemoteException;

    IMapViewDelegate zzg(IObjectWrapper iObjectWrapper, @h GoogleMapOptions googleMapOptions) throws RemoteException;

    IStreetViewPanoramaFragmentDelegate zzh(IObjectWrapper iObjectWrapper) throws RemoteException;

    IStreetViewPanoramaViewDelegate zzi(IObjectWrapper iObjectWrapper, @h StreetViewPanoramaOptions streetViewPanoramaOptions) throws RemoteException;

    com.google.android.gms.internal.maps.zzi zzj() throws RemoteException;

    void zzk(IObjectWrapper iObjectWrapper, int i4) throws RemoteException;

    void zzl(IObjectWrapper iObjectWrapper, int i4) throws RemoteException;

    void zzm(IObjectWrapper iObjectWrapper) throws RemoteException;
}
