package com.google.android.gms.maps.internal;

import android.location.Location;
import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.o0;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.TileOverlayOptions;
import zc.h;

/* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
/* loaded from: classes5.dex */
public interface IGoogleMapDelegate extends IInterface {
    com.google.android.gms.internal.maps.zzl addCircle(CircleOptions circleOptions) throws RemoteException;

    com.google.android.gms.internal.maps.zzr addGroundOverlay(GroundOverlayOptions groundOverlayOptions) throws RemoteException;

    com.google.android.gms.internal.maps.zzad addMarker(MarkerOptions markerOptions) throws RemoteException;

    void addOnMapCapabilitiesChangedListener(zzal zzalVar) throws RemoteException;

    com.google.android.gms.internal.maps.zzag addPolygon(PolygonOptions polygonOptions) throws RemoteException;

    com.google.android.gms.internal.maps.zzaj addPolyline(PolylineOptions polylineOptions) throws RemoteException;

    com.google.android.gms.internal.maps.zzam addTileOverlay(TileOverlayOptions tileOverlayOptions) throws RemoteException;

    void animateCamera(@o0 IObjectWrapper iObjectWrapper) throws RemoteException;

    void animateCameraWithCallback(IObjectWrapper iObjectWrapper, @h zzd zzdVar) throws RemoteException;

    void animateCameraWithDurationAndCallback(IObjectWrapper iObjectWrapper, int i4, @h zzd zzdVar) throws RemoteException;

    void clear() throws RemoteException;

    @o0
    CameraPosition getCameraPosition() throws RemoteException;

    com.google.android.gms.internal.maps.zzo getFeatureLayer(com.google.android.gms.maps.model.zzd zzdVar) throws RemoteException;

    com.google.android.gms.internal.maps.zzu getFocusedBuilding() throws RemoteException;

    void getMapAsync(zzat zzatVar) throws RemoteException;

    com.google.android.gms.internal.maps.zzaa getMapCapabilities() throws RemoteException;

    int getMapType() throws RemoteException;

    float getMaxZoomLevel() throws RemoteException;

    float getMinZoomLevel() throws RemoteException;

    @o0
    Location getMyLocation() throws RemoteException;

    @o0
    IProjectionDelegate getProjection() throws RemoteException;

    @o0
    IUiSettingsDelegate getUiSettings() throws RemoteException;

    boolean isBuildingsEnabled() throws RemoteException;

    boolean isIndoorEnabled() throws RemoteException;

    boolean isMyLocationEnabled() throws RemoteException;

    boolean isTrafficEnabled() throws RemoteException;

    void moveCamera(@o0 IObjectWrapper iObjectWrapper) throws RemoteException;

    void onCreate(@o0 Bundle bundle) throws RemoteException;

    void onDestroy() throws RemoteException;

    void onEnterAmbient(@o0 Bundle bundle) throws RemoteException;

    void onExitAmbient() throws RemoteException;

    void onLowMemory() throws RemoteException;

    void onPause() throws RemoteException;

    void onResume() throws RemoteException;

    void onSaveInstanceState(@o0 Bundle bundle) throws RemoteException;

    void onStart() throws RemoteException;

    void onStop() throws RemoteException;

    void removeOnMapCapabilitiesChangedListener(zzal zzalVar) throws RemoteException;

    void resetMinMaxZoomPreference() throws RemoteException;

    void setBuildingsEnabled(boolean z4) throws RemoteException;

    void setContentDescription(@h String str) throws RemoteException;

    boolean setIndoorEnabled(boolean z4) throws RemoteException;

    void setInfoWindowAdapter(@h zzi zziVar) throws RemoteException;

    void setLatLngBoundsForCameraTarget(@h LatLngBounds latLngBounds) throws RemoteException;

    void setLocationSource(@h ILocationSourceDelegate iLocationSourceDelegate) throws RemoteException;

    boolean setMapStyle(@h MapStyleOptions mapStyleOptions) throws RemoteException;

    void setMapType(int i4) throws RemoteException;

    void setMaxZoomPreference(float f4) throws RemoteException;

    void setMinZoomPreference(float f4) throws RemoteException;

    void setMyLocationEnabled(boolean z4) throws RemoteException;

    void setOnCameraChangeListener(@h zzn zznVar) throws RemoteException;

    void setOnCameraIdleListener(@h zzp zzpVar) throws RemoteException;

    void setOnCameraMoveCanceledListener(@h zzr zzrVar) throws RemoteException;

    void setOnCameraMoveListener(@h zzt zztVar) throws RemoteException;

    void setOnCameraMoveStartedListener(@h zzv zzvVar) throws RemoteException;

    void setOnCircleClickListener(@h zzx zzxVar) throws RemoteException;

    void setOnGroundOverlayClickListener(@h zzz zzzVar) throws RemoteException;

    void setOnIndoorStateChangeListener(@h zzab zzabVar) throws RemoteException;

    void setOnInfoWindowClickListener(@h zzad zzadVar) throws RemoteException;

    void setOnInfoWindowCloseListener(@h zzaf zzafVar) throws RemoteException;

    void setOnInfoWindowLongClickListener(@h zzah zzahVar) throws RemoteException;

    void setOnMapClickListener(@h zzan zzanVar) throws RemoteException;

    void setOnMapLoadedCallback(@h zzap zzapVar) throws RemoteException;

    void setOnMapLongClickListener(@h zzar zzarVar) throws RemoteException;

    void setOnMarkerClickListener(@h zzav zzavVar) throws RemoteException;

    void setOnMarkerDragListener(@h zzax zzaxVar) throws RemoteException;

    void setOnMyLocationButtonClickListener(@h zzaz zzazVar) throws RemoteException;

    void setOnMyLocationChangeListener(@h zzbb zzbbVar) throws RemoteException;

    void setOnMyLocationClickListener(@h zzbd zzbdVar) throws RemoteException;

    void setOnPoiClickListener(@h zzbf zzbfVar) throws RemoteException;

    void setOnPolygonClickListener(@h zzbh zzbhVar) throws RemoteException;

    void setOnPolylineClickListener(@h zzbj zzbjVar) throws RemoteException;

    void setPadding(int i4, int i5, int i6, int i7) throws RemoteException;

    void setTrafficEnabled(boolean z4) throws RemoteException;

    void setWatermarkEnabled(boolean z4) throws RemoteException;

    void snapshot(zzbw zzbwVar, @h IObjectWrapper iObjectWrapper) throws RemoteException;

    void snapshotForTest(zzbw zzbwVar) throws RemoteException;

    void stopAnimation() throws RemoteException;

    boolean useViewLifecycleWhenInFragment() throws RemoteException;
}
