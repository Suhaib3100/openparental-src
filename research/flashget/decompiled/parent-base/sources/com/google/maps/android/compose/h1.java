package com.google.maps.android.compose;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.maps.model.Polygon;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: Polygon.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR.\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/google/maps/android/compose/h1;", "Lcom/google/maps/android/compose/o0;", "Lcom/google/android/gms/maps/model/Polygon;", "polygon", "Lkotlin/Function1;", "Lkotlin/k2;", "onPolygonClick", "<init>", "(Lcom/google/android/gms/maps/model/Polygon;Lld/l;)V", "c", "()V", "a", "Lcom/google/android/gms/maps/model/Polygon;", "e", "()Lcom/google/android/gms/maps/model/Polygon;", "b", "Lld/l;", "d", "()Lld/l;", "f", "(Lld/l;)V", "maps-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class h1 implements o0 {

    /* renamed from: c, reason: collision with root package name */
    public static final int f61500c = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Polygon polygon;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private ld.l<? super Polygon, k2> onPolygonClick;

    public h1(@fg.l Polygon polygon, @fg.l ld.l<? super Polygon, k2> lVar) {
        kotlin.jvm.internal.l0.p(polygon, ProtectedSandApp.s("ݘ\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("ݙ\u0001"));
        this.polygon = polygon;
        this.onPolygonClick = lVar;
    }

    @Override // com.google.maps.android.compose.o0
    public void a() {
    }

    @Override // com.google.maps.android.compose.o0
    public void b() {
    }

    @Override // com.google.maps.android.compose.o0
    public void c() {
        this.polygon.remove();
    }

    @fg.l
    public final ld.l<Polygon, k2> d() {
        return this.onPolygonClick;
    }

    @fg.l
    /* renamed from: e, reason: from getter */
    public final Polygon getPolygon() {
        return this.polygon;
    }

    public final void f(@fg.l ld.l<? super Polygon, k2> lVar) {
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("ݚ\u0001"));
        this.onPolygonClick = lVar;
    }
}
