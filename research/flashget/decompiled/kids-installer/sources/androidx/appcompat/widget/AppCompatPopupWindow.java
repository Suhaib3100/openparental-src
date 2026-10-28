package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import d.a;

/* loaded from: classes.dex */
class AppCompatPopupWindow extends PopupWindow {

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f879b = false;

    /* renamed from: a, reason: collision with root package name */
    private boolean f880a;

    public AppCompatPopupWindow(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet, @androidx.annotation.f int i5) {
        super(context, attributeSet, i5);
        a(context, attributeSet, i5, 0);
    }

    private void a(Context context, AttributeSet attributeSet, int i5, int i6) {
        z0 G = z0.G(context, attributeSet, a.n.W5, i5, i6);
        int i7 = a.n.Z5;
        if (G.C(i7)) {
            b(G.a(i7, false));
        }
        setBackgroundDrawable(G.h(a.n.X5));
        G.I();
    }

    private void b(boolean z5) {
        if (f879b) {
            this.f880a = z5;
        } else {
            androidx.core.widget.q.c(this, z5);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i5, int i6) {
        if (f879b && this.f880a) {
            i6 -= view.getHeight();
        }
        super.showAsDropDown(view, i5, i6);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i5, int i6, int i7, int i8) {
        if (f879b && this.f880a) {
            i6 -= view.getHeight();
        }
        super.update(view, i5, i6, i7, i8);
    }

    public AppCompatPopupWindow(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet, @androidx.annotation.f int i5, @androidx.annotation.h1 int i6) {
        super(context, attributeSet, i5, i6);
        a(context, attributeSet, i5, i6);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i5, int i6, int i7) {
        if (f879b && this.f880a) {
            i6 -= view.getHeight();
        }
        super.showAsDropDown(view, i5, i6, i7);
    }
}
