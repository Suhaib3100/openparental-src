package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.t;
import androidx.view.AbstractC1450w;
import androidx.view.InterfaceC1416b0;
import androidx.view.InterfaceC1423e0;
import java.util.Set;
import kotlin.Metadata;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: Wrapper.android.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\r\u001a\u00020\n2\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u001a\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010*\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010)R!\u0010,\u001a\r\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010+R\u0014\u0010/\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00100\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010.¨\u00061"}, d2 = {"Landroidx/compose/ui/platform/WrappedComposition;", "Landroidx/compose/runtime/y;", "Landroidx/lifecycle/b0;", "Landroidx/compose/runtime/l0;", "Landroidx/compose/ui/platform/AndroidComposeView;", "owner", "original", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;Landroidx/compose/runtime/y;)V", "Lkotlin/Function0;", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "content", "e", "(Lld/p;)V", "dispose", "()V", "Landroidx/lifecycle/e0;", "source", "Landroidx/lifecycle/w$a;", "event", "f", "(Landroidx/lifecycle/e0;Landroidx/lifecycle/w$a;)V", "T", "Landroidx/compose/runtime/k0;", "key", "h", "(Landroidx/compose/runtime/k0;)Ljava/lang/Object;", "b", "Landroidx/compose/ui/platform/AndroidComposeView;", "p", "()Landroidx/compose/ui/platform/AndroidComposeView;", "c", "Landroidx/compose/runtime/y;", "o", "()Landroidx/compose/runtime/y;", "", "d", "Z", "disposed", "Landroidx/lifecycle/w;", "Landroidx/lifecycle/w;", "addedToLifecycle", "Lld/p;", "lastContent", "i", "()Z", "hasInvalidations", "isDisposed", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class WrappedComposition implements androidx.compose.runtime.y, InterfaceC1416b0, androidx.compose.runtime.l0 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final AndroidComposeView owner;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.y original;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean disposed;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private AbstractC1450w addedToLifecycle;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> lastContent;

    /* compiled from: Wrapper.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView$c;", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/platform/AndroidComposeView$c;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<AndroidComposeView.c, kotlin.k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f19728c;

        /* compiled from: Wrapper.android.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.ui.platform.WrappedComposition$a$a, reason: collision with other inner class name */
        static final class C0356a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ WrappedComposition f19729b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f19730c;

            /* compiled from: Wrapper.android.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.WrappedComposition$setContent$1$1$1", f = "Wrapper.android.kt", i = {}, l = {SyslogAppender.LOG_LOCAL1}, m = "invokeSuspend", n = {}, s = {})
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.ui.platform.WrappedComposition$a$a$a, reason: collision with other inner class name */
            static final class C0357a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

                /* renamed from: b, reason: collision with root package name */
                int f19731b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ WrappedComposition f19732c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0357a(WrappedComposition wrappedComposition, kotlin.coroutines.d<? super C0357a> dVar) {
                    super(2, dVar);
                    this.f19732c = wrappedComposition;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.l
                public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                    return new C0357a(this.f19732c, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                public final Object invokeSuspend(@fg.l Object obj) {
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                    int i4 = this.f19731b;
                    if (i4 == 0) {
                        kotlin.a1.n(obj);
                        AndroidComposeView owner = this.f19732c.getOwner();
                        this.f19731b = 1;
                        if (owner.G0(this) == aVar) {
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
                    return ((C0357a) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
                }
            }

            /* compiled from: Wrapper.android.kt */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.ui.platform.WrappedComposition$a$a$b */
            static final class b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ WrappedComposition f19733b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f19734c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                b(WrappedComposition wrappedComposition, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar) {
                    super(2);
                    this.f19733b = wrappedComposition;
                    this.f19734c = pVar;
                }

                @androidx.compose.runtime.i
                public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
                    if ((i4 & 11) == 2 && tVar.p()) {
                        tVar.d0();
                        return;
                    }
                    if (androidx.compose.runtime.x.b0()) {
                        androidx.compose.runtime.x.r0(-1193460702, i4, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous>.<anonymous> (Wrapper.android.kt:138)");
                    }
                    o0.a(this.f19733b.getOwner(), this.f19734c, tVar, 8);
                    if (androidx.compose.runtime.x.b0()) {
                        androidx.compose.runtime.x.q0();
                    }
                }

                @Override // ld.p
                public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
                    a(tVar, num.intValue());
                    return kotlin.k2.f75408a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0356a(WrappedComposition wrappedComposition, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar) {
                super(2);
                this.f19729b = wrappedComposition;
                this.f19730c = pVar;
            }

            @androidx.compose.runtime.i
            public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
                if ((i4 & 11) == 2 && tVar.p()) {
                    tVar.d0();
                    return;
                }
                if (androidx.compose.runtime.x.b0()) {
                    androidx.compose.runtime.x.r0(-2000640158, i4, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous> (Wrapper.android.kt:124)");
                }
                AndroidComposeView owner = this.f19729b.getOwner();
                int i5 = t.b.K;
                Object tag = owner.getTag(i5);
                Set<androidx.compose.runtime.tooling.a> set = kotlin.jvm.internal.u1.J(tag) ? (Set) tag : null;
                if (set == null) {
                    Object parent = this.f19729b.getOwner().getParent();
                    View view = parent instanceof View ? (View) parent : null;
                    Object tag2 = view != null ? view.getTag(i5) : null;
                    set = kotlin.jvm.internal.u1.J(tag2) ? (Set) tag2 : null;
                }
                if (set != null) {
                    set.add(tVar.R());
                    tVar.M();
                }
                androidx.compose.runtime.a1.h(this.f19729b.getOwner(), new C0357a(this.f19729b, null), tVar, 72);
                androidx.compose.runtime.f0.b(androidx.compose.runtime.tooling.f.a().e(set), androidx.compose.runtime.internal.c.b(tVar, -1193460702, true, new b(this.f19729b, this.f19730c)), tVar, 56);
                if (androidx.compose.runtime.x.b0()) {
                    androidx.compose.runtime.x.q0();
                }
            }

            @Override // ld.p
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
                a(tVar, num.intValue());
                return kotlin.k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar) {
            super(1);
            this.f19728c = pVar;
        }

        public final void a(@fg.l AndroidComposeView.c cVar) {
            if (WrappedComposition.this.disposed) {
                return;
            }
            AbstractC1450w lifecycle = cVar.getLifecycleOwner().getLifecycle();
            WrappedComposition.this.lastContent = this.f19728c;
            if (WrappedComposition.this.addedToLifecycle == null) {
                WrappedComposition.this.addedToLifecycle = lifecycle;
                lifecycle.a(WrappedComposition.this);
            } else if (lifecycle.getState().isAtLeast(AbstractC1450w.b.CREATED)) {
                WrappedComposition.this.getOriginal().e(new androidx.compose.runtime.internal.b(-2000640158, true, new C0356a(WrappedComposition.this, this.f19728c)));
            }
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(AndroidComposeView.c cVar) {
            a(cVar);
            return kotlin.k2.f75408a;
        }
    }

    public WrappedComposition(@fg.l AndroidComposeView androidComposeView, @fg.l androidx.compose.runtime.y yVar) {
        this.owner = androidComposeView;
        this.original = yVar;
        g1.f19873a.getClass();
        this.lastContent = g1.f19874b;
    }

    @Override // androidx.compose.runtime.y
    /* renamed from: b */
    public boolean getDisposed() {
        return this.original.getDisposed();
    }

    @Override // androidx.compose.runtime.y
    public void dispose() {
        if (!this.disposed) {
            this.disposed = true;
            AndroidComposeView androidComposeView = this.owner;
            androidComposeView.getClass();
            androidComposeView.setTag(t.b.L, null);
            AbstractC1450w abstractC1450w = this.addedToLifecycle;
            if (abstractC1450w != null) {
                abstractC1450w.d(this);
            }
        }
        this.original.dispose();
    }

    @Override // androidx.compose.runtime.y
    @androidx.compose.runtime.j(scheme = "[0[0]]")
    public void e(@fg.l ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> content) {
        this.owner.B1(new a(content));
    }

    @Override // androidx.view.InterfaceC1416b0
    public void f(@fg.l InterfaceC1423e0 source, @fg.l AbstractC1450w.a event) {
        if (event == AbstractC1450w.a.ON_DESTROY) {
            dispose();
        } else {
            if (event != AbstractC1450w.a.ON_CREATE || this.disposed) {
                return;
            }
            e(this.lastContent);
        }
    }

    @Override // androidx.compose.runtime.l0
    @fg.m
    public <T> T h(@fg.l androidx.compose.runtime.k0<T> key) {
        androidx.compose.runtime.y yVar = this.original;
        androidx.compose.runtime.l0 l0Var = yVar instanceof androidx.compose.runtime.l0 ? (androidx.compose.runtime.l0) yVar : null;
        if (l0Var != null) {
            return (T) l0Var.h(key);
        }
        return null;
    }

    @Override // androidx.compose.runtime.y
    public boolean i() {
        return this.original.i();
    }

    @fg.l
    /* renamed from: o, reason: from getter */
    public final androidx.compose.runtime.y getOriginal() {
        return this.original;
    }

    @fg.l
    /* renamed from: p, reason: from getter */
    public final AndroidComposeView getOwner() {
        return this.owner;
    }
}
