package org.androidannotations.api.builder;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import org.androidannotations.api.builder.d;

/* compiled from: FragmentBuilder.java */
/* loaded from: classes6.dex */
public abstract class d<I extends d<I, F>, F> extends c {

    /* renamed from: a, reason: collision with root package name */
    protected Bundle f31758a = new Bundle();

    public Bundle A() {
        return this.f31758a;
    }

    public abstract F B();

    public I C(String str, ArrayList<Integer> arrayList) {
        this.f31758a.putIntegerArrayList(str, arrayList);
        return this;
    }

    public I D(String str, ArrayList<? extends Parcelable> arrayList) {
        this.f31758a.putParcelableArrayList(str, arrayList);
        return this;
    }

    public I E(String str, ArrayList<String> arrayList) {
        this.f31758a.putStringArrayList(str, arrayList);
        return this;
    }

    public I b(Bundle bundle) {
        this.f31758a.putAll(bundle);
        return this;
    }

    public I c(String str, byte b6) {
        this.f31758a.putByte(str, b6);
        return this;
    }

    public I d(String str, char c6) {
        this.f31758a.putChar(str, c6);
        return this;
    }

    public I e(String str, double d6) {
        this.f31758a.putDouble(str, d6);
        return this;
    }

    public I f(String str, float f6) {
        this.f31758a.putFloat(str, f6);
        return this;
    }

    public I g(String str, int i5) {
        this.f31758a.putInt(str, i5);
        return this;
    }

    public I h(String str, long j5) {
        this.f31758a.putLong(str, j5);
        return this;
    }

    public I i(String str, Bundle bundle) {
        this.f31758a.putBundle(str, bundle);
        return this;
    }

    public I j(String str, Parcelable parcelable) {
        this.f31758a.putParcelable(str, parcelable);
        return this;
    }

    public I k(String str, SparseArray<? extends Parcelable> sparseArray) {
        this.f31758a.putSparseParcelableArray(str, sparseArray);
        return this;
    }

    public I l(String str, Serializable serializable) {
        this.f31758a.putSerializable(str, serializable);
        return this;
    }

    public I m(String str, CharSequence charSequence) {
        this.f31758a.putCharSequence(str, charSequence);
        return this;
    }

    public I n(String str, String str2) {
        this.f31758a.putString(str, str2);
        return this;
    }

    public I o(String str, short s5) {
        this.f31758a.putShort(str, s5);
        return this;
    }

    public I p(String str, boolean z5) {
        this.f31758a.putBoolean(str, z5);
        return this;
    }

    public I q(String str, byte[] bArr) {
        this.f31758a.putByteArray(str, bArr);
        return this;
    }

    public I r(String str, char[] cArr) {
        this.f31758a.putCharArray(str, cArr);
        return this;
    }

    public I s(String str, double[] dArr) {
        this.f31758a.putDoubleArray(str, dArr);
        return this;
    }

    public I t(String str, float[] fArr) {
        this.f31758a.putFloatArray(str, fArr);
        return this;
    }

    public I u(String str, int[] iArr) {
        this.f31758a.putIntArray(str, iArr);
        return this;
    }

    public I v(String str, long[] jArr) {
        this.f31758a.putLongArray(str, jArr);
        return this;
    }

    public I w(String str, Parcelable[] parcelableArr) {
        this.f31758a.putParcelableArray(str, parcelableArr);
        return this;
    }

    public I x(String str, String[] strArr) {
        this.f31758a.putStringArray(str, strArr);
        return this;
    }

    public I y(String str, short[] sArr) {
        this.f31758a.putShortArray(str, sArr);
        return this;
    }

    public I z(String str, boolean[] zArr) {
        this.f31758a.putBooleanArray(str, zArr);
        return this;
    }
}
