package com.google.maps.android.compose.streetview;

import androidx.compose.runtime.internal.u;
import androidx.compose.runtime.k2;
import androidx.compose.runtime.t4;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.maps.StreetViewPanorama;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewPanoramaLink;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;
import com.google.android.gms.maps.model.StreetViewSource;
import com.google.firebase.remoteconfig.p;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

/* compiled from: StreetViewCameraPositionState.kt */
@u(parameters = 0)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ-\u0010\u0010\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R+\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00168@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR+\u0010#\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00048@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R.\u0010+\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010$8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(\"\u0004\b)\u0010*R\u0011\u0010,\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001aR\u0011\u0010.\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b-\u0010 ¨\u0006/"}, d2 = {"Lcom/google/maps/android/compose/streetview/a;", "", "<init>", "()V", "Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera;", "camera", "", "durationMs", "Lkotlin/k2;", "a", "(Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera;I)V", "Lcom/google/android/gms/maps/model/LatLng;", "position", "radius", "Lcom/google/android/gms/maps/model/StreetViewSource;", "source", "h", "(Lcom/google/android/gms/maps/model/LatLng;Ljava/lang/Integer;Lcom/google/android/gms/maps/model/StreetViewSource;)V", "", "panoId", "i", "(Ljava/lang/String;)V", "Lcom/google/android/gms/maps/model/StreetViewPanoramaLocation;", "<set-?>", "Landroidx/compose/runtime/k2;", "e", "()Lcom/google/android/gms/maps/model/StreetViewPanoramaLocation;", "k", "(Lcom/google/android/gms/maps/model/StreetViewPanoramaLocation;)V", "rawLocation", "b", "f", "()Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera;", "l", "(Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera;)V", "rawPanoramaCamera", "Lcom/google/android/gms/maps/StreetViewPanorama;", "value", "c", "Lcom/google/android/gms/maps/StreetViewPanorama;", "()Lcom/google/android/gms/maps/StreetViewPanorama;", "g", "(Lcom/google/android/gms/maps/StreetViewPanorama;)V", "panorama", "location", "d", "panoramaCamera", "maps-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nStreetViewCameraPositionState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StreetViewCameraPositionState.kt\ncom/google/maps/android/compose/streetview/StreetViewCameraPositionState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,89:1\n81#2:90\n107#2,2:91\n81#2:93\n107#2,2:94\n*S KotlinDebug\n*F\n+ 1 StreetViewCameraPositionState.kt\ncom/google/maps/android/compose/streetview/StreetViewCameraPositionState\n*L\n34#1:90\n34#1:91,2\n45#1:93\n45#1:94,2\n*E\n"})
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final int f62105d = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 rawLocation;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 rawPanoramaCamera;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private StreetViewPanorama panorama;

    public a() {
        k2 g4;
        k2 g5;
        g4 = t4.g(new StreetViewPanoramaLocation(new StreetViewPanoramaLink[0], new LatLng(p.f60679p, p.f60679p), ""), null, 2, null);
        this.rawLocation = g4;
        g5 = t4.g(new StreetViewPanoramaCamera(0.0f, 0.0f, 0.0f), null, 2, null);
        this.rawPanoramaCamera = g5;
    }

    public static /* synthetic */ void j(a aVar, LatLng latLng, Integer num, StreetViewSource streetViewSource, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            num = null;
        }
        if ((i4 & 4) != 0) {
            streetViewSource = null;
        }
        aVar.h(latLng, num, streetViewSource);
    }

    public final void a(@fg.l StreetViewPanoramaCamera camera, int durationMs) {
        l0.p(camera, ProtectedSandApp.s("ࠔ\u0001"));
        StreetViewPanorama streetViewPanorama = this.panorama;
        if (streetViewPanorama != null) {
            streetViewPanorama.animateTo(camera, durationMs);
        }
    }

    @fg.l
    public final StreetViewPanoramaLocation b() {
        return e();
    }

    @fg.m
    /* renamed from: c, reason: from getter */
    public final StreetViewPanorama getPanorama() {
        return this.panorama;
    }

    @fg.l
    public final StreetViewPanoramaCamera d() {
        return f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @fg.l
    public final StreetViewPanoramaLocation e() {
        return (StreetViewPanoramaLocation) this.rawLocation.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @fg.l
    public final StreetViewPanoramaCamera f() {
        return (StreetViewPanoramaCamera) this.rawPanoramaCamera.getValue();
    }

    public final void g(@fg.m StreetViewPanorama streetViewPanorama) {
        StreetViewPanorama streetViewPanorama2 = this.panorama;
        if (streetViewPanorama2 == null && streetViewPanorama == null) {
            return;
        }
        if (streetViewPanorama2 != null && streetViewPanorama != null) {
            throw new IllegalStateException(ProtectedSandApp.s("ࠕ\u0001"));
        }
        this.panorama = streetViewPanorama;
    }

    public final void h(@fg.l LatLng position, @fg.m Integer radius, @fg.m StreetViewSource source) {
        StreetViewPanorama streetViewPanorama;
        l0.p(position, ProtectedSandApp.s("ࠖ\u0001"));
        if (radius == null && source == null) {
            StreetViewPanorama streetViewPanorama2 = this.panorama;
            if (streetViewPanorama2 != null) {
                streetViewPanorama2.setPosition(position);
                return;
            }
            return;
        }
        if (radius == null || source != null) {
            if (radius == null || (streetViewPanorama = this.panorama) == null) {
                return;
            }
            streetViewPanorama.setPosition(position, radius.intValue(), source);
            return;
        }
        StreetViewPanorama streetViewPanorama3 = this.panorama;
        if (streetViewPanorama3 != null) {
            streetViewPanorama3.setPosition(position, radius.intValue());
        }
    }

    public final void i(@fg.l String panoId) {
        l0.p(panoId, ProtectedSandApp.s("ࠗ\u0001"));
        StreetViewPanorama streetViewPanorama = this.panorama;
        if (streetViewPanorama != null) {
            streetViewPanorama.setPosition(panoId);
        }
    }

    public final void k(@fg.l StreetViewPanoramaLocation streetViewPanoramaLocation) {
        l0.p(streetViewPanoramaLocation, ProtectedSandApp.s("࠘\u0001"));
        this.rawLocation.setValue(streetViewPanoramaLocation);
    }

    public final void l(@fg.l StreetViewPanoramaCamera streetViewPanoramaCamera) {
        l0.p(streetViewPanoramaCamera, ProtectedSandApp.s("࠘\u0001"));
        this.rawPanoramaCamera.setValue(streetViewPanoramaCamera);
    }
}
