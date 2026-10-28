package androidx.content.ui;

import androidx.appcompat.widget.Toolbar;
import androidx.content.ui.d;
import androidx.content.ui.e;
import androidx.drawerlayout.widget.DrawerLayout;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: Toolbar.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a#\u0010\n\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/appcompat/widget/Toolbar;", "Landroidx/navigation/u;", "navController", "Landroidx/drawerlayout/widget/DrawerLayout;", "drawerLayout", "Lkotlin/k2;", "a", "(Landroidx/appcompat/widget/Toolbar;Landroidx/navigation/u;Landroidx/drawerlayout/widget/DrawerLayout;)V", "Landroidx/navigation/ui/d;", "configuration", "b", "(Landroidx/appcompat/widget/Toolbar;Landroidx/navigation/u;Landroidx/navigation/ui/d;)V", "navigation-ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class u {
    public static final void a(@l Toolbar toolbar, @l androidx.content.u navController, @m DrawerLayout drawerLayout) {
        l0.p(toolbar, "<this>");
        l0.p(navController, "navController");
        q.t(toolbar, navController, new d.a(navController.K()).d(drawerLayout).c(new e.d(e.a.f31331b)).a());
    }

    public static final void b(@l Toolbar toolbar, @l androidx.content.u navController, @l d configuration) {
        l0.p(toolbar, "<this>");
        l0.p(navController, "navController");
        l0.p(configuration, "configuration");
        q.t(toolbar, navController, configuration);
    }

    public static /* synthetic */ void c(Toolbar toolbar, androidx.content.u uVar, d dVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            dVar = new d.a(uVar.K()).d(null).c(new e.d(e.a.f31331b)).a();
        }
        b(toolbar, uVar, dVar);
    }
}
