package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import kotlin.reflect.jvm.internal.impl.types.h0;

/* compiled from: ExtensionReceiver.java */
/* loaded from: classes7.dex */
public class d extends a implements g {

    /* renamed from: c, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.descriptors.a f78029c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@l kotlin.reflect.jvm.internal.impl.descriptors.a aVar, @l h0 h0Var, @m h hVar) {
        super(h0Var, hVar);
        if (aVar == null) {
            c(0);
        }
        if (h0Var == null) {
            c(1);
        }
        this.f78029c = aVar;
    }

    private static /* synthetic */ void c(int i4) {
        String s4 = i4 != 2 ? ProtectedSandApp.s("竑\u0001") : ProtectedSandApp.s("竒\u0001");
        Object[] objArr = new Object[i4 != 2 ? 3 : 2];
        String s5 = ProtectedSandApp.s("竓\u0001");
        if (i4 == 1) {
            objArr[0] = ProtectedSandApp.s("竖\u0001");
        } else if (i4 == 2) {
            objArr[0] = s5;
        } else if (i4 != 3) {
            objArr[0] = ProtectedSandApp.s("竔\u0001");
        } else {
            objArr[0] = ProtectedSandApp.s("竕\u0001");
        }
        if (i4 != 2) {
            objArr[1] = s5;
        } else {
            objArr[1] = ProtectedSandApp.s("竗\u0001");
        }
        if (i4 != 2) {
            if (i4 != 3) {
                objArr[2] = ProtectedSandApp.s("竘\u0001");
            } else {
                objArr[2] = ProtectedSandApp.s("站\u0001");
            }
        }
        String format = String.format(s4, objArr);
        if (i4 == 2) {
            throw new IllegalStateException(format);
        }
    }

    public String toString() {
        return getType() + ProtectedSandApp.s("竚\u0001") + this.f78029c + ProtectedSandApp.s("竛\u0001");
    }
}
