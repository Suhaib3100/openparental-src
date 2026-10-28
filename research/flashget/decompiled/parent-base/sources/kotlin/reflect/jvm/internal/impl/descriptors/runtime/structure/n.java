package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.j0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.z;

/* compiled from: ReflectJavaClassifierType.kt */
@r1({"SMAP\nReflectJavaClassifierType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectJavaClassifierType.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaClassifierType\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,64:1\n1#2:65\n1549#3:66\n1620#3,3:67\n*S KotlinDebug\n*F\n+ 1 ReflectJavaClassifierType.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaClassifierType\n*L\n50#1:66\n50#1:67,3\n*E\n"})
/* loaded from: classes7.dex */
public final class n extends z implements wd.j {

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private final Type f76270b;

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private final wd.i f76271c;

    public n(@fg.l Type type) {
        wd.i lVar;
        l0.p(type, ProtectedSandApp.s("滯\u0001"));
        this.f76270b = type;
        if (type instanceof Class) {
            lVar = new l((Class) type);
        } else if (type instanceof TypeVariable) {
            lVar = new a0((TypeVariable) type);
        } else {
            if (!(type instanceof ParameterizedType)) {
                throw new IllegalStateException(ProtectedSandApp.s("滱\u0001") + type.getClass() + ProtectedSandApp.s("滲\u0001") + type);
            }
            Type rawType = ((ParameterizedType) type).getRawType();
            l0.n(rawType, ProtectedSandApp.s("滰\u0001"));
            lVar = new l((Class) rawType);
        }
        this.f76271c = lVar;
    }

    @Override // wd.j
    @fg.l
    public List<wd.x> B() {
        List<Type> d5 = d.d(this.f76270b);
        z.a aVar = z.f76282a;
        ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(d5, 10));
        Iterator<T> it = d5.iterator();
        while (it.hasNext()) {
            arrayList.add(aVar.a((Type) it.next()));
        }
        return arrayList;
    }

    @Override // wd.d
    public boolean E() {
        return false;
    }

    @Override // wd.j
    @fg.l
    public String G() {
        return this.f76270b.toString();
    }

    @Override // wd.j
    @fg.l
    public String I() {
        throw new UnsupportedOperationException(ProtectedSandApp.s("滳\u0001") + this.f76270b);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.z
    @fg.l
    public Type O() {
        return this.f76270b;
    }

    @Override // wd.j
    @fg.l
    public wd.i d() {
        return this.f76271c;
    }

    @Override // wd.d
    @fg.l
    public Collection<wd.a> getAnnotations() {
        return j0.f74919b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.z, wd.d
    @fg.m
    public wd.a k(@fg.l kotlin.reflect.jvm.internal.impl.name.c cVar) {
        l0.p(cVar, ProtectedSandApp.s("滴\u0001"));
        return null;
    }

    @Override // wd.j
    public boolean x() {
        Type type = this.f76270b;
        if (!(type instanceof Class)) {
            return false;
        }
        TypeVariable[] typeParameters = ((Class) type).getTypeParameters();
        l0.o(typeParameters, ProtectedSandApp.s("滵\u0001"));
        return !(typeParameters.length == 0);
    }
}
