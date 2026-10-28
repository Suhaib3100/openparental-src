package kotlin.reflect.jvm.internal.impl.descriptors;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.x1;

/* compiled from: typeParameterUtils.kt */
/* loaded from: classes6.dex */
final class c implements f1 {

    /* renamed from: o, reason: collision with root package name */
    @d5.d
    private final f1 f24131o;

    /* renamed from: p, reason: collision with root package name */
    @d5.d
    private final m f24132p;

    /* renamed from: q, reason: collision with root package name */
    private final int f24133q;

    public c(@d5.d f1 f1Var, @d5.d m mVar, int i5) {
        kotlin.jvm.internal.l0.p(f1Var, ProtectedSandApp.s("脗"));
        kotlin.jvm.internal.l0.p(mVar, ProtectedSandApp.s("脘"));
        this.f24131o = f1Var;
        this.f24132p = mVar;
        this.f24133q = i5;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.h
    @d5.d
    public kotlin.reflect.jvm.internal.impl.types.p0 E() {
        return this.f24131o.E();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
    public <R, D> R T(o<R, D> oVar, D d6) {
        return (R) this.f24131o.T(oVar, d6);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.n, kotlin.reflect.jvm.internal.impl.descriptors.m
    @d5.d
    public m b() {
        return this.f24132p;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    @d5.d
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g getAnnotations() {
        return this.f24131o.getAnnotations();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.f1
    public int getIndex() {
        return this.f24131o.getIndex() + this.f24133q;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.j0
    @d5.d
    public kotlin.reflect.jvm.internal.impl.name.f getName() {
        return this.f24131o.getName();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.f1
    @d5.d
    public List<kotlin.reflect.jvm.internal.impl.types.h0> getUpperBounds() {
        return this.f24131o.getUpperBounds();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p
    @d5.d
    public a1 k() {
        return this.f24131o.k();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.f1, kotlin.reflect.jvm.internal.impl.descriptors.h
    @d5.d
    public kotlin.reflect.jvm.internal.impl.types.h1 m() {
        return this.f24131o.m();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.f1
    @d5.d
    public kotlin.reflect.jvm.internal.impl.storage.n o0() {
        return this.f24131o.o0();
    }

    @d5.d
    public String toString() {
        return this.f24131o + ProtectedSandApp.s("脚");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.f1
    public boolean v() {
        return this.f24131o.v();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.f1
    public boolean v0() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.f1
    @d5.d
    public x1 z() {
        return this.f24131o.z();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
    @d5.d
    public f1 a() {
        f1 a6 = this.f24131o.a();
        kotlin.jvm.internal.l0.o(a6, ProtectedSandApp.s("脙"));
        return a6;
    }
}
