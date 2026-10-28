package kotlin.reflect.jvm.internal.impl.resolve.constants;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.types.p0;
import kotlin.text.Typography;

/* compiled from: constantValues.kt */
/* loaded from: classes5.dex */
public final class v extends g<String> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(@d5.d String str) {
        super(str);
        l0.p(str, ProtectedSandApp.s("冢"));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
    @d5.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public p0 a(@d5.d h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("冣"));
        p0 W = h0Var.A().W();
        l0.o(W, ProtectedSandApp.s("冤"));
        return W;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
    @d5.d
    public String toString() {
        return c1.c.a(new StringBuilder(ProtectedSandApp.s("冥")), b(), Typography.f27126b);
    }
}
