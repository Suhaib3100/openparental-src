package com.tencent.cos.xml.model.tag.eventstreaming;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.collection.p0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.nio.ByteBuffer;
import java.util.zip.CRC32;

/* loaded from: classes7.dex */
final class Prelude {
    static final int LENGTH = 8;
    static final int LENGTH_WITH_CRC = 12;
    private final long headersLength;
    private final int totalLength;

    private Prelude(int i4, long j4) {
        this.totalLength = i4;
        this.headersLength = j4;
    }

    private static long computePreludeCrc(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[8];
        byteBuffer.duplicate().get(bArr);
        CRC32 crc32 = new CRC32();
        crc32.update(bArr, 0, 8);
        return crc32.getValue();
    }

    static Prelude decode(ByteBuffer byteBuffer) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        long computePreludeCrc = computePreludeCrc(duplicate);
        long intToUnsignedLong = intToUnsignedLong(duplicate.getInt());
        long intToUnsignedLong2 = intToUnsignedLong(duplicate.getInt());
        long intToUnsignedLong3 = intToUnsignedLong(duplicate.getInt());
        if (computePreludeCrc != intToUnsignedLong3) {
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("亂\u0001"), Long.valueOf(intToUnsignedLong3), Long.valueOf(computePreludeCrc)));
        }
        if (intToUnsignedLong2 < 0 || intToUnsignedLong2 > PlaybackStateCompat.ACTION_PREPARE_FROM_URI) {
            throw new IllegalArgumentException(p0.a(ProtectedSandApp.s("亁\u0001"), intToUnsignedLong2));
        }
        long j4 = (intToUnsignedLong - intToUnsignedLong2) - 16;
        if (j4 < 0 || j4 > 16777216) {
            throw new IllegalArgumentException(p0.a(ProtectedSandApp.s("亀\u0001"), j4));
        }
        return new Prelude(toIntExact(intToUnsignedLong), intToUnsignedLong2);
    }

    private static long intToUnsignedLong(int i4) {
        return i4 & 4294967295L;
    }

    private static int toIntExact(long j4) {
        int i4 = (int) j4;
        if (i4 == j4) {
            return i4;
        }
        throw new ArithmeticException(ProtectedSandApp.s("亃\u0001"));
    }

    long getHeadersLength() {
        return this.headersLength;
    }

    int getTotalLength() {
        return this.totalLength;
    }
}
