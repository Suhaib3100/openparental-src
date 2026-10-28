package androidx.paging;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.k1;
import kotlin.k2;
import kotlinx.coroutines.a4;
import kotlinx.coroutines.channels.e0;
import kotlinx.coroutines.k2;
import kotlinx.coroutines.p2;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: FlowExt.kt */
@Metadata(d1 = {"\u0000F\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a~\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u00012F\u0010\u000b\u001aB\b\u0001\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001ap\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022F\u0010\u000b\u001aB\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001ar\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022B\u0010\u0013\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0010\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0004¢\u0006\u0002\b\u0012H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u000f\u001aj\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u000229\b\u0004\u0010\u0013\u001a3\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0015H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001ad\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u000223\b\u0004\u0010\u0013\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0015H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0017\u001a\u0084\u0001\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00020\u0002\"\u0004\b\u0000\u0010\u0019\"\u0004\b\u0001\u0010\u001a\"\u0004\b\u0002\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022?\b\u0004\u0010\u0013\u001a9\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\u001cH\u0080Hø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \"\u0014\u0010#\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/i;", "initial", "Lkotlin/Function3;", "Lkotlin/r0;", "name", "accumulator", "value", "Lkotlin/coroutines/d;", "", "operation", "g", "(Lkotlinx/coroutines/flow/i;Ljava/lang/Object;Lld/q;)Lkotlinx/coroutines/flow/i;", "f", "(Lkotlinx/coroutines/flow/i;Lld/q;)Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "Lkotlin/k2;", "Lkotlin/u;", "transform", "h", "Lkotlin/Function2;", "d", "(Lkotlinx/coroutines/flow/i;Lld/p;)Lkotlinx/coroutines/flow/i;", "e", "T1", "T2", "otherFlow", "Lkotlin/Function4;", "Landroidx/paging/h;", "updateFrom", "b", "(Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lld/r;Lkotlin/coroutines/d;)Ljava/lang/Object;", "a", "Ljava/lang/Object;", "NULL", "paging-common"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final Object f32267a = new Object();

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: FlowExt.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.FlowExtKt$combineWithoutBatching$2", f = "FlowExt.kt", i = {}, l = {159}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T1", "T2", "R", "Landroidx/paging/n1;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/paging/n1;)V"}, k = 3, mv = {1, 5, 1})
    public static final class a<R> extends kotlin.coroutines.jvm.internal.o implements ld.p<n1<R>, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f32268b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f32269c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i<T1> f32270d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i<T2> f32271e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.r<T1, T2, h, kotlin.coroutines.d<? super R>, Object> f32272f;

        /* compiled from: FlowExt.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1", f = "FlowExt.kt", i = {}, l = {222}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T1", "T2", "R", "Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 5, 1})
        /* renamed from: androidx.paging.s$a$a, reason: collision with other inner class name */
        public static final class C0560a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f32273b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.i<Object> f32274c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ AtomicInteger f32275d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ n1<R> f32276e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ v1<T1, T2> f32277f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ int f32278g;

            /* compiled from: Collect.kt */
            @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/n$a", "Lkotlinx/coroutines/flow/j;", "value", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
            /* renamed from: androidx.paging.s$a$a$a, reason: collision with other inner class name */
            public static final class C0561a implements kotlinx.coroutines.flow.j<Object> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ v1 f32279b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ int f32280c;

                @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1$invokeSuspend$$inlined$collect$1", f = "FlowExt.kt", i = {}, l = {135, 138}, m = "emit", n = {}, s = {})
                @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
                /* renamed from: androidx.paging.s$a$a$a$a, reason: collision with other inner class name */
                public static final class C0562a extends kotlin.coroutines.jvm.internal.d {

                    /* renamed from: b, reason: collision with root package name */
                    /* synthetic */ Object f32281b;

                    /* renamed from: c, reason: collision with root package name */
                    int f32282c;

                    public C0562a(kotlin.coroutines.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @fg.m
                    public final Object invokeSuspend(@fg.l Object obj) {
                        this.f32281b = obj;
                        this.f32282c |= Integer.MIN_VALUE;
                        return C0561a.this.emit(null, this);
                    }
                }

                public C0561a(v1 v1Var, int i4) {
                    this.f32279b = v1Var;
                    this.f32280c = i4;
                }

                @fg.m
                public Object a(Object obj, @fg.l kotlin.coroutines.d dVar) {
                    new C0562a(dVar);
                    this.f32279b.a(this.f32280c, obj, dVar);
                    a4.a(dVar);
                    return k2.f75408a;
                }

                /* JADX WARN: Removed duplicated region for block: B:19:0x004e A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
                @Override // kotlinx.coroutines.flow.j
                @fg.m
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public java.lang.Object emit(java.lang.Object r6, @fg.l kotlin.coroutines.d<? super kotlin.k2> r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof androidx.paging.s.a.C0560a.C0561a.C0562a
                        if (r0 == 0) goto L13
                        r0 = r7
                        androidx.paging.s$a$a$a$a r0 = (androidx.paging.s.a.C0560a.C0561a.C0562a) r0
                        int r1 = r0.f32282c
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f32282c = r1
                        goto L18
                    L13:
                        androidx.paging.s$a$a$a$a r0 = new androidx.paging.s$a$a$a$a
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.f32281b
                        kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                        int r2 = r0.f32282c
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L36
                        if (r2 == r4) goto L32
                        if (r2 != r3) goto L2a
                        kotlin.a1.n(r7)
                        goto L4f
                    L2a:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L32:
                        kotlin.a1.n(r7)
                        goto L46
                    L36:
                        kotlin.a1.n(r7)
                        androidx.paging.v1 r7 = r5.f32279b
                        int r2 = r5.f32280c
                        r0.f32282c = r4
                        java.lang.Object r6 = r7.a(r2, r6, r0)
                        if (r6 != r1) goto L46
                        return r1
                    L46:
                        r0.f32282c = r3
                        java.lang.Object r6 = kotlinx.coroutines.a4.a(r0)
                        if (r6 != r1) goto L4f
                        return r1
                    L4f:
                        kotlin.k2 r6 = kotlin.k2.f75408a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.paging.s.a.C0560a.C0561a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0560a(kotlinx.coroutines.flow.i<? extends Object> iVar, AtomicInteger atomicInteger, n1<R> n1Var, v1<T1, T2> v1Var, int i4, kotlin.coroutines.d<? super C0560a> dVar) {
                super(2, dVar);
                this.f32274c = iVar;
                this.f32275d = atomicInteger;
                this.f32276e = n1Var;
                this.f32277f = v1Var;
                this.f32278g = i4;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                return new C0560a(this.f32274c, this.f32275d, this.f32276e, this.f32277f, this.f32278g, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                AtomicInteger atomicInteger;
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f32273b;
                try {
                    if (i4 == 0) {
                        kotlin.a1.n(obj);
                        kotlinx.coroutines.flow.i<Object> iVar = this.f32274c;
                        C0561a c0561a = new C0561a(this.f32277f, this.f32278g);
                        this.f32273b = 1;
                        if (iVar.a(c0561a, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i4 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a1.n(obj);
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        e0.a.a(this.f32276e, null, 1, null);
                    }
                    return k2.f75408a;
                } finally {
                    if (this.f32275d.decrementAndGet() == 0) {
                        e0.a.a(this.f32276e, null, 1, null);
                    }
                }
            }

            @Override // ld.p
            @fg.m
            public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                return ((C0560a) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
            }
        }

        /* compiled from: FlowExt.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T1", "T2", "R", "Lkotlin/k2;", "<anonymous>", "()V"}, k = 3, mv = {1, 5, 1})
        public static final class b extends kotlin.jvm.internal.n0 implements ld.a<k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.b0 f32284b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(kotlinx.coroutines.b0 b0Var) {
                super(0);
                this.f32284b = b0Var;
            }

            public final void a() {
                k2.a.b(this.f32284b, null, 1, null);
            }

            @Override // ld.a
            public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
                a();
                return kotlin.k2.f75408a;
            }
        }

        /* JADX INFO: Add missing generic type declarations: [T1, T2] */
        /* compiled from: FlowExt.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.FlowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1", f = "FlowExt.kt", i = {}, l = {139, 139}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u008a@"}, d2 = {"T1", "T2", "R", "t1", "t2", "Landroidx/paging/h;", "updateFrom", "Lkotlin/k2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c<T1, T2> extends kotlin.coroutines.jvm.internal.o implements ld.r<T1, T2, h, kotlin.coroutines.d<? super kotlin.k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f32285b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f32286c;

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f32287d;

            /* renamed from: e, reason: collision with root package name */
            /* synthetic */ Object f32288e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ n1<R> f32289f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ ld.r<T1, T2, h, kotlin.coroutines.d<? super R>, Object> f32290g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public c(n1<R> n1Var, ld.r<? super T1, ? super T2, ? super h, ? super kotlin.coroutines.d<? super R>, ? extends Object> rVar, kotlin.coroutines.d<? super c> dVar) {
                super(4, dVar);
                this.f32289f = n1Var;
                this.f32290g = rVar;
            }

            @Override // ld.r
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object i(T1 t12, T2 t22, @fg.l h hVar, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                c cVar = new c(this.f32289f, this.f32290g, dVar);
                cVar.f32286c = t12;
                cVar.f32287d = t22;
                cVar.f32288e = hVar;
                return cVar.invokeSuspend(kotlin.k2.f75408a);
            }

            @fg.m
            public final Object d(@fg.l Object obj) {
                this.f32289f.f0(this.f32290g.i(this.f32286c, this.f32287d, (h) this.f32288e, this), this);
                return kotlin.k2.f75408a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                n1<R> n1Var;
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f32285b;
                if (i4 == 0) {
                    kotlin.a1.n(obj);
                    Object obj2 = this.f32286c;
                    Object obj3 = this.f32287d;
                    h hVar = (h) this.f32288e;
                    n1<R> n1Var2 = this.f32289f;
                    ld.r<T1, T2, h, kotlin.coroutines.d<? super R>, Object> rVar = this.f32290g;
                    this.f32286c = n1Var2;
                    this.f32287d = null;
                    this.f32285b = 1;
                    obj = rVar.i(obj2, obj3, hVar, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    n1Var = n1Var2;
                } else {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a1.n(obj);
                        return kotlin.k2.f75408a;
                    }
                    n1Var = (n1) this.f32286c;
                    kotlin.a1.n(obj);
                }
                this.f32286c = null;
                this.f32285b = 2;
                if (n1Var.f0(obj, this) == aVar) {
                    return aVar;
                }
                return kotlin.k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(kotlinx.coroutines.flow.i<? extends T1> iVar, kotlinx.coroutines.flow.i<? extends T2> iVar2, ld.r<? super T1, ? super T2, ? super h, ? super kotlin.coroutines.d<? super R>, ? extends Object> rVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f32270d = iVar;
            this.f32271e = iVar2;
            this.f32272f = rVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l n1<R> n1Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((a) create(n1Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f32270d, this.f32271e, this.f32272f, dVar);
            aVar.f32269c = obj;
            return aVar;
        }

        @fg.m
        public final Object d(@fg.l Object obj) {
            kotlinx.coroutines.b0 c5;
            n1 n1Var = (n1) this.f32269c;
            AtomicInteger atomicInteger = new AtomicInteger(2);
            v1 v1Var = new v1(new c(n1Var, this.f32272f, null));
            c5 = p2.c(null, 1, null);
            kotlinx.coroutines.flow.i[] iVarArr = {this.f32270d, this.f32271e};
            int i4 = 0;
            int i5 = 0;
            while (i5 < 2) {
                kotlinx.coroutines.k.f(n1Var, c5, null, new C0560a(iVarArr[i5], atomicInteger, n1Var, v1Var, i4, null), 2, null);
                i5++;
                i4++;
            }
            n1Var.y(new b(c5), this);
            return kotlin.k2.f75408a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlinx.coroutines.b0 c5;
            int i4 = 0;
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i5 = this.f32268b;
            if (i5 == 0) {
                kotlin.a1.n(obj);
                n1 n1Var = (n1) this.f32269c;
                AtomicInteger atomicInteger = new AtomicInteger(2);
                v1 v1Var = new v1(new c(n1Var, this.f32272f, null));
                c5 = p2.c(null, 1, null);
                kotlinx.coroutines.flow.i[] iVarArr = {this.f32270d, this.f32271e};
                int i6 = 0;
                while (i4 < 2) {
                    kotlinx.coroutines.k.f(n1Var, c5, null, new C0560a(iVarArr[i4], atomicInteger, n1Var, v1Var, i6, null), 2, null);
                    i4++;
                    i6++;
                    iVarArr = iVarArr;
                }
                b bVar = new b(c5);
                this.f32268b = 1;
                if (n1Var.y(bVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
            }
            return kotlin.k2.f75408a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    /* compiled from: FlowExt.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.FlowExtKt$simpleFlatMapLatest$1", f = "FlowExt.kt", i = {}, l = {96, 96}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/k2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b<R, T> extends kotlin.coroutines.jvm.internal.o implements ld.q<kotlinx.coroutines.flow.j<? super R>, T, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f32291b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f32292c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f32293d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.p<T, kotlin.coroutines.d<? super kotlinx.coroutines.flow.i<? extends R>>, Object> f32294e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(ld.p<? super T, ? super kotlin.coroutines.d<? super kotlinx.coroutines.flow.i<? extends R>>, ? extends Object> pVar, kotlin.coroutines.d<? super b> dVar) {
            super(3, dVar);
            this.f32294e = pVar;
        }

        @Override // ld.q
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object R(@fg.l kotlinx.coroutines.flow.j<? super R> jVar, T t4, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            b bVar = new b(this.f32294e, dVar);
            bVar.f32292c = jVar;
            bVar.f32293d = t4;
            return bVar.invokeSuspend(kotlin.k2.f75408a);
        }

        @fg.m
        public final Object d(@fg.l Object obj) {
            kotlinx.coroutines.flow.k.m0((kotlinx.coroutines.flow.j) this.f32292c, (kotlinx.coroutines.flow.i) this.f32294e.invoke(this.f32293d, this), this);
            return kotlin.k2.f75408a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlinx.coroutines.flow.j jVar;
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f32291b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                jVar = (kotlinx.coroutines.flow.j) this.f32292c;
                Object obj2 = this.f32293d;
                ld.p<T, kotlin.coroutines.d<? super kotlinx.coroutines.flow.i<? extends R>>, Object> pVar = this.f32294e;
                this.f32292c = jVar;
                this.f32291b = 1;
                obj = pVar.invoke(obj2, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    if (i4 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a1.n(obj);
                    return kotlin.k2.f75408a;
                }
                jVar = (kotlinx.coroutines.flow.j) this.f32292c;
                kotlin.a1.n(obj);
            }
            this.f32292c = null;
            this.f32291b = 2;
            if (kotlinx.coroutines.flow.k.m0(jVar, (kotlinx.coroutines.flow.i) obj, this) == aVar) {
                return aVar;
            }
            return kotlin.k2.f75408a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    /* compiled from: FlowExt.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.FlowExtKt$simpleMapLatest$1", f = "FlowExt.kt", i = {}, l = {103, 103}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/k2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c<R, T> extends kotlin.coroutines.jvm.internal.o implements ld.q<kotlinx.coroutines.flow.j<? super R>, T, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f32295b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f32296c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f32297d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.p<T, kotlin.coroutines.d<? super R>, Object> f32298e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(ld.p<? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> pVar, kotlin.coroutines.d<? super c> dVar) {
            super(3, dVar);
            this.f32298e = pVar;
        }

        @Override // ld.q
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object R(@fg.l kotlinx.coroutines.flow.j<? super R> jVar, T t4, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            c cVar = new c(this.f32298e, dVar);
            cVar.f32296c = jVar;
            cVar.f32297d = t4;
            return cVar.invokeSuspend(kotlin.k2.f75408a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @fg.m
        public final Object d(@fg.l Object obj) {
            ((kotlinx.coroutines.flow.j) this.f32296c).emit(this.f32298e.invoke(this.f32297d, this), this);
            return kotlin.k2.f75408a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlinx.coroutines.flow.j jVar;
            Object obj2 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f32295b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                kotlinx.coroutines.flow.j jVar2 = (kotlinx.coroutines.flow.j) this.f32296c;
                Object obj3 = this.f32297d;
                ld.p<T, kotlin.coroutines.d<? super R>, Object> pVar = this.f32298e;
                this.f32296c = jVar2;
                this.f32295b = 1;
                obj = pVar.invoke(obj3, this);
                jVar = jVar2;
                if (obj == obj2) {
                    return obj2;
                }
            } else {
                if (i4 != 1) {
                    if (i4 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a1.n(obj);
                    return kotlin.k2.f75408a;
                }
                kotlinx.coroutines.flow.j jVar3 = (kotlinx.coroutines.flow.j) this.f32296c;
                kotlin.a1.n(obj);
                jVar = jVar3;
            }
            this.f32296c = null;
            this.f32295b = 2;
            if (jVar.emit(obj, this) == obj2) {
                return obj2;
            }
            return kotlin.k2.f75408a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: FlowExt.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.FlowExtKt$simpleRunningReduce$1", f = "FlowExt.kt", i = {}, l = {222}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/flow/j;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 5, 1})
    static final class d<T> extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.flow.j<? super T>, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f32299b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f32300c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i<T> f32301d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.q<T, T, kotlin.coroutines.d<? super T>, Object> f32302e;

        /* compiled from: Collect.kt */
        @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/n$a", "Lkotlinx/coroutines/flow/j;", "value", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class a implements kotlinx.coroutines.flow.j<T> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ k1.h f32303b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ld.q f32304c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.j f32305d;

            @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.FlowExtKt$simpleRunningReduce$1$invokeSuspend$$inlined$collect$1", f = "FlowExt.kt", i = {0}, l = {139, 142}, m = "emit", n = {"this"}, s = {"L$0"})
            @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
            /* renamed from: androidx.paging.s$d$a$a, reason: collision with other inner class name */
            public static final class C0563a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: b, reason: collision with root package name */
                /* synthetic */ Object f32306b;

                /* renamed from: c, reason: collision with root package name */
                int f32307c;

                /* renamed from: e, reason: collision with root package name */
                Object f32309e;

                /* renamed from: f, reason: collision with root package name */
                Object f32310f;

                public C0563a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                public final Object invokeSuspend(@fg.l Object obj) {
                    this.f32306b = obj;
                    this.f32307c |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(k1.h hVar, ld.q qVar, kotlinx.coroutines.flow.j jVar) {
                this.f32303b = hVar;
                this.f32304c = qVar;
                this.f32305d = jVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0078 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
            @Override // kotlinx.coroutines.flow.j
            @fg.m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.lang.Object emit(T r8, @fg.l kotlin.coroutines.d<? super kotlin.k2> r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof androidx.paging.s.d.a.C0563a
                    if (r0 == 0) goto L13
                    r0 = r9
                    androidx.paging.s$d$a$a r0 = (androidx.paging.s.d.a.C0563a) r0
                    int r1 = r0.f32307c
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f32307c = r1
                    goto L18
                L13:
                    androidx.paging.s$d$a$a r0 = new androidx.paging.s$d$a$a
                    r0.<init>(r9)
                L18:
                    java.lang.Object r9 = r0.f32306b
                    kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                    int r2 = r0.f32307c
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L41
                    if (r2 == r4) goto L32
                    if (r2 != r3) goto L2a
                    kotlin.a1.n(r9)
                    goto L79
                L2a:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L32:
                    java.lang.Object r8 = r0.f32310f
                    kotlin.jvm.internal.k1$h r8 = (kotlin.jvm.internal.k1.h) r8
                    java.lang.Object r2 = r0.f32309e
                    androidx.paging.s$d$a r2 = (androidx.paging.s.d.a) r2
                    kotlin.a1.n(r9)
                    r6 = r9
                    r9 = r8
                    r8 = r6
                    goto L63
                L41:
                    kotlin.a1.n(r9)
                    kotlin.jvm.internal.k1$h r9 = r7.f32303b
                    T r2 = r9.f75329b
                    java.lang.Object r5 = androidx.paging.s.a()
                    if (r2 != r5) goto L50
                L4e:
                    r2 = r7
                    goto L63
                L50:
                    ld.q r2 = r7.f32304c
                    kotlin.jvm.internal.k1$h r5 = r7.f32303b
                    T r5 = r5.f75329b
                    r0.f32309e = r7
                    r0.f32310f = r9
                    r0.f32307c = r4
                    java.lang.Object r8 = r2.R(r5, r8, r0)
                    if (r8 != r1) goto L4e
                    return r1
                L63:
                    r9.f75329b = r8
                    kotlinx.coroutines.flow.j r8 = r2.f32305d
                    kotlin.jvm.internal.k1$h r9 = r2.f32303b
                    T r9 = r9.f75329b
                    r2 = 0
                    r0.f32309e = r2
                    r0.f32310f = r2
                    r0.f32307c = r3
                    java.lang.Object r8 = r8.emit(r9, r0)
                    if (r8 != r1) goto L79
                    return r1
                L79:
                    kotlin.k2 r8 = kotlin.k2.f75408a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.s.d.a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(kotlinx.coroutines.flow.i<? extends T> iVar, ld.q<? super T, ? super T, ? super kotlin.coroutines.d<? super T>, ? extends Object> qVar, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f32301d = iVar;
            this.f32302e = qVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l kotlinx.coroutines.flow.j<? super T> jVar, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((d) create(jVar, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            d dVar2 = new d(this.f32301d, this.f32302e, dVar);
            dVar2.f32300c = obj;
            return dVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f32299b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f32300c;
                k1.h hVar = new k1.h();
                hVar.f75329b = (T) s.f32267a;
                kotlinx.coroutines.flow.i<T> iVar = this.f32301d;
                a aVar2 = new a(hVar, this.f32302e, jVar);
                this.f32299b = 1;
                if (iVar.a(aVar2, this) == aVar) {
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

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: FlowExt.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.FlowExtKt$simpleScan$1", f = "FlowExt.kt", i = {0, 0}, l = {52, 222}, m = "invokeSuspend", n = {"$this$flow", "accumulator"}, s = {"L$0", "L$1"})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 5, 1})
    static final class e<R> extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.flow.j<? super R>, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        Object f32311b;

        /* renamed from: c, reason: collision with root package name */
        int f32312c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f32313d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ R f32314e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i<T> f32315f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.q<R, T, kotlin.coroutines.d<? super R>, Object> f32316g;

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* compiled from: Collect.kt */
        @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/n$a", "Lkotlinx/coroutines/flow/j;", "value", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class a<T> implements kotlinx.coroutines.flow.j<T> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ k1.h f32317b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ld.q f32318c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.j f32319d;

            @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.FlowExtKt$simpleScan$1$invokeSuspend$$inlined$collect$1", f = "FlowExt.kt", i = {0}, l = {135, SyslogAppender.LOG_LOCAL1}, m = "emit", n = {"this"}, s = {"L$0"})
            @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
            /* renamed from: androidx.paging.s$e$a$a, reason: collision with other inner class name */
            public static final class C0564a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: b, reason: collision with root package name */
                /* synthetic */ Object f32320b;

                /* renamed from: c, reason: collision with root package name */
                int f32321c;

                /* renamed from: e, reason: collision with root package name */
                Object f32323e;

                /* renamed from: f, reason: collision with root package name */
                Object f32324f;

                public C0564a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                public final Object invokeSuspend(@fg.l Object obj) {
                    this.f32320b = obj;
                    this.f32321c |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(k1.h hVar, ld.q qVar, kotlinx.coroutines.flow.j jVar) {
                this.f32317b = hVar;
                this.f32318c = qVar;
                this.f32319d = jVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x006d A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
            @Override // kotlinx.coroutines.flow.j
            @fg.m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.lang.Object emit(T r8, @fg.l kotlin.coroutines.d<? super kotlin.k2> r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof androidx.paging.s.e.a.C0564a
                    if (r0 == 0) goto L13
                    r0 = r9
                    androidx.paging.s$e$a$a r0 = (androidx.paging.s.e.a.C0564a) r0
                    int r1 = r0.f32321c
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f32321c = r1
                    goto L18
                L13:
                    androidx.paging.s$e$a$a r0 = new androidx.paging.s$e$a$a
                    r0.<init>(r9)
                L18:
                    java.lang.Object r9 = r0.f32320b
                    kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                    int r2 = r0.f32321c
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3e
                    if (r2 == r4) goto L32
                    if (r2 != r3) goto L2a
                    kotlin.a1.n(r9)
                    goto L6e
                L2a:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L32:
                    java.lang.Object r8 = r0.f32324f
                    kotlin.jvm.internal.k1$h r8 = (kotlin.jvm.internal.k1.h) r8
                    java.lang.Object r2 = r0.f32323e
                    androidx.paging.s$e$a r2 = (androidx.paging.s.e.a) r2
                    kotlin.a1.n(r9)
                    goto L58
                L3e:
                    kotlin.a1.n(r9)
                    kotlin.jvm.internal.k1$h r9 = r7.f32317b
                    ld.q r2 = r7.f32318c
                    T r5 = r9.f75329b
                    r0.f32323e = r7
                    r0.f32324f = r9
                    r0.f32321c = r4
                    java.lang.Object r8 = r2.R(r5, r8, r0)
                    if (r8 != r1) goto L54
                    return r1
                L54:
                    r2 = r7
                    r6 = r9
                    r9 = r8
                    r8 = r6
                L58:
                    r8.f75329b = r9
                    kotlinx.coroutines.flow.j r8 = r2.f32319d
                    kotlin.jvm.internal.k1$h r9 = r2.f32317b
                    T r9 = r9.f75329b
                    r2 = 0
                    r0.f32323e = r2
                    r0.f32324f = r2
                    r0.f32321c = r3
                    java.lang.Object r8 = r8.emit(r9, r0)
                    if (r8 != r1) goto L6e
                    return r1
                L6e:
                    kotlin.k2 r8 = kotlin.k2.f75408a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.s.e.a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(R r4, kotlinx.coroutines.flow.i<? extends T> iVar, ld.q<? super R, ? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> qVar, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f32314e = r4;
            this.f32315f = iVar;
            this.f32316g = qVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l kotlinx.coroutines.flow.j<? super R> jVar, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((e) create(jVar, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            e eVar = new e(this.f32314e, this.f32315f, this.f32316g, dVar);
            eVar.f32313d = obj;
            return eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            k1.h hVar;
            kotlinx.coroutines.flow.j jVar;
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f32312c;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                kotlinx.coroutines.flow.j jVar2 = (kotlinx.coroutines.flow.j) this.f32313d;
                hVar = new k1.h();
                R r4 = this.f32314e;
                hVar.f75329b = r4;
                this.f32313d = jVar2;
                this.f32311b = hVar;
                this.f32312c = 1;
                if (jVar2.emit(r4, this) == aVar) {
                    return aVar;
                }
                jVar = jVar2;
            } else {
                if (i4 != 1) {
                    if (i4 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a1.n(obj);
                    return kotlin.k2.f75408a;
                }
                hVar = (k1.h) this.f32311b;
                jVar = (kotlinx.coroutines.flow.j) this.f32313d;
                kotlin.a1.n(obj);
            }
            kotlinx.coroutines.flow.i<T> iVar = this.f32315f;
            a aVar2 = new a(hVar, this.f32316g, jVar);
            this.f32313d = null;
            this.f32311b = null;
            this.f32312c = 2;
            if (iVar.a(aVar2, this) == aVar) {
                return aVar;
            }
            return kotlin.k2.f75408a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: FlowExt.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.FlowExtKt$simpleTransformLatest$1", f = "FlowExt.kt", i = {}, l = {86}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "Landroidx/paging/n1;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/paging/n1;)V"}, k = 3, mv = {1, 5, 1})
    static final class f<R> extends kotlin.coroutines.jvm.internal.o implements ld.p<n1<R>, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f32325b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f32326c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i<T> f32327d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.q<kotlinx.coroutines.flow.j<? super R>, T, kotlin.coroutines.d<? super kotlin.k2>, Object> f32328e;

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* compiled from: FlowExt.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.FlowExtKt$simpleTransformLatest$1$1", f = "FlowExt.kt", i = {}, l = {87}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\n\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@"}, d2 = {"T", "R", "value", "Lkotlin/k2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        static final class a<T> extends kotlin.coroutines.jvm.internal.o implements ld.p<T, kotlin.coroutines.d<? super kotlin.k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f32329b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f32330c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ ld.q<kotlinx.coroutines.flow.j<? super R>, T, kotlin.coroutines.d<? super kotlin.k2>, Object> f32331d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ g<R> f32332e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(ld.q<? super kotlinx.coroutines.flow.j<? super R>, ? super T, ? super kotlin.coroutines.d<? super kotlin.k2>, ? extends Object> qVar, g<R> gVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f32331d = qVar;
                this.f32332e = gVar;
            }

            @Override // ld.p
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(T t4, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                return ((a) create(t4, dVar)).invokeSuspend(kotlin.k2.f75408a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f32331d, this.f32332e, dVar);
                aVar.f32330c = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f32329b;
                if (i4 == 0) {
                    kotlin.a1.n(obj);
                    Object obj2 = this.f32330c;
                    ld.q<kotlinx.coroutines.flow.j<? super R>, T, kotlin.coroutines.d<? super kotlin.k2>, Object> qVar = this.f32331d;
                    g<R> gVar = this.f32332e;
                    this.f32329b = 1;
                    if (qVar.R(gVar, obj2, this) == aVar) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(kotlinx.coroutines.flow.i<? extends T> iVar, ld.q<? super kotlinx.coroutines.flow.j<? super R>, ? super T, ? super kotlin.coroutines.d<? super kotlin.k2>, ? extends Object> qVar, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.f32327d = iVar;
            this.f32328e = qVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l n1<R> n1Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((f) create(n1Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            f fVar = new f(this.f32327d, this.f32328e, dVar);
            fVar.f32326c = obj;
            return fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f32325b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                n1 n1Var = (n1) this.f32326c;
                kotlinx.coroutines.flow.i<T> iVar = this.f32327d;
                a aVar2 = new a(this.f32328e, new g(n1Var), null);
                this.f32325b = 1;
                if (kotlinx.coroutines.flow.k.A(iVar, aVar2, this) == aVar) {
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

    @fg.m
    public static final <T1, T2, R> Object b(@fg.l kotlinx.coroutines.flow.i<? extends T1> iVar, @fg.l kotlinx.coroutines.flow.i<? extends T2> iVar2, @fg.l ld.r<? super T1, ? super T2, ? super h, ? super kotlin.coroutines.d<? super R>, ? extends Object> rVar, @fg.l kotlin.coroutines.d<? super kotlinx.coroutines.flow.i<? extends R>> dVar) {
        return m1.a(new a(iVar, iVar2, rVar, null));
    }

    private static final <T1, T2, R> Object c(kotlinx.coroutines.flow.i<? extends T1> iVar, kotlinx.coroutines.flow.i<? extends T2> iVar2, ld.r<? super T1, ? super T2, ? super h, ? super kotlin.coroutines.d<? super R>, ? extends Object> rVar, kotlin.coroutines.d<? super kotlinx.coroutines.flow.i<? extends R>> dVar) {
        return m1.a(new a(iVar, iVar2, rVar, null));
    }

    @fg.l
    public static final <T, R> kotlinx.coroutines.flow.i<R> d(@fg.l kotlinx.coroutines.flow.i<? extends T> iVar, @fg.l ld.p<? super T, ? super kotlin.coroutines.d<? super kotlinx.coroutines.flow.i<? extends R>>, ? extends Object> transform) {
        kotlin.jvm.internal.l0.p(iVar, "<this>");
        kotlin.jvm.internal.l0.p(transform, "transform");
        return h(iVar, new b(transform, null));
    }

    @fg.l
    public static final <T, R> kotlinx.coroutines.flow.i<R> e(@fg.l kotlinx.coroutines.flow.i<? extends T> iVar, @fg.l ld.p<? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> transform) {
        kotlin.jvm.internal.l0.p(iVar, "<this>");
        kotlin.jvm.internal.l0.p(transform, "transform");
        return h(iVar, new c(transform, null));
    }

    @fg.l
    public static final <T> kotlinx.coroutines.flow.i<T> f(@fg.l kotlinx.coroutines.flow.i<? extends T> iVar, @fg.l ld.q<? super T, ? super T, ? super kotlin.coroutines.d<? super T>, ? extends Object> operation) {
        kotlin.jvm.internal.l0.p(iVar, "<this>");
        kotlin.jvm.internal.l0.p(operation, "operation");
        return kotlinx.coroutines.flow.k.J0(new d(iVar, operation, null));
    }

    @fg.l
    public static final <T, R> kotlinx.coroutines.flow.i<R> g(@fg.l kotlinx.coroutines.flow.i<? extends T> iVar, R r4, @fg.l ld.q<? super R, ? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> operation) {
        kotlin.jvm.internal.l0.p(iVar, "<this>");
        kotlin.jvm.internal.l0.p(operation, "operation");
        return kotlinx.coroutines.flow.k.J0(new e(r4, iVar, operation, null));
    }

    @fg.l
    public static final <T, R> kotlinx.coroutines.flow.i<R> h(@fg.l kotlinx.coroutines.flow.i<? extends T> iVar, @fg.l ld.q<? super kotlinx.coroutines.flow.j<? super R>, ? super T, ? super kotlin.coroutines.d<? super kotlin.k2>, ? extends Object> transform) {
        kotlin.jvm.internal.l0.p(iVar, "<this>");
        kotlin.jvm.internal.l0.p(transform, "transform");
        return m1.a(new f(iVar, transform, null));
    }
}
