package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.model.f0;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* compiled from: FileBackedNativeSessionFile.java */
/* loaded from: classes3.dex */
class c0 implements g0 {

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.o0
    private final File f15567a;

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.o0
    private final String f15568b;

    /* renamed from: c, reason: collision with root package name */
    @androidx.annotation.o0
    private final String f15569c;

    c0(@androidx.annotation.o0 String str, @androidx.annotation.o0 String str2, @androidx.annotation.o0 File file) {
        this.f15568b = str;
        this.f15569c = str2;
        this.f15567a = file;
    }

    @androidx.annotation.q0
    private byte[] d() {
        byte[] bArr = new byte[8192];
        try {
            InputStream b6 = b();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    if (b6 == null) {
                        gZIPOutputStream.close();
                        byteArrayOutputStream.close();
                        if (b6 != null) {
                            b6.close();
                        }
                        return null;
                    }
                    while (true) {
                        try {
                            int read = b6.read(bArr);
                            if (read <= 0) {
                                gZIPOutputStream.finish();
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                gZIPOutputStream.close();
                                byteArrayOutputStream.close();
                                b6.close();
                                return byteArray;
                            }
                            gZIPOutputStream.write(bArr, 0, read);
                        } finally {
                        }
                    }
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.common.g0
    @androidx.annotation.o0
    public String a() {
        return this.f15569c;
    }

    @Override // com.google.firebase.crashlytics.internal.common.g0
    @androidx.annotation.q0
    public InputStream b() {
        if (this.f15567a.exists() && this.f15567a.isFile()) {
            try {
                return new FileInputStream(this.f15567a);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }

    @Override // com.google.firebase.crashlytics.internal.common.g0
    @androidx.annotation.q0
    public f0.e.b c() {
        byte[] d6 = d();
        if (d6 != null) {
            return f0.e.b.a().b(d6).c(this.f15568b).a();
        }
        return null;
    }
}
