package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.o0;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class DateValidatorPointForward implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator<DateValidatorPointForward> CREATOR = new a();

    /* renamed from: o, reason: collision with root package name */
    private final long f13304o;

    /* loaded from: classes2.dex */
    static class a implements Parcelable.Creator<DateValidatorPointForward> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        @o0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public DateValidatorPointForward createFromParcel(@o0 Parcel parcel) {
            return new DateValidatorPointForward(parcel.readLong(), null);
        }

        @o0
        public DateValidatorPointForward[] b(int i5) {
            return new DateValidatorPointForward[i5];
        }

        @Override // android.os.Parcelable.Creator
        @o0
        public DateValidatorPointForward[] newArray(int i5) {
            return new DateValidatorPointForward[i5];
        }
    }

    /* synthetic */ DateValidatorPointForward(long j5, a aVar) {
        this(j5);
    }

    @o0
    public static DateValidatorPointForward a(long j5) {
        return new DateValidatorPointForward(j5);
    }

    @o0
    public static DateValidatorPointForward b() {
        return new DateValidatorPointForward(q.t().getTimeInMillis());
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    public boolean E0(long j5) {
        return j5 >= this.f13304o;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DateValidatorPointForward) && this.f13304o == ((DateValidatorPointForward) obj).f13304o;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f13304o)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i5) {
        parcel.writeLong(this.f13304o);
    }

    private DateValidatorPointForward(long j5) {
        this.f13304o = j5;
    }
}
