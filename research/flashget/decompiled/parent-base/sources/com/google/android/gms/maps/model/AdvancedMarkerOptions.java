package com.google.android.gms.maps.model;

import android.view.View;
import androidx.annotation.o0;
import androidx.annotation.q0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
/* loaded from: classes5.dex */
public class AdvancedMarkerOptions extends MarkerOptions {

    /* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
    @Retention(RetentionPolicy.RUNTIME)
    public @interface CollisionBehavior {
        public static final int OPTIONAL_AND_HIDES_LOWER_PRIORITY = 2;
        public static final int REQUIRED = 0;
        public static final int REQUIRED_AND_HIDES_OPTIONAL = 1;
    }

    @Override // com.google.android.gms.maps.model.MarkerOptions
    @o0
    public AdvancedMarkerOptions alpha(float f4) {
        super.alpha(f4);
        return this;
    }

    @Override // com.google.android.gms.maps.model.MarkerOptions
    @o0
    public AdvancedMarkerOptions anchor(float f4, float f5) {
        super.anchor(f4, f5);
        return this;
    }

    @o0
    public AdvancedMarkerOptions collisionBehavior(@CollisionBehavior int i4) {
        zzd(i4);
        return this;
    }

    @Override // com.google.android.gms.maps.model.MarkerOptions
    @o0
    public AdvancedMarkerOptions contentDescription(@q0 String str) {
        super.contentDescription(str);
        return this;
    }

    @Override // com.google.android.gms.maps.model.MarkerOptions
    @o0
    public AdvancedMarkerOptions draggable(boolean z4) {
        super.draggable(z4);
        return this;
    }

    @Override // com.google.android.gms.maps.model.MarkerOptions
    @o0
    public AdvancedMarkerOptions flat(boolean z4) {
        super.flat(z4);
        return this;
    }

    public int getCollisionBehavior() {
        return zza();
    }

    @q0
    public View getIconView() {
        return zzc();
    }

    @Override // com.google.android.gms.maps.model.MarkerOptions
    @o0
    public AdvancedMarkerOptions icon(@q0 BitmapDescriptor bitmapDescriptor) {
        super.icon(bitmapDescriptor);
        return this;
    }

    @o0
    public AdvancedMarkerOptions iconView(@q0 View view) {
        zze(view);
        return this;
    }

    @Override // com.google.android.gms.maps.model.MarkerOptions
    @o0
    public AdvancedMarkerOptions infoWindowAnchor(float f4, float f5) {
        super.infoWindowAnchor(f4, f5);
        return this;
    }

    @Override // com.google.android.gms.maps.model.MarkerOptions
    @o0
    public AdvancedMarkerOptions position(@o0 LatLng latLng) {
        super.position(latLng);
        return this;
    }

    @Override // com.google.android.gms.maps.model.MarkerOptions
    @o0
    public AdvancedMarkerOptions rotation(float f4) {
        super.rotation(f4);
        return this;
    }

    @Override // com.google.android.gms.maps.model.MarkerOptions
    @o0
    public AdvancedMarkerOptions snippet(@q0 String str) {
        super.snippet(str);
        return this;
    }

    @Override // com.google.android.gms.maps.model.MarkerOptions
    @o0
    public AdvancedMarkerOptions title(@q0 String str) {
        super.title(str);
        return this;
    }

    @Override // com.google.android.gms.maps.model.MarkerOptions
    @o0
    public AdvancedMarkerOptions visible(boolean z4) {
        super.visible(z4);
        return this;
    }

    @Override // com.google.android.gms.maps.model.MarkerOptions
    @o0
    public AdvancedMarkerOptions zIndex(float f4) {
        super.zIndex(f4);
        return this;
    }
}
