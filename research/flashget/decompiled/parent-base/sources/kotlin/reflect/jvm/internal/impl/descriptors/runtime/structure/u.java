package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.annotation.Annotation;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.z;

/* compiled from: ReflectJavaMethod.kt */
@r1({"SMAP\nReflectJavaMethod.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectJavaMethod.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaMethod\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,37:1\n1#2:38\n11065#3:39\n11400#3,3:40\n*S KotlinDebug\n*F\n+ 1 ReflectJavaMethod.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaMethod\n*L\n35#1:39\n35#1:40,3\n*E\n"})
/* loaded from: classes7.dex */
public final class u extends t implements wd.r {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private final Method f76276a;

    public u(@fg.l Method method) {
        l0.p(method, ProtectedSandApp.s("漇\u0001"));
        this.f76276a = method;
    }

    @Override // wd.r
    public boolean L() {
        return u() != null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.t
    public Member P() {
        return this.f76276a;
    }

    @fg.l
    public Method R() {
        return this.f76276a;
    }

    @Override // wd.r
    @fg.l
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public z getReturnType() {
        z.a aVar = z.f76282a;
        Type genericReturnType = this.f76276a.getGenericReturnType();
        l0.o(genericReturnType, ProtectedSandApp.s("漈\u0001"));
        return aVar.a(genericReturnType);
    }

    @Override // wd.z
    @fg.l
    public List<a0> getTypeParameters() {
        TypeVariable<Method>[] typeParameters = this.f76276a.getTypeParameters();
        l0.o(typeParameters, ProtectedSandApp.s("漉\u0001"));
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Method> typeVariable : typeParameters) {
            arrayList.add(new a0(typeVariable));
        }
        return arrayList;
    }

    @Override // wd.r
    @fg.l
    public List<wd.b0> i() {
        Type[] genericParameterTypes = this.f76276a.getGenericParameterTypes();
        l0.o(genericParameterTypes, ProtectedSandApp.s("漊\u0001"));
        Annotation[][] parameterAnnotations = this.f76276a.getParameterAnnotations();
        l0.o(parameterAnnotations, ProtectedSandApp.s("漋\u0001"));
        return Q(genericParameterTypes, parameterAnnotations, this.f76276a.isVarArgs());
    }

    @Override // wd.r
    @fg.m
    public wd.b u() {
        Object defaultValue = this.f76276a.getDefaultValue();
        if (defaultValue != null) {
            return f.f76252b.a(defaultValue, null);
        }
        return null;
    }
}
