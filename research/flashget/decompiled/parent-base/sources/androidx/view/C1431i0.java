package androidx.view;

import android.support.v4.media.c;
import androidx.annotation.c1;
import fg.l;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kd.n;
import kotlin.Metadata;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.text.v;

/* compiled from: Lifecycling.kt */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b2\u0006\u0010\u0004\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000f\u001a\f\u0012\u0006\b\u0001\u0012\u00020\t\u0018\u00010\b2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0012\u001a\u00020\u00112\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\u00112\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u001d\u0010\u0016\u001a\u00020\u00152\f\u0010\u000e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001cR$\u0010!\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0004\u0012\u00020\u00110\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010 R2\u0010#\u001a \u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\t0\b0\"0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010 ¨\u0006$"}, d2 = {"Landroidx/lifecycle/i0;", "", "<init>", "()V", "object", "Landroidx/lifecycle/b0;", "f", "(Ljava/lang/Object;)Landroidx/lifecycle/b0;", "Ljava/lang/reflect/Constructor;", "Landroidx/lifecycle/t;", "constructor", "a", "(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)Landroidx/lifecycle/t;", "Ljava/lang/Class;", "klass", "b", "(Ljava/lang/Class;)Ljava/lang/reflect/Constructor;", "", "d", "(Ljava/lang/Class;)I", "g", "", "e", "(Ljava/lang/Class;)Z", "", "className", "c", "(Ljava/lang/String;)Ljava/lang/String;", "I", "REFLECTIVE_CALLBACK", "GENERATED_CALLBACK", "", "Ljava/util/Map;", "callbackCache", "", "classToAdapters", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.lifecycle.i0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1431i0 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final int REFLECTIVE_CALLBACK = 1;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final int GENERATED_CALLBACK = 2;

    /* renamed from: a, reason: collision with root package name */
    @l
    public static final C1431i0 f30335a = new C1431i0();

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    private static final Map<Class<?>, Integer> callbackCache = new HashMap();

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @l
    private static final Map<Class<?>, List<Constructor<? extends InterfaceC1447t>>> classToAdapters = new HashMap();

    private C1431i0() {
    }

    private final InterfaceC1447t a(Constructor<? extends InterfaceC1447t> constructor, Object object) {
        try {
            InterfaceC1447t newInstance = constructor.newInstance(object);
            l0.o(newInstance, "{\n            constructo…tance(`object`)\n        }");
            return newInstance;
        } catch (IllegalAccessException e4) {
            throw new RuntimeException(e4);
        } catch (InstantiationException e5) {
            throw new RuntimeException(e5);
        } catch (InvocationTargetException e6) {
            throw new RuntimeException(e6);
        }
    }

    private final Constructor<? extends InterfaceC1447t> b(Class<?> klass) {
        try {
            Package r02 = klass.getPackage();
            String name = klass.getCanonicalName();
            String fullPackage = r02 != null ? r02.getName() : "";
            l0.o(fullPackage, "fullPackage");
            if (fullPackage.length() != 0) {
                l0.o(name, "name");
                name = name.substring(fullPackage.length() + 1);
                l0.o(name, "this as java.lang.String).substring(startIndex)");
            }
            l0.o(name, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
            String c5 = c(name);
            if (fullPackage.length() != 0) {
                c5 = fullPackage + '.' + c5;
            }
            Class<?> cls = Class.forName(c5);
            l0.n(cls, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            Constructor declaredConstructor = cls.getDeclaredConstructor(klass);
            if (declaredConstructor.isAccessible()) {
                return declaredConstructor;
            }
            declaredConstructor.setAccessible(true);
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException(e4);
        }
    }

    @l
    @n
    public static final String c(@l String className) {
        l0.p(className, "className");
        return c.a(new StringBuilder(), v.i2(className, ".", "_", false, 4, null), "_LifecycleAdapter");
    }

    private final int d(Class<?> klass) {
        Map<Class<?>, Integer> map = callbackCache;
        Integer num = map.get(klass);
        if (num != null) {
            return num.intValue();
        }
        int g4 = g(klass);
        map.put(klass, Integer.valueOf(g4));
        return g4;
    }

    private final boolean e(Class<?> klass) {
        return klass != null && InterfaceC1421d0.class.isAssignableFrom(klass);
    }

    @l
    @n
    public static final InterfaceC1416b0 f(@l Object object) {
        l0.p(object, "object");
        boolean z4 = object instanceof InterfaceC1416b0;
        boolean z5 = object instanceof InterfaceC1436l;
        if (z4 && z5) {
            return new DefaultLifecycleObserverAdapter((InterfaceC1436l) object, (InterfaceC1416b0) object);
        }
        if (z5) {
            return new DefaultLifecycleObserverAdapter((InterfaceC1436l) object, null);
        }
        if (z4) {
            return (InterfaceC1416b0) object;
        }
        Class<?> cls = object.getClass();
        C1431i0 c1431i0 = f30335a;
        if (c1431i0.d(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(object);
        }
        List<Constructor<? extends InterfaceC1447t>> list = classToAdapters.get(cls);
        l0.m(list);
        List<Constructor<? extends InterfaceC1447t>> list2 = list;
        if (list2.size() == 1) {
            return new SingleGeneratedAdapterObserver(c1431i0.a(list2.get(0), object));
        }
        int size = list2.size();
        InterfaceC1447t[] interfaceC1447tArr = new InterfaceC1447t[size];
        for (int i4 = 0; i4 < size; i4++) {
            interfaceC1447tArr[i4] = f30335a.a(list2.get(i4), object);
        }
        return new CompositeGeneratedAdaptersObserver(interfaceC1447tArr);
    }

    private final int g(Class<?> klass) {
        ArrayList arrayList;
        if (klass.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends InterfaceC1447t> b5 = b(klass);
        if (b5 != null) {
            classToAdapters.put(klass, w.k(b5));
            return 2;
        }
        if (C1422e.f30282c.d(klass)) {
            return 1;
        }
        Class<? super Object> superclass = klass.getSuperclass();
        if (e(superclass)) {
            l0.o(superclass, "superclass");
            if (d(superclass) == 1) {
                return 1;
            }
            List<Constructor<? extends InterfaceC1447t>> list = classToAdapters.get(superclass);
            l0.m(list);
            arrayList = new ArrayList(list);
        } else {
            arrayList = null;
        }
        Class<?>[] interfaces = klass.getInterfaces();
        l0.o(interfaces, "klass.interfaces");
        for (Class<?> intrface : interfaces) {
            if (e(intrface)) {
                l0.o(intrface, "intrface");
                if (d(intrface) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                List<Constructor<? extends InterfaceC1447t>> list2 = classToAdapters.get(intrface);
                l0.m(list2);
                arrayList.addAll(list2);
            }
        }
        if (arrayList == null) {
            return 1;
        }
        classToAdapters.put(klass, arrayList);
        return 2;
    }
}
