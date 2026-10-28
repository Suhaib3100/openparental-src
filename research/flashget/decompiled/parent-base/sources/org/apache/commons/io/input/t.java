package org.apache.commons.io.input;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* compiled from: Tailer.java */
/* loaded from: classes4.dex */
public class t implements Runnable {

    /* renamed from: i, reason: collision with root package name */
    private static final int f85502i = 1000;

    /* renamed from: j, reason: collision with root package name */
    private static final String f85503j = "r";

    /* renamed from: k, reason: collision with root package name */
    private static final int f85504k = 4096;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f85505b;

    /* renamed from: c, reason: collision with root package name */
    private final File f85506c;

    /* renamed from: d, reason: collision with root package name */
    private final long f85507d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f85508e;

    /* renamed from: f, reason: collision with root package name */
    private final u f85509f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f85510g;

    /* renamed from: h, reason: collision with root package name */
    private volatile boolean f85511h;

    public t(File file, u uVar) {
        this(file, uVar, 1000L, false);
    }

    public static t a(File file, u uVar) {
        return d(file, uVar, 1000L, false, 4096);
    }

    public static t b(File file, u uVar, long j4) {
        return d(file, uVar, j4, false, 4096);
    }

    public static t c(File file, u uVar, long j4, boolean z4) {
        return d(file, uVar, j4, z4, 4096);
    }

    public static t d(File file, u uVar, long j4, boolean z4, int i4) {
        t tVar = new t(file, uVar, j4, z4, false, i4);
        Thread thread = new Thread(tVar);
        thread.setDaemon(true);
        thread.start();
        return tVar;
    }

    public static t e(File file, u uVar, long j4, boolean z4, boolean z5) {
        return f(file, uVar, j4, z4, z5, 4096);
    }

    public static t f(File file, u uVar, long j4, boolean z4, boolean z5, int i4) {
        t tVar = new t(file, uVar, j4, z4, z5, i4);
        Thread thread = new Thread(tVar);
        thread.setDaemon(true);
        thread.start();
        return tVar;
    }

    private long i(RandomAccessFile randomAccessFile) throws IOException {
        int read;
        StringBuilder sb = new StringBuilder();
        long filePointer = randomAccessFile.getFilePointer();
        long j4 = filePointer;
        boolean z4 = false;
        while (this.f85511h && (read = randomAccessFile.read(this.f85505b)) != -1) {
            for (int i4 = 0; i4 < read; i4++) {
                byte b5 = this.f85505b[i4];
                if (b5 == 10) {
                    this.f85509f.d(sb.toString());
                    sb.setLength(0);
                    filePointer = i4 + j4 + 1;
                    z4 = false;
                } else if (b5 != 13) {
                    if (z4) {
                        this.f85509f.d(sb.toString());
                        sb.setLength(0);
                        filePointer = i4 + j4 + 1;
                        z4 = false;
                    }
                    sb.append((char) b5);
                } else {
                    if (z4) {
                        sb.append(org.apache.commons.lang3.m.f86065d);
                    }
                    z4 = true;
                }
            }
            j4 = randomAccessFile.getFilePointer();
        }
        randomAccessFile.seek(filePointer);
        return filePointer;
    }

    public long g() {
        return this.f85507d;
    }

    public File h() {
        return this.f85506c;
    }

    public void j() {
        this.f85511h = false;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:32|(1:34)(8:(1:57)|36|(1:38)|39|40|41|(5:46|47|48|49|50)|51)|35|36|(0)|39|40|41|(1:53)(7:43|44|46|47|48|49|50)|51) */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0092 A[Catch: all -> 0x0016, Exception -> 0x0019, TRY_LEAVE, TryCatch #2 {all -> 0x0016, blocks: (B:3:0x0005, B:8:0x000d, B:12:0x0023, B:18:0x0029, B:20:0x002d, B:21:0x0036, B:25:0x001c, B:28:0x003e, B:30:0x0042, B:59:0x0052, B:61:0x0057, B:73:0x00b1, B:69:0x006c, B:34:0x0074, B:36:0x008e, B:38:0x0092, B:40:0x0095, B:41:0x009a, B:44:0x009e, B:47:0x00a2, B:57:0x0082), top: B:2:0x0005 }] */
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
            boolean r7 = r13.f85511h     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L19
            java.lang.String r8 = "r"
            if (r7 == 0) goto L3e
            if (r2 != 0) goto L3e
            java.io.RandomAccessFile r7 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L19 java.io.FileNotFoundException -> L1c
            java.io.File r9 = r13.f85506c     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L19 java.io.FileNotFoundException -> L1c
            r7.<init>(r9, r8)     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L19 java.io.FileNotFoundException -> L1c
            r2 = r7
            goto L21
        L16:
            r0 = move-exception
            goto Lb8
        L19:
            r0 = move-exception
            goto Lb1
        L1c:
            org.apache.commons.io.input.u r7 = r13.f85509f     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L19
            r7.b()     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L19
        L21:
            if (r2 != 0) goto L29
            long r7 = r13.f85507d     // Catch: java.lang.InterruptedException -> L5 java.lang.Throwable -> L16 java.lang.Exception -> L19
            java.lang.Thread.sleep(r7)     // Catch: java.lang.InterruptedException -> L5 java.lang.Throwable -> L16 java.lang.Exception -> L19
            goto L5
        L29:
            boolean r3 = r13.f85508e     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L19
            if (r3 == 0) goto L35
            java.io.File r3 = r13.f85506c     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L19
            long r3 = r3.length()     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L19
            r5 = r3
            goto L36
        L35:
            r5 = r0
        L36:
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L19
            r2.seek(r5)     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L19
            goto L5
        L3e:
            boolean r7 = r13.f85511h     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L19
            if (r7 == 0) goto Lad
            java.io.File r7 = r13.f85506c     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L19
            boolean r7 = org.apache.commons.io.i.O(r7, r3)     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L19
            java.io.File r9 = r13.f85506c     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L19
            long r9 = r9.length()     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L19
            int r9 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r9 >= 0) goto L72
            org.apache.commons.io.input.u r7 = r13.f85509f     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L19
            r7.c()     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L19
            java.io.RandomAccessFile r7 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L19 java.io.FileNotFoundException -> L6c
            java.io.File r9 = r13.f85506c     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L19 java.io.FileNotFoundException -> L6c
            r7.<init>(r9, r8)     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L19 java.io.FileNotFoundException -> L6c
            org.apache.commons.io.m.b(r2)     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L67 java.io.FileNotFoundException -> L6a
            r5 = r0
        L62:
            r2 = r7
            goto L3e
        L64:
            r0 = move-exception
            r2 = r7
            goto Lb8
        L67:
            r0 = move-exception
            r2 = r7
            goto Lb1
        L6a:
            r5 = r0
            r2 = r7
        L6c:
            org.apache.commons.io.input.u r7 = r13.f85509f     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L19
            r7.b()     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L19
            goto L3e
        L72:
            if (r9 <= 0) goto L80
            long r3 = r13.i(r2)     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L19
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L19
        L7c:
            r11 = r3
            r3 = r5
            r5 = r11
            goto L8e
        L80:
            if (r7 == 0) goto L8e
            r2.seek(r0)     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L19
            long r3 = r13.i(r2)     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L19
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L19
            goto L7c
        L8e:
            boolean r7 = r13.f85510g     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L19
            if (r7 == 0) goto L95
            org.apache.commons.io.m.b(r2)     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L19
        L95:
            long r9 = r13.f85507d     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L19 java.lang.InterruptedException -> L9a
            java.lang.Thread.sleep(r9)     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L19 java.lang.InterruptedException -> L9a
        L9a:
            boolean r7 = r13.f85511h     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L19
            if (r7 == 0) goto L3e
            boolean r7 = r13.f85510g     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L19
            if (r7 == 0) goto L3e
            java.io.RandomAccessFile r7 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L19
            java.io.File r9 = r13.f85506c     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L19
            r7.<init>(r9, r8)     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L19
            r7.seek(r5)     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L67
            goto L62
        Lad:
            org.apache.commons.io.m.b(r2)
            goto Lb7
        Lb1:
            org.apache.commons.io.input.u r1 = r13.f85509f     // Catch: java.lang.Throwable -> L16
            r1.a(r0)     // Catch: java.lang.Throwable -> L16
            goto Lad
        Lb7:
            return
        Lb8:
            org.apache.commons.io.m.b(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.io.input.t.run():void");
    }

    public t(File file, u uVar, long j4) {
        this(file, uVar, j4, false);
    }

    public t(File file, u uVar, long j4, boolean z4, boolean z5) {
        this(file, uVar, j4, z4, z5, 4096);
    }

    public t(File file, u uVar, long j4, boolean z4) {
        this(file, uVar, j4, z4, false, 4096);
    }

    public t(File file, u uVar, long j4, boolean z4, int i4) {
        this(file, uVar, j4, z4, false, i4);
    }

    public t(File file, u uVar, long j4, boolean z4, boolean z5, int i4) {
        this.f85511h = true;
        this.f85506c = file;
        this.f85507d = j4;
        this.f85508e = z4;
        this.f85505b = new byte[i4];
        this.f85509f = uVar;
        uVar.e(this);
        this.f85510g = z5;
    }
}
