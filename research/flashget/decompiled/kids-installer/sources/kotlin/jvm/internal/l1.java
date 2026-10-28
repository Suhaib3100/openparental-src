package kotlin.jvm.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.SinceKotlin;
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

/* compiled from: Reflection.java */
/* loaded from: classes5.dex */
public class l1 {

    /* renamed from: a, reason: collision with root package name */
    private static final m1 f23576a;

    /* renamed from: b, reason: collision with root package name */
    static final String f23577b = ProtectedSandApp.s("䅯");

    /* renamed from: c, reason: collision with root package name */
    private static final KClass[] f23578c;

    static {
        m1 m1Var = null;
        try {
            m1Var = (m1) kotlin.reflect.jvm.internal.h0.class.newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (m1Var == null) {
            m1Var = new m1();
        }
        f23576a = m1Var;
        f23578c = new KClass[0];
    }

    @SinceKotlin(version = "1.4")
    public static KType A(Class cls) {
        return f23576a.s(d(cls), Collections.emptyList(), false);
    }

    @SinceKotlin(version = "1.4")
    public static KType B(Class cls, KTypeProjection kTypeProjection) {
        return f23576a.s(d(cls), Collections.singletonList(kTypeProjection), false);
    }

    @SinceKotlin(version = "1.4")
    public static KType C(Class cls, KTypeProjection kTypeProjection, KTypeProjection kTypeProjection2) {
        return f23576a.s(d(cls), Arrays.asList(kTypeProjection, kTypeProjection2), false);
    }

    @SinceKotlin(version = "1.4")
    public static KType D(Class cls, KTypeProjection... kTypeProjectionArr) {
        List<KTypeProjection> Jy;
        m1 m1Var = f23576a;
        KClass d6 = d(cls);
        Jy = kotlin.collections.t.Jy(kTypeProjectionArr);
        return m1Var.s(d6, Jy, false);
    }

    @SinceKotlin(version = "1.4")
    public static KType E(KClassifier kClassifier) {
        return f23576a.s(kClassifier, Collections.emptyList(), false);
    }

    @SinceKotlin(version = "1.4")
    public static KTypeParameter F(Object obj, String str, KVariance kVariance, boolean z5) {
        return f23576a.t(obj, str, kVariance, z5);
    }

    public static KClass a(Class cls) {
        return f23576a.a(cls);
    }

    public static KClass b(Class cls, String str) {
        return f23576a.b(cls, str);
    }

    public static KFunction c(g0 g0Var) {
        return f23576a.c(g0Var);
    }

    public static KClass d(Class cls) {
        return f23576a.d(cls);
    }

    public static KClass e(Class cls, String str) {
        return f23576a.e(cls, str);
    }

    public static KClass[] f(Class[] clsArr) {
        int length = clsArr.length;
        if (length == 0) {
            return f23578c;
        }
        KClass[] kClassArr = new KClass[length];
        for (int i5 = 0; i5 < length; i5++) {
            kClassArr[i5] = d(clsArr[i5]);
        }
        return kClassArr;
    }

    @SinceKotlin(version = "1.4")
    public static KDeclarationContainer g(Class cls) {
        return f23576a.f(cls, "");
    }

    public static KDeclarationContainer h(Class cls, String str) {
        return f23576a.f(cls, str);
    }

    @SinceKotlin(version = "1.6")
    public static KType i(KType kType) {
        return f23576a.g(kType);
    }

    public static KMutableProperty0 j(u0 u0Var) {
        return f23576a.h(u0Var);
    }

    public static KMutableProperty1 k(w0 w0Var) {
        return f23576a.i(w0Var);
    }

    public static KMutableProperty2 l(y0 y0Var) {
        return f23576a.j(y0Var);
    }

    @SinceKotlin(version = "1.6")
    public static KType m(KType kType) {
        return f23576a.k(kType);
    }

    @SinceKotlin(version = "1.4")
    public static KType n(Class cls) {
        return f23576a.s(d(cls), Collections.emptyList(), true);
    }

    @SinceKotlin(version = "1.4")
    public static KType o(Class cls, KTypeProjection kTypeProjection) {
        return f23576a.s(d(cls), Collections.singletonList(kTypeProjection), true);
    }

    @SinceKotlin(version = "1.4")
    public static KType p(Class cls, KTypeProjection kTypeProjection, KTypeProjection kTypeProjection2) {
        return f23576a.s(d(cls), Arrays.asList(kTypeProjection, kTypeProjection2), true);
    }

    @SinceKotlin(version = "1.4")
    public static KType q(Class cls, KTypeProjection... kTypeProjectionArr) {
        List<KTypeProjection> Jy;
        m1 m1Var = f23576a;
        KClass d6 = d(cls);
        Jy = kotlin.collections.t.Jy(kTypeProjectionArr);
        return m1Var.s(d6, Jy, true);
    }

    @SinceKotlin(version = "1.4")
    public static KType r(KClassifier kClassifier) {
        return f23576a.s(kClassifier, Collections.emptyList(), true);
    }

    @SinceKotlin(version = "1.6")
    public static KType s(KType kType, KType kType2) {
        return f23576a.l(kType, kType2);
    }

    public static KProperty0 t(d1 d1Var) {
        return f23576a.m(d1Var);
    }

    public static KProperty1 u(f1 f1Var) {
        return f23576a.n(f1Var);
    }

    public static KProperty2 v(h1 h1Var) {
        return f23576a.o(h1Var);
    }

    @SinceKotlin(version = "1.3")
    public static String w(FunctionBase functionBase) {
        return f23576a.p(functionBase);
    }

    @SinceKotlin(version = "1.1")
    public static String x(Lambda lambda) {
        return f23576a.q(lambda);
    }

    @SinceKotlin(version = "1.4")
    public static void y(KTypeParameter kTypeParameter, KType kType) {
        f23576a.r(kTypeParameter, Collections.singletonList(kType));
    }

    @SinceKotlin(version = "1.4")
    public static void z(KTypeParameter kTypeParameter, KType... kTypeArr) {
        List<KType> Jy;
        m1 m1Var = f23576a;
        Jy = kotlin.collections.t.Jy(kTypeArr);
        m1Var.r(kTypeParameter, Jy);
    }
}
