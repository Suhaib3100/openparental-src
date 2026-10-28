package androidx.paging;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: PagingDataTransforms.kt */
@kd.i(name = "PagingDataTransforms")
@Metadata(d1 = {"\u0000H\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001ai\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000320\b\u0004\u0010\u0007\u001a*\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00050\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0004H\u0082\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001aZ\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\t\u001aO\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a`\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032(\u0010\u0007\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00100\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\t\u001aU\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00100\rH\u0007¢\u0006\u0004\b\u0012\u0010\u000f\u001aP\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\"\u0010\u0014\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\t\u001aE\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130\rH\u0007¢\u0006\u0004\b\u0016\u0010\u000f\u001ap\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00028\u0001\"\b\b\u0001\u0010\u0002*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00172.\u0010\u001a\u001a*\b\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001ae\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0002*\u00020\u0000\"\b\b\u0001\u0010\u0001*\u00028\u0000*\b\u0012\u0004\u0012\u00028\u00010\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u000b2\u001e\u0010\u001a\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004H\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u001a;\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00028\u0000H\u0007¢\u0006\u0004\b \u0010!\u001a;\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\"\u0010!\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, d2 = {"", "T", "R", "Landroidx/paging/y0;", "Lkotlin/Function2;", "Landroidx/paging/l0;", "Lkotlin/coroutines/d;", "transform", "r", "(Landroidx/paging/y0;Lld/p;)Landroidx/paging/y0;", "q", "Ljava/util/concurrent/Executor;", "executor", "Lkotlin/Function1;", "p", "(Landroidx/paging/y0;Ljava/util/concurrent/Executor;Lld/l;)Landroidx/paging/y0;", "", "d", "c", "", "predicate", "b", "a", "Landroidx/paging/s1;", "terminalSeparatorType", "Lkotlin/Function3;", "generator", "l", "(Landroidx/paging/y0;Landroidx/paging/s1;Lld/q;)Landroidx/paging/y0;", "k", "(Landroidx/paging/y0;Landroidx/paging/s1;Ljava/util/concurrent/Executor;Lld/p;)Landroidx/paging/y0;", "item", "h", "(Landroidx/paging/y0;Landroidx/paging/s1;Ljava/lang/Object;)Landroidx/paging/y0;", "e", "paging-common"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class a1 {

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/k2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "androidx/paging/a1$m", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a implements kotlinx.coroutines.flow.i<l0<Object>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f31445b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p f31446c;

        /* compiled from: Collect.kt */
        @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0006"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/j;", "value", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "androidx/paging/a1$m$b", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
        /* renamed from: androidx.paging.a1$a$a, reason: collision with other inner class name */
        public static final class C0520a implements kotlinx.coroutines.flow.j<l0<Object>> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.j f31447b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ld.p f31448c;

            @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PagingDataTransforms$filter$$inlined$transform$1$2", f = "PagingDataTransforms.kt", i = {}, l = {138, 138}, m = "emit", n = {}, s = {})
            @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
            /* renamed from: androidx.paging.a1$a$a$a, reason: collision with other inner class name */
            public static final class C0521a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: b, reason: collision with root package name */
                /* synthetic */ Object f31449b;

                /* renamed from: c, reason: collision with root package name */
                int f31450c;

                /* renamed from: d, reason: collision with root package name */
                Object f31451d;

                public C0521a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                public final Object invokeSuspend(@fg.l Object obj) {
                    this.f31449b = obj;
                    this.f31450c |= Integer.MIN_VALUE;
                    return C0520a.this.emit(null, this);
                }
            }

            public C0520a(kotlinx.coroutines.flow.j jVar, ld.p pVar) {
                this.f31447b = jVar;
                this.f31448c = pVar;
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
            public java.lang.Object emit(androidx.paging.l0<java.lang.Object> r7, @fg.l kotlin.coroutines.d r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof androidx.paging.a1.a.C0520a.C0521a
                    if (r0 == 0) goto L13
                    r0 = r8
                    androidx.paging.a1$a$a$a r0 = (androidx.paging.a1.a.C0520a.C0521a) r0
                    int r1 = r0.f31450c
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f31450c = r1
                    goto L18
                L13:
                    androidx.paging.a1$a$a$a r0 = new androidx.paging.a1$a$a$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f31449b
                    kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                    int r2 = r0.f31450c
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
                    java.lang.Object r7 = r0.f31451d
                    kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.j) r7
                    kotlin.a1.n(r8)
                    goto L51
                L3a:
                    kotlin.a1.n(r8)
                    kotlinx.coroutines.flow.j r8 = r6.f31447b
                    androidx.paging.l0 r7 = (androidx.paging.l0) r7
                    ld.p r2 = r6.f31448c
                    r0.f31451d = r8
                    r0.f31450c = r4
                    java.lang.Object r7 = r7.a(r2, r0)
                    if (r7 != r1) goto L4e
                    return r1
                L4e:
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L51:
                    r2 = 0
                    r0.f31451d = r2
                    r0.f31450c = r3
                    java.lang.Object r7 = r7.emit(r8, r0)
                    if (r7 != r1) goto L5d
                    return r1
                L5d:
                    kotlin.k2 r7 = kotlin.k2.f75408a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.a1.a.C0520a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        public a(kotlinx.coroutines.flow.i iVar, ld.p pVar) {
            this.f31445b = iVar;
            this.f31446c = pVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @fg.m
        public Object a(@fg.l kotlinx.coroutines.flow.j<? super l0<Object>> jVar, @fg.l kotlin.coroutines.d dVar) {
            Object a5 = this.f31445b.a(new C0520a(jVar, this.f31446c), dVar);
            return a5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? a5 : k2.f75408a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/k2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "androidx/paging/a1$m", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b<T> implements kotlinx.coroutines.flow.i<l0<T>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f31453b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Executor f31454c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.l f31455d;

        /* compiled from: Collect.kt */
        @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0006"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/j;", "value", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "androidx/paging/a1$m$b", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class a implements kotlinx.coroutines.flow.j<l0<T>> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.j f31456b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Executor f31457c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ ld.l f31458d;

            @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PagingDataTransforms$filter$$inlined$transform$2$2", f = "PagingDataTransforms.kt", i = {}, l = {138, 138}, m = "emit", n = {}, s = {})
            @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
            /* renamed from: androidx.paging.a1$b$a$a, reason: collision with other inner class name */
            public static final class C0522a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: b, reason: collision with root package name */
                /* synthetic */ Object f31459b;

                /* renamed from: c, reason: collision with root package name */
                int f31460c;

                /* renamed from: d, reason: collision with root package name */
                Object f31461d;

                public C0522a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                public final Object invokeSuspend(@fg.l Object obj) {
                    this.f31459b = obj;
                    this.f31460c |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(kotlinx.coroutines.flow.j jVar, Executor executor, ld.l lVar) {
                this.f31456b = jVar;
                this.f31457c = executor;
                this.f31458d = lVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0067 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // kotlinx.coroutines.flow.j
            @fg.m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.lang.Object emit(java.lang.Object r10, @fg.l kotlin.coroutines.d r11) {
                /*
                    r9 = this;
                    boolean r0 = r11 instanceof androidx.paging.a1.b.a.C0522a
                    if (r0 == 0) goto L13
                    r0 = r11
                    androidx.paging.a1$b$a$a r0 = (androidx.paging.a1.b.a.C0522a) r0
                    int r1 = r0.f31460c
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f31460c = r1
                    goto L18
                L13:
                    androidx.paging.a1$b$a$a r0 = new androidx.paging.a1$b$a$a
                    r0.<init>(r11)
                L18:
                    java.lang.Object r11 = r0.f31459b
                    kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                    int r2 = r0.f31460c
                    r3 = 0
                    r4 = 2
                    r5 = 1
                    if (r2 == 0) goto L3b
                    if (r2 == r5) goto L33
                    if (r2 != r4) goto L2b
                    kotlin.a1.n(r11)
                    goto L68
                L2b:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r11)
                    throw r10
                L33:
                    java.lang.Object r10 = r0.f31461d
                    kotlinx.coroutines.flow.j r10 = (kotlinx.coroutines.flow.j) r10
                    kotlin.a1.n(r11)
                    goto L5d
                L3b:
                    kotlin.a1.n(r11)
                    kotlinx.coroutines.flow.j r11 = r9.f31456b
                    androidx.paging.l0 r10 = (androidx.paging.l0) r10
                    java.util.concurrent.Executor r2 = r9.f31457c
                    kotlinx.coroutines.m0 r2 = kotlinx.coroutines.y1.c(r2)
                    androidx.paging.a1$c r6 = new androidx.paging.a1$c
                    ld.l r7 = r9.f31458d
                    r6.<init>(r10, r7, r3)
                    r0.f31461d = r11
                    r0.f31460c = r5
                    java.lang.Object r10 = kotlinx.coroutines.i.h(r2, r6, r0)
                    if (r10 != r1) goto L5a
                    return r1
                L5a:
                    r8 = r11
                    r11 = r10
                    r10 = r8
                L5d:
                    r0.f31461d = r3
                    r0.f31460c = r4
                    java.lang.Object r10 = r10.emit(r11, r0)
                    if (r10 != r1) goto L68
                    return r1
                L68:
                    kotlin.k2 r10 = kotlin.k2.f75408a
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.a1.b.a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        public b(kotlinx.coroutines.flow.i iVar, Executor executor, ld.l lVar) {
            this.f31453b = iVar;
            this.f31454c = executor;
            this.f31455d = lVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @fg.m
        public Object a(@fg.l kotlinx.coroutines.flow.j jVar, @fg.l kotlin.coroutines.d dVar) {
            Object a5 = this.f31453b.a(new a(jVar, this.f31454c, this.f31455d), dVar);
            return a5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? a5 : k2.f75408a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: PagingDataTransforms.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PagingDataTransforms$filter$2$1", f = "PagingDataTransforms.kt", i = {}, l = {108}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "T", "Lkotlinx/coroutines/r0;", "Landroidx/paging/l0;", "<anonymous>", "(Lkotlinx/coroutines/r0;)Landroidx/paging/l0;"}, k = 3, mv = {1, 5, 1})
    static final class c<T> extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super l0<T>>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f31463b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ l0<T> f31464c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.l<T, Boolean> f31465d;

        /* compiled from: PagingDataTransforms.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PagingDataTransforms$filter$2$1$1", f = "PagingDataTransforms.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@"}, d2 = {"<anonymous>", "", "T", "", "it"}, k = 3, mv = {1, 5, 1}, xi = 48)
        static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<T, kotlin.coroutines.d<? super Boolean>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f31466b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f31467c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ ld.l<T, Boolean> f31468d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(ld.l<? super T, Boolean> lVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f31468d = lVar;
            }

            @Override // ld.p
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@fg.l T t4, @fg.m kotlin.coroutines.d<? super Boolean> dVar) {
                return ((a) create(t4, dVar)).invokeSuspend(k2.f75408a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f31468d, dVar);
                aVar.f31467c = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                if (this.f31466b != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
                return this.f31468d.invoke(this.f31467c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(l0<T> l0Var, ld.l<? super T, Boolean> lVar, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f31464c = l0Var;
            this.f31465d = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return new c(this.f31464c, this.f31465d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f31463b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                l0<T> l0Var = this.f31464c;
                a aVar2 = new a(this.f31465d, null);
                this.f31463b = 1;
                obj = l0Var.a(aVar2, this);
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

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super l0<T>> dVar) {
            return ((c) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/k2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "androidx/paging/a1$m", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class d implements kotlinx.coroutines.flow.i<l0<Object>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f31469b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p f31470c;

        /* compiled from: Collect.kt */
        @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0006"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/j;", "value", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "androidx/paging/a1$m$b", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class a implements kotlinx.coroutines.flow.j<l0<Object>> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.j f31471b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ld.p f31472c;

            @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PagingDataTransforms$flatMap$$inlined$transform$1$2", f = "PagingDataTransforms.kt", i = {}, l = {138, 138}, m = "emit", n = {}, s = {})
            @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
            /* renamed from: androidx.paging.a1$d$a$a, reason: collision with other inner class name */
            public static final class C0523a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: b, reason: collision with root package name */
                /* synthetic */ Object f31473b;

                /* renamed from: c, reason: collision with root package name */
                int f31474c;

                /* renamed from: d, reason: collision with root package name */
                Object f31475d;

                public C0523a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                public final Object invokeSuspend(@fg.l Object obj) {
                    this.f31473b = obj;
                    this.f31474c |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(kotlinx.coroutines.flow.j jVar, ld.p pVar) {
                this.f31471b = jVar;
                this.f31472c = pVar;
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
            public java.lang.Object emit(androidx.paging.l0<java.lang.Object> r7, @fg.l kotlin.coroutines.d r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof androidx.paging.a1.d.a.C0523a
                    if (r0 == 0) goto L13
                    r0 = r8
                    androidx.paging.a1$d$a$a r0 = (androidx.paging.a1.d.a.C0523a) r0
                    int r1 = r0.f31474c
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f31474c = r1
                    goto L18
                L13:
                    androidx.paging.a1$d$a$a r0 = new androidx.paging.a1$d$a$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f31473b
                    kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                    int r2 = r0.f31474c
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
                    java.lang.Object r7 = r0.f31475d
                    kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.j) r7
                    kotlin.a1.n(r8)
                    goto L51
                L3a:
                    kotlin.a1.n(r8)
                    kotlinx.coroutines.flow.j r8 = r6.f31471b
                    androidx.paging.l0 r7 = (androidx.paging.l0) r7
                    ld.p r2 = r6.f31472c
                    r0.f31475d = r8
                    r0.f31474c = r4
                    java.lang.Object r7 = r7.c(r2, r0)
                    if (r7 != r1) goto L4e
                    return r1
                L4e:
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L51:
                    r2 = 0
                    r0.f31475d = r2
                    r0.f31474c = r3
                    java.lang.Object r7 = r7.emit(r8, r0)
                    if (r7 != r1) goto L5d
                    return r1
                L5d:
                    kotlin.k2 r7 = kotlin.k2.f75408a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.a1.d.a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        public d(kotlinx.coroutines.flow.i iVar, ld.p pVar) {
            this.f31469b = iVar;
            this.f31470c = pVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @fg.m
        public Object a(@fg.l kotlinx.coroutines.flow.j<? super l0<Object>> jVar, @fg.l kotlin.coroutines.d dVar) {
            Object a5 = this.f31469b.a(new a(jVar, this.f31470c), dVar);
            return a5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? a5 : k2.f75408a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/k2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "androidx/paging/a1$m", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class e<R> implements kotlinx.coroutines.flow.i<l0<R>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f31477b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Executor f31478c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.l f31479d;

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* compiled from: Collect.kt */
        @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0006"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/j;", "value", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "androidx/paging/a1$m$b", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class a<T> implements kotlinx.coroutines.flow.j<l0<T>> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.j f31480b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Executor f31481c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ ld.l f31482d;

            @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PagingDataTransforms$flatMap$$inlined$transform$2$2", f = "PagingDataTransforms.kt", i = {}, l = {138, 138}, m = "emit", n = {}, s = {})
            @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
            /* renamed from: androidx.paging.a1$e$a$a, reason: collision with other inner class name */
            public static final class C0524a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: b, reason: collision with root package name */
                /* synthetic */ Object f31483b;

                /* renamed from: c, reason: collision with root package name */
                int f31484c;

                /* renamed from: d, reason: collision with root package name */
                Object f31485d;

                public C0524a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                public final Object invokeSuspend(@fg.l Object obj) {
                    this.f31483b = obj;
                    this.f31484c |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(kotlinx.coroutines.flow.j jVar, Executor executor, ld.l lVar) {
                this.f31480b = jVar;
                this.f31481c = executor;
                this.f31482d = lVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0067 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // kotlinx.coroutines.flow.j
            @fg.m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.lang.Object emit(java.lang.Object r10, @fg.l kotlin.coroutines.d r11) {
                /*
                    r9 = this;
                    boolean r0 = r11 instanceof androidx.paging.a1.e.a.C0524a
                    if (r0 == 0) goto L13
                    r0 = r11
                    androidx.paging.a1$e$a$a r0 = (androidx.paging.a1.e.a.C0524a) r0
                    int r1 = r0.f31484c
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f31484c = r1
                    goto L18
                L13:
                    androidx.paging.a1$e$a$a r0 = new androidx.paging.a1$e$a$a
                    r0.<init>(r11)
                L18:
                    java.lang.Object r11 = r0.f31483b
                    kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                    int r2 = r0.f31484c
                    r3 = 0
                    r4 = 2
                    r5 = 1
                    if (r2 == 0) goto L3b
                    if (r2 == r5) goto L33
                    if (r2 != r4) goto L2b
                    kotlin.a1.n(r11)
                    goto L68
                L2b:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r11)
                    throw r10
                L33:
                    java.lang.Object r10 = r0.f31485d
                    kotlinx.coroutines.flow.j r10 = (kotlinx.coroutines.flow.j) r10
                    kotlin.a1.n(r11)
                    goto L5d
                L3b:
                    kotlin.a1.n(r11)
                    kotlinx.coroutines.flow.j r11 = r9.f31480b
                    androidx.paging.l0 r10 = (androidx.paging.l0) r10
                    java.util.concurrent.Executor r2 = r9.f31481c
                    kotlinx.coroutines.m0 r2 = kotlinx.coroutines.y1.c(r2)
                    androidx.paging.a1$f r6 = new androidx.paging.a1$f
                    ld.l r7 = r9.f31482d
                    r6.<init>(r10, r7, r3)
                    r0.f31485d = r11
                    r0.f31484c = r5
                    java.lang.Object r10 = kotlinx.coroutines.i.h(r2, r6, r0)
                    if (r10 != r1) goto L5a
                    return r1
                L5a:
                    r8 = r11
                    r11 = r10
                    r10 = r8
                L5d:
                    r0.f31485d = r3
                    r0.f31484c = r4
                    java.lang.Object r10 = r10.emit(r11, r0)
                    if (r10 != r1) goto L68
                    return r1
                L68:
                    kotlin.k2 r10 = kotlin.k2.f75408a
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.a1.e.a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        public e(kotlinx.coroutines.flow.i iVar, Executor executor, ld.l lVar) {
            this.f31477b = iVar;
            this.f31478c = executor;
            this.f31479d = lVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @fg.m
        public Object a(@fg.l kotlinx.coroutines.flow.j jVar, @fg.l kotlin.coroutines.d dVar) {
            Object a5 = this.f31477b.a(new a(jVar, this.f31478c, this.f31479d), dVar);
            return a5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? a5 : k2.f75408a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: PagingDataTransforms.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PagingDataTransforms$flatMap$2$1", f = "PagingDataTransforms.kt", i = {}, l = {83}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "R", "Lkotlinx/coroutines/r0;", "Landroidx/paging/l0;", "<anonymous>", "(Lkotlinx/coroutines/r0;)Landroidx/paging/l0;"}, k = 3, mv = {1, 5, 1})
    static final class f<R> extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super l0<R>>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f31487b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ l0<T> f31488c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.l<T, Iterable<R>> f31489d;

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* compiled from: PagingDataTransforms.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PagingDataTransforms$flatMap$2$1$1", f = "PagingDataTransforms.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004\"\b\b\u0001\u0010\u0002*\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u0003H\u008a@"}, d2 = {"<anonymous>", "", "R", "T", "", "it"}, k = 3, mv = {1, 5, 1}, xi = 48)
        static final class a<T> extends kotlin.coroutines.jvm.internal.o implements ld.p<T, kotlin.coroutines.d<? super Iterable<? extends R>>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f31490b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f31491c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ ld.l<T, Iterable<R>> f31492d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(ld.l<? super T, ? extends Iterable<? extends R>> lVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f31492d = lVar;
            }

            @Override // ld.p
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@fg.l T t4, @fg.m kotlin.coroutines.d<? super Iterable<? extends R>> dVar) {
                return ((a) create(t4, dVar)).invokeSuspend(k2.f75408a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f31492d, dVar);
                aVar.f31491c = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                if (this.f31490b != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
                return this.f31492d.invoke(this.f31491c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(l0<T> l0Var, ld.l<? super T, ? extends Iterable<? extends R>> lVar, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.f31488c = l0Var;
            this.f31489d = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return new f(this.f31488c, this.f31489d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f31487b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                l0<T> l0Var = this.f31488c;
                a aVar2 = new a(this.f31489d, null);
                this.f31487b = 1;
                obj = l0Var.c(aVar2, this);
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

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super l0<R>> dVar) {
            return ((f) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: PagingDataTransforms.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PagingDataTransforms$insertFooterItem$1", f = "PagingDataTransforms.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u0001H\u00012\b\u0010\u0004\u001a\u0004\u0018\u0001H\u0001H\u008a@"}, d2 = {"<anonymous>", "T", "", "<anonymous parameter 0>", "after"}, k = 3, mv = {1, 5, 1}, xi = 48)
    static final class g<T> extends kotlin.coroutines.jvm.internal.o implements ld.q<T, T, kotlin.coroutines.d<? super T>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f31493b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f31494c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ T f31495d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(T t4, kotlin.coroutines.d<? super g> dVar) {
            super(3, dVar);
            this.f31495d = t4;
        }

        @Override // ld.q
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object R(@fg.m T t4, @fg.m T t5, @fg.m kotlin.coroutines.d<? super T> dVar) {
            g gVar = new g(this.f31495d, dVar);
            gVar.f31494c = t5;
            return gVar.invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            if (this.f31493b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a1.n(obj);
            if (this.f31494c == null) {
                return this.f31495d;
            }
            return null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: PagingDataTransforms.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PagingDataTransforms$insertHeaderItem$1", f = "PagingDataTransforms.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u0001H\u00012\b\u0010\u0004\u001a\u0004\u0018\u0001H\u0001H\u008a@"}, d2 = {"<anonymous>", "T", "", "before", "<anonymous parameter 1>"}, k = 3, mv = {1, 5, 1}, xi = 48)
    static final class h<T> extends kotlin.coroutines.jvm.internal.o implements ld.q<T, T, kotlin.coroutines.d<? super T>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f31496b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f31497c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ T f31498d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(T t4, kotlin.coroutines.d<? super h> dVar) {
            super(3, dVar);
            this.f31498d = t4;
        }

        @Override // ld.q
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object R(@fg.m T t4, @fg.m T t5, @fg.m kotlin.coroutines.d<? super T> dVar) {
            h hVar = new h(this.f31498d, dVar);
            hVar.f31497c = t4;
            return hVar.invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            if (this.f31496b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a1.n(obj);
            if (this.f31497c == null) {
                return this.f31498d;
            }
            return null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    /* compiled from: PagingDataTransforms.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PagingDataTransforms$insertSeparators$1", f = "PagingDataTransforms.kt", i = {}, l = {261}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002\"\b\b\u0001\u0010\u0003*\u0002H\u00012\b\u0010\u0004\u001a\u0004\u0018\u0001H\u00032\b\u0010\u0005\u001a\u0004\u0018\u0001H\u0003H\u008a@"}, d2 = {"<anonymous>", "R", "", "T", "before", "after"}, k = 3, mv = {1, 5, 1}, xi = 48)
    static final class i<R, T> extends kotlin.coroutines.jvm.internal.o implements ld.q<T, T, kotlin.coroutines.d<? super R>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f31499b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f31500c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f31501d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Executor f31502e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.p<T, T, R> f31503f;

        /* compiled from: PagingDataTransforms.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PagingDataTransforms$insertSeparators$1$1", f = "PagingDataTransforms.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00028\u0000*\u00020\u0003H\u008a@"}, d2 = {"", "R", "T", "Lkotlinx/coroutines/r0;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super R>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f31504b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ld.p<T, T, R> f31505c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ T f31506d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ T f31507e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(ld.p<? super T, ? super T, ? extends R> pVar, T t4, T t5, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f31505c = pVar;
                this.f31506d = t4;
                this.f31507e = t5;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                return new a(this.f31505c, this.f31506d, this.f31507e, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                if (this.f31504b != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
                return this.f31505c.invoke(this.f31506d, this.f31507e);
            }

            @Override // ld.p
            @fg.m
            public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super R> dVar) {
                return ((a) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(Executor executor, ld.p<? super T, ? super T, ? extends R> pVar, kotlin.coroutines.d<? super i> dVar) {
            super(3, dVar);
            this.f31502e = executor;
            this.f31503f = pVar;
        }

        @Override // ld.q
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object R(@fg.m T t4, @fg.m T t5, @fg.m kotlin.coroutines.d<? super R> dVar) {
            i iVar = new i(this.f31502e, this.f31503f, dVar);
            iVar.f31500c = t4;
            iVar.f31501d = t5;
            return iVar.invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f31499b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                Object obj2 = this.f31500c;
                Object obj3 = this.f31501d;
                kotlinx.coroutines.m0 c5 = kotlinx.coroutines.y1.c(this.f31502e);
                a aVar2 = new a(this.f31503f, obj2, obj3, null);
                this.f31500c = null;
                this.f31499b = 1;
                obj = kotlinx.coroutines.i.h(c5, aVar2, this);
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

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/k2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "androidx/paging/a1$m", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class j implements kotlinx.coroutines.flow.i<l0<Object>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f31508b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p f31509c;

        /* compiled from: Collect.kt */
        @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0006"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/j;", "value", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "androidx/paging/a1$m$b", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class a implements kotlinx.coroutines.flow.j<l0<Object>> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.j f31510b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ld.p f31511c;

            @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PagingDataTransforms$map$$inlined$transform$1$2", f = "PagingDataTransforms.kt", i = {}, l = {138, 138}, m = "emit", n = {}, s = {})
            @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
            /* renamed from: androidx.paging.a1$j$a$a, reason: collision with other inner class name */
            public static final class C0525a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: b, reason: collision with root package name */
                /* synthetic */ Object f31512b;

                /* renamed from: c, reason: collision with root package name */
                int f31513c;

                /* renamed from: d, reason: collision with root package name */
                Object f31514d;

                public C0525a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                public final Object invokeSuspend(@fg.l Object obj) {
                    this.f31512b = obj;
                    this.f31513c |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(kotlinx.coroutines.flow.j jVar, ld.p pVar) {
                this.f31510b = jVar;
                this.f31511c = pVar;
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
            public java.lang.Object emit(androidx.paging.l0<java.lang.Object> r7, @fg.l kotlin.coroutines.d r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof androidx.paging.a1.j.a.C0525a
                    if (r0 == 0) goto L13
                    r0 = r8
                    androidx.paging.a1$j$a$a r0 = (androidx.paging.a1.j.a.C0525a) r0
                    int r1 = r0.f31513c
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f31513c = r1
                    goto L18
                L13:
                    androidx.paging.a1$j$a$a r0 = new androidx.paging.a1$j$a$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f31512b
                    kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                    int r2 = r0.f31513c
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
                    java.lang.Object r7 = r0.f31514d
                    kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.j) r7
                    kotlin.a1.n(r8)
                    goto L51
                L3a:
                    kotlin.a1.n(r8)
                    kotlinx.coroutines.flow.j r8 = r6.f31510b
                    androidx.paging.l0 r7 = (androidx.paging.l0) r7
                    ld.p r2 = r6.f31511c
                    r0.f31514d = r8
                    r0.f31513c = r4
                    java.lang.Object r7 = r7.e(r2, r0)
                    if (r7 != r1) goto L4e
                    return r1
                L4e:
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L51:
                    r2 = 0
                    r0.f31514d = r2
                    r0.f31513c = r3
                    java.lang.Object r7 = r7.emit(r8, r0)
                    if (r7 != r1) goto L5d
                    return r1
                L5d:
                    kotlin.k2 r7 = kotlin.k2.f75408a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.a1.j.a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        public j(kotlinx.coroutines.flow.i iVar, ld.p pVar) {
            this.f31508b = iVar;
            this.f31509c = pVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @fg.m
        public Object a(@fg.l kotlinx.coroutines.flow.j<? super l0<Object>> jVar, @fg.l kotlin.coroutines.d dVar) {
            Object a5 = this.f31508b.a(new a(jVar, this.f31509c), dVar);
            return a5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? a5 : k2.f75408a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/k2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "androidx/paging/a1$m", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class k<R> implements kotlinx.coroutines.flow.i<l0<R>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f31516b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Executor f31517c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.l f31518d;

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* compiled from: Collect.kt */
        @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0006"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/j;", "value", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "androidx/paging/a1$m$b", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class a<T> implements kotlinx.coroutines.flow.j<l0<T>> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.j f31519b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Executor f31520c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ ld.l f31521d;

            @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PagingDataTransforms$map$$inlined$transform$2$2", f = "PagingDataTransforms.kt", i = {}, l = {138, 138}, m = "emit", n = {}, s = {})
            @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
            /* renamed from: androidx.paging.a1$k$a$a, reason: collision with other inner class name */
            public static final class C0526a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: b, reason: collision with root package name */
                /* synthetic */ Object f31522b;

                /* renamed from: c, reason: collision with root package name */
                int f31523c;

                /* renamed from: d, reason: collision with root package name */
                Object f31524d;

                public C0526a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                public final Object invokeSuspend(@fg.l Object obj) {
                    this.f31522b = obj;
                    this.f31523c |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(kotlinx.coroutines.flow.j jVar, Executor executor, ld.l lVar) {
                this.f31519b = jVar;
                this.f31520c = executor;
                this.f31521d = lVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0067 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // kotlinx.coroutines.flow.j
            @fg.m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.lang.Object emit(java.lang.Object r10, @fg.l kotlin.coroutines.d r11) {
                /*
                    r9 = this;
                    boolean r0 = r11 instanceof androidx.paging.a1.k.a.C0526a
                    if (r0 == 0) goto L13
                    r0 = r11
                    androidx.paging.a1$k$a$a r0 = (androidx.paging.a1.k.a.C0526a) r0
                    int r1 = r0.f31523c
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f31523c = r1
                    goto L18
                L13:
                    androidx.paging.a1$k$a$a r0 = new androidx.paging.a1$k$a$a
                    r0.<init>(r11)
                L18:
                    java.lang.Object r11 = r0.f31522b
                    kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                    int r2 = r0.f31523c
                    r3 = 0
                    r4 = 2
                    r5 = 1
                    if (r2 == 0) goto L3b
                    if (r2 == r5) goto L33
                    if (r2 != r4) goto L2b
                    kotlin.a1.n(r11)
                    goto L68
                L2b:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r11)
                    throw r10
                L33:
                    java.lang.Object r10 = r0.f31524d
                    kotlinx.coroutines.flow.j r10 = (kotlinx.coroutines.flow.j) r10
                    kotlin.a1.n(r11)
                    goto L5d
                L3b:
                    kotlin.a1.n(r11)
                    kotlinx.coroutines.flow.j r11 = r9.f31519b
                    androidx.paging.l0 r10 = (androidx.paging.l0) r10
                    java.util.concurrent.Executor r2 = r9.f31520c
                    kotlinx.coroutines.m0 r2 = kotlinx.coroutines.y1.c(r2)
                    androidx.paging.a1$l r6 = new androidx.paging.a1$l
                    ld.l r7 = r9.f31521d
                    r6.<init>(r10, r7, r3)
                    r0.f31524d = r11
                    r0.f31523c = r5
                    java.lang.Object r10 = kotlinx.coroutines.i.h(r2, r6, r0)
                    if (r10 != r1) goto L5a
                    return r1
                L5a:
                    r8 = r11
                    r11 = r10
                    r10 = r8
                L5d:
                    r0.f31524d = r3
                    r0.f31523c = r4
                    java.lang.Object r10 = r10.emit(r11, r0)
                    if (r10 != r1) goto L68
                    return r1
                L68:
                    kotlin.k2 r10 = kotlin.k2.f75408a
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.a1.k.a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        public k(kotlinx.coroutines.flow.i iVar, Executor executor, ld.l lVar) {
            this.f31516b = iVar;
            this.f31517c = executor;
            this.f31518d = lVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @fg.m
        public Object a(@fg.l kotlinx.coroutines.flow.j jVar, @fg.l kotlin.coroutines.d dVar) {
            Object a5 = this.f31516b.a(new a(jVar, this.f31517c, this.f31518d), dVar);
            return a5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? a5 : k2.f75408a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: PagingDataTransforms.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PagingDataTransforms$map$2$1", f = "PagingDataTransforms.kt", i = {}, l = {57}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "R", "Lkotlinx/coroutines/r0;", "Landroidx/paging/l0;", "<anonymous>", "(Lkotlinx/coroutines/r0;)Landroidx/paging/l0;"}, k = 3, mv = {1, 5, 1})
    static final class l<R> extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super l0<R>>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f31526b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ l0<T> f31527c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.l<T, R> f31528d;

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* compiled from: PagingDataTransforms.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PagingDataTransforms$map$2$1$1", f = "PagingDataTransforms.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\n\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@"}, d2 = {"<anonymous>", "R", "T", "", "it"}, k = 3, mv = {1, 5, 1}, xi = 48)
        static final class a<T> extends kotlin.coroutines.jvm.internal.o implements ld.p<T, kotlin.coroutines.d<? super R>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f31529b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f31530c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ ld.l<T, R> f31531d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(ld.l<? super T, ? extends R> lVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f31531d = lVar;
            }

            @Override // ld.p
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@fg.l T t4, @fg.m kotlin.coroutines.d<? super R> dVar) {
                return ((a) create(t4, dVar)).invokeSuspend(k2.f75408a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f31531d, dVar);
                aVar.f31530c = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                if (this.f31529b != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
                return this.f31531d.invoke(this.f31530c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        l(l0<T> l0Var, ld.l<? super T, ? extends R> lVar, kotlin.coroutines.d<? super l> dVar) {
            super(2, dVar);
            this.f31527c = l0Var;
            this.f31528d = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return new l(this.f31527c, this.f31528d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f31526b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                l0<T> l0Var = this.f31527c;
                a aVar2 = new a(this.f31528d, null);
                this.f31526b = 1;
                obj = l0Var.e(aVar2, this);
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

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super l0<R>> dVar) {
            return ((l) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/k2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx/coroutines/flow/a0$f", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class m<R> implements kotlinx.coroutines.flow.i<l0<R>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f31532b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p f31533c;

        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f31534b;

            /* renamed from: c, reason: collision with root package name */
            int f31535c;

            public a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                this.f31534b = obj;
                this.f31535c |= Integer.MIN_VALUE;
                return m.this.a(null, this);
            }
        }

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* compiled from: Collect.kt */
        @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0006"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/j;", "value", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx/coroutines/flow/a0$f$b", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class b<T> implements kotlinx.coroutines.flow.j<l0<T>> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.j f31537b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ld.p f31538c;

            @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PagingDataTransforms$transform$$inlined$map$1$2", f = "PagingDataTransforms.kt", i = {}, l = {137, 137}, m = "emit", n = {}, s = {})
            @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
            public static final class a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: b, reason: collision with root package name */
                /* synthetic */ Object f31539b;

                /* renamed from: c, reason: collision with root package name */
                int f31540c;

                /* renamed from: d, reason: collision with root package name */
                Object f31541d;

                public a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                public final Object invokeSuspend(@fg.l Object obj) {
                    this.f31539b = obj;
                    this.f31540c |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(kotlinx.coroutines.flow.j jVar, ld.p pVar) {
                this.f31537b = jVar;
                this.f31538c = pVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @fg.m
            public Object a(Object obj, @fg.l kotlin.coroutines.d dVar) {
                new a(dVar);
                this.f31537b.emit(this.f31538c.invoke((l0) obj, dVar), dVar);
                return k2.f75408a;
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
                    boolean r0 = r8 instanceof androidx.paging.a1.m.b.a
                    if (r0 == 0) goto L13
                    r0 = r8
                    androidx.paging.a1$m$b$a r0 = (androidx.paging.a1.m.b.a) r0
                    int r1 = r0.f31540c
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f31540c = r1
                    goto L18
                L13:
                    androidx.paging.a1$m$b$a r0 = new androidx.paging.a1$m$b$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f31539b
                    kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                    int r2 = r0.f31540c
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
                    java.lang.Object r7 = r0.f31541d
                    kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.j) r7
                    kotlin.a1.n(r8)
                    goto L51
                L3a:
                    kotlin.a1.n(r8)
                    kotlinx.coroutines.flow.j r8 = r6.f31537b
                    androidx.paging.l0 r7 = (androidx.paging.l0) r7
                    ld.p r2 = r6.f31538c
                    r0.f31541d = r8
                    r0.f31540c = r4
                    java.lang.Object r7 = r2.invoke(r7, r0)
                    if (r7 != r1) goto L4e
                    return r1
                L4e:
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L51:
                    r2 = 0
                    r0.f31541d = r2
                    r0.f31540c = r3
                    java.lang.Object r7 = r7.emit(r8, r0)
                    if (r7 != r1) goto L5d
                    return r1
                L5d:
                    kotlin.k2 r7 = kotlin.k2.f75408a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.a1.m.b.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        public m(kotlinx.coroutines.flow.i iVar, ld.p pVar) {
            this.f31532b = iVar;
            this.f31533c = pVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @fg.m
        public Object a(@fg.l kotlinx.coroutines.flow.j jVar, @fg.l kotlin.coroutines.d dVar) {
            Object a5 = this.f31532b.a(new b(jVar, this.f31533c), dVar);
            return a5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? a5 : k2.f75408a;
        }

        @fg.m
        public Object f(@fg.l kotlinx.coroutines.flow.j jVar, @fg.l kotlin.coroutines.d dVar) {
            new a(dVar);
            this.f31532b.a(new b(jVar, this.f31533c), dVar);
            return k2.f75408a;
        }
    }

    @fg.l
    @androidx.annotation.j
    @kd.i(name = "filter")
    public static final <T> y0<T> a(@fg.l y0<T> y0Var, @fg.l Executor executor, @fg.l ld.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.l0.p(y0Var, "<this>");
        kotlin.jvm.internal.l0.p(executor, "executor");
        kotlin.jvm.internal.l0.p(predicate, "predicate");
        return new y0<>(new b(y0Var.e(), executor, predicate), y0Var.getReceiver());
    }

    @androidx.annotation.j
    public static final /* synthetic */ y0 b(y0 y0Var, ld.p predicate) {
        kotlin.jvm.internal.l0.p(y0Var, "<this>");
        kotlin.jvm.internal.l0.p(predicate, "predicate");
        return new y0(new a(y0Var.e(), predicate), y0Var.getReceiver());
    }

    @fg.l
    @androidx.annotation.j
    public static final <T, R> y0<R> c(@fg.l y0<T> y0Var, @fg.l Executor executor, @fg.l ld.l<? super T, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.l0.p(y0Var, "<this>");
        kotlin.jvm.internal.l0.p(executor, "executor");
        kotlin.jvm.internal.l0.p(transform, "transform");
        return new y0<>(new e(y0Var.e(), executor, transform), y0Var.getReceiver());
    }

    @androidx.annotation.j
    public static final /* synthetic */ y0 d(y0 y0Var, ld.p transform) {
        kotlin.jvm.internal.l0.p(y0Var, "<this>");
        kotlin.jvm.internal.l0.p(transform, "transform");
        return new y0(new d(y0Var.e(), transform), y0Var.getReceiver());
    }

    @fg.l
    @kd.j
    @androidx.annotation.j
    public static final <T> y0<T> e(@fg.l y0<T> y0Var, @fg.l s1 terminalSeparatorType, @fg.l T item) {
        kotlin.jvm.internal.l0.p(y0Var, "<this>");
        kotlin.jvm.internal.l0.p(terminalSeparatorType, "terminalSeparatorType");
        kotlin.jvm.internal.l0.p(item, "item");
        return l(y0Var, terminalSeparatorType, new g(item, null));
    }

    @fg.l
    @kd.j
    @androidx.annotation.j
    public static final <T> y0<T> f(@fg.l y0<T> y0Var, @fg.l T item) {
        kotlin.jvm.internal.l0.p(y0Var, "<this>");
        kotlin.jvm.internal.l0.p(item, "item");
        return g(y0Var, null, item, 1, null);
    }

    public static /* synthetic */ y0 g(y0 y0Var, s1 s1Var, Object obj, int i4, Object obj2) {
        if ((i4 & 1) != 0) {
            s1Var = s1.FULLY_COMPLETE;
        }
        return e(y0Var, s1Var, obj);
    }

    @fg.l
    @kd.j
    @androidx.annotation.j
    public static final <T> y0<T> h(@fg.l y0<T> y0Var, @fg.l s1 terminalSeparatorType, @fg.l T item) {
        kotlin.jvm.internal.l0.p(y0Var, "<this>");
        kotlin.jvm.internal.l0.p(terminalSeparatorType, "terminalSeparatorType");
        kotlin.jvm.internal.l0.p(item, "item");
        return l(y0Var, terminalSeparatorType, new h(item, null));
    }

    @fg.l
    @kd.j
    @androidx.annotation.j
    public static final <T> y0<T> i(@fg.l y0<T> y0Var, @fg.l T item) {
        kotlin.jvm.internal.l0.p(y0Var, "<this>");
        kotlin.jvm.internal.l0.p(item, "item");
        return j(y0Var, null, item, 1, null);
    }

    public static /* synthetic */ y0 j(y0 y0Var, s1 s1Var, Object obj, int i4, Object obj2) {
        if ((i4 & 1) != 0) {
            s1Var = s1.FULLY_COMPLETE;
        }
        return h(y0Var, s1Var, obj);
    }

    @fg.l
    @kd.j
    @androidx.annotation.j
    public static final <R, T extends R> y0<R> k(@fg.l y0<T> y0Var, @fg.l s1 terminalSeparatorType, @fg.l Executor executor, @fg.l ld.p<? super T, ? super T, ? extends R> generator) {
        kotlin.jvm.internal.l0.p(y0Var, "<this>");
        kotlin.jvm.internal.l0.p(terminalSeparatorType, "terminalSeparatorType");
        kotlin.jvm.internal.l0.p(executor, "executor");
        kotlin.jvm.internal.l0.p(generator, "generator");
        return l(y0Var, terminalSeparatorType, new i(executor, generator, null));
    }

    @androidx.annotation.j
    public static final /* synthetic */ y0 l(y0 y0Var, s1 terminalSeparatorType, ld.q generator) {
        kotlin.jvm.internal.l0.p(y0Var, "<this>");
        kotlin.jvm.internal.l0.p(terminalSeparatorType, "terminalSeparatorType");
        kotlin.jvm.internal.l0.p(generator, "generator");
        return new y0(l1.c(y0Var.e(), terminalSeparatorType, generator), y0Var.getReceiver());
    }

    @fg.l
    @kd.j
    @androidx.annotation.j
    public static final <R, T extends R> y0<R> m(@fg.l y0<T> y0Var, @fg.l Executor executor, @fg.l ld.p<? super T, ? super T, ? extends R> generator) {
        kotlin.jvm.internal.l0.p(y0Var, "<this>");
        kotlin.jvm.internal.l0.p(executor, "executor");
        kotlin.jvm.internal.l0.p(generator, "generator");
        return n(y0Var, null, executor, generator, 1, null);
    }

    public static /* synthetic */ y0 n(y0 y0Var, s1 s1Var, Executor executor, ld.p pVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            s1Var = s1.FULLY_COMPLETE;
        }
        return k(y0Var, s1Var, executor, pVar);
    }

    public static /* synthetic */ y0 o(y0 y0Var, s1 s1Var, ld.q qVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            s1Var = s1.FULLY_COMPLETE;
        }
        return l(y0Var, s1Var, qVar);
    }

    @fg.l
    @androidx.annotation.j
    public static final <T, R> y0<R> p(@fg.l y0<T> y0Var, @fg.l Executor executor, @fg.l ld.l<? super T, ? extends R> transform) {
        kotlin.jvm.internal.l0.p(y0Var, "<this>");
        kotlin.jvm.internal.l0.p(executor, "executor");
        kotlin.jvm.internal.l0.p(transform, "transform");
        return new y0<>(new k(y0Var.e(), executor, transform), y0Var.getReceiver());
    }

    @androidx.annotation.j
    public static final /* synthetic */ y0 q(y0 y0Var, ld.p transform) {
        kotlin.jvm.internal.l0.p(y0Var, "<this>");
        kotlin.jvm.internal.l0.p(transform, "transform");
        return new y0(new j(y0Var.e(), transform), y0Var.getReceiver());
    }

    private static final <T, R> y0<R> r(y0<T> y0Var, ld.p<? super l0<T>, ? super kotlin.coroutines.d<? super l0<R>>, ? extends Object> pVar) {
        return new y0<>(new m(y0Var.e(), pVar), y0Var.getReceiver());
    }
}
