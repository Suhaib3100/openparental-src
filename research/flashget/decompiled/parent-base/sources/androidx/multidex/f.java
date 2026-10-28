package androidx.multidex;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.zip.CRC32;
import java.util.zip.ZipException;

/* compiled from: ZipUtil.java */
/* loaded from: classes3.dex */
final class f {

    /* renamed from: a, reason: collision with root package name */
    private static final int f30990a = 22;

    /* renamed from: b, reason: collision with root package name */
    private static final int f30991b = 101010256;

    /* renamed from: c, reason: collision with root package name */
    private static final int f30992c = 16384;

    /* compiled from: ZipUtil.java */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        long f30993a;

        /* renamed from: b, reason: collision with root package name */
        long f30994b;

        a() {
        }
    }

    f() {
    }

    static long a(RandomAccessFile randomAccessFile, a aVar) throws IOException {
        CRC32 crc32 = new CRC32();
        long j4 = aVar.f30994b;
        randomAccessFile.seek(aVar.f30993a);
        byte[] bArr = new byte[16384];
        int read = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j4));
        while (read != -1) {
            crc32.update(bArr, 0, read);
            j4 -= read;
            if (j4 == 0) {
                break;
            }
            read = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j4));
        }
        return crc32.getValue();
    }

    static a b(RandomAccessFile randomAccessFile) throws IOException, ZipException {
        long length = randomAccessFile.length();
        long j4 = length - 22;
        if (j4 < 0) {
            throw new ZipException("File too short to be a zip file: " + randomAccessFile.length());
        }
        long j5 = length - 65558;
        long j6 = j5 >= 0 ? j5 : 0L;
        int reverseBytes = Integer.reverseBytes(f30991b);
        do {
            randomAccessFile.seek(j4);
            if (randomAccessFile.readInt() == reverseBytes) {
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                a aVar = new a();
                aVar.f30994b = Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L;
                aVar.f30993a = Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L;
                return aVar;
            }
            j4--;
        } while (j4 >= j6);
        throw new ZipException("End Of Central Directory signature not found");
    }

    static long c(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            return a(randomAccessFile, b(randomAccessFile));
        } finally {
            randomAccessFile.close();
        }
    }
}
