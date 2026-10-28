package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;
import kotlin.collections.j0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.t;
import kotlin.reflect.jvm.internal.impl.descriptors.x0;
import kotlin.reflect.jvm.internal.impl.descriptors.z;
import kotlin.reflect.jvm.internal.impl.storage.n;

/* compiled from: CloneableClassScope.kt */
/* loaded from: classes7.dex */
public final class a extends kotlin.reflect.jvm.internal.impl.resolve.scopes.e {

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    public static final C1075a f75730e = new C1075a();

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    private static final kotlin.reflect.jvm.internal.impl.name.f f75731f;

    /* compiled from: CloneableClassScope.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.a$a, reason: collision with other inner class name */
    public static final class C1075a {
        private C1075a() {
        }

        @fg.l
        public final kotlin.reflect.jvm.internal.impl.name.f a() {
            return a.f75731f;
        }

        public C1075a(w wVar) {
        }
    }

    static {
        kotlin.reflect.jvm.internal.impl.name.f f4 = kotlin.reflect.jvm.internal.impl.name.f.f(ProtectedSandApp.s("椱\u0001"));
        l0.o(f4, ProtectedSandApp.s("椲\u0001"));
        f75731f = f4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@fg.l n nVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        super(nVar, eVar);
        l0.p(nVar, ProtectedSandApp.s("椳\u0001"));
        l0.p(eVar, ProtectedSandApp.s("椴\u0001"));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.e
    @fg.l
    protected List<z> j() {
        g0 m12 = g0.m1(m(), kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f75911n2.b(), f75731f, b.a.DECLARATION, a1.f75900a);
        x0 K0 = m().K0();
        j0 j0Var = j0.f74919b;
        m12.S0(null, K0, j0Var, j0Var, j0Var, kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.j(m()).i(), e0.OPEN, t.f76288c);
        return kotlin.collections.w.k(m12);
    }
}
