package androidx.window.sidecar;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.c1;
import androidx.window.extensions.layout.WindowLayoutComponent;
import fg.l;
import fg.m;
import kd.i;
import kd.n;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;

/* compiled from: WindowInfoTracker.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/window/layout/x;", "", "Landroid/app/Activity;", "activity", "Lkotlinx/coroutines/flow/i;", "Landroidx/window/layout/b0;", "c", "(Landroid/app/Activity;)Lkotlinx/coroutines/flow/i;", "a", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface x {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    public static final Companion INSTANCE = Companion.f35870a;

    /* compiled from: WindowInfoTracker.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0003R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0018¨\u0006\u001a"}, d2 = {"Landroidx/window/layout/x$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroidx/window/layout/x;", "a", "(Landroid/content/Context;)Landroidx/window/layout/x;", "Landroidx/window/layout/w;", "d", "(Landroid/content/Context;)Landroidx/window/layout/w;", "Landroidx/window/layout/y;", "overridingDecorator", "Lkotlin/k2;", "b", "(Landroidx/window/layout/y;)V", "c", "", "Z", "DEBUG", "", "Ljava/lang/String;", "TAG", "Landroidx/window/layout/y;", "decorator", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* renamed from: androidx.window.layout.x$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final boolean DEBUG = false;

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f35870a = new Companion();

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @m
        private static final String TAG = l1.d(x.class).W();

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @l
        private static y decorator = m.f35811a;

        private Companion() {
        }

        @l
        @n
        @i(name = "getOrCreate")
        public final x a(@l Context context) {
            l0.p(context, "context");
            return decorator.a(new z(g0.f35808b, d(context)));
        }

        @n
        @c1({c1.a.LIBRARY_GROUP})
        public final void b(@l y overridingDecorator) {
            l0.p(overridingDecorator, "overridingDecorator");
            decorator = overridingDecorator;
        }

        @n
        @c1({c1.a.LIBRARY_GROUP})
        public final void c() {
            decorator = m.f35811a;
        }

        @l
        public final w d(@l Context context) {
            l0.p(context, "context");
            o oVar = null;
            try {
                WindowLayoutComponent m4 = s.f35841a.m();
                if (m4 != null) {
                    oVar = new o(m4);
                }
            } catch (Throwable unused) {
            }
            return oVar == null ? u.INSTANCE.a(context) : oVar;
        }
    }

    @n
    @c1({c1.a.LIBRARY_GROUP})
    static void a(@l y yVar) {
        INSTANCE.b(yVar);
    }

    @l
    @n
    @i(name = "getOrCreate")
    static x b(@l Context context) {
        return INSTANCE.a(context);
    }

    @n
    @c1({c1.a.LIBRARY_GROUP})
    static void reset() {
        INSTANCE.c();
    }

    @l
    kotlinx.coroutines.flow.i<b0> c(@l Activity activity);
}
