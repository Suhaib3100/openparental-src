package androidx.content.fragment;

import android.view.View;
import androidx.content.fragment.i;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.q0;

/* compiled from: FragmentNavigatorExtras.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\u0006\u001a\u00020\u00052*\u0010\u0004\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000\"\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "Lkotlin/q0;", "Landroid/view/View;", "", "sharedElements", "Landroidx/navigation/fragment/i$c;", "a", "([Lkotlin/q0;)Landroidx/navigation/fragment/i$c;", "navigation-fragment_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class l {
    @fg.l
    public static final i.c a(@fg.l q0<? extends View, String>... sharedElements) {
        l0.p(sharedElements, "sharedElements");
        i.c.a aVar = new i.c.a();
        int length = sharedElements.length;
        int i4 = 0;
        while (i4 < length) {
            q0<? extends View, String> q0Var = sharedElements[i4];
            i4++;
            aVar.a(q0Var.a(), q0Var.b());
        }
        return aVar.c();
    }
}
