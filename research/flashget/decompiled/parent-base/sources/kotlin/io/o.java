package kotlin.io;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

/* compiled from: Console.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0003J\u000f\u0010\u0015\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0003J\u001f\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\r\u0010\u001eR\u0016\u0010!\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010 R\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010#R\u0014\u0010'\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010&R\u0014\u0010*\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u00103\u001a\u00060/j\u0002`08\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00064"}, d2 = {"Lkotlin/io/o;", "", "<init>", "()V", "", "endOfInput", "", "b", "(Z)I", "a", "()I", "nBytes", "nChars", "c", "(II)I", "Ljava/nio/charset/Charset;", "charset", "Lkotlin/k2;", "g", "(Ljava/nio/charset/Charset;)V", "e", "f", "Ljava/io/InputStream;", "inputStream", "", "d", "(Ljava/io/InputStream;Ljava/nio/charset/Charset;)Ljava/lang/String;", "I", "BUFFER_SIZE", "Ljava/nio/charset/CharsetDecoder;", "Ljava/nio/charset/CharsetDecoder;", "decoder", "Z", "directEOL", "", "[B", "bytes", "", "[C", "chars", "Ljava/nio/ByteBuffer;", "Ljava/nio/ByteBuffer;", "byteBuf", "Ljava/nio/CharBuffer;", "h", "Ljava/nio/CharBuffer;", "charBuf", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "i", "Ljava/lang/StringBuilder;", "sb", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nConsole.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Console.kt\nkotlin/io/LineReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,299:1\n1#2:300\n*E\n"})
/* loaded from: classes7.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final o f75180a = new o();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final int BUFFER_SIZE = 32;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static CharsetDecoder decoder;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static boolean directEOL;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final byte[] bytes;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final char[] chars;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final ByteBuffer byteBuf;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final CharBuffer charBuf;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final StringBuilder sb;

    static {
        byte[] bArr = new byte[32];
        bytes = bArr;
        char[] cArr = new char[32];
        chars = cArr;
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        String s4 = ProtectedSandApp.s("搨\u0001");
        l0.o(wrap, s4);
        byteBuf = wrap;
        CharBuffer wrap2 = CharBuffer.wrap(cArr);
        l0.o(wrap2, s4);
        charBuf = wrap2;
        sb = new StringBuilder();
    }

    private o() {
    }

    private final int a() {
        ByteBuffer byteBuffer = byteBuf;
        byteBuffer.compact();
        int position = byteBuffer.position();
        byteBuffer.position(0);
        return position;
    }

    private final int b(boolean endOfInput) {
        while (true) {
            CharsetDecoder charsetDecoder = decoder;
            if (charsetDecoder == null) {
                l0.S(ProtectedSandApp.s("搩\u0001"));
                charsetDecoder = null;
            }
            ByteBuffer byteBuffer = byteBuf;
            CharBuffer charBuffer = charBuf;
            CoderResult decode = charsetDecoder.decode(byteBuffer, charBuffer, endOfInput);
            l0.o(decode, ProtectedSandApp.s("搪\u0001"));
            if (decode.isError()) {
                e();
                decode.throwException();
            }
            int position = charBuffer.position();
            if (!decode.isOverflow()) {
                return position;
            }
            StringBuilder sb2 = sb;
            char[] cArr = chars;
            int i4 = position - 1;
            sb2.append(cArr, 0, i4);
            charBuffer.position(0);
            charBuffer.limit(32);
            charBuffer.put(cArr[i4]);
        }
    }

    private final int c(int nBytes, int nChars) {
        ByteBuffer byteBuffer = byteBuf;
        byteBuffer.limit(nBytes);
        charBuf.position(nChars);
        int b5 = b(true);
        CharsetDecoder charsetDecoder = decoder;
        if (charsetDecoder == null) {
            l0.S(ProtectedSandApp.s("搩\u0001"));
            charsetDecoder = null;
        }
        charsetDecoder.reset();
        byteBuffer.position(0);
        return b5;
    }

    private final void e() {
        CharsetDecoder charsetDecoder = decoder;
        if (charsetDecoder == null) {
            l0.S(ProtectedSandApp.s("搩\u0001"));
            charsetDecoder = null;
        }
        charsetDecoder.reset();
        byteBuf.position(0);
        sb.setLength(0);
    }

    private final void f() {
        StringBuilder sb2 = sb;
        sb2.setLength(32);
        sb2.trimToSize();
    }

    private final void g(Charset charset) {
        CharsetDecoder newDecoder = charset.newDecoder();
        l0.o(newDecoder, ProtectedSandApp.s("搫\u0001"));
        decoder = newDecoder;
        ByteBuffer byteBuffer = byteBuf;
        byteBuffer.clear();
        CharBuffer charBuffer = charBuf;
        charBuffer.clear();
        byteBuffer.put((byte) 10);
        byteBuffer.flip();
        CharsetDecoder charsetDecoder = decoder;
        if (charsetDecoder == null) {
            l0.S(ProtectedSandApp.s("搩\u0001"));
            charsetDecoder = null;
        }
        boolean z4 = false;
        charsetDecoder.decode(byteBuffer, charBuffer, false);
        if (charBuffer.position() == 1 && charBuffer.get(0) == '\n') {
            z4 = true;
        }
        directEOL = z4;
        e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0030, code lost:
    
        if (kotlin.jvm.internal.l0.g(r0.charset(), r11) == false) goto L11;
     */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.lang.String d(@fg.l java.io.InputStream r10, @fg.l java.nio.charset.Charset r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            java.lang.String r0 = "搬\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)     // Catch: java.lang.Throwable -> L25
            kotlin.jvm.internal.l0.p(r10, r0)     // Catch: java.lang.Throwable -> L25
            java.lang.String r0 = "搭\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)     // Catch: java.lang.Throwable -> L25
            kotlin.jvm.internal.l0.p(r11, r0)     // Catch: java.lang.Throwable -> L25
            java.nio.charset.CharsetDecoder r0 = kotlin.io.o.decoder     // Catch: java.lang.Throwable -> L25
            r1 = 0
            if (r0 == 0) goto L32
            if (r0 != 0) goto L28
            java.lang.String r0 = "搩\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)     // Catch: java.lang.Throwable -> L25
            kotlin.jvm.internal.l0.S(r0)     // Catch: java.lang.Throwable -> L25
            r0 = r1
            goto L28
        L25:
            r10 = move-exception
            goto Ld5
        L28:
            java.nio.charset.Charset r0 = r0.charset()     // Catch: java.lang.Throwable -> L25
            boolean r0 = kotlin.jvm.internal.l0.g(r0, r11)     // Catch: java.lang.Throwable -> L25
            if (r0 != 0) goto L35
        L32:
            r9.g(r11)     // Catch: java.lang.Throwable -> L25
        L35:
            r11 = 0
            r0 = r11
            r2 = r0
        L38:
            int r3 = r10.read()     // Catch: java.lang.Throwable -> L25
            r4 = 32
            r5 = -1
            r6 = 10
            if (r3 != r5) goto L56
            java.lang.StringBuilder r10 = kotlin.io.o.sb     // Catch: java.lang.Throwable -> L25
            int r10 = r10.length()     // Catch: java.lang.Throwable -> L25
            if (r10 != 0) goto L51
            if (r0 != 0) goto L51
            if (r2 != 0) goto L51
            monitor-exit(r9)
            return r1
        L51:
            int r10 = r9.c(r0, r2)     // Catch: java.lang.Throwable -> L25
            goto L84
        L56:
            byte[] r5 = kotlin.io.o.bytes     // Catch: java.lang.Throwable -> L25
            int r7 = r0 + 1
            byte r8 = (byte) r3     // Catch: java.lang.Throwable -> L25
            r5[r0] = r8     // Catch: java.lang.Throwable -> L25
            if (r3 == r6) goto L68
            if (r7 == r4) goto L68
            boolean r0 = kotlin.io.o.directEOL     // Catch: java.lang.Throwable -> L25
            if (r0 != 0) goto L66
            goto L68
        L66:
            r0 = r7
            goto L38
        L68:
            java.nio.ByteBuffer r0 = kotlin.io.o.byteBuf     // Catch: java.lang.Throwable -> L25
            r0.limit(r7)     // Catch: java.lang.Throwable -> L25
            java.nio.CharBuffer r3 = kotlin.io.o.charBuf     // Catch: java.lang.Throwable -> L25
            r3.position(r2)     // Catch: java.lang.Throwable -> L25
            int r2 = r9.b(r11)     // Catch: java.lang.Throwable -> L25
            if (r2 <= 0) goto Lcf
            char[] r3 = kotlin.io.o.chars     // Catch: java.lang.Throwable -> L25
            int r5 = r2 + (-1)
            char r3 = r3[r5]     // Catch: java.lang.Throwable -> L25
            if (r3 != r6) goto Lcf
            r0.position(r11)     // Catch: java.lang.Throwable -> L25
            r10 = r2
        L84:
            if (r10 <= 0) goto L9e
            char[] r0 = kotlin.io.o.chars     // Catch: java.lang.Throwable -> L25
            int r1 = r10 + (-1)
            char r1 = r0[r1]     // Catch: java.lang.Throwable -> L25
            if (r1 != r6) goto L9e
            int r1 = r10 + (-1)
            if (r1 <= 0) goto L9d
            int r2 = r10 + (-2)
            char r0 = r0[r2]     // Catch: java.lang.Throwable -> L25
            r2 = 13
            if (r0 != r2) goto L9d
            int r10 = r10 + (-2)
            goto L9e
        L9d:
            r10 = r1
        L9e:
            java.lang.StringBuilder r0 = kotlin.io.o.sb     // Catch: java.lang.Throwable -> L25
            int r1 = r0.length()     // Catch: java.lang.Throwable -> L25
            if (r1 != 0) goto Laf
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Throwable -> L25
            char[] r1 = kotlin.io.o.chars     // Catch: java.lang.Throwable -> L25
            r0.<init>(r1, r11, r10)     // Catch: java.lang.Throwable -> L25
            monitor-exit(r9)
            return r0
        Laf:
            char[] r1 = kotlin.io.o.chars     // Catch: java.lang.Throwable -> L25
            r0.append(r1, r11, r10)     // Catch: java.lang.Throwable -> L25
            java.lang.String r10 = r0.toString()     // Catch: java.lang.Throwable -> L25
            java.lang.String r1 = "搮\u0001"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)     // Catch: java.lang.Throwable -> L25
            kotlin.jvm.internal.l0.o(r10, r1)     // Catch: java.lang.Throwable -> L25
            int r1 = r0.length()     // Catch: java.lang.Throwable -> L25
            if (r1 <= r4) goto Lca
            r9.f()     // Catch: java.lang.Throwable -> L25
        Lca:
            r0.setLength(r11)     // Catch: java.lang.Throwable -> L25
            monitor-exit(r9)
            return r10
        Lcf:
            int r0 = r9.a()     // Catch: java.lang.Throwable -> L25
            goto L38
        Ld5:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L25
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.o.d(java.io.InputStream, java.nio.charset.Charset):java.lang.String");
    }
}
