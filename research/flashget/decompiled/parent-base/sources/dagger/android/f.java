package dagger.android;

import dagger.internal.w;

/* compiled from: DaggerActivity_MembersInjector.java */
@dagger.internal.e
@w
/* loaded from: classes7.dex */
public final class f implements vc.g<DaggerActivity> {

    /* renamed from: b, reason: collision with root package name */
    private final cd.c<DispatchingAndroidInjector<Object>> f73655b;

    public f(cd.c<DispatchingAndroidInjector<Object>> androidInjectorProvider) {
        this.f73655b = androidInjectorProvider;
    }

    public static vc.g<DaggerActivity> a(cd.c<DispatchingAndroidInjector<Object>> androidInjectorProvider) {
        return new f(androidInjectorProvider);
    }

    @dagger.internal.k("dagger.android.DaggerActivity.androidInjector")
    public static void b(DaggerActivity instance, DispatchingAndroidInjector<Object> androidInjector) {
        instance.f73649b = androidInjector;
    }

    @Override // vc.g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void injectMembers(DaggerActivity instance) {
        instance.f73649b = this.f73655b.get();
    }
}
