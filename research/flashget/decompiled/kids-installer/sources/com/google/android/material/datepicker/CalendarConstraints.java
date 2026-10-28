package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new a();

    /* renamed from: o, reason: collision with root package name */
    @o0
    private final Month f13284o;

    /* renamed from: p, reason: collision with root package name */
    @o0
    private final Month f13285p;

    /* renamed from: q, reason: collision with root package name */
    @o0
    private final DateValidator f13286q;

    /* renamed from: r, reason: collision with root package name */
    @q0
    private Month f13287r;

    /* renamed from: s, reason: collision with root package name */
    private final int f13288s;

    /* renamed from: t, reason: collision with root package name */
    private final int f13289t;

    public interface DateValidator extends Parcelable {
        boolean E0(long j5);
    }

    static class a implements Parcelable.Creator<CalendarConstraints> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        @o0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public CalendarConstraints createFromParcel(@o0 Parcel parcel) {
            return new CalendarConstraints((Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (DateValidator) parcel.readParcelable(DateValidator.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), null);
        }

        @o0
        public CalendarConstraints[] b(int i5) {
            return new CalendarConstraints[i5];
        }

        @Override // android.os.Parcelable.Creator
        @o0
        public CalendarConstraints[] newArray(int i5) {
            return new CalendarConstraints[i5];
        }
    }

    /* synthetic */ CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, a aVar) {
        this(month, month2, dateValidator, month3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    Month e(Month month) {
        return month.compareTo(this.f13284o) < 0 ? this.f13284o : month.compareTo(this.f13285p) > 0 ? this.f13285p : month;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarConstraints)) {
            return false;
        }
        CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
        return this.f13284o.equals(calendarConstraints.f13284o) && this.f13285p.equals(calendarConstraints.f13285p) && androidx.core.util.l.a(this.f13287r, calendarConstraints.f13287r) && this.f13286q.equals(calendarConstraints.f13286q);
    }

    public DateValidator f() {
        return this.f13286q;
    }

    @o0
    Month g() {
        return this.f13285p;
    }

    int h() {
        return this.f13289t;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f13284o, this.f13285p, this.f13287r, this.f13286q});
    }

    @q0
    Month i() {
        return this.f13287r;
    }

    @o0
    Month j() {
        return this.f13284o;
    }

    int k() {
        return this.f13288s;
    }

    boolean l(long j5) {
        if (this.f13284o.q(1) <= j5) {
            Month month = this.f13285p;
            if (j5 <= month.q(month.f13312s)) {
                return true;
            }
        }
        return false;
    }

    void m(@q0 Month month) {
        this.f13287r = month;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        parcel.writeParcelable(this.f13284o, 0);
        parcel.writeParcelable(this.f13285p, 0);
        parcel.writeParcelable(this.f13287r, 0);
        parcel.writeParcelable(this.f13286q, 0);
    }

    private CalendarConstraints(@o0 Month month, @o0 Month month2, @o0 DateValidator dateValidator, @q0 Month month3) {
        this.f13284o = month;
        this.f13285p = month2;
        this.f13287r = month3;
        this.f13286q = dateValidator;
        if (month3 != null && month.compareTo(month3) > 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ሔ"));
        }
        if (month3 != null && month3.compareTo(month2) > 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ሕ"));
        }
        this.f13289t = month.v(month2) + 1;
        this.f13288s = (month2.f13310q - month.f13310q) + 1;
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private long f13293a;

        /* renamed from: b, reason: collision with root package name */
        private long f13294b;

        /* renamed from: c, reason: collision with root package name */
        private Long f13295c;

        /* renamed from: d, reason: collision with root package name */
        private DateValidator f13296d;

        /* renamed from: g, reason: collision with root package name */
        private static final String f13292g = ProtectedSandApp.s("ሒ");

        /* renamed from: e, reason: collision with root package name */
        static final long f13290e = q.a(Month.h(1900, 0).f13313t);

        /* renamed from: f, reason: collision with root package name */
        static final long f13291f = q.a(Month.h(2100, 11).f13313t);

        public b() {
            this.f13293a = f13290e;
            this.f13294b = f13291f;
            this.f13296d = DateValidatorPointForward.a(Long.MIN_VALUE);
        }

        @o0
        public CalendarConstraints a() {
            Bundle bundle = new Bundle();
            DateValidator dateValidator = this.f13296d;
            String s5 = ProtectedSandApp.s("ሓ");
            bundle.putParcelable(s5, dateValidator);
            Month j5 = Month.j(this.f13293a);
            Month j6 = Month.j(this.f13294b);
            DateValidator dateValidator2 = (DateValidator) bundle.getParcelable(s5);
            Long l5 = this.f13295c;
            return new CalendarConstraints(j5, j6, dateValidator2, l5 == null ? null : Month.j(l5.longValue()), null);
        }

        @o0
        public b b(long j5) {
            this.f13294b = j5;
            return this;
        }

        @o0
        public b c(long j5) {
            this.f13295c = Long.valueOf(j5);
            return this;
        }

        @o0
        public b d(long j5) {
            this.f13293a = j5;
            return this;
        }

        @o0
        public b e(@o0 DateValidator dateValidator) {
            this.f13296d = dateValidator;
            return this;
        }

        b(@o0 CalendarConstraints calendarConstraints) {
            this.f13293a = f13290e;
            this.f13294b = f13291f;
            this.f13296d = DateValidatorPointForward.a(Long.MIN_VALUE);
            this.f13293a = calendarConstraints.f13284o.f13313t;
            this.f13294b = calendarConstraints.f13285p.f13313t;
            this.f13295c = Long.valueOf(calendarConstraints.f13287r.f13313t);
            this.f13296d = calendarConstraints.f13286q;
        }
    }
}
