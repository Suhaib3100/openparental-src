package dagger.android.support;

import android.content.Context;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.m;

/* compiled from: DaggerAppCompatDialogFragment.java */
/* loaded from: classes6.dex */
public abstract class d extends androidx.appcompat.app.i implements m {

    /* renamed from: o, reason: collision with root package name */
    @h3.a
    DispatchingAndroidInjector<Object> f22352o;

    @Override // dagger.android.m
    public dagger.android.d<Object> c() {
        return this.f22352o;
    }

    @Override // androidx.fragment.app.c, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        a.b(this);
        super.onAttach(context);
    }
}
