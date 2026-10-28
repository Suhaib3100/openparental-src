package androidx.content.ui;

import androidx.appcompat.widget.Toolbar;
import androidx.content.u;
import androidx.content.ui.d;
import androidx.content.ui.e;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: CollapsingToolbarLayout.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\f\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/google/android/material/appbar/CollapsingToolbarLayout;", "Landroidx/appcompat/widget/Toolbar;", "toolbar", "Landroidx/navigation/u;", "navController", "Landroidx/drawerlayout/widget/DrawerLayout;", "drawerLayout", "Lkotlin/k2;", "a", "(Lcom/google/android/material/appbar/CollapsingToolbarLayout;Landroidx/appcompat/widget/Toolbar;Landroidx/navigation/u;Landroidx/drawerlayout/widget/DrawerLayout;)V", "Landroidx/navigation/ui/d;", "configuration", "b", "(Lcom/google/android/material/appbar/CollapsingToolbarLayout;Landroidx/appcompat/widget/Toolbar;Landroidx/navigation/u;Landroidx/navigation/ui/d;)V", "navigation-ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g {
    public static final void a(@l CollapsingToolbarLayout collapsingToolbarLayout, @l Toolbar toolbar, @l u navController, @m DrawerLayout drawerLayout) {
        l0.p(collapsingToolbarLayout, "<this>");
        l0.p(toolbar, "toolbar");
        l0.p(navController, "navController");
        q.w(collapsingToolbarLayout, toolbar, navController, new d.a(navController.K()).d(drawerLayout).c(new e.d(e.a.f31331b)).a());
    }

    public static final void b(@l CollapsingToolbarLayout collapsingToolbarLayout, @l Toolbar toolbar, @l u navController, @l d configuration) {
        l0.p(collapsingToolbarLayout, "<this>");
        l0.p(toolbar, "toolbar");
        l0.p(navController, "navController");
        l0.p(configuration, "configuration");
        q.w(collapsingToolbarLayout, toolbar, navController, configuration);
    }

    public static /* synthetic */ void c(CollapsingToolbarLayout collapsingToolbarLayout, Toolbar toolbar, u uVar, d dVar, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            dVar = new d.a(uVar.K()).d(null).c(new e.d(e.a.f31331b)).a();
        }
        b(collapsingToolbarLayout, toolbar, uVar, dVar);
    }
}
