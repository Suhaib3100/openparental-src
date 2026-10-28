package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @o0
    private final Month f53037b;

    /* renamed from: c, reason: collision with root package name */
    @o0
    private final Month f53038c;

    /* renamed from: d, reason: collision with root package name */
    @o0
    private final DateValidator f53039d;

    /* renamed from: e, reason: collision with root package name */
    @q0
    private Month f53040e;

    /* renamed from: f, reason: collision with root package name */
    private final int f53041f;

    /* renamed from: g, reason: collision with root package name */
    private final int f53042g;

    public interface DateValidator extends Parcelable {
        boolean j1(long j4);
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
        public CalendarConstraints[] b(int i4) {
            return new CalendarConstraints[i4];
        }

        @Override // android.os.Parcelable.Creator
        @o0
        public CalendarConstraints[] newArray(int i4) {
            return new CalendarConstraints[i4];
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
        return month.compareTo(this.f53037b) < 0 ? this.f53037b : month.compareTo(this.f53038c) > 0 ? this.f53038c : month;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarConstraints)) {
            return false;
        }
        CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
        return this.f53037b.equals(calendarConstraints.f53037b) && this.f53038c.equals(calendarConstraints.f53038c) && Objects.equals(this.f53040e, calendarConstraints.f53040e) && this.f53039d.equals(calendarConstraints.f53039d);
    }

    public DateValidator f() {
        return this.f53039d;
    }

    @o0
    Month g() {
        return this.f53038c;
    }

    int h() {
        return this.f53042g;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f53037b, this.f53038c, this.f53040e, this.f53039d});
    }

    @q0
    Month j() {
        return this.f53040e;
    }

    @o0
    Month k() {
        return this.f53037b;
    }

    int n() {
        return this.f53041f;
    }

    boolean o(long j4) {
        if (this.f53037b.f(1) <= j4) {
            Month month = this.f53038c;
            if (j4 <= month.f(month.f53065f)) {
                return true;
            }
        }
        return false;
    }

    void p(@q0 Month month) {
        this.f53040e = month;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeParcelable(this.f53037b, 0);
        parcel.writeParcelable(this.f53038c, 0);
        parcel.writeParcelable(this.f53040e, 0);
        parcel.writeParcelable(this.f53039d, 0);
    }

    private CalendarConstraints(@o0 Month month, @o0 Month month2, @o0 DateValidator dateValidator, @q0 Month month3) {
        this.f53037b = month;
        this.f53038c = month2;
        this.f53040e = month3;
        this.f53039d = dateValidator;
        if (month3 != null && month.compareTo(month3) > 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("\uf192"));
        }
        if (month3 != null && month3.compareTo(month2) > 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("\uf193"));
        }
        this.f53042g = month.n(month2) + 1;
        this.f53041f = (month2.f53063d - month.f53063d) + 1;
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private long f53046a;

        /* renamed from: b, reason: collision with root package name */
        private long f53047b;

        /* renamed from: c, reason: collision with root package name */
        private Long f53048c;

        /* renamed from: d, reason: collision with root package name */
        private DateValidator f53049d;

        /* renamed from: g, reason: collision with root package name */
        private static final String f53045g = ProtectedSandApp.s("\uf191");

        /* renamed from: e, reason: collision with root package name */
        static final long f53043e = q.a(Month.b(1900, 0).f53066g);

        /* renamed from: f, reason: collision with root package name */
        static final long f53044f = q.a(Month.b(2100, 11).f53066g);

        public b() {
            this.f53046a = f53043e;
            this.f53047b = f53044f;
            this.f53049d = DateValidatorPointForward.a(Long.MIN_VALUE);
        }

        @o0
        public CalendarConstraints a() {
            Bundle bundle = new Bundle();
            DateValidator dateValidator = this.f53049d;
            String s4 = ProtectedSandApp.s("\uf191");
            bundle.putParcelable(s4, dateValidator);
            Month c5 = Month.c(this.f53046a);
            Month c6 = Month.c(this.f53047b);
            DateValidator dateValidator2 = (DateValidator) bundle.getParcelable(s4);
            Long l4 = this.f53048c;
            return new CalendarConstraints(c5, c6, dateValidator2, l4 == null ? null : Month.c(l4.longValue()), null);
        }

        @o0
        public b b(long j4) {
            this.f53047b = j4;
            return this;
        }

        @o0
        public b c(long j4) {
            this.f53048c = Long.valueOf(j4);
            return this;
        }

        @o0
        public b d(long j4) {
            this.f53046a = j4;
            return this;
        }

        @o0
        public b e(@o0 DateValidator dateValidator) {
            this.f53049d = dateValidator;
            return this;
        }

        b(@o0 CalendarConstraints calendarConstraints) {
            this.f53046a = f53043e;
            this.f53047b = f53044f;
            this.f53049d = DateValidatorPointForward.a(Long.MIN_VALUE);
            this.f53046a = calendarConstraints.f53037b.f53066g;
            this.f53047b = calendarConstraints.f53038c.f53066g;
            this.f53048c = Long.valueOf(calendarConstraints.f53040e.f53066g);
            this.f53049d = calendarConstraints.f53039d;
        }
    }
}
