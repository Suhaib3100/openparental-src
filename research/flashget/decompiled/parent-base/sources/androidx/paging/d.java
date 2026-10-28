package androidx.paging;

import kotlin.Metadata;
import kotlin.jvm.internal.k1;
import kotlinx.coroutines.flow.a0;
import kotlinx.coroutines.flow.v;
import kotlinx.coroutines.k2;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: CachedPageEventFlow.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR(\u0010\u0015\u001a\u0016\u0012\u0012\u0012\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0018\u00010\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R(\u0010\u0019\u001a\u0016\u0012\u0012\u0012\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0018\u00010\u00120\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR#\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Landroidx/paging/d;", "", "T", "Lkotlinx/coroutines/flow/i;", "Landroidx/paging/l0;", "src", "Lkotlinx/coroutines/r0;", "scope", "<init>", "(Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/r0;)V", "Lkotlin/k2;", "e", "()V", "Landroidx/paging/q;", "a", "Landroidx/paging/q;", "pageController", "Lkotlinx/coroutines/flow/d0;", "Lkotlin/collections/r0;", "b", "Lkotlinx/coroutines/flow/d0;", "mutableSharedSrc", "Lkotlinx/coroutines/flow/i0;", "c", "Lkotlinx/coroutines/flow/i0;", "sharedForDownstream", "Lkotlinx/coroutines/k2;", "d", "Lkotlinx/coroutines/k2;", "job", "Lkotlinx/coroutines/flow/i;", "f", "()Lkotlinx/coroutines/flow/i;", "downstreamFlow", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class d<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final q<T> pageController;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlinx.coroutines.flow.d0<kotlin.collections.r0<l0<T>>> mutableSharedSrc;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlinx.coroutines.flow.i0<kotlin.collections.r0<l0<T>>> sharedForDownstream;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 job;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlinx.coroutines.flow.i<l0<T>> downstreamFlow;

    /* compiled from: CachedPageEventFlow.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1", f = "CachedPageEventFlow.kt", i = {}, l = {257}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "Lkotlinx/coroutines/flow/j;", "Landroidx/paging/l0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 5, 1})
    static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.flow.j<? super l0<T>>, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f31598b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f31599c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ d<T> f31600d;

        /* compiled from: CachedPageEventFlow.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1$1", f = "CachedPageEventFlow.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0018\u00010\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "T", "Lkotlin/collections/r0;", "Landroidx/paging/l0;", "it", "", "<anonymous>", "(Lkotlin/collections/r0;)Z"}, k = 3, mv = {1, 5, 1})
        /* renamed from: androidx.paging.d$a$a, reason: collision with other inner class name */
        static final class C0530a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlin.collections.r0<? extends l0<T>>, kotlin.coroutines.d<? super Boolean>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f31601b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f31602c;

            C0530a(kotlin.coroutines.d<? super C0530a> dVar) {
                super(2, dVar);
            }

            @Override // ld.p
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@fg.m kotlin.collections.r0<? extends l0<T>> r0Var, @fg.m kotlin.coroutines.d<? super Boolean> dVar) {
                return ((C0530a) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                C0530a c0530a = new C0530a(2, dVar);
                c0530a.f31602c = obj;
                return c0530a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                if (this.f31601b != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
                return Boolean.valueOf(((kotlin.collections.r0) this.f31602c) != null);
            }
        }

        /* compiled from: Collect.kt */
        @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/n$a", "Lkotlinx/coroutines/flow/j;", "value", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class b implements kotlinx.coroutines.flow.j<kotlin.collections.r0<? extends l0<T>>> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ k1.f f31603b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.j f31604c;

            @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1$invokeSuspend$$inlined$collect$1", f = "CachedPageEventFlow.kt", i = {0, 0}, l = {SyslogAppender.LOG_LOCAL1}, m = "emit", n = {"this", "indexedValue"}, s = {"L$0", "L$1"})
            @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
            /* renamed from: androidx.paging.d$a$b$a, reason: collision with other inner class name */
            public static final class C0531a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: b, reason: collision with root package name */
                /* synthetic */ Object f31605b;

                /* renamed from: c, reason: collision with root package name */
                int f31606c;

                /* renamed from: e, reason: collision with root package name */
                Object f31608e;

                /* renamed from: f, reason: collision with root package name */
                Object f31609f;

                public C0531a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                public final Object invokeSuspend(@fg.l Object obj) {
                    this.f31605b = obj;
                    this.f31606c |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(k1.f fVar, kotlinx.coroutines.flow.j jVar) {
                this.f31603b = fVar;
                this.f31604c = jVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            @Override // kotlinx.coroutines.flow.j
            @fg.m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.lang.Object emit(kotlin.collections.r0<? extends androidx.paging.l0<T>> r5, @fg.l kotlin.coroutines.d<? super kotlin.k2> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof androidx.paging.d.a.b.C0531a
                    if (r0 == 0) goto L13
                    r0 = r6
                    androidx.paging.d$a$b$a r0 = (androidx.paging.d.a.b.C0531a) r0
                    int r1 = r0.f31606c
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f31606c = r1
                    goto L18
                L13:
                    androidx.paging.d$a$b$a r0 = new androidx.paging.d$a$b$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f31605b
                    kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                    int r2 = r0.f31606c
                    r3 = 1
                    if (r2 == 0) goto L37
                    if (r2 != r3) goto L2f
                    java.lang.Object r5 = r0.f31609f
                    kotlin.collections.r0 r5 = (kotlin.collections.r0) r5
                    java.lang.Object r0 = r0.f31608e
                    androidx.paging.d$a$b r0 = (androidx.paging.d.a.b) r0
                    kotlin.a1.n(r6)
                    goto L5d
                L2f:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L37:
                    kotlin.a1.n(r6)
                    kotlin.collections.r0 r5 = (kotlin.collections.r0) r5
                    kotlin.jvm.internal.l0.m(r5)
                    int r6 = r5.e()
                    kotlin.jvm.internal.k1$f r2 = r4.f31603b
                    int r2 = r2.f75327b
                    if (r6 <= r2) goto L65
                    kotlinx.coroutines.flow.j r6 = r4.f31604c
                    java.lang.Object r2 = r5.f()
                    r0.f31608e = r4
                    r0.f31609f = r5
                    r0.f31606c = r3
                    java.lang.Object r6 = r6.emit(r2, r0)
                    if (r6 != r1) goto L5c
                    return r1
                L5c:
                    r0 = r4
                L5d:
                    kotlin.jvm.internal.k1$f r6 = r0.f31603b
                    int r5 = r5.e()
                    r6.f75327b = r5
                L65:
                    kotlin.k2 r5 = kotlin.k2.f75408a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.d.a.b.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(d<T> dVar, kotlin.coroutines.d<? super a> dVar2) {
            super(2, dVar2);
            this.f31600d = dVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l kotlinx.coroutines.flow.j<? super l0<T>> jVar, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((a) create(jVar, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f31600d, dVar);
            aVar.f31599c = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f31598b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f31599c;
                k1.f fVar = new k1.f();
                fVar.f75327b = Integer.MIN_VALUE;
                v.j jVar2 = new v.j(((d) this.f31600d).sharedForDownstream, new C0530a(2, null));
                b bVar = new b(fVar, jVar);
                this.f31598b = 1;
                if (jVar2.a(bVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
            }
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: CachedPageEventFlow.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.CachedPageEventFlow$job$1", f = "CachedPageEventFlow.kt", i = {}, l = {257}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "T", "Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 5, 1})
    static final class b extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f31610b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i<l0<T>> f31611c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ d<T> f31612d;

        /* compiled from: Collect.kt */
        @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/n$a", "Lkotlinx/coroutines/flow/j;", "value", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class a implements kotlinx.coroutines.flow.j<kotlin.collections.r0<? extends l0<T>>> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ d f31613b;

            @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.CachedPageEventFlow$job$1$invokeSuspend$$inlined$collect$1", f = "CachedPageEventFlow.kt", i = {0, 0}, l = {135, SyslogAppender.LOG_LOCAL1}, m = "emit", n = {"this", "it"}, s = {"L$0", "L$1"})
            @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
            /* renamed from: androidx.paging.d$b$a$a, reason: collision with other inner class name */
            public static final class C0532a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: b, reason: collision with root package name */
                /* synthetic */ Object f31614b;

                /* renamed from: c, reason: collision with root package name */
                int f31615c;

                /* renamed from: e, reason: collision with root package name */
                Object f31617e;

                /* renamed from: f, reason: collision with root package name */
                Object f31618f;

                public C0532a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                public final Object invokeSuspend(@fg.l Object obj) {
                    this.f31614b = obj;
                    this.f31615c |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(d dVar) {
                this.f31613b = dVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x006a A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
            @Override // kotlinx.coroutines.flow.j
            @fg.m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.lang.Object emit(kotlin.collections.r0<? extends androidx.paging.l0<T>> r6, @fg.l kotlin.coroutines.d<? super kotlin.k2> r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof androidx.paging.d.b.a.C0532a
                    if (r0 == 0) goto L13
                    r0 = r7
                    androidx.paging.d$b$a$a r0 = (androidx.paging.d.b.a.C0532a) r0
                    int r1 = r0.f31615c
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f31615c = r1
                    goto L18
                L13:
                    androidx.paging.d$b$a$a r0 = new androidx.paging.d$b$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f31614b
                    kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                    int r2 = r0.f31615c
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3e
                    if (r2 == r4) goto L32
                    if (r2 != r3) goto L2a
                    kotlin.a1.n(r7)
                    goto L6b
                L2a:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L32:
                    java.lang.Object r6 = r0.f31618f
                    kotlin.collections.r0 r6 = (kotlin.collections.r0) r6
                    java.lang.Object r2 = r0.f31617e
                    androidx.paging.d$b$a r2 = (androidx.paging.d.b.a) r2
                    kotlin.a1.n(r7)
                    goto L57
                L3e:
                    kotlin.a1.n(r7)
                    kotlin.collections.r0 r6 = (kotlin.collections.r0) r6
                    androidx.paging.d r7 = r5.f31613b
                    kotlinx.coroutines.flow.d0 r7 = androidx.paging.d.b(r7)
                    r0.f31617e = r5
                    r0.f31618f = r6
                    r0.f31615c = r4
                    java.lang.Object r7 = r7.emit(r6, r0)
                    if (r7 != r1) goto L56
                    return r1
                L56:
                    r2 = r5
                L57:
                    androidx.paging.d r7 = r2.f31613b
                    androidx.paging.q r7 = androidx.paging.d.c(r7)
                    r2 = 0
                    r0.f31617e = r2
                    r0.f31618f = r2
                    r0.f31615c = r3
                    java.lang.Object r6 = r7.b(r6, r0)
                    if (r6 != r1) goto L6b
                    return r1
                L6b:
                    kotlin.k2 r6 = kotlin.k2.f75408a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.d.b.a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(kotlinx.coroutines.flow.i<? extends l0<T>> iVar, d<T> dVar, kotlin.coroutines.d<? super b> dVar2) {
            super(2, dVar2);
            this.f31611c = iVar;
            this.f31612d = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return new b(this.f31611c, this.f31612d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f31610b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                a0.m mVar = new a0.m(this.f31611c);
                a aVar2 = new a(this.f31612d);
                this.f31610b = 1;
                if (mVar.a(aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
            }
            return kotlin.k2.f75408a;
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((b) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }
    }

    /* compiled from: CachedPageEventFlow.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "", "it", "Lkotlin/k2;", "<anonymous>", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 5, 1})
    static final class c extends kotlin.jvm.internal.n0 implements ld.l<Throwable, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d<T> f31619b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(d<T> dVar) {
            super(1);
            this.f31619b = dVar;
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(Throwable th) {
            invoke2(th);
            return kotlin.k2.f75408a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@fg.m Throwable th) {
            ((d) this.f31619b).mutableSharedSrc.b(null);
        }
    }

    /* compiled from: CachedPageEventFlow.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.CachedPageEventFlow$sharedForDownstream$1", f = "CachedPageEventFlow.kt", i = {0, 1}, l = {63, 68}, m = "invokeSuspend", n = {"$this$onSubscription", "$this$onSubscription"}, s = {"L$0", "L$0"})
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u0016\u0012\u0012\u0012\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0018\u00010\u00030\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "T", "Lkotlinx/coroutines/flow/j;", "Lkotlin/collections/r0;", "Landroidx/paging/l0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 5, 1})
    /* renamed from: androidx.paging.d$d, reason: collision with other inner class name */
    static final class C0533d extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.flow.j<? super kotlin.collections.r0<? extends l0<T>>>, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        Object f31620b;

        /* renamed from: c, reason: collision with root package name */
        int f31621c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f31622d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ d<T> f31623e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0533d(d<T> dVar, kotlin.coroutines.d<? super C0533d> dVar2) {
            super(2, dVar2);
            this.f31623e = dVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l kotlinx.coroutines.flow.j<? super kotlin.collections.r0<? extends l0<T>>> jVar, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((C0533d) create(jVar, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            C0533d c0533d = new C0533d(this.f31623e, dVar);
            c0533d.f31622d = obj;
            return c0533d;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x005a  */
        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r5) {
            /*
                r4 = this;
                kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r1 = r4.f31621c
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L28
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                java.lang.Object r1 = r4.f31620b
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r3 = r4.f31622d
                kotlinx.coroutines.flow.j r3 = (kotlinx.coroutines.flow.j) r3
                kotlin.a1.n(r5)
                goto L54
            L18:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L20:
                java.lang.Object r1 = r4.f31622d
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                kotlin.a1.n(r5)
                goto L41
            L28:
                kotlin.a1.n(r5)
                java.lang.Object r5 = r4.f31622d
                r1 = r5
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                androidx.paging.d<T> r5 = r4.f31623e
                androidx.paging.q r5 = androidx.paging.d.c(r5)
                r4.f31622d = r1
                r4.f31621c = r3
                java.lang.Object r5 = r5.a(r4)
                if (r5 != r0) goto L41
                return r0
            L41:
                java.util.List r5 = (java.util.List) r5
                androidx.paging.d<T> r3 = r4.f31623e
                kotlinx.coroutines.k2 r3 = androidx.paging.d.a(r3)
                r3.start()
                java.lang.Iterable r5 = (java.lang.Iterable) r5
                java.util.Iterator r5 = r5.iterator()
                r3 = r1
                r1 = r5
            L54:
                boolean r5 = r1.hasNext()
                if (r5 == 0) goto L6d
                java.lang.Object r5 = r1.next()
                kotlin.collections.r0 r5 = (kotlin.collections.r0) r5
                r4.f31622d = r3
                r4.f31620b = r1
                r4.f31621c = r2
                java.lang.Object r5 = r3.emit(r5, r4)
                if (r5 != r0) goto L54
                return r0
            L6d:
                kotlin.k2 r5 = kotlin.k2.f75408a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.d.C0533d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public d(@fg.l kotlinx.coroutines.flow.i<? extends l0<T>> src, @fg.l kotlinx.coroutines.r0 scope) {
        k2 f4;
        kotlin.jvm.internal.l0.p(src, "src");
        kotlin.jvm.internal.l0.p(scope, "scope");
        this.pageController = new q<>();
        kotlinx.coroutines.flow.d0<kotlin.collections.r0<l0<T>>> a5 = kotlinx.coroutines.flow.k0.a(1, Integer.MAX_VALUE, kotlinx.coroutines.channels.i.SUSPEND);
        this.mutableSharedSrc = a5;
        this.sharedForDownstream = kotlinx.coroutines.flow.k.n1(a5, new C0533d(this, null));
        f4 = kotlinx.coroutines.k.f(scope, null, kotlinx.coroutines.t0.LAZY, new b(src, this, null), 1, null);
        f4.F(new c(this));
        kotlin.k2 k2Var = kotlin.k2.f75408a;
        this.job = f4;
        this.downstreamFlow = kotlinx.coroutines.flow.k.J0(new a(this, null));
    }

    public final void e() {
        k2.a.b(this.job, null, 1, null);
    }

    @fg.l
    public final kotlinx.coroutines.flow.i<l0<T>> f() {
        return this.downstreamFlow;
    }
}
