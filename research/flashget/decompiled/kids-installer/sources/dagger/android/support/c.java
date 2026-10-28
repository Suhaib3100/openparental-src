package dagger.android.support;

import dagger.android.DispatchingAndroidInjector;
import dagger.internal.w;

/* compiled from: DaggerAppCompatActivity_MembersInjector.java */
@dagger.internal.e
@w
/* loaded from: classes5.dex */
public final class c implements d3.g<DaggerAppCompatActivity> {

    /* renamed from: o, reason: collision with root package name */
    private final h3.c<DispatchingAndroidInjector<Object>> f22351o;

    public c(h3.c<DispatchingAndroidInjector<Object>> androidInjectorProvider) {
        this.f22351o = androidInjectorProvider;
    }

    public static d3.g<DaggerAppCompatActivity> a(h3.c<DispatchingAndroidInjector<Object>> androidInjectorProvider) {
        return new c(androidInjectorProvider);
    }

    @dagger.internal.k("dagger.android.support.DaggerAppCompatActivity.androidInjector")
    public static void b(DaggerAppCompatActivity instance, DispatchingAndroidInjector<Object> androidInjector) {
        instance.P = androidInjector;
    }

    @Override // d3.g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void injectMembers(DaggerAppCompatActivity instance) {
        instance.P = this.f22351o.get();
    }
}
