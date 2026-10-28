package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: TypeProjectionImpl.java */
/* loaded from: classes7.dex */
public class n1 extends m1 {

    /* renamed from: a, reason: collision with root package name */
    private final x1 f78518a;

    /* renamed from: b, reason: collision with root package name */
    private final h0 f78519b;

    public n1(@fg.l x1 x1Var, @fg.l h0 h0Var) {
        if (x1Var == null) {
            d(0);
        }
        if (h0Var == null) {
            d(1);
        }
        this.f78518a = x1Var;
        this.f78519b = h0Var;
    }

    private static /* synthetic */ void d(int i4) {
        String s4 = (i4 == 4 || i4 == 5) ? ProtectedSandApp.s("羬\u0001") : ProtectedSandApp.s("羫\u0001");
        Object[] objArr = new Object[(i4 == 4 || i4 == 5) ? 2 : 3];
        String s5 = ProtectedSandApp.s("羭\u0001");
        switch (i4) {
            case 1:
            case 2:
            case 3:
                objArr[0] = ProtectedSandApp.s("羰\u0001");
                break;
            case 4:
            case 5:
                objArr[0] = s5;
                break;
            case 6:
                objArr[0] = ProtectedSandApp.s("羯\u0001");
                break;
            default:
                objArr[0] = ProtectedSandApp.s("羮\u0001");
                break;
        }
        if (i4 == 4) {
            objArr[1] = ProtectedSandApp.s("羲\u0001");
        } else if (i4 != 5) {
            objArr[1] = s5;
        } else {
            objArr[1] = ProtectedSandApp.s("羱\u0001");
        }
        if (i4 == 3) {
            objArr[2] = ProtectedSandApp.s("羵\u0001");
        } else if (i4 != 4 && i4 != 5) {
            if (i4 != 6) {
                objArr[2] = ProtectedSandApp.s("羳\u0001");
            } else {
                objArr[2] = ProtectedSandApp.s("羴\u0001");
            }
        }
        String format = String.format(s4, objArr);
        if (i4 != 4 && i4 != 5) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.l1
    @fg.l
    public l1 a(@fg.l kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        if (gVar == null) {
            d(6);
        }
        return new n1(this.f78518a, gVar.a(this.f78519b));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.l1
    public boolean b() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.l1
    @fg.l
    public x1 c() {
        x1 x1Var = this.f78518a;
        if (x1Var == null) {
            d(4);
        }
        return x1Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.l1
    @fg.l
    public h0 getType() {
        h0 h0Var = this.f78519b;
        if (h0Var == null) {
            d(5);
        }
        return h0Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n1(@fg.l h0 h0Var) {
        this(x1.INVARIANT, h0Var);
        if (h0Var == null) {
            d(2);
        }
    }
}
