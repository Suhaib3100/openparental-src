package dagger.android;

import dagger.internal.w;

/* compiled from: DaggerFragment_MembersInjector.java */
@dagger.internal.e
@w
/* loaded from: classes7.dex */
public final class k implements vc.g<j> {

    /* renamed from: b, reason: collision with root package name */
    private final cd.c<DispatchingAndroidInjector<Object>> f73660b;

    public k(cd.c<DispatchingAndroidInjector<Object>> androidInjectorProvider) {
        this.f73660b = androidInjectorProvider;
    }

    public static vc.g<j> a(cd.c<DispatchingAndroidInjector<Object>> androidInjectorProvider) {
        return new k(androidInjectorProvider);
    }

    @dagger.internal.k("dagger.android.DaggerFragment.androidInjector")
    public static void b(j instance, DispatchingAndroidInjector<Object> androidInjector) {
        instance.f73659b = androidInjector;
    }

    @Override // vc.g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void injectMembers(j instance) {
        instance.f73659b = this.f73660b.get();
    }
}
