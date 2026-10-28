package q1;

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
import androidx.core.view.y1;
import com.google.android.material.shape.j;
import n1.a;

/* compiled from: MaterialAlertDialogBuilder.java */
/* loaded from: classes3.dex */
public class b extends c.a {

    /* renamed from: e, reason: collision with root package name */
    @f
    private static final int f32528e = a.c.L;

    /* renamed from: f, reason: collision with root package name */
    @h1
    private static final int f32529f = a.n.f30144y3;

    /* renamed from: g, reason: collision with root package name */
    @f
    private static final int f32530g = a.c.r9;

    /* renamed from: c, reason: collision with root package name */
    @q0
    private Drawable f32531c;

    /* renamed from: d, reason: collision with root package name */
    @o0
    @r
    private final Rect f32532d;

    public b(@o0 Context context) {
        this(context, 0);
    }

    private static Context P(@o0 Context context) {
        int R = R(context);
        Context c6 = v1.a.c(context, null, f32528e, f32529f);
        return R == 0 ? c6 : new d(c6, R);
    }

    private static int R(@o0 Context context) {
        TypedValue a6 = com.google.android.material.resources.b.a(context, f32530g);
        if (a6 == null) {
            return 0;
        }
        return a6.data;
    }

    private static int S(@o0 Context context, int i5) {
        return i5 == 0 ? R(context) : i5;
    }

    @Override // androidx.appcompat.app.c.a
    @o0
    /* renamed from: A0, reason: merged with bridge method [inline-methods] */
    public b G(@q0 Cursor cursor, int i5, @o0 String str, @q0 DialogInterface.OnClickListener onClickListener) {
        return (b) super.G(cursor, i5, str, onClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    @o0
    /* renamed from: B0, reason: merged with bridge method [inline-methods] */
    public b H(@q0 ListAdapter listAdapter, int i5, @q0 DialogInterface.OnClickListener onClickListener) {
        return (b) super.H(listAdapter, i5, onClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    @o0
    /* renamed from: C0, reason: merged with bridge method [inline-methods] */
    public b I(@q0 CharSequence[] charSequenceArr, int i5, @q0 DialogInterface.OnClickListener onClickListener) {
        return (b) super.I(charSequenceArr, i5, onClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    @o0
    /* renamed from: D0, reason: merged with bridge method [inline-methods] */
    public b J(@g1 int i5) {
        return (b) super.J(i5);
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
    public b L(int i5) {
        return (b) super.L(i5);
    }

    @Override // androidx.appcompat.app.c.a
    @o0
    /* renamed from: G0, reason: merged with bridge method [inline-methods] */
    public b M(@q0 View view) {
        return (b) super.M(view);
    }

    @q0
    public Drawable Q() {
        return this.f32531c;
    }

    @Override // androidx.appcompat.app.c.a
    @o0
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public b c(@q0 ListAdapter listAdapter, @q0 DialogInterface.OnClickListener onClickListener) {
        return (b) super.c(listAdapter, onClickListener);
    }

    @o0
    public b U(@q0 Drawable drawable) {
        this.f32531c = drawable;
        return this;
    }

    @o0
    public b V(@u0 int i5) {
        this.f32532d.bottom = i5;
        return this;
    }

    @o0
    public b W(@u0 int i5) {
        if (b().getResources().getConfiguration().getLayoutDirection() == 1) {
            this.f32532d.left = i5;
        } else {
            this.f32532d.right = i5;
        }
        return this;
    }

    @o0
    public b X(@u0 int i5) {
        if (b().getResources().getConfiguration().getLayoutDirection() == 1) {
            this.f32532d.right = i5;
        } else {
            this.f32532d.left = i5;
        }
        return this;
    }

    @o0
    public b Y(@u0 int i5) {
        this.f32532d.top = i5;
        return this;
    }

    @Override // androidx.appcompat.app.c.a
    @o0
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public b d(boolean z5) {
        return (b) super.d(z5);
    }

    @Override // androidx.appcompat.app.c.a
    @o0
    public androidx.appcompat.app.c a() {
        androidx.appcompat.app.c a6 = super.a();
        Window window = a6.getWindow();
        View decorView = window.getDecorView();
        Drawable drawable = this.f32531c;
        if (drawable instanceof j) {
            ((j) drawable).o0(y1.R(decorView));
        }
        window.setBackgroundDrawable(c.b(this.f32531c, this.f32532d));
        decorView.setOnTouchListener(new a(a6, this.f32532d));
        return a6;
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
    public b g(@v int i5) {
        return (b) super.g(i5);
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
    public b i(@f int i5) {
        return (b) super.i(i5);
    }

    @Override // androidx.appcompat.app.c.a
    @o0
    /* renamed from: f0, reason: merged with bridge method [inline-methods] */
    public b k(@e int i5, @q0 DialogInterface.OnClickListener onClickListener) {
        return (b) super.k(i5, onClickListener);
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
    public b m(@g1 int i5) {
        return (b) super.m(i5);
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
    public b o(@e int i5, @q0 boolean[] zArr, @q0 DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (b) super.o(i5, zArr, onMultiChoiceClickListener);
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
    public b r(@g1 int i5, @q0 DialogInterface.OnClickListener onClickListener) {
        return (b) super.r(i5, onClickListener);
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
    public b u(@g1 int i5, @q0 DialogInterface.OnClickListener onClickListener) {
        return (b) super.u(i5, onClickListener);
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
    public b B(@g1 int i5, @q0 DialogInterface.OnClickListener onClickListener) {
        return (b) super.B(i5, onClickListener);
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
    public b F(@e int i5, int i6, @q0 DialogInterface.OnClickListener onClickListener) {
        return (b) super.F(i5, i6, onClickListener);
    }

    public b(@o0 Context context, int i5) {
        super(P(context), S(context, i5));
        Context b6 = b();
        Resources.Theme theme = b6.getTheme();
        int i6 = f32528e;
        int i7 = f32529f;
        this.f32532d = c.a(b6, i6, i7);
        int g5 = com.google.android.material.resources.b.g(b6, a.c.Q2, getClass().getCanonicalName());
        j jVar = new j(b6, null, i6, i7);
        jVar.a0(b6);
        jVar.p0(ColorStateList.valueOf(g5));
        if (Build.VERSION.SDK_INT >= 28) {
            TypedValue typedValue = new TypedValue();
            theme.resolveAttribute(R.attr.dialogCornerRadius, typedValue, true);
            float dimension = typedValue.getDimension(b().getResources().getDisplayMetrics());
            if (typedValue.type == 5 && dimension >= 0.0f) {
                jVar.l0(dimension);
            }
        }
        this.f32531c = jVar;
    }
}
