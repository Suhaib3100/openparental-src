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
import androidx.core.view.x1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import com.google.android.material.timepicker.ClockHandView;
import java.util.Locale;
import s8.a;

/* loaded from: classes6.dex */
class TimePickerView extends ConstraintLayout implements com.google.android.material.timepicker.f {
    private final Chip J;
    private final Chip K;
    private final ClockHandView L;
    private final ClockFaceView M;
    private final MaterialButtonToggleGroup N;
    private final View.OnClickListener O;
    private f P;
    private g Q;
    private e R;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (TimePickerView.this.Q != null) {
                TimePickerView.this.Q.f(((Integer) view.getTag(a.h.w4)).intValue());
            }
        }
    }

    class b implements MaterialButtonToggleGroup.e {
        b() {
        }

        @Override // com.google.android.material.button.MaterialButtonToggleGroup.e
        public void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i4, boolean z4) {
            int i5 = i4 == a.h.f91075s2 ? 1 : 0;
            if (TimePickerView.this.P == null || !z4) {
                return;
            }
            TimePickerView.this.P.e(i5);
        }
    }

    class c extends GestureDetector.SimpleOnGestureListener {
        c() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            boolean onDoubleTap = super.onDoubleTap(motionEvent);
            if (TimePickerView.this.R != null) {
                TimePickerView.this.R.a();
            }
            return onDoubleTap;
        }
    }

    class d implements View.OnTouchListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ GestureDetector f54438b;

        d(GestureDetector gestureDetector) {
            this.f54438b = gestureDetector;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (((Checkable) view).isChecked()) {
                return this.f54438b.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    interface e {
        void a();
    }

    interface f {
        void e(int i4);
    }

    interface g {
        void f(int i4);
    }

    public TimePickerView(Context context) {
        this(context, null);
    }

    private void g0() {
        Chip chip = this.J;
        int i4 = a.h.w4;
        chip.setTag(i4, 12);
        this.K.setTag(i4, 10);
        this.J.setOnClickListener(this.O);
        this.K.setOnClickListener(this.O);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void h0() {
        d dVar = new d(new GestureDetector(getContext(), new c()));
        this.J.setOnTouchListener(dVar);
        this.K.setOnTouchListener(dVar);
    }

    private void j0() {
        if (this.N.getVisibility() == 0) {
            androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
            dVar.H(this);
            dVar.F(a.h.f91055o2, x1.c0(this) == 0 ? 2 : 1);
            dVar.r(this);
        }
    }

    public void X(ClockHandView.d dVar) {
        this.L.b(dVar);
    }

    public void Y(boolean z4) {
        this.L.j(z4);
    }

    public void Z(float f4, boolean z4) {
        this.L.m(f4, z4);
    }

    @Override // com.google.android.material.timepicker.f
    public void a(int i4) {
        this.J.setChecked(i4 == 12);
        this.K.setChecked(i4 == 10);
    }

    public void a0(androidx.core.view.a aVar) {
        x1.H1(this.J, aVar);
    }

    @Override // com.google.android.material.timepicker.f
    @SuppressLint({"DefaultLocale"})
    public void b(int i4, int i5, int i6) {
        this.N.j(i4 == 1 ? a.h.f91075s2 : a.h.f91070r2);
        Locale locale = getResources().getConfiguration().locale;
        Object[] objArr = {Integer.valueOf(i6)};
        String s4 = ProtectedSandApp.s("\uf251");
        String format = String.format(locale, s4, objArr);
        String format2 = String.format(locale, s4, Integer.valueOf(i5));
        this.J.setText(format);
        this.K.setText(format2);
    }

    public void b0(androidx.core.view.a aVar) {
        x1.H1(this.K, aVar);
    }

    @Override // com.google.android.material.timepicker.f
    public void c(String[] strArr, @g1 int i4) {
        this.M.c(strArr, i4);
    }

    public void c0(ClockHandView.c cVar) {
        this.L.o(cVar);
    }

    @Override // com.google.android.material.timepicker.f
    public void d(float f4) {
        this.L.l(f4);
    }

    void d0(@q0 e eVar) {
        this.R = eVar;
    }

    void e0(f fVar) {
        this.P = fVar;
    }

    void f0(g gVar) {
        this.Q = gVar;
    }

    public void i0() {
        this.N.setVisibility(0);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        j0();
    }

    @Override // android.view.View
    protected void onVisibilityChanged(@o0 View view, int i4) {
        super.onVisibilityChanged(view, i4);
        if (view == this && i4 == 0) {
            j0();
        }
    }

    public TimePickerView(Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TimePickerView(Context context, @q0 AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.O = new a();
        LayoutInflater.from(context).inflate(a.k.f91159d0, this);
        this.M = (ClockFaceView) findViewById(a.h.f91060p2);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(a.h.f91080t2);
        this.N = materialButtonToggleGroup;
        materialButtonToggleGroup.g(new b());
        this.J = (Chip) findViewById(a.h.f91105y2);
        this.K = (Chip) findViewById(a.h.f91090v2);
        this.L = (ClockHandView) findViewById(a.h.f91065q2);
        h0();
        g0();
    }
}
