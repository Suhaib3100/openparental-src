package com.android.volley.toolbox;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.m1;
import androidx.compose.material3.j4;
import androidx.compose.runtime.snapshots.f0;
import com.android.volley.e;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: DiskBasedCache.java */
/* loaded from: classes3.dex */
public class j implements com.android.volley.e {

    /* renamed from: e, reason: collision with root package name */
    private static final int f41015e = 5242880;

    /* renamed from: f, reason: collision with root package name */
    @m1
    static final float f41016f = 0.9f;

    /* renamed from: g, reason: collision with root package name */
    private static final int f41017g = 538247942;

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, b> f41018a;

    /* renamed from: b, reason: collision with root package name */
    private long f41019b;

    /* renamed from: c, reason: collision with root package name */
    private final d f41020c;

    /* renamed from: d, reason: collision with root package name */
    private final int f41021d;

    /* compiled from: DiskBasedCache.java */
    class a implements d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ File f41022a;

        a(File file) {
            this.f41022a = file;
        }

        @Override // com.android.volley.toolbox.j.d
        public File get() {
            return this.f41022a;
        }
    }

    /* compiled from: DiskBasedCache.java */
    public interface d {
        File get();
    }

    public j(File file, int i4) {
        this.f41018a = new LinkedHashMap(16, 0.75f, true);
        this.f41019b = 0L;
        this.f41020c = new a(file);
        this.f41021d = i4;
    }

    private String g(String str) {
        int length = str.length() / 2;
        StringBuilder a5 = j4.a(String.valueOf(str.substring(0, length).hashCode()));
        a5.append(String.valueOf(str.substring(length).hashCode()));
        return a5.toString();
    }

    private void h() {
        if (this.f41020c.get().exists()) {
            return;
        }
        com.android.volley.t.b(ProtectedSandApp.s("ڹ"), new Object[0]);
        this.f41018a.clear();
        this.f41019b = 0L;
        c();
    }

    private void i() {
        if (this.f41019b < this.f41021d) {
            return;
        }
        int i4 = 0;
        if (com.android.volley.t.f40943b) {
            com.android.volley.t.f(ProtectedSandApp.s("ں"), new Object[0]);
        }
        long j4 = this.f41019b;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Iterator<Map.Entry<String, b>> it = this.f41018a.entrySet().iterator();
        while (it.hasNext()) {
            b value = it.next().getValue();
            if (f(value.f41025b).delete()) {
                this.f41019b -= value.f41024a;
            } else {
                String str = value.f41025b;
                com.android.volley.t.b(ProtectedSandApp.s("ڻ"), str, g(str));
            }
            it.remove();
            i4++;
            if (this.f41019b < this.f41021d * f41016f) {
                break;
            }
        }
        if (com.android.volley.t.f40943b) {
            com.android.volley.t.f(ProtectedSandApp.s("ڼ"), Integer.valueOf(i4), Long.valueOf(this.f41019b - j4), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
        }
    }

    private void j(String str, b bVar) {
        if (this.f41018a.containsKey(str)) {
            this.f41019b = (bVar.f41024a - this.f41018a.get(str).f41024a) + this.f41019b;
        } else {
            this.f41019b += bVar.f41024a;
        }
        this.f41018a.put(str, bVar);
    }

    private static int k(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    static List<com.android.volley.i> l(c cVar) throws IOException {
        int m4 = m(cVar);
        if (m4 < 0) {
            throw new IOException(android.support.v4.media.a.a(ProtectedSandApp.s("ڽ"), m4));
        }
        List<com.android.volley.i> emptyList = m4 == 0 ? Collections.emptyList() : new ArrayList<>();
        for (int i4 = 0; i4 < m4; i4++) {
            emptyList.add(new com.android.volley.i(o(cVar).intern(), o(cVar).intern()));
        }
        return emptyList;
    }

    static int m(InputStream inputStream) throws IOException {
        return (k(inputStream) << 24) | k(inputStream) | (k(inputStream) << 8) | (k(inputStream) << 16);
    }

    static long n(InputStream inputStream) throws IOException {
        return (k(inputStream) & 255) | ((k(inputStream) & 255) << 8) | ((k(inputStream) & 255) << 16) | ((k(inputStream) & 255) << 24) | ((k(inputStream) & 255) << 32) | ((k(inputStream) & 255) << 40) | ((k(inputStream) & 255) << 48) | ((255 & k(inputStream)) << 56);
    }

    static String o(c cVar) throws IOException {
        return new String(q(cVar, n(cVar)), ProtectedSandApp.s("ھ"));
    }

    private void p(String str) {
        b remove = this.f41018a.remove(str);
        if (remove != null) {
            this.f41019b -= remove.f41024a;
        }
    }

    @m1
    static byte[] q(c cVar, long j4) throws IOException {
        long b5 = cVar.b();
        if (j4 >= 0 && j4 <= b5) {
            int i4 = (int) j4;
            if (i4 == j4) {
                byte[] bArr = new byte[i4];
                new DataInputStream(cVar).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder a5 = f0.a(ProtectedSandApp.s("ڿ"), j4, ProtectedSandApp.s("ۀ"));
        a5.append(b5);
        throw new IOException(a5.toString());
    }

    static void r(List<com.android.volley.i> list, OutputStream outputStream) throws IOException {
        if (list == null) {
            s(outputStream, 0);
            return;
        }
        s(outputStream, list.size());
        for (com.android.volley.i iVar : list) {
            u(outputStream, iVar.a());
            u(outputStream, iVar.b());
        }
    }

    static void s(OutputStream outputStream, int i4) throws IOException {
        outputStream.write(i4 & 255);
        outputStream.write((i4 >> 8) & 255);
        outputStream.write((i4 >> 16) & 255);
        outputStream.write((i4 >> 24) & 255);
    }

    static void t(OutputStream outputStream, long j4) throws IOException {
        outputStream.write((byte) j4);
        outputStream.write((byte) (j4 >>> 8));
        outputStream.write((byte) (j4 >>> 16));
        outputStream.write((byte) (j4 >>> 24));
        outputStream.write((byte) (j4 >>> 32));
        outputStream.write((byte) (j4 >>> 40));
        outputStream.write((byte) (j4 >>> 48));
        outputStream.write((byte) (j4 >>> 56));
    }

    static void u(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes(ProtectedSandApp.s("ھ"));
        t(outputStream, bytes.length);
        outputStream.write(bytes, 0, bytes.length);
    }

    @m1
    InputStream a(File file) throws FileNotFoundException {
        return new FileInputStream(file);
    }

    @m1
    OutputStream b(File file) throws FileNotFoundException {
        return new FileOutputStream(file);
    }

    @Override // com.android.volley.e
    public synchronized void c() {
        File file = this.f41020c.get();
        if (!file.exists()) {
            if (!file.mkdirs()) {
                com.android.volley.t.c(ProtectedSandApp.s("ہ"), file.getAbsolutePath());
            }
            return;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file2 : listFiles) {
            try {
                long length = file2.length();
                c cVar = new c(new BufferedInputStream(a(file2)), length);
                try {
                    b b5 = b.b(cVar);
                    b5.f41024a = length;
                    j(b5.f41025b, b5);
                    cVar.close();
                } catch (Throwable th) {
                    cVar.close();
                    throw th;
                }
            } catch (IOException unused) {
                file2.delete();
            }
        }
    }

    @Override // com.android.volley.e
    public synchronized void clear() {
        try {
            File[] listFiles = this.f41020c.get().listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    file.delete();
                }
            }
            this.f41018a.clear();
            this.f41019b = 0L;
            com.android.volley.t.b(ProtectedSandApp.s("ۂ"), new Object[0]);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.android.volley.e
    public synchronized void d(String str, boolean z4) {
        try {
            e.a aVar = get(str);
            if (aVar != null) {
                aVar.f40867f = 0L;
                if (z4) {
                    aVar.f40866e = 0L;
                }
                e(str, aVar);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.android.volley.e
    public synchronized void e(String str, e.a aVar) {
        BufferedOutputStream bufferedOutputStream;
        b bVar;
        long j4 = this.f41019b;
        byte[] bArr = aVar.f40862a;
        long length = j4 + bArr.length;
        int i4 = this.f41021d;
        if (length <= i4 || bArr.length <= i4 * f41016f) {
            File f4 = f(str);
            try {
                bufferedOutputStream = new BufferedOutputStream(b(f4));
                bVar = new b(str, aVar);
            } catch (IOException unused) {
                if (!f4.delete()) {
                    com.android.volley.t.b(ProtectedSandApp.s("ۄ"), f4.getAbsolutePath());
                }
                h();
            }
            if (!bVar.d(bufferedOutputStream)) {
                bufferedOutputStream.close();
                com.android.volley.t.b(ProtectedSandApp.s("ۃ"), f4.getAbsolutePath());
                throw new IOException();
            }
            bufferedOutputStream.write(aVar.f40862a);
            bufferedOutputStream.close();
            bVar.f41024a = f4.length();
            j(str, bVar);
            i();
        }
    }

    public File f(String str) {
        return new File(this.f41020c.get(), g(str));
    }

    @Override // com.android.volley.e
    public synchronized e.a get(String str) {
        b bVar = this.f41018a.get(str);
        if (bVar == null) {
            return null;
        }
        File f4 = f(str);
        try {
            c cVar = new c(new BufferedInputStream(a(f4)), f4.length());
            try {
                b b5 = b.b(cVar);
                if (TextUtils.equals(str, b5.f41025b)) {
                    return bVar.c(q(cVar, cVar.b()));
                }
                com.android.volley.t.b(ProtectedSandApp.s("ۅ"), f4.getAbsolutePath(), str, b5.f41025b);
                p(str);
                return null;
            } finally {
                cVar.close();
            }
        } catch (IOException e4) {
            com.android.volley.t.b(ProtectedSandApp.s("ۆ"), f4.getAbsolutePath(), e4.toString());
            remove(str);
            return null;
        }
    }

    @Override // com.android.volley.e
    public synchronized void remove(String str) {
        boolean delete = f(str).delete();
        p(str);
        if (!delete) {
            com.android.volley.t.b(ProtectedSandApp.s("ڻ"), str, g(str));
        }
    }

    /* compiled from: DiskBasedCache.java */
    @m1
    static class c extends FilterInputStream {

        /* renamed from: b, reason: collision with root package name */
        private final long f41032b;

        /* renamed from: c, reason: collision with root package name */
        private long f41033c;

        c(InputStream inputStream, long j4) {
            super(inputStream);
            this.f41032b = j4;
        }

        @m1
        long a() {
            return this.f41033c;
        }

        long b() {
            return this.f41032b - this.f41033c;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            int read = super.read();
            if (read != -1) {
                this.f41033c++;
            }
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i4, int i5) throws IOException {
            int read = super.read(bArr, i4, i5);
            if (read != -1) {
                this.f41033c += read;
            }
            return read;
        }
    }

    public j(d dVar, int i4) {
        this.f41018a = new LinkedHashMap(16, 0.75f, true);
        this.f41019b = 0L;
        this.f41020c = dVar;
        this.f41021d = i4;
    }

    /* compiled from: DiskBasedCache.java */
    @m1
    static class b {

        /* renamed from: a, reason: collision with root package name */
        long f41024a;

        /* renamed from: b, reason: collision with root package name */
        final String f41025b;

        /* renamed from: c, reason: collision with root package name */
        final String f41026c;

        /* renamed from: d, reason: collision with root package name */
        final long f41027d;

        /* renamed from: e, reason: collision with root package name */
        final long f41028e;

        /* renamed from: f, reason: collision with root package name */
        final long f41029f;

        /* renamed from: g, reason: collision with root package name */
        final long f41030g;

        /* renamed from: h, reason: collision with root package name */
        final List<com.android.volley.i> f41031h;

        private b(String str, String str2, long j4, long j5, long j6, long j7, List<com.android.volley.i> list) {
            this.f41025b = str;
            this.f41026c = "".equals(str2) ? null : str2;
            this.f41027d = j4;
            this.f41028e = j5;
            this.f41029f = j6;
            this.f41030g = j7;
            this.f41031h = list;
        }

        private static List<com.android.volley.i> a(e.a aVar) {
            List<com.android.volley.i> list = aVar.f40869h;
            return list != null ? list : m.i(aVar.f40868g);
        }

        static b b(c cVar) throws IOException {
            if (j.m(cVar) == j.f41017g) {
                return new b(j.o(cVar), j.o(cVar), j.n(cVar), j.n(cVar), j.n(cVar), j.n(cVar), j.l(cVar));
            }
            throw new IOException();
        }

        e.a c(byte[] bArr) {
            e.a aVar = new e.a();
            aVar.f40862a = bArr;
            aVar.f40863b = this.f41026c;
            aVar.f40864c = this.f41027d;
            aVar.f40865d = this.f41028e;
            aVar.f40866e = this.f41029f;
            aVar.f40867f = this.f41030g;
            aVar.f40868g = m.j(this.f41031h);
            aVar.f40869h = Collections.unmodifiableList(this.f41031h);
            return aVar;
        }

        boolean d(OutputStream outputStream) {
            try {
                j.s(outputStream, j.f41017g);
                j.u(outputStream, this.f41025b);
                String str = this.f41026c;
                if (str == null) {
                    str = "";
                }
                j.u(outputStream, str);
                j.t(outputStream, this.f41027d);
                j.t(outputStream, this.f41028e);
                j.t(outputStream, this.f41029f);
                j.t(outputStream, this.f41030g);
                j.r(this.f41031h, outputStream);
                outputStream.flush();
                return true;
            } catch (IOException e4) {
                com.android.volley.t.b(ProtectedSandApp.s("ڸ"), e4.toString());
                return false;
            }
        }

        b(String str, e.a aVar) {
            this(str, aVar.f40863b, aVar.f40864c, aVar.f40865d, aVar.f40866e, aVar.f40867f, a(aVar));
        }
    }

    public j(File file) {
        this(file, f41015e);
    }

    public j(d dVar) {
        this(dVar, f41015e);
    }
}
