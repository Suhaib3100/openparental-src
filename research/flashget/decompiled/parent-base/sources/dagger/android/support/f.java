package dagger.android.support;

import android.content.Context;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.m;

/* compiled from: DaggerDialogFragment.java */
/* loaded from: classes7.dex */
public abstract class f extends androidx.fragment.app.e implements m {

    /* renamed from: b, reason: collision with root package name */
    @cd.a
    DispatchingAndroidInjector<Object> f73668b;

    @Override // dagger.android.m
    public dagger.android.d<Object> h() {
        return this.f73668b;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        a.b(this);
        super.onAttach(context);
    }
}
