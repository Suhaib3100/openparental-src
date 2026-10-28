package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.o0;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class DateValidatorPointBackward implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator<DateValidatorPointBackward> CREATOR = new a();

    /* renamed from: o, reason: collision with root package name */
    private final long f13303o;

    /* loaded from: classes2.dex */
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
        public DateValidatorPointBackward[] b(int i5) {
            return new DateValidatorPointBackward[i5];
        }

        @Override // android.os.Parcelable.Creator
        @o0
        public DateValidatorPointBackward[] newArray(int i5) {
            return new DateValidatorPointBackward[i5];
        }
    }

    /* synthetic */ DateValidatorPointBackward(long j5, a aVar) {
        this(j5);
    }

    @o0
    public static DateValidatorPointBackward a(long j5) {
        return new DateValidatorPointBackward(j5);
    }

    @o0
    public static DateValidatorPointBackward b() {
        return new DateValidatorPointBackward(q.t().getTimeInMillis());
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    public boolean E0(long j5) {
        return j5 <= this.f13303o;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DateValidatorPointBackward) && this.f13303o == ((DateValidatorPointBackward) obj).f13303o;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f13303o)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i5) {
        parcel.writeLong(this.f13303o);
    }

    private DateValidatorPointBackward(long j5) {
        this.f13303o = j5;
    }
}
