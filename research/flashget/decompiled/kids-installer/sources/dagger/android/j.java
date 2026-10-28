package dagger.android;

import android.app.Fragment;
import android.content.Context;

/* compiled from: DaggerFragment.java */
@Deprecated
/* loaded from: classes5.dex */
public abstract class j extends Fragment implements m {

    /* renamed from: o, reason: collision with root package name */
    @h3.a
    DispatchingAndroidInjector<Object> f22346o;

    @Override // dagger.android.m
    public d<Object> c() {
        return this.f22346o;
    }

    @Override // android.app.Fragment
    public void onAttach(Context context) {
        a.c(this);
        super.onAttach(context);
    }
}
