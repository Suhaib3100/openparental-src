package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: ClassifierBasedTypeConstructor.kt */
@kotlin.jvm.internal.r1({"SMAP\nClassifierBasedTypeConstructor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassifierBasedTypeConstructor.kt\norg/jetbrains/kotlin/types/ClassifierBasedTypeConstructor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,81:1\n1#2:82\n*E\n"})
/* loaded from: classes7.dex */
public abstract class n implements h1 {

    /* renamed from: a, reason: collision with root package name */
    private int f78517a;

    private final boolean f(kotlin.reflect.jvm.internal.impl.descriptors.h hVar) {
        return (kotlin.reflect.jvm.internal.impl.types.error.k.m(hVar) || kotlin.reflect.jvm.internal.impl.resolve.f.E(hVar)) ? false : true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    @fg.l
    public abstract kotlin.reflect.jvm.internal.impl.descriptors.h c();

    protected final boolean e(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.h hVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.h hVar2) {
        kotlin.jvm.internal.l0.p(hVar, ProtectedSandApp.s("栩\u0001"));
        kotlin.jvm.internal.l0.p(hVar2, ProtectedSandApp.s("株\u0001"));
        if (!kotlin.jvm.internal.l0.g(hVar.getName(), hVar2.getName())) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.m c5 = hVar.c();
        for (kotlin.reflect.jvm.internal.impl.descriptors.m c6 = hVar2.c(); c5 != null && c6 != null; c6 = c6.c()) {
            if (c5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.h0) {
                return c6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.h0;
            }
            if (c6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.h0) {
                return false;
            }
            if (c5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.l0) {
                return (c6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.l0) && kotlin.jvm.internal.l0.g(((kotlin.reflect.jvm.internal.impl.descriptors.l0) c5).g(), ((kotlin.reflect.jvm.internal.impl.descriptors.l0) c6).g());
            }
            if ((c6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.l0) || !kotlin.jvm.internal.l0.g(c5.getName(), c6.getName())) {
                return false;
            }
            c5 = c5.c();
        }
        return true;
    }

    public boolean equals(@fg.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1) || obj.hashCode() != hashCode()) {
            return false;
        }
        h1 h1Var = (h1) obj;
        if (h1Var.getParameters().size() != getParameters().size()) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.h c5 = c();
        kotlin.reflect.jvm.internal.impl.descriptors.h c6 = h1Var.c();
        if (c6 != null && f(c5) && f(c6)) {
            return g(c6);
        }
        return false;
    }

    protected abstract boolean g(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.h hVar);

    public int hashCode() {
        int i4 = this.f78517a;
        if (i4 != 0) {
            return i4;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.h c5 = c();
        int hashCode = f(c5) ? kotlin.reflect.jvm.internal.impl.resolve.f.m(c5).hashCode() : System.identityHashCode(this);
        this.f78517a = hashCode;
        return hashCode;
    }
}
