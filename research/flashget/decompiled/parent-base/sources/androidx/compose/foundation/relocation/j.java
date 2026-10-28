package androidx.compose.foundation.relocation;

import androidx.compose.runtime.internal.u;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.q0;
import kotlinx.coroutines.k2;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.s0;
import ld.p;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: BringIntoViewResponder.kt */
@u(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tH\u0096@¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0006R\u001a\u0010\u0019\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Landroidx/compose/foundation/relocation/j;", "Landroidx/compose/foundation/relocation/a;", "Landroidx/compose/foundation/relocation/c;", "Landroidx/compose/foundation/relocation/h;", "responder", "<init>", "(Landroidx/compose/foundation/relocation/h;)V", "Landroidx/compose/ui/layout/u;", "childCoordinates", "Lkotlin/Function0;", "Li0/i;", "boundsProvider", "Lkotlin/k2;", "m2", "(Landroidx/compose/ui/layout/u;Lld/a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "s", "Landroidx/compose/foundation/relocation/h;", "D7", "()Landroidx/compose/foundation/relocation/h;", "E7", "Landroidx/compose/ui/modifier/i;", "t", "Landroidx/compose/ui/modifier/i;", "A1", "()Landroidx/compose/ui/modifier/i;", "providedValues", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nBringIntoViewResponder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BringIntoViewResponder.kt\nandroidx/compose/foundation/relocation/BringIntoViewResponderNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,214:1\n1#2:215\n*E\n"})
/* loaded from: classes.dex */
public final class j extends androidx.compose.foundation.relocation.a implements c {

    /* renamed from: u, reason: collision with root package name */
    public static final int f6975u = 8;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @l
    private h responder;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @l
    private final androidx.compose.ui.modifier.i providedValues = androidx.compose.ui.modifier.k.c(new q0(androidx.compose.foundation.relocation.b.a(), this));

    /* compiled from: BringIntoViewResponder.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringChildIntoView$2", f = "BringIntoViewResponder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlinx/coroutines/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)Lkotlinx/coroutines/k2;"}, k = 3, mv = {1, 8, 0})
    static final class a extends o implements p<r0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f6978b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f6979c;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.u f6981e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.a<i0.i> f6982f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.a<i0.i> f6983g;

        /* compiled from: BringIntoViewResponder.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringChildIntoView$2$1", f = "BringIntoViewResponder.kt", i = {}, l = {SyslogAppender.LOG_LOCAL6}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.relocation.j$a$a, reason: collision with other inner class name */
        static final class C0120a extends o implements p<r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f6984b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ j f6985c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.layout.u f6986d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ ld.a<i0.i> f6987e;

            /* compiled from: BringIntoViewResponder.kt */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            /* renamed from: androidx.compose.foundation.relocation.j$a$a$a, reason: collision with other inner class name */
            /* synthetic */ class C0121a extends h0 implements ld.a<i0.i> {

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ j f6988d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ androidx.compose.ui.layout.u f6989e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ ld.a<i0.i> f6990f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0121a(j jVar, androidx.compose.ui.layout.u uVar, ld.a<i0.i> aVar) {
                    super(0, l0.a.class, "localRect", "bringChildIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;", 0);
                    this.f6988d = jVar;
                    this.f6989e = uVar;
                    this.f6990f = aVar;
                }

                @Override // ld.a
                @m
                /* renamed from: Z, reason: merged with bridge method [inline-methods] */
                public final i0.i invoke() {
                    return j.C7(this.f6988d, this.f6989e, this.f6990f);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0120a(j jVar, androidx.compose.ui.layout.u uVar, ld.a<i0.i> aVar, kotlin.coroutines.d<? super C0120a> dVar) {
                super(2, dVar);
                this.f6985c = jVar;
                this.f6986d = uVar;
                this.f6987e = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d<kotlin.k2> create(@m Object obj, @l kotlin.coroutines.d<?> dVar) {
                return new C0120a(this.f6985c, this.f6986d, this.f6987e, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f6984b;
                if (i4 == 0) {
                    a1.n(obj);
                    h responder = this.f6985c.getResponder();
                    C0121a c0121a = new C0121a(this.f6985c, this.f6986d, this.f6987e);
                    this.f6984b = 1;
                    if (responder.t1(c0121a, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a1.n(obj);
                }
                return kotlin.k2.f75408a;
            }

            @Override // ld.p
            @m
            public final Object invoke(@l r0 r0Var, @m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                return ((C0120a) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
            }
        }

        /* compiled from: BringIntoViewResponder.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringChildIntoView$2$2", f = "BringIntoViewResponder.kt", i = {}, l = {185}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        static final class b extends o implements p<r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f6991b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ j f6992c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ ld.a<i0.i> f6993d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(j jVar, ld.a<i0.i> aVar, kotlin.coroutines.d<? super b> dVar) {
                super(2, dVar);
                this.f6992c = jVar;
                this.f6993d = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d<kotlin.k2> create(@m Object obj, @l kotlin.coroutines.d<?> dVar) {
                return new b(this.f6992c, this.f6993d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f6991b;
                if (i4 == 0) {
                    a1.n(obj);
                    c A7 = this.f6992c.A7();
                    androidx.compose.ui.layout.u y7 = this.f6992c.y7();
                    if (y7 == null) {
                        return kotlin.k2.f75408a;
                    }
                    ld.a<i0.i> aVar2 = this.f6993d;
                    this.f6991b = 1;
                    if (A7.m2(y7, aVar2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a1.n(obj);
                }
                return kotlin.k2.f75408a;
            }

            @Override // ld.p
            @m
            public final Object invoke(@l r0 r0Var, @m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                return ((b) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.layout.u uVar, ld.a<i0.i> aVar, ld.a<i0.i> aVar2, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f6981e = uVar;
            this.f6982f = aVar;
            this.f6983g = aVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final kotlin.coroutines.d<kotlin.k2> create(@m Object obj, @l kotlin.coroutines.d<?> dVar) {
            a aVar = j.this.new a(this.f6981e, this.f6982f, this.f6983g, dVar);
            aVar.f6979c = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@l Object obj) {
            k2 f4;
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            if (this.f6978b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a1.n(obj);
            r0 r0Var = (r0) this.f6979c;
            kotlinx.coroutines.k.f(r0Var, null, null, new C0120a(j.this, this.f6981e, this.f6982f, null), 3, null);
            f4 = kotlinx.coroutines.k.f(r0Var, null, null, new b(j.this, this.f6983g, null), 3, null);
            return f4;
        }

        @Override // ld.p
        @m
        public final Object invoke(@l r0 r0Var, @m kotlin.coroutines.d<? super k2> dVar) {
            return ((a) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }
    }

    /* compiled from: BringIntoViewResponder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Li0/i;", "a", "()Li0/i;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nBringIntoViewResponder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BringIntoViewResponder.kt\nandroidx/compose/foundation/relocation/BringIntoViewResponderNode$bringChildIntoView$parentRect$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,214:1\n1#2:215\n*E\n"})
    static final class b extends n0 implements ld.a<i0.i> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.u f6995c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.a<i0.i> f6996d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.ui.layout.u uVar, ld.a<i0.i> aVar) {
            super(0);
            this.f6995c = uVar;
            this.f6996d = aVar;
        }

        @Override // ld.a
        @m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i0.i invoke() {
            i0.i C7 = j.C7(j.this, this.f6995c, this.f6996d);
            if (C7 != null) {
                return j.this.getResponder().G5(C7);
            }
            return null;
        }
    }

    public j(@l h hVar) {
        this.responder = hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0.i C7(j jVar, androidx.compose.ui.layout.u uVar, ld.a<i0.i> aVar) {
        i0.i invoke;
        i0.i d5;
        androidx.compose.ui.layout.u y7 = jVar.y7();
        if (y7 == null) {
            return null;
        }
        if (!uVar.f()) {
            uVar = null;
        }
        if (uVar == null || (invoke = aVar.invoke()) == null) {
            return null;
        }
        d5 = i.d(y7, uVar, invoke);
        return d5;
    }

    @Override // androidx.compose.ui.modifier.j
    @l
    /* renamed from: A1, reason: from getter */
    public androidx.compose.ui.modifier.i getProvidedValues() {
        return this.providedValues;
    }

    @l
    /* renamed from: D7, reason: from getter */
    public final h getResponder() {
        return this.responder;
    }

    public final void E7(@l h hVar) {
        this.responder = hVar;
    }

    @Override // androidx.compose.foundation.relocation.c
    @m
    public Object m2(@l androidx.compose.ui.layout.u uVar, @l ld.a<i0.i> aVar, @l kotlin.coroutines.d<? super kotlin.k2> dVar) {
        Object g4 = s0.g(new a(uVar, aVar, new b(uVar, aVar), null), dVar);
        return g4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? g4 : kotlin.k2.f75408a;
    }
}
