package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.reflect.jvm.internal.impl.types.h0;

/* compiled from: TransientReceiver.java */
/* loaded from: classes6.dex */
public class k extends a {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(@d5.d h0 h0Var) {
        this(h0Var, null);
        if (h0Var == null) {
            c(0);
        }
    }

    private static /* synthetic */ void c(int i5) {
        Object[] objArr = new Object[3];
        if (i5 != 2) {
            objArr[0] = ProtectedSandApp.s("蜕");
        } else {
            objArr[0] = ProtectedSandApp.s("蜖");
        }
        objArr[1] = ProtectedSandApp.s("蜗");
        if (i5 != 2) {
            objArr[2] = ProtectedSandApp.s("蜘");
        } else {
            objArr[2] = ProtectedSandApp.s("蜙");
        }
        throw new IllegalArgumentException(String.format(ProtectedSandApp.s("蜚"), objArr));
    }

    public String toString() {
        return ProtectedSandApp.s("蜛") + getType();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private k(@d5.d h0 h0Var, @d5.e h hVar) {
        super(h0Var, hVar);
        if (h0Var == null) {
            c(1);
        }
    }
}
