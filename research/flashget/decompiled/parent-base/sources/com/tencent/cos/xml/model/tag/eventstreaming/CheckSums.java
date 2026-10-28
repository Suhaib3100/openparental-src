package com.tencent.cos.xml.model.tag.eventstreaming;

import java.nio.ByteBuffer;
import java.util.zip.Checksum;

/* loaded from: classes7.dex */
final class CheckSums {
    private CheckSums() {
    }

    static void update(Checksum checksum, ByteBuffer byteBuffer) {
        if (!byteBuffer.hasArray()) {
            int remaining = byteBuffer.remaining();
            byte[] bArr = new byte[remaining];
            byteBuffer.get(bArr, 0, remaining);
            checksum.update(bArr, 0, remaining);
            return;
        }
        int position = byteBuffer.position();
        int arrayOffset = byteBuffer.arrayOffset();
        int limit = byteBuffer.limit();
        checksum.update(byteBuffer.array(), position + arrayOffset, limit - position);
        byteBuffer.position(limit);
    }
}
