package androidx.content.fragment;

import androidx.annotation.d0;
import androidx.content.k0;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.k2;
import kotlin.reflect.d;
import kotlin.x0;
import ld.l;

/* compiled from: FragmentNavigatorDestinationBuilder.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a*\u0010\u0006\u001a\u00020\u0005\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\b\u0006\u0010\u0007\u001aF\u0010\f\u001a\u00020\u0005\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00032\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0002\b\nH\u0087\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a(\u0010\u0010\u001a\u00020\u0005\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0086\b¢\u0006\u0004\b\u0010\u0010\u0011\u001aD\u0010\u0012\u001a\u00020\u0005\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0002\b\nH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Landroidx/fragment/app/Fragment;", "F", "Landroidx/navigation/k0;", "", "id", "Lkotlin/k2;", "a", "(Landroidx/navigation/k0;I)V", "Lkotlin/Function1;", "Landroidx/navigation/fragment/j;", "Lkotlin/u;", "builder", "b", "(Landroidx/navigation/k0;ILld/l;)V", "", "route", "c", "(Landroidx/navigation/k0;Ljava/lang/String;)V", "d", "(Landroidx/navigation/k0;Ljava/lang/String;Lld/l;)V", "navigation-fragment_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class k {
    @kotlin.k(message = "Use routes to create your FragmentDestination instead", replaceWith = @x0(expression = "fragment<F>(route = id.toString())", imports = {}))
    public static final <F extends Fragment> void a(k0 k0Var, @d0 int i4) {
        l0.p(k0Var, "<this>");
        i iVar = (i) k0Var.getProvider().e(i.class);
        l0.P();
        k0Var.m(new j(iVar, i4, (d<? extends Fragment>) l1.d(Fragment.class)));
    }

    @kotlin.k(message = "Use routes to create your FragmentDestination instead", replaceWith = @x0(expression = "fragment<F>(route = id.toString()) { builder.invoke() }", imports = {}))
    public static final <F extends Fragment> void b(k0 k0Var, @d0 int i4, l<? super j, k2> builder) {
        l0.p(k0Var, "<this>");
        l0.p(builder, "builder");
        i iVar = (i) k0Var.getProvider().e(i.class);
        l0.P();
        j jVar = new j(iVar, i4, (d<? extends Fragment>) l1.d(Fragment.class));
        builder.invoke(jVar);
        k0Var.m(jVar);
    }

    public static final <F extends Fragment> void c(k0 k0Var, String route) {
        l0.p(k0Var, "<this>");
        l0.p(route, "route");
        i iVar = (i) k0Var.getProvider().e(i.class);
        l0.P();
        k0Var.m(new j(iVar, route, (d<? extends Fragment>) l1.d(Fragment.class)));
    }

    public static final <F extends Fragment> void d(k0 k0Var, String route, l<? super j, k2> builder) {
        l0.p(k0Var, "<this>");
        l0.p(route, "route");
        l0.p(builder, "builder");
        i iVar = (i) k0Var.getProvider().e(i.class);
        l0.P();
        j jVar = new j(iVar, route, (d<? extends Fragment>) l1.d(Fragment.class));
        builder.invoke(jVar);
        k0Var.m(jVar);
    }
}
