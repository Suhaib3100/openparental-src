package com.google.android.material.navigation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.view.menu.t;
import com.google.android.material.internal.ParcelableSparseArray;

@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class NavigationBarPresenter implements n {

    /* renamed from: o, reason: collision with root package name */
    private g f13748o;

    /* renamed from: p, reason: collision with root package name */
    private c f13749p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f13750q = false;

    /* renamed from: r, reason: collision with root package name */
    private int f13751r;

    /* loaded from: classes2.dex */
    static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: o, reason: collision with root package name */
        int f13752o;

        /* renamed from: p, reason: collision with root package name */
        @q0
        ParcelableSparseArray f13753p;

        static class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            @o0
            public SavedState a(@o0 Parcel parcel) {
                return new SavedState(parcel);
            }

            @o0
            public SavedState[] b(int i5) {
                return new SavedState[i5];
            }

            @Override // android.os.Parcelable.Creator
            @o0
            public SavedState createFromParcel(@o0 Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            @o0
            public SavedState[] newArray(int i5) {
                return new SavedState[i5];
            }
        }

        SavedState() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@o0 Parcel parcel, int i5) {
            parcel.writeInt(this.f13752o);
            parcel.writeParcelable(this.f13753p, 0);
        }

        SavedState(@o0 Parcel parcel) {
            this.f13752o = parcel.readInt();
            this.f13753p = (ParcelableSparseArray) parcel.readParcelable(getClass().getClassLoader());
        }
    }

    public void a(int i5) {
        this.f13751r = i5;
    }

    @Override // androidx.appcompat.view.menu.n
    public void b(@q0 g gVar, boolean z5) {
    }

    public void c(@o0 c cVar) {
        this.f13749p = cVar;
    }

    @Override // androidx.appcompat.view.menu.n
    public void d(boolean z5) {
        if (this.f13750q) {
            return;
        }
        if (z5) {
            this.f13749p.c();
        } else {
            this.f13749p.O();
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean f(@q0 g gVar, @q0 j jVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean g(@q0 g gVar, @q0 j jVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public int getId() {
        return this.f13751r;
    }

    @Override // androidx.appcompat.view.menu.n
    public void h(@q0 n.a aVar) {
    }

    @Override // androidx.appcompat.view.menu.n
    public void i(@o0 Context context, @o0 g gVar) {
        this.f13748o = gVar;
        this.f13749p.e(gVar);
    }

    @Override // androidx.appcompat.view.menu.n
    public void j(@o0 Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f13749p.N(savedState.f13752o);
            this.f13749p.B(com.google.android.material.badge.a.e(this.f13749p.getContext(), savedState.f13753p));
        }
    }

    public void k(boolean z5) {
        this.f13750q = z5;
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean l(@q0 t tVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    @q0
    public o m(@q0 ViewGroup viewGroup) {
        return this.f13749p;
    }

    @Override // androidx.appcompat.view.menu.n
    @o0
    public Parcelable n() {
        SavedState savedState = new SavedState();
        savedState.f13752o = this.f13749p.v();
        savedState.f13753p = com.google.android.material.badge.a.f(this.f13749p.j());
        return savedState;
    }
}
