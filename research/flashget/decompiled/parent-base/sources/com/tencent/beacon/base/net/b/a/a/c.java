package com.tencent.beacon.base.net.b.a.a;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: OutWindow.java */
/* loaded from: classes6.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    byte[] f71185a;

    /* renamed from: b, reason: collision with root package name */
    int f71186b;

    /* renamed from: c, reason: collision with root package name */
    int f71187c = 0;

    /* renamed from: d, reason: collision with root package name */
    int f71188d;

    /* renamed from: e, reason: collision with root package name */
    OutputStream f71189e;

    public void a(int i4) {
        if (this.f71185a == null || this.f71187c != i4) {
            this.f71185a = new byte[i4];
        }
        this.f71187c = i4;
        this.f71186b = 0;
        this.f71188d = 0;
    }

    public void b() throws IOException {
        a();
        this.f71189e = null;
    }

    public byte b(int i4) {
        int i5 = (this.f71186b - i4) - 1;
        if (i5 < 0) {
            i5 += this.f71187c;
        }
        return this.f71185a[i5];
    }

    public void a(OutputStream outputStream) throws IOException {
        b();
        this.f71189e = outputStream;
    }

    public void a(boolean z4) {
        if (z4) {
            return;
        }
        this.f71188d = 0;
        this.f71186b = 0;
    }

    public void a() throws IOException {
        int i4 = this.f71186b;
        int i5 = this.f71188d;
        int i6 = i4 - i5;
        if (i6 == 0) {
            return;
        }
        this.f71189e.write(this.f71185a, i5, i6);
        if (this.f71186b >= this.f71187c) {
            this.f71186b = 0;
        }
        this.f71188d = this.f71186b;
    }

    public void a(int i4, int i5) throws IOException {
        int i6 = (this.f71186b - i4) - 1;
        if (i6 < 0) {
            i6 += this.f71187c;
        }
        while (i5 != 0) {
            int i7 = this.f71187c;
            if (i6 >= i7) {
                i6 = 0;
            }
            byte[] bArr = this.f71185a;
            int i10 = this.f71186b;
            int i11 = i10 + 1;
            this.f71186b = i11;
            int i12 = i6 + 1;
            bArr[i10] = bArr[i6];
            if (i11 >= i7) {
                a();
            }
            i5--;
            i6 = i12;
        }
    }

    public void a(byte b5) throws IOException {
        byte[] bArr = this.f71185a;
        int i4 = this.f71186b;
        int i5 = i4 + 1;
        this.f71186b = i5;
        bArr[i4] = b5;
        if (i5 >= this.f71187c) {
            a();
        }
    }
}
