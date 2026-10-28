package kotlin.reflect.jvm.internal.impl.types.checker;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.reflect.jvm.internal.impl.types.h0;

/* compiled from: TypeCheckingProcedure.java */
/* loaded from: classes5.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ boolean f26373a = false;

    private static /* synthetic */ void a(int i5) {
        String s5 = (i5 == 7 || i5 == 10) ? ProtectedSandApp.s("喹") : ProtectedSandApp.s("喸");
        Object[] objArr = new Object[(i5 == 7 || i5 == 10) ? 2 : 3];
        String s6 = ProtectedSandApp.s("喺");
        switch (i5) {
            case 1:
            case 3:
            case 18:
            case 20:
                objArr[0] = ProtectedSandApp.s("嗇");
                break;
            case 2:
            case 17:
            case 19:
            default:
                objArr[0] = ProtectedSandApp.s("喻");
                break;
            case 4:
                objArr[0] = ProtectedSandApp.s("嗆");
                break;
            case 5:
            case 8:
            case 23:
                objArr[0] = ProtectedSandApp.s("嗅");
                break;
            case 6:
            case 9:
                objArr[0] = ProtectedSandApp.s("嗄");
                break;
            case 7:
            case 10:
                objArr[0] = s6;
                break;
            case 11:
                objArr[0] = ProtectedSandApp.s("嗃");
                break;
            case 12:
                objArr[0] = ProtectedSandApp.s("嗂");
                break;
            case 13:
                objArr[0] = ProtectedSandApp.s("嗁");
                break;
            case 14:
                objArr[0] = ProtectedSandApp.s("嗀");
                break;
            case 15:
                objArr[0] = ProtectedSandApp.s("喿");
                break;
            case 16:
                objArr[0] = ProtectedSandApp.s("喾");
                break;
            case 21:
                objArr[0] = ProtectedSandApp.s("喽");
                break;
            case 22:
                objArr[0] = ProtectedSandApp.s("喼");
                break;
        }
        String s7 = ProtectedSandApp.s("嗈");
        String s8 = ProtectedSandApp.s("嗉");
        if (i5 == 7) {
            objArr[1] = s8;
        } else if (i5 != 10) {
            objArr[1] = s6;
        } else {
            objArr[1] = s7;
        }
        switch (i5) {
            case 5:
            case 6:
                objArr[2] = s8;
                break;
            case 7:
            case 10:
                break;
            case 8:
            case 9:
                objArr[2] = s7;
                break;
            case 11:
            case 12:
                objArr[2] = ProtectedSandApp.s("嗏");
                break;
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = ProtectedSandApp.s("嗎");
                break;
            case 17:
            case 18:
                objArr[2] = ProtectedSandApp.s("嗍");
                break;
            case 19:
            case 20:
                objArr[2] = ProtectedSandApp.s("嗌");
                break;
            case 21:
            case 22:
            case 23:
                objArr[2] = ProtectedSandApp.s("嗋");
                break;
            default:
                objArr[2] = ProtectedSandApp.s("嗊");
                break;
        }
        String format = String.format(s5, objArr);
        if (i5 != 7 && i5 != 10) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @d5.e
    public static h0 b(@d5.d h0 h0Var, @d5.d h0 h0Var2) {
        if (h0Var == null) {
            a(0);
        }
        if (h0Var2 == null) {
            a(1);
        }
        return c(h0Var, h0Var2, new t());
    }

    @d5.e
    public static h0 c(@d5.d h0 h0Var, @d5.d h0 h0Var2, @d5.d v vVar) {
        if (h0Var == null) {
            a(2);
        }
        if (h0Var2 == null) {
            a(3);
        }
        if (vVar == null) {
            a(4);
        }
        return y.d(h0Var, h0Var2, vVar);
    }
}
