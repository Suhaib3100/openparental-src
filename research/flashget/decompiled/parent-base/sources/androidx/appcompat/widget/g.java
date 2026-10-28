package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;

/* compiled from: AppCompatCompoundButtonHelper.java */
/* loaded from: classes.dex */
class g {

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.o0
    private final CompoundButton f1841a;

    /* renamed from: b, reason: collision with root package name */
    private ColorStateList f1842b = null;

    /* renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f1843c = null;

    /* renamed from: d, reason: collision with root package name */
    private boolean f1844d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f1845e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f1846f;

    g(@androidx.annotation.o0 CompoundButton compoundButton) {
        this.f1841a = compoundButton;
    }

    void a() {
        Drawable buttonDrawable = this.f1841a.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.f1844d || this.f1845e) {
                Drawable mutate = buttonDrawable.mutate();
                if (this.f1844d) {
                    mutate.setTintList(this.f1842b);
                }
                if (this.f1845e) {
                    mutate.setTintMode(this.f1843c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.f1841a.getDrawableState());
                }
                this.f1841a.setButtonDrawable(mutate);
            }
        }
    }

    int b(int i4) {
        return i4;
    }

    ColorStateList c() {
        return this.f1842b;
    }

    PorterDuff.Mode d() {
        return this.f1843c;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005e A[Catch: all -> 0x0039, TryCatch #1 {all -> 0x0039, blocks: (B:3:0x001d, B:5:0x0025, B:8:0x002b, B:9:0x0056, B:11:0x005e, B:12:0x0067, B:14:0x006f, B:21:0x003b, B:23:0x0043, B:25:0x0049), top: B:2:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006f A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #1 {all -> 0x0039, blocks: (B:3:0x001d, B:5:0x0025, B:8:0x002b, B:9:0x0056, B:11:0x005e, B:12:0x0067, B:14:0x006f, B:21:0x003b, B:23:0x0043, B:25:0x0049), top: B:2:0x001d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void e(@androidx.annotation.q0 android.util.AttributeSet r10, int r11) {
        /*
            r9 = this;
            android.widget.CompoundButton r0 = r9.f1841a
            android.content.Context r0 = r0.getContext()
            int[] r3 = d.a.m.f73608x3
            r8 = 0
            androidx.appcompat.widget.t0 r0 = androidx.appcompat.widget.t0.G(r0, r10, r3, r11, r8)
            android.widget.CompoundButton r1 = r9.f1841a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.B()
            r7 = 0
            r4 = r10
            r6 = r11
            androidx.core.view.x1.F1(r1, r2, r3, r4, r5, r6, r7)
            int r10 = d.a.m.f73618z3     // Catch: java.lang.Throwable -> L39
            boolean r11 = r0.C(r10)     // Catch: java.lang.Throwable -> L39
            if (r11 == 0) goto L3b
            int r10 = r0.u(r10, r8)     // Catch: java.lang.Throwable -> L39
            if (r10 == 0) goto L3b
            android.widget.CompoundButton r11 = r9.f1841a     // Catch: java.lang.Throwable -> L39 android.content.res.Resources.NotFoundException -> L3b
            android.content.Context r1 = r11.getContext()     // Catch: java.lang.Throwable -> L39 android.content.res.Resources.NotFoundException -> L3b
            android.graphics.drawable.Drawable r10 = e.a.b(r1, r10)     // Catch: java.lang.Throwable -> L39 android.content.res.Resources.NotFoundException -> L3b
            r11.setButtonDrawable(r10)     // Catch: java.lang.Throwable -> L39 android.content.res.Resources.NotFoundException -> L3b
            goto L56
        L39:
            r10 = move-exception
            goto L82
        L3b:
            int r10 = d.a.m.f73613y3     // Catch: java.lang.Throwable -> L39
            boolean r11 = r0.C(r10)     // Catch: java.lang.Throwable -> L39
            if (r11 == 0) goto L56
            int r10 = r0.u(r10, r8)     // Catch: java.lang.Throwable -> L39
            if (r10 == 0) goto L56
            android.widget.CompoundButton r11 = r9.f1841a     // Catch: java.lang.Throwable -> L39
            android.content.Context r1 = r11.getContext()     // Catch: java.lang.Throwable -> L39
            android.graphics.drawable.Drawable r10 = e.a.b(r1, r10)     // Catch: java.lang.Throwable -> L39
            r11.setButtonDrawable(r10)     // Catch: java.lang.Throwable -> L39
        L56:
            int r10 = d.a.m.A3     // Catch: java.lang.Throwable -> L39
            boolean r11 = r0.C(r10)     // Catch: java.lang.Throwable -> L39
            if (r11 == 0) goto L67
            android.widget.CompoundButton r11 = r9.f1841a     // Catch: java.lang.Throwable -> L39
            android.content.res.ColorStateList r10 = r0.d(r10)     // Catch: java.lang.Throwable -> L39
            r11.setButtonTintList(r10)     // Catch: java.lang.Throwable -> L39
        L67:
            int r10 = d.a.m.B3     // Catch: java.lang.Throwable -> L39
            boolean r11 = r0.C(r10)     // Catch: java.lang.Throwable -> L39
            if (r11 == 0) goto L7e
            android.widget.CompoundButton r11 = r9.f1841a     // Catch: java.lang.Throwable -> L39
            r1 = -1
            int r10 = r0.o(r10, r1)     // Catch: java.lang.Throwable -> L39
            r1 = 0
            android.graphics.PorterDuff$Mode r10 = androidx.appcompat.widget.a0.e(r10, r1)     // Catch: java.lang.Throwable -> L39
            r11.setButtonTintMode(r10)     // Catch: java.lang.Throwable -> L39
        L7e:
            r0.I()
            return
        L82:
            r0.I()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.g.e(android.util.AttributeSet, int):void");
    }

    void f() {
        if (this.f1846f) {
            this.f1846f = false;
        } else {
            this.f1846f = true;
            a();
        }
    }

    void g(ColorStateList colorStateList) {
        this.f1842b = colorStateList;
        this.f1844d = true;
        a();
    }

    void h(@androidx.annotation.q0 PorterDuff.Mode mode) {
        this.f1843c = mode;
        this.f1845e = true;
        a();
    }
}
