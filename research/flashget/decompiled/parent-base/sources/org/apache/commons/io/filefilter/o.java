package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.util.Arrays;

/* compiled from: MagicNumberFileFilter.java */
/* loaded from: classes4.dex */
public class o extends a implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    private static final long f85386d = -547733176983104172L;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f85387b;

    /* renamed from: c, reason: collision with root package name */
    private final long f85388c;

    public o(byte[] bArr) {
        this(bArr, 0L);
    }

    @Override // org.apache.commons.io.filefilter.a, org.apache.commons.io.filefilter.n, java.io.FileFilter
    public boolean accept(File file) {
        if (file != null && file.isFile() && file.canRead()) {
            RandomAccessFile randomAccessFile = null;
            try {
                byte[] bArr = new byte[this.f85387b.length];
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "r");
                try {
                    randomAccessFile2.seek(this.f85388c);
                    int read = randomAccessFile2.read(bArr);
                    byte[] bArr2 = this.f85387b;
                    if (read != bArr2.length) {
                        org.apache.commons.io.m.b(randomAccessFile2);
                        return false;
                    }
                    boolean equals = Arrays.equals(bArr2, bArr);
                    org.apache.commons.io.m.b(randomAccessFile2);
                    return equals;
                } catch (IOException unused) {
                    randomAccessFile = randomAccessFile2;
                    org.apache.commons.io.m.b(randomAccessFile);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    randomAccessFile = randomAccessFile2;
                    org.apache.commons.io.m.b(randomAccessFile);
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
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("(");
        sb.append(new String(this.f85387b));
        sb.append(",");
        return android.support.v4.media.session.b.a(sb, this.f85388c, ")");
    }

    public o(String str) {
        this(str, 0L);
    }

    public o(String str, long j4) {
        if (str != null) {
            if (str.length() == 0) {
                throw new IllegalArgumentException("The magic number must contain at least one byte");
            }
            if (j4 >= 0) {
                this.f85387b = str.getBytes();
                this.f85388c = j4;
                return;
            }
            throw new IllegalArgumentException("The offset cannot be negative");
        }
        throw new IllegalArgumentException("The magic number cannot be null");
    }

    public o(byte[] bArr, long j4) {
        if (bArr != null) {
            if (bArr.length == 0) {
                throw new IllegalArgumentException("The magic number must contain at least one byte");
            }
            if (j4 >= 0) {
                byte[] bArr2 = new byte[bArr.length];
                this.f85387b = bArr2;
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                this.f85388c = j4;
                return;
            }
            throw new IllegalArgumentException("The offset cannot be negative");
        }
        throw new IllegalArgumentException("The magic number cannot be null");
    }
}
