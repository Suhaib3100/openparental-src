package androidx.core.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.MenuItem;
import android.view.View;

/* compiled from: MenuItemCompat.java */
/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f5637a = "MenuItemCompat";

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final int f5638b = 0;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final int f5639c = 1;

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final int f5640d = 2;

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final int f5641e = 4;

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final int f5642f = 8;

    /* compiled from: MenuItemCompat.java */
    class a implements MenuItem.OnActionExpandListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f5643a;

        a(c cVar) {
            this.f5643a = cVar;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f5643a.onMenuItemActionCollapse(menuItem);
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f5643a.onMenuItemActionExpand(menuItem);
        }
    }

    /* compiled from: MenuItemCompat.java */
    @androidx.annotation.x0(26)
    static class b {
        private b() {
        }

        @androidx.annotation.u
        static int a(MenuItem menuItem) {
            int alphabeticModifiers;
            alphabeticModifiers = menuItem.getAlphabeticModifiers();
            return alphabeticModifiers;
        }

        @androidx.annotation.u
        static CharSequence b(MenuItem menuItem) {
            CharSequence contentDescription;
            contentDescription = menuItem.getContentDescription();
            return contentDescription;
        }

        @androidx.annotation.u
        static ColorStateList c(MenuItem menuItem) {
            ColorStateList iconTintList;
            iconTintList = menuItem.getIconTintList();
            return iconTintList;
        }

        @androidx.annotation.u
        static PorterDuff.Mode d(MenuItem menuItem) {
            PorterDuff.Mode iconTintMode;
            iconTintMode = menuItem.getIconTintMode();
            return iconTintMode;
        }

        @androidx.annotation.u
        static int e(MenuItem menuItem) {
            int numericModifiers;
            numericModifiers = menuItem.getNumericModifiers();
            return numericModifiers;
        }

        @androidx.annotation.u
        static CharSequence f(MenuItem menuItem) {
            CharSequence tooltipText;
            tooltipText = menuItem.getTooltipText();
            return tooltipText;
        }

        @androidx.annotation.u
        static MenuItem g(MenuItem menuItem, char c6, int i5) {
            MenuItem alphabeticShortcut;
            alphabeticShortcut = menuItem.setAlphabeticShortcut(c6, i5);
            return alphabeticShortcut;
        }

        @androidx.annotation.u
        static MenuItem h(MenuItem menuItem, CharSequence charSequence) {
            MenuItem contentDescription;
            contentDescription = menuItem.setContentDescription(charSequence);
            return contentDescription;
        }

        @androidx.annotation.u
        static MenuItem i(MenuItem menuItem, ColorStateList colorStateList) {
            MenuItem iconTintList;
            iconTintList = menuItem.setIconTintList(colorStateList);
            return iconTintList;
        }

        @androidx.annotation.u
        static MenuItem j(MenuItem menuItem, PorterDuff.Mode mode) {
            MenuItem iconTintMode;
            iconTintMode = menuItem.setIconTintMode(mode);
            return iconTintMode;
        }

        @androidx.annotation.u
        static MenuItem k(MenuItem menuItem, char c6, int i5) {
            MenuItem numericShortcut;
            numericShortcut = menuItem.setNumericShortcut(c6, i5);
            return numericShortcut;
        }

        @androidx.annotation.u
        static MenuItem l(MenuItem menuItem, char c6, char c7, int i5, int i6) {
            MenuItem shortcut;
            shortcut = menuItem.setShortcut(c6, c7, i5, i6);
            return shortcut;
        }

        @androidx.annotation.u
        static MenuItem m(MenuItem menuItem, CharSequence charSequence) {
            MenuItem tooltipText;
            tooltipText = menuItem.setTooltipText(charSequence);
            return tooltipText;
        }
    }

    /* compiled from: MenuItemCompat.java */
    @Deprecated
    public interface c {
        boolean onMenuItemActionCollapse(MenuItem menuItem);

        boolean onMenuItemActionExpand(MenuItem menuItem);
    }

    private p0() {
    }

    @Deprecated
    public static boolean a(MenuItem menuItem) {
        return menuItem.collapseActionView();
    }

    @Deprecated
    public static boolean b(MenuItem menuItem) {
        return menuItem.expandActionView();
    }

    @androidx.annotation.q0
    public static androidx.core.view.b c(@androidx.annotation.o0 MenuItem menuItem) {
        if (menuItem instanceof m.b) {
            return ((m.b) menuItem).b();
        }
        return null;
    }

    @Deprecated
    public static View d(MenuItem menuItem) {
        return menuItem.getActionView();
    }

    public static int e(@androidx.annotation.o0 MenuItem menuItem) {
        if (menuItem instanceof m.b) {
            return ((m.b) menuItem).getAlphabeticModifiers();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return b.a(menuItem);
        }
        return 0;
    }

    @androidx.annotation.q0
    public static CharSequence f(@androidx.annotation.o0 MenuItem menuItem) {
        if (menuItem instanceof m.b) {
            return ((m.b) menuItem).getContentDescription();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return b.b(menuItem);
        }
        return null;
    }

    @androidx.annotation.q0
    public static ColorStateList g(@androidx.annotation.o0 MenuItem menuItem) {
        if (menuItem instanceof m.b) {
            return ((m.b) menuItem).getIconTintList();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return b.c(menuItem);
        }
        return null;
    }

    @androidx.annotation.q0
    public static PorterDuff.Mode h(@androidx.annotation.o0 MenuItem menuItem) {
        if (menuItem instanceof m.b) {
            return ((m.b) menuItem).getIconTintMode();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return b.d(menuItem);
        }
        return null;
    }

    public static int i(@androidx.annotation.o0 MenuItem menuItem) {
        if (menuItem instanceof m.b) {
            return ((m.b) menuItem).getNumericModifiers();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return b.e(menuItem);
        }
        return 0;
    }

    @androidx.annotation.q0
    public static CharSequence j(@androidx.annotation.o0 MenuItem menuItem) {
        if (menuItem instanceof m.b) {
            return ((m.b) menuItem).getTooltipText();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return b.f(menuItem);
        }
        return null;
    }

    @Deprecated
    public static boolean k(MenuItem menuItem) {
        return menuItem.isActionViewExpanded();
    }

    @androidx.annotation.q0
    public static MenuItem l(@androidx.annotation.o0 MenuItem menuItem, @androidx.annotation.q0 androidx.core.view.b bVar) {
        return menuItem instanceof m.b ? ((m.b) menuItem).a(bVar) : menuItem;
    }

    @Deprecated
    public static MenuItem m(MenuItem menuItem, int i5) {
        return menuItem.setActionView(i5);
    }

    @Deprecated
    public static MenuItem n(MenuItem menuItem, View view) {
        return menuItem.setActionView(view);
    }

    public static void o(@androidx.annotation.o0 MenuItem menuItem, char c6, int i5) {
        if (menuItem instanceof m.b) {
            ((m.b) menuItem).setAlphabeticShortcut(c6, i5);
        } else if (Build.VERSION.SDK_INT >= 26) {
            b.g(menuItem, c6, i5);
        }
    }

    public static void p(@androidx.annotation.o0 MenuItem menuItem, @androidx.annotation.q0 CharSequence charSequence) {
        if (menuItem instanceof m.b) {
            ((m.b) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            b.h(menuItem, charSequence);
        }
    }

    public static void q(@androidx.annotation.o0 MenuItem menuItem, @androidx.annotation.q0 ColorStateList colorStateList) {
        if (menuItem instanceof m.b) {
            ((m.b) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            b.i(menuItem, colorStateList);
        }
    }

    public static void r(@androidx.annotation.o0 MenuItem menuItem, @androidx.annotation.q0 PorterDuff.Mode mode) {
        if (menuItem instanceof m.b) {
            ((m.b) menuItem).setIconTintMode(mode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            b.j(menuItem, mode);
        }
    }

    public static void s(@androidx.annotation.o0 MenuItem menuItem, char c6, int i5) {
        if (menuItem instanceof m.b) {
            ((m.b) menuItem).setNumericShortcut(c6, i5);
        } else if (Build.VERSION.SDK_INT >= 26) {
            b.k(menuItem, c6, i5);
        }
    }

    @Deprecated
    public static MenuItem t(MenuItem menuItem, c cVar) {
        return menuItem.setOnActionExpandListener(new a(cVar));
    }

    public static void u(@androidx.annotation.o0 MenuItem menuItem, char c6, char c7, int i5, int i6) {
        if (menuItem instanceof m.b) {
            ((m.b) menuItem).setShortcut(c6, c7, i5, i6);
        } else if (Build.VERSION.SDK_INT >= 26) {
            b.l(menuItem, c6, c7, i5, i6);
        }
    }

    @Deprecated
    public static void v(MenuItem menuItem, int i5) {
        menuItem.setShowAsAction(i5);
    }

    public static void w(@androidx.annotation.o0 MenuItem menuItem, @androidx.annotation.q0 CharSequence charSequence) {
        if (menuItem instanceof m.b) {
            ((m.b) menuItem).setTooltipText(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            b.m(menuItem, charSequence);
        }
    }
}
