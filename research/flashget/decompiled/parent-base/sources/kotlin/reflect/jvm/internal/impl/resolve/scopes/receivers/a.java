package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import kotlin.reflect.jvm.internal.impl.types.h0;

/* compiled from: AbstractReceiverValue.java */
/* loaded from: classes7.dex */
public abstract class a implements h {

    /* renamed from: a, reason: collision with root package name */
    protected final h0 f78023a;

    /* renamed from: b, reason: collision with root package name */
    private final h f78024b;

    public a(@l h0 h0Var, @m h hVar) {
        if (h0Var == null) {
            c(0);
        }
        this.f78023a = h0Var;
        this.f78024b = hVar == null ? this : hVar;
    }

    private static /* synthetic */ void c(int i4) {
        String s4 = (i4 == 1 || i4 == 2) ? ProtectedSandApp.s("竃\u0001") : ProtectedSandApp.s("竂\u0001");
        Object[] objArr = new Object[(i4 == 1 || i4 == 2) ? 2 : 3];
        String s5 = ProtectedSandApp.s("竄\u0001");
        if (i4 == 1 || i4 == 2) {
            objArr[0] = s5;
        } else {
            objArr[0] = ProtectedSandApp.s("竅\u0001");
        }
        if (i4 == 1) {
            objArr[1] = ProtectedSandApp.s("竇\u0001");
        } else if (i4 != 2) {
            objArr[1] = s5;
        } else {
            objArr[1] = ProtectedSandApp.s("竆\u0001");
        }
        if (i4 != 1 && i4 != 2) {
            objArr[2] = ProtectedSandApp.s("竈\u0001");
        }
        String format = String.format(s4, objArr);
        if (i4 != 1 && i4 != 2) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h
    @l
    public h0 getType() {
        h0 h0Var = this.f78023a;
        if (h0Var == null) {
            c(1);
        }
        return h0Var;
    }
}
