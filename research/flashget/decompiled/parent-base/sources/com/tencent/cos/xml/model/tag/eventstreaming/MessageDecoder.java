package com.tencent.cos.xml.model.tag.eventstreaming;

import com.tencent.cos.xml.exception.CosXmlServiceException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public final class MessageDecoder {
    private static int defaultDecoderCapacity = 1053696;
    private static int incrementDecoderCapacity = 524288;
    private ByteBuffer buf = ByteBuffer.allocate(defaultDecoderCapacity);

    private void byteBufferCopy(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        System.arraycopy(byteBuffer2.array(), 0, byteBuffer.array(), 0, byteBuffer2.position());
        byteBuffer.position(byteBuffer2.position());
    }

    private ByteBuffer safePut(ByteBuffer byteBuffer, byte[] bArr, int i4, int i5) {
        if (byteBuffer.remaining() >= i5) {
            byteBuffer.put(bArr, i4, i5);
            return byteBuffer;
        }
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.capacity() + incrementDecoderCapacity);
        byteBufferCopy(allocate, byteBuffer);
        allocate.put(bArr, i4, i5);
        return allocate;
    }

    public List<Message> feed(byte[] bArr) throws CosXmlServiceException {
        return feed(bArr, 0, bArr.length);
    }

    public boolean hasPendingContent() {
        return this.buf.position() != 0;
    }

    public List<Message> feed(byte[] bArr, int i4, int i5) throws CosXmlServiceException {
        int intExact;
        ByteBuffer safePut = safePut(this.buf, bArr, i4, i5);
        this.buf = safePut;
        ByteBuffer byteBuffer = (ByteBuffer) safePut.duplicate().flip();
        ArrayList arrayList = new ArrayList();
        int i6 = 0;
        while (byteBuffer.remaining() >= 15 && byteBuffer.remaining() >= (intExact = Utils.toIntExact(Prelude.decode(byteBuffer.duplicate()).getTotalLength()))) {
            arrayList.add(Message.decode(byteBuffer));
            i6 += intExact;
        }
        if (i6 > 0) {
            this.buf.flip();
            ByteBuffer byteBuffer2 = this.buf;
            byteBuffer2.position(byteBuffer2.position() + i6);
            this.buf.compact();
        }
        return arrayList;
    }
}
