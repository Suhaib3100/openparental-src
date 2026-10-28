package dagger.android;

import dagger.android.d;
import dagger.internal.w;
import dagger.internal.x;
import java.util.Map;

/* compiled from: DispatchingAndroidInjector_Factory.java */
@dagger.internal.e
@x
@w
/* loaded from: classes6.dex */
public final class l<T> implements dagger.internal.h<DispatchingAndroidInjector<T>> {

    /* renamed from: a, reason: collision with root package name */
    private final h3.c<Map<Class<?>, h3.c<d.b<?>>>> f22348a;

    /* renamed from: b, reason: collision with root package name */
    private final h3.c<Map<String, h3.c<d.b<?>>>> f22349b;

    public l(h3.c<Map<Class<?>, h3.c<d.b<?>>>> injectorFactoriesWithClassKeysProvider, h3.c<Map<String, h3.c<d.b<?>>>> injectorFactoriesWithStringKeysProvider) {
        this.f22348a = injectorFactoriesWithClassKeysProvider;
        this.f22349b = injectorFactoriesWithStringKeysProvider;
    }

    public static <T> l<T> a(h3.c<Map<Class<?>, h3.c<d.b<?>>>> injectorFactoriesWithClassKeysProvider, h3.c<Map<String, h3.c<d.b<?>>>> injectorFactoriesWithStringKeysProvider) {
        return new l<>(injectorFactoriesWithClassKeysProvider, injectorFactoriesWithStringKeysProvider);
    }

    public static <T> DispatchingAndroidInjector<T> c(Map<Class<?>, h3.c<d.b<?>>> injectorFactoriesWithClassKeys, Map<String, h3.c<d.b<?>>> injectorFactoriesWithStringKeys) {
        return new DispatchingAndroidInjector<>(injectorFactoriesWithClassKeys, injectorFactoriesWithStringKeys);
    }

    @Override // h3.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public DispatchingAndroidInjector<T> get() {
        return new DispatchingAndroidInjector<>(this.f22348a.get(), this.f22349b.get());
    }
}
