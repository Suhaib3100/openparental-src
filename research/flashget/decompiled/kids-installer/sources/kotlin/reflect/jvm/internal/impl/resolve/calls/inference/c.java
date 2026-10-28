package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import com.flashget.kidsdownloader.ProtectedSandApp;
import d5.e;
import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.z;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.builtins.h;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.types.checker.g;
import kotlin.reflect.jvm.internal.impl.types.checker.j;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.l1;
import kotlin.reflect.jvm.internal.impl.types.x1;

/* compiled from: CapturedTypeConstructor.kt */
/* loaded from: classes6.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final l1 f25891a;

    /* renamed from: b, reason: collision with root package name */
    @e
    private j f25892b;

    public c(@d5.d l1 l1Var) {
        l0.p(l1Var, ProtectedSandApp.s("虎"));
        this.f25891a = l1Var;
        l1Var.b();
        x1 x1Var = x1.INVARIANT;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    @d5.d
    public h A() {
        h A = this.f25891a.getType().U0().A();
        l0.o(A, ProtectedSandApp.s("虏"));
        return A;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    public kotlin.reflect.jvm.internal.impl.descriptors.h b() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    public boolean d() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.calls.inference.b
    @d5.d
    public l1 e() {
        return this.f25891a;
    }

    @e
    public Void f() {
        return null;
    }

    @e
    public final j g() {
        return this.f25892b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    @d5.d
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public c a(@d5.d g gVar) {
        l0.p(gVar, ProtectedSandApp.s("虐"));
        l1 a6 = this.f25891a.a(gVar);
        l0.o(a6, ProtectedSandApp.s("虑"));
        return new c(a6);
    }

    public final void i(@e j jVar) {
        this.f25892b = jVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    @d5.d
    public Collection<h0> m() {
        List k5;
        h0 type = this.f25891a.b() == x1.OUT_VARIANCE ? this.f25891a.getType() : A().I();
        l0.o(type, ProtectedSandApp.s("虒"));
        k5 = z.k(type);
        return k5;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    @d5.d
    public List<f1> r() {
        return EmptyList.f23167o;
    }

    @d5.d
    public String toString() {
        return ProtectedSandApp.s("虓") + this.f25891a + ')';
    }
}
