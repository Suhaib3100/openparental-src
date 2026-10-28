package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import kotlin.reflect.jvm.internal.impl.types.h0;

/* compiled from: TransientReceiver.java */
/* loaded from: classes7.dex */
public class k extends a {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(@l h0 h0Var) {
        this(h0Var, null);
        if (h0Var == null) {
            c(0);
        }
    }

    private static /* synthetic */ void c(int i4) {
        Object[] objArr = new Object[3];
        if (i4 != 2) {
            objArr[0] = ProtectedSandApp.s("竟\u0001");
        } else {
            objArr[0] = ProtectedSandApp.s("章\u0001");
        }
        objArr[1] = ProtectedSandApp.s("竡\u0001");
        if (i4 != 2) {
            objArr[2] = ProtectedSandApp.s("竢\u0001");
        } else {
            objArr[2] = ProtectedSandApp.s("竣\u0001");
        }
        throw new IllegalArgumentException(String.format(ProtectedSandApp.s("竤\u0001"), objArr));
    }

    public String toString() {
        return ProtectedSandApp.s("童\u0001") + getType();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private k(@l h0 h0Var, @m h hVar) {
        super(h0Var, hVar);
        if (h0Var == null) {
            c(1);
        }
    }
}
