package dagger.android;

import android.app.DialogFragment;
import android.content.Context;

/* compiled from: DaggerDialogFragment.java */
@Deprecated
/* loaded from: classes7.dex */
public abstract class h extends DialogFragment implements m {

    /* renamed from: b, reason: collision with root package name */
    @cd.a
    DispatchingAndroidInjector<Object> f73657b;

    @Override // dagger.android.m
    public d<Object> h() {
        return this.f73657b;
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onAttach(Context context) {
        a.c(this);
        super.onAttach(context);
    }
}
