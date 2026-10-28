package androidx.core.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.MenuItem;
import android.view.View;

/* compiled from: MenuItemCompat.java */
/* loaded from: classes3.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f27391a = "MenuItemCompat";

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final int f27392b = 0;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final int f27393c = 1;

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final int f27394d = 2;

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final int f27395e = 4;

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final int f27396f = 8;

    /* compiled from: MenuItemCompat.java */
    class a implements MenuItem.OnActionExpandListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f27397a;

        a(c cVar) {
            this.f27397a = cVar;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f27397a.onMenuItemActionCollapse(menuItem);
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f27397a.onMenuItemActionExpand(menuItem);
        }
    }

    /* compiled from: MenuItemCompat.java */
    @androidx.annotation.x0(26)
    static class b {
        private b() {
        }

        static int a(MenuItem menuItem) {
            return menuItem.getAlphabeticModifiers();
        }

        static CharSequence b(MenuItem menuItem) {
            return menuItem.getContentDescription();
        }

        static ColorStateList c(MenuItem menuItem) {
            return menuItem.getIconTintList();
        }

        static PorterDuff.Mode d(MenuItem menuItem) {
            return menuItem.getIconTintMode();
        }

        static int e(MenuItem menuItem) {
            return menuItem.getNumericModifiers();
        }

        static CharSequence f(MenuItem menuItem) {
            return menuItem.getTooltipText();
        }

        static MenuItem g(MenuItem menuItem, char c5, int i4) {
            return menuItem.setAlphabeticShortcut(c5, i4);
        }

        static MenuItem h(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setContentDescription(charSequence);
        }

        static MenuItem i(MenuItem menuItem, ColorStateList colorStateList) {
            return menuItem.setIconTintList(colorStateList);
        }

        static MenuItem j(MenuItem menuItem, PorterDuff.Mode mode) {
            return menuItem.setIconTintMode(mode);
        }

        static MenuItem k(MenuItem menuItem, char c5, int i4) {
            return menuItem.setNumericShortcut(c5, i4);
        }

        static MenuItem l(MenuItem menuItem, char c5, char c6, int i4, int i5) {
            return menuItem.setShortcut(c5, c6, i4, i5);
        }

        static MenuItem m(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setTooltipText(charSequence);
        }
    }

    /* compiled from: MenuItemCompat.java */
    @Deprecated
    public interface c {
        boolean onMenuItemActionCollapse(MenuItem menuItem);

        boolean onMenuItemActionExpand(MenuItem menuItem);
    }

    private r0() {
    }

    @androidx.annotation.w0(expression = "item.collapseActionView()")
    @Deprecated
    public static boolean a(MenuItem menuItem) {
        return menuItem.collapseActionView();
    }

    @androidx.annotation.w0(expression = "item.expandActionView()")
    @Deprecated
    public static boolean b(MenuItem menuItem) {
        return menuItem.expandActionView();
    }

    @androidx.annotation.q0
    public static androidx.core.view.b c(@androidx.annotation.o0 MenuItem menuItem) {
        if (menuItem instanceof c1.b) {
            return ((c1.b) menuItem).a();
        }
        return null;
    }

    @androidx.annotation.w0(expression = "item.getActionView()")
    @Deprecated
    public static View d(MenuItem menuItem) {
        return menuItem.getActionView();
    }

    public static int e(@androidx.annotation.o0 MenuItem menuItem) {
        if (menuItem instanceof c1.b) {
            return ((c1.b) menuItem).getAlphabeticModifiers();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return b.a(menuItem);
        }
        return 0;
    }

    @androidx.annotation.q0
    public static CharSequence f(@androidx.annotation.o0 MenuItem menuItem) {
        if (menuItem instanceof c1.b) {
            return ((c1.b) menuItem).getContentDescription();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return b.b(menuItem);
        }
        return null;
    }

    @androidx.annotation.q0
    public static ColorStateList g(@androidx.annotation.o0 MenuItem menuItem) {
        if (menuItem instanceof c1.b) {
            return ((c1.b) menuItem).getIconTintList();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return b.c(menuItem);
        }
        return null;
    }

    @androidx.annotation.q0
    public static PorterDuff.Mode h(@androidx.annotation.o0 MenuItem menuItem) {
        if (menuItem instanceof c1.b) {
            return ((c1.b) menuItem).getIconTintMode();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return b.d(menuItem);
        }
        return null;
    }

    public static int i(@androidx.annotation.o0 MenuItem menuItem) {
        if (menuItem instanceof c1.b) {
            return ((c1.b) menuItem).getNumericModifiers();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return b.e(menuItem);
        }
        return 0;
    }

    @androidx.annotation.q0
    public static CharSequence j(@androidx.annotation.o0 MenuItem menuItem) {
        if (menuItem instanceof c1.b) {
            return ((c1.b) menuItem).getTooltipText();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return b.f(menuItem);
        }
        return null;
    }

    @androidx.annotation.w0(expression = "item.isActionViewExpanded()")
    @Deprecated
    public static boolean k(MenuItem menuItem) {
        return menuItem.isActionViewExpanded();
    }

    @androidx.annotation.q0
    public static MenuItem l(@androidx.annotation.o0 MenuItem menuItem, @androidx.annotation.q0 androidx.core.view.b bVar) {
        return menuItem instanceof c1.b ? ((c1.b) menuItem).c(bVar) : menuItem;
    }

    @androidx.annotation.w0(expression = "item.setActionView(resId)")
    @Deprecated
    public static MenuItem m(MenuItem menuItem, int i4) {
        return menuItem.setActionView(i4);
    }

    @androidx.annotation.w0(expression = "item.setActionView(view)")
    @Deprecated
    public static MenuItem n(MenuItem menuItem, View view) {
        return menuItem.setActionView(view);
    }

    public static void o(@androidx.annotation.o0 MenuItem menuItem, char c5, int i4) {
        if (menuItem instanceof c1.b) {
            ((c1.b) menuItem).setAlphabeticShortcut(c5, i4);
        } else if (Build.VERSION.SDK_INT >= 26) {
            b.g(menuItem, c5, i4);
        }
    }

    public static void p(@androidx.annotation.o0 MenuItem menuItem, @androidx.annotation.q0 CharSequence charSequence) {
        if (menuItem instanceof c1.b) {
            ((c1.b) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            b.h(menuItem, charSequence);
        }
    }

    public static void q(@androidx.annotation.o0 MenuItem menuItem, @androidx.annotation.q0 ColorStateList colorStateList) {
        if (menuItem instanceof c1.b) {
            ((c1.b) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            b.i(menuItem, colorStateList);
        }
    }

    public static void r(@androidx.annotation.o0 MenuItem menuItem, @androidx.annotation.q0 PorterDuff.Mode mode) {
        if (menuItem instanceof c1.b) {
            ((c1.b) menuItem).setIconTintMode(mode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            b.j(menuItem, mode);
        }
    }

    public static void s(@androidx.annotation.o0 MenuItem menuItem, char c5, int i4) {
        if (menuItem instanceof c1.b) {
            ((c1.b) menuItem).setNumericShortcut(c5, i4);
        } else if (Build.VERSION.SDK_INT >= 26) {
            b.k(menuItem, c5, i4);
        }
    }

    @Deprecated
    public static MenuItem t(MenuItem menuItem, c cVar) {
        return menuItem.setOnActionExpandListener(new a(cVar));
    }

    public static void u(@androidx.annotation.o0 MenuItem menuItem, char c5, char c6, int i4, int i5) {
        if (menuItem instanceof c1.b) {
            ((c1.b) menuItem).setShortcut(c5, c6, i4, i5);
        } else if (Build.VERSION.SDK_INT >= 26) {
            b.l(menuItem, c5, c6, i4, i5);
        }
    }

    @androidx.annotation.w0(expression = "item.setShowAsAction(actionEnum)")
    @Deprecated
    public static void v(MenuItem menuItem, int i4) {
        menuItem.setShowAsAction(i4);
    }

    public static void w(@androidx.annotation.o0 MenuItem menuItem, @androidx.annotation.q0 CharSequence charSequence) {
        if (menuItem instanceof c1.b) {
            ((c1.b) menuItem).setTooltipText(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            b.m(menuItem, charSequence);
        }
    }
}
