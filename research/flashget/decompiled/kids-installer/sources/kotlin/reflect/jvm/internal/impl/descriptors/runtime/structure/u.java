package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.annotation.Annotation;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.z;

/* compiled from: ReflectJavaMethod.kt */
/* loaded from: classes6.dex */
public final class u extends t implements b4.r {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final Method f24426a;

    public u(@d5.d Method method) {
        l0.p(method, ProtectedSandApp.s("莲"));
        this.f24426a = method;
    }

    @Override // b4.r
    public boolean O() {
        return r() != null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.t
    public Member V() {
        return this.f24426a;
    }

    @d5.d
    public Method X() {
        return this.f24426a;
    }

    @Override // b4.r
    @d5.d
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public z i() {
        z.a aVar = z.f24432a;
        Type genericReturnType = this.f24426a.getGenericReturnType();
        l0.o(genericReturnType, ProtectedSandApp.s("莳"));
        return aVar.a(genericReturnType);
    }

    @Override // b4.z
    @d5.d
    public List<a0> getTypeParameters() {
        TypeVariable<Method>[] typeParameters = this.f24426a.getTypeParameters();
        l0.o(typeParameters, ProtectedSandApp.s("莴"));
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Method> typeVariable : typeParameters) {
            arrayList.add(new a0(typeVariable));
        }
        return arrayList;
    }

    @Override // b4.r
    @d5.d
    public List<b4.b0> n() {
        Type[] genericParameterTypes = this.f24426a.getGenericParameterTypes();
        l0.o(genericParameterTypes, ProtectedSandApp.s("莵"));
        Annotation[][] parameterAnnotations = this.f24426a.getParameterAnnotations();
        l0.o(parameterAnnotations, ProtectedSandApp.s("莶"));
        return W(genericParameterTypes, parameterAnnotations, this.f24426a.isVarArgs());
    }

    @Override // b4.r
    @d5.e
    public b4.b r() {
        Object defaultValue = this.f24426a.getDefaultValue();
        if (defaultValue != null) {
            return f.f24402b.a(defaultValue, null);
        }
        return null;
    }
}
