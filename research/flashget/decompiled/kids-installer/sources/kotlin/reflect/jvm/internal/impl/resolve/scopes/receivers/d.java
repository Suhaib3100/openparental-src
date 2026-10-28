package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.reflect.jvm.internal.impl.types.h0;

/* compiled from: ExtensionReceiver.java */
/* loaded from: classes6.dex */
public class d extends a implements g {

    /* renamed from: c, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.descriptors.a f26044c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.a aVar, @d5.d h0 h0Var, @d5.e h hVar) {
        super(h0Var, hVar);
        if (aVar == null) {
            c(0);
        }
        if (h0Var == null) {
            c(1);
        }
        this.f26044c = aVar;
    }

    private static /* synthetic */ void c(int i5) {
        String s5 = i5 != 2 ? ProtectedSandApp.s("蜇") : ProtectedSandApp.s("蜈");
        Object[] objArr = new Object[i5 != 2 ? 3 : 2];
        String s6 = ProtectedSandApp.s("蜉");
        if (i5 == 1) {
            objArr[0] = ProtectedSandApp.s("蜌");
        } else if (i5 == 2) {
            objArr[0] = s6;
        } else if (i5 != 3) {
            objArr[0] = ProtectedSandApp.s("蜊");
        } else {
            objArr[0] = ProtectedSandApp.s("蜋");
        }
        if (i5 != 2) {
            objArr[1] = s6;
        } else {
            objArr[1] = ProtectedSandApp.s("蜍");
        }
        if (i5 != 2) {
            if (i5 != 3) {
                objArr[2] = ProtectedSandApp.s("蜎");
            } else {
                objArr[2] = ProtectedSandApp.s("蜏");
            }
        }
        String format = String.format(s5, objArr);
        if (i5 == 2) {
            throw new IllegalStateException(format);
        }
    }

    public String toString() {
        return getType() + ProtectedSandApp.s("蜐") + this.f26044c + ProtectedSandApp.s("蜑");
    }
}
