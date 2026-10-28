package com.android.volley.toolbox;

import androidx.annotation.q0;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* compiled from: HttpResponse.java */
/* loaded from: classes3.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private final int f41041a;

    /* renamed from: b, reason: collision with root package name */
    private final List<com.android.volley.i> f41042b;

    /* renamed from: c, reason: collision with root package name */
    private final int f41043c;

    /* renamed from: d, reason: collision with root package name */
    @q0
    private final InputStream f41044d;

    /* renamed from: e, reason: collision with root package name */
    @q0
    private final byte[] f41045e;

    public n(int i4, List<com.android.volley.i> list) {
        this(i4, list, -1, null);
    }

    @q0
    public final InputStream a() {
        InputStream inputStream = this.f41044d;
        if (inputStream != null) {
            return inputStream;
        }
        if (this.f41045e != null) {
            return new ByteArrayInputStream(this.f41045e);
        }
        return null;
    }

    @q0
    public final byte[] b() {
        return this.f41045e;
    }

    public final int c() {
        return this.f41043c;
    }

    public final List<com.android.volley.i> d() {
        return Collections.unmodifiableList(this.f41042b);
    }

    public final int e() {
        return this.f41041a;
    }

    public n(int i4, List<com.android.volley.i> list, int i5, InputStream inputStream) {
        this.f41041a = i4;
        this.f41042b = list;
        this.f41043c = i5;
        this.f41044d = inputStream;
        this.f41045e = null;
    }

    public n(int i4, List<com.android.volley.i> list, byte[] bArr) {
        this.f41041a = i4;
        this.f41042b = list;
        this.f41043c = bArr.length;
        this.f41045e = bArr;
        this.f41044d = null;
    }
}
