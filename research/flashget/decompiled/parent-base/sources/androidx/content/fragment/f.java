package androidx.content.fragment;

import androidx.annotation.d0;
import androidx.content.k0;
import androidx.fragment.app.e;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.k;
import kotlin.k2;
import kotlin.reflect.d;
import kotlin.x0;
import ld.l;

/* compiled from: DialogFragmentNavigatorDestinationBuilder.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a*\u0010\u0006\u001a\u00020\u0005\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\b\u0006\u0010\u0007\u001aF\u0010\f\u001a\u00020\u0005\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00032\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0002\b\nH\u0087\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a(\u0010\u0010\u001a\u00020\u0005\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0086\b¢\u0006\u0004\b\u0010\u0010\u0011\u001aD\u0010\u0012\u001a\u00020\u0005\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0002\b\nH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Landroidx/fragment/app/e;", "F", "Landroidx/navigation/k0;", "", "id", "Lkotlin/k2;", "a", "(Landroidx/navigation/k0;I)V", "Lkotlin/Function1;", "Landroidx/navigation/fragment/e;", "Lkotlin/u;", "builder", "b", "(Landroidx/navigation/k0;ILld/l;)V", "", "route", "c", "(Landroidx/navigation/k0;Ljava/lang/String;)V", "d", "(Landroidx/navigation/k0;Ljava/lang/String;Lld/l;)V", "navigation-fragment_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f {
    @k(message = "Use routes to create your DialogFragmentDestination instead", replaceWith = @x0(expression = "dialog<F>(route = id.toString())", imports = {}))
    public static final <F extends e> void a(k0 k0Var, @d0 int i4) {
        l0.p(k0Var, "<this>");
        d dVar = (d) k0Var.getProvider().e(d.class);
        l0.P();
        k0Var.m(new e(dVar, i4, (d<? extends e>) l1.d(e.class)));
    }

    @k(message = "Use routes to create your DialogFragmentDestination instead", replaceWith = @x0(expression = "dialog<F>(route = id.toString()) { builder.invoke() }", imports = {}))
    public static final <F extends e> void b(k0 k0Var, @d0 int i4, l<? super e, k2> builder) {
        l0.p(k0Var, "<this>");
        l0.p(builder, "builder");
        d dVar = (d) k0Var.getProvider().e(d.class);
        l0.P();
        e eVar = new e(dVar, i4, (d<? extends e>) l1.d(e.class));
        builder.invoke(eVar);
        k0Var.m(eVar);
    }

    public static final <F extends e> void c(k0 k0Var, String route) {
        l0.p(k0Var, "<this>");
        l0.p(route, "route");
        d dVar = (d) k0Var.getProvider().e(d.class);
        l0.P();
        k0Var.m(new e(dVar, route, (d<? extends e>) l1.d(e.class)));
    }

    public static final <F extends e> void d(k0 k0Var, String route, l<? super e, k2> builder) {
        l0.p(k0Var, "<this>");
        l0.p(route, "route");
        l0.p(builder, "builder");
        d dVar = (d) k0Var.getProvider().e(d.class);
        l0.P();
        e eVar = new e(dVar, route, (d<? extends e>) l1.d(e.class));
        builder.invoke(eVar);
        k0Var.m(eVar);
    }
}
