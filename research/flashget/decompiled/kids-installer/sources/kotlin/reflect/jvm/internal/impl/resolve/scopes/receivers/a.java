package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.reflect.jvm.internal.impl.types.h0;

/* compiled from: AbstractReceiverValue.java */
/* loaded from: classes5.dex */
public abstract class a implements h {

    /* renamed from: a, reason: collision with root package name */
    protected final h0 f26038a;

    /* renamed from: b, reason: collision with root package name */
    private final h f26039b;

    public a(@d5.d h0 h0Var, @d5.e h hVar) {
        if (h0Var == null) {
            c(0);
        }
        this.f26038a = h0Var;
        this.f26039b = hVar == null ? this : hVar;
    }

    private static /* synthetic */ void c(int i5) {
        String s5 = (i5 == 1 || i5 == 2) ? ProtectedSandApp.s("卓") : ProtectedSandApp.s("卒");
        Object[] objArr = new Object[(i5 == 1 || i5 == 2) ? 2 : 3];
        String s6 = ProtectedSandApp.s("協");
        if (i5 == 1 || i5 == 2) {
            objArr[0] = s6;
        } else {
            objArr[0] = ProtectedSandApp.s("单");
        }
        if (i5 == 1) {
            objArr[1] = ProtectedSandApp.s("南");
        } else if (i5 != 2) {
            objArr[1] = s6;
        } else {
            objArr[1] = ProtectedSandApp.s("卖");
        }
        if (i5 != 1 && i5 != 2) {
            objArr[2] = ProtectedSandApp.s("単");
        }
        String format = String.format(s5, objArr);
        if (i5 != 1 && i5 != 2) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h
    @d5.d
    public h0 getType() {
        h0 h0Var = this.f26038a;
        if (h0Var == null) {
            c(1);
        }
        return h0Var;
    }
}
