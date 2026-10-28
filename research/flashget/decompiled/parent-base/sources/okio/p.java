package okio;

import com.flashget.parentalcontrol.ProtectedSandApp;
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
import kotlin.Metadata;
import kotlin.x0;

/* compiled from: ByteString.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0016\u0018\u0000 s2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001dB\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0012J\u000f\u0010\u0018\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u001b\u0010\u0019J\u000f\u0010\u001c\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u001c\u0010\u0019J\u0017\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0010H\u0010¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0000H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0000H\u0016¢\u0006\u0004\b#\u0010\"J\u0017\u0010$\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0000H\u0016¢\u0006\u0004\b$\u0010\"J\u001f\u0010%\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0000H\u0010¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0010H\u0016¢\u0006\u0004\b'\u0010\u0012J\u000f\u0010(\u001a\u00020\u0010H\u0016¢\u0006\u0004\b(\u0010\u0012J\u000f\u0010)\u001a\u00020\u0000H\u0016¢\u0006\u0004\b)\u0010\u0019J\u000f\u0010*\u001a\u00020\u0000H\u0016¢\u0006\u0004\b*\u0010\u0019J#\u0010.\u001a\u00020\u00002\b\b\u0002\u0010,\u001a\u00020+2\b\b\u0002\u0010-\u001a\u00020+H\u0017¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u0002012\u0006\u00100\u001a\u00020+H\u0010¢\u0006\u0004\b2\u00103J\u0018\u00105\u001a\u0002012\u0006\u00104\u001a\u00020+H\u0087\u0002¢\u0006\u0004\b5\u00103J\u000f\u00106\u001a\u00020+H\u0010¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0003H\u0016¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u0003H\u0010¢\u0006\u0004\b:\u00109J\u000f\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b<\u0010=J\u0017\u0010?\u001a\u00020\t2\u0006\u0010\r\u001a\u00020>H\u0016¢\u0006\u0004\b?\u0010@J'\u0010E\u001a\u00020\t2\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u00020+2\u0006\u0010D\u001a\u00020+H\u0010¢\u0006\u0004\bE\u0010FJ/\u0010J\u001a\u00020I2\u0006\u0010C\u001a\u00020+2\u0006\u0010G\u001a\u00020\u00002\u0006\u0010H\u001a\u00020+2\u0006\u0010D\u001a\u00020+H\u0016¢\u0006\u0004\bJ\u0010KJ/\u0010L\u001a\u00020I2\u0006\u0010C\u001a\u00020+2\u0006\u0010G\u001a\u00020\u00032\u0006\u0010H\u001a\u00020+2\u0006\u0010D\u001a\u00020+H\u0016¢\u0006\u0004\bL\u0010MJ\u0015\u0010O\u001a\u00020I2\u0006\u0010N\u001a\u00020\u0000¢\u0006\u0004\bO\u0010PJ\u0015\u0010Q\u001a\u00020I2\u0006\u0010N\u001a\u00020\u0003¢\u0006\u0004\bQ\u0010RJ\u0015\u0010T\u001a\u00020I2\u0006\u0010S\u001a\u00020\u0000¢\u0006\u0004\bT\u0010PJ\u0015\u0010U\u001a\u00020I2\u0006\u0010S\u001a\u00020\u0003¢\u0006\u0004\bU\u0010RJ!\u0010W\u001a\u00020+2\u0006\u0010G\u001a\u00020\u00002\b\b\u0002\u0010V\u001a\u00020+H\u0007¢\u0006\u0004\bW\u0010XJ!\u0010Y\u001a\u00020+2\u0006\u0010G\u001a\u00020\u00032\b\b\u0002\u0010V\u001a\u00020+H\u0017¢\u0006\u0004\bY\u0010ZJ!\u0010[\u001a\u00020+2\u0006\u0010G\u001a\u00020\u00002\b\b\u0002\u0010V\u001a\u00020+H\u0007¢\u0006\u0004\b[\u0010XJ!\u0010\\\u001a\u00020+2\u0006\u0010G\u001a\u00020\u00032\b\b\u0002\u0010V\u001a\u00020+H\u0017¢\u0006\u0004\b\\\u0010ZJ\u001a\u0010^\u001a\u00020I2\b\u0010G\u001a\u0004\u0018\u00010]H\u0096\u0002¢\u0006\u0004\b^\u0010_J\u000f\u0010`\u001a\u00020+H\u0016¢\u0006\u0004\b`\u00107J\u0018\u0010a\u001a\u00020+2\u0006\u0010G\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\ba\u0010bJ\u000f\u0010c\u001a\u00020\u0010H\u0016¢\u0006\u0004\bc\u0010\u0012J\u0017\u0010d\u001a\u0002012\u0006\u00104\u001a\u00020+H\u0007¢\u0006\u0004\bd\u00103J\u000f\u0010e\u001a\u00020+H\u0007¢\u0006\u0004\be\u00107R\"\u0010`\u001a\u00020+8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\bg\u00107\"\u0004\bh\u0010iR$\u0010n\u001a\u0004\u0018\u00010\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b<\u0010j\u001a\u0004\bk\u0010\u0012\"\u0004\bl\u0010mR\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010o\u001a\u0004\bp\u00109R\u0011\u0010r\u001a\u00020+8G¢\u0006\u0006\u001a\u0004\bq\u00107¨\u0006t"}, d2 = {"Lokio/p;", "Ljava/io/Serializable;", "", "", "data", "<init>", "([B)V", "Ljava/io/ObjectInputStream;", "in", "Lkotlin/k2;", "X", "(Ljava/io/ObjectInputStream;)V", "Ljava/io/ObjectOutputStream;", "out", "s0", "(Ljava/io/ObjectOutputStream;)V", "", "o0", "()Ljava/lang/String;", "Ljava/nio/charset/Charset;", "charset", "g0", "(Ljava/nio/charset/Charset;)Ljava/lang/String;", "d", "Q", "()Lokio/p;", "a0", "b0", "c0", "algorithm", "i", "(Ljava/lang/String;)Lokio/p;", "key", "u", "(Lokio/p;)Lokio/p;", "v", "w", "t", "(Ljava/lang/String;Lokio/p;)Lokio/p;", "e", "s", "l0", "m0", "", "beginIndex", "endIndex", "j0", "(II)Lokio/p;", "pos", "", "G", "(I)B", "index", "n", "q", "()I", "n0", "()[B", "E", "Ljava/nio/ByteBuffer;", "c", "()Ljava/nio/ByteBuffer;", "Ljava/io/OutputStream;", "p0", "(Ljava/io/OutputStream;)V", "Lokio/m;", "buffer", "offset", "byteCount", "r0", "(Lokio/m;II)V", "other", "otherOffset", "", "U", "(ILokio/p;II)Z", "V", "(I[BII)Z", "prefix", "e0", "(Lokio/p;)Z", "f0", "([B)Z", "suffix", "l", "m", "fromIndex", "y", "(Lokio/p;I)I", "A", "([BI)I", "K", "M", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "f", "(Lokio/p;)I", "toString", "a", "b", "I", "p", "Y", "(I)V", "Ljava/lang/String;", "r", "Z", "(Ljava/lang/String;)V", "utf8", "[B", "o", "d0", "size", "g", "okio"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public class p implements Serializable, Comparable<p> {

    /* renamed from: e, reason: collision with root package name */
    private static final long f85243e = 1;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private transient int hashCode;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private transient String utf8;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final byte[] data;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final p f85244f = new p(new byte[0]);

    /* compiled from: ByteString.kt */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00020\u0004\"\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ'\u0010\r\u001a\u00020\u0007*\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u0007*\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0013\u001a\u00020\u0007*\u00020\u0012H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\u00020\u0007*\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u0007*\u00020\u0012H\u0007¢\u0006\u0004\b\u0019\u0010\u0014J\u0013\u0010\u001a\u001a\u00020\u0007*\u00020\u0012H\u0007¢\u0006\u0004\b\u001a\u0010\u0014J\u001b\u0010\u001c\u001a\u00020\u0007*\u00020\u001b2\u0006\u0010\f\u001a\u00020\nH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001e\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u001f\u0010\u0014J\u0017\u0010 \u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0012H\u0007¢\u0006\u0004\b \u0010\u0014J\u001f\u0010!\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b!\u0010\u0018J\u0017\u0010\"\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\"\u0010\u0014J\u0017\u0010$\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u000fH\u0007¢\u0006\u0004\b$\u0010\u0011J'\u0010&\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0007¢\u0006\u0004\b&\u0010\u000eJ\u001f\u0010(\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\nH\u0007¢\u0006\u0004\b(\u0010\u001dR\u0014\u0010)\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, d2 = {"Lokio/p$a;", "", "<init>", "()V", "", "", "data", "Lokio/p;", "n", "([B)Lokio/p;", "", "offset", "byteCount", "o", "([BII)Lokio/p;", "Ljava/nio/ByteBuffer;", "m", "(Ljava/nio/ByteBuffer;)Lokio/p;", "", "l", "(Ljava/lang/String;)Lokio/p;", "Ljava/nio/charset/Charset;", "charset", "j", "(Ljava/lang/String;Ljava/nio/charset/Charset;)Lokio/p;", "h", "i", "Ljava/io/InputStream;", "q", "(Ljava/io/InputStream;I)Lokio/p;", "string", "a", "b", "c", "d", "buffer", "e", "array", "f", "inputstream", "g", "EMPTY", "Lokio/p;", "", "serialVersionUID", "J", "okio"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okio.p$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ p k(Companion companion, String str, Charset charset, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                charset = kotlin.text.f.UTF_8;
            }
            return companion.j(str, charset);
        }

        public static /* synthetic */ p p(Companion companion, byte[] bArr, int i4, int i5, int i6, Object obj) {
            if ((i6 & 1) != 0) {
                i4 = 0;
            }
            if ((i6 & 2) != 0) {
                i5 = bArr.length;
            }
            return companion.o(bArr, i4, i5);
        }

        @fg.m
        @kotlin.k(level = kotlin.m.ERROR, message = "moved to extension function", replaceWith = @x0(expression = "string.decodeBase64()", imports = {"okio.ByteString.Companion.decodeBase64"}))
        @kd.i(name = "-deprecated_decodeBase64")
        public final p a(@fg.l String string) {
            kotlin.jvm.internal.l0.p(string, ProtectedSandApp.s("\u2004"));
            return h(string);
        }

        @fg.l
        @kotlin.k(level = kotlin.m.ERROR, message = "moved to extension function", replaceWith = @x0(expression = "string.decodeHex()", imports = {"okio.ByteString.Companion.decodeHex"}))
        @kd.i(name = "-deprecated_decodeHex")
        public final p b(@fg.l String string) {
            kotlin.jvm.internal.l0.p(string, ProtectedSandApp.s("\u2004"));
            return i(string);
        }

        @fg.l
        @kotlin.k(level = kotlin.m.ERROR, message = "moved to extension function", replaceWith = @x0(expression = "string.encode(charset)", imports = {"okio.ByteString.Companion.encode"}))
        @kd.i(name = "-deprecated_encodeString")
        public final p c(@fg.l String string, @fg.l Charset charset) {
            kotlin.jvm.internal.l0.p(string, ProtectedSandApp.s("\u2004"));
            kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("\u2005"));
            return j(string, charset);
        }

        @fg.l
        @kotlin.k(level = kotlin.m.ERROR, message = "moved to extension function", replaceWith = @x0(expression = "string.encodeUtf8()", imports = {"okio.ByteString.Companion.encodeUtf8"}))
        @kd.i(name = "-deprecated_encodeUtf8")
        public final p d(@fg.l String string) {
            kotlin.jvm.internal.l0.p(string, ProtectedSandApp.s("\u2004"));
            return l(string);
        }

        @fg.l
        @kotlin.k(level = kotlin.m.ERROR, message = "moved to extension function", replaceWith = @x0(expression = "buffer.toByteString()", imports = {"okio.ByteString.Companion.toByteString"}))
        @kd.i(name = "-deprecated_of")
        public final p e(@fg.l ByteBuffer buffer) {
            kotlin.jvm.internal.l0.p(buffer, ProtectedSandApp.s("\u2006"));
            return m(buffer);
        }

        @fg.l
        @kotlin.k(level = kotlin.m.ERROR, message = "moved to extension function", replaceWith = @x0(expression = "array.toByteString(offset, byteCount)", imports = {"okio.ByteString.Companion.toByteString"}))
        @kd.i(name = "-deprecated_of")
        public final p f(@fg.l byte[] array, int offset, int byteCount) {
            kotlin.jvm.internal.l0.p(array, ProtectedSandApp.s(" "));
            return o(array, offset, byteCount);
        }

        @fg.l
        @kotlin.k(level = kotlin.m.ERROR, message = "moved to extension function", replaceWith = @x0(expression = "inputstream.readByteString(byteCount)", imports = {"okio.ByteString.Companion.readByteString"}))
        @kd.i(name = "-deprecated_read")
        public final p g(@fg.l InputStream inputstream, int byteCount) {
            kotlin.jvm.internal.l0.p(inputstream, ProtectedSandApp.s("\u2008"));
            return q(inputstream, byteCount);
        }

        @fg.m
        @kd.n
        public final p h(@fg.l String str) {
            kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("\u2009"));
            byte[] a5 = a.a(str);
            if (a5 != null) {
                return new p(a5);
            }
            return null;
        }

        @fg.l
        @kd.n
        public final p i(@fg.l String str) {
            int H;
            int H2;
            kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("\u200a"));
            if (!(str.length() % 2 == 0)) {
                throw new IllegalArgumentException(ProtectedSandApp.s("\u200b").concat(str).toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i4 = 0; i4 < length; i4++) {
                int i5 = i4 * 2;
                H = ve.b.H(str.charAt(i5));
                H2 = ve.b.H(str.charAt(i5 + 1));
                bArr[i4] = (byte) (H2 + (H << 4));
            }
            return new p(bArr);
        }

        @fg.l
        @kd.n
        @kd.i(name = "encodeString")
        public final p j(@fg.l String str, @fg.l Charset charset) {
            kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("\u200c"));
            kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("\u2005"));
            byte[] bytes = str.getBytes(charset);
            kotlin.jvm.internal.l0.o(bytes, ProtectedSandApp.s("\u200d"));
            return new p(bytes);
        }

        @fg.l
        @kd.n
        public final p l(@fg.l String str) {
            kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("\u200e"));
            p pVar = new p(i.a(str));
            pVar.Z(str);
            return pVar;
        }

        @fg.l
        @kd.n
        @kd.i(name = "of")
        public final p m(@fg.l ByteBuffer byteBuffer) {
            kotlin.jvm.internal.l0.p(byteBuffer, ProtectedSandApp.s("\u200f"));
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            return new p(bArr);
        }

        @fg.l
        @kd.n
        public final p n(@fg.l byte... data) {
            kotlin.jvm.internal.l0.p(data, ProtectedSandApp.s("‐"));
            byte[] copyOf = Arrays.copyOf(data, data.length);
            kotlin.jvm.internal.l0.o(copyOf, ProtectedSandApp.s("‑"));
            return new p(copyOf);
        }

        @fg.l
        @kd.n
        @kd.i(name = "of")
        public final p o(@fg.l byte[] bArr, int i4, int i5) {
            kotlin.jvm.internal.l0.p(bArr, ProtectedSandApp.s("\u200f"));
            j.e(bArr.length, i4, i5);
            return new p(kotlin.collections.l.f1(bArr, i4, i5 + i4));
        }

        @fg.l
        @kd.n
        @kd.i(name = "read")
        public final p q(@fg.l InputStream inputStream, int i4) throws IOException {
            kotlin.jvm.internal.l0.p(inputStream, ProtectedSandApp.s("‒"));
            int i5 = 0;
            if (!(i4 >= 0)) {
                throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("–"), i4).toString());
            }
            byte[] bArr = new byte[i4];
            while (i5 < i4) {
                int read = inputStream.read(bArr, i5, i4 - i5);
                if (read == -1) {
                    throw new EOFException();
                }
                i5 += read;
            }
            return new p(bArr);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.w wVar) {
            this();
        }
    }

    public p(@fg.l byte[] bArr) {
        kotlin.jvm.internal.l0.p(bArr, ProtectedSandApp.s("ᾃ"));
        this.data = bArr;
    }

    public static /* synthetic */ int B(p pVar, p pVar2, int i4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("ᾄ"));
        }
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        return pVar.y(pVar2, i4);
    }

    public static /* synthetic */ int C(p pVar, byte[] bArr, int i4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("ᾄ"));
        }
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        return pVar.A(bArr, i4);
    }

    public static int N(p pVar, p pVar2, int i4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("ᾅ"));
        }
        if ((i5 & 2) != 0) {
            i4 = pVar.q();
        }
        return pVar.K(pVar2, i4);
    }

    public static int P(p pVar, byte[] bArr, int i4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("ᾅ"));
        }
        if ((i5 & 2) != 0) {
            i4 = pVar.q();
        }
        return pVar.M(bArr, i4);
    }

    @fg.l
    @kd.n
    @kd.i(name = "of")
    public static final p R(@fg.l ByteBuffer byteBuffer) {
        return INSTANCE.m(byteBuffer);
    }

    @fg.l
    @kd.n
    public static final p S(@fg.l byte... bArr) {
        return INSTANCE.n(bArr);
    }

    @fg.l
    @kd.n
    @kd.i(name = "of")
    public static final p T(@fg.l byte[] bArr, int i4, int i5) {
        return INSTANCE.o(bArr, i4, i5);
    }

    @fg.l
    @kd.n
    @kd.i(name = "read")
    public static final p W(@fg.l InputStream inputStream, int i4) throws IOException {
        return INSTANCE.q(inputStream, i4);
    }

    private final void X(ObjectInputStream in) throws IOException {
        p q4 = INSTANCE.q(in, in.readInt());
        Field declaredField = p.class.getDeclaredField(ProtectedSandApp.s("ᾆ"));
        kotlin.jvm.internal.l0.o(declaredField, ProtectedSandApp.s("ᾇ"));
        declaredField.setAccessible(true);
        declaredField.set(this, q4.data);
    }

    @fg.m
    @kd.n
    public static final p g(@fg.l String str) {
        return INSTANCE.h(str);
    }

    @fg.l
    @kd.n
    public static final p h(@fg.l String str) {
        return INSTANCE.i(str);
    }

    @fg.l
    @kd.n
    @kd.i(name = "encodeString")
    public static final p j(@fg.l String str, @fg.l Charset charset) {
        return INSTANCE.j(str, charset);
    }

    @fg.l
    @kd.n
    public static final p k(@fg.l String str) {
        return INSTANCE.l(str);
    }

    public static p k0(p pVar, int i4, int i5, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("ᾈ"));
        }
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = pVar.q();
        }
        return pVar.j0(i4, i5);
    }

    private final void s0(ObjectOutputStream out) throws IOException {
        out.writeInt(this.data.length);
        out.write(this.data);
    }

    @kd.j
    public int A(@fg.l byte[] other, int fromIndex) {
        kotlin.jvm.internal.l0.p(other, ProtectedSandApp.s("ᾉ"));
        int length = this.data.length - other.length;
        int max = Math.max(fromIndex, 0);
        if (max <= length) {
            while (!j.d(this.data, max, other, 0, other.length)) {
                if (max != length) {
                    max++;
                }
            }
            return max;
        }
        return -1;
    }

    @fg.l
    /* renamed from: E, reason: from getter */
    public byte[] getData() {
        return this.data;
    }

    public byte G(int pos) {
        return this.data[pos];
    }

    @kd.j
    public final int J(@fg.l p pVar) {
        return N(this, pVar, 0, 2, null);
    }

    @kd.j
    public final int K(@fg.l p other, int fromIndex) {
        kotlin.jvm.internal.l0.p(other, ProtectedSandApp.s("ᾉ"));
        return M(other.getData(), fromIndex);
    }

    @kd.j
    public final int L(@fg.l byte[] bArr) {
        return P(this, bArr, 0, 2, null);
    }

    @kd.j
    public int M(@fg.l byte[] other, int fromIndex) {
        kotlin.jvm.internal.l0.p(other, ProtectedSandApp.s("ᾉ"));
        for (int min = Math.min(fromIndex, this.data.length - other.length); min >= 0; min--) {
            if (j.d(this.data, min, other, 0, other.length)) {
                return min;
            }
        }
        return -1;
    }

    @fg.l
    public p Q() {
        return i(ProtectedSandApp.s("ᾊ"));
    }

    public boolean U(int offset, @fg.l p other, int otherOffset, int byteCount) {
        kotlin.jvm.internal.l0.p(other, ProtectedSandApp.s("ᾉ"));
        return other.V(otherOffset, this.data, offset, byteCount);
    }

    public boolean V(int offset, @fg.l byte[] other, int otherOffset, int byteCount) {
        kotlin.jvm.internal.l0.p(other, ProtectedSandApp.s("ᾉ"));
        if (offset >= 0) {
            byte[] bArr = this.data;
            if (offset <= bArr.length - byteCount && otherOffset >= 0 && otherOffset <= other.length - byteCount && j.d(bArr, offset, other, otherOffset, byteCount)) {
                return true;
            }
        }
        return false;
    }

    public final void Y(int i4) {
        this.hashCode = i4;
    }

    public final void Z(@fg.m String str) {
        this.utf8 = str;
    }

    @kotlin.k(level = kotlin.m.ERROR, message = "moved to operator function", replaceWith = @x0(expression = "this[index]", imports = {}))
    @kd.i(name = "-deprecated_getByte")
    public final byte a(int index) {
        return G(index);
    }

    @fg.l
    public p a0() {
        return i(ProtectedSandApp.s("ᾋ"));
    }

    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "size", imports = {}))
    @kd.i(name = "-deprecated_size")
    public final int b() {
        return q();
    }

    @fg.l
    public p b0() {
        return i(ProtectedSandApp.s("ᾌ"));
    }

    @fg.l
    public ByteBuffer c() {
        ByteBuffer asReadOnlyBuffer = ByteBuffer.wrap(this.data).asReadOnlyBuffer();
        kotlin.jvm.internal.l0.o(asReadOnlyBuffer, ProtectedSandApp.s("ᾍ"));
        return asReadOnlyBuffer;
    }

    @fg.l
    public p c0() {
        return i(ProtectedSandApp.s("ᾎ"));
    }

    @fg.l
    public String d() {
        return a.c(this.data, null, 1, null);
    }

    @kd.i(name = "size")
    public final int d0() {
        return q();
    }

    @fg.l
    public String e() {
        return a.b(this.data, a.e());
    }

    public final boolean e0(@fg.l p prefix) {
        kotlin.jvm.internal.l0.p(prefix, ProtectedSandApp.s("ᾏ"));
        return U(0, prefix, 0, prefix.q());
    }

    public boolean equals(@fg.m Object other) {
        if (other == this) {
            return true;
        }
        if (other instanceof p) {
            p pVar = (p) other;
            int q4 = pVar.q();
            byte[] bArr = this.data;
            if (q4 == bArr.length && pVar.V(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        if (r0 < r1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
    
        if (r7 < r8) goto L9;
     */
    @Override // java.lang.Comparable
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int compareTo(@fg.l okio.p r10) {
        /*
            r9 = this;
            java.lang.String r0 = "ᾉ"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r10, r0)
            int r0 = r9.q()
            int r1 = r10.q()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L17:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L32
            byte r7 = r9.G(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.G(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L2c
            int r4 = r4 + 1
            goto L17
        L2c:
            if (r7 >= r8) goto L30
        L2e:
            r3 = r5
            goto L38
        L30:
            r3 = r6
            goto L38
        L32:
            if (r0 != r1) goto L35
            goto L38
        L35:
            if (r0 >= r1) goto L30
            goto L2e
        L38:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.p.compareTo(okio.p):int");
    }

    public final boolean f0(@fg.l byte[] prefix) {
        kotlin.jvm.internal.l0.p(prefix, ProtectedSandApp.s("ᾏ"));
        return V(0, prefix, 0, prefix.length);
    }

    @fg.l
    public String g0(@fg.l Charset charset) {
        kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("ᾐ"));
        return new String(this.data, charset);
    }

    @fg.l
    @kd.j
    public final p h0() {
        return k0(this, 0, 0, 3, null);
    }

    public int hashCode() {
        int i4 = this.hashCode;
        if (i4 != 0) {
            return i4;
        }
        int hashCode = Arrays.hashCode(this.data);
        this.hashCode = hashCode;
        return hashCode;
    }

    @fg.l
    public p i(@fg.l String algorithm) {
        kotlin.jvm.internal.l0.p(algorithm, ProtectedSandApp.s("ᾑ"));
        byte[] digest = MessageDigest.getInstance(algorithm).digest(this.data);
        kotlin.jvm.internal.l0.o(digest, ProtectedSandApp.s("ᾒ"));
        return new p(digest);
    }

    @fg.l
    @kd.j
    public final p i0(int i4) {
        return k0(this, i4, 0, 2, null);
    }

    @fg.l
    @kd.j
    public p j0(int beginIndex, int endIndex) {
        if (!(beginIndex >= 0)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ᾕ"));
        }
        byte[] bArr = this.data;
        if (!(endIndex <= bArr.length)) {
            throw new IllegalArgumentException(androidx.view.e.a(new StringBuilder(ProtectedSandApp.s("ᾔ")), this.data.length, ')').toString());
        }
        if (endIndex - beginIndex >= 0) {
            return (beginIndex == 0 && endIndex == bArr.length) ? this : new p(kotlin.collections.l.f1(bArr, beginIndex, endIndex));
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("ᾓ"));
    }

    public final boolean l(@fg.l p suffix) {
        kotlin.jvm.internal.l0.p(suffix, ProtectedSandApp.s("ᾖ"));
        return U(q() - suffix.q(), suffix, 0, suffix.q());
    }

    @fg.l
    public p l0() {
        byte b5;
        int i4 = 0;
        while (true) {
            byte[] bArr = this.data;
            if (i4 >= bArr.length) {
                return this;
            }
            byte b6 = bArr[i4];
            byte b7 = (byte) 65;
            if (b6 >= b7 && b6 <= (b5 = (byte) 90)) {
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                kotlin.jvm.internal.l0.o(copyOf, ProtectedSandApp.s("ᾗ"));
                copyOf[i4] = (byte) (b6 + 32);
                for (int i5 = i4 + 1; i5 < copyOf.length; i5++) {
                    byte b10 = copyOf[i5];
                    if (b10 >= b7 && b10 <= b5) {
                        copyOf[i5] = (byte) (b10 + 32);
                    }
                }
                return new p(copyOf);
            }
            i4++;
        }
    }

    public final boolean m(@fg.l byte[] suffix) {
        kotlin.jvm.internal.l0.p(suffix, ProtectedSandApp.s("ᾖ"));
        return V(q() - suffix.length, suffix, 0, suffix.length);
    }

    @fg.l
    public p m0() {
        byte b5;
        int i4 = 0;
        while (true) {
            byte[] bArr = this.data;
            if (i4 >= bArr.length) {
                return this;
            }
            byte b6 = bArr[i4];
            byte b7 = (byte) 97;
            if (b6 >= b7 && b6 <= (b5 = (byte) 122)) {
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                kotlin.jvm.internal.l0.o(copyOf, ProtectedSandApp.s("ᾗ"));
                copyOf[i4] = (byte) (b6 - 32);
                for (int i5 = i4 + 1; i5 < copyOf.length; i5++) {
                    byte b10 = copyOf[i5];
                    if (b10 >= b7 && b10 <= b5) {
                        copyOf[i5] = (byte) (b10 - 32);
                    }
                }
                return new p(copyOf);
            }
            i4++;
        }
    }

    @kd.i(name = "getByte")
    public final byte n(int index) {
        return G(index);
    }

    @fg.l
    public byte[] n0() {
        byte[] bArr = this.data;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        kotlin.jvm.internal.l0.o(copyOf, ProtectedSandApp.s("ᾗ"));
        return copyOf;
    }

    @fg.l
    public final byte[] o() {
        return this.data;
    }

    @fg.l
    public String o0() {
        String str = this.utf8;
        if (str != null) {
            return str;
        }
        String c5 = i.c(getData());
        this.utf8 = c5;
        return c5;
    }

    /* renamed from: p, reason: from getter */
    public final int getHashCode() {
        return this.hashCode;
    }

    public void p0(@fg.l OutputStream out) throws IOException {
        kotlin.jvm.internal.l0.p(out, ProtectedSandApp.s("ᾘ"));
        out.write(this.data);
    }

    public int q() {
        return this.data.length;
    }

    @fg.m
    /* renamed from: r, reason: from getter */
    public final String getUtf8() {
        return this.utf8;
    }

    public void r0(@fg.l m buffer, int offset, int byteCount) {
        kotlin.jvm.internal.l0.p(buffer, ProtectedSandApp.s("ᾙ"));
        ve.b.G(this, buffer, offset, byteCount);
    }

    @fg.l
    public String s() {
        byte[] bArr = this.data;
        char[] cArr = new char[bArr.length * 2];
        int i4 = 0;
        for (byte b5 : bArr) {
            int i5 = i4 + 1;
            cArr[i4] = ve.b.I()[(b5 >> 4) & 15];
            i4 += 2;
            cArr[i5] = ve.b.I()[b5 & com.google.common.base.c.f54871q];
        }
        return new String(cArr);
    }

    @fg.l
    public p t(@fg.l String algorithm, @fg.l p key) {
        kotlin.jvm.internal.l0.p(algorithm, ProtectedSandApp.s("ᾑ"));
        kotlin.jvm.internal.l0.p(key, ProtectedSandApp.s("ᾚ"));
        try {
            Mac mac = Mac.getInstance(algorithm);
            mac.init(new SecretKeySpec(key.n0(), algorithm));
            byte[] doFinal = mac.doFinal(this.data);
            kotlin.jvm.internal.l0.o(doFinal, ProtectedSandApp.s("ᾛ"));
            return new p(doFinal);
        } catch (InvalidKeyException e4) {
            throw new IllegalArgumentException(e4);
        }
    }

    @fg.l
    public String toString() {
        int c5;
        byte[] bArr = this.data;
        if (bArr.length == 0) {
            return ProtectedSandApp.s("ᾜ");
        }
        c5 = ve.b.c(bArr, 64);
        String s4 = ProtectedSandApp.s("ᾝ");
        String s5 = ProtectedSandApp.s("ᾞ");
        if (c5 != -1) {
            String o02 = o0();
            if (o02 == null) {
                throw new NullPointerException(ProtectedSandApp.s("ᾪ"));
            }
            String substring = o02.substring(0, c5);
            kotlin.jvm.internal.l0.o(substring, ProtectedSandApp.s("ᾡ"));
            String i22 = kotlin.text.v.i2(kotlin.text.v.i2(kotlin.text.v.i2(substring, ProtectedSandApp.s("ᾢ"), ProtectedSandApp.s("ᾣ"), false, 4, null), ProtectedSandApp.s("ᾤ"), ProtectedSandApp.s("ᾥ"), false, 4, null), ProtectedSandApp.s("ᾦ"), ProtectedSandApp.s("ᾧ"), false, 4, null);
            if (c5 < o02.length()) {
                return androidx.compose.runtime.changelist.a.a(new StringBuilder(s5), this.data.length, ProtectedSandApp.s("ᾨ"), i22, s4);
            }
            return ProtectedSandApp.s("ᾩ") + i22 + ']';
        }
        if (this.data.length <= 64) {
            return ProtectedSandApp.s("ᾟ") + s() + ']';
        }
        StringBuilder sb = new StringBuilder(s5);
        sb.append(this.data.length);
        sb.append(ProtectedSandApp.s("ᾠ"));
        byte[] bArr2 = this.data;
        if (!(64 <= bArr2.length)) {
            throw new IllegalArgumentException(androidx.view.e.a(new StringBuilder(ProtectedSandApp.s("ᾔ")), this.data.length, ')').toString());
        }
        sb.append((64 == bArr2.length ? this : new p(kotlin.collections.l.f1(bArr2, 0, 64))).s());
        sb.append(s4);
        return sb.toString();
    }

    @fg.l
    public p u(@fg.l p key) {
        kotlin.jvm.internal.l0.p(key, ProtectedSandApp.s("ᾚ"));
        return t(ProtectedSandApp.s("ᾫ"), key);
    }

    @fg.l
    public p v(@fg.l p key) {
        kotlin.jvm.internal.l0.p(key, ProtectedSandApp.s("ᾚ"));
        return t(ProtectedSandApp.s("ᾬ"), key);
    }

    @fg.l
    public p w(@fg.l p key) {
        kotlin.jvm.internal.l0.p(key, ProtectedSandApp.s("ᾚ"));
        return t(ProtectedSandApp.s("ᾭ"), key);
    }

    @kd.j
    public final int x(@fg.l p pVar) {
        return B(this, pVar, 0, 2, null);
    }

    @kd.j
    public final int y(@fg.l p other, int fromIndex) {
        kotlin.jvm.internal.l0.p(other, ProtectedSandApp.s("ᾉ"));
        return A(other.getData(), fromIndex);
    }

    @kd.j
    public final int z(@fg.l byte[] bArr) {
        return C(this, bArr, 0, 2, null);
    }
}
