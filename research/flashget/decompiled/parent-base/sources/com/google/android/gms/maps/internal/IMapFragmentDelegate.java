package com.google.android.gms.maps.internal;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.o0;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.GoogleMapOptions;
import zc.h;

/* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
/* loaded from: classes5.dex */
public interface IMapFragmentDelegate extends IInterface {
    @o0
    IGoogleMapDelegate getMap() throws RemoteException;

    void getMapAsync(zzat zzatVar) throws RemoteException;

    boolean isReady() throws RemoteException;

    void onCreate(@o0 Bundle bundle) throws RemoteException;

    @o0
    IObjectWrapper onCreateView(@o0 IObjectWrapper iObjectWrapper, @o0 IObjectWrapper iObjectWrapper2, @o0 Bundle bundle) throws RemoteException;

    void onDestroy() throws RemoteException;

    void onDestroyView() throws RemoteException;

    void onEnterAmbient(@o0 Bundle bundle) throws RemoteException;

    void onExitAmbient() throws RemoteException;

    void onInflate(@o0 IObjectWrapper iObjectWrapper, @h GoogleMapOptions googleMapOptions, @o0 Bundle bundle) throws RemoteException;

    void onLowMemory() throws RemoteException;

    void onPause() throws RemoteException;

    void onResume() throws RemoteException;

    void onSaveInstanceState(@o0 Bundle bundle) throws RemoteException;

    void onStart() throws RemoteException;

    void onStop() throws RemoteException;
}
