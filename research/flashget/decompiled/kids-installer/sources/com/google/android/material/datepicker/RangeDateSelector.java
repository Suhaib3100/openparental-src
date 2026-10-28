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
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.material.internal.v;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import n1.a;

@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class RangeDateSelector implements DateSelector<androidx.core.util.m<Long, Long>> {
    public static final Parcelable.Creator<RangeDateSelector> CREATOR = new c();

    /* renamed from: o, reason: collision with root package name */
    private String f13315o;

    /* renamed from: p, reason: collision with root package name */
    private final String f13316p = ProtectedSandApp.s("⛜");

    /* renamed from: q, reason: collision with root package name */
    @q0
    private Long f13317q = null;

    /* renamed from: r, reason: collision with root package name */
    @q0
    private Long f13318r = null;

    /* renamed from: s, reason: collision with root package name */
    @q0
    private Long f13319s = null;

    /* renamed from: t, reason: collision with root package name */
    @q0
    private Long f13320t = null;

    class a extends com.google.android.material.datepicker.c {

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ TextInputLayout f13321v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ TextInputLayout f13322w;

        /* renamed from: x, reason: collision with root package name */
        final /* synthetic */ m f13323x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, m mVar) {
            super(str, dateFormat, textInputLayout, calendarConstraints);
            this.f13321v = textInputLayout2;
            this.f13322w = textInputLayout3;
            this.f13323x = mVar;
        }

        @Override // com.google.android.material.datepicker.c
        void e() {
            RangeDateSelector.this.f13319s = null;
            RangeDateSelector.this.k(this.f13321v, this.f13322w, this.f13323x);
        }

        @Override // com.google.android.material.datepicker.c
        void f(@q0 Long l5) {
            RangeDateSelector.this.f13319s = l5;
            RangeDateSelector.this.k(this.f13321v, this.f13322w, this.f13323x);
        }
    }

    class b extends com.google.android.material.datepicker.c {

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ TextInputLayout f13325v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ TextInputLayout f13326w;

        /* renamed from: x, reason: collision with root package name */
        final /* synthetic */ m f13327x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, m mVar) {
            super(str, dateFormat, textInputLayout, calendarConstraints);
            this.f13325v = textInputLayout2;
            this.f13326w = textInputLayout3;
            this.f13327x = mVar;
        }

        @Override // com.google.android.material.datepicker.c
        void e() {
            RangeDateSelector.this.f13320t = null;
            RangeDateSelector.this.k(this.f13325v, this.f13326w, this.f13327x);
        }

        @Override // com.google.android.material.datepicker.c
        void f(@q0 Long l5) {
            RangeDateSelector.this.f13320t = l5;
            RangeDateSelector.this.k(this.f13325v, this.f13326w, this.f13327x);
        }
    }

    /* loaded from: classes2.dex */
    static class c implements Parcelable.Creator<RangeDateSelector> {
        c() {
        }

        @Override // android.os.Parcelable.Creator
        @o0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public RangeDateSelector createFromParcel(@o0 Parcel parcel) {
            RangeDateSelector rangeDateSelector = new RangeDateSelector();
            rangeDateSelector.f13317q = (Long) parcel.readValue(Long.class.getClassLoader());
            rangeDateSelector.f13318r = (Long) parcel.readValue(Long.class.getClassLoader());
            return rangeDateSelector;
        }

        @o0
        public RangeDateSelector[] b(int i5) {
            return new RangeDateSelector[i5];
        }

        @Override // android.os.Parcelable.Creator
        @o0
        public RangeDateSelector[] newArray(int i5) {
            return new RangeDateSelector[i5];
        }
    }

    private void f(@o0 TextInputLayout textInputLayout, @o0 TextInputLayout textInputLayout2) {
        if (textInputLayout.g0() != null && this.f13315o.contentEquals(textInputLayout.g0())) {
            textInputLayout.V1(null);
        }
        if (textInputLayout2.g0() == null || !ProtectedSandApp.s("⛝").contentEquals(textInputLayout2.g0())) {
            return;
        }
        textInputLayout2.V1(null);
    }

    private boolean h(long j5, long j6) {
        return j5 <= j6;
    }

    private void i(@o0 TextInputLayout textInputLayout, @o0 TextInputLayout textInputLayout2) {
        textInputLayout.V1(this.f13315o);
        textInputLayout2.V1(ProtectedSandApp.s("⛞"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(@o0 TextInputLayout textInputLayout, @o0 TextInputLayout textInputLayout2, @o0 m<androidx.core.util.m<Long, Long>> mVar) {
        Long l5 = this.f13319s;
        if (l5 == null || this.f13320t == null) {
            f(textInputLayout, textInputLayout2);
            mVar.a();
        } else if (!h(l5.longValue(), this.f13320t.longValue())) {
            i(textInputLayout, textInputLayout2);
            mVar.a();
        } else {
            this.f13317q = this.f13319s;
            this.f13318r = this.f13320t;
            mVar.b(U0());
        }
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int A0(@o0 Context context) {
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        return com.google.android.material.resources.b.g(context, Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) > resources.getDimensionPixelSize(a.f.V3) ? a.c.K9 : a.c.z9, g.class.getCanonicalName());
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public boolean F0() {
        Long l5 = this.f13317q;
        return (l5 == null || this.f13318r == null || !h(l5.longValue(), this.f13318r.longValue())) ? false : true;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @o0
    public Collection<Long> M0() {
        ArrayList arrayList = new ArrayList();
        Long l5 = this.f13317q;
        if (l5 != null) {
            arrayList.add(l5);
        }
        Long l6 = this.f13318r;
        if (l6 != null) {
            arrayList.add(l6);
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void f1(long j5) {
        Long l5 = this.f13317q;
        if (l5 == null) {
            this.f13317q = Long.valueOf(j5);
        } else if (this.f13318r == null && h(l5.longValue(), j5)) {
            this.f13318r = Long.valueOf(j5);
        } else {
            this.f13318r = null;
            this.f13317q = Long.valueOf(j5);
        }
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @o0
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public androidx.core.util.m<Long, Long> U0() {
        return new androidx.core.util.m<>(this.f13317q, this.f13318r);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public void B(@o0 androidx.core.util.m<Long, Long> mVar) {
        Long l5 = mVar.f5251a;
        if (l5 != null && mVar.f5252b != null) {
            androidx.core.util.q.a(h(l5.longValue(), mVar.f5252b.longValue()));
        }
        Long l6 = mVar.f5251a;
        this.f13317q = l6 == null ? null : Long.valueOf(q.a(l6.longValue()));
        Long l7 = mVar.f5252b;
        this.f13318r = l7 != null ? Long.valueOf(q.a(l7.longValue())) : null;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public View m0(@o0 LayoutInflater layoutInflater, @q0 ViewGroup viewGroup, @q0 Bundle bundle, CalendarConstraints calendarConstraints, @o0 m<androidx.core.util.m<Long, Long>> mVar) {
        View inflate = layoutInflater.inflate(a.k.I0, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(a.h.f29754l3);
        TextInputLayout textInputLayout2 = (TextInputLayout) inflate.findViewById(a.h.f29748k3);
        EditText Z = textInputLayout.Z();
        EditText Z2 = textInputLayout2.Z();
        if (com.google.android.material.internal.e.a()) {
            Z.setInputType(17);
            Z2.setInputType(17);
        }
        this.f13315o = inflate.getResources().getString(a.m.A0);
        SimpleDateFormat p5 = q.p();
        Long l5 = this.f13317q;
        if (l5 != null) {
            Z.setText(p5.format(l5));
            this.f13319s = this.f13317q;
        }
        Long l6 = this.f13318r;
        if (l6 != null) {
            Z2.setText(p5.format(l6));
            this.f13320t = this.f13318r;
        }
        String q5 = q.q(inflate.getResources(), p5);
        textInputLayout.H2(q5);
        textInputLayout2.H2(q5);
        Z.addTextChangedListener(new a(q5, p5, textInputLayout, calendarConstraints, textInputLayout, textInputLayout2, mVar));
        Z2.addTextChangedListener(new b(q5, p5, textInputLayout2, calendarConstraints, textInputLayout, textInputLayout2, mVar));
        v.o(Z);
        return inflate;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int n0() {
        return a.m.G0;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @o0
    public String o(@o0 Context context) {
        Resources resources = context.getResources();
        Long l5 = this.f13317q;
        if (l5 == null && this.f13318r == null) {
            return resources.getString(a.m.H0);
        }
        Long l6 = this.f13318r;
        if (l6 == null) {
            return resources.getString(a.m.E0, d.d(l5.longValue(), null));
        }
        if (l5 == null) {
            return resources.getString(a.m.D0, d.d(l6.longValue(), null));
        }
        androidx.core.util.m<String, String> b6 = d.b(l5, l6, null);
        return resources.getString(a.m.F0, b6.f5251a, b6.f5252b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i5) {
        parcel.writeValue(this.f13317q);
        parcel.writeValue(this.f13318r);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @o0
    public Collection<androidx.core.util.m<Long, Long>> z() {
        if (this.f13317q == null || this.f13318r == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new androidx.core.util.m(this.f13317q, this.f13318r));
        return arrayList;
    }
}
