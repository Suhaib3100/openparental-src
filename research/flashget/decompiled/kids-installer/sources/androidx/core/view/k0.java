package androidx.core.view;

import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;

/* compiled from: MenuCompat.java */
/* loaded from: classes.dex */
public final class k0 {

    /* compiled from: MenuCompat.java */
    @androidx.annotation.x0(28)
    static class a {
        private a() {
        }

        @androidx.annotation.u
        static void a(Menu menu, boolean z5) {
            menu.setGroupDividerEnabled(z5);
        }
    }

    private k0() {
    }

    public static void a(@androidx.annotation.o0 Menu menu, boolean z5) {
        if (menu instanceof m.a) {
            ((m.a) menu).setGroupDividerEnabled(z5);
        } else if (Build.VERSION.SDK_INT >= 28) {
            a.a(menu, z5);
        }
    }

    @Deprecated
    public static void b(MenuItem menuItem, int i5) {
        menuItem.setShowAsAction(i5);
    }
}
