package androidx.content;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.d0;
import androidx.content.i1;
import androidx.core.app.b;
import fg.l;
import fg.m;
import java.lang.ref.WeakReference;
import kd.j;
import kd.n;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.sequences.p;

/* compiled from: Navigation.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0013\u001a\u00020\u00122\b\b\u0001\u0010\u000f\u001a\u00020\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0019\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001d\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001d\u0010\u000eJ\u0019\u0010\u001e\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001e\u0010\u000e¨\u0006\u001f"}, d2 = {"Landroidx/navigation/b1;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "", "viewId", "Landroidx/navigation/u;", "j", "(Landroid/app/Activity;I)Landroidx/navigation/u;", "Landroid/view/View;", "view", "k", "(Landroid/view/View;)Landroidx/navigation/u;", "resId", "Landroid/os/Bundle;", "args", "Landroid/view/View$OnClickListener;", "e", "(ILandroid/os/Bundle;)Landroid/view/View$OnClickListener;", "Landroidx/navigation/i0;", "directions", "f", "(Landroidx/navigation/i0;)Landroid/view/View$OnClickListener;", "controller", "Lkotlin/k2;", "n", "(Landroid/view/View;Landroidx/navigation/u;)V", "l", "m", "navigation-runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    @l
    public static final b1 f31008a = new b1();

    /* compiled from: Navigation.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/view/View;", "it", "a", "(Landroid/view/View;)Landroid/view/View;"}, k = 3, mv = {1, 6, 0})
    /* renamed from: androidx.navigation.b1$a, reason: from Kotlin metadata */
    static final class View extends n0 implements ld.l<android.view.View, android.view.View> {

        /* renamed from: b, reason: collision with root package name */
        public static final View f31009b = new View(1);

        View() {
            super(1);
        }

        @Override // ld.l
        @m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final android.view.View invoke(@l android.view.View it) {
            l0.p(it, "it");
            Object parent = it.getParent();
            if (parent instanceof android.view.View) {
                return (android.view.View) parent;
            }
            return null;
        }
    }

    /* compiled from: Navigation.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Landroidx/navigation/u;", "a", "(Landroid/view/View;)Landroidx/navigation/u;"}, k = 3, mv = {1, 6, 0})
    /* renamed from: androidx.navigation.b1$b, reason: from Kotlin metadata and case insensitive filesystem */
    static final class C1455b extends n0 implements ld.l<android.view.View, u> {

        /* renamed from: b, reason: collision with root package name */
        public static final C1455b f31010b = new C1455b(1);

        C1455b() {
            super(1);
        }

        @Override // ld.l
        @m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final u invoke(@l android.view.View it) {
            l0.p(it, "it");
            return b1.f31008a.m(it);
        }
    }

    private b1() {
    }

    @l
    @j
    @n
    public static final View.OnClickListener d(@d0 int i4) {
        return g(i4, null, 2, null);
    }

    @l
    @j
    @n
    public static final View.OnClickListener e(@d0 int resId, @m Bundle args) {
        return new a1(resId, args);
    }

    @l
    @n
    public static final View.OnClickListener f(@l final i0 directions) {
        l0.p(directions, "directions");
        return new View.OnClickListener() { // from class: androidx.navigation.z0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b1.i(i0.this, view);
            }
        };
    }

    public static View.OnClickListener g(int i4, Bundle bundle, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            bundle = null;
        }
        return new a1(i4, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(int i4, Bundle bundle, android.view.View view) {
        l0.o(view, "view");
        k(view).X(i4, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(i0 directions, android.view.View view) {
        l0.p(directions, "$directions");
        l0.o(view, "view");
        k(view).h0(directions);
    }

    @l
    @n
    public static final u j(@l Activity activity, @d0 int viewId) {
        l0.p(activity, "activity");
        android.view.View m4 = b.m(activity, viewId);
        l0.o(m4, "requireViewById<View>(activity, viewId)");
        u l4 = f31008a.l(m4);
        if (l4 != null) {
            return l4;
        }
        throw new IllegalStateException("Activity " + activity + " does not have a NavController set on " + viewId);
    }

    @l
    @n
    public static final u k(@l android.view.View view) {
        l0.p(view, "view");
        u l4 = f31008a.l(view);
        if (l4 != null) {
            return l4;
        }
        throw new IllegalStateException("View " + view + " does not have a NavController set");
    }

    private final u l(android.view.View view) {
        return (u) p.F0(p.p1(p.l(view, View.f31009b), C1455b.f31010b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final u m(android.view.View view) {
        Object tag = view.getTag(i1.b.f31144a);
        if (tag instanceof WeakReference) {
            return (u) ((WeakReference) tag).get();
        }
        if (tag instanceof u) {
            return (u) tag;
        }
        return null;
    }

    @n
    public static final void n(@l android.view.View view, @m u controller) {
        l0.p(view, "view");
        view.setTag(i1.b.f31144a, controller);
    }
}
