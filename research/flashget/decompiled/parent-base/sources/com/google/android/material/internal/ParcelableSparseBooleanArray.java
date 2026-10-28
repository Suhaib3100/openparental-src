package com.google.android.material.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import androidx.annotation.c1;
import androidx.annotation.o0;

@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes6.dex */
public class ParcelableSparseBooleanArray extends SparseBooleanArray implements Parcelable {
    public static final Parcelable.Creator<ParcelableSparseBooleanArray> CREATOR = new a();

    static class a implements Parcelable.Creator<ParcelableSparseBooleanArray> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        @o0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelableSparseBooleanArray createFromParcel(@o0 Parcel parcel) {
            int readInt = parcel.readInt();
            ParcelableSparseBooleanArray parcelableSparseBooleanArray = new ParcelableSparseBooleanArray(readInt);
            int[] iArr = new int[readInt];
            boolean[] zArr = new boolean[readInt];
            parcel.readIntArray(iArr);
            parcel.readBooleanArray(zArr);
            for (int i4 = 0; i4 < readInt; i4++) {
                parcelableSparseBooleanArray.put(iArr[i4], zArr[i4]);
            }
            return parcelableSparseBooleanArray;
        }

        @o0
        public ParcelableSparseBooleanArray[] b(int i4) {
            return new ParcelableSparseBooleanArray[i4];
        }

        @Override // android.os.Parcelable.Creator
        @o0
        public ParcelableSparseBooleanArray[] newArray(int i4) {
            return new ParcelableSparseBooleanArray[i4];
        }
    }

    public ParcelableSparseBooleanArray() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        int[] iArr = new int[size()];
        boolean[] zArr = new boolean[size()];
        for (int i5 = 0; i5 < size(); i5++) {
            iArr[i5] = keyAt(i5);
            zArr[i5] = valueAt(i5);
        }
        parcel.writeInt(size());
        parcel.writeIntArray(iArr);
        parcel.writeBooleanArray(zArr);
    }

    public ParcelableSparseBooleanArray(int i4) {
        super(i4);
    }

    public ParcelableSparseBooleanArray(@o0 SparseBooleanArray sparseBooleanArray) {
        super(sparseBooleanArray.size());
        for (int i4 = 0; i4 < sparseBooleanArray.size(); i4++) {
            put(sparseBooleanArray.keyAt(i4), sparseBooleanArray.valueAt(i4));
        }
    }
}
