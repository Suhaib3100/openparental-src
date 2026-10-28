package androidx.core.view;

import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;

/* compiled from: MenuCompat.java */
/* loaded from: classes3.dex */
public final class m0 {

    /* compiled from: MenuCompat.java */
    @androidx.annotation.x0(28)
    static class a {
        private a() {
        }

        static void a(Menu menu, boolean z4) {
            menu.setGroupDividerEnabled(z4);
        }
    }

    private m0() {
    }

    public static void a(@androidx.annotation.o0 Menu menu, boolean z4) {
        if (menu instanceof c1.a) {
            ((c1.a) menu).setGroupDividerEnabled(z4);
        } else if (Build.VERSION.SDK_INT >= 28) {
            a.a(menu, z4);
        }
    }

    @androidx.annotation.w0(expression = "item.setShowAsAction(actionEnum)")
    @Deprecated
    public static void b(MenuItem menuItem, int i4) {
        menuItem.setShowAsAction(i4);
    }
}
