package com.google.firebase.crashlytics.internal.metadata;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.UByte;

/* compiled from: QueueFile.java */
/* loaded from: classes2.dex */
class g implements Closeable {

    /* renamed from: u, reason: collision with root package name */
    private static final Logger f15816u = Logger.getLogger(g.class.getName());

    /* renamed from: v, reason: collision with root package name */
    private static final int f15817v = 4096;

    /* renamed from: w, reason: collision with root package name */
    static final int f15818w = 16;

    /* renamed from: o, reason: collision with root package name */
    private final RandomAccessFile f15819o;

    /* renamed from: p, reason: collision with root package name */
    int f15820p;

    /* renamed from: q, reason: collision with root package name */
    private int f15821q;

    /* renamed from: r, reason: collision with root package name */
    private b f15822r;

    /* renamed from: s, reason: collision with root package name */
    private b f15823s;

    /* renamed from: t, reason: collision with root package name */
    private final byte[] f15824t;

    /* compiled from: QueueFile.java */
    /* loaded from: classes3.dex */
    class a implements d {

        /* renamed from: a, reason: collision with root package name */
        boolean f15825a = true;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ StringBuilder f15826b;

        a(StringBuilder sb) {
            this.f15826b = sb;
        }

        @Override // com.google.firebase.crashlytics.internal.metadata.g.d
        public void b(InputStream inputStream, int i5) throws IOException {
            if (this.f15825a) {
                this.f15825a = false;
            } else {
                this.f15826b.append(ProtectedSandApp.s("⡏"));
            }
            this.f15826b.append(i5);
        }
    }

    /* compiled from: QueueFile.java */
    static class b {

        /* renamed from: c, reason: collision with root package name */
        static final int f15828c = 4;

        /* renamed from: d, reason: collision with root package name */
        static final b f15829d = new b(0, 0);

        /* renamed from: a, reason: collision with root package name */
        final int f15830a;

        /* renamed from: b, reason: collision with root package name */
        final int f15831b;

        b(int i5, int i6) {
            this.f15830a = i5;
            this.f15831b = i6;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getSimpleName());
            sb.append(ProtectedSandApp.s("ᓱ"));
            sb.append(this.f15830a);
            sb.append(ProtectedSandApp.s("ᓲ"));
            return androidx.constraintlayout.solver.e.a(sb, this.f15831b, ProtectedSandApp.s("ᓳ"));
        }
    }

    /* compiled from: QueueFile.java */
    private final class c extends InputStream {

        /* renamed from: o, reason: collision with root package name */
        private int f15832o;

        /* renamed from: p, reason: collision with root package name */
        private int f15833p;

        /* synthetic */ c(g gVar, b bVar, a aVar) {
            this(bVar);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i5, int i6) throws IOException {
            g.r(bArr, ProtectedSandApp.s("ᓴ"));
            if ((i5 | i6) < 0 || i6 > bArr.length - i5) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i7 = this.f15833p;
            if (i7 <= 0) {
                return -1;
            }
            if (i6 > i7) {
                i6 = i7;
            }
            g.this.O(this.f15832o, bArr, i5, i6);
            this.f15832o = g.this.Z(this.f15832o + i6);
            this.f15833p -= i6;
            return i6;
        }

        private c(b bVar) {
            this.f15832o = g.this.Z(bVar.f15830a + 4);
            this.f15833p = bVar.f15831b;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (this.f15833p == 0) {
                return -1;
            }
            g.this.f15819o.seek(this.f15832o);
            int read = g.this.f15819o.read();
            this.f15832o = g.this.Z(this.f15832o + 1);
            this.f15833p--;
            return read;
        }
    }

    /* compiled from: QueueFile.java */
    public interface d {
        void b(InputStream inputStream, int i5) throws IOException;
    }

    public g(File file) throws IOException {
        this.f15824t = new byte[16];
        if (!file.exists()) {
            n(file);
        }
        this.f15819o = t(file);
        D();
    }

    private b B(int i5) throws IOException {
        if (i5 == 0) {
            return b.f15829d;
        }
        this.f15819o.seek(i5);
        return new b(i5, this.f15819o.readInt());
    }

    private void D() throws IOException {
        this.f15819o.seek(0L);
        this.f15819o.readFully(this.f15824t);
        int F = F(this.f15824t, 0);
        this.f15820p = F;
        if (F > this.f15819o.length()) {
            throw new IOException(ProtectedSandApp.s("ᓵ") + this.f15820p + ProtectedSandApp.s("ᓶ") + this.f15819o.length());
        }
        this.f15821q = F(this.f15824t, 4);
        int F2 = F(this.f15824t, 8);
        int F3 = F(this.f15824t, 12);
        this.f15822r = B(F2);
        this.f15823s = B(F3);
    }

    private static int F(byte[] bArr, int i5) {
        return ((bArr[i5] & UByte.f27220r) << 24) + ((bArr[i5 + 1] & UByte.f27220r) << 16) + ((bArr[i5 + 2] & UByte.f27220r) << 8) + (bArr[i5 + 3] & UByte.f27220r);
    }

    private int G() {
        return this.f15820p - X();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O(int i5, byte[] bArr, int i6, int i7) throws IOException {
        int Z = Z(i5);
        int i8 = Z + i7;
        int i9 = this.f15820p;
        if (i8 <= i9) {
            this.f15819o.seek(Z);
            this.f15819o.readFully(bArr, i6, i7);
            return;
        }
        int i10 = i9 - Z;
        this.f15819o.seek(Z);
        this.f15819o.readFully(bArr, i6, i10);
        this.f15819o.seek(16L);
        this.f15819o.readFully(bArr, i6 + i10, i7 - i10);
    }

    private void P(int i5, byte[] bArr, int i6, int i7) throws IOException {
        int Z = Z(i5);
        int i8 = Z + i7;
        int i9 = this.f15820p;
        if (i8 <= i9) {
            this.f15819o.seek(Z);
            this.f15819o.write(bArr, i6, i7);
            return;
        }
        int i10 = i9 - Z;
        this.f15819o.seek(Z);
        this.f15819o.write(bArr, i6, i10);
        this.f15819o.seek(16L);
        this.f15819o.write(bArr, i6 + i10, i7 - i10);
    }

    private void R(int i5) throws IOException {
        this.f15819o.setLength(i5);
        this.f15819o.getChannel().force(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int Z(int i5) {
        int i6 = this.f15820p;
        return i5 < i6 ? i5 : (i5 + 16) - i6;
    }

    private void b0(int i5, int i6, int i7, int i8) throws IOException {
        e0(this.f15824t, i5, i6, i7, i8);
        this.f15819o.seek(0L);
        this.f15819o.write(this.f15824t);
    }

    private static void d0(byte[] bArr, int i5, int i6) {
        bArr[i5] = (byte) (i6 >> 24);
        bArr[i5 + 1] = (byte) (i6 >> 16);
        bArr[i5 + 2] = (byte) (i6 >> 8);
        bArr[i5 + 3] = (byte) i6;
    }

    private static void e0(byte[] bArr, int... iArr) {
        int i5 = 0;
        for (int i6 : iArr) {
            d0(bArr, i5, i6);
            i5 += 4;
        }
    }

    private void k(int i5) throws IOException {
        int i6 = i5 + 4;
        int G = G();
        if (G >= i6) {
            return;
        }
        int i7 = this.f15820p;
        do {
            G += i7;
            i7 <<= 1;
        } while (G < i6);
        R(i7);
        b bVar = this.f15823s;
        int Z = Z(bVar.f15830a + 4 + bVar.f15831b);
        if (Z < this.f15822r.f15830a) {
            FileChannel channel = this.f15819o.getChannel();
            channel.position(this.f15820p);
            long j5 = Z - 4;
            if (channel.transferTo(16L, j5, channel) != j5) {
                throw new AssertionError(ProtectedSandApp.s("ᓷ"));
            }
        }
        int i8 = this.f15823s.f15830a;
        int i9 = this.f15822r.f15830a;
        if (i8 < i9) {
            int i10 = (this.f15820p + i8) - 16;
            b0(i7, this.f15821q, i9, i10);
            this.f15823s = new b(i10, this.f15823s.f15831b);
        } else {
            b0(i7, this.f15821q, i9, i8);
        }
        this.f15820p = i7;
    }

    private static void n(File file) throws IOException {
        File file2 = new File(file.getPath() + ProtectedSandApp.s("ᓸ"));
        RandomAccessFile t5 = t(file2);
        try {
            t5.setLength(4096L);
            t5.seek(0L);
            byte[] bArr = new byte[16];
            e0(bArr, 4096, 0, 0, 0);
            t5.write(bArr);
            t5.close();
            if (!file2.renameTo(file)) {
                throw new IOException(ProtectedSandApp.s("ᓹ"));
            }
        } catch (Throwable th) {
            t5.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> T r(T t5, String str) {
        if (t5 != null) {
            return t5;
        }
        throw new NullPointerException(str);
    }

    private static RandomAccessFile t(File file) throws FileNotFoundException {
        return new RandomAccessFile(file, ProtectedSandApp.s("ᓺ"));
    }

    public synchronized void H() throws IOException {
        if (o()) {
            throw new NoSuchElementException();
        }
        if (this.f15821q == 1) {
            j();
        } else {
            b bVar = this.f15822r;
            int Z = Z(bVar.f15830a + 4 + bVar.f15831b);
            O(Z, this.f15824t, 0, 4);
            int F = F(this.f15824t, 0);
            b0(this.f15820p, this.f15821q - 1, Z, this.f15823s.f15830a);
            this.f15821q--;
            this.f15822r = new b(Z, F);
        }
    }

    public synchronized int U() {
        return this.f15821q;
    }

    public int X() {
        if (this.f15821q == 0) {
            return 16;
        }
        b bVar = this.f15823s;
        int i5 = bVar.f15830a;
        int i6 = this.f15822r.f15830a;
        return i5 >= i6 ? (i5 - i6) + 4 + bVar.f15831b + 16 : (((i5 + 4) + bVar.f15831b) + this.f15820p) - i6;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.f15819o.close();
    }

    public void e(byte[] bArr) throws IOException {
        g(bArr, 0, bArr.length);
    }

    public synchronized void g(byte[] bArr, int i5, int i6) throws IOException {
        int Z;
        r(bArr, ProtectedSandApp.s("ᓻ"));
        if ((i5 | i6) < 0 || i6 > bArr.length - i5) {
            throw new IndexOutOfBoundsException();
        }
        k(i6);
        boolean o5 = o();
        if (o5) {
            Z = 16;
        } else {
            b bVar = this.f15823s;
            Z = Z(bVar.f15830a + 4 + bVar.f15831b);
        }
        b bVar2 = new b(Z, i6);
        d0(this.f15824t, 0, i6);
        P(bVar2.f15830a, this.f15824t, 0, 4);
        P(bVar2.f15830a + 4, bArr, i5, i6);
        b0(this.f15820p, this.f15821q + 1, o5 ? bVar2.f15830a : this.f15822r.f15830a, bVar2.f15830a);
        this.f15823s = bVar2;
        this.f15821q++;
        if (o5) {
            this.f15822r = bVar2;
        }
    }

    public synchronized void j() throws IOException {
        b0(4096, 0, 0, 0);
        this.f15821q = 0;
        b bVar = b.f15829d;
        this.f15822r = bVar;
        this.f15823s = bVar;
        if (this.f15820p > 4096) {
            R(4096);
        }
        this.f15820p = 4096;
    }

    public synchronized void l(d dVar) throws IOException {
        int i5 = this.f15822r.f15830a;
        for (int i6 = 0; i6 < this.f15821q; i6++) {
            b B = B(i5);
            dVar.b(new c(this, B, null), B.f15831b);
            i5 = Z(B.f15830a + 4 + B.f15831b);
        }
    }

    public boolean m(int i5, int i6) {
        return (X() + 4) + i5 <= i6;
    }

    public synchronized boolean o() {
        return this.f15821q == 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(ProtectedSandApp.s("ᓼ"));
        sb.append(this.f15820p);
        sb.append(ProtectedSandApp.s("ᓽ"));
        sb.append(this.f15821q);
        sb.append(ProtectedSandApp.s("ᓾ"));
        sb.append(this.f15822r);
        sb.append(ProtectedSandApp.s("ᓿ"));
        sb.append(this.f15823s);
        sb.append(ProtectedSandApp.s("ᔀ"));
        try {
            l(new a(sb));
        } catch (IOException e6) {
            f15816u.log(Level.WARNING, ProtectedSandApp.s("ᔁ"), (Throwable) e6);
        }
        sb.append(ProtectedSandApp.s("ᔂ"));
        return sb.toString();
    }

    public synchronized void w(d dVar) throws IOException {
        if (this.f15821q > 0) {
            dVar.b(new c(this, this.f15822r, null), this.f15822r.f15831b);
        }
    }

    public synchronized byte[] z() throws IOException {
        if (o()) {
            return null;
        }
        b bVar = this.f15822r;
        int i5 = bVar.f15831b;
        byte[] bArr = new byte[i5];
        O(bVar.f15830a + 4, bArr, 0, i5);
        return bArr;
    }

    g(RandomAccessFile randomAccessFile) throws IOException {
        this.f15824t = new byte[16];
        this.f15819o = randomAccessFile;
        D();
    }
}
