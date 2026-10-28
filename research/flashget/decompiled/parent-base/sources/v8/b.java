package v8;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import androidx.annotation.e;
import androidx.annotation.f;
import androidx.annotation.g1;
import androidx.annotation.h1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.r;
import androidx.annotation.u0;
import androidx.annotation.v;
import androidx.appcompat.app.c;
import androidx.appcompat.view.d;
import androidx.core.view.x1;
import com.google.android.material.shape.j;
import s8.a;

/* compiled from: MaterialAlertDialogBuilder.java */
/* loaded from: classes6.dex */
public class b extends c.a {

    /* renamed from: e, reason: collision with root package name */
    @f
    private static final int f92836e = a.c.L;

    /* renamed from: f, reason: collision with root package name */
    @h1
    private static final int f92837f = a.n.f91489y3;

    /* renamed from: g, reason: collision with root package name */
    @f
    private static final int f92838g = a.c.f90542q9;

    /* renamed from: c, reason: collision with root package name */
    @q0
    private Drawable f92839c;

    /* renamed from: d, reason: collision with root package name */
    @o0
    @r
    private final Rect f92840d;

    public b(@o0 Context context) {
        this(context, 0);
    }

    private static Context P(@o0 Context context) {
        int R = R(context);
        Context c5 = a9.a.c(context, null, f92836e, f92837f);
        return R == 0 ? c5 : new d(c5, R);
    }

    private static int R(@o0 Context context) {
        TypedValue a5 = com.google.android.material.resources.b.a(context, f92838g);
        if (a5 == null) {
            return 0;
        }
        return a5.data;
    }

    private static int S(@o0 Context context, int i4) {
        return i4 == 0 ? R(context) : i4;
    }

    @Override // androidx.appcompat.app.c.a
    @o0
    /* renamed from: A0, reason: merged with bridge method [inline-methods] */
    public b G(@q0 Cursor cursor, int i4, @o0 String str, @q0 DialogInterface.OnClickListener onClickListener) {
        return (b) super.G(cursor, i4, str, onClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    @o0
    /* renamed from: B0, reason: merged with bridge method [inline-methods] */
    public b H(@q0 ListAdapter listAdapter, int i4, @q0 DialogInterface.OnClickListener onClickListener) {
        return (b) super.H(listAdapter, i4, onClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    @o0
    /* renamed from: C0, reason: merged with bridge method [inline-methods] */
    public b I(@q0 CharSequence[] charSequenceArr, int i4, @q0 DialogInterface.OnClickListener onClickListener) {
        return (b) super.I(charSequenceArr, i4, onClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    @o0
    /* renamed from: D0, reason: merged with bridge method [inline-methods] */
    public b J(@g1 int i4) {
        return (b) super.J(i4);
    }

    @Override // androidx.appcompat.app.c.a
    @o0
    /* renamed from: E0, reason: merged with bridge method [inline-methods] */
    public b K(@q0 CharSequence charSequence) {
        return (b) super.K(charSequence);
    }

    @Override // androidx.appcompat.app.c.a
    @o0
    /* renamed from: F0, reason: merged with bridge method [inline-methods] */
    public b L(int i4) {
        return (b) super.L(i4);
    }

    @Override // androidx.appcompat.app.c.a
    @o0
    /* renamed from: G0, reason: merged with bridge method [inline-methods] */
    public b M(@q0 View view) {
        return (b) super.M(view);
    }

    @q0
    public Drawable Q() {
        return this.f92839c;
    }

    @Override // androidx.appcompat.app.c.a
    @o0
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public b c(@q0 ListAdapter listAdapter, @q0 DialogInterface.OnClickListener onClickListener) {
        return (b) super.c(listAdapter, onClickListener);
    }

    @o0
    public b U(@q0 Drawable drawable) {
        this.f92839c = drawable;
        return this;
    }

    @o0
    public b V(@u0 int i4) {
        this.f92840d.bottom = i4;
        return this;
    }

    @o0
    public b W(@u0 int i4) {
        if (b().getResources().getConfiguration().getLayoutDirection() == 1) {
            this.f92840d.left = i4;
        } else {
            this.f92840d.right = i4;
        }
        return this;
    }

    @o0
    public b X(@u0 int i4) {
        if (b().getResources().getConfiguration().getLayoutDirection() == 1) {
            this.f92840d.right = i4;
        } else {
            this.f92840d.left = i4;
        }
        return this;
    }

    @o0
    public b Y(@u0 int i4) {
        this.f92840d.top = i4;
        return this;
    }

    @Override // androidx.appcompat.app.c.a
    @o0
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public b d(boolean z4) {
        return (b) super.d(z4);
    }

    @Override // androidx.appcompat.app.c.a
    @o0
    public androidx.appcompat.app.c a() {
        androidx.appcompat.app.c a5 = super.a();
        Window window = a5.getWindow();
        View decorView = window.getDecorView();
        Drawable drawable = this.f92839c;
        if (drawable instanceof j) {
            ((j) drawable).o0(x1.T(decorView));
        }
        window.setBackgroundDrawable(c.b(this.f92839c, this.f92840d));
        decorView.setOnTouchListener(new a(a5, this.f92840d));
        return a5;
    }

    @Override // androidx.appcompat.app.c.a
    @o0
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public b e(@q0 Cursor cursor, @q0 DialogInterface.OnClickListener onClickListener, @o0 String str) {
        return (b) super.e(cursor, onClickListener, str);
    }

    @Override // androidx.appcompat.app.c.a
    @o0
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public b f(@q0 View view) {
        return (b) super.f(view);
    }

    @Override // androidx.appcompat.app.c.a
    @o0
    /* renamed from: c0, reason: merged with bridge method [inline-methods] */
    public b g(@v int i4) {
        return (b) super.g(i4);
    }

    @Override // androidx.appcompat.app.c.a
    @o0
    /* renamed from: d0, reason: merged with bridge method [inline-methods] */
    public b h(@q0 Drawable drawable) {
        return (b) super.h(drawable);
    }

    @Override // androidx.appcompat.app.c.a
    @o0
    /* renamed from: e0, reason: merged with bridge method [inline-methods] */
    public b i(@f int i4) {
        return (b) super.i(i4);
    }

    @Override // androidx.appcompat.app.c.a
    @o0
    /* renamed from: f0, reason: merged with bridge method [inline-methods] */
    public b k(@e int i4, @q0 DialogInterface.OnClickListener onClickListener) {
        return (b) super.k(i4, onClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    @o0
    /* renamed from: g0, reason: merged with bridge method [inline-methods] */
    public b l(@q0 CharSequence[] charSequenceArr, @q0 DialogInterface.OnClickListener onClickListener) {
        return (b) super.l(charSequenceArr, onClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    @o0
    /* renamed from: h0, reason: merged with bridge method [inline-methods] */
    public b m(@g1 int i4) {
        return (b) super.m(i4);
    }

    @Override // androidx.appcompat.app.c.a
    @o0
    /* renamed from: i0, reason: merged with bridge method [inline-methods] */
    public b n(@q0 CharSequence charSequence) {
        return (b) super.n(charSequence);
    }

    @Override // androidx.appcompat.app.c.a
    @o0
    /* renamed from: j0, reason: merged with bridge method [inline-methods] */
    public b o(@e int i4, @q0 boolean[] zArr, @q0 DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (b) super.o(i4, zArr, onMultiChoiceClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    @o0
    /* renamed from: k0, reason: merged with bridge method [inline-methods] */
    public b p(@q0 Cursor cursor, @o0 String str, @o0 String str2, @q0 DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (b) super.p(cursor, str, str2, onMultiChoiceClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    @o0
    /* renamed from: l0, reason: merged with bridge method [inline-methods] */
    public b q(@q0 CharSequence[] charSequenceArr, @q0 boolean[] zArr, @q0 DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (b) super.q(charSequenceArr, zArr, onMultiChoiceClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    @o0
    /* renamed from: m0, reason: merged with bridge method [inline-methods] */
    public b r(@g1 int i4, @q0 DialogInterface.OnClickListener onClickListener) {
        return (b) super.r(i4, onClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    @o0
    /* renamed from: n0, reason: merged with bridge method [inline-methods] */
    public b s(@q0 CharSequence charSequence, @q0 DialogInterface.OnClickListener onClickListener) {
        return (b) super.s(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    @o0
    /* renamed from: o0, reason: merged with bridge method [inline-methods] */
    public b t(@q0 Drawable drawable) {
        return (b) super.t(drawable);
    }

    @Override // androidx.appcompat.app.c.a
    @o0
    /* renamed from: p0, reason: merged with bridge method [inline-methods] */
    public b u(@g1 int i4, @q0 DialogInterface.OnClickListener onClickListener) {
        return (b) super.u(i4, onClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    @o0
    /* renamed from: q0, reason: merged with bridge method [inline-methods] */
    public b v(@q0 CharSequence charSequence, @q0 DialogInterface.OnClickListener onClickListener) {
        return (b) super.v(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    @o0
    /* renamed from: r0, reason: merged with bridge method [inline-methods] */
    public b w(@q0 Drawable drawable) {
        return (b) super.w(drawable);
    }

    @Override // androidx.appcompat.app.c.a
    @o0
    /* renamed from: s0, reason: merged with bridge method [inline-methods] */
    public b x(@q0 DialogInterface.OnCancelListener onCancelListener) {
        return (b) super.x(onCancelListener);
    }

    @Override // androidx.appcompat.app.c.a
    @o0
    /* renamed from: t0, reason: merged with bridge method [inline-methods] */
    public b y(@q0 DialogInterface.OnDismissListener onDismissListener) {
        return (b) super.y(onDismissListener);
    }

    @Override // androidx.appcompat.app.c.a
    @o0
    /* renamed from: u0, reason: merged with bridge method [inline-methods] */
    public b z(@q0 AdapterView.OnItemSelectedListener onItemSelectedListener) {
        return (b) super.z(onItemSelectedListener);
    }

    @Override // androidx.appcompat.app.c.a
    @o0
    /* renamed from: v0, reason: merged with bridge method [inline-methods] */
    public b A(@q0 DialogInterface.OnKeyListener onKeyListener) {
        return (b) super.A(onKeyListener);
    }

    @Override // androidx.appcompat.app.c.a
    @o0
    /* renamed from: w0, reason: merged with bridge method [inline-methods] */
    public b B(@g1 int i4, @q0 DialogInterface.OnClickListener onClickListener) {
        return (b) super.B(i4, onClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    @o0
    /* renamed from: x0, reason: merged with bridge method [inline-methods] */
    public b C(@q0 CharSequence charSequence, @q0 DialogInterface.OnClickListener onClickListener) {
        return (b) super.C(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    @o0
    /* renamed from: y0, reason: merged with bridge method [inline-methods] */
    public b D(@q0 Drawable drawable) {
        return (b) super.D(drawable);
    }

    @Override // androidx.appcompat.app.c.a
    @o0
    /* renamed from: z0, reason: merged with bridge method [inline-methods] */
    public b F(@e int i4, int i5, @q0 DialogInterface.OnClickListener onClickListener) {
        return (b) super.F(i4, i5, onClickListener);
    }

    public b(@o0 Context context, int i4) {
        super(P(context), S(context, i4));
        Context b5 = b();
        Resources.Theme theme = b5.getTheme();
        int i5 = f92836e;
        int i6 = f92837f;
        this.f92840d = c.a(b5, i5, i6);
        int g4 = com.google.android.material.resources.b.g(b5, a.c.P2, getClass().getCanonicalName());
        j jVar = new j(b5, null, i5, i6);
        jVar.a0(b5);
        jVar.p0(ColorStateList.valueOf(g4));
        if (Build.VERSION.SDK_INT >= 28) {
            TypedValue typedValue = new TypedValue();
            theme.resolveAttribute(R.attr.dialogCornerRadius, typedValue, true);
            float dimension = typedValue.getDimension(b().getResources().getDisplayMetrics());
            if (typedValue.type == 5 && dimension >= 0.0f) {
                jVar.l0(dimension);
            }
        }
        this.f92839c = jVar;
    }
}
