package kotlin.reflect.jvm.internal.impl.resolve.constants;

import androidx.compose.foundation.layout.f3;
import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.types.p0;
import kotlin.text.m0;

/* compiled from: constantValues.kt */
/* loaded from: classes7.dex */
public final class v extends g<String> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(@fg.l String str) {
        super(str);
        l0.p(str, ProtectedSandApp.s("磣\u0001"));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
    @fg.l
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public p0 a(@fg.l h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("磤\u0001"));
        p0 W = h0Var.p().W();
        l0.o(W, ProtectedSandApp.s("磥\u0001"));
        return W;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
    @fg.l
    public String toString() {
        return f3.a(new StringBuilder(ProtectedSandApp.s("磦\u0001")), b(), m0.quote);
    }
}
