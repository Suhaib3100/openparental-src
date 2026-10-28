package com.google.maps.android.ktx;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback;
import com.google.android.gms.maps.StreetViewPanorama;
import com.google.android.gms.maps.StreetViewPanoramaView;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;
import com.google.maps.android.ktx.p0;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlin.z0;

/* compiled from: StreetViewPanoramaView.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086Hø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0004*\u00020\u0001¢\u0006\u0004\b\t\u0010\u0007\u001a\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0004*\u00020\u0001¢\u0006\u0004\b\u000b\u0010\u0007\u001a\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u0004*\u00020\u0001¢\u0006\u0004\b\f\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcom/google/android/gms/maps/StreetViewPanoramaView;", "Lcom/google/android/gms/maps/StreetViewPanorama;", "a", "(Lcom/google/android/gms/maps/StreetViewPanoramaView;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/i;", "Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera;", "c", "(Lcom/google/android/gms/maps/StreetViewPanorama;)Lkotlinx/coroutines/flow/i;", "Lcom/google/android/gms/maps/model/StreetViewPanoramaLocation;", "d", "Lcom/google/android/gms/maps/model/StreetViewPanoramaOrientation;", "e", "f", "maps-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class p0 {

    /* compiled from: StreetViewPanoramaView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/google/android/gms/maps/StreetViewPanorama;", "it", "Lkotlin/k2;", "onStreetViewPanoramaReady", "(Lcom/google/android/gms/maps/StreetViewPanorama;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nStreetViewPanoramaView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StreetViewPanoramaView.kt\ncom/google/maps/android/ktx/StreetViewPanoramaViewKt$awaitStreetViewPanorama$2$1\n*L\n1#1,87:1\n*E\n"})
    public static final class a implements OnStreetViewPanoramaReadyCallback {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.coroutines.d<StreetViewPanorama> f62555a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(kotlin.coroutines.d<? super StreetViewPanorama> dVar) {
            this.f62555a = dVar;
        }

        @Override // com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback
        public final void onStreetViewPanoramaReady(@fg.l StreetViewPanorama streetViewPanorama) {
            kotlin.jvm.internal.l0.p(streetViewPanorama, ProtectedSandApp.s("ࢊ\u0001"));
            kotlin.coroutines.d<StreetViewPanorama> dVar = this.f62555a;
            z0.Companion companion = z0.INSTANCE;
            dVar.resumeWith(streetViewPanorama);
        }
    }

    /* compiled from: StreetViewPanoramaView.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.maps.android.ktx.StreetViewPanoramaViewKt$cameraChangeEvents$1", f = "StreetViewPanoramaView.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/b0;", "Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/channels/b0;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.channels.b0<? super StreetViewPanoramaCamera>, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f62556b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f62557c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ StreetViewPanorama f62558d;

        /* compiled from: StreetViewPanoramaView.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.a<k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ StreetViewPanorama f62559b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(StreetViewPanorama streetViewPanorama) {
                super(0);
                this.f62559b = streetViewPanorama;
            }

            public final void a() {
                this.f62559b.setOnStreetViewPanoramaCameraChangeListener(null);
            }

            @Override // ld.a
            public /* bridge */ /* synthetic */ k2 invoke() {
                a();
                return k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(StreetViewPanorama streetViewPanorama, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f62558d = streetViewPanorama;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void m(kotlinx.coroutines.channels.b0 b0Var, StreetViewPanoramaCamera streetViewPanoramaCamera) {
            kotlin.jvm.internal.l0.o(streetViewPanoramaCamera, ProtectedSandApp.s("ࢋ\u0001"));
            b0Var.M(streetViewPanoramaCamera);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.f62558d, dVar);
            bVar.f62557c = obj;
            return bVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l kotlinx.coroutines.channels.b0<? super StreetViewPanoramaCamera> b0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f62556b;
            if (i4 == 0) {
                a1.n(obj);
                final kotlinx.coroutines.channels.b0 b0Var = (kotlinx.coroutines.channels.b0) this.f62557c;
                this.f62558d.setOnStreetViewPanoramaCameraChangeListener(new StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener() { // from class: com.google.maps.android.ktx.q0
                    @Override // com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener
                    public final void onStreetViewPanoramaCameraChange(StreetViewPanoramaCamera streetViewPanoramaCamera) {
                        p0.b.m(kotlinx.coroutines.channels.b0.this, streetViewPanoramaCamera);
                    }
                });
                a aVar2 = new a(this.f62558d);
                this.f62556b = 1;
                if (kotlinx.coroutines.channels.z.a(b0Var, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("ࢌ\u0001"));
                }
                a1.n(obj);
            }
            return k2.f75408a;
        }
    }

    /* compiled from: StreetViewPanoramaView.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.maps.android.ktx.StreetViewPanoramaViewKt$changeEvents$1", f = "StreetViewPanoramaView.kt", i = {}, l = {54}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/b0;", "Lcom/google/android/gms/maps/model/StreetViewPanoramaLocation;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/channels/b0;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.channels.b0<? super StreetViewPanoramaLocation>, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f62560b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f62561c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ StreetViewPanorama f62562d;

        /* compiled from: StreetViewPanoramaView.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.a<k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ StreetViewPanorama f62563b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(StreetViewPanorama streetViewPanorama) {
                super(0);
                this.f62563b = streetViewPanorama;
            }

            public final void a() {
                this.f62563b.setOnStreetViewPanoramaChangeListener(null);
            }

            @Override // ld.a
            public /* bridge */ /* synthetic */ k2 invoke() {
                a();
                return k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(StreetViewPanorama streetViewPanorama, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f62562d = streetViewPanorama;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void m(kotlinx.coroutines.channels.b0 b0Var, StreetViewPanoramaLocation streetViewPanoramaLocation) {
            kotlin.jvm.internal.l0.o(streetViewPanoramaLocation, ProtectedSandApp.s("ࢍ\u0001"));
            b0Var.M(streetViewPanoramaLocation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            c cVar = new c(this.f62562d, dVar);
            cVar.f62561c = obj;
            return cVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l kotlinx.coroutines.channels.b0<? super StreetViewPanoramaLocation> b0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f62560b;
            if (i4 == 0) {
                a1.n(obj);
                final kotlinx.coroutines.channels.b0 b0Var = (kotlinx.coroutines.channels.b0) this.f62561c;
                this.f62562d.setOnStreetViewPanoramaChangeListener(new StreetViewPanorama.OnStreetViewPanoramaChangeListener() { // from class: com.google.maps.android.ktx.r0
                    @Override // com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener
                    public final void onStreetViewPanoramaChange(StreetViewPanoramaLocation streetViewPanoramaLocation) {
                        p0.c.m(kotlinx.coroutines.channels.b0.this, streetViewPanoramaLocation);
                    }
                });
                a aVar2 = new a(this.f62562d);
                this.f62560b = 1;
                if (kotlinx.coroutines.channels.z.a(b0Var, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("ࢎ\u0001"));
                }
                a1.n(obj);
            }
            return k2.f75408a;
        }
    }

    /* compiled from: StreetViewPanoramaView.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.maps.android.ktx.StreetViewPanoramaViewKt$clickEvents$1", f = "StreetViewPanoramaView.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/b0;", "Lcom/google/android/gms/maps/model/StreetViewPanoramaOrientation;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/channels/b0;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.channels.b0<? super StreetViewPanoramaOrientation>, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f62564b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f62565c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ StreetViewPanorama f62566d;

        /* compiled from: StreetViewPanoramaView.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.a<k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ StreetViewPanorama f62567b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(StreetViewPanorama streetViewPanorama) {
                super(0);
                this.f62567b = streetViewPanorama;
            }

            public final void a() {
                this.f62567b.setOnStreetViewPanoramaClickListener(null);
            }

            @Override // ld.a
            public /* bridge */ /* synthetic */ k2 invoke() {
                a();
                return k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(StreetViewPanorama streetViewPanorama, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f62566d = streetViewPanorama;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void m(kotlinx.coroutines.channels.b0 b0Var, StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
            kotlin.jvm.internal.l0.o(streetViewPanoramaOrientation, ProtectedSandApp.s("\u088f\u0001"));
            b0Var.M(streetViewPanoramaOrientation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            d dVar2 = new d(this.f62566d, dVar);
            dVar2.f62565c = obj;
            return dVar2;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l kotlinx.coroutines.channels.b0<? super StreetViewPanoramaOrientation> b0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f62564b;
            if (i4 == 0) {
                a1.n(obj);
                final kotlinx.coroutines.channels.b0 b0Var = (kotlinx.coroutines.channels.b0) this.f62565c;
                this.f62566d.setOnStreetViewPanoramaClickListener(new StreetViewPanorama.OnStreetViewPanoramaClickListener() { // from class: com.google.maps.android.ktx.s0
                    @Override // com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener
                    public final void onStreetViewPanoramaClick(StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
                        p0.d.m(kotlinx.coroutines.channels.b0.this, streetViewPanoramaOrientation);
                    }
                });
                a aVar2 = new a(this.f62566d);
                this.f62564b = 1;
                if (kotlinx.coroutines.channels.z.a(b0Var, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("\u0890\u0001"));
                }
                a1.n(obj);
            }
            return k2.f75408a;
        }
    }

    /* compiled from: StreetViewPanoramaView.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.maps.android.ktx.StreetViewPanoramaViewKt$longClickEvents$1", f = "StreetViewPanoramaView.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/b0;", "Lcom/google/android/gms/maps/model/StreetViewPanoramaOrientation;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/channels/b0;)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.channels.b0<? super StreetViewPanoramaOrientation>, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f62568b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f62569c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ StreetViewPanorama f62570d;

        /* compiled from: StreetViewPanoramaView.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.a<k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ StreetViewPanorama f62571b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(StreetViewPanorama streetViewPanorama) {
                super(0);
                this.f62571b = streetViewPanorama;
            }

            public final void a() {
                this.f62571b.setOnStreetViewPanoramaLongClickListener(null);
            }

            @Override // ld.a
            public /* bridge */ /* synthetic */ k2 invoke() {
                a();
                return k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(StreetViewPanorama streetViewPanorama, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f62570d = streetViewPanorama;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void m(kotlinx.coroutines.channels.b0 b0Var, StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
            kotlin.jvm.internal.l0.o(streetViewPanoramaOrientation, ProtectedSandApp.s("\u0891\u0001"));
            b0Var.M(streetViewPanoramaOrientation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            e eVar = new e(this.f62570d, dVar);
            eVar.f62569c = obj;
            return eVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l kotlinx.coroutines.channels.b0<? super StreetViewPanoramaOrientation> b0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f62568b;
            if (i4 == 0) {
                a1.n(obj);
                final kotlinx.coroutines.channels.b0 b0Var = (kotlinx.coroutines.channels.b0) this.f62569c;
                this.f62570d.setOnStreetViewPanoramaLongClickListener(new StreetViewPanorama.OnStreetViewPanoramaLongClickListener() { // from class: com.google.maps.android.ktx.t0
                    @Override // com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener
                    public final void onStreetViewPanoramaLongClick(StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
                        p0.e.m(kotlinx.coroutines.channels.b0.this, streetViewPanoramaOrientation);
                    }
                });
                a aVar2 = new a(this.f62570d);
                this.f62568b = 1;
                if (kotlinx.coroutines.channels.z.a(b0Var, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("\u0892\u0001"));
                }
                a1.n(obj);
            }
            return k2.f75408a;
        }
    }

    @fg.m
    public static final Object a(@fg.l StreetViewPanoramaView streetViewPanoramaView, @fg.l kotlin.coroutines.d<? super StreetViewPanorama> dVar) {
        kotlin.coroutines.k kVar = new kotlin.coroutines.k(kotlin.coroutines.intrinsics.b.e(dVar));
        streetViewPanoramaView.getStreetViewPanoramaAsync(new a(kVar));
        Object a5 = kVar.a();
        if (a5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return a5;
    }

    private static final Object b(StreetViewPanoramaView streetViewPanoramaView, kotlin.coroutines.d<? super StreetViewPanorama> dVar) {
        kotlin.coroutines.k kVar = new kotlin.coroutines.k(kotlin.coroutines.intrinsics.b.e(dVar));
        streetViewPanoramaView.getStreetViewPanoramaAsync(new a(kVar));
        k2 k2Var = k2.f75408a;
        Object a5 = kVar.a();
        if (a5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return a5;
    }

    @fg.l
    public static final kotlinx.coroutines.flow.i<StreetViewPanoramaCamera> c(@fg.l StreetViewPanorama streetViewPanorama) {
        kotlin.jvm.internal.l0.p(streetViewPanorama, ProtectedSandApp.s("\u0893\u0001"));
        return kotlinx.coroutines.flow.k.s(new b(streetViewPanorama, null));
    }

    @fg.l
    public static final kotlinx.coroutines.flow.i<StreetViewPanoramaLocation> d(@fg.l StreetViewPanorama streetViewPanorama) {
        kotlin.jvm.internal.l0.p(streetViewPanorama, ProtectedSandApp.s("\u0893\u0001"));
        return kotlinx.coroutines.flow.k.s(new c(streetViewPanorama, null));
    }

    @fg.l
    public static final kotlinx.coroutines.flow.i<StreetViewPanoramaOrientation> e(@fg.l StreetViewPanorama streetViewPanorama) {
        kotlin.jvm.internal.l0.p(streetViewPanorama, ProtectedSandApp.s("\u0893\u0001"));
        return kotlinx.coroutines.flow.k.s(new d(streetViewPanorama, null));
    }

    @fg.l
    public static final kotlinx.coroutines.flow.i<StreetViewPanoramaOrientation> f(@fg.l StreetViewPanorama streetViewPanorama) {
        kotlin.jvm.internal.l0.p(streetViewPanorama, ProtectedSandApp.s("\u0893\u0001"));
        return kotlinx.coroutines.flow.k.s(new e(streetViewPanorama, null));
    }
}
