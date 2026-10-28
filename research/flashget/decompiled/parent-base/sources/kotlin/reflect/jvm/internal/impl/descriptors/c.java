package kotlin.reflect.jvm.internal.impl.descriptors;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.x1;

/* compiled from: typeParameterUtils.kt */
/* loaded from: classes7.dex */
final class c implements f1 {

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private final f1 f75929b;

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private final m f75930c;

    /* renamed from: d, reason: collision with root package name */
    private final int f75931d;

    public c(@fg.l f1 f1Var, @fg.l m mVar, int i4) {
        kotlin.jvm.internal.l0.p(f1Var, ProtectedSandApp.s("歯\u0001"));
        kotlin.jvm.internal.l0.p(mVar, ProtectedSandApp.s("歰\u0001"));
        this.f75929b = f1Var;
        this.f75930c = mVar;
        this.f75931d = i4;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
    public <R, D> R E(o<R, D> oVar, D d5) {
        return (R) this.f75929b.E(oVar, d5);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.f1
    @fg.l
    public kotlin.reflect.jvm.internal.impl.storage.n P() {
        return this.f75929b.P();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.f1
    public boolean U() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.n, kotlin.reflect.jvm.internal.impl.descriptors.m
    @fg.l
    public m c() {
        return this.f75930c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p
    @fg.l
    public a1 f() {
        return this.f75929b.f();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    @fg.l
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g getAnnotations() {
        return this.f75929b.getAnnotations();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.f1
    public int getIndex() {
        return this.f75929b.getIndex() + this.f75931d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.j0
    @fg.l
    public kotlin.reflect.jvm.internal.impl.name.f getName() {
        return this.f75929b.getName();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.f1
    @fg.l
    public List<kotlin.reflect.jvm.internal.impl.types.h0> getUpperBounds() {
        return this.f75929b.getUpperBounds();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.f1, kotlin.reflect.jvm.internal.impl.descriptors.h
    @fg.l
    public kotlin.reflect.jvm.internal.impl.types.h1 j() {
        return this.f75929b.j();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.f1
    public boolean l() {
        return this.f75929b.l();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.f1
    @fg.l
    public x1 o() {
        return this.f75929b.o();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.h
    @fg.l
    public kotlin.reflect.jvm.internal.impl.types.p0 r() {
        return this.f75929b.r();
    }

    @fg.l
    public String toString() {
        return this.f75929b + ProtectedSandApp.s("歲\u0001");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
    @fg.l
    public f1 a() {
        f1 a5 = this.f75929b.a();
        kotlin.jvm.internal.l0.o(a5, ProtectedSandApp.s("歱\u0001"));
        return a5;
    }
}
