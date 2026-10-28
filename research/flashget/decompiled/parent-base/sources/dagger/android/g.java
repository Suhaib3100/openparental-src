package dagger.android;

import dagger.internal.w;

/* compiled from: DaggerApplication_MembersInjector.java */
@dagger.internal.e
@w
/* loaded from: classes7.dex */
public final class g implements vc.g<DaggerApplication> {

    /* renamed from: b, reason: collision with root package name */
    private final cd.c<DispatchingAndroidInjector<Object>> f73656b;

    public g(cd.c<DispatchingAndroidInjector<Object>> androidInjectorProvider) {
        this.f73656b = androidInjectorProvider;
    }

    public static vc.g<DaggerApplication> a(cd.c<DispatchingAndroidInjector<Object>> androidInjectorProvider) {
        return new g(androidInjectorProvider);
    }

    @dagger.internal.k("dagger.android.DaggerApplication.androidInjector")
    public static void b(DaggerApplication instance, DispatchingAndroidInjector<Object> androidInjector) {
        instance.f73650b = androidInjector;
    }

    @Override // vc.g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void injectMembers(DaggerApplication instance) {
        instance.f73650b = this.f73656b.get();
    }
}
