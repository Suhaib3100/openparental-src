package androidx.paging;

import kotlin.Metadata;
import kotlin.k2;

/* compiled from: ConflatedEventBus.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\u0005R(\u0010\u000e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00018\u00000\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f8\u0006¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\f\u0010\u0011¨\u0006\u0013"}, d2 = {"Landroidx/paging/j;", "", "T", "initialValue", "<init>", "(Ljava/lang/Object;)V", "data", "Lkotlin/k2;", "b", "Lkotlinx/coroutines/flow/e0;", "Lkotlin/q0;", "", "a", "Lkotlinx/coroutines/flow/e0;", "state", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/i;", "()Lkotlinx/coroutines/flow/i;", "flow", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class j<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlinx.coroutines.flow.e0<kotlin.q0<Integer, T>> state;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlinx.coroutines.flow.i<T> flow;

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/k2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx/coroutines/flow/a0$g", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a implements kotlinx.coroutines.flow.i<T> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f31756b;

        /* compiled from: Collect.kt */
        @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0006"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/j;", "value", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx/coroutines/flow/a0$g$b", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
        /* renamed from: androidx.paging.j$a$a, reason: collision with other inner class name */
        public static final class C0541a implements kotlinx.coroutines.flow.j<kotlin.q0<? extends Integer, ? extends T>> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.j f31757b;

            @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.ConflatedEventBus$special$$inlined$mapNotNull$1$2", f = "ConflatedEventBus.kt", i = {}, l = {138}, m = "emit", n = {}, s = {})
            @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
            /* renamed from: androidx.paging.j$a$a$a, reason: collision with other inner class name */
            public static final class C0542a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: b, reason: collision with root package name */
                /* synthetic */ Object f31758b;

                /* renamed from: c, reason: collision with root package name */
                int f31759c;

                /* renamed from: d, reason: collision with root package name */
                Object f31760d;

                public C0542a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                public final Object invokeSuspend(@fg.l Object obj) {
                    this.f31758b = obj;
                    this.f31759c |= Integer.MIN_VALUE;
                    return C0541a.this.emit(null, this);
                }
            }

            public C0541a(kotlinx.coroutines.flow.j jVar) {
                this.f31757b = jVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
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
                    boolean r0 = r6 instanceof androidx.paging.j.a.C0541a.C0542a
                    if (r0 == 0) goto L13
                    r0 = r6
                    androidx.paging.j$a$a$a r0 = (androidx.paging.j.a.C0541a.C0542a) r0
                    int r1 = r0.f31759c
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f31759c = r1
                    goto L18
                L13:
                    androidx.paging.j$a$a$a r0 = new androidx.paging.j$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f31758b
                    kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                    int r2 = r0.f31759c
                    r3 = 1
                    if (r2 == 0) goto L2f
                    if (r2 != r3) goto L27
                    kotlin.a1.n(r6)
                    goto L46
                L27:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L2f:
                    kotlin.a1.n(r6)
                    kotlinx.coroutines.flow.j r6 = r4.f31757b
                    kotlin.q0 r5 = (kotlin.q0) r5
                    java.lang.Object r5 = r5.f()
                    if (r5 != 0) goto L3d
                    goto L46
                L3d:
                    r0.f31759c = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L46
                    return r1
                L46:
                    kotlin.k2 r5 = kotlin.k2.f75408a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.j.a.C0541a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        public a(kotlinx.coroutines.flow.i iVar) {
            this.f31756b = iVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @fg.m
        public Object a(@fg.l kotlinx.coroutines.flow.j jVar, @fg.l kotlin.coroutines.d dVar) {
            Object a5 = this.f31756b.a(new C0541a(jVar), dVar);
            return a5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? a5 : k2.f75408a;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public j() {
        /*
            r2 = this;
            r0 = 0
            r1 = 1
            r2.<init>(r0, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.j.<init>():void");
    }

    @fg.l
    public final kotlinx.coroutines.flow.i<T> a() {
        return this.flow;
    }

    public final void b(@fg.l T data) {
        kotlin.jvm.internal.l0.p(data, "data");
        kotlinx.coroutines.flow.e0<kotlin.q0<Integer, T>> e0Var = this.state;
        e0Var.setValue(new kotlin.q0<>(Integer.valueOf(e0Var.getValue().e().intValue() + 1), data));
    }

    public j(@fg.m T t4) {
        kotlinx.coroutines.flow.e0<kotlin.q0<Integer, T>> a5 = kotlinx.coroutines.flow.v0.a(new kotlin.q0(Integer.MIN_VALUE, t4));
        this.state = a5;
        this.flow = new a(a5);
    }

    public /* synthetic */ j(Object obj, int i4, kotlin.jvm.internal.w wVar) {
        this((i4 & 1) != 0 ? null : obj);
    }
}
