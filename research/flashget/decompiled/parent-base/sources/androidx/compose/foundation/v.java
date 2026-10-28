package androidx.compose.foundation;

import androidx.compose.runtime.t4;
import androidx.compose.runtime.x4;
import kotlin.Metadata;
import kotlinx.coroutines.p;
import kotlinx.coroutines.u3;

/* compiled from: BasicTooltip.kt */
@x4
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R+\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001c¨\u0006\u001e"}, d2 = {"Landroidx/compose/foundation/v;", "Landroidx/compose/foundation/u;", "", "initialIsVisible", "isPersistent", "Landroidx/compose/foundation/c2;", "mutatorMutex", "<init>", "(ZZLandroidx/compose/foundation/c2;)V", "Landroidx/compose/foundation/a2;", "mutatePriority", "Lkotlin/k2;", "c", "(Landroidx/compose/foundation/a2;Lkotlin/coroutines/d;)Ljava/lang/Object;", "dismiss", "()V", "a", "Z", "d", "()Z", "b", "Landroidx/compose/foundation/c2;", "<set-?>", "Landroidx/compose/runtime/k2;", "isVisible", "f", "(Z)V", "Lkotlinx/coroutines/p;", "Lkotlinx/coroutines/p;", "job", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nBasicTooltip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTooltip.kt\nandroidx/compose/foundation/BasicTooltipStateImpl\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,246:1\n81#2:247\n107#2,2:248\n*S KotlinDebug\n*F\n+ 1 BasicTooltip.kt\nandroidx/compose/foundation/BasicTooltipStateImpl\n*L\n127#1:247\n127#1:248,2\n*E\n"})
/* loaded from: classes.dex */
final class v implements u {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isPersistent;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final c2 mutatorMutex;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.k2 isVisible;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private kotlinx.coroutines.p<? super kotlin.k2> job;

    /* compiled from: BasicTooltip.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.BasicTooltipStateImpl$show$2", f = "BasicTooltip.kt", i = {}, l = {156, 158}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "<anonymous>", "()V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.coroutines.jvm.internal.o implements ld.l<kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f9110b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.l<kotlin.coroutines.d<? super kotlin.k2>, Object> f9112d;

        /* compiled from: BasicTooltip.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.BasicTooltipStateImpl$show$2$1", f = "BasicTooltip.kt", i = {}, l = {159}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.v$a$a, reason: collision with other inner class name */
        static final class C0192a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f9113b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ld.l<kotlin.coroutines.d<? super kotlin.k2>, Object> f9114c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0192a(ld.l<? super kotlin.coroutines.d<? super kotlin.k2>, ? extends Object> lVar, kotlin.coroutines.d<? super C0192a> dVar) {
                super(2, dVar);
                this.f9114c = lVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                return new C0192a(this.f9114c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f9113b;
                if (i4 == 0) {
                    kotlin.a1.n(obj);
                    ld.l<kotlin.coroutines.d<? super kotlin.k2>, Object> lVar = this.f9114c;
                    this.f9113b = 1;
                    if (lVar.invoke(this) == aVar) {
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
                return ((C0192a) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(ld.l<? super kotlin.coroutines.d<? super kotlin.k2>, ? extends Object> lVar, kotlin.coroutines.d<? super a> dVar) {
            super(1, dVar);
            this.f9112d = lVar;
        }

        @Override // ld.l
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((a) create(dVar)).invokeSuspend(kotlin.k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.l kotlin.coroutines.d<?> dVar) {
            return v.this.new a(this.f9112d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f9110b;
            try {
                if (i4 == 0) {
                    kotlin.a1.n(obj);
                    if (v.this.getIsPersistent()) {
                        ld.l<kotlin.coroutines.d<? super kotlin.k2>, Object> lVar = this.f9112d;
                        this.f9110b = 1;
                        if (lVar.invoke(this) == aVar) {
                            return aVar;
                        }
                    } else {
                        C0192a c0192a = new C0192a(this.f9112d, null);
                        this.f9110b = 2;
                        if (u3.c(1500L, c0192a, this) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i4 != 1 && i4 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a1.n(obj);
                }
                v.this.f(false);
                return kotlin.k2.f75408a;
            } catch (Throwable th) {
                v.this.f(false);
                throw th;
            }
        }
    }

    /* compiled from: BasicTooltip.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.BasicTooltipStateImpl$show$cancellableShow$1", f = "BasicTooltip.kt", i = {}, l = {247}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "<anonymous>", "()V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nBasicTooltip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTooltip.kt\nandroidx/compose/foundation/BasicTooltipStateImpl$show$cancellableShow$1\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,246:1\n314#2,11:247\n*S KotlinDebug\n*F\n+ 1 BasicTooltip.kt\nandroidx/compose/foundation/BasicTooltipStateImpl$show$cancellableShow$1\n*L\n145#1:247,11\n*E\n"})
    static final class b extends kotlin.coroutines.jvm.internal.o implements ld.l<kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        Object f9115b;

        /* renamed from: c, reason: collision with root package name */
        int f9116c;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(1, dVar);
        }

        @Override // ld.l
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((b) create(dVar)).invokeSuspend(kotlin.k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.l kotlin.coroutines.d<?> dVar) {
            return v.this.new b(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f9116c;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                v vVar = v.this;
                this.f9115b = vVar;
                this.f9116c = 1;
                kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(kotlin.coroutines.intrinsics.b.e(this), 1);
                qVar.e0();
                vVar.f(true);
                vVar.job = qVar;
                Object y4 = qVar.y();
                if (y4 == aVar) {
                    kotlin.coroutines.jvm.internal.h.c(this);
                }
                if (y4 == aVar) {
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

    public v(boolean z4, boolean z5, @fg.l c2 c2Var) {
        androidx.compose.runtime.k2 g4;
        this.isPersistent = z5;
        this.mutatorMutex = c2Var;
        g4 = t4.g(Boolean.valueOf(z4), null, 2, null);
        this.isVisible = g4;
    }

    @Override // androidx.compose.foundation.u
    public void a() {
        kotlinx.coroutines.p<? super kotlin.k2> pVar = this.job;
        if (pVar != null) {
            p.a.a(pVar, null, 1, null);
        }
    }

    @Override // androidx.compose.foundation.u
    @fg.m
    public Object c(@fg.l a2 a2Var, @fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
        Object d5 = this.mutatorMutex.d(a2Var, new a(new b(null), null), dVar);
        return d5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? d5 : kotlin.k2.f75408a;
    }

    @Override // androidx.compose.foundation.u
    /* renamed from: d, reason: from getter */
    public boolean getIsPersistent() {
        return this.isPersistent;
    }

    @Override // androidx.compose.foundation.u
    public void dismiss() {
        f(false);
    }

    public void f(boolean z4) {
        this.isVisible.setValue(Boolean.valueOf(z4));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.u
    public boolean isVisible() {
        return ((Boolean) this.isVisible.getValue()).booleanValue();
    }
}
