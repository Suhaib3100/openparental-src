package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.g0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Arrays;

/* loaded from: classes6.dex */
class TimeModel implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    private final c f54428b;

    /* renamed from: c, reason: collision with root package name */
    private final c f54429c;

    /* renamed from: d, reason: collision with root package name */
    final int f54430d;

    /* renamed from: e, reason: collision with root package name */
    int f54431e;

    /* renamed from: f, reason: collision with root package name */
    int f54432f;

    /* renamed from: g, reason: collision with root package name */
    int f54433g;

    /* renamed from: h, reason: collision with root package name */
    int f54434h;

    /* renamed from: i, reason: collision with root package name */
    public static final String f54426i = ProtectedSandApp.s("\uf24f");

    /* renamed from: j, reason: collision with root package name */
    public static final String f54427j = ProtectedSandApp.s("\uf250");
    public static final Parcelable.Creator<TimeModel> CREATOR = new a();

    static class a implements Parcelable.Creator<TimeModel> {
        a() {
        }

        public TimeModel a(Parcel parcel) {
            return new TimeModel(parcel);
        }

        public TimeModel[] b(int i4) {
            return new TimeModel[i4];
        }

        @Override // android.os.Parcelable.Creator
        public TimeModel createFromParcel(Parcel parcel) {
            return new TimeModel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public TimeModel[] newArray(int i4) {
            return new TimeModel[i4];
        }
    }

    public TimeModel() {
        this(0);
    }

    public static String a(Resources resources, CharSequence charSequence) {
        return b(resources, charSequence, ProtectedSandApp.s("\uf24f"));
    }

    public static String b(Resources resources, CharSequence charSequence, String str) {
        return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
    }

    private static int f(int i4) {
        return i4 >= 12 ? 1 : 0;
    }

    public int c() {
        if (this.f54430d == 1) {
            return this.f54431e % 24;
        }
        int i4 = this.f54431e;
        if (i4 % 12 == 0) {
            return 12;
        }
        return this.f54434h == 1 ? i4 - 12 : i4;
    }

    public c d() {
        return this.f54429c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public c e() {
        return this.f54428b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeModel)) {
            return false;
        }
        TimeModel timeModel = (TimeModel) obj;
        return this.f54431e == timeModel.f54431e && this.f54432f == timeModel.f54432f && this.f54430d == timeModel.f54430d && this.f54433g == timeModel.f54433g;
    }

    public void g(int i4) {
        if (this.f54430d == 1) {
            this.f54431e = i4;
        } else {
            this.f54431e = (i4 % 12) + (this.f54434h != 1 ? 0 : 12);
        }
    }

    public void h(int i4) {
        this.f54434h = f(i4);
        this.f54431e = i4;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f54430d), Integer.valueOf(this.f54431e), Integer.valueOf(this.f54432f), Integer.valueOf(this.f54433g)});
    }

    public void j(@g0(from = 0, to = 60) int i4) {
        this.f54432f = i4 % 60;
    }

    public void k(int i4) {
        if (i4 != this.f54434h) {
            this.f54434h = i4;
            int i5 = this.f54431e;
            if (i5 < 12 && i4 == 1) {
                this.f54431e = i5 + 12;
            } else {
                if (i5 < 12 || i4 != 0) {
                    return;
                }
                this.f54431e = i5 - 12;
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f54431e);
        parcel.writeInt(this.f54432f);
        parcel.writeInt(this.f54433g);
        parcel.writeInt(this.f54430d);
    }

    public TimeModel(int i4) {
        this(0, 0, 10, i4);
    }

    public TimeModel(int i4, int i5, int i6, int i7) {
        this.f54431e = i4;
        this.f54432f = i5;
        this.f54433g = i6;
        this.f54430d = i7;
        this.f54434h = f(i4);
        this.f54428b = new c(59);
        this.f54429c = new c(i7 == 1 ? 24 : 12);
    }

    protected TimeModel(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}
