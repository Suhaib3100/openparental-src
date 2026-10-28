package dagger.android.support;

import dagger.android.DispatchingAndroidInjector;
import dagger.internal.w;

/* compiled from: DaggerAppCompatActivity_MembersInjector.java */
@dagger.internal.e
@w
/* loaded from: classes7.dex */
public final class c implements vc.g<DaggerAppCompatActivity> {

    /* renamed from: b, reason: collision with root package name */
    private final cd.c<DispatchingAndroidInjector<Object>> f73665b;

    public c(cd.c<DispatchingAndroidInjector<Object>> androidInjectorProvider) {
        this.f73665b = androidInjectorProvider;
    }

    public static vc.g<DaggerAppCompatActivity> a(cd.c<DispatchingAndroidInjector<Object>> androidInjectorProvider) {
        return new c(androidInjectorProvider);
    }

    @dagger.internal.k("dagger.android.support.DaggerAppCompatActivity.androidInjector")
    public static void b(DaggerAppCompatActivity instance, DispatchingAndroidInjector<Object> androidInjector) {
        instance.f73663b = androidInjector;
    }

    @Override // vc.g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void injectMembers(DaggerAppCompatActivity instance) {
        instance.f73663b = this.f73665b.get();
    }
}
