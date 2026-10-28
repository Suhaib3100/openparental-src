package androidx.view;

import androidx.annotation.l0;
import androidx.annotation.o0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

/* compiled from: ViewModelStores.java */
@Deprecated
/* loaded from: classes3.dex */
public class p1 {
    private p1() {
    }

    @o0
    @l0
    @Deprecated
    public static n1 a(@o0 Fragment fragment) {
        return fragment.getViewModelStore();
    }

    @o0
    @l0
    @Deprecated
    public static n1 b(@o0 FragmentActivity fragmentActivity) {
        return fragmentActivity.getViewModelStore();
    }
}
