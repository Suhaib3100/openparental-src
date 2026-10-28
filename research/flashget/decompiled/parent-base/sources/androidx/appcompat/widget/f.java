package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;
import androidx.annotation.c1;

/* compiled from: AppCompatCheckedTextViewHelper.java */
@androidx.annotation.c1({c1.a.LIBRARY})
/* loaded from: classes.dex */
class f {

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.o0
    private final CheckedTextView f1835a;

    /* renamed from: b, reason: collision with root package name */
    private ColorStateList f1836b = null;

    /* renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f1837c = null;

    /* renamed from: d, reason: collision with root package name */
    private boolean f1838d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f1839e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f1840f;

    f(@androidx.annotation.o0 CheckedTextView checkedTextView) {
        this.f1835a = checkedTextView;
    }

    void a() {
        Drawable checkMarkDrawable = this.f1835a.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f1838d || this.f1839e) {
                Drawable mutate = checkMarkDrawable.mutate();
                if (this.f1838d) {
                    mutate.setTintList(this.f1836b);
                }
                if (this.f1839e) {
                    mutate.setTintMode(this.f1837c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.f1835a.getDrawableState());
                }
                this.f1835a.setCheckMarkDrawable(mutate);
            }
        }
    }

    ColorStateList b() {
        return this.f1836b;
    }

    PorterDuff.Mode c() {
        return this.f1837c;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005e A[Catch: all -> 0x0039, TryCatch #1 {all -> 0x0039, blocks: (B:3:0x001d, B:5:0x0025, B:8:0x002b, B:9:0x0056, B:11:0x005e, B:12:0x0067, B:14:0x006f, B:21:0x003b, B:23:0x0043, B:25:0x0049), top: B:2:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006f A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #1 {all -> 0x0039, blocks: (B:3:0x001d, B:5:0x0025, B:8:0x002b, B:9:0x0056, B:11:0x005e, B:12:0x0067, B:14:0x006f, B:21:0x003b, B:23:0x0043, B:25:0x0049), top: B:2:0x001d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void d(@androidx.annotation.q0 android.util.AttributeSet r10, int r11) {
        /*
            r9 = this;
            android.widget.CheckedTextView r0 = r9.f1835a
            android.content.Context r0 = r0.getContext()
            int[] r3 = d.a.m.f73583s3
            r8 = 0
            androidx.appcompat.widget.t0 r0 = androidx.appcompat.widget.t0.G(r0, r10, r3, r11, r8)
            android.widget.CheckedTextView r1 = r9.f1835a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.B()
            r7 = 0
            r4 = r10
            r6 = r11
            androidx.core.view.x1.F1(r1, r2, r3, r4, r5, r6, r7)
            int r10 = d.a.m.f73593u3     // Catch: java.lang.Throwable -> L39
            boolean r11 = r0.C(r10)     // Catch: java.lang.Throwable -> L39
            if (r11 == 0) goto L3b
            int r10 = r0.u(r10, r8)     // Catch: java.lang.Throwable -> L39
            if (r10 == 0) goto L3b
            android.widget.CheckedTextView r11 = r9.f1835a     // Catch: java.lang.Throwable -> L39 android.content.res.Resources.NotFoundException -> L3b
            android.content.Context r1 = r11.getContext()     // Catch: java.lang.Throwable -> L39 android.content.res.Resources.NotFoundException -> L3b
            android.graphics.drawable.Drawable r10 = e.a.b(r1, r10)     // Catch: java.lang.Throwable -> L39 android.content.res.Resources.NotFoundException -> L3b
            r11.setCheckMarkDrawable(r10)     // Catch: java.lang.Throwable -> L39 android.content.res.Resources.NotFoundException -> L3b
            goto L56
        L39:
            r10 = move-exception
            goto L82
        L3b:
            int r10 = d.a.m.f73588t3     // Catch: java.lang.Throwable -> L39
            boolean r11 = r0.C(r10)     // Catch: java.lang.Throwable -> L39
            if (r11 == 0) goto L56
            int r10 = r0.u(r10, r8)     // Catch: java.lang.Throwable -> L39
            if (r10 == 0) goto L56
            android.widget.CheckedTextView r11 = r9.f1835a     // Catch: java.lang.Throwable -> L39
            android.content.Context r1 = r11.getContext()     // Catch: java.lang.Throwable -> L39
            android.graphics.drawable.Drawable r10 = e.a.b(r1, r10)     // Catch: java.lang.Throwable -> L39
            r11.setCheckMarkDrawable(r10)     // Catch: java.lang.Throwable -> L39
        L56:
            int r10 = d.a.m.f73598v3     // Catch: java.lang.Throwable -> L39
            boolean r11 = r0.C(r10)     // Catch: java.lang.Throwable -> L39
            if (r11 == 0) goto L67
            android.widget.CheckedTextView r11 = r9.f1835a     // Catch: java.lang.Throwable -> L39
            android.content.res.ColorStateList r10 = r0.d(r10)     // Catch: java.lang.Throwable -> L39
            r11.setCheckMarkTintList(r10)     // Catch: java.lang.Throwable -> L39
        L67:
            int r10 = d.a.m.f73603w3     // Catch: java.lang.Throwable -> L39
            boolean r11 = r0.C(r10)     // Catch: java.lang.Throwable -> L39
            if (r11 == 0) goto L7e
            android.widget.CheckedTextView r11 = r9.f1835a     // Catch: java.lang.Throwable -> L39
            r1 = -1
            int r10 = r0.o(r10, r1)     // Catch: java.lang.Throwable -> L39
            r1 = 0
            android.graphics.PorterDuff$Mode r10 = androidx.appcompat.widget.a0.e(r10, r1)     // Catch: java.lang.Throwable -> L39
            r11.setCheckMarkTintMode(r10)     // Catch: java.lang.Throwable -> L39
        L7e:
            r0.I()
            return
        L82:
            r0.I()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.f.d(android.util.AttributeSet, int):void");
    }

    void e() {
        if (this.f1840f) {
            this.f1840f = false;
        } else {
            this.f1840f = true;
            a();
        }
    }

    void f(ColorStateList colorStateList) {
        this.f1836b = colorStateList;
        this.f1838d = true;
        a();
    }

    void g(@androidx.annotation.q0 PorterDuff.Mode mode) {
        this.f1837c = mode;
        this.f1839e = true;
        a();
    }
}
