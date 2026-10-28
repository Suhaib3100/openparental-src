package androidx.view;

import android.app.Application;
import androidx.annotation.l0;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.view.k1;

/* compiled from: ViewModelProviders.java */
@Deprecated
/* loaded from: classes3.dex */
public class m1 {

    /* compiled from: ViewModelProviders.java */
    @Deprecated
    public static class a extends k1.a {
        @Deprecated
        public a(@o0 Application application) {
            super(application);
        }
    }

    @Deprecated
    public m1() {
    }

    @o0
    @l0
    @Deprecated
    public static k1 a(@o0 Fragment fragment) {
        return new k1(fragment);
    }

    @o0
    @l0
    @Deprecated
    public static k1 b(@o0 Fragment fragment, @q0 k1.b bVar) {
        if (bVar == null) {
            bVar = fragment.getDefaultViewModelProviderFactory();
        }
        return new k1(fragment.getViewModelStore(), bVar);
    }

    @o0
    @l0
    @Deprecated
    public static k1 c(@o0 FragmentActivity fragmentActivity) {
        return new k1(fragmentActivity);
    }

    @o0
    @l0
    @Deprecated
    public static k1 d(@o0 FragmentActivity fragmentActivity, @q0 k1.b bVar) {
        if (bVar == null) {
            bVar = fragmentActivity.getDefaultViewModelProviderFactory();
        }
        return new k1(fragmentActivity.getViewModelStore(), bVar);
    }
}
