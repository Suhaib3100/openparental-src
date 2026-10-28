package androidx.window.sidecar;

import android.app.Activity;
import androidx.annotation.c1;
import androidx.window.core.d;
import fg.l;
import kd.n;
import kotlin.Metadata;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;

/* compiled from: WindowMetricsCalculator.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/window/layout/d0;", "", "Landroid/app/Activity;", "activity", "Landroidx/window/layout/c0;", "c", "(Landroid/app/Activity;)Landroidx/window/layout/c0;", "d", "a", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface d0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    public static final Companion INSTANCE = Companion.f35802a;

    /* compiled from: WindowMetricsCalculator.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\u0003R\"\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000e¨\u0006\u0010"}, d2 = {"Landroidx/window/layout/d0$a;", "", "<init>", "()V", "Landroidx/window/layout/d0;", "a", "()Landroidx/window/layout/d0;", "Landroidx/window/layout/h0;", "overridingDecorator", "Lkotlin/k2;", "b", "(Landroidx/window/layout/h0;)V", "c", "Lkotlin/Function1;", "Lld/l;", "decorator", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* renamed from: androidx.window.layout.d0$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f35802a = new Companion();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @l
        private static ld.l<? super d0, ? extends d0> decorator = C0636a.f35804b;

        /* compiled from: WindowMetricsCalculator.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/window/layout/d0;", "it", "a", "(Landroidx/window/layout/d0;)Landroidx/window/layout/d0;"}, k = 3, mv = {1, 6, 0})
        /* renamed from: androidx.window.layout.d0$a$a, reason: collision with other inner class name */
        static final class C0636a extends n0 implements ld.l<d0, d0> {

            /* renamed from: b, reason: collision with root package name */
            public static final C0636a f35804b = new C0636a(1);

            C0636a() {
                super(1);
            }

            @l
            public final d0 a(@l d0 it) {
                l0.p(it, "it");
                return it;
            }

            @Override // ld.l
            public d0 invoke(d0 d0Var) {
                d0 it = d0Var;
                l0.p(it, "it");
                return it;
            }
        }

        /* compiled from: WindowMetricsCalculator.kt */
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        /* renamed from: androidx.window.layout.d0$a$b */
        /* synthetic */ class b extends h0 implements ld.l<d0, d0> {
            b(Object obj) {
                super(1, obj, h0.class, "decorate", "decorate(Landroidx/window/layout/WindowMetricsCalculator;)Landroidx/window/layout/WindowMetricsCalculator;", 0);
            }

            @Override // ld.l
            @l
            /* renamed from: Z, reason: merged with bridge method [inline-methods] */
            public final d0 invoke(@l d0 p02) {
                l0.p(p02, "p0");
                return ((h0) this.receiver).a(p02);
            }
        }

        /* compiled from: WindowMetricsCalculator.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/window/layout/d0;", "it", "a", "(Landroidx/window/layout/d0;)Landroidx/window/layout/d0;"}, k = 3, mv = {1, 6, 0})
        /* renamed from: androidx.window.layout.d0$a$c */
        static final class c extends n0 implements ld.l<d0, d0> {

            /* renamed from: b, reason: collision with root package name */
            public static final c f35805b = new c(1);

            c() {
                super(1);
            }

            @l
            public final d0 a(@l d0 it) {
                l0.p(it, "it");
                return it;
            }

            @Override // ld.l
            public d0 invoke(d0 d0Var) {
                d0 it = d0Var;
                l0.p(it, "it");
                return it;
            }
        }

        private Companion() {
        }

        @l
        @n
        public final d0 a() {
            return decorator.invoke(g0.f35808b);
        }

        @d
        @n
        @c1({c1.a.TESTS})
        public final void b(@l h0 overridingDecorator) {
            l0.p(overridingDecorator, "overridingDecorator");
            decorator = new b(overridingDecorator);
        }

        @d
        @n
        @c1({c1.a.TESTS})
        public final void c() {
            decorator = c.f35805b;
        }
    }

    @d
    @n
    @c1({c1.a.TESTS})
    static void a(@l h0 h0Var) {
        INSTANCE.b(h0Var);
    }

    @l
    @n
    static d0 b() {
        return INSTANCE.a();
    }

    @d
    @n
    @c1({c1.a.TESTS})
    static void reset() {
        INSTANCE.c();
    }

    @l
    c0 c(@l Activity activity);

    @l
    c0 d(@l Activity activity);
}
