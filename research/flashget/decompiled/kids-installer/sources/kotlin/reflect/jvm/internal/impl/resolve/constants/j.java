package kotlin.reflect.jvm.internal.impl.resolve.constants;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Pair;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.p0;

/* compiled from: constantValues.kt */
/* loaded from: classes5.dex */
public final class j extends g<Pair<? extends kotlin.reflect.jvm.internal.impl.name.b, ? extends kotlin.reflect.jvm.internal.impl.name.f>> {

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.name.b f25902b;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.name.f f25903c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(@d5.d kotlin.reflect.jvm.internal.impl.name.b bVar, @d5.d kotlin.reflect.jvm.internal.impl.name.f fVar) {
        super(new Pair(bVar, fVar));
        l0.p(bVar, ProtectedSandApp.s("冂"));
        l0.p(fVar, ProtectedSandApp.s("冃"));
        this.f25902b = bVar;
        this.f25903c = fVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
    @d5.d
    public h0 a(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("冄"));
        kotlin.reflect.jvm.internal.impl.descriptors.e a6 = kotlin.reflect.jvm.internal.impl.descriptors.y.a(h0Var, this.f25902b);
        p0 p0Var = null;
        if (a6 != null) {
            if (!kotlin.reflect.jvm.internal.impl.resolve.e.A(a6)) {
                a6 = null;
            }
            if (a6 != null) {
                p0Var = a6.E();
            }
        }
        if (p0Var != null) {
            return p0Var;
        }
        kotlin.reflect.jvm.internal.impl.types.error.j jVar = kotlin.reflect.jvm.internal.impl.types.error.j.ERROR_ENUM_TYPE;
        String bVar = this.f25902b.toString();
        l0.o(bVar, ProtectedSandApp.s("内"));
        String fVar = this.f25903c.toString();
        l0.o(fVar, ProtectedSandApp.s("円"));
        return kotlin.reflect.jvm.internal.impl.types.error.k.d(jVar, bVar, fVar);
    }

    @d5.d
    public final kotlin.reflect.jvm.internal.impl.name.f c() {
        return this.f25903c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
    @d5.d
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f25902b.j());
        sb.append(org.apache.commons.io.k.f32026a);
        sb.append(this.f25903c);
        return sb.toString();
    }
}
