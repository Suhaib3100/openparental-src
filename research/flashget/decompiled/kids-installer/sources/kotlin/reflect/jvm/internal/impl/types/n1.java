package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: TypeProjectionImpl.java */
/* loaded from: classes6.dex */
public class n1 extends m1 {

    /* renamed from: a, reason: collision with root package name */
    private final x1 f26509a;

    /* renamed from: b, reason: collision with root package name */
    private final h0 f26510b;

    public n1(@d5.d x1 x1Var, @d5.d h0 h0Var) {
        if (x1Var == null) {
            d(0);
        }
        if (h0Var == null) {
            d(1);
        }
        this.f26509a = x1Var;
        this.f26510b = h0Var;
    }

    private static /* synthetic */ void d(int i5) {
        String s5 = (i5 == 4 || i5 == 5) ? ProtectedSandApp.s("襮") : ProtectedSandApp.s("襭");
        Object[] objArr = new Object[(i5 == 4 || i5 == 5) ? 2 : 3];
        String s6 = ProtectedSandApp.s("襯");
        switch (i5) {
            case 1:
            case 2:
            case 3:
                objArr[0] = ProtectedSandApp.s("襲");
                break;
            case 4:
            case 5:
                objArr[0] = s6;
                break;
            case 6:
                objArr[0] = ProtectedSandApp.s("襱");
                break;
            default:
                objArr[0] = ProtectedSandApp.s("襰");
                break;
        }
        if (i5 == 4) {
            objArr[1] = ProtectedSandApp.s("襴");
        } else if (i5 != 5) {
            objArr[1] = s6;
        } else {
            objArr[1] = ProtectedSandApp.s("襳");
        }
        if (i5 == 3) {
            objArr[2] = ProtectedSandApp.s("襷");
        } else if (i5 != 4 && i5 != 5) {
            if (i5 != 6) {
                objArr[2] = ProtectedSandApp.s("襵");
            } else {
                objArr[2] = ProtectedSandApp.s("襶");
            }
        }
        String format = String.format(s5, objArr);
        if (i5 != 4 && i5 != 5) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.l1
    @d5.d
    public l1 a(@d5.d kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        if (gVar == null) {
            d(6);
        }
        return new n1(this.f26509a, gVar.a(this.f26510b));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.l1
    @d5.d
    public x1 b() {
        x1 x1Var = this.f26509a;
        if (x1Var == null) {
            d(4);
        }
        return x1Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.l1
    public boolean c() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.l1
    @d5.d
    public h0 getType() {
        h0 h0Var = this.f26510b;
        if (h0Var == null) {
            d(5);
        }
        return h0Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n1(@d5.d h0 h0Var) {
        this(x1.INVARIANT, h0Var);
        if (h0Var == null) {
            d(2);
        }
    }
}
