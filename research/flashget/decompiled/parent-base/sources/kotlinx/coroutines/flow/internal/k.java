package kotlinx.coroutines.flow.internal;

import com.android.internal.telephony.cdma.UserData;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlin.w0;
import kotlinx.coroutines.b0;
import kotlinx.coroutines.channels.d0;
import kotlinx.coroutines.channels.e0;
import kotlinx.coroutines.internal.y0;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.s0;

/* compiled from: Combine.kt */
@Metadata(d1 = {"\u00008\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0092\u0001\u0010\u000e\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0014\u0010\u0005\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u00032\u0016\u0010\u0007\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0018\u00010\u00030\u000629\u0010\r\u001a5\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b¢\u0006\u0002\b\fH\u0081@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001ap\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00020\u0004\"\u0004\b\u0000\u0010\u0010\"\u0004\b\u0001\u0010\u0011\"\u0004\b\u0002\u0010\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042(\u0010\r\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015*\u001c\b\u0002\u0010\u0017\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00162\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"R", "T", "Lkotlinx/coroutines/flow/j;", "", "Lkotlinx/coroutines/flow/i;", "flows", "Lkotlin/Function0;", "arrayFactory", "Lkotlin/Function3;", "Lkotlin/coroutines/d;", "Lkotlin/k2;", "", "Lkotlin/u;", "transform", "a", "(Lkotlinx/coroutines/flow/j;[Lkotlinx/coroutines/flow/i;Lld/a;Lld/q;Lkotlin/coroutines/d;)Ljava/lang/Object;", "T1", "T2", "flow", "flow2", "b", "(Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lld/q;)Lkotlinx/coroutines/flow/i;", "Lkotlin/collections/r0;", "Update", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nCombine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Combine.kt\nkotlinx/coroutines/flow/internal/CombineKt\n+ 2 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,143:1\n107#2:144\n*S KotlinDebug\n*F\n+ 1 Combine.kt\nkotlinx/coroutines/flow/internal/CombineKt\n*L\n86#1:144\n*E\n"})
/* loaded from: classes7.dex */
public final class k {

    /* compiled from: Combine.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", f = "Combine.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {54, 76, 79}, m = "invokeSuspend", n = {"latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1"})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "T", "Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<r0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        Object f80079b;

        /* renamed from: c, reason: collision with root package name */
        Object f80080c;

        /* renamed from: d, reason: collision with root package name */
        int f80081d;

        /* renamed from: e, reason: collision with root package name */
        int f80082e;

        /* renamed from: f, reason: collision with root package name */
        int f80083f;

        /* renamed from: g, reason: collision with root package name */
        private /* synthetic */ Object f80084g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i<T>[] f80085h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ld.a<T[]> f80086i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ ld.q<kotlinx.coroutines.flow.j<? super R>, T[], kotlin.coroutines.d<? super k2>, Object> f80087j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.j<R> f80088k;

        /* compiled from: Combine.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", f = "Combine.kt", i = {}, l = {31}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "T", "Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: kotlinx.coroutines.flow.internal.k$a$a, reason: collision with other inner class name */
        static final class C1235a extends kotlin.coroutines.jvm.internal.o implements ld.p<r0, kotlin.coroutines.d<? super k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f80089b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.i<T>[] f80090c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f80091d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ AtomicInteger f80092e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.channels.l<kotlin.collections.r0<Object>> f80093f;

            /* compiled from: Combine.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "T", "value", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            /* renamed from: kotlinx.coroutines.flow.internal.k$a$a$a, reason: collision with other inner class name */
            static final class C1236a<T> implements kotlinx.coroutines.flow.j {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.channels.l<kotlin.collections.r0<Object>> f80094b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ int f80095c;

                /* compiled from: Combine.kt */
                @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1", f = "Combine.kt", i = {}, l = {32, 33}, m = "emit", n = {}, s = {})
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                /* renamed from: kotlinx.coroutines.flow.internal.k$a$a$a$a, reason: collision with other inner class name */
                static final class C1237a extends kotlin.coroutines.jvm.internal.d {

                    /* renamed from: b, reason: collision with root package name */
                    /* synthetic */ Object f80096b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ C1236a<T> f80097c;

                    /* renamed from: d, reason: collision with root package name */
                    int f80098d;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C1237a(C1236a<? super T> c1236a, kotlin.coroutines.d<? super C1237a> dVar) {
                        super(dVar);
                        this.f80097c = c1236a;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @fg.m
                    public final Object invokeSuspend(@fg.l Object obj) {
                        this.f80096b = obj;
                        this.f80098d |= Integer.MIN_VALUE;
                        return this.f80097c.emit(null, this);
                    }
                }

                C1236a(kotlinx.coroutines.channels.l<kotlin.collections.r0<Object>> lVar, int i4) {
                    this.f80094b = lVar;
                    this.f80095c = i4;
                }

                /* JADX WARN: Removed duplicated region for block: B:19:0x0057 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
                @Override // kotlinx.coroutines.flow.j
                @fg.m
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(T r7, @fg.l kotlin.coroutines.d<? super kotlin.k2> r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof kotlinx.coroutines.flow.internal.k.a.C1235a.C1236a.C1237a
                        if (r0 == 0) goto L13
                        r0 = r8
                        kotlinx.coroutines.flow.internal.k$a$a$a$a r0 = (kotlinx.coroutines.flow.internal.k.a.C1235a.C1236a.C1237a) r0
                        int r1 = r0.f80098d
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f80098d = r1
                        goto L18
                    L13:
                        kotlinx.coroutines.flow.internal.k$a$a$a$a r0 = new kotlinx.coroutines.flow.internal.k$a$a$a$a
                        r0.<init>(r6, r8)
                    L18:
                        java.lang.Object r8 = r0.f80096b
                        kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                        int r2 = r0.f80098d
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L3a
                        if (r2 == r4) goto L36
                        if (r2 != r3) goto L2a
                        kotlin.a1.n(r8)
                        goto L58
                    L2a:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "蜜\u0001"
                        java.lang.String r8 = com.flashget.parentalcontrol.ProtectedSandApp.s(r8)
                        r7.<init>(r8)
                        throw r7
                    L36:
                        kotlin.a1.n(r8)
                        goto L4f
                    L3a:
                        kotlin.a1.n(r8)
                        kotlinx.coroutines.channels.l<kotlin.collections.r0<java.lang.Object>> r8 = r6.f80094b
                        kotlin.collections.r0 r2 = new kotlin.collections.r0
                        int r5 = r6.f80095c
                        r2.<init>(r5, r7)
                        r0.f80098d = r4
                        java.lang.Object r7 = r8.f0(r2, r0)
                        if (r7 != r1) goto L4f
                        return r1
                    L4f:
                        r0.f80098d = r3
                        java.lang.Object r7 = kotlinx.coroutines.a4.a(r0)
                        if (r7 != r1) goto L58
                        return r1
                    L58:
                        kotlin.k2 r7 = kotlin.k2.f75408a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.k.a.C1235a.C1236a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C1235a(kotlinx.coroutines.flow.i<? extends T>[] iVarArr, int i4, AtomicInteger atomicInteger, kotlinx.coroutines.channels.l<kotlin.collections.r0<Object>> lVar, kotlin.coroutines.d<? super C1235a> dVar) {
                super(2, dVar);
                this.f80090c = iVarArr;
                this.f80091d = i4;
                this.f80092e = atomicInteger;
                this.f80093f = lVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                return new C1235a(this.f80090c, this.f80091d, this.f80092e, this.f80093f, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                AtomicInteger atomicInteger;
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f80089b;
                try {
                    if (i4 == 0) {
                        a1.n(obj);
                        kotlinx.coroutines.flow.i[] iVarArr = this.f80090c;
                        int i5 = this.f80091d;
                        kotlinx.coroutines.flow.i iVar = iVarArr[i5];
                        C1236a c1236a = new C1236a(this.f80093f, i5);
                        this.f80089b = 1;
                        if (iVar.a(c1236a, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i4 != 1) {
                            throw new IllegalStateException(ProtectedSandApp.s("蜝\u0001"));
                        }
                        a1.n(obj);
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        e0.a.a(this.f80093f, null, 1, null);
                    }
                    return k2.f75408a;
                } finally {
                    if (this.f80092e.decrementAndGet() == 0) {
                        e0.a.a(this.f80093f, null, 1, null);
                    }
                }
            }

            @Override // ld.p
            @fg.m
            public final Object invoke(@fg.l r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                return ((C1235a) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(kotlinx.coroutines.flow.i<? extends T>[] iVarArr, ld.a<T[]> aVar, ld.q<? super kotlinx.coroutines.flow.j<? super R>, ? super T[], ? super kotlin.coroutines.d<? super k2>, ? extends Object> qVar, kotlinx.coroutines.flow.j<? super R> jVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f80085h = iVarArr;
            this.f80086i = aVar;
            this.f80087j = qVar;
            this.f80088k = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f80085h, this.f80086i, this.f80087j, this.f80088k, dVar);
            aVar.f80084g = obj;
            return aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:13:0x00bf A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x00c0  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x00c9  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x00cc A[LOOP:0: B:19:0x00cc->B:37:?, LOOP_START, PHI: r6 r10
          0x00cc: PHI (r6v6 int) = (r6v5 int), (r6v7 int) binds: [B:16:0x00c7, B:37:?] A[DONT_GENERATE, DONT_INLINE]
          0x00cc: PHI (r10v8 kotlin.collections.r0) = (r10v7 kotlin.collections.r0), (r10v21 kotlin.collections.r0) binds: [B:16:0x00c7, B:37:?] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Type inference failed for: r15v0, types: [kotlinx.coroutines.flow.i<T>[], kotlinx.coroutines.flow.i[]] */
        /* JADX WARN: Type inference failed for: r2v7, types: [int] */
        /* JADX WARN: Type inference failed for: r2v9, types: [int] */
        /* JADX WARN: Type inference failed for: r6v0, types: [kotlinx.coroutines.flow.i<T>[]] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0137 -> B:10:0x0139). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r24) {
            /*
                Method dump skipped, instructions count: 316
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.k.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((a) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/v$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/k2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Combine.kt\nkotlinx/coroutines/flow/internal/CombineKt\n*L\n1#1,113:1\n87#2:114\n142#2:115\n*E\n"})
    public static final class b<R> implements kotlinx.coroutines.flow.i<R> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f80099b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f80100c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.q f80101d;

        public b(kotlinx.coroutines.flow.i iVar, kotlinx.coroutines.flow.i iVar2, ld.q qVar) {
            this.f80099b = iVar;
            this.f80100c = iVar2;
            this.f80101d = qVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @fg.m
        public Object a(@fg.l kotlinx.coroutines.flow.j<? super R> jVar, @fg.l kotlin.coroutines.d<? super k2> dVar) {
            Object g4 = s0.g(new c(jVar, this.f80099b, this.f80100c, this.f80101d, null), dVar);
            return g4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? g4 : k2.f75408a;
        }
    }

    /* compiled from: Combine.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1", f = "Combine.kt", i = {0}, l = {126}, m = "invokeSuspend", n = {"second"}, s = {"L$0"})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T1", "T2", "R", "Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.coroutines.jvm.internal.o implements ld.p<r0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f80102b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f80103c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.j<R> f80104d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i<T2> f80105e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i<T1> f80106f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.q<T1, T2, kotlin.coroutines.d<? super R>, Object> f80107g;

        /* compiled from: Combine.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T1", "T2", "R", "", "it", "Lkotlin/k2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class a extends n0 implements ld.l<Throwable, k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b0 f80108b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.j<R> f80109c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(b0 b0Var, kotlinx.coroutines.flow.j<? super R> jVar) {
                super(1);
                this.f80108b = b0Var;
                this.f80109c = jVar;
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ k2 invoke(Throwable th) {
                invoke2(th);
                return k2.f75408a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@fg.m Throwable th) {
                if (this.f80108b.isActive()) {
                    this.f80108b.b(new AbortFlowException(this.f80109c));
                }
            }
        }

        /* compiled from: Combine.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2", f = "Combine.kt", i = {}, l = {127}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T1", "T2", "R", "Lkotlin/k2;", "it", "<anonymous>", "(V)V"}, k = 3, mv = {1, 8, 0})
        static final class b extends kotlin.coroutines.jvm.internal.o implements ld.p<k2, kotlin.coroutines.d<? super k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f80110b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.i<T1> f80111c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ kotlin.coroutines.g f80112d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Object f80113e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ d0<Object> f80114f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.j<R> f80115g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ ld.q<T1, T2, kotlin.coroutines.d<? super R>, Object> f80116h;

            /* compiled from: Combine.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T1", "T2", "R", "value", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            static final class a<T> implements kotlinx.coroutines.flow.j {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ kotlin.coroutines.g f80117b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ Object f80118c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ d0<Object> f80119d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.flow.j<R> f80120e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ ld.q<T1, T2, kotlin.coroutines.d<? super R>, Object> f80121f;

                /* compiled from: Combine.kt */
                @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1", f = "Combine.kt", i = {}, l = {129, UserData.IS91_MSG_TYPE_CLI, UserData.IS91_MSG_TYPE_CLI}, m = "invokeSuspend", n = {}, s = {})
                @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T1", "T2", "R", "Lkotlin/k2;", "it", "<anonymous>", "(V)V"}, k = 3, mv = {1, 8, 0})
                @r1({"SMAP\nCombine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Combine.kt\nkotlinx/coroutines/flow/internal/CombineKt$zipImpl$1$1$2$1$1\n+ 2 Channel.kt\nkotlinx/coroutines/channels/ChannelKt\n+ 3 Symbol.kt\nkotlinx/coroutines/internal/Symbol\n*L\n1#1,143:1\n501#2,5:144\n18#3:149\n*S KotlinDebug\n*F\n+ 1 Combine.kt\nkotlinx/coroutines/flow/internal/CombineKt$zipImpl$1$1$2$1$1\n*L\n129#1:144,5\n132#1:149\n*E\n"})
                /* renamed from: kotlinx.coroutines.flow.internal.k$c$b$a$a, reason: collision with other inner class name */
                static final class C1238a extends kotlin.coroutines.jvm.internal.o implements ld.p<k2, kotlin.coroutines.d<? super k2>, Object> {

                    /* renamed from: b, reason: collision with root package name */
                    Object f80122b;

                    /* renamed from: c, reason: collision with root package name */
                    int f80123c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ d0<Object> f80124d;

                    /* renamed from: e, reason: collision with root package name */
                    final /* synthetic */ kotlinx.coroutines.flow.j<R> f80125e;

                    /* renamed from: f, reason: collision with root package name */
                    final /* synthetic */ ld.q<T1, T2, kotlin.coroutines.d<? super R>, Object> f80126f;

                    /* renamed from: g, reason: collision with root package name */
                    final /* synthetic */ T1 f80127g;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C1238a(d0<? extends Object> d0Var, kotlinx.coroutines.flow.j<? super R> jVar, ld.q<? super T1, ? super T2, ? super kotlin.coroutines.d<? super R>, ? extends Object> qVar, T1 t12, kotlin.coroutines.d<? super C1238a> dVar) {
                        super(2, dVar);
                        this.f80124d = d0Var;
                        this.f80125e = jVar;
                        this.f80126f = qVar;
                        this.f80127g = t12;
                    }

                    @Override // ld.p
                    @fg.m
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(@fg.l k2 k2Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                        return ((C1238a) create(k2Var, dVar)).invokeSuspend(k2.f75408a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @fg.l
                    public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                        return new C1238a(this.f80124d, this.f80125e, this.f80126f, this.f80127g, dVar);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:0x0070 A[RETURN] */
                    @Override // kotlin.coroutines.jvm.internal.a
                    @fg.m
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r9) {
                        /*
                            r8 = this;
                            kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                            int r1 = r8.f80123c
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
                            java.lang.String r0 = "蜟\u0001"
                            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
                            r9.<init>(r0)
                            throw r9
                        L20:
                            java.lang.Object r1 = r8.f80122b
                            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                            kotlin.a1.n(r9)
                            goto L66
                        L28:
                            kotlin.a1.n(r9)
                            kotlinx.coroutines.channels.p r9 = (kotlinx.coroutines.channels.p) r9
                            java.lang.Object r9 = r9.getHolder()
                            goto L40
                        L32:
                            kotlin.a1.n(r9)
                            kotlinx.coroutines.channels.d0<java.lang.Object> r9 = r8.f80124d
                            r8.f80123c = r5
                            java.lang.Object r9 = r9.V(r8)
                            if (r9 != r0) goto L40
                            return r0
                        L40:
                            kotlinx.coroutines.flow.j<R> r1 = r8.f80125e
                            boolean r5 = r9 instanceof kotlinx.coroutines.channels.p.c
                            if (r5 == 0) goto L52
                            java.lang.Throwable r9 = kotlinx.coroutines.channels.p.f(r9)
                            if (r9 != 0) goto L51
                            kotlinx.coroutines.flow.internal.AbortFlowException r9 = new kotlinx.coroutines.flow.internal.AbortFlowException
                            r9.<init>(r1)
                        L51:
                            throw r9
                        L52:
                            ld.q<T1, T2, kotlin.coroutines.d<? super R>, java.lang.Object> r5 = r8.f80126f
                            T1 r6 = r8.f80127g
                            kotlinx.coroutines.internal.s0 r7 = kotlinx.coroutines.flow.internal.s.f80148a
                            if (r9 != r7) goto L5b
                            r9 = r2
                        L5b:
                            r8.f80122b = r1
                            r8.f80123c = r4
                            java.lang.Object r9 = r5.R(r6, r9, r8)
                            if (r9 != r0) goto L66
                            return r0
                        L66:
                            r8.f80122b = r2
                            r8.f80123c = r3
                            java.lang.Object r9 = r1.emit(r9, r8)
                            if (r9 != r0) goto L71
                            return r0
                        L71:
                            kotlin.k2 r9 = kotlin.k2.f75408a
                            return r9
                        */
                        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.k.c.b.a.C1238a.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                /* compiled from: Combine.kt */
                @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1", f = "Combine.kt", i = {}, l = {128}, m = "emit", n = {}, s = {})
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                /* renamed from: kotlinx.coroutines.flow.internal.k$c$b$a$b, reason: collision with other inner class name */
                static final class C1239b extends kotlin.coroutines.jvm.internal.d {

                    /* renamed from: b, reason: collision with root package name */
                    /* synthetic */ Object f80128b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ a<T> f80129c;

                    /* renamed from: d, reason: collision with root package name */
                    int f80130d;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C1239b(a<? super T> aVar, kotlin.coroutines.d<? super C1239b> dVar) {
                        super(dVar);
                        this.f80129c = aVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @fg.m
                    public final Object invokeSuspend(@fg.l Object obj) {
                        this.f80128b = obj;
                        this.f80130d |= Integer.MIN_VALUE;
                        return this.f80129c.emit(null, this);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                a(kotlin.coroutines.g gVar, Object obj, d0<? extends Object> d0Var, kotlinx.coroutines.flow.j<? super R> jVar, ld.q<? super T1, ? super T2, ? super kotlin.coroutines.d<? super R>, ? extends Object> qVar) {
                    this.f80117b = gVar;
                    this.f80118c = obj;
                    this.f80119d = d0Var;
                    this.f80120e = jVar;
                    this.f80121f = qVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // kotlinx.coroutines.flow.j
                @fg.m
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(T1 r13, @fg.l kotlin.coroutines.d<? super kotlin.k2> r14) {
                    /*
                        r12 = this;
                        boolean r0 = r14 instanceof kotlinx.coroutines.flow.internal.k.c.b.a.C1239b
                        if (r0 == 0) goto L13
                        r0 = r14
                        kotlinx.coroutines.flow.internal.k$c$b$a$b r0 = (kotlinx.coroutines.flow.internal.k.c.b.a.C1239b) r0
                        int r1 = r0.f80130d
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f80130d = r1
                        goto L18
                    L13:
                        kotlinx.coroutines.flow.internal.k$c$b$a$b r0 = new kotlinx.coroutines.flow.internal.k$c$b$a$b
                        r0.<init>(r12, r14)
                    L18:
                        java.lang.Object r14 = r0.f80128b
                        kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                        int r2 = r0.f80130d
                        r3 = 1
                        if (r2 == 0) goto L33
                        if (r2 != r3) goto L27
                        kotlin.a1.n(r14)
                        goto L53
                    L27:
                        java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                        java.lang.String r14 = "蜠\u0001"
                        java.lang.String r14 = com.flashget.parentalcontrol.ProtectedSandApp.s(r14)
                        r13.<init>(r14)
                        throw r13
                    L33:
                        kotlin.a1.n(r14)
                        kotlin.coroutines.g r14 = r12.f80117b
                        kotlin.k2 r2 = kotlin.k2.f75408a
                        java.lang.Object r4 = r12.f80118c
                        kotlinx.coroutines.flow.internal.k$c$b$a$a r11 = new kotlinx.coroutines.flow.internal.k$c$b$a$a
                        kotlinx.coroutines.channels.d0<java.lang.Object> r6 = r12.f80119d
                        kotlinx.coroutines.flow.j<R> r7 = r12.f80120e
                        ld.q<T1, T2, kotlin.coroutines.d<? super R>, java.lang.Object> r8 = r12.f80121f
                        r10 = 0
                        r5 = r11
                        r9 = r13
                        r5.<init>(r6, r7, r8, r9, r10)
                        r0.f80130d = r3
                        java.lang.Object r13 = kotlinx.coroutines.flow.internal.e.c(r14, r2, r4, r11, r0)
                        if (r13 != r1) goto L53
                        return r1
                    L53:
                        kotlin.k2 r13 = kotlin.k2.f75408a
                        return r13
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.k.c.b.a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(kotlinx.coroutines.flow.i<? extends T1> iVar, kotlin.coroutines.g gVar, Object obj, d0<? extends Object> d0Var, kotlinx.coroutines.flow.j<? super R> jVar, ld.q<? super T1, ? super T2, ? super kotlin.coroutines.d<? super R>, ? extends Object> qVar, kotlin.coroutines.d<? super b> dVar) {
                super(2, dVar);
                this.f80111c = iVar;
                this.f80112d = gVar;
                this.f80113e = obj;
                this.f80114f = d0Var;
                this.f80115g = jVar;
                this.f80116h = qVar;
            }

            @Override // ld.p
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@fg.l k2 k2Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                return ((b) create(k2Var, dVar)).invokeSuspend(k2.f75408a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                return new b(this.f80111c, this.f80112d, this.f80113e, this.f80114f, this.f80115g, this.f80116h, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f80110b;
                if (i4 == 0) {
                    a1.n(obj);
                    kotlinx.coroutines.flow.i<T1> iVar = this.f80111c;
                    a aVar2 = new a(this.f80112d, this.f80113e, this.f80114f, this.f80115g, this.f80116h);
                    this.f80110b = 1;
                    if (iVar.a(aVar2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException(ProtectedSandApp.s("蜡\u0001"));
                    }
                    a1.n(obj);
                }
                return k2.f75408a;
            }
        }

        /* compiled from: Combine.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1", f = "Combine.kt", i = {}, l = {89}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T1", "T2", "R", "Lkotlinx/coroutines/channels/b0;", "", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/channels/b0;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: kotlinx.coroutines.flow.internal.k$c$c, reason: collision with other inner class name */
        static final class C1240c extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.channels.b0<? super Object>, kotlin.coroutines.d<? super k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f80131b;

            /* renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f80132c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.i<T2> f80133d;

            /* compiled from: Combine.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T1", "T2", "R", "value", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            /* renamed from: kotlinx.coroutines.flow.internal.k$c$c$a */
            static final class a<T> implements kotlinx.coroutines.flow.j {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.channels.b0<Object> f80134b;

                /* compiled from: Combine.kt */
                @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1$1", f = "Combine.kt", i = {}, l = {90}, m = "emit", n = {}, s = {})
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                /* renamed from: kotlinx.coroutines.flow.internal.k$c$c$a$a, reason: collision with other inner class name */
                static final class C1241a extends kotlin.coroutines.jvm.internal.d {

                    /* renamed from: b, reason: collision with root package name */
                    /* synthetic */ Object f80135b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ a<T> f80136c;

                    /* renamed from: d, reason: collision with root package name */
                    int f80137d;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C1241a(a<? super T> aVar, kotlin.coroutines.d<? super C1241a> dVar) {
                        super(dVar);
                        this.f80136c = aVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @fg.m
                    public final Object invokeSuspend(@fg.l Object obj) {
                        this.f80135b = obj;
                        this.f80137d |= Integer.MIN_VALUE;
                        return this.f80136c.emit(null, this);
                    }
                }

                a(kotlinx.coroutines.channels.b0<Object> b0Var) {
                    this.f80134b = b0Var;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // kotlinx.coroutines.flow.j
                @fg.m
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(T2 r5, @fg.l kotlin.coroutines.d<? super kotlin.k2> r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof kotlinx.coroutines.flow.internal.k.c.C1240c.a.C1241a
                        if (r0 == 0) goto L13
                        r0 = r6
                        kotlinx.coroutines.flow.internal.k$c$c$a$a r0 = (kotlinx.coroutines.flow.internal.k.c.C1240c.a.C1241a) r0
                        int r1 = r0.f80137d
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f80137d = r1
                        goto L18
                    L13:
                        kotlinx.coroutines.flow.internal.k$c$c$a$a r0 = new kotlinx.coroutines.flow.internal.k$c$c$a$a
                        r0.<init>(r4, r6)
                    L18:
                        java.lang.Object r6 = r0.f80135b
                        kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                        int r2 = r0.f80137d
                        r3 = 1
                        if (r2 == 0) goto L33
                        if (r2 != r3) goto L27
                        kotlin.a1.n(r6)
                        goto L49
                    L27:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "蜢\u0001"
                        java.lang.String r6 = com.flashget.parentalcontrol.ProtectedSandApp.s(r6)
                        r5.<init>(r6)
                        throw r5
                    L33:
                        kotlin.a1.n(r6)
                        kotlinx.coroutines.channels.b0<java.lang.Object> r6 = r4.f80134b
                        kotlinx.coroutines.channels.e0 r6 = r6.a()
                        if (r5 != 0) goto L40
                        kotlinx.coroutines.internal.s0 r5 = kotlinx.coroutines.flow.internal.s.f80148a
                    L40:
                        r0.f80137d = r3
                        java.lang.Object r5 = r6.f0(r5, r0)
                        if (r5 != r1) goto L49
                        return r1
                    L49:
                        kotlin.k2 r5 = kotlin.k2.f75408a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.k.c.C1240c.a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C1240c(kotlinx.coroutines.flow.i<? extends T2> iVar, kotlin.coroutines.d<? super C1240c> dVar) {
                super(2, dVar);
                this.f80133d = iVar;
            }

            @Override // ld.p
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@fg.l kotlinx.coroutines.channels.b0<Object> b0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                return ((C1240c) create(b0Var, dVar)).invokeSuspend(k2.f75408a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                C1240c c1240c = new C1240c(this.f80133d, dVar);
                c1240c.f80132c = obj;
                return c1240c;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f80131b;
                if (i4 == 0) {
                    a1.n(obj);
                    kotlinx.coroutines.channels.b0 b0Var = (kotlinx.coroutines.channels.b0) this.f80132c;
                    kotlinx.coroutines.flow.i<T2> iVar = this.f80133d;
                    a aVar2 = new a(b0Var);
                    this.f80131b = 1;
                    if (iVar.a(aVar2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException(ProtectedSandApp.s("蜣\u0001"));
                    }
                    a1.n(obj);
                }
                return k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(kotlinx.coroutines.flow.j<? super R> jVar, kotlinx.coroutines.flow.i<? extends T2> iVar, kotlinx.coroutines.flow.i<? extends T1> iVar2, ld.q<? super T1, ? super T2, ? super kotlin.coroutines.d<? super R>, ? extends Object> qVar, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f80104d = jVar;
            this.f80105e = iVar;
            this.f80106f = iVar2;
            this.f80107g = qVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            c cVar = new c(this.f80104d, this.f80105e, this.f80106f, this.f80107g, dVar);
            cVar.f80103c = obj;
            return cVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v12, types: [kotlinx.coroutines.channels.d0] */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v18 */
        /* JADX WARN: Type inference failed for: r1v19 */
        /* JADX WARN: Type inference failed for: r1v2, types: [kotlinx.coroutines.channels.d0] */
        /* JADX WARN: Type inference failed for: r1v5 */
        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            b0 c5;
            d0 d0Var;
            d0 d0Var2;
            kotlin.coroutines.g O;
            k2 k2Var;
            b bVar;
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            ?? r12 = this.f80102b;
            try {
                if (r12 != 0) {
                    if (r12 != 1) {
                        throw new IllegalStateException(ProtectedSandApp.s("蜤\u0001"));
                    }
                    d0Var2 = (d0) this.f80103c;
                    try {
                        a1.n(obj);
                        r12 = d0Var2;
                    } catch (AbortFlowException e4) {
                        e = e4;
                    }
                    d0.a.b(r12, null, 1, null);
                    return k2.f75408a;
                }
                a1.n(obj);
                r0 r0Var = (r0) this.f80103c;
                d0 h4 = kotlinx.coroutines.channels.z.h(r0Var, null, 0, new C1240c(this.f80105e, null), 3, null);
                c5 = p2.c(null, 1, null);
                l0.n(h4, ProtectedSandApp.s("蜥\u0001"));
                ((e0) h4).d0(new a(c5, this.f80104d));
                try {
                    kotlin.coroutines.g coroutineContext = r0Var.getCoroutineContext();
                    Object b5 = y0.b(coroutineContext);
                    O = r0Var.getCoroutineContext().O(c5);
                    k2Var = k2.f75408a;
                    bVar = new b(this.f80106f, coroutineContext, b5, h4, this.f80104d, this.f80107g, null);
                    this.f80103c = h4;
                    this.f80102b = 1;
                    d0Var = h4;
                } catch (AbortFlowException e5) {
                    e = e5;
                    d0Var = h4;
                } catch (Throwable th) {
                    th = th;
                    d0Var = h4;
                }
                try {
                } catch (AbortFlowException e6) {
                    e = e6;
                    d0Var2 = d0Var;
                    o.b(e, this.f80104d);
                    r12 = d0Var2;
                    d0.a.b(r12, null, 1, null);
                    return k2.f75408a;
                } catch (Throwable th2) {
                    th = th2;
                    r12 = d0Var;
                    d0.a.b(r12, null, 1, null);
                    throw th;
                }
                if (e.d(O, k2Var, null, bVar, this, 4, null) == aVar) {
                    return aVar;
                }
                r12 = d0Var;
                d0.a.b(r12, null, 1, null);
                return k2.f75408a;
                o.b(e, this.f80104d);
                r12 = d0Var2;
                d0.a.b(r12, null, 1, null);
                return k2.f75408a;
            } catch (Throwable th3) {
                th = th3;
            }
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((c) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    @fg.m
    @w0
    public static final <R, T> Object a(@fg.l kotlinx.coroutines.flow.j<? super R> jVar, @fg.l kotlinx.coroutines.flow.i<? extends T>[] iVarArr, @fg.l ld.a<T[]> aVar, @fg.l ld.q<? super kotlinx.coroutines.flow.j<? super R>, ? super T[], ? super kotlin.coroutines.d<? super k2>, ? extends Object> qVar, @fg.l kotlin.coroutines.d<? super k2> dVar) {
        Object a5 = n.a(new a(iVarArr, aVar, qVar, jVar, null), dVar);
        return a5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? a5 : k2.f75408a;
    }

    @fg.l
    public static final <T1, T2, R> kotlinx.coroutines.flow.i<R> b(@fg.l kotlinx.coroutines.flow.i<? extends T1> iVar, @fg.l kotlinx.coroutines.flow.i<? extends T2> iVar2, @fg.l ld.q<? super T1, ? super T2, ? super kotlin.coroutines.d<? super R>, ? extends Object> qVar) {
        return new b(iVar2, iVar, qVar);
    }
}
