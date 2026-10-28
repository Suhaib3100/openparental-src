package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.StandardCharsets;

/* compiled from: Utf8Old.java */
/* loaded from: classes3.dex */
public class z extends w {

    /* renamed from: b, reason: collision with root package name */
    private static final ThreadLocal<a> f29393b;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Utf8Old.java */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        final CharsetEncoder f29394a;

        /* renamed from: b, reason: collision with root package name */
        final CharsetDecoder f29395b;

        /* renamed from: c, reason: collision with root package name */
        CharSequence f29396c = null;

        /* renamed from: d, reason: collision with root package name */
        ByteBuffer f29397d = null;

        a() {
            Charset charset = StandardCharsets.UTF_8;
            this.f29394a = charset.newEncoder();
            this.f29395b = charset.newDecoder();
        }
    }

    static {
        final x xVar = new x();
        f29393b = new ThreadLocal() { // from class: androidx.emoji2.text.flatbuffer.y
            @Override // java.lang.ThreadLocal
            protected /* synthetic */ Object initialValue() {
                return xVar.get();
            }
        };
    }

    public static /* synthetic */ a f() {
        return new a();
    }

    private static /* synthetic */ a g() {
        return new a();
    }

    @Override // androidx.emoji2.text.flatbuffer.w
    public String a(ByteBuffer byteBuffer, int i4, int i5) {
        CharsetDecoder charsetDecoder = f29393b.get().f29395b;
        charsetDecoder.reset();
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position(i4);
        duplicate.limit(i4 + i5);
        try {
            return charsetDecoder.decode(duplicate).toString();
        } catch (CharacterCodingException e4) {
            throw new IllegalArgumentException("Bad encoding", e4);
        }
    }

    @Override // androidx.emoji2.text.flatbuffer.w
    public void b(CharSequence charSequence, ByteBuffer byteBuffer) {
        a aVar = f29393b.get();
        if (aVar.f29396c != charSequence) {
            c(charSequence);
        }
        byteBuffer.put(aVar.f29397d);
    }

    @Override // androidx.emoji2.text.flatbuffer.w
    public int c(CharSequence charSequence) {
        a aVar = f29393b.get();
        int maxBytesPerChar = (int) (aVar.f29394a.maxBytesPerChar() * charSequence.length());
        ByteBuffer byteBuffer = aVar.f29397d;
        if (byteBuffer == null || byteBuffer.capacity() < maxBytesPerChar) {
            aVar.f29397d = ByteBuffer.allocate(Math.max(128, maxBytesPerChar));
        }
        aVar.f29397d.clear();
        aVar.f29396c = charSequence;
        CoderResult encode = aVar.f29394a.encode(charSequence instanceof CharBuffer ? (CharBuffer) charSequence : CharBuffer.wrap(charSequence), aVar.f29397d, true);
        if (encode.isError()) {
            try {
                encode.throwException();
            } catch (CharacterCodingException e4) {
                throw new IllegalArgumentException("bad character encoding", e4);
            }
        }
        aVar.f29397d.flip();
        return aVar.f29397d.remaining();
    }
}
