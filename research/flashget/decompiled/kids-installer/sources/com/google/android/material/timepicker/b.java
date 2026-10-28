package com.google.android.material.timepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.g0;
import androidx.annotation.g1;
import androidx.annotation.h1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.v;
import androidx.appcompat.view.menu.s;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.shape.j;
import com.google.android.material.timepicker.TimePickerView;
import com.google.firebase.remoteconfig.x;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import n1.a;

/* compiled from: MaterialTimePicker.java */
/* loaded from: classes4.dex */
public final class b extends androidx.fragment.app.c {
    public static final int F = 0;
    public static final int G = 1;
    static final String H = ProtectedSandApp.s("㌼");
    static final String I = ProtectedSandApp.s("㌽");
    static final String J = ProtectedSandApp.s("㌾");
    static final String K = ProtectedSandApp.s("㌿");
    static final String L = ProtectedSandApp.s("㍀");
    private String A;
    private MaterialButton B;
    private TimeModel D;

    /* renamed from: s, reason: collision with root package name */
    private TimePickerView f14608s;

    /* renamed from: t, reason: collision with root package name */
    private ViewStub f14609t;

    /* renamed from: u, reason: collision with root package name */
    @q0
    private com.google.android.material.timepicker.e f14610u;

    /* renamed from: v, reason: collision with root package name */
    @q0
    private i f14611v;

    /* renamed from: w, reason: collision with root package name */
    @q0
    private g f14612w;

    /* renamed from: x, reason: collision with root package name */
    @v
    private int f14613x;

    /* renamed from: y, reason: collision with root package name */
    @v
    private int f14614y;

    /* renamed from: o, reason: collision with root package name */
    private final Set<View.OnClickListener> f14604o = new LinkedHashSet();

    /* renamed from: p, reason: collision with root package name */
    private final Set<View.OnClickListener> f14605p = new LinkedHashSet();

    /* renamed from: q, reason: collision with root package name */
    private final Set<DialogInterface.OnCancelListener> f14606q = new LinkedHashSet();

    /* renamed from: r, reason: collision with root package name */
    private final Set<DialogInterface.OnDismissListener> f14607r = new LinkedHashSet();

    /* renamed from: z, reason: collision with root package name */
    private int f14615z = 0;
    private int C = 0;
    private int E = 0;

    /* compiled from: MaterialTimePicker.java */
    /* loaded from: classes3.dex */
    class a implements TimePickerView.e {
        a() {
        }

        @Override // com.google.android.material.timepicker.TimePickerView.e
        public void a() {
            b.this.C = 1;
            b bVar = b.this;
            bVar.F(bVar.B);
            b.this.f14611v.i();
        }
    }

    /* compiled from: MaterialTimePicker.java */
    /* renamed from: com.google.android.material.timepicker.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class ViewOnClickListenerC0187b implements View.OnClickListener {
        ViewOnClickListenerC0187b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = b.this.f14604o.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            b.this.dismiss();
        }
    }

    /* compiled from: MaterialTimePicker.java */
    /* loaded from: classes2.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = b.this.f14605p.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            b.this.dismiss();
        }
    }

    /* compiled from: MaterialTimePicker.java */
    /* loaded from: classes2.dex */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b bVar = b.this;
            bVar.C = bVar.C == 0 ? 1 : 0;
            b bVar2 = b.this;
            bVar2.F(bVar2.B);
        }
    }

    /* compiled from: MaterialTimePicker.java */
    /* loaded from: classes2.dex */
    public static final class e {

        /* renamed from: b, reason: collision with root package name */
        private int f14621b;

        /* renamed from: d, reason: collision with root package name */
        private CharSequence f14623d;

        /* renamed from: a, reason: collision with root package name */
        private TimeModel f14620a = new TimeModel();

        /* renamed from: c, reason: collision with root package name */
        private int f14622c = 0;

        /* renamed from: e, reason: collision with root package name */
        private int f14624e = 0;

        @o0
        public b f() {
            return b.z(this);
        }

        @o0
        public e g(@g0(from = 0, to = 23) int i5) {
            this.f14620a.h(i5);
            return this;
        }

        @o0
        public e h(int i5) {
            this.f14621b = i5;
            return this;
        }

        @o0
        public e i(@g0(from = 0, to = 60) int i5) {
            this.f14620a.i(i5);
            return this;
        }

        @o0
        public e j(@h1 int i5) {
            this.f14624e = i5;
            return this;
        }

        @o0
        public e k(int i5) {
            TimeModel timeModel = this.f14620a;
            int i6 = timeModel.f14588r;
            int i7 = timeModel.f14589s;
            TimeModel timeModel2 = new TimeModel(i5);
            this.f14620a = timeModel2;
            timeModel2.i(i7);
            this.f14620a.h(i6);
            return this;
        }

        @o0
        public e l(@g1 int i5) {
            this.f14622c = i5;
            return this;
        }

        @o0
        public e m(@q0 CharSequence charSequence) {
            this.f14623d = charSequence;
            return this;
        }
    }

    private void E(@q0 Bundle bundle) {
        if (bundle == null) {
            return;
        }
        TimeModel timeModel = (TimeModel) bundle.getParcelable(ProtectedSandApp.s("㌬"));
        this.D = timeModel;
        if (timeModel == null) {
            this.D = new TimeModel();
        }
        this.C = bundle.getInt(ProtectedSandApp.s("㌭"), 0);
        this.f14615z = bundle.getInt(ProtectedSandApp.s("㌮"), 0);
        this.A = bundle.getString(ProtectedSandApp.s("㌯"));
        this.E = bundle.getInt(ProtectedSandApp.s("㌰"), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F(MaterialButton materialButton) {
        g gVar = this.f14612w;
        if (gVar != null) {
            gVar.g();
        }
        g y5 = y(this.C);
        this.f14612w = y5;
        y5.a();
        this.f14612w.invalidate();
        Pair<Integer, Integer> s5 = s(this.C);
        materialButton.R(((Integer) s5.first).intValue());
        materialButton.setContentDescription(getResources().getString(((Integer) s5.second).intValue()));
    }

    private Pair<Integer, Integer> s(int i5) {
        if (i5 == 0) {
            return new Pair<>(Integer.valueOf(this.f14613x), Integer.valueOf(a.m.f29957j0));
        }
        if (i5 == 1) {
            return new Pair<>(Integer.valueOf(this.f14614y), Integer.valueOf(a.m.f29947e0));
        }
        throw new IllegalArgumentException(s.a(ProtectedSandApp.s("㌱"), i5));
    }

    private int w() {
        int i5 = this.E;
        if (i5 != 0) {
            return i5;
        }
        TypedValue a6 = com.google.android.material.resources.b.a(requireContext(), a.c.R9);
        if (a6 == null) {
            return 0;
        }
        return a6.data;
    }

    private g y(int i5) {
        if (i5 != 0) {
            if (this.f14611v == null) {
                this.f14611v = new i((LinearLayout) this.f14609t.inflate(), this.D);
            }
            this.f14611v.e();
            return this.f14611v;
        }
        com.google.android.material.timepicker.e eVar = this.f14610u;
        if (eVar == null) {
            eVar = new com.google.android.material.timepicker.e(this.f14608s, this.D);
        }
        this.f14610u = eVar;
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @o0
    public static b z(@o0 e eVar) {
        b bVar = new b();
        Bundle bundle = new Bundle();
        bundle.putParcelable(ProtectedSandApp.s("㌲"), eVar.f14620a);
        bundle.putInt(ProtectedSandApp.s("㌳"), eVar.f14621b);
        bundle.putInt(ProtectedSandApp.s("㌴"), eVar.f14622c);
        bundle.putInt(ProtectedSandApp.s("㌵"), eVar.f14624e);
        if (eVar.f14623d != null) {
            bundle.putString(ProtectedSandApp.s("㌶"), eVar.f14623d.toString());
        }
        bVar.setArguments(bundle);
        return bVar;
    }

    public boolean A(@o0 DialogInterface.OnCancelListener onCancelListener) {
        return this.f14606q.remove(onCancelListener);
    }

    public boolean B(@o0 DialogInterface.OnDismissListener onDismissListener) {
        return this.f14607r.remove(onDismissListener);
    }

    public boolean C(@o0 View.OnClickListener onClickListener) {
        return this.f14605p.remove(onClickListener);
    }

    public boolean D(@o0 View.OnClickListener onClickListener) {
        return this.f14604o.remove(onClickListener);
    }

    public boolean k(@o0 DialogInterface.OnCancelListener onCancelListener) {
        return this.f14606q.add(onCancelListener);
    }

    public boolean l(@o0 DialogInterface.OnDismissListener onDismissListener) {
        return this.f14607r.add(onDismissListener);
    }

    public boolean m(@o0 View.OnClickListener onClickListener) {
        return this.f14605p.add(onClickListener);
    }

    public boolean n(@o0 View.OnClickListener onClickListener) {
        return this.f14604o.add(onClickListener);
    }

    public void o() {
        this.f14606q.clear();
    }

    @Override // androidx.fragment.app.c, android.content.DialogInterface.OnCancelListener
    public final void onCancel(@o0 DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.f14606q.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.c, androidx.fragment.app.Fragment
    public void onCreate(@q0 Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        E(bundle);
    }

    @Override // androidx.fragment.app.c
    @o0
    public final Dialog onCreateDialog(@q0 Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), w());
        Context context = dialog.getContext();
        int g5 = com.google.android.material.resources.b.g(context, a.c.Q2, b.class.getCanonicalName());
        int i5 = a.c.Q9;
        int i6 = a.n.Gc;
        j jVar = new j(context, null, i5, i6);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, a.o.Ck, i5, i6);
        this.f14614y = obtainStyledAttributes.getResourceId(a.o.Dk, 0);
        this.f14613x = obtainStyledAttributes.getResourceId(a.o.Ek, 0);
        obtainStyledAttributes.recycle();
        jVar.a0(context);
        jVar.p0(ColorStateList.valueOf(g5));
        Window window = dialog.getWindow();
        window.setBackgroundDrawable(jVar);
        window.requestFeature(1);
        window.setLayout(-2, -2);
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    @o0
    public final View onCreateView(@o0 LayoutInflater layoutInflater, @q0 ViewGroup viewGroup, @q0 Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(a.k.f29890e0, viewGroup);
        TimePickerView timePickerView = (TimePickerView) viewGroup2.findViewById(a.h.F2);
        this.f14608s = timePickerView;
        timePickerView.d0(new a());
        this.f14609t = (ViewStub) viewGroup2.findViewById(a.h.f29837z2);
        this.B = (MaterialButton) viewGroup2.findViewById(a.h.D2);
        TextView textView = (TextView) viewGroup2.findViewById(a.h.P1);
        if (!TextUtils.isEmpty(this.A)) {
            textView.setText(this.A);
        }
        int i5 = this.f14615z;
        if (i5 != 0) {
            textView.setText(i5);
        }
        F(this.B);
        ((Button) viewGroup2.findViewById(a.h.E2)).setOnClickListener(new ViewOnClickListenerC0187b());
        ((Button) viewGroup2.findViewById(a.h.A2)).setOnClickListener(new c());
        this.B.setOnClickListener(new d());
        return viewGroup2;
    }

    @Override // androidx.fragment.app.c, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@o0 DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.f14607r.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.c, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@o0 Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable(ProtectedSandApp.s("㌷"), this.D);
        bundle.putInt(ProtectedSandApp.s("㌸"), this.C);
        bundle.putInt(ProtectedSandApp.s("㌹"), this.f14615z);
        bundle.putString(ProtectedSandApp.s("㌺"), this.A);
        bundle.putInt(ProtectedSandApp.s("㌻"), this.E);
    }

    @Override // androidx.fragment.app.c, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.f14612w = null;
        this.f14610u = null;
        this.f14611v = null;
        this.f14608s = null;
    }

    public void p() {
        this.f14607r.clear();
    }

    public void q() {
        this.f14605p.clear();
    }

    public void r() {
        this.f14604o.clear();
    }

    @g0(from = 0, to = 23)
    public int t() {
        return this.D.f14588r % 24;
    }

    public int u() {
        return this.C;
    }

    @g0(from = 0, to = x.f18474m)
    public int v() {
        return this.D.f14589s;
    }

    @q0
    com.google.android.material.timepicker.e x() {
        return this.f14610u;
    }
}
