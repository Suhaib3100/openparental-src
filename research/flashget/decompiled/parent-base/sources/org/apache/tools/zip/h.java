package org.apache.tools.zip;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
import java.util.zip.ZipException;

/* compiled from: ZipFile.java */
/* loaded from: classes3.dex */
public class h {

    /* renamed from: f, reason: collision with root package name */
    private static final int f86753f = 42;

    /* renamed from: g, reason: collision with root package name */
    private static final int f86754g = 22;

    /* renamed from: h, reason: collision with root package name */
    private static final int f86755h = 16;

    /* renamed from: i, reason: collision with root package name */
    private static final long f86756i = 26;

    /* renamed from: a, reason: collision with root package name */
    private Hashtable f86757a;

    /* renamed from: b, reason: collision with root package name */
    private Hashtable f86758b;

    /* renamed from: c, reason: collision with root package name */
    private Hashtable f86759c;

    /* renamed from: d, reason: collision with root package name */
    private String f86760d;

    /* renamed from: e, reason: collision with root package name */
    private RandomAccessFile f86761e;

    public h(File file) throws IOException {
        this(file, (String) null);
    }

    protected static Date c(i iVar) {
        long c5 = iVar.c();
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, ((int) ((c5 >> 25) & 127)) + 1980);
        calendar.set(2, ((int) ((c5 >> 21) & 15)) - 1);
        calendar.set(5, ((int) (c5 >> 16)) & 31);
        calendar.set(11, ((int) (c5 >> 11)) & 31);
        calendar.set(12, ((int) (c5 >> 5)) & 63);
        calendar.set(13, ((int) (c5 << 1)) & 62);
        return calendar.getTime();
    }

    private void i() throws IOException {
        j();
        byte[] bArr = new byte[42];
        byte[] bArr2 = new byte[4];
        this.f86761e.readFully(bArr2);
        for (i iVar = new i(bArr2, 0); iVar.equals(j.f86773y); iVar = new i(bArr2, 0)) {
            this.f86761e.readFully(bArr);
            f fVar = new f();
            fVar.v((new k(bArr, 0).c() >> 8) & 15);
            fVar.setMethod(new k(bArr, 6).c());
            fVar.setTime(c(new i(bArr, 8)).getTime());
            fVar.setCrc(new i(bArr, 12).c());
            fVar.setCompressedSize(new i(bArr, 16).c());
            fVar.setSize(new i(bArr, 20).c());
            int c5 = new k(bArr, 24).c();
            int c6 = new k(bArr, 26).c();
            int c7 = new k(bArr, 28).c();
            fVar.t(new k(bArr, 32).c());
            fVar.q(new i(bArr, 34).c());
            this.f86757a.put(fVar, new Long(new i(bArr, 38).c()));
            byte[] bArr3 = new byte[c5];
            this.f86761e.readFully(bArr3);
            fVar.u(h(bArr3));
            this.f86758b.put(fVar.getName(), fVar);
            this.f86761e.skipBytes(c6);
            byte[] bArr4 = new byte[c7];
            this.f86761e.readFully(bArr4);
            fVar.setComment(h(bArr4));
            this.f86761e.readFully(bArr2);
        }
    }

    private void j() throws IOException {
        long length = this.f86761e.length() - 22;
        this.f86761e.seek(length);
        byte[] b5 = j.f86774z.b();
        int read = this.f86761e.read();
        while (read != -1) {
            if (read == b5[0] && this.f86761e.read() == b5[1] && this.f86761e.read() == b5[2] && this.f86761e.read() == b5[3]) {
                this.f86761e.seek(length + 16);
                byte[] bArr = new byte[4];
                this.f86761e.readFully(bArr);
                this.f86761e.seek(new i(bArr, 0).c());
                return;
            }
            length--;
            this.f86761e.seek(length);
            read = this.f86761e.read();
        }
        throw new ZipException("archive is not a ZIP archive");
    }

    private void k() throws IOException {
        Enumeration e4 = e();
        while (e4.hasMoreElements()) {
            f fVar = (f) e4.nextElement();
            long longValue = ((Long) this.f86757a.get(fVar)).longValue();
            this.f86761e.seek(f86756i + longValue);
            byte[] bArr = new byte[2];
            this.f86761e.readFully(bArr);
            int c5 = new k(bArr, 0).c();
            this.f86761e.readFully(bArr);
            int c6 = new k(bArr, 0).c();
            this.f86761e.skipBytes(c5);
            byte[] bArr2 = new byte[c6];
            this.f86761e.readFully(bArr2);
            fVar.setExtra(bArr2);
            this.f86759c.put(fVar, new Long(longValue + 30 + c5 + c6));
        }
    }

    public void b() throws IOException {
        this.f86761e.close();
    }

    public String d() {
        return this.f86760d;
    }

    public Enumeration e() {
        return this.f86757a.keys();
    }

    public f f(String str) {
        return (f) this.f86758b.get(str);
    }

    public InputStream g(f fVar) throws IOException, ZipException {
        Long l4 = (Long) this.f86759c.get(fVar);
        if (l4 == null) {
            return null;
        }
        a aVar = new a(l4.longValue(), fVar.getCompressedSize());
        int method = fVar.getMethod();
        if (method == 0) {
            return aVar;
        }
        if (method == 8) {
            aVar.a();
            return new InflaterInputStream(aVar, new Inflater(true));
        }
        throw new ZipException("Found unsupported compression method " + fVar.getMethod());
    }

    protected String h(byte[] bArr) throws ZipException {
        String str = this.f86760d;
        if (str == null) {
            return new String(bArr);
        }
        try {
            return new String(bArr, str);
        } catch (UnsupportedEncodingException e4) {
            throw new ZipException(e4.getMessage());
        }
    }

    public h(String str) throws IOException {
        this(new File(str), (String) null);
    }

    public h(String str, String str2) throws IOException {
        this(new File(str), str2);
    }

    public h(File file, String str) throws IOException {
        this.f86757a = new Hashtable();
        this.f86758b = new Hashtable();
        this.f86759c = new Hashtable();
        this.f86760d = str;
        this.f86761e = new RandomAccessFile(file, "r");
        try {
            i();
            k();
        } catch (IOException e4) {
            try {
                this.f86761e.close();
            } catch (IOException unused) {
            }
            throw e4;
        }
    }

    /* compiled from: ZipFile.java */
    private class a extends InputStream {

        /* renamed from: b, reason: collision with root package name */
        private long f86762b;

        /* renamed from: c, reason: collision with root package name */
        private long f86763c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f86764d = false;

        a(long j4, long j5) {
            this.f86762b = j5;
            this.f86763c = j4;
        }

        void a() {
            this.f86764d = true;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            int read;
            long j4 = this.f86762b;
            this.f86762b = j4 - 1;
            if (j4 <= 0) {
                if (!this.f86764d) {
                    return -1;
                }
                this.f86764d = false;
                return 0;
            }
            synchronized (h.this.f86761e) {
                RandomAccessFile randomAccessFile = h.this.f86761e;
                long j5 = this.f86763c;
                this.f86763c = 1 + j5;
                randomAccessFile.seek(j5);
                read = h.this.f86761e.read();
            }
            return read;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i4, int i5) throws IOException {
            int read;
            long j4 = this.f86762b;
            if (j4 <= 0) {
                if (!this.f86764d) {
                    return -1;
                }
                this.f86764d = false;
                bArr[i4] = 0;
                return 1;
            }
            if (i5 <= 0) {
                return 0;
            }
            if (i5 > j4) {
                i5 = (int) j4;
            }
            synchronized (h.this.f86761e) {
                h.this.f86761e.seek(this.f86763c);
                read = h.this.f86761e.read(bArr, i4, i5);
            }
            if (read > 0) {
                long j5 = read;
                this.f86763c += j5;
                this.f86762b -= j5;
            }
            return read;
        }
    }
}
