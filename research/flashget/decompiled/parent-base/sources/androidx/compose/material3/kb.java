package androidx.compose.material3;

import kotlin.Metadata;
import kotlinx.coroutines.p;

/* compiled from: Tooltip.kt */
@androidx.compose.runtime.x4
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0014\u0010\u0018R\u001e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0013¨\u0006\u001e"}, d2 = {"Landroidx/compose/material3/kb;", "Landroidx/compose/material3/jb;", "", "initialIsVisible", "isPersistent", "Landroidx/compose/foundation/c2;", "mutatorMutex", "<init>", "(ZZLandroidx/compose/foundation/c2;)V", "Landroidx/compose/foundation/a2;", "mutatePriority", "Lkotlin/k2;", "c", "(Landroidx/compose/foundation/a2;Lkotlin/coroutines/d;)Ljava/lang/Object;", "dismiss", "()V", "a", "Z", "d", "()Z", "b", "Landroidx/compose/foundation/c2;", "Landroidx/compose/animation/core/h1;", "Landroidx/compose/animation/core/h1;", "()Landroidx/compose/animation/core/h1;", "transition", "Lkotlinx/coroutines/p;", "Lkotlinx/coroutines/p;", "job", "isVisible", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class kb implements jb {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isPersistent;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.c2 mutatorMutex;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.animation.core.h1<Boolean> transition;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private kotlinx.coroutines.p<? super kotlin.k2> job;

    /* compiled from: Tooltip.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.TooltipStateImpl$show$2", f = "Tooltip.kt", i = {}, l = {590, 592}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "<anonymous>", "()V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.coroutines.jvm.internal.o implements ld.l<kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f12114b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.l<kotlin.coroutines.d<? super kotlin.k2>, Object> f12116d;

        /* compiled from: Tooltip.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.TooltipStateImpl$show$2$1", f = "Tooltip.kt", i = {}, l = {593}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.material3.kb$a$a, reason: collision with other inner class name */
        static final class C0267a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f12117b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ld.l<kotlin.coroutines.d<? super kotlin.k2>, Object> f12118c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0267a(ld.l<? super kotlin.coroutines.d<? super kotlin.k2>, ? extends Object> lVar, kotlin.coroutines.d<? super C0267a> dVar) {
                super(2, dVar);
                this.f12118c = lVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                return new C0267a(this.f12118c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f12117b;
                if (i4 == 0) {
                    kotlin.a1.n(obj);
                    ld.l<kotlin.coroutines.d<? super kotlin.k2>, Object> lVar = this.f12118c;
                    this.f12117b = 1;
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
                return ((C0267a) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(ld.l<? super kotlin.coroutines.d<? super kotlin.k2>, ? extends Object> lVar, kotlin.coroutines.d<? super a> dVar) {
            super(1, dVar);
            this.f12116d = lVar;
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
            return kb.this.new a(this.f12116d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f12114b;
            try {
                if (i4 == 0) {
                    kotlin.a1.n(obj);
                    if (kb.this.getIsPersistent()) {
                        ld.l<kotlin.coroutines.d<? super kotlin.k2>, Object> lVar = this.f12116d;
                        this.f12114b = 1;
                        if (lVar.invoke(this) == aVar) {
                            return aVar;
                        }
                    } else {
                        C0267a c0267a = new C0267a(this.f12116d, null);
                        this.f12114b = 2;
                        if (kotlinx.coroutines.u3.c(1500L, c0267a, this) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i4 != 1 && i4 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a1.n(obj);
                }
                kb.this.dismiss();
                return kotlin.k2.f75408a;
            } catch (Throwable th) {
                kb.this.dismiss();
                throw th;
            }
        }
    }

    /* compiled from: Tooltip.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.TooltipStateImpl$show$cancellableShow$1", f = "Tooltip.kt", i = {}, l = {720}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "<anonymous>", "()V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nTooltip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/TooltipStateImpl$show$cancellableShow$1\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,719:1\n314#2,11:720\n*S KotlinDebug\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/TooltipStateImpl$show$cancellableShow$1\n*L\n579#1:720,11\n*E\n"})
    static final class b extends kotlin.coroutines.jvm.internal.o implements ld.l<kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        Object f12119b;

        /* renamed from: c, reason: collision with root package name */
        int f12120c;

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
            return kb.this.new b(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f12120c;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                kb kbVar = kb.this;
                this.f12119b = kbVar;
                this.f12120c = 1;
                kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(kotlin.coroutines.intrinsics.b.e(this), 1);
                qVar.e0();
                kbVar.b().h(Boolean.TRUE);
                kbVar.job = qVar;
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

    public kb(boolean z4, boolean z5, @fg.l androidx.compose.foundation.c2 c2Var) {
        this.isPersistent = z5;
        this.mutatorMutex = c2Var;
        this.transition = new androidx.compose.animation.core.h1<>(Boolean.valueOf(z4));
    }

    @Override // androidx.compose.material3.b0
    public void a() {
        kotlinx.coroutines.p<? super kotlin.k2> pVar = this.job;
        if (pVar != null) {
            p.a.a(pVar, null, 1, null);
        }
    }

    @Override // androidx.compose.material3.jb
    @fg.l
    public androidx.compose.animation.core.h1<Boolean> b() {
        return this.transition;
    }

    @Override // androidx.compose.material3.b0
    @fg.m
    public Object c(@fg.l androidx.compose.foundation.a2 a2Var, @fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
        Object d5 = this.mutatorMutex.d(a2Var, new a(new b(null), null), dVar);
        return d5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? d5 : kotlin.k2.f75408a;
    }

    @Override // androidx.compose.material3.b0
    /* renamed from: d, reason: from getter */
    public boolean getIsPersistent() {
        return this.isPersistent;
    }

    @Override // androidx.compose.material3.b0
    public void dismiss() {
        this.transition.h(Boolean.FALSE);
    }

    @Override // androidx.compose.material3.b0
    /* renamed from: isVisible */
    public boolean getIsVisible() {
        return this.transition.a().booleanValue() || this.transition.b().booleanValue();
    }
}
