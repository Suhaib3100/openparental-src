package androidx.customview.poolingcontainer;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.d2;
import androidx.core.view.f2;
import androidx.customview.poolingcontainer.d;
import fg.l;
import java.util.Iterator;
import kd.i;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: PoolingContainer.kt */
@i(name = "PoolingContainer")
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u0011\u0010\u0007\u001a\u00020\u0003*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0011\u0010\n\u001a\u00020\u0003*\u00020\t¢\u0006\u0004\b\n\u0010\u000b\"\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\r\"\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\r\"(\u0010\u0016\u001a\u00020\u0010*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00108F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\"\u0015\u0010\u0018\u001a\u00020\u0010*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0013\"\u0018\u0010\u001c\u001a\u00020\u0019*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Landroid/view/View;", "Landroidx/customview/poolingcontainer/b;", "listener", "Lkotlin/k2;", "a", "(Landroid/view/View;Landroidx/customview/poolingcontainer/b;)V", "g", "b", "(Landroid/view/View;)V", "Landroid/view/ViewGroup;", "c", "(Landroid/view/ViewGroup;)V", "", "I", "PoolingContainerListenerHolderTag", "IsPoolingContainerTag", "", "value", "e", "(Landroid/view/View;)Z", "h", "(Landroid/view/View;Z)V", "isPoolingContainer", "f", "isWithinPoolingContainer", "Landroidx/customview/poolingcontainer/c;", "d", "(Landroid/view/View;)Landroidx/customview/poolingcontainer/c;", "poolingContainerListenerHolder", "customview-poolingcontainer_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final int f28326a = d.a.f28330b;

    /* renamed from: b, reason: collision with root package name */
    private static final int f28327b = d.a.f28329a;

    @SuppressLint({"ExecutorRegistration"})
    public static final void a(@l View view, @l b listener) {
        l0.p(view, "<this>");
        l0.p(listener, "listener");
        d(view).a(listener);
    }

    public static final void b(@l View view) {
        l0.p(view, "<this>");
        Iterator<View> it = f2.i(view).iterator();
        while (it.hasNext()) {
            d(it.next()).b();
        }
    }

    public static final void c(@l ViewGroup viewGroup) {
        l0.p(viewGroup, "<this>");
        Iterator<View> it = d2.e(viewGroup).iterator();
        while (it.hasNext()) {
            d(it.next()).b();
        }
    }

    private static final c d(View view) {
        int i4 = f28326a;
        c cVar = (c) view.getTag(i4);
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        view.setTag(i4, cVar2);
        return cVar2;
    }

    public static final boolean e(@l View view) {
        l0.p(view, "<this>");
        Object tag = view.getTag(f28327b);
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean f(@l View view) {
        l0.p(view, "<this>");
        for (Object obj : f2.j(view)) {
            if ((obj instanceof View) && e((View) obj)) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"ExecutorRegistration"})
    public static final void g(@l View view, @l b listener) {
        l0.p(view, "<this>");
        l0.p(listener, "listener");
        d(view).c(listener);
    }

    public static final void h(@l View view, boolean z4) {
        l0.p(view, "<this>");
        view.setTag(f28327b, Boolean.valueOf(z4));
    }
}
