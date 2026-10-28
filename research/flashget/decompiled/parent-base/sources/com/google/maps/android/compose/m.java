package com.google.maps.android.compose;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.location.Location;
import android.os.Bundle;
import androidx.compose.runtime.b3;
import androidx.compose.runtime.b5;
import androidx.compose.runtime.g3;
import androidx.compose.runtime.m5;
import androidx.compose.runtime.t;
import androidx.compose.runtime.t3;
import androidx.compose.runtime.t4;
import androidx.view.AbstractC1450w;
import androidx.view.InterfaceC1416b0;
import androidx.view.InterfaceC1423e0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.LocationSource;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PointOfInterest;
import com.google.maps.android.compose.a1;
import com.google.maps.android.compose.c;
import com.tencent.rtmp.TXLiveConstants;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlin.z0;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: GoogleMap.kt */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u001a\u009d\u0002\u0010#\u001a\u00020\u00152\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00132\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00132\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\b2\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\b2\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00132\u0016\b\u0002\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00132\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\u001a\b\u0002\u0010\"\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\b¢\u0006\u0002\b ¢\u0006\u0002\b!H\u0007¢\u0006\u0004\b#\u0010$\u001a\u001e\u0010'\u001a\u00020\u00152\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\bH\u0080H¢\u0006\u0004\b'\u0010(\u001a9\u0010.\u001a\u00020%*\u00020)2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0013\b\b\u0010\"\u001a\r\u0012\u0004\u0012\u00020\u00150\b¢\u0006\u0002\b H\u0082H¢\u0006\u0004\b.\u0010/\u001a\u0017\u00101\u001a\u00020\u00152\u0006\u00100\u001a\u00020)H\u0003¢\u0006\u0004\b1\u00102\u001a!\u00107\u001a\u000206*\u00020)2\f\u00105\u001a\b\u0012\u0004\u0012\u00020403H\u0002¢\u0006\u0004\b7\u00108\u001a\u0013\u0010:\u001a\u000209*\u00020)H\u0002¢\u0006\u0004\b:\u0010;\u001aW\u0010=\u001a\u0011\u0012\u0004\u0012\u00020\u00150\bj\u0002`<¢\u0006\u0002\b 2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\b2\u0013\b\u0002\u0010\"\u001a\r\u0012\u0004\u0012\u00020\u00150\b¢\u0006\u0002\b H\u0007¢\u0006\u0004\b=\u0010>* \u0010?\"\r\u0012\u0004\u0012\u00020\u00150\b¢\u0006\u0002\b 2\r\u0012\u0004\u0012\u00020\u00150\b¢\u0006\u0002\b ¨\u0006I²\u0006\u000e\u0010@\u001a\u0004\u0018\u00010\u00068\nX\u008a\u0084\u0002²\u0006\u000e\u0010A\u001a\u0004\u0018\u00010\r8\nX\u008a\u0084\u0002²\u0006\f\u0010B\u001a\u00020\u00048\nX\u008a\u0084\u0002²\u0006\f\u0010C\u001a\u00020\u001e8\nX\u008a\u0084\u0002²\u0006\f\u0010D\u001a\u00020\u000f8\nX\u008a\u0084\u0002²\u0006\f\u0010E\u001a\u00020\u000b8\nX\u008a\u0084\u0002²\u0006\u001e\u0010F\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\b¢\u0006\u0002\b ¢\u0006\u0002\b!8\nX\u008a\u0084\u0002²\u0006\f\u0010\u0010\u001a\u00020\u000f8\nX\u008a\u0084\u0002²\u0006\f\u0010G\u001a\u00020\u000b8\nX\u008a\u0084\u0002²\u0006\f\u0010H\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"", "mergeDescendants", "Landroidx/compose/ui/q;", "modifier", "Lcom/google/maps/android/compose/b;", "cameraPositionState", "", "contentDescription", "Lkotlin/Function0;", "Lcom/google/android/gms/maps/GoogleMapOptions;", "googleMapOptionsFactory", "Lcom/google/maps/android/compose/q0;", "properties", "Lcom/google/android/gms/maps/LocationSource;", "locationSource", "Lcom/google/maps/android/compose/y0;", "uiSettings", "Lcom/google/maps/android/compose/q;", "indoorStateChangeListener", "Lkotlin/Function1;", "Lcom/google/android/gms/maps/model/LatLng;", "Lkotlin/k2;", "onMapClick", "onMapLongClick", "onMapLoaded", "onMyLocationButtonClick", "Landroid/location/Location;", "onMyLocationClick", "Lcom/google/android/gms/maps/model/PointOfInterest;", "onPOIClick", "Landroidx/compose/foundation/layout/l1;", "contentPadding", "Landroidx/compose/runtime/i;", "Lcom/google/maps/android/compose/k;", "content", "b", "(ZLandroidx/compose/ui/q;Lcom/google/maps/android/compose/b;Ljava/lang/String;Lld/a;Lcom/google/maps/android/compose/q0;Lcom/google/android/gms/maps/LocationSource;Lcom/google/maps/android/compose/y0;Lcom/google/maps/android/compose/q;Lld/l;Lld/l;Lld/a;Lld/a;Lld/l;Lld/l;Landroidx/compose/foundation/layout/l1;Lld/p;Landroidx/compose/runtime/t;III)V", "Landroidx/compose/runtime/y;", "factory", "v", "(Lld/a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/google/android/gms/maps/MapView;", "Landroidx/compose/runtime/z;", "parent", "Lcom/google/maps/android/compose/e0;", "mapClickListeners", "A", "(Lcom/google/android/gms/maps/MapView;Landroidx/compose/runtime/z;Lcom/google/maps/android/compose/e0;Lld/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "mapView", "j", "(Lcom/google/android/gms/maps/MapView;Landroidx/compose/runtime/t;I)V", "Landroidx/compose/runtime/k2;", "Landroidx/lifecycle/w$a;", "previousState", "Landroidx/lifecycle/b0;", "y", "(Lcom/google/android/gms/maps/MapView;Landroidx/compose/runtime/k2;)Landroidx/lifecycle/b0;", "Landroid/content/ComponentCallbacks;", "u", "(Lcom/google/android/gms/maps/MapView;)Landroid/content/ComponentCallbacks;", "Lcom/google/maps/android/compose/GoogleMapFactory;", "x", "(Landroidx/compose/ui/q;Lcom/google/maps/android/compose/b;Lld/a;Lld/p;Landroidx/compose/runtime/t;II)Lld/p;", "GoogleMapFactory", "currentContentDescription", "currentLocationSource", "currentCameraPositionState", "currentContentPadding", "currentUiSettings", "currentMapProperties", "currentContent", "mapProperties", "mapVisible", "maps-compose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nGoogleMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GoogleMap.kt\ncom/google/maps/android/compose/GoogleMapKt\n+ 2 CameraPositionState.kt\ncom/google/maps/android/compose/CameraPositionStateKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 MapView.kt\ncom/google/maps/android/ktx/MapViewKt\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,275:1\n49#2,3:276\n49#2,3:306\n74#3:279\n74#3:280\n74#3:298\n74#3:299\n1116#4,6:281\n1116#4,6:287\n1116#4,6:300\n15#5,5:293\n81#6:309\n81#6:310\n81#6:311\n81#6:312\n81#6:313\n81#6:314\n81#6:315\n*S KotlinDebug\n*F\n+ 1 GoogleMap.kt\ncom/google/maps/android/compose/GoogleMapKt\n*L\n78#1:276,3\n250#1:306,3\n95#1:279\n100#1:280\n178#1:298\n179#1:299\n101#1:281,6\n108#1:287,6\n180#1:300,6\n165#1:293,5\n117#1:309\n118#1:310\n119#1:311\n120#1:312\n121#1:313\n122#1:314\n125#1:315\n*E\n"})
/* loaded from: classes6.dex */
public final class m {

    /* compiled from: GoogleMap.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends kotlin.jvm.internal.n0 implements ld.a<GoogleMapOptions> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f61828b = new a(0);

        a() {
            super(0);
        }

        @fg.l
        public final GoogleMapOptions a() {
            return new GoogleMapOptions();
        }

        @Override // ld.a
        public GoogleMapOptions invoke() {
            return new GoogleMapOptions();
        }
    }

    /* compiled from: GoogleMap.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f61829b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f61830c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.google.maps.android.compose.b f61831d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f61832e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.a<GoogleMapOptions> f61833f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ q0 f61834g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ LocationSource f61835h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ y0 f61836i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ q f61837j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ ld.l<LatLng, k2> f61838k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ ld.l<LatLng, k2> f61839l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ ld.a<k2> f61840m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ ld.a<Boolean> f61841n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ ld.l<Location, k2> f61842o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ ld.l<PointOfInterest, k2> f61843p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.l1 f61844q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, k2> f61845r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ int f61846s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f61847t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ int f61848u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(boolean z4, androidx.compose.ui.q qVar, com.google.maps.android.compose.b bVar, String str, ld.a<GoogleMapOptions> aVar, q0 q0Var, LocationSource locationSource, y0 y0Var, q qVar2, ld.l<? super LatLng, k2> lVar, ld.l<? super LatLng, k2> lVar2, ld.a<k2> aVar2, ld.a<Boolean> aVar3, ld.l<? super Location, k2> lVar3, ld.l<? super PointOfInterest, k2> lVar4, androidx.compose.foundation.layout.l1 l1Var, ld.p<? super androidx.compose.runtime.t, ? super Integer, k2> pVar, int i4, int i5, int i6) {
            super(2);
            this.f61829b = z4;
            this.f61830c = qVar;
            this.f61831d = bVar;
            this.f61832e = str;
            this.f61833f = aVar;
            this.f61834g = q0Var;
            this.f61835h = locationSource;
            this.f61836i = y0Var;
            this.f61837j = qVar2;
            this.f61838k = lVar;
            this.f61839l = lVar2;
            this.f61840m = aVar2;
            this.f61841n = aVar3;
            this.f61842o = lVar3;
            this.f61843p = lVar4;
            this.f61844q = l1Var;
            this.f61845r = pVar;
            this.f61846s = i4;
            this.f61847t = i5;
            this.f61848u = i6;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            m.b(this.f61829b, this.f61830c, this.f61831d, this.f61832e, this.f61833f, this.f61834g, this.f61835h, this.f61836i, this.f61837j, this.f61838k, this.f61839l, this.f61840m, this.f61841n, this.f61842o, this.f61843p, this.f61844q, this.f61845r, tVar, g3.b(this.f61846s | 1), g3.b(this.f61847t), this.f61848u);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: GoogleMap.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/Context;", "it", "Lcom/google/android/gms/maps/MapView;", "a", "(Landroid/content/Context;)Lcom/google/android/gms/maps/MapView;"}, k = 3, mv = {1, 9, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.l<Context, MapView> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MapView f61849b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(MapView mapView) {
            super(1);
            this.f61849b = mapView;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MapView invoke(@fg.l Context context) {
            kotlin.jvm.internal.l0.p(context, ProtectedSandApp.s("ޣ\u0001"));
            return this.f61849b;
        }
    }

    /* compiled from: GoogleMap.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.maps.android.compose.GoogleMapKt$GoogleMap$4", f = "GoogleMap.kt", i = {0, 0, 0, 0, 1}, l = {278, 290}, m = "invokeSuspend", n = {"$this$newComposition$iv", "content$iv", "$completion$iv", "$this$awaitMap$iv$iv", "composition$iv"}, s = {"L$2", "L$3", "L$4", "L$5", "L$0"})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 9, 0})
    @r1({"SMAP\nGoogleMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GoogleMap.kt\ncom/google/maps/android/compose/GoogleMapKt$GoogleMap$4\n+ 2 GoogleMap.kt\ncom/google/maps/android/compose/GoogleMapKt\n+ 3 MapView.kt\ncom/google/maps/android/ktx/MapViewKt\n*L\n1#1,275:1\n152#2:276\n165#2:277\n167#2:283\n166#2,5:284\n153#2,4:289\n15#3,5:278\n*S KotlinDebug\n*F\n+ 1 GoogleMap.kt\ncom/google/maps/android/compose/GoogleMapKt$GoogleMap$4\n*L\n127#1:276\n128#1:277\n128#1:283\n128#1:284,5\n127#1:289,4\n128#1:278,5\n*E\n"})
    static final class d extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        Object f61850b;

        /* renamed from: c, reason: collision with root package name */
        Object f61851c;

        /* renamed from: d, reason: collision with root package name */
        Object f61852d;

        /* renamed from: e, reason: collision with root package name */
        Object f61853e;

        /* renamed from: f, reason: collision with root package name */
        Object f61854f;

        /* renamed from: g, reason: collision with root package name */
        Object f61855g;

        /* renamed from: h, reason: collision with root package name */
        int f61856h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ MapView f61857i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.z f61858j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ e0 f61859k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ boolean f61860l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ b5<String> f61861m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ b5<com.google.maps.android.compose.b> f61862n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ b5<androidx.compose.foundation.layout.l1> f61863o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ b5<LocationSource> f61864p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ b5<q0> f61865q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ b5<y0> f61866r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ b5<ld.p<androidx.compose.runtime.t, Integer, k2>> f61867s;

        /* compiled from: GoogleMap.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 9, 0})
        @r1({"SMAP\nGoogleMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GoogleMap.kt\ncom/google/maps/android/compose/GoogleMapKt$GoogleMap$4$1$1\n+ 2 MapUpdater.kt\ncom/google/maps/android/compose/MapUpdaterKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,275:1\n105#2,6:276\n111#2,2:283\n125#2,15:293\n151#2,13:308\n164#2:323\n74#3:282\n251#4,8:285\n259#4,2:321\n*S KotlinDebug\n*F\n+ 1 GoogleMap.kt\ncom/google/maps/android/compose/GoogleMapKt$GoogleMap$4$1$1\n*L\n129#1:276,6\n129#1:283,2\n129#1:293,15\n129#1:308,13\n129#1:323\n129#1:282\n129#1:285,8\n129#1:321,2\n*E\n"})
        static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f61868b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ b5<String> f61869c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ b5<com.google.maps.android.compose.b> f61870d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ b5<androidx.compose.foundation.layout.l1> f61871e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ b5<LocationSource> f61872f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ b5<q0> f61873g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ b5<y0> f61874h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ b5<ld.p<androidx.compose.runtime.t, Integer, k2>> f61875i;

            /* compiled from: GoogleMap.kt */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.google.maps.android.compose.m$d$a$a, reason: collision with other inner class name */
            static final class C0950a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ b5<ld.p<androidx.compose.runtime.t, Integer, k2>> f61876b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0950a(b5<? extends ld.p<? super androidx.compose.runtime.t, ? super Integer, k2>> b5Var) {
                    super(2);
                    this.f61876b = b5Var;
                }

                @androidx.compose.runtime.n(applier = "com.google.maps.android.compose.GoogleMapComposable")
                @androidx.compose.runtime.i
                public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
                    if ((i4 & 11) == 2 && tVar.p()) {
                        tVar.d0();
                        return;
                    }
                    if (androidx.compose.runtime.x.b0()) {
                        androidx.compose.runtime.x.r0(-1122470699, i4, -1, ProtectedSandApp.s("ޤ\u0001"));
                    }
                    ld.p<androidx.compose.runtime.t, Integer, k2> value = this.f61876b.getValue();
                    if (value != null) {
                        value.invoke(tVar, 0);
                    }
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(boolean z4, b5<String> b5Var, b5<com.google.maps.android.compose.b> b5Var2, b5<? extends androidx.compose.foundation.layout.l1> b5Var3, b5<? extends LocationSource> b5Var4, b5<q0> b5Var5, b5<y0> b5Var6, b5<? extends ld.p<? super androidx.compose.runtime.t, ? super Integer, k2>> b5Var7) {
                super(2);
                this.f61868b = z4;
                this.f61869c = b5Var;
                this.f61870d = b5Var2;
                this.f61871e = b5Var3;
                this.f61872f = b5Var4;
                this.f61873g = b5Var5;
                this.f61874h = b5Var6;
                this.f61875i = b5Var7;
            }

            @androidx.compose.runtime.n(applier = "com.google.maps.android.compose.GoogleMapComposable")
            @androidx.compose.runtime.i
            public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
                if ((i4 & 11) == 2 && tVar.p()) {
                    tVar.d0();
                    return;
                }
                if (androidx.compose.runtime.x.b0()) {
                    androidx.compose.runtime.x.r0(-1029672939, i4, -1, ProtectedSandApp.s("ޥ\u0001"));
                }
                boolean z4 = this.f61868b;
                String value = this.f61869c.getValue();
                com.google.maps.android.compose.b value2 = this.f61870d.getValue();
                androidx.compose.foundation.layout.l1 value3 = this.f61871e.getValue();
                LocationSource value4 = this.f61872f.getValue();
                q0 value5 = this.f61873g.getValue();
                y0 value6 = this.f61874h.getValue();
                tVar.P(1782787885);
                androidx.compose.runtime.e<?> s4 = tVar.s();
                String s5 = ProtectedSandApp.s("ަ\u0001");
                kotlin.jvm.internal.l0.n(s4, s5);
                GoogleMap map = ((b0) s4).getMap();
                androidx.compose.runtime.e<?> s6 = tVar.s();
                kotlin.jvm.internal.l0.n(s6, s5);
                MapView mapView = ((b0) s6).getMapView();
                if (z4) {
                    mapView.setImportantForAccessibility(4);
                }
                androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) tVar.x(androidx.compose.ui.platform.h1.i());
                androidx.compose.ui.unit.w wVar = (androidx.compose.ui.unit.w) tVar.x(androidx.compose.ui.platform.h1.p());
                a1.b bVar = new a1.b(map, value2, value, dVar, wVar);
                tVar.P(1886828752);
                if (!(tVar.s() instanceof b0)) {
                    androidx.compose.runtime.p.n();
                }
                tVar.v();
                if (tVar.getInserting()) {
                    tVar.F(new a1.a(bVar));
                } else {
                    tVar.C();
                }
                m5.n(tVar, dVar, a1.m.f61056b);
                m5.n(tVar, wVar, a1.t.f61063b);
                m5.n(tVar, value, a1.u.f61064b);
                m5.j(tVar, value4, new a1.v(map));
                m5.j(tVar, Boolean.valueOf(value5.getIsBuildingEnabled()), new a1.w(map));
                m5.j(tVar, Boolean.valueOf(value5.getIsIndoorEnabled()), new a1.x(map));
                m5.j(tVar, Boolean.valueOf(value5.getIsMyLocationEnabled()), new a1.y(map));
                m5.j(tVar, Boolean.valueOf(value5.getIsTrafficEnabled()), new a1.z(map));
                m5.j(tVar, value5.getLatLngBoundsForCameraTarget(), new a1.a0(map));
                m5.j(tVar, value5.getMapStyleOptions(), new a1.c(map));
                m5.j(tVar, value5.getMapType(), new a1.d(map));
                m5.j(tVar, Float.valueOf(value5.getMaxZoomPreference()), new a1.e(map));
                m5.j(tVar, Float.valueOf(value5.getMinZoomPreference()), new a1.f(map));
                m5.j(tVar, value3, new a1.g(map));
                m5.j(tVar, Boolean.valueOf(value6.getCompassEnabled()), new a1.h(map));
                m5.j(tVar, Boolean.valueOf(value6.getIndoorLevelPickerEnabled()), new a1.i(map));
                m5.j(tVar, Boolean.valueOf(value6.getMapToolbarEnabled()), new a1.j(map));
                m5.j(tVar, Boolean.valueOf(value6.getMyLocationButtonEnabled()), new a1.k(map));
                m5.j(tVar, Boolean.valueOf(value6.getRotationGesturesEnabled()), new a1.l(map));
                m5.j(tVar, Boolean.valueOf(value6.getScrollGesturesEnabled()), new a1.n(map));
                m5.j(tVar, Boolean.valueOf(value6.getScrollGesturesEnabledDuringRotateOrZoom()), new a1.o(map));
                m5.j(tVar, Boolean.valueOf(value6.getTiltGesturesEnabled()), new a1.p(map));
                m5.j(tVar, Boolean.valueOf(value6.getZoomControlsEnabled()), new a1.q(map));
                m5.j(tVar, Boolean.valueOf(value6.getZoomGesturesEnabled()), new a1.r(map));
                m5.n(tVar, value2, a1.s.f61062b);
                tVar.H();
                tVar.p0();
                tVar.p0();
                l0.i(tVar, 0);
                androidx.compose.runtime.f0.b(com.google.maps.android.compose.c.b().e(this.f61870d.getValue()), androidx.compose.runtime.internal.c.b(tVar, -1122470699, true, new C0950a(this.f61875i)), tVar, b3.f15974d | 48);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(MapView mapView, androidx.compose.runtime.z zVar, e0 e0Var, boolean z4, b5<String> b5Var, b5<com.google.maps.android.compose.b> b5Var2, b5<? extends androidx.compose.foundation.layout.l1> b5Var3, b5<? extends LocationSource> b5Var4, b5<q0> b5Var5, b5<y0> b5Var6, b5<? extends ld.p<? super androidx.compose.runtime.t, ? super Integer, k2>> b5Var7, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f61857i = mapView;
            this.f61858j = zVar;
            this.f61859k = e0Var;
            this.f61860l = z4;
            this.f61861m = b5Var;
            this.f61862n = b5Var2;
            this.f61863o = b5Var3;
            this.f61864p = b5Var4;
            this.f61865q = b5Var5;
            this.f61866r = b5Var6;
            this.f61867s = b5Var7;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return new d(this.f61857i, this.f61858j, this.f61859k, this.f61860l, this.f61861m, this.f61862n, this.f61863o, this.f61864p, this.f61865q, this.f61866r, this.f61867s, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            Object a5;
            MapView mapView;
            ld.p<? super androidx.compose.runtime.t, ? super Integer, k2> pVar;
            androidx.compose.runtime.z zVar;
            e0 e0Var;
            androidx.compose.runtime.y a6;
            androidx.compose.runtime.y yVar;
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f61856h;
            try {
                if (i4 == 0) {
                    kotlin.a1.n(obj);
                    MapView mapView2 = this.f61857i;
                    androidx.compose.runtime.z zVar2 = this.f61858j;
                    e0 e0Var2 = this.f61859k;
                    androidx.compose.runtime.internal.b bVar = new androidx.compose.runtime.internal.b(-1029672939, true, new a(this.f61860l, this.f61861m, this.f61862n, this.f61863o, this.f61864p, this.f61865q, this.f61866r, this.f61867s));
                    this.f61850b = zVar2;
                    this.f61851c = e0Var2;
                    this.f61852d = mapView2;
                    this.f61853e = bVar;
                    this.f61854f = this;
                    this.f61855g = mapView2;
                    this.f61856h = 1;
                    kotlin.coroutines.k kVar = new kotlin.coroutines.k(kotlin.coroutines.intrinsics.b.e(this));
                    mapView2.getMapAsync(new n(kVar));
                    a5 = kVar.a();
                    if (a5 == aVar) {
                        kotlin.coroutines.jvm.internal.h.c(this);
                    }
                    if (a5 == aVar) {
                        return aVar;
                    }
                    mapView = mapView2;
                    pVar = bVar;
                    zVar = zVar2;
                    e0Var = e0Var2;
                } else {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            throw new IllegalStateException(ProtectedSandApp.s("ާ\u0001"));
                        }
                        yVar = (androidx.compose.runtime.y) this.f61850b;
                        try {
                            kotlin.a1.n(obj);
                            throw new KotlinNothingValueException();
                        } catch (Throwable th) {
                            th = th;
                            yVar.dispose();
                            throw th;
                        }
                    }
                    pVar = (ld.p) this.f61853e;
                    MapView mapView3 = (MapView) this.f61852d;
                    e0 e0Var3 = (e0) this.f61851c;
                    androidx.compose.runtime.z zVar3 = (androidx.compose.runtime.z) this.f61850b;
                    kotlin.a1.n(obj);
                    zVar = zVar3;
                    e0Var = e0Var3;
                    mapView = mapView3;
                    a5 = obj;
                }
                this.f61850b = a6;
                this.f61851c = null;
                this.f61852d = null;
                this.f61853e = null;
                this.f61854f = null;
                this.f61855g = null;
                this.f61856h = 2;
                if (kotlinx.coroutines.c1.a(this) == aVar) {
                    return aVar;
                }
                yVar = a6;
                throw new KotlinNothingValueException();
            } catch (Throwable th2) {
                th = th2;
                yVar = a6;
                yVar.dispose();
                throw th;
            }
            a6 = androidx.compose.runtime.c0.a(new b0((GoogleMap) a5, mapView, e0Var), zVar);
            a6.e(pVar);
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((d) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    /* compiled from: GoogleMap.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class e extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f61877b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f61878c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.google.maps.android.compose.b f61879d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f61880e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.a<GoogleMapOptions> f61881f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ q0 f61882g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ LocationSource f61883h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ y0 f61884i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ q f61885j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ ld.l<LatLng, k2> f61886k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ ld.l<LatLng, k2> f61887l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ ld.a<k2> f61888m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ ld.a<Boolean> f61889n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ ld.l<Location, k2> f61890o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ ld.l<PointOfInterest, k2> f61891p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.l1 f61892q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, k2> f61893r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ int f61894s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f61895t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ int f61896u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(boolean z4, androidx.compose.ui.q qVar, com.google.maps.android.compose.b bVar, String str, ld.a<GoogleMapOptions> aVar, q0 q0Var, LocationSource locationSource, y0 y0Var, q qVar2, ld.l<? super LatLng, k2> lVar, ld.l<? super LatLng, k2> lVar2, ld.a<k2> aVar2, ld.a<Boolean> aVar3, ld.l<? super Location, k2> lVar3, ld.l<? super PointOfInterest, k2> lVar4, androidx.compose.foundation.layout.l1 l1Var, ld.p<? super androidx.compose.runtime.t, ? super Integer, k2> pVar, int i4, int i5, int i6) {
            super(2);
            this.f61877b = z4;
            this.f61878c = qVar;
            this.f61879d = bVar;
            this.f61880e = str;
            this.f61881f = aVar;
            this.f61882g = q0Var;
            this.f61883h = locationSource;
            this.f61884i = y0Var;
            this.f61885j = qVar2;
            this.f61886k = lVar;
            this.f61887l = lVar2;
            this.f61888m = aVar2;
            this.f61889n = aVar3;
            this.f61890o = lVar3;
            this.f61891p = lVar4;
            this.f61892q = l1Var;
            this.f61893r = pVar;
            this.f61894s = i4;
            this.f61895t = i5;
            this.f61896u = i6;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            m.b(this.f61877b, this.f61878c, this.f61879d, this.f61880e, this.f61881f, this.f61882g, this.f61883h, this.f61884i, this.f61885j, this.f61886k, this.f61887l, this.f61888m, this.f61889n, this.f61890o, this.f61891p, this.f61892q, this.f61893r, tVar, g3.b(this.f61894s | 1), g3.b(this.f61895t), this.f61896u);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: GoogleMap.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/w0;", "Landroidx/compose/runtime/v0;", "a", "(Landroidx/compose/runtime/w0;)Landroidx/compose/runtime/v0;"}, k = 3, mv = {1, 9, 0})
    @r1({"SMAP\nGoogleMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GoogleMap.kt\ncom/google/maps/android/compose/GoogleMapKt$MapLifecycle$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,275:1\n64#2,5:276\n*S KotlinDebug\n*F\n+ 1 GoogleMap.kt\ncom/google/maps/android/compose/GoogleMapKt$MapLifecycle$1\n*L\n188#1:276,5\n*E\n"})
    static final class f extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.runtime.w0, androidx.compose.runtime.v0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MapView f61897b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.k2<AbstractC1450w.a> f61898c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ AbstractC1450w f61899d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Context f61900e;

        /* compiled from: Effects.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/w0$a", "Landroidx/compose/runtime/v0;", "Lkotlin/k2;", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @r1({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 GoogleMap.kt\ncom/google/maps/android/compose/GoogleMapKt$MapLifecycle$1\n*L\n1#1,497:1\n189#2,3:498\n*E\n"})
        public static final class a implements androidx.compose.runtime.v0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AbstractC1450w f61901a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC1416b0 f61902b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Context f61903c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ ComponentCallbacks f61904d;

            public a(AbstractC1450w abstractC1450w, InterfaceC1416b0 interfaceC1416b0, Context context, ComponentCallbacks componentCallbacks) {
                this.f61901a = abstractC1450w;
                this.f61902b = interfaceC1416b0;
                this.f61903c = context;
                this.f61904d = componentCallbacks;
            }

            @Override // androidx.compose.runtime.v0
            public void dispose() {
                this.f61901a.d(this.f61902b);
                this.f61903c.unregisterComponentCallbacks(this.f61904d);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(MapView mapView, androidx.compose.runtime.k2<AbstractC1450w.a> k2Var, AbstractC1450w abstractC1450w, Context context) {
            super(1);
            this.f61897b = mapView;
            this.f61898c = k2Var;
            this.f61899d = abstractC1450w;
            this.f61900e = context;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.runtime.v0 invoke(@fg.l androidx.compose.runtime.w0 w0Var) {
            kotlin.jvm.internal.l0.p(w0Var, ProtectedSandApp.s("ި\u0001"));
            com.google.maps.android.compose.l lVar = new com.google.maps.android.compose.l(this.f61898c, this.f61897b);
            j jVar = new j(this.f61897b);
            this.f61899d.a(lVar);
            this.f61900e.registerComponentCallbacks(jVar);
            return new a(this.f61899d, lVar, this.f61900e, jVar);
        }
    }

    /* compiled from: GoogleMap.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/w0;", "Landroidx/compose/runtime/v0;", "a", "(Landroidx/compose/runtime/w0;)Landroidx/compose/runtime/v0;"}, k = 3, mv = {1, 9, 0})
    @r1({"SMAP\nGoogleMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GoogleMap.kt\ncom/google/maps/android/compose/GoogleMapKt$MapLifecycle$2\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,275:1\n64#2,5:276\n*S KotlinDebug\n*F\n+ 1 GoogleMap.kt\ncom/google/maps/android/compose/GoogleMapKt$MapLifecycle$2\n*L\n194#1:276,5\n*E\n"})
    static final class g extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.runtime.w0, androidx.compose.runtime.v0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MapView f61905b;

        /* compiled from: Effects.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/w0$a", "Landroidx/compose/runtime/v0;", "Lkotlin/k2;", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @r1({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 GoogleMap.kt\ncom/google/maps/android/compose/GoogleMapKt$MapLifecycle$2\n*L\n1#1,497:1\n195#2,3:498\n*E\n"})
        public static final class a implements androidx.compose.runtime.v0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ MapView f61906a;

            public a(MapView mapView) {
                this.f61906a = mapView;
            }

            @Override // androidx.compose.runtime.v0
            public void dispose() {
                this.f61906a.onDestroy();
                this.f61906a.removeAllViews();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(MapView mapView) {
            super(1);
            this.f61905b = mapView;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.runtime.v0 invoke(@fg.l androidx.compose.runtime.w0 w0Var) {
            kotlin.jvm.internal.l0.p(w0Var, ProtectedSandApp.s("ީ\u0001"));
            return new a(this.f61905b);
        }
    }

    /* compiled from: GoogleMap.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class h extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MapView f61907b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f61908c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(MapView mapView, int i4) {
            super(2);
            this.f61907b = mapView;
            this.f61908c = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            m.j(this.f61907b, tVar, g3.b(this.f61908c | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: GoogleMap.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class i {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f61909a;

        static {
            int[] iArr = new int[AbstractC1450w.a.values().length];
            try {
                iArr[AbstractC1450w.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC1450w.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AbstractC1450w.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AbstractC1450w.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AbstractC1450w.a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AbstractC1450w.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f61909a = iArr;
        }
    }

    /* compiled from: GoogleMap.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/google/maps/android/compose/m$j", "Landroid/content/ComponentCallbacks;", "Landroid/content/res/Configuration;", "config", "Lkotlin/k2;", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "onLowMemory", "()V", "maps-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class j implements ComponentCallbacks {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MapView f61910b;

        j(MapView mapView) {
            this.f61910b = mapView;
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(@fg.l Configuration config) {
            kotlin.jvm.internal.l0.p(config, ProtectedSandApp.s("ު\u0001"));
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
            this.f61910b.onLowMemory();
        }
    }

    /* compiled from: GoogleMap.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.maps.android.compose.GoogleMapKt", f = "GoogleMap.kt", i = {0}, l = {154}, m = "disposingComposition", n = {"composition"}, s = {"L$0"})
    @Metadata(k = 3, mv = {1, 9, 0}, xi = SyslogAppender.LOG_LOCAL6)
    @r1({"SMAP\nGoogleMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GoogleMap.kt\ncom/google/maps/android/compose/GoogleMapKt$disposingComposition$1\n*L\n1#1,275:1\n*E\n"})
    static final class k extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f61911b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f61912c;

        /* renamed from: d, reason: collision with root package name */
        int f61913d;

        k(kotlin.coroutines.d<? super k> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f61912c = obj;
            this.f61913d |= Integer.MIN_VALUE;
            return m.v(null, this);
        }
    }

    /* compiled from: GoogleMap.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class l extends kotlin.jvm.internal.n0 implements ld.a<k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final l f61914b = new l(0);

        l() {
            super(0);
        }

        public final void a() {
        }

        @Override // ld.a
        public k2 invoke() {
            return k2.f75408a;
        }
    }

    /* compiled from: GoogleMap.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 9, 0})
    @r1({"SMAP\nGoogleMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GoogleMap.kt\ncom/google/maps/android/compose/GoogleMapKt$googleMapFactory$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,275:1\n1116#2,6:276\n1116#2,6:282\n1116#2,6:288\n81#3:294\n81#3:295\n81#3:296\n*S KotlinDebug\n*F\n+ 1 GoogleMap.kt\ncom/google/maps/android/compose/GoogleMapKt$googleMapFactory$2\n*L\n255#1:276,6\n256#1:282,6\n260#1:288,6\n255#1:294\n256#1:295\n260#1:296\n*E\n"})
    /* renamed from: com.google.maps.android.compose.m$m, reason: collision with other inner class name */
    static final class C0951m extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f61915b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.google.maps.android.compose.b f61916c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.a<k2> f61917d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, k2> f61918e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0951m(androidx.compose.ui.q qVar, com.google.maps.android.compose.b bVar, ld.a<k2> aVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, k2> pVar) {
            super(2);
            this.f61915b = qVar;
            this.f61916c = bVar;
            this.f61917d = aVar;
            this.f61918e = pVar;
        }

        private static final y0 b(androidx.compose.runtime.k2<y0> k2Var) {
            return k2Var.getValue();
        }

        private static final q0 c(androidx.compose.runtime.k2<q0> k2Var) {
            return k2Var.getValue();
        }

        private static final boolean d(androidx.compose.runtime.k2<Boolean> k2Var) {
            return k2Var.getValue().booleanValue();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 11) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-2123889675, i4, -1, ProtectedSandApp.s("ޫ\u0001"));
            }
            tVar.P(1894980645);
            Object Q = tVar.Q();
            t.Companion companion = androidx.compose.runtime.t.INSTANCE;
            if (Q == companion.a()) {
                Q = t4.g(new y0(false, false, false, false, false, false, false, false, false, false, TXLiveConstants.PUSH_EVT_ROOM_IN_FAILED, null), null, 2, null);
                tVar.E(Q);
            }
            androidx.compose.runtime.k2 k2Var = (androidx.compose.runtime.k2) Q;
            Object a5 = androidx.compose.material3.w.a(tVar, 1894980741);
            if (a5 == companion.a()) {
                a5 = t4.g(new q0(false, false, false, false, null, null, x0.NORMAL, 0.0f, 0.0f, 447, null), null, 2, null);
                tVar.E(a5);
            }
            androidx.compose.runtime.k2 k2Var2 = (androidx.compose.runtime.k2) a5;
            Object a6 = androidx.compose.material3.w.a(tVar, 1894980857);
            if (a6 == companion.a()) {
                a6 = t4.g(Boolean.TRUE, null, 2, null);
                tVar.E(a6);
            }
            tVar.p0();
            if (d((androidx.compose.runtime.k2) a6)) {
                m.b(false, this.f61915b, this.f61916c, null, null, (q0) k2Var2.getValue(), null, (y0) k2Var.getValue(), null, null, null, this.f61917d, null, null, null, null, this.f61918e, tVar, 262144, 0, 63321);
            }
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

    /* compiled from: MapView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/google/android/gms/maps/GoogleMap;", "it", "Lkotlin/k2;", "onMapReady", "(Lcom/google/android/gms/maps/GoogleMap;)V", "com/google/maps/android/ktx/g0$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @r1({"SMAP\nMapView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapView.kt\ncom/google/maps/android/ktx/MapViewKt$awaitMap$2$1\n*L\n1#1,19:1\n*E\n"})
    public static final class n implements OnMapReadyCallback {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.coroutines.d f61919a;

        public n(kotlin.coroutines.d dVar) {
            this.f61919a = dVar;
        }

        @Override // com.google.android.gms.maps.OnMapReadyCallback
        public final void onMapReady(@fg.l GoogleMap googleMap) {
            kotlin.jvm.internal.l0.p(googleMap, ProtectedSandApp.s("ެ\u0001"));
            kotlin.coroutines.d dVar = this.f61919a;
            z0.Companion companion = kotlin.z0.INSTANCE;
            dVar.resumeWith(googleMap);
        }
    }

    @androidx.compose.runtime.j(scheme = "[0[0]]")
    private static final Object A(MapView mapView, androidx.compose.runtime.z zVar, e0 e0Var, ld.p<? super androidx.compose.runtime.t, ? super Integer, k2> pVar, kotlin.coroutines.d<? super androidx.compose.runtime.y> dVar) {
        kotlin.coroutines.k kVar = new kotlin.coroutines.k(kotlin.coroutines.intrinsics.b.e(dVar));
        mapView.getMapAsync(new n(kVar));
        k2 k2Var = k2.f75408a;
        Object a5 = kVar.a();
        if (a5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        androidx.compose.runtime.y a6 = androidx.compose.runtime.c0.a(new b0((GoogleMap) a5, mapView, e0Var), zVar);
        a6.e(pVar);
        return a6;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x03ab  */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[com.google.maps.android.compose.GoogleMapComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(boolean r41, @fg.m androidx.compose.ui.q r42, @fg.m com.google.maps.android.compose.b r43, @fg.m java.lang.String r44, @fg.m ld.a<com.google.android.gms.maps.GoogleMapOptions> r45, @fg.m com.google.maps.android.compose.q0 r46, @fg.m com.google.android.gms.maps.LocationSource r47, @fg.m com.google.maps.android.compose.y0 r48, @fg.m com.google.maps.android.compose.q r49, @fg.m ld.l<? super com.google.android.gms.maps.model.LatLng, kotlin.k2> r50, @fg.m ld.l<? super com.google.android.gms.maps.model.LatLng, kotlin.k2> r51, @fg.m ld.a<kotlin.k2> r52, @fg.m ld.a<java.lang.Boolean> r53, @fg.m ld.l<? super android.location.Location, kotlin.k2> r54, @fg.m ld.l<? super com.google.android.gms.maps.model.PointOfInterest, kotlin.k2> r55, @fg.m androidx.compose.foundation.layout.l1 r56, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r57, @fg.m androidx.compose.runtime.t r58, int r59, int r60, int r61) {
        /*
            Method dump skipped, instructions count: 1341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.maps.android.compose.m.b(boolean, androidx.compose.ui.q, com.google.maps.android.compose.b, java.lang.String, ld.a, com.google.maps.android.compose.q0, com.google.android.gms.maps.LocationSource, com.google.maps.android.compose.y0, com.google.maps.android.compose.q, ld.l, ld.l, ld.a, ld.a, ld.l, ld.l, androidx.compose.foundation.layout.l1, ld.p, androidx.compose.runtime.t, int, int, int):void");
    }

    private static final String c(b5<String> b5Var) {
        return b5Var.getValue();
    }

    private static final LocationSource d(b5<? extends LocationSource> b5Var) {
        return b5Var.getValue();
    }

    private static final com.google.maps.android.compose.b e(b5<com.google.maps.android.compose.b> b5Var) {
        return b5Var.getValue();
    }

    private static final androidx.compose.foundation.layout.l1 f(b5<? extends androidx.compose.foundation.layout.l1> b5Var) {
        return b5Var.getValue();
    }

    private static final y0 g(b5<y0> b5Var) {
        return b5Var.getValue();
    }

    private static final q0 h(b5<q0> b5Var) {
        return b5Var.getValue();
    }

    private static final ld.p<androidx.compose.runtime.t, Integer, k2> i(b5<? extends ld.p<? super androidx.compose.runtime.t, ? super Integer, k2>> b5Var) {
        return (ld.p) b5Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.i
    public static final void j(MapView mapView, androidx.compose.runtime.t tVar, int i4) {
        androidx.compose.runtime.t o4 = tVar.o(-1013003870);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1013003870, i4, -1, ProtectedSandApp.s("\u07bd\u0001"));
        }
        Context context = (Context) o4.x(androidx.compose.ui.platform.o0.g());
        AbstractC1450w lifecycle = ((InterfaceC1423e0) o4.x(androidx.compose.ui.platform.o0.i())).getLifecycle();
        o4.P(-733871266);
        Object Q = o4.Q();
        if (Q == androidx.compose.runtime.t.INSTANCE.a()) {
            Q = t4.g(AbstractC1450w.a.ON_CREATE, null, 2, null);
            o4.E(Q);
        }
        o4.p0();
        androidx.compose.runtime.a1.a(context, lifecycle, mapView, new f(mapView, (androidx.compose.runtime.k2) Q, lifecycle, context), o4, 584);
        androidx.compose.runtime.a1.c(mapView, new g(mapView), o4, 8);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new h(mapView, i4));
        }
    }

    public static final String k(b5 b5Var) {
        return (String) b5Var.getValue();
    }

    public static final LocationSource l(b5 b5Var) {
        return (LocationSource) b5Var.getValue();
    }

    public static final com.google.maps.android.compose.b m(b5 b5Var) {
        return (com.google.maps.android.compose.b) b5Var.getValue();
    }

    public static final androidx.compose.foundation.layout.l1 n(b5 b5Var) {
        return (androidx.compose.foundation.layout.l1) b5Var.getValue();
    }

    public static final y0 o(b5 b5Var) {
        return (y0) b5Var.getValue();
    }

    public static final q0 p(b5 b5Var) {
        return (q0) b5Var.getValue();
    }

    public static final ld.p q(b5 b5Var) {
        return (ld.p) b5Var.getValue();
    }

    public static final ComponentCallbacks s(MapView mapView) {
        return new j(mapView);
    }

    public static final InterfaceC1416b0 t(MapView mapView, androidx.compose.runtime.k2 k2Var) {
        return new com.google.maps.android.compose.l(k2Var, mapView);
    }

    private static final ComponentCallbacks u(MapView mapView) {
        return new j(mapView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Type inference failed for: r4v0, types: [ld.a, ld.a<? extends androidx.compose.runtime.y>] */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.runtime.y] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object v(@fg.l ld.a<? extends androidx.compose.runtime.y> r4, @fg.l kotlin.coroutines.d<? super kotlin.k2> r5) {
        /*
            boolean r0 = r5 instanceof com.google.maps.android.compose.m.k
            if (r0 == 0) goto L13
            r0 = r5
            com.google.maps.android.compose.m$k r0 = (com.google.maps.android.compose.m.k) r0
            int r1 = r0.f61913d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f61913d = r1
            goto L18
        L13:
            com.google.maps.android.compose.m$k r0 = new com.google.maps.android.compose.m$k
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f61912c
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f61913d
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 == r3) goto L2f
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "\u07be\u0001"
            java.lang.String r5 = com.flashget.parentalcontrol.ProtectedSandApp.s(r5)
            r4.<init>(r5)
            throw r4
        L2f:
            java.lang.Object r4 = r0.f61911b
            androidx.compose.runtime.y r4 = (androidx.compose.runtime.y) r4
            kotlin.a1.n(r5)     // Catch: java.lang.Throwable -> L37
            goto L4d
        L37:
            r5 = move-exception
            goto L53
        L39:
            kotlin.a1.n(r5)
            java.lang.Object r4 = r4.invoke()
            androidx.compose.runtime.y r4 = (androidx.compose.runtime.y) r4
            r0.f61911b = r4     // Catch: java.lang.Throwable -> L37
            r0.f61913d = r3     // Catch: java.lang.Throwable -> L37
            java.lang.Object r5 = kotlinx.coroutines.c1.a(r0)     // Catch: java.lang.Throwable -> L37
            if (r5 != r1) goto L4d
            return r1
        L4d:
            kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException     // Catch: java.lang.Throwable -> L37
            r5.<init>()     // Catch: java.lang.Throwable -> L37
            throw r5     // Catch: java.lang.Throwable -> L37
        L53:
            r4.dispose()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.maps.android.compose.m.v(ld.a, kotlin.coroutines.d):java.lang.Object");
    }

    private static final Object w(ld.a<? extends androidx.compose.runtime.y> aVar, kotlin.coroutines.d<? super k2> dVar) {
        androidx.compose.runtime.y invoke = aVar.invoke();
        try {
            kotlinx.coroutines.c1.a(dVar);
            throw new KotlinNothingValueException();
        } catch (Throwable th) {
            invoke.dispose();
            throw th;
        }
    }

    @fg.l
    @androidx.compose.runtime.j(scheme = "[_[com.google.maps.android.compose.GoogleMapComposable]:[_]]")
    @androidx.compose.runtime.i
    public static final ld.p<androidx.compose.runtime.t, Integer, k2> x(@fg.m androidx.compose.ui.q qVar, @fg.m com.google.maps.android.compose.b bVar, @fg.m ld.a<k2> aVar, @fg.m ld.p<? super androidx.compose.runtime.t, ? super Integer, k2> pVar, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(61618866);
        if ((i5 & 1) != 0) {
            qVar = androidx.compose.ui.q.INSTANCE;
        }
        if ((i5 & 2) != 0) {
            tVar.P(-1911106014);
            c.b bVar2 = c.b.f61110b;
            com.google.maps.android.compose.b.INSTANCE.getClass();
            bVar = (com.google.maps.android.compose.b) androidx.compose.runtime.saveable.d.d(new Object[0], com.google.maps.android.compose.b.f61072j, null, new c.C0946c(bVar2), tVar, 72, 0);
            tVar.p0();
        }
        if ((i5 & 4) != 0) {
            aVar = l.f61914b;
        }
        if ((i5 & 8) != 0) {
            com.google.maps.android.compose.f.f61442a.getClass();
            pVar = com.google.maps.android.compose.f.f61443b;
        }
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(61618866, i4, -1, ProtectedSandApp.s("\u07bf\u0001"));
        }
        androidx.compose.runtime.internal.a b5 = androidx.compose.runtime.internal.c.b(tVar, -2123889675, true, new C0951m(qVar, bVar, aVar, pVar));
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return b5;
    }

    private static final InterfaceC1416b0 y(MapView mapView, androidx.compose.runtime.k2<AbstractC1450w.a> k2Var) {
        return new com.google.maps.android.compose.l(k2Var, mapView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(androidx.compose.runtime.k2 k2Var, MapView mapView, InterfaceC1423e0 interfaceC1423e0, AbstractC1450w.a aVar) {
        kotlin.jvm.internal.l0.p(k2Var, ProtectedSandApp.s("߀\u0001"));
        kotlin.jvm.internal.l0.p(mapView, ProtectedSandApp.s("߁\u0001"));
        kotlin.jvm.internal.l0.p(interfaceC1423e0, ProtectedSandApp.s("߂\u0001"));
        kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("߃\u0001"));
        aVar.getTargetState();
        switch (i.f61909a[aVar.ordinal()]) {
            case 1:
                if (k2Var.getValue() != AbstractC1450w.a.ON_STOP) {
                    mapView.onCreate(new Bundle());
                    break;
                }
                break;
            case 2:
                mapView.onStart();
                break;
            case 3:
                mapView.onResume();
                break;
            case 4:
                mapView.onPause();
                break;
            case 5:
                mapView.onStop();
                break;
            case 6:
                break;
            default:
                throw new IllegalStateException();
        }
        k2Var.setValue(aVar);
    }
}
