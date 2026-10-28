package androidx.view.compose;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.t;
import androidx.compose.runtime.z;
import androidx.compose.ui.platform.ComposeView;
import androidx.view.C1442q1;
import androidx.view.C1446s1;
import androidx.view.C1463g;
import androidx.view.ComponentActivity;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.k2;
import ld.p;

/* compiled from: ComponentActivity.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a0\u0010\u0007\u001a\u00020\u0004*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\t\u001a\u00020\u0004*\u00020\u0000H\u0002¢\u0006\u0004\b\t\u0010\n\"\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\f¨\u0006\u000e"}, d2 = {"Landroidx/activity/ComponentActivity;", "Landroidx/compose/runtime/z;", "parent", "Lkotlin/Function0;", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "content", "a", "(Landroidx/activity/ComponentActivity;Landroidx/compose/runtime/z;Lld/p;)V", "c", "(Landroidx/activity/ComponentActivity;)V", "Landroid/view/ViewGroup$LayoutParams;", "Landroid/view/ViewGroup$LayoutParams;", "DefaultActivityContentLayoutParams", "activity-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @l
    private static final ViewGroup.LayoutParams f455a = new ViewGroup.LayoutParams(-2, -2);

    public static final void a(@l ComponentActivity componentActivity, @m z zVar, @l p<? super t, ? super Integer, k2> pVar) {
        View childAt = ((ViewGroup) componentActivity.getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        ComposeView composeView = childAt instanceof ComposeView ? (ComposeView) childAt : null;
        if (composeView != null) {
            composeView.t(zVar);
            composeView.z(pVar);
            return;
        }
        ComposeView composeView2 = new ComposeView(componentActivity, null, 0, 6, null);
        composeView2.t(zVar);
        composeView2.z(pVar);
        c(componentActivity);
        componentActivity.setContentView(composeView2, f455a);
    }

    public static /* synthetic */ void b(ComponentActivity componentActivity, z zVar, p pVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            zVar = null;
        }
        a(componentActivity, zVar, pVar);
    }

    private static final void c(ComponentActivity componentActivity) {
        View decorView = componentActivity.getWindow().getDecorView();
        if (C1442q1.a(decorView) == null) {
            C1442q1.b(decorView, componentActivity);
        }
        if (C1446s1.a(decorView) == null) {
            C1446s1.b(decorView, componentActivity);
        }
        if (C1463g.a(decorView) == null) {
            C1463g.b(decorView, componentActivity);
        }
    }
}
