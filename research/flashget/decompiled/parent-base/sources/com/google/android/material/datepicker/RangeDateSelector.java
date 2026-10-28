package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.core.util.s;
import androidx.core.util.w;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.material.internal.v;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import s8.a;

@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes6.dex */
public class RangeDateSelector implements DateSelector<s<Long, Long>> {
    public static final Parcelable.Creator<RangeDateSelector> CREATOR = new c();

    /* renamed from: b, reason: collision with root package name */
    private String f53068b;

    /* renamed from: c, reason: collision with root package name */
    private final String f53069c = ProtectedSandApp.s("\uf196");

    /* renamed from: d, reason: collision with root package name */
    @q0
    private Long f53070d = null;

    /* renamed from: e, reason: collision with root package name */
    @q0
    private Long f53071e = null;

    /* renamed from: f, reason: collision with root package name */
    @q0
    private Long f53072f = null;

    /* renamed from: g, reason: collision with root package name */
    @q0
    private Long f53073g = null;

    class a extends com.google.android.material.datepicker.c {

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ TextInputLayout f53074i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ TextInputLayout f53075j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ m f53076k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, m mVar) {
            super(str, dateFormat, textInputLayout, calendarConstraints);
            this.f53074i = textInputLayout2;
            this.f53075j = textInputLayout3;
            this.f53076k = mVar;
        }

        @Override // com.google.android.material.datepicker.c
        void e() {
            RangeDateSelector.this.f53072f = null;
            RangeDateSelector.this.n(this.f53074i, this.f53075j, this.f53076k);
        }

        @Override // com.google.android.material.datepicker.c
        void f(@q0 Long l4) {
            RangeDateSelector.this.f53072f = l4;
            RangeDateSelector.this.n(this.f53074i, this.f53075j, this.f53076k);
        }
    }

    class b extends com.google.android.material.datepicker.c {

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ TextInputLayout f53078i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ TextInputLayout f53079j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ m f53080k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, m mVar) {
            super(str, dateFormat, textInputLayout, calendarConstraints);
            this.f53078i = textInputLayout2;
            this.f53079j = textInputLayout3;
            this.f53080k = mVar;
        }

        @Override // com.google.android.material.datepicker.c
        void e() {
            RangeDateSelector.this.f53073g = null;
            RangeDateSelector.this.n(this.f53078i, this.f53079j, this.f53080k);
        }

        @Override // com.google.android.material.datepicker.c
        void f(@q0 Long l4) {
            RangeDateSelector.this.f53073g = l4;
            RangeDateSelector.this.n(this.f53078i, this.f53079j, this.f53080k);
        }
    }

    static class c implements Parcelable.Creator<RangeDateSelector> {
        c() {
        }

        @Override // android.os.Parcelable.Creator
        @o0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public RangeDateSelector createFromParcel(@o0 Parcel parcel) {
            RangeDateSelector rangeDateSelector = new RangeDateSelector();
            rangeDateSelector.f53070d = (Long) parcel.readValue(Long.class.getClassLoader());
            rangeDateSelector.f53071e = (Long) parcel.readValue(Long.class.getClassLoader());
            return rangeDateSelector;
        }

        @o0
        public RangeDateSelector[] b(int i4) {
            return new RangeDateSelector[i4];
        }

        @Override // android.os.Parcelable.Creator
        @o0
        public RangeDateSelector[] newArray(int i4) {
            return new RangeDateSelector[i4];
        }
    }

    private void f(@o0 TextInputLayout textInputLayout, @o0 TextInputLayout textInputLayout2) {
        if (textInputLayout.g0() != null && this.f53068b.contentEquals(textInputLayout.g0())) {
            textInputLayout.V1(null);
        }
        if (textInputLayout2.g0() == null || !ProtectedSandApp.s("\uf196").contentEquals(textInputLayout2.g0())) {
            return;
        }
        textInputLayout2.V1(null);
    }

    private boolean h(long j4, long j5) {
        return j4 <= j5;
    }

    private void j(@o0 TextInputLayout textInputLayout, @o0 TextInputLayout textInputLayout2) {
        textInputLayout.V1(this.f53068b);
        textInputLayout2.V1(ProtectedSandApp.s("\uf196"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(@o0 TextInputLayout textInputLayout, @o0 TextInputLayout textInputLayout2, @o0 m<s<Long, Long>> mVar) {
        Long l4 = this.f53072f;
        if (l4 == null || this.f53073g == null) {
            f(textInputLayout, textInputLayout2);
            mVar.a();
        } else if (!h(l4.longValue(), this.f53073g.longValue())) {
            j(textInputLayout, textInputLayout2);
            mVar.a();
        } else {
            this.f53070d = this.f53072f;
            this.f53071e = this.f53073g;
            mVar.b(getSelection());
        }
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void E3(long j4) {
        Long l4 = this.f53070d;
        if (l4 == null) {
            this.f53070d = Long.valueOf(j4);
        } else if (this.f53071e == null && h(l4.longValue(), j4)) {
            this.f53071e = Long.valueOf(j4);
        } else {
            this.f53071e = null;
            this.f53070d = Long.valueOf(j4);
        }
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int S() {
        return a.m.G0;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public View T2(@o0 LayoutInflater layoutInflater, @q0 ViewGroup viewGroup, @q0 Bundle bundle, CalendarConstraints calendarConstraints, @o0 m<s<Long, Long>> mVar) {
        View inflate = layoutInflater.inflate(a.k.I0, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(a.h.f91041l3);
        TextInputLayout textInputLayout2 = (TextInputLayout) inflate.findViewById(a.h.f91036k3);
        EditText Z = textInputLayout.Z();
        EditText Z2 = textInputLayout2.Z();
        if (com.google.android.material.internal.e.a()) {
            Z.setInputType(17);
            Z2.setInputType(17);
        }
        this.f53068b = inflate.getResources().getString(a.m.A0);
        SimpleDateFormat p4 = q.p();
        Long l4 = this.f53070d;
        if (l4 != null) {
            Z.setText(p4.format(l4));
            this.f53072f = this.f53070d;
        }
        Long l5 = this.f53071e;
        if (l5 != null) {
            Z2.setText(p4.format(l5));
            this.f53073g = this.f53071e;
        }
        String q4 = q.q(inflate.getResources(), p4);
        textInputLayout.H2(q4);
        textInputLayout2.H2(q4);
        Z.addTextChangedListener(new a(q4, p4, textInputLayout, calendarConstraints, textInputLayout, textInputLayout2, mVar));
        Z2.addTextChangedListener(new b(q4, p4, textInputLayout2, calendarConstraints, textInputLayout, textInputLayout2, mVar));
        v.o(Z);
        return inflate;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int e1(@o0 Context context) {
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        return com.google.android.material.resources.b.g(context, Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) > resources.getDimensionPixelSize(a.f.V3) ? a.c.J9 : a.c.f90641y9, g.class.getCanonicalName());
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @o0
    public String e2(@o0 Context context) {
        Resources resources = context.getResources();
        Long l4 = this.f53070d;
        if (l4 == null && this.f53071e == null) {
            return resources.getString(a.m.H0);
        }
        Long l5 = this.f53071e;
        if (l5 == null) {
            return resources.getString(a.m.E0, d.d(l4.longValue(), null));
        }
        if (l4 == null) {
            return resources.getString(a.m.D0, d.d(l5.longValue(), null));
        }
        s<String, String> b5 = d.b(l4, l5, null);
        return resources.getString(a.m.F0, b5.f26881a, b5.f26882b);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @o0
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public s<Long, Long> getSelection() {
        return new s<>(this.f53070d, this.f53071e);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @o0
    public Collection<s<Long, Long>> g2() {
        if (this.f53070d == null || this.f53071e == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new s(this.f53070d, this.f53071e));
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public boolean i3() {
        Long l4 = this.f53070d;
        return (l4 == null || this.f53071e == null || !h(l4.longValue(), this.f53071e.longValue())) ? false : true;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @o0
    public Collection<Long> j3() {
        ArrayList arrayList = new ArrayList();
        Long l4 = this.f53070d;
        if (l4 != null) {
            arrayList.add(l4);
        }
        Long l5 = this.f53071e;
        if (l5 != null) {
            arrayList.add(l5);
        }
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public void l2(@o0 s<Long, Long> sVar) {
        Long l4 = sVar.f26881a;
        if (l4 != null && sVar.f26882b != null) {
            w.a(h(l4.longValue(), sVar.f26882b.longValue()));
        }
        Long l5 = sVar.f26881a;
        this.f53070d = l5 == null ? null : Long.valueOf(q.a(l5.longValue()));
        Long l6 = sVar.f26882b;
        this.f53071e = l6 != null ? Long.valueOf(q.a(l6.longValue())) : null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        parcel.writeValue(this.f53070d);
        parcel.writeValue(this.f53071e);
    }
}
