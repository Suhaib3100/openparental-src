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
import androidx.core.view.s1;
import d.a;

/* compiled from: TooltipPopup.java */
@androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
class e1 {

    /* renamed from: h, reason: collision with root package name */
    private static final String f1197h = "TooltipPopup";

    /* renamed from: a, reason: collision with root package name */
    private final Context f1198a;

    /* renamed from: b, reason: collision with root package name */
    private final View f1199b;

    /* renamed from: c, reason: collision with root package name */
    private final TextView f1200c;

    /* renamed from: d, reason: collision with root package name */
    private final WindowManager.LayoutParams f1201d;

    /* renamed from: e, reason: collision with root package name */
    private final Rect f1202e;

    /* renamed from: f, reason: collision with root package name */
    private final int[] f1203f;

    /* renamed from: g, reason: collision with root package name */
    private final int[] f1204g;

    e1(@androidx.annotation.o0 Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f1201d = layoutParams;
        this.f1202e = new Rect();
        this.f1203f = new int[2];
        this.f1204g = new int[2];
        this.f1198a = context;
        View inflate = LayoutInflater.from(context).inflate(a.k.B, (ViewGroup) null);
        this.f1199b = inflate;
        this.f1200c = (TextView) inflate.findViewById(a.h.F0);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = s1.f5664e;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = a.m.f22024e;
        layoutParams.flags = 24;
    }

    private void a(View view, int i5, int i6, boolean z5, WindowManager.LayoutParams layoutParams) {
        int height;
        int i7;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f1198a.getResources().getDimensionPixelOffset(a.f.f21772m1);
        if (view.getWidth() < dimensionPixelOffset) {
            i5 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f1198a.getResources().getDimensionPixelOffset(a.f.f21769l1);
            height = i6 + dimensionPixelOffset2;
            i7 = i6 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i7 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f1198a.getResources().getDimensionPixelOffset(z5 ? a.f.f21781p1 : a.f.f21778o1);
        View b6 = b(view);
        if (b6 == null) {
            return;
        }
        b6.getWindowVisibleDisplayFrame(this.f1202e);
        Rect rect = this.f1202e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f1198a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f1202e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        b6.getLocationOnScreen(this.f1204g);
        view.getLocationOnScreen(this.f1203f);
        int[] iArr = this.f1203f;
        int i8 = iArr[0];
        int[] iArr2 = this.f1204g;
        int i9 = i8 - iArr2[0];
        iArr[0] = i9;
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (i9 + i5) - (b6.getWidth() / 2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f1199b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f1199b.getMeasuredHeight();
        int i10 = this.f1203f[1];
        int i11 = ((i7 + i10) - dimensionPixelOffset3) - measuredHeight;
        int i12 = i10 + height + dimensionPixelOffset3;
        if (z5) {
            if (i11 >= 0) {
                layoutParams.y = i11;
                return;
            } else {
                layoutParams.y = i12;
                return;
            }
        }
        if (measuredHeight + i12 <= this.f1202e.height()) {
            layoutParams.y = i12;
        } else {
            layoutParams.y = i11;
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
            ((WindowManager) this.f1198a.getSystemService("window")).removeView(this.f1199b);
        }
    }

    boolean d() {
        return this.f1199b.getParent() != null;
    }

    void e(View view, int i5, int i6, boolean z5, CharSequence charSequence) {
        if (d()) {
            c();
        }
        this.f1200c.setText(charSequence);
        a(view, i5, i6, z5, this.f1201d);
        ((WindowManager) this.f1198a.getSystemService("window")).addView(this.f1199b, this.f1201d);
    }
}
