package com.google.maps.android.compose;

import android.content.Context;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.Marker;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: ComposeInfoWindowAdapter.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\"\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/google/maps/android/compose/g;", "Lcom/google/android/gms/maps/GoogleMap$InfoWindowAdapter;", "Lcom/google/android/gms/maps/MapView;", "mapView", "Lkotlin/Function1;", "Lcom/google/android/gms/maps/model/Marker;", "Lcom/google/maps/android/compose/d1;", "markerNodeFinder", "<init>", "(Lcom/google/android/gms/maps/MapView;Lld/l;)V", "marker", "Landroid/view/View;", "getInfoContents", "(Lcom/google/android/gms/maps/model/Marker;)Landroid/view/View;", "getInfoWindow", "a", "Lcom/google/android/gms/maps/MapView;", "b", "Lld/l;", "maps-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class g implements GoogleMap.InfoWindowAdapter {

    /* renamed from: c, reason: collision with root package name */
    public static final int f61446c = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final MapView mapView;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.l<Marker, d1> markerNodeFinder;

    /* compiled from: ComposeInfoWindowAdapter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.q<Marker, androidx.compose.runtime.t, Integer, k2> f61449b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Marker f61450c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(ld.q<? super Marker, ? super androidx.compose.runtime.t, ? super Integer, k2> qVar, Marker marker) {
            super(2);
            this.f61449b = qVar;
            this.f61450c = marker;
        }

        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 11) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(1508359207, i4, -1, ProtectedSandApp.s("ܽ\u0001"));
            }
            this.f61449b.R(this.f61450c, tVar, 8);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: ComposeInfoWindowAdapter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.q<Marker, androidx.compose.runtime.t, Integer, k2> f61451b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Marker f61452c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(ld.q<? super Marker, ? super androidx.compose.runtime.t, ? super Integer, k2> qVar, Marker marker) {
            super(2);
            this.f61451b = qVar;
            this.f61452c = marker;
        }

        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 11) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-742372995, i4, -1, ProtectedSandApp.s("ܾ\u0001"));
            }
            this.f61451b.R(this.f61452c, tVar, 8);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(@fg.l MapView mapView, @fg.l ld.l<? super Marker, d1> lVar) {
        kotlin.jvm.internal.l0.p(mapView, ProtectedSandApp.s("ݔ\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("ݕ\u0001"));
        this.mapView = mapView;
        this.markerNodeFinder = lVar;
    }

    @Override // com.google.android.gms.maps.GoogleMap.InfoWindowAdapter
    @fg.m
    public View getInfoContents(@fg.l Marker marker) {
        ld.q<Marker, androidx.compose.runtime.t, Integer, k2> e4;
        kotlin.jvm.internal.l0.p(marker, ProtectedSandApp.s("ݖ\u0001"));
        d1 invoke = this.markerNodeFinder.invoke(marker);
        if (invoke == null || (e4 = invoke.e()) == null) {
            return null;
        }
        Context context = this.mapView.getContext();
        kotlin.jvm.internal.l0.o(context, ProtectedSandApp.s("ݗ\u0001"));
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.z(new androidx.compose.runtime.internal.b(1508359207, true, new a(e4, marker)));
        m0.d(this.mapView, composeView, null, invoke.getCompositionContext(), 2, null);
        return composeView;
    }

    @Override // com.google.android.gms.maps.GoogleMap.InfoWindowAdapter
    @fg.m
    public View getInfoWindow(@fg.l Marker marker) {
        ld.q<Marker, androidx.compose.runtime.t, Integer, k2> f4;
        kotlin.jvm.internal.l0.p(marker, ProtectedSandApp.s("ݖ\u0001"));
        d1 invoke = this.markerNodeFinder.invoke(marker);
        if (invoke == null || (f4 = invoke.f()) == null) {
            return null;
        }
        Context context = this.mapView.getContext();
        kotlin.jvm.internal.l0.o(context, ProtectedSandApp.s("ݗ\u0001"));
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.z(new androidx.compose.runtime.internal.b(-742372995, true, new b(f4, marker)));
        m0.d(this.mapView, composeView, null, invoke.getCompositionContext(), 2, null);
        return composeView;
    }
}
