package dagger.android;

import dagger.internal.w;

/* compiled from: DaggerFragment_MembersInjector.java */
@dagger.internal.e
@w
/* loaded from: classes5.dex */
public final class k implements d3.g<j> {

    /* renamed from: o, reason: collision with root package name */
    private final h3.c<DispatchingAndroidInjector<Object>> f22347o;

    public k(h3.c<DispatchingAndroidInjector<Object>> androidInjectorProvider) {
        this.f22347o = androidInjectorProvider;
    }

    public static d3.g<j> a(h3.c<DispatchingAndroidInjector<Object>> androidInjectorProvider) {
        return new k(androidInjectorProvider);
    }

    @dagger.internal.k("dagger.android.DaggerFragment.androidInjector")
    public static void b(j instance, DispatchingAndroidInjector<Object> androidInjector) {
        instance.f22346o = androidInjector;
    }

    @Override // d3.g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void injectMembers(j instance) {
        instance.f22346o = this.f22347o.get();
    }
}
