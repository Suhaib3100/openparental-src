package dagger.android;

import com.flashget.parentalcontrol.ProtectedSandApp;
import dagger.android.d;
import dagger.internal.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public final class DispatchingAndroidInjector<T> implements d<T> {

    /* renamed from: b, reason: collision with root package name */
    private static final String f73651b = ProtectedSandApp.s("彚\u0001");

    /* renamed from: c, reason: collision with root package name */
    private static final String f73652c = ProtectedSandApp.s("彛\u0001");

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, cd.c<d.b<?>>> f73653a;

    public static final class InvalidInjectorBindingException extends RuntimeException {
        InvalidInjectorBindingException(String message, ClassCastException cause) {
            super(message, cause);
        }
    }

    @cd.a
    DispatchingAndroidInjector(Map<Class<?>, cd.c<d.b<?>>> injectorFactoriesWithClassKeys, Map<String, cd.c<d.b<?>>> injectorFactoriesWithStringKeys) {
        this.f73653a = q(injectorFactoriesWithClassKeys, injectorFactoriesWithStringKeys);
    }

    private String o(T instance) {
        ArrayList arrayList = new ArrayList();
        for (Class<?> cls = instance.getClass(); cls != null; cls = cls.getSuperclass()) {
            if (this.f73653a.containsKey(cls.getCanonicalName())) {
                arrayList.add(cls.getCanonicalName());
            }
        }
        if (arrayList.isEmpty()) {
            return String.format(ProtectedSandApp.s("彚\u0001"), instance.getClass().getCanonicalName());
        }
        return String.format(ProtectedSandApp.s("彛\u0001"), instance.getClass().getCanonicalName(), arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <C, V> Map<String, cd.c<d.b<?>>> q(Map<Class<? extends C>, V> classKeyedMap, Map<String, V> stringKeyedMap) {
        if (classKeyedMap.isEmpty()) {
            return stringKeyedMap;
        }
        LinkedHashMap d5 = dagger.internal.d.d(stringKeyedMap.size() + classKeyedMap.size());
        d5.putAll(stringKeyedMap);
        for (Map.Entry<Class<? extends C>, V> entry : classKeyedMap.entrySet()) {
            d5.put(entry.getKey().getName(), entry.getValue());
        }
        return Collections.unmodifiableMap(d5);
    }

    @Override // dagger.android.d
    public void i(T instance) {
        if (!p(instance)) {
            throw new IllegalArgumentException(o(instance));
        }
    }

    @f9.a
    public boolean p(T instance) {
        cd.c<d.b<?>> cVar = this.f73653a.get(instance.getClass().getName());
        if (cVar == null) {
            return false;
        }
        d.b<?> bVar = cVar.get();
        try {
            ((d) s.d(bVar.create(instance), ProtectedSandApp.s("彜\u0001"), bVar.getClass())).i(instance);
            return true;
        } catch (ClassCastException e4) {
            throw new InvalidInjectorBindingException(String.format(ProtectedSandApp.s("彝\u0001"), bVar.getClass().getCanonicalName(), instance.getClass().getCanonicalName()), (Throwable) e4);
        }
    }
}
