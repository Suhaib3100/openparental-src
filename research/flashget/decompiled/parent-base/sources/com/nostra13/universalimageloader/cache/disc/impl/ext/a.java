package com.nostra13.universalimageloader.cache.disc.impl.ext;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: DiskLruCache.java */
/* loaded from: classes6.dex */
final class a implements Closeable {

    /* renamed from: w, reason: collision with root package name */
    static final long f70173w = -1;

    /* renamed from: b, reason: collision with root package name */
    private final File f70177b;

    /* renamed from: c, reason: collision with root package name */
    private final File f70178c;

    /* renamed from: d, reason: collision with root package name */
    private final File f70179d;

    /* renamed from: e, reason: collision with root package name */
    private final File f70180e;

    /* renamed from: f, reason: collision with root package name */
    private final int f70181f;

    /* renamed from: g, reason: collision with root package name */
    private long f70182g;

    /* renamed from: h, reason: collision with root package name */
    private int f70183h;

    /* renamed from: i, reason: collision with root package name */
    private final int f70184i;

    /* renamed from: l, reason: collision with root package name */
    private Writer f70187l;

    /* renamed from: n, reason: collision with root package name */
    private int f70189n;
    private static final String A = ProtectedSandApp.s("ᨊ\u0001");
    private static final String B = ProtectedSandApp.s("ᨋ\u0001");

    /* renamed from: r, reason: collision with root package name */
    static final String f70168r = ProtectedSandApp.s("ᨌ\u0001");

    /* renamed from: s, reason: collision with root package name */
    static final String f70169s = ProtectedSandApp.s("ᨍ\u0001");

    /* renamed from: t, reason: collision with root package name */
    static final String f70170t = ProtectedSandApp.s("ᨎ\u0001");

    /* renamed from: u, reason: collision with root package name */
    static final String f70171u = ProtectedSandApp.s("ᨏ\u0001");

    /* renamed from: v, reason: collision with root package name */
    static final String f70172v = ProtectedSandApp.s("ᨐ\u0001");

    /* renamed from: y, reason: collision with root package name */
    private static final String f70175y = ProtectedSandApp.s("ᨑ\u0001");

    /* renamed from: z, reason: collision with root package name */
    private static final String f70176z = ProtectedSandApp.s("ᨒ\u0001");

    /* renamed from: x, reason: collision with root package name */
    static final Pattern f70174x = Pattern.compile(ProtectedSandApp.s("ᨓ\u0001"));
    private static final OutputStream C = new b();

    /* renamed from: j, reason: collision with root package name */
    private long f70185j = 0;

    /* renamed from: k, reason: collision with root package name */
    private int f70186k = 0;

    /* renamed from: m, reason: collision with root package name */
    private final LinkedHashMap<String, d> f70188m = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: o, reason: collision with root package name */
    private long f70190o = 0;

    /* renamed from: p, reason: collision with root package name */
    final ThreadPoolExecutor f70191p = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: q, reason: collision with root package name */
    private final Callable<Void> f70192q = new CallableC0984a();

    /* compiled from: DiskLruCache.java */
    /* renamed from: com.nostra13.universalimageloader.cache.disc.impl.ext.a$a, reason: collision with other inner class name */
    class CallableC0984a implements Callable<Void> {
        CallableC0984a() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            synchronized (a.this) {
                try {
                    if (a.this.f70187l == null) {
                        return null;
                    }
                    a.this.O();
                    a.this.N();
                    if (a.this.E()) {
                        a.this.J();
                        a.this.f70189n = 0;
                    }
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* compiled from: DiskLruCache.java */
    static class b extends OutputStream {
        b() {
        }

        @Override // java.io.OutputStream
        public void write(int i4) throws IOException {
        }
    }

    /* compiled from: DiskLruCache.java */
    public final class c {

        /* renamed from: a, reason: collision with root package name */
        private final d f70194a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean[] f70195b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f70196c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f70197d;

        /* compiled from: DiskLruCache.java */
        /* renamed from: com.nostra13.universalimageloader.cache.disc.impl.ext.a$c$a, reason: collision with other inner class name */
        private class C0985a extends FilterOutputStream {
            /* synthetic */ C0985a(c cVar, OutputStream outputStream, CallableC0984a callableC0984a) {
                this(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                try {
                    ((FilterOutputStream) this).out.close();
                } catch (IOException unused) {
                    c.this.f70196c = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public void flush() {
                try {
                    ((FilterOutputStream) this).out.flush();
                } catch (IOException unused) {
                    c.this.f70196c = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(int i4) {
                try {
                    ((FilterOutputStream) this).out.write(i4);
                } catch (IOException unused) {
                    c.this.f70196c = true;
                }
            }

            private C0985a(OutputStream outputStream) {
                super(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] bArr, int i4, int i5) {
                try {
                    ((FilterOutputStream) this).out.write(bArr, i4, i5);
                } catch (IOException unused) {
                    c.this.f70196c = true;
                }
            }
        }

        /* synthetic */ c(a aVar, d dVar, CallableC0984a callableC0984a) {
            this(dVar);
        }

        public void a() throws IOException {
            a.this.o(this, false);
        }

        public void b() {
            if (this.f70197d) {
                return;
            }
            try {
                a();
            } catch (IOException unused) {
            }
        }

        public void f() throws IOException {
            if (this.f70196c) {
                a.this.o(this, false);
                a.this.K(this.f70194a.f70200a);
            } else {
                a.this.o(this, true);
            }
            this.f70197d = true;
        }

        public String g(int i4) throws IOException {
            InputStream h4 = h(i4);
            if (h4 != null) {
                return a.D(h4);
            }
            return null;
        }

        public InputStream h(int i4) throws IOException {
            synchronized (a.this) {
                if (this.f70194a.f70203d != this) {
                    throw new IllegalStateException();
                }
                if (!this.f70194a.f70202c) {
                    return null;
                }
                try {
                    return new FileInputStream(this.f70194a.j(i4));
                } catch (FileNotFoundException unused) {
                    return null;
                }
            }
        }

        public OutputStream i(int i4) throws IOException {
            FileOutputStream fileOutputStream;
            C0985a c0985a;
            synchronized (a.this) {
                try {
                    if (this.f70194a.f70203d != this) {
                        throw new IllegalStateException();
                    }
                    if (!this.f70194a.f70202c) {
                        this.f70195b[i4] = true;
                    }
                    File k4 = this.f70194a.k(i4);
                    try {
                        fileOutputStream = new FileOutputStream(k4);
                    } catch (FileNotFoundException unused) {
                        a.this.f70177b.mkdirs();
                        try {
                            fileOutputStream = new FileOutputStream(k4);
                        } catch (FileNotFoundException unused2) {
                            return a.C;
                        }
                    }
                    c0985a = new C0985a(this, fileOutputStream, null);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return c0985a;
        }

        public void j(int i4, String str) throws IOException {
            OutputStreamWriter outputStreamWriter = null;
            try {
                OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(i(i4), com.nostra13.universalimageloader.cache.disc.impl.ext.d.f70232b);
                try {
                    outputStreamWriter2.write(str);
                    com.nostra13.universalimageloader.cache.disc.impl.ext.d.a(outputStreamWriter2);
                } catch (Throwable th) {
                    th = th;
                    outputStreamWriter = outputStreamWriter2;
                    com.nostra13.universalimageloader.cache.disc.impl.ext.d.a(outputStreamWriter);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }

        private c(d dVar) {
            this.f70194a = dVar;
            this.f70195b = dVar.f70202c ? null : new boolean[a.this.f70184i];
        }
    }

    /* compiled from: DiskLruCache.java */
    private final class d {

        /* renamed from: a, reason: collision with root package name */
        private final String f70200a;

        /* renamed from: b, reason: collision with root package name */
        private final long[] f70201b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f70202c;

        /* renamed from: d, reason: collision with root package name */
        private c f70203d;

        /* renamed from: e, reason: collision with root package name */
        private long f70204e;

        /* synthetic */ d(a aVar, String str, CallableC0984a callableC0984a) {
            this(str);
        }

        private IOException m(String[] strArr) throws IOException {
            throw new IOException(ProtectedSandApp.s("ᨇ\u0001") + Arrays.toString(strArr));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void n(String[] strArr) throws IOException {
            if (strArr.length != a.this.f70184i) {
                throw m(strArr);
            }
            for (int i4 = 0; i4 < strArr.length; i4++) {
                try {
                    this.f70201b[i4] = Long.parseLong(strArr[i4]);
                } catch (NumberFormatException unused) {
                    throw m(strArr);
                }
            }
        }

        public File j(int i4) {
            return new File(a.this.f70177b, this.f70200a + ProtectedSandApp.s("ᨈ\u0001") + i4);
        }

        public File k(int i4) {
            return new File(a.this.f70177b, this.f70200a + ProtectedSandApp.s("ᨈ\u0001") + i4 + ProtectedSandApp.s("ᨉ\u0001"));
        }

        public String l() throws IOException {
            StringBuilder sb = new StringBuilder();
            for (long j4 : this.f70201b) {
                sb.append(' ');
                sb.append(j4);
            }
            return sb.toString();
        }

        private d(String str) {
            this.f70200a = str;
            this.f70201b = new long[a.this.f70184i];
        }
    }

    /* compiled from: DiskLruCache.java */
    public final class e implements Closeable {

        /* renamed from: b, reason: collision with root package name */
        private final String f70206b;

        /* renamed from: c, reason: collision with root package name */
        private final long f70207c;

        /* renamed from: d, reason: collision with root package name */
        private File[] f70208d;

        /* renamed from: e, reason: collision with root package name */
        private final InputStream[] f70209e;

        /* renamed from: f, reason: collision with root package name */
        private final long[] f70210f;

        /* synthetic */ e(a aVar, String str, long j4, File[] fileArr, InputStream[] inputStreamArr, long[] jArr, CallableC0984a callableC0984a) {
            this(str, j4, fileArr, inputStreamArr, jArr);
        }

        public c a() throws IOException {
            return a.this.u(this.f70206b, this.f70207c);
        }

        public File b(int i4) {
            return this.f70208d[i4];
        }

        public InputStream c(int i4) {
            return this.f70209e[i4];
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (InputStream inputStream : this.f70209e) {
                com.nostra13.universalimageloader.cache.disc.impl.ext.d.a(inputStream);
            }
        }

        public long d(int i4) {
            return this.f70210f[i4];
        }

        public String getString(int i4) throws IOException {
            return a.D(this.f70209e[i4]);
        }

        private e(String str, long j4, File[] fileArr, InputStream[] inputStreamArr, long[] jArr) {
            this.f70206b = str;
            this.f70207c = j4;
            this.f70208d = fileArr;
            this.f70209e = inputStreamArr;
            this.f70210f = jArr;
        }
    }

    private a(File file, int i4, int i5, long j4, int i6) {
        this.f70177b = file;
        this.f70181f = i4;
        this.f70178c = new File(file, ProtectedSandApp.s("ᨌ\u0001"));
        this.f70179d = new File(file, ProtectedSandApp.s("ᨍ\u0001"));
        this.f70180e = new File(file, ProtectedSandApp.s("ᨎ\u0001"));
        this.f70184i = i5;
        this.f70182g = j4;
        this.f70183h = i6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String D(InputStream inputStream) throws IOException {
        return com.nostra13.universalimageloader.cache.disc.impl.ext.d.c(new InputStreamReader(inputStream, com.nostra13.universalimageloader.cache.disc.impl.ext.d.f70232b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean E() {
        int i4 = this.f70189n;
        return i4 >= 2000 && i4 >= this.f70188m.size();
    }

    public static a F(File file, int i4, int i5, long j4, int i6) throws IOException {
        if (j4 <= 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ᨙ\u0001"));
        }
        if (i6 <= 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ᨘ\u0001"));
        }
        if (i5 <= 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ᨗ\u0001"));
        }
        File file2 = new File(file, ProtectedSandApp.s("ᨎ\u0001"));
        if (file2.exists()) {
            File file3 = new File(file, ProtectedSandApp.s("ᨌ\u0001"));
            if (file3.exists()) {
                file2.delete();
            } else {
                L(file2, file3, false);
            }
        }
        a aVar = new a(file, i4, i5, j4, i6);
        if (aVar.f70178c.exists()) {
            try {
                aVar.H();
                aVar.G();
                aVar.f70187l = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(aVar.f70178c, true), com.nostra13.universalimageloader.cache.disc.impl.ext.d.f70231a));
                return aVar;
            } catch (IOException e4) {
                System.out.println(ProtectedSandApp.s("ᨔ\u0001") + file + ProtectedSandApp.s("ᨕ\u0001") + e4.getMessage() + ProtectedSandApp.s("ᨖ\u0001"));
                aVar.q();
            }
        }
        file.mkdirs();
        a aVar2 = new a(file, i4, i5, j4, i6);
        aVar2.J();
        return aVar2;
    }

    private void G() throws IOException {
        s(this.f70179d);
        Iterator<d> it = this.f70188m.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            int i4 = 0;
            if (next.f70203d == null) {
                while (i4 < this.f70184i) {
                    this.f70185j += next.f70201b[i4];
                    this.f70186k++;
                    i4++;
                }
            } else {
                next.f70203d = null;
                while (i4 < this.f70184i) {
                    s(next.j(i4));
                    s(next.k(i4));
                    i4++;
                }
                it.remove();
            }
        }
    }

    private void H() throws IOException {
        String s4 = ProtectedSandApp.s("ᨚ\u0001");
        String s5 = ProtectedSandApp.s("ᨛ\u0001");
        com.nostra13.universalimageloader.cache.disc.impl.ext.c cVar = new com.nostra13.universalimageloader.cache.disc.impl.ext.c(new FileInputStream(this.f70178c), com.nostra13.universalimageloader.cache.disc.impl.ext.d.f70231a);
        try {
            String c5 = cVar.c();
            String c6 = cVar.c();
            String c7 = cVar.c();
            String c10 = cVar.c();
            String c11 = cVar.c();
            if (!ProtectedSandApp.s("ᨏ\u0001").equals(c5) || !ProtectedSandApp.s("ᨐ\u0001").equals(c6) || !Integer.toString(this.f70181f).equals(c7) || !Integer.toString(this.f70184i).equals(c10) || !"".equals(c11)) {
                throw new IOException(s5 + c5 + s4 + c6 + s4 + c10 + s4 + c11 + ProtectedSandApp.s("\u1a1c\u0001"));
            }
            int i4 = 0;
            while (true) {
                try {
                    I(cVar.c());
                    i4++;
                } catch (EOFException unused) {
                    this.f70189n = i4 - this.f70188m.size();
                    com.nostra13.universalimageloader.cache.disc.impl.ext.d.a(cVar);
                    return;
                }
            }
        } catch (Throwable th) {
            com.nostra13.universalimageloader.cache.disc.impl.ext.d.a(cVar);
            throw th;
        }
    }

    private void I(String str) throws IOException {
        String substring;
        int indexOf = str.indexOf(32);
        String s4 = ProtectedSandApp.s("\u1a1d\u0001");
        if (indexOf == -1) {
            throw new IOException(s4.concat(str));
        }
        int i4 = indexOf + 1;
        int indexOf2 = str.indexOf(32, i4);
        if (indexOf2 == -1) {
            substring = str.substring(i4);
            if (indexOf == 6 && str.startsWith(ProtectedSandApp.s("ᨊ\u0001"))) {
                this.f70188m.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i4, indexOf2);
        }
        d dVar = this.f70188m.get(substring);
        CallableC0984a callableC0984a = null;
        if (dVar == null) {
            dVar = new d(this, substring, callableC0984a);
            this.f70188m.put(substring, dVar);
        }
        if (indexOf2 != -1 && indexOf == 5 && str.startsWith(ProtectedSandApp.s("ᨑ\u0001"))) {
            String[] split = str.substring(indexOf2 + 1).split(ProtectedSandApp.s("᨞\u0001"));
            dVar.f70202c = true;
            dVar.f70203d = null;
            dVar.n(split);
            return;
        }
        if (indexOf2 == -1 && indexOf == 5 && str.startsWith(ProtectedSandApp.s("ᨒ\u0001"))) {
            dVar.f70203d = new c(this, dVar, callableC0984a);
        } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith(ProtectedSandApp.s("ᨋ\u0001"))) {
            throw new IOException(s4.concat(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void J() throws IOException {
        try {
            Writer writer = this.f70187l;
            if (writer != null) {
                writer.close();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f70179d), com.nostra13.universalimageloader.cache.disc.impl.ext.d.f70231a));
            try {
                bufferedWriter.write(ProtectedSandApp.s("ᨏ\u0001"));
                bufferedWriter.write(ProtectedSandApp.s("᨟\u0001"));
                bufferedWriter.write(ProtectedSandApp.s("ᨐ\u0001"));
                bufferedWriter.write(ProtectedSandApp.s("᨟\u0001"));
                bufferedWriter.write(Integer.toString(this.f70181f));
                bufferedWriter.write(ProtectedSandApp.s("᨟\u0001"));
                bufferedWriter.write(Integer.toString(this.f70184i));
                bufferedWriter.write(ProtectedSandApp.s("᨟\u0001"));
                bufferedWriter.write(ProtectedSandApp.s("᨟\u0001"));
                for (d dVar : this.f70188m.values()) {
                    if (dVar.f70203d != null) {
                        bufferedWriter.write(ProtectedSandApp.s("ᨠ\u0001") + dVar.f70200a + '\n');
                    } else {
                        bufferedWriter.write(ProtectedSandApp.s("ᨡ\u0001") + dVar.f70200a + dVar.l() + '\n');
                    }
                }
                bufferedWriter.close();
                if (this.f70178c.exists()) {
                    L(this.f70178c, this.f70180e, true);
                }
                L(this.f70179d, this.f70178c, false);
                this.f70180e.delete();
                this.f70187l = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f70178c, true), com.nostra13.universalimageloader.cache.disc.impl.ext.d.f70231a));
            } catch (Throwable th) {
                bufferedWriter.close();
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private static void L(File file, File file2, boolean z4) throws IOException {
        if (z4) {
            s(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N() throws IOException {
        while (this.f70186k > this.f70183h) {
            K(this.f70188m.entrySet().iterator().next().getKey());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O() throws IOException {
        while (this.f70185j > this.f70182g) {
            K(this.f70188m.entrySet().iterator().next().getKey());
        }
    }

    private void Q(String str) {
        if (!f70174x.matcher(str).matches()) {
            throw new IllegalArgumentException(android.support.v4.media.d.a(ProtectedSandApp.s("ᨢ\u0001"), str, ProtectedSandApp.s("ᨣ\u0001")));
        }
    }

    private void n() {
        if (this.f70187l == null) {
            throw new IllegalStateException(ProtectedSandApp.s("ᨤ\u0001"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void o(c cVar, boolean z4) throws IOException {
        d dVar = cVar.f70194a;
        if (dVar.f70203d != cVar) {
            throw new IllegalStateException();
        }
        if (z4 && !dVar.f70202c) {
            for (int i4 = 0; i4 < this.f70184i; i4++) {
                if (!cVar.f70195b[i4]) {
                    cVar.a();
                    throw new IllegalStateException(ProtectedSandApp.s("ᨥ\u0001") + i4);
                }
                if (!dVar.k(i4).exists()) {
                    cVar.a();
                    return;
                }
            }
        }
        for (int i5 = 0; i5 < this.f70184i; i5++) {
            File k4 = dVar.k(i5);
            if (!z4) {
                s(k4);
            } else if (k4.exists()) {
                File j4 = dVar.j(i5);
                k4.renameTo(j4);
                long j5 = dVar.f70201b[i5];
                long length = j4.length();
                dVar.f70201b[i5] = length;
                this.f70185j = (this.f70185j - j5) + length;
                this.f70186k++;
            }
        }
        this.f70189n++;
        dVar.f70203d = null;
        if (dVar.f70202c || z4) {
            dVar.f70202c = true;
            this.f70187l.write(ProtectedSandApp.s("ᨡ\u0001") + dVar.f70200a + dVar.l() + '\n');
            if (z4) {
                long j6 = this.f70190o;
                this.f70190o = 1 + j6;
                dVar.f70204e = j6;
            }
        } else {
            this.f70188m.remove(dVar.f70200a);
            this.f70187l.write(ProtectedSandApp.s("ᨦ\u0001") + dVar.f70200a + '\n');
        }
        this.f70187l.flush();
        if (this.f70185j > this.f70182g || this.f70186k > this.f70183h || E()) {
            this.f70191p.submit(this.f70192q);
        }
    }

    private static void s(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized c u(String str, long j4) throws IOException {
        String s4 = ProtectedSandApp.s("ᨠ\u0001");
        synchronized (this) {
            n();
            Q(str);
            d dVar = this.f70188m.get(str);
            CallableC0984a callableC0984a = null;
            if (j4 != -1 && (dVar == null || dVar.f70204e != j4)) {
                return null;
            }
            if (dVar == null) {
                dVar = new d(this, str, callableC0984a);
                this.f70188m.put(str, dVar);
            } else if (dVar.f70203d != null) {
                return null;
            }
            c cVar = new c(this, dVar, callableC0984a);
            dVar.f70203d = cVar;
            this.f70187l.write(s4 + str + '\n');
            this.f70187l.flush();
            return cVar;
        }
    }

    public synchronized int B() {
        return this.f70183h;
    }

    public synchronized long C() {
        return this.f70182g;
    }

    public synchronized boolean K(String str) throws IOException {
        try {
            n();
            Q(str);
            d dVar = this.f70188m.get(str);
            if (dVar != null && dVar.f70203d == null) {
                for (int i4 = 0; i4 < this.f70184i; i4++) {
                    File j4 = dVar.j(i4);
                    if (j4.exists() && !j4.delete()) {
                        throw new IOException(ProtectedSandApp.s("ᨧ\u0001") + j4);
                    }
                    this.f70185j -= dVar.f70201b[i4];
                    this.f70186k--;
                    dVar.f70201b[i4] = 0;
                }
                this.f70189n++;
                this.f70187l.append((CharSequence) (ProtectedSandApp.s("ᨦ\u0001") + str + '\n'));
                this.f70188m.remove(str);
                if (E()) {
                    this.f70191p.submit(this.f70192q);
                }
                return true;
            }
            return false;
        } finally {
        }
    }

    public synchronized void M(long j4) {
        this.f70182g = j4;
        this.f70191p.submit(this.f70192q);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        try {
            if (this.f70187l == null) {
                return;
            }
            Iterator it = new ArrayList(this.f70188m.values()).iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                if (dVar.f70203d != null) {
                    dVar.f70203d.a();
                }
            }
            O();
            N();
            this.f70187l.close();
            this.f70187l = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void flush() throws IOException {
        n();
        O();
        N();
        this.f70187l.flush();
    }

    public synchronized boolean isClosed() {
        return this.f70187l == null;
    }

    public void q() throws IOException {
        close();
        com.nostra13.universalimageloader.cache.disc.impl.ext.d.b(this.f70177b);
    }

    public synchronized long size() {
        return this.f70185j;
    }

    public c t(String str) throws IOException {
        return u(str, -1L);
    }

    public synchronized long x() {
        return this.f70186k;
    }

    public synchronized e y(String str) throws IOException {
        InputStream inputStream;
        n();
        Q(str);
        d dVar = this.f70188m.get(str);
        if (dVar == null) {
            return null;
        }
        if (!dVar.f70202c) {
            return null;
        }
        int i4 = this.f70184i;
        File[] fileArr = new File[i4];
        InputStream[] inputStreamArr = new InputStream[i4];
        for (int i5 = 0; i5 < this.f70184i; i5++) {
            try {
                File j4 = dVar.j(i5);
                fileArr[i5] = j4;
                inputStreamArr[i5] = new FileInputStream(j4);
            } catch (FileNotFoundException unused) {
                for (int i6 = 0; i6 < this.f70184i && (inputStream = inputStreamArr[i6]) != null; i6++) {
                    com.nostra13.universalimageloader.cache.disc.impl.ext.d.a(inputStream);
                }
                return null;
            }
        }
        this.f70189n++;
        this.f70187l.append((CharSequence) (ProtectedSandApp.s("ᨨ\u0001") + str + '\n'));
        if (E()) {
            this.f70191p.submit(this.f70192q);
        }
        return new e(this, str, dVar.f70204e, fileArr, inputStreamArr, dVar.f70201b, null);
    }

    public File z() {
        return this.f70177b;
    }
}
