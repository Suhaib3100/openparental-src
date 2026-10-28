package androidx.appcompat.widget;

import android.content.Context;
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
/* loaded from: classes3.dex */
public class m0 extends ListPopupWindow implements k0 {

    /* renamed from: i0, reason: collision with root package name */
    private static final String f1262i0 = "MenuPopupWindow";

    /* renamed from: j0, reason: collision with root package name */
    private static Method f1263j0;

    /* renamed from: h0, reason: collision with root package name */
    private k0 f1264h0;

    /* compiled from: MenuPopupWindow.java */
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes2.dex */
    public static class a extends f0 {
        final int E;
        final int F;
        private k0 G;
        private MenuItem H;

        public a(Context context, boolean z5) {
            super(context, z5);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.E = 21;
                this.F = 22;
            } else {
                this.E = 22;
                this.F = 21;
            }
        }

        @Override // androidx.appcompat.widget.f0
        public /* bridge */ /* synthetic */ int d(int i5, boolean z5) {
            return super.d(i5, z5);
        }

        @Override // androidx.appcompat.widget.f0
        public /* bridge */ /* synthetic */ int e(int i5, int i6, int i7, int i8, int i9) {
            return super.e(i5, i6, i7, i8, i9);
        }

        @Override // androidx.appcompat.widget.f0
        public /* bridge */ /* synthetic */ boolean f(MotionEvent motionEvent, int i5) {
            return super.f(motionEvent, i5);
        }

        @Override // androidx.appcompat.widget.f0, android.view.ViewGroup, android.view.View
        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        @Override // androidx.appcompat.widget.f0, android.view.View
        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override // androidx.appcompat.widget.f0, android.view.View
        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        @Override // androidx.appcompat.widget.f0, android.view.View
        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        public void o() {
            setSelection(-1);
        }

        @Override // androidx.appcompat.widget.f0, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            androidx.appcompat.view.menu.f fVar;
            int i5;
            int pointToPosition;
            int i6;
            if (this.G != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i5 = headerViewListAdapter.getHeadersCount();
                    fVar = (androidx.appcompat.view.menu.f) headerViewListAdapter.getWrappedAdapter();
                } else {
                    fVar = (androidx.appcompat.view.menu.f) adapter;
                    i5 = 0;
                }
                androidx.appcompat.view.menu.j item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i6 = pointToPosition - i5) < 0 || i6 >= fVar.getCount()) ? null : fVar.getItem(i6);
                MenuItem menuItem = this.H;
                if (menuItem != item) {
                    androidx.appcompat.view.menu.g b6 = fVar.b();
                    if (menuItem != null) {
                        this.G.h(b6, menuItem);
                    }
                    this.H = item;
                    if (item != null) {
                        this.G.e(b6, item);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i5, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i5 == this.E) {
                if (listMenuItemView.isEnabled() && listMenuItemView.d().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || i5 != this.F) {
                return super.onKeyDown(i5, keyEvent);
            }
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            (adapter instanceof HeaderViewListAdapter ? (androidx.appcompat.view.menu.f) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (androidx.appcompat.view.menu.f) adapter).b().f(false);
            return true;
        }

        @Override // androidx.appcompat.widget.f0, android.widget.AbsListView, android.view.View
        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void p(k0 k0Var) {
            this.G = k0Var;
        }

        @Override // androidx.appcompat.widget.f0, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f1263j0 = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    public m0(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet, int i5, int i6) {
        super(context, attributeSet, i5, i6);
    }

    @Override // androidx.appcompat.widget.k0
    public void e(@androidx.annotation.o0 androidx.appcompat.view.menu.g gVar, @androidx.annotation.o0 MenuItem menuItem) {
        k0 k0Var = this.f1264h0;
        if (k0Var != null) {
            k0Var.e(gVar, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.k0
    public void h(@androidx.annotation.o0 androidx.appcompat.view.menu.g gVar, @androidx.annotation.o0 MenuItem menuItem) {
        k0 k0Var = this.f1264h0;
        if (k0Var != null) {
            k0Var.h(gVar, menuItem);
        }
    }

    public void p0(Object obj) {
        this.T.setEnterTransition((Transition) obj);
    }

    public void q0(Object obj) {
        this.T.setExitTransition((Transition) obj);
    }

    public void r0(k0 k0Var) {
        this.f1264h0 = k0Var;
    }

    public void s0(boolean z5) {
        if (Build.VERSION.SDK_INT > 28) {
            this.T.setTouchModal(z5);
            return;
        }
        Method method = f1263j0;
        if (method != null) {
            try {
                method.invoke(this.T, Boolean.valueOf(z5));
            } catch (Exception unused) {
            }
        }
    }

    @Override // androidx.appcompat.widget.ListPopupWindow
    @androidx.annotation.o0
    f0 u(Context context, boolean z5) {
        a aVar = new a(context, z5);
        aVar.p(this);
        return aVar;
    }
}
