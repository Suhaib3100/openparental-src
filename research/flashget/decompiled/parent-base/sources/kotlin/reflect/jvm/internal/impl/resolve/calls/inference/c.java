package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.util.Collection;
import java.util.List;
import kotlin.collections.j0;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import kotlin.reflect.jvm.internal.impl.types.checker.g;
import kotlin.reflect.jvm.internal.impl.types.checker.j;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.l1;
import kotlin.reflect.jvm.internal.impl.types.x1;

/* compiled from: CapturedTypeConstructor.kt */
/* loaded from: classes7.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @l
    private final l1 f77868a;

    /* renamed from: b, reason: collision with root package name */
    @m
    private j f77869b;

    public c(@l l1 l1Var) {
        l0.p(l1Var, ProtectedSandApp.s("碂\u0001"));
        this.f77868a = l1Var;
        l1Var.c();
        x1 x1Var = x1.INVARIANT;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    public h c() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    public boolean d() {
        return false;
    }

    @m
    public Void e() {
        return null;
    }

    @m
    public final j f() {
        return this.f77869b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    @l
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public c a(@l g gVar) {
        l0.p(gVar, ProtectedSandApp.s("碃\u0001"));
        l1 a5 = this.f77868a.a(gVar);
        l0.o(a5, ProtectedSandApp.s("碄\u0001"));
        return new c(a5);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    @l
    public List<f1> getParameters() {
        return j0.f74919b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.calls.inference.b
    @l
    public l1 getProjection() {
        return this.f77868a;
    }

    public final void h(@m j jVar) {
        this.f77869b = jVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    @l
    public Collection<h0> j() {
        h0 type = this.f77868a.c() == x1.OUT_VARIANCE ? this.f77868a.getType() : p().I();
        l0.m(type);
        return w.k(type);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    @l
    public kotlin.reflect.jvm.internal.impl.builtins.h p() {
        kotlin.reflect.jvm.internal.impl.builtins.h p4 = this.f77868a.getType().O0().p();
        l0.o(p4, ProtectedSandApp.s("碅\u0001"));
        return p4;
    }

    @l
    public String toString() {
        return ProtectedSandApp.s("碆\u0001") + this.f77868a + ')';
    }
}
