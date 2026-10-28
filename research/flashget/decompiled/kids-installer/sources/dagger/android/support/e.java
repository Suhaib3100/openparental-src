package dagger.android.support;

import dagger.android.DispatchingAndroidInjector;
import dagger.internal.w;

/* compiled from: DaggerAppCompatDialogFragment_MembersInjector.java */
@dagger.internal.e
@w
/* loaded from: classes5.dex */
public final class e implements d3.g<d> {

    /* renamed from: o, reason: collision with root package name */
    private final h3.c<DispatchingAndroidInjector<Object>> f22353o;

    public e(h3.c<DispatchingAndroidInjector<Object>> androidInjectorProvider) {
        this.f22353o = androidInjectorProvider;
    }

    public static d3.g<d> a(h3.c<DispatchingAndroidInjector<Object>> androidInjectorProvider) {
        return new e(androidInjectorProvider);
    }

    @dagger.internal.k("dagger.android.support.DaggerAppCompatDialogFragment.androidInjector")
    public static void b(d instance, DispatchingAndroidInjector<Object> androidInjector) {
        instance.f22352o = androidInjector;
    }

    @Override // d3.g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void injectMembers(d instance) {
        instance.f22352o = this.f22353o.get();
    }
}
