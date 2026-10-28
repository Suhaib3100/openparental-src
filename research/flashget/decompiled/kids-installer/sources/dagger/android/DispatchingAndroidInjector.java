package dagger.android;

import com.flashget.kidsdownloader.ProtectedSandApp;
import dagger.android.d;
import dagger.internal.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class DispatchingAndroidInjector<T> implements d<T> {

    /* renamed from: b, reason: collision with root package name */
    private static final String f22338b = ProtectedSandApp.s("㚨");

    /* renamed from: c, reason: collision with root package name */
    private static final String f22339c = ProtectedSandApp.s("㚩");

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, h3.c<d.b<?>>> f22340a;

    public static final class InvalidInjectorBindingException extends RuntimeException {
        InvalidInjectorBindingException(String message, ClassCastException cause) {
            super(message, cause);
        }
    }

    @h3.a
    DispatchingAndroidInjector(Map<Class<?>, h3.c<d.b<?>>> injectorFactoriesWithClassKeys, Map<String, h3.c<d.b<?>>> injectorFactoriesWithStringKeys) {
        this.f22340a = e(injectorFactoriesWithClassKeys, injectorFactoriesWithStringKeys);
    }

    private String c(T instance) {
        ArrayList arrayList = new ArrayList();
        for (Class<?> cls = instance.getClass(); cls != null; cls = cls.getSuperclass()) {
            if (this.f22340a.containsKey(cls.getCanonicalName())) {
                arrayList.add(cls.getCanonicalName());
            }
        }
        return arrayList.isEmpty() ? String.format(ProtectedSandApp.s("㚤"), instance.getClass().getCanonicalName()) : String.format(ProtectedSandApp.s("㚥"), instance.getClass().getCanonicalName(), arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <C, V> Map<String, h3.c<d.b<?>>> e(Map<Class<? extends C>, V> classKeyedMap, Map<String, V> stringKeyedMap) {
        if (classKeyedMap.isEmpty()) {
            return stringKeyedMap;
        }
        LinkedHashMap d6 = dagger.internal.d.d(stringKeyedMap.size() + classKeyedMap.size());
        d6.putAll(stringKeyedMap);
        for (Map.Entry<Class<? extends C>, V> entry : classKeyedMap.entrySet()) {
            d6.put(entry.getKey().getName(), entry.getValue());
        }
        return Collections.unmodifiableMap(d6);
    }

    @Override // dagger.android.d
    public void b(T instance) {
        if (!d(instance)) {
            throw new IllegalArgumentException(c(instance));
        }
    }

    @x1.a
    public boolean d(T instance) {
        h3.c<d.b<?>> cVar = this.f22340a.get(instance.getClass().getName());
        if (cVar == null) {
            return false;
        }
        d.b<?> bVar = cVar.get();
        try {
            ((d) s.d(bVar.a(instance), ProtectedSandApp.s("㚦"), bVar.getClass())).b(instance);
            return true;
        } catch (ClassCastException e6) {
            throw new InvalidInjectorBindingException(String.format(ProtectedSandApp.s("㚧"), bVar.getClass().getCanonicalName(), instance.getClass().getCanonicalName()), e6);
        }
    }
}
