package com.google.android.gms.maps;

import android.graphics.Bitmap;
import android.location.Location;
import android.os.RemoteException;
import android.view.View;
import androidx.annotation.b1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.model.AdvancedMarker;
import com.google.android.gms.maps.model.AdvancedMarkerOptions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.GroundOverlay;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.IndoorBuilding;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MapCapabilities;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PointOfInterest;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.model.TileOverlay;
import com.google.android.gms.maps.model.TileOverlayOptions;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
/* loaded from: classes5.dex */
public class GoogleMap {

    @o0
    public static final String DEMO_MAP_ID = ProtectedSandApp.s("\uda2e");
    public static final int MAP_TYPE_HYBRID = 4;
    public static final int MAP_TYPE_NONE = 0;
    public static final int MAP_TYPE_NORMAL = 1;
    public static final int MAP_TYPE_SATELLITE = 2;
    public static final int MAP_TYPE_TERRAIN = 3;
    private final IGoogleMapDelegate zza;
    private MapCapabilities zzb;
    private final Map zzc = new HashMap();
    private final Map zzd = new HashMap();
    private UiSettings zze;

    /* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
    public interface CancelableCallback {
        void onCancel();

        void onFinish();
    }

    /* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
    public interface InfoWindowAdapter {
        @q0
        View getInfoContents(@o0 Marker marker);

        @q0
        View getInfoWindow(@o0 Marker marker);
    }

    /* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
    @Deprecated
    public interface OnCameraChangeListener {
        void onCameraChange(@o0 CameraPosition cameraPosition);
    }

    /* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
    public interface OnCameraIdleListener {
        void onCameraIdle();
    }

    /* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
    public interface OnCameraMoveCanceledListener {
        void onCameraMoveCanceled();
    }

    /* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
    public interface OnCameraMoveListener {
        void onCameraMove();
    }

    /* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
    public interface OnCameraMoveStartedListener {
        public static final int REASON_API_ANIMATION = 2;
        public static final int REASON_DEVELOPER_ANIMATION = 3;
        public static final int REASON_GESTURE = 1;

        void onCameraMoveStarted(int i4);
    }

    /* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
    public interface OnCircleClickListener {
        void onCircleClick(@o0 Circle circle);
    }

    /* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
    public interface OnGroundOverlayClickListener {
        void onGroundOverlayClick(@o0 GroundOverlay groundOverlay);
    }

    /* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
    public interface OnIndoorStateChangeListener {
        void onIndoorBuildingFocused();

        void onIndoorLevelActivated(@o0 IndoorBuilding indoorBuilding);
    }

    /* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
    public interface OnInfoWindowClickListener {
        void onInfoWindowClick(@o0 Marker marker);
    }

    /* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
    public interface OnInfoWindowCloseListener {
        void onInfoWindowClose(@o0 Marker marker);
    }

    /* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
    public interface OnInfoWindowLongClickListener {
        void onInfoWindowLongClick(@o0 Marker marker);
    }

    /* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
    public interface OnMapCapabilitiesChangedListener {
        void onMapCapabilitiesChanged(@o0 MapCapabilities mapCapabilities);
    }

    /* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
    public interface OnMapClickListener {
        void onMapClick(@o0 LatLng latLng);
    }

    /* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
    public interface OnMapLoadedCallback {
        void onMapLoaded();
    }

    /* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
    public interface OnMapLongClickListener {
        void onMapLongClick(@o0 LatLng latLng);
    }

    /* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
    public interface OnMarkerClickListener {
        boolean onMarkerClick(@o0 Marker marker);
    }

    /* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
    public interface OnMarkerDragListener {
        void onMarkerDrag(@o0 Marker marker);

        void onMarkerDragEnd(@o0 Marker marker);

        void onMarkerDragStart(@o0 Marker marker);
    }

    /* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
    public interface OnMyLocationButtonClickListener {
        boolean onMyLocationButtonClick();
    }

    /* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
    @Deprecated
    public interface OnMyLocationChangeListener {
        void onMyLocationChange(@o0 Location location);
    }

    /* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
    public interface OnMyLocationClickListener {
        void onMyLocationClick(@o0 Location location);
    }

    /* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
    public interface OnPoiClickListener {
        void onPoiClick(@o0 PointOfInterest pointOfInterest);
    }

    /* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
    public interface OnPolygonClickListener {
        void onPolygonClick(@o0 Polygon polygon);
    }

    /* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
    public interface OnPolylineClickListener {
        void onPolylineClick(@o0 Polyline polyline);
    }

    /* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
    public interface SnapshotReadyCallback {
        void onSnapshotReady(@q0 Bitmap bitmap);
    }

    public GoogleMap(@o0 IGoogleMapDelegate iGoogleMapDelegate) {
        this.zza = (IGoogleMapDelegate) Preconditions.checkNotNull(iGoogleMapDelegate);
    }

    @o0
    public final Circle addCircle(@o0 CircleOptions circleOptions) {
        try {
            Preconditions.checkNotNull(circleOptions, ProtectedSandApp.s("\uda26"));
            return new Circle(this.zza.addCircle(circleOptions));
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    @q0
    public final GroundOverlay addGroundOverlay(@o0 GroundOverlayOptions groundOverlayOptions) {
        try {
            Preconditions.checkNotNull(groundOverlayOptions, ProtectedSandApp.s("\uda27"));
            com.google.android.gms.internal.maps.zzr addGroundOverlay = this.zza.addGroundOverlay(groundOverlayOptions);
            if (addGroundOverlay != null) {
                return new GroundOverlay(addGroundOverlay);
            }
            return null;
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    @q0
    public final Marker addMarker(@o0 MarkerOptions markerOptions) {
        if (markerOptions instanceof AdvancedMarkerOptions) {
            markerOptions.zzf(1);
        }
        try {
            Preconditions.checkNotNull(markerOptions, ProtectedSandApp.s("\uda28"));
            com.google.android.gms.internal.maps.zzad addMarker = this.zza.addMarker(markerOptions);
            if (addMarker != null) {
                return markerOptions.zzb() == 1 ? new AdvancedMarker(addMarker) : new Marker(addMarker);
            }
            return null;
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public final void addOnMapCapabilitiesChangedListener(@o0 OnMapCapabilitiesChangedListener onMapCapabilitiesChangedListener) {
        try {
            zzs zzsVar = new zzs(this, onMapCapabilitiesChangedListener);
            this.zzc.put(onMapCapabilitiesChangedListener, zzsVar);
            this.zza.addOnMapCapabilitiesChangedListener(zzsVar);
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    @o0
    public final Polygon addPolygon(@o0 PolygonOptions polygonOptions) {
        try {
            Preconditions.checkNotNull(polygonOptions, ProtectedSandApp.s("\uda29"));
            return new Polygon(this.zza.addPolygon(polygonOptions));
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    @o0
    public final Polyline addPolyline(@o0 PolylineOptions polylineOptions) {
        try {
            Preconditions.checkNotNull(polylineOptions, ProtectedSandApp.s("\uda2a"));
            return new Polyline(this.zza.addPolyline(polylineOptions));
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    @q0
    public final TileOverlay addTileOverlay(@o0 TileOverlayOptions tileOverlayOptions) {
        try {
            Preconditions.checkNotNull(tileOverlayOptions, ProtectedSandApp.s("\uda2b"));
            com.google.android.gms.internal.maps.zzam addTileOverlay = this.zza.addTileOverlay(tileOverlayOptions);
            if (addTileOverlay != null) {
                return new TileOverlay(addTileOverlay);
            }
            return null;
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public final void animateCamera(@o0 CameraUpdate cameraUpdate) {
        try {
            Preconditions.checkNotNull(cameraUpdate, ProtectedSandApp.s("\uda2c"));
            this.zza.animateCamera(cameraUpdate.zza());
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public final void clear() {
        try {
            this.zza.clear();
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    @o0
    public final CameraPosition getCameraPosition() {
        try {
            return this.zza.getCameraPosition();
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    @q0
    public IndoorBuilding getFocusedBuilding() {
        try {
            com.google.android.gms.internal.maps.zzu focusedBuilding = this.zza.getFocusedBuilding();
            if (focusedBuilding != null) {
                return new IndoorBuilding(focusedBuilding);
            }
            return null;
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    @o0
    public MapCapabilities getMapCapabilities() {
        if (this.zzb == null) {
            try {
                this.zzb = new MapCapabilities(this.zza.getMapCapabilities());
            } catch (RemoteException e4) {
                throw new RuntimeRemoteException(e4);
            }
        }
        return this.zzb;
    }

    public final int getMapType() {
        try {
            return this.zza.getMapType();
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public final float getMaxZoomLevel() {
        try {
            return this.zza.getMaxZoomLevel();
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public final float getMinZoomLevel() {
        try {
            return this.zza.getMinZoomLevel();
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    @o0
    @Deprecated
    public final Location getMyLocation() {
        try {
            return this.zza.getMyLocation();
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    @o0
    public final Projection getProjection() {
        try {
            return new Projection(this.zza.getProjection());
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    @o0
    public final UiSettings getUiSettings() {
        try {
            if (this.zze == null) {
                this.zze = new UiSettings(this.zza.getUiSettings());
            }
            return this.zze;
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public final boolean isBuildingsEnabled() {
        try {
            return this.zza.isBuildingsEnabled();
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public final boolean isIndoorEnabled() {
        try {
            return this.zza.isIndoorEnabled();
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public final boolean isMyLocationEnabled() {
        try {
            return this.zza.isMyLocationEnabled();
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public final boolean isTrafficEnabled() {
        try {
            return this.zza.isTrafficEnabled();
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public final void moveCamera(@o0 CameraUpdate cameraUpdate) {
        try {
            Preconditions.checkNotNull(cameraUpdate, ProtectedSandApp.s("\uda2c"));
            this.zza.moveCamera(cameraUpdate.zza());
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public final void removeOnMapCapabilitiesChangedListener(@o0 OnMapCapabilitiesChangedListener onMapCapabilitiesChangedListener) {
        try {
            if (this.zzc.containsKey(onMapCapabilitiesChangedListener)) {
                this.zza.removeOnMapCapabilitiesChangedListener((com.google.android.gms.maps.internal.zzal) this.zzc.get(onMapCapabilitiesChangedListener));
                this.zzc.remove(onMapCapabilitiesChangedListener);
            }
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public void resetMinMaxZoomPreference() {
        try {
            this.zza.resetMinMaxZoomPreference();
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public final void setBuildingsEnabled(boolean z4) {
        try {
            this.zza.setBuildingsEnabled(z4);
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public final void setContentDescription(@q0 String str) {
        try {
            this.zza.setContentDescription(str);
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public final boolean setIndoorEnabled(boolean z4) {
        try {
            return this.zza.setIndoorEnabled(z4);
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public final void setInfoWindowAdapter(@q0 InfoWindowAdapter infoWindowAdapter) {
        try {
            if (infoWindowAdapter == null) {
                this.zza.setInfoWindowAdapter(null);
            } else {
                this.zza.setInfoWindowAdapter(new zzf(this, infoWindowAdapter));
            }
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public void setLatLngBoundsForCameraTarget(@q0 LatLngBounds latLngBounds) {
        try {
            this.zza.setLatLngBoundsForCameraTarget(latLngBounds);
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public final void setLocationSource(@q0 LocationSource locationSource) {
        try {
            if (locationSource == null) {
                this.zza.setLocationSource(null);
            } else {
                this.zza.setLocationSource(new zzt(this, locationSource));
            }
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public boolean setMapStyle(@q0 MapStyleOptions mapStyleOptions) {
        try {
            return this.zza.setMapStyle(mapStyleOptions);
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public final void setMapType(int i4) {
        try {
            this.zza.setMapType(i4);
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public void setMaxZoomPreference(float f4) {
        try {
            this.zza.setMaxZoomPreference(f4);
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public void setMinZoomPreference(float f4) {
        try {
            this.zza.setMinZoomPreference(f4);
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    @b1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public final void setMyLocationEnabled(boolean z4) {
        try {
            this.zza.setMyLocationEnabled(z4);
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    @Deprecated
    public final void setOnCameraChangeListener(@q0 OnCameraChangeListener onCameraChangeListener) {
        try {
            if (onCameraChangeListener == null) {
                this.zza.setOnCameraChangeListener(null);
            } else {
                this.zza.setOnCameraChangeListener(new zzu(this, onCameraChangeListener));
            }
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public final void setOnCameraIdleListener(@q0 OnCameraIdleListener onCameraIdleListener) {
        try {
            if (onCameraIdleListener == null) {
                this.zza.setOnCameraIdleListener(null);
            } else {
                this.zza.setOnCameraIdleListener(new zzy(this, onCameraIdleListener));
            }
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public final void setOnCameraMoveCanceledListener(@q0 OnCameraMoveCanceledListener onCameraMoveCanceledListener) {
        try {
            if (onCameraMoveCanceledListener == null) {
                this.zza.setOnCameraMoveCanceledListener(null);
            } else {
                this.zza.setOnCameraMoveCanceledListener(new zzx(this, onCameraMoveCanceledListener));
            }
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public final void setOnCameraMoveListener(@q0 OnCameraMoveListener onCameraMoveListener) {
        try {
            if (onCameraMoveListener == null) {
                this.zza.setOnCameraMoveListener(null);
            } else {
                this.zza.setOnCameraMoveListener(new zzw(this, onCameraMoveListener));
            }
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public final void setOnCameraMoveStartedListener(@q0 OnCameraMoveStartedListener onCameraMoveStartedListener) {
        try {
            if (onCameraMoveStartedListener == null) {
                this.zza.setOnCameraMoveStartedListener(null);
            } else {
                this.zza.setOnCameraMoveStartedListener(new zzv(this, onCameraMoveStartedListener));
            }
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public final void setOnCircleClickListener(@q0 OnCircleClickListener onCircleClickListener) {
        try {
            if (onCircleClickListener == null) {
                this.zza.setOnCircleClickListener(null);
            } else {
                this.zza.setOnCircleClickListener(new zzn(this, onCircleClickListener));
            }
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public final void setOnGroundOverlayClickListener(@q0 OnGroundOverlayClickListener onGroundOverlayClickListener) {
        try {
            if (onGroundOverlayClickListener == null) {
                this.zza.setOnGroundOverlayClickListener(null);
            } else {
                this.zza.setOnGroundOverlayClickListener(new zzm(this, onGroundOverlayClickListener));
            }
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public final void setOnIndoorStateChangeListener(@q0 OnIndoorStateChangeListener onIndoorStateChangeListener) {
        try {
            if (onIndoorStateChangeListener == null) {
                this.zza.setOnIndoorStateChangeListener(null);
            } else {
                this.zza.setOnIndoorStateChangeListener(new zzk(this, onIndoorStateChangeListener));
            }
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public final void setOnInfoWindowClickListener(@q0 OnInfoWindowClickListener onInfoWindowClickListener) {
        try {
            if (onInfoWindowClickListener == null) {
                this.zza.setOnInfoWindowClickListener(null);
            } else {
                this.zza.setOnInfoWindowClickListener(new zzc(this, onInfoWindowClickListener));
            }
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public final void setOnInfoWindowCloseListener(@q0 OnInfoWindowCloseListener onInfoWindowCloseListener) {
        try {
            if (onInfoWindowCloseListener == null) {
                this.zza.setOnInfoWindowCloseListener(null);
            } else {
                this.zza.setOnInfoWindowCloseListener(new zze(this, onInfoWindowCloseListener));
            }
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public final void setOnInfoWindowLongClickListener(@q0 OnInfoWindowLongClickListener onInfoWindowLongClickListener) {
        try {
            if (onInfoWindowLongClickListener == null) {
                this.zza.setOnInfoWindowLongClickListener(null);
            } else {
                this.zza.setOnInfoWindowLongClickListener(new zzd(this, onInfoWindowLongClickListener));
            }
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public final void setOnMapClickListener(@q0 OnMapClickListener onMapClickListener) {
        try {
            if (onMapClickListener == null) {
                this.zza.setOnMapClickListener(null);
            } else {
                this.zza.setOnMapClickListener(new zzz(this, onMapClickListener));
            }
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public void setOnMapLoadedCallback(@q0 OnMapLoadedCallback onMapLoadedCallback) {
        try {
            if (onMapLoadedCallback == null) {
                this.zza.setOnMapLoadedCallback(null);
            } else {
                this.zza.setOnMapLoadedCallback(new zzj(this, onMapLoadedCallback));
            }
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public final void setOnMapLongClickListener(@q0 OnMapLongClickListener onMapLongClickListener) {
        try {
            if (onMapLongClickListener == null) {
                this.zza.setOnMapLongClickListener(null);
            } else {
                this.zza.setOnMapLongClickListener(new zzaa(this, onMapLongClickListener));
            }
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public final void setOnMarkerClickListener(@q0 OnMarkerClickListener onMarkerClickListener) {
        try {
            if (onMarkerClickListener == null) {
                this.zza.setOnMarkerClickListener(null);
            } else {
                this.zza.setOnMarkerClickListener(new zza(this, onMarkerClickListener));
            }
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public final void setOnMarkerDragListener(@q0 OnMarkerDragListener onMarkerDragListener) {
        try {
            if (onMarkerDragListener == null) {
                this.zza.setOnMarkerDragListener(null);
            } else {
                this.zza.setOnMarkerDragListener(new zzb(this, onMarkerDragListener));
            }
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public final void setOnMyLocationButtonClickListener(@q0 OnMyLocationButtonClickListener onMyLocationButtonClickListener) {
        try {
            if (onMyLocationButtonClickListener == null) {
                this.zza.setOnMyLocationButtonClickListener(null);
            } else {
                this.zza.setOnMyLocationButtonClickListener(new zzh(this, onMyLocationButtonClickListener));
            }
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    @Deprecated
    public final void setOnMyLocationChangeListener(@q0 OnMyLocationChangeListener onMyLocationChangeListener) {
        try {
            if (onMyLocationChangeListener == null) {
                this.zza.setOnMyLocationChangeListener(null);
            } else {
                this.zza.setOnMyLocationChangeListener(new zzg(this, onMyLocationChangeListener));
            }
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public final void setOnMyLocationClickListener(@q0 OnMyLocationClickListener onMyLocationClickListener) {
        try {
            if (onMyLocationClickListener == null) {
                this.zza.setOnMyLocationClickListener(null);
            } else {
                this.zza.setOnMyLocationClickListener(new zzi(this, onMyLocationClickListener));
            }
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public final void setOnPoiClickListener(@q0 OnPoiClickListener onPoiClickListener) {
        try {
            if (onPoiClickListener == null) {
                this.zza.setOnPoiClickListener(null);
            } else {
                this.zza.setOnPoiClickListener(new zzr(this, onPoiClickListener));
            }
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public final void setOnPolygonClickListener(@q0 OnPolygonClickListener onPolygonClickListener) {
        try {
            if (onPolygonClickListener == null) {
                this.zza.setOnPolygonClickListener(null);
            } else {
                this.zza.setOnPolygonClickListener(new zzo(this, onPolygonClickListener));
            }
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public final void setOnPolylineClickListener(@q0 OnPolylineClickListener onPolylineClickListener) {
        try {
            if (onPolylineClickListener == null) {
                this.zza.setOnPolylineClickListener(null);
            } else {
                this.zza.setOnPolylineClickListener(new zzp(this, onPolylineClickListener));
            }
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public final void setPadding(int i4, int i5, int i6, int i7) {
        try {
            this.zza.setPadding(i4, i5, i6, i7);
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public final void setTrafficEnabled(boolean z4) {
        try {
            this.zza.setTrafficEnabled(z4);
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public final void snapshot(@o0 SnapshotReadyCallback snapshotReadyCallback) {
        Preconditions.checkNotNull(snapshotReadyCallback, ProtectedSandApp.s("\uda2d"));
        snapshot(snapshotReadyCallback, null);
    }

    public final void stopAnimation() {
        try {
            this.zza.stopAnimation();
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public final void snapshot(@o0 SnapshotReadyCallback snapshotReadyCallback, @q0 Bitmap bitmap) {
        Preconditions.checkNotNull(snapshotReadyCallback, ProtectedSandApp.s("\uda2d"));
        try {
            this.zza.snapshot(new zzq(this, snapshotReadyCallback), (ObjectWrapper) (bitmap != null ? ObjectWrapper.wrap(bitmap) : null));
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public final void animateCamera(@o0 CameraUpdate cameraUpdate, int i4, @q0 CancelableCallback cancelableCallback) {
        try {
            Preconditions.checkNotNull(cameraUpdate, ProtectedSandApp.s("\uda2c"));
            this.zza.animateCameraWithDurationAndCallback(cameraUpdate.zza(), i4, cancelableCallback == null ? null : new zzab(cancelableCallback));
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public final void animateCamera(@o0 CameraUpdate cameraUpdate, @q0 CancelableCallback cancelableCallback) {
        try {
            Preconditions.checkNotNull(cameraUpdate, ProtectedSandApp.s("\uda2c"));
            this.zza.animateCameraWithCallback(cameraUpdate.zza(), cancelableCallback == null ? null : new zzab(cancelableCallback));
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }
}
