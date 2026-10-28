package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Iterator;
import kotlin.jvm.internal.l0;

/* compiled from: ReflectJavaType.kt */
/* loaded from: classes7.dex */
public abstract class z implements wd.x {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final a f76282a = new a();

    /* compiled from: ReflectJavaType.kt */
    public static final class a {
        private a() {
        }

        @fg.l
        public final z a(@fg.l Type type) {
            l0.p(type, ProtectedSandApp.s("漓\u0001"));
            boolean z4 = type instanceof Class;
            if (z4) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    return new x(cls);
                }
            }
            return ((type instanceof GenericArrayType) || (z4 && ((Class) type).isArray())) ? new k(type) : type instanceof WildcardType ? new c0((WildcardType) type) : new n(type);
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    @fg.l
    protected abstract Type O();

    public boolean equals(@fg.m Object obj) {
        return (obj instanceof z) && l0.g(O(), ((z) obj).O());
    }

    public int hashCode() {
        return O().hashCode();
    }

    @Override // wd.d
    @fg.m
    public wd.a k(kotlin.reflect.jvm.internal.impl.name.c cVar) {
        Object obj;
        l0.p(cVar, ProtectedSandApp.s("溗\u0001"));
        Iterator<T> it = getAnnotations().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            kotlin.reflect.jvm.internal.impl.name.b m4 = ((wd.a) next).m();
            if (l0.g(m4 != null ? m4.b() : null, cVar)) {
                obj = next;
                break;
            }
        }
        return (wd.a) obj;
    }

    @fg.l
    public String toString() {
        return getClass().getName() + ProtectedSandApp.s("溘\u0001") + O();
    }
}
