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
import androidx.core.util.s;
import com.google.android.material.internal.v;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import s8.a;

@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes6.dex */
public class SingleDateSelector implements DateSelector<Long> {
    public static final Parcelable.Creator<SingleDateSelector> CREATOR = new b();

    /* renamed from: b, reason: collision with root package name */
    @q0
    private Long f53082b;

    class a extends c {

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ m f53083i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, m mVar) {
            super(str, dateFormat, textInputLayout, calendarConstraints);
            this.f53083i = mVar;
        }

        @Override // com.google.android.material.datepicker.c
        void e() {
            this.f53083i.a();
        }

        @Override // com.google.android.material.datepicker.c
        void f(@q0 Long l4) {
            if (l4 == null) {
                SingleDateSelector.a(SingleDateSelector.this);
            } else {
                SingleDateSelector.this.E3(l4.longValue());
            }
            this.f53083i.b(SingleDateSelector.this.getSelection());
        }
    }

    static class b implements Parcelable.Creator<SingleDateSelector> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        @o0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SingleDateSelector createFromParcel(@o0 Parcel parcel) {
            SingleDateSelector singleDateSelector = new SingleDateSelector();
            singleDateSelector.f53082b = (Long) parcel.readValue(Long.class.getClassLoader());
            return singleDateSelector;
        }

        @o0
        public SingleDateSelector[] b(int i4) {
            return new SingleDateSelector[i4];
        }

        @Override // android.os.Parcelable.Creator
        @o0
        public SingleDateSelector[] newArray(int i4) {
            return new SingleDateSelector[i4];
        }
    }

    static void a(SingleDateSelector singleDateSelector) {
        singleDateSelector.f53082b = null;
    }

    private void c() {
        this.f53082b = null;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void E3(long j4) {
        this.f53082b = Long.valueOf(j4);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int S() {
        return a.m.f91251u0;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public View T2(@o0 LayoutInflater layoutInflater, @q0 ViewGroup viewGroup, @q0 Bundle bundle, CalendarConstraints calendarConstraints, @o0 m<Long> mVar) {
        View inflate = layoutInflater.inflate(a.k.H0, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(a.h.f91031j3);
        EditText Z = textInputLayout.Z();
        if (com.google.android.material.internal.e.a()) {
            Z.setInputType(17);
        }
        SimpleDateFormat p4 = q.p();
        String q4 = q.q(inflate.getResources(), p4);
        textInputLayout.H2(q4);
        Long l4 = this.f53082b;
        if (l4 != null) {
            Z.setText(p4.format(l4));
        }
        Z.addTextChangedListener(new a(q4, p4, textInputLayout, calendarConstraints, mVar));
        v.o(Z);
        return inflate;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @q0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Long getSelection() {
        return this.f53082b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void l2(@q0 Long l4) {
        this.f53082b = l4 == null ? null : Long.valueOf(q.a(l4.longValue()));
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int e1(Context context) {
        return com.google.android.material.resources.b.g(context, a.c.J9, g.class.getCanonicalName());
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @o0
    public String e2(@o0 Context context) {
        Resources resources = context.getResources();
        Long l4 = this.f53082b;
        if (l4 == null) {
            return resources.getString(a.m.f91253v0);
        }
        return resources.getString(a.m.f91249t0, d.j(l4.longValue()));
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @o0
    public Collection<s<Long, Long>> g2() {
        return new ArrayList();
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public boolean i3() {
        return this.f53082b != null;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @o0
    public Collection<Long> j3() {
        ArrayList arrayList = new ArrayList();
        Long l4 = this.f53082b;
        if (l4 != null) {
            arrayList.add(l4);
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        parcel.writeValue(this.f53082b);
    }
}
