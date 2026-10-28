package dagger.android;

import android.app.Fragment;
import android.content.Context;

/* compiled from: DaggerFragment.java */
@Deprecated
/* loaded from: classes7.dex */
public abstract class j extends Fragment implements m {

    /* renamed from: b, reason: collision with root package name */
    @cd.a
    DispatchingAndroidInjector<Object> f73659b;

    @Override // dagger.android.m
    public d<Object> h() {
        return this.f73659b;
    }

    @Override // android.app.Fragment
    public void onAttach(Context context) {
        a.c(this);
        super.onAttach(context);
    }
}
