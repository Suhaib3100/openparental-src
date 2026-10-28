package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.o0;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.Arrays;

/* loaded from: classes6.dex */
public class DateValidatorPointForward implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator<DateValidatorPointForward> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    private final long f53057b;

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
        public DateValidatorPointForward[] b(int i4) {
            return new DateValidatorPointForward[i4];
        }

        @Override // android.os.Parcelable.Creator
        @o0
        public DateValidatorPointForward[] newArray(int i4) {
            return new DateValidatorPointForward[i4];
        }
    }

    /* synthetic */ DateValidatorPointForward(long j4, a aVar) {
        this(j4);
    }

    @o0
    public static DateValidatorPointForward a(long j4) {
        return new DateValidatorPointForward(j4);
    }

    @o0
    public static DateValidatorPointForward b() {
        return new DateValidatorPointForward(q.t().getTimeInMillis());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DateValidatorPointForward) && this.f53057b == ((DateValidatorPointForward) obj).f53057b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f53057b)});
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    public boolean j1(long j4) {
        return j4 >= this.f53057b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        parcel.writeLong(this.f53057b);
    }

    private DateValidatorPointForward(long j4) {
        this.f53057b = j4;
    }
}
