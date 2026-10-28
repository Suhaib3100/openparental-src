package kotlin.reflect.jvm.internal.impl.types.checker;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.reflect.jvm.internal.impl.types.h0;

/* compiled from: TypeCheckingProcedure.java */
/* loaded from: classes7.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ boolean f78381a = false;

    private static /* synthetic */ void a(int i4) {
        String s4 = (i4 == 7 || i4 == 10) ? ProtectedSandApp.s("綪\u0001") : ProtectedSandApp.s("綩\u0001");
        Object[] objArr = new Object[(i4 == 7 || i4 == 10) ? 2 : 3];
        String s5 = ProtectedSandApp.s("綫\u0001");
        switch (i4) {
            case 1:
            case 3:
            case 18:
            case 20:
                objArr[0] = ProtectedSandApp.s("綸\u0001");
                break;
            case 2:
            case 17:
            case 19:
            default:
                objArr[0] = ProtectedSandApp.s("綬\u0001");
                break;
            case 4:
                objArr[0] = ProtectedSandApp.s("綷\u0001");
                break;
            case 5:
            case 8:
            case 23:
                objArr[0] = ProtectedSandApp.s("綶\u0001");
                break;
            case 6:
            case 9:
                objArr[0] = ProtectedSandApp.s("綵\u0001");
                break;
            case 7:
            case 10:
                objArr[0] = s5;
                break;
            case 11:
                objArr[0] = ProtectedSandApp.s("綴\u0001");
                break;
            case 12:
                objArr[0] = ProtectedSandApp.s("綳\u0001");
                break;
            case 13:
                objArr[0] = ProtectedSandApp.s("網\u0001");
                break;
            case 14:
                objArr[0] = ProtectedSandApp.s("綱\u0001");
                break;
            case 15:
                objArr[0] = ProtectedSandApp.s("綰\u0001");
                break;
            case 16:
                objArr[0] = ProtectedSandApp.s("綯\u0001");
                break;
            case 21:
                objArr[0] = ProtectedSandApp.s("綮\u0001");
                break;
            case 22:
                objArr[0] = ProtectedSandApp.s("維\u0001");
                break;
        }
        String s6 = ProtectedSandApp.s("綹\u0001");
        String s7 = ProtectedSandApp.s("綺\u0001");
        if (i4 == 7) {
            objArr[1] = s6;
        } else if (i4 != 10) {
            objArr[1] = s5;
        } else {
            objArr[1] = s7;
        }
        switch (i4) {
            case 5:
            case 6:
                objArr[2] = s6;
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
                objArr[2] = ProtectedSandApp.s("緀\u0001");
                break;
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = ProtectedSandApp.s("綿\u0001");
                break;
            case 17:
            case 18:
                objArr[2] = ProtectedSandApp.s("綾\u0001");
                break;
            case 19:
            case 20:
                objArr[2] = ProtectedSandApp.s("綽\u0001");
                break;
            case 21:
            case 22:
            case 23:
                objArr[2] = ProtectedSandApp.s("綼\u0001");
                break;
            default:
                objArr[2] = ProtectedSandApp.s("綻\u0001");
                break;
        }
        String format = String.format(s4, objArr);
        if (i4 != 7 && i4 != 10) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @fg.m
    public static h0 b(@fg.l h0 h0Var, @fg.l h0 h0Var2) {
        if (h0Var == null) {
            a(0);
        }
        if (h0Var2 == null) {
            a(1);
        }
        return c(h0Var, h0Var2, new t());
    }

    @fg.m
    public static h0 c(@fg.l h0 h0Var, @fg.l h0 h0Var2, @fg.l v vVar) {
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
