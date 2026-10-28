package org.java_websocket_new.util;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import org.java_websocket_new.exceptions.InvalidDataException;

/* compiled from: Charsetfunctions.java */
/* loaded from: classes6.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static CodingErrorAction f87087a = CodingErrorAction.REPORT;

    public static byte[] a(String str) {
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException e4) {
            throw new RuntimeException(e4);
        }
    }

    public static void b(String[] strArr) throws InvalidDataException {
        f(g("\u0000"));
        c(a("\u0000"));
    }

    public static String c(byte[] bArr) {
        return d(bArr, 0, bArr.length);
    }

    public static String d(byte[] bArr, int i4, int i5) {
        try {
            return new String(bArr, i4, i5, "ASCII");
        } catch (UnsupportedEncodingException e4) {
            throw new RuntimeException(e4);
        }
    }

    public static String e(ByteBuffer byteBuffer) throws InvalidDataException {
        CharsetDecoder newDecoder = Charset.forName("UTF8").newDecoder();
        newDecoder.onMalformedInput(f87087a);
        newDecoder.onUnmappableCharacter(f87087a);
        try {
            byteBuffer.mark();
            String charBuffer = newDecoder.decode(byteBuffer).toString();
            byteBuffer.reset();
            return charBuffer;
        } catch (CharacterCodingException e4) {
            throw new InvalidDataException(1007, e4);
        }
    }

    public static String f(byte[] bArr) throws InvalidDataException {
        return e(ByteBuffer.wrap(bArr));
    }

    public static byte[] g(String str) {
        try {
            return str.getBytes("UTF8");
        } catch (UnsupportedEncodingException e4) {
            throw new RuntimeException(e4);
        }
    }
}
