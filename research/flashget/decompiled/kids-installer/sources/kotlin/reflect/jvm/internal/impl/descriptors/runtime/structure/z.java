package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Iterator;
import kotlin.jvm.internal.l0;

/* compiled from: ReflectJavaType.kt */
/* loaded from: classes6.dex */
public abstract class z implements b4.x {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final a f24432a = new a(null);

    /* compiled from: ReflectJavaType.kt */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        @d5.d
        public final z a(@d5.d Type type) {
            l0.p(type, ProtectedSandApp.s("䢳"));
            boolean z5 = type instanceof Class;
            if (z5) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    return new x(cls);
                }
            }
            return ((type instanceof GenericArrayType) || (z5 && ((Class) type).isArray())) ? new k(type) : type instanceof WildcardType ? new c0((WildcardType) type) : new n(type);
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    @d5.d
    protected abstract Type U();

    @Override // b4.d
    @d5.e
    public b4.a e(kotlin.reflect.jvm.internal.impl.name.c cVar) {
        Object obj;
        l0.p(cVar, ProtectedSandApp.s("荞"));
        Iterator<T> it = getAnnotations().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            kotlin.reflect.jvm.internal.impl.name.b h5 = ((b4.a) next).h();
            if (l0.g(h5 != null ? h5.b() : null, cVar)) {
                obj = next;
                break;
            }
        }
        return (b4.a) obj;
    }

    public boolean equals(@d5.e Object obj) {
        return (obj instanceof z) && l0.g(U(), ((z) obj).U());
    }

    public int hashCode() {
        return U().hashCode();
    }

    @d5.d
    public String toString() {
        return getClass().getName() + ProtectedSandApp.s("荟") + U();
    }
}
