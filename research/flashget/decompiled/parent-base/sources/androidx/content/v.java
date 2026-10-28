package androidx.content;

import androidx.annotation.d0;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.k;
import kotlin.k2;
import kotlin.x0;

/* compiled from: NavController.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001aD\u0010\n\u001a\u00020\t*\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u00012\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0087\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001aD\u0010\u000e\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0010"}, d2 = {"Landroidx/navigation/u;", "", "id", "startDestination", "Lkotlin/Function1;", "Landroidx/navigation/k0;", "Lkotlin/k2;", "Lkotlin/u;", "builder", "Landroidx/navigation/j0;", "a", "(Landroidx/navigation/u;IILld/l;)Landroidx/navigation/j0;", "", "route", "b", "(Landroidx/navigation/u;Ljava/lang/String;Ljava/lang/String;Lld/l;)Landroidx/navigation/j0;", "navigation-runtime_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class v {
    @l
    @k(message = "Use routes to create your NavGraph instead", replaceWith = @x0(expression = "createGraph(startDestination = startDestination.toString(), route = id.toString()) { builder.invoke() }", imports = {}))
    public static final j0 a(@l u uVar, @d0 int i4, @d0 int i5, @l ld.l<? super k0, k2> builder) {
        l0.p(uVar, "<this>");
        l0.p(builder, "builder");
        k0 k0Var = new k0(uVar.get_navigatorProvider(), i4, i5);
        builder.invoke(k0Var);
        return k0Var.c();
    }

    @l
    public static final j0 b(@l u uVar, @l String startDestination, @m String str, @l ld.l<? super k0, k2> builder) {
        l0.p(uVar, "<this>");
        l0.p(startDestination, "startDestination");
        l0.p(builder, "builder");
        k0 k0Var = new k0(uVar.get_navigatorProvider(), startDestination, str);
        builder.invoke(k0Var);
        return k0Var.c();
    }

    public static /* synthetic */ j0 c(u uVar, int i4, int i5, ld.l builder, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        l0.p(uVar, "<this>");
        l0.p(builder, "builder");
        k0 k0Var = new k0(uVar.get_navigatorProvider(), i4, i5);
        builder.invoke(k0Var);
        return k0Var.c();
    }

    public static /* synthetic */ j0 d(u uVar, String startDestination, String str, ld.l builder, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            str = null;
        }
        l0.p(uVar, "<this>");
        l0.p(startDestination, "startDestination");
        l0.p(builder, "builder");
        k0 k0Var = new k0(uVar.get_navigatorProvider(), startDestination, str);
        builder.invoke(k0Var);
        return k0Var.c();
    }
}
