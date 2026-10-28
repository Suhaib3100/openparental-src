package com.google.maps.android.ktx;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlin.z0;

/* compiled from: SupportMapFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086Hø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0004"}, d2 = {"Lcom/google/android/gms/maps/SupportMapFragment;", "Lcom/google/android/gms/maps/GoogleMap;", "a", "(Lcom/google/android/gms/maps/SupportMapFragment;Lkotlin/coroutines/d;)Ljava/lang/Object;", "maps-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSupportMapFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SupportMapFragment.kt\ncom/google/maps/android/ktx/SupportMapFragmentKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,38:1\n314#2,11:39\n*S KotlinDebug\n*F\n+ 1 SupportMapFragment.kt\ncom/google/maps/android/ktx/SupportMapFragmentKt\n*L\n33#1:39,11\n*E\n"})
/* loaded from: classes6.dex */
public final class u0 {

    /* compiled from: SupportMapFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/google/android/gms/maps/GoogleMap;", "it", "Lkotlin/k2;", "onMapReady", "(Lcom/google/android/gms/maps/GoogleMap;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nSupportMapFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SupportMapFragment.kt\ncom/google/maps/android/ktx/SupportMapFragmentKt$awaitMap$2$1\n*L\n1#1,38:1\n*E\n"})
    public static final class a implements OnMapReadyCallback {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.p<GoogleMap> f62581a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(kotlinx.coroutines.p<? super GoogleMap> pVar) {
            this.f62581a = pVar;
        }

        @Override // com.google.android.gms.maps.OnMapReadyCallback
        public final void onMapReady(@fg.l GoogleMap googleMap) {
            kotlin.jvm.internal.l0.p(googleMap, ProtectedSandApp.s("\u0894\u0001"));
            kotlinx.coroutines.p<GoogleMap> pVar = this.f62581a;
            z0.Companion companion = z0.INSTANCE;
            pVar.resumeWith(googleMap);
        }
    }

    @fg.m
    public static final Object a(@fg.l SupportMapFragment supportMapFragment, @fg.l kotlin.coroutines.d<? super GoogleMap> dVar) {
        kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        qVar.e0();
        supportMapFragment.getMapAsync(new a(qVar));
        Object y4 = qVar.y();
        if (y4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y4;
    }

    private static final Object b(SupportMapFragment supportMapFragment, kotlin.coroutines.d<? super GoogleMap> dVar) {
        kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        qVar.e0();
        supportMapFragment.getMapAsync(new a(qVar));
        k2 k2Var = k2.f75408a;
        Object y4 = qVar.y();
        if (y4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y4;
    }
}
