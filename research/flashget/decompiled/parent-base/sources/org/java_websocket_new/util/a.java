package org.java_websocket_new.util;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.util.zip.GZIPOutputStream;
import okio.r0;

/* compiled from: Base64.java */
/* loaded from: classes6.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f87046a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f87047b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f87048c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final int f87049d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f87050e = 4;

    /* renamed from: f, reason: collision with root package name */
    public static final int f87051f = 8;

    /* renamed from: g, reason: collision with root package name */
    public static final int f87052g = 16;

    /* renamed from: h, reason: collision with root package name */
    public static final int f87053h = 32;

    /* renamed from: i, reason: collision with root package name */
    private static final int f87054i = 76;

    /* renamed from: j, reason: collision with root package name */
    private static final byte f87055j = 61;

    /* renamed from: k, reason: collision with root package name */
    private static final byte f87056k = 10;

    /* renamed from: n, reason: collision with root package name */
    private static final byte f87059n = -1;

    /* renamed from: u, reason: collision with root package name */
    static final /* synthetic */ boolean f87066u = false;

    /* renamed from: l, reason: collision with root package name */
    private static final String f87057l = "US-ASCII";

    /* renamed from: o, reason: collision with root package name */
    private static final byte[] f87060o = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* renamed from: m, reason: collision with root package name */
    private static final byte f87058m = -5;

    /* renamed from: p, reason: collision with root package name */
    private static final byte[] f87061p = {-9, -9, -9, -9, -9, -9, -9, -9, -9, f87058m, f87058m, -9, -9, f87058m, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, f87058m, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, r0.f85265a, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, com.google.common.base.c.f54871q, com.google.common.base.c.f54872r, 17, com.google.common.base.c.f54875u, 19, com.google.common.base.c.f54878x, com.google.common.base.c.f54879y, com.google.common.base.c.f54880z, com.google.common.base.c.A, com.google.common.base.c.B, com.google.common.base.c.C, -9, -9, -9, -9, -9, -9, 26, 27, com.google.common.base.c.F, com.google.common.base.c.G, com.google.common.base.c.H, com.google.common.base.c.I, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    /* renamed from: q, reason: collision with root package name */
    private static final byte[] f87062q = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

    /* renamed from: r, reason: collision with root package name */
    private static final byte[] f87063r = {-9, -9, -9, -9, -9, -9, -9, -9, -9, f87058m, f87058m, -9, -9, f87058m, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, f87058m, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, com.google.common.base.c.f54871q, com.google.common.base.c.f54872r, 17, com.google.common.base.c.f54875u, 19, com.google.common.base.c.f54878x, com.google.common.base.c.f54879y, com.google.common.base.c.f54880z, com.google.common.base.c.A, com.google.common.base.c.B, com.google.common.base.c.C, -9, -9, -9, -9, r0.f85265a, -9, 26, 27, com.google.common.base.c.F, com.google.common.base.c.G, com.google.common.base.c.H, com.google.common.base.c.I, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    /* renamed from: s, reason: collision with root package name */
    private static final byte[] f87064s = {45, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122};

    /* renamed from: t, reason: collision with root package name */
    private static final byte[] f87065t = {-9, -9, -9, -9, -9, -9, -9, -9, -9, f87058m, f87058m, -9, -9, f87058m, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, f87058m, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 0, -9, -9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -9, -9, -9, -1, -9, -9, -9, 11, 12, 13, 14, com.google.common.base.c.f54871q, com.google.common.base.c.f54872r, 17, com.google.common.base.c.f54875u, 19, com.google.common.base.c.f54878x, com.google.common.base.c.f54879y, com.google.common.base.c.f54880z, com.google.common.base.c.A, com.google.common.base.c.B, com.google.common.base.c.C, 26, 27, com.google.common.base.c.F, com.google.common.base.c.G, com.google.common.base.c.H, com.google.common.base.c.I, 32, 33, 34, 35, 36, -9, -9, -9, -9, 37, -9, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, r0.f85265a, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    /* compiled from: Base64.java */
    /* renamed from: org.java_websocket_new.util.a$a, reason: collision with other inner class name */
    class C1348a extends ObjectInputStream {

        /* renamed from: b, reason: collision with root package name */
        private final /* synthetic */ ClassLoader f87067b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1348a(InputStream inputStream, ClassLoader classLoader) throws IOException {
            super(inputStream);
            this.f87067b = classLoader;
        }

        @Override // java.io.ObjectInputStream
        public Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws IOException, ClassNotFoundException {
            Class<?> cls = Class.forName(objectStreamClass.getName(), false, this.f87067b);
            return cls == null ? super.resolveClass(objectStreamClass) : cls;
        }
    }

    /* compiled from: Base64.java */
    public static class b extends FilterInputStream {

        /* renamed from: b, reason: collision with root package name */
        private boolean f87068b;

        /* renamed from: c, reason: collision with root package name */
        private int f87069c;

        /* renamed from: d, reason: collision with root package name */
        private byte[] f87070d;

        /* renamed from: e, reason: collision with root package name */
        private int f87071e;

        /* renamed from: f, reason: collision with root package name */
        private int f87072f;

        /* renamed from: g, reason: collision with root package name */
        private int f87073g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f87074h;

        /* renamed from: i, reason: collision with root package name */
        private int f87075i;

        /* renamed from: j, reason: collision with root package name */
        private byte[] f87076j;

        public b(InputStream inputStream) {
            this(inputStream, 0);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            int read;
            if (this.f87069c < 0) {
                if (this.f87068b) {
                    byte[] bArr = new byte[3];
                    int i4 = 0;
                    for (int i5 = 0; i5 < 3; i5++) {
                        int read2 = ((FilterInputStream) this).in.read();
                        if (read2 < 0) {
                            break;
                        }
                        bArr[i5] = (byte) read2;
                        i4++;
                    }
                    if (i4 <= 0) {
                        return -1;
                    }
                    a.q(bArr, 0, i4, this.f87070d, 0, this.f87075i);
                    this.f87069c = 0;
                    this.f87072f = 4;
                } else {
                    byte[] bArr2 = new byte[4];
                    int i6 = 0;
                    while (i6 < 4) {
                        do {
                            read = ((FilterInputStream) this).in.read();
                            if (read < 0) {
                                break;
                            }
                        } while (this.f87076j[read & 127] <= -5);
                        if (read < 0) {
                            break;
                        }
                        bArr2[i6] = (byte) read;
                        i6++;
                    }
                    if (i6 != 4) {
                        if (i6 == 0) {
                            return -1;
                        }
                        throw new IOException("Improperly padded Base64 input.");
                    }
                    this.f87072f = a.i(bArr2, 0, this.f87070d, 0, this.f87075i);
                    this.f87069c = 0;
                }
            }
            int i7 = this.f87069c;
            if (i7 < 0) {
                throw new IOException("Error in Base64 code reading stream.");
            }
            if (i7 >= this.f87072f) {
                return -1;
            }
            if (this.f87068b && this.f87074h && this.f87073g >= 76) {
                this.f87073g = 0;
                return 10;
            }
            this.f87073g++;
            byte[] bArr3 = this.f87070d;
            int i10 = i7 + 1;
            this.f87069c = i10;
            byte b5 = bArr3[i7];
            if (i10 >= this.f87071e) {
                this.f87069c = -1;
            }
            return b5 & 255;
        }

        public b(InputStream inputStream, int i4) {
            super(inputStream);
            this.f87075i = i4;
            this.f87074h = (i4 & 8) > 0;
            boolean z4 = (i4 & 1) > 0;
            this.f87068b = z4;
            int i5 = z4 ? 4 : 3;
            this.f87071e = i5;
            this.f87070d = new byte[i5];
            this.f87069c = -1;
            this.f87073g = 0;
            this.f87076j = a.E(i4);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i4, int i5) throws IOException {
            int i6 = 0;
            while (true) {
                if (i6 >= i5) {
                    break;
                }
                int read = read();
                if (read >= 0) {
                    bArr[i4 + i6] = (byte) read;
                    i6++;
                } else if (i6 == 0) {
                    return -1;
                }
            }
            return i6;
        }
    }

    /* compiled from: Base64.java */
    public static class c extends FilterOutputStream {

        /* renamed from: b, reason: collision with root package name */
        private boolean f87077b;

        /* renamed from: c, reason: collision with root package name */
        private int f87078c;

        /* renamed from: d, reason: collision with root package name */
        private byte[] f87079d;

        /* renamed from: e, reason: collision with root package name */
        private int f87080e;

        /* renamed from: f, reason: collision with root package name */
        private int f87081f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f87082g;

        /* renamed from: h, reason: collision with root package name */
        private byte[] f87083h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f87084i;

        /* renamed from: j, reason: collision with root package name */
        private int f87085j;

        /* renamed from: k, reason: collision with root package name */
        private byte[] f87086k;

        public c(OutputStream outputStream) {
            this(outputStream, 1);
        }

        public void a() throws IOException {
            int i4 = this.f87078c;
            if (i4 > 0) {
                if (!this.f87077b) {
                    throw new IOException("Base64 input not properly padded.");
                }
                ((FilterOutputStream) this).out.write(a.d(this.f87083h, this.f87079d, i4, this.f87085j));
                this.f87078c = 0;
            }
        }

        public void b() {
            this.f87084i = false;
        }

        public void c() throws IOException {
            a();
            this.f87084i = true;
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            a();
            super.close();
            this.f87079d = null;
            ((FilterOutputStream) this).out = null;
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(int i4) throws IOException {
            if (this.f87084i) {
                ((FilterOutputStream) this).out.write(i4);
                return;
            }
            if (!this.f87077b) {
                byte b5 = this.f87086k[i4 & 127];
                if (b5 <= -5) {
                    if (b5 != -5) {
                        throw new IOException("Invalid character in Base64 data.");
                    }
                    return;
                }
                byte[] bArr = this.f87079d;
                int i5 = this.f87078c;
                int i6 = i5 + 1;
                this.f87078c = i6;
                bArr[i5] = (byte) i4;
                if (i6 >= this.f87080e) {
                    ((FilterOutputStream) this).out.write(this.f87083h, 0, a.i(bArr, 0, this.f87083h, 0, this.f87085j));
                    this.f87078c = 0;
                    return;
                }
                return;
            }
            byte[] bArr2 = this.f87079d;
            int i7 = this.f87078c;
            int i10 = i7 + 1;
            this.f87078c = i10;
            bArr2[i7] = (byte) i4;
            int i11 = this.f87080e;
            if (i10 >= i11) {
                ((FilterOutputStream) this).out.write(a.d(this.f87083h, bArr2, i11, this.f87085j));
                int i12 = this.f87081f + 4;
                this.f87081f = i12;
                if (this.f87082g && i12 >= 76) {
                    ((FilterOutputStream) this).out.write(10);
                    this.f87081f = 0;
                }
                this.f87078c = 0;
            }
        }

        public c(OutputStream outputStream, int i4) {
            super(outputStream);
            this.f87082g = (i4 & 8) != 0;
            boolean z4 = (i4 & 1) != 0;
            this.f87077b = z4;
            int i5 = z4 ? 3 : 4;
            this.f87080e = i5;
            this.f87079d = new byte[i5];
            this.f87078c = 0;
            this.f87081f = 0;
            this.f87084i = false;
            this.f87083h = new byte[4];
            this.f87085j = i4;
            this.f87086k = a.E(i4);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i4, int i5) throws IOException {
            if (this.f87084i) {
                ((FilterOutputStream) this).out.write(bArr, i4, i5);
                return;
            }
            for (int i6 = 0; i6 < i5; i6++) {
                write(bArr[i4 + i6]);
            }
        }
    }

    private a() {
    }

    public static String A(Serializable serializable) throws IOException {
        return B(serializable, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String B(Serializable serializable, int i4) throws IOException {
        OutputStream outputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        c cVar;
        ObjectOutputStream objectOutputStream;
        if (serializable == null) {
            throw new NullPointerException("Cannot serialize a null object.");
        }
        ObjectOutputStream objectOutputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                cVar = new c(byteArrayOutputStream, i4 | 1);
                try {
                    if ((i4 & 2) != 0) {
                        outputStream = new GZIPOutputStream(cVar);
                        try {
                            objectOutputStream2 = new ObjectOutputStream(outputStream);
                            outputStream = outputStream;
                        } catch (IOException e4) {
                            e = e4;
                            objectOutputStream = objectOutputStream2;
                            objectOutputStream2 = byteArrayOutputStream;
                            outputStream = outputStream;
                            try {
                                throw e;
                            } catch (Throwable th) {
                                th = th;
                                ObjectOutputStream objectOutputStream3 = objectOutputStream;
                                byteArrayOutputStream = objectOutputStream2;
                                objectOutputStream2 = objectOutputStream3;
                                try {
                                    objectOutputStream2.close();
                                } catch (Exception unused) {
                                }
                                try {
                                    outputStream.close();
                                } catch (Exception unused2) {
                                }
                                try {
                                    cVar.close();
                                } catch (Exception unused3) {
                                }
                                try {
                                    byteArrayOutputStream.close();
                                    throw th;
                                } catch (Exception unused4) {
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            objectOutputStream2.close();
                            outputStream.close();
                            cVar.close();
                            byteArrayOutputStream.close();
                            throw th;
                        }
                    } else {
                        objectOutputStream2 = new ObjectOutputStream(cVar);
                        outputStream = null;
                    }
                    objectOutputStream2.writeObject(serializable);
                    try {
                        objectOutputStream2.close();
                    } catch (Exception unused5) {
                    }
                    try {
                        outputStream.close();
                    } catch (Exception unused6) {
                    }
                    try {
                        cVar.close();
                    } catch (Exception unused7) {
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (Exception unused8) {
                    }
                    try {
                        return new String(byteArrayOutputStream.toByteArray(), "US-ASCII");
                    } catch (UnsupportedEncodingException unused9) {
                        return new String(byteArrayOutputStream.toByteArray());
                    }
                } catch (IOException e5) {
                    e = e5;
                    ObjectOutputStream objectOutputStream4 = objectOutputStream2;
                    objectOutputStream2 = byteArrayOutputStream;
                    objectOutputStream = objectOutputStream4;
                    outputStream = objectOutputStream4;
                } catch (Throwable th3) {
                    th = th3;
                    outputStream = objectOutputStream2;
                }
            } catch (IOException e6) {
                e = e6;
                outputStream = null;
                cVar = null;
                objectOutputStream2 = byteArrayOutputStream;
                objectOutputStream = null;
            } catch (Throwable th4) {
                th = th4;
                outputStream = null;
                cVar = null;
            }
        } catch (IOException e7) {
            e = e7;
            outputStream = null;
            objectOutputStream = null;
            cVar = null;
        } catch (Throwable th5) {
            th = th5;
            outputStream = null;
            byteArrayOutputStream = 0;
            cVar = null;
        }
    }

    public static void C(byte[] bArr, String str) throws IOException {
        c cVar;
        if (bArr == null) {
            throw new NullPointerException("Data to encode was null.");
        }
        c cVar2 = null;
        try {
            try {
                cVar = new c(new FileOutputStream(str), 1);
            } catch (Throwable th) {
                th = th;
            }
            try {
                cVar.write(bArr);
                try {
                    cVar.close();
                } catch (Exception unused) {
                }
            } catch (IOException e4) {
            } catch (Throwable th2) {
                th = th2;
                cVar2 = cVar;
                try {
                    cVar2.close();
                } catch (Exception unused2) {
                }
                throw th;
            }
        } catch (IOException e5) {
            throw e5;
        }
    }

    private static final byte[] D(int i4) {
        return (i4 & 16) == 16 ? f87062q : (i4 & 32) == 32 ? f87064s : f87060o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final byte[] E(int i4) {
        return (i4 & 16) == 16 ? f87063r : (i4 & 32) == 32 ? f87065t : f87061p;
    }

    static byte[] d(byte[] bArr, byte[] bArr2, int i4, int i5) {
        q(bArr2, 0, i4, bArr, 0, i5);
        return bArr;
    }

    public static byte[] e(String str) throws IOException {
        return f(str, 0);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:40:0x0055
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.io.ByteArrayInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.io.ByteArrayInputStream] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.io.ByteArrayInputStream] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public static byte[] f(java.lang.String r5, int r6) throws java.io.IOException {
        /*
            if (r5 == 0) goto L8e
            java.lang.String r0 = "US-ASCII"
            byte[] r5 = r5.getBytes(r0)     // Catch: java.io.UnsupportedEncodingException -> L9
            goto Ld
        L9:
            byte[] r5 = r5.getBytes()
        Ld:
            int r0 = r5.length
            r1 = 0
            byte[] r5 = h(r5, r1, r0, r6)
            r0 = 4
            r6 = r6 & r0
            r2 = 1
            if (r6 == 0) goto L1a
            r6 = r2
            goto L1b
        L1a:
            r6 = r1
        L1b:
            if (r5 == 0) goto L8d
            int r3 = r5.length
            if (r3 < r0) goto L8d
            if (r6 != 0) goto L8d
            r6 = r5[r1]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r0 = r5[r2]
            int r0 = r0 << 8
            r2 = 65280(0xff00, float:9.1477E-41)
            r0 = r0 & r2
            r6 = r6 | r0
            r0 = 35615(0x8b1f, float:4.9907E-41)
            if (r0 != r6) goto L8d
            r6 = 2048(0x800, float:2.87E-42)
            byte[] r6 = new byte[r6]
            r0 = 0
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L74 java.io.IOException -> L78
            r2.<init>()     // Catch: java.lang.Throwable -> L74 java.io.IOException -> L78
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L70
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L70
            java.util.zip.GZIPInputStream r4 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L69
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L69
        L48:
            int r0 = r4.read(r6)     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L5f
            if (r0 >= 0) goto L62
            byte[] r5 = r2.toByteArray()     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L5f
            r2.close()     // Catch: java.lang.Exception -> L55
        L55:
            r4.close()     // Catch: java.lang.Exception -> L58
        L58:
            r3.close()     // Catch: java.lang.Exception -> L8d
            goto L8d
        L5c:
            r5 = move-exception
        L5d:
            r0 = r2
            goto L83
        L5f:
            r6 = move-exception
        L60:
            r0 = r2
            goto L7b
        L62:
            r2.write(r6, r1, r0)     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L5f
            goto L48
        L66:
            r5 = move-exception
            r4 = r0
            goto L5d
        L69:
            r6 = move-exception
            r4 = r0
            goto L60
        L6c:
            r5 = move-exception
            r3 = r0
            r4 = r3
            goto L5d
        L70:
            r6 = move-exception
            r3 = r0
            r4 = r3
            goto L60
        L74:
            r5 = move-exception
            r3 = r0
            r4 = r3
            goto L83
        L78:
            r6 = move-exception
            r3 = r0
            r4 = r3
        L7b:
            r6.printStackTrace()     // Catch: java.lang.Throwable -> L82
            r0.close()     // Catch: java.lang.Exception -> L55
            goto L55
        L82:
            r5 = move-exception
        L83:
            r0.close()     // Catch: java.lang.Exception -> L86
        L86:
            r4.close()     // Catch: java.lang.Exception -> L89
        L89:
            r3.close()     // Catch: java.lang.Exception -> L8c
        L8c:
            throw r5
        L8d:
            return r5
        L8e:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r6 = "Input string was null."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.java_websocket_new.util.a.f(java.lang.String, int):byte[]");
    }

    public static byte[] g(byte[] bArr) throws IOException {
        return h(bArr, 0, bArr.length, 0);
    }

    public static byte[] h(byte[] bArr, int i4, int i5, int i6) throws IOException {
        int i7;
        if (bArr == null) {
            throw new NullPointerException("Cannot decode null source array.");
        }
        if (i4 < 0 || (i7 = i4 + i5) > bArr.length) {
            throw new IllegalArgumentException(String.format("Source array with length %d cannot have offset of %d and process %d bytes.", Integer.valueOf(bArr.length), Integer.valueOf(i4), Integer.valueOf(i5)));
        }
        if (i5 == 0) {
            return new byte[0];
        }
        if (i5 < 4) {
            throw new IllegalArgumentException(android.support.v4.media.a.a("Base64-encoded string must have at least four characters, but length specified was ", i5));
        }
        byte[] E = E(i6);
        byte[] bArr2 = new byte[(i5 * 3) / 4];
        byte[] bArr3 = new byte[4];
        int i10 = 0;
        int i11 = 0;
        while (i4 < i7) {
            byte b5 = bArr[i4];
            byte b6 = E[b5 & 255];
            if (b6 < -5) {
                throw new IOException(String.format("Bad Base64 input character decimal %d in array position %d", Integer.valueOf(bArr[i4] & 255), Integer.valueOf(i4)));
            }
            if (b6 >= -1) {
                int i12 = i10 + 1;
                bArr3[i10] = b5;
                if (i12 > 3) {
                    i11 += i(bArr3, 0, bArr2, i11, i6);
                    if (bArr[i4] == 61) {
                        break;
                    }
                    i10 = 0;
                } else {
                    i10 = i12;
                }
            }
            i4++;
        }
        byte[] bArr4 = new byte[i11];
        System.arraycopy(bArr2, 0, bArr4, 0, i11);
        return bArr4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int i(byte[] bArr, int i4, byte[] bArr2, int i5, int i6) {
        int i7;
        int i10;
        if (bArr == null) {
            throw new NullPointerException("Source array was null.");
        }
        if (bArr2 == null) {
            throw new NullPointerException("Destination array was null.");
        }
        if (i4 < 0 || (i7 = i4 + 3) >= bArr.length) {
            throw new IllegalArgumentException(String.format("Source array with length %d cannot have offset of %d and still process four bytes.", Integer.valueOf(bArr.length), Integer.valueOf(i4)));
        }
        if (i5 < 0 || (i10 = i5 + 2) >= bArr2.length) {
            throw new IllegalArgumentException(String.format("Destination array with length %d cannot have offset of %d and still store three bytes.", Integer.valueOf(bArr2.length), Integer.valueOf(i5)));
        }
        byte[] E = E(i6);
        byte b5 = bArr[i4 + 2];
        if (b5 == 61) {
            bArr2[i5] = (byte) ((((E[bArr[i4 + 1]] & 255) << 12) | ((E[bArr[i4]] & 255) << 18)) >>> 16);
            return 1;
        }
        byte b6 = bArr[i7];
        if (b6 == 61) {
            int i11 = ((E[bArr[i4 + 1]] & 255) << 12) | ((E[bArr[i4]] & 255) << 18) | ((E[b5] & 255) << 6);
            bArr2[i5] = (byte) (i11 >>> 16);
            bArr2[i5 + 1] = (byte) (i11 >>> 8);
            return 2;
        }
        int i12 = ((E[bArr[i4 + 1]] & 255) << 12) | ((E[bArr[i4]] & 255) << 18) | ((E[b5] & 255) << 6) | (E[b6] & 255);
        bArr2[i5] = (byte) (i12 >> 16);
        bArr2[i5 + 1] = (byte) (i12 >> 8);
        bArr2[i10] = (byte) i12;
        return 3;
    }

    public static void j(String str, String str2) throws IOException {
        BufferedOutputStream bufferedOutputStream;
        byte[] k4 = k(str);
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(str2));
            } catch (Throwable th) {
                th = th;
            }
            try {
                bufferedOutputStream.write(k4);
                try {
                    bufferedOutputStream.close();
                } catch (Exception unused) {
                }
            } catch (IOException e4) {
            } catch (Throwable th2) {
                th = th2;
                bufferedOutputStream2 = bufferedOutputStream;
                try {
                    bufferedOutputStream2.close();
                } catch (Exception unused2) {
                }
                throw th;
            }
        } catch (IOException e5) {
            throw e5;
        }
    }

    public static byte[] k(String str) throws IOException {
        b bVar = null;
        try {
            try {
                File file = new File(str);
                if (file.length() > 2147483647L) {
                    throw new IOException("File is too big for this convenience method (" + file.length() + " bytes).");
                }
                byte[] bArr = new byte[(int) file.length()];
                b bVar2 = new b(new BufferedInputStream(new FileInputStream(file)), 0);
                int i4 = 0;
                while (true) {
                    try {
                        int read = bVar2.read(bArr, i4, 4096);
                        if (read < 0) {
                            break;
                        }
                        i4 += read;
                    } catch (IOException e4) {
                        throw e4;
                    } catch (Throwable th) {
                        th = th;
                        bVar = bVar2;
                        try {
                            bVar.close();
                        } catch (Exception unused) {
                        }
                        throw th;
                    }
                }
                byte[] bArr2 = new byte[i4];
                System.arraycopy(bArr, 0, bArr2, 0, i4);
                try {
                    bVar2.close();
                } catch (Exception unused2) {
                }
                return bArr2;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e5) {
            throw e5;
        }
    }

    public static void l(String str, String str2) throws IOException {
        c cVar;
        c cVar2 = null;
        try {
            try {
                cVar = new c(new FileOutputStream(str2), 0);
            } catch (IOException e4) {
                throw e4;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            cVar.write(str.getBytes("US-ASCII"));
            try {
                cVar.close();
            } catch (Exception unused) {
            }
        } catch (IOException e5) {
        } catch (Throwable th2) {
            th = th2;
            cVar2 = cVar;
            try {
                cVar2.close();
            } catch (Exception unused2) {
            }
            throw th;
        }
    }

    public static Object m(String str) throws IOException, ClassNotFoundException {
        return n(str, 0, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.io.ObjectInputStream] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v8 */
    public static Object n(String str, int i4, ClassLoader classLoader) throws IOException, ClassNotFoundException {
        ?? r32;
        ByteArrayInputStream byteArrayInputStream;
        byte[] f4 = f(str, i4);
        ByteArrayInputStream byteArrayInputStream2 = null;
        r2 = null;
        r2 = null;
        ObjectInputStream objectInputStream = null;
        byteArrayInputStream2 = null;
        try {
            try {
                byteArrayInputStream = new ByteArrayInputStream(f4);
            } catch (Throwable th) {
                th = th;
                r32 = classLoader;
            }
        } catch (IOException e4) {
            throw e4;
        } catch (ClassNotFoundException e5) {
            throw e5;
        } catch (Throwable th2) {
            th = th2;
            r32 = 0;
        }
        try {
            objectInputStream = classLoader == null ? new ObjectInputStream(byteArrayInputStream) : new C1348a(byteArrayInputStream, classLoader);
            Object readObject = objectInputStream.readObject();
            try {
                byteArrayInputStream.close();
            } catch (Exception unused) {
            }
            try {
                objectInputStream.close();
            } catch (Exception unused2) {
            }
            return readObject;
        } catch (IOException e6) {
            throw e6;
        } catch (ClassNotFoundException e7) {
            throw e7;
        } catch (Throwable th3) {
            th = th3;
            r32 = objectInputStream;
            byteArrayInputStream2 = byteArrayInputStream;
            try {
                byteArrayInputStream2.close();
            } catch (Exception unused3) {
            }
            try {
                r32.close();
                throw th;
            } catch (Exception unused4) {
                throw th;
            }
        }
    }

    public static void o(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        byte[] bArr = new byte[3];
        byte[] bArr2 = new byte[4];
        while (byteBuffer.hasRemaining()) {
            int min = Math.min(3, byteBuffer.remaining());
            byteBuffer.get(bArr, 0, min);
            r(bArr2, bArr, min, 0);
            byteBuffer2.put(bArr2);
        }
    }

    public static void p(ByteBuffer byteBuffer, CharBuffer charBuffer) {
        byte[] bArr = new byte[3];
        byte[] bArr2 = new byte[4];
        while (byteBuffer.hasRemaining()) {
            int min = Math.min(3, byteBuffer.remaining());
            byteBuffer.get(bArr, 0, min);
            r(bArr2, bArr, min, 0);
            for (int i4 = 0; i4 < 4; i4++) {
                charBuffer.put((char) (bArr2[i4] & 255));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] q(byte[] bArr, int i4, int i5, byte[] bArr2, int i6, int i7) {
        byte[] D = D(i7);
        int i10 = (i5 > 0 ? (bArr[i4] << com.google.common.base.c.B) >>> 8 : 0) | (i5 > 1 ? (bArr[i4 + 1] << com.google.common.base.c.B) >>> 16 : 0) | (i5 > 2 ? (bArr[i4 + 2] << com.google.common.base.c.B) >>> 24 : 0);
        if (i5 == 1) {
            bArr2[i6] = D[i10 >>> 18];
            bArr2[i6 + 1] = D[(i10 >>> 12) & 63];
            bArr2[i6 + 2] = 61;
            bArr2[i6 + 3] = 61;
            return bArr2;
        }
        if (i5 == 2) {
            bArr2[i6] = D[i10 >>> 18];
            bArr2[i6 + 1] = D[(i10 >>> 12) & 63];
            bArr2[i6 + 2] = D[(i10 >>> 6) & 63];
            bArr2[i6 + 3] = 61;
            return bArr2;
        }
        if (i5 != 3) {
            return bArr2;
        }
        bArr2[i6] = D[i10 >>> 18];
        bArr2[i6 + 1] = D[(i10 >>> 12) & 63];
        bArr2[i6 + 2] = D[(i10 >>> 6) & 63];
        bArr2[i6 + 3] = D[i10 & 63];
        return bArr2;
    }

    private static byte[] r(byte[] bArr, byte[] bArr2, int i4, int i5) {
        q(bArr2, 0, i4, bArr, 0, i5);
        return bArr;
    }

    public static String s(byte[] bArr) {
        try {
            return v(bArr, 0, bArr.length, 0);
        } catch (IOException unused) {
            return null;
        }
    }

    public static String t(byte[] bArr, int i4) throws IOException {
        return v(bArr, 0, bArr.length, i4);
    }

    public static String u(byte[] bArr, int i4, int i5) {
        try {
            return v(bArr, i4, i5, 0);
        } catch (IOException unused) {
            return null;
        }
    }

    public static String v(byte[] bArr, int i4, int i5, int i6) throws IOException {
        byte[] x4 = x(bArr, i4, i5, i6);
        try {
            return new String(x4, "US-ASCII");
        } catch (UnsupportedEncodingException unused) {
            return new String(x4);
        }
    }

    public static byte[] w(byte[] bArr) {
        try {
            return x(bArr, 0, bArr.length, 0);
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.io.OutputStream, java.util.zip.GZIPOutputStream] */
    public static byte[] x(byte[] bArr, int i4, int i5, int i6) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        c cVar;
        ?? r4;
        if (bArr == null) {
            throw new NullPointerException("Cannot serialize a null array.");
        }
        if (i4 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.a.a("Cannot have negative offset: ", i4));
        }
        if (i5 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.a.a("Cannot have length offset: ", i5));
        }
        if (i4 + i5 > bArr.length) {
            throw new IllegalArgumentException(String.format("Cannot have offset of %d and length of %d with array of length %d", Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(bArr.length)));
        }
        if ((i6 & 2) == 0) {
            boolean z4 = (i6 & 8) != 0;
            int i7 = ((i5 / 3) * 4) + (i5 % 3 > 0 ? 4 : 0);
            if (z4) {
                i7 += i7 / 76;
            }
            int i10 = i7;
            byte[] bArr2 = new byte[i10];
            int i11 = i5 - 2;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (i12 < i11) {
                int i15 = i12;
                q(bArr, i12 + i4, 3, bArr2, i13, i6);
                int i16 = i14 + 4;
                if (!z4 || i16 < 76) {
                    i14 = i16;
                } else {
                    bArr2[i13 + 4] = 10;
                    i13++;
                    i14 = 0;
                }
                i12 = i15 + 3;
                i13 += 4;
            }
            if (i12 < i5) {
                q(bArr, i12 + i4, i5 - i12, bArr2, i13, i6);
                i13 += 4;
            }
            int i17 = i13;
            if (i17 > i10 - 1) {
                return bArr2;
            }
            byte[] bArr3 = new byte[i17];
            System.arraycopy(bArr2, 0, bArr3, 0, i17);
            return bArr3;
        }
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                cVar = new c(byteArrayOutputStream, i6 | 1);
                try {
                    r4 = new GZIPOutputStream(cVar);
                } catch (IOException e4) {
                    e = e4;
                    r4 = 0;
                } catch (Throwable th) {
                    th = th;
                    try {
                        byteArrayOutputStream2.close();
                    } catch (Exception unused) {
                    }
                    try {
                        cVar.close();
                    } catch (Exception unused2) {
                    }
                    try {
                        byteArrayOutputStream.close();
                        throw th;
                    } catch (Exception unused3) {
                        throw th;
                    }
                }
            } catch (IOException e5) {
                e = e5;
                cVar = null;
                r4 = 0;
            } catch (Throwable th2) {
                th = th2;
                cVar = null;
            }
        } catch (IOException e6) {
            e = e6;
            cVar = null;
            r4 = 0;
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream = null;
            cVar = null;
        }
        try {
            r4.write(bArr, i4, i5);
            r4.close();
            try {
                r4.close();
            } catch (Exception unused4) {
            }
            try {
                cVar.close();
            } catch (Exception unused5) {
            }
            try {
                byteArrayOutputStream.close();
            } catch (Exception unused6) {
            }
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e7) {
            e = e7;
            byteArrayOutputStream2 = byteArrayOutputStream;
            r4 = r4;
            try {
                throw e;
            } catch (Throwable th4) {
                th = th4;
                byteArrayOutputStream = byteArrayOutputStream2;
                byteArrayOutputStream2 = r4;
                byteArrayOutputStream2.close();
                cVar.close();
                byteArrayOutputStream.close();
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            byteArrayOutputStream2 = r4;
            byteArrayOutputStream2.close();
            cVar.close();
            byteArrayOutputStream.close();
            throw th;
        }
    }

    public static void y(String str, String str2) throws IOException {
        BufferedOutputStream bufferedOutputStream;
        String z4 = z(str);
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(str2));
            } catch (Throwable th) {
                th = th;
            }
            try {
                bufferedOutputStream.write(z4.getBytes("US-ASCII"));
                try {
                    bufferedOutputStream.close();
                } catch (Exception unused) {
                }
            } catch (IOException e4) {
            } catch (Throwable th2) {
                th = th2;
                bufferedOutputStream2 = bufferedOutputStream;
                try {
                    bufferedOutputStream2.close();
                } catch (Exception unused2) {
                }
                throw th;
            }
        } catch (IOException e5) {
            throw e5;
        }
    }

    public static String z(String str) throws IOException {
        b bVar = null;
        try {
            try {
                File file = new File(str);
                byte[] bArr = new byte[Math.max((int) ((file.length() * 1.4d) + 1.0d), 40)];
                b bVar2 = new b(new BufferedInputStream(new FileInputStream(file)), 1);
                int i4 = 0;
                while (true) {
                    try {
                        int read = bVar2.read(bArr, i4, 4096);
                        if (read < 0) {
                            break;
                        }
                        i4 += read;
                    } catch (IOException e4) {
                        throw e4;
                    } catch (Throwable th) {
                        th = th;
                        bVar = bVar2;
                        try {
                            bVar.close();
                        } catch (Exception unused) {
                        }
                        throw th;
                    }
                }
                String str2 = new String(bArr, 0, i4, "US-ASCII");
                try {
                    bVar2.close();
                } catch (Exception unused2) {
                }
                return str2;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e5) {
            throw e5;
        }
    }
}
