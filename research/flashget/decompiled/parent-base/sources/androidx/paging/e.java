package androidx.paging;

import androidx.paging.c;
import kotlin.Metadata;
import kotlin.k2;
import kotlinx.coroutines.flow.t;

/* compiled from: CachedPagingData.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a=\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001aI\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"", "T", "Lkotlinx/coroutines/flow/i;", "Landroidx/paging/y0;", "Lkotlinx/coroutines/r0;", "scope", "a", "(Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/r0;)Lkotlinx/coroutines/flow/i;", "Landroidx/paging/c;", "tracker", "b", "(Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/r0;Landroidx/paging/c;)Lkotlinx/coroutines/flow/i;", "paging-common"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class e {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/k2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx/coroutines/flow/a0$f", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a<T> implements kotlinx.coroutines.flow.i<y0<T>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f31641b;

        /* compiled from: Collect.kt */
        @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0006"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/j;", "value", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx/coroutines/flow/a0$f$b", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
        /* renamed from: androidx.paging.e$a$a, reason: collision with other inner class name */
        public static final class C0534a implements kotlinx.coroutines.flow.j<h0<T>> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.j f31642b;

            @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1$2", f = "CachedPagingData.kt", i = {}, l = {137}, m = "emit", n = {}, s = {})
            @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
            /* renamed from: androidx.paging.e$a$a$a, reason: collision with other inner class name */
            public static final class C0535a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: b, reason: collision with root package name */
                /* synthetic */ Object f31643b;

                /* renamed from: c, reason: collision with root package name */
                int f31644c;

                /* renamed from: d, reason: collision with root package name */
                Object f31645d;

                public C0535a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                public final Object invokeSuspend(@fg.l Object obj) {
                    this.f31643b = obj;
                    this.f31644c |= Integer.MIN_VALUE;
                    return C0534a.this.emit(null, this);
                }
            }

            public C0534a(kotlinx.coroutines.flow.j jVar) {
                this.f31642b = jVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            @Override // kotlinx.coroutines.flow.j
            @fg.m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.lang.Object emit(java.lang.Object r5, @fg.l kotlin.coroutines.d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof androidx.paging.e.a.C0534a.C0535a
                    if (r0 == 0) goto L13
                    r0 = r6
                    androidx.paging.e$a$a$a r0 = (androidx.paging.e.a.C0534a.C0535a) r0
                    int r1 = r0.f31644c
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f31644c = r1
                    goto L18
                L13:
                    androidx.paging.e$a$a$a r0 = new androidx.paging.e$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f31643b
                    kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                    int r2 = r0.f31644c
                    r3 = 1
                    if (r2 == 0) goto L2f
                    if (r2 != r3) goto L27
                    kotlin.a1.n(r6)
                    goto L43
                L27:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L2f:
                    kotlin.a1.n(r6)
                    kotlinx.coroutines.flow.j r6 = r4.f31642b
                    androidx.paging.h0 r5 = (androidx.paging.h0) r5
                    androidx.paging.y0 r5 = r5.a()
                    r0.f31644c = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L43
                    return r1
                L43:
                    kotlin.k2 r5 = kotlin.k2.f75408a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.e.a.C0534a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        public a(kotlinx.coroutines.flow.i iVar) {
            this.f31641b = iVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @fg.m
        public Object a(@fg.l kotlinx.coroutines.flow.j jVar, @fg.l kotlin.coroutines.d dVar) {
            Object a5 = this.f31641b.a(new C0534a(jVar), dVar);
            return a5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? a5 : k2.f75408a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: FlowExt.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.CachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1", f = "CachedPagingData.kt", i = {}, l = {222}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/k2;", "androidx/paging/s$c", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b<T> extends kotlin.coroutines.jvm.internal.o implements ld.q<kotlinx.coroutines.flow.j<? super h0<T>>, y0<T>, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f31647b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f31648c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f31649d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.r0 f31650e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(kotlin.coroutines.d dVar, kotlinx.coroutines.r0 r0Var) {
            super(3, dVar);
            this.f31650e = r0Var;
        }

        @Override // ld.q
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object R(@fg.l kotlinx.coroutines.flow.j<? super h0<T>> jVar, y0<T> y0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            b bVar = new b(dVar, this.f31650e);
            bVar.f31648c = jVar;
            bVar.f31649d = y0Var;
            return bVar.invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f31647b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f31648c;
                h0 h0Var = new h0(this.f31650e, (y0) this.f31649d, null, 4, null);
                this.f31647b = 1;
                if (jVar.emit(h0Var, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
            }
            return k2.f75408a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: CachedPagingData.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.CachedPagingDataKt$cachedIn$2", f = "CachedPagingData.kt", i = {0}, l = {99}, m = "invokeSuspend", n = {"next"}, s = {"L$0"})
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "Landroidx/paging/h0;", "prev", "next", "<anonymous>", "(Landroidx/paging/h0;Landroidx/paging/h0;)Landroidx/paging/h0;"}, k = 3, mv = {1, 5, 1})
    static final class c<T> extends kotlin.coroutines.jvm.internal.o implements ld.q<h0<T>, h0<T>, kotlin.coroutines.d<? super h0<T>>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f31651b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f31652c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f31653d;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(3, dVar);
        }

        @Override // ld.q
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object R(@fg.l h0<T> h0Var, @fg.l h0<T> h0Var2, @fg.m kotlin.coroutines.d<? super h0<T>> dVar) {
            c cVar = new c(3, dVar);
            cVar.f31652c = h0Var;
            cVar.f31653d = h0Var2;
            return cVar.invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f31651b;
            if (i4 != 0) {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h0 h0Var = (h0) this.f31652c;
                kotlin.a1.n(obj);
                return h0Var;
            }
            kotlin.a1.n(obj);
            h0 h0Var2 = (h0) this.f31652c;
            h0 h0Var3 = (h0) this.f31653d;
            this.f31652c = h0Var3;
            this.f31651b = 1;
            return h0Var2.b(this) == aVar ? aVar : h0Var3;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: CachedPagingData.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.CachedPagingDataKt$cachedIn$4", f = "CachedPagingData.kt", i = {}, l = {104}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "Lkotlinx/coroutines/flow/j;", "Landroidx/paging/y0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 5, 1})
    static final class d<T> extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.flow.j<? super y0<T>>, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f31654b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.paging.c f31655c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(androidx.paging.c cVar, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f31655c = cVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l kotlinx.coroutines.flow.j<? super y0<T>> jVar, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((d) create(jVar, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return new d(this.f31655c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f31654b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                androidx.paging.c cVar = this.f31655c;
                if (cVar != null) {
                    c.a aVar2 = c.a.PAGED_DATA_FLOW;
                    this.f31654b = 1;
                    if (cVar.b(aVar2, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
            }
            return k2.f75408a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: CachedPagingData.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.CachedPagingDataKt$cachedIn$5", f = "CachedPagingData.kt", i = {}, l = {106}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "T", "Lkotlinx/coroutines/flow/j;", "Landroidx/paging/y0;", "", "it", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 5, 1})
    /* renamed from: androidx.paging.e$e, reason: collision with other inner class name */
    static final class C0536e<T> extends kotlin.coroutines.jvm.internal.o implements ld.q<kotlinx.coroutines.flow.j<? super y0<T>>, Throwable, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f31656b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.paging.c f31657c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0536e(androidx.paging.c cVar, kotlin.coroutines.d<? super C0536e> dVar) {
            super(3, dVar);
            this.f31657c = cVar;
        }

        @Override // ld.q
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object R(@fg.l kotlinx.coroutines.flow.j<? super y0<T>> jVar, @fg.m Throwable th, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return new C0536e(this.f31657c, dVar).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f31656b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                androidx.paging.c cVar = this.f31657c;
                if (cVar != null) {
                    c.a aVar2 = c.a.PAGED_DATA_FLOW;
                    this.f31656b = 1;
                    if (cVar.a(aVar2, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
            }
            return k2.f75408a;
        }
    }

    @fg.l
    @androidx.annotation.j
    public static final <T> kotlinx.coroutines.flow.i<y0<T>> a(@fg.l kotlinx.coroutines.flow.i<y0<T>> iVar, @fg.l kotlinx.coroutines.r0 scope) {
        kotlin.jvm.internal.l0.p(iVar, "<this>");
        kotlin.jvm.internal.l0.p(scope, "scope");
        return b(iVar, scope, null);
    }

    @fg.l
    public static final <T> kotlinx.coroutines.flow.i<y0<T>> b(@fg.l kotlinx.coroutines.flow.i<y0<T>> iVar, @fg.l kotlinx.coroutines.r0 scope, @fg.m androidx.paging.c cVar) {
        kotlin.jvm.internal.l0.p(iVar, "<this>");
        kotlin.jvm.internal.l0.p(scope, "scope");
        return kotlinx.coroutines.flow.k.G1(new t.b(new t.e(new d(cVar, null), new a(s.f(s.h(iVar, new b(null, scope)), new c(3, null)))), new C0536e(cVar, null)), scope, kotlinx.coroutines.flow.o0.INSTANCE.d(), 1);
    }

    public static /* synthetic */ kotlinx.coroutines.flow.i c(kotlinx.coroutines.flow.i iVar, kotlinx.coroutines.r0 r0Var, androidx.paging.c cVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            cVar = null;
        }
        return b(iVar, r0Var, cVar);
    }
}
