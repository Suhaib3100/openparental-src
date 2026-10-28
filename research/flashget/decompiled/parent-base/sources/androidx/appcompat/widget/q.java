package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.annotation.c1;
import androidx.core.content.res.i;
import androidx.core.view.x1;
import d.a;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* compiled from: AppCompatTextHelper.java */
/* loaded from: classes.dex */
class q {

    /* renamed from: n, reason: collision with root package name */
    private static final int f1985n = -1;

    /* renamed from: o, reason: collision with root package name */
    private static final int f1986o = 1;

    /* renamed from: p, reason: collision with root package name */
    private static final int f1987p = 2;

    /* renamed from: q, reason: collision with root package name */
    private static final int f1988q = 3;

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.o0
    private final TextView f1989a;

    /* renamed from: b, reason: collision with root package name */
    private r0 f1990b;

    /* renamed from: c, reason: collision with root package name */
    private r0 f1991c;

    /* renamed from: d, reason: collision with root package name */
    private r0 f1992d;

    /* renamed from: e, reason: collision with root package name */
    private r0 f1993e;

    /* renamed from: f, reason: collision with root package name */
    private r0 f1994f;

    /* renamed from: g, reason: collision with root package name */
    private r0 f1995g;

    /* renamed from: h, reason: collision with root package name */
    private r0 f1996h;

    /* renamed from: i, reason: collision with root package name */
    @androidx.annotation.o0
    private final r f1997i;

    /* renamed from: j, reason: collision with root package name */
    private int f1998j = 0;

    /* renamed from: k, reason: collision with root package name */
    private int f1999k = -1;

    /* renamed from: l, reason: collision with root package name */
    private Typeface f2000l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f2001m;

    /* compiled from: AppCompatTextHelper.java */
    class a extends i.f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f2002a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f2003b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ WeakReference f2004c;

        a(int i4, int i5, WeakReference weakReference) {
            this.f2002a = i4;
            this.f2003b = i5;
            this.f2004c = weakReference;
        }

        @Override // androidx.core.content.res.i.f
        /* renamed from: h */
        public void f(int i4) {
        }

        @Override // androidx.core.content.res.i.f
        /* renamed from: i */
        public void g(@androidx.annotation.o0 Typeface typeface) {
            int i4;
            if (Build.VERSION.SDK_INT >= 28 && (i4 = this.f2002a) != -1) {
                typeface = g.a(typeface, i4, (this.f2003b & 2) != 0);
            }
            q.this.n(this.f2004c, typeface);
        }
    }

    /* compiled from: AppCompatTextHelper.java */
    class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextView f2006b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Typeface f2007c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f2008d;

        b(TextView textView, Typeface typeface, int i4) {
            this.f2006b = textView;
            this.f2007c = typeface;
            this.f2008d = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2006b.setTypeface(this.f2007c, this.f2008d);
        }
    }

    /* compiled from: AppCompatTextHelper.java */
    @androidx.annotation.x0(17)
    static class c {
        private c() {
        }

        @androidx.annotation.u
        static Drawable[] a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        @androidx.annotation.u
        static void b(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        @androidx.annotation.u
        static void c(TextView textView, Locale locale) {
            textView.setTextLocale(locale);
        }
    }

    /* compiled from: AppCompatTextHelper.java */
    @androidx.annotation.x0(21)
    static class d {
        private d() {
        }

        @androidx.annotation.u
        static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    /* compiled from: AppCompatTextHelper.java */
    @androidx.annotation.x0(24)
    static class e {
        private e() {
        }

        @androidx.annotation.u
        static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        @androidx.annotation.u
        static void b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    /* compiled from: AppCompatTextHelper.java */
    @androidx.annotation.x0(26)
    static class f {
        private f() {
        }

        @androidx.annotation.u
        static int a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        @androidx.annotation.u
        static void b(TextView textView, int i4, int i5, int i6, int i7) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i4, i5, i6, i7);
        }

        @androidx.annotation.u
        static void c(TextView textView, int[] iArr, int i4) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i4);
        }

        @androidx.annotation.u
        static boolean d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    /* compiled from: AppCompatTextHelper.java */
    @androidx.annotation.x0(28)
    static class g {
        private g() {
        }

        @androidx.annotation.u
        static Typeface a(Typeface typeface, int i4, boolean z4) {
            return Typeface.create(typeface, i4, z4);
        }
    }

    q(@androidx.annotation.o0 TextView textView) {
        this.f1989a = textView;
        this.f1997i = new r(textView);
    }

    private void B(int i4, float f4) {
        this.f1997i.w(i4, f4);
    }

    private void C(Context context, t0 t0Var) {
        String w4;
        this.f1998j = t0Var.o(a.m.R5, this.f1998j);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 28) {
            int o4 = t0Var.o(a.m.a6, -1);
            this.f1999k = o4;
            if (o4 != -1) {
                this.f1998j &= 2;
            }
        }
        int i5 = a.m.Z5;
        if (!t0Var.C(i5) && !t0Var.C(a.m.b6)) {
            int i6 = a.m.Q5;
            if (t0Var.C(i6)) {
                this.f2001m = false;
                int o5 = t0Var.o(i6, 1);
                if (o5 == 1) {
                    this.f2000l = Typeface.SANS_SERIF;
                    return;
                } else if (o5 == 2) {
                    this.f2000l = Typeface.SERIF;
                    return;
                } else {
                    if (o5 != 3) {
                        return;
                    }
                    this.f2000l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f2000l = null;
        int i7 = a.m.b6;
        if (t0Var.C(i7)) {
            i5 = i7;
        }
        int i10 = this.f1999k;
        int i11 = this.f1998j;
        if (!context.isRestricted()) {
            try {
                Typeface k4 = t0Var.k(i5, this.f1998j, new a(i10, i11, new WeakReference(this.f1989a)));
                if (k4 != null) {
                    if (i4 < 28 || this.f1999k == -1) {
                        this.f2000l = k4;
                    } else {
                        this.f2000l = g.a(Typeface.create(k4, 0), this.f1999k, (this.f1998j & 2) != 0);
                    }
                }
                this.f2001m = this.f2000l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f2000l != null || (w4 = t0Var.w(i5)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f1999k == -1) {
            this.f2000l = Typeface.create(w4, this.f1998j);
        } else {
            this.f2000l = g.a(Typeface.create(w4, 0), this.f1999k, (this.f1998j & 2) != 0);
        }
    }

    private void a(Drawable drawable, r0 r0Var) {
        if (drawable == null || r0Var == null) {
            return;
        }
        h.j(drawable, r0Var, this.f1989a.getDrawableState());
    }

    private static r0 d(Context context, h hVar, int i4) {
        ColorStateList f4 = hVar.f(context, i4);
        if (f4 == null) {
            return null;
        }
        r0 r0Var = new r0();
        r0Var.f2037d = true;
        r0Var.f2034a = f4;
        return r0Var;
    }

    private void y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] a5 = c.a(this.f1989a);
            TextView textView = this.f1989a;
            if (drawable5 == null) {
                drawable5 = a5[0];
            }
            if (drawable2 == null) {
                drawable2 = a5[1];
            }
            if (drawable6 == null) {
                drawable6 = a5[2];
            }
            if (drawable4 == null) {
                drawable4 = a5[3];
            }
            c.b(textView, drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        Drawable[] a6 = c.a(this.f1989a);
        Drawable drawable7 = a6[0];
        if (drawable7 != null || a6[2] != null) {
            TextView textView2 = this.f1989a;
            if (drawable2 == null) {
                drawable2 = a6[1];
            }
            Drawable drawable8 = a6[2];
            if (drawable4 == null) {
                drawable4 = a6[3];
            }
            c.b(textView2, drawable7, drawable2, drawable8, drawable4);
            return;
        }
        Drawable[] compoundDrawables = this.f1989a.getCompoundDrawables();
        TextView textView3 = this.f1989a;
        if (drawable == null) {
            drawable = compoundDrawables[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawables[1];
        }
        if (drawable3 == null) {
            drawable3 = compoundDrawables[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawables[3];
        }
        textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    private void z() {
        r0 r0Var = this.f1996h;
        this.f1990b = r0Var;
        this.f1991c = r0Var;
        this.f1992d = r0Var;
        this.f1993e = r0Var;
        this.f1994f = r0Var;
        this.f1995g = r0Var;
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    void A(int i4, float f4) {
        if (e1.f1834c || l()) {
            return;
        }
        B(i4, f4);
    }

    void b() {
        if (this.f1990b != null || this.f1991c != null || this.f1992d != null || this.f1993e != null) {
            Drawable[] compoundDrawables = this.f1989a.getCompoundDrawables();
            a(compoundDrawables[0], this.f1990b);
            a(compoundDrawables[1], this.f1991c);
            a(compoundDrawables[2], this.f1992d);
            a(compoundDrawables[3], this.f1993e);
        }
        if (this.f1994f == null && this.f1995g == null) {
            return;
        }
        Drawable[] a5 = c.a(this.f1989a);
        a(a5[0], this.f1994f);
        a(a5[2], this.f1995g);
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    void c() {
        this.f1997i.b();
    }

    int e() {
        return this.f1997i.h();
    }

    int f() {
        return this.f1997i.i();
    }

    int g() {
        return this.f1997i.j();
    }

    int[] h() {
        return this.f1997i.k();
    }

    int i() {
        return this.f1997i.l();
    }

    @androidx.annotation.q0
    ColorStateList j() {
        r0 r0Var = this.f1996h;
        if (r0Var != null) {
            return r0Var.f2034a;
        }
        return null;
    }

    @androidx.annotation.q0
    PorterDuff.Mode k() {
        r0 r0Var = this.f1996h;
        if (r0Var != null) {
            return r0Var.f2035b;
        }
        return null;
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    boolean l() {
        return this.f1997i.q();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x021e  */
    @android.annotation.SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void m(@androidx.annotation.q0 android.util.AttributeSet r20, int r21) {
        /*
            Method dump skipped, instructions count: 616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.q.m(android.util.AttributeSet, int):void");
    }

    void n(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f2001m) {
            this.f2000l = typeface;
            TextView textView = weakReference.get();
            if (textView != null) {
                if (x1.R0(textView)) {
                    textView.post(new b(textView, typeface, this.f1998j));
                } else {
                    textView.setTypeface(typeface, this.f1998j);
                }
            }
        }
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    void o(boolean z4, int i4, int i5, int i6, int i7) {
        if (e1.f1834c) {
            return;
        }
        c();
    }

    void p() {
        b();
    }

    void q(Context context, int i4) {
        String w4;
        t0 E = t0.E(context, i4, a.m.O5);
        int i5 = a.m.d6;
        if (E.C(i5)) {
            s(E.a(i5, false));
        }
        int i6 = Build.VERSION.SDK_INT;
        int i7 = a.m.P5;
        if (E.C(i7) && E.g(i7, -1) == 0) {
            this.f1989a.setTextSize(0, 0.0f);
        }
        C(context, E);
        if (i6 >= 26) {
            int i10 = a.m.c6;
            if (E.C(i10) && (w4 = E.w(i10)) != null) {
                f.d(this.f1989a, w4);
            }
        }
        E.I();
        Typeface typeface = this.f2000l;
        if (typeface != null) {
            this.f1989a.setTypeface(typeface, this.f1998j);
        }
    }

    void r(@androidx.annotation.o0 TextView textView, @androidx.annotation.q0 InputConnection inputConnection, @androidx.annotation.o0 EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        androidx.core.view.inputmethod.c.k(editorInfo, textView.getText());
    }

    void s(boolean z4) {
        this.f1989a.setAllCaps(z4);
    }

    void t(int i4, int i5, int i6, int i7) throws IllegalArgumentException {
        this.f1997i.s(i4, i5, i6, i7);
    }

    void u(@androidx.annotation.o0 int[] iArr, int i4) throws IllegalArgumentException {
        this.f1997i.t(iArr, i4);
    }

    void v(int i4) {
        this.f1997i.u(i4);
    }

    void w(@androidx.annotation.q0 ColorStateList colorStateList) {
        if (this.f1996h == null) {
            this.f1996h = new r0();
        }
        r0 r0Var = this.f1996h;
        r0Var.f2034a = colorStateList;
        r0Var.f2037d = colorStateList != null;
        z();
    }

    void x(@androidx.annotation.q0 PorterDuff.Mode mode) {
        if (this.f1996h == null) {
            this.f1996h = new r0();
        }
        r0 r0Var = this.f1996h;
        r0Var.f2035b = mode;
        r0Var.f2036c = mode != null;
        z();
    }
}
