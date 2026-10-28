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
import androidx.core.view.y1;
import androidx.fragment.app.f0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.internal.CheckableImageButton;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;
import n1.a;

/* compiled from: MaterialDatePicker.java */
/* loaded from: classes4.dex */
public final class g<S> extends androidx.fragment.app.c {
    private static final String F = ProtectedSandApp.s("㌁");
    private static final String G = ProtectedSandApp.s("㌂");
    private static final String H = ProtectedSandApp.s("㌃");
    private static final String I = ProtectedSandApp.s("㌄");
    private static final String J = ProtectedSandApp.s("㌅");
    private static final String K = ProtectedSandApp.s("㌆");
    static final Object L = ProtectedSandApp.s("㌇");
    static final Object M = ProtectedSandApp.s("㌈");
    static final Object N = ProtectedSandApp.s("㌉");
    public static final int O = 0;
    public static final int P = 1;
    private int A;
    private TextView B;
    private CheckableImageButton C;

    @q0
    private com.google.android.material.shape.j D;
    private Button E;

    /* renamed from: o, reason: collision with root package name */
    private final LinkedHashSet<h<? super S>> f13389o = new LinkedHashSet<>();

    /* renamed from: p, reason: collision with root package name */
    private final LinkedHashSet<View.OnClickListener> f13390p = new LinkedHashSet<>();

    /* renamed from: q, reason: collision with root package name */
    private final LinkedHashSet<DialogInterface.OnCancelListener> f13391q = new LinkedHashSet<>();

    /* renamed from: r, reason: collision with root package name */
    private final LinkedHashSet<DialogInterface.OnDismissListener> f13392r = new LinkedHashSet<>();

    /* renamed from: s, reason: collision with root package name */
    @h1
    private int f13393s;

    /* renamed from: t, reason: collision with root package name */
    @q0
    private DateSelector<S> f13394t;

    /* renamed from: u, reason: collision with root package name */
    private n<S> f13395u;

    /* renamed from: v, reason: collision with root package name */
    @q0
    private CalendarConstraints f13396v;

    /* renamed from: w, reason: collision with root package name */
    private com.google.android.material.datepicker.f<S> f13397w;

    /* renamed from: x, reason: collision with root package name */
    @g1
    private int f13398x;

    /* renamed from: y, reason: collision with root package name */
    private CharSequence f13399y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f13400z;

    /* compiled from: MaterialDatePicker.java */
    /* loaded from: classes2.dex */
    class a implements View.OnClickListener {
        a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = g.this.f13389o.iterator();
            while (it.hasNext()) {
                ((h) it.next()).a(g.this.w());
            }
            g.this.dismiss();
        }
    }

    /* compiled from: MaterialDatePicker.java */
    /* loaded from: classes2.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = g.this.f13390p.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            g.this.dismiss();
        }
    }

    /* compiled from: MaterialDatePicker.java */
    /* loaded from: classes3.dex */
    class c extends m<S> {
        c() {
        }

        @Override // com.google.android.material.datepicker.m
        public void a() {
            g.this.E.setEnabled(false);
        }

        @Override // com.google.android.material.datepicker.m
        public void b(S s5) {
            g.this.K();
            g.this.E.setEnabled(g.this.f13394t.F0());
        }
    }

    /* compiled from: MaterialDatePicker.java */
    /* loaded from: classes2.dex */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            g.this.E.setEnabled(g.this.f13394t.F0());
            g.this.C.toggle();
            g gVar = g.this;
            gVar.L(gVar.C);
            g.this.H();
        }
    }

    /* compiled from: MaterialDatePicker.java */
    /* loaded from: classes2.dex */
    public static final class e<S> {

        /* renamed from: a, reason: collision with root package name */
        final DateSelector<S> f13405a;

        /* renamed from: c, reason: collision with root package name */
        CalendarConstraints f13407c;

        /* renamed from: b, reason: collision with root package name */
        int f13406b = 0;

        /* renamed from: d, reason: collision with root package name */
        int f13408d = 0;

        /* renamed from: e, reason: collision with root package name */
        CharSequence f13409e = null;

        /* renamed from: f, reason: collision with root package name */
        @q0
        S f13410f = null;

        /* renamed from: g, reason: collision with root package name */
        int f13411g = 0;

        private e(DateSelector<S> dateSelector) {
            this.f13405a = dateSelector;
        }

        private Month b() {
            long j5 = this.f13407c.j().f13313t;
            long j6 = this.f13407c.g().f13313t;
            if (!this.f13405a.M0().isEmpty()) {
                long longValue = this.f13405a.M0().iterator().next().longValue();
                if (longValue >= j5 && longValue <= j6) {
                    return Month.j(longValue);
                }
            }
            long I = g.I();
            if (j5 <= I && I <= j6) {
                j5 = I;
            }
            return Month.j(j5);
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
        public static e<androidx.core.util.m<Long, Long>> e() {
            return new e<>(new RangeDateSelector());
        }

        @o0
        public g<S> a() {
            if (this.f13407c == null) {
                this.f13407c = new CalendarConstraints.b().a();
            }
            if (this.f13408d == 0) {
                this.f13408d = this.f13405a.n0();
            }
            S s5 = this.f13410f;
            if (s5 != null) {
                this.f13405a.B(s5);
            }
            if (this.f13407c.i() == null) {
                this.f13407c.m(b());
            }
            return g.B(this);
        }

        @o0
        public e<S> f(CalendarConstraints calendarConstraints) {
            this.f13407c = calendarConstraints;
            return this;
        }

        @o0
        public e<S> g(int i5) {
            this.f13411g = i5;
            return this;
        }

        @o0
        public e<S> h(S s5) {
            this.f13410f = s5;
            return this;
        }

        @o0
        public e<S> i(@h1 int i5) {
            this.f13406b = i5;
            return this;
        }

        @o0
        public e<S> j(@g1 int i5) {
            this.f13408d = i5;
            this.f13409e = null;
            return this;
        }

        @o0
        public e<S> k(@q0 CharSequence charSequence) {
            this.f13409e = charSequence;
            this.f13408d = 0;
            return this;
        }
    }

    /* compiled from: MaterialDatePicker.java */
    @c1({c1.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface f {
    }

    static boolean A(@o0 Context context) {
        return C(context, a.c.Sa);
    }

    @o0
    static <S> g<S> B(@o0 e<S> eVar) {
        g<S> gVar = new g<>();
        Bundle bundle = new Bundle();
        bundle.putInt(ProtectedSandApp.s("㌊"), eVar.f13406b);
        bundle.putParcelable(ProtectedSandApp.s("㌋"), eVar.f13405a);
        bundle.putParcelable(ProtectedSandApp.s("㌌"), eVar.f13407c);
        bundle.putInt(ProtectedSandApp.s("㌍"), eVar.f13408d);
        bundle.putCharSequence(ProtectedSandApp.s("㌎"), eVar.f13409e);
        bundle.putInt(ProtectedSandApp.s("㌏"), eVar.f13411g);
        gVar.setArguments(bundle);
        return gVar;
    }

    static boolean C(@o0 Context context, int i5) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(com.google.android.material.resources.b.g(context, a.c.J9, com.google.android.material.datepicker.f.class.getCanonicalName()), new int[]{i5});
        boolean z5 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H() {
        int x5 = x(requireContext());
        this.f13397w = com.google.android.material.datepicker.f.u(this.f13394t, x5, this.f13396v);
        this.f13395u = this.C.isChecked() ? j.f(this.f13394t, x5, this.f13396v) : this.f13397w;
        K();
        f0 u5 = getChildFragmentManager().u();
        u5.y(a.h.U2, this.f13395u);
        u5.o();
        this.f13395u.a(new c());
    }

    public static long I() {
        return Month.l().f13313t;
    }

    public static long J() {
        return q.t().getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K() {
        String u5 = u();
        this.B.setContentDescription(String.format(getString(a.m.f29971q0), u5));
        this.B.setText(u5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L(@o0 CheckableImageButton checkableImageButton) {
        this.C.setContentDescription(this.C.isChecked() ? checkableImageButton.getContext().getString(a.m.P0) : checkableImageButton.getContext().getString(a.m.R0));
    }

    @o0
    private static Drawable s(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, androidx.appcompat.content.res.a.d(context, a.g.S0));
        stateListDrawable.addState(new int[0], androidx.appcompat.content.res.a.d(context, a.g.U0));
        return stateListDrawable;
    }

    private static int t(@o0 Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(a.f.Y3) + resources.getDimensionPixelOffset(a.f.f29443a4) + resources.getDimensionPixelSize(a.f.Z3);
        int dimensionPixelSize = resources.getDimensionPixelSize(a.f.J3);
        int i5 = k.f13423t;
        return dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(a.f.X3) * (i5 - 1)) + (resources.getDimensionPixelSize(a.f.E3) * i5) + resources.getDimensionPixelOffset(a.f.B3);
    }

    private static int v(@o0 Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(a.f.C3);
        int i5 = Month.l().f13311r;
        return ((i5 - 1) * resources.getDimensionPixelOffset(a.f.W3)) + (resources.getDimensionPixelSize(a.f.I3) * i5) + (dimensionPixelOffset * 2);
    }

    private int x(Context context) {
        int i5 = this.f13393s;
        return i5 != 0 ? i5 : this.f13394t.A0(context);
    }

    private void y(Context context) {
        this.C.setTag(N);
        this.C.setImageDrawable(s(context));
        this.C.setChecked(this.A != 0);
        y1.B1(this.C, null);
        L(this.C);
        this.C.setOnClickListener(new d());
    }

    static boolean z(@o0 Context context) {
        return C(context, R.attr.windowFullscreen);
    }

    public boolean D(DialogInterface.OnCancelListener onCancelListener) {
        return this.f13391q.remove(onCancelListener);
    }

    public boolean E(DialogInterface.OnDismissListener onDismissListener) {
        return this.f13392r.remove(onDismissListener);
    }

    public boolean F(View.OnClickListener onClickListener) {
        return this.f13390p.remove(onClickListener);
    }

    public boolean G(h<? super S> hVar) {
        return this.f13389o.remove(hVar);
    }

    public boolean k(DialogInterface.OnCancelListener onCancelListener) {
        return this.f13391q.add(onCancelListener);
    }

    public boolean l(DialogInterface.OnDismissListener onDismissListener) {
        return this.f13392r.add(onDismissListener);
    }

    public boolean m(View.OnClickListener onClickListener) {
        return this.f13390p.add(onClickListener);
    }

    public boolean n(h<? super S> hVar) {
        return this.f13389o.add(hVar);
    }

    public void o() {
        this.f13391q.clear();
    }

    @Override // androidx.fragment.app.c, android.content.DialogInterface.OnCancelListener
    public final void onCancel(@o0 DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.f13391q.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.c, androidx.fragment.app.Fragment
    public final void onCreate(@q0 Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f13393s = bundle.getInt(ProtectedSandApp.s("㌐"));
        this.f13394t = (DateSelector) bundle.getParcelable(ProtectedSandApp.s("㌑"));
        this.f13396v = (CalendarConstraints) bundle.getParcelable(ProtectedSandApp.s("㌒"));
        this.f13398x = bundle.getInt(ProtectedSandApp.s("㌓"));
        this.f13399y = bundle.getCharSequence(ProtectedSandApp.s("㌔"));
        this.A = bundle.getInt(ProtectedSandApp.s("㌕"));
    }

    @Override // androidx.fragment.app.c
    @o0
    public final Dialog onCreateDialog(@q0 Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), x(requireContext()));
        Context context = dialog.getContext();
        this.f13400z = z(context);
        int g5 = com.google.android.material.resources.b.g(context, a.c.Q2, g.class.getCanonicalName());
        com.google.android.material.shape.j jVar = new com.google.android.material.shape.j(context, null, a.c.J9, a.n.Eb);
        this.D = jVar;
        jVar.a0(context);
        this.D.p0(ColorStateList.valueOf(g5));
        this.D.o0(y1.R(dialog.getWindow().getDecorView()));
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    @o0
    public final View onCreateView(@o0 LayoutInflater layoutInflater, @q0 ViewGroup viewGroup, @q0 Bundle bundle) {
        View inflate = layoutInflater.inflate(this.f13400z ? a.k.B0 : a.k.A0, viewGroup);
        Context context = inflate.getContext();
        if (this.f13400z) {
            inflate.findViewById(a.h.U2).setLayoutParams(new LinearLayout.LayoutParams(v(context), -2));
        } else {
            View findViewById = inflate.findViewById(a.h.V2);
            View findViewById2 = inflate.findViewById(a.h.U2);
            findViewById.setLayoutParams(new LinearLayout.LayoutParams(v(context), -1));
            findViewById2.setMinimumHeight(t(requireContext()));
        }
        TextView textView = (TextView) inflate.findViewById(a.h.f29724g3);
        this.B = textView;
        y1.D1(textView, 1);
        this.C = (CheckableImageButton) inflate.findViewById(a.h.f29736i3);
        TextView textView2 = (TextView) inflate.findViewById(a.h.f29760m3);
        CharSequence charSequence = this.f13399y;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.f13398x);
        }
        y(context);
        this.E = (Button) inflate.findViewById(a.h.P0);
        if (this.f13394t.F0()) {
            this.E.setEnabled(true);
        } else {
            this.E.setEnabled(false);
        }
        this.E.setTag(L);
        this.E.setOnClickListener(new a());
        Button button = (Button) inflate.findViewById(a.h.B0);
        button.setTag(M);
        button.setOnClickListener(new b());
        return inflate;
    }

    @Override // androidx.fragment.app.c, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@o0 DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.f13392r.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.c, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@o0 Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt(ProtectedSandApp.s("㌖"), this.f13393s);
        bundle.putParcelable(ProtectedSandApp.s("㌗"), this.f13394t);
        CalendarConstraints.b bVar = new CalendarConstraints.b(this.f13396v);
        if (this.f13397w.r() != null) {
            bVar.c(this.f13397w.r().f13313t);
        }
        bundle.putParcelable(ProtectedSandApp.s("㌘"), bVar.a());
        bundle.putInt(ProtectedSandApp.s("㌙"), this.f13398x);
        bundle.putCharSequence(ProtectedSandApp.s("㌚"), this.f13399y);
    }

    @Override // androidx.fragment.app.c, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.f13400z) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.D);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(a.f.K3);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.D, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new q1.a(requireDialog(), rect));
        }
        H();
    }

    @Override // androidx.fragment.app.c, androidx.fragment.app.Fragment
    public void onStop() {
        this.f13395u.b();
        super.onStop();
    }

    public void p() {
        this.f13392r.clear();
    }

    public void q() {
        this.f13390p.clear();
    }

    public void r() {
        this.f13389o.clear();
    }

    public String u() {
        return this.f13394t.o(getContext());
    }

    @q0
    public final S w() {
        return this.f13394t.U0();
    }
}
