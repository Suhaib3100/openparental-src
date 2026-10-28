package dagger.android;

import dagger.internal.w;

/* compiled from: DaggerApplication_MembersInjector.java */
@dagger.internal.e
@w
/* loaded from: classes5.dex */
public final class g implements d3.g<DaggerApplication> {

    /* renamed from: o, reason: collision with root package name */
    private final h3.c<DispatchingAndroidInjector<Object>> f22343o;

    public g(h3.c<DispatchingAndroidInjector<Object>> androidInjectorProvider) {
        this.f22343o = androidInjectorProvider;
    }

    public static d3.g<DaggerApplication> a(h3.c<DispatchingAndroidInjector<Object>> androidInjectorProvider) {
        return new g(androidInjectorProvider);
    }

    @dagger.internal.k("dagger.android.DaggerApplication.androidInjector")
    public static void b(DaggerApplication instance, DispatchingAndroidInjector<Object> androidInjector) {
        instance.f22337o = androidInjector;
    }

    @Override // d3.g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void injectMembers(DaggerApplication instance) {
        instance.f22337o = this.f22343o.get();
    }
}
