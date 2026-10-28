package kotlin.jvm.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
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

/* compiled from: ReflectionFactory.java */
/* loaded from: classes5.dex */
public class m1 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f23580a = ProtectedSandApp.s("䅱");

    public KClass a(Class cls) {
        return new ClassReference(cls);
    }

    public KClass b(Class cls, String str) {
        return new ClassReference(cls);
    }

    public KFunction c(g0 g0Var) {
        return g0Var;
    }

    public KClass d(Class cls) {
        return new ClassReference(cls);
    }

    public KClass e(Class cls, String str) {
        return new ClassReference(cls);
    }

    public KDeclarationContainer f(Class cls, String str) {
        return new PackageReference(cls, str);
    }

    @SinceKotlin(version = "1.6")
    public KType g(KType kType) {
        TypeReference typeReference = (TypeReference) kType;
        return new TypeReference(kType.getF23643o(), kType.g(), typeReference.getF23645q(), typeReference.getF23646r() | 2);
    }

    public KMutableProperty0 h(u0 u0Var) {
        return u0Var;
    }

    public KMutableProperty1 i(w0 w0Var) {
        return w0Var;
    }

    public KMutableProperty2 j(y0 y0Var) {
        return y0Var;
    }

    @SinceKotlin(version = "1.6")
    public KType k(KType kType) {
        TypeReference typeReference = (TypeReference) kType;
        return new TypeReference(kType.getF23643o(), kType.g(), typeReference.getF23645q(), typeReference.getF23646r() | 4);
    }

    @SinceKotlin(version = "1.6")
    public KType l(KType kType, KType kType2) {
        return new TypeReference(kType.getF23643o(), kType.g(), kType2, ((TypeReference) kType).getF23646r());
    }

    public KProperty0 m(d1 d1Var) {
        return d1Var;
    }

    public KProperty1 n(f1 f1Var) {
        return f1Var;
    }

    public KProperty2 o(h1 h1Var) {
        return h1Var;
    }

    @SinceKotlin(version = "1.3")
    public String p(FunctionBase functionBase) {
        String obj = functionBase.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith(ProtectedSandApp.s("䅰")) ? obj.substring(21) : obj;
    }

    @SinceKotlin(version = "1.1")
    public String q(Lambda lambda) {
        return p(lambda);
    }

    @SinceKotlin(version = "1.4")
    public void r(KTypeParameter kTypeParameter, List<KType> list) {
        ((TypeParameterReference) kTypeParameter).e(list);
    }

    @SinceKotlin(version = "1.4")
    public KType s(KClassifier kClassifier, List<KTypeProjection> list, boolean z5) {
        return new TypeReference(kClassifier, list, z5);
    }

    @SinceKotlin(version = "1.4")
    public KTypeParameter t(Object obj, String str, KVariance kVariance, boolean z5) {
        return new TypeParameterReference(obj, str, kVariance, z5);
    }
}
