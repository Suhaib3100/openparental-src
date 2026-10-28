package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.model.g0;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* compiled from: FileBackedNativeSessionFile.java */
/* loaded from: classes6.dex */
class l0 implements q0 {

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.o0
    private final File f58758a;

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.o0
    private final String f58759b;

    /* renamed from: c, reason: collision with root package name */
    @androidx.annotation.o0
    private final String f58760c;

    l0(@androidx.annotation.o0 String str, @androidx.annotation.o0 String str2, @androidx.annotation.o0 File file) {
        this.f58759b = str;
        this.f58760c = str2;
        this.f58758a = file;
    }

    @androidx.annotation.q0
    private byte[] d() {
        byte[] bArr = new byte[8192];
        try {
            InputStream c5 = c();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    if (c5 == null) {
                        gZIPOutputStream.close();
                        byteArrayOutputStream.close();
                        if (c5 != null) {
                            c5.close();
                        }
                        return null;
                    }
                    while (true) {
                        try {
                            int read = c5.read(bArr);
                            if (read <= 0) {
                                gZIPOutputStream.finish();
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                gZIPOutputStream.close();
                                byteArrayOutputStream.close();
                                c5.close();
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

    @Override // com.google.firebase.crashlytics.internal.common.q0
    @androidx.annotation.q0
    public g0.e.b a() {
        byte[] d5 = d();
        if (d5 != null) {
            return g0.e.b.a().b(d5).c(this.f58759b).a();
        }
        return null;
    }

    @Override // com.google.firebase.crashlytics.internal.common.q0
    @androidx.annotation.o0
    public String b() {
        return this.f58760c;
    }

    @Override // com.google.firebase.crashlytics.internal.common.q0
    @androidx.annotation.q0
    public InputStream c() {
        if (this.f58758a.exists() && this.f58758a.isFile()) {
            try {
                return new FileInputStream(this.f58758a);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }
}
