package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import kotlin.UByte;

/* loaded from: classes3.dex */
public final class DefaultImageHeaderParser implements ImageHeaderParser {

    /* renamed from: c, reason: collision with root package name */
    private static final int f11642c = 4671814;

    /* renamed from: d, reason: collision with root package name */
    private static final int f11643d = -1991225785;

    /* renamed from: e, reason: collision with root package name */
    static final int f11644e = 65496;

    /* renamed from: f, reason: collision with root package name */
    private static final int f11645f = 19789;

    /* renamed from: g, reason: collision with root package name */
    private static final int f11646g = 18761;

    /* renamed from: j, reason: collision with root package name */
    private static final int f11649j = 218;

    /* renamed from: k, reason: collision with root package name */
    private static final int f11650k = 217;

    /* renamed from: l, reason: collision with root package name */
    static final int f11651l = 255;

    /* renamed from: m, reason: collision with root package name */
    static final int f11652m = 225;

    /* renamed from: n, reason: collision with root package name */
    private static final int f11653n = 274;

    /* renamed from: p, reason: collision with root package name */
    private static final int f11655p = 1380533830;

    /* renamed from: q, reason: collision with root package name */
    private static final int f11656q = 1464156752;

    /* renamed from: r, reason: collision with root package name */
    private static final int f11657r = 1448097792;

    /* renamed from: s, reason: collision with root package name */
    private static final int f11658s = -256;

    /* renamed from: t, reason: collision with root package name */
    private static final int f11659t = 255;

    /* renamed from: u, reason: collision with root package name */
    private static final int f11660u = 88;

    /* renamed from: v, reason: collision with root package name */
    private static final int f11661v = 76;

    /* renamed from: w, reason: collision with root package name */
    private static final int f11662w = 16;

    /* renamed from: x, reason: collision with root package name */
    private static final int f11663x = 8;

    /* renamed from: b, reason: collision with root package name */
    private static final String f11641b = ProtectedSandApp.s("ᵈ");

    /* renamed from: h, reason: collision with root package name */
    private static final String f11647h = ProtectedSandApp.s("ᵉ");

    /* renamed from: i, reason: collision with root package name */
    static final byte[] f11648i = ProtectedSandApp.s("ᵋ").getBytes(Charset.forName(ProtectedSandApp.s("ᵊ")));

    /* renamed from: o, reason: collision with root package name */
    private static final int[] f11654o = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* loaded from: classes.dex */
    private interface Reader {

        public static final class EndOfFileException extends IOException {

            /* renamed from: o, reason: collision with root package name */
            private static final long f11664o = 1;

            EndOfFileException() {
                super(ProtectedSandApp.s("ŭ"));
            }
        }

        int a() throws IOException;

        int b(byte[] bArr, int i5) throws IOException;

        short c() throws IOException;

        long skip(long j5) throws IOException;
    }

    private static final class a implements Reader {

        /* renamed from: a, reason: collision with root package name */
        private final ByteBuffer f11665a;

        a(ByteBuffer byteBuffer) {
            this.f11665a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int a() throws Reader.EndOfFileException {
            return (c() << 8) | c();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int b(byte[] bArr, int i5) {
            int min = Math.min(i5, this.f11665a.remaining());
            if (min == 0) {
                return -1;
            }
            this.f11665a.get(bArr, 0, min);
            return min;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public short c() throws Reader.EndOfFileException {
            if (this.f11665a.remaining() >= 1) {
                return (short) (this.f11665a.get() & UByte.f27220r);
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public long skip(long j5) {
            int min = (int) Math.min(this.f11665a.remaining(), j5);
            ByteBuffer byteBuffer = this.f11665a;
            byteBuffer.position(byteBuffer.position() + min);
            return min;
        }
    }

    /* loaded from: classes.dex */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final ByteBuffer f11666a;

        b(byte[] bArr, int i5) {
            this.f11666a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i5);
        }

        private boolean c(int i5, int i6) {
            return this.f11666a.remaining() - i5 >= i6;
        }

        short a(int i5) {
            if (c(i5, 2)) {
                return this.f11666a.getShort(i5);
            }
            return (short) -1;
        }

        int b(int i5) {
            if (c(i5, 4)) {
                return this.f11666a.getInt(i5);
            }
            return -1;
        }

        int d() {
            return this.f11666a.remaining();
        }

        void e(ByteOrder byteOrder) {
            this.f11666a.order(byteOrder);
        }
    }

    private static final class c implements Reader {

        /* renamed from: a, reason: collision with root package name */
        private final InputStream f11667a;

        c(InputStream inputStream) {
            this.f11667a = inputStream;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int a() throws IOException {
            return (c() << 8) | c();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int b(byte[] bArr, int i5) throws IOException {
            int i6 = 0;
            int i7 = 0;
            while (i6 < i5 && (i7 = this.f11667a.read(bArr, i6, i5 - i6)) != -1) {
                i6 += i7;
            }
            if (i6 == 0 && i7 == -1) {
                throw new Reader.EndOfFileException();
            }
            return i6;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public short c() throws IOException {
            int read = this.f11667a.read();
            if (read != -1) {
                return (short) read;
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public long skip(long j5) throws IOException {
            if (j5 < 0) {
                return 0L;
            }
            long j6 = j5;
            while (j6 > 0) {
                long skip = this.f11667a.skip(j6);
                if (skip <= 0) {
                    if (this.f11667a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j6 -= skip;
            }
            return j5 - j6;
        }
    }

    private static int e(int i5, int i6) {
        return (i6 * 12) + i5 + 2;
    }

    private int f(Reader reader, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) throws IOException {
        try {
            boolean h5 = h(reader.a());
            String s5 = ProtectedSandApp.s("ᵌ");
            if (!h5) {
                Log.isLoggable(s5, 3);
                return -1;
            }
            int j5 = j(reader);
            if (j5 == -1) {
                Log.isLoggable(s5, 3);
                return -1;
            }
            byte[] bArr = (byte[]) bVar.e(j5, byte[].class);
            try {
                return l(reader, bArr, j5);
            } finally {
                bVar.put(bArr);
            }
        } catch (Reader.EndOfFileException unused) {
            return -1;
        }
    }

    @androidx.annotation.o0
    private ImageHeaderParser.ImageType g(Reader reader) throws IOException {
        try {
            int a6 = reader.a();
            if (a6 == f11644e) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int c6 = (a6 << 8) | reader.c();
            if (c6 == f11642c) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int c7 = (c6 << 8) | reader.c();
            if (c7 == f11643d) {
                reader.skip(21L);
                try {
                    return reader.c() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
                } catch (Reader.EndOfFileException unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            }
            if (c7 != f11655p) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            reader.skip(4L);
            if (((reader.a() << 16) | reader.a()) != f11656q) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int a7 = (reader.a() << 16) | reader.a();
            if ((a7 & (-256)) != f11657r) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int i5 = a7 & 255;
            if (i5 == 88) {
                reader.skip(4L);
                return (reader.c() & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
            }
            if (i5 != 76) {
                return ImageHeaderParser.ImageType.WEBP;
            }
            reader.skip(4L);
            return (reader.c() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
        } catch (Reader.EndOfFileException unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    private static boolean h(int i5) {
        return (i5 & f11644e) == f11644e || i5 == f11645f || i5 == f11646g;
    }

    private boolean i(byte[] bArr, int i5) {
        boolean z5 = bArr != null && i5 > f11648i.length;
        if (z5) {
            int i6 = 0;
            while (true) {
                byte[] bArr2 = f11648i;
                if (i6 >= bArr2.length) {
                    break;
                }
                if (bArr[i6] != bArr2[i6]) {
                    return false;
                }
                i6++;
            }
        }
        return z5;
    }

    private int j(Reader reader) throws IOException {
        String s5;
        long j5;
        do {
            short c6 = reader.c();
            s5 = ProtectedSandApp.s("ᵍ");
            if (c6 != 255) {
                Log.isLoggable(s5, 3);
                return -1;
            }
            short c7 = reader.c();
            if (c7 == f11649j) {
                return -1;
            }
            if (c7 == f11650k) {
                Log.isLoggable(s5, 3);
                return -1;
            }
            int a6 = reader.a() - 2;
            if (c7 == f11652m) {
                return a6;
            }
            j5 = a6;
        } while (reader.skip(j5) == j5);
        Log.isLoggable(s5, 3);
        return -1;
    }

    private static int k(b bVar) {
        ByteOrder byteOrder;
        short a6 = bVar.a(6);
        String s5 = ProtectedSandApp.s("ᵎ");
        if (a6 == f11646g) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else if (a6 != f11645f) {
            Log.isLoggable(s5, 3);
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        bVar.e(byteOrder);
        int b6 = bVar.b(10) + 6;
        short a7 = bVar.a(b6);
        for (int i5 = 0; i5 < a7; i5++) {
            int i6 = (i5 * 12) + b6 + 2;
            if (bVar.a(i6) == f11653n) {
                short a8 = bVar.a(i6 + 2);
                if (a8 < 1 || a8 > 12) {
                    Log.isLoggable(s5, 3);
                } else {
                    int b7 = bVar.b(i6 + 4);
                    if (b7 < 0) {
                        Log.isLoggable(s5, 3);
                    } else {
                        Log.isLoggable(s5, 3);
                        int i7 = b7 + f11654o[a8];
                        if (i7 > 4) {
                            Log.isLoggable(s5, 3);
                        } else {
                            int i8 = i6 + 8;
                            if (i8 < 0 || i8 > bVar.d()) {
                                Log.isLoggable(s5, 3);
                            } else {
                                if (i7 >= 0 && i7 + i8 <= bVar.d()) {
                                    return bVar.a(i8);
                                }
                                Log.isLoggable(s5, 3);
                            }
                        }
                    }
                }
            }
        }
        return -1;
    }

    private int l(Reader reader, byte[] bArr, int i5) throws IOException {
        int b6 = reader.b(bArr, i5);
        String s5 = ProtectedSandApp.s("ᵏ");
        if (b6 != i5) {
            Log.isLoggable(s5, 3);
            return -1;
        }
        if (i(bArr, i5)) {
            return k(new b(bArr, i5));
        }
        Log.isLoggable(s5, 3);
        return -1;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @androidx.annotation.o0
    public ImageHeaderParser.ImageType a(@androidx.annotation.o0 ByteBuffer byteBuffer) throws IOException {
        return g(new a((ByteBuffer) com.bumptech.glide.util.l.d(byteBuffer)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int b(@androidx.annotation.o0 ByteBuffer byteBuffer, @androidx.annotation.o0 com.bumptech.glide.load.engine.bitmap_recycle.b bVar) throws IOException {
        return f(new a((ByteBuffer) com.bumptech.glide.util.l.d(byteBuffer)), (com.bumptech.glide.load.engine.bitmap_recycle.b) com.bumptech.glide.util.l.d(bVar));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @androidx.annotation.o0
    public ImageHeaderParser.ImageType c(@androidx.annotation.o0 InputStream inputStream) throws IOException {
        return g(new c((InputStream) com.bumptech.glide.util.l.d(inputStream)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int d(@androidx.annotation.o0 InputStream inputStream, @androidx.annotation.o0 com.bumptech.glide.load.engine.bitmap_recycle.b bVar) throws IOException {
        return f(new c((InputStream) com.bumptech.glide.util.l.d(inputStream)), (com.bumptech.glide.load.engine.bitmap_recycle.b) com.bumptech.glide.util.l.d(bVar));
    }
}
