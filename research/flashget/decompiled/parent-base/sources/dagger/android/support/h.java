package dagger.android.support;

import android.content.Context;
import androidx.annotation.j0;
import androidx.annotation.o;
import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.m;

/* compiled from: DaggerFragment.java */
/* loaded from: classes7.dex */
public abstract class h extends Fragment implements m {

    /* renamed from: b, reason: collision with root package name */
    @cd.a
    DispatchingAndroidInjector<Object> f73670b;

    public h() {
    }

    @Override // dagger.android.m
    public dagger.android.d<Object> h() {
        return this.f73670b;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        a.b(this);
        super.onAttach(context);
    }

    @o
    public h(@j0 int contentLayoutId) {
        super(contentLayoutId);
    }
}
