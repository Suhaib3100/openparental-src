package dagger.android;

import dagger.android.d;
import dagger.internal.w;
import dagger.internal.x;
import java.util.Map;

/* compiled from: DispatchingAndroidInjector_Factory.java */
@dagger.internal.e
@x
@w
/* loaded from: classes7.dex */
public final class l<T> implements dagger.internal.h<DispatchingAndroidInjector<T>> {

    /* renamed from: a, reason: collision with root package name */
    private final cd.c<Map<Class<?>, cd.c<d.b<?>>>> f73661a;

    /* renamed from: b, reason: collision with root package name */
    private final cd.c<Map<String, cd.c<d.b<?>>>> f73662b;

    public l(cd.c<Map<Class<?>, cd.c<d.b<?>>>> injectorFactoriesWithClassKeysProvider, cd.c<Map<String, cd.c<d.b<?>>>> injectorFactoriesWithStringKeysProvider) {
        this.f73661a = injectorFactoriesWithClassKeysProvider;
        this.f73662b = injectorFactoriesWithStringKeysProvider;
    }

    public static <T> l<T> a(cd.c<Map<Class<?>, cd.c<d.b<?>>>> injectorFactoriesWithClassKeysProvider, cd.c<Map<String, cd.c<d.b<?>>>> injectorFactoriesWithStringKeysProvider) {
        return new l<>(injectorFactoriesWithClassKeysProvider, injectorFactoriesWithStringKeysProvider);
    }

    public static <T> DispatchingAndroidInjector<T> c(Map<Class<?>, cd.c<d.b<?>>> injectorFactoriesWithClassKeys, Map<String, cd.c<d.b<?>>> injectorFactoriesWithStringKeys) {
        return new DispatchingAndroidInjector<>(injectorFactoriesWithClassKeys, injectorFactoriesWithStringKeys);
    }

    @Override // cd.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public DispatchingAndroidInjector<T> get() {
        return new DispatchingAndroidInjector<>(this.f73661a.get(), this.f73662b.get());
    }
}
