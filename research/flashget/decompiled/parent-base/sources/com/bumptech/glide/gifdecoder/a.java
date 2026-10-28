package com.bumptech.glide.gifdecoder;

import android.graphics.Bitmap;
import androidx.annotation.o0;
import androidx.annotation.q0;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;

/* compiled from: GifDecoder.java */
/* loaded from: classes3.dex */
public interface a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f42910a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f42911b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f42912c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final int f42913d = 3;

    /* renamed from: e, reason: collision with root package name */
    public static final int f42914e = 0;

    /* compiled from: GifDecoder.java */
    /* renamed from: com.bumptech.glide.gifdecoder.a$a, reason: collision with other inner class name */
    public interface InterfaceC0732a {
        void a(@o0 Bitmap bitmap);

        @o0
        byte[] b(int i4);

        @o0
        Bitmap c(int i4, int i5, @o0 Bitmap.Config config);

        @o0
        int[] d(int i4);

        void e(@o0 byte[] bArr);

        void f(@o0 int[] iArr);
    }

    /* compiled from: GifDecoder.java */
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    int a(@q0 InputStream inputStream, int i4);

    @o0
    ByteBuffer b();

    void c();

    void clear();

    int d();

    void e(@o0 Bitmap.Config config);

    int f(int i4);

    int g();

    int getHeight();

    @q0
    Bitmap getNextFrame();

    int getStatus();

    int getWidth();

    @Deprecated
    int h();

    void i(@o0 c cVar, @o0 byte[] bArr);

    int j();

    void k();

    void l(@o0 c cVar, @o0 ByteBuffer byteBuffer);

    int m();

    void n(@o0 c cVar, @o0 ByteBuffer byteBuffer, int i4);

    int o();

    int p();

    int read(@q0 byte[] bArr);
}
