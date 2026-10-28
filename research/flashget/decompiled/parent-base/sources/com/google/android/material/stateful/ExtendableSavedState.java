package com.google.android.material.stateful;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.collection.a3;
import androidx.customview.view.AbsSavedState;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* loaded from: classes6.dex */
public class ExtendableSavedState extends AbsSavedState {
    public static final Parcelable.Creator<ExtendableSavedState> CREATOR = new a();

    /* renamed from: d, reason: collision with root package name */
    @o0
    public final a3<String, Bundle> f54140d;

    static class a implements Parcelable.ClassLoaderCreator<ExtendableSavedState> {
        a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        @q0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ExtendableSavedState createFromParcel(@o0 Parcel parcel) {
            return new ExtendableSavedState(parcel, null, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        @o0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ExtendableSavedState createFromParcel(@o0 Parcel parcel, ClassLoader classLoader) {
            return new ExtendableSavedState(parcel, classLoader, null);
        }

        @o0
        public ExtendableSavedState[] c(int i4) {
            return new ExtendableSavedState[i4];
        }

        @Override // android.os.Parcelable.Creator
        @o0
        public Object[] newArray(int i4) {
            return new ExtendableSavedState[i4];
        }
    }

    /* synthetic */ ExtendableSavedState(Parcel parcel, ClassLoader classLoader, a aVar) {
        this(parcel, classLoader);
    }

    @o0
    public String toString() {
        return ProtectedSandApp.s("\uf230") + Integer.toHexString(System.identityHashCode(this)) + ProtectedSandApp.s("\uf231") + this.f54140d + ProtectedSandApp.s("\uf232");
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        int size = this.f54140d.getSize();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i5 = 0; i5 < size; i5++) {
            strArr[i5] = this.f54140d.keyAt(i5);
            bundleArr[i5] = this.f54140d.valueAt(i5);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public ExtendableSavedState(Parcelable parcelable) {
        super(parcelable);
        this.f54140d = new a3<>();
    }

    private ExtendableSavedState(@o0 Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f54140d = new a3<>(readInt);
        for (int i4 = 0; i4 < readInt; i4++) {
            this.f54140d.put(strArr[i4], bundleArr[i4]);
        }
    }
}
