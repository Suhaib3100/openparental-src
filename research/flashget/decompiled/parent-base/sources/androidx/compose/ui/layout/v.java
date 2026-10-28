package androidx.compose.ui.layout;

import kotlin.Metadata;

/* compiled from: LayoutCoordinates.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\b\u001a\u00020\u0005*\u00020\u0000¢\u0006\u0004\b\b\u0010\u0007\u001a\u0011\u0010\t\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\t\u0010\u0003\u001a\u0011\u0010\n\u001a\u00020\u0005*\u00020\u0000¢\u0006\u0004\b\n\u0010\u0007\u001a\u0011\u0010\u000b\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/layout/u;", "Li0/f;", "f", "(Landroidx/compose/ui/layout/u;)J", "g", "Li0/i;", "b", "(Landroidx/compose/ui/layout/u;)Li0/i;", "c", "e", "a", "d", "(Landroidx/compose/ui/layout/u;)Landroidx/compose/ui/layout/u;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class v {
    @fg.l
    public static final i0.i a(@fg.l u uVar) {
        i0.i A;
        u n02 = uVar.n0();
        return (n02 == null || (A = u.A(n02, uVar, false, 2, null)) == null) ? new i0.i(0.0f, 0.0f, androidx.compose.ui.unit.u.m(uVar.c()), (int) (uVar.c() & 4294967295L)) : A;
    }

    @fg.l
    public static final i0.i b(@fg.l u uVar) {
        return u.A(d(uVar), uVar, false, 2, null);
    }

    @fg.l
    public static final i0.i c(@fg.l u uVar) {
        u d5 = d(uVar);
        i0.i b5 = b(uVar);
        float m4 = androidx.compose.ui.unit.u.m(d5.c());
        float c5 = (int) (d5.c() & 4294967295L);
        float H = kotlin.ranges.s.H(b5.t(), 0.0f, m4);
        float H2 = kotlin.ranges.s.H(b5.getTop(), 0.0f, c5);
        float H3 = kotlin.ranges.s.H(b5.x(), 0.0f, m4);
        float H4 = kotlin.ranges.s.H(b5.j(), 0.0f, c5);
        if (H == H3 || H2 == H4) {
            i0.i.INSTANCE.getClass();
            return i0.i.f74153g;
        }
        long e02 = d5.e0(i0.g.a(H, H2));
        long e03 = d5.e0(i0.g.a(H3, H2));
        long e04 = d5.e0(i0.g.a(H3, H4));
        long e05 = d5.e0(i0.g.a(H, H4));
        return new i0.i(kotlin.comparisons.a.l0(i0.f.p(e02), i0.f.p(e03), i0.f.p(e05), i0.f.p(e04)), kotlin.comparisons.a.l0(i0.f.r(e02), i0.f.r(e03), i0.f.r(e05), i0.f.r(e04)), kotlin.comparisons.a.Q(i0.f.p(e02), i0.f.p(e03), i0.f.p(e05), i0.f.p(e04)), kotlin.comparisons.a.Q(i0.f.r(e02), i0.f.r(e03), i0.f.r(e05), i0.f.r(e04)));
    }

    @fg.l
    public static final u d(@fg.l u uVar) {
        u uVar2;
        u n02 = uVar.n0();
        while (true) {
            u uVar3 = n02;
            uVar2 = uVar;
            uVar = uVar3;
            if (uVar == null) {
                break;
            }
            n02 = uVar.n0();
        }
        androidx.compose.ui.node.e1 e1Var = uVar2 instanceof androidx.compose.ui.node.e1 ? (androidx.compose.ui.node.e1) uVar2 : null;
        if (e1Var == null) {
            return uVar2;
        }
        androidx.compose.ui.node.e1 wrappedBy = e1Var.getWrappedBy();
        while (true) {
            androidx.compose.ui.node.e1 e1Var2 = wrappedBy;
            androidx.compose.ui.node.e1 e1Var3 = e1Var;
            e1Var = e1Var2;
            if (e1Var == null) {
                return e1Var3;
            }
            wrappedBy = e1Var.getWrappedBy();
        }
    }

    public static final long e(@fg.l u uVar) {
        u n02 = uVar.n0();
        if (n02 != null) {
            i0.f.INSTANCE.getClass();
            return n02.E(uVar, i0.f.f74147c);
        }
        i0.f.INSTANCE.getClass();
        return i0.f.f74147c;
    }

    public static final long f(@fg.l u uVar) {
        i0.f.INSTANCE.getClass();
        return uVar.r0(i0.f.f74147c);
    }

    public static final long g(@fg.l u uVar) {
        i0.f.INSTANCE.getClass();
        return uVar.e0(i0.f.f74147c);
    }
}
