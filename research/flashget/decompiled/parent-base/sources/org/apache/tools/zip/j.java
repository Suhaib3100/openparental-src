package org.apache.tools.zip;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Hashtable;
import java.util.Vector;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import java.util.zip.ZipException;

/* compiled from: ZipOutputStream.java */
/* loaded from: classes3.dex */
public class j extends FilterOutputStream {

    /* renamed from: u, reason: collision with root package name */
    public static final int f86769u = 8;

    /* renamed from: v, reason: collision with root package name */
    public static final int f86770v = 0;

    /* renamed from: b, reason: collision with root package name */
    private f f86775b;

    /* renamed from: c, reason: collision with root package name */
    private String f86776c;

    /* renamed from: d, reason: collision with root package name */
    private int f86777d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f86778e;

    /* renamed from: f, reason: collision with root package name */
    private int f86779f;

    /* renamed from: g, reason: collision with root package name */
    private Vector f86780g;

    /* renamed from: h, reason: collision with root package name */
    private CRC32 f86781h;

    /* renamed from: i, reason: collision with root package name */
    private long f86782i;

    /* renamed from: j, reason: collision with root package name */
    private long f86783j;

    /* renamed from: k, reason: collision with root package name */
    private long f86784k;

    /* renamed from: l, reason: collision with root package name */
    private i f86785l;

    /* renamed from: m, reason: collision with root package name */
    private i f86786m;

    /* renamed from: n, reason: collision with root package name */
    private Hashtable f86787n;

    /* renamed from: o, reason: collision with root package name */
    private String f86788o;

    /* renamed from: p, reason: collision with root package name */
    protected Deflater f86789p;

    /* renamed from: q, reason: collision with root package name */
    protected byte[] f86790q;

    /* renamed from: r, reason: collision with root package name */
    private RandomAccessFile f86791r;

    /* renamed from: s, reason: collision with root package name */
    private static final byte[] f86767s = {0, 0};

    /* renamed from: t, reason: collision with root package name */
    private static final byte[] f86768t = {0, 0, 0, 0};

    /* renamed from: w, reason: collision with root package name */
    protected static final i f86771w = new i(67324752);

    /* renamed from: x, reason: collision with root package name */
    protected static final i f86772x = new i(134695760);

    /* renamed from: y, reason: collision with root package name */
    protected static final i f86773y = new i(33639248);

    /* renamed from: z, reason: collision with root package name */
    protected static final i f86774z = new i(101010256);
    private static final i A = new i(8448);

    public j(OutputStream outputStream) {
        super(outputStream);
        this.f86776c = "";
        this.f86777d = -1;
        this.f86778e = false;
        this.f86779f = 8;
        this.f86780g = new Vector();
        this.f86781h = new CRC32();
        this.f86782i = 0L;
        this.f86783j = 0L;
        this.f86784k = 0L;
        this.f86785l = new i(0L);
        this.f86786m = new i(0L);
        this.f86787n = new Hashtable();
        this.f86788o = null;
        this.f86789p = new Deflater(-1, true);
        this.f86790q = new byte[512];
        this.f86791r = null;
    }

    protected static long a(int i4) {
        return i4 < 0 ? i4 + 4294967296L : i4;
    }

    protected static i n(Date date) {
        int year = date.getYear();
        int i4 = year + 1900;
        int month = date.getMonth() + 1;
        if (i4 < 1980) {
            return A;
        }
        long seconds = (date.getSeconds() >> 1) | ((year - 80) << 25) | (month << 21) | (date.getDate() << 16) | (date.getHours() << 11) | (date.getMinutes() << 5);
        return new i(new byte[]{(byte) (255 & seconds), (byte) ((65280 & seconds) >> 8), (byte) ((16711680 & seconds) >> 16), (byte) ((seconds & 4278190080L) >> 24)}, 0);
    }

    public void b() throws IOException {
        if (this.f86775b == null) {
            return;
        }
        long value = this.f86781h.getValue();
        this.f86781h.reset();
        if (this.f86775b.getMethod() == 8) {
            this.f86789p.finish();
            while (!this.f86789p.finished()) {
                c();
            }
            this.f86775b.setSize(a(this.f86789p.getTotalIn()));
            this.f86775b.p(a(this.f86789p.getTotalOut()));
            this.f86775b.setCrc(value);
            this.f86789p.reset();
            this.f86782i = this.f86775b.getCompressedSize() + this.f86782i;
        } else if (this.f86791r != null) {
            long j4 = this.f86782i - this.f86783j;
            this.f86775b.setSize(j4);
            this.f86775b.p(j4);
            this.f86775b.setCrc(value);
        } else {
            if (this.f86775b.getCrc() != value) {
                throw new ZipException("bad CRC checksum for entry " + this.f86775b.getName() + ": " + Long.toHexString(this.f86775b.getCrc()) + " instead of " + Long.toHexString(value));
            }
            if (this.f86775b.getSize() != this.f86782i - this.f86783j) {
                throw new ZipException("bad size for entry " + this.f86775b.getName() + ": " + this.f86775b.getSize() + " instead of " + (this.f86782i - this.f86783j));
            }
        }
        RandomAccessFile randomAccessFile = this.f86791r;
        if (randomAccessFile != null) {
            long filePointer = randomAccessFile.getFilePointer();
            this.f86791r.seek(this.f86784k);
            u(new i(this.f86775b.getCrc()).b());
            u(new i(this.f86775b.getCompressedSize()).b());
            u(new i(this.f86775b.getSize()).b());
            this.f86791r.seek(filePointer);
        }
        s(this.f86775b);
        this.f86775b = null;
    }

    protected final void c() throws IOException {
        Deflater deflater = this.f86789p;
        byte[] bArr = this.f86790q;
        int deflate = deflater.deflate(bArr, 0, bArr.length);
        if (deflate > 0) {
            x(this.f86790q, 0, deflate);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        d();
        RandomAccessFile randomAccessFile = this.f86791r;
        if (randomAccessFile != null) {
            randomAccessFile.close();
        }
        OutputStream outputStream = ((FilterOutputStream) this).out;
        if (outputStream != null) {
            outputStream.close();
        }
    }

    public void d() throws IOException {
        b();
        this.f86785l = new i(this.f86782i);
        for (int i4 = 0; i4 < this.f86780g.size(); i4++) {
            q((f) this.f86780g.elementAt(i4));
        }
        this.f86786m = new i(this.f86782i - this.f86785l.c());
        o();
        this.f86787n.clear();
        this.f86780g.removeAllElements();
    }

    protected byte[] e(String str) throws ZipException {
        String str2 = this.f86788o;
        if (str2 == null) {
            return str.getBytes();
        }
        try {
            return str.getBytes(str2);
        } catch (UnsupportedEncodingException e4) {
            throw new ZipException(e4.getMessage());
        }
    }

    public String f() {
        return this.f86788o;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        OutputStream outputStream = ((FilterOutputStream) this).out;
        if (outputStream != null) {
            outputStream.flush();
        }
    }

    public boolean g() {
        return this.f86791r != null;
    }

    public void h(f fVar) throws IOException {
        b();
        this.f86775b = fVar;
        this.f86780g.addElement(fVar);
        if (this.f86775b.getMethod() == -1) {
            this.f86775b.setMethod(this.f86779f);
        }
        if (this.f86775b.getTime() == -1) {
            this.f86775b.setTime(System.currentTimeMillis());
        }
        if (this.f86775b.getMethod() == 0 && this.f86791r == null) {
            if (this.f86775b.getSize() == -1) {
                throw new ZipException("uncompressed size is required for STORED method when not writing to a file");
            }
            if (this.f86775b.getCrc() == -1) {
                throw new ZipException("crc checksum is required for STORED method when not writing to a file");
            }
            f fVar2 = this.f86775b;
            fVar2.p(fVar2.getSize());
        }
        if (this.f86775b.getMethod() == 8 && this.f86778e) {
            this.f86789p.setLevel(this.f86777d);
            this.f86778e = false;
        }
        t(this.f86775b);
    }

    public void i(String str) {
        this.f86776c = str;
    }

    public void k(String str) {
        this.f86788o = str;
    }

    public void l(int i4) {
        this.f86778e = this.f86777d != i4;
        this.f86777d = i4;
    }

    public void m(int i4) {
        this.f86779f = i4;
    }

    protected void o() throws IOException {
        u(f86774z.b());
        byte[] bArr = f86767s;
        u(bArr);
        u(bArr);
        byte[] b5 = new k(this.f86780g.size()).b();
        u(b5);
        u(b5);
        u(this.f86786m.b());
        u(this.f86785l.b());
        byte[] e4 = e(this.f86776c);
        u(new k(e4.length).b());
        u(e4);
    }

    protected void q(f fVar) throws IOException {
        u(f86773y.b());
        this.f86782i += 4;
        u(new k((fVar.k() << 8) | 20).b());
        this.f86782i += 2;
        if (fVar.getMethod() == 8 && this.f86791r == null) {
            u(new k(20).b());
            u(new k(8).b());
        } else {
            u(new k(10).b());
            u(f86767s);
        }
        this.f86782i += 4;
        u(new k(fVar.getMethod()).b());
        this.f86782i += 2;
        u(n(new Date(fVar.getTime())).b());
        this.f86782i += 4;
        u(new i(fVar.getCrc()).b());
        u(new i(fVar.getCompressedSize()).b());
        u(new i(fVar.getSize()).b());
        this.f86782i += 12;
        byte[] e4 = e(fVar.getName());
        u(new k(e4.length).b());
        this.f86782i += 2;
        byte[] d5 = fVar.d();
        u(new k(d5.length).b());
        this.f86782i += 2;
        String comment = fVar.getComment();
        if (comment == null) {
            comment = "";
        }
        byte[] e5 = e(comment);
        u(new k(e5.length).b());
        this.f86782i += 2;
        u(f86767s);
        this.f86782i += 2;
        u(new k(fVar.g()).b());
        this.f86782i += 2;
        u(new i(fVar.e()).b());
        this.f86782i += 4;
        u(((i) this.f86787n.get(fVar)).b());
        this.f86782i += 4;
        u(e4);
        this.f86782i += e4.length;
        u(d5);
        this.f86782i += d5.length;
        u(e5);
        this.f86782i += e5.length;
    }

    protected void s(f fVar) throws IOException {
        if (fVar.getMethod() == 8 && this.f86791r == null) {
            u(f86772x.b());
            u(new i(this.f86775b.getCrc()).b());
            u(new i(this.f86775b.getCompressedSize()).b());
            u(new i(this.f86775b.getSize()).b());
            this.f86782i += 16;
        }
    }

    protected void t(f fVar) throws IOException {
        this.f86787n.put(fVar, new i(this.f86782i));
        u(f86771w.b());
        this.f86782i += 4;
        if (fVar.getMethod() == 8 && this.f86791r == null) {
            u(new k(20).b());
            u(new k(8).b());
        } else {
            u(new k(10).b());
            u(f86767s);
        }
        this.f86782i += 4;
        u(new k(fVar.getMethod()).b());
        this.f86782i += 2;
        u(n(new Date(fVar.getTime())).b());
        long j4 = this.f86782i + 4;
        this.f86782i = j4;
        this.f86784k = j4;
        if (fVar.getMethod() == 8 || this.f86791r != null) {
            byte[] bArr = f86768t;
            u(bArr);
            u(bArr);
            u(bArr);
        } else {
            u(new i(fVar.getCrc()).b());
            u(new i(fVar.getSize()).b());
            u(new i(fVar.getSize()).b());
        }
        this.f86782i += 12;
        byte[] e4 = e(fVar.getName());
        u(new k(e4.length).b());
        this.f86782i += 2;
        byte[] i4 = fVar.i();
        u(new k(i4.length).b());
        this.f86782i += 2;
        u(e4);
        this.f86782i += e4.length;
        u(i4);
        long length = this.f86782i + i4.length;
        this.f86782i = length;
        this.f86783j = length;
    }

    protected final void u(byte[] bArr) throws IOException {
        x(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i4, int i5) throws IOException {
        if (this.f86775b.getMethod() != 8) {
            x(bArr, i4, i5);
            this.f86782i += i5;
        } else if (i5 > 0 && !this.f86789p.finished()) {
            this.f86789p.setInput(bArr, i4, i5);
            while (!this.f86789p.needsInput()) {
                c();
            }
        }
        this.f86781h.update(bArr, i4, i5);
    }

    protected final void x(byte[] bArr, int i4, int i5) throws IOException {
        RandomAccessFile randomAccessFile = this.f86791r;
        if (randomAccessFile != null) {
            randomAccessFile.write(bArr, i4, i5);
        } else {
            ((FilterOutputStream) this).out.write(bArr, i4, i5);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i4) throws IOException {
        write(new byte[]{(byte) (i4 & 255)}, 0, 1);
    }

    public j(File file) throws IOException {
        super(null);
        this.f86776c = "";
        this.f86777d = -1;
        this.f86778e = false;
        this.f86779f = 8;
        this.f86780g = new Vector();
        this.f86781h = new CRC32();
        this.f86782i = 0L;
        this.f86783j = 0L;
        this.f86784k = 0L;
        this.f86785l = new i(0L);
        this.f86786m = new i(0L);
        this.f86787n = new Hashtable();
        this.f86788o = null;
        this.f86789p = new Deflater(-1, true);
        this.f86790q = new byte[512];
        this.f86791r = null;
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            this.f86791r = randomAccessFile;
            randomAccessFile.setLength(0L);
        } catch (IOException unused) {
            RandomAccessFile randomAccessFile2 = this.f86791r;
            if (randomAccessFile2 != null) {
                try {
                    randomAccessFile2.close();
                } catch (IOException unused2) {
                }
                this.f86791r = null;
            }
            ((FilterOutputStream) this).out = new FileOutputStream(file);
        }
    }
}
