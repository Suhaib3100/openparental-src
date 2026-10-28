package androidx.fragment.app;

import android.view.View;
import kotlin.Metadata;

/* compiled from: View.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/fragment/app/Fragment;", "F", "Landroid/view/View;", "a", "(Landroid/view/View;)Landroidx/fragment/app/Fragment;", "fragment-ktx_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class x0 {
    @fg.l
    public static final <F extends Fragment> F a(@fg.l View view) {
        kotlin.jvm.internal.l0.p(view, "<this>");
        F f4 = (F) FragmentManager.q0(view);
        kotlin.jvm.internal.l0.o(f4, "findFragment(this)");
        return f4;
    }
}
