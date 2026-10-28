package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.o0;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class CompositeDateValidator implements CalendarConstraints.DateValidator {

    /* renamed from: q, reason: collision with root package name */
    private static final int f13297q = 1;

    /* renamed from: r, reason: collision with root package name */
    private static final int f13298r = 2;

    /* renamed from: o, reason: collision with root package name */
    @o0
    private final d f13301o;

    /* renamed from: p, reason: collision with root package name */
    @o0
    private final List<CalendarConstraints.DateValidator> f13302p;

    /* renamed from: s, reason: collision with root package name */
    private static final d f13299s = new a();

    /* renamed from: t, reason: collision with root package name */
    private static final d f13300t = new b();
    public static final Parcelable.Creator<CompositeDateValidator> CREATOR = new c();

    static class a implements d {
        a() {
        }

        @Override // com.google.android.material.datepicker.CompositeDateValidator.d
        public boolean a(@o0 List<CalendarConstraints.DateValidator> list, long j5) {
            for (CalendarConstraints.DateValidator dateValidator : list) {
                if (dateValidator != null && dateValidator.E0(j5)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.android.material.datepicker.CompositeDateValidator.d
        public int getId() {
            return 1;
        }
    }

    static class b implements d {
        b() {
        }

        @Override // com.google.android.material.datepicker.CompositeDateValidator.d
        public boolean a(@o0 List<CalendarConstraints.DateValidator> list, long j5) {
            for (CalendarConstraints.DateValidator dateValidator : list) {
                if (dateValidator != null && !dateValidator.E0(j5)) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.android.material.datepicker.CompositeDateValidator.d
        public int getId() {
            return 2;
        }
    }

    /* loaded from: classes2.dex */
    static class c implements Parcelable.Creator<CompositeDateValidator> {
        c() {
        }

        @Override // android.os.Parcelable.Creator
        @o0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public CompositeDateValidator createFromParcel(@o0 Parcel parcel) {
            ArrayList readArrayList = parcel.readArrayList(CalendarConstraints.DateValidator.class.getClassLoader());
            int readInt = parcel.readInt();
            d dVar = readInt == 2 ? CompositeDateValidator.f13300t : readInt == 1 ? CompositeDateValidator.f13299s : CompositeDateValidator.f13300t;
            readArrayList.getClass();
            return new CompositeDateValidator(readArrayList, dVar, null);
        }

        @o0
        public CompositeDateValidator[] b(int i5) {
            return new CompositeDateValidator[i5];
        }

        @Override // android.os.Parcelable.Creator
        @o0
        public CompositeDateValidator[] newArray(int i5) {
            return new CompositeDateValidator[i5];
        }
    }

    /* loaded from: classes2.dex */
    private interface d {
        boolean a(@o0 List<CalendarConstraints.DateValidator> list, long j5);

        int getId();
    }

    /* synthetic */ CompositeDateValidator(List list, d dVar, a aVar) {
        this(list, dVar);
    }

    @o0
    public static CalendarConstraints.DateValidator c(@o0 List<CalendarConstraints.DateValidator> list) {
        return new CompositeDateValidator(list, f13300t);
    }

    @o0
    public static CalendarConstraints.DateValidator d(@o0 List<CalendarConstraints.DateValidator> list) {
        return new CompositeDateValidator(list, f13299s);
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    public boolean E0(long j5) {
        return this.f13301o.a(this.f13302p, j5);
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
        return this.f13302p.equals(compositeDateValidator.f13302p) && this.f13301o.getId() == compositeDateValidator.f13301o.getId();
    }

    public int hashCode() {
        return this.f13302p.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i5) {
        parcel.writeList(this.f13302p);
        parcel.writeInt(this.f13301o.getId());
    }

    private CompositeDateValidator(@o0 List<CalendarConstraints.DateValidator> list, d dVar) {
        this.f13302p = list;
        this.f13301o = dVar;
    }
}
