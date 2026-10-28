package kotlin.reflect.jvm.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.ClassBasedDeclarationContainer;
import kotlin.jvm.internal.FunctionBase;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.d1;
import kotlin.jvm.internal.f1;
import kotlin.jvm.internal.h1;
import kotlin.jvm.internal.m1;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.w0;
import kotlin.jvm.internal.y0;
import kotlin.reflect.KCallable;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KFunction;
import kotlin.reflect.KMutableProperty0;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.KMutableProperty2;
import kotlin.reflect.KProperty0;
import kotlin.reflect.KProperty1;
import kotlin.reflect.KProperty2;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.KVariance;

/* compiled from: ReflectionFactoryImpl.java */
/* loaded from: classes5.dex */
public class h0 extends m1 {
    public static void u() {
        c.a();
        f0.a();
    }

    private static p v(kotlin.jvm.internal.q qVar) {
        KDeclarationContainer w02 = qVar.w0();
        return w02 instanceof p ? (p) w02 : h.f23875r;
    }

    @Override // kotlin.jvm.internal.m1
    public KClass a(Class cls) {
        return new m(cls);
    }

    @Override // kotlin.jvm.internal.m1
    public KClass b(Class cls, String str) {
        return new m(cls);
    }

    @Override // kotlin.jvm.internal.m1
    public KFunction c(kotlin.jvm.internal.g0 g0Var) {
        return new q(v(g0Var), g0Var.getName(), g0Var.y0(), g0Var.v0());
    }

    @Override // kotlin.jvm.internal.m1
    public KClass d(Class cls) {
        return c.d(cls);
    }

    @Override // kotlin.jvm.internal.m1
    public KClass e(Class cls, String str) {
        return c.d(cls);
    }

    @Override // kotlin.jvm.internal.m1
    public KDeclarationContainer f(Class cls, String str) {
        return c.e(cls);
    }

    @Override // kotlin.jvm.internal.m1
    public KType g(KType kType) {
        return l0.a(kType);
    }

    @Override // kotlin.jvm.internal.m1
    public KMutableProperty0 h(u0 u0Var) {
        return new r(v(u0Var), u0Var.getName(), u0Var.y0(), u0Var.v0());
    }

    @Override // kotlin.jvm.internal.m1
    public KMutableProperty1 i(w0 w0Var) {
        return new s(v(w0Var), w0Var.getName(), w0Var.y0(), w0Var.v0());
    }

    @Override // kotlin.jvm.internal.m1
    public KMutableProperty2 j(y0 y0Var) {
        return new t(v(y0Var), y0Var.getName(), y0Var.y0());
    }

    @Override // kotlin.jvm.internal.m1
    public KType k(KType kType) {
        return l0.b(kType);
    }

    @Override // kotlin.jvm.internal.m1
    public KType l(KType kType, KType kType2) {
        return l0.c(kType, kType2);
    }

    @Override // kotlin.jvm.internal.m1
    public KProperty0 m(d1 d1Var) {
        return new w(v(d1Var), d1Var.getName(), d1Var.y0(), d1Var.v0());
    }

    @Override // kotlin.jvm.internal.m1
    public KProperty1 n(f1 f1Var) {
        return new x(v(f1Var), f1Var.getName(), f1Var.y0(), f1Var.v0());
    }

    @Override // kotlin.jvm.internal.m1
    public KProperty2 o(h1 h1Var) {
        return new y(v(h1Var), h1Var.getName(), h1Var.y0());
    }

    @Override // kotlin.jvm.internal.m1
    public String p(FunctionBase functionBase) {
        q c6;
        KFunction a6 = kotlin.reflect.jvm.f.a(functionBase);
        return (a6 == null || (c6 = n0.c(a6)) == null) ? super.p(functionBase) : i0.f23876a.e(c6.C0());
    }

    @Override // kotlin.jvm.internal.m1
    public String q(Lambda lambda) {
        return p(lambda);
    }

    @Override // kotlin.jvm.internal.m1
    public void r(KTypeParameter kTypeParameter, List<KType> list) {
    }

    @Override // kotlin.jvm.internal.m1
    public KType s(KClassifier kClassifier, List<KTypeProjection> list, boolean z5) {
        return kClassifier instanceof ClassBasedDeclarationContainer ? c.b(((ClassBasedDeclarationContainer) kClassifier).f(), list, z5) : kotlin.reflect.full.g.b(kClassifier, list, z5, Collections.emptyList());
    }

    @Override // kotlin.jvm.internal.m1
    public KTypeParameter t(Object obj, String str, KVariance kVariance, boolean z5) {
        List<KTypeParameter> typeParameters;
        if (obj instanceof KClass) {
            typeParameters = ((KClass) obj).getTypeParameters();
        } else {
            if (!(obj instanceof KCallable)) {
                throw new IllegalArgumentException(ProtectedSandApp.s("䏍") + obj);
            }
            typeParameters = ((KCallable) obj).getTypeParameters();
        }
        for (KTypeParameter kTypeParameter : typeParameters) {
            if (kTypeParameter.getF23634p().equals(str)) {
                return kTypeParameter;
            }
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("䏋") + str + ProtectedSandApp.s("䏌") + obj);
    }
}
