package kotlin.reflect.jvm.internal.impl.resolve.constants;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;

/* compiled from: constantValues.kt */
/* loaded from: classes5.dex */
public class b extends g<List<? extends g<?>>> {

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final q3.l<h0, kotlin.reflect.jvm.internal.impl.types.h0> f25895b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(@d5.d List<? extends g<?>> list, @d5.d q3.l<? super h0, ? extends kotlin.reflect.jvm.internal.impl.types.h0> lVar) {
        super(list);
        l0.p(list, ProtectedSandApp.s("兴"));
        l0.p(lVar, ProtectedSandApp.s("兵"));
        this.f25895b = lVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
    @d5.d
    public kotlin.reflect.jvm.internal.impl.types.h0 a(@d5.d h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("其"));
        kotlin.reflect.jvm.internal.impl.types.h0 N = this.f25895b.N(h0Var);
        if (!kotlin.reflect.jvm.internal.impl.builtins.h.c0(N) && !kotlin.reflect.jvm.internal.impl.builtins.h.p0(N)) {
            kotlin.reflect.jvm.internal.impl.builtins.h.C0(N);
        }
        return N;
    }
}
