package dagger.android;

import android.app.DialogFragment;
import android.content.Context;

/* compiled from: DaggerDialogFragment.java */
@Deprecated
/* loaded from: classes5.dex */
public abstract class h extends DialogFragment implements m {

    /* renamed from: o, reason: collision with root package name */
    @h3.a
    DispatchingAndroidInjector<Object> f22344o;

    @Override // dagger.android.m
    public d<Object> c() {
        return this.f22344o;
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onAttach(Context context) {
        a.c(this);
        super.onAttach(context);
    }
}
