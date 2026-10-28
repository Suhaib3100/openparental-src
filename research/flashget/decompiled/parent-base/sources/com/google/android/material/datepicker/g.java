package com.google.android.material.datepicker;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.c1;
import androidx.annotation.g1;
import androidx.annotation.h1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.core.graphics.y;
import androidx.core.util.s;
import androidx.core.view.x1;
import androidx.fragment.app.l0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.internal.CheckableImageButton;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;
import s8.a;

/* compiled from: MaterialDatePicker.java */
/* loaded from: classes6.dex */
public final class g<S> extends androidx.fragment.app.e {
    public static final int B = 0;
    public static final int C = 1;

    /* renamed from: b, reason: collision with root package name */
    private final LinkedHashSet<h<? super S>> f53160b = new LinkedHashSet<>();

    /* renamed from: c, reason: collision with root package name */
    private final LinkedHashSet<View.OnClickListener> f53161c = new LinkedHashSet<>();

    /* renamed from: d, reason: collision with root package name */
    private final LinkedHashSet<DialogInterface.OnCancelListener> f53162d = new LinkedHashSet<>();

    /* renamed from: e, reason: collision with root package name */
    private final LinkedHashSet<DialogInterface.OnDismissListener> f53163e = new LinkedHashSet<>();

    /* renamed from: f, reason: collision with root package name */
    @h1
    private int f53164f;

    /* renamed from: g, reason: collision with root package name */
    @q0
    private DateSelector<S> f53165g;

    /* renamed from: h, reason: collision with root package name */
    private n<S> f53166h;

    /* renamed from: i, reason: collision with root package name */
    @q0
    private CalendarConstraints f53167i;

    /* renamed from: j, reason: collision with root package name */
    private com.google.android.material.datepicker.f<S> f53168j;

    /* renamed from: k, reason: collision with root package name */
    @g1
    private int f53169k;

    /* renamed from: l, reason: collision with root package name */
    private CharSequence f53170l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f53171m;

    /* renamed from: n, reason: collision with root package name */
    private int f53172n;

    /* renamed from: o, reason: collision with root package name */
    private TextView f53173o;

    /* renamed from: p, reason: collision with root package name */
    private CheckableImageButton f53174p;

    /* renamed from: q, reason: collision with root package name */
    @q0
    private com.google.android.material.shape.j f53175q;

    /* renamed from: r, reason: collision with root package name */
    private Button f53176r;

    /* renamed from: s, reason: collision with root package name */
    private static final String f53152s = ProtectedSandApp.s("\uf1a3");

    /* renamed from: t, reason: collision with root package name */
    private static final String f53153t = ProtectedSandApp.s("\uf1a4");

    /* renamed from: u, reason: collision with root package name */
    private static final String f53154u = ProtectedSandApp.s("\uf1a5");

    /* renamed from: v, reason: collision with root package name */
    private static final String f53155v = ProtectedSandApp.s("\uf1a6");

    /* renamed from: w, reason: collision with root package name */
    private static final String f53156w = ProtectedSandApp.s("\uf1a7");

    /* renamed from: x, reason: collision with root package name */
    private static final String f53157x = ProtectedSandApp.s("\uf1a8");

    /* renamed from: y, reason: collision with root package name */
    static final Object f53158y = ProtectedSandApp.s("\uf1a9");

    /* renamed from: z, reason: collision with root package name */
    static final Object f53159z = ProtectedSandApp.s("\uf1aa");
    static final Object A = ProtectedSandApp.s("\uf1ab");

    /* compiled from: MaterialDatePicker.java */
    class a implements View.OnClickListener {
        a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = g.this.f53160b.iterator();
            while (it.hasNext()) {
                ((h) it.next()).a(g.this.H());
            }
            g.this.dismiss();
        }
    }

    /* compiled from: MaterialDatePicker.java */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = g.this.f53161c.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            g.this.dismiss();
        }
    }

    /* compiled from: MaterialDatePicker.java */
    class c extends m<S> {
        c() {
        }

        @Override // com.google.android.material.datepicker.m
        public void a() {
            g.this.f53176r.setEnabled(false);
        }

        @Override // com.google.android.material.datepicker.m
        public void b(S s4) {
            g.this.V();
            g.this.f53176r.setEnabled(g.this.f53165g.i3());
        }
    }

    /* compiled from: MaterialDatePicker.java */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            g.this.f53176r.setEnabled(g.this.f53165g.i3());
            g.this.f53174p.toggle();
            g gVar = g.this;
            gVar.W(gVar.f53174p);
            g.this.S();
        }
    }

    /* compiled from: MaterialDatePicker.java */
    public static final class e<S> {

        /* renamed from: a, reason: collision with root package name */
        final DateSelector<S> f53181a;

        /* renamed from: c, reason: collision with root package name */
        CalendarConstraints f53183c;

        /* renamed from: b, reason: collision with root package name */
        int f53182b = 0;

        /* renamed from: d, reason: collision with root package name */
        int f53184d = 0;

        /* renamed from: e, reason: collision with root package name */
        CharSequence f53185e = null;

        /* renamed from: f, reason: collision with root package name */
        @q0
        S f53186f = null;

        /* renamed from: g, reason: collision with root package name */
        int f53187g = 0;

        private e(DateSelector<S> dateSelector) {
            this.f53181a = dateSelector;
        }

        private Month b() {
            long j4 = this.f53183c.k().f53066g;
            long j5 = this.f53183c.g().f53066g;
            if (!this.f53181a.j3().isEmpty()) {
                long longValue = this.f53181a.j3().iterator().next().longValue();
                if (longValue >= j4 && longValue <= j5) {
                    return Month.c(longValue);
                }
            }
            long T = g.T();
            if (j4 <= T && T <= j5) {
                j4 = T;
            }
            return Month.c(j4);
        }

        @c1({c1.a.LIBRARY_GROUP})
        @o0
        public static <S> e<S> c(@o0 DateSelector<S> dateSelector) {
            return new e<>(dateSelector);
        }

        @o0
        public static e<Long> d() {
            return new e<>(new SingleDateSelector());
        }

        @o0
        public static e<s<Long, Long>> e() {
            return new e<>(new RangeDateSelector());
        }

        @o0
        public g<S> a() {
            if (this.f53183c == null) {
                this.f53183c = new CalendarConstraints.b().a();
            }
            if (this.f53184d == 0) {
                this.f53184d = this.f53181a.S();
            }
            S s4 = this.f53186f;
            if (s4 != null) {
                this.f53181a.l2(s4);
            }
            if (this.f53183c.j() == null) {
                this.f53183c.p(b());
            }
            return g.M(this);
        }

        @o0
        public e<S> f(CalendarConstraints calendarConstraints) {
            this.f53183c = calendarConstraints;
            return this;
        }

        @o0
        public e<S> g(int i4) {
            this.f53187g = i4;
            return this;
        }

        @o0
        public e<S> h(S s4) {
            this.f53186f = s4;
            return this;
        }

        @o0
        public e<S> i(@h1 int i4) {
            this.f53182b = i4;
            return this;
        }

        @o0
        public e<S> j(@g1 int i4) {
            this.f53184d = i4;
            this.f53185e = null;
            return this;
        }

        @o0
        public e<S> k(@q0 CharSequence charSequence) {
            this.f53185e = charSequence;
            this.f53184d = 0;
            return this;
        }
    }

    /* compiled from: MaterialDatePicker.java */
    @c1({c1.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface f {
    }

    @o0
    private static Drawable D(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, e.a.b(context, a.g.S0));
        stateListDrawable.addState(new int[0], e.a.b(context, a.g.U0));
        return stateListDrawable;
    }

    private static int E(@o0 Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(a.f.Y3) + resources.getDimensionPixelOffset(a.f.f90771a4) + resources.getDimensionPixelSize(a.f.Z3);
        int dimensionPixelSize = resources.getDimensionPixelSize(a.f.J3);
        int i4 = k.f53199g;
        return dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(a.f.X3) * (i4 - 1)) + (resources.getDimensionPixelSize(a.f.E3) * i4) + resources.getDimensionPixelOffset(a.f.B3);
    }

    private static int G(@o0 Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(a.f.C3);
        int i4 = Month.d().f53064e;
        return y.a(i4, 1, resources.getDimensionPixelOffset(a.f.W3), (resources.getDimensionPixelSize(a.f.I3) * i4) + (dimensionPixelOffset * 2));
    }

    private int I(Context context) {
        int i4 = this.f53164f;
        return i4 != 0 ? i4 : this.f53165g.e1(context);
    }

    private void J(Context context) {
        this.f53174p.setTag(A);
        this.f53174p.setImageDrawable(D(context));
        this.f53174p.setChecked(this.f53172n != 0);
        x1.H1(this.f53174p, null);
        W(this.f53174p);
        this.f53174p.setOnClickListener(new d());
    }

    static boolean K(@o0 Context context) {
        return N(context, R.attr.windowFullscreen);
    }

    static boolean L(@o0 Context context) {
        return N(context, a.c.Ra);
    }

    @o0
    static <S> g<S> M(@o0 e<S> eVar) {
        g<S> gVar = new g<>();
        Bundle bundle = new Bundle();
        bundle.putInt(ProtectedSandApp.s("\uf1a3"), eVar.f53182b);
        bundle.putParcelable(ProtectedSandApp.s("\uf1a4"), eVar.f53181a);
        bundle.putParcelable(ProtectedSandApp.s("\uf1a5"), eVar.f53183c);
        bundle.putInt(ProtectedSandApp.s("\uf1a6"), eVar.f53184d);
        bundle.putCharSequence(ProtectedSandApp.s("\uf1a7"), eVar.f53185e);
        bundle.putInt(ProtectedSandApp.s("\uf1a8"), eVar.f53187g);
        gVar.setArguments(bundle);
        return gVar;
    }

    static boolean N(@o0 Context context, int i4) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(com.google.android.material.resources.b.g(context, a.c.I9, com.google.android.material.datepicker.f.class.getCanonicalName()), new int[]{i4});
        boolean z4 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S() {
        int I = I(requireContext());
        this.f53168j = com.google.android.material.datepicker.f.F(this.f53165g, I, this.f53167i);
        this.f53166h = this.f53174p.isChecked() ? j.r(this.f53165g, I, this.f53167i) : this.f53168j;
        V();
        l0 u4 = getChildFragmentManager().u();
        u4.D(a.h.U2, this.f53166h);
        u4.t();
        this.f53166h.n(new c());
    }

    public static long T() {
        return Month.d().f53066g;
    }

    public static long U() {
        return q.t().getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V() {
        String F = F();
        this.f53173o.setContentDescription(String.format(getString(a.m.f91243q0), F));
        this.f53173o.setText(F);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W(@o0 CheckableImageButton checkableImageButton) {
        this.f53174p.setContentDescription(this.f53174p.isChecked() ? checkableImageButton.getContext().getString(a.m.P0) : checkableImageButton.getContext().getString(a.m.R0));
    }

    public void A() {
        this.f53163e.clear();
    }

    public void B() {
        this.f53161c.clear();
    }

    public void C() {
        this.f53160b.clear();
    }

    public String F() {
        return this.f53165g.e2(getContext());
    }

    @q0
    public final S H() {
        return this.f53165g.getSelection();
    }

    public boolean O(DialogInterface.OnCancelListener onCancelListener) {
        return this.f53162d.remove(onCancelListener);
    }

    public boolean P(DialogInterface.OnDismissListener onDismissListener) {
        return this.f53163e.remove(onDismissListener);
    }

    public boolean Q(View.OnClickListener onClickListener) {
        return this.f53161c.remove(onClickListener);
    }

    public boolean R(h<? super S> hVar) {
        return this.f53160b.remove(hVar);
    }

    @Override // androidx.fragment.app.e, android.content.DialogInterface.OnCancelListener
    public final void onCancel(@o0 DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.f53162d.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public final void onCreate(@q0 Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f53164f = bundle.getInt(ProtectedSandApp.s("\uf1a3"));
        this.f53165g = (DateSelector) bundle.getParcelable(ProtectedSandApp.s("\uf1a4"));
        this.f53167i = (CalendarConstraints) bundle.getParcelable(ProtectedSandApp.s("\uf1a5"));
        this.f53169k = bundle.getInt(ProtectedSandApp.s("\uf1a6"));
        this.f53170l = bundle.getCharSequence(ProtectedSandApp.s("\uf1a7"));
        this.f53172n = bundle.getInt(ProtectedSandApp.s("\uf1a8"));
    }

    @Override // androidx.fragment.app.e
    @o0
    public final Dialog onCreateDialog(@q0 Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), I(requireContext()));
        Context context = dialog.getContext();
        this.f53171m = N(context, R.attr.windowFullscreen);
        int g4 = com.google.android.material.resources.b.g(context, a.c.P2, g.class.getCanonicalName());
        com.google.android.material.shape.j jVar = new com.google.android.material.shape.j(context, null, a.c.I9, a.n.Eb);
        this.f53175q = jVar;
        jVar.a0(context);
        this.f53175q.p0(ColorStateList.valueOf(g4));
        this.f53175q.o0(x1.T(dialog.getWindow().getDecorView()));
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    @o0
    public final View onCreateView(@o0 LayoutInflater layoutInflater, @q0 ViewGroup viewGroup, @q0 Bundle bundle) {
        View inflate = layoutInflater.inflate(this.f53171m ? a.k.B0 : a.k.A0, viewGroup);
        Context context = inflate.getContext();
        if (this.f53171m) {
            inflate.findViewById(a.h.U2).setLayoutParams(new LinearLayout.LayoutParams(G(context), -2));
        } else {
            View findViewById = inflate.findViewById(a.h.V2);
            View findViewById2 = inflate.findViewById(a.h.U2);
            findViewById.setLayoutParams(new LinearLayout.LayoutParams(G(context), -1));
            findViewById2.setMinimumHeight(E(requireContext()));
        }
        TextView textView = (TextView) inflate.findViewById(a.h.f91016g3);
        this.f53173o = textView;
        x1.J1(textView, 1);
        this.f53174p = (CheckableImageButton) inflate.findViewById(a.h.f91026i3);
        TextView textView2 = (TextView) inflate.findViewById(a.h.f91046m3);
        CharSequence charSequence = this.f53170l;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.f53169k);
        }
        J(context);
        this.f53176r = (Button) inflate.findViewById(a.h.P0);
        if (this.f53165g.i3()) {
            this.f53176r.setEnabled(true);
        } else {
            this.f53176r.setEnabled(false);
        }
        this.f53176r.setTag(f53158y);
        this.f53176r.setOnClickListener(new a());
        Button button = (Button) inflate.findViewById(a.h.B0);
        button.setTag(f53159z);
        button.setOnClickListener(new b());
        return inflate;
    }

    @Override // androidx.fragment.app.e, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@o0 DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.f53163e.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@o0 Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt(ProtectedSandApp.s("\uf1a3"), this.f53164f);
        bundle.putParcelable(ProtectedSandApp.s("\uf1a4"), this.f53165g);
        CalendarConstraints.b bVar = new CalendarConstraints.b(this.f53167i);
        if (this.f53168j.C() != null) {
            bVar.c(this.f53168j.C().f53066g);
        }
        bundle.putParcelable(ProtectedSandApp.s("\uf1a5"), bVar.a());
        bundle.putInt(ProtectedSandApp.s("\uf1a6"), this.f53169k);
        bundle.putCharSequence(ProtectedSandApp.s("\uf1a7"), this.f53170l);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.f53171m) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f53175q);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(a.f.K3);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f53175q, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new v8.a(requireDialog(), rect));
        }
        S();
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void onStop() {
        this.f53166h.o();
        super.onStop();
    }

    public boolean v(DialogInterface.OnCancelListener onCancelListener) {
        return this.f53162d.add(onCancelListener);
    }

    public boolean w(DialogInterface.OnDismissListener onDismissListener) {
        return this.f53163e.add(onDismissListener);
    }

    public boolean x(View.OnClickListener onClickListener) {
        return this.f53161c.add(onClickListener);
    }

    public boolean y(h<? super S> hVar) {
        return this.f53160b.add(hVar);
    }

    public void z() {
        this.f53162d.clear();
    }
}
