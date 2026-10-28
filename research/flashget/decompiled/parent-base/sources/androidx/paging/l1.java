package androidx.paging;

import java.util.List;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: Separators.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ag\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00028\u0000*\b\u0012\u0004\u0012\u00028\u00010\u00032.\u0010\u0006\u001a*\b\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0004H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a?\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0002*\u00020\u00002\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001aK\u0010\u0013\u001a\u00020\u0012\"\b\b\u0000\u0010\u0002*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00112\b\u0010\t\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001am\u0010\u0017\u001a\u00020\u0012\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00028\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00112\b\u0010\t\u001a\u0004\u0018\u00018\u00002\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00032\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001az\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u001a0\u0019\"\b\b\u0000\u0010\u0002*\u00028\u0001\"\b\b\u0001\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001a0\u00192\u0006\u0010\u001c\u001a\u00020\u001b2.\u0010\u0006\u001a*\b\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"", "R", "T", "Landroidx/paging/t1;", "Lkotlin/Function3;", "Lkotlin/coroutines/d;", "generator", "d", "(Landroidx/paging/t1;Lld/q;Lkotlin/coroutines/d;)Ljava/lang/Object;", "separator", "", "originalPageOffsets", "", "hintOriginalPageOffset", "hintOriginalIndex", "e", "(Ljava/lang/Object;[III)Landroidx/paging/t1;", "", "Lkotlin/k2;", "b", "(Ljava/util/List;Ljava/lang/Object;[III)V", "adjacentPageBefore", "adjacentPageAfter", "a", "(Ljava/util/List;Ljava/lang/Object;Landroidx/paging/t1;Landroidx/paging/t1;II)V", "Lkotlinx/coroutines/flow/i;", "Landroidx/paging/l0;", "Landroidx/paging/s1;", "terminalSeparatorType", "c", "(Lkotlinx/coroutines/flow/i;Landroidx/paging/s1;Lld/q;)Lkotlinx/coroutines/flow/i;", "paging-common"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class l1 {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/k2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx/coroutines/flow/a0$f", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a<R> implements kotlinx.coroutines.flow.i<l0<R>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f31883b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k1 f31884c;

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* compiled from: Collect.kt */
        @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0006"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/j;", "value", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx/coroutines/flow/a0$f$b", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
        /* renamed from: androidx.paging.l1$a$a, reason: collision with other inner class name */
        public static final class C0544a<T> implements kotlinx.coroutines.flow.j<l0<T>> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.j f31885b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ k1 f31886c;

            @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.SeparatorsKt$insertEventSeparators$$inlined$map$1$2", f = "Separators.kt", i = {}, l = {137, 137}, m = "emit", n = {}, s = {})
            @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
            /* renamed from: androidx.paging.l1$a$a$a, reason: collision with other inner class name */
            public static final class C0545a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: b, reason: collision with root package name */
                /* synthetic */ Object f31887b;

                /* renamed from: c, reason: collision with root package name */
                int f31888c;

                /* renamed from: d, reason: collision with root package name */
                Object f31889d;

                public C0545a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                public final Object invokeSuspend(@fg.l Object obj) {
                    this.f31887b = obj;
                    this.f31888c |= Integer.MIN_VALUE;
                    return C0544a.this.emit(null, this);
                }
            }

            public C0544a(kotlinx.coroutines.flow.j jVar, k1 k1Var) {
                this.f31885b = jVar;
                this.f31886c = k1Var;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
            @Override // kotlinx.coroutines.flow.j
            @fg.m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.lang.Object emit(java.lang.Object r7, @fg.l kotlin.coroutines.d r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof androidx.paging.l1.a.C0544a.C0545a
                    if (r0 == 0) goto L13
                    r0 = r8
                    androidx.paging.l1$a$a$a r0 = (androidx.paging.l1.a.C0544a.C0545a) r0
                    int r1 = r0.f31888c
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f31888c = r1
                    goto L18
                L13:
                    androidx.paging.l1$a$a$a r0 = new androidx.paging.l1$a$a$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f31887b
                    kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                    int r2 = r0.f31888c
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3a
                    if (r2 == r4) goto L32
                    if (r2 != r3) goto L2a
                    kotlin.a1.n(r8)
                    goto L5d
                L2a:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L32:
                    java.lang.Object r7 = r0.f31889d
                    kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.j) r7
                    kotlin.a1.n(r8)
                    goto L51
                L3a:
                    kotlin.a1.n(r8)
                    kotlinx.coroutines.flow.j r8 = r6.f31885b
                    androidx.paging.l0 r7 = (androidx.paging.l0) r7
                    androidx.paging.k1 r2 = r6.f31886c
                    r0.f31889d = r8
                    r0.f31888c = r4
                    java.lang.Object r7 = r2.n(r7, r0)
                    if (r7 != r1) goto L4e
                    return r1
                L4e:
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L51:
                    r2 = 0
                    r0.f31889d = r2
                    r0.f31888c = r3
                    java.lang.Object r7 = r7.emit(r8, r0)
                    if (r7 != r1) goto L5d
                    return r1
                L5d:
                    kotlin.k2 r7 = kotlin.k2.f75408a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.l1.a.C0544a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        public a(kotlinx.coroutines.flow.i iVar, k1 k1Var) {
            this.f31883b = iVar;
            this.f31884c = k1Var;
        }

        @Override // kotlinx.coroutines.flow.i
        @fg.m
        public Object a(@fg.l kotlinx.coroutines.flow.j jVar, @fg.l kotlin.coroutines.d dVar) {
            Object a5 = this.f31883b.a(new C0544a(jVar, this.f31884c), dVar);
            return a5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? a5 : k2.f75408a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    /* compiled from: Separators.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.SeparatorsKt$insertEventSeparators$separatorState$1", f = "Separators.kt", i = {}, l = {580}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0002*\u0002H\u0001\"\b\b\u0001\u0010\u0001*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u0001H\u00022\b\u0010\u0005\u001a\u0004\u0018\u0001H\u0002H\u008a@"}, d2 = {"<anonymous>", "R", "T", "", "before", "after"}, k = 3, mv = {1, 5, 1}, xi = 48)
    static final class b<R, T> extends kotlin.coroutines.jvm.internal.o implements ld.q<T, T, kotlin.coroutines.d<? super R>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f31891b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f31892c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f31893d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.q<T, T, kotlin.coroutines.d<? super R>, Object> f31894e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(ld.q<? super T, ? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> qVar, kotlin.coroutines.d<? super b> dVar) {
            super(3, dVar);
            this.f31894e = qVar;
        }

        @Override // ld.q
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object R(@fg.m T t4, @fg.m T t5, @fg.m kotlin.coroutines.d<? super R> dVar) {
            b bVar = new b(this.f31894e, dVar);
            bVar.f31892c = t4;
            bVar.f31893d = t5;
            return bVar.invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f31891b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                Object obj2 = this.f31892c;
                Object obj3 = this.f31893d;
                ld.q<T, T, kotlin.coroutines.d<? super R>, Object> qVar = this.f31894e;
                this.f31892c = null;
                this.f31891b = 1;
                obj = qVar.R(obj2, obj3, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
            }
            return obj;
        }
    }

    /* compiled from: Separators.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.SeparatorsKt", f = "Separators.kt", i = {0, 0, 0, 0, 0, 0}, l = {81}, m = "insertInternalSeparators", n = {"$this$insertInternalSeparators", "generator", "outputList", "outputIndices", "item", "i"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$2"})
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class c<R, T extends R> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f31895b;

        /* renamed from: c, reason: collision with root package name */
        Object f31896c;

        /* renamed from: d, reason: collision with root package name */
        Object f31897d;

        /* renamed from: e, reason: collision with root package name */
        Object f31898e;

        /* renamed from: f, reason: collision with root package name */
        Object f31899f;

        /* renamed from: g, reason: collision with root package name */
        int f31900g;

        /* renamed from: h, reason: collision with root package name */
        int f31901h;

        /* renamed from: i, reason: collision with root package name */
        int f31902i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f31903j;

        /* renamed from: k, reason: collision with root package name */
        int f31904k;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f31903j = obj;
            this.f31904k |= Integer.MIN_VALUE;
            return l1.d(null, null, this);
        }
    }

    public static final <R, T extends R> void a(@fg.l List<t1<R>> list, @fg.m R r4, @fg.m t1<T> t1Var, @fg.m t1<T> t1Var2, int i4, int i5) {
        kotlin.jvm.internal.l0.p(list, "<this>");
        int[] k4 = t1Var == null ? null : t1Var.k();
        int[] k5 = t1Var2 != null ? t1Var2.k() : null;
        if (k4 != null && k5 != null) {
            k4 = kotlin.collections.w.U5(kotlin.collections.w.q5(kotlin.collections.l.R8(kotlin.collections.l.s3(k4, k5))));
        } else if (k4 == null && k5 != null) {
            k4 = k5;
        } else if (k4 == null || k5 != null) {
            throw new IllegalArgumentException("Separator page expected adjacentPageBefore or adjacentPageAfter, but both were null.");
        }
        b(list, r4, k4, i4, i5);
    }

    public static final <T> void b(@fg.l List<t1<T>> list, @fg.m T t4, @fg.l int[] originalPageOffsets, int i4, int i5) {
        kotlin.jvm.internal.l0.p(list, "<this>");
        kotlin.jvm.internal.l0.p(originalPageOffsets, "originalPageOffsets");
        if (t4 == null) {
            return;
        }
        list.add(e(t4, originalPageOffsets, i4, i5));
    }

    @fg.l
    public static final <T extends R, R> kotlinx.coroutines.flow.i<l0<R>> c(@fg.l kotlinx.coroutines.flow.i<? extends l0<T>> iVar, @fg.l s1 terminalSeparatorType, @fg.l ld.q<? super T, ? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> generator) {
        kotlin.jvm.internal.l0.p(iVar, "<this>");
        kotlin.jvm.internal.l0.p(terminalSeparatorType, "terminalSeparatorType");
        kotlin.jvm.internal.l0.p(generator, "generator");
        return new a(iVar, new k1(terminalSeparatorType, new b(generator, null)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00d7 -> B:10:0x00e0). Please report as a decompilation issue!!! */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <R, T extends R> java.lang.Object d(@fg.l androidx.paging.t1<T> r12, @fg.l ld.q<? super T, ? super T, ? super kotlin.coroutines.d<? super R>, ? extends java.lang.Object> r13, @fg.l kotlin.coroutines.d<? super androidx.paging.t1<R>> r14) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.l1.d(androidx.paging.t1, ld.q, kotlin.coroutines.d):java.lang.Object");
    }

    @fg.l
    public static final <T> t1<T> e(@fg.l T separator, @fg.l int[] originalPageOffsets, int i4, int i5) {
        kotlin.jvm.internal.l0.p(separator, "separator");
        kotlin.jvm.internal.l0.p(originalPageOffsets, "originalPageOffsets");
        return new t1<>(originalPageOffsets, kotlin.collections.w.k(separator), i4, kotlin.collections.w.k(Integer.valueOf(i5)));
    }
}
