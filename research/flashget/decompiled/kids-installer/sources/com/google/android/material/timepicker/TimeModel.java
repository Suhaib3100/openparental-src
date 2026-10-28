package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.g0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Arrays;

/* loaded from: classes2.dex */
class TimeModel implements Parcelable {

    /* renamed from: o, reason: collision with root package name */
    private final c f14585o;

    /* renamed from: p, reason: collision with root package name */
    private final c f14586p;

    /* renamed from: q, reason: collision with root package name */
    final int f14587q;

    /* renamed from: r, reason: collision with root package name */
    int f14588r;

    /* renamed from: s, reason: collision with root package name */
    int f14589s;

    /* renamed from: t, reason: collision with root package name */
    int f14590t;

    /* renamed from: u, reason: collision with root package name */
    int f14591u;

    /* renamed from: v, reason: collision with root package name */
    public static final String f14583v = ProtectedSandApp.s("ኄ");

    /* renamed from: w, reason: collision with root package name */
    public static final String f14584w = ProtectedSandApp.s("ኅ");
    public static final Parcelable.Creator<TimeModel> CREATOR = new a();

    static class a implements Parcelable.Creator<TimeModel> {
        a() {
        }

        public TimeModel a(Parcel parcel) {
            return new TimeModel(parcel);
        }

        public TimeModel[] b(int i5) {
            return new TimeModel[i5];
        }

        @Override // android.os.Parcelable.Creator
        public TimeModel createFromParcel(Parcel parcel) {
            return new TimeModel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public TimeModel[] newArray(int i5) {
            return new TimeModel[i5];
        }
    }

    public TimeModel() {
        this(0);
    }

    public static String a(Resources resources, CharSequence charSequence) {
        return b(resources, charSequence, ProtectedSandApp.s("ኆ"));
    }

    public static String b(Resources resources, CharSequence charSequence, String str) {
        return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
    }

    private static int f(int i5) {
        return i5 >= 12 ? 1 : 0;
    }

    public int c() {
        if (this.f14587q == 1) {
            return this.f14588r % 24;
        }
        int i5 = this.f14588r;
        if (i5 % 12 == 0) {
            return 12;
        }
        return this.f14591u == 1 ? i5 - 12 : i5;
    }

    public c d() {
        return this.f14586p;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public c e() {
        return this.f14585o;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeModel)) {
            return false;
        }
        TimeModel timeModel = (TimeModel) obj;
        return this.f14588r == timeModel.f14588r && this.f14589s == timeModel.f14589s && this.f14587q == timeModel.f14587q && this.f14590t == timeModel.f14590t;
    }

    public void g(int i5) {
        if (this.f14587q == 1) {
            this.f14588r = i5;
        } else {
            this.f14588r = (i5 % 12) + (this.f14591u != 1 ? 0 : 12);
        }
    }

    public void h(int i5) {
        this.f14591u = f(i5);
        this.f14588r = i5;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f14587q), Integer.valueOf(this.f14588r), Integer.valueOf(this.f14589s), Integer.valueOf(this.f14590t)});
    }

    public void i(@g0(from = 0, to = 60) int i5) {
        this.f14589s = i5 % 60;
    }

    public void j(int i5) {
        if (i5 != this.f14591u) {
            this.f14591u = i5;
            int i6 = this.f14588r;
            if (i6 < 12 && i5 == 1) {
                this.f14588r = i6 + 12;
            } else {
                if (i6 < 12 || i5 != 0) {
                    return;
                }
                this.f14588r = i6 - 12;
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        parcel.writeInt(this.f14588r);
        parcel.writeInt(this.f14589s);
        parcel.writeInt(this.f14590t);
        parcel.writeInt(this.f14587q);
    }

    public TimeModel(int i5) {
        this(0, 0, 10, i5);
    }

    public TimeModel(int i5, int i6, int i7, int i8) {
        this.f14588r = i5;
        this.f14589s = i6;
        this.f14590t = i7;
        this.f14587q = i8;
        this.f14591u = f(i5);
        this.f14585o = new c(59);
        this.f14586p = new c(i8 == 1 ? 24 : 12);
    }

    protected TimeModel(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}
