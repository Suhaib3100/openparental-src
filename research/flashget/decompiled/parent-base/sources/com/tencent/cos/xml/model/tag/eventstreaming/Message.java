package com.tencent.cos.xml.model.tag.eventstreaming;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import com.tencent.cos.xml.s3.Base64;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.zip.CRC32;
import java.util.zip.CheckedOutputStream;

/* loaded from: classes7.dex */
public class Message {
    static final int MESSAGE_OVERHEAD = 16;
    private static final int TRAILING_CRC_LENGTH = 4;
    private final Map<String, HeaderValue> headers;
    private final byte[] payload;

    public Message(Map<String, HeaderValue> map, byte[] bArr) {
        this.headers = map;
        this.payload = (byte[]) bArr.clone();
    }

    public static Message decode(ByteBuffer byteBuffer) throws CosXmlServiceException {
        Prelude decode = Prelude.decode(byteBuffer);
        validateMessageCrc(byteBuffer, decode.getTotalLength());
        byteBuffer.position(byteBuffer.position() + 12);
        long headersLength = decode.getHeadersLength();
        byte[] bArr = new byte[Utils.toIntExact(headersLength)];
        byteBuffer.get(bArr);
        Map<String, HeaderValue> decodeHeaders = decodeHeaders(ByteBuffer.wrap(bArr));
        byte[] bArr2 = new byte[Utils.toIntExact((r1 - 16) - headersLength)];
        byteBuffer.get(bArr2);
        byteBuffer.getInt();
        return new Message(decodeHeaders, bArr2);
    }

    static Map<String, HeaderValue> decodeHeaders(ByteBuffer byteBuffer) {
        HashMap hashMap = new HashMap();
        while (byteBuffer.hasRemaining()) {
            Header decode = Header.decode(byteBuffer);
            hashMap.put(decode.getName(), decode.getValue());
        }
        return Collections.unmodifiableMap(hashMap);
    }

    private void encodeOrThrow(OutputStream outputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        Iterator<Map.Entry<String, HeaderValue>> it = this.headers.entrySet().iterator();
        while (it.hasNext()) {
            Header.encode(it.next(), dataOutputStream);
        }
        dataOutputStream.write(this.payload);
        dataOutputStream.flush();
        byte[] prelude = getPrelude(byteArrayOutputStream.size() + 16);
        CRC32 crc32 = new CRC32();
        crc32.update(prelude, 0, prelude.length);
        DataOutputStream dataOutputStream2 = new DataOutputStream(outputStream);
        dataOutputStream2.write(prelude);
        dataOutputStream2.writeInt((int) crc32.getValue());
        dataOutputStream2.flush();
        byteArrayOutputStream.writeTo(outputStream);
    }

    private byte[] getPrelude(int i4) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8);
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        int length = (i4 - 16) - this.payload.length;
        dataOutputStream.writeInt(i4);
        dataOutputStream.writeInt(length);
        dataOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    private static void validateMessageCrc(ByteBuffer byteBuffer, int i4) throws CosXmlServiceException {
        CRC32 crc32 = new CRC32();
        CheckSums.update(crc32, (ByteBuffer) byteBuffer.duplicate().limit((byteBuffer.position() + i4) - 4));
        long value = crc32.getValue();
        long unsignedLong = Utils.toUnsignedLong(byteBuffer.getInt((byteBuffer.position() + i4) - 4));
        if (unsignedLong == value) {
            return;
        }
        throw new CosXmlServiceException(ProtectedSandApp.s("乴\u0001"), new ArithmeticException(String.format(ProtectedSandApp.s("乳\u0001"), Long.valueOf(unsignedLong), Long.valueOf(value))));
    }

    public void encode(OutputStream outputStream) {
        try {
            CheckedOutputStream checkedOutputStream = new CheckedOutputStream(outputStream, new CRC32());
            encodeOrThrow(checkedOutputStream);
            long value = checkedOutputStream.getChecksum().getValue();
            outputStream.write((int) ((value >> 24) & 255));
            outputStream.write((int) ((value >> 16) & 255));
            outputStream.write((int) ((value >> 8) & 255));
            outputStream.write((int) (value & 255));
            outputStream.flush();
        } catch (IOException e4) {
            throw new RuntimeException(e4);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Message message = (Message) obj;
        if (this.headers.equals(message.headers)) {
            return Arrays.equals(this.payload, message.payload);
        }
        return false;
    }

    public Map<String, HeaderValue> getHeaders() {
        return this.headers;
    }

    public byte[] getPayload() {
        return (byte[]) this.payload.clone();
    }

    public int hashCode() {
        return Arrays.hashCode(this.payload) + (this.headers.hashCode() * 31);
    }

    public ByteBuffer toByteBuffer() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            encode(byteArrayOutputStream);
            byteArrayOutputStream.close();
            return ByteBuffer.wrap(byteArrayOutputStream.toByteArray());
        } catch (IOException e4) {
            throw new RuntimeException(e4);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, HeaderValue> entry : this.headers.entrySet()) {
            sb.append(entry.getKey());
            sb.append(ProtectedSandApp.s("乵\u0001"));
            sb.append(entry.getValue().toString());
            sb.append('\n');
        }
        sb.append('\n');
        HeaderValue headerValue = this.headers.get(ProtectedSandApp.s("乶\u0001"));
        if (headerValue == null) {
            headerValue = HeaderValue.fromString(ProtectedSandApp.s("乷\u0001"));
        }
        String string = headerValue.getString();
        if (string.contains(ProtectedSandApp.s("乸\u0001")) || string.contains(ProtectedSandApp.s("乹\u0001"))) {
            try {
                sb.append(new String(this.payload, ProtectedSandApp.s("乺\u0001")));
            } catch (UnsupportedEncodingException e4) {
                e4.printStackTrace();
            }
        } else {
            sb.append(Base64.encodeAsString(this.payload));
        }
        sb.append('\n');
        return sb.toString();
    }
}
