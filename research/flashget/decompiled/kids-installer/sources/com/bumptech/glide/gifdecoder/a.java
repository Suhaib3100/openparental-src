package com.bumptech.glide.gifdecoder;

import android.graphics.Bitmap;
import androidx.annotation.o0;
import androidx.annotation.q0;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;

/* compiled from: GifDecoder.java */
/* loaded from: classes.dex */
public interface a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f10811a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f10812b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f10813c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final int f10814d = 3;

    /* renamed from: e, reason: collision with root package name */
    public static final int f10815e = 0;

    /* compiled from: GifDecoder.java */
    /* renamed from: com.bumptech.glide.gifdecoder.a$a, reason: collision with other inner class name */
    public interface InterfaceC0133a {
        @o0
        Bitmap a(int i5, int i6, @o0 Bitmap.Config config);

        @o0
        int[] b(int i5);

        void c(@o0 Bitmap bitmap);

        void d(@o0 byte[] bArr);

        @o0
        byte[] e(int i5);

        void f(@o0 int[] iArr);
    }

    /* compiled from: GifDecoder.java */
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    int a();

    int b(@q0 InputStream inputStream, int i5);

    @q0
    Bitmap c();

    void clear();

    int d();

    void e();

    void f(@o0 c cVar, @o0 byte[] bArr);

    int g();

    @o0
    ByteBuffer getData();

    int getStatus();

    int h();

    void i(@o0 Bitmap.Config config);

    int j(int i5);

    void k();

    void l(@o0 c cVar, @o0 ByteBuffer byteBuffer);

    int m();

    void n(@o0 c cVar, @o0 ByteBuffer byteBuffer, int i5);

    int o();

    int p();

    int q();

    @Deprecated
    int r();

    int read(@q0 byte[] bArr);
}
