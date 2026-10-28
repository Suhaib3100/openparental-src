package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.util.Arrays;

/* compiled from: MagicNumberFileFilter.java */
/* loaded from: classes6.dex */
public class o extends a implements Serializable {

    /* renamed from: q, reason: collision with root package name */
    private static final long f31886q = -547733176983104172L;

    /* renamed from: o, reason: collision with root package name */
    private final byte[] f31887o;

    /* renamed from: p, reason: collision with root package name */
    private final long f31888p;

    public o(byte[] bArr) {
        this(bArr, 0L);
    }

    @Override // org.apache.commons.io.filefilter.a, org.apache.commons.io.filefilter.n, java.io.FileFilter
    public boolean accept(File file) {
        if (file != null && file.isFile() && file.canRead()) {
            RandomAccessFile randomAccessFile = null;
            try {
                byte[] bArr = new byte[this.f31887o.length];
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "r");
                try {
                    randomAccessFile2.seek(this.f31888p);
                    int read = randomAccessFile2.read(bArr);
                    byte[] bArr2 = this.f31887o;
                    if (read != bArr2.length) {
                        org.apache.commons.io.n.b(randomAccessFile2);
                        return false;
                    }
                    boolean equals = Arrays.equals(bArr2, bArr);
                    org.apache.commons.io.n.b(randomAccessFile2);
                    return equals;
                } catch (IOException unused) {
                    randomAccessFile = randomAccessFile2;
                    org.apache.commons.io.n.b(randomAccessFile);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    randomAccessFile = randomAccessFile2;
                    org.apache.commons.io.n.b(randomAccessFile);
                    throw th;
                }
            } catch (IOException unused2) {
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return false;
    }

    @Override // org.apache.commons.io.filefilter.a
    public String toString() {
        return super.toString() + "(" + new String(this.f31887o) + "," + this.f31888p + ")";
    }

    public o(String str) {
        this(str, 0L);
    }

    public o(String str, long j5) {
        if (str != null) {
            if (str.length() == 0) {
                throw new IllegalArgumentException("The magic number must contain at least one byte");
            }
            if (j5 >= 0) {
                this.f31887o = str.getBytes();
                this.f31888p = j5;
                return;
            }
            throw new IllegalArgumentException("The offset cannot be negative");
        }
        throw new IllegalArgumentException("The magic number cannot be null");
    }

    public o(byte[] bArr, long j5) {
        if (bArr != null) {
            if (bArr.length == 0) {
                throw new IllegalArgumentException("The magic number must contain at least one byte");
            }
            if (j5 >= 0) {
                byte[] bArr2 = new byte[bArr.length];
                this.f31887o = bArr2;
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                this.f31888p = j5;
                return;
            }
            throw new IllegalArgumentException("The offset cannot be negative");
        }
        throw new IllegalArgumentException("The magic number cannot be null");
    }
}
