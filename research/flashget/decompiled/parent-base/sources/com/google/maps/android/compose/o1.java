package com.google.maps.android.compose;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.maps.model.TileOverlay;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: TileOverlay.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0002\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R.\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/google/maps/android/compose/o1;", "Lcom/google/maps/android/compose/o0;", "Lcom/google/android/gms/maps/model/TileOverlay;", "tileOverlay", "Lcom/google/maps/android/compose/p1;", "tileOverlayState", "Lkotlin/Function1;", "Lkotlin/k2;", "onTileOverlayClick", "<init>", "(Lcom/google/android/gms/maps/model/TileOverlay;Lcom/google/maps/android/compose/p1;Lld/l;)V", "a", "()V", "c", "Lcom/google/android/gms/maps/model/TileOverlay;", "e", "()Lcom/google/android/gms/maps/model/TileOverlay;", "h", "(Lcom/google/android/gms/maps/model/TileOverlay;)V", "b", "Lcom/google/maps/android/compose/p1;", "f", "()Lcom/google/maps/android/compose/p1;", "i", "(Lcom/google/maps/android/compose/p1;)V", "Lld/l;", "d", "()Lld/l;", "g", "(Lld/l;)V", "maps-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class o1 implements o0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private TileOverlay tileOverlay;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private p1 tileOverlayState;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private ld.l<? super TileOverlay, k2> onTileOverlayClick;

    public o1(@fg.l TileOverlay tileOverlay, @fg.l p1 p1Var, @fg.l ld.l<? super TileOverlay, k2> lVar) {
        kotlin.jvm.internal.l0.p(tileOverlay, ProtectedSandApp.s("߳\u0001"));
        kotlin.jvm.internal.l0.p(p1Var, ProtectedSandApp.s("ߴ\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("ߵ\u0001"));
        this.tileOverlay = tileOverlay;
        this.tileOverlayState = p1Var;
        this.onTileOverlayClick = lVar;
    }

    @Override // com.google.maps.android.compose.o0
    public void a() {
        this.tileOverlayState.c(this.tileOverlay);
    }

    @Override // com.google.maps.android.compose.o0
    public void b() {
    }

    @Override // com.google.maps.android.compose.o0
    public void c() {
        this.tileOverlay.remove();
    }

    @fg.l
    public final ld.l<TileOverlay, k2> d() {
        return this.onTileOverlayClick;
    }

    @fg.l
    /* renamed from: e, reason: from getter */
    public final TileOverlay getTileOverlay() {
        return this.tileOverlay;
    }

    @fg.l
    /* renamed from: f, reason: from getter */
    public final p1 getTileOverlayState() {
        return this.tileOverlayState;
    }

    public final void g(@fg.l ld.l<? super TileOverlay, k2> lVar) {
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("߶\u0001"));
        this.onTileOverlayClick = lVar;
    }

    public final void h(@fg.l TileOverlay tileOverlay) {
        kotlin.jvm.internal.l0.p(tileOverlay, ProtectedSandApp.s("߶\u0001"));
        this.tileOverlay = tileOverlay;
    }

    public final void i(@fg.l p1 p1Var) {
        kotlin.jvm.internal.l0.p(p1Var, ProtectedSandApp.s("߶\u0001"));
        this.tileOverlayState = p1Var;
    }
}
