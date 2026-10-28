package kotlin.reflect.jvm.internal.impl.resolve.constants;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Arrays;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.types.p0;

/* compiled from: constantValues.kt */
/* loaded from: classes6.dex */
public final class e extends o<Character> {
    public e(char c6) {
        super(Character.valueOf(c6));
    }

    private final String c(char c6) {
        return c6 == '\b' ? ProtectedSandApp.s("虙") : c6 == '\t' ? ProtectedSandApp.s("虚") : c6 == '\n' ? ProtectedSandApp.s("虛") : c6 == '\f' ? ProtectedSandApp.s("虜") : c6 == '\r' ? ProtectedSandApp.s("虝") : e(c6) ? String.valueOf(c6) : ProtectedSandApp.s("虞");
    }

    private final boolean e(char c6) {
        byte type = (byte) Character.getType(c6);
        return (type == 0 || type == 13 || type == 14 || type == 15 || type == 16 || type == 18 || type == 19) ? false : true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
    @d5.d
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public p0 a(@d5.d h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("號"));
        p0 u5 = h0Var.A().u();
        l0.o(u5, ProtectedSandApp.s("虠"));
        return u5;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
    @d5.d
    public String toString() {
        String format = String.format(ProtectedSandApp.s("虡"), Arrays.copyOf(new Object[]{Integer.valueOf(b().charValue()), c(b().charValue())}, 2));
        l0.o(format, ProtectedSandApp.s("虢"));
        return format;
    }
}
