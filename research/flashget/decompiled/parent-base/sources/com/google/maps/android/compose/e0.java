package com.google.maps.android.compose;

import android.location.Location;
import androidx.compose.runtime.k2;
import androidx.compose.runtime.t4;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PointOfInterest;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: MapClickListeners.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R+\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\nRG\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f2\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0007\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012RG\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f2\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u0007\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R;\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00182\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00188F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0007\u001a\u0004\b\u0014\u0010\u0019\"\u0004\b\u001a\u0010\u001bR;\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00182\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00188F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u0007\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bRG\u0010$\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f2\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010\u0007\u001a\u0004\b\"\u0010\u0010\"\u0004\b#\u0010\u0012RG\u0010(\u001a\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f2\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010\u0007\u001a\u0004\b&\u0010\u0010\"\u0004\b'\u0010\u0012¨\u0006)"}, d2 = {"Lcom/google/maps/android/compose/e0;", "", "<init>", "()V", "Lcom/google/maps/android/compose/q;", "<set-?>", "a", "Landroidx/compose/runtime/k2;", "()Lcom/google/maps/android/compose/q;", "h", "(Lcom/google/maps/android/compose/q;)V", "indoorStateChangeListener", "Lkotlin/Function1;", "Lcom/google/android/gms/maps/model/LatLng;", "Lkotlin/k2;", "b", "()Lld/l;", "i", "(Lld/l;)V", "onMapClick", "c", "d", "k", "onMapLongClick", "Lkotlin/Function0;", "()Lld/a;", "j", "(Lld/a;)V", "onMapLoaded", "", "e", "l", "onMyLocationButtonClick", "Landroid/location/Location;", "f", "m", "onMyLocationClick", "Lcom/google/android/gms/maps/model/PointOfInterest;", "g", "n", "onPOIClick", "maps-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nMapClickListeners.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapClickListeners.kt\ncom/google/maps/android/compose/MapClickListeners\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,197:1\n81#2:198\n107#2,2:199\n81#2:201\n107#2,2:202\n81#2:204\n107#2,2:205\n81#2:207\n107#2,2:208\n81#2:210\n107#2,2:211\n81#2:213\n107#2,2:214\n81#2:216\n107#2,2:217\n*S KotlinDebug\n*F\n+ 1 MapClickListeners.kt\ncom/google/maps/android/compose/MapClickListeners\n*L\n63#1:198\n63#1:199,2\n64#1:201\n64#1:202,2\n65#1:204\n65#1:205,2\n66#1:207\n66#1:208,2\n67#1:210\n67#1:211,2\n68#1:213\n68#1:214,2\n69#1:216\n69#1:217,2\n*E\n"})
/* loaded from: classes6.dex */
public final class e0 {

    /* renamed from: h, reason: collision with root package name */
    public static final int f61426h = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 indoorStateChangeListener;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 onMapClick;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 onMapLongClick;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 onMapLoaded;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 onMyLocationButtonClick;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 onMyLocationClick;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 onPOIClick;

    public e0() {
        k2 g4;
        k2 g5;
        k2 g6;
        k2 g7;
        k2 g10;
        k2 g11;
        k2 g12;
        g4 = t4.g(i.f61503a, null, 2, null);
        this.indoorStateChangeListener = g4;
        g5 = t4.g(null, null, 2, null);
        this.onMapClick = g5;
        g6 = t4.g(null, null, 2, null);
        this.onMapLongClick = g6;
        g7 = t4.g(null, null, 2, null);
        this.onMapLoaded = g7;
        g10 = t4.g(null, null, 2, null);
        this.onMyLocationButtonClick = g10;
        g11 = t4.g(null, null, 2, null);
        this.onMyLocationClick = g11;
        g12 = t4.g(null, null, 2, null);
        this.onPOIClick = g12;
    }

    @fg.l
    public final q a() {
        return (q) this.indoorStateChangeListener.getValue();
    }

    @fg.m
    public final ld.l<LatLng, kotlin.k2> b() {
        return (ld.l) this.onMapClick.getValue();
    }

    @fg.m
    public final ld.a<kotlin.k2> c() {
        return (ld.a) this.onMapLoaded.getValue();
    }

    @fg.m
    public final ld.l<LatLng, kotlin.k2> d() {
        return (ld.l) this.onMapLongClick.getValue();
    }

    @fg.m
    public final ld.a<Boolean> e() {
        return (ld.a) this.onMyLocationButtonClick.getValue();
    }

    @fg.m
    public final ld.l<Location, kotlin.k2> f() {
        return (ld.l) this.onMyLocationClick.getValue();
    }

    @fg.m
    public final ld.l<PointOfInterest, kotlin.k2> g() {
        return (ld.l) this.onPOIClick.getValue();
    }

    public final void h(@fg.l q qVar) {
        kotlin.jvm.internal.l0.p(qVar, ProtectedSandApp.s("ܰ\u0001"));
        this.indoorStateChangeListener.setValue(qVar);
    }

    public final void i(@fg.m ld.l<? super LatLng, kotlin.k2> lVar) {
        this.onMapClick.setValue(lVar);
    }

    public final void j(@fg.m ld.a<kotlin.k2> aVar) {
        this.onMapLoaded.setValue(aVar);
    }

    public final void k(@fg.m ld.l<? super LatLng, kotlin.k2> lVar) {
        this.onMapLongClick.setValue(lVar);
    }

    public final void l(@fg.m ld.a<Boolean> aVar) {
        this.onMyLocationButtonClick.setValue(aVar);
    }

    public final void m(@fg.m ld.l<? super Location, kotlin.k2> lVar) {
        this.onMyLocationClick.setValue(lVar);
    }

    public final void n(@fg.m ld.l<? super PointOfInterest, kotlin.k2> lVar) {
        this.onPOIClick.setValue(lVar);
    }
}
