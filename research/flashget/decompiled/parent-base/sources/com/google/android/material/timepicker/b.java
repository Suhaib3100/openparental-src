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
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.shape.j;
import com.google.android.material.timepicker.TimePickerView;
import com.google.firebase.remoteconfig.x;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import s8.a;

/* compiled from: MaterialTimePicker.java */
/* loaded from: classes6.dex */
public final class b extends androidx.fragment.app.e {

    /* renamed from: s, reason: collision with root package name */
    public static final int f54441s = 0;

    /* renamed from: t, reason: collision with root package name */
    public static final int f54442t = 1;

    /* renamed from: u, reason: collision with root package name */
    static final String f54443u = ProtectedSandApp.s("\uf253");

    /* renamed from: v, reason: collision with root package name */
    static final String f54444v = ProtectedSandApp.s("\uf254");

    /* renamed from: w, reason: collision with root package name */
    static final String f54445w = ProtectedSandApp.s("\uf255");

    /* renamed from: x, reason: collision with root package name */
    static final String f54446x = ProtectedSandApp.s("\uf257");

    /* renamed from: y, reason: collision with root package name */
    static final String f54447y = ProtectedSandApp.s("\uf256");

    /* renamed from: f, reason: collision with root package name */
    private TimePickerView f54452f;

    /* renamed from: g, reason: collision with root package name */
    private ViewStub f54453g;

    /* renamed from: h, reason: collision with root package name */
    @q0
    private com.google.android.material.timepicker.e f54454h;

    /* renamed from: i, reason: collision with root package name */
    @q0
    private i f54455i;

    /* renamed from: j, reason: collision with root package name */
    @q0
    private g f54456j;

    /* renamed from: k, reason: collision with root package name */
    @v
    private int f54457k;

    /* renamed from: l, reason: collision with root package name */
    @v
    private int f54458l;

    /* renamed from: n, reason: collision with root package name */
    private String f54460n;

    /* renamed from: o, reason: collision with root package name */
    private MaterialButton f54461o;

    /* renamed from: q, reason: collision with root package name */
    private TimeModel f54463q;

    /* renamed from: b, reason: collision with root package name */
    private final Set<View.OnClickListener> f54448b = new LinkedHashSet();

    /* renamed from: c, reason: collision with root package name */
    private final Set<View.OnClickListener> f54449c = new LinkedHashSet();

    /* renamed from: d, reason: collision with root package name */
    private final Set<DialogInterface.OnCancelListener> f54450d = new LinkedHashSet();

    /* renamed from: e, reason: collision with root package name */
    private final Set<DialogInterface.OnDismissListener> f54451e = new LinkedHashSet();

    /* renamed from: m, reason: collision with root package name */
    private int f54459m = 0;

    /* renamed from: p, reason: collision with root package name */
    private int f54462p = 0;

    /* renamed from: r, reason: collision with root package name */
    private int f54464r = 0;

    /* compiled from: MaterialTimePicker.java */
    class a implements TimePickerView.e {
        a() {
        }

        @Override // com.google.android.material.timepicker.TimePickerView.e
        public void a() {
            b.this.f54462p = 1;
            b bVar = b.this;
            bVar.Q(bVar.f54461o);
            b.this.f54455i.i();
        }
    }

    /* compiled from: MaterialTimePicker.java */
    /* renamed from: com.google.android.material.timepicker.b$b, reason: collision with other inner class name */
    class ViewOnClickListenerC0821b implements View.OnClickListener {
        ViewOnClickListenerC0821b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = b.this.f54448b.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            b.this.dismiss();
        }
    }

    /* compiled from: MaterialTimePicker.java */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = b.this.f54449c.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            b.this.dismiss();
        }
    }

    /* compiled from: MaterialTimePicker.java */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b bVar = b.this;
            bVar.f54462p = bVar.f54462p == 0 ? 1 : 0;
            b bVar2 = b.this;
            bVar2.Q(bVar2.f54461o);
        }
    }

    /* compiled from: MaterialTimePicker.java */
    public static final class e {

        /* renamed from: b, reason: collision with root package name */
        private int f54470b;

        /* renamed from: d, reason: collision with root package name */
        private CharSequence f54472d;

        /* renamed from: a, reason: collision with root package name */
        private TimeModel f54469a = new TimeModel();

        /* renamed from: c, reason: collision with root package name */
        private int f54471c = 0;

        /* renamed from: e, reason: collision with root package name */
        private int f54473e = 0;

        @o0
        public b f() {
            return b.K(this);
        }

        @o0
        public e g(@g0(from = 0, to = 23) int i4) {
            this.f54469a.h(i4);
            return this;
        }

        @o0
        public e h(int i4) {
            this.f54470b = i4;
            return this;
        }

        @o0
        public e i(@g0(from = 0, to = 60) int i4) {
            this.f54469a.j(i4);
            return this;
        }

        @o0
        public e j(@h1 int i4) {
            this.f54473e = i4;
            return this;
        }

        @o0
        public e k(int i4) {
            TimeModel timeModel = this.f54469a;
            int i5 = timeModel.f54431e;
            int i6 = timeModel.f54432f;
            TimeModel timeModel2 = new TimeModel(i4);
            this.f54469a = timeModel2;
            timeModel2.j(i6);
            this.f54469a.h(i5);
            return this;
        }

        @o0
        public e l(@g1 int i4) {
            this.f54471c = i4;
            return this;
        }

        @o0
        public e m(@q0 CharSequence charSequence) {
            this.f54472d = charSequence;
            return this;
        }
    }

    private Pair<Integer, Integer> D(int i4) {
        if (i4 == 0) {
            return new Pair<>(Integer.valueOf(this.f54457k), Integer.valueOf(a.m.f91229j0));
        }
        if (i4 == 1) {
            return new Pair<>(Integer.valueOf(this.f54458l), Integer.valueOf(a.m.f91219e0));
        }
        throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("\uf252"), i4));
    }

    private int H() {
        int i4 = this.f54464r;
        if (i4 != 0) {
            return i4;
        }
        TypedValue a5 = com.google.android.material.resources.b.a(requireContext(), a.c.Q9);
        if (a5 == null) {
            return 0;
        }
        return a5.data;
    }

    private g J(int i4) {
        if (i4 != 0) {
            if (this.f54455i == null) {
                this.f54455i = new i((LinearLayout) this.f54453g.inflate(), this.f54463q);
            }
            this.f54455i.g();
            return this.f54455i;
        }
        com.google.android.material.timepicker.e eVar = this.f54454h;
        if (eVar == null) {
            eVar = new com.google.android.material.timepicker.e(this.f54452f, this.f54463q);
        }
        this.f54454h = eVar;
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @o0
    public static b K(@o0 e eVar) {
        b bVar = new b();
        Bundle bundle = new Bundle();
        bundle.putParcelable(ProtectedSandApp.s("\uf253"), eVar.f54469a);
        bundle.putInt(ProtectedSandApp.s("\uf254"), eVar.f54470b);
        bundle.putInt(ProtectedSandApp.s("\uf255"), eVar.f54471c);
        bundle.putInt(ProtectedSandApp.s("\uf256"), eVar.f54473e);
        if (eVar.f54472d != null) {
            bundle.putString(ProtectedSandApp.s("\uf257"), eVar.f54472d.toString());
        }
        bVar.setArguments(bundle);
        return bVar;
    }

    private void P(@q0 Bundle bundle) {
        if (bundle == null) {
            return;
        }
        TimeModel timeModel = (TimeModel) bundle.getParcelable(ProtectedSandApp.s("\uf253"));
        this.f54463q = timeModel;
        if (timeModel == null) {
            this.f54463q = new TimeModel();
        }
        this.f54462p = bundle.getInt(ProtectedSandApp.s("\uf254"), 0);
        this.f54459m = bundle.getInt(ProtectedSandApp.s("\uf255"), 0);
        this.f54460n = bundle.getString(ProtectedSandApp.s("\uf257"));
        this.f54464r = bundle.getInt(ProtectedSandApp.s("\uf256"), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q(MaterialButton materialButton) {
        g gVar = this.f54456j;
        if (gVar != null) {
            gVar.a();
        }
        g J = J(this.f54462p);
        this.f54456j = J;
        J.b();
        this.f54456j.invalidate();
        Pair<Integer, Integer> D = D(this.f54462p);
        materialButton.K(((Integer) D.first).intValue());
        materialButton.setContentDescription(getResources().getString(((Integer) D.second).intValue()));
    }

    public void A() {
        this.f54451e.clear();
    }

    public void B() {
        this.f54449c.clear();
    }

    public void C() {
        this.f54448b.clear();
    }

    @g0(from = 0, to = 23)
    public int E() {
        return this.f54463q.f54431e % 24;
    }

    public int F() {
        return this.f54462p;
    }

    @g0(from = 0, to = x.f60712m)
    public int G() {
        return this.f54463q.f54432f;
    }

    @q0
    com.google.android.material.timepicker.e I() {
        return this.f54454h;
    }

    public boolean L(@o0 DialogInterface.OnCancelListener onCancelListener) {
        return this.f54450d.remove(onCancelListener);
    }

    public boolean M(@o0 DialogInterface.OnDismissListener onDismissListener) {
        return this.f54451e.remove(onDismissListener);
    }

    public boolean N(@o0 View.OnClickListener onClickListener) {
        return this.f54449c.remove(onClickListener);
    }

    public boolean O(@o0 View.OnClickListener onClickListener) {
        return this.f54448b.remove(onClickListener);
    }

    @Override // androidx.fragment.app.e, android.content.DialogInterface.OnCancelListener
    public final void onCancel(@o0 DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.f54450d.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void onCreate(@q0 Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        P(bundle);
    }

    @Override // androidx.fragment.app.e
    @o0
    public final Dialog onCreateDialog(@q0 Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), H());
        Context context = dialog.getContext();
        int g4 = com.google.android.material.resources.b.g(context, a.c.P2, b.class.getCanonicalName());
        int i4 = a.c.P9;
        int i5 = a.n.Gc;
        j jVar = new j(context, null, i4, i5);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, a.o.Vl, i4, i5);
        this.f54458l = obtainStyledAttributes.getResourceId(a.o.Wl, 0);
        this.f54457k = obtainStyledAttributes.getResourceId(a.o.Xl, 0);
        obtainStyledAttributes.recycle();
        jVar.a0(context);
        jVar.p0(ColorStateList.valueOf(g4));
        Window window = dialog.getWindow();
        window.setBackgroundDrawable(jVar);
        window.requestFeature(1);
        window.setLayout(-2, -2);
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    @o0
    public final View onCreateView(@o0 LayoutInflater layoutInflater, @q0 ViewGroup viewGroup, @q0 Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(a.k.f91162e0, viewGroup);
        TimePickerView timePickerView = (TimePickerView) viewGroup2.findViewById(a.h.F2);
        this.f54452f = timePickerView;
        timePickerView.d0(new a());
        this.f54453g = (ViewStub) viewGroup2.findViewById(a.h.f91110z2);
        this.f54461o = (MaterialButton) viewGroup2.findViewById(a.h.D2);
        TextView textView = (TextView) viewGroup2.findViewById(a.h.P1);
        if (!TextUtils.isEmpty(this.f54460n)) {
            textView.setText(this.f54460n);
        }
        int i4 = this.f54459m;
        if (i4 != 0) {
            textView.setText(i4);
        }
        Q(this.f54461o);
        ((Button) viewGroup2.findViewById(a.h.E2)).setOnClickListener(new ViewOnClickListenerC0821b());
        ((Button) viewGroup2.findViewById(a.h.A2)).setOnClickListener(new c());
        this.f54461o.setOnClickListener(new d());
        return viewGroup2;
    }

    @Override // androidx.fragment.app.e, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@o0 DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.f54451e.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@o0 Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable(ProtectedSandApp.s("\uf253"), this.f54463q);
        bundle.putInt(ProtectedSandApp.s("\uf254"), this.f54462p);
        bundle.putInt(ProtectedSandApp.s("\uf255"), this.f54459m);
        bundle.putString(ProtectedSandApp.s("\uf257"), this.f54460n);
        bundle.putInt(ProtectedSandApp.s("\uf256"), this.f54464r);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.f54456j = null;
        this.f54454h = null;
        this.f54455i = null;
        this.f54452f = null;
    }

    public boolean v(@o0 DialogInterface.OnCancelListener onCancelListener) {
        return this.f54450d.add(onCancelListener);
    }

    public boolean w(@o0 DialogInterface.OnDismissListener onDismissListener) {
        return this.f54451e.add(onDismissListener);
    }

    public boolean x(@o0 View.OnClickListener onClickListener) {
        return this.f54449c.add(onClickListener);
    }

    public boolean y(@o0 View.OnClickListener onClickListener) {
        return this.f54448b.add(onClickListener);
    }

    public void z() {
        this.f54450d.clear();
    }
}
