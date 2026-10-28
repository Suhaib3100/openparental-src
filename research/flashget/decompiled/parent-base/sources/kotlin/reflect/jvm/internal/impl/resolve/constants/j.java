package kotlin.reflect.jvm.internal.impl.resolve.constants;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.q0;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.p0;

/* compiled from: constantValues.kt */
@r1({"SMAP\nconstantValues.kt\nKotlin\n*S Kotlin\n*F\n+ 1 constantValues.kt\norg/jetbrains/kotlin/resolve/constants/EnumValue\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,320:1\n1#2:321\n*E\n"})
/* loaded from: classes7.dex */
public final class j extends g<q0<? extends kotlin.reflect.jvm.internal.impl.name.b, ? extends kotlin.reflect.jvm.internal.impl.name.f>> {

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.name.b f77878b;

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.name.f f77879c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(@fg.l kotlin.reflect.jvm.internal.impl.name.b bVar, @fg.l kotlin.reflect.jvm.internal.impl.name.f fVar) {
        super(new q0(bVar, fVar));
        l0.p(bVar, ProtectedSandApp.s("碴\u0001"));
        l0.p(fVar, ProtectedSandApp.s("碵\u0001"));
        this.f77878b = bVar;
        this.f77879c = fVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
    @fg.l
    public h0 a(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("碶\u0001"));
        kotlin.reflect.jvm.internal.impl.descriptors.e a5 = kotlin.reflect.jvm.internal.impl.descriptors.y.a(h0Var, this.f77878b);
        p0 p0Var = null;
        if (a5 != null) {
            if (!kotlin.reflect.jvm.internal.impl.resolve.f.A(a5)) {
                a5 = null;
            }
            if (a5 != null) {
                p0Var = a5.r();
            }
        }
        if (p0Var != null) {
            return p0Var;
        }
        kotlin.reflect.jvm.internal.impl.types.error.j jVar = kotlin.reflect.jvm.internal.impl.types.error.j.ERROR_ENUM_TYPE;
        String bVar = this.f77878b.toString();
        String s4 = ProtectedSandApp.s("碷\u0001");
        l0.o(bVar, s4);
        String fVar = this.f77879c.toString();
        l0.o(fVar, s4);
        return kotlin.reflect.jvm.internal.impl.types.error.k.d(jVar, bVar, fVar);
    }

    @fg.l
    public final kotlin.reflect.jvm.internal.impl.name.f c() {
        return this.f77879c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f77878b.j());
        sb.append('.');
        sb.append(this.f77879c);
        return sb.toString();
    }
}
