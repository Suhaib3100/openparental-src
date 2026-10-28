package com.google.maps.android.compose;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.maps.model.Marker;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: Marker.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b$\b\u0000\u0018\u00002\u00020\u0001B¥\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\b\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\b\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\b\u0012\u0019\u0010\u0010\u001a\u0015\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b¢\u0006\u0002\b\u000f\u0012\u0019\u0010\u0011\u001a\u0015\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b¢\u0006\u0002\b\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001e\u001a\u0004\b\u001f\u0010 R.\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R.\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010!\u001a\u0004\b'\u0010#\"\u0004\b(\u0010%R.\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010!\u001a\u0004\b*\u0010#\"\u0004\b+\u0010%R.\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010!\u001a\u0004\b,\u0010#\"\u0004\b-\u0010%R5\u0010\u0010\u001a\u0015\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b¢\u0006\u0002\b\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010.\u001a\u0004\b)\u0010/\"\u0004\b0\u00101R5\u0010\u0011\u001a\u0015\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b¢\u0006\u0002\b\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010.\u001a\u0004\b&\u0010/\"\u0004\b2\u00101¨\u00063"}, d2 = {"Lcom/google/maps/android/compose/d1;", "Lcom/google/maps/android/compose/o0;", "Landroidx/compose/runtime/z;", "compositionContext", "Lcom/google/android/gms/maps/model/Marker;", "marker", "Lcom/google/maps/android/compose/e1;", "markerState", "Lkotlin/Function1;", "", "onMarkerClick", "Lkotlin/k2;", "onInfoWindowClick", "onInfoWindowClose", "onInfoWindowLongClick", "Landroidx/compose/runtime/i;", "infoWindow", "infoContent", "<init>", "(Landroidx/compose/runtime/z;Lcom/google/android/gms/maps/model/Marker;Lcom/google/maps/android/compose/e1;Lld/l;Lld/l;Lld/l;Lld/l;Lld/q;Lld/q;)V", "a", "()V", "c", "b", "Landroidx/compose/runtime/z;", "d", "()Landroidx/compose/runtime/z;", "Lcom/google/android/gms/maps/model/Marker;", "g", "()Lcom/google/android/gms/maps/model/Marker;", "Lcom/google/maps/android/compose/e1;", "h", "()Lcom/google/maps/android/compose/e1;", "Lld/l;", "l", "()Lld/l;", "r", "(Lld/l;)V", "e", "i", "o", "f", "j", "p", "k", "q", "Lld/q;", "()Lld/q;", "n", "(Lld/q;)V", "m", "maps-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class d1 implements o0 {

    /* renamed from: j, reason: collision with root package name */
    public static final int f61413j = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.z compositionContext;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Marker marker;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final e1 markerState;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private ld.l<? super Marker, Boolean> onMarkerClick;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private ld.l<? super Marker, k2> onInfoWindowClick;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private ld.l<? super Marker, k2> onInfoWindowClose;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private ld.l<? super Marker, k2> onInfoWindowLongClick;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private ld.q<? super Marker, ? super androidx.compose.runtime.t, ? super Integer, k2> infoWindow;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private ld.q<? super Marker, ? super androidx.compose.runtime.t, ? super Integer, k2> infoContent;

    public d1(@fg.l androidx.compose.runtime.z zVar, @fg.l Marker marker, @fg.l e1 e1Var, @fg.l ld.l<? super Marker, Boolean> lVar, @fg.l ld.l<? super Marker, k2> lVar2, @fg.l ld.l<? super Marker, k2> lVar3, @fg.l ld.l<? super Marker, k2> lVar4, @fg.m ld.q<? super Marker, ? super androidx.compose.runtime.t, ? super Integer, k2> qVar, @fg.m ld.q<? super Marker, ? super androidx.compose.runtime.t, ? super Integer, k2> qVar2) {
        kotlin.jvm.internal.l0.p(zVar, ProtectedSandApp.s("ܦ\u0001"));
        kotlin.jvm.internal.l0.p(marker, ProtectedSandApp.s("ܧ\u0001"));
        kotlin.jvm.internal.l0.p(e1Var, ProtectedSandApp.s("ܨ\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("ܩ\u0001"));
        kotlin.jvm.internal.l0.p(lVar2, ProtectedSandApp.s("ܪ\u0001"));
        kotlin.jvm.internal.l0.p(lVar3, ProtectedSandApp.s("ܫ\u0001"));
        kotlin.jvm.internal.l0.p(lVar4, ProtectedSandApp.s("ܬ\u0001"));
        this.compositionContext = zVar;
        this.marker = marker;
        this.markerState = e1Var;
        this.onMarkerClick = lVar;
        this.onInfoWindowClick = lVar2;
        this.onInfoWindowClose = lVar3;
        this.onInfoWindowLongClick = lVar4;
        this.infoWindow = qVar;
        this.infoContent = qVar2;
    }

    @Override // com.google.maps.android.compose.o0
    public void a() {
        this.markerState.g(this.marker);
    }

    @Override // com.google.maps.android.compose.o0
    public void b() {
        this.markerState.g(null);
        this.marker.remove();
    }

    @Override // com.google.maps.android.compose.o0
    public void c() {
        this.markerState.g(null);
        this.marker.remove();
    }

    @fg.l
    /* renamed from: d, reason: from getter */
    public final androidx.compose.runtime.z getCompositionContext() {
        return this.compositionContext;
    }

    @fg.m
    public final ld.q<Marker, androidx.compose.runtime.t, Integer, k2> e() {
        return this.infoContent;
    }

    @fg.m
    public final ld.q<Marker, androidx.compose.runtime.t, Integer, k2> f() {
        return this.infoWindow;
    }

    @fg.l
    /* renamed from: g, reason: from getter */
    public final Marker getMarker() {
        return this.marker;
    }

    @fg.l
    /* renamed from: h, reason: from getter */
    public final e1 getMarkerState() {
        return this.markerState;
    }

    @fg.l
    public final ld.l<Marker, k2> i() {
        return this.onInfoWindowClick;
    }

    @fg.l
    public final ld.l<Marker, k2> j() {
        return this.onInfoWindowClose;
    }

    @fg.l
    public final ld.l<Marker, k2> k() {
        return this.onInfoWindowLongClick;
    }

    @fg.l
    public final ld.l<Marker, Boolean> l() {
        return this.onMarkerClick;
    }

    public final void m(@fg.m ld.q<? super Marker, ? super androidx.compose.runtime.t, ? super Integer, k2> qVar) {
        this.infoContent = qVar;
    }

    public final void n(@fg.m ld.q<? super Marker, ? super androidx.compose.runtime.t, ? super Integer, k2> qVar) {
        this.infoWindow = qVar;
    }

    public final void o(@fg.l ld.l<? super Marker, k2> lVar) {
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("ܭ\u0001"));
        this.onInfoWindowClick = lVar;
    }

    public final void p(@fg.l ld.l<? super Marker, k2> lVar) {
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("ܭ\u0001"));
        this.onInfoWindowClose = lVar;
    }

    public final void q(@fg.l ld.l<? super Marker, k2> lVar) {
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("ܭ\u0001"));
        this.onInfoWindowLongClick = lVar;
    }

    public final void r(@fg.l ld.l<? super Marker, Boolean> lVar) {
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("ܭ\u0001"));
        this.onMarkerClick = lVar;
    }
}
