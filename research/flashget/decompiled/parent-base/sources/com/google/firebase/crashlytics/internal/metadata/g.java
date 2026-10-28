package com.google.firebase.crashlytics.internal.metadata;

import android.support.v4.media.session.PlaybackStateCompat;
import com.flashget.parentalcontrol.ProtectedSandApp;
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

/* compiled from: QueueFile.java */
/* loaded from: classes6.dex */
class g implements Closeable {

    /* renamed from: h, reason: collision with root package name */
    private static final Logger f58918h = Logger.getLogger(g.class.getName());

    /* renamed from: i, reason: collision with root package name */
    private static final int f58919i = 4096;

    /* renamed from: j, reason: collision with root package name */
    static final int f58920j = 16;

    /* renamed from: b, reason: collision with root package name */
    private final RandomAccessFile f58921b;

    /* renamed from: c, reason: collision with root package name */
    int f58922c;

    /* renamed from: d, reason: collision with root package name */
    private int f58923d;

    /* renamed from: e, reason: collision with root package name */
    private b f58924e;

    /* renamed from: f, reason: collision with root package name */
    private b f58925f;

    /* renamed from: g, reason: collision with root package name */
    private final byte[] f58926g;

    /* compiled from: QueueFile.java */
    class a implements d {

        /* renamed from: a, reason: collision with root package name */
        boolean f58927a = true;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ StringBuilder f58928b;

        a(StringBuilder sb) {
            this.f58928b = sb;
        }

        @Override // com.google.firebase.crashlytics.internal.metadata.g.d
        public void a(InputStream inputStream, int i4) throws IOException {
            if (this.f58927a) {
                this.f58927a = false;
            } else {
                this.f58928b.append(ProtectedSandApp.s("ﴠ"));
            }
            this.f58928b.append(i4);
        }
    }

    /* compiled from: QueueFile.java */
    static class b {

        /* renamed from: c, reason: collision with root package name */
        static final int f58930c = 4;

        /* renamed from: d, reason: collision with root package name */
        static final b f58931d = new b(0, 0);

        /* renamed from: a, reason: collision with root package name */
        final int f58932a;

        /* renamed from: b, reason: collision with root package name */
        final int f58933b;

        b(int i4, int i5) {
            this.f58932a = i4;
            this.f58933b = i5;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getSimpleName());
            sb.append(ProtectedSandApp.s("ﴡ"));
            sb.append(this.f58932a);
            sb.append(ProtectedSandApp.s("ﴢ"));
            return android.support.v4.media.b.a(sb, this.f58933b, ProtectedSandApp.s("ﴣ"));
        }
    }

    /* compiled from: QueueFile.java */
    private final class c extends InputStream {

        /* renamed from: b, reason: collision with root package name */
        private int f58934b;

        /* renamed from: c, reason: collision with root package name */
        private int f58935c;

        /* synthetic */ c(g gVar, b bVar, a aVar) {
            this(bVar);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i4, int i5) throws IOException {
            g.n(bArr, ProtectedSandApp.s("ﴤ"));
            if ((i4 | i5) < 0 || i5 > bArr.length - i4) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i6 = this.f58935c;
            if (i6 <= 0) {
                return -1;
            }
            if (i5 > i6) {
                i5 = i6;
            }
            g.this.B(this.f58934b, bArr, i4, i5);
            this.f58934b = g.this.G(this.f58934b + i5);
            this.f58935c -= i5;
            return i5;
        }

        private c(b bVar) {
            this.f58934b = g.this.G(bVar.f58932a + 4);
            this.f58935c = bVar.f58933b;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (this.f58935c == 0) {
                return -1;
            }
            g.this.f58921b.seek(this.f58934b);
            int read = g.this.f58921b.read();
            this.f58934b = g.this.G(this.f58934b + 1);
            this.f58935c--;
            return read;
        }
    }

    /* compiled from: QueueFile.java */
    public interface d {
        void a(InputStream inputStream, int i4) throws IOException;
    }

    public g(File file) throws IOException {
        this.f58926g = new byte[16];
        if (!file.exists()) {
            l(file);
        }
        this.f58921b = o(file);
        u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B(int i4, byte[] bArr, int i5, int i6) throws IOException {
        int G = G(i4);
        int i7 = G + i6;
        int i10 = this.f58922c;
        if (i7 <= i10) {
            this.f58921b.seek(G);
            this.f58921b.readFully(bArr, i5, i6);
            return;
        }
        int i11 = i10 - G;
        this.f58921b.seek(G);
        this.f58921b.readFully(bArr, i5, i11);
        this.f58921b.seek(16L);
        this.f58921b.readFully(bArr, i5 + i11, i6 - i11);
    }

    private void C(int i4, byte[] bArr, int i5, int i6) throws IOException {
        int G = G(i4);
        int i7 = G + i6;
        int i10 = this.f58922c;
        if (i7 <= i10) {
            this.f58921b.seek(G);
            this.f58921b.write(bArr, i5, i6);
            return;
        }
        int i11 = i10 - G;
        this.f58921b.seek(G);
        this.f58921b.write(bArr, i5, i11);
        this.f58921b.seek(16L);
        this.f58921b.write(bArr, i5 + i11, i6 - i11);
    }

    private void D(int i4) throws IOException {
        this.f58921b.setLength(i4);
        this.f58921b.getChannel().force(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int G(int i4) {
        int i5 = this.f58922c;
        return i4 < i5 ? i4 : (i4 + 16) - i5;
    }

    private void H(int i4, int i5, int i6, int i7) throws IOException {
        J(this.f58926g, i4, i5, i6, i7);
        this.f58921b.seek(0L);
        this.f58921b.write(this.f58926g);
    }

    private static void I(byte[] bArr, int i4, int i5) {
        bArr[i4] = (byte) (i5 >> 24);
        bArr[i4 + 1] = (byte) (i5 >> 16);
        bArr[i4 + 2] = (byte) (i5 >> 8);
        bArr[i4 + 3] = (byte) i5;
    }

    private static void J(byte[] bArr, int... iArr) {
        int i4 = 0;
        for (int i5 : iArr) {
            I(bArr, i4, i5);
            i4 += 4;
        }
    }

    private void h(int i4) throws IOException {
        int i5 = i4 + 4;
        int y4 = y();
        if (y4 >= i5) {
            return;
        }
        int i6 = this.f58922c;
        do {
            y4 += i6;
            i6 <<= 1;
        } while (y4 < i5);
        D(i6);
        b bVar = this.f58925f;
        int G = G(bVar.f58932a + 4 + bVar.f58933b);
        if (G < this.f58924e.f58932a) {
            FileChannel channel = this.f58921b.getChannel();
            channel.position(this.f58922c);
            long j4 = G - 4;
            if (channel.transferTo(16L, j4, channel) != j4) {
                throw new AssertionError(ProtectedSandApp.s("ﴥ"));
            }
        }
        int i7 = this.f58925f.f58932a;
        int i10 = this.f58924e.f58932a;
        if (i7 < i10) {
            int i11 = (this.f58922c + i7) - 16;
            H(i6, this.f58923d, i10, i11);
            this.f58925f = new b(i11, this.f58925f.f58933b);
        } else {
            H(i6, this.f58923d, i10, i7);
        }
        this.f58922c = i6;
    }

    private static void l(File file) throws IOException {
        File file2 = new File(file.getPath() + ProtectedSandApp.s("ﴦ"));
        RandomAccessFile o4 = o(file2);
        try {
            o4.setLength(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
            o4.seek(0L);
            byte[] bArr = new byte[16];
            J(bArr, 4096, 0, 0, 0);
            o4.write(bArr);
            o4.close();
            if (!file2.renameTo(file)) {
                throw new IOException(ProtectedSandApp.s("ﴧ"));
            }
        } catch (Throwable th) {
            o4.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> T n(T t4, String str) {
        if (t4 != null) {
            return t4;
        }
        throw new NullPointerException(str);
    }

    private static RandomAccessFile o(File file) throws FileNotFoundException {
        return new RandomAccessFile(file, ProtectedSandApp.s("ﴨ"));
    }

    private b t(int i4) throws IOException {
        if (i4 == 0) {
            return b.f58931d;
        }
        this.f58921b.seek(i4);
        return new b(i4, this.f58921b.readInt());
    }

    private void u() throws IOException {
        this.f58921b.seek(0L);
        this.f58921b.readFully(this.f58926g);
        int x4 = x(this.f58926g, 0);
        this.f58922c = x4;
        if (x4 > this.f58921b.length()) {
            throw new IOException(ProtectedSandApp.s("ﴩ") + this.f58922c + ProtectedSandApp.s("ﴪ") + this.f58921b.length());
        }
        this.f58923d = x(this.f58926g, 4);
        int x5 = x(this.f58926g, 8);
        int x6 = x(this.f58926g, 12);
        this.f58924e = t(x5);
        this.f58925f = t(x6);
    }

    private static int x(byte[] bArr, int i4) {
        return ((bArr[i4] & 255) << 24) + ((bArr[i4 + 1] & 255) << 16) + ((bArr[i4 + 2] & 255) << 8) + (bArr[i4 + 3] & 255);
    }

    private int y() {
        return this.f58922c - F();
    }

    public synchronized int E() {
        return this.f58923d;
    }

    public int F() {
        if (this.f58923d == 0) {
            return 16;
        }
        b bVar = this.f58925f;
        int i4 = bVar.f58932a;
        int i5 = this.f58924e.f58932a;
        return i4 >= i5 ? (i4 - i5) + 4 + bVar.f58933b + 16 : (((i4 + 4) + bVar.f58933b) + this.f58922c) - i5;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.f58921b.close();
    }

    public void e(byte[] bArr) throws IOException {
        f(bArr, 0, bArr.length);
    }

    public synchronized void f(byte[] bArr, int i4, int i5) throws IOException {
        int G;
        try {
            n(bArr, ProtectedSandApp.s("ﴫ"));
            if ((i4 | i5) < 0 || i5 > bArr.length - i4) {
                throw new IndexOutOfBoundsException();
            }
            h(i5);
            boolean m4 = m();
            if (m4) {
                G = 16;
            } else {
                b bVar = this.f58925f;
                G = G(bVar.f58932a + 4 + bVar.f58933b);
            }
            b bVar2 = new b(G, i5);
            I(this.f58926g, 0, i5);
            C(bVar2.f58932a, this.f58926g, 0, 4);
            C(bVar2.f58932a + 4, bArr, i4, i5);
            H(this.f58922c, this.f58923d + 1, m4 ? bVar2.f58932a : this.f58924e.f58932a, bVar2.f58932a);
            this.f58925f = bVar2;
            this.f58923d++;
            if (m4) {
                this.f58924e = bVar2;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void g() throws IOException {
        try {
            H(4096, 0, 0, 0);
            this.f58923d = 0;
            b bVar = b.f58931d;
            this.f58924e = bVar;
            this.f58925f = bVar;
            if (this.f58922c > 4096) {
                D(4096);
            }
            this.f58922c = 4096;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void i(d dVar) throws IOException {
        int i4 = this.f58924e.f58932a;
        for (int i5 = 0; i5 < this.f58923d; i5++) {
            b t4 = t(i4);
            dVar.a(new c(this, t4, null), t4.f58933b);
            i4 = G(t4.f58932a + 4 + t4.f58933b);
        }
    }

    public boolean k(int i4, int i5) {
        return (F() + 4) + i4 <= i5;
    }

    public synchronized boolean m() {
        return this.f58923d == 0;
    }

    public synchronized void q(d dVar) throws IOException {
        if (this.f58923d > 0) {
            dVar.a(new c(this, this.f58924e, null), this.f58924e.f58933b);
        }
    }

    public synchronized byte[] s() throws IOException {
        if (m()) {
            return null;
        }
        b bVar = this.f58924e;
        int i4 = bVar.f58933b;
        byte[] bArr = new byte[i4];
        B(bVar.f58932a + 4, bArr, 0, i4);
        return bArr;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(ProtectedSandApp.s("ﴬ"));
        sb.append(this.f58922c);
        sb.append(ProtectedSandApp.s("ﴭ"));
        sb.append(this.f58923d);
        sb.append(ProtectedSandApp.s("ﴮ"));
        sb.append(this.f58924e);
        sb.append(ProtectedSandApp.s("ﴯ"));
        sb.append(this.f58925f);
        sb.append(ProtectedSandApp.s("ﴰ"));
        try {
            i(new a(sb));
        } catch (IOException e4) {
            f58918h.log(Level.WARNING, ProtectedSandApp.s("ﴱ"), (Throwable) e4);
        }
        sb.append(ProtectedSandApp.s("ﴲ"));
        return sb.toString();
    }

    public synchronized void z() throws IOException {
        try {
            if (m()) {
                throw new NoSuchElementException();
            }
            if (this.f58923d == 1) {
                g();
            } else {
                b bVar = this.f58924e;
                int G = G(bVar.f58932a + 4 + bVar.f58933b);
                B(G, this.f58926g, 0, 4);
                int x4 = x(this.f58926g, 0);
                H(this.f58922c, this.f58923d - 1, G, this.f58925f.f58932a);
                this.f58923d--;
                this.f58924e = new b(G, x4);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    g(RandomAccessFile randomAccessFile) throws IOException {
        this.f58926g = new byte[16];
        this.f58921b = randomAccessFile;
        u();
    }
}
