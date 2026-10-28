package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;

/* compiled from: KotlinType.kt */
/* loaded from: classes7.dex */
public abstract class b0 extends w1 implements ce.g {

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private final p0 f78342c;

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private final p0 f78343d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(@fg.l p0 p0Var, @fg.l p0 p0Var2) {
        super(null);
        kotlin.jvm.internal.l0.p(p0Var, ProtectedSandApp.s("牁\u0001"));
        kotlin.jvm.internal.l0.p(p0Var2, ProtectedSandApp.s("牂\u0001"));
        this.f78342c = p0Var;
        this.f78343d = p0Var2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    @fg.l
    public List<l1> M0() {
        return V0().M0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    @fg.l
    public d1 N0() {
        return V0().N0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    @fg.l
    public h1 O0() {
        return V0().O0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    public boolean P0() {
        return V0().P0();
    }

    @fg.l
    public abstract p0 V0();

    @fg.l
    public final p0 W0() {
        return this.f78342c;
    }

    @fg.l
    public final p0 X0() {
        return this.f78343d;
    }

    @fg.l
    public abstract String Y0(@fg.l kotlin.reflect.jvm.internal.impl.renderer.c cVar, @fg.l kotlin.reflect.jvm.internal.impl.renderer.f fVar);

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    @fg.l
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h q() {
        return V0().q();
    }

    @fg.l
    public String toString() {
        return kotlin.reflect.jvm.internal.impl.renderer.c.f77801j.y(this);
    }
}
