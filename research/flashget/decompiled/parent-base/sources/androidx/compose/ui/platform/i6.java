package androidx.compose.ui.platform;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlinx.coroutines.k2;

/* compiled from: WindowRecomposer.android.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@androidx.compose.ui.l
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ,\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0086\b¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001a¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/platform/i6;", "", "<init>", "()V", "Landroidx/compose/ui/platform/h6;", "factory", "c", "(Landroidx/compose/ui/platform/h6;)Landroidx/compose/ui/platform/h6;", "expected", "", "a", "(Landroidx/compose/ui/platform/h6;Landroidx/compose/ui/platform/h6;)Z", "Lkotlin/k2;", "d", "(Landroidx/compose/ui/platform/h6;)V", "R", "Lkotlin/Function0;", "block", "e", "(Landroidx/compose/ui/platform/h6;Lld/a;)Ljava/lang/Object;", "Landroid/view/View;", "rootView", "Landroidx/compose/runtime/i3;", "b", "(Landroid/view/View;)Landroidx/compose/runtime/i3;", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class i6 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final i6 f19941a = new i6();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final AtomicReference<h6> factory = new AtomicReference<>(h6.INSTANCE.c());

    /* renamed from: c, reason: collision with root package name */
    public static final int f19943c = 8;

    /* compiled from: WindowRecomposer.android.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"androidx/compose/ui/platform/i6$a", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "Lkotlin/k2;", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements View.OnAttachStateChangeListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.k2 f19944b;

        a(kotlinx.coroutines.k2 k2Var) {
            this.f19944b = k2Var;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@fg.l View v4) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@fg.l View v4) {
            v4.removeOnAttachStateChangeListener(this);
            k2.a.b(this.f19944b, null, 1, null);
        }
    }

    /* compiled from: WindowRecomposer.android.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1", f = "WindowRecomposer.android.kt", i = {}, l = {233}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f19945b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.i3 f19946c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ View f19947d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.runtime.i3 i3Var, View view, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f19946c = i3Var;
            this.f19947d = view;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return new b(this.f19946c, this.f19947d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            View view;
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f19945b;
            try {
                if (i4 == 0) {
                    kotlin.a1.n(obj);
                    androidx.compose.runtime.i3 i3Var = this.f19946c;
                    this.f19945b = 1;
                    if (i3Var.G0(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a1.n(obj);
                }
                if (WindowRecomposer_androidKt.f(view) == this.f19946c) {
                    WindowRecomposer_androidKt.j(this.f19947d, null);
                }
                return kotlin.k2.f75408a;
            } finally {
                if (WindowRecomposer_androidKt.f(this.f19947d) == this.f19946c) {
                    WindowRecomposer_androidKt.j(this.f19947d, null);
                }
            }
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((b) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }
    }

    private i6() {
    }

    @kotlin.w0
    public final boolean a(@fg.l h6 expected, @fg.l h6 factory2) {
        return androidx.compose.animation.core.k1.a(factory, expected, factory2);
    }

    @fg.l
    public final androidx.compose.runtime.i3 b(@fg.l View rootView) {
        kotlinx.coroutines.k2 f4;
        androidx.compose.runtime.i3 a5 = factory.get().a(rootView);
        WindowRecomposer_androidKt.j(rootView, a5);
        f4 = kotlinx.coroutines.k.f(kotlinx.coroutines.b2.f79269b, kotlinx.coroutines.android.g.i(rootView.getHandler(), "windowRecomposer cleanup").l1(), null, new b(a5, rootView, null), 2, null);
        rootView.addOnAttachStateChangeListener(new a(f4));
        return a5;
    }

    @fg.l
    @kotlin.w0
    public final h6 c(@fg.l h6 factory2) {
        return factory.getAndSet(factory2);
    }

    public final void d(@fg.l h6 factory2) {
        factory.set(factory2);
    }

    public final <R> R e(@fg.l h6 factory2, @fg.l ld.a<? extends R> block) {
        h6 c5 = c(factory2);
        try {
            R invoke = block.invoke();
            if (androidx.compose.animation.core.k1.a(factory, factory2, c5)) {
                return invoke;
            }
            throw new IllegalStateException("WindowRecomposerFactory was set to unexpected value; cannot safely restore old state");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (androidx.compose.animation.core.k1.a(factory, factory2, c5)) {
                    throw th2;
                }
                kotlin.o.a(th, new IllegalStateException("WindowRecomposerFactory was set to unexpected value; cannot safely restore old state"));
                throw th;
            }
        }
    }
}
