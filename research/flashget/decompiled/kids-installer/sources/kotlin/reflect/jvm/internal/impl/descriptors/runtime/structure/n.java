package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.z;

/* compiled from: ReflectJavaClassifierType.kt */
/* loaded from: classes6.dex */
public final class n extends z implements b4.j {

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final Type f24420b;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private final b4.i f24421c;

    public n(@d5.d Type type) {
        b4.i lVar;
        l0.p(type, ProtectedSandApp.s("莕"));
        this.f24420b = type;
        if (type instanceof Class) {
            lVar = new l((Class) type);
        } else if (type instanceof TypeVariable) {
            lVar = new a0((TypeVariable) type);
        } else {
            if (!(type instanceof ParameterizedType)) {
                throw new IllegalStateException(ProtectedSandApp.s("莗") + type.getClass() + ProtectedSandApp.s("莘") + type);
            }
            Type rawType = ((ParameterizedType) type).getRawType();
            l0.n(rawType, ProtectedSandApp.s("莖"));
            lVar = new l((Class) rawType);
        }
        this.f24421c = lVar;
    }

    @Override // b4.j
    public boolean B() {
        Type type = this.f24420b;
        if (!(type instanceof Class)) {
            return false;
        }
        TypeVariable[] typeParameters = ((Class) type).getTypeParameters();
        l0.o(typeParameters, ProtectedSandApp.s("莙"));
        return (typeParameters.length == 0) ^ true;
    }

    @Override // b4.j
    @d5.d
    public String C() {
        throw new UnsupportedOperationException(ProtectedSandApp.s("莚") + this.f24420b);
    }

    @Override // b4.j
    @d5.d
    public List<b4.x> I() {
        int b02;
        List<Type> d6 = d.d(this.f24420b);
        z.a aVar = z.f24432a;
        b02 = kotlin.collections.b0.b0(d6, 10);
        ArrayList arrayList = new ArrayList(b02);
        Iterator<T> it = d6.iterator();
        while (it.hasNext()) {
            arrayList.add(aVar.a((Type) it.next()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.z
    @d5.d
    public Type U() {
        return this.f24420b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.z, b4.d
    @d5.e
    public b4.a e(@d5.d kotlin.reflect.jvm.internal.impl.name.c cVar) {
        l0.p(cVar, ProtectedSandApp.s("莛"));
        return null;
    }

    @Override // b4.d
    @d5.d
    public Collection<b4.a> getAnnotations() {
        return EmptyList.f23167o;
    }

    @Override // b4.j
    @d5.d
    public b4.i k() {
        return this.f24421c;
    }

    @Override // b4.d
    public boolean o() {
        return false;
    }

    @Override // b4.j
    @d5.d
    public String q() {
        return this.f24420b.toString();
    }
}
