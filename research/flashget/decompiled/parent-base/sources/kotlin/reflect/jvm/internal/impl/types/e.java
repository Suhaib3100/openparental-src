package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: AbstractStrictEqualityTypeChecker.kt */
/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final e f78391a = new e();

    private e() {
    }

    private final boolean a(ce.q qVar, ce.j jVar, ce.j jVar2) {
        if (qVar.D0(jVar) == qVar.D0(jVar2) && qVar.O(jVar) == qVar.O(jVar2)) {
            if ((qVar.B(jVar) == null) == (qVar.B(jVar2) == null) && qVar.I(qVar.d(jVar), qVar.d(jVar2))) {
                if (qVar.D(jVar, jVar2)) {
                    return true;
                }
                int D0 = qVar.D0(jVar);
                for (int i4 = 0; i4 < D0; i4++) {
                    ce.m h02 = qVar.h0(jVar, i4);
                    ce.m h03 = qVar.h0(jVar2, i4);
                    if (qVar.y(h02) != qVar.y(h03)) {
                        return false;
                    }
                    if (!qVar.y(h02) && (qVar.s(h02) != qVar.s(h03) || !c(qVar, qVar.n0(h02), qVar.n0(h03)))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    private final boolean c(ce.q qVar, ce.i iVar, ce.i iVar2) {
        if (iVar == iVar2) {
            return true;
        }
        ce.j g4 = qVar.g(iVar);
        ce.j g5 = qVar.g(iVar2);
        if (g4 != null && g5 != null) {
            return a(qVar, g4, g5);
        }
        ce.g P = qVar.P(iVar);
        ce.g P2 = qVar.P(iVar2);
        if (P == null || P2 == null) {
            return false;
        }
        return a(qVar, qVar.b(P), qVar.b(P2)) && a(qVar, qVar.c(P), qVar.c(P2));
    }

    public final boolean b(@fg.l ce.q qVar, @fg.l ce.i iVar, @fg.l ce.i iVar2) {
        kotlin.jvm.internal.l0.p(qVar, ProtectedSandApp.s("縌\u0001"));
        kotlin.jvm.internal.l0.p(iVar, ProtectedSandApp.s("縍\u0001"));
        kotlin.jvm.internal.l0.p(iVar2, ProtectedSandApp.s("縎\u0001"));
        return c(qVar, iVar, iVar2);
    }
}
