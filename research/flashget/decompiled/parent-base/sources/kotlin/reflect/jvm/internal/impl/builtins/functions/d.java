package kotlin.reflect.jvm.internal.impl.builtins.functions;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.util.List;
import kotlin.collections.j0;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.builtins.functions.f;
import kotlin.reflect.jvm.internal.impl.descriptors.z;
import kotlin.reflect.jvm.internal.impl.storage.n;

/* compiled from: FunctionClassScope.kt */
/* loaded from: classes7.dex */
public final class d extends kotlin.reflect.jvm.internal.impl.resolve.scopes.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@l n nVar, @l b bVar) {
        super(nVar, bVar);
        l0.p(nVar, ProtectedSandApp.s("桭\u0001"));
        l0.p(bVar, ProtectedSandApp.s("桮\u0001"));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.e
    @l
    protected List<z> j() {
        kotlin.reflect.jvm.internal.impl.descriptors.e m4 = m();
        l0.n(m4, ProtectedSandApp.s("桯\u0001"));
        f V0 = ((b) m4).V0();
        return l0.g(V0, f.a.f75688e) ? w.k(e.F.a((b) m(), false)) : l0.g(V0, f.d.f75691e) ? w.k(e.F.a((b) m(), true)) : j0.f74919b;
    }
}
