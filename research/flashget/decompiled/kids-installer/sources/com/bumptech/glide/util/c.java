package com.bumptech.glide.util;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: ContentLengthInputStream.java */
/* loaded from: classes.dex */
public final class c extends FilterInputStream {

    /* renamed from: q, reason: collision with root package name */
    private static final String f12144q = ProtectedSandApp.s("Ȩ");

    /* renamed from: r, reason: collision with root package name */
    private static final int f12145r = -1;

    /* renamed from: o, reason: collision with root package name */
    private final long f12146o;

    /* renamed from: p, reason: collision with root package name */
    private int f12147p;

    private c(@o0 InputStream inputStream, long j5) {
        super(inputStream);
        this.f12146o = j5;
    }

    private int a(int i5) throws IOException {
        if (i5 >= 0) {
            this.f12147p += i5;
        } else if (this.f12146o - this.f12147p > 0) {
            throw new IOException(ProtectedSandApp.s("ȥ") + this.f12146o + ProtectedSandApp.s("Ȧ") + this.f12147p);
        }
        return i5;
    }

    @o0
    public static InputStream b(@o0 InputStream inputStream, long j5) {
        return new c(inputStream, j5);
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
                Log.isLoggable(ProtectedSandApp.s("ȧ"), 3);
            }
        }
        return -1;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        return (int) Math.max(this.f12146o - this.f12147p, ((FilterInputStream) this).in.available());
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
    public synchronized int read(byte[] bArr, int i5, int i6) throws IOException {
        return a(super.read(bArr, i5, i6));
    }
}
