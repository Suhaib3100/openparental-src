package dagger.android;

import dagger.internal.w;

/* compiled from: DaggerDialogFragment_MembersInjector.java */
@dagger.internal.e
@w
/* loaded from: classes5.dex */
public final class i implements d3.g<h> {

    /* renamed from: o, reason: collision with root package name */
    private final h3.c<DispatchingAndroidInjector<Object>> f22345o;

    public i(h3.c<DispatchingAndroidInjector<Object>> androidInjectorProvider) {
        this.f22345o = androidInjectorProvider;
    }

    public static d3.g<h> a(h3.c<DispatchingAndroidInjector<Object>> androidInjectorProvider) {
        return new i(androidInjectorProvider);
    }

    @dagger.internal.k("dagger.android.DaggerDialogFragment.androidInjector")
    public static void b(h instance, DispatchingAndroidInjector<Object> androidInjector) {
        instance.f22344o = androidInjector;
    }

    @Override // d3.g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void injectMembers(h instance) {
        instance.f22344o = this.f22345o.get();
    }
}
