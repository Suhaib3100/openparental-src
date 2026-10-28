package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.annotation.c1;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* compiled from: MenuPopupWindow.java */
@androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class g0 extends ListPopupWindow implements f0 {
    private static final String Q1 = "MenuPopupWindow";
    private static Method V1;
    private f0 Z;

    /* compiled from: MenuPopupWindow.java */
    @androidx.annotation.x0(23)
    static class a {
        private a() {
        }

        @androidx.annotation.u
        static void a(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        @androidx.annotation.u
        static void b(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    /* compiled from: MenuPopupWindow.java */
    @androidx.annotation.x0(29)
    static class b {
        private b() {
        }

        @androidx.annotation.u
        static void a(PopupWindow popupWindow, boolean z4) {
            popupWindow.setTouchModal(z4);
        }
    }

    /* compiled from: MenuPopupWindow.java */
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public static class c extends b0 {

        /* renamed from: q, reason: collision with root package name */
        final int f1847q;

        /* renamed from: r, reason: collision with root package name */
        final int f1848r;

        /* renamed from: s, reason: collision with root package name */
        private f0 f1849s;

        /* renamed from: t, reason: collision with root package name */
        private MenuItem f1850t;

        /* compiled from: MenuPopupWindow.java */
        @androidx.annotation.x0(17)
        static class a {
            private a() {
            }

            @androidx.annotation.u
            static int a(Configuration configuration) {
                return configuration.getLayoutDirection();
            }
        }

        public c(Context context, boolean z4) {
            super(context, z4);
            if (1 == a.a(context.getResources().getConfiguration())) {
                this.f1847q = 21;
                this.f1848r = 22;
            } else {
                this.f1847q = 22;
                this.f1848r = 21;
            }
        }

        @Override // androidx.appcompat.widget.b0
        public /* bridge */ /* synthetic */ int d(int i4, boolean z4) {
            return super.d(i4, z4);
        }

        @Override // androidx.appcompat.widget.b0
        public /* bridge */ /* synthetic */ int e(int i4, int i5, int i6, int i7, int i10) {
            return super.e(i4, i5, i6, i7, i10);
        }

        @Override // androidx.appcompat.widget.b0
        public /* bridge */ /* synthetic */ boolean f(MotionEvent motionEvent, int i4) {
            return super.f(motionEvent, i4);
        }

        @Override // androidx.appcompat.widget.b0, android.view.ViewGroup, android.view.View
        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        @Override // androidx.appcompat.widget.b0, android.view.View
        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override // androidx.appcompat.widget.b0, android.view.View
        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        @Override // androidx.appcompat.widget.b0, android.view.View
        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        @Override // androidx.appcompat.widget.b0, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            androidx.appcompat.view.menu.g gVar;
            int i4;
            int pointToPosition;
            int i5;
            if (this.f1849s != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i4 = headerViewListAdapter.getHeadersCount();
                    gVar = (androidx.appcompat.view.menu.g) headerViewListAdapter.getWrappedAdapter();
                } else {
                    gVar = (androidx.appcompat.view.menu.g) adapter;
                    i4 = 0;
                }
                androidx.appcompat.view.menu.k item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i5 = pointToPosition - i4) < 0 || i5 >= gVar.getCount()) ? null : gVar.getItem(i5);
                MenuItem menuItem = this.f1850t;
                if (menuItem != item) {
                    androidx.appcompat.view.menu.h b5 = gVar.b();
                    if (menuItem != null) {
                        this.f1849s.p(b5, menuItem);
                    }
                    this.f1850t = item;
                    if (item != null) {
                        this.f1849s.f(b5, item);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i4, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i4 == this.f1847q) {
                if (listMenuItemView.isEnabled() && listMenuItemView.g().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || i4 != this.f1848r) {
                return super.onKeyDown(i4, keyEvent);
            }
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            (adapter instanceof HeaderViewListAdapter ? (androidx.appcompat.view.menu.g) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (androidx.appcompat.view.menu.g) adapter).b().f(false);
            return true;
        }

        @Override // androidx.appcompat.widget.b0, android.widget.AbsListView, android.view.View
        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void q() {
            setSelection(-1);
        }

        public void r(f0 f0Var) {
            this.f1849s = f0Var;
        }

        @Override // androidx.appcompat.widget.b0, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                V1 = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    public g0(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
    }

    @Override // androidx.appcompat.widget.f0
    public void f(@androidx.annotation.o0 androidx.appcompat.view.menu.h hVar, @androidx.annotation.o0 MenuItem menuItem) {
        f0 f0Var = this.Z;
        if (f0Var != null) {
            f0Var.f(hVar, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.f0
    public void p(@androidx.annotation.o0 androidx.appcompat.view.menu.h hVar, @androidx.annotation.o0 MenuItem menuItem) {
        f0 f0Var = this.Z;
        if (f0Var != null) {
            f0Var.p(hVar, menuItem);
        }
    }

    public void p0(Object obj) {
        a.a(this.G, (Transition) obj);
    }

    public void q0(Object obj) {
        a.b(this.G, (Transition) obj);
    }

    public void r0(f0 f0Var) {
        this.Z = f0Var;
    }

    public void s0(boolean z4) {
        if (Build.VERSION.SDK_INT > 28) {
            b.a(this.G, z4);
            return;
        }
        Method method = V1;
        if (method != null) {
            try {
                method.invoke(this.G, Boolean.valueOf(z4));
            } catch (Exception unused) {
            }
        }
    }

    @Override // androidx.appcompat.widget.ListPopupWindow
    @androidx.annotation.o0
    b0 u(Context context, boolean z4) {
        c cVar = new c(context, z4);
        cVar.r(this);
        return cVar;
    }
}
