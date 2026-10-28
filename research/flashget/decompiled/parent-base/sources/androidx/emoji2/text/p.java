package androidx.emoji2.text;

import android.content.res.AssetManager;
import androidx.annotation.c1;
import androidx.annotation.g0;
import androidx.annotation.o0;
import androidx.annotation.x0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.g2;

/* compiled from: MetadataListReader.java */
@androidx.annotation.d
@c1({c1.a.LIBRARY})
@x0(19)
/* loaded from: classes3.dex */
class p {

    /* renamed from: a, reason: collision with root package name */
    private static final int f29494a = 1164798569;

    /* renamed from: b, reason: collision with root package name */
    private static final int f29495b = 1701669481;

    /* renamed from: c, reason: collision with root package name */
    private static final int f29496c = 1835365473;

    /* compiled from: MetadataListReader.java */
    private static class a implements d {

        /* renamed from: c, reason: collision with root package name */
        @o0
        private final ByteBuffer f29497c;

        a(@o0 ByteBuffer byteBuffer) {
            this.f29497c = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // androidx.emoji2.text.p.d
        public void b(int i4) throws IOException {
            ByteBuffer byteBuffer = this.f29497c;
            byteBuffer.position(byteBuffer.position() + i4);
        }

        @Override // androidx.emoji2.text.p.d
        public int c() throws IOException {
            return this.f29497c.getInt();
        }

        @Override // androidx.emoji2.text.p.d
        public long d() throws IOException {
            return this.f29497c.getInt() & 4294967295L;
        }

        @Override // androidx.emoji2.text.p.d
        public long getPosition() {
            return this.f29497c.position();
        }

        @Override // androidx.emoji2.text.p.d
        public int readUnsignedShort() throws IOException {
            return this.f29497c.getShort() & g2.f75095e;
        }
    }

    /* compiled from: MetadataListReader.java */
    private static class b implements d {

        /* renamed from: c, reason: collision with root package name */
        @o0
        private final byte[] f29498c;

        /* renamed from: d, reason: collision with root package name */
        @o0
        private final ByteBuffer f29499d;

        /* renamed from: e, reason: collision with root package name */
        @o0
        private final InputStream f29500e;

        /* renamed from: f, reason: collision with root package name */
        private long f29501f = 0;

        b(@o0 InputStream inputStream) {
            this.f29500e = inputStream;
            byte[] bArr = new byte[4];
            this.f29498c = bArr;
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            this.f29499d = wrap;
            wrap.order(ByteOrder.BIG_ENDIAN);
        }

        private void a(@g0(from = 0, to = 4) int i4) throws IOException {
            if (this.f29500e.read(this.f29498c, 0, i4) != i4) {
                throw new IOException("read failed");
            }
            this.f29501f += i4;
        }

        @Override // androidx.emoji2.text.p.d
        public void b(int i4) throws IOException {
            while (i4 > 0) {
                int skip = (int) this.f29500e.skip(i4);
                if (skip < 1) {
                    throw new IOException("Skip didn't move at least 1 byte forward");
                }
                i4 -= skip;
                this.f29501f += skip;
            }
        }

        @Override // androidx.emoji2.text.p.d
        public int c() throws IOException {
            this.f29499d.position(0);
            a(4);
            return this.f29499d.getInt();
        }

        @Override // androidx.emoji2.text.p.d
        public long d() throws IOException {
            this.f29499d.position(0);
            a(4);
            return this.f29499d.getInt() & 4294967295L;
        }

        @Override // androidx.emoji2.text.p.d
        public long getPosition() {
            return this.f29501f;
        }

        @Override // androidx.emoji2.text.p.d
        public int readUnsignedShort() throws IOException {
            this.f29499d.position(0);
            a(2);
            return this.f29499d.getShort() & g2.f75095e;
        }
    }

    /* compiled from: MetadataListReader.java */
    private static class c {

        /* renamed from: a, reason: collision with root package name */
        private final long f29502a;

        /* renamed from: b, reason: collision with root package name */
        private final long f29503b;

        c(long j4, long j5) {
            this.f29502a = j4;
            this.f29503b = j5;
        }

        long a() {
            return this.f29503b;
        }

        long b() {
            return this.f29502a;
        }
    }

    /* compiled from: MetadataListReader.java */
    private interface d {

        /* renamed from: a, reason: collision with root package name */
        public static final int f29504a = 2;

        /* renamed from: b, reason: collision with root package name */
        public static final int f29505b = 4;

        void b(int i4) throws IOException;

        int c() throws IOException;

        long d() throws IOException;

        long getPosition();

        int readUnsignedShort() throws IOException;
    }

    private p() {
    }

    private static c a(d dVar) throws IOException {
        long j4;
        dVar.b(4);
        int readUnsignedShort = dVar.readUnsignedShort();
        if (readUnsignedShort > 100) {
            throw new IOException("Cannot read metadata.");
        }
        dVar.b(6);
        int i4 = 0;
        while (true) {
            if (i4 >= readUnsignedShort) {
                j4 = -1;
                break;
            }
            int c5 = dVar.c();
            dVar.b(4);
            j4 = dVar.d();
            dVar.b(4);
            if (f29496c == c5) {
                break;
            }
            i4++;
        }
        if (j4 != -1) {
            dVar.b((int) (j4 - dVar.getPosition()));
            dVar.b(12);
            long d5 = dVar.d();
            for (int i5 = 0; i5 < d5; i5++) {
                int c6 = dVar.c();
                long d6 = dVar.d();
                long d7 = dVar.d();
                if (f29494a == c6 || f29495b == c6) {
                    return new c(d6 + j4, d7);
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    static androidx.emoji2.text.flatbuffer.o b(AssetManager assetManager, String str) throws IOException {
        InputStream open = assetManager.open(str);
        try {
            androidx.emoji2.text.flatbuffer.o c5 = c(open);
            if (open != null) {
                open.close();
            }
            return c5;
        } catch (Throwable th) {
            if (open != null) {
                try {
                    open.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static androidx.emoji2.text.flatbuffer.o c(InputStream inputStream) throws IOException {
        b bVar = new b(inputStream);
        c a5 = a(bVar);
        bVar.b((int) (a5.b() - bVar.getPosition()));
        ByteBuffer allocate = ByteBuffer.allocate((int) a5.a());
        int read = inputStream.read(allocate.array());
        if (read == a5.a()) {
            return androidx.emoji2.text.flatbuffer.o.G(allocate);
        }
        throw new IOException("Needed " + a5.a() + " bytes, got " + read);
    }

    static androidx.emoji2.text.flatbuffer.o d(ByteBuffer byteBuffer) throws IOException {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position((int) a(new a(duplicate)).b());
        return androidx.emoji2.text.flatbuffer.o.G(duplicate);
    }

    static long e(int i4) {
        return i4 & 4294967295L;
    }

    static int f(short s4) {
        return s4 & g2.f75095e;
    }
}
