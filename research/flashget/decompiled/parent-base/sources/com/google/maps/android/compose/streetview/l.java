package com.google.maps.android.compose.streetview;

import androidx.compose.runtime.internal.u;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.maps.StreetViewPanorama;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;
import com.google.maps.android.compose.o0;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: StreetViewPanoramaUpdater.kt */
@u(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/google/maps/android/compose/streetview/l;", "Lcom/google/maps/android/compose/o0;", "Lcom/google/maps/android/compose/streetview/a;", "cameraPositionState", "Lcom/google/android/gms/maps/StreetViewPanorama;", "panorama", "Lcom/google/maps/android/compose/streetview/f;", "eventListeners", "<init>", "(Lcom/google/maps/android/compose/streetview/a;Lcom/google/android/gms/maps/StreetViewPanorama;Lcom/google/maps/android/compose/streetview/f;)V", "Lkotlin/k2;", "a", "()V", "c", "b", "Lcom/google/maps/android/compose/streetview/a;", "h", "()Lcom/google/maps/android/compose/streetview/a;", "Lcom/google/android/gms/maps/StreetViewPanorama;", "j", "()Lcom/google/android/gms/maps/StreetViewPanorama;", "Lcom/google/maps/android/compose/streetview/f;", "i", "()Lcom/google/maps/android/compose/streetview/f;", "o", "(Lcom/google/maps/android/compose/streetview/f;)V", "maps-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class l implements o0 {

    /* renamed from: d, reason: collision with root package name */
    public static final int f62173d = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final a cameraPositionState;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final StreetViewPanorama panorama;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private f eventListeners;

    public l(@fg.l a aVar, @fg.l StreetViewPanorama streetViewPanorama, @fg.l f fVar) {
        l0.p(aVar, ProtectedSandApp.s("\u082f\u0001"));
        l0.p(streetViewPanorama, ProtectedSandApp.s("࠰\u0001"));
        l0.p(fVar, ProtectedSandApp.s("࠱\u0001"));
        this.cameraPositionState = aVar;
        this.panorama = streetViewPanorama;
        this.eventListeners = fVar;
        aVar.g(streetViewPanorama);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(l lVar, StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
        l0.p(lVar, ProtectedSandApp.s("࠲\u0001"));
        l0.p(streetViewPanoramaOrientation, ProtectedSandApp.s("࠳\u0001"));
        lVar.eventListeners.a().invoke(streetViewPanoramaOrientation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(l lVar, StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
        l0.p(lVar, ProtectedSandApp.s("࠲\u0001"));
        l0.p(streetViewPanoramaOrientation, ProtectedSandApp.s("࠳\u0001"));
        lVar.eventListeners.b().invoke(streetViewPanoramaOrientation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(l lVar, StreetViewPanoramaCamera streetViewPanoramaCamera) {
        l0.p(lVar, ProtectedSandApp.s("࠲\u0001"));
        l0.p(streetViewPanoramaCamera, ProtectedSandApp.s("࠳\u0001"));
        lVar.cameraPositionState.l(streetViewPanoramaCamera);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(l lVar, StreetViewPanoramaLocation streetViewPanoramaLocation) {
        l0.p(lVar, ProtectedSandApp.s("࠲\u0001"));
        l0.p(streetViewPanoramaLocation, ProtectedSandApp.s("࠳\u0001"));
        lVar.cameraPositionState.k(streetViewPanoramaLocation);
    }

    @Override // com.google.maps.android.compose.o0
    public void a() {
        this.panorama.setOnStreetViewPanoramaClickListener(new StreetViewPanorama.OnStreetViewPanoramaClickListener() { // from class: com.google.maps.android.compose.streetview.h
            @Override // com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener
            public final void onStreetViewPanoramaClick(StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
                l.k(l.this, streetViewPanoramaOrientation);
            }
        });
        this.panorama.setOnStreetViewPanoramaLongClickListener(new StreetViewPanorama.OnStreetViewPanoramaLongClickListener() { // from class: com.google.maps.android.compose.streetview.i
            @Override // com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener
            public final void onStreetViewPanoramaLongClick(StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
                l.l(l.this, streetViewPanoramaOrientation);
            }
        });
        this.panorama.setOnStreetViewPanoramaCameraChangeListener(new StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener() { // from class: com.google.maps.android.compose.streetview.j
            @Override // com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener
            public final void onStreetViewPanoramaCameraChange(StreetViewPanoramaCamera streetViewPanoramaCamera) {
                l.m(l.this, streetViewPanoramaCamera);
            }
        });
        this.panorama.setOnStreetViewPanoramaChangeListener(new StreetViewPanorama.OnStreetViewPanoramaChangeListener() { // from class: com.google.maps.android.compose.streetview.k
            @Override // com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener
            public final void onStreetViewPanoramaChange(StreetViewPanoramaLocation streetViewPanoramaLocation) {
                l.n(l.this, streetViewPanoramaLocation);
            }
        });
    }

    @Override // com.google.maps.android.compose.o0
    public void b() {
        this.cameraPositionState.g(null);
    }

    @Override // com.google.maps.android.compose.o0
    public void c() {
        this.cameraPositionState.g(null);
    }

    @fg.l
    /* renamed from: h, reason: from getter */
    public final a getCameraPositionState() {
        return this.cameraPositionState;
    }

    @fg.l
    /* renamed from: i, reason: from getter */
    public final f getEventListeners() {
        return this.eventListeners;
    }

    @fg.l
    /* renamed from: j, reason: from getter */
    public final StreetViewPanorama getPanorama() {
        return this.panorama;
    }

    public final void o(@fg.l f fVar) {
        l0.p(fVar, ProtectedSandApp.s("࠴\u0001"));
        this.eventListeners = fVar;
    }
}
