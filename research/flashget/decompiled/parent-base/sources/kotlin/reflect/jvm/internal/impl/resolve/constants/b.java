package kotlin.reflect.jvm.internal.impl.resolve.constants;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;

/* compiled from: constantValues.kt */
/* loaded from: classes7.dex */
public class b extends g<List<? extends g<?>>> {

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private final ld.l<h0, kotlin.reflect.jvm.internal.impl.types.h0> f77872b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(@fg.l List<? extends g<?>> list, @fg.l ld.l<? super h0, ? extends kotlin.reflect.jvm.internal.impl.types.h0> lVar) {
        super(list);
        l0.p(list, ProtectedSandApp.s("碖\u0001"));
        l0.p(lVar, ProtectedSandApp.s("碗\u0001"));
        this.f77872b = lVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
    @fg.l
    public kotlin.reflect.jvm.internal.impl.types.h0 a(@fg.l h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("碘\u0001"));
        kotlin.reflect.jvm.internal.impl.types.h0 invoke = this.f77872b.invoke(h0Var);
        if (!kotlin.reflect.jvm.internal.impl.builtins.h.c0(invoke) && !kotlin.reflect.jvm.internal.impl.builtins.h.q0(invoke)) {
            kotlin.reflect.jvm.internal.impl.builtins.h.D0(invoke);
        }
        return invoke;
    }
}
