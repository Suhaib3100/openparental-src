package org.apache.commons.io.input;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* compiled from: Tailer.java */
/* loaded from: classes5.dex */
public class t implements Runnable {

    /* renamed from: v, reason: collision with root package name */
    private static final int f31985v = 1000;

    /* renamed from: w, reason: collision with root package name */
    private static final String f31986w = "r";

    /* renamed from: x, reason: collision with root package name */
    private static final int f31987x = 4096;

    /* renamed from: o, reason: collision with root package name */
    private final byte[] f31988o;

    /* renamed from: p, reason: collision with root package name */
    private final File f31989p;

    /* renamed from: q, reason: collision with root package name */
    private final long f31990q;

    /* renamed from: r, reason: collision with root package name */
    private final boolean f31991r;

    /* renamed from: s, reason: collision with root package name */
    private final u f31992s;

    /* renamed from: t, reason: collision with root package name */
    private final boolean f31993t;

    /* renamed from: u, reason: collision with root package name */
    private volatile boolean f31994u;

    public t(File file, u uVar) {
        this(file, uVar, 1000L);
    }

    public static t a(File file, u uVar) {
        return c(file, uVar, 1000L, false);
    }

    public static t b(File file, u uVar, long j5) {
        return c(file, uVar, j5, false);
    }

    public static t c(File file, u uVar, long j5, boolean z5) {
        return d(file, uVar, j5, z5, 4096);
    }

    public static t d(File file, u uVar, long j5, boolean z5, int i5) {
        t tVar = new t(file, uVar, j5, z5, i5);
        Thread thread = new Thread(tVar);
        thread.setDaemon(true);
        thread.start();
        return tVar;
    }

    public static t e(File file, u uVar, long j5, boolean z5, boolean z6) {
        return f(file, uVar, j5, z5, z6, 4096);
    }

    public static t f(File file, u uVar, long j5, boolean z5, boolean z6, int i5) {
        t tVar = new t(file, uVar, j5, z5, z6, i5);
        Thread thread = new Thread(tVar);
        thread.setDaemon(true);
        thread.start();
        return tVar;
    }

    private long i(RandomAccessFile randomAccessFile) throws IOException {
        int read;
        StringBuilder sb = new StringBuilder();
        long filePointer = randomAccessFile.getFilePointer();
        long j5 = filePointer;
        boolean z5 = false;
        while (this.f31994u && (read = randomAccessFile.read(this.f31988o)) != -1) {
            for (int i5 = 0; i5 < read; i5++) {
                byte b6 = this.f31988o[i5];
                if (b6 == 10) {
                    this.f31992s.d(sb.toString());
                    sb.setLength(0);
                    filePointer = i5 + j5 + 1;
                    z5 = false;
                } else if (b6 != 13) {
                    if (z5) {
                        this.f31992s.d(sb.toString());
                        sb.setLength(0);
                        filePointer = i5 + j5 + 1;
                        z5 = false;
                    }
                    sb.append((char) b6);
                } else {
                    if (z5) {
                        sb.append('\r');
                    }
                    z5 = true;
                }
            }
            j5 = randomAccessFile.getFilePointer();
        }
        randomAccessFile.seek(filePointer);
        return filePointer;
    }

    public long g() {
        return this.f31990q;
    }

    public File h() {
        return this.f31989p;
    }

    public void j() {
        this.f31994u = false;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:32|(1:34)(8:(1:57)|36|(1:38)|39|40|41|(5:46|47|48|49|50)|51)|35|36|(0)|39|40|41|(1:53)(7:43|44|46|47|48|49|50)|51) */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008c A[Catch: all -> 0x00a7, Exception -> 0x00a9, TRY_LEAVE, TryCatch #3 {Exception -> 0x00a9, blocks: (B:3:0x0005, B:8:0x000d, B:12:0x001d, B:18:0x0023, B:20:0x0027, B:21:0x0030, B:25:0x0016, B:28:0x0038, B:30:0x003c, B:59:0x004c, B:61:0x0051, B:68:0x0066, B:34:0x006e, B:36:0x0088, B:38:0x008c, B:40:0x008f, B:41:0x0094, B:44:0x0098, B:47:0x009c, B:57:0x007c), top: B:2:0x0005 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r13 = this;
            r0 = 0
            r2 = 0
            r3 = r0
            r5 = r3
        L5:
            boolean r7 = r13.f31994u     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> La9
            java.lang.String r8 = "r"
            if (r7 == 0) goto L38
            if (r2 != 0) goto L38
            java.io.RandomAccessFile r7 = new java.io.RandomAccessFile     // Catch: java.io.FileNotFoundException -> L16 java.lang.Throwable -> La7 java.lang.Exception -> La9
            java.io.File r9 = r13.f31989p     // Catch: java.io.FileNotFoundException -> L16 java.lang.Throwable -> La7 java.lang.Exception -> La9
            r7.<init>(r9, r8)     // Catch: java.io.FileNotFoundException -> L16 java.lang.Throwable -> La7 java.lang.Exception -> La9
            r2 = r7
            goto L1b
        L16:
            org.apache.commons.io.input.u r7 = r13.f31992s     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> La9
            r7.a()     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> La9
        L1b:
            if (r2 != 0) goto L23
            long r7 = r13.f31990q     // Catch: java.lang.InterruptedException -> L5 java.lang.Throwable -> La7 java.lang.Exception -> La9
            java.lang.Thread.sleep(r7)     // Catch: java.lang.InterruptedException -> L5 java.lang.Throwable -> La7 java.lang.Exception -> La9
            goto L5
        L23:
            boolean r3 = r13.f31991r     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> La9
            if (r3 == 0) goto L2f
            java.io.File r3 = r13.f31989p     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> La9
            long r3 = r3.length()     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> La9
            r5 = r3
            goto L30
        L2f:
            r5 = r0
        L30:
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> La9
            r2.seek(r5)     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> La9
            goto L5
        L38:
            boolean r7 = r13.f31994u     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> La9
            if (r7 == 0) goto Laf
            java.io.File r7 = r13.f31989p     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> La9
            boolean r7 = org.apache.commons.io.j.O(r7, r3)     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> La9
            java.io.File r9 = r13.f31989p     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> La9
            long r9 = r9.length()     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> La9
            int r9 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r9 >= 0) goto L6c
            org.apache.commons.io.input.u r7 = r13.f31992s     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> La9
            r7.b()     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> La9
            java.io.RandomAccessFile r7 = new java.io.RandomAccessFile     // Catch: java.io.FileNotFoundException -> L66 java.lang.Throwable -> La7 java.lang.Exception -> La9
            java.io.File r9 = r13.f31989p     // Catch: java.io.FileNotFoundException -> L66 java.lang.Throwable -> La7 java.lang.Exception -> La9
            r7.<init>(r9, r8)     // Catch: java.io.FileNotFoundException -> L66 java.lang.Throwable -> La7 java.lang.Exception -> La9
            org.apache.commons.io.n.b(r2)     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L61 java.io.FileNotFoundException -> L64
            r5 = r0
        L5c:
            r2 = r7
            goto L38
        L5e:
            r0 = move-exception
            r2 = r7
            goto Lb3
        L61:
            r0 = move-exception
            r2 = r7
            goto Laa
        L64:
            r5 = r0
            r2 = r7
        L66:
            org.apache.commons.io.input.u r7 = r13.f31992s     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> La9
            r7.a()     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> La9
            goto L38
        L6c:
            if (r9 <= 0) goto L7a
            long r3 = r13.i(r2)     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> La9
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> La9
        L76:
            r11 = r3
            r3 = r5
            r5 = r11
            goto L88
        L7a:
            if (r7 == 0) goto L88
            r2.seek(r0)     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> La9
            long r3 = r13.i(r2)     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> La9
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> La9
            goto L76
        L88:
            boolean r7 = r13.f31993t     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> La9
            if (r7 == 0) goto L8f
            org.apache.commons.io.n.b(r2)     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> La9
        L8f:
            long r9 = r13.f31990q     // Catch: java.lang.InterruptedException -> L94 java.lang.Throwable -> La7 java.lang.Exception -> La9
            java.lang.Thread.sleep(r9)     // Catch: java.lang.InterruptedException -> L94 java.lang.Throwable -> La7 java.lang.Exception -> La9
        L94:
            boolean r7 = r13.f31994u     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> La9
            if (r7 == 0) goto L38
            boolean r7 = r13.f31993t     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> La9
            if (r7 == 0) goto L38
            java.io.RandomAccessFile r7 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> La9
            java.io.File r9 = r13.f31989p     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> La9
            r7.<init>(r9, r8)     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> La9
            r7.seek(r5)     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L61
            goto L5c
        La7:
            r0 = move-exception
            goto Lb3
        La9:
            r0 = move-exception
        Laa:
            org.apache.commons.io.input.u r1 = r13.f31992s     // Catch: java.lang.Throwable -> La7
            r1.c(r0)     // Catch: java.lang.Throwable -> La7
        Laf:
            org.apache.commons.io.n.b(r2)
            return
        Lb3:
            org.apache.commons.io.n.b(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.io.input.t.run():void");
    }

    public t(File file, u uVar, long j5) {
        this(file, uVar, j5, false);
    }

    public t(File file, u uVar, long j5, boolean z5) {
        this(file, uVar, j5, z5, 4096);
    }

    public t(File file, u uVar, long j5, boolean z5, boolean z6) {
        this(file, uVar, j5, z5, z6, 4096);
    }

    public t(File file, u uVar, long j5, boolean z5, int i5) {
        this(file, uVar, j5, z5, false, i5);
    }

    public t(File file, u uVar, long j5, boolean z5, boolean z6, int i5) {
        this.f31994u = true;
        this.f31989p = file;
        this.f31990q = j5;
        this.f31991r = z5;
        this.f31988o = new byte[i5];
        this.f31992s = uVar;
        uVar.e(this);
        this.f31993t = z6;
    }
}
