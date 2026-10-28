package dagger.android.support;

import dagger.android.DispatchingAndroidInjector;
import dagger.internal.w;

/* compiled from: DaggerAppCompatDialogFragment_MembersInjector.java */
@dagger.internal.e
@w
/* loaded from: classes7.dex */
public final class e implements vc.g<d> {

    /* renamed from: b, reason: collision with root package name */
    private final cd.c<DispatchingAndroidInjector<Object>> f73667b;

    public e(cd.c<DispatchingAndroidInjector<Object>> androidInjectorProvider) {
        this.f73667b = androidInjectorProvider;
    }

    public static vc.g<d> a(cd.c<DispatchingAndroidInjector<Object>> androidInjectorProvider) {
        return new e(androidInjectorProvider);
    }

    @dagger.internal.k("dagger.android.support.DaggerAppCompatDialogFragment.androidInjector")
    public static void b(d instance, DispatchingAndroidInjector<Object> androidInjector) {
        instance.f73666b = androidInjector;
    }

    @Override // vc.g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void injectMembers(d instance) {
        instance.f73666b = this.f73667b.get();
    }
}
