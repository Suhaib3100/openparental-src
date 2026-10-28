package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.annotation.c1;
import d.a;

/* compiled from: TooltipPopup.java */
@androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
class c1 {

    /* renamed from: h, reason: collision with root package name */
    private static final String f1770h = "TooltipPopup";

    /* renamed from: a, reason: collision with root package name */
    private final Context f1771a;

    /* renamed from: b, reason: collision with root package name */
    private final View f1772b;

    /* renamed from: c, reason: collision with root package name */
    private final TextView f1773c;

    /* renamed from: d, reason: collision with root package name */
    private final WindowManager.LayoutParams f1774d;

    /* renamed from: e, reason: collision with root package name */
    private final Rect f1775e;

    /* renamed from: f, reason: collision with root package name */
    private final int[] f1776f;

    /* renamed from: g, reason: collision with root package name */
    private final int[] f1777g;

    c1(@androidx.annotation.o0 Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f1774d = layoutParams;
        this.f1775e = new Rect();
        this.f1776f = new int[2];
        this.f1777g = new int[2];
        this.f1771a = context;
        View inflate = LayoutInflater.from(context).inflate(a.j.B, (ViewGroup) null);
        this.f1772b = inflate;
        this.f1773c = (TextView) inflate.findViewById(a.g.I);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = a.l.f73375e;
        layoutParams.flags = 24;
    }

    private void a(View view, int i4, int i5, boolean z4, WindowManager.LayoutParams layoutParams) {
        int height;
        int i6;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f1771a.getResources().getDimensionPixelOffset(a.e.Q0);
        if (view.getWidth() < dimensionPixelOffset) {
            i4 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f1771a.getResources().getDimensionPixelOffset(a.e.P0);
            height = i5 + dimensionPixelOffset2;
            i6 = i5 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i6 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f1771a.getResources().getDimensionPixelOffset(z4 ? a.e.T0 : a.e.S0);
        View b5 = b(view);
        if (b5 == null) {
            return;
        }
        b5.getWindowVisibleDisplayFrame(this.f1775e);
        Rect rect = this.f1775e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f1771a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f1775e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        b5.getLocationOnScreen(this.f1777g);
        view.getLocationOnScreen(this.f1776f);
        int[] iArr = this.f1776f;
        int i7 = iArr[0];
        int[] iArr2 = this.f1777g;
        int i10 = i7 - iArr2[0];
        iArr[0] = i10;
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (i10 + i4) - (b5.getWidth() / 2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f1772b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f1772b.getMeasuredHeight();
        int i11 = this.f1776f[1];
        int i12 = ((i6 + i11) - dimensionPixelOffset3) - measuredHeight;
        int i13 = i11 + height + dimensionPixelOffset3;
        if (z4) {
            if (i12 >= 0) {
                layoutParams.y = i12;
                return;
            } else {
                layoutParams.y = i13;
                return;
            }
        }
        if (measuredHeight + i13 <= this.f1775e.height()) {
            layoutParams.y = i13;
        } else {
            layoutParams.y = i12;
        }
    }

    private static View b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    void c() {
        if (d()) {
            ((WindowManager) this.f1771a.getSystemService("window")).removeView(this.f1772b);
        }
    }

    boolean d() {
        return this.f1772b.getParent() != null;
    }

    void e(View view, int i4, int i5, boolean z4, CharSequence charSequence) {
        if (d()) {
            c();
        }
        this.f1773c.setText(charSequence);
        a(view, i4, i5, z4, this.f1774d);
        ((WindowManager) this.f1771a.getSystemService("window")).addView(this.f1772b, this.f1774d);
    }
}
