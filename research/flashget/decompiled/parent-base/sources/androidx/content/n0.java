package androidx.content;

import android.os.Bundle;
import android.support.v4.media.d;
import androidx.content.c1;
import fg.l;
import fg.m;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;

/* compiled from: NavGraphNavigator.kt */
@c1.b("navigation")
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0006\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J1\u0010\u0014\u001a\u00020\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00122\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/navigation/n0;", "Landroidx/navigation/c1;", "Landroidx/navigation/j0;", "Landroidx/navigation/d1;", "navigatorProvider", "<init>", "(Landroidx/navigation/d1;)V", "Landroidx/navigation/s;", "entry", "Landroidx/navigation/t0;", "navOptions", "Landroidx/navigation/c1$a;", "navigatorExtras", "Lkotlin/k2;", "m", "(Landroidx/navigation/s;Landroidx/navigation/t0;Landroidx/navigation/c1$a;)V", "l", "()Landroidx/navigation/j0;", "", "entries", "e", "(Ljava/util/List;Landroidx/navigation/t0;Landroidx/navigation/c1$a;)V", "c", "Landroidx/navigation/d1;", "navigation-common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public class n0 extends c1<j0> {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final d1 navigatorProvider;

    public n0(@l d1 navigatorProvider) {
        l0.p(navigatorProvider, "navigatorProvider");
        this.navigatorProvider = navigatorProvider;
    }

    private final void m(s entry, t0 navOptions, c1.a navigatorExtras) {
        j0 j0Var = (j0) entry.getDestination();
        Bundle arguments = entry.getArguments();
        int n02 = j0Var.n0();
        String startDestinationRoute = j0Var.getStartDestinationRoute();
        if (n02 == 0 && startDestinationRoute == null) {
            throw new IllegalStateException(l0.C("no start destination defined via app:startDestination for ", j0Var.r()).toString());
        }
        f0 i02 = startDestinationRoute != null ? j0Var.i0(startDestinationRoute, false) : j0Var.g0(n02, false);
        if (i02 == null) {
            throw new IllegalArgumentException(d.a("navigation destination ", j0Var.l0(), " is not a direct child of this NavGraph"));
        }
        this.navigatorProvider.f(i02.getNavigatorName()).e(w.k(b().a(i02, i02.i(arguments))), navOptions, navigatorExtras);
    }

    @Override // androidx.content.c1
    public void e(@l List<s> entries, @m t0 navOptions, @m c1.a navigatorExtras) {
        l0.p(entries, "entries");
        Iterator<s> it = entries.iterator();
        while (it.hasNext()) {
            m(it.next(), navOptions, navigatorExtras);
        }
    }

    @Override // androidx.content.c1
    @l
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public j0 a() {
        return new j0(this);
    }
}
