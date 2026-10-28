package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.annotation.c1;
import androidx.core.content.res.i;
import androidx.core.view.y1;
import d.a;
import java.lang.ref.WeakReference;

/* compiled from: AppCompatTextHelper.java */
/* loaded from: classes.dex */
class t {

    /* renamed from: n, reason: collision with root package name */
    private static final int f1337n = -1;

    /* renamed from: o, reason: collision with root package name */
    private static final int f1338o = 1;

    /* renamed from: p, reason: collision with root package name */
    private static final int f1339p = 2;

    /* renamed from: q, reason: collision with root package name */
    private static final int f1340q = 3;

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.o0
    private final TextView f1341a;

    /* renamed from: b, reason: collision with root package name */
    private x0 f1342b;

    /* renamed from: c, reason: collision with root package name */
    private x0 f1343c;

    /* renamed from: d, reason: collision with root package name */
    private x0 f1344d;

    /* renamed from: e, reason: collision with root package name */
    private x0 f1345e;

    /* renamed from: f, reason: collision with root package name */
    private x0 f1346f;

    /* renamed from: g, reason: collision with root package name */
    private x0 f1347g;

    /* renamed from: h, reason: collision with root package name */
    private x0 f1348h;

    /* renamed from: i, reason: collision with root package name */
    @androidx.annotation.o0
    private final u f1349i;

    /* renamed from: j, reason: collision with root package name */
    private int f1350j = 0;

    /* renamed from: k, reason: collision with root package name */
    private int f1351k = -1;

    /* renamed from: l, reason: collision with root package name */
    private Typeface f1352l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f1353m;

    /* compiled from: AppCompatTextHelper.java */
    /* loaded from: classes2.dex */
    class a extends i.g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f1354a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f1355b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ WeakReference f1356c;

        a(int i5, int i6, WeakReference weakReference) {
            this.f1354a = i5;
            this.f1355b = i6;
            this.f1356c = weakReference;
        }

        @Override // androidx.core.content.res.i.g
        /* renamed from: h */
        public void f(int i5) {
        }

        @Override // androidx.core.content.res.i.g
        /* renamed from: i */
        public void g(@androidx.annotation.o0 Typeface typeface) {
            int i5;
            if (Build.VERSION.SDK_INT >= 28 && (i5 = this.f1354a) != -1) {
                typeface = Typeface.create(typeface, i5, (this.f1355b & 2) != 0);
            }
            t.this.n(this.f1356c, typeface);
        }
    }

    /* compiled from: AppCompatTextHelper.java */
    class b implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ TextView f1358o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ Typeface f1359p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f1360q;

        b(TextView textView, Typeface typeface, int i5) {
            this.f1358o = textView;
            this.f1359p = typeface;
            this.f1360q = i5;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1358o.setTypeface(this.f1359p, this.f1360q);
        }
    }

    t(@androidx.annotation.o0 TextView textView) {
        this.f1341a = textView;
        this.f1349i = new u(textView);
    }

    private void B(int i5, float f6) {
        this.f1349i.y(i5, f6);
    }

    private void C(Context context, z0 z0Var) {
        String w5;
        Typeface create;
        Typeface create2;
        this.f1350j = z0Var.o(a.n.e7, this.f1350j);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 28) {
            int o5 = z0Var.o(a.n.n7, -1);
            this.f1351k = o5;
            if (o5 != -1) {
                this.f1350j = (this.f1350j & 2) | 0;
            }
        }
        int i6 = a.n.m7;
        if (!z0Var.C(i6) && !z0Var.C(a.n.o7)) {
            int i7 = a.n.d7;
            if (z0Var.C(i7)) {
                this.f1353m = false;
                int o6 = z0Var.o(i7, 1);
                if (o6 == 1) {
                    this.f1352l = Typeface.SANS_SERIF;
                    return;
                } else if (o6 == 2) {
                    this.f1352l = Typeface.SERIF;
                    return;
                } else {
                    if (o6 != 3) {
                        return;
                    }
                    this.f1352l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f1352l = null;
        int i8 = a.n.o7;
        if (z0Var.C(i8)) {
            i6 = i8;
        }
        int i9 = this.f1351k;
        int i10 = this.f1350j;
        if (!context.isRestricted()) {
            try {
                Typeface k5 = z0Var.k(i6, this.f1350j, new a(i9, i10, new WeakReference(this.f1341a)));
                if (k5 != null) {
                    if (i5 < 28 || this.f1351k == -1) {
                        this.f1352l = k5;
                    } else {
                        create2 = Typeface.create(Typeface.create(k5, 0), this.f1351k, (this.f1350j & 2) != 0);
                        this.f1352l = create2;
                    }
                }
                this.f1353m = this.f1352l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f1352l != null || (w5 = z0Var.w(i6)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f1351k == -1) {
            this.f1352l = Typeface.create(w5, this.f1350j);
        } else {
            create = Typeface.create(Typeface.create(w5, 0), this.f1351k, (this.f1350j & 2) != 0);
            this.f1352l = create;
        }
    }

    private void a(Drawable drawable, x0 x0Var) {
        if (drawable == null || x0Var == null) {
            return;
        }
        f.j(drawable, x0Var, this.f1341a.getDrawableState());
    }

    private static x0 d(Context context, f fVar, int i5) {
        ColorStateList f6 = fVar.f(context, i5);
        if (f6 == null) {
            return null;
        }
        x0 x0Var = new x0();
        x0Var.f1408d = true;
        x0Var.f1405a = f6;
        return x0Var;
    }

    private void y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] compoundDrawablesRelative = this.f1341a.getCompoundDrawablesRelative();
            TextView textView = this.f1341a;
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative2 = this.f1341a.getCompoundDrawablesRelative();
        Drawable drawable7 = compoundDrawablesRelative2[0];
        if (drawable7 != null || compoundDrawablesRelative2[2] != null) {
            TextView textView2 = this.f1341a;
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative2[1];
            }
            Drawable drawable8 = compoundDrawablesRelative2[2];
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative2[3];
            }
            textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, drawable8, drawable4);
            return;
        }
        Drawable[] compoundDrawables = this.f1341a.getCompoundDrawables();
        TextView textView3 = this.f1341a;
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
        x0 x0Var = this.f1348h;
        this.f1342b = x0Var;
        this.f1343c = x0Var;
        this.f1344d = x0Var;
        this.f1345e = x0Var;
        this.f1346f = x0Var;
        this.f1347g = x0Var;
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    void A(int i5, float f6) {
        if (androidx.core.widget.b.f5874a || l()) {
            return;
        }
        B(i5, f6);
    }

    void b() {
        if (this.f1342b != null || this.f1343c != null || this.f1344d != null || this.f1345e != null) {
            Drawable[] compoundDrawables = this.f1341a.getCompoundDrawables();
            a(compoundDrawables[0], this.f1342b);
            a(compoundDrawables[1], this.f1343c);
            a(compoundDrawables[2], this.f1344d);
            a(compoundDrawables[3], this.f1345e);
        }
        if (this.f1346f == null && this.f1347g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.f1341a.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f1346f);
        a(compoundDrawablesRelative[2], this.f1347g);
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    void c() {
        this.f1349i.b();
    }

    int e() {
        return this.f1349i.j();
    }

    int f() {
        return this.f1349i.k();
    }

    int g() {
        return this.f1349i.l();
    }

    int[] h() {
        return this.f1349i.m();
    }

    int i() {
        return this.f1349i.n();
    }

    @androidx.annotation.q0
    ColorStateList j() {
        x0 x0Var = this.f1348h;
        if (x0Var != null) {
            return x0Var.f1405a;
        }
        return null;
    }

    @androidx.annotation.q0
    PorterDuff.Mode k() {
        x0 x0Var = this.f1348h;
        if (x0Var != null) {
            return x0Var.f1406b;
        }
        return null;
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    boolean l() {
        return this.f1349i.s();
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.t.m(android.util.AttributeSet, int):void");
    }

    void n(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f1353m) {
            this.f1352l = typeface;
            TextView textView = weakReference.get();
            if (textView != null) {
                if (y1.O0(textView)) {
                    textView.post(new b(textView, typeface, this.f1350j));
                } else {
                    textView.setTypeface(typeface, this.f1350j);
                }
            }
        }
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    void o(boolean z5, int i5, int i6, int i7, int i8) {
        if (androidx.core.widget.b.f5874a) {
            return;
        }
        c();
    }

    void p() {
        b();
    }

    void q(Context context, int i5) {
        String w5;
        z0 E = z0.E(context, i5, a.n.b7);
        int i6 = a.n.q7;
        if (E.C(i6)) {
            s(E.a(i6, false));
        }
        int i7 = Build.VERSION.SDK_INT;
        int i8 = a.n.c7;
        if (E.C(i8) && E.g(i8, -1) == 0) {
            this.f1341a.setTextSize(0, 0.0f);
        }
        C(context, E);
        if (i7 >= 26) {
            int i9 = a.n.p7;
            if (E.C(i9) && (w5 = E.w(i9)) != null) {
                this.f1341a.setFontVariationSettings(w5);
            }
        }
        E.I();
        Typeface typeface = this.f1352l;
        if (typeface != null) {
            this.f1341a.setTypeface(typeface, this.f1350j);
        }
    }

    void r(@androidx.annotation.o0 TextView textView, @androidx.annotation.q0 InputConnection inputConnection, @androidx.annotation.o0 EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        androidx.core.view.inputmethod.g.j(editorInfo, textView.getText());
    }

    void s(boolean z5) {
        this.f1341a.setAllCaps(z5);
    }

    void t(int i5, int i6, int i7, int i8) throws IllegalArgumentException {
        this.f1349i.u(i5, i6, i7, i8);
    }

    void u(@androidx.annotation.o0 int[] iArr, int i5) throws IllegalArgumentException {
        this.f1349i.v(iArr, i5);
    }

    void v(int i5) {
        this.f1349i.w(i5);
    }

    void w(@androidx.annotation.q0 ColorStateList colorStateList) {
        if (this.f1348h == null) {
            this.f1348h = new x0();
        }
        x0 x0Var = this.f1348h;
        x0Var.f1405a = colorStateList;
        x0Var.f1408d = colorStateList != null;
        z();
    }

    void x(@androidx.annotation.q0 PorterDuff.Mode mode) {
        if (this.f1348h == null) {
            this.f1348h = new x0();
        }
        x0 x0Var = this.f1348h;
        x0Var.f1406b = mode;
        x0Var.f1407c = mode != null;
        z();
    }
}
