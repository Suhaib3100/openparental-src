package kotlin.reflect.jvm.internal.impl.types.checker;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.reflect.jvm.internal.impl.types.h1;

/* compiled from: TypeCheckerProcedureCallbacksImpl.java */
/* loaded from: classes5.dex */
class t implements v {
    t() {
    }

    private static /* synthetic */ void b(int i5) {
        Object[] objArr = new Object[3];
        switch (i5) {
            case 1:
            case 4:
                objArr[0] = ProtectedSandApp.s("喰");
                break;
            case 2:
            case 7:
                objArr[0] = ProtectedSandApp.s("喯");
                break;
            case 3:
            default:
                objArr[0] = ProtectedSandApp.s("喪");
                break;
            case 5:
            case 10:
                objArr[0] = ProtectedSandApp.s("單");
                break;
            case 6:
            case 11:
                objArr[0] = ProtectedSandApp.s("喭");
                break;
            case 8:
                objArr[0] = ProtectedSandApp.s("喬");
                break;
            case 9:
                objArr[0] = ProtectedSandApp.s("喫");
                break;
        }
        objArr[1] = ProtectedSandApp.s("喱");
        switch (i5) {
            case 3:
            case 4:
                objArr[2] = ProtectedSandApp.s("営");
                break;
            case 5:
            case 6:
            case 7:
                objArr[2] = ProtectedSandApp.s("喵");
                break;
            case 8:
            case 9:
                objArr[2] = ProtectedSandApp.s("喴");
                break;
            case 10:
            case 11:
                objArr[2] = ProtectedSandApp.s("喳");
                break;
            default:
                objArr[2] = ProtectedSandApp.s("喲");
                break;
        }
        throw new IllegalArgumentException(String.format(ProtectedSandApp.s("喷"), objArr));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.v
    public boolean a(@d5.d h1 h1Var, @d5.d h1 h1Var2) {
        if (h1Var == null) {
            b(3);
        }
        if (h1Var2 == null) {
            b(4);
        }
        return h1Var.equals(h1Var2);
    }
}
