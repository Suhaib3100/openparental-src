package androidx.content.fragment;

import androidx.content.u;
import androidx.fragment.app.Fragment;
import fg.l;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/fragment/app/Fragment;", "Landroidx/navigation/u;", "a", "(Landroidx/fragment/app/Fragment;)Landroidx/navigation/u;", "navigation-fragment_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g {
    @l
    public static final u a(@l Fragment fragment) {
        l0.p(fragment, "<this>");
        return NavHostFragment.INSTANCE.d(fragment);
    }
}
