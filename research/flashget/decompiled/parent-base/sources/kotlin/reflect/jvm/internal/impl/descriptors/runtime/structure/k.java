package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Collection;
import kotlin.collections.j0;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.z;

/* compiled from: ReflectJavaArrayType.kt */
/* loaded from: classes7.dex */
public final class k extends z implements wd.f {

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private final Type f76256b;

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private final z f76257c;

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private final Collection<wd.a> f76258d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f76259e;

    public k(@fg.l Type type) {
        z a5;
        l0.p(type, ProtectedSandApp.s("滊\u0001"));
        this.f76256b = type;
        if (!(type instanceof GenericArrayType)) {
            if (type instanceof Class) {
                Class cls = (Class) type;
                if (cls.isArray()) {
                    z.a aVar = z.f76282a;
                    Class<?> componentType = cls.getComponentType();
                    l0.o(componentType, ProtectedSandApp.s("滌\u0001"));
                    a5 = aVar.a(componentType);
                }
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("滍\u0001") + type.getClass() + ProtectedSandApp.s("滎\u0001") + type);
        }
        z.a aVar2 = z.f76282a;
        Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
        l0.o(genericComponentType, ProtectedSandApp.s("滋\u0001"));
        a5 = aVar2.a(genericComponentType);
        this.f76257c = a5;
        this.f76258d = j0.f74919b;
    }

    @Override // wd.d
    public boolean E() {
        return this.f76259e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.z
    @fg.l
    protected Type O() {
        return this.f76256b;
    }

    @fg.l
    public z P() {
        return this.f76257c;
    }

    @Override // wd.d
    @fg.l
    public Collection<wd.a> getAnnotations() {
        return this.f76258d;
    }

    @Override // wd.f
    public wd.x s() {
        return this.f76257c;
    }
}
