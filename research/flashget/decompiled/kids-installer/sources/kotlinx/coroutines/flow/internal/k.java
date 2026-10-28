package kotlinx.coroutines.flow.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.a1;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlin.m2;
import kotlinx.coroutines.channels.c0;
import kotlinx.coroutines.channels.e0;
import kotlinx.coroutines.channels.g0;
import kotlinx.coroutines.channels.k0;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.internal.w0;
import kotlinx.coroutines.s2;
import kotlinx.coroutines.u0;
import kotlinx.coroutines.v0;

/* compiled from: Combine.kt */
@Metadata(d1 = {"\u00008\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0092\u0001\u0010\u000e\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0014\u0010\u0005\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u00032\u0016\u0010\u0007\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0018\u00010\u00030\u000629\u0010\r\u001a5\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b¢\u0006\u0002\b\fH\u0081@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001ap\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00020\u0004\"\u0004\b\u0000\u0010\u0010\"\u0004\b\u0001\u0010\u0011\"\u0004\b\u0002\u0010\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042(\u0010\r\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015*\u001c\b\u0002\u0010\u0017\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00162\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"R", "T", "Lkotlinx/coroutines/flow/j;", "", "Lkotlinx/coroutines/flow/i;", "flows", "Lkotlin/Function0;", "arrayFactory", "Lkotlin/Function3;", "Lkotlin/coroutines/d;", "Lkotlin/m2;", "", "Lkotlin/u;", "transform", "a", "(Lkotlinx/coroutines/flow/j;[Lkotlinx/coroutines/flow/i;Lq3/a;Lq3/q;Lkotlin/coroutines/d;)Ljava/lang/Object;", "T1", "T2", "flow", "flow2", "b", "(Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lq3/q;)Lkotlinx/coroutines/flow/i;", "Lkotlin/collections/u0;", "Update", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class k {

    /* compiled from: Combine.kt */
    @DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", f = "Combine.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {57, 79, 82}, m = "invokeSuspend", n = {"latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1"})
    @Metadata(d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"R", "T", "Lkotlinx/coroutines/u0;", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    static final class a extends SuspendLambda implements q3.p<u0, Continuation<? super m2>, Object> {
        final /* synthetic */ q3.q<kotlinx.coroutines.flow.j<? super R>, T[], Continuation<? super m2>, Object> A;
        final /* synthetic */ kotlinx.coroutines.flow.j<R> B;

        /* renamed from: s, reason: collision with root package name */
        Object f28048s;

        /* renamed from: t, reason: collision with root package name */
        Object f28049t;

        /* renamed from: u, reason: collision with root package name */
        int f28050u;

        /* renamed from: v, reason: collision with root package name */
        int f28051v;

        /* renamed from: w, reason: collision with root package name */
        int f28052w;

        /* renamed from: x, reason: collision with root package name */
        private /* synthetic */ Object f28053x;

        /* renamed from: y, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i<T>[] f28054y;

        /* renamed from: z, reason: collision with root package name */
        final /* synthetic */ q3.a<T[]> f28055z;

        /* compiled from: Combine.kt */
        @DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", f = "Combine.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"R", "T", "Lkotlinx/coroutines/u0;", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        /* renamed from: kotlinx.coroutines.flow.internal.k$a$a, reason: collision with other inner class name */
        static final class C0428a extends SuspendLambda implements q3.p<u0, Continuation<? super m2>, Object> {

            /* renamed from: s, reason: collision with root package name */
            int f28056s;

            /* renamed from: t, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.i<T>[] f28057t;

            /* renamed from: u, reason: collision with root package name */
            final /* synthetic */ int f28058u;

            /* renamed from: v, reason: collision with root package name */
            final /* synthetic */ AtomicInteger f28059v;

            /* renamed from: w, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.channels.n<IndexedValue<Object>> f28060w;

            /* compiled from: Combine.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "T", "value", "Lkotlin/m2;", "b", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
            /* renamed from: kotlinx.coroutines.flow.internal.k$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            static final class C0429a<T> implements kotlinx.coroutines.flow.j {

                /* renamed from: o, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.channels.n<IndexedValue<Object>> f28061o;

                /* renamed from: p, reason: collision with root package name */
                final /* synthetic */ int f28062p;

                /* compiled from: Combine.kt */
                @DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1", f = "Combine.kt", i = {}, l = {35, 36}, m = "emit", n = {}, s = {})
                @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                /* renamed from: kotlinx.coroutines.flow.internal.k$a$a$a$a, reason: collision with other inner class name */
                /* loaded from: classes6.dex */
                static final class C0430a extends ContinuationImpl {

                    /* renamed from: r, reason: collision with root package name */
                    /* synthetic */ Object f28063r;

                    /* renamed from: s, reason: collision with root package name */
                    final /* synthetic */ C0429a<T> f28064s;

                    /* renamed from: t, reason: collision with root package name */
                    int f28065t;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C0430a(C0429a<? super T> c0429a, Continuation<? super C0430a> continuation) {
                        super(continuation);
                        this.f28064s = c0429a;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @d5.e
                    public final Object A(@d5.d Object obj) {
                        this.f28063r = obj;
                        this.f28065t |= Integer.MIN_VALUE;
                        return this.f28064s.b(null, this);
                    }
                }

                C0429a(kotlinx.coroutines.channels.n<IndexedValue<Object>> nVar, int i5) {
                    this.f28061o = nVar;
                    this.f28062p = i5;
                }

                /* JADX WARN: Removed duplicated region for block: B:19:0x0057 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
                @Override // kotlinx.coroutines.flow.j
                @d5.e
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object b(T r7, @d5.d kotlin.coroutines.Continuation<? super kotlin.m2> r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof kotlinx.coroutines.flow.internal.k.a.C0428a.C0429a.C0430a
                        if (r0 == 0) goto L13
                        r0 = r8
                        kotlinx.coroutines.flow.internal.k$a$a$a$a r0 = (kotlinx.coroutines.flow.internal.k.a.C0428a.C0429a.C0430a) r0
                        int r1 = r0.f28065t
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f28065t = r1
                        goto L18
                    L13:
                        kotlinx.coroutines.flow.internal.k$a$a$a$a r0 = new kotlinx.coroutines.flow.internal.k$a$a$a$a
                        r0.<init>(r6, r8)
                    L18:
                        java.lang.Object r8 = r0.f28063r
                        kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                        int r2 = r0.f28065t
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L3a
                        if (r2 == r4) goto L36
                        if (r2 != r3) goto L2a
                        kotlin.a1.n(r8)
                        goto L58
                    L2a:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "嵕"
                        java.lang.String r8 = com.flashget.kidsdownloader.ProtectedSandApp.s(r8)
                        r7.<init>(r8)
                        throw r7
                    L36:
                        kotlin.a1.n(r8)
                        goto L4f
                    L3a:
                        kotlin.a1.n(r8)
                        kotlinx.coroutines.channels.n<kotlin.collections.u0<java.lang.Object>> r8 = r6.f28061o
                        kotlin.collections.u0 r2 = new kotlin.collections.u0
                        int r5 = r6.f28062p
                        r2.<init>(r5, r7)
                        r0.f28065t = r4
                        java.lang.Object r7 = r8.a0(r2, r0)
                        if (r7 != r1) goto L4f
                        return r1
                    L4f:
                        r0.f28065t = r3
                        java.lang.Object r7 = kotlinx.coroutines.d4.a(r0)
                        if (r7 != r1) goto L58
                        return r1
                    L58:
                        kotlin.m2 r7 = kotlin.m2.f23662a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.k.a.C0428a.C0429a.b(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0428a(kotlinx.coroutines.flow.i<? extends T>[] iVarArr, int i5, AtomicInteger atomicInteger, kotlinx.coroutines.channels.n<IndexedValue<Object>> nVar, Continuation<? super C0428a> continuation) {
                super(2, continuation);
                this.f28057t = iVarArr;
                this.f28058u = i5;
                this.f28059v = atomicInteger;
                this.f28060w = nVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.e
            public final Object A(@d5.d Object obj) {
                AtomicInteger atomicInteger;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.f28056s;
                try {
                    if (i5 == 0) {
                        a1.n(obj);
                        kotlinx.coroutines.flow.i[] iVarArr = this.f28057t;
                        int i6 = this.f28058u;
                        kotlinx.coroutines.flow.i iVar = iVarArr[i6];
                        C0429a c0429a = new C0429a(this.f28060w, i6);
                        this.f28056s = 1;
                        if (iVar.a(c0429a, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i5 != 1) {
                            throw new IllegalStateException(ProtectedSandApp.s("郼"));
                        }
                        a1.n(obj);
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        k0.a.a(this.f28060w, null, 1, null);
                    }
                    return m2.f23662a;
                } finally {
                    if (this.f28059v.decrementAndGet() == 0) {
                        k0.a.a(this.f28060w, null, 1, null);
                    }
                }
            }

            @Override // q3.p
            @d5.e
            /* renamed from: R, reason: merged with bridge method [inline-methods] */
            public final Object g0(@d5.d u0 u0Var, @d5.e Continuation<? super m2> continuation) {
                return ((C0428a) c(u0Var, continuation)).A(m2.f23662a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.d
            public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
                return new C0428a(this.f28057t, this.f28058u, this.f28059v, this.f28060w, continuation);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(kotlinx.coroutines.flow.i<? extends T>[] iVarArr, q3.a<T[]> aVar, q3.q<? super kotlinx.coroutines.flow.j<? super R>, ? super T[], ? super Continuation<? super m2>, ? extends Object> qVar, kotlinx.coroutines.flow.j<? super R> jVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f28054y = iVarArr;
            this.f28055z = aVar;
            this.A = qVar;
            this.B = jVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:15:0x00e5  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x00e8 A[LOOP:0: B:17:0x00e8->B:38:?, LOOP_START, PHI: r6 r10
          0x00e8: PHI (r6v6 int) = (r6v5 int), (r6v7 int) binds: [B:14:0x00e3, B:38:?] A[DONT_GENERATE, DONT_INLINE]
          0x00e8: PHI (r10v8 kotlin.collections.u0) = (r10v7 kotlin.collections.u0), (r10v21 kotlin.collections.u0) binds: [B:14:0x00e3, B:38:?] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Type inference failed for: r15v0, types: [kotlinx.coroutines.flow.i<T>[], kotlinx.coroutines.flow.i[]] */
        /* JADX WARN: Type inference failed for: r2v13, types: [int] */
        /* JADX WARN: Type inference failed for: r2v7, types: [int] */
        /* JADX WARN: Type inference failed for: r2v9, types: [int] */
        /* JADX WARN: Type inference failed for: r6v0, types: [kotlinx.coroutines.flow.i<T>[]] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0130 -> B:8:0x00c5). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object A(@d5.d java.lang.Object r23) {
            /*
                Method dump skipped, instructions count: 359
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.k.a.A(java.lang.Object):java.lang.Object");
        }

        @Override // q3.p
        @d5.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d5.d u0 u0Var, @d5.e Continuation<? super m2> continuation) {
            return ((a) c(u0Var, continuation)).A(m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.d
        public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
            a aVar = new a(this.f28054y, this.f28055z, this.A, this.B, continuation);
            aVar.f28053x = obj;
            return aVar;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/v$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/m2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class b<R> implements kotlinx.coroutines.flow.i<R> {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f28066o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f28067p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ q3.q f28068q;

        public b(kotlinx.coroutines.flow.i iVar, kotlinx.coroutines.flow.i iVar2, q3.q qVar) {
            this.f28066o = iVar;
            this.f28067p = iVar2;
            this.f28068q = qVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @d5.e
        public Object a(@d5.d kotlinx.coroutines.flow.j<? super R> jVar, @d5.d Continuation<? super m2> continuation) {
            Object g5 = v0.g(new c(jVar, this.f28066o, this.f28067p, this.f28068q, null), continuation);
            return g5 == CoroutineSingletons.COROUTINE_SUSPENDED ? g5 : m2.f23662a;
        }
    }

    /* compiled from: Combine.kt */
    @DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1", f = "Combine.kt", i = {0}, l = {129}, m = "invokeSuspend", n = {"second"}, s = {"L$0"})
    @Metadata(d1 = {"\u0000\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"T1", "T2", "R", "Lkotlinx/coroutines/u0;", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    static final class c extends SuspendLambda implements q3.p<u0, Continuation<? super m2>, Object> {

        /* renamed from: s, reason: collision with root package name */
        int f28069s;

        /* renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f28070t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.j<R> f28071u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i<T2> f28072v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i<T1> f28073w;

        /* renamed from: x, reason: collision with root package name */
        final /* synthetic */ q3.q<T1, T2, Continuation<? super R>, Object> f28074x;

        /* compiled from: Combine.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T1", "T2", "R", "", "it", "Lkotlin/m2;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 6, 0})
        static final class a extends Lambda implements q3.l<Throwable, m2> {

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ d0 f28075p;

            /* renamed from: q, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.j<R> f28076q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(d0 d0Var, kotlinx.coroutines.flow.j<? super R> jVar) {
                super(1);
                this.f28075p = d0Var;
                this.f28076q = jVar;
            }

            @Override // q3.l
            public /* bridge */ /* synthetic */ m2 N(Throwable th) {
                a(th);
                return m2.f23662a;
            }

            public final void a(@d5.e Throwable th) {
                if (this.f28075p.d()) {
                    this.f28075p.e(new AbortFlowException(this.f28076q));
                }
            }
        }

        /* compiled from: Combine.kt */
        @DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2", f = "Combine.kt", i = {}, l = {130}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@"}, d2 = {"T1", "T2", "R", "Lkotlin/m2;", "it", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        static final class b extends SuspendLambda implements q3.p<m2, Continuation<? super m2>, Object> {

            /* renamed from: s, reason: collision with root package name */
            int f28077s;

            /* renamed from: t, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.i<T1> f28078t;

            /* renamed from: u, reason: collision with root package name */
            final /* synthetic */ CoroutineContext f28079u;

            /* renamed from: v, reason: collision with root package name */
            final /* synthetic */ Object f28080v;

            /* renamed from: w, reason: collision with root package name */
            final /* synthetic */ g0<Object> f28081w;

            /* renamed from: x, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.j<R> f28082x;

            /* renamed from: y, reason: collision with root package name */
            final /* synthetic */ q3.q<T1, T2, Continuation<? super R>, Object> f28083y;

            /* compiled from: Combine.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T1", "T2", "R", "value", "Lkotlin/m2;", "b", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
            /* loaded from: classes5.dex */
            static final class a<T> implements kotlinx.coroutines.flow.j {

                /* renamed from: o, reason: collision with root package name */
                final /* synthetic */ CoroutineContext f28084o;

                /* renamed from: p, reason: collision with root package name */
                final /* synthetic */ Object f28085p;

                /* renamed from: q, reason: collision with root package name */
                final /* synthetic */ g0<Object> f28086q;

                /* renamed from: r, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.flow.j<R> f28087r;

                /* renamed from: s, reason: collision with root package name */
                final /* synthetic */ q3.q<T1, T2, Continuation<? super R>, Object> f28088s;

                /* compiled from: Combine.kt */
                @DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1", f = "Combine.kt", i = {}, l = {132, 135, 135}, m = "invokeSuspend", n = {}, s = {})
                @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@"}, d2 = {"T1", "T2", "R", "Lkotlin/m2;", "it", "<anonymous>"}, k = 3, mv = {1, 6, 0})
                /* renamed from: kotlinx.coroutines.flow.internal.k$c$b$a$a, reason: collision with other inner class name */
                /* loaded from: classes6.dex */
                static final class C0431a extends SuspendLambda implements q3.p<m2, Continuation<? super m2>, Object> {

                    /* renamed from: s, reason: collision with root package name */
                    Object f28089s;

                    /* renamed from: t, reason: collision with root package name */
                    int f28090t;

                    /* renamed from: u, reason: collision with root package name */
                    final /* synthetic */ g0<Object> f28091u;

                    /* renamed from: v, reason: collision with root package name */
                    final /* synthetic */ kotlinx.coroutines.flow.j<R> f28092v;

                    /* renamed from: w, reason: collision with root package name */
                    final /* synthetic */ q3.q<T1, T2, Continuation<? super R>, Object> f28093w;

                    /* renamed from: x, reason: collision with root package name */
                    final /* synthetic */ T1 f28094x;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C0431a(g0<? extends Object> g0Var, kotlinx.coroutines.flow.j<? super R> jVar, q3.q<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> qVar, T1 t12, Continuation<? super C0431a> continuation) {
                        super(2, continuation);
                        this.f28091u = g0Var;
                        this.f28092v = jVar;
                        this.f28093w = qVar;
                        this.f28094x = t12;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:0x0070 A[RETURN] */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @d5.e
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object A(@d5.d java.lang.Object r9) {
                        /*
                            r8 = this;
                            kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                            int r1 = r8.f28090t
                            r2 = 0
                            r3 = 3
                            r4 = 2
                            r5 = 1
                            if (r1 == 0) goto L32
                            if (r1 == r5) goto L28
                            if (r1 == r4) goto L20
                            if (r1 != r3) goto L14
                            kotlin.a1.n(r9)
                            goto L71
                        L14:
                            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                            java.lang.String r0 = "郾"
                            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
                            r9.<init>(r0)
                            throw r9
                        L20:
                            java.lang.Object r1 = r8.f28089s
                            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                            kotlin.a1.n(r9)
                            goto L66
                        L28:
                            kotlin.a1.n(r9)
                            kotlinx.coroutines.channels.r r9 = (kotlinx.coroutines.channels.r) r9
                            java.lang.Object r9 = r9.getHolder()
                            goto L40
                        L32:
                            kotlin.a1.n(r9)
                            kotlinx.coroutines.channels.g0<java.lang.Object> r9 = r8.f28091u
                            r8.f28090t = r5
                            java.lang.Object r9 = r9.E(r8)
                            if (r9 != r0) goto L40
                            return r0
                        L40:
                            kotlinx.coroutines.flow.j<R> r1 = r8.f28092v
                            boolean r5 = r9 instanceof kotlinx.coroutines.channels.r.c
                            if (r5 == 0) goto L52
                            java.lang.Throwable r9 = kotlinx.coroutines.channels.r.f(r9)
                            if (r9 != 0) goto L51
                            kotlinx.coroutines.flow.internal.AbortFlowException r9 = new kotlinx.coroutines.flow.internal.AbortFlowException
                            r9.<init>(r1)
                        L51:
                            throw r9
                        L52:
                            q3.q<T1, T2, kotlin.coroutines.d<? super R>, java.lang.Object> r5 = r8.f28093w
                            T1 r6 = r8.f28094x
                            kotlinx.coroutines.internal.r0 r7 = kotlinx.coroutines.flow.internal.s.f28115a
                            if (r9 != r7) goto L5b
                            r9 = r2
                        L5b:
                            r8.f28089s = r1
                            r8.f28090t = r4
                            java.lang.Object r9 = r5.G(r6, r9, r8)
                            if (r9 != r0) goto L66
                            return r0
                        L66:
                            r8.f28089s = r2
                            r8.f28090t = r3
                            java.lang.Object r9 = r1.b(r9, r8)
                            if (r9 != r0) goto L71
                            return r0
                        L71:
                            kotlin.m2 r9 = kotlin.m2.f23662a
                            return r9
                        */
                        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.k.c.b.a.C0431a.A(java.lang.Object):java.lang.Object");
                    }

                    @Override // q3.p
                    @d5.e
                    /* renamed from: R, reason: merged with bridge method [inline-methods] */
                    public final Object g0(@d5.d m2 m2Var, @d5.e Continuation<? super m2> continuation) {
                        return ((C0431a) c(m2Var, continuation)).A(m2.f23662a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @d5.d
                    public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
                        return new C0431a(this.f28091u, this.f28092v, this.f28093w, this.f28094x, continuation);
                    }
                }

                /* compiled from: Combine.kt */
                @DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1", f = "Combine.kt", i = {}, l = {131}, m = "emit", n = {}, s = {})
                @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                /* renamed from: kotlinx.coroutines.flow.internal.k$c$b$a$b, reason: collision with other inner class name */
                /* loaded from: classes6.dex */
                static final class C0432b extends ContinuationImpl {

                    /* renamed from: r, reason: collision with root package name */
                    /* synthetic */ Object f28095r;

                    /* renamed from: s, reason: collision with root package name */
                    final /* synthetic */ a<T> f28096s;

                    /* renamed from: t, reason: collision with root package name */
                    int f28097t;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C0432b(a<? super T> aVar, Continuation<? super C0432b> continuation) {
                        super(continuation);
                        this.f28096s = aVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @d5.e
                    public final Object A(@d5.d Object obj) {
                        this.f28095r = obj;
                        this.f28097t |= Integer.MIN_VALUE;
                        return this.f28096s.b(null, this);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                a(CoroutineContext coroutineContext, Object obj, g0<? extends Object> g0Var, kotlinx.coroutines.flow.j<? super R> jVar, q3.q<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> qVar) {
                    this.f28084o = coroutineContext;
                    this.f28085p = obj;
                    this.f28086q = g0Var;
                    this.f28087r = jVar;
                    this.f28088s = qVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // kotlinx.coroutines.flow.j
                @d5.e
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object b(T1 r13, @d5.d kotlin.coroutines.Continuation<? super kotlin.m2> r14) {
                    /*
                        r12 = this;
                        boolean r0 = r14 instanceof kotlinx.coroutines.flow.internal.k.c.b.a.C0432b
                        if (r0 == 0) goto L13
                        r0 = r14
                        kotlinx.coroutines.flow.internal.k$c$b$a$b r0 = (kotlinx.coroutines.flow.internal.k.c.b.a.C0432b) r0
                        int r1 = r0.f28097t
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f28097t = r1
                        goto L18
                    L13:
                        kotlinx.coroutines.flow.internal.k$c$b$a$b r0 = new kotlinx.coroutines.flow.internal.k$c$b$a$b
                        r0.<init>(r12, r14)
                    L18:
                        java.lang.Object r14 = r0.f28095r
                        kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                        int r2 = r0.f28097t
                        r3 = 1
                        if (r2 == 0) goto L33
                        if (r2 != r3) goto L27
                        kotlin.a1.n(r14)
                        goto L53
                    L27:
                        java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                        java.lang.String r14 = "嵖"
                        java.lang.String r14 = com.flashget.kidsdownloader.ProtectedSandApp.s(r14)
                        r13.<init>(r14)
                        throw r13
                    L33:
                        kotlin.a1.n(r14)
                        kotlin.coroutines.g r14 = r12.f28084o
                        kotlin.m2 r2 = kotlin.m2.f23662a
                        java.lang.Object r4 = r12.f28085p
                        kotlinx.coroutines.flow.internal.k$c$b$a$a r11 = new kotlinx.coroutines.flow.internal.k$c$b$a$a
                        kotlinx.coroutines.channels.g0<java.lang.Object> r6 = r12.f28086q
                        kotlinx.coroutines.flow.j<R> r7 = r12.f28087r
                        q3.q<T1, T2, kotlin.coroutines.d<? super R>, java.lang.Object> r8 = r12.f28088s
                        r10 = 0
                        r5 = r11
                        r9 = r13
                        r5.<init>(r6, r7, r8, r9, r10)
                        r0.f28097t = r3
                        java.lang.Object r13 = kotlinx.coroutines.flow.internal.e.c(r14, r2, r4, r11, r0)
                        if (r13 != r1) goto L53
                        return r1
                    L53:
                        kotlin.m2 r13 = kotlin.m2.f23662a
                        return r13
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.k.c.b.a.b(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(kotlinx.coroutines.flow.i<? extends T1> iVar, CoroutineContext coroutineContext, Object obj, g0<? extends Object> g0Var, kotlinx.coroutines.flow.j<? super R> jVar, q3.q<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> qVar, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f28078t = iVar;
                this.f28079u = coroutineContext;
                this.f28080v = obj;
                this.f28081w = g0Var;
                this.f28082x = jVar;
                this.f28083y = qVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.e
            public final Object A(@d5.d Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.f28077s;
                if (i5 == 0) {
                    a1.n(obj);
                    kotlinx.coroutines.flow.i<T1> iVar = this.f28078t;
                    a aVar = new a(this.f28079u, this.f28080v, this.f28081w, this.f28082x, this.f28083y);
                    this.f28077s = 1;
                    if (iVar.a(aVar, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException(ProtectedSandApp.s("郿"));
                    }
                    a1.n(obj);
                }
                return m2.f23662a;
            }

            @Override // q3.p
            @d5.e
            /* renamed from: R, reason: merged with bridge method [inline-methods] */
            public final Object g0(@d5.d m2 m2Var, @d5.e Continuation<? super m2> continuation) {
                return ((b) c(m2Var, continuation)).A(m2.f23662a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.d
            public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
                return new b(this.f28078t, this.f28079u, this.f28080v, this.f28081w, this.f28082x, this.f28083y, continuation);
            }
        }

        /* compiled from: Combine.kt */
        @DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1", f = "Combine.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@"}, d2 = {"T1", "T2", "R", "Lkotlinx/coroutines/channels/e0;", "", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        /* renamed from: kotlinx.coroutines.flow.internal.k$c$c, reason: collision with other inner class name */
        static final class C0433c extends SuspendLambda implements q3.p<e0<? super Object>, Continuation<? super m2>, Object> {

            /* renamed from: s, reason: collision with root package name */
            int f28098s;

            /* renamed from: t, reason: collision with root package name */
            private /* synthetic */ Object f28099t;

            /* renamed from: u, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.i<T2> f28100u;

            /* compiled from: Combine.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T1", "T2", "R", "value", "Lkotlin/m2;", "b", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
            /* renamed from: kotlinx.coroutines.flow.internal.k$c$c$a */
            /* loaded from: classes5.dex */
            static final class a<T> implements kotlinx.coroutines.flow.j {

                /* renamed from: o, reason: collision with root package name */
                final /* synthetic */ e0<Object> f28101o;

                /* compiled from: Combine.kt */
                @DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1$1", f = "Combine.kt", i = {}, l = {93}, m = "emit", n = {}, s = {})
                @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                /* renamed from: kotlinx.coroutines.flow.internal.k$c$c$a$a, reason: collision with other inner class name */
                /* loaded from: classes6.dex */
                static final class C0434a extends ContinuationImpl {

                    /* renamed from: r, reason: collision with root package name */
                    /* synthetic */ Object f28102r;

                    /* renamed from: s, reason: collision with root package name */
                    final /* synthetic */ a<T> f28103s;

                    /* renamed from: t, reason: collision with root package name */
                    int f28104t;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C0434a(a<? super T> aVar, Continuation<? super C0434a> continuation) {
                        super(continuation);
                        this.f28103s = aVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @d5.e
                    public final Object A(@d5.d Object obj) {
                        this.f28102r = obj;
                        this.f28104t |= Integer.MIN_VALUE;
                        return this.f28103s.b(null, this);
                    }
                }

                a(e0<Object> e0Var) {
                    this.f28101o = e0Var;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // kotlinx.coroutines.flow.j
                @d5.e
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object b(T2 r5, @d5.d kotlin.coroutines.Continuation<? super kotlin.m2> r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof kotlinx.coroutines.flow.internal.k.c.C0433c.a.C0434a
                        if (r0 == 0) goto L13
                        r0 = r6
                        kotlinx.coroutines.flow.internal.k$c$c$a$a r0 = (kotlinx.coroutines.flow.internal.k.c.C0433c.a.C0434a) r0
                        int r1 = r0.f28104t
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f28104t = r1
                        goto L18
                    L13:
                        kotlinx.coroutines.flow.internal.k$c$c$a$a r0 = new kotlinx.coroutines.flow.internal.k$c$c$a$a
                        r0.<init>(r4, r6)
                    L18:
                        java.lang.Object r6 = r0.f28102r
                        kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                        int r2 = r0.f28104t
                        r3 = 1
                        if (r2 == 0) goto L33
                        if (r2 != r3) goto L27
                        kotlin.a1.n(r6)
                        goto L49
                    L27:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "嵗"
                        java.lang.String r6 = com.flashget.kidsdownloader.ProtectedSandApp.s(r6)
                        r5.<init>(r6)
                        throw r5
                    L33:
                        kotlin.a1.n(r6)
                        kotlinx.coroutines.channels.e0<java.lang.Object> r6 = r4.f28101o
                        kotlinx.coroutines.channels.k0 r6 = r6.g()
                        if (r5 != 0) goto L40
                        kotlinx.coroutines.internal.r0 r5 = kotlinx.coroutines.flow.internal.s.f28115a
                    L40:
                        r0.f28104t = r3
                        java.lang.Object r5 = r6.a0(r5, r0)
                        if (r5 != r1) goto L49
                        return r1
                    L49:
                        kotlin.m2 r5 = kotlin.m2.f23662a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.k.c.C0433c.a.b(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0433c(kotlinx.coroutines.flow.i<? extends T2> iVar, Continuation<? super C0433c> continuation) {
                super(2, continuation);
                this.f28100u = iVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.e
            public final Object A(@d5.d Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.f28098s;
                if (i5 == 0) {
                    a1.n(obj);
                    e0 e0Var = (e0) this.f28099t;
                    kotlinx.coroutines.flow.i<T2> iVar = this.f28100u;
                    a aVar = new a(e0Var);
                    this.f28098s = 1;
                    if (iVar.a(aVar, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException(ProtectedSandApp.s("鄀"));
                    }
                    a1.n(obj);
                }
                return m2.f23662a;
            }

            @Override // q3.p
            @d5.e
            /* renamed from: R, reason: merged with bridge method [inline-methods] */
            public final Object g0(@d5.d e0<Object> e0Var, @d5.e Continuation<? super m2> continuation) {
                return ((C0433c) c(e0Var, continuation)).A(m2.f23662a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.d
            public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
                C0433c c0433c = new C0433c(this.f28100u, continuation);
                c0433c.f28099t = obj;
                return c0433c;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(kotlinx.coroutines.flow.j<? super R> jVar, kotlinx.coroutines.flow.i<? extends T2> iVar, kotlinx.coroutines.flow.i<? extends T1> iVar2, q3.q<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> qVar, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f28071u = jVar;
            this.f28072v = iVar;
            this.f28073w = iVar2;
            this.f28074x = qVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v12, types: [kotlinx.coroutines.channels.g0] */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v18 */
        /* JADX WARN: Type inference failed for: r1v19 */
        /* JADX WARN: Type inference failed for: r1v2, types: [kotlinx.coroutines.channels.g0] */
        /* JADX WARN: Type inference failed for: r1v5 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            d0 c6;
            g0 g0Var;
            g0 g0Var2;
            CoroutineContext B;
            m2 m2Var;
            b bVar;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            ?? r12 = this.f28069s;
            try {
                if (r12 != 0) {
                    if (r12 != 1) {
                        throw new IllegalStateException(ProtectedSandApp.s("鄁"));
                    }
                    g0Var2 = (g0) this.f28070t;
                    try {
                        a1.n(obj);
                        r12 = g0Var2;
                    } catch (AbortFlowException e6) {
                        e = e6;
                    }
                    g0.a.b(r12, null, 1, null);
                    return m2.f23662a;
                }
                a1.n(obj);
                u0 u0Var = (u0) this.f28070t;
                g0 h5 = c0.h(u0Var, null, 0, new C0433c(this.f28072v, null), 3, null);
                c6 = s2.c(null, 1, null);
                ((k0) h5).v(new a(c6, this.f28071u));
                try {
                    CoroutineContext coroutineContext = u0Var.getCoroutineContext();
                    Object b6 = w0.b(coroutineContext);
                    B = u0Var.getCoroutineContext().B(c6);
                    m2Var = m2.f23662a;
                    bVar = new b(this.f28073w, coroutineContext, b6, h5, this.f28071u, this.f28074x, null);
                    this.f28070t = h5;
                    this.f28069s = 1;
                    g0Var = h5;
                } catch (AbortFlowException e7) {
                    e = e7;
                    g0Var = h5;
                } catch (Throwable th) {
                    th = th;
                    g0Var = h5;
                }
                try {
                } catch (AbortFlowException e8) {
                    e = e8;
                    g0Var2 = g0Var;
                    o.b(e, this.f28071u);
                    r12 = g0Var2;
                    g0.a.b(r12, null, 1, null);
                    return m2.f23662a;
                } catch (Throwable th2) {
                    th = th2;
                    r12 = g0Var;
                    g0.a.b(r12, null, 1, null);
                    throw th;
                }
                if (e.d(B, m2Var, null, bVar, this, 4, null) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                r12 = g0Var;
                g0.a.b(r12, null, 1, null);
                return m2.f23662a;
                o.b(e, this.f28071u);
                r12 = g0Var2;
                g0.a.b(r12, null, 1, null);
                return m2.f23662a;
            } catch (Throwable th3) {
                th = th3;
            }
        }

        @Override // q3.p
        @d5.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d5.d u0 u0Var, @d5.e Continuation<? super m2> continuation) {
            return ((c) c(u0Var, continuation)).A(m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.d
        public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
            c cVar = new c(this.f28071u, this.f28072v, this.f28073w, this.f28074x, continuation);
            cVar.f28070t = obj;
            return cVar;
        }
    }

    @d5.e
    @PublishedApi
    public static final <R, T> Object a(@d5.d kotlinx.coroutines.flow.j<? super R> jVar, @d5.d kotlinx.coroutines.flow.i<? extends T>[] iVarArr, @d5.d q3.a<T[]> aVar, @d5.d q3.q<? super kotlinx.coroutines.flow.j<? super R>, ? super T[], ? super Continuation<? super m2>, ? extends Object> qVar, @d5.d Continuation<? super m2> continuation) {
        Object a6 = n.a(new a(iVarArr, aVar, qVar, jVar, null), continuation);
        return a6 == CoroutineSingletons.COROUTINE_SUSPENDED ? a6 : m2.f23662a;
    }

    @d5.d
    public static final <T1, T2, R> kotlinx.coroutines.flow.i<R> b(@d5.d kotlinx.coroutines.flow.i<? extends T1> iVar, @d5.d kotlinx.coroutines.flow.i<? extends T2> iVar2, @d5.d q3.q<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> qVar) {
        return new b(iVar2, iVar, qVar);
    }
}
