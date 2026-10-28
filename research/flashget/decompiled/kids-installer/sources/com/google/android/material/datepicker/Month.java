package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* loaded from: classes2.dex */
final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new a();

    /* renamed from: o, reason: collision with root package name */
    @o0
    private final Calendar f13308o;

    /* renamed from: p, reason: collision with root package name */
    final int f13309p;

    /* renamed from: q, reason: collision with root package name */
    final int f13310q;

    /* renamed from: r, reason: collision with root package name */
    final int f13311r;

    /* renamed from: s, reason: collision with root package name */
    final int f13312s;

    /* renamed from: t, reason: collision with root package name */
    final long f13313t;

    /* renamed from: u, reason: collision with root package name */
    @q0
    private String f13314u;

    static class a implements Parcelable.Creator<Month> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        @o0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Month createFromParcel(@o0 Parcel parcel) {
            return Month.h(parcel.readInt(), parcel.readInt());
        }

        @o0
        public Month[] b(int i5) {
            return new Month[i5];
        }

        @Override // android.os.Parcelable.Creator
        @o0
        public Month[] newArray(int i5) {
            return new Month[i5];
        }
    }

    private Month(@o0 Calendar calendar) {
        calendar.set(5, 1);
        Calendar f6 = q.f(calendar);
        this.f13308o = f6;
        this.f13309p = f6.get(2);
        this.f13310q = f6.get(1);
        this.f13311r = f6.getMaximum(7);
        this.f13312s = f6.getActualMaximum(5);
        this.f13313t = f6.getTimeInMillis();
    }

    @o0
    static Month h(int i5, int i6) {
        Calendar v5 = q.v();
        v5.set(1, i5);
        v5.set(2, i6);
        return new Month(v5);
    }

    @o0
    static Month j(long j5) {
        Calendar v5 = q.v();
        v5.setTimeInMillis(j5);
        return new Month(v5);
    }

    @o0
    static Month l() {
        return new Month(q.t());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        return this.f13309p == month.f13309p && this.f13310q == month.f13310q;
    }

    @Override // java.lang.Comparable
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public int compareTo(@o0 Month month) {
        return this.f13308o.compareTo(month.f13308o);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f13309p), Integer.valueOf(this.f13310q)});
    }

    int p() {
        int firstDayOfWeek = this.f13308o.get(7) - this.f13308o.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.f13311r : firstDayOfWeek;
    }

    long q(int i5) {
        Calendar f6 = q.f(this.f13308o);
        f6.set(5, i5);
        return f6.getTimeInMillis();
    }

    int r(long j5) {
        Calendar f6 = q.f(this.f13308o);
        f6.setTimeInMillis(j5);
        return f6.get(5);
    }

    @o0
    String s(Context context) {
        if (this.f13314u == null) {
            this.f13314u = d.i(context, this.f13308o.getTimeInMillis());
        }
        return this.f13314u;
    }

    long t() {
        return this.f13308o.getTimeInMillis();
    }

    @o0
    Month u(int i5) {
        Calendar f6 = q.f(this.f13308o);
        f6.add(2, i5);
        return new Month(f6);
    }

    int v(@o0 Month month) {
        if (!(this.f13308o instanceof GregorianCalendar)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ሗ"));
        }
        return (month.f13309p - this.f13309p) + ((month.f13310q - this.f13310q) * 12);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i5) {
        parcel.writeInt(this.f13310q);
        parcel.writeInt(this.f13309p);
    }
}
