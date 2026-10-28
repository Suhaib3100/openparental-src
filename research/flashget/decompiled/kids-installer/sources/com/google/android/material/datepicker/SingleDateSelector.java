package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.google.android.material.internal.v;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import n1.a;

@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class SingleDateSelector implements DateSelector<Long> {
    public static final Parcelable.Creator<SingleDateSelector> CREATOR = new b();

    /* renamed from: o, reason: collision with root package name */
    @q0
    private Long f13329o;

    class a extends c {

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ m f13330v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, m mVar) {
            super(str, dateFormat, textInputLayout, calendarConstraints);
            this.f13330v = mVar;
        }

        @Override // com.google.android.material.datepicker.c
        void e() {
            this.f13330v.a();
        }

        @Override // com.google.android.material.datepicker.c
        void f(@q0 Long l5) {
            if (l5 == null) {
                SingleDateSelector.a(SingleDateSelector.this);
            } else {
                SingleDateSelector.this.f1(l5.longValue());
            }
            this.f13330v.b(SingleDateSelector.this.U0());
        }
    }

    /* loaded from: classes2.dex */
    static class b implements Parcelable.Creator<SingleDateSelector> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        @o0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SingleDateSelector createFromParcel(@o0 Parcel parcel) {
            SingleDateSelector singleDateSelector = new SingleDateSelector();
            singleDateSelector.f13329o = (Long) parcel.readValue(Long.class.getClassLoader());
            return singleDateSelector;
        }

        @o0
        public SingleDateSelector[] b(int i5) {
            return new SingleDateSelector[i5];
        }

        @Override // android.os.Parcelable.Creator
        @o0
        public SingleDateSelector[] newArray(int i5) {
            return new SingleDateSelector[i5];
        }
    }

    static void a(SingleDateSelector singleDateSelector) {
        singleDateSelector.f13329o = null;
    }

    private void c() {
        this.f13329o = null;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int A0(Context context) {
        return com.google.android.material.resources.b.g(context, a.c.K9, g.class.getCanonicalName());
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public boolean F0() {
        return this.f13329o != null;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @o0
    public Collection<Long> M0() {
        ArrayList arrayList = new ArrayList();
        Long l5 = this.f13329o;
        if (l5 != null) {
            arrayList.add(l5);
        }
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @q0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Long U0() {
        return this.f13329o;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void B(@q0 Long l5) {
        this.f13329o = l5 == null ? null : Long.valueOf(q.a(l5.longValue()));
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void f1(long j5) {
        this.f13329o = Long.valueOf(j5);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public View m0(@o0 LayoutInflater layoutInflater, @q0 ViewGroup viewGroup, @q0 Bundle bundle, CalendarConstraints calendarConstraints, @o0 m<Long> mVar) {
        View inflate = layoutInflater.inflate(a.k.H0, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(a.h.f29742j3);
        EditText Z = textInputLayout.Z();
        if (com.google.android.material.internal.e.a()) {
            Z.setInputType(17);
        }
        SimpleDateFormat p5 = q.p();
        String q5 = q.q(inflate.getResources(), p5);
        textInputLayout.H2(q5);
        Long l5 = this.f13329o;
        if (l5 != null) {
            Z.setText(p5.format(l5));
        }
        Z.addTextChangedListener(new a(q5, p5, textInputLayout, calendarConstraints, mVar));
        v.o(Z);
        return inflate;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int n0() {
        return a.m.f29979u0;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @o0
    public String o(@o0 Context context) {
        Resources resources = context.getResources();
        Long l5 = this.f13329o;
        if (l5 == null) {
            return resources.getString(a.m.f29981v0);
        }
        return resources.getString(a.m.f29977t0, d.j(l5.longValue()));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i5) {
        parcel.writeValue(this.f13329o);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @o0
    public Collection<androidx.core.util.m<Long, Long>> z() {
        return new ArrayList();
    }
}
