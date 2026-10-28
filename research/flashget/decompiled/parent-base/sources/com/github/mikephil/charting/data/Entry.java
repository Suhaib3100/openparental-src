package com.github.mikephil.charting.data;

import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.ParcelFormatException;
import android.os.Parcelable;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* loaded from: classes5.dex */
public class Entry extends f implements Parcelable {
    public static final Parcelable.Creator<Entry> CREATOR = new a();

    /* renamed from: e, reason: collision with root package name */
    private float f50351e;

    static class a implements Parcelable.Creator<Entry> {
        a() {
        }

        public Entry a(Parcel parcel) {
            return new Entry(parcel);
        }

        public Entry[] b(int i4) {
            return new Entry[i4];
        }

        @Override // android.os.Parcelable.Creator
        public Entry createFromParcel(Parcel parcel) {
            return new Entry(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Entry[] newArray(int i4) {
            return new Entry[i4];
        }
    }

    public Entry() {
        this.f50351e = 0.0f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Entry g() {
        return new Entry(this.f50351e, c(), a());
    }

    public boolean h(Entry entry) {
        if (entry == null || entry.a() != a()) {
            return false;
        }
        float abs = Math.abs(entry.f50351e - this.f50351e);
        float f4 = com.github.mikephil.charting.utils.k.f50664g;
        return abs <= f4 && Math.abs(entry.c() - c()) <= f4;
    }

    public float j() {
        return this.f50351e;
    }

    public void k(float f4) {
        this.f50351e = f4;
    }

    public String toString() {
        return ProtectedSandApp.s("쐘") + this.f50351e + ProtectedSandApp.s("쐙") + c();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeFloat(this.f50351e);
        parcel.writeFloat(c());
        if (a() == null) {
            parcel.writeInt(0);
        } else {
            if (!(a() instanceof Parcelable)) {
                throw new ParcelFormatException(ProtectedSandApp.s("쐚"));
            }
            parcel.writeInt(1);
            parcel.writeParcelable((Parcelable) a(), i4);
        }
    }

    public Entry(float f4, float f5) {
        super(f5);
        this.f50351e = f4;
    }

    public Entry(float f4, float f5, Object obj) {
        super(f5, obj);
        this.f50351e = f4;
    }

    public Entry(float f4, float f5, Drawable drawable) {
        super(f5, drawable);
        this.f50351e = f4;
    }

    public Entry(float f4, float f5, Drawable drawable, Object obj) {
        super(f5, drawable, obj);
        this.f50351e = f4;
    }

    protected Entry(Parcel parcel) {
        this.f50351e = 0.0f;
        this.f50351e = parcel.readFloat();
        f(parcel.readFloat());
        if (parcel.readInt() == 1) {
            d(parcel.readParcelable(Object.class.getClassLoader()));
        }
    }
}
