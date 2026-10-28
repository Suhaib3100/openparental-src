package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.annotation.g1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.y1;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import com.google.android.material.timepicker.ClockHandView;
import java.util.Locale;
import n1.a;

/* loaded from: classes3.dex */
class TimePickerView extends ConstraintLayout implements com.google.android.material.timepicker.f {
    private final Chip U;
    private final Chip V;
    private final ClockHandView W;

    /* renamed from: a0, reason: collision with root package name */
    private final ClockFaceView f14592a0;

    /* renamed from: b0, reason: collision with root package name */
    private final MaterialButtonToggleGroup f14593b0;

    /* renamed from: c0, reason: collision with root package name */
    private final View.OnClickListener f14594c0;

    /* renamed from: d0, reason: collision with root package name */
    private f f14595d0;

    /* renamed from: e0, reason: collision with root package name */
    private g f14596e0;

    /* renamed from: f0, reason: collision with root package name */
    private e f14597f0;

    /* loaded from: classes2.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (TimePickerView.this.f14596e0 != null) {
                TimePickerView.this.f14596e0.f(((Integer) view.getTag(a.h.f29821w4)).intValue());
            }
        }
    }

    class b implements MaterialButtonToggleGroup.e {
        b() {
        }

        @Override // com.google.android.material.button.MaterialButtonToggleGroup.e
        public void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i5, boolean z5) {
            int i6 = i5 == a.h.f29795s2 ? 1 : 0;
            if (TimePickerView.this.f14595d0 == null || !z5) {
                return;
            }
            TimePickerView.this.f14595d0.e(i6);
        }
    }

    /* loaded from: classes2.dex */
    class c extends GestureDetector.SimpleOnGestureListener {
        c() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            boolean onDoubleTap = super.onDoubleTap(motionEvent);
            if (TimePickerView.this.f14597f0 != null) {
                TimePickerView.this.f14597f0.a();
            }
            return onDoubleTap;
        }
    }

    /* loaded from: classes2.dex */
    class d implements View.OnTouchListener {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ GestureDetector f14601o;

        d(GestureDetector gestureDetector) {
            this.f14601o = gestureDetector;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (((Checkable) view).isChecked()) {
                return this.f14601o.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    /* loaded from: classes2.dex */
    interface e {
        void a();
    }

    /* loaded from: classes2.dex */
    interface f {
        void e(int i5);
    }

    /* loaded from: classes2.dex */
    interface g {
        void f(int i5);
    }

    public TimePickerView(Context context) {
        this(context, null);
    }

    private void g0() {
        Chip chip = this.U;
        int i5 = a.h.f29821w4;
        chip.setTag(i5, 12);
        this.V.setTag(i5, 10);
        this.U.setOnClickListener(this.f14594c0);
        this.V.setOnClickListener(this.f14594c0);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void h0() {
        d dVar = new d(new GestureDetector(getContext(), new c()));
        this.U.setOnTouchListener(dVar);
        this.V.setOnTouchListener(dVar);
    }

    private void j0() {
        if (this.f14593b0.getVisibility() == 0) {
            androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
            dVar.A(this);
            dVar.y(a.h.f29771o2, y1.Z(this) == 0 ? 2 : 1);
            dVar.l(this);
        }
    }

    public void X(ClockHandView.d dVar) {
        this.W.b(dVar);
    }

    public void Y(boolean z5) {
        this.W.j(z5);
    }

    public void Z(float f6, boolean z5) {
        this.W.m(f6, z5);
    }

    @Override // com.google.android.material.timepicker.f
    public void a(int i5) {
        this.U.setChecked(i5 == 12);
        this.V.setChecked(i5 == 10);
    }

    public void a0(androidx.core.view.a aVar) {
        y1.B1(this.U, aVar);
    }

    @Override // com.google.android.material.timepicker.f
    @SuppressLint({"DefaultLocale"})
    public void b(int i5, int i6, int i7) {
        this.f14593b0.j(i5 == 1 ? a.h.f29795s2 : a.h.f29789r2);
        Locale locale = getResources().getConfiguration().locale;
        Object[] objArr = {Integer.valueOf(i7)};
        String s5 = ProtectedSandApp.s("✶");
        String format = String.format(locale, s5, objArr);
        String format2 = String.format(locale, s5, Integer.valueOf(i6));
        this.U.setText(format);
        this.V.setText(format2);
    }

    public void b0(androidx.core.view.a aVar) {
        y1.B1(this.V, aVar);
    }

    @Override // com.google.android.material.timepicker.f
    public void c(String[] strArr, @g1 int i5) {
        this.f14592a0.c(strArr, i5);
    }

    public void c0(ClockHandView.c cVar) {
        this.W.o(cVar);
    }

    void d0(@q0 e eVar) {
        this.f14597f0 = eVar;
    }

    @Override // com.google.android.material.timepicker.f
    public void e(float f6) {
        this.W.l(f6);
    }

    void e0(f fVar) {
        this.f14595d0 = fVar;
    }

    void f0(g gVar) {
        this.f14596e0 = gVar;
    }

    public void i0() {
        this.f14593b0.setVisibility(0);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        j0();
    }

    @Override // android.view.View
    protected void onVisibilityChanged(@o0 View view, int i5) {
        super.onVisibilityChanged(view, i5);
        if (view == this && i5 == 0) {
            j0();
        }
    }

    public TimePickerView(Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TimePickerView(Context context, @q0 AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.f14594c0 = new a();
        LayoutInflater.from(context).inflate(a.k.f29887d0, this);
        this.f14592a0 = (ClockFaceView) findViewById(a.h.f29777p2);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(a.h.f29801t2);
        this.f14593b0 = materialButtonToggleGroup;
        materialButtonToggleGroup.g(new b());
        this.U = (Chip) findViewById(a.h.f29831y2);
        this.V = (Chip) findViewById(a.h.f29813v2);
        this.W = (ClockHandView) findViewById(a.h.f29783q2);
        h0();
        g0();
    }
}
