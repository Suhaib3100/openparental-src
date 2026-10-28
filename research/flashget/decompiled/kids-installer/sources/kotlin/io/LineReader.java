package kotlin.io;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;

/* compiled from: Console.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0004H\u0002J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0010H\u0002J\u0018\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004H\u0002J\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\b\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020!H\u0002J\u0010\u0010#\u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u00060\u0012j\u0002`\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lkotlin/io/LineReader;", "", "()V", "BUFFER_SIZE", "", "byteBuf", "Ljava/nio/ByteBuffer;", "bytes", "", "charBuf", "Ljava/nio/CharBuffer;", "chars", "", "decoder", "Ljava/nio/charset/CharsetDecoder;", "directEOL", "", "sb", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "compactBytes", "decode", "endOfInput", "decodeEndOfInput", "nBytes", "nChars", "readLine", "", "inputStream", "Ljava/io/InputStream;", "charset", "Ljava/nio/charset/Charset;", "resetAll", "", "trimStringBuilder", "updateCharset", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nConsole.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Console.kt\nkotlin/io/LineReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,299:1\n1#2:300\n*E\n"})
/* renamed from: kotlin.io.o, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
public final class LineReader {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final LineReader f23421a = new LineReader();

    /* renamed from: b, reason: collision with root package name */
    private static final int f23422b = 32;

    /* renamed from: c, reason: collision with root package name */
    private static CharsetDecoder f23423c;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f23424d;

    /* renamed from: e, reason: collision with root package name */
    @d5.d
    private static final byte[] f23425e;

    /* renamed from: f, reason: collision with root package name */
    @d5.d
    private static final char[] f23426f;

    /* renamed from: g, reason: collision with root package name */
    @d5.d
    private static final ByteBuffer f23427g;

    /* renamed from: h, reason: collision with root package name */
    @d5.d
    private static final CharBuffer f23428h;

    /* renamed from: i, reason: collision with root package name */
    @d5.d
    private static final StringBuilder f23429i;

    static {
        byte[] bArr = new byte[32];
        f23425e = bArr;
        char[] cArr = new char[32];
        f23426f = cArr;
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        String s5 = ProtectedSandApp.s("䀾");
        l0.o(wrap, s5);
        f23427g = wrap;
        CharBuffer wrap2 = CharBuffer.wrap(cArr);
        l0.o(wrap2, s5);
        f23428h = wrap2;
        f23429i = new StringBuilder();
    }

    private LineReader() {
    }

    private final int a() {
        ByteBuffer byteBuffer = f23427g;
        byteBuffer.compact();
        int position = byteBuffer.position();
        byteBuffer.position(0);
        return position;
    }

    private final int b(boolean z5) {
        while (true) {
            CharsetDecoder charsetDecoder = f23423c;
            if (charsetDecoder == null) {
                l0.S(ProtectedSandApp.s("䀿"));
                charsetDecoder = null;
            }
            ByteBuffer byteBuffer = f23427g;
            CharBuffer charBuffer = f23428h;
            CoderResult decode = charsetDecoder.decode(byteBuffer, charBuffer, z5);
            l0.o(decode, ProtectedSandApp.s("䁀"));
            if (decode.isError()) {
                e();
                decode.throwException();
            }
            int position = charBuffer.position();
            if (!decode.isOverflow()) {
                return position;
            }
            StringBuilder sb = f23429i;
            char[] cArr = f23426f;
            int i5 = position - 1;
            sb.append(cArr, 0, i5);
            charBuffer.position(0);
            charBuffer.limit(32);
            charBuffer.put(cArr[i5]);
        }
    }

    private final int c(int i5, int i6) {
        ByteBuffer byteBuffer = f23427g;
        byteBuffer.limit(i5);
        f23428h.position(i6);
        int b6 = b(true);
        CharsetDecoder charsetDecoder = f23423c;
        if (charsetDecoder == null) {
            l0.S(ProtectedSandApp.s("䁁"));
            charsetDecoder = null;
        }
        charsetDecoder.reset();
        byteBuffer.position(0);
        return b6;
    }

    private final void e() {
        CharsetDecoder charsetDecoder = f23423c;
        if (charsetDecoder == null) {
            l0.S(ProtectedSandApp.s("䁂"));
            charsetDecoder = null;
        }
        charsetDecoder.reset();
        f23427g.position(0);
        f23429i.setLength(0);
    }

    private final void f() {
        StringBuilder sb = f23429i;
        sb.setLength(32);
        sb.trimToSize();
    }

    private final void g(Charset charset) {
        CharsetDecoder newDecoder = charset.newDecoder();
        l0.o(newDecoder, ProtectedSandApp.s("䁃"));
        f23423c = newDecoder;
        ByteBuffer byteBuffer = f23427g;
        byteBuffer.clear();
        CharBuffer charBuffer = f23428h;
        charBuffer.clear();
        byteBuffer.put((byte) 10);
        byteBuffer.flip();
        CharsetDecoder charsetDecoder = f23423c;
        if (charsetDecoder == null) {
            l0.S(ProtectedSandApp.s("䁄"));
            charsetDecoder = null;
        }
        boolean z5 = false;
        charsetDecoder.decode(byteBuffer, charBuffer, false);
        if (charBuffer.position() == 1 && charBuffer.get(0) == '\n') {
            z5 = true;
        }
        f23424d = z5;
        e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0086, code lost:
    
        if (r11 <= 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0088, code lost:
    
        r0 = kotlin.io.LineReader.f23426f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008e, code lost:
    
        if (r0[r11 - 1] != '\n') goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0090, code lost:
    
        r11 = r11 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0092, code lost:
    
        if (r11 <= 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009a, code lost:
    
        if (r0[r11 - 1] != '\r') goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009c, code lost:
    
        r11 = r11 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009e, code lost:
    
        r0 = kotlin.io.LineReader.f23429i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a4, code lost:
    
        if (r0.length() != 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a8, code lost:
    
        if (r7 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b2, code lost:
    
        return new java.lang.String(kotlin.io.LineReader.f23426f, 0, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b3, code lost:
    
        r0.append(kotlin.io.LineReader.f23426f, 0, r11);
        r11 = r0.toString();
        kotlin.jvm.internal.l0.o(r11, com.flashget.kidsdownloader.ProtectedSandApp.s("䁈"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c9, code lost:
    
        if (r0.length() <= 32) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00cb, code lost:
    
        f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ce, code lost:
    
        r0.setLength(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d2, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a7, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
    
        if (kotlin.jvm.internal.l0.g(r0.charset(), r12) == false) goto L9;
     */
    @d5.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.lang.String d(@d5.d java.io.InputStream r11, @d5.d java.nio.charset.Charset r12) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.LineReader.d(java.io.InputStream, java.nio.charset.Charset):java.lang.String");
    }
}
