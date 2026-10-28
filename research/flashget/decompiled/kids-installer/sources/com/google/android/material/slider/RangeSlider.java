package com.google.android.material.slider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.annotation.g0;
import androidx.annotation.n;
import androidx.annotation.o0;
import androidx.annotation.q;
import androidx.annotation.q0;
import androidx.annotation.r;
import java.util.ArrayList;
import java.util.List;
import n1.a;

/* loaded from: classes3.dex */
public class RangeSlider extends BaseSlider<RangeSlider, b, c> {
    private float F0;
    private int G0;

    /* loaded from: classes2.dex */
    static class RangeSliderState extends AbsSavedState {
        public static final Parcelable.Creator<RangeSliderState> CREATOR = new a();

        /* renamed from: o, reason: collision with root package name */
        private float f14176o;

        /* renamed from: p, reason: collision with root package name */
        private int f14177p;

        static class a implements Parcelable.Creator<RangeSliderState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public RangeSliderState createFromParcel(Parcel parcel) {
                return new RangeSliderState(parcel);
            }

            public RangeSliderState[] b(int i5) {
                return new RangeSliderState[i5];
            }

            @Override // android.os.Parcelable.Creator
            public RangeSliderState[] newArray(int i5) {
                return new RangeSliderState[i5];
            }
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i5) {
            super.writeToParcel(parcel, i5);
            parcel.writeFloat(this.f14176o);
            parcel.writeInt(this.f14177p);
        }

        RangeSliderState(Parcelable parcelable) {
            super(parcelable);
        }

        private RangeSliderState(Parcel parcel) {
            super(parcel.readParcelable(RangeSliderState.class.getClassLoader()));
            this.f14176o = parcel.readFloat();
            this.f14177p = parcel.readInt();
        }
    }

    public interface b extends com.google.android.material.slider.a<RangeSlider> {
    }

    public interface c extends com.google.android.material.slider.b<RangeSlider> {
    }

    public RangeSlider(@o0 Context context) {
        this(context, null);
    }

    private static List<Float> C1(TypedArray typedArray) {
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < typedArray.length(); i5++) {
            arrayList.add(Float.valueOf(typedArray.getFloat(i5, -1.0f)));
        }
        return arrayList;
    }

    public void D1(@r float f6) {
        this.F0 = f6;
        this.G0 = 0;
        N0(0);
    }

    public void E1(float f6) {
        this.F0 = f6;
        this.G0 = 1;
        N0(1);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ int G() {
        return super.G();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void H0(int i5) {
        super.H0(i5);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void I0(@g0(from = 0) @r int i5) {
        super.I0(i5);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void J0(@q int i5) {
        super.J0(i5);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ int K() {
        return super.K();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void K0(@o0 ColorStateList colorStateList) {
        super.K0(colorStateList);
    }

    @Override // com.google.android.material.slider.BaseSlider
    @r
    public /* bridge */ /* synthetic */ int L() {
        return super.L();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void L0(int i5) {
        super.L0(i5);
    }

    @Override // com.google.android.material.slider.BaseSlider
    @o0
    public /* bridge */ /* synthetic */ ColorStateList M() {
        return super.M();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void M0(@q0 d dVar) {
        super.M0(dVar);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ int N() {
        return super.N();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public float O() {
        return this.F0;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void O0(float f6) {
        super.O0(f6);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ float P() {
        return super.P();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void P0(float f6) {
        super.P0(f6);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ float Q() {
        return super.Q();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void Q0(@q int i5) {
        super.Q0(i5);
    }

    @Override // com.google.android.material.slider.BaseSlider
    @r
    public /* bridge */ /* synthetic */ int R() {
        return super.R();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void R0(@g0(from = 0) @r int i5) {
        super.R0(i5);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ ColorStateList S() {
        return super.S();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void S0(@q int i5) {
        super.S0(i5);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ float T() {
        return super.T();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void T0(@q0 ColorStateList colorStateList) {
        super.T0(colorStateList);
    }

    @Override // com.google.android.material.slider.BaseSlider
    @o0
    public /* bridge */ /* synthetic */ ColorStateList U() {
        return super.U();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void U0(@n int i5) {
        super.U0(i5);
    }

    @Override // com.google.android.material.slider.BaseSlider
    @o0
    public /* bridge */ /* synthetic */ ColorStateList V() {
        return super.V();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void V0(float f6) {
        super.V0(f6);
    }

    @Override // com.google.android.material.slider.BaseSlider
    @o0
    public /* bridge */ /* synthetic */ ColorStateList W() {
        return super.W();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void W0(@q int i5) {
        super.W0(i5);
    }

    @Override // com.google.android.material.slider.BaseSlider
    @o0
    public /* bridge */ /* synthetic */ ColorStateList X() {
        return super.X();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void X0(@o0 ColorStateList colorStateList) {
        super.X0(colorStateList);
    }

    @Override // com.google.android.material.slider.BaseSlider
    @o0
    public /* bridge */ /* synthetic */ ColorStateList Y() {
        return super.Y();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void Y0(@o0 ColorStateList colorStateList) {
        super.Y0(colorStateList);
    }

    @Override // com.google.android.material.slider.BaseSlider
    @r
    public /* bridge */ /* synthetic */ int Z() {
        return super.Z();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void Z0(@o0 ColorStateList colorStateList) {
        super.Z0(colorStateList);
    }

    @Override // com.google.android.material.slider.BaseSlider
    @o0
    public /* bridge */ /* synthetic */ ColorStateList a0() {
        return super.a0();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void a1(@o0 ColorStateList colorStateList) {
        super.a1(colorStateList);
    }

    @Override // com.google.android.material.slider.BaseSlider
    @r
    public /* bridge */ /* synthetic */ int b0() {
        return super.b0();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void b1(boolean z5) {
        super.b1(z5);
    }

    @Override // com.google.android.material.slider.BaseSlider
    @o0
    public /* bridge */ /* synthetic */ ColorStateList c0() {
        return super.c0();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void c1(@o0 ColorStateList colorStateList) {
        super.c1(colorStateList);
    }

    @Override // com.google.android.material.slider.BaseSlider
    @r
    public /* bridge */ /* synthetic */ int d0() {
        return super.d0();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void d1(@g0(from = 0) @r int i5) {
        super.d1(i5);
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View
    public /* bridge */ /* synthetic */ boolean dispatchHoverEvent(@o0 MotionEvent motionEvent) {
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View
    public /* bridge */ /* synthetic */ boolean dispatchKeyEvent(@o0 KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ float e0() {
        return super.e0();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void e1(@o0 ColorStateList colorStateList) {
        super.e1(colorStateList);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void f1(@o0 ColorStateList colorStateList) {
        super.f1(colorStateList);
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View
    @o0
    public /* bridge */ /* synthetic */ CharSequence getAccessibilityClassName() {
        return super.getAccessibilityClassName();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ float h0() {
        return super.h0();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void h1(float f6) {
        super.h1(f6);
    }

    @Override // com.google.android.material.slider.BaseSlider
    @o0
    public List<Float> i0() {
        return super.i0();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void i1(float f6) {
        super.i1(f6);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ boolean j0() {
        return super.j0();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public void j1(@o0 List<Float> list) {
        super.j1(list);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public void k1(@o0 Float... fArr) {
        super.k1(fArr);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ boolean n0() {
        return super.n0();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void o() {
        super.o();
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View, android.view.KeyEvent.Callback
    public /* bridge */ /* synthetic */ boolean onKeyDown(int i5, @o0 KeyEvent keyEvent) {
        return super.onKeyDown(i5, keyEvent);
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View, android.view.KeyEvent.Callback
    public /* bridge */ /* synthetic */ boolean onKeyUp(int i5, @o0 KeyEvent keyEvent) {
        return super.onKeyUp(i5, keyEvent);
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View
    protected void onRestoreInstanceState(@q0 Parcelable parcelable) {
        RangeSliderState rangeSliderState = (RangeSliderState) parcelable;
        super.onRestoreInstanceState(rangeSliderState.getSuperState());
        this.F0 = rangeSliderState.f14176o;
        int i5 = rangeSliderState.f14177p;
        this.G0 = i5;
        N0(i5);
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View
    @o0
    public Parcelable onSaveInstanceState() {
        RangeSliderState rangeSliderState = new RangeSliderState(super.onSaveInstanceState());
        rangeSliderState.f14176o = this.F0;
        rangeSliderState.f14177p = this.G0;
        return rangeSliderState;
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(@o0 MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void p() {
        super.p();
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View
    public /* bridge */ /* synthetic */ void setEnabled(boolean z5) {
        super.setEnabled(z5);
    }

    public RangeSlider(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.Kc);
    }

    public RangeSlider(@o0 Context context, @q0 AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        TypedArray j5 = com.google.android.material.internal.n.j(context, attributeSet, a.o.un, i5, BaseSlider.A0, new int[0]);
        int i6 = a.o.wn;
        if (j5.hasValue(i6)) {
            j1(C1(j5.getResources().obtainTypedArray(j5.getResourceId(i6, 0))));
        }
        this.F0 = j5.getDimension(a.o.vn, 0.0f);
        j5.recycle();
    }
}
