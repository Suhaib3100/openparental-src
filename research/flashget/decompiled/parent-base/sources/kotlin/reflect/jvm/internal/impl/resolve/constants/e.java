package kotlin.reflect.jvm.internal.impl.resolve.constants;

import androidx.compose.material3.s3;
import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.types.p0;

/* compiled from: constantValues.kt */
/* loaded from: classes7.dex */
public final class e extends o<Character> {
    public e(char c5) {
        super(Character.valueOf(c5));
    }

    private final String c(char c5) {
        return c5 == '\b' ? ProtectedSandApp.s("碞\u0001") : c5 == '\t' ? ProtectedSandApp.s("碟\u0001") : c5 == '\n' ? ProtectedSandApp.s("碠\u0001") : c5 == '\f' ? ProtectedSandApp.s("碡\u0001") : c5 == '\r' ? ProtectedSandApp.s("碢\u0001") : e(c5) ? String.valueOf(c5) : ProtectedSandApp.s("碣\u0001");
    }

    private final boolean e(char c5) {
        byte type = (byte) Character.getType(c5);
        return (type == 0 || type == 13 || type == 14 || type == 15 || type == 16 || type == 18 || type == 19) ? false : true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
    @fg.l
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public p0 a(@fg.l h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("碤\u0001"));
        p0 u4 = h0Var.p().u();
        l0.o(u4, ProtectedSandApp.s("碥\u0001"));
        return u4;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
    @fg.l
    public String toString() {
        return s3.a(new Object[]{Integer.valueOf(b().charValue()), c(b().charValue())}, 2, ProtectedSandApp.s("碦\u0001"), ProtectedSandApp.s("碧\u0001"));
    }
}
