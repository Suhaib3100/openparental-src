package androidx.compose.foundation.text;

import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: PointerMoveDetector.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a2\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0080@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/input/pointer/k0;", "Landroidx/compose/ui/input/pointer/r;", "pointerEventPass", "Lkotlin/Function1;", "Li0/f;", "Lkotlin/k2;", "onMove", "a", "(Landroidx/compose/ui/input/pointer/k0;Landroidx/compose/ui/input/pointer/r;Lld/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class i0 {

    /* compiled from: PointerMoveDetector.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2", f = "PointerMoveDetector.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nPointerMoveDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerMoveDetector.kt\nandroidx/compose/foundation/text/PointerMoveDetectorKt$detectMoves$2\n+ 2 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,57:1\n329#2:58\n*S KotlinDebug\n*F\n+ 1 PointerMoveDetector.kt\nandroidx/compose/foundation/text/PointerMoveDetectorKt$detectMoves$2\n*L\n40#1:58\n*E\n"})
    static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f7443b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.input.pointer.k0 f7444c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.input.pointer.r f7445d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.l<i0.f, k2> f7446e;

        /* compiled from: PointerMoveDetector.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2$1", f = "PointerMoveDetector.kt", i = {0, 0}, l = {44}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "previousPosition"}, s = {"L$0", "L$1"})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/c;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/c;)V"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nPointerMoveDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerMoveDetector.kt\nandroidx/compose/foundation/text/PointerMoveDetectorKt$detectMoves$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,57:1\n1#2:58\n*E\n"})
        /* renamed from: androidx.compose.foundation.text.i0$a$a, reason: collision with other inner class name */
        static final class C0137a extends kotlin.coroutines.jvm.internal.k implements ld.p<androidx.compose.ui.input.pointer.c, kotlin.coroutines.d<? super k2>, Object> {

            /* renamed from: c, reason: collision with root package name */
            Object f7447c;

            /* renamed from: d, reason: collision with root package name */
            int f7448d;

            /* renamed from: e, reason: collision with root package name */
            private /* synthetic */ Object f7449e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ kotlin.coroutines.g f7450f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.input.pointer.r f7451g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ ld.l<i0.f, k2> f7452h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0137a(kotlin.coroutines.g gVar, androidx.compose.ui.input.pointer.r rVar, ld.l<? super i0.f, k2> lVar, kotlin.coroutines.d<? super C0137a> dVar) {
                super(2, dVar);
                this.f7450f = gVar;
                this.f7451g = rVar;
                this.f7452h = lVar;
            }

            @Override // ld.p
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@fg.l androidx.compose.ui.input.pointer.c cVar, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                return ((C0137a) create(cVar, dVar)).invokeSuspend(k2.f75408a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                C0137a c0137a = new C0137a(this.f7450f, this.f7451g, this.f7452h, dVar);
                c0137a.f7449e = obj;
                return c0137a;
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
            /* JADX WARN: Removed duplicated region for block: B:17:0x00aa  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0056  */
            /* JADX WARN: Removed duplicated region for block: B:9:0x0065  */
            /* JADX WARN: Type inference failed for: r8v15, types: [T, i0.f] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x003e -> B:5:0x0041). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r8) {
                /*
                    r7 = this;
                    kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                    int r1 = r7.f7448d
                    r2 = 1
                    if (r1 == 0) goto L1d
                    if (r1 != r2) goto L15
                    java.lang.Object r1 = r7.f7447c
                    kotlin.jvm.internal.k1$h r1 = (kotlin.jvm.internal.k1.h) r1
                    java.lang.Object r3 = r7.f7449e
                    androidx.compose.ui.input.pointer.c r3 = (androidx.compose.ui.input.pointer.c) r3
                    kotlin.a1.n(r8)
                    goto L41
                L15:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L1d:
                    kotlin.a1.n(r8)
                    java.lang.Object r8 = r7.f7449e
                    androidx.compose.ui.input.pointer.c r8 = (androidx.compose.ui.input.pointer.c) r8
                    kotlin.jvm.internal.k1$h r1 = new kotlin.jvm.internal.k1$h
                    r1.<init>()
                    r3 = r8
                L2a:
                    kotlin.coroutines.g r8 = r7.f7450f
                    boolean r8 = kotlinx.coroutines.n2.C(r8)
                    if (r8 == 0) goto Laa
                    androidx.compose.ui.input.pointer.r r8 = r7.f7451g
                    r7.f7449e = r3
                    r7.f7447c = r1
                    r7.f7448d = r2
                    java.lang.Object r8 = r3.u3(r8, r7)
                    if (r8 != r0) goto L41
                    return r0
                L41:
                    androidx.compose.ui.input.pointer.p r8 = (androidx.compose.ui.input.pointer.p) r8
                    int r4 = r8.getType()
                    androidx.compose.ui.input.pointer.t$a r5 = androidx.compose.ui.input.pointer.t.INSTANCE
                    r5.getClass()
                    int r6 = androidx.compose.ui.input.pointer.t.c()
                    boolean r6 = androidx.compose.ui.input.pointer.t.k(r4, r6)
                    if (r6 == 0) goto L58
                    r6 = r2
                    goto L63
                L58:
                    r5.getClass()
                    int r6 = androidx.compose.ui.input.pointer.t.a()
                    boolean r6 = androidx.compose.ui.input.pointer.t.k(r4, r6)
                L63:
                    if (r6 == 0) goto L67
                    r4 = r2
                    goto L72
                L67:
                    r5.getClass()
                    int r5 = androidx.compose.ui.input.pointer.t.b()
                    boolean r4 = androidx.compose.ui.input.pointer.t.k(r4, r5)
                L72:
                    if (r4 == 0) goto L2a
                    java.util.List r8 = r8.e()
                    java.lang.Object r8 = kotlin.collections.w.B2(r8)
                    androidx.compose.ui.input.pointer.b0 r8 = (androidx.compose.ui.input.pointer.b0) r8
                    long r4 = r8.getPosition()
                    i0.f r8 = i0.f.d(r4)
                    long r4 = r8.getPackedValue()
                    T r6 = r1.f75329b
                    boolean r4 = i0.f.k(r4, r6)
                    if (r4 != 0) goto L93
                    goto L94
                L93:
                    r8 = 0
                L94:
                    if (r8 == 0) goto L2a
                    ld.l<i0.f, kotlin.k2> r4 = r7.f7452h
                    long r5 = r8.getPackedValue()
                    i0.f r8 = i0.f.d(r5)
                    r1.f75329b = r8
                    i0.f r8 = i0.f.d(r5)
                    r4.invoke(r8)
                    goto L2a
                Laa:
                    kotlin.k2 r8 = kotlin.k2.f75408a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.i0.a.C0137a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(androidx.compose.ui.input.pointer.k0 k0Var, androidx.compose.ui.input.pointer.r rVar, ld.l<? super i0.f, k2> lVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f7444c = k0Var;
            this.f7445d = rVar;
            this.f7446e = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return new a(this.f7444c, this.f7445d, this.f7446e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f7443b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                kotlin.coroutines.g f75269b = getF75269b();
                androidx.compose.ui.input.pointer.k0 k0Var = this.f7444c;
                C0137a c0137a = new C0137a(f75269b, this.f7445d, this.f7446e, null);
                this.f7443b = 1;
                if (k0Var.o3(c0137a, this) == aVar) {
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

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((a) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    @fg.m
    public static final Object a(@fg.l androidx.compose.ui.input.pointer.k0 k0Var, @fg.l androidx.compose.ui.input.pointer.r rVar, @fg.l ld.l<? super i0.f, k2> lVar, @fg.l kotlin.coroutines.d<? super k2> dVar) {
        Object g4 = kotlinx.coroutines.s0.g(new a(k0Var, rVar, lVar, null), dVar);
        return g4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? g4 : k2.f75408a;
    }

    public static /* synthetic */ Object b(androidx.compose.ui.input.pointer.k0 k0Var, androidx.compose.ui.input.pointer.r rVar, ld.l lVar, kotlin.coroutines.d dVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            rVar = androidx.compose.ui.input.pointer.r.Initial;
        }
        return a(k0Var, rVar, lVar, dVar);
    }
}
