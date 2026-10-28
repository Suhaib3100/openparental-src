package com.bumptech.glide.disklrucache;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.StrictMode;
import com.flashget.parentalcontrol.ProtectedSandApp;
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

/* compiled from: DiskLruCache.java */
/* loaded from: classes3.dex */
public final class b implements Closeable {

    /* renamed from: u, reason: collision with root package name */
    static final long f42836u = -1;

    /* renamed from: b, reason: collision with root package name */
    private final File f42841b;

    /* renamed from: c, reason: collision with root package name */
    private final File f42842c;

    /* renamed from: d, reason: collision with root package name */
    private final File f42843d;

    /* renamed from: e, reason: collision with root package name */
    private final File f42844e;

    /* renamed from: f, reason: collision with root package name */
    private final int f42845f;

    /* renamed from: g, reason: collision with root package name */
    private long f42846g;

    /* renamed from: h, reason: collision with root package name */
    private final int f42847h;

    /* renamed from: j, reason: collision with root package name */
    private Writer f42849j;

    /* renamed from: l, reason: collision with root package name */
    private int f42851l;

    /* renamed from: p, reason: collision with root package name */
    static final String f42831p = ProtectedSandApp.s("ࠗ");

    /* renamed from: q, reason: collision with root package name */
    static final String f42832q = ProtectedSandApp.s("࠘");

    /* renamed from: r, reason: collision with root package name */
    static final String f42833r = ProtectedSandApp.s("࠙");

    /* renamed from: s, reason: collision with root package name */
    static final String f42834s = ProtectedSandApp.s("ࠡ");

    /* renamed from: t, reason: collision with root package name */
    static final String f42835t = ProtectedSandApp.s("ࠢ");

    /* renamed from: v, reason: collision with root package name */
    private static final String f42837v = ProtectedSandApp.s("ࠦ");

    /* renamed from: w, reason: collision with root package name */
    private static final String f42838w = ProtectedSandApp.s("ࠨ");

    /* renamed from: x, reason: collision with root package name */
    private static final String f42839x = ProtectedSandApp.s("ࠥ");

    /* renamed from: y, reason: collision with root package name */
    private static final String f42840y = ProtectedSandApp.s("ࠩ");

    /* renamed from: i, reason: collision with root package name */
    private long f42848i = 0;

    /* renamed from: k, reason: collision with root package name */
    private final LinkedHashMap<String, d> f42850k = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: m, reason: collision with root package name */
    private long f42852m = 0;

    /* renamed from: n, reason: collision with root package name */
    final ThreadPoolExecutor f42853n = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC0731b());

    /* renamed from: o, reason: collision with root package name */
    private final Callable<Void> f42854o = new a();

    /* compiled from: DiskLruCache.java */
    class a implements Callable<Void> {
        a() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            synchronized (b.this) {
                try {
                    if (b.this.f42849j == null) {
                        return null;
                    }
                    b.this.L();
                    if (b.this.C()) {
                        b.this.H();
                        b.this.f42851l = 0;
                    }
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* compiled from: DiskLruCache.java */
    /* renamed from: com.bumptech.glide.disklrucache.b$b, reason: collision with other inner class name */
    private static final class ThreadFactoryC0731b implements ThreadFactory {
        private ThreadFactoryC0731b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, ProtectedSandApp.s("ࠔ"));
            thread.setPriority(1);
            return thread;
        }

        ThreadFactoryC0731b(a aVar) {
        }
    }

    /* compiled from: DiskLruCache.java */
    public final class c {

        /* renamed from: a, reason: collision with root package name */
        private final d f42856a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean[] f42857b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f42858c;

        /* synthetic */ c(b bVar, d dVar, a aVar) {
            this(dVar);
        }

        private InputStream h(int i4) throws IOException {
            synchronized (b.this) {
                if (this.f42856a.f42865f != this) {
                    throw new IllegalStateException();
                }
                if (!this.f42856a.f42864e) {
                    return null;
                }
                try {
                    return new FileInputStream(this.f42856a.f42862c[i4]);
                } catch (FileNotFoundException unused) {
                    return null;
                }
            }
        }

        public void a() throws IOException {
            b.this.n(this, false);
        }

        public void b() {
            if (this.f42858c) {
                return;
            }
            try {
                a();
            } catch (IOException unused) {
            }
        }

        public void e() throws IOException {
            b.this.n(this, true);
            this.f42858c = true;
        }

        public File f(int i4) throws IOException {
            File file;
            synchronized (b.this) {
                try {
                    if (this.f42856a.f42865f != this) {
                        throw new IllegalStateException();
                    }
                    if (!this.f42856a.f42864e) {
                        this.f42857b[i4] = true;
                    }
                    file = this.f42856a.f42863d[i4];
                    b.this.f42841b.mkdirs();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return file;
        }

        public String g(int i4) throws IOException {
            InputStream h4 = h(i4);
            if (h4 != null) {
                return b.B(h4);
            }
            return null;
        }

        public void i(int i4, String str) throws IOException {
            OutputStreamWriter outputStreamWriter = null;
            try {
                OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(new FileOutputStream(f(i4)), com.bumptech.glide.disklrucache.d.f42882b);
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
            this.f42856a = dVar;
            this.f42857b = dVar.f42864e ? null : new boolean[b.this.f42847h];
        }
    }

    /* compiled from: DiskLruCache.java */
    private final class d {

        /* renamed from: a, reason: collision with root package name */
        private final String f42860a;

        /* renamed from: b, reason: collision with root package name */
        private final long[] f42861b;

        /* renamed from: c, reason: collision with root package name */
        File[] f42862c;

        /* renamed from: d, reason: collision with root package name */
        File[] f42863d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f42864e;

        /* renamed from: f, reason: collision with root package name */
        private c f42865f;

        /* renamed from: g, reason: collision with root package name */
        private long f42866g;

        /* synthetic */ d(b bVar, String str, a aVar) {
            this(str);
        }

        private IOException m(String[] strArr) throws IOException {
            throw new IOException(ProtectedSandApp.s("ࠖ") + Arrays.toString(strArr));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void n(String[] strArr) throws IOException {
            if (strArr.length != b.this.f42847h) {
                throw m(strArr);
            }
            for (int i4 = 0; i4 < strArr.length; i4++) {
                try {
                    this.f42861b[i4] = Long.parseLong(strArr[i4]);
                } catch (NumberFormatException unused) {
                    throw m(strArr);
                }
            }
        }

        public File j(int i4) {
            return this.f42862c[i4];
        }

        public File k(int i4) {
            return this.f42863d[i4];
        }

        public String l() throws IOException {
            StringBuilder sb = new StringBuilder();
            for (long j4 : this.f42861b) {
                sb.append(' ');
                sb.append(j4);
            }
            return sb.toString();
        }

        private d(String str) {
            this.f42860a = str;
            this.f42861b = new long[b.this.f42847h];
            this.f42862c = new File[b.this.f42847h];
            this.f42863d = new File[b.this.f42847h];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i4 = 0; i4 < b.this.f42847h; i4++) {
                sb.append(i4);
                this.f42862c[i4] = new File(b.this.f42841b, sb.toString());
                sb.append(ProtectedSandApp.s("ࠕ"));
                this.f42863d[i4] = new File(b.this.f42841b, sb.toString());
                sb.setLength(length);
            }
        }
    }

    /* compiled from: DiskLruCache.java */
    public final class e {

        /* renamed from: a, reason: collision with root package name */
        private final String f42868a;

        /* renamed from: b, reason: collision with root package name */
        private final long f42869b;

        /* renamed from: c, reason: collision with root package name */
        private final long[] f42870c;

        /* renamed from: d, reason: collision with root package name */
        private final File[] f42871d;

        /* synthetic */ e(b bVar, String str, long j4, File[] fileArr, long[] jArr, a aVar) {
            this(str, j4, fileArr, jArr);
        }

        public c a() throws IOException {
            return b.this.t(this.f42868a, this.f42869b);
        }

        public File b(int i4) {
            return this.f42871d[i4];
        }

        public long c(int i4) {
            return this.f42870c[i4];
        }

        public String d(int i4) throws IOException {
            return b.B(new FileInputStream(this.f42871d[i4]));
        }

        private e(String str, long j4, File[] fileArr, long[] jArr) {
            this.f42868a = str;
            this.f42869b = j4;
            this.f42871d = fileArr;
            this.f42870c = jArr;
        }
    }

    private b(File file, int i4, int i5, long j4) {
        this.f42841b = file;
        this.f42845f = i4;
        this.f42842c = new File(file, ProtectedSandApp.s("ࠗ"));
        this.f42843d = new File(file, ProtectedSandApp.s("࠘"));
        this.f42844e = new File(file, ProtectedSandApp.s("࠙"));
        this.f42847h = i5;
        this.f42846g = j4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String B(InputStream inputStream) throws IOException {
        return com.bumptech.glide.disklrucache.d.c(new InputStreamReader(inputStream, com.bumptech.glide.disklrucache.d.f42882b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean C() {
        int i4 = this.f42851l;
        return i4 >= 2000 && i4 >= this.f42850k.size();
    }

    public static b D(File file, int i4, int i5, long j4) throws IOException {
        if (j4 <= 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ࠞ"));
        }
        if (i5 <= 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ࠝ"));
        }
        File file2 = new File(file, ProtectedSandApp.s("࠙"));
        if (file2.exists()) {
            File file3 = new File(file, ProtectedSandApp.s("ࠗ"));
            if (file3.exists()) {
                file2.delete();
            } else {
                J(file2, file3, false);
            }
        }
        b bVar = new b(file, i4, i5, j4);
        if (bVar.f42842c.exists()) {
            try {
                bVar.F();
                bVar.E();
                return bVar;
            } catch (IOException e4) {
                System.out.println(ProtectedSandApp.s("ࠚ") + file + ProtectedSandApp.s("ࠛ") + e4.getMessage() + ProtectedSandApp.s("ࠜ"));
                bVar.o();
            }
        }
        file.mkdirs();
        b bVar2 = new b(file, i4, i5, j4);
        bVar2.H();
        return bVar2;
    }

    private void E() throws IOException {
        q(this.f42843d);
        Iterator<d> it = this.f42850k.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            int i4 = 0;
            if (next.f42865f == null) {
                while (i4 < this.f42847h) {
                    this.f42848i += next.f42861b[i4];
                    i4++;
                }
            } else {
                next.f42865f = null;
                while (i4 < this.f42847h) {
                    q(next.f42862c[i4]);
                    q(next.f42863d[i4]);
                    i4++;
                }
                it.remove();
            }
        }
    }

    private void F() throws IOException {
        String s4 = ProtectedSandApp.s("ࠟ");
        String s5 = ProtectedSandApp.s("ࠠ");
        com.bumptech.glide.disklrucache.c cVar = new com.bumptech.glide.disklrucache.c(new FileInputStream(this.f42842c), com.bumptech.glide.disklrucache.d.f42881a);
        try {
            String d5 = cVar.d();
            String d6 = cVar.d();
            String d7 = cVar.d();
            String d10 = cVar.d();
            String d11 = cVar.d();
            if (!ProtectedSandApp.s("ࠡ").equals(d5) || !ProtectedSandApp.s("ࠢ").equals(d6) || !Integer.toString(this.f42845f).equals(d7) || !Integer.toString(this.f42847h).equals(d10) || !"".equals(d11)) {
                throw new IOException(s5 + d5 + s4 + d6 + s4 + d10 + s4 + d11 + ProtectedSandApp.s("ࠣ"));
            }
            int i4 = 0;
            while (true) {
                try {
                    G(cVar.d());
                    i4++;
                } catch (EOFException unused) {
                    this.f42851l = i4 - this.f42850k.size();
                    if (cVar.c()) {
                        H();
                    } else {
                        this.f42849j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f42842c, true), com.bumptech.glide.disklrucache.d.f42881a));
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

    private void G(String str) throws IOException {
        String substring;
        int indexOf = str.indexOf(32);
        String s4 = ProtectedSandApp.s("ࠤ");
        if (indexOf == -1) {
            throw new IOException(s4.concat(str));
        }
        int i4 = indexOf + 1;
        int indexOf2 = str.indexOf(32, i4);
        if (indexOf2 == -1) {
            substring = str.substring(i4);
            if (indexOf == 6 && str.startsWith(ProtectedSandApp.s("ࠥ"))) {
                this.f42850k.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i4, indexOf2);
        }
        d dVar = this.f42850k.get(substring);
        a aVar = null;
        if (dVar == null) {
            dVar = new d(this, substring, aVar);
            this.f42850k.put(substring, dVar);
        }
        if (indexOf2 != -1 && indexOf == 5 && str.startsWith(ProtectedSandApp.s("ࠦ"))) {
            String[] split = str.substring(indexOf2 + 1).split(ProtectedSandApp.s("ࠧ"));
            dVar.f42864e = true;
            dVar.f42865f = null;
            dVar.n(split);
            return;
        }
        if (indexOf2 == -1 && indexOf == 5 && str.startsWith(ProtectedSandApp.s("ࠨ"))) {
            dVar.f42865f = new c(this, dVar, aVar);
        } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith(ProtectedSandApp.s("ࠩ"))) {
            throw new IOException(s4.concat(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void H() throws IOException {
        try {
            Writer writer = this.f42849j;
            if (writer != null) {
                m(writer);
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f42843d), com.bumptech.glide.disklrucache.d.f42881a));
            try {
                bufferedWriter.write(ProtectedSandApp.s("ࠡ"));
                bufferedWriter.write(ProtectedSandApp.s("ࠪ"));
                bufferedWriter.write(ProtectedSandApp.s("ࠢ"));
                bufferedWriter.write(ProtectedSandApp.s("ࠪ"));
                bufferedWriter.write(Integer.toString(this.f42845f));
                bufferedWriter.write(ProtectedSandApp.s("ࠪ"));
                bufferedWriter.write(Integer.toString(this.f42847h));
                bufferedWriter.write(ProtectedSandApp.s("ࠪ"));
                bufferedWriter.write(ProtectedSandApp.s("ࠪ"));
                for (d dVar : this.f42850k.values()) {
                    if (dVar.f42865f != null) {
                        bufferedWriter.write(ProtectedSandApp.s("ࠫ") + dVar.f42860a + '\n');
                    } else {
                        bufferedWriter.write(ProtectedSandApp.s("ࠬ") + dVar.f42860a + dVar.l() + '\n');
                    }
                }
                m(bufferedWriter);
                if (this.f42842c.exists()) {
                    J(this.f42842c, this.f42844e, true);
                }
                J(this.f42843d, this.f42842c, false);
                this.f42844e.delete();
                this.f42849j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f42842c, true), com.bumptech.glide.disklrucache.d.f42881a));
            } catch (Throwable th) {
                m(bufferedWriter);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private static void J(File file, File file2, boolean z4) throws IOException {
        if (z4) {
            q(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L() throws IOException {
        while (this.f42848i > this.f42846g) {
            I(this.f42850k.entrySet().iterator().next().getKey());
        }
    }

    private void l() {
        if (this.f42849j == null) {
            throw new IllegalStateException(ProtectedSandApp.s("࠭"));
        }
    }

    @TargetApi(26)
    private static void m(Writer writer) throws IOException {
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
    public synchronized void n(c cVar, boolean z4) throws IOException {
        d dVar = cVar.f42856a;
        if (dVar.f42865f != cVar) {
            throw new IllegalStateException();
        }
        if (z4 && !dVar.f42864e) {
            for (int i4 = 0; i4 < this.f42847h; i4++) {
                if (!cVar.f42857b[i4]) {
                    cVar.a();
                    throw new IllegalStateException(ProtectedSandApp.s("\u082e") + i4);
                }
                if (!dVar.f42863d[i4].exists()) {
                    cVar.a();
                    return;
                }
            }
        }
        for (int i5 = 0; i5 < this.f42847h; i5++) {
            File file = dVar.f42863d[i5];
            if (!z4) {
                q(file);
            } else if (file.exists()) {
                File file2 = dVar.f42862c[i5];
                file.renameTo(file2);
                long j4 = dVar.f42861b[i5];
                long length = file2.length();
                dVar.f42861b[i5] = length;
                this.f42848i = (this.f42848i - j4) + length;
            }
        }
        this.f42851l++;
        dVar.f42865f = null;
        if (dVar.f42864e || z4) {
            dVar.f42864e = true;
            this.f42849j.append((CharSequence) ProtectedSandApp.s("ࠦ"));
            this.f42849j.append(' ');
            this.f42849j.append((CharSequence) dVar.f42860a);
            this.f42849j.append((CharSequence) dVar.l());
            this.f42849j.append('\n');
            if (z4) {
                long j5 = this.f42852m;
                this.f42852m = 1 + j5;
                dVar.f42866g = j5;
            }
        } else {
            this.f42850k.remove(dVar.f42860a);
            this.f42849j.append((CharSequence) ProtectedSandApp.s("ࠥ"));
            this.f42849j.append(' ');
            this.f42849j.append((CharSequence) dVar.f42860a);
            this.f42849j.append('\n');
        }
        u(this.f42849j);
        if (this.f42848i > this.f42846g || C()) {
            this.f42853n.submit(this.f42854o);
        }
    }

    private static void q(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized c t(String str, long j4) throws IOException {
        l();
        d dVar = this.f42850k.get(str);
        a aVar = null;
        if (j4 != -1 && (dVar == null || dVar.f42866g != j4)) {
            return null;
        }
        if (dVar == null) {
            dVar = new d(this, str, aVar);
            this.f42850k.put(str, dVar);
        } else if (dVar.f42865f != null) {
            return null;
        }
        c cVar = new c(this, dVar, aVar);
        dVar.f42865f = cVar;
        this.f42849j.append((CharSequence) ProtectedSandApp.s("ࠨ"));
        this.f42849j.append(' ');
        this.f42849j.append((CharSequence) str);
        this.f42849j.append('\n');
        u(this.f42849j);
        return cVar;
    }

    @TargetApi(26)
    private static void u(Writer writer) throws IOException {
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

    public synchronized boolean I(String str) throws IOException {
        try {
            l();
            d dVar = this.f42850k.get(str);
            if (dVar != null && dVar.f42865f == null) {
                for (int i4 = 0; i4 < this.f42847h; i4++) {
                    File file = dVar.f42862c[i4];
                    if (file.exists() && !file.delete()) {
                        throw new IOException(ProtectedSandApp.s("\u082f") + file);
                    }
                    this.f42848i -= dVar.f42861b[i4];
                    dVar.f42861b[i4] = 0;
                }
                this.f42851l++;
                this.f42849j.append((CharSequence) ProtectedSandApp.s("ࠥ"));
                this.f42849j.append(' ');
                this.f42849j.append((CharSequence) str);
                this.f42849j.append('\n');
                this.f42850k.remove(str);
                if (C()) {
                    this.f42853n.submit(this.f42854o);
                }
                return true;
            }
            return false;
        } finally {
        }
    }

    public synchronized void K(long j4) {
        this.f42846g = j4;
        this.f42853n.submit(this.f42854o);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        try {
            if (this.f42849j == null) {
                return;
            }
            Iterator it = new ArrayList(this.f42850k.values()).iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                if (dVar.f42865f != null) {
                    dVar.f42865f.a();
                }
            }
            L();
            m(this.f42849j);
            this.f42849j = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void flush() throws IOException {
        l();
        L();
        u(this.f42849j);
    }

    public synchronized boolean isClosed() {
        return this.f42849j == null;
    }

    public void o() throws IOException {
        close();
        com.bumptech.glide.disklrucache.d.b(this.f42841b);
    }

    public c s(String str) throws IOException {
        return t(str, -1L);
    }

    public synchronized long size() {
        return this.f42848i;
    }

    public synchronized e x(String str) throws IOException {
        l();
        d dVar = this.f42850k.get(str);
        if (dVar == null) {
            return null;
        }
        if (!dVar.f42864e) {
            return null;
        }
        for (File file : dVar.f42862c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.f42851l++;
        this.f42849j.append((CharSequence) ProtectedSandApp.s("ࠩ"));
        this.f42849j.append(' ');
        this.f42849j.append((CharSequence) str);
        this.f42849j.append('\n');
        if (C()) {
            this.f42853n.submit(this.f42854o);
        }
        return new e(this, str, dVar.f42866g, dVar.f42862c, dVar.f42861b, null);
    }

    public File y() {
        return this.f42841b;
    }

    public synchronized long z() {
        return this.f42846g;
    }
}
