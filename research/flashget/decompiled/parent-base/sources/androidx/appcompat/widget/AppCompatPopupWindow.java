package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.annotation.h1;
import d.a;

/* loaded from: classes.dex */
class AppCompatPopupWindow extends PopupWindow {

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f1479b = false;

    /* renamed from: a, reason: collision with root package name */
    private boolean f1480a;

    public AppCompatPopupWindow(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet, @androidx.annotation.f int i4) {
        super(context, attributeSet, i4);
        a(context, attributeSet, i4, 0);
    }

    private void a(Context context, AttributeSet attributeSet, int i4, int i5) {
        t0 G = t0.G(context, attributeSet, a.m.S4, i4, i5);
        int i6 = a.m.V4;
        if (G.C(i6)) {
            b(G.a(i6, false));
        }
        setBackgroundDrawable(G.h(a.m.T4));
        G.I();
    }

    private void b(boolean z4) {
        if (f1479b) {
            this.f1480a = z4;
        } else {
            setOverlapAnchor(z4);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i4, int i5) {
        if (f1479b && this.f1480a) {
            i5 -= view.getHeight();
        }
        super.showAsDropDown(view, i4, i5);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i4, int i5, int i6, int i7) {
        if (f1479b && this.f1480a) {
            i5 -= view.getHeight();
        }
        super.update(view, i4, i5, i6, i7);
    }

    public AppCompatPopupWindow(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet, @androidx.annotation.f int i4, @h1 int i5) {
        super(context, attributeSet, i4, i5);
        a(context, attributeSet, i4, i5);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i4, int i5, int i6) {
        if (f1479b && this.f1480a) {
            i5 -= view.getHeight();
        }
        super.showAsDropDown(view, i4, i5, i6);
    }
}
