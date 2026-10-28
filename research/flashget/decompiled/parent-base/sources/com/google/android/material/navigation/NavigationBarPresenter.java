package com.google.android.material.navigation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.view.menu.p;
import androidx.appcompat.view.menu.t;
import com.google.android.material.internal.ParcelableSparseArray;

@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes6.dex */
public class NavigationBarPresenter implements o {

    /* renamed from: b, reason: collision with root package name */
    private h f53542b;

    /* renamed from: c, reason: collision with root package name */
    private c f53543c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f53544d = false;

    /* renamed from: e, reason: collision with root package name */
    private int f53545e;

    static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        int f53546b;

        /* renamed from: c, reason: collision with root package name */
        @q0
        ParcelableSparseArray f53547c;

        static class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            @o0
            public SavedState a(@o0 Parcel parcel) {
                return new SavedState(parcel);
            }

            @o0
            public SavedState[] b(int i4) {
                return new SavedState[i4];
            }

            @Override // android.os.Parcelable.Creator
            @o0
            public SavedState createFromParcel(@o0 Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            @o0
            public SavedState[] newArray(int i4) {
                return new SavedState[i4];
            }
        }

        SavedState() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@o0 Parcel parcel, int i4) {
            parcel.writeInt(this.f53546b);
            parcel.writeParcelable(this.f53547c, 0);
        }

        SavedState(@o0 Parcel parcel) {
            this.f53546b = parcel.readInt();
            this.f53547c = (ParcelableSparseArray) parcel.readParcelable(getClass().getClassLoader());
        }
    }

    @Override // androidx.appcompat.view.menu.o
    public int a() {
        return this.f53545e;
    }

    public void b(int i4) {
        this.f53545e = i4;
    }

    public void c(@o0 c cVar) {
        this.f53543c = cVar;
    }

    @Override // androidx.appcompat.view.menu.o
    public void d(@q0 h hVar, boolean z4) {
    }

    @Override // androidx.appcompat.view.menu.o
    public boolean e(@q0 h hVar, @q0 k kVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.o
    public void f(@q0 o.a aVar) {
    }

    @Override // androidx.appcompat.view.menu.o
    public void g(@o0 Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f53543c.N(savedState.f53546b);
            this.f53543c.B(com.google.android.material.badge.a.e(this.f53543c.getContext(), savedState.f53547c));
        }
    }

    @Override // androidx.appcompat.view.menu.o
    public boolean h(@q0 t tVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.o
    @q0
    public p i(@q0 ViewGroup viewGroup) {
        return this.f53543c;
    }

    @Override // androidx.appcompat.view.menu.o
    @o0
    public Parcelable j() {
        SavedState savedState = new SavedState();
        savedState.f53546b = this.f53543c.v();
        savedState.f53547c = com.google.android.material.badge.a.f(this.f53543c.j());
        return savedState;
    }

    @Override // androidx.appcompat.view.menu.o
    public void k(boolean z4) {
        if (this.f53544d) {
            return;
        }
        if (z4) {
            this.f53543c.e();
        } else {
            this.f53543c.O();
        }
    }

    @Override // androidx.appcompat.view.menu.o
    public boolean l() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.o
    public boolean m(@q0 h hVar, @q0 k kVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.o
    public void n(@o0 Context context, @o0 h hVar) {
        this.f53542b = hVar;
        this.f53543c.a(hVar);
    }

    public void o(boolean z4) {
        this.f53544d = z4;
    }
}
