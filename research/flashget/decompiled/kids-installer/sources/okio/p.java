package okio;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.text.Charsets;

/* compiled from: ByteString.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u001a\b\u0016\u0018\u0000 c2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001dB\u0011\b\u0000\u0012\u0006\u0010^\u001a\u00020-¢\u0006\u0004\ba\u0010bJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\nH\u0016J\b\u0010\u0010\u001a\u00020\u0000H\u0016J\b\u0010\u0011\u001a\u00020\u0000H\u0016J\b\u0010\u0012\u001a\u00020\u0000H\u0016J\b\u0010\u0013\u001a\u00020\u0000H\u0016J\u0017\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\nH\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0000H\u0016J\u0010\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0000H\u0016J\u0010\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0000H\u0016J\u001f\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0000H\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u001d\u001a\u00020\nH\u0016J\b\u0010\u001e\u001a\u00020\nH\u0016J\b\u0010\u001f\u001a\u00020\u0000H\u0016J\b\u0010 \u001a\u00020\u0000H\u0016J\u001c\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010#\u001a\u00020!H\u0017J\u0017\u0010'\u001a\u00020&2\u0006\u0010%\u001a\u00020!H\u0010¢\u0006\u0004\b'\u0010(J\u0018\u0010*\u001a\u00020&2\u0006\u0010)\u001a\u00020!H\u0087\u0002¢\u0006\u0004\b*\u0010(J\u000f\u0010+\u001a\u00020!H\u0010¢\u0006\u0004\b+\u0010,J\b\u0010.\u001a\u00020-H\u0016J\u000f\u0010/\u001a\u00020-H\u0010¢\u0006\u0004\b/\u00100J\b\u00102\u001a\u000201H\u0016J\u0010\u00104\u001a\u00020\u00052\u0006\u0010\b\u001a\u000203H\u0016J'\u00109\u001a\u00020\u00052\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u00020!2\u0006\u00108\u001a\u00020!H\u0010¢\u0006\u0004\b9\u0010:J(\u0010>\u001a\u00020=2\u0006\u00107\u001a\u00020!2\u0006\u0010;\u001a\u00020\u00002\u0006\u0010<\u001a\u00020!2\u0006\u00108\u001a\u00020!H\u0016J(\u0010?\u001a\u00020=2\u0006\u00107\u001a\u00020!2\u0006\u0010;\u001a\u00020-2\u0006\u0010<\u001a\u00020!2\u0006\u00108\u001a\u00020!H\u0016J\u000e\u0010A\u001a\u00020=2\u0006\u0010@\u001a\u00020\u0000J\u000e\u0010B\u001a\u00020=2\u0006\u0010@\u001a\u00020-J\u000e\u0010D\u001a\u00020=2\u0006\u0010C\u001a\u00020\u0000J\u000e\u0010E\u001a\u00020=2\u0006\u0010C\u001a\u00020-J\u001a\u0010G\u001a\u00020!2\u0006\u0010;\u001a\u00020\u00002\b\b\u0002\u0010F\u001a\u00020!H\u0007J\u001a\u0010H\u001a\u00020!2\u0006\u0010;\u001a\u00020-2\b\b\u0002\u0010F\u001a\u00020!H\u0017J\u001a\u0010I\u001a\u00020!2\u0006\u0010;\u001a\u00020\u00002\b\b\u0002\u0010F\u001a\u00020!H\u0007J\u001a\u0010J\u001a\u00020!2\u0006\u0010;\u001a\u00020-2\b\b\u0002\u0010F\u001a\u00020!H\u0017J\u0013\u0010L\u001a\u00020=2\b\u0010;\u001a\u0004\u0018\u00010KH\u0096\u0002J\b\u0010M\u001a\u00020!H\u0016J\u0011\u0010N\u001a\u00020!2\u0006\u0010;\u001a\u00020\u0000H\u0096\u0002J\b\u0010O\u001a\u00020\nH\u0016J\u0017\u0010P\u001a\u00020&2\u0006\u0010)\u001a\u00020!H\u0007¢\u0006\u0004\bP\u0010(J\u000f\u0010Q\u001a\u00020!H\u0007¢\u0006\u0004\bQ\u0010,R\"\u0010M\u001a\u00020!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010G\u001a\u0004\bR\u0010,\"\u0004\bS\u0010TR$\u0010Z\u001a\u0004\u0018\u00010\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bN\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\u001a\u0010^\u001a\u00020-8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u00100R\u0011\u0010`\u001a\u00020!8G¢\u0006\u0006\u001a\u0004\b_\u0010,¨\u0006e"}, d2 = {"Lokio/p;", "Ljava/io/Serializable;", "", "Ljava/io/ObjectInputStream;", "in", "Lkotlin/m2;", "c0", "Ljava/io/ObjectOutputStream;", "out", "w0", "", "t0", "Ljava/nio/charset/Charset;", "charset", "l0", "l", "V", "f0", "g0", "h0", "algorithm", "s", "(Ljava/lang/String;)Lokio/p;", "key", "E", "F", "G", "D", "(Ljava/lang/String;Lokio/p;)Lokio/p;", "o", "C", "q0", "r0", "", "beginIndex", "endIndex", "o0", "pos", "", "O", "(I)B", "index", "x", "A", "()I", "", "s0", "N", "()[B", "Ljava/nio/ByteBuffer;", "j", "Ljava/io/OutputStream;", "u0", "Lokio/m;", "buffer", "offset", "byteCount", "v0", "(Lokio/m;II)V", "other", "otherOffset", "", "Z", "a0", "prefix", "j0", "k0", "suffix", "v", "w", "fromIndex", "I", "K", "Q", "S", "", "equals", "hashCode", "p", "toString", "g", "h", "z", "d0", "(I)V", "Ljava/lang/String;", "B", "()Ljava/lang/String;", "e0", "(Ljava/lang/String;)V", "utf8", "q", "[B", "y", "data", "i0", "size", "<init>", "([B)V", "t", "a", "okio"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public class p implements Serializable, Comparable<p> {

    /* renamed from: r, reason: collision with root package name */
    private static final long f31687r = 1;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private transient int hashCode;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @d5.e
    private transient String utf8;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final byte[] data;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: s, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final p f31688s = new p(new byte[0]);

    /* compiled from: ByteString.kt */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b+\u0010,J\u0014\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00020\u0002\"\u00020\u0003H\u0007J'\u0010\n\u001a\u00020\u0005*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\u0005*\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\f\u0010\u0010\u001a\u00020\u0005*\u00020\u000fH\u0007J\u001d\u0010\u0013\u001a\u00020\u0005*\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010\u0015\u001a\u0004\u0018\u00010\u0005*\u00020\u000fH\u0007J\f\u0010\u0016\u001a\u00020\u0005*\u00020\u000fH\u0007J\u001b\u0010\u0018\u001a\u00020\u0005*\u00020\u00172\u0006\u0010\t\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001a\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u001d\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u001e\u0010\u0014J\u0017\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u001f\u0010\u001cJ\u0017\u0010!\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\fH\u0007¢\u0006\u0004\b!\u0010\u000eJ'\u0010#\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0007¢\u0006\u0004\b#\u0010\u000bJ\u001f\u0010%\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\u0007H\u0007¢\u0006\u0004\b%\u0010\u0019R\u0014\u0010&\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lokio/p$a;", "", "", "", "data", "Lokio/p;", "n", "", "offset", "byteCount", "o", "([BII)Lokio/p;", "Ljava/nio/ByteBuffer;", "m", "(Ljava/nio/ByteBuffer;)Lokio/p;", "", "l", "Ljava/nio/charset/Charset;", "charset", "j", "(Ljava/lang/String;Ljava/nio/charset/Charset;)Lokio/p;", "h", "i", "Ljava/io/InputStream;", "q", "(Ljava/io/InputStream;I)Lokio/p;", "string", "a", "(Ljava/lang/String;)Lokio/p;", "b", "c", "d", "buffer", "e", "array", "f", "inputstream", "g", "EMPTY", "Lokio/p;", "", "serialVersionUID", "J", "<init>", "()V", "okio"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okio.p$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ p k(Companion companion, String str, Charset charset, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                charset = Charsets.f27049b;
            }
            return companion.j(str, charset);
        }

        public static /* synthetic */ p p(Companion companion, byte[] bArr, int i5, int i6, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                i5 = 0;
            }
            if ((i7 & 2) != 0) {
                i6 = bArr.length;
            }
            return companion.o(bArr, i5, i6);
        }

        @p3.i(name = "-deprecated_decodeBase64")
        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "string.decodeBase64()", imports = {"okio.ByteString.Companion.decodeBase64"}))
        @d5.e
        public final p a(@d5.d String string) {
            kotlin.jvm.internal.l0.p(string, ProtectedSandApp.s("桟"));
            return h(string);
        }

        @p3.i(name = "-deprecated_decodeHex")
        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "string.decodeHex()", imports = {"okio.ByteString.Companion.decodeHex"}))
        @d5.d
        public final p b(@d5.d String string) {
            kotlin.jvm.internal.l0.p(string, ProtectedSandApp.s("桠"));
            return i(string);
        }

        @p3.i(name = "-deprecated_encodeString")
        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "string.encode(charset)", imports = {"okio.ByteString.Companion.encode"}))
        @d5.d
        public final p c(@d5.d String string, @d5.d Charset charset) {
            kotlin.jvm.internal.l0.p(string, ProtectedSandApp.s("桡"));
            kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("桢"));
            return j(string, charset);
        }

        @p3.i(name = "-deprecated_encodeUtf8")
        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "string.encodeUtf8()", imports = {"okio.ByteString.Companion.encodeUtf8"}))
        @d5.d
        public final p d(@d5.d String string) {
            kotlin.jvm.internal.l0.p(string, ProtectedSandApp.s("档"));
            return l(string);
        }

        @p3.i(name = "-deprecated_of")
        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "buffer.toByteString()", imports = {"okio.ByteString.Companion.toByteString"}))
        @d5.d
        public final p e(@d5.d ByteBuffer buffer) {
            kotlin.jvm.internal.l0.p(buffer, ProtectedSandApp.s("桤"));
            return m(buffer);
        }

        @p3.i(name = "-deprecated_of")
        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "array.toByteString(offset, byteCount)", imports = {"okio.ByteString.Companion.toByteString"}))
        @d5.d
        public final p f(@d5.d byte[] array, int offset, int byteCount) {
            kotlin.jvm.internal.l0.p(array, ProtectedSandApp.s("桥"));
            return o(array, offset, byteCount);
        }

        @p3.i(name = "-deprecated_read")
        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "inputstream.readByteString(byteCount)", imports = {"okio.ByteString.Companion.readByteString"}))
        @d5.d
        public final p g(@d5.d InputStream inputstream, int byteCount) {
            kotlin.jvm.internal.l0.p(inputstream, ProtectedSandApp.s("桦"));
            return q(inputstream, byteCount);
        }

        @d5.e
        @p3.n
        public final p h(@d5.d String str) {
            kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("桧"));
            byte[] a6 = a.a(str);
            if (a6 != null) {
                return new p(a6);
            }
            return null;
        }

        @d5.d
        @p3.n
        public final p i(@d5.d String str) {
            int H;
            int H2;
            kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("桨"));
            if (!(str.length() % 2 == 0)) {
                throw new IllegalArgumentException(ProtectedSandApp.s("桩").concat(str).toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i5 = 0; i5 < length; i5++) {
                int i6 = i5 * 2;
                H = v4.b.H(str.charAt(i6));
                H2 = v4.b.H(str.charAt(i6 + 1));
                bArr[i5] = (byte) (H2 + (H << 4));
            }
            return new p(bArr);
        }

        @p3.i(name = "encodeString")
        @d5.d
        @p3.n
        public final p j(@d5.d String str, @d5.d Charset charset) {
            kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("桪"));
            kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("桫"));
            byte[] bytes = str.getBytes(charset);
            kotlin.jvm.internal.l0.o(bytes, ProtectedSandApp.s("桬"));
            return new p(bytes);
        }

        @d5.d
        @p3.n
        public final p l(@d5.d String str) {
            kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("桭"));
            p pVar = new p(i.a(str));
            pVar.e0(str);
            return pVar;
        }

        @p3.i(name = "of")
        @d5.d
        @p3.n
        public final p m(@d5.d ByteBuffer byteBuffer) {
            kotlin.jvm.internal.l0.p(byteBuffer, ProtectedSandApp.s("桮"));
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            return new p(bArr);
        }

        @d5.d
        @p3.n
        public final p n(@d5.d byte... data) {
            kotlin.jvm.internal.l0.p(data, ProtectedSandApp.s("桯"));
            byte[] copyOf = Arrays.copyOf(data, data.length);
            kotlin.jvm.internal.l0.o(copyOf, ProtectedSandApp.s("桰"));
            return new p(copyOf);
        }

        @p3.i(name = "of")
        @d5.d
        @p3.n
        public final p o(@d5.d byte[] bArr, int i5, int i6) {
            byte[] f12;
            kotlin.jvm.internal.l0.p(bArr, ProtectedSandApp.s("桱"));
            j.e(bArr.length, i5, i6);
            f12 = kotlin.collections.p.f1(bArr, i5, i6 + i5);
            return new p(f12);
        }

        @p3.i(name = "read")
        @d5.d
        @p3.n
        public final p q(@d5.d InputStream inputStream, int i5) throws IOException {
            kotlin.jvm.internal.l0.p(inputStream, ProtectedSandApp.s("桲"));
            int i6 = 0;
            if (!(i5 >= 0)) {
                throw new IllegalArgumentException(androidx.appcompat.view.menu.s.a(ProtectedSandApp.s("桳"), i5).toString());
            }
            byte[] bArr = new byte[i5];
            while (i6 < i5) {
                int read = inputStream.read(bArr, i6, i5 - i6);
                if (read == -1) {
                    throw new EOFException();
                }
                i6 += read;
            }
            return new p(bArr);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.w wVar) {
            this();
        }
    }

    public p(@d5.d byte[] bArr) {
        kotlin.jvm.internal.l0.p(bArr, ProtectedSandApp.s("桺"));
        this.data = bArr;
    }

    public static /* synthetic */ int L(p pVar, p pVar2, int i5, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("桻"));
        }
        if ((i6 & 2) != 0) {
            i5 = 0;
        }
        return pVar.I(pVar2, i5);
    }

    public static /* synthetic */ int M(p pVar, byte[] bArr, int i5, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("桼"));
        }
        if ((i6 & 2) != 0) {
            i5 = 0;
        }
        return pVar.K(bArr, i5);
    }

    public static /* synthetic */ int T(p pVar, p pVar2, int i5, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("桽"));
        }
        if ((i6 & 2) != 0) {
            i5 = pVar.i0();
        }
        return pVar.Q(pVar2, i5);
    }

    public static /* synthetic */ int U(p pVar, byte[] bArr, int i5, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("桾"));
        }
        if ((i6 & 2) != 0) {
            i5 = pVar.i0();
        }
        return pVar.S(bArr, i5);
    }

    @p3.i(name = "of")
    @d5.d
    @p3.n
    public static final p W(@d5.d ByteBuffer byteBuffer) {
        return INSTANCE.m(byteBuffer);
    }

    @d5.d
    @p3.n
    public static final p X(@d5.d byte... bArr) {
        return INSTANCE.n(bArr);
    }

    @p3.i(name = "of")
    @d5.d
    @p3.n
    public static final p Y(@d5.d byte[] bArr, int i5, int i6) {
        return INSTANCE.o(bArr, i5, i6);
    }

    @p3.i(name = "read")
    @d5.d
    @p3.n
    public static final p b0(@d5.d InputStream inputStream, int i5) throws IOException {
        return INSTANCE.q(inputStream, i5);
    }

    private final void c0(ObjectInputStream objectInputStream) throws IOException {
        p q5 = INSTANCE.q(objectInputStream, objectInputStream.readInt());
        Field declaredField = p.class.getDeclaredField(ProtectedSandApp.s("桿"));
        kotlin.jvm.internal.l0.o(declaredField, ProtectedSandApp.s("梀"));
        declaredField.setAccessible(true);
        declaredField.set(this, q5.data);
    }

    public static /* synthetic */ p p0(p pVar, int i5, int i6, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("梁"));
        }
        if ((i7 & 1) != 0) {
            i5 = 0;
        }
        if ((i7 & 2) != 0) {
            i6 = pVar.i0();
        }
        return pVar.o0(i5, i6);
    }

    @d5.e
    @p3.n
    public static final p q(@d5.d String str) {
        return INSTANCE.h(str);
    }

    @d5.d
    @p3.n
    public static final p r(@d5.d String str) {
        return INSTANCE.i(str);
    }

    @p3.i(name = "encodeString")
    @d5.d
    @p3.n
    public static final p t(@d5.d String str, @d5.d Charset charset) {
        return INSTANCE.j(str, charset);
    }

    @d5.d
    @p3.n
    public static final p u(@d5.d String str) {
        return INSTANCE.l(str);
    }

    private final void w0(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.data.length);
        objectOutputStream.write(this.data);
    }

    public int A() {
        return getData().length;
    }

    @d5.e
    /* renamed from: B, reason: from getter */
    public final String getUtf8() {
        return this.utf8;
    }

    @d5.d
    public String C() {
        char[] cArr = new char[getData().length * 2];
        int i5 = 0;
        for (byte b6 : getData()) {
            int i6 = i5 + 1;
            cArr[i5] = v4.b.I()[(b6 >> 4) & 15];
            i5 = i6 + 1;
            cArr[i6] = v4.b.I()[b6 & 15];
        }
        return new String(cArr);
    }

    @d5.d
    public p D(@d5.d String algorithm, @d5.d p key) {
        kotlin.jvm.internal.l0.p(algorithm, ProtectedSandApp.s("梂"));
        kotlin.jvm.internal.l0.p(key, ProtectedSandApp.s("梃"));
        try {
            Mac mac = Mac.getInstance(algorithm);
            mac.init(new SecretKeySpec(key.s0(), algorithm));
            byte[] doFinal = mac.doFinal(this.data);
            kotlin.jvm.internal.l0.o(doFinal, ProtectedSandApp.s("梄"));
            return new p(doFinal);
        } catch (InvalidKeyException e6) {
            throw new IllegalArgumentException(e6);
        }
    }

    @d5.d
    public p E(@d5.d p key) {
        kotlin.jvm.internal.l0.p(key, ProtectedSandApp.s("梅"));
        return D(ProtectedSandApp.s("梆"), key);
    }

    @d5.d
    public p F(@d5.d p key) {
        kotlin.jvm.internal.l0.p(key, ProtectedSandApp.s("梇"));
        return D(ProtectedSandApp.s("梈"), key);
    }

    @d5.d
    public p G(@d5.d p key) {
        kotlin.jvm.internal.l0.p(key, ProtectedSandApp.s("梉"));
        return D(ProtectedSandApp.s("梊"), key);
    }

    @p3.j
    public final int H(@d5.d p pVar) {
        return L(this, pVar, 0, 2, null);
    }

    @p3.j
    public final int I(@d5.d p other, int fromIndex) {
        kotlin.jvm.internal.l0.p(other, ProtectedSandApp.s("梋"));
        return K(other.N(), fromIndex);
    }

    @p3.j
    public final int J(@d5.d byte[] bArr) {
        return M(this, bArr, 0, 2, null);
    }

    @p3.j
    public int K(@d5.d byte[] other, int fromIndex) {
        kotlin.jvm.internal.l0.p(other, ProtectedSandApp.s("梌"));
        int length = getData().length - other.length;
        int max = Math.max(fromIndex, 0);
        if (max <= length) {
            while (!j.d(getData(), max, other, 0, other.length)) {
                if (max != length) {
                    max++;
                }
            }
            return max;
        }
        return -1;
    }

    @d5.d
    public byte[] N() {
        return getData();
    }

    public byte O(int pos) {
        return getData()[pos];
    }

    @p3.j
    public final int P(@d5.d p pVar) {
        return T(this, pVar, 0, 2, null);
    }

    @p3.j
    public final int Q(@d5.d p other, int fromIndex) {
        kotlin.jvm.internal.l0.p(other, ProtectedSandApp.s("梍"));
        return S(other.N(), fromIndex);
    }

    @p3.j
    public final int R(@d5.d byte[] bArr) {
        return U(this, bArr, 0, 2, null);
    }

    @p3.j
    public int S(@d5.d byte[] other, int fromIndex) {
        kotlin.jvm.internal.l0.p(other, ProtectedSandApp.s("梎"));
        for (int min = Math.min(fromIndex, getData().length - other.length); min >= 0; min--) {
            if (j.d(getData(), min, other, 0, other.length)) {
                return min;
            }
        }
        return -1;
    }

    @d5.d
    public p V() {
        return s(ProtectedSandApp.s("梏"));
    }

    public boolean Z(int offset, @d5.d p other, int otherOffset, int byteCount) {
        kotlin.jvm.internal.l0.p(other, ProtectedSandApp.s("梐"));
        return other.a0(otherOffset, getData(), offset, byteCount);
    }

    public boolean a0(int offset, @d5.d byte[] other, int otherOffset, int byteCount) {
        kotlin.jvm.internal.l0.p(other, ProtectedSandApp.s("梑"));
        return offset >= 0 && offset <= getData().length - byteCount && otherOffset >= 0 && otherOffset <= other.length - byteCount && j.d(getData(), offset, other, otherOffset, byteCount);
    }

    public final void d0(int i5) {
        this.hashCode = i5;
    }

    public final void e0(@d5.e String str) {
        this.utf8 = str;
    }

    public boolean equals(@d5.e Object other) {
        if (other == this) {
            return true;
        }
        if (other instanceof p) {
            p pVar = (p) other;
            if (pVar.i0() == getData().length && pVar.a0(0, getData(), 0, getData().length)) {
                return true;
            }
        }
        return false;
    }

    @d5.d
    public p f0() {
        return s(ProtectedSandApp.s("梒"));
    }

    @p3.i(name = "-deprecated_getByte")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to operator function", replaceWith = @ReplaceWith(expression = "this[index]", imports = {}))
    public final byte g(int index) {
        return x(index);
    }

    @d5.d
    public p g0() {
        return s(ProtectedSandApp.s("梓"));
    }

    @p3.i(name = "-deprecated_size")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "size", imports = {}))
    public final int h() {
        return i0();
    }

    @d5.d
    public p h0() {
        return s(ProtectedSandApp.s("梔"));
    }

    public int hashCode() {
        int hashCode = getHashCode();
        if (hashCode != 0) {
            return hashCode;
        }
        int hashCode2 = Arrays.hashCode(getData());
        d0(hashCode2);
        return hashCode2;
    }

    @p3.i(name = "size")
    public final int i0() {
        return A();
    }

    @d5.d
    public ByteBuffer j() {
        ByteBuffer asReadOnlyBuffer = ByteBuffer.wrap(this.data).asReadOnlyBuffer();
        kotlin.jvm.internal.l0.o(asReadOnlyBuffer, ProtectedSandApp.s("梕"));
        return asReadOnlyBuffer;
    }

    public final boolean j0(@d5.d p prefix) {
        kotlin.jvm.internal.l0.p(prefix, ProtectedSandApp.s("梖"));
        return Z(0, prefix, 0, prefix.i0());
    }

    public final boolean k0(@d5.d byte[] prefix) {
        kotlin.jvm.internal.l0.p(prefix, ProtectedSandApp.s("梗"));
        return a0(0, prefix, 0, prefix.length);
    }

    @d5.d
    public String l() {
        return a.c(getData(), null, 1, null);
    }

    @d5.d
    public String l0(@d5.d Charset charset) {
        kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("梘"));
        return new String(this.data, charset);
    }

    @d5.d
    @p3.j
    public final p m0() {
        return p0(this, 0, 0, 3, null);
    }

    @d5.d
    @p3.j
    public final p n0(int i5) {
        return p0(this, i5, 0, 2, null);
    }

    @d5.d
    public String o() {
        return a.b(getData(), a.e());
    }

    @d5.d
    @p3.j
    public p o0(int beginIndex, int endIndex) {
        byte[] f12;
        if (!(beginIndex >= 0)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("梛").toString());
        }
        if (!(endIndex <= getData().length)) {
            throw new IllegalArgumentException((ProtectedSandApp.s("梚") + getData().length + ')').toString());
        }
        if (!(endIndex - beginIndex >= 0)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("梙").toString());
        }
        if (beginIndex == 0 && endIndex == getData().length) {
            return this;
        }
        f12 = kotlin.collections.p.f1(getData(), beginIndex, endIndex);
        return new p(f12);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:?, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        if (r0 < r1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
    
        if (r7 < r8) goto L13;
     */
    @Override // java.lang.Comparable
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int compareTo(@d5.d okio.p r10) {
        /*
            r9 = this;
            java.lang.String r0 = "梜"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r10, r0)
            int r0 = r9.i0()
            int r1 = r10.i0()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L17:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L2f
            byte r7 = r9.x(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.x(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L2c
            int r4 = r4 + 1
            goto L17
        L2c:
            if (r7 >= r8) goto L36
            goto L34
        L2f:
            if (r0 != r1) goto L32
            goto L37
        L32:
            if (r0 >= r1) goto L36
        L34:
            r3 = r5
            goto L37
        L36:
            r3 = r6
        L37:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.p.compareTo(okio.p):int");
    }

    @d5.d
    public p q0() {
        byte b6;
        for (int i5 = 0; i5 < getData().length; i5++) {
            byte b7 = getData()[i5];
            byte b8 = (byte) 65;
            if (b7 >= b8 && b7 <= (b6 = (byte) 90)) {
                byte[] data = getData();
                byte[] copyOf = Arrays.copyOf(data, data.length);
                kotlin.jvm.internal.l0.o(copyOf, ProtectedSandApp.s("條"));
                copyOf[i5] = (byte) (b7 + 32);
                for (int i6 = i5 + 1; i6 < copyOf.length; i6++) {
                    byte b9 = copyOf[i6];
                    if (b9 >= b8 && b9 <= b6) {
                        copyOf[i6] = (byte) (b9 + 32);
                    }
                }
                return new p(copyOf);
            }
        }
        return this;
    }

    @d5.d
    public p r0() {
        byte b6;
        for (int i5 = 0; i5 < getData().length; i5++) {
            byte b7 = getData()[i5];
            byte b8 = (byte) 97;
            if (b7 >= b8 && b7 <= (b6 = (byte) 122)) {
                byte[] data = getData();
                byte[] copyOf = Arrays.copyOf(data, data.length);
                kotlin.jvm.internal.l0.o(copyOf, ProtectedSandApp.s("梞"));
                copyOf[i5] = (byte) (b7 - 32);
                for (int i6 = i5 + 1; i6 < copyOf.length; i6++) {
                    byte b9 = copyOf[i6];
                    if (b9 >= b8 && b9 <= b6) {
                        copyOf[i6] = (byte) (b9 - 32);
                    }
                }
                return new p(copyOf);
            }
        }
        return this;
    }

    @d5.d
    public p s(@d5.d String algorithm) {
        kotlin.jvm.internal.l0.p(algorithm, ProtectedSandApp.s("梟"));
        byte[] digest = MessageDigest.getInstance(algorithm).digest(this.data);
        kotlin.jvm.internal.l0.o(digest, ProtectedSandApp.s("梠"));
        return new p(digest);
    }

    @d5.d
    public byte[] s0() {
        byte[] data = getData();
        byte[] copyOf = Arrays.copyOf(data, data.length);
        kotlin.jvm.internal.l0.o(copyOf, ProtectedSandApp.s("梡"));
        return copyOf;
    }

    @d5.d
    public String t0() {
        String utf8 = getUtf8();
        if (utf8 != null) {
            return utf8;
        }
        String c6 = i.c(N());
        e0(c6);
        return c6;
    }

    @d5.d
    public String toString() {
        int c6;
        String i22;
        String i23;
        String i24;
        p pVar;
        byte[] f12;
        if (getData().length == 0) {
            return ProtectedSandApp.s("梢");
        }
        c6 = v4.b.c(getData(), 64);
        String s5 = ProtectedSandApp.s("梣");
        String s6 = ProtectedSandApp.s("梤");
        if (c6 != -1) {
            String t02 = t0();
            if (t02 == null) {
                throw new NullPointerException(ProtectedSandApp.s("梱"));
            }
            String substring = t02.substring(0, c6);
            kotlin.jvm.internal.l0.o(substring, ProtectedSandApp.s("梨"));
            i22 = kotlin.text.e0.i2(substring, ProtectedSandApp.s("梩"), ProtectedSandApp.s("梪"), false, 4, null);
            i23 = kotlin.text.e0.i2(i22, ProtectedSandApp.s("梫"), ProtectedSandApp.s("梬"), false, 4, null);
            i24 = kotlin.text.e0.i2(i23, ProtectedSandApp.s("梭"), ProtectedSandApp.s("梮"), false, 4, null);
            if (c6 >= t02.length()) {
                return ProtectedSandApp.s("械") + i24 + ']';
            }
            return s6 + getData().length + ProtectedSandApp.s("梯") + i24 + s5;
        }
        if (getData().length <= 64) {
            return ProtectedSandApp.s("梥") + C() + ']';
        }
        StringBuilder sb = new StringBuilder(s6);
        sb.append(getData().length);
        sb.append(ProtectedSandApp.s("梦"));
        if (!(64 <= getData().length)) {
            throw new IllegalArgumentException((ProtectedSandApp.s("梧") + getData().length + ')').toString());
        }
        if (64 == getData().length) {
            pVar = this;
        } else {
            f12 = kotlin.collections.p.f1(getData(), 0, 64);
            pVar = new p(f12);
        }
        sb.append(pVar.C());
        sb.append(s5);
        return sb.toString();
    }

    public void u0(@d5.d OutputStream outputStream) throws IOException {
        kotlin.jvm.internal.l0.p(outputStream, ProtectedSandApp.s("梲"));
        outputStream.write(this.data);
    }

    public final boolean v(@d5.d p suffix) {
        kotlin.jvm.internal.l0.p(suffix, ProtectedSandApp.s("梳"));
        return Z(i0() - suffix.i0(), suffix, 0, suffix.i0());
    }

    public void v0(@d5.d m buffer, int offset, int byteCount) {
        kotlin.jvm.internal.l0.p(buffer, ProtectedSandApp.s("梴"));
        v4.b.G(this, buffer, offset, byteCount);
    }

    public final boolean w(@d5.d byte[] suffix) {
        kotlin.jvm.internal.l0.p(suffix, ProtectedSandApp.s("梵"));
        return a0(i0() - suffix.length, suffix, 0, suffix.length);
    }

    @p3.i(name = "getByte")
    public final byte x(int index) {
        return O(index);
    }

    @d5.d
    /* renamed from: y, reason: from getter */
    public final byte[] getData() {
        return this.data;
    }

    /* renamed from: z, reason: from getter */
    public final int getHashCode() {
        return this.hashCode;
    }
}
