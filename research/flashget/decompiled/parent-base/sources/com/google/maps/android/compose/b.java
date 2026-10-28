package com.google.maps.android.compose;

import androidx.compose.runtime.k2;
import androidx.compose.runtime.t4;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.Projection;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.z0;

/* compiled from: CameraPositionState.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 I2\u00020\u0001:\u0002+0B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ5\u0010\u0013\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\"\u0010\u0017\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0087@¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0019\u0010\u001aR+\u0010#\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b8F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R+\u0010*\u001a\u00020$2\u0006\u0010\u001c\u001a\u00020$8F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b%\u0010\u001e\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R+\u0010/\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00028@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b+\u0010\u001e\u001a\u0004\b,\u0010-\"\u0004\b.\u0010\u0005R\u0014\u00102\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R/\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u000b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b3\u0010\u001e\u001a\u0004\b4\u00105\"\u0004\b6\u0010\u0016R/\u0010;\u001a\u0004\u0018\u00010\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u00068B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b7\u0010\u001e\u001a\u0004\b8\u00109\"\u0004\b:\u0010\nR/\u0010A\u001a\u0004\u0018\u00010\u00012\b\u0010\u001c\u001a\u0004\u0018\u00010\u00018B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b<\u0010\u001e\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u0013\u0010E\u001a\u0004\u0018\u00010B8F¢\u0006\u0006\u001a\u0004\bC\u0010DR$\u0010\u0003\u001a\u00020\u00022\u0006\u0010F\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bG\u0010-\"\u0004\bH\u0010\u0005¨\u0006J"}, d2 = {"Lcom/google/maps/android/compose/b;", "", "Lcom/google/android/gms/maps/model/CameraPosition;", "position", "<init>", "(Lcom/google/android/gms/maps/model/CameraPosition;)V", "Lcom/google/maps/android/compose/b$d;", "callback", "Lkotlin/k2;", "k", "(Lcom/google/maps/android/compose/b$d;)V", "Lcom/google/android/gms/maps/GoogleMap;", "map", "Lcom/google/android/gms/maps/CameraUpdate;", "update", "", "durationMs", "Lkotlinx/coroutines/p;", "continuation", "u", "(Lcom/google/android/gms/maps/GoogleMap;Lcom/google/android/gms/maps/CameraUpdate;ILkotlinx/coroutines/p;)V", "x", "(Lcom/google/android/gms/maps/GoogleMap;)V", "i", "(Lcom/google/android/gms/maps/CameraUpdate;ILkotlin/coroutines/d;)Ljava/lang/Object;", "t", "(Lcom/google/android/gms/maps/CameraUpdate;)V", "", "<set-?>", "a", "Landroidx/compose/runtime/k2;", "s", "()Z", "z", "(Z)V", "isMoving", "Lcom/google/maps/android/compose/a;", "b", "l", "()Lcom/google/maps/android/compose/a;", "v", "(Lcom/google/maps/android/compose/a;)V", "cameraMoveStartedReason", "c", "r", "()Lcom/google/android/gms/maps/model/CameraPosition;", "C", "rawPosition", "d", "Lkotlin/k2;", "lock", "e", "m", "()Lcom/google/android/gms/maps/GoogleMap;", "w", "f", "o", "()Lcom/google/maps/android/compose/b$d;", "A", "onMapChanged", "g", "n", "()Ljava/lang/Object;", "y", "(Ljava/lang/Object;)V", "movementOwner", "Lcom/google/android/gms/maps/Projection;", "q", "()Lcom/google/android/gms/maps/Projection;", "projection", "value", "p", "B", "h", "maps-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 1)
@r1({"SMAP\nCameraPositionState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CameraPositionState.kt\ncom/google/maps/android/compose/CameraPositionState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,322:1\n81#2:323\n107#2,2:324\n81#2:326\n107#2,2:327\n81#2:329\n107#2,2:330\n81#2:332\n107#2,2:333\n81#2:335\n107#2,2:336\n81#2:338\n107#2,2:339\n329#3:341\n314#4,11:342\n*S KotlinDebug\n*F\n+ 1 CameraPositionState.kt\ncom/google/maps/android/compose/CameraPositionState\n*L\n69#1:323\n69#1:324,2\n77#1:326\n77#1:327,2\n95#1:329\n95#1:330,2\n119#1:332\n119#1:333,2\n124#1:335\n124#1:336,2\n138#1:338\n138#1:339,2\n197#1:341\n199#1:342,11\n*E\n"})
/* loaded from: classes6.dex */
public final class b {

    /* renamed from: i, reason: collision with root package name */
    public static final int f61071i = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 isMoving;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 cameraMoveStartedReason;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 rawPosition;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlin.k2 lock;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 map;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 onMapChanged;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 movementOwner;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: j, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.runtime.saveable.l<b, CameraPosition> f61072j = androidx.compose.runtime.saveable.m.a(a.f61080b, C0944b.f61081b);

    /* compiled from: CameraPositionState.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/runtime/saveable/n;", "Lcom/google/maps/android/compose/b;", "it", "Lcom/google/android/gms/maps/model/CameraPosition;", "a", "(Landroidx/compose/runtime/saveable/n;Lcom/google/maps/android/compose/b;)Lcom/google/android/gms/maps/model/CameraPosition;"}, k = 3, mv = {1, 9, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.saveable.n, b, CameraPosition> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f61080b = new a(2);

        a() {
            super(2);
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CameraPosition invoke(@fg.l androidx.compose.runtime.saveable.n nVar, @fg.l b bVar) {
            kotlin.jvm.internal.l0.p(nVar, ProtectedSandApp.s("ڗ\u0001"));
            kotlin.jvm.internal.l0.p(bVar, ProtectedSandApp.s("ژ\u0001"));
            return bVar.r();
        }
    }

    /* compiled from: CameraPositionState.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/google/android/gms/maps/model/CameraPosition;", "it", "Lcom/google/maps/android/compose/b;", "a", "(Lcom/google/android/gms/maps/model/CameraPosition;)Lcom/google/maps/android/compose/b;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.google.maps.android.compose.b$b, reason: collision with other inner class name */
    static final class C0944b extends kotlin.jvm.internal.n0 implements ld.l<CameraPosition, b> {

        /* renamed from: b, reason: collision with root package name */
        public static final C0944b f61081b = new C0944b(1);

        C0944b() {
            super(1);
        }

        @Override // ld.l
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b invoke(@fg.l CameraPosition cameraPosition) {
            kotlin.jvm.internal.l0.p(cameraPosition, ProtectedSandApp.s("ڙ\u0001"));
            return new b(cameraPosition);
        }
    }

    /* compiled from: CameraPositionState.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/google/maps/android/compose/b$c;", "", "<init>", "()V", "Landroidx/compose/runtime/saveable/l;", "Lcom/google/maps/android/compose/b;", "Lcom/google/android/gms/maps/model/CameraPosition;", "Saver", "Landroidx/compose/runtime/saveable/l;", "a", "()Landroidx/compose/runtime/saveable/l;", "maps-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.google.maps.android.compose.b$c, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        public final androidx.compose.runtime.saveable.l<b, CameraPosition> a() {
            return b.f61072j;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: CameraPositionState.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bâ\u0080\u0001\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/google/maps/android/compose/b$d;", "", "Lcom/google/android/gms/maps/GoogleMap;", "newMap", "Lkotlin/k2;", "b", "(Lcom/google/android/gms/maps/GoogleMap;)V", "a", "()V", "maps-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private interface d {

        /* compiled from: CameraPositionState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a {
            public static void a(@fg.l d dVar) {
            }
        }

        void a();

        void b(@fg.m GoogleMap newMap);
    }

    /* compiled from: CameraPositionState.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.maps.android.compose.CameraPositionState", f = "CameraPositionState.kt", i = {0, 0, 0, 0}, l = {324}, m = "animate", n = {"this", "update", "myJob", "durationMs"}, s = {"L$0", "L$1", "L$2", "I$0"})
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f61082b;

        /* renamed from: c, reason: collision with root package name */
        Object f61083c;

        /* renamed from: d, reason: collision with root package name */
        Object f61084d;

        /* renamed from: e, reason: collision with root package name */
        int f61085e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f61086f;

        /* renamed from: h, reason: collision with root package name */
        int f61088h;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f61086f = obj;
            this.f61088h |= Integer.MIN_VALUE;
            return b.this.i(null, 0, this);
        }
    }

    /* compiled from: CameraPositionState.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/k2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    static final class f extends kotlin.jvm.internal.n0 implements ld.l<Throwable, kotlin.k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ g f61090c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(g gVar) {
            super(1);
            this.f61090c = gVar;
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(Throwable th) {
            invoke2(th);
            return kotlin.k2.f75408a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@fg.m Throwable th) {
            b.this.lock;
            kotlin.k2 k2Var = kotlin.k2.f75408a;
            b bVar = b.this;
            g gVar = this.f61090c;
            synchronized (k2Var) {
                if (bVar.o() == gVar) {
                    bVar.A(null);
                }
            }
        }
    }

    /* compiled from: CameraPositionState.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/google/maps/android/compose/b$g", "Lcom/google/maps/android/compose/b$d;", "Lcom/google/android/gms/maps/GoogleMap;", "newMap", "Lkotlin/k2;", "b", "(Lcom/google/android/gms/maps/GoogleMap;)V", "a", "()V", "maps-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class g implements d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.p<kotlin.k2> f61091a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f61092b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ CameraUpdate f61093c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f61094d;

        /* JADX WARN: Multi-variable type inference failed */
        g(kotlinx.coroutines.p<? super kotlin.k2> pVar, b bVar, CameraUpdate cameraUpdate, int i4) {
            this.f61091a = pVar;
            this.f61092b = bVar;
            this.f61093c = cameraUpdate;
            this.f61094d = i4;
        }

        @Override // com.google.maps.android.compose.b.d
        public void a() {
            kotlinx.coroutines.p<kotlin.k2> pVar = this.f61091a;
            z0.Companion companion = kotlin.z0.INSTANCE;
            pVar.resumeWith(kotlin.a1.a(new CancellationException(ProtectedSandApp.s("ښ\u0001"))));
        }

        @Override // com.google.maps.android.compose.b.d
        public void b(@fg.m GoogleMap newMap) {
            if (newMap != null) {
                this.f61092b.u(newMap, this.f61093c, this.f61094d, this.f61091a);
                return;
            }
            kotlinx.coroutines.p<kotlin.k2> pVar = this.f61091a;
            z0.Companion companion = kotlin.z0.INSTANCE;
            pVar.resumeWith(kotlin.a1.a(new CancellationException(ProtectedSandApp.s("ڛ\u0001"))));
            throw new IllegalStateException(ProtectedSandApp.s("ڜ\u0001"));
        }
    }

    /* compiled from: CameraPositionState.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/google/android/gms/maps/GoogleMap;", "it", "Lkotlin/k2;", "b", "(Lcom/google/android/gms/maps/GoogleMap;)V"}, k = 3, mv = {1, 9, 0})
    static final class h implements d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CameraUpdate f61095a;

        h(CameraUpdate cameraUpdate) {
            this.f61095a = cameraUpdate;
        }

        @Override // com.google.maps.android.compose.b.d
        public void a() {
        }

        @Override // com.google.maps.android.compose.b.d
        public final void b(@fg.m GoogleMap googleMap) {
            if (googleMap != null) {
                googleMap.moveCamera(this.f61095a);
            }
        }
    }

    /* compiled from: CameraPositionState.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/google/android/gms/maps/GoogleMap;", "it", "Lkotlin/k2;", "b", "(Lcom/google/android/gms/maps/GoogleMap;)V"}, k = 3, mv = {1, 9, 0})
    static final class i implements d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ GoogleMap f61096a;

        i(GoogleMap googleMap) {
            this.f61096a = googleMap;
        }

        @Override // com.google.maps.android.compose.b.d
        public void a() {
        }

        @Override // com.google.maps.android.compose.b.d
        public final void b(@fg.m GoogleMap googleMap) {
            if (googleMap != null) {
                throw new IllegalStateException(ProtectedSandApp.s("ڝ\u0001"));
            }
            this.f61096a.stopAnimation();
        }
    }

    /* compiled from: CameraPositionState.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"com/google/maps/android/compose/b$j", "Lcom/google/android/gms/maps/GoogleMap$CancelableCallback;", "Lkotlin/k2;", "onCancel", "()V", "onFinish", "maps-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class j implements GoogleMap.CancelableCallback {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.p<kotlin.k2> f61097a;

        /* JADX WARN: Multi-variable type inference failed */
        j(kotlinx.coroutines.p<? super kotlin.k2> pVar) {
            this.f61097a = pVar;
        }

        @Override // com.google.android.gms.maps.GoogleMap.CancelableCallback
        public void onCancel() {
            kotlinx.coroutines.p<kotlin.k2> pVar = this.f61097a;
            z0.Companion companion = kotlin.z0.INSTANCE;
            pVar.resumeWith(kotlin.a1.a(new CancellationException(ProtectedSandApp.s("ڞ\u0001"))));
        }

        @Override // com.google.android.gms.maps.GoogleMap.CancelableCallback
        public void onFinish() {
            kotlinx.coroutines.p<kotlin.k2> pVar = this.f61097a;
            z0.Companion companion = kotlin.z0.INSTANCE;
            pVar.resumeWith(kotlin.k2.f75408a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A(d dVar) {
        this.onMapChanged.setValue(dVar);
    }

    public static /* synthetic */ Object j(b bVar, CameraUpdate cameraUpdate, int i4, kotlin.coroutines.d dVar, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        return bVar.i(cameraUpdate, i4, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(d callback) {
        d o4 = o();
        if (o4 != null) {
            o4.a();
        }
        A(callback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final GoogleMap m() {
        return (GoogleMap) this.map.getValue();
    }

    private final Object n() {
        return this.movementOwner.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d o() {
        return (d) this.onMapChanged.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(GoogleMap map, CameraUpdate update, int durationMs, kotlinx.coroutines.p<? super kotlin.k2> continuation) {
        j jVar = new j(continuation);
        if (durationMs == Integer.MAX_VALUE) {
            map.animateCamera(update, jVar);
        } else {
            map.animateCamera(update, durationMs, jVar);
        }
        k(new i(map));
    }

    private final void w(GoogleMap googleMap) {
        this.map.setValue(googleMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(Object obj) {
        this.movementOwner.setValue(obj);
    }

    public final void B(@fg.l CameraPosition cameraPosition) {
        kotlin.jvm.internal.l0.p(cameraPosition, ProtectedSandApp.s("ڲ\u0001"));
        synchronized (this.lock) {
            try {
                GoogleMap m4 = m();
                if (m4 == null) {
                    C(cameraPosition);
                } else {
                    m4.moveCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
                }
                kotlin.k2 k2Var = kotlin.k2.f75408a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void C(@fg.l CameraPosition cameraPosition) {
        kotlin.jvm.internal.l0.p(cameraPosition, ProtectedSandApp.s("ڳ\u0001"));
        this.rawPosition.setValue(cameraPosition);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @fg.m
    @androidx.annotation.l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(@fg.l com.google.android.gms.maps.CameraUpdate r8, int r9, @fg.l kotlin.coroutines.d<? super kotlin.k2> r10) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.maps.android.compose.b.i(com.google.android.gms.maps.CameraUpdate, int, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @fg.l
    public final com.google.maps.android.compose.a l() {
        return (com.google.maps.android.compose.a) this.cameraMoveStartedReason.getValue();
    }

    @fg.l
    public final CameraPosition p() {
        return r();
    }

    @fg.m
    public final Projection q() {
        GoogleMap m4 = m();
        if (m4 != null) {
            return m4.getProjection();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @fg.l
    public final CameraPosition r() {
        return (CameraPosition) this.rawPosition.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean s() {
        return ((Boolean) this.isMoving.getValue()).booleanValue();
    }

    @androidx.annotation.l1
    public final void t(@fg.l CameraUpdate update) {
        kotlin.jvm.internal.l0.p(update, ProtectedSandApp.s("ڵ\u0001"));
        synchronized (this.lock) {
            try {
                GoogleMap m4 = m();
                y(null);
                if (m4 == null) {
                    k(new h(update));
                } else {
                    m4.moveCamera(update);
                }
                kotlin.k2 k2Var = kotlin.k2.f75408a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void v(@fg.l com.google.maps.android.compose.a aVar) {
        kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("ڳ\u0001"));
        this.cameraMoveStartedReason.setValue(aVar);
    }

    public final void x(@fg.m GoogleMap map) {
        synchronized (this.lock) {
            try {
                if (m() == null && map == null) {
                    return;
                }
                if (m() != null && map != null) {
                    throw new IllegalStateException(ProtectedSandApp.s("ڶ\u0001"));
                }
                w(map);
                if (map == null) {
                    z(false);
                } else {
                    map.moveCamera(CameraUpdateFactory.newCameraPosition(r()));
                }
                d o4 = o();
                if (o4 != null) {
                    A(null);
                    o4.b(map);
                    kotlin.k2 k2Var = kotlin.k2.f75408a;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void z(boolean z4) {
        this.isMoving.setValue(Boolean.valueOf(z4));
    }

    public b(@fg.l CameraPosition cameraPosition) {
        k2 g4;
        k2 g5;
        k2 g6;
        k2 g7;
        k2 g10;
        k2 g11;
        kotlin.jvm.internal.l0.p(cameraPosition, ProtectedSandApp.s("ڱ\u0001"));
        g4 = t4.g(Boolean.FALSE, null, 2, null);
        this.isMoving = g4;
        g5 = t4.g(com.google.maps.android.compose.a.NO_MOVEMENT_YET, null, 2, null);
        this.cameraMoveStartedReason = g5;
        g6 = t4.g(cameraPosition, null, 2, null);
        this.rawPosition = g6;
        this.lock = kotlin.k2.f75408a;
        g7 = t4.g(null, null, 2, null);
        this.map = g7;
        g10 = t4.g(null, null, 2, null);
        this.onMapChanged = g10;
        g11 = t4.g(null, null, 2, null);
        this.movementOwner = g11;
    }

    public /* synthetic */ b(CameraPosition cameraPosition, int i4, kotlin.jvm.internal.w wVar) {
        this((i4 & 1) != 0 ? new CameraPosition(new LatLng(com.google.firebase.remoteconfig.p.f60679p, com.google.firebase.remoteconfig.p.f60679p), 0.0f, 0.0f, 0.0f) : cameraPosition);
    }
}
