package com.google.android.material.stateful;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.collection.i;
import androidx.customview.view.AbsSavedState;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* loaded from: classes3.dex */
public class ExtendableSavedState extends AbsSavedState {
    public static final Parcelable.Creator<ExtendableSavedState> CREATOR = new a();

    /* renamed from: q, reason: collision with root package name */
    @o0
    public final i<String, Bundle> f14272q;

    /* loaded from: classes2.dex */
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
        public ExtendableSavedState[] c(int i5) {
            return new ExtendableSavedState[i5];
        }

        @Override // android.os.Parcelable.Creator
        @o0
        public Object[] newArray(int i5) {
            return new ExtendableSavedState[i5];
        }
    }

    /* synthetic */ ExtendableSavedState(Parcel parcel, ClassLoader classLoader, a aVar) {
        this(parcel, classLoader);
    }

    @o0
    public String toString() {
        return ProtectedSandApp.s("✤") + Integer.toHexString(System.identityHashCode(this)) + ProtectedSandApp.s("✥") + this.f14272q + ProtectedSandApp.s("✦");
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i5) {
        super.writeToParcel(parcel, i5);
        int size = this.f14272q.size();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i6 = 0; i6 < size; i6++) {
            strArr[i6] = this.f14272q.l(i6);
            bundleArr[i6] = this.f14272q.q(i6);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public ExtendableSavedState(Parcelable parcelable) {
        super(parcelable);
        this.f14272q = new i<>();
    }

    private ExtendableSavedState(@o0 Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f14272q = new i<>(readInt);
        for (int i5 = 0; i5 < readInt; i5++) {
            this.f14272q.put(strArr[i5], bundleArr[i5]);
        }
    }
}
