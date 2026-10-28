package dagger.android.support;

import android.content.Context;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.m;

/* compiled from: DaggerDialogFragment.java */
/* loaded from: classes6.dex */
public abstract class f extends androidx.fragment.app.c implements m {

    /* renamed from: o, reason: collision with root package name */
    @h3.a
    DispatchingAndroidInjector<Object> f22354o;

    @Override // dagger.android.m
    public dagger.android.d<Object> c() {
        return this.f22354o;
    }

    @Override // androidx.fragment.app.c, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        a.b(this);
        super.onAttach(context);
    }
}
