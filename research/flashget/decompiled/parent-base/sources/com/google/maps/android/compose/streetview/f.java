package com.google.maps.android.compose.streetview;

import androidx.compose.runtime.internal.u;
import androidx.compose.runtime.k2;
import androidx.compose.runtime.t4;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;

/* compiled from: StreetViewPanoramaEventListeners.kt */
@u(parameters = 1)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003RC\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n\"\u0004\b\u000b\u0010\fRC\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/google/maps/android/compose/streetview/f;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/google/android/gms/maps/model/StreetViewPanoramaOrientation;", "Lkotlin/k2;", "<set-?>", "a", "Landroidx/compose/runtime/k2;", "()Lld/l;", "c", "(Lld/l;)V", "onClick", "b", "d", "onLongClick", "maps-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nStreetViewPanoramaEventListeners.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StreetViewPanoramaEventListeners.kt\ncom/google/maps/android/compose/streetview/StreetViewPanoramaEventListeners\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,15:1\n81#2:16\n107#2,2:17\n81#2:19\n107#2,2:20\n*S KotlinDebug\n*F\n+ 1 StreetViewPanoramaEventListeners.kt\ncom/google/maps/android/compose/streetview/StreetViewPanoramaEventListeners\n*L\n13#1:16\n13#1:17,2\n14#1:19\n14#1:20,2\n*E\n"})
/* loaded from: classes6.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    public static final int f62163c = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 onClick;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 onLongClick;

    /* compiled from: StreetViewPanoramaEventListeners.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/google/android/gms/maps/model/StreetViewPanoramaOrientation;", "it", "Lkotlin/k2;", "a", "(Lcom/google/android/gms/maps/model/StreetViewPanoramaOrientation;)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends n0 implements ld.l<StreetViewPanoramaOrientation, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f62166b = new a(1);

        a() {
            super(1);
        }

        public final void a(@fg.l StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
            l0.p(streetViewPanoramaOrientation, ProtectedSandApp.s("ࠬ\u0001"));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
            a(streetViewPanoramaOrientation);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: StreetViewPanoramaEventListeners.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/google/android/gms/maps/model/StreetViewPanoramaOrientation;", "it", "Lkotlin/k2;", "a", "(Lcom/google/android/gms/maps/model/StreetViewPanoramaOrientation;)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends n0 implements ld.l<StreetViewPanoramaOrientation, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f62167b = new b(1);

        b() {
            super(1);
        }

        public final void a(@fg.l StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
            l0.p(streetViewPanoramaOrientation, ProtectedSandApp.s("࠭\u0001"));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
            a(streetViewPanoramaOrientation);
            return kotlin.k2.f75408a;
        }
    }

    public f() {
        k2 g4;
        k2 g5;
        g4 = t4.g(a.f62166b, null, 2, null);
        this.onClick = g4;
        g5 = t4.g(b.f62167b, null, 2, null);
        this.onLongClick = g5;
    }

    @fg.l
    public final ld.l<StreetViewPanoramaOrientation, kotlin.k2> a() {
        return (ld.l) this.onClick.getValue();
    }

    @fg.l
    public final ld.l<StreetViewPanoramaOrientation, kotlin.k2> b() {
        return (ld.l) this.onLongClick.getValue();
    }

    public final void c(@fg.l ld.l<? super StreetViewPanoramaOrientation, kotlin.k2> lVar) {
        l0.p(lVar, ProtectedSandApp.s("\u082e\u0001"));
        this.onClick.setValue(lVar);
    }

    public final void d(@fg.l ld.l<? super StreetViewPanoramaOrientation, kotlin.k2> lVar) {
        l0.p(lVar, ProtectedSandApp.s("\u082e\u0001"));
        this.onLongClick.setValue(lVar);
    }
}
