package com.google.maps.android.ktx;

import android.graphics.Bitmap;
import android.location.Location;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.GroundOverlay;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.IndoorBuilding;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PointOfInterest;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.TileOverlay;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.google.maps.android.ktx.g;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlin.z0;
import kotlinx.coroutines.p;
import org.apache.http.HttpStatus;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: GoogleMap.kt */
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a)\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0086Hø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\f\u001a\u00020\t*\u00020\u0000H\u0086Hø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u0001*\u00020\u0000¢\u0006\u0004\b\u000e\u0010\u0004\u001a\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u0001*\u00020\u0000¢\u0006\u0004\b\u000f\u0010\u0004\u001a\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u0001*\u00020\u0000¢\u0006\u0004\b\u0010\u0010\u0004\u001a%\u0010\u0013\u001a\u0004\u0018\u00010\u0011*\u00020\u00002\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0086Hø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001*\u00020\u0000¢\u0006\u0004\b\u0015\u0010\u0004\u001a\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0001*\u00020\u0000¢\u0006\u0004\b\u0017\u0010\u0004\u001a\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0001*\u00020\u0000¢\u0006\u0004\b\u0019\u0010\u0004\u001a\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0001*\u00020\u0000¢\u0006\u0004\b\u001b\u0010\u0004\u001a\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0001*\u00020\u0000¢\u0006\u0004\b\u001d\u0010\u0004\u001a\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0001*\u00020\u0000¢\u0006\u0004\b\u001e\u0010\u0004\u001a\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0001*\u00020\u0000¢\u0006\u0004\b\u001f\u0010\u0004\u001a\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u0001*\u00020\u0000¢\u0006\u0004\b!\u0010\u0004\u001a\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020 0\u0001*\u00020\u0000¢\u0006\u0004\b\"\u0010\u0004\u001a\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0001*\u00020\u0000¢\u0006\u0004\b#\u0010\u0004\u001a\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u0001*\u00020\u0000¢\u0006\u0004\b%\u0010\u0004\u001a\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\t0\u0001*\u00020\u0000¢\u0006\u0004\b&\u0010\u0004\u001a\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u0001*\u00020\u0000¢\u0006\u0004\b(\u0010\u0004\u001a\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u0001*\u00020\u0000¢\u0006\u0004\b*\u0010\u0004\u001a\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u0001*\u00020\u0000¢\u0006\u0004\b,\u0010\u0004\u001a\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u0001*\u00020\u0000¢\u0006\u0004\b.\u0010\u0004\u001a,\u00103\u001a\u0002002\u0017\u00102\u001a\u0013\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\t0/¢\u0006\u0002\b1H\u0086\bø\u0001\u0001¢\u0006\u0004\b3\u00104\u001a0\u00106\u001a\u00020\u0016*\u00020\u00002\u0017\u00102\u001a\u0013\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\t0/¢\u0006\u0002\b1H\u0086\bø\u0001\u0001¢\u0006\u0004\b6\u00107\u001a2\u00109\u001a\u0004\u0018\u00010\u0018*\u00020\u00002\u0017\u00102\u001a\u0013\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\t0/¢\u0006\u0002\b1H\u0086\bø\u0001\u0001¢\u0006\u0004\b9\u0010:\u001a2\u0010<\u001a\u0004\u0018\u00010\u001c*\u00020\u00002\u0017\u00102\u001a\u0013\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\t0/¢\u0006\u0002\b1H\u0086\bø\u0001\u0001¢\u0006\u0004\b<\u0010=\u001a0\u0010?\u001a\u00020+*\u00020\u00002\u0017\u00102\u001a\u0013\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020\t0/¢\u0006\u0002\b1H\u0086\bø\u0001\u0001¢\u0006\u0004\b?\u0010@\u001a0\u0010B\u001a\u00020-*\u00020\u00002\u0017\u00102\u001a\u0013\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020\t0/¢\u0006\u0002\b1H\u0086\bø\u0001\u0001¢\u0006\u0004\bB\u0010C\u001a2\u0010F\u001a\u0004\u0018\u00010E*\u00020\u00002\u0017\u00102\u001a\u0013\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\t0/¢\u0006\u0002\b1H\u0086\bø\u0001\u0001¢\u0006\u0004\bF\u0010G\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b\u009920\u0001¨\u0006H"}, d2 = {"Lcom/google/android/gms/maps/GoogleMap;", "Lkotlinx/coroutines/flow/i;", "Lcom/google/maps/android/ktx/b;", "p", "(Lcom/google/android/gms/maps/GoogleMap;)Lkotlinx/coroutines/flow/i;", "Lcom/google/android/gms/maps/CameraUpdate;", "cameraUpdate", "", "durationMs", "Lkotlin/k2;", "g", "(Lcom/google/android/gms/maps/GoogleMap;Lcom/google/android/gms/maps/CameraUpdate;ILkotlin/coroutines/d;)Ljava/lang/Object;", "j", "(Lcom/google/android/gms/maps/GoogleMap;Lkotlin/coroutines/d;)Ljava/lang/Object;", "q", "r", "s", "Landroid/graphics/Bitmap;", "bitmap", "l", "(Lcom/google/android/gms/maps/GoogleMap;Landroid/graphics/Bitmap;Lkotlin/coroutines/d;)Ljava/lang/Object;", "t", "Lcom/google/android/gms/maps/model/Circle;", "u", "Lcom/google/android/gms/maps/model/GroundOverlay;", "v", "Lcom/google/maps/android/ktx/d0;", "w", "Lcom/google/android/gms/maps/model/Marker;", "x", "y", "z", "Lcom/google/android/gms/maps/model/LatLng;", "A", "B", "C", "Lcom/google/maps/android/ktx/m0;", "D", "E", "Landroid/location/Location;", "F", "Lcom/google/android/gms/maps/model/PointOfInterest;", "G", "Lcom/google/android/gms/maps/model/Polygon;", "H", "Lcom/google/android/gms/maps/model/Polyline;", "I", "Lkotlin/Function1;", "Lcom/google/android/gms/maps/GoogleMapOptions;", "Lkotlin/u;", "optionsActions", "o", "(Lld/l;)Lcom/google/android/gms/maps/GoogleMapOptions;", "Lcom/google/android/gms/maps/model/CircleOptions;", "a", "(Lcom/google/android/gms/maps/GoogleMap;Lld/l;)Lcom/google/android/gms/maps/model/Circle;", "Lcom/google/android/gms/maps/model/GroundOverlayOptions;", "b", "(Lcom/google/android/gms/maps/GoogleMap;Lld/l;)Lcom/google/android/gms/maps/model/GroundOverlay;", "Lcom/google/android/gms/maps/model/MarkerOptions;", "c", "(Lcom/google/android/gms/maps/GoogleMap;Lld/l;)Lcom/google/android/gms/maps/model/Marker;", "Lcom/google/android/gms/maps/model/PolygonOptions;", "d", "(Lcom/google/android/gms/maps/GoogleMap;Lld/l;)Lcom/google/android/gms/maps/model/Polygon;", "Lcom/google/android/gms/maps/model/PolylineOptions;", "e", "(Lcom/google/android/gms/maps/GoogleMap;Lld/l;)Lcom/google/android/gms/maps/model/Polyline;", "Lcom/google/android/gms/maps/model/TileOverlayOptions;", "Lcom/google/android/gms/maps/model/TileOverlay;", "f", "(Lcom/google/android/gms/maps/GoogleMap;Lld/l;)Lcom/google/android/gms/maps/model/TileOverlay;", "maps-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nGoogleMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GoogleMap.kt\ncom/google/maps/android/ktx/GoogleMapKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 CircleOptions.kt\ncom/google/maps/android/ktx/model/CircleOptionsKt\n+ 4 GroundOverlayOptions.kt\ncom/google/maps/android/ktx/model/GroundOverlayOptionsKt\n+ 5 MarkerOptions.kt\ncom/google/maps/android/ktx/model/MarkerOptionsKt\n+ 6 PolygonOptions.kt\ncom/google/maps/android/ktx/model/PolygonOptionsKt\n+ 7 PolylineOptions.kt\ncom/google/maps/android/ktx/model/PolylineOptionsKt\n+ 8 TileOverlayOptioms.kt\ncom/google/maps/android/ktx/model/TileOverlayOptiomsKt\n*L\n1#1,527:1\n314#2,11:528\n28#3,3:539\n28#4,3:542\n28#5,3:545\n28#6,3:548\n28#7,3:551\n28#8,3:554\n*S KotlinDebug\n*F\n+ 1 GoogleMap.kt\ncom/google/maps/android/ktx/GoogleMapKt\n*L\n129#1:528,11\n473#1:539,3\n484#1:542,3\n494#1:545,3\n504#1:548,3\n514#1:551,3\n525#1:554,3\n*E\n"})
/* loaded from: classes6.dex */
public final class g {

    /* compiled from: GoogleMap.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"com/google/maps/android/ktx/g$a", "Lcom/google/android/gms/maps/GoogleMap$CancelableCallback;", "Lkotlin/k2;", "onFinish", "()V", "onCancel", "maps-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = SyslogAppender.LOG_LOCAL6)
    @r1({"SMAP\nGoogleMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GoogleMap.kt\ncom/google/maps/android/ktx/GoogleMapKt$awaitAnimateCamera$2$1\n*L\n1#1,527:1\n*E\n"})
    public static final class a implements GoogleMap.CancelableCallback {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.p<k2> f62226a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(kotlinx.coroutines.p<? super k2> pVar) {
            this.f62226a = pVar;
        }

        @Override // com.google.android.gms.maps.GoogleMap.CancelableCallback
        public void onCancel() {
            p.a.a(this.f62226a, null, 1, null);
        }

        @Override // com.google.android.gms.maps.GoogleMap.CancelableCallback
        public void onFinish() {
            kotlinx.coroutines.p<k2> pVar = this.f62226a;
            z0.Companion companion = z0.INSTANCE;
            pVar.resumeWith(k2.f75408a);
        }
    }

    /* compiled from: GoogleMap.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "onMapLoaded", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nGoogleMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GoogleMap.kt\ncom/google/maps/android/ktx/GoogleMapKt$awaitMapLoad$2$1\n*L\n1#1,527:1\n*E\n"})
    public static final class b implements GoogleMap.OnMapLoadedCallback {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.coroutines.d<k2> f62227a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(kotlin.coroutines.d<? super k2> dVar) {
            this.f62227a = dVar;
        }

        @Override // com.google.android.gms.maps.GoogleMap.OnMapLoadedCallback
        public final void onMapLoaded() {
            kotlin.coroutines.d<k2> dVar = this.f62227a;
            z0.Companion companion = z0.INSTANCE;
            dVar.resumeWith(k2.f75408a);
        }
    }

    /* compiled from: GoogleMap.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/graphics/Bitmap;", "it", "Lkotlin/k2;", "onSnapshotReady", "(Landroid/graphics/Bitmap;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nGoogleMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GoogleMap.kt\ncom/google/maps/android/ktx/GoogleMapKt$awaitSnapshot$2$1\n*L\n1#1,527:1\n*E\n"})
    public static final class c implements GoogleMap.SnapshotReadyCallback {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.coroutines.d<Bitmap> f62228a;

        /* JADX WARN: Multi-variable type inference failed */
        public c(kotlin.coroutines.d<? super Bitmap> dVar) {
            this.f62228a = dVar;
        }

        @Override // com.google.android.gms.maps.GoogleMap.SnapshotReadyCallback
        public final void onSnapshotReady(@fg.m Bitmap bitmap) {
            kotlin.coroutines.d<Bitmap> dVar = this.f62228a;
            z0.Companion companion = z0.INSTANCE;
            dVar.resumeWith(bitmap);
        }
    }

    /* compiled from: GoogleMap.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.maps.android.ktx.GoogleMapKt$cameraEvents$1", f = "GoogleMap.kt", i = {}, l = {111}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/b0;", "Lcom/google/maps/android/ktx/b;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/channels/b0;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.channels.b0<? super com.google.maps.android.ktx.b>, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f62229b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f62230c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ GoogleMap f62231d;

        /* compiled from: GoogleMap.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.a<k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ GoogleMap f62232b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(GoogleMap googleMap) {
                super(0);
                this.f62232b = googleMap;
            }

            public final void a() {
                this.f62232b.setOnCameraIdleListener(null);
                this.f62232b.setOnCameraMoveCanceledListener(null);
                this.f62232b.setOnCameraMoveListener(null);
                this.f62232b.setOnCameraMoveStartedListener(null);
            }

            @Override // ld.a
            public /* bridge */ /* synthetic */ k2 invoke() {
                a();
                return k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(GoogleMap googleMap, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f62231d = googleMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void C(kotlinx.coroutines.channels.b0 b0Var, int i4) {
            b0Var.M(new com.google.maps.android.ktx.f(i4));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void r(kotlinx.coroutines.channels.b0 b0Var) {
            b0Var.M(com.google.maps.android.ktx.c.f62219a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void s(kotlinx.coroutines.channels.b0 b0Var) {
            b0Var.M(com.google.maps.android.ktx.d.f62221a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void w(kotlinx.coroutines.channels.b0 b0Var) {
            b0Var.M(com.google.maps.android.ktx.e.f62222a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            d dVar2 = new d(this.f62231d, dVar);
            dVar2.f62230c = obj;
            return dVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f62229b;
            if (i4 == 0) {
                a1.n(obj);
                final kotlinx.coroutines.channels.b0 b0Var = (kotlinx.coroutines.channels.b0) this.f62230c;
                this.f62231d.setOnCameraIdleListener(new GoogleMap.OnCameraIdleListener() { // from class: com.google.maps.android.ktx.h
                    @Override // com.google.android.gms.maps.GoogleMap.OnCameraIdleListener
                    public final void onCameraIdle() {
                        g.d.r(kotlinx.coroutines.channels.b0.this);
                    }
                });
                this.f62231d.setOnCameraMoveCanceledListener(new GoogleMap.OnCameraMoveCanceledListener() { // from class: com.google.maps.android.ktx.i
                    @Override // com.google.android.gms.maps.GoogleMap.OnCameraMoveCanceledListener
                    public final void onCameraMoveCanceled() {
                        g.d.s(kotlinx.coroutines.channels.b0.this);
                    }
                });
                this.f62231d.setOnCameraMoveListener(new GoogleMap.OnCameraMoveListener() { // from class: com.google.maps.android.ktx.j
                    @Override // com.google.android.gms.maps.GoogleMap.OnCameraMoveListener
                    public final void onCameraMove() {
                        g.d.w(kotlinx.coroutines.channels.b0.this);
                    }
                });
                this.f62231d.setOnCameraMoveStartedListener(new GoogleMap.OnCameraMoveStartedListener() { // from class: com.google.maps.android.ktx.k
                    @Override // com.google.android.gms.maps.GoogleMap.OnCameraMoveStartedListener
                    public final void onCameraMoveStarted(int i5) {
                        g.d.C(kotlinx.coroutines.channels.b0.this, i5);
                    }
                });
                a aVar2 = new a(this.f62231d);
                this.f62229b = 1;
                if (kotlinx.coroutines.channels.z.a(b0Var, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("࡛\u0001"));
                }
                a1.n(obj);
            }
            return k2.f75408a;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l kotlinx.coroutines.channels.b0<? super com.google.maps.android.ktx.b> b0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    /* compiled from: GoogleMap.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.maps.android.ktx.GoogleMapKt$cameraIdleEvents$1", f = "GoogleMap.kt", i = {}, l = {161}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/channels/b0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/channels/b0;)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.channels.b0<? super k2>, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f62233b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f62234c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ GoogleMap f62235d;

        /* compiled from: GoogleMap.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.a<k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ GoogleMap f62236b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(GoogleMap googleMap) {
                super(0);
                this.f62236b = googleMap;
            }

            public final void a() {
                this.f62236b.setOnCameraIdleListener(null);
            }

            @Override // ld.a
            public /* bridge */ /* synthetic */ k2 invoke() {
                a();
                return k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(GoogleMap googleMap, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f62235d = googleMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void m(kotlinx.coroutines.channels.b0 b0Var) {
            b0Var.M(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            e eVar = new e(this.f62235d, dVar);
            eVar.f62234c = obj;
            return eVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l kotlinx.coroutines.channels.b0<? super k2> b0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f62233b;
            if (i4 == 0) {
                a1.n(obj);
                final kotlinx.coroutines.channels.b0 b0Var = (kotlinx.coroutines.channels.b0) this.f62234c;
                this.f62235d.setOnCameraIdleListener(new GoogleMap.OnCameraIdleListener() { // from class: com.google.maps.android.ktx.l
                    @Override // com.google.android.gms.maps.GoogleMap.OnCameraIdleListener
                    public final void onCameraIdle() {
                        g.e.m(kotlinx.coroutines.channels.b0.this);
                    }
                });
                a aVar2 = new a(this.f62235d);
                this.f62233b = 1;
                if (kotlinx.coroutines.channels.z.a(b0Var, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("\u085c\u0001"));
                }
                a1.n(obj);
            }
            return k2.f75408a;
        }
    }

    /* compiled from: GoogleMap.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.maps.android.ktx.GoogleMapKt$cameraMoveCanceledEvents$1", f = "GoogleMap.kt", i = {}, l = {SyslogAppender.LOG_LOCAL6}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/channels/b0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/channels/b0;)V"}, k = 3, mv = {1, 8, 0})
    static final class f extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.channels.b0<? super k2>, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f62237b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f62238c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ GoogleMap f62239d;

        /* compiled from: GoogleMap.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.a<k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ GoogleMap f62240b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(GoogleMap googleMap) {
                super(0);
                this.f62240b = googleMap;
            }

            public final void a() {
                this.f62240b.setOnCameraMoveCanceledListener(null);
            }

            @Override // ld.a
            public /* bridge */ /* synthetic */ k2 invoke() {
                a();
                return k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(GoogleMap googleMap, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.f62239d = googleMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void m(kotlinx.coroutines.channels.b0 b0Var) {
            b0Var.M(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            f fVar = new f(this.f62239d, dVar);
            fVar.f62238c = obj;
            return fVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l kotlinx.coroutines.channels.b0<? super k2> b0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((f) create(b0Var, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f62237b;
            if (i4 == 0) {
                a1.n(obj);
                final kotlinx.coroutines.channels.b0 b0Var = (kotlinx.coroutines.channels.b0) this.f62238c;
                this.f62239d.setOnCameraMoveCanceledListener(new GoogleMap.OnCameraMoveCanceledListener() { // from class: com.google.maps.android.ktx.m
                    @Override // com.google.android.gms.maps.GoogleMap.OnCameraMoveCanceledListener
                    public final void onCameraMoveCanceled() {
                        g.f.m(kotlinx.coroutines.channels.b0.this);
                    }
                });
                a aVar2 = new a(this.f62239d);
                this.f62237b = 1;
                if (kotlinx.coroutines.channels.z.a(b0Var, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("\u085d\u0001"));
                }
                a1.n(obj);
            }
            return k2.f75408a;
        }
    }

    /* compiled from: GoogleMap.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.maps.android.ktx.GoogleMapKt$cameraMoveEvents$1", f = "GoogleMap.kt", i = {}, l = {190}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/channels/b0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/channels/b0;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: com.google.maps.android.ktx.g$g, reason: collision with other inner class name */
    static final class C0954g extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.channels.b0<? super k2>, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f62241b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f62242c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ GoogleMap f62243d;

        /* compiled from: GoogleMap.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: com.google.maps.android.ktx.g$g$a */
        static final class a extends kotlin.jvm.internal.n0 implements ld.a<k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ GoogleMap f62244b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(GoogleMap googleMap) {
                super(0);
                this.f62244b = googleMap;
            }

            public final void a() {
                this.f62244b.setOnCameraMoveListener(null);
            }

            @Override // ld.a
            public /* bridge */ /* synthetic */ k2 invoke() {
                a();
                return k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0954g(GoogleMap googleMap, kotlin.coroutines.d<? super C0954g> dVar) {
            super(2, dVar);
            this.f62243d = googleMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void m(kotlinx.coroutines.channels.b0 b0Var) {
            b0Var.M(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            C0954g c0954g = new C0954g(this.f62243d, dVar);
            c0954g.f62242c = obj;
            return c0954g;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l kotlinx.coroutines.channels.b0<? super k2> b0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((C0954g) create(b0Var, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f62241b;
            if (i4 == 0) {
                a1.n(obj);
                final kotlinx.coroutines.channels.b0 b0Var = (kotlinx.coroutines.channels.b0) this.f62242c;
                this.f62243d.setOnCameraMoveListener(new GoogleMap.OnCameraMoveListener() { // from class: com.google.maps.android.ktx.n
                    @Override // com.google.android.gms.maps.GoogleMap.OnCameraMoveListener
                    public final void onCameraMove() {
                        g.C0954g.m(kotlinx.coroutines.channels.b0.this);
                    }
                });
                a aVar2 = new a(this.f62243d);
                this.f62241b = 1;
                if (kotlinx.coroutines.channels.z.a(b0Var, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("࡞\u0001"));
                }
                a1.n(obj);
            }
            return k2.f75408a;
        }
    }

    /* compiled from: GoogleMap.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.maps.android.ktx.GoogleMapKt$cameraMoveStartedEvents$1", f = "GoogleMap.kt", i = {}, l = {216}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/b0;", "", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/channels/b0;)V"}, k = 3, mv = {1, 8, 0})
    static final class h extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.channels.b0<? super Integer>, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f62245b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f62246c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ GoogleMap f62247d;

        /* compiled from: GoogleMap.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.a<k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ GoogleMap f62248b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(GoogleMap googleMap) {
                super(0);
                this.f62248b = googleMap;
            }

            public final void a() {
                this.f62248b.setOnCameraMoveStartedListener(null);
            }

            @Override // ld.a
            public /* bridge */ /* synthetic */ k2 invoke() {
                a();
                return k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(GoogleMap googleMap, kotlin.coroutines.d<? super h> dVar) {
            super(2, dVar);
            this.f62247d = googleMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void m(kotlinx.coroutines.channels.b0 b0Var, int i4) {
            b0Var.M(Integer.valueOf(i4));
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            h hVar = new h(this.f62247d, dVar);
            hVar.f62246c = obj;
            return hVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l kotlinx.coroutines.channels.b0<? super Integer> b0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((h) create(b0Var, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f62245b;
            if (i4 == 0) {
                a1.n(obj);
                final kotlinx.coroutines.channels.b0 b0Var = (kotlinx.coroutines.channels.b0) this.f62246c;
                this.f62247d.setOnCameraMoveStartedListener(new GoogleMap.OnCameraMoveStartedListener() { // from class: com.google.maps.android.ktx.o
                    @Override // com.google.android.gms.maps.GoogleMap.OnCameraMoveStartedListener
                    public final void onCameraMoveStarted(int i5) {
                        g.h.m(kotlinx.coroutines.channels.b0.this, i5);
                    }
                });
                a aVar2 = new a(this.f62247d);
                this.f62245b = 1;
                if (kotlinx.coroutines.channels.z.a(b0Var, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("\u085f\u0001"));
                }
                a1.n(obj);
            }
            return k2.f75408a;
        }
    }

    /* compiled from: GoogleMap.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.maps.android.ktx.GoogleMapKt$circleClickEvents$1", f = "GoogleMap.kt", i = {}, l = {230}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/b0;", "Lcom/google/android/gms/maps/model/Circle;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/channels/b0;)V"}, k = 3, mv = {1, 8, 0})
    static final class i extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.channels.b0<? super Circle>, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f62249b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f62250c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ GoogleMap f62251d;

        /* compiled from: GoogleMap.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.a<k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ GoogleMap f62252b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(GoogleMap googleMap) {
                super(0);
                this.f62252b = googleMap;
            }

            public final void a() {
                this.f62252b.setOnCircleClickListener(null);
            }

            @Override // ld.a
            public /* bridge */ /* synthetic */ k2 invoke() {
                a();
                return k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(GoogleMap googleMap, kotlin.coroutines.d<? super i> dVar) {
            super(2, dVar);
            this.f62251d = googleMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void m(kotlinx.coroutines.channels.b0 b0Var, Circle circle) {
            kotlin.jvm.internal.l0.o(circle, ProtectedSandApp.s("ࡠ\u0001"));
            b0Var.M(circle);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            i iVar = new i(this.f62251d, dVar);
            iVar.f62250c = obj;
            return iVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l kotlinx.coroutines.channels.b0<? super Circle> b0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((i) create(b0Var, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f62249b;
            if (i4 == 0) {
                a1.n(obj);
                final kotlinx.coroutines.channels.b0 b0Var = (kotlinx.coroutines.channels.b0) this.f62250c;
                this.f62251d.setOnCircleClickListener(new GoogleMap.OnCircleClickListener() { // from class: com.google.maps.android.ktx.p
                    @Override // com.google.android.gms.maps.GoogleMap.OnCircleClickListener
                    public final void onCircleClick(Circle circle) {
                        g.i.m(kotlinx.coroutines.channels.b0.this, circle);
                    }
                });
                a aVar2 = new a(this.f62251d);
                this.f62249b = 1;
                if (kotlinx.coroutines.channels.z.a(b0Var, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("ࡡ\u0001"));
                }
                a1.n(obj);
            }
            return k2.f75408a;
        }
    }

    /* compiled from: GoogleMap.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.maps.android.ktx.GoogleMapKt$groundOverlayClicks$1", f = "GoogleMap.kt", i = {}, l = {245}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/b0;", "Lcom/google/android/gms/maps/model/GroundOverlay;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/channels/b0;)V"}, k = 3, mv = {1, 8, 0})
    static final class j extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.channels.b0<? super GroundOverlay>, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f62253b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f62254c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ GoogleMap f62255d;

        /* compiled from: GoogleMap.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.a<k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ GoogleMap f62256b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(GoogleMap googleMap) {
                super(0);
                this.f62256b = googleMap;
            }

            public final void a() {
                this.f62256b.setOnGroundOverlayClickListener(null);
            }

            @Override // ld.a
            public /* bridge */ /* synthetic */ k2 invoke() {
                a();
                return k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(GoogleMap googleMap, kotlin.coroutines.d<? super j> dVar) {
            super(2, dVar);
            this.f62255d = googleMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void m(kotlinx.coroutines.channels.b0 b0Var, GroundOverlay groundOverlay) {
            kotlin.jvm.internal.l0.o(groundOverlay, ProtectedSandApp.s("ࡢ\u0001"));
            b0Var.M(groundOverlay);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            j jVar = new j(this.f62255d, dVar);
            jVar.f62254c = obj;
            return jVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l kotlinx.coroutines.channels.b0<? super GroundOverlay> b0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((j) create(b0Var, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f62253b;
            if (i4 == 0) {
                a1.n(obj);
                final kotlinx.coroutines.channels.b0 b0Var = (kotlinx.coroutines.channels.b0) this.f62254c;
                this.f62255d.setOnGroundOverlayClickListener(new GoogleMap.OnGroundOverlayClickListener() { // from class: com.google.maps.android.ktx.q
                    @Override // com.google.android.gms.maps.GoogleMap.OnGroundOverlayClickListener
                    public final void onGroundOverlayClick(GroundOverlay groundOverlay) {
                        g.j.m(kotlinx.coroutines.channels.b0.this, groundOverlay);
                    }
                });
                a aVar2 = new a(this.f62255d);
                this.f62253b = 1;
                if (kotlinx.coroutines.channels.z.a(b0Var, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("ࡣ\u0001"));
                }
                a1.n(obj);
            }
            return k2.f75408a;
        }
    }

    /* compiled from: GoogleMap.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.maps.android.ktx.GoogleMapKt$indoorStateChangeEvents$1", f = "GoogleMap.kt", i = {}, l = {266}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/b0;", "Lcom/google/maps/android/ktx/d0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/channels/b0;)V"}, k = 3, mv = {1, 8, 0})
    static final class k extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.channels.b0<? super d0>, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f62257b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f62258c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ GoogleMap f62259d;

        /* compiled from: GoogleMap.kt */
        @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/google/maps/android/ktx/g$k$a", "Lcom/google/android/gms/maps/GoogleMap$OnIndoorStateChangeListener;", "Lkotlin/k2;", "onIndoorBuildingFocused", "()V", "Lcom/google/android/gms/maps/model/IndoorBuilding;", "indoorBuilding", "onIndoorLevelActivated", "(Lcom/google/android/gms/maps/model/IndoorBuilding;)V", "maps-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a implements GoogleMap.OnIndoorStateChangeListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.channels.b0<d0> f62260a;

            /* JADX WARN: Multi-variable type inference failed */
            a(kotlinx.coroutines.channels.b0<? super d0> b0Var) {
                this.f62260a = b0Var;
            }

            @Override // com.google.android.gms.maps.GoogleMap.OnIndoorStateChangeListener
            public void onIndoorBuildingFocused() {
                this.f62260a.M(c0.f62220a);
            }

            @Override // com.google.android.gms.maps.GoogleMap.OnIndoorStateChangeListener
            public void onIndoorLevelActivated(@fg.l IndoorBuilding indoorBuilding) {
                kotlin.jvm.internal.l0.p(indoorBuilding, ProtectedSandApp.s("ࡤ\u0001"));
                this.f62260a.M(new e0(indoorBuilding));
            }
        }

        /* compiled from: GoogleMap.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
        static final class b extends kotlin.jvm.internal.n0 implements ld.a<k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ GoogleMap f62261b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(GoogleMap googleMap) {
                super(0);
                this.f62261b = googleMap;
            }

            public final void a() {
                this.f62261b.setOnIndoorStateChangeListener(null);
            }

            @Override // ld.a
            public /* bridge */ /* synthetic */ k2 invoke() {
                a();
                return k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(GoogleMap googleMap, kotlin.coroutines.d<? super k> dVar) {
            super(2, dVar);
            this.f62259d = googleMap;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l kotlinx.coroutines.channels.b0<? super d0> b0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((k) create(b0Var, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            k kVar = new k(this.f62259d, dVar);
            kVar.f62258c = obj;
            return kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f62257b;
            if (i4 == 0) {
                a1.n(obj);
                kotlinx.coroutines.channels.b0 b0Var = (kotlinx.coroutines.channels.b0) this.f62258c;
                this.f62259d.setOnIndoorStateChangeListener(new a(b0Var));
                b bVar = new b(this.f62259d);
                this.f62257b = 1;
                if (kotlinx.coroutines.channels.z.a(b0Var, bVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("ࡥ\u0001"));
                }
                a1.n(obj);
            }
            return k2.f75408a;
        }
    }

    /* compiled from: GoogleMap.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.maps.android.ktx.GoogleMapKt$infoWindowClickEvents$1", f = "GoogleMap.kt", i = {}, l = {281}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/b0;", "Lcom/google/android/gms/maps/model/Marker;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/channels/b0;)V"}, k = 3, mv = {1, 8, 0})
    static final class l extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.channels.b0<? super Marker>, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f62262b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f62263c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ GoogleMap f62264d;

        /* compiled from: GoogleMap.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.a<k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ GoogleMap f62265b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(GoogleMap googleMap) {
                super(0);
                this.f62265b = googleMap;
            }

            public final void a() {
                this.f62265b.setOnInfoWindowClickListener(null);
            }

            @Override // ld.a
            public /* bridge */ /* synthetic */ k2 invoke() {
                a();
                return k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(GoogleMap googleMap, kotlin.coroutines.d<? super l> dVar) {
            super(2, dVar);
            this.f62264d = googleMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void m(kotlinx.coroutines.channels.b0 b0Var, Marker marker) {
            kotlin.jvm.internal.l0.o(marker, ProtectedSandApp.s("ࡦ\u0001"));
            b0Var.M(marker);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            l lVar = new l(this.f62264d, dVar);
            lVar.f62263c = obj;
            return lVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l kotlinx.coroutines.channels.b0<? super Marker> b0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((l) create(b0Var, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f62262b;
            if (i4 == 0) {
                a1.n(obj);
                final kotlinx.coroutines.channels.b0 b0Var = (kotlinx.coroutines.channels.b0) this.f62263c;
                this.f62264d.setOnInfoWindowClickListener(new GoogleMap.OnInfoWindowClickListener() { // from class: com.google.maps.android.ktx.r
                    @Override // com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener
                    public final void onInfoWindowClick(Marker marker) {
                        g.l.m(kotlinx.coroutines.channels.b0.this, marker);
                    }
                });
                a aVar2 = new a(this.f62264d);
                this.f62262b = 1;
                if (kotlinx.coroutines.channels.z.a(b0Var, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("ࡧ\u0001"));
                }
                a1.n(obj);
            }
            return k2.f75408a;
        }
    }

    /* compiled from: GoogleMap.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.maps.android.ktx.GoogleMapKt$infoWindowCloseEvents$1", f = "GoogleMap.kt", i = {}, l = {296}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/b0;", "Lcom/google/android/gms/maps/model/Marker;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/channels/b0;)V"}, k = 3, mv = {1, 8, 0})
    static final class m extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.channels.b0<? super Marker>, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f62266b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f62267c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ GoogleMap f62268d;

        /* compiled from: GoogleMap.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.a<k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ GoogleMap f62269b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(GoogleMap googleMap) {
                super(0);
                this.f62269b = googleMap;
            }

            public final void a() {
                this.f62269b.setOnInfoWindowCloseListener(null);
            }

            @Override // ld.a
            public /* bridge */ /* synthetic */ k2 invoke() {
                a();
                return k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(GoogleMap googleMap, kotlin.coroutines.d<? super m> dVar) {
            super(2, dVar);
            this.f62268d = googleMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void m(kotlinx.coroutines.channels.b0 b0Var, Marker marker) {
            kotlin.jvm.internal.l0.o(marker, ProtectedSandApp.s("ࡨ\u0001"));
            b0Var.M(marker);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            m mVar = new m(this.f62268d, dVar);
            mVar.f62267c = obj;
            return mVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l kotlinx.coroutines.channels.b0<? super Marker> b0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((m) create(b0Var, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f62266b;
            if (i4 == 0) {
                a1.n(obj);
                final kotlinx.coroutines.channels.b0 b0Var = (kotlinx.coroutines.channels.b0) this.f62267c;
                this.f62268d.setOnInfoWindowCloseListener(new GoogleMap.OnInfoWindowCloseListener() { // from class: com.google.maps.android.ktx.s
                    @Override // com.google.android.gms.maps.GoogleMap.OnInfoWindowCloseListener
                    public final void onInfoWindowClose(Marker marker) {
                        g.m.m(kotlinx.coroutines.channels.b0.this, marker);
                    }
                });
                a aVar2 = new a(this.f62268d);
                this.f62266b = 1;
                if (kotlinx.coroutines.channels.z.a(b0Var, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("ࡩ\u0001"));
                }
                a1.n(obj);
            }
            return k2.f75408a;
        }
    }

    /* compiled from: GoogleMap.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.maps.android.ktx.GoogleMapKt$infoWindowLongClickEvents$1", f = "GoogleMap.kt", i = {}, l = {311}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/b0;", "Lcom/google/android/gms/maps/model/Marker;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/channels/b0;)V"}, k = 3, mv = {1, 8, 0})
    static final class n extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.channels.b0<? super Marker>, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f62270b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f62271c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ GoogleMap f62272d;

        /* compiled from: GoogleMap.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.a<k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ GoogleMap f62273b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(GoogleMap googleMap) {
                super(0);
                this.f62273b = googleMap;
            }

            public final void a() {
                this.f62273b.setOnInfoWindowLongClickListener(null);
            }

            @Override // ld.a
            public /* bridge */ /* synthetic */ k2 invoke() {
                a();
                return k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(GoogleMap googleMap, kotlin.coroutines.d<? super n> dVar) {
            super(2, dVar);
            this.f62272d = googleMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void m(kotlinx.coroutines.channels.b0 b0Var, Marker marker) {
            kotlin.jvm.internal.l0.o(marker, ProtectedSandApp.s("ࡪ\u0001"));
            b0Var.M(marker);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            n nVar = new n(this.f62272d, dVar);
            nVar.f62271c = obj;
            return nVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l kotlinx.coroutines.channels.b0<? super Marker> b0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((n) create(b0Var, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f62270b;
            if (i4 == 0) {
                a1.n(obj);
                final kotlinx.coroutines.channels.b0 b0Var = (kotlinx.coroutines.channels.b0) this.f62271c;
                this.f62272d.setOnInfoWindowLongClickListener(new GoogleMap.OnInfoWindowLongClickListener() { // from class: com.google.maps.android.ktx.t
                    @Override // com.google.android.gms.maps.GoogleMap.OnInfoWindowLongClickListener
                    public final void onInfoWindowLongClick(Marker marker) {
                        g.n.m(kotlinx.coroutines.channels.b0.this, marker);
                    }
                });
                a aVar2 = new a(this.f62272d);
                this.f62270b = 1;
                if (kotlinx.coroutines.channels.z.a(b0Var, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("\u086b\u0001"));
                }
                a1.n(obj);
            }
            return k2.f75408a;
        }
    }

    /* compiled from: GoogleMap.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.maps.android.ktx.GoogleMapKt$mapClickEvents$1", f = "GoogleMap.kt", i = {}, l = {325}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/b0;", "Lcom/google/android/gms/maps/model/LatLng;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/channels/b0;)V"}, k = 3, mv = {1, 8, 0})
    static final class o extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.channels.b0<? super LatLng>, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f62274b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f62275c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ GoogleMap f62276d;

        /* compiled from: GoogleMap.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.a<k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ GoogleMap f62277b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(GoogleMap googleMap) {
                super(0);
                this.f62277b = googleMap;
            }

            public final void a() {
                this.f62277b.setOnMapClickListener(null);
            }

            @Override // ld.a
            public /* bridge */ /* synthetic */ k2 invoke() {
                a();
                return k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(GoogleMap googleMap, kotlin.coroutines.d<? super o> dVar) {
            super(2, dVar);
            this.f62276d = googleMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void m(kotlinx.coroutines.channels.b0 b0Var, LatLng latLng) {
            kotlin.jvm.internal.l0.o(latLng, ProtectedSandApp.s("\u086c\u0001"));
            b0Var.M(latLng);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            o oVar = new o(this.f62276d, dVar);
            oVar.f62275c = obj;
            return oVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l kotlinx.coroutines.channels.b0<? super LatLng> b0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((o) create(b0Var, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f62274b;
            if (i4 == 0) {
                a1.n(obj);
                final kotlinx.coroutines.channels.b0 b0Var = (kotlinx.coroutines.channels.b0) this.f62275c;
                this.f62276d.setOnMapClickListener(new GoogleMap.OnMapClickListener() { // from class: com.google.maps.android.ktx.u
                    @Override // com.google.android.gms.maps.GoogleMap.OnMapClickListener
                    public final void onMapClick(LatLng latLng) {
                        g.o.m(kotlinx.coroutines.channels.b0.this, latLng);
                    }
                });
                a aVar2 = new a(this.f62276d);
                this.f62274b = 1;
                if (kotlinx.coroutines.channels.z.a(b0Var, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("\u086d\u0001"));
                }
                a1.n(obj);
            }
            return k2.f75408a;
        }
    }

    /* compiled from: GoogleMap.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.maps.android.ktx.GoogleMapKt$mapLongClickEvents$1", f = "GoogleMap.kt", i = {}, l = {339}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/b0;", "Lcom/google/android/gms/maps/model/LatLng;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/channels/b0;)V"}, k = 3, mv = {1, 8, 0})
    static final class p extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.channels.b0<? super LatLng>, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f62278b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f62279c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ GoogleMap f62280d;

        /* compiled from: GoogleMap.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.a<k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ GoogleMap f62281b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(GoogleMap googleMap) {
                super(0);
                this.f62281b = googleMap;
            }

            public final void a() {
                this.f62281b.setOnMapLongClickListener(null);
            }

            @Override // ld.a
            public /* bridge */ /* synthetic */ k2 invoke() {
                a();
                return k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(GoogleMap googleMap, kotlin.coroutines.d<? super p> dVar) {
            super(2, dVar);
            this.f62280d = googleMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void m(kotlinx.coroutines.channels.b0 b0Var, LatLng latLng) {
            kotlin.jvm.internal.l0.o(latLng, ProtectedSandApp.s("\u086e\u0001"));
            b0Var.M(latLng);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            p pVar = new p(this.f62280d, dVar);
            pVar.f62279c = obj;
            return pVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l kotlinx.coroutines.channels.b0<? super LatLng> b0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((p) create(b0Var, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f62278b;
            if (i4 == 0) {
                a1.n(obj);
                final kotlinx.coroutines.channels.b0 b0Var = (kotlinx.coroutines.channels.b0) this.f62279c;
                this.f62280d.setOnMapLongClickListener(new GoogleMap.OnMapLongClickListener() { // from class: com.google.maps.android.ktx.v
                    @Override // com.google.android.gms.maps.GoogleMap.OnMapLongClickListener
                    public final void onMapLongClick(LatLng latLng) {
                        g.p.m(kotlinx.coroutines.channels.b0.this, latLng);
                    }
                });
                a aVar2 = new a(this.f62280d);
                this.f62278b = 1;
                if (kotlinx.coroutines.channels.z.a(b0Var, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("\u086f\u0001"));
                }
                a1.n(obj);
            }
            return k2.f75408a;
        }
    }

    /* compiled from: GoogleMap.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.maps.android.ktx.GoogleMapKt$markerClickEvents$1", f = "GoogleMap.kt", i = {}, l = {353}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/b0;", "Lcom/google/android/gms/maps/model/Marker;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/channels/b0;)V"}, k = 3, mv = {1, 8, 0})
    static final class q extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.channels.b0<? super Marker>, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f62282b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f62283c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ GoogleMap f62284d;

        /* compiled from: GoogleMap.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.a<k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ GoogleMap f62285b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(GoogleMap googleMap) {
                super(0);
                this.f62285b = googleMap;
            }

            public final void a() {
                this.f62285b.setOnMarkerClickListener(null);
            }

            @Override // ld.a
            public /* bridge */ /* synthetic */ k2 invoke() {
                a();
                return k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(GoogleMap googleMap, kotlin.coroutines.d<? super q> dVar) {
            super(2, dVar);
            this.f62284d = googleMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean m(kotlinx.coroutines.channels.b0 b0Var, Marker marker) {
            kotlin.jvm.internal.l0.o(marker, ProtectedSandApp.s("ࡰ\u0001"));
            return kotlinx.coroutines.channels.p.m(b0Var.M(marker));
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            q qVar = new q(this.f62284d, dVar);
            qVar.f62283c = obj;
            return qVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l kotlinx.coroutines.channels.b0<? super Marker> b0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((q) create(b0Var, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f62282b;
            if (i4 == 0) {
                a1.n(obj);
                final kotlinx.coroutines.channels.b0 b0Var = (kotlinx.coroutines.channels.b0) this.f62283c;
                this.f62284d.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() { // from class: com.google.maps.android.ktx.w
                    @Override // com.google.android.gms.maps.GoogleMap.OnMarkerClickListener
                    public final boolean onMarkerClick(Marker marker) {
                        boolean m4;
                        m4 = g.q.m(kotlinx.coroutines.channels.b0.this, marker);
                        return m4;
                    }
                });
                a aVar2 = new a(this.f62284d);
                this.f62282b = 1;
                if (kotlinx.coroutines.channels.z.a(b0Var, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("ࡱ\u0001"));
                }
                a1.n(obj);
            }
            return k2.f75408a;
        }
    }

    /* compiled from: GoogleMap.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.maps.android.ktx.GoogleMapKt$markerDragEvents$1", f = "GoogleMap.kt", i = {}, l = {378}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/b0;", "Lcom/google/maps/android/ktx/m0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/channels/b0;)V"}, k = 3, mv = {1, 8, 0})
    static final class r extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.channels.b0<? super m0>, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f62286b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f62287c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ GoogleMap f62288d;

        /* compiled from: GoogleMap.kt */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"com/google/maps/android/ktx/g$r$a", "Lcom/google/android/gms/maps/GoogleMap$OnMarkerDragListener;", "Lcom/google/android/gms/maps/model/Marker;", "marker", "Lkotlin/k2;", "onMarkerDragStart", "(Lcom/google/android/gms/maps/model/Marker;)V", "onMarkerDrag", "onMarkerDragEnd", "maps-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a implements GoogleMap.OnMarkerDragListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.channels.b0<m0> f62289a;

            /* JADX WARN: Multi-variable type inference failed */
            a(kotlinx.coroutines.channels.b0<? super m0> b0Var) {
                this.f62289a = b0Var;
            }

            @Override // com.google.android.gms.maps.GoogleMap.OnMarkerDragListener
            public void onMarkerDrag(@fg.l Marker marker) {
                kotlin.jvm.internal.l0.p(marker, ProtectedSandApp.s("ࡲ\u0001"));
                this.f62289a.M(new j0(marker));
            }

            @Override // com.google.android.gms.maps.GoogleMap.OnMarkerDragListener
            public void onMarkerDragEnd(@fg.l Marker marker) {
                kotlin.jvm.internal.l0.p(marker, ProtectedSandApp.s("ࡲ\u0001"));
                this.f62289a.M(new i0(marker));
            }

            @Override // com.google.android.gms.maps.GoogleMap.OnMarkerDragListener
            public void onMarkerDragStart(@fg.l Marker marker) {
                kotlin.jvm.internal.l0.p(marker, ProtectedSandApp.s("ࡲ\u0001"));
                this.f62289a.M(new k0(marker));
            }
        }

        /* compiled from: GoogleMap.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
        static final class b extends kotlin.jvm.internal.n0 implements ld.a<k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ GoogleMap f62290b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(GoogleMap googleMap) {
                super(0);
                this.f62290b = googleMap;
            }

            public final void a() {
                this.f62290b.setOnMarkerDragListener(null);
            }

            @Override // ld.a
            public /* bridge */ /* synthetic */ k2 invoke() {
                a();
                return k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(GoogleMap googleMap, kotlin.coroutines.d<? super r> dVar) {
            super(2, dVar);
            this.f62288d = googleMap;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l kotlinx.coroutines.channels.b0<? super m0> b0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((r) create(b0Var, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            r rVar = new r(this.f62288d, dVar);
            rVar.f62287c = obj;
            return rVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f62286b;
            if (i4 == 0) {
                a1.n(obj);
                kotlinx.coroutines.channels.b0 b0Var = (kotlinx.coroutines.channels.b0) this.f62287c;
                this.f62288d.setOnMarkerDragListener(new a(b0Var));
                b bVar = new b(this.f62288d);
                this.f62286b = 1;
                if (kotlinx.coroutines.channels.z.a(b0Var, bVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("ࡳ\u0001"));
                }
                a1.n(obj);
            }
            return k2.f75408a;
        }
    }

    /* compiled from: GoogleMap.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.maps.android.ktx.GoogleMapKt$myLocationButtonClickEvents$1", f = "GoogleMap.kt", i = {}, l = {393}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/channels/b0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/channels/b0;)V"}, k = 3, mv = {1, 8, 0})
    static final class s extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.channels.b0<? super k2>, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f62291b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f62292c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ GoogleMap f62293d;

        /* compiled from: GoogleMap.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.a<k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ GoogleMap f62294b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(GoogleMap googleMap) {
                super(0);
                this.f62294b = googleMap;
            }

            public final void a() {
                this.f62294b.setOnMyLocationButtonClickListener(null);
            }

            @Override // ld.a
            public /* bridge */ /* synthetic */ k2 invoke() {
                a();
                return k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(GoogleMap googleMap, kotlin.coroutines.d<? super s> dVar) {
            super(2, dVar);
            this.f62293d = googleMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean m(kotlinx.coroutines.channels.b0 b0Var) {
            return kotlinx.coroutines.channels.p.m(b0Var.M(k2.f75408a));
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            s sVar = new s(this.f62293d, dVar);
            sVar.f62292c = obj;
            return sVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l kotlinx.coroutines.channels.b0<? super k2> b0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((s) create(b0Var, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f62291b;
            if (i4 == 0) {
                a1.n(obj);
                final kotlinx.coroutines.channels.b0 b0Var = (kotlinx.coroutines.channels.b0) this.f62292c;
                this.f62293d.setOnMyLocationButtonClickListener(new GoogleMap.OnMyLocationButtonClickListener() { // from class: com.google.maps.android.ktx.x
                    @Override // com.google.android.gms.maps.GoogleMap.OnMyLocationButtonClickListener
                    public final boolean onMyLocationButtonClick() {
                        boolean m4;
                        m4 = g.s.m(kotlinx.coroutines.channels.b0.this);
                        return m4;
                    }
                });
                a aVar2 = new a(this.f62293d);
                this.f62291b = 1;
                if (kotlinx.coroutines.channels.z.a(b0Var, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("ࡴ\u0001"));
                }
                a1.n(obj);
            }
            return k2.f75408a;
        }
    }

    /* compiled from: GoogleMap.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.maps.android.ktx.GoogleMapKt$myLocationClickEvents$1", f = "GoogleMap.kt", i = {}, l = {HttpStatus.SC_REQUEST_TIMEOUT}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/b0;", "Landroid/location/Location;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/channels/b0;)V"}, k = 3, mv = {1, 8, 0})
    static final class t extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.channels.b0<? super Location>, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f62295b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f62296c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ GoogleMap f62297d;

        /* compiled from: GoogleMap.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.a<k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ GoogleMap f62298b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(GoogleMap googleMap) {
                super(0);
                this.f62298b = googleMap;
            }

            public final void a() {
                this.f62298b.setOnMyLocationClickListener(null);
            }

            @Override // ld.a
            public /* bridge */ /* synthetic */ k2 invoke() {
                a();
                return k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(GoogleMap googleMap, kotlin.coroutines.d<? super t> dVar) {
            super(2, dVar);
            this.f62297d = googleMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void m(kotlinx.coroutines.channels.b0 b0Var, Location location) {
            kotlin.jvm.internal.l0.o(location, ProtectedSandApp.s("ࡵ\u0001"));
            b0Var.M(location);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            t tVar = new t(this.f62297d, dVar);
            tVar.f62296c = obj;
            return tVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l kotlinx.coroutines.channels.b0<? super Location> b0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((t) create(b0Var, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f62295b;
            if (i4 == 0) {
                a1.n(obj);
                final kotlinx.coroutines.channels.b0 b0Var = (kotlinx.coroutines.channels.b0) this.f62296c;
                this.f62297d.setOnMyLocationClickListener(new GoogleMap.OnMyLocationClickListener() { // from class: com.google.maps.android.ktx.y
                    @Override // com.google.android.gms.maps.GoogleMap.OnMyLocationClickListener
                    public final void onMyLocationClick(Location location) {
                        g.t.m(kotlinx.coroutines.channels.b0.this, location);
                    }
                });
                a aVar2 = new a(this.f62297d);
                this.f62295b = 1;
                if (kotlinx.coroutines.channels.z.a(b0Var, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("ࡶ\u0001"));
                }
                a1.n(obj);
            }
            return k2.f75408a;
        }
    }

    /* compiled from: GoogleMap.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.maps.android.ktx.GoogleMapKt$poiClickEvents$1", f = "GoogleMap.kt", i = {}, l = {423}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/b0;", "Lcom/google/android/gms/maps/model/PointOfInterest;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/channels/b0;)V"}, k = 3, mv = {1, 8, 0})
    static final class u extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.channels.b0<? super PointOfInterest>, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f62299b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f62300c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ GoogleMap f62301d;

        /* compiled from: GoogleMap.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.a<k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ GoogleMap f62302b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(GoogleMap googleMap) {
                super(0);
                this.f62302b = googleMap;
            }

            public final void a() {
                this.f62302b.setOnPoiClickListener(null);
            }

            @Override // ld.a
            public /* bridge */ /* synthetic */ k2 invoke() {
                a();
                return k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(GoogleMap googleMap, kotlin.coroutines.d<? super u> dVar) {
            super(2, dVar);
            this.f62301d = googleMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void m(kotlinx.coroutines.channels.b0 b0Var, PointOfInterest pointOfInterest) {
            kotlin.jvm.internal.l0.o(pointOfInterest, ProtectedSandApp.s("ࡷ\u0001"));
            b0Var.M(pointOfInterest);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            u uVar = new u(this.f62301d, dVar);
            uVar.f62300c = obj;
            return uVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l kotlinx.coroutines.channels.b0<? super PointOfInterest> b0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((u) create(b0Var, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f62299b;
            if (i4 == 0) {
                a1.n(obj);
                final kotlinx.coroutines.channels.b0 b0Var = (kotlinx.coroutines.channels.b0) this.f62300c;
                this.f62301d.setOnPoiClickListener(new GoogleMap.OnPoiClickListener() { // from class: com.google.maps.android.ktx.z
                    @Override // com.google.android.gms.maps.GoogleMap.OnPoiClickListener
                    public final void onPoiClick(PointOfInterest pointOfInterest) {
                        g.u.m(kotlinx.coroutines.channels.b0.this, pointOfInterest);
                    }
                });
                a aVar2 = new a(this.f62301d);
                this.f62299b = 1;
                if (kotlinx.coroutines.channels.z.a(b0Var, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("ࡸ\u0001"));
                }
                a1.n(obj);
            }
            return k2.f75408a;
        }
    }

    /* compiled from: GoogleMap.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.maps.android.ktx.GoogleMapKt$polygonClickEvents$1", f = "GoogleMap.kt", i = {}, l = {437}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/b0;", "Lcom/google/android/gms/maps/model/Polygon;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/channels/b0;)V"}, k = 3, mv = {1, 8, 0})
    static final class v extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.channels.b0<? super Polygon>, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f62303b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f62304c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ GoogleMap f62305d;

        /* compiled from: GoogleMap.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.a<k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ GoogleMap f62306b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(GoogleMap googleMap) {
                super(0);
                this.f62306b = googleMap;
            }

            public final void a() {
                this.f62306b.setOnPolygonClickListener(null);
            }

            @Override // ld.a
            public /* bridge */ /* synthetic */ k2 invoke() {
                a();
                return k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(GoogleMap googleMap, kotlin.coroutines.d<? super v> dVar) {
            super(2, dVar);
            this.f62305d = googleMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void m(kotlinx.coroutines.channels.b0 b0Var, Polygon polygon) {
            kotlin.jvm.internal.l0.o(polygon, ProtectedSandApp.s("ࡹ\u0001"));
            b0Var.M(polygon);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            v vVar = new v(this.f62305d, dVar);
            vVar.f62304c = obj;
            return vVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l kotlinx.coroutines.channels.b0<? super Polygon> b0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((v) create(b0Var, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f62303b;
            if (i4 == 0) {
                a1.n(obj);
                final kotlinx.coroutines.channels.b0 b0Var = (kotlinx.coroutines.channels.b0) this.f62304c;
                this.f62305d.setOnPolygonClickListener(new GoogleMap.OnPolygonClickListener() { // from class: com.google.maps.android.ktx.a0
                    @Override // com.google.android.gms.maps.GoogleMap.OnPolygonClickListener
                    public final void onPolygonClick(Polygon polygon) {
                        g.v.m(kotlinx.coroutines.channels.b0.this, polygon);
                    }
                });
                a aVar2 = new a(this.f62305d);
                this.f62303b = 1;
                if (kotlinx.coroutines.channels.z.a(b0Var, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("ࡺ\u0001"));
                }
                a1.n(obj);
            }
            return k2.f75408a;
        }
    }

    /* compiled from: GoogleMap.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.maps.android.ktx.GoogleMapKt$polylineClickEvents$1", f = "GoogleMap.kt", i = {}, l = {451}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/b0;", "Lcom/google/android/gms/maps/model/Polyline;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/channels/b0;)V"}, k = 3, mv = {1, 8, 0})
    static final class w extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.channels.b0<? super Polyline>, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f62307b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f62308c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ GoogleMap f62309d;

        /* compiled from: GoogleMap.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.a<k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ GoogleMap f62310b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(GoogleMap googleMap) {
                super(0);
                this.f62310b = googleMap;
            }

            public final void a() {
                this.f62310b.setOnPolylineClickListener(null);
            }

            @Override // ld.a
            public /* bridge */ /* synthetic */ k2 invoke() {
                a();
                return k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(GoogleMap googleMap, kotlin.coroutines.d<? super w> dVar) {
            super(2, dVar);
            this.f62309d = googleMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void m(kotlinx.coroutines.channels.b0 b0Var, Polyline polyline) {
            kotlin.jvm.internal.l0.o(polyline, ProtectedSandApp.s("ࡻ\u0001"));
            b0Var.M(polyline);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            w wVar = new w(this.f62309d, dVar);
            wVar.f62308c = obj;
            return wVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l kotlinx.coroutines.channels.b0<? super Polyline> b0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((w) create(b0Var, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f62307b;
            if (i4 == 0) {
                a1.n(obj);
                final kotlinx.coroutines.channels.b0 b0Var = (kotlinx.coroutines.channels.b0) this.f62308c;
                this.f62309d.setOnPolylineClickListener(new GoogleMap.OnPolylineClickListener() { // from class: com.google.maps.android.ktx.b0
                    @Override // com.google.android.gms.maps.GoogleMap.OnPolylineClickListener
                    public final void onPolylineClick(Polyline polyline) {
                        g.w.m(kotlinx.coroutines.channels.b0.this, polyline);
                    }
                });
                a aVar2 = new a(this.f62309d);
                this.f62307b = 1;
                if (kotlinx.coroutines.channels.z.a(b0Var, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("ࡼ\u0001"));
                }
                a1.n(obj);
            }
            return k2.f75408a;
        }
    }

    @fg.l
    public static final kotlinx.coroutines.flow.i<LatLng> A(@fg.l GoogleMap googleMap) {
        kotlin.jvm.internal.l0.p(googleMap, ProtectedSandApp.s("ࡾ\u0001"));
        return kotlinx.coroutines.flow.k.s(new o(googleMap, null));
    }

    @fg.l
    public static final kotlinx.coroutines.flow.i<LatLng> B(@fg.l GoogleMap googleMap) {
        kotlin.jvm.internal.l0.p(googleMap, ProtectedSandApp.s("ࡾ\u0001"));
        return kotlinx.coroutines.flow.k.s(new p(googleMap, null));
    }

    @fg.l
    public static final kotlinx.coroutines.flow.i<Marker> C(@fg.l GoogleMap googleMap) {
        kotlin.jvm.internal.l0.p(googleMap, ProtectedSandApp.s("ࡾ\u0001"));
        return kotlinx.coroutines.flow.k.s(new q(googleMap, null));
    }

    @fg.l
    public static final kotlinx.coroutines.flow.i<m0> D(@fg.l GoogleMap googleMap) {
        kotlin.jvm.internal.l0.p(googleMap, ProtectedSandApp.s("ࡾ\u0001"));
        return kotlinx.coroutines.flow.k.s(new r(googleMap, null));
    }

    @fg.l
    public static final kotlinx.coroutines.flow.i<k2> E(@fg.l GoogleMap googleMap) {
        kotlin.jvm.internal.l0.p(googleMap, ProtectedSandApp.s("ࡾ\u0001"));
        return kotlinx.coroutines.flow.k.s(new s(googleMap, null));
    }

    @fg.l
    public static final kotlinx.coroutines.flow.i<Location> F(@fg.l GoogleMap googleMap) {
        kotlin.jvm.internal.l0.p(googleMap, ProtectedSandApp.s("ࡾ\u0001"));
        return kotlinx.coroutines.flow.k.s(new t(googleMap, null));
    }

    @fg.l
    public static final kotlinx.coroutines.flow.i<PointOfInterest> G(@fg.l GoogleMap googleMap) {
        kotlin.jvm.internal.l0.p(googleMap, ProtectedSandApp.s("ࡾ\u0001"));
        return kotlinx.coroutines.flow.k.s(new u(googleMap, null));
    }

    @fg.l
    public static final kotlinx.coroutines.flow.i<Polygon> H(@fg.l GoogleMap googleMap) {
        kotlin.jvm.internal.l0.p(googleMap, ProtectedSandApp.s("ࡾ\u0001"));
        return kotlinx.coroutines.flow.k.s(new v(googleMap, null));
    }

    @fg.l
    public static final kotlinx.coroutines.flow.i<Polyline> I(@fg.l GoogleMap googleMap) {
        kotlin.jvm.internal.l0.p(googleMap, ProtectedSandApp.s("ࡾ\u0001"));
        return kotlinx.coroutines.flow.k.s(new w(googleMap, null));
    }

    @fg.l
    public static final Circle a(@fg.l GoogleMap googleMap, @fg.l ld.l<? super CircleOptions, k2> lVar) {
        kotlin.jvm.internal.l0.p(googleMap, ProtectedSandApp.s("ࡾ\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("ࡿ\u0001"));
        CircleOptions circleOptions = new CircleOptions();
        lVar.invoke(circleOptions);
        Circle addCircle = googleMap.addCircle(circleOptions);
        kotlin.jvm.internal.l0.o(addCircle, ProtectedSandApp.s("ࢀ\u0001"));
        return addCircle;
    }

    @fg.m
    public static final GroundOverlay b(@fg.l GoogleMap googleMap, @fg.l ld.l<? super GroundOverlayOptions, k2> lVar) {
        kotlin.jvm.internal.l0.p(googleMap, ProtectedSandApp.s("ࡾ\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("ࡿ\u0001"));
        GroundOverlayOptions groundOverlayOptions = new GroundOverlayOptions();
        lVar.invoke(groundOverlayOptions);
        return googleMap.addGroundOverlay(groundOverlayOptions);
    }

    @fg.m
    public static final Marker c(@fg.l GoogleMap googleMap, @fg.l ld.l<? super MarkerOptions, k2> lVar) {
        kotlin.jvm.internal.l0.p(googleMap, ProtectedSandApp.s("ࡾ\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("ࡿ\u0001"));
        MarkerOptions markerOptions = new MarkerOptions();
        lVar.invoke(markerOptions);
        return googleMap.addMarker(markerOptions);
    }

    @fg.l
    public static final Polygon d(@fg.l GoogleMap googleMap, @fg.l ld.l<? super PolygonOptions, k2> lVar) {
        kotlin.jvm.internal.l0.p(googleMap, ProtectedSandApp.s("ࡾ\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("ࡿ\u0001"));
        PolygonOptions polygonOptions = new PolygonOptions();
        lVar.invoke(polygonOptions);
        Polygon addPolygon = googleMap.addPolygon(polygonOptions);
        kotlin.jvm.internal.l0.o(addPolygon, ProtectedSandApp.s("ࢁ\u0001"));
        return addPolygon;
    }

    @fg.l
    public static final Polyline e(@fg.l GoogleMap googleMap, @fg.l ld.l<? super PolylineOptions, k2> lVar) {
        kotlin.jvm.internal.l0.p(googleMap, ProtectedSandApp.s("ࡾ\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("ࡿ\u0001"));
        PolylineOptions polylineOptions = new PolylineOptions();
        lVar.invoke(polylineOptions);
        Polyline addPolyline = googleMap.addPolyline(polylineOptions);
        kotlin.jvm.internal.l0.o(addPolyline, ProtectedSandApp.s("ࢂ\u0001"));
        return addPolyline;
    }

    @fg.m
    public static final TileOverlay f(@fg.l GoogleMap googleMap, @fg.l ld.l<? super TileOverlayOptions, k2> lVar) {
        kotlin.jvm.internal.l0.p(googleMap, ProtectedSandApp.s("ࡾ\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("ࡿ\u0001"));
        TileOverlayOptions tileOverlayOptions = new TileOverlayOptions();
        lVar.invoke(tileOverlayOptions);
        return googleMap.addTileOverlay(tileOverlayOptions);
    }

    @fg.m
    public static final Object g(@fg.l GoogleMap googleMap, @fg.l CameraUpdate cameraUpdate, int i4, @fg.l kotlin.coroutines.d<? super k2> dVar) {
        kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        qVar.e0();
        googleMap.animateCamera(cameraUpdate, i4, new a(qVar));
        Object y4 = qVar.y();
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
        if (y4 == aVar) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y4 == aVar ? y4 : k2.f75408a;
    }

    private static final Object h(GoogleMap googleMap, CameraUpdate cameraUpdate, int i4, kotlin.coroutines.d<? super k2> dVar) {
        kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        qVar.e0();
        googleMap.animateCamera(cameraUpdate, i4, new a(qVar));
        k2 k2Var = k2.f75408a;
        if (qVar.y() == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return k2Var;
    }

    public static Object i(GoogleMap googleMap, CameraUpdate cameraUpdate, int i4, kotlin.coroutines.d dVar, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = 3000;
        }
        kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        qVar.e0();
        googleMap.animateCamera(cameraUpdate, i4, new a(qVar));
        if (qVar.y() == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return k2.f75408a;
    }

    @fg.m
    public static final Object j(@fg.l GoogleMap googleMap, @fg.l kotlin.coroutines.d<? super k2> dVar) {
        kotlin.coroutines.k kVar = new kotlin.coroutines.k(kotlin.coroutines.intrinsics.b.e(dVar));
        googleMap.setOnMapLoadedCallback(new b(kVar));
        Object a5 = kVar.a();
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
        if (a5 == aVar) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return a5 == aVar ? a5 : k2.f75408a;
    }

    private static final Object k(GoogleMap googleMap, kotlin.coroutines.d<? super k2> dVar) {
        kotlin.coroutines.k kVar = new kotlin.coroutines.k(kotlin.coroutines.intrinsics.b.e(dVar));
        googleMap.setOnMapLoadedCallback(new b(kVar));
        k2 k2Var = k2.f75408a;
        if (kVar.a() == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return k2Var;
    }

    @fg.m
    public static final Object l(@fg.l GoogleMap googleMap, @fg.m Bitmap bitmap, @fg.l kotlin.coroutines.d<? super Bitmap> dVar) {
        kotlin.coroutines.k kVar = new kotlin.coroutines.k(kotlin.coroutines.intrinsics.b.e(dVar));
        googleMap.snapshot(new c(kVar), bitmap);
        Object a5 = kVar.a();
        if (a5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return a5;
    }

    private static final Object m(GoogleMap googleMap, Bitmap bitmap, kotlin.coroutines.d<? super Bitmap> dVar) {
        kotlin.coroutines.k kVar = new kotlin.coroutines.k(kotlin.coroutines.intrinsics.b.e(dVar));
        googleMap.snapshot(new c(kVar), bitmap);
        k2 k2Var = k2.f75408a;
        Object a5 = kVar.a();
        if (a5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return a5;
    }

    public static Object n(GoogleMap googleMap, Bitmap bitmap, kotlin.coroutines.d dVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            bitmap = null;
        }
        kotlin.coroutines.k kVar = new kotlin.coroutines.k(kotlin.coroutines.intrinsics.b.e(dVar));
        googleMap.snapshot(new c(kVar), bitmap);
        Object a5 = kVar.a();
        if (a5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return a5;
    }

    @fg.l
    public static final GoogleMapOptions o(@fg.l ld.l<? super GoogleMapOptions, k2> lVar) {
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("ࡿ\u0001"));
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        lVar.invoke(googleMapOptions);
        return googleMapOptions;
    }

    @fg.l
    @kotlin.k(message = "Use cameraIdleEvents(), cameraMoveCanceledEvents(), cameraMoveEvents() or cameraMoveStartedEvents")
    public static final kotlinx.coroutines.flow.i<com.google.maps.android.ktx.b> p(@fg.l GoogleMap googleMap) {
        kotlin.jvm.internal.l0.p(googleMap, ProtectedSandApp.s("ࡾ\u0001"));
        return kotlinx.coroutines.flow.k.s(new d(googleMap, null));
    }

    @fg.l
    public static final kotlinx.coroutines.flow.i<k2> q(@fg.l GoogleMap googleMap) {
        kotlin.jvm.internal.l0.p(googleMap, ProtectedSandApp.s("ࡾ\u0001"));
        return kotlinx.coroutines.flow.k.s(new e(googleMap, null));
    }

    @fg.l
    public static final kotlinx.coroutines.flow.i<k2> r(@fg.l GoogleMap googleMap) {
        kotlin.jvm.internal.l0.p(googleMap, ProtectedSandApp.s("ࡾ\u0001"));
        return kotlinx.coroutines.flow.k.s(new f(googleMap, null));
    }

    @fg.l
    public static final kotlinx.coroutines.flow.i<k2> s(@fg.l GoogleMap googleMap) {
        kotlin.jvm.internal.l0.p(googleMap, ProtectedSandApp.s("ࡾ\u0001"));
        return kotlinx.coroutines.flow.k.s(new C0954g(googleMap, null));
    }

    @fg.l
    public static final kotlinx.coroutines.flow.i<Integer> t(@fg.l GoogleMap googleMap) {
        kotlin.jvm.internal.l0.p(googleMap, ProtectedSandApp.s("ࡾ\u0001"));
        return kotlinx.coroutines.flow.k.s(new h(googleMap, null));
    }

    @fg.l
    public static final kotlinx.coroutines.flow.i<Circle> u(@fg.l GoogleMap googleMap) {
        kotlin.jvm.internal.l0.p(googleMap, ProtectedSandApp.s("ࡾ\u0001"));
        return kotlinx.coroutines.flow.k.s(new i(googleMap, null));
    }

    @fg.l
    public static final kotlinx.coroutines.flow.i<GroundOverlay> v(@fg.l GoogleMap googleMap) {
        kotlin.jvm.internal.l0.p(googleMap, ProtectedSandApp.s("ࡾ\u0001"));
        return kotlinx.coroutines.flow.k.s(new j(googleMap, null));
    }

    @fg.l
    public static final kotlinx.coroutines.flow.i<d0> w(@fg.l GoogleMap googleMap) {
        kotlin.jvm.internal.l0.p(googleMap, ProtectedSandApp.s("ࡾ\u0001"));
        return kotlinx.coroutines.flow.k.s(new k(googleMap, null));
    }

    @fg.l
    public static final kotlinx.coroutines.flow.i<Marker> x(@fg.l GoogleMap googleMap) {
        kotlin.jvm.internal.l0.p(googleMap, ProtectedSandApp.s("ࡾ\u0001"));
        return kotlinx.coroutines.flow.k.s(new l(googleMap, null));
    }

    @fg.l
    public static final kotlinx.coroutines.flow.i<Marker> y(@fg.l GoogleMap googleMap) {
        kotlin.jvm.internal.l0.p(googleMap, ProtectedSandApp.s("ࡾ\u0001"));
        return kotlinx.coroutines.flow.k.s(new m(googleMap, null));
    }

    @fg.l
    public static final kotlinx.coroutines.flow.i<Marker> z(@fg.l GoogleMap googleMap) {
        kotlin.jvm.internal.l0.p(googleMap, ProtectedSandApp.s("ࡾ\u0001"));
        return kotlinx.coroutines.flow.k.s(new n(googleMap, null));
    }
}
