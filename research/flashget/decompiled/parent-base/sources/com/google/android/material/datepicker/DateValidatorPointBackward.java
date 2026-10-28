package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.o0;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.Arrays;

/* loaded from: classes6.dex */
public class DateValidatorPointBackward implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator<DateValidatorPointBackward> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    private final long f53056b;

    static class a implements Parcelable.Creator<DateValidatorPointBackward> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        @o0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public DateValidatorPointBackward createFromParcel(@o0 Parcel parcel) {
            return new DateValidatorPointBackward(parcel.readLong(), null);
        }

        @o0
        public DateValidatorPointBackward[] b(int i4) {
            return new DateValidatorPointBackward[i4];
        }

        @Override // android.os.Parcelable.Creator
        @o0
        public DateValidatorPointBackward[] newArray(int i4) {
            return new DateValidatorPointBackward[i4];
        }
    }

    /* synthetic */ DateValidatorPointBackward(long j4, a aVar) {
        this(j4);
    }

    @o0
    public static DateValidatorPointBackward a(long j4) {
        return new DateValidatorPointBackward(j4);
    }

    @o0
    public static DateValidatorPointBackward b() {
        return new DateValidatorPointBackward(q.t().getTimeInMillis());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DateValidatorPointBackward) && this.f53056b == ((DateValidatorPointBackward) obj).f53056b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f53056b)});
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    public boolean j1(long j4) {
        return j4 <= this.f53056b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        parcel.writeLong(this.f53056b);
    }

    private DateValidatorPointBackward(long j4) {
        this.f53056b = j4;
    }
}
