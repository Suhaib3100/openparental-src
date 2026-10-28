package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public final class DefaultImageHeaderParser implements ImageHeaderParser {
    private static final int A = 1635150182;
    private static final int B = 1635150195;

    /* renamed from: c, reason: collision with root package name */
    private static final int f44398c = 4671814;

    /* renamed from: d, reason: collision with root package name */
    private static final int f44399d = -1991225785;

    /* renamed from: e, reason: collision with root package name */
    static final int f44400e = 65496;

    /* renamed from: f, reason: collision with root package name */
    private static final int f44401f = 19789;

    /* renamed from: g, reason: collision with root package name */
    private static final int f44402g = 18761;

    /* renamed from: j, reason: collision with root package name */
    private static final int f44405j = 218;

    /* renamed from: k, reason: collision with root package name */
    private static final int f44406k = 217;

    /* renamed from: l, reason: collision with root package name */
    static final int f44407l = 255;

    /* renamed from: m, reason: collision with root package name */
    static final int f44408m = 225;

    /* renamed from: n, reason: collision with root package name */
    private static final int f44409n = 274;

    /* renamed from: p, reason: collision with root package name */
    private static final int f44411p = 1380533830;

    /* renamed from: q, reason: collision with root package name */
    private static final int f44412q = 1464156752;

    /* renamed from: r, reason: collision with root package name */
    private static final int f44413r = 1448097792;

    /* renamed from: s, reason: collision with root package name */
    private static final int f44414s = -256;

    /* renamed from: t, reason: collision with root package name */
    private static final int f44415t = 255;

    /* renamed from: u, reason: collision with root package name */
    private static final int f44416u = 88;

    /* renamed from: v, reason: collision with root package name */
    private static final int f44417v = 76;

    /* renamed from: w, reason: collision with root package name */
    private static final int f44418w = 2;

    /* renamed from: x, reason: collision with root package name */
    private static final int f44419x = 16;

    /* renamed from: y, reason: collision with root package name */
    private static final int f44420y = 8;

    /* renamed from: z, reason: collision with root package name */
    private static final int f44421z = 1718909296;

    /* renamed from: b, reason: collision with root package name */
    private static final String f44397b = ProtectedSandApp.s("\u0984");

    /* renamed from: h, reason: collision with root package name */
    private static final String f44403h = ProtectedSandApp.s("অ");

    /* renamed from: i, reason: collision with root package name */
    static final byte[] f44404i = ProtectedSandApp.s("অ").getBytes(Charset.forName(ProtectedSandApp.s("আ")));

    /* renamed from: o, reason: collision with root package name */
    private static final int[] f44410o = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    private interface Reader {

        public static final class EndOfFileException extends IOException {

            /* renamed from: b, reason: collision with root package name */
            private static final long f44422b = 1;

            EndOfFileException() {
                super(ProtectedSandApp.s("ঃ"));
            }
        }

        int getUInt16() throws IOException;

        short getUInt8() throws IOException;

        int read(byte[] bArr, int i4) throws IOException;

        long skip(long j4) throws IOException;
    }

    private static final class a implements Reader {

        /* renamed from: a, reason: collision with root package name */
        private final ByteBuffer f44423a;

        a(ByteBuffer byteBuffer) {
            this.f44423a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int getUInt16() throws Reader.EndOfFileException {
            return (getUInt8() << 8) | getUInt8();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public short getUInt8() throws Reader.EndOfFileException {
            if (this.f44423a.remaining() >= 1) {
                return (short) (this.f44423a.get() & 255);
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int read(byte[] bArr, int i4) {
            int min = Math.min(i4, this.f44423a.remaining());
            if (min == 0) {
                return -1;
            }
            this.f44423a.get(bArr, 0, min);
            return min;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public long skip(long j4) {
            int min = (int) Math.min(this.f44423a.remaining(), j4);
            ByteBuffer byteBuffer = this.f44423a;
            byteBuffer.position(byteBuffer.position() + min);
            return min;
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final ByteBuffer f44424a;

        b(byte[] bArr, int i4) {
            this.f44424a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i4);
        }

        private boolean c(int i4, int i5) {
            return this.f44424a.remaining() - i4 >= i5;
        }

        short a(int i4) {
            if (c(i4, 2)) {
                return this.f44424a.getShort(i4);
            }
            return (short) -1;
        }

        int b(int i4) {
            if (c(i4, 4)) {
                return this.f44424a.getInt(i4);
            }
            return -1;
        }

        int d() {
            return this.f44424a.remaining();
        }

        void e(ByteOrder byteOrder) {
            this.f44424a.order(byteOrder);
        }
    }

    private static final class c implements Reader {

        /* renamed from: a, reason: collision with root package name */
        private final InputStream f44425a;

        c(InputStream inputStream) {
            this.f44425a = inputStream;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int getUInt16() throws IOException {
            return (getUInt8() << 8) | getUInt8();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public short getUInt8() throws IOException {
            int read = this.f44425a.read();
            if (read != -1) {
                return (short) read;
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int read(byte[] bArr, int i4) throws IOException {
            int i5 = 0;
            int i6 = 0;
            while (i5 < i4 && (i6 = this.f44425a.read(bArr, i5, i4 - i5)) != -1) {
                i5 += i6;
            }
            if (i5 == 0 && i6 == -1) {
                throw new Reader.EndOfFileException();
            }
            return i5;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public long skip(long j4) throws IOException {
            if (j4 < 0) {
                return 0L;
            }
            long j5 = j4;
            while (j5 > 0) {
                long skip = this.f44425a.skip(j5);
                if (skip <= 0) {
                    if (this.f44425a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j5 -= skip;
            }
            return j4 - j5;
        }
    }

    private static int e(int i4, int i5) {
        return (i5 * 12) + i4 + 2;
    }

    private int f(Reader reader, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) throws IOException {
        try {
            boolean h4 = h(reader.getUInt16());
            String s4 = ProtectedSandApp.s("\u0984");
            if (!h4) {
                Log.isLoggable(s4, 3);
                return -1;
            }
            int j4 = j(reader);
            if (j4 == -1) {
                Log.isLoggable(s4, 3);
                return -1;
            }
            byte[] bArr = (byte[]) bVar.d(j4, byte[].class);
            try {
                return l(reader, bArr, j4);
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
            int uInt16 = reader.getUInt16();
            if (uInt16 == f44400e) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int uInt8 = (uInt16 << 8) | reader.getUInt8();
            if (uInt8 == f44398c) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int uInt82 = (uInt8 << 8) | reader.getUInt8();
            if (uInt82 == f44399d) {
                reader.skip(21L);
                try {
                    return reader.getUInt8() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
                } catch (Reader.EndOfFileException unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            }
            if (uInt82 != f44411p) {
                return m(reader, uInt82);
            }
            reader.skip(4L);
            if (((reader.getUInt16() << 16) | reader.getUInt16()) != f44412q) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int uInt162 = (reader.getUInt16() << 16) | reader.getUInt16();
            if ((uInt162 & (-256)) != f44413r) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int i4 = uInt162 & 255;
            if (i4 == 88) {
                reader.skip(4L);
                short uInt83 = reader.getUInt8();
                return (uInt83 & 2) != 0 ? ImageHeaderParser.ImageType.ANIMATED_WEBP : (uInt83 & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
            }
            if (i4 != 76) {
                return ImageHeaderParser.ImageType.WEBP;
            }
            reader.skip(4L);
            return (reader.getUInt8() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
        } catch (Reader.EndOfFileException unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    private static boolean h(int i4) {
        return (i4 & f44400e) == f44400e || i4 == f44401f || i4 == f44402g;
    }

    private boolean i(byte[] bArr, int i4) {
        boolean z4 = bArr != null && i4 > f44404i.length;
        if (z4) {
            int i5 = 0;
            while (true) {
                byte[] bArr2 = f44404i;
                if (i5 >= bArr2.length) {
                    break;
                }
                if (bArr[i5] != bArr2[i5]) {
                    return false;
                }
                i5++;
            }
        }
        return z4;
    }

    private int j(Reader reader) throws IOException {
        String s4;
        long j4;
        do {
            short uInt8 = reader.getUInt8();
            s4 = ProtectedSandApp.s("\u0984");
            if (uInt8 != 255) {
                Log.isLoggable(s4, 3);
                return -1;
            }
            short uInt82 = reader.getUInt8();
            if (uInt82 == f44405j) {
                return -1;
            }
            if (uInt82 == f44406k) {
                Log.isLoggable(s4, 3);
                return -1;
            }
            int uInt16 = reader.getUInt16() - 2;
            if (uInt82 == f44408m) {
                return uInt16;
            }
            j4 = uInt16;
        } while (reader.skip(j4) == j4);
        Log.isLoggable(s4, 3);
        return -1;
    }

    private static int k(b bVar) {
        ByteOrder byteOrder;
        short a5 = bVar.a(6);
        String s4 = ProtectedSandApp.s("\u0984");
        if (a5 == f44402g) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else if (a5 != f44401f) {
            Log.isLoggable(s4, 3);
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        bVar.e(byteOrder);
        int b5 = bVar.b(10) + 6;
        short a6 = bVar.a(b5);
        for (int i4 = 0; i4 < a6; i4++) {
            int e4 = e(b5, i4);
            if (bVar.a(e4) == f44409n) {
                short a7 = bVar.a(e4 + 2);
                if (a7 < 1 || a7 > 12) {
                    Log.isLoggable(s4, 3);
                } else {
                    int b6 = bVar.b(e4 + 4);
                    if (b6 < 0) {
                        Log.isLoggable(s4, 3);
                    } else {
                        Log.isLoggable(s4, 3);
                        int i5 = b6 + f44410o[a7];
                        if (i5 > 4) {
                            Log.isLoggable(s4, 3);
                        } else {
                            int i6 = e4 + 8;
                            if (i6 < 0 || i6 > bVar.d()) {
                                Log.isLoggable(s4, 3);
                            } else {
                                if (i5 >= 0 && i5 + i6 <= bVar.d()) {
                                    return bVar.a(i6);
                                }
                                Log.isLoggable(s4, 3);
                            }
                        }
                    }
                }
            }
        }
        return -1;
    }

    private int l(Reader reader, byte[] bArr, int i4) throws IOException {
        int read = reader.read(bArr, i4);
        String s4 = ProtectedSandApp.s("\u0984");
        if (read != i4) {
            Log.isLoggable(s4, 3);
            return -1;
        }
        if (i(bArr, i4)) {
            return k(new b(bArr, i4));
        }
        Log.isLoggable(s4, 3);
        return -1;
    }

    private ImageHeaderParser.ImageType m(Reader reader, int i4) throws IOException {
        if (((reader.getUInt16() << 16) | reader.getUInt16()) != f44421z) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        int uInt16 = (reader.getUInt16() << 16) | reader.getUInt16();
        if (uInt16 == B) {
            return ImageHeaderParser.ImageType.ANIMATED_AVIF;
        }
        int i5 = 0;
        boolean z4 = uInt16 == A;
        reader.skip(4L);
        int i6 = i4 - 16;
        if (i6 % 4 == 0) {
            while (i5 < 5 && i6 > 0) {
                int uInt162 = (reader.getUInt16() << 16) | reader.getUInt16();
                if (uInt162 == B) {
                    return ImageHeaderParser.ImageType.ANIMATED_AVIF;
                }
                if (uInt162 == A) {
                    z4 = true;
                }
                i5++;
                i6 -= 4;
            }
        }
        return z4 ? ImageHeaderParser.ImageType.AVIF : ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @androidx.annotation.o0
    public ImageHeaderParser.ImageType a(@androidx.annotation.o0 ByteBuffer byteBuffer) throws IOException {
        return g(new a((ByteBuffer) com.bumptech.glide.util.m.f(byteBuffer, ProtectedSandApp.s("ই"))));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int b(@androidx.annotation.o0 ByteBuffer byteBuffer, @androidx.annotation.o0 com.bumptech.glide.load.engine.bitmap_recycle.b bVar) throws IOException {
        String s4 = ProtectedSandApp.s("ই");
        return f(new a((ByteBuffer) com.bumptech.glide.util.m.f(byteBuffer, s4)), (com.bumptech.glide.load.engine.bitmap_recycle.b) com.bumptech.glide.util.m.f(bVar, s4));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @androidx.annotation.o0
    public ImageHeaderParser.ImageType c(@androidx.annotation.o0 InputStream inputStream) throws IOException {
        return g(new c((InputStream) com.bumptech.glide.util.m.f(inputStream, ProtectedSandApp.s("ই"))));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int d(@androidx.annotation.o0 InputStream inputStream, @androidx.annotation.o0 com.bumptech.glide.load.engine.bitmap_recycle.b bVar) throws IOException {
        String s4 = ProtectedSandApp.s("ই");
        return f(new c((InputStream) com.bumptech.glide.util.m.f(inputStream, s4)), (com.bumptech.glide.load.engine.bitmap_recycle.b) com.bumptech.glide.util.m.f(bVar, s4));
    }
}
