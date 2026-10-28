package androidx.content;

import androidx.annotation.d0;
import fg.l;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.k;
import kotlin.k2;
import kotlin.x0;

/* compiled from: ActivityNavigatorDestinationBuilder.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a:\u0010\b\u001a\u00020\u0005*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u00012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a8\u0010\f\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000e"}, d2 = {"Landroidx/navigation/k0;", "", "id", "Lkotlin/Function1;", "Landroidx/navigation/e;", "Lkotlin/k2;", "Lkotlin/u;", "builder", "a", "(Landroidx/navigation/k0;ILld/l;)V", "", "route", "b", "(Landroidx/navigation/k0;Ljava/lang/String;Lld/l;)V", "navigation-runtime_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f {
    @k(message = "Use routes to build your ActivityDestination instead", replaceWith = @x0(expression = "activity(route = id.toString()) { builder.invoke() }", imports = {}))
    public static final void a(@l k0 k0Var, @d0 int i4, @l ld.l<? super e, k2> builder) {
        l0.p(k0Var, "<this>");
        l0.p(builder, "builder");
        e eVar = new e((d) k0Var.getProvider().e(d.class), i4);
        builder.invoke(eVar);
        k0Var.m(eVar);
    }

    public static final void b(@l k0 k0Var, @l String route, @l ld.l<? super e, k2> builder) {
        l0.p(k0Var, "<this>");
        l0.p(route, "route");
        l0.p(builder, "builder");
        e eVar = new e((d) k0Var.getProvider().e(d.class), route);
        builder.invoke(eVar);
        k0Var.m(eVar);
    }
}
