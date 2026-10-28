package dagger.android;

import dagger.internal.w;

/* compiled from: DaggerActivity_MembersInjector.java */
@dagger.internal.e
@w
/* loaded from: classes5.dex */
public final class f implements d3.g<DaggerActivity> {

    /* renamed from: o, reason: collision with root package name */
    private final h3.c<DispatchingAndroidInjector<Object>> f22342o;

    public f(h3.c<DispatchingAndroidInjector<Object>> androidInjectorProvider) {
        this.f22342o = androidInjectorProvider;
    }

    public static d3.g<DaggerActivity> a(h3.c<DispatchingAndroidInjector<Object>> androidInjectorProvider) {
        return new f(androidInjectorProvider);
    }

    @dagger.internal.k("dagger.android.DaggerActivity.androidInjector")
    public static void b(DaggerActivity instance, DispatchingAndroidInjector<Object> androidInjector) {
        instance.f22336o = androidInjector;
    }

    @Override // d3.g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void injectMembers(DaggerActivity instance) {
        instance.f22336o = this.f22342o.get();
    }
}
