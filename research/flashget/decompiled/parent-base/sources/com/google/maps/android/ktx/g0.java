package com.google.maps.android.ktx;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlin.z0;

/* compiled from: MapView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086Hø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0004"}, d2 = {"Lcom/google/android/gms/maps/MapView;", "Lcom/google/android/gms/maps/GoogleMap;", "a", "(Lcom/google/android/gms/maps/MapView;Lkotlin/coroutines/d;)Ljava/lang/Object;", "maps-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class g0 {

    /* compiled from: MapView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/google/android/gms/maps/GoogleMap;", "it", "Lkotlin/k2;", "onMapReady", "(Lcom/google/android/gms/maps/GoogleMap;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nMapView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapView.kt\ncom/google/maps/android/ktx/MapViewKt$awaitMap$2$1\n*L\n1#1,19:1\n*E\n"})
    public static final class a implements OnMapReadyCallback {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.coroutines.d<GoogleMap> f62311a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(kotlin.coroutines.d<? super GoogleMap> dVar) {
            this.f62311a = dVar;
        }

        @Override // com.google.android.gms.maps.OnMapReadyCallback
        public final void onMapReady(@fg.l GoogleMap googleMap) {
            kotlin.jvm.internal.l0.p(googleMap, ProtectedSandApp.s("ࡽ\u0001"));
            kotlin.coroutines.d<GoogleMap> dVar = this.f62311a;
            z0.Companion companion = z0.INSTANCE;
            dVar.resumeWith(googleMap);
        }
    }

    @fg.m
    public static final Object a(@fg.l MapView mapView, @fg.l kotlin.coroutines.d<? super GoogleMap> dVar) {
        kotlin.coroutines.k kVar = new kotlin.coroutines.k(kotlin.coroutines.intrinsics.b.e(dVar));
        mapView.getMapAsync(new a(kVar));
        Object a5 = kVar.a();
        if (a5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return a5;
    }

    private static final Object b(MapView mapView, kotlin.coroutines.d<? super GoogleMap> dVar) {
        kotlin.coroutines.k kVar = new kotlin.coroutines.k(kotlin.coroutines.intrinsics.b.e(dVar));
        mapView.getMapAsync(new a(kVar));
        k2 k2Var = k2.f75408a;
        Object a5 = kVar.a();
        if (a5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return a5;
    }
}
