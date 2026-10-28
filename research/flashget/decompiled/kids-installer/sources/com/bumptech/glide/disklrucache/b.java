package com.bumptech.glide.disklrucache;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.StrictMode;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.k;

/* compiled from: DiskLruCache.java */
/* loaded from: classes.dex */
public final class b implements Closeable {
    static final long H = -1;

    /* renamed from: o, reason: collision with root package name */
    private final File f10755o;

    /* renamed from: p, reason: collision with root package name */
    private final File f10756p;

    /* renamed from: q, reason: collision with root package name */
    private final File f10757q;

    /* renamed from: r, reason: collision with root package name */
    private final File f10758r;

    /* renamed from: s, reason: collision with root package name */
    private final int f10759s;

    /* renamed from: t, reason: collision with root package name */
    private long f10760t;

    /* renamed from: u, reason: collision with root package name */
    private final int f10761u;

    /* renamed from: w, reason: collision with root package name */
    private Writer f10763w;

    /* renamed from: y, reason: collision with root package name */
    private int f10765y;
    static final String C = ProtectedSandApp.s("Ó");
    static final String D = ProtectedSandApp.s("Ô");
    static final String E = ProtectedSandApp.s("Õ");
    static final String F = ProtectedSandApp.s("Ö");
    static final String G = ProtectedSandApp.s("×");
    private static final String I = ProtectedSandApp.s("Ø");
    private static final String J = ProtectedSandApp.s("Ù");
    private static final String K = ProtectedSandApp.s("Ú");
    private static final String L = ProtectedSandApp.s("Û");

    /* renamed from: v, reason: collision with root package name */
    private long f10762v = 0;

    /* renamed from: x, reason: collision with root package name */
    private final LinkedHashMap<String, d> f10764x = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: z, reason: collision with root package name */
    private long f10766z = 0;
    final ThreadPoolExecutor A = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC0132b(null));
    private final Callable<Void> B = new a();

    /* compiled from: DiskLruCache.java */
    class a implements Callable<Void> {
        a() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            synchronized (b.this) {
                if (b.this.f10763w == null) {
                    return null;
                }
                b.this.g0();
                if (b.this.P()) {
                    b.this.b0();
                    b.this.f10765y = 0;
                }
                return null;
            }
        }
    }

    /* compiled from: DiskLruCache.java */
    /* renamed from: com.bumptech.glide.disklrucache.b$b, reason: collision with other inner class name */
    private static final class ThreadFactoryC0132b implements ThreadFactory {
        private ThreadFactoryC0132b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, ProtectedSandApp.s("ª"));
            thread.setPriority(1);
            return thread;
        }

        ThreadFactoryC0132b(a aVar) {
        }
    }

    /* compiled from: DiskLruCache.java */
    public final class c {

        /* renamed from: a, reason: collision with root package name */
        private final d f10768a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean[] f10769b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f10770c;

        /* synthetic */ c(b bVar, d dVar, a aVar) {
            this(dVar);
        }

        private InputStream h(int i5) throws IOException {
            synchronized (b.this) {
                if (this.f10768a.f10777f != this) {
                    throw new IllegalStateException();
                }
                if (!this.f10768a.f10776e) {
                    return null;
                }
                try {
                    return new FileInputStream(this.f10768a.f10774c[i5]);
                } catch (FileNotFoundException unused) {
                    return null;
                }
            }
        }

        public void a() throws IOException {
            b.this.r(this, false);
        }

        public void b() {
            if (this.f10770c) {
                return;
            }
            try {
                a();
            } catch (IOException unused) {
            }
        }

        public void e() throws IOException {
            b.this.r(this, true);
            this.f10770c = true;
        }

        public File f(int i5) throws IOException {
            File file;
            synchronized (b.this) {
                if (this.f10768a.f10777f != this) {
                    throw new IllegalStateException();
                }
                if (!this.f10768a.f10776e) {
                    this.f10769b[i5] = true;
                }
                file = this.f10768a.f10775d[i5];
                b.this.f10755o.mkdirs();
            }
            return file;
        }

        public String g(int i5) throws IOException {
            InputStream h5 = h(i5);
            if (h5 != null) {
                return b.O(h5);
            }
            return null;
        }

        public void i(int i5, String str) throws IOException {
            OutputStreamWriter outputStreamWriter = null;
            try {
                OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(new FileOutputStream(f(i5)), com.bumptech.glide.disklrucache.d.f10794b);
                try {
                    outputStreamWriter2.write(str);
                    com.bumptech.glide.disklrucache.d.a(outputStreamWriter2);
                } catch (Throwable th) {
                    th = th;
                    outputStreamWriter = outputStreamWriter2;
                    com.bumptech.glide.disklrucache.d.a(outputStreamWriter);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }

        private c(d dVar) {
            this.f10768a = dVar;
            this.f10769b = dVar.f10776e ? null : new boolean[b.this.f10761u];
        }
    }

    /* compiled from: DiskLruCache.java */
    private final class d {

        /* renamed from: a, reason: collision with root package name */
        private final String f10772a;

        /* renamed from: b, reason: collision with root package name */
        private final long[] f10773b;

        /* renamed from: c, reason: collision with root package name */
        File[] f10774c;

        /* renamed from: d, reason: collision with root package name */
        File[] f10775d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f10776e;

        /* renamed from: f, reason: collision with root package name */
        private c f10777f;

        /* renamed from: g, reason: collision with root package name */
        private long f10778g;

        /* synthetic */ d(b bVar, String str, a aVar) {
            this(str);
        }

        private IOException m(String[] strArr) throws IOException {
            throw new IOException(ProtectedSandApp.s("¬") + Arrays.toString(strArr));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void n(String[] strArr) throws IOException {
            if (strArr.length != b.this.f10761u) {
                throw m(strArr);
            }
            for (int i5 = 0; i5 < strArr.length; i5++) {
                try {
                    this.f10773b[i5] = Long.parseLong(strArr[i5]);
                } catch (NumberFormatException unused) {
                    throw m(strArr);
                }
            }
        }

        public File j(int i5) {
            return this.f10774c[i5];
        }

        public File k(int i5) {
            return this.f10775d[i5];
        }

        public String l() throws IOException {
            StringBuilder sb = new StringBuilder();
            for (long j5 : this.f10773b) {
                sb.append(' ');
                sb.append(j5);
            }
            return sb.toString();
        }

        private d(String str) {
            this.f10772a = str;
            this.f10773b = new long[b.this.f10761u];
            this.f10774c = new File[b.this.f10761u];
            this.f10775d = new File[b.this.f10761u];
            StringBuilder sb = new StringBuilder(str);
            sb.append(k.f32026a);
            int length = sb.length();
            for (int i5 = 0; i5 < b.this.f10761u; i5++) {
                sb.append(i5);
                this.f10774c[i5] = new File(b.this.f10755o, sb.toString());
                sb.append(ProtectedSandApp.s("«"));
                this.f10775d[i5] = new File(b.this.f10755o, sb.toString());
                sb.setLength(length);
            }
        }
    }

    /* compiled from: DiskLruCache.java */
    public final class e {

        /* renamed from: a, reason: collision with root package name */
        private final String f10780a;

        /* renamed from: b, reason: collision with root package name */
        private final long f10781b;

        /* renamed from: c, reason: collision with root package name */
        private final long[] f10782c;

        /* renamed from: d, reason: collision with root package name */
        private final File[] f10783d;

        /* synthetic */ e(b bVar, String str, long j5, File[] fileArr, long[] jArr, a aVar) {
            this(str, j5, fileArr, jArr);
        }

        public c a() throws IOException {
            return b.this.B(this.f10780a, this.f10781b);
        }

        public File b(int i5) {
            return this.f10783d[i5];
        }

        public long c(int i5) {
            return this.f10782c[i5];
        }

        public String d(int i5) throws IOException {
            return b.O(new FileInputStream(this.f10783d[i5]));
        }

        private e(String str, long j5, File[] fileArr, long[] jArr) {
            this.f10780a = str;
            this.f10781b = j5;
            this.f10783d = fileArr;
            this.f10782c = jArr;
        }
    }

    private b(File file, int i5, int i6, long j5) {
        this.f10755o = file;
        this.f10759s = i5;
        this.f10756p = new File(file, ProtectedSandApp.s("\u00ad"));
        this.f10757q = new File(file, ProtectedSandApp.s("®"));
        this.f10758r = new File(file, ProtectedSandApp.s("¯"));
        this.f10761u = i6;
        this.f10760t = j5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized c B(String str, long j5) throws IOException {
        n();
        d dVar = this.f10764x.get(str);
        a aVar = null;
        if (j5 != -1 && (dVar == null || dVar.f10778g != j5)) {
            return null;
        }
        if (dVar == null) {
            dVar = new d(this, str, aVar);
            this.f10764x.put(str, dVar);
        } else if (dVar.f10777f != null) {
            return null;
        }
        c cVar = new c(this, dVar, aVar);
        dVar.f10777f = cVar;
        this.f10763w.append((CharSequence) ProtectedSandApp.s("°"));
        this.f10763w.append(' ');
        this.f10763w.append((CharSequence) str);
        this.f10763w.append('\n');
        D(this.f10763w);
        return cVar;
    }

    @TargetApi(26)
    private static void D(Writer writer) throws IOException {
        StrictMode.ThreadPolicy.Builder permitUnbufferedIo;
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        permitUnbufferedIo = new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo();
        StrictMode.setThreadPolicy(permitUnbufferedIo.build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String O(InputStream inputStream) throws IOException {
        return com.bumptech.glide.disklrucache.d.c(new InputStreamReader(inputStream, com.bumptech.glide.disklrucache.d.f10794b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean P() {
        int i5 = this.f10765y;
        return i5 >= 2000 && i5 >= this.f10764x.size();
    }

    public static b R(File file, int i5, int i6, long j5) throws IOException {
        if (j5 <= 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("·"));
        }
        if (i6 <= 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("¶"));
        }
        File file2 = new File(file, ProtectedSandApp.s("±"));
        if (file2.exists()) {
            File file3 = new File(file, ProtectedSandApp.s("²"));
            if (file3.exists()) {
                file2.delete();
            } else {
                e0(file2, file3, false);
            }
        }
        b bVar = new b(file, i5, i6, j5);
        if (bVar.f10756p.exists()) {
            try {
                bVar.X();
                bVar.U();
                return bVar;
            } catch (IOException e6) {
                System.out.println(ProtectedSandApp.s("³") + file + ProtectedSandApp.s("´") + e6.getMessage() + ProtectedSandApp.s("µ"));
                bVar.t();
            }
        }
        file.mkdirs();
        b bVar2 = new b(file, i5, i6, j5);
        bVar2.b0();
        return bVar2;
    }

    private void U() throws IOException {
        w(this.f10757q);
        Iterator<d> it = this.f10764x.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            int i5 = 0;
            if (next.f10777f == null) {
                while (i5 < this.f10761u) {
                    this.f10762v += next.f10773b[i5];
                    i5++;
                }
            } else {
                next.f10777f = null;
                while (i5 < this.f10761u) {
                    w(next.f10774c[i5]);
                    w(next.f10775d[i5]);
                    i5++;
                }
                it.remove();
            }
        }
    }

    private void X() throws IOException {
        String s5 = ProtectedSandApp.s("¸");
        String s6 = ProtectedSandApp.s("¹");
        com.bumptech.glide.disklrucache.c cVar = new com.bumptech.glide.disklrucache.c(new FileInputStream(this.f10756p), com.bumptech.glide.disklrucache.d.f10793a);
        try {
            String d6 = cVar.d();
            String d7 = cVar.d();
            String d8 = cVar.d();
            String d9 = cVar.d();
            String d10 = cVar.d();
            if (!ProtectedSandApp.s("º").equals(d6) || !ProtectedSandApp.s("»").equals(d7) || !Integer.toString(this.f10759s).equals(d8) || !Integer.toString(this.f10761u).equals(d9) || !"".equals(d10)) {
                throw new IOException(s6 + d6 + s5 + d7 + s5 + d9 + s5 + d10 + ProtectedSandApp.s("¼"));
            }
            int i5 = 0;
            while (true) {
                try {
                    Z(cVar.d());
                    i5++;
                } catch (EOFException unused) {
                    this.f10765y = i5 - this.f10764x.size();
                    if (cVar.c()) {
                        b0();
                    } else {
                        this.f10763w = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f10756p, true), com.bumptech.glide.disklrucache.d.f10793a));
                    }
                    com.bumptech.glide.disklrucache.d.a(cVar);
                    return;
                }
            }
        } catch (Throwable th) {
            com.bumptech.glide.disklrucache.d.a(cVar);
            throw th;
        }
    }

    private void Z(String str) throws IOException {
        String substring;
        int indexOf = str.indexOf(32);
        String s5 = ProtectedSandApp.s("½");
        if (indexOf == -1) {
            throw new IOException(s5.concat(str));
        }
        int i5 = indexOf + 1;
        int indexOf2 = str.indexOf(32, i5);
        if (indexOf2 == -1) {
            substring = str.substring(i5);
            if (indexOf == 6 && str.startsWith(ProtectedSandApp.s("¾"))) {
                this.f10764x.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i5, indexOf2);
        }
        d dVar = this.f10764x.get(substring);
        a aVar = null;
        if (dVar == null) {
            dVar = new d(this, substring, aVar);
            this.f10764x.put(substring, dVar);
        }
        if (indexOf2 != -1 && indexOf == 5 && str.startsWith(ProtectedSandApp.s("¿"))) {
            String[] split = str.substring(indexOf2 + 1).split(ProtectedSandApp.s("À"));
            dVar.f10776e = true;
            dVar.f10777f = null;
            dVar.n(split);
            return;
        }
        if (indexOf2 == -1 && indexOf == 5 && str.startsWith(ProtectedSandApp.s("Á"))) {
            dVar.f10777f = new c(this, dVar, aVar);
        } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith(ProtectedSandApp.s("Â"))) {
            throw new IOException(s5.concat(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void b0() throws IOException {
        Writer writer = this.f10763w;
        if (writer != null) {
            o(writer);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f10757q), com.bumptech.glide.disklrucache.d.f10793a));
        try {
            bufferedWriter.write(ProtectedSandApp.s("Ã"));
            bufferedWriter.write(ProtectedSandApp.s("Ä"));
            bufferedWriter.write(ProtectedSandApp.s("Å"));
            bufferedWriter.write(ProtectedSandApp.s("Æ"));
            bufferedWriter.write(Integer.toString(this.f10759s));
            bufferedWriter.write(ProtectedSandApp.s("Ç"));
            bufferedWriter.write(Integer.toString(this.f10761u));
            bufferedWriter.write(ProtectedSandApp.s("È"));
            bufferedWriter.write(ProtectedSandApp.s("É"));
            for (d dVar : this.f10764x.values()) {
                if (dVar.f10777f != null) {
                    bufferedWriter.write(ProtectedSandApp.s("Ê") + dVar.f10772a + '\n');
                } else {
                    bufferedWriter.write(ProtectedSandApp.s("Ë") + dVar.f10772a + dVar.l() + '\n');
                }
            }
            o(bufferedWriter);
            if (this.f10756p.exists()) {
                e0(this.f10756p, this.f10758r, true);
            }
            e0(this.f10757q, this.f10756p, false);
            this.f10758r.delete();
            this.f10763w = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f10756p, true), com.bumptech.glide.disklrucache.d.f10793a));
        } catch (Throwable th) {
            o(bufferedWriter);
            throw th;
        }
    }

    private static void e0(File file, File file2, boolean z5) throws IOException {
        if (z5) {
            w(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0() throws IOException {
        while (this.f10762v > this.f10760t) {
            d0(this.f10764x.entrySet().iterator().next().getKey());
        }
    }

    private void n() {
        if (this.f10763w == null) {
            throw new IllegalStateException(ProtectedSandApp.s("Ì"));
        }
    }

    @TargetApi(26)
    private static void o(Writer writer) throws IOException {
        StrictMode.ThreadPolicy.Builder permitUnbufferedIo;
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        permitUnbufferedIo = new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo();
        StrictMode.setThreadPolicy(permitUnbufferedIo.build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void r(c cVar, boolean z5) throws IOException {
        d dVar = cVar.f10768a;
        if (dVar.f10777f != cVar) {
            throw new IllegalStateException();
        }
        if (z5 && !dVar.f10776e) {
            for (int i5 = 0; i5 < this.f10761u; i5++) {
                if (!cVar.f10769b[i5]) {
                    cVar.a();
                    throw new IllegalStateException(ProtectedSandApp.s("Í") + i5);
                }
                if (!dVar.f10775d[i5].exists()) {
                    cVar.a();
                    return;
                }
            }
        }
        for (int i6 = 0; i6 < this.f10761u; i6++) {
            File file = dVar.f10775d[i6];
            if (!z5) {
                w(file);
            } else if (file.exists()) {
                File file2 = dVar.f10774c[i6];
                file.renameTo(file2);
                long j5 = dVar.f10773b[i6];
                long length = file2.length();
                dVar.f10773b[i6] = length;
                this.f10762v = (this.f10762v - j5) + length;
            }
        }
        this.f10765y++;
        dVar.f10777f = null;
        if (dVar.f10776e || z5) {
            dVar.f10776e = true;
            this.f10763w.append((CharSequence) ProtectedSandApp.s("Î"));
            this.f10763w.append(' ');
            this.f10763w.append((CharSequence) dVar.f10772a);
            this.f10763w.append((CharSequence) dVar.l());
            this.f10763w.append('\n');
            if (z5) {
                long j6 = this.f10766z;
                this.f10766z = 1 + j6;
                dVar.f10778g = j6;
            }
        } else {
            this.f10764x.remove(dVar.f10772a);
            this.f10763w.append((CharSequence) ProtectedSandApp.s("Ï"));
            this.f10763w.append(' ');
            this.f10763w.append((CharSequence) dVar.f10772a);
            this.f10763w.append('\n');
        }
        D(this.f10763w);
        if (this.f10762v > this.f10760t || P()) {
            this.A.submit(this.B);
        }
    }

    private static void w(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public synchronized e F(String str) throws IOException {
        n();
        d dVar = this.f10764x.get(str);
        if (dVar == null) {
            return null;
        }
        if (!dVar.f10776e) {
            return null;
        }
        for (File file : dVar.f10774c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.f10765y++;
        this.f10763w.append((CharSequence) ProtectedSandApp.s("Ð"));
        this.f10763w.append(' ');
        this.f10763w.append((CharSequence) str);
        this.f10763w.append('\n');
        if (P()) {
            this.A.submit(this.B);
        }
        return new e(this, str, dVar.f10778g, dVar.f10774c, dVar.f10773b, null);
    }

    public File G() {
        return this.f10755o;
    }

    public synchronized long H() {
        return this.f10760t;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        if (this.f10763w == null) {
            return;
        }
        Iterator it = new ArrayList(this.f10764x.values()).iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (dVar.f10777f != null) {
                dVar.f10777f.a();
            }
        }
        g0();
        o(this.f10763w);
        this.f10763w = null;
    }

    public synchronized boolean d0(String str) throws IOException {
        n();
        d dVar = this.f10764x.get(str);
        if (dVar != null && dVar.f10777f == null) {
            for (int i5 = 0; i5 < this.f10761u; i5++) {
                File file = dVar.f10774c[i5];
                if (file.exists() && !file.delete()) {
                    throw new IOException(ProtectedSandApp.s("Ñ") + file);
                }
                this.f10762v -= dVar.f10773b[i5];
                dVar.f10773b[i5] = 0;
            }
            this.f10765y++;
            this.f10763w.append((CharSequence) ProtectedSandApp.s("Ò"));
            this.f10763w.append(' ');
            this.f10763w.append((CharSequence) str);
            this.f10763w.append('\n');
            this.f10764x.remove(str);
            if (P()) {
                this.A.submit(this.B);
            }
            return true;
        }
        return false;
    }

    public synchronized void f0(long j5) {
        this.f10760t = j5;
        this.A.submit(this.B);
    }

    public synchronized void flush() throws IOException {
        n();
        g0();
        D(this.f10763w);
    }

    public synchronized boolean isClosed() {
        return this.f10763w == null;
    }

    public synchronized long size() {
        return this.f10762v;
    }

    public void t() throws IOException {
        close();
        com.bumptech.glide.disklrucache.d.b(this.f10755o);
    }

    public c z(String str) throws IOException {
        return B(str, -1L);
    }
}
