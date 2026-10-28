package com.google.android.material.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;
import androidx.annotation.c1;
import androidx.annotation.o0;

@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes6.dex */
public class ParcelableSparseIntArray extends SparseIntArray implements Parcelable {
    public static final Parcelable.Creator<ParcelableSparseIntArray> CREATOR = new a();

    static class a implements Parcelable.Creator<ParcelableSparseIntArray> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        @o0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelableSparseIntArray createFromParcel(@o0 Parcel parcel) {
            int readInt = parcel.readInt();
            ParcelableSparseIntArray parcelableSparseIntArray = new ParcelableSparseIntArray(readInt);
            int[] iArr = new int[readInt];
            int[] iArr2 = new int[readInt];
            parcel.readIntArray(iArr);
            parcel.readIntArray(iArr2);
            for (int i4 = 0; i4 < readInt; i4++) {
                parcelableSparseIntArray.put(iArr[i4], iArr2[i4]);
            }
            return parcelableSparseIntArray;
        }

        @o0
        public ParcelableSparseIntArray[] b(int i4) {
            return new ParcelableSparseIntArray[i4];
        }

        @Override // android.os.Parcelable.Creator
        @o0
        public ParcelableSparseIntArray[] newArray(int i4) {
            return new ParcelableSparseIntArray[i4];
        }
    }

    public ParcelableSparseIntArray() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        int[] iArr = new int[size()];
        int[] iArr2 = new int[size()];
        for (int i5 = 0; i5 < size(); i5++) {
            iArr[i5] = keyAt(i5);
            iArr2[i5] = valueAt(i5);
        }
        parcel.writeInt(size());
        parcel.writeIntArray(iArr);
        parcel.writeIntArray(iArr2);
    }

    public ParcelableSparseIntArray(int i4) {
        super(i4);
    }

    public ParcelableSparseIntArray(@o0 SparseIntArray sparseIntArray) {
        for (int i4 = 0; i4 < sparseIntArray.size(); i4++) {
            put(sparseIntArray.keyAt(i4), sparseIntArray.valueAt(i4));
        }
    }
}
