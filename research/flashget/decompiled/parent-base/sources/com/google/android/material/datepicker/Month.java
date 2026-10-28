package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* loaded from: classes6.dex */
final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @o0
    private final Calendar f53061b;

    /* renamed from: c, reason: collision with root package name */
    final int f53062c;

    /* renamed from: d, reason: collision with root package name */
    final int f53063d;

    /* renamed from: e, reason: collision with root package name */
    final int f53064e;

    /* renamed from: f, reason: collision with root package name */
    final int f53065f;

    /* renamed from: g, reason: collision with root package name */
    final long f53066g;

    /* renamed from: h, reason: collision with root package name */
    @q0
    private String f53067h;

    static class a implements Parcelable.Creator<Month> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        @o0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Month createFromParcel(@o0 Parcel parcel) {
            return Month.b(parcel.readInt(), parcel.readInt());
        }

        @o0
        public Month[] b(int i4) {
            return new Month[i4];
        }

        @Override // android.os.Parcelable.Creator
        @o0
        public Month[] newArray(int i4) {
            return new Month[i4];
        }
    }

    private Month(@o0 Calendar calendar) {
        calendar.set(5, 1);
        Calendar f4 = q.f(calendar);
        this.f53061b = f4;
        this.f53062c = f4.get(2);
        this.f53063d = f4.get(1);
        this.f53064e = f4.getMaximum(7);
        this.f53065f = f4.getActualMaximum(5);
        this.f53066g = f4.getTimeInMillis();
    }

    @o0
    static Month b(int i4, int i5) {
        Calendar v4 = q.v();
        v4.set(1, i4);
        v4.set(2, i5);
        return new Month(v4);
    }

    @o0
    static Month c(long j4) {
        Calendar v4 = q.v();
        v4.setTimeInMillis(j4);
        return new Month(v4);
    }

    @o0
    static Month d() {
        return new Month(q.t());
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(@o0 Month month) {
        return this.f53061b.compareTo(month.f53061b);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    int e() {
        int firstDayOfWeek = this.f53061b.get(7) - this.f53061b.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.f53064e : firstDayOfWeek;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        return this.f53062c == month.f53062c && this.f53063d == month.f53063d;
    }

    long f(int i4) {
        Calendar f4 = q.f(this.f53061b);
        f4.set(5, i4);
        return f4.getTimeInMillis();
    }

    int g(long j4) {
        Calendar f4 = q.f(this.f53061b);
        f4.setTimeInMillis(j4);
        return f4.get(5);
    }

    @o0
    String h(Context context) {
        if (this.f53067h == null) {
            this.f53067h = d.i(context, this.f53061b.getTimeInMillis());
        }
        return this.f53067h;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f53062c), Integer.valueOf(this.f53063d)});
    }

    long j() {
        return this.f53061b.getTimeInMillis();
    }

    @o0
    Month k(int i4) {
        Calendar f4 = q.f(this.f53061b);
        f4.add(2, i4);
        return new Month(f4);
    }

    int n(@o0 Month month) {
        if (!(this.f53061b instanceof GregorianCalendar)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("\uf195"));
        }
        return (month.f53062c - this.f53062c) + ((month.f53063d - this.f53063d) * 12);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        parcel.writeInt(this.f53063d);
        parcel.writeInt(this.f53062c);
    }
}
