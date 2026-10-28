package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: AbstractStrictEqualityTypeChecker.kt */
/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final e f26383a = new e();

    private e() {
    }

    private final boolean a(h4.r rVar, h4.k kVar, h4.k kVar2) {
        if (rVar.U(kVar) == rVar.U(kVar2) && rVar.y(kVar) == rVar.y(kVar2)) {
            if ((rVar.R(kVar) == null) == (rVar.R(kVar2) == null) && rVar.I(rVar.g(kVar), rVar.g(kVar2))) {
                if (rVar.n0(kVar, kVar2)) {
                    return true;
                }
                int U = rVar.U(kVar);
                for (int i5 = 0; i5 < U; i5++) {
                    h4.n C = rVar.C(kVar, i5);
                    h4.n C2 = rVar.C(kVar2, i5);
                    if (rVar.o(C) != rVar.o(C2)) {
                        return false;
                    }
                    if (!rVar.o(C) && (rVar.q(C) != rVar.q(C2) || !c(rVar, rVar.r(C), rVar.r(C2)))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    private final boolean c(h4.r rVar, h4.i iVar, h4.i iVar2) {
        if (iVar == iVar2) {
            return true;
        }
        h4.k e6 = rVar.e(iVar);
        h4.k e7 = rVar.e(iVar2);
        if (e6 != null && e7 != null) {
            return a(rVar, e6, e7);
        }
        h4.g z5 = rVar.z(iVar);
        h4.g z6 = rVar.z(iVar2);
        if (z5 == null || z6 == null) {
            return false;
        }
        return a(rVar, rVar.b(z5), rVar.b(z6)) && a(rVar, rVar.d(z5), rVar.d(z6));
    }

    public final boolean b(@d5.d h4.r rVar, @d5.d h4.i iVar, @d5.d h4.i iVar2) {
        kotlin.jvm.internal.l0.p(rVar, ProtectedSandApp.s("嘑"));
        kotlin.jvm.internal.l0.p(iVar, ProtectedSandApp.s("嘒"));
        kotlin.jvm.internal.l0.p(iVar2, ProtectedSandApp.s("嘓"));
        return c(rVar, iVar, iVar2);
    }
}
