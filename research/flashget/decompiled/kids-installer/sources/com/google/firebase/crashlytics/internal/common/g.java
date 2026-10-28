package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.model.f0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* compiled from: BytesBackedNativeSessionFile.java */
/* loaded from: classes3.dex */
class g implements g0 {

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.q0
    private final byte[] f15596a;

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.o0
    private final String f15597b;

    /* renamed from: c, reason: collision with root package name */
    @androidx.annotation.o0
    private final String f15598c;

    g(@androidx.annotation.o0 String str, @androidx.annotation.o0 String str2, @androidx.annotation.q0 byte[] bArr) {
        this.f15597b = str;
        this.f15598c = str2;
        this.f15596a = bArr;
    }

    @androidx.annotation.q0
    private byte[] d() {
        if (e()) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream.write(this.f15596a);
                    gZIPOutputStream.finish();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    gZIPOutputStream.close();
                    byteArrayOutputStream.close();
                    return byteArray;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    private boolean e() {
        byte[] bArr = this.f15596a;
        return bArr == null || bArr.length == 0;
    }

    @Override // com.google.firebase.crashlytics.internal.common.g0
    @androidx.annotation.o0
    public String a() {
        return this.f15598c;
    }

    @Override // com.google.firebase.crashlytics.internal.common.g0
    @androidx.annotation.q0
    public InputStream b() {
        if (e()) {
            return null;
        }
        return new ByteArrayInputStream(this.f15596a);
    }

    @Override // com.google.firebase.crashlytics.internal.common.g0
    @androidx.annotation.q0
    public f0.e.b c() {
        byte[] d6 = d();
        if (d6 == null) {
            return null;
        }
        return f0.e.b.a().b(d6).c(this.f15597b).a();
    }
}
