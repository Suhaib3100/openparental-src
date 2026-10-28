package com.tencent.cos.xml.model.tag.eventstreaming;

import android.support.v4.media.a;
import androidx.compose.ui.layout.a0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import kotlin.g2;

/* loaded from: classes7.dex */
final class Utils {
    private static final String UTF8 = ProtectedSandApp.s("亦\u0001");

    private Utils() {
    }

    private static void checkByteArrayBounds(int i4) {
        if (i4 == 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("亣\u0001"));
        }
        if (i4 > 32767) {
            throw new IllegalArgumentException(a.a(ProtectedSandApp.s("亢\u0001"), i4));
        }
    }

    private static void checkStringBounds(int i4, int i5) {
        if (i4 == 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("亥\u0001"));
        }
        if (i4 > i5) {
            throw new IllegalArgumentException(a.a(ProtectedSandApp.s("交\u0001"), i4));
        }
    }

    static byte[] readBytes(ByteBuffer byteBuffer) {
        int i4 = byteBuffer.getShort() & g2.f75095e;
        checkByteArrayBounds(i4);
        byte[] bArr = new byte[i4];
        byteBuffer.get(bArr);
        return bArr;
    }

    static String readShortString(ByteBuffer byteBuffer) throws UnsupportedEncodingException {
        int i4 = byteBuffer.get() & 255;
        checkStringBounds(i4, 255);
        byte[] bArr = new byte[i4];
        byteBuffer.get(bArr);
        return new String(bArr, ProtectedSandApp.s("亦\u0001"));
    }

    static String readString(ByteBuffer byteBuffer) throws UnsupportedEncodingException {
        int i4 = byteBuffer.getShort() & g2.f75095e;
        checkStringBounds(i4, a0.f18904a);
        byte[] bArr = new byte[i4];
        byteBuffer.get(bArr);
        return new String(bArr, ProtectedSandApp.s("亦\u0001"));
    }

    static int toIntExact(long j4) {
        int i4 = (int) j4;
        if (i4 == j4) {
            return i4;
        }
        throw new ArithmeticException(ProtectedSandApp.s("产\u0001"));
    }

    static long toUnsignedLong(int i4) {
        return i4 & 4294967295L;
    }

    static void writeBytes(DataOutputStream dataOutputStream, byte[] bArr) throws IOException {
        checkByteArrayBounds(bArr.length);
        dataOutputStream.writeShort((short) bArr.length);
        dataOutputStream.write(bArr);
    }

    static void writeShortString(DataOutputStream dataOutputStream, String str) throws IOException {
        byte[] bytes = str.getBytes(ProtectedSandApp.s("亦\u0001"));
        checkStringBounds(bytes.length, 255);
        dataOutputStream.writeByte(bytes.length);
        dataOutputStream.write(bytes);
    }

    static void writeString(DataOutputStream dataOutputStream, String str) throws IOException {
        byte[] bytes = str.getBytes(ProtectedSandApp.s("亦\u0001"));
        checkStringBounds(bytes.length, a0.f18904a);
        writeBytes(dataOutputStream, bytes);
    }
}
