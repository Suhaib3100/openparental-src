package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;

/* compiled from: AppCompatCompoundButtonHelper.java */
/* loaded from: classes.dex */
class e {

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.o0
    private final CompoundButton f1185a;

    /* renamed from: b, reason: collision with root package name */
    private ColorStateList f1186b = null;

    /* renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f1187c = null;

    /* renamed from: d, reason: collision with root package name */
    private boolean f1188d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f1189e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f1190f;

    e(@androidx.annotation.o0 CompoundButton compoundButton) {
        this.f1185a = compoundButton;
    }

    void a() {
        Drawable a6 = androidx.core.widget.d.a(this.f1185a);
        if (a6 != null) {
            if (this.f1188d || this.f1189e) {
                Drawable mutate = a6.mutate();
                if (this.f1188d) {
                    androidx.core.graphics.drawable.d.o(mutate, this.f1186b);
                }
                if (this.f1189e) {
                    androidx.core.graphics.drawable.d.p(mutate, this.f1187c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.f1185a.getDrawableState());
                }
                this.f1185a.setButtonDrawable(mutate);
            }
        }
    }

    int b(int i5) {
        return i5;
    }

    ColorStateList c() {
        return this.f1186b;
    }

    PorterDuff.Mode d() {
        return this.f1187c;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d A[Catch: all -> 0x0084, TRY_ENTER, TryCatch #1 {all -> 0x0084, blocks: (B:3:0x001d, B:5:0x0025, B:8:0x002b, B:11:0x003d, B:13:0x0045, B:15:0x004b, B:16:0x0058, B:18:0x0060, B:19:0x0069, B:21:0x0071), top: B:2:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060 A[Catch: all -> 0x0084, TryCatch #1 {all -> 0x0084, blocks: (B:3:0x001d, B:5:0x0025, B:8:0x002b, B:11:0x003d, B:13:0x0045, B:15:0x004b, B:16:0x0058, B:18:0x0060, B:19:0x0069, B:21:0x0071), top: B:2:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071 A[Catch: all -> 0x0084, TRY_LEAVE, TryCatch #1 {all -> 0x0084, blocks: (B:3:0x001d, B:5:0x0025, B:8:0x002b, B:11:0x003d, B:13:0x0045, B:15:0x004b, B:16:0x0058, B:18:0x0060, B:19:0x0069, B:21:0x0071), top: B:2:0x001d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void e(@androidx.annotation.q0 android.util.AttributeSet r10, int r11) {
        /*
            r9 = this;
            android.widget.CompoundButton r0 = r9.f1185a
            android.content.Context r0 = r0.getContext()
            int[] r3 = d.a.n.L3
            r8 = 0
            androidx.appcompat.widget.z0 r0 = androidx.appcompat.widget.z0.G(r0, r10, r3, r11, r8)
            android.widget.CompoundButton r1 = r9.f1185a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.B()
            r7 = 0
            r4 = r10
            r6 = r11
            androidx.core.view.y1.z1(r1, r2, r3, r4, r5, r6, r7)
            int r10 = d.a.n.N3     // Catch: java.lang.Throwable -> L84
            boolean r11 = r0.C(r10)     // Catch: java.lang.Throwable -> L84
            if (r11 == 0) goto L3a
            int r10 = r0.u(r10, r8)     // Catch: java.lang.Throwable -> L84
            if (r10 == 0) goto L3a
            android.widget.CompoundButton r11 = r9.f1185a     // Catch: android.content.res.Resources.NotFoundException -> L3a java.lang.Throwable -> L84
            android.content.Context r1 = r11.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L3a java.lang.Throwable -> L84
            android.graphics.drawable.Drawable r10 = androidx.appcompat.content.res.a.d(r1, r10)     // Catch: android.content.res.Resources.NotFoundException -> L3a java.lang.Throwable -> L84
            r11.setButtonDrawable(r10)     // Catch: android.content.res.Resources.NotFoundException -> L3a java.lang.Throwable -> L84
            r10 = 1
            goto L3b
        L3a:
            r10 = r8
        L3b:
            if (r10 != 0) goto L58
            int r10 = d.a.n.M3     // Catch: java.lang.Throwable -> L84
            boolean r11 = r0.C(r10)     // Catch: java.lang.Throwable -> L84
            if (r11 == 0) goto L58
            int r10 = r0.u(r10, r8)     // Catch: java.lang.Throwable -> L84
            if (r10 == 0) goto L58
            android.widget.CompoundButton r11 = r9.f1185a     // Catch: java.lang.Throwable -> L84
            android.content.Context r1 = r11.getContext()     // Catch: java.lang.Throwable -> L84
            android.graphics.drawable.Drawable r10 = androidx.appcompat.content.res.a.d(r1, r10)     // Catch: java.lang.Throwable -> L84
            r11.setButtonDrawable(r10)     // Catch: java.lang.Throwable -> L84
        L58:
            int r10 = d.a.n.O3     // Catch: java.lang.Throwable -> L84
            boolean r11 = r0.C(r10)     // Catch: java.lang.Throwable -> L84
            if (r11 == 0) goto L69
            android.widget.CompoundButton r11 = r9.f1185a     // Catch: java.lang.Throwable -> L84
            android.content.res.ColorStateList r10 = r0.d(r10)     // Catch: java.lang.Throwable -> L84
            androidx.core.widget.d.d(r11, r10)     // Catch: java.lang.Throwable -> L84
        L69:
            int r10 = d.a.n.P3     // Catch: java.lang.Throwable -> L84
            boolean r11 = r0.C(r10)     // Catch: java.lang.Throwable -> L84
            if (r11 == 0) goto L80
            android.widget.CompoundButton r11 = r9.f1185a     // Catch: java.lang.Throwable -> L84
            r1 = -1
            int r10 = r0.o(r10, r1)     // Catch: java.lang.Throwable -> L84
            r1 = 0
            android.graphics.PorterDuff$Mode r10 = androidx.appcompat.widget.e0.e(r10, r1)     // Catch: java.lang.Throwable -> L84
            androidx.core.widget.d.e(r11, r10)     // Catch: java.lang.Throwable -> L84
        L80:
            r0.I()
            return
        L84:
            r10 = move-exception
            r0.I()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.e.e(android.util.AttributeSet, int):void");
    }

    void f() {
        if (this.f1190f) {
            this.f1190f = false;
        } else {
            this.f1190f = true;
            a();
        }
    }

    void g(ColorStateList colorStateList) {
        this.f1186b = colorStateList;
        this.f1188d = true;
        a();
    }

    void h(@androidx.annotation.q0 PorterDuff.Mode mode) {
        this.f1187c = mode;
        this.f1189e = true;
        a();
    }
}
