package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.model.g0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* compiled from: BytesBackedNativeSessionFile.java */
/* loaded from: classes6.dex */
class g implements q0 {

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.q0
    private final byte[] f58700a;

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.o0
    private final String f58701b;

    /* renamed from: c, reason: collision with root package name */
    @androidx.annotation.o0
    private final String f58702c;

    g(@androidx.annotation.o0 String str, @androidx.annotation.o0 String str2, @androidx.annotation.q0 byte[] bArr) {
        this.f58701b = str;
        this.f58702c = str2;
        this.f58700a = bArr;
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
                    gZIPOutputStream.write(this.f58700a);
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
        byte[] bArr = this.f58700a;
        return bArr == null || bArr.length == 0;
    }

    @Override // com.google.firebase.crashlytics.internal.common.q0
    @androidx.annotation.q0
    public g0.e.b a() {
        byte[] d5 = d();
        if (d5 == null) {
            return null;
        }
        return g0.e.b.a().b(d5).c(this.f58701b).a();
    }

    @Override // com.google.firebase.crashlytics.internal.common.q0
    @androidx.annotation.o0
    public String b() {
        return this.f58702c;
    }

    @Override // com.google.firebase.crashlytics.internal.common.q0
    @androidx.annotation.q0
    public InputStream c() {
        if (e()) {
            return null;
        }
        return new ByteArrayInputStream(this.f58700a);
    }
}
