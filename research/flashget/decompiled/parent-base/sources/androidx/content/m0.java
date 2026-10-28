package androidx.content;

import androidx.annotation.d0;
import fg.l;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: NavGraph.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001e\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0086\n¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\n¢\u0006\u0004\b\b\u0010\t\u001a\u001e\u0010\u000b\u001a\u00020\n*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u001c\u0010\r\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u001c\u0010\u0011\u001a\u00020\u0010*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0003H\u0086\n¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001c\u0010\u0014\u001a\u00020\u0010*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0000H\u0086\n¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001c\u0010\u0016\u001a\u00020\u0010*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0003H\u0086\n¢\u0006\u0004\b\u0016\u0010\u0012¨\u0006\u0017"}, d2 = {"Landroidx/navigation/j0;", "", "id", "Landroidx/navigation/f0;", "c", "(Landroidx/navigation/j0;I)Landroidx/navigation/f0;", "", "route", "d", "(Landroidx/navigation/j0;Ljava/lang/String;)Landroidx/navigation/f0;", "", "a", "(Landroidx/navigation/j0;I)Z", "b", "(Landroidx/navigation/j0;Ljava/lang/String;)Z", "node", "Lkotlin/k2;", "f", "(Landroidx/navigation/j0;Landroidx/navigation/f0;)V", "other", "g", "(Landroidx/navigation/j0;Landroidx/navigation/j0;)V", "e", "navigation-common_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class m0 {
    public static final boolean a(@l j0 j0Var, @d0 int i4) {
        l0.p(j0Var, "<this>");
        return j0Var.g0(i4, true) != null;
    }

    public static final boolean b(@l j0 j0Var, @l String route) {
        l0.p(j0Var, "<this>");
        l0.p(route, "route");
        return j0Var.h0(route) != null;
    }

    @l
    public static final f0 c(@l j0 j0Var, @d0 int i4) {
        l0.p(j0Var, "<this>");
        f0 g02 = j0Var.g0(i4, true);
        if (g02 != null) {
            return g02;
        }
        throw new IllegalArgumentException("No destination for " + i4 + " was found in " + j0Var);
    }

    @l
    public static final f0 d(@l j0 j0Var, @l String route) {
        l0.p(j0Var, "<this>");
        l0.p(route, "route");
        f0 h02 = j0Var.h0(route);
        if (h02 != null) {
            return h02;
        }
        throw new IllegalArgumentException("No destination for " + route + " was found in " + j0Var);
    }

    public static final void e(@l j0 j0Var, @l f0 node) {
        l0.p(j0Var, "<this>");
        l0.p(node, "node");
        j0Var.q0(node);
    }

    public static final void f(@l j0 j0Var, @l f0 node) {
        l0.p(j0Var, "<this>");
        l0.p(node, "node");
        j0Var.b0(node);
    }

    public static final void g(@l j0 j0Var, @l j0 other) {
        l0.p(j0Var, "<this>");
        l0.p(other, "other");
        j0Var.a0(other);
    }
}
