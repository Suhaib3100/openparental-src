package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.j0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

/* compiled from: ReflectJavaConstructor.kt */
@r1({"SMAP\nReflectJavaConstructor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectJavaConstructor.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaConstructor\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,51:1\n11065#2:52\n11400#2,3:53\n*S KotlinDebug\n*F\n+ 1 ReflectJavaConstructor.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaConstructor\n*L\n49#1:52\n49#1:53,3\n*E\n"})
/* loaded from: classes7.dex */
public final class o extends t implements wd.k {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private final Constructor<?> f76272a;

    public o(@fg.l Constructor<?> constructor) {
        l0.p(constructor, ProtectedSandApp.s("漀\u0001"));
        this.f76272a = constructor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.t
    public Member P() {
        return this.f76272a;
    }

    @fg.l
    public Constructor<?> R() {
        return this.f76272a;
    }

    @Override // wd.z
    @fg.l
    public List<a0> getTypeParameters() {
        TypeVariable<Constructor<?>>[] typeParameters = this.f76272a.getTypeParameters();
        l0.o(typeParameters, ProtectedSandApp.s("漁\u0001"));
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Constructor<?>> typeVariable : typeParameters) {
            arrayList.add(new a0(typeVariable));
        }
        return arrayList;
    }

    @Override // wd.k
    @fg.l
    public List<wd.b0> i() {
        Type[] genericParameterTypes = this.f76272a.getGenericParameterTypes();
        l0.m(genericParameterTypes);
        if (genericParameterTypes.length == 0) {
            return j0.f74919b;
        }
        Class<?> declaringClass = this.f76272a.getDeclaringClass();
        if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
            genericParameterTypes = (Type[]) kotlin.collections.l.l1(genericParameterTypes, 1, genericParameterTypes.length);
        }
        Annotation[][] parameterAnnotations = this.f76272a.getParameterAnnotations();
        if (parameterAnnotations.length < genericParameterTypes.length) {
            throw new IllegalStateException(ProtectedSandApp.s("漂\u0001") + this.f76272a);
        }
        if (parameterAnnotations.length > genericParameterTypes.length) {
            l0.m(parameterAnnotations);
            parameterAnnotations = (Annotation[][]) kotlin.collections.l.l1(parameterAnnotations, parameterAnnotations.length - genericParameterTypes.length, parameterAnnotations.length);
        }
        l0.m(genericParameterTypes);
        l0.m(parameterAnnotations);
        return Q(genericParameterTypes, parameterAnnotations, this.f76272a.isVarArgs());
    }
}
