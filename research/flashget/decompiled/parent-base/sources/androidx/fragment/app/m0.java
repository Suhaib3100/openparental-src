package androidx.fragment.app;

import android.os.Bundle;
import kotlin.Metadata;

/* compiled from: FragmentTransaction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aB\u0010\t\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0086\b¢\u0006\u0004\b\t\u0010\n\u001a4\u0010\u000b\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0086\b¢\u0006\u0004\b\u000b\u0010\f\u001aB\u0010\r\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0086\b¢\u0006\u0004\b\r\u0010\n¨\u0006\u000e"}, d2 = {"Landroidx/fragment/app/Fragment;", "F", "Landroidx/fragment/app/l0;", "", "containerViewId", "", "tag", "Landroid/os/Bundle;", "args", "a", "(Landroidx/fragment/app/l0;ILjava/lang/String;Landroid/os/Bundle;)Landroidx/fragment/app/l0;", "b", "(Landroidx/fragment/app/l0;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/fragment/app/l0;", "e", "fragment-ktx_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class m0 {
    public static final <F extends Fragment> l0 a(l0 l0Var, @androidx.annotation.d0 int i4, String str, Bundle bundle) {
        kotlin.jvm.internal.l0.p(l0Var, "<this>");
        kotlin.jvm.internal.l0.P();
        l0 j4 = l0Var.j(i4, Fragment.class, bundle, str);
        kotlin.jvm.internal.l0.o(j4, "add(containerViewId, F::class.java, args, tag)");
        return j4;
    }

    public static final <F extends Fragment> l0 b(l0 l0Var, String tag, Bundle bundle) {
        kotlin.jvm.internal.l0.p(l0Var, "<this>");
        kotlin.jvm.internal.l0.p(tag, "tag");
        kotlin.jvm.internal.l0.P();
        l0 m4 = l0Var.m(Fragment.class, bundle, tag);
        kotlin.jvm.internal.l0.o(m4, "add(F::class.java, args, tag)");
        return m4;
    }

    public static l0 c(l0 l0Var, int i4, String str, Bundle bundle, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            str = null;
        }
        if ((i5 & 4) != 0) {
            bundle = null;
        }
        kotlin.jvm.internal.l0.p(l0Var, "<this>");
        kotlin.jvm.internal.l0.P();
        l0 j4 = l0Var.j(i4, Fragment.class, bundle, str);
        kotlin.jvm.internal.l0.o(j4, "add(containerViewId, F::class.java, args, tag)");
        return j4;
    }

    public static l0 d(l0 l0Var, String tag, Bundle bundle, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            bundle = null;
        }
        kotlin.jvm.internal.l0.p(l0Var, "<this>");
        kotlin.jvm.internal.l0.p(tag, "tag");
        kotlin.jvm.internal.l0.P();
        l0 m4 = l0Var.m(Fragment.class, bundle, tag);
        kotlin.jvm.internal.l0.o(m4, "add(F::class.java, args, tag)");
        return m4;
    }

    public static final <F extends Fragment> l0 e(l0 l0Var, @androidx.annotation.d0 int i4, String str, Bundle bundle) {
        kotlin.jvm.internal.l0.p(l0Var, "<this>");
        kotlin.jvm.internal.l0.P();
        l0 G = l0Var.G(i4, Fragment.class, bundle, str);
        kotlin.jvm.internal.l0.o(G, "replace(containerViewId, F::class.java, args, tag)");
        return G;
    }

    public static l0 f(l0 l0Var, int i4, String str, Bundle bundle, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            str = null;
        }
        if ((i5 & 4) != 0) {
            bundle = null;
        }
        kotlin.jvm.internal.l0.p(l0Var, "<this>");
        kotlin.jvm.internal.l0.P();
        l0 G = l0Var.G(i4, Fragment.class, bundle, str);
        kotlin.jvm.internal.l0.o(G, "replace(containerViewId, F::class.java, args, tag)");
        return G;
    }
}
