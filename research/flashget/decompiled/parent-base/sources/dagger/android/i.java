package dagger.android;

import dagger.internal.w;

/* compiled from: DaggerDialogFragment_MembersInjector.java */
@dagger.internal.e
@w
/* loaded from: classes7.dex */
public final class i implements vc.g<h> {

    /* renamed from: b, reason: collision with root package name */
    private final cd.c<DispatchingAndroidInjector<Object>> f73658b;

    public i(cd.c<DispatchingAndroidInjector<Object>> androidInjectorProvider) {
        this.f73658b = androidInjectorProvider;
    }

    public static vc.g<h> a(cd.c<DispatchingAndroidInjector<Object>> androidInjectorProvider) {
        return new i(androidInjectorProvider);
    }

    @dagger.internal.k("dagger.android.DaggerDialogFragment.androidInjector")
    public static void b(h instance, DispatchingAndroidInjector<Object> androidInjector) {
        instance.f73657b = androidInjector;
    }

    @Override // vc.g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void injectMembers(h instance) {
        instance.f73657b = this.f73658b.get();
    }
}
