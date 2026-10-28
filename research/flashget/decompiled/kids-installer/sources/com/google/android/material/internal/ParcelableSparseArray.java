package com.google.android.material.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;

@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes2.dex */
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
        public ParcelableSparseArray[] c(int i5) {
            return new ParcelableSparseArray[i5];
        }

        @Override // android.os.Parcelable.Creator
        @o0
        public Object[] newArray(int i5) {
            return new ParcelableSparseArray[i5];
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
    public void writeToParcel(@o0 Parcel parcel, int i5) {
        int size = size();
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i6 = 0; i6 < size; i6++) {
            iArr[i6] = keyAt(i6);
            parcelableArr[i6] = valueAt(i6);
        }
        parcel.writeInt(size);
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i5);
    }

    public ParcelableSparseArray(@o0 Parcel parcel, @q0 ClassLoader classLoader) {
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        for (int i5 = 0; i5 < readInt; i5++) {
            put(iArr[i5], readParcelableArray[i5]);
        }
    }
}
