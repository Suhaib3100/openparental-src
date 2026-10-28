package com.google.maps.android.compose;

import androidx.compose.runtime.k2;
import androidx.compose.runtime.t4;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.GroundOverlay;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.Polyline;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: InputHandler.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b'\b\u0000\u0018\u00002\u00020\u0001B\u008f\u0002\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0016RG\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dRG\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dRG\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010\u0019\u001a\u0004\b\"\u0010\u001b\"\u0004\b#\u0010\u001dRG\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b$\u0010\u001b\"\u0004\b%\u0010\u001dRG\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u00022\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b&\u0010\u001b\"\u0004\b'\u0010\u001dRG\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b(\u0010\u0019\u001a\u0004\b(\u0010\u001b\"\u0004\b)\u0010\u001dRG\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010\u0019\u001a\u0004\b*\u0010\u001b\"\u0004\b+\u0010\u001dRG\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b,\u0010\u0019\u001a\u0004\b,\u0010\u001b\"\u0004\b-\u0010\u001dRG\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010\u0019\u001a\u0004\b.\u0010\u001b\"\u0004\b/\u0010\u001dRG\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b.\u0010\u0019\u001a\u0004\b0\u0010\u001b\"\u0004\b1\u0010\u001dRG\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b0\u0010\u0019\u001a\u0004\b2\u0010\u001b\"\u0004\b3\u0010\u001d¨\u00064"}, d2 = {"Lcom/google/maps/android/compose/s;", "Lcom/google/maps/android/compose/o0;", "Lkotlin/Function1;", "Lcom/google/android/gms/maps/model/Circle;", "Lkotlin/k2;", "onCircleClick", "Lcom/google/android/gms/maps/model/GroundOverlay;", "onGroundOverlayClick", "Lcom/google/android/gms/maps/model/Polygon;", "onPolygonClick", "Lcom/google/android/gms/maps/model/Polyline;", "onPolylineClick", "Lcom/google/android/gms/maps/model/Marker;", "", "onMarkerClick", "onInfoWindowClick", "onInfoWindowClose", "onInfoWindowLongClick", "onMarkerDrag", "onMarkerDragEnd", "onMarkerDragStart", "<init>", "(Lld/l;Lld/l;Lld/l;Lld/l;Lld/l;Lld/l;Lld/l;Lld/l;Lld/l;Lld/l;Lld/l;)V", "<set-?>", "a", "Landroidx/compose/runtime/k2;", "d", "()Lld/l;", "o", "(Lld/l;)V", "b", "e", "p", "c", "m", "x", "n", "y", "i", "t", "f", "q", "g", "r", "h", "s", "j", "u", "k", "v", "l", "w", "maps-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nInputHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InputHandler.kt\ncom/google/maps/android/compose/InputHandlerNode\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,94:1\n81#2:95\n107#2,2:96\n81#2:98\n107#2,2:99\n81#2:101\n107#2,2:102\n81#2:104\n107#2,2:105\n81#2:107\n107#2,2:108\n81#2:110\n107#2,2:111\n81#2:113\n107#2,2:114\n81#2:116\n107#2,2:117\n81#2:119\n107#2,2:120\n81#2:122\n107#2,2:123\n81#2:125\n107#2,2:126\n*S KotlinDebug\n*F\n+ 1 InputHandler.kt\ncom/google/maps/android/compose/InputHandlerNode\n*L\n82#1:95\n82#1:96,2\n83#1:98\n83#1:99,2\n84#1:101\n84#1:102,2\n85#1:104\n85#1:105,2\n86#1:107\n86#1:108,2\n87#1:110\n87#1:111,2\n88#1:113\n88#1:114,2\n89#1:116\n89#1:117,2\n90#1:119\n90#1:120,2\n91#1:122\n91#1:123,2\n92#1:125\n92#1:126,2\n*E\n"})
/* loaded from: classes6.dex */
public final class s implements o0 {

    /* renamed from: l, reason: collision with root package name */
    public static final int f62092l = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 onCircleClick;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 onGroundOverlayClick;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 onPolygonClick;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 onPolylineClick;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 onMarkerClick;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 onInfoWindowClick;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 onInfoWindowClose;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 onInfoWindowLongClick;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 onMarkerDrag;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 onMarkerDragEnd;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 onMarkerDragStart;

    public s() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    @Override // com.google.maps.android.compose.o0
    public void a() {
    }

    @Override // com.google.maps.android.compose.o0
    public void b() {
    }

    @Override // com.google.maps.android.compose.o0
    public void c() {
    }

    @fg.m
    public final ld.l<Circle, kotlin.k2> d() {
        return (ld.l) this.onCircleClick.getValue();
    }

    @fg.m
    public final ld.l<GroundOverlay, kotlin.k2> e() {
        return (ld.l) this.onGroundOverlayClick.getValue();
    }

    @fg.m
    public final ld.l<Marker, kotlin.k2> f() {
        return (ld.l) this.onInfoWindowClick.getValue();
    }

    @fg.m
    public final ld.l<Marker, kotlin.k2> g() {
        return (ld.l) this.onInfoWindowClose.getValue();
    }

    @fg.m
    public final ld.l<Marker, kotlin.k2> h() {
        return (ld.l) this.onInfoWindowLongClick.getValue();
    }

    @fg.m
    public final ld.l<Marker, Boolean> i() {
        return (ld.l) this.onMarkerClick.getValue();
    }

    @fg.m
    public final ld.l<Marker, kotlin.k2> j() {
        return (ld.l) this.onMarkerDrag.getValue();
    }

    @fg.m
    public final ld.l<Marker, kotlin.k2> k() {
        return (ld.l) this.onMarkerDragEnd.getValue();
    }

    @fg.m
    public final ld.l<Marker, kotlin.k2> l() {
        return (ld.l) this.onMarkerDragStart.getValue();
    }

    @fg.m
    public final ld.l<Polygon, kotlin.k2> m() {
        return (ld.l) this.onPolygonClick.getValue();
    }

    @fg.m
    public final ld.l<Polyline, kotlin.k2> n() {
        return (ld.l) this.onPolylineClick.getValue();
    }

    public final void o(@fg.m ld.l<? super Circle, kotlin.k2> lVar) {
        this.onCircleClick.setValue(lVar);
    }

    public final void p(@fg.m ld.l<? super GroundOverlay, kotlin.k2> lVar) {
        this.onGroundOverlayClick.setValue(lVar);
    }

    public final void q(@fg.m ld.l<? super Marker, kotlin.k2> lVar) {
        this.onInfoWindowClick.setValue(lVar);
    }

    public final void r(@fg.m ld.l<? super Marker, kotlin.k2> lVar) {
        this.onInfoWindowClose.setValue(lVar);
    }

    public final void s(@fg.m ld.l<? super Marker, kotlin.k2> lVar) {
        this.onInfoWindowLongClick.setValue(lVar);
    }

    public final void t(@fg.m ld.l<? super Marker, Boolean> lVar) {
        this.onMarkerClick.setValue(lVar);
    }

    public final void u(@fg.m ld.l<? super Marker, kotlin.k2> lVar) {
        this.onMarkerDrag.setValue(lVar);
    }

    public final void v(@fg.m ld.l<? super Marker, kotlin.k2> lVar) {
        this.onMarkerDragEnd.setValue(lVar);
    }

    public final void w(@fg.m ld.l<? super Marker, kotlin.k2> lVar) {
        this.onMarkerDragStart.setValue(lVar);
    }

    public final void x(@fg.m ld.l<? super Polygon, kotlin.k2> lVar) {
        this.onPolygonClick.setValue(lVar);
    }

    public final void y(@fg.m ld.l<? super Polyline, kotlin.k2> lVar) {
        this.onPolylineClick.setValue(lVar);
    }

    public s(@fg.m ld.l<? super Circle, kotlin.k2> lVar, @fg.m ld.l<? super GroundOverlay, kotlin.k2> lVar2, @fg.m ld.l<? super Polygon, kotlin.k2> lVar3, @fg.m ld.l<? super Polyline, kotlin.k2> lVar4, @fg.m ld.l<? super Marker, Boolean> lVar5, @fg.m ld.l<? super Marker, kotlin.k2> lVar6, @fg.m ld.l<? super Marker, kotlin.k2> lVar7, @fg.m ld.l<? super Marker, kotlin.k2> lVar8, @fg.m ld.l<? super Marker, kotlin.k2> lVar9, @fg.m ld.l<? super Marker, kotlin.k2> lVar10, @fg.m ld.l<? super Marker, kotlin.k2> lVar11) {
        k2 g4;
        k2 g5;
        k2 g6;
        k2 g7;
        k2 g10;
        k2 g11;
        k2 g12;
        k2 g13;
        k2 g14;
        k2 g15;
        k2 g16;
        g4 = t4.g(lVar, null, 2, null);
        this.onCircleClick = g4;
        g5 = t4.g(lVar2, null, 2, null);
        this.onGroundOverlayClick = g5;
        g6 = t4.g(lVar3, null, 2, null);
        this.onPolygonClick = g6;
        g7 = t4.g(lVar4, null, 2, null);
        this.onPolylineClick = g7;
        g10 = t4.g(lVar5, null, 2, null);
        this.onMarkerClick = g10;
        g11 = t4.g(lVar6, null, 2, null);
        this.onInfoWindowClick = g11;
        g12 = t4.g(lVar7, null, 2, null);
        this.onInfoWindowClose = g12;
        g13 = t4.g(lVar8, null, 2, null);
        this.onInfoWindowLongClick = g13;
        g14 = t4.g(lVar9, null, 2, null);
        this.onMarkerDrag = g14;
        g15 = t4.g(lVar10, null, 2, null);
        this.onMarkerDragEnd = g15;
        g16 = t4.g(lVar11, null, 2, null);
        this.onMarkerDragStart = g16;
    }

    public /* synthetic */ s(ld.l lVar, ld.l lVar2, ld.l lVar3, ld.l lVar4, ld.l lVar5, ld.l lVar6, ld.l lVar7, ld.l lVar8, ld.l lVar9, ld.l lVar10, ld.l lVar11, int i4, kotlin.jvm.internal.w wVar) {
        this((i4 & 1) != 0 ? null : lVar, (i4 & 2) != 0 ? null : lVar2, (i4 & 4) != 0 ? null : lVar3, (i4 & 8) != 0 ? null : lVar4, (i4 & 16) != 0 ? null : lVar5, (i4 & 32) != 0 ? null : lVar6, (i4 & 64) != 0 ? null : lVar7, (i4 & 128) != 0 ? null : lVar8, (i4 & 256) != 0 ? null : lVar9, (i4 & 512) != 0 ? null : lVar10, (i4 & 1024) == 0 ? lVar11 : null);
    }
}
