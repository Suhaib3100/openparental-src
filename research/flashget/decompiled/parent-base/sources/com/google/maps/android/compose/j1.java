package com.google.maps.android.compose;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.maps.model.Polyline;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: Polyline.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR.\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/google/maps/android/compose/j1;", "Lcom/google/maps/android/compose/o0;", "Lcom/google/android/gms/maps/model/Polyline;", "polyline", "Lkotlin/Function1;", "Lkotlin/k2;", "onPolylineClick", "<init>", "(Lcom/google/android/gms/maps/model/Polyline;Lld/l;)V", "c", "()V", "a", "Lcom/google/android/gms/maps/model/Polyline;", "e", "()Lcom/google/android/gms/maps/model/Polyline;", "b", "Lld/l;", "d", "()Lld/l;", "f", "(Lld/l;)V", "maps-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class j1 implements o0 {

    /* renamed from: c, reason: collision with root package name */
    public static final int f61552c = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Polyline polyline;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private ld.l<? super Polyline, k2> onPolylineClick;

    public j1(@fg.l Polyline polyline, @fg.l ld.l<? super Polyline, k2> lVar) {
        kotlin.jvm.internal.l0.p(polyline, ProtectedSandApp.s("ݱ\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("ݲ\u0001"));
        this.polyline = polyline;
        this.onPolylineClick = lVar;
    }

    @Override // com.google.maps.android.compose.o0
    public void a() {
    }

    @Override // com.google.maps.android.compose.o0
    public void b() {
    }

    @Override // com.google.maps.android.compose.o0
    public void c() {
        this.polyline.remove();
    }

    @fg.l
    public final ld.l<Polyline, k2> d() {
        return this.onPolylineClick;
    }

    @fg.l
    /* renamed from: e, reason: from getter */
    public final Polyline getPolyline() {
        return this.polyline;
    }

    public final void f(@fg.l ld.l<? super Polyline, k2> lVar) {
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("ݳ\u0001"));
        this.onPolylineClick = lVar;
    }
}
