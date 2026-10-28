package dagger.android.support;

import dagger.android.DispatchingAndroidInjector;
import dagger.internal.w;

/* compiled from: DaggerDialogFragment_MembersInjector.java */
@dagger.internal.e
@w
/* loaded from: classes7.dex */
public final class g implements vc.g<f> {

    /* renamed from: b, reason: collision with root package name */
    private final cd.c<DispatchingAndroidInjector<Object>> f73669b;

    public g(cd.c<DispatchingAndroidInjector<Object>> androidInjectorProvider) {
        this.f73669b = androidInjectorProvider;
    }

    public static vc.g<f> a(cd.c<DispatchingAndroidInjector<Object>> androidInjectorProvider) {
        return new g(androidInjectorProvider);
    }

    @dagger.internal.k("dagger.android.support.DaggerDialogFragment.androidInjector")
    public static void b(f instance, DispatchingAndroidInjector<Object> androidInjector) {
        instance.f73668b = androidInjector;
    }

    @Override // vc.g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void injectMembers(f instance) {
        instance.f73668b = this.f73669b.get();
    }
}
