package dagger.android.support;

import dagger.android.DispatchingAndroidInjector;
import dagger.internal.w;

/* compiled from: DaggerDialogFragment_MembersInjector.java */
@dagger.internal.e
@w
/* loaded from: classes5.dex */
public final class g implements d3.g<f> {

    /* renamed from: o, reason: collision with root package name */
    private final h3.c<DispatchingAndroidInjector<Object>> f22355o;

    public g(h3.c<DispatchingAndroidInjector<Object>> androidInjectorProvider) {
        this.f22355o = androidInjectorProvider;
    }

    public static d3.g<f> a(h3.c<DispatchingAndroidInjector<Object>> androidInjectorProvider) {
        return new g(androidInjectorProvider);
    }

    @dagger.internal.k("dagger.android.support.DaggerDialogFragment.androidInjector")
    public static void b(f instance, DispatchingAndroidInjector<Object> androidInjector) {
        instance.f22354o = androidInjector;
    }

    @Override // d3.g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void injectMembers(f instance) {
        instance.f22354o = this.f22355o.get();
    }
}
