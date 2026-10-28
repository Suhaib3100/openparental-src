package com.google.maps.android.compose;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.CameraPosition;
import kotlin.Metadata;

/* compiled from: MapUpdater.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0000\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR.\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010 \u001a\u0004\u0018\u00010\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R*\u0010\u0005\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lcom/google/maps/android/compose/w0;", "Lcom/google/maps/android/compose/o0;", "Lcom/google/android/gms/maps/GoogleMap;", "map", "Lcom/google/maps/android/compose/b;", "cameraPositionState", "", "contentDescription", "Landroidx/compose/ui/unit/d;", "density", "Landroidx/compose/ui/unit/w;", "layoutDirection", "<init>", "(Lcom/google/android/gms/maps/GoogleMap;Lcom/google/maps/android/compose/b;Ljava/lang/String;Landroidx/compose/ui/unit/d;Landroidx/compose/ui/unit/w;)V", "Lkotlin/k2;", "a", "()V", "c", "b", "Lcom/google/android/gms/maps/GoogleMap;", "l", "()Lcom/google/android/gms/maps/GoogleMap;", "Landroidx/compose/ui/unit/d;", "j", "()Landroidx/compose/ui/unit/d;", "s", "(Landroidx/compose/ui/unit/d;)V", "Landroidx/compose/ui/unit/w;", "k", "()Landroidx/compose/ui/unit/w;", "t", "(Landroidx/compose/ui/unit/w;)V", "value", "d", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "r", "(Ljava/lang/String;)V", "e", "Lcom/google/maps/android/compose/b;", "h", "()Lcom/google/maps/android/compose/b;", "q", "(Lcom/google/maps/android/compose/b;)V", "maps-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class w0 implements o0 {

    /* renamed from: f, reason: collision with root package name */
    public static final int f62193f = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final GoogleMap map;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private androidx.compose.ui.unit.d density;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private androidx.compose.ui.unit.w layoutDirection;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private String contentDescription;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private b cameraPositionState;

    public w0(@fg.l GoogleMap googleMap, @fg.l b bVar, @fg.m String str, @fg.l androidx.compose.ui.unit.d dVar, @fg.l androidx.compose.ui.unit.w wVar) {
        kotlin.jvm.internal.l0.p(googleMap, ProtectedSandApp.s("࠾\u0001"));
        kotlin.jvm.internal.l0.p(bVar, ProtectedSandApp.s("\u083f\u0001"));
        kotlin.jvm.internal.l0.p(dVar, ProtectedSandApp.s("ࡀ\u0001"));
        kotlin.jvm.internal.l0.p(wVar, ProtectedSandApp.s("ࡁ\u0001"));
        this.map = googleMap;
        this.density = dVar;
        this.layoutDirection = wVar;
        bVar.x(googleMap);
        if (str != null) {
            googleMap.setContentDescription(str);
        }
        this.contentDescription = str;
        this.cameraPositionState = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(w0 w0Var) {
        kotlin.jvm.internal.l0.p(w0Var, ProtectedSandApp.s("ࡂ\u0001"));
        w0Var.cameraPositionState.z(false);
        b bVar = w0Var.cameraPositionState;
        CameraPosition cameraPosition = w0Var.map.getCameraPosition();
        kotlin.jvm.internal.l0.o(cameraPosition, ProtectedSandApp.s("ࡃ\u0001"));
        bVar.C(cameraPosition);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(w0 w0Var) {
        kotlin.jvm.internal.l0.p(w0Var, ProtectedSandApp.s("ࡂ\u0001"));
        w0Var.cameraPositionState.z(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(w0 w0Var, int i4) {
        kotlin.jvm.internal.l0.p(w0Var, ProtectedSandApp.s("ࡂ\u0001"));
        w0Var.cameraPositionState.v(a.INSTANCE.a(i4));
        w0Var.cameraPositionState.z(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(w0 w0Var) {
        kotlin.jvm.internal.l0.p(w0Var, ProtectedSandApp.s("ࡂ\u0001"));
        b bVar = w0Var.cameraPositionState;
        CameraPosition cameraPosition = w0Var.map.getCameraPosition();
        kotlin.jvm.internal.l0.o(cameraPosition, ProtectedSandApp.s("ࡃ\u0001"));
        bVar.C(cameraPosition);
    }

    @Override // com.google.maps.android.compose.o0
    public void a() {
        this.map.setOnCameraIdleListener(new GoogleMap.OnCameraIdleListener() { // from class: com.google.maps.android.compose.s0
            @Override // com.google.android.gms.maps.GoogleMap.OnCameraIdleListener
            public final void onCameraIdle() {
                w0.m(w0.this);
            }
        });
        this.map.setOnCameraMoveCanceledListener(new GoogleMap.OnCameraMoveCanceledListener() { // from class: com.google.maps.android.compose.t0
            @Override // com.google.android.gms.maps.GoogleMap.OnCameraMoveCanceledListener
            public final void onCameraMoveCanceled() {
                w0.n(w0.this);
            }
        });
        this.map.setOnCameraMoveStartedListener(new GoogleMap.OnCameraMoveStartedListener() { // from class: com.google.maps.android.compose.u0
            @Override // com.google.android.gms.maps.GoogleMap.OnCameraMoveStartedListener
            public final void onCameraMoveStarted(int i4) {
                w0.o(w0.this, i4);
            }
        });
        this.map.setOnCameraMoveListener(new GoogleMap.OnCameraMoveListener() { // from class: com.google.maps.android.compose.v0
            @Override // com.google.android.gms.maps.GoogleMap.OnCameraMoveListener
            public final void onCameraMove() {
                w0.p(w0.this);
            }
        });
    }

    @Override // com.google.maps.android.compose.o0
    public void b() {
        this.cameraPositionState.x(null);
    }

    @Override // com.google.maps.android.compose.o0
    public void c() {
        this.cameraPositionState.x(null);
    }

    @fg.l
    /* renamed from: h, reason: from getter */
    public final b getCameraPositionState() {
        return this.cameraPositionState;
    }

    @fg.m
    /* renamed from: i, reason: from getter */
    public final String getContentDescription() {
        return this.contentDescription;
    }

    @fg.l
    /* renamed from: j, reason: from getter */
    public final androidx.compose.ui.unit.d getDensity() {
        return this.density;
    }

    @fg.l
    /* renamed from: k, reason: from getter */
    public final androidx.compose.ui.unit.w getLayoutDirection() {
        return this.layoutDirection;
    }

    @fg.l
    /* renamed from: l, reason: from getter */
    public final GoogleMap getMap() {
        return this.map;
    }

    public final void q(@fg.l b bVar) {
        kotlin.jvm.internal.l0.p(bVar, ProtectedSandApp.s("ࡄ\u0001"));
        if (kotlin.jvm.internal.l0.g(bVar, this.cameraPositionState)) {
            return;
        }
        this.cameraPositionState.x(null);
        this.cameraPositionState = bVar;
        bVar.x(this.map);
    }

    public final void r(@fg.m String str) {
        this.contentDescription = str;
        this.map.setContentDescription(str);
    }

    public final void s(@fg.l androidx.compose.ui.unit.d dVar) {
        kotlin.jvm.internal.l0.p(dVar, ProtectedSandApp.s("ࡅ\u0001"));
        this.density = dVar;
    }

    public final void t(@fg.l androidx.compose.ui.unit.w wVar) {
        kotlin.jvm.internal.l0.p(wVar, ProtectedSandApp.s("ࡅ\u0001"));
        this.layoutDirection = wVar;
    }
}
