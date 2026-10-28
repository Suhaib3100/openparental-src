package com.google.android.material.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;

@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes6.dex */
public class ParcelableSparseArray extends SparseArray<Parcelable> implements Parcelable {
    public static final Parcelable.Creator<ParcelableSparseArray> CREATOR = new a();

    static class a implements Parcelable.ClassLoaderCreator<ParcelableSparseArray> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        @q0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelableSparseArray createFromParcel(@o0 Parcel parcel) {
            return new ParcelableSparseArray(parcel, null);
        }

        @o0
        public ParcelableSparseArray b(@o0 Parcel parcel, ClassLoader classLoader) {
            return new ParcelableSparseArray(parcel, classLoader);
        }

        @o0
        public ParcelableSparseArray[] c(int i4) {
            return new ParcelableSparseArray[i4];
        }

        @Override // android.os.Parcelable.Creator
        @o0
        public Object[] newArray(int i4) {
            return new ParcelableSparseArray[i4];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        @o0
        public ParcelableSparseArray createFromParcel(@o0 Parcel parcel, ClassLoader classLoader) {
            return new ParcelableSparseArray(parcel, classLoader);
        }
    }

    public ParcelableSparseArray() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        int size = size();
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i5 = 0; i5 < size; i5++) {
            iArr[i5] = keyAt(i5);
            parcelableArr[i5] = valueAt(i5);
        }
        parcel.writeInt(size);
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i4);
    }

    public ParcelableSparseArray(@o0 Parcel parcel, @q0 ClassLoader classLoader) {
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        for (int i4 = 0; i4 < readInt; i4++) {
            put(iArr[i4], readParcelableArray[i4]);
        }
    }
}
