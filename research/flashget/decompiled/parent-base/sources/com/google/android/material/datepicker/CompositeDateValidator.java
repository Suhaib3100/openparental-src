package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.o0;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class CompositeDateValidator implements CalendarConstraints.DateValidator {

    /* renamed from: d, reason: collision with root package name */
    private static final int f53050d = 1;

    /* renamed from: e, reason: collision with root package name */
    private static final int f53051e = 2;

    /* renamed from: b, reason: collision with root package name */
    @o0
    private final d f53054b;

    /* renamed from: c, reason: collision with root package name */
    @o0
    private final List<CalendarConstraints.DateValidator> f53055c;

    /* renamed from: f, reason: collision with root package name */
    private static final d f53052f = new a();

    /* renamed from: g, reason: collision with root package name */
    private static final d f53053g = new b();
    public static final Parcelable.Creator<CompositeDateValidator> CREATOR = new c();

    static class a implements d {
        a() {
        }

        @Override // com.google.android.material.datepicker.CompositeDateValidator.d
        public int a() {
            return 1;
        }

        @Override // com.google.android.material.datepicker.CompositeDateValidator.d
        public boolean b(@o0 List<CalendarConstraints.DateValidator> list, long j4) {
            for (CalendarConstraints.DateValidator dateValidator : list) {
                if (dateValidator != null && dateValidator.j1(j4)) {
                    return true;
                }
            }
            return false;
        }
    }

    static class b implements d {
        b() {
        }

        @Override // com.google.android.material.datepicker.CompositeDateValidator.d
        public int a() {
            return 2;
        }

        @Override // com.google.android.material.datepicker.CompositeDateValidator.d
        public boolean b(@o0 List<CalendarConstraints.DateValidator> list, long j4) {
            for (CalendarConstraints.DateValidator dateValidator : list) {
                if (dateValidator != null && !dateValidator.j1(j4)) {
                    return false;
                }
            }
            return true;
        }
    }

    static class c implements Parcelable.Creator<CompositeDateValidator> {
        c() {
        }

        @Override // android.os.Parcelable.Creator
        @o0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public CompositeDateValidator createFromParcel(@o0 Parcel parcel) {
            ArrayList readArrayList = parcel.readArrayList(CalendarConstraints.DateValidator.class.getClassLoader());
            int readInt = parcel.readInt();
            d dVar = readInt == 2 ? CompositeDateValidator.f53053g : readInt == 1 ? CompositeDateValidator.f53052f : CompositeDateValidator.f53053g;
            readArrayList.getClass();
            return new CompositeDateValidator(readArrayList, dVar, null);
        }

        @o0
        public CompositeDateValidator[] b(int i4) {
            return new CompositeDateValidator[i4];
        }

        @Override // android.os.Parcelable.Creator
        @o0
        public CompositeDateValidator[] newArray(int i4) {
            return new CompositeDateValidator[i4];
        }
    }

    private interface d {
        int a();

        boolean b(@o0 List<CalendarConstraints.DateValidator> list, long j4);
    }

    /* synthetic */ CompositeDateValidator(List list, d dVar, a aVar) {
        this(list, dVar);
    }

    @o0
    public static CalendarConstraints.DateValidator c(@o0 List<CalendarConstraints.DateValidator> list) {
        return new CompositeDateValidator(list, f53053g);
    }

    @o0
    public static CalendarConstraints.DateValidator d(@o0 List<CalendarConstraints.DateValidator> list) {
        return new CompositeDateValidator(list, f53052f);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompositeDateValidator)) {
            return false;
        }
        CompositeDateValidator compositeDateValidator = (CompositeDateValidator) obj;
        return this.f53055c.equals(compositeDateValidator.f53055c) && this.f53054b.a() == compositeDateValidator.f53054b.a();
    }

    public int hashCode() {
        return this.f53055c.hashCode();
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    public boolean j1(long j4) {
        return this.f53054b.b(this.f53055c, j4);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        parcel.writeList(this.f53055c);
        parcel.writeInt(this.f53054b.a());
    }

    private CompositeDateValidator(@o0 List<CalendarConstraints.DateValidator> list, d dVar) {
        this.f53055c = list;
        this.f53054b = dVar;
    }
}
