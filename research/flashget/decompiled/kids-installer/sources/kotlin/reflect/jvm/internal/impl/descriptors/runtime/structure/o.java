package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.l0;

/* compiled from: ReflectJavaConstructor.kt */
/* loaded from: classes6.dex */
public final class o extends t implements b4.k {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final Constructor<?> f24422a;

    public o(@d5.d Constructor<?> constructor) {
        l0.p(constructor, ProtectedSandApp.s("莦"));
        this.f24422a = constructor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.t
    public Member V() {
        return this.f24422a;
    }

    @d5.d
    public Constructor<?> X() {
        return this.f24422a;
    }

    @Override // b4.z
    @d5.d
    public List<a0> getTypeParameters() {
        TypeVariable<Constructor<?>>[] typeParameters = this.f24422a.getTypeParameters();
        l0.o(typeParameters, ProtectedSandApp.s("莧"));
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Constructor<?>> typeVariable : typeParameters) {
            arrayList.add(new a0(typeVariable));
        }
        return arrayList;
    }

    @Override // b4.k
    @d5.d
    public List<b4.b0> n() {
        Object[] l12;
        Object[] l13;
        Type[] genericParameterTypes = this.f24422a.getGenericParameterTypes();
        l0.o(genericParameterTypes, ProtectedSandApp.s("莨"));
        if (genericParameterTypes.length == 0) {
            return EmptyList.f23167o;
        }
        Class<?> declaringClass = this.f24422a.getDeclaringClass();
        if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
            l13 = kotlin.collections.p.l1(genericParameterTypes, 1, genericParameterTypes.length);
            genericParameterTypes = (Type[]) l13;
        }
        Annotation[][] parameterAnnotations = this.f24422a.getParameterAnnotations();
        if (parameterAnnotations.length < genericParameterTypes.length) {
            throw new IllegalStateException(ProtectedSandApp.s("莬") + this.f24422a);
        }
        if (parameterAnnotations.length > genericParameterTypes.length) {
            l0.o(parameterAnnotations, ProtectedSandApp.s("莩"));
            l12 = kotlin.collections.p.l1(parameterAnnotations, parameterAnnotations.length - genericParameterTypes.length, parameterAnnotations.length);
            parameterAnnotations = (Annotation[][]) l12;
        }
        l0.o(genericParameterTypes, ProtectedSandApp.s("莪"));
        l0.o(parameterAnnotations, ProtectedSandApp.s("莫"));
        return W(genericParameterTypes, parameterAnnotations, this.f24422a.isVarArgs());
    }
}
