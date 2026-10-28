package kotlin.reflect.jvm.internal.impl.types.checker;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.reflect.jvm.internal.impl.types.h1;

/* compiled from: TypeCheckerProcedureCallbacksImpl.java */
/* loaded from: classes7.dex */
class t implements v {
    t() {
    }

    private static /* synthetic */ void b(int i4) {
        Object[] objArr = new Object[3];
        switch (i4) {
            case 1:
            case 4:
                objArr[0] = ProtectedSandApp.s("綡\u0001");
                break;
            case 2:
            case 7:
                objArr[0] = ProtectedSandApp.s("綠\u0001");
                break;
            case 3:
            default:
                objArr[0] = ProtectedSandApp.s("綛\u0001");
                break;
            case 5:
            case 10:
                objArr[0] = ProtectedSandApp.s("綟\u0001");
                break;
            case 6:
            case 11:
                objArr[0] = ProtectedSandApp.s("綞\u0001");
                break;
            case 8:
                objArr[0] = ProtectedSandApp.s("綝\u0001");
                break;
            case 9:
                objArr[0] = ProtectedSandApp.s("綜\u0001");
                break;
        }
        objArr[1] = ProtectedSandApp.s("綢\u0001");
        switch (i4) {
            case 3:
            case 4:
                objArr[2] = ProtectedSandApp.s("綧\u0001");
                break;
            case 5:
            case 6:
            case 7:
                objArr[2] = ProtectedSandApp.s("綦\u0001");
                break;
            case 8:
            case 9:
                objArr[2] = ProtectedSandApp.s("綥\u0001");
                break;
            case 10:
            case 11:
                objArr[2] = ProtectedSandApp.s("綤\u0001");
                break;
            default:
                objArr[2] = ProtectedSandApp.s("綣\u0001");
                break;
        }
        throw new IllegalArgumentException(String.format(ProtectedSandApp.s("綨\u0001"), objArr));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.v
    public boolean a(@fg.l h1 h1Var, @fg.l h1 h1Var2) {
        if (h1Var == null) {
            b(3);
        }
        if (h1Var2 == null) {
            b(4);
        }
        return h1Var.equals(h1Var2);
    }
}
