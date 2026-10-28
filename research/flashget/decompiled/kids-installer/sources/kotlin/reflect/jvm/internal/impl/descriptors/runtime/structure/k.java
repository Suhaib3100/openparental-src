package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Collection;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.z;

/* compiled from: ReflectJavaArrayType.kt */
/* loaded from: classes6.dex */
public final class k extends z implements b4.f {

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final Type f24406b;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private final z f24407c;

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    private final Collection<b4.a> f24408d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f24409e;

    public k(@d5.d Type type) {
        z a6;
        l0.p(type, ProtectedSandApp.s("荰"));
        this.f24406b = type;
        if (!(type instanceof GenericArrayType)) {
            if (type instanceof Class) {
                Class cls = (Class) type;
                if (cls.isArray()) {
                    z.a aVar = z.f24432a;
                    Class<?> componentType = cls.getComponentType();
                    l0.o(componentType, ProtectedSandApp.s("荲"));
                    a6 = aVar.a(componentType);
                }
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("荳") + type.getClass() + ProtectedSandApp.s("荴") + type);
        }
        z.a aVar2 = z.f24432a;
        Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
        l0.o(genericComponentType, ProtectedSandApp.s("荱"));
        a6 = aVar2.a(genericComponentType);
        this.f24407c = a6;
        this.f24408d = EmptyList.f23167o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.z
    @d5.d
    protected Type U() {
        return this.f24406b;
    }

    @d5.d
    public z V() {
        return this.f24407c;
    }

    @Override // b4.d
    @d5.d
    public Collection<b4.a> getAnnotations() {
        return this.f24408d;
    }

    @Override // b4.d
    public boolean o() {
        return this.f24409e;
    }

    @Override // b4.f
    public b4.x p() {
        return this.f24407c;
    }
}
