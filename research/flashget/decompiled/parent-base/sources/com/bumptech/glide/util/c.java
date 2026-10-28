package com.bumptech.glide.util;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: ContentLengthInputStream.java */
/* loaded from: classes3.dex */
public final class c extends FilterInputStream {

    /* renamed from: d, reason: collision with root package name */
    private static final String f44951d = ProtectedSandApp.s("છ");

    /* renamed from: e, reason: collision with root package name */
    private static final int f44952e = -1;

    /* renamed from: b, reason: collision with root package name */
    private final long f44953b;

    /* renamed from: c, reason: collision with root package name */
    private int f44954c;

    private c(@o0 InputStream inputStream, long j4) {
        super(inputStream);
        this.f44953b = j4;
    }

    private int a(int i4) throws IOException {
        if (i4 >= 0) {
            this.f44954c += i4;
        } else if (this.f44953b - this.f44954c > 0) {
            throw new IOException(ProtectedSandApp.s("ઙ") + this.f44953b + ProtectedSandApp.s("ચ") + this.f44954c);
        }
        return i4;
    }

    @o0
    public static InputStream b(@o0 InputStream inputStream, long j4) {
        return new c(inputStream, j4);
    }

    @o0
    public static InputStream c(@o0 InputStream inputStream, @q0 String str) {
        return new c(inputStream, d(str));
    }

    private static int d(@q0 String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                Log.isLoggable(ProtectedSandApp.s("છ"), 3);
            }
        }
        return -1;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        return (int) Math.max(this.f44953b - this.f44954c, ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        int read;
        read = super.read();
        a(read >= 0 ? 1 : -1);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i4, int i5) throws IOException {
        return a(super.read(bArr, i4, i5));
    }
}
