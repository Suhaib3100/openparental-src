package org.eclipse.paho.client.mqttv3.internal.websocket;

import com.google.common.base.c;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.security.SecureRandom;

/* loaded from: classes5.dex */
public class WebSocketFrame {
    public static final int frameLengthOverhead = 6;
    private boolean closeFlag;
    private boolean fin;
    private byte opcode;
    private byte[] payload;

    public WebSocketFrame(byte b5, boolean z4, byte[] bArr) {
        this.closeFlag = false;
        this.opcode = b5;
        this.fin = z4;
        this.payload = bArr;
    }

    public static void appendFinAndOpCode(ByteBuffer byteBuffer, byte b5, boolean z4) {
        byteBuffer.put((byte) ((b5 & c.f54871q) | (z4 ? (byte) 128 : (byte) 0)));
    }

    private static void appendLength(ByteBuffer byteBuffer, int i4, boolean z4) {
        if (i4 < 0) {
            throw new IllegalArgumentException("Length cannot be negative");
        }
        int i5 = z4 ? -128 : 0;
        if (i4 <= 65535) {
            if (i4 < 126) {
                byteBuffer.put((byte) (i4 | i5));
                return;
            }
            byteBuffer.put((byte) (i5 | 126));
            byteBuffer.put((byte) (i4 >> 8));
            byteBuffer.put((byte) (i4 & 255));
            return;
        }
        byteBuffer.put((byte) (i5 | 127));
        byteBuffer.put((byte) 0);
        byteBuffer.put((byte) 0);
        byteBuffer.put((byte) 0);
        byteBuffer.put((byte) 0);
        byteBuffer.put((byte) ((i4 >> 24) & 255));
        byteBuffer.put((byte) ((i4 >> 16) & 255));
        byteBuffer.put((byte) ((i4 >> 8) & 255));
        byteBuffer.put((byte) (i4 & 255));
    }

    public static void appendLengthAndMask(ByteBuffer byteBuffer, int i4, byte[] bArr) {
        if (bArr == null) {
            appendLength(byteBuffer, i4, false);
        } else {
            appendLength(byteBuffer, i4, true);
            byteBuffer.put(bArr);
        }
    }

    public static byte[] generateMaskingKey() {
        SecureRandom secureRandom = new SecureRandom();
        return new byte[]{(byte) secureRandom.nextInt(255), (byte) secureRandom.nextInt(255), (byte) secureRandom.nextInt(255), (byte) secureRandom.nextInt(255)};
    }

    private void setFinAndOpCode(byte b5) {
        this.fin = (b5 & 128) != 0;
        this.opcode = (byte) (b5 & c.f54871q);
    }

    public byte[] encodeFrame() {
        byte[] bArr = this.payload;
        int length = bArr.length;
        int i4 = length + 6;
        if (bArr.length > 65535) {
            i4 = length + 14;
        } else if (bArr.length >= 126) {
            i4 = length + 8;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i4);
        appendFinAndOpCode(allocate, this.opcode, this.fin);
        byte[] generateMaskingKey = generateMaskingKey();
        appendLengthAndMask(allocate, this.payload.length, generateMaskingKey);
        int i5 = 0;
        while (true) {
            byte[] bArr2 = this.payload;
            if (i5 >= bArr2.length) {
                allocate.flip();
                return allocate.array();
            }
            byte b5 = (byte) (bArr2[i5] ^ generateMaskingKey[i5 % 4]);
            bArr2[i5] = b5;
            allocate.put(b5);
            i5++;
        }
    }

    public byte getOpcode() {
        return this.opcode;
    }

    public byte[] getPayload() {
        return this.payload;
    }

    public boolean isCloseFlag() {
        return this.closeFlag;
    }

    public boolean isFin() {
        return this.fin;
    }

    public WebSocketFrame(byte[] bArr) {
        byte[] bArr2;
        int i4 = 0;
        this.closeFlag = false;
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        setFinAndOpCode(wrap.get());
        byte b5 = wrap.get();
        boolean z4 = (b5 & 128) != 0;
        int i5 = (byte) (b5 & Byte.MAX_VALUE);
        int i6 = i5 == 127 ? 8 : i5 == 126 ? 2 : 0;
        while (true) {
            i6--;
            if (i6 <= 0) {
                break;
            } else {
                i5 |= (wrap.get() & 255) << (i6 * 8);
            }
        }
        if (z4) {
            bArr2 = new byte[4];
            wrap.get(bArr2, 0, 4);
        } else {
            bArr2 = null;
        }
        byte[] bArr3 = new byte[i5];
        this.payload = bArr3;
        wrap.get(bArr3, 0, i5);
        if (!z4) {
            return;
        }
        while (true) {
            byte[] bArr4 = this.payload;
            if (i4 >= bArr4.length) {
                return;
            }
            bArr4[i4] = (byte) (bArr4[i4] ^ bArr2[i4 % 4]);
            i4++;
        }
    }

    public WebSocketFrame(InputStream inputStream) throws IOException {
        byte[] bArr;
        int i4 = 0;
        this.closeFlag = false;
        setFinAndOpCode((byte) inputStream.read());
        byte b5 = this.opcode;
        if (b5 != 2) {
            if (b5 == 8) {
                this.closeFlag = true;
                return;
            } else {
                throw new IOException("Invalid Frame: Opcode: " + ((int) this.opcode));
            }
        }
        byte read = (byte) inputStream.read();
        boolean z4 = (read & 128) != 0;
        int i5 = (byte) (read & Byte.MAX_VALUE);
        int i6 = i5 != 127 ? i5 == 126 ? 2 : 0 : 8;
        i5 = i6 > 0 ? 0 : i5;
        while (true) {
            i6--;
            if (i6 < 0) {
                break;
            } else {
                i5 |= (((byte) inputStream.read()) & 255) << (i6 * 8);
            }
        }
        if (z4) {
            bArr = new byte[4];
            inputStream.read(bArr, 0, 4);
        } else {
            bArr = null;
        }
        this.payload = new byte[i5];
        int i7 = 0;
        int i10 = i5;
        while (i7 != i5) {
            int read2 = inputStream.read(this.payload, i7, i10);
            i7 += read2;
            i10 -= read2;
        }
        if (!z4) {
            return;
        }
        while (true) {
            byte[] bArr2 = this.payload;
            if (i4 >= bArr2.length) {
                return;
            }
            bArr2[i4] = (byte) (bArr2[i4] ^ bArr[i4 % 4]);
            i4++;
        }
    }
}
