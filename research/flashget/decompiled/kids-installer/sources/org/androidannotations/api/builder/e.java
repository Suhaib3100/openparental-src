package org.androidannotations.api.builder;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import org.androidannotations.api.builder.e;

/* compiled from: IntentBuilder.java */
/* loaded from: classes6.dex */
public abstract class e<I extends e<I>> extends c {

    /* renamed from: a, reason: collision with root package name */
    protected final Context f31759a;

    /* renamed from: b, reason: collision with root package name */
    protected final Intent f31760b;

    public e(Context context, Class<?> cls) {
        this(context, new Intent(context, cls));
    }

    public I A(String str, boolean[] zArr) {
        this.f31760b.putExtra(str, zArr);
        return this;
    }

    public I B(Intent intent) {
        this.f31760b.putExtras(intent);
        return this;
    }

    public I C(int i5) {
        this.f31760b.setFlags(i5);
        return this;
    }

    public Intent D() {
        return this.f31760b;
    }

    public Context E() {
        return this.f31759a;
    }

    public I F(String str, ArrayList<Integer> arrayList) {
        this.f31760b.putIntegerArrayListExtra(str, arrayList);
        return this;
    }

    public I G(String str, ArrayList<? extends Parcelable> arrayList) {
        this.f31760b.putParcelableArrayListExtra(str, arrayList);
        return this;
    }

    public I H(String str, ArrayList<String> arrayList) {
        this.f31760b.putStringArrayListExtra(str, arrayList);
        return this;
    }

    public I I(String str) {
        this.f31760b.setType(str);
        return this;
    }

    public I b(String str) {
        this.f31760b.setAction(str);
        return this;
    }

    public I c(String str) {
        this.f31760b.addCategory(str);
        return this;
    }

    public I d(Uri uri) {
        this.f31760b.setData(uri);
        return this;
    }

    public I e(String str, byte b6) {
        this.f31760b.putExtra(str, b6);
        return this;
    }

    public I f(String str, char c6) {
        this.f31760b.putExtra(str, c6);
        return this;
    }

    public I g(String str, double d6) {
        this.f31760b.putExtra(str, d6);
        return this;
    }

    public I h(String str, float f6) {
        this.f31760b.putExtra(str, f6);
        return this;
    }

    public I i(String str, int i5) {
        this.f31760b.putExtra(str, i5);
        return this;
    }

    public I j(String str, long j5) {
        this.f31760b.putExtra(str, j5);
        return this;
    }

    public I k(String str, Bundle bundle) {
        this.f31760b.putExtra(str, bundle);
        return this;
    }

    public I l(String str, Parcelable parcelable) {
        this.f31760b.putExtra(str, parcelable);
        return this;
    }

    public I m(String str, Serializable serializable) {
        this.f31760b.putExtra(str, serializable);
        return this;
    }

    public I n(String str, CharSequence charSequence) {
        this.f31760b.putExtra(str, charSequence);
        return this;
    }

    public I o(String str, String str2) {
        this.f31760b.putExtra(str, str2);
        return this;
    }

    public I p(String str, short s5) {
        this.f31760b.putExtra(str, s5);
        return this;
    }

    public I q(String str, boolean z5) {
        this.f31760b.putExtra(str, z5);
        return this;
    }

    public I r(String str, byte[] bArr) {
        this.f31760b.putExtra(str, bArr);
        return this;
    }

    public I s(String str, char[] cArr) {
        this.f31760b.putExtra(str, cArr);
        return this;
    }

    public I t(String str, double[] dArr) {
        this.f31760b.putExtra(str, dArr);
        return this;
    }

    public I u(String str, float[] fArr) {
        this.f31760b.putExtra(str, fArr);
        return this;
    }

    public I v(String str, int[] iArr) {
        this.f31760b.putExtra(str, iArr);
        return this;
    }

    public I w(String str, long[] jArr) {
        this.f31760b.putExtra(str, jArr);
        return this;
    }

    public I x(String str, Parcelable[] parcelableArr) {
        this.f31760b.putExtra(str, parcelableArr);
        return this;
    }

    public I y(String str, String[] strArr) {
        this.f31760b.putExtra(str, strArr);
        return this;
    }

    public I z(String str, short[] sArr) {
        this.f31760b.putExtra(str, sArr);
        return this;
    }

    public e(Context context, Intent intent) {
        this.f31759a = context;
        this.f31760b = intent;
    }
}
