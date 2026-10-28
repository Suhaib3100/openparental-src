package okio;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
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
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import kotlin.text.Typography;

/* compiled from: Buffer.kt */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\n\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u009e\u0001B\t¢\u0006\u0006\bª\u0001\u0010«\u0001J \u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002J\b\u0010\u0013\u001a\u00020\u0000H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0016\u001a\u00020\u0000H\u0016J\b\u0010\u0017\u001a\u00020\u0000H\u0016J\b\u0010\u0018\u001a\u00020\tH\u0016J\u0010\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\u001a\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\u001b\u001a\u00020\u0001H\u0016J\b\u0010\u001c\u001a\u00020\u0005H\u0016J$\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00142\b\b\u0002\u0010\u001e\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007J \u0010 \u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u001e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J\u0018\u0010!\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u001e\u001a\u00020\u0007J\u001a\u0010\"\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00142\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007J\u000e\u0010#\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005J\u0016\u0010$\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010%\u001a\u00020\u0007J\b\u0010'\u001a\u00020&H\u0016J\u0018\u0010)\u001a\u00020&2\u0006\u0010(\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0004\b)\u0010*J\b\u0010,\u001a\u00020+H\u0016J\b\u0010.\u001a\u00020-H\u0016J\b\u0010/\u001a\u00020\u0007H\u0016J\b\u00100\u001a\u00020+H\u0016J\b\u00101\u001a\u00020-H\u0016J\b\u00102\u001a\u00020\u0007H\u0016J\b\u00103\u001a\u00020\u0007H\u0016J\b\u00104\u001a\u00020\u0007H\u0016J\b\u00105\u001a\u00020\u000fH\u0016J\u0010\u00106\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u00109\u001a\u00020-2\u0006\u00108\u001a\u000207H\u0016J\u0018\u0010;\u001a\u00020\u000b2\u0006\u0010:\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010=\u001a\u00020\u00072\u0006\u0010:\u001a\u00020<H\u0016J\b\u0010>\u001a\u00020\rH\u0016J\u0010\u0010?\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010B\u001a\u00020\r2\u0006\u0010A\u001a\u00020@H\u0016J\u0018\u0010C\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010A\u001a\u00020@H\u0016J\n\u0010D\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010E\u001a\u00020\rH\u0016J\u0010\u0010G\u001a\u00020\r2\u0006\u0010F\u001a\u00020\u0007H\u0016J\b\u0010H\u001a\u00020-H\u0016J\b\u0010J\u001a\u00020IH\u0016J\u0010\u0010K\u001a\u00020I2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010L\u001a\u00020-2\u0006\u0010:\u001a\u00020IH\u0016J\u0010\u0010M\u001a\u00020\u000b2\u0006\u0010:\u001a\u00020IH\u0016J \u0010L\u001a\u00020-2\u0006\u0010:\u001a\u00020I2\u0006\u0010\u001e\u001a\u00020-2\u0006\u0010\b\u001a\u00020-H\u0016J\u0010\u0010L\u001a\u00020-2\u0006\u0010:\u001a\u00020NH\u0016J\u0006\u0010O\u001a\u00020\u000bJ\u0010\u0010P\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010R\u001a\u00020\u00002\u0006\u0010Q\u001a\u00020\u000fH\u0016J \u0010S\u001a\u00020\u00002\u0006\u0010Q\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020-2\u0006\u0010\b\u001a\u00020-H\u0016J\u0010\u0010U\u001a\u00020\u00002\u0006\u0010T\u001a\u00020\rH\u0016J \u0010X\u001a\u00020\u00002\u0006\u0010T\u001a\u00020\r2\u0006\u0010V\u001a\u00020-2\u0006\u0010W\u001a\u00020-H\u0016J\u0010\u0010Z\u001a\u00020\u00002\u0006\u0010Y\u001a\u00020-H\u0016J\u0018\u0010[\u001a\u00020\u00002\u0006\u0010T\u001a\u00020\r2\u0006\u0010A\u001a\u00020@H\u0016J(\u0010\\\u001a\u00020\u00002\u0006\u0010T\u001a\u00020\r2\u0006\u0010V\u001a\u00020-2\u0006\u0010W\u001a\u00020-2\u0006\u0010A\u001a\u00020@H\u0016J\u0010\u0010^\u001a\u00020\u00002\u0006\u0010]\u001a\u00020IH\u0016J \u0010_\u001a\u00020\u00002\u0006\u0010]\u001a\u00020I2\u0006\u0010\u001e\u001a\u00020-2\u0006\u0010\b\u001a\u00020-H\u0016J\u0010\u0010`\u001a\u00020-2\u0006\u0010]\u001a\u00020NH\u0016J\u0010\u0010b\u001a\u00020\u00072\u0006\u0010]\u001a\u00020aH\u0016J\u0018\u0010c\u001a\u00020\u00002\u0006\u0010]\u001a\u00020a2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010e\u001a\u00020\u00002\u0006\u0010d\u001a\u00020-H\u0016J\u0010\u0010g\u001a\u00020\u00002\u0006\u0010f\u001a\u00020-H\u0016J\u0010\u0010h\u001a\u00020\u00002\u0006\u0010f\u001a\u00020-H\u0016J\u0010\u0010j\u001a\u00020\u00002\u0006\u0010i\u001a\u00020-H\u0016J\u0010\u0010k\u001a\u00020\u00002\u0006\u0010i\u001a\u00020-H\u0016J\u0010\u0010l\u001a\u00020\u00002\u0006\u00106\u001a\u00020\u0007H\u0016J\u0010\u0010m\u001a\u00020\u00002\u0006\u00106\u001a\u00020\u0007H\u0016J\u0010\u0010n\u001a\u00020\u00002\u0006\u00106\u001a\u00020\u0007H\u0016J\u0010\u0010o\u001a\u00020\u00002\u0006\u00106\u001a\u00020\u0007H\u0016J\u0017\u0010r\u001a\u00020q2\u0006\u0010p\u001a\u00020-H\u0000¢\u0006\u0004\br\u0010sJ\u0018\u0010t\u001a\u00020\u000b2\u0006\u0010]\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010u\u001a\u00020\u00072\u0006\u0010:\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010v\u001a\u00020\u00072\u0006\u0010d\u001a\u00020&H\u0016J\u0018\u0010x\u001a\u00020\u00072\u0006\u0010d\u001a\u00020&2\u0006\u0010w\u001a\u00020\u0007H\u0016J \u0010z\u001a\u00020\u00072\u0006\u0010d\u001a\u00020&2\u0006\u0010w\u001a\u00020\u00072\u0006\u0010y\u001a\u00020\u0007H\u0016J\u0010\u0010|\u001a\u00020\u00072\u0006\u0010{\u001a\u00020\u000fH\u0016J\u0018\u0010}\u001a\u00020\u00072\u0006\u0010{\u001a\u00020\u000f2\u0006\u0010w\u001a\u00020\u0007H\u0016J\u0010\u0010\u007f\u001a\u00020\u00072\u0006\u0010~\u001a\u00020\u000fH\u0016J\u0019\u0010\u0080\u0001\u001a\u00020\u00072\u0006\u0010~\u001a\u00020\u000f2\u0006\u0010w\u001a\u00020\u0007H\u0016J\u0019\u0010\u0081\u0001\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010{\u001a\u00020\u000fH\u0016J*\u0010\u0083\u0001\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010{\u001a\u00020\u000f2\u0007\u0010\u0082\u0001\u001a\u00020-2\u0006\u0010\b\u001a\u00020-H\u0016J\t\u0010\u0084\u0001\u001a\u00020\u000bH\u0016J\t\u0010\u0085\u0001\u001a\u00020\tH\u0016J\t\u0010\u0086\u0001\u001a\u00020\u000bH\u0016J\n\u0010\u0088\u0001\u001a\u00030\u0087\u0001H\u0016J\u0007\u0010\u0089\u0001\u001a\u00020\u000fJ\u0007\u0010\u008a\u0001\u001a\u00020\u000fJ\u0007\u0010\u008b\u0001\u001a\u00020\u000fJ\u0007\u0010\u008c\u0001\u001a\u00020\u000fJ\u000f\u0010\u008d\u0001\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fJ\u000f\u0010\u008e\u0001\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fJ\u000f\u0010\u008f\u0001\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fJ\u0016\u0010\u0092\u0001\u001a\u00020\t2\n\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u0090\u0001H\u0096\u0002J\t\u0010\u0093\u0001\u001a\u00020-H\u0016J\t\u0010\u0094\u0001\u001a\u00020\rH\u0016J\u0007\u0010\u0095\u0001\u001a\u00020\u0000J\t\u0010\u0096\u0001\u001a\u00020\u0000H\u0016J\u0007\u0010\u0097\u0001\u001a\u00020\u000fJ\u000f\u0010\u0098\u0001\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020-J\u0016\u0010\u009b\u0001\u001a\u00030\u0099\u00012\n\b\u0002\u0010\u009a\u0001\u001a\u00030\u0099\u0001H\u0007J\u0016\u0010\u009c\u0001\u001a\u00030\u0099\u00012\n\b\u0002\u0010\u009a\u0001\u001a\u00030\u0099\u0001H\u0007J\u001a\u0010\u009e\u0001\u001a\u00020&2\u0007\u0010\u009d\u0001\u001a\u00020\u0007H\u0007¢\u0006\u0005\b\u009e\u0001\u0010*J\u0010\u0010d\u001a\u00020\u0007H\u0007¢\u0006\u0005\bd\u0010\u009f\u0001R\u001a\u0010¡\u0001\u001a\u0004\u0018\u00010q8\u0000@\u0000X\u0081\u000e¢\u0006\u0007\n\u0005\b \u0010 \u0001R2\u0010¥\u0001\u001a\u00020\u00072\u0007\u0010¢\u0001\u001a\u00020\u00078G@@X\u0086\u000e¢\u0006\u0018\n\u0006\b£\u0001\u0010¤\u0001\u001a\u0006\b¥\u0001\u0010\u009f\u0001\"\u0006\b¦\u0001\u0010§\u0001R\u0016\u0010©\u0001\u001a\u00020\u00008VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bi\u0010¨\u0001¨\u0006¬\u0001"}, d2 = {"Lokio/m;", "Lokio/o;", "Lokio/n;", "", "Ljava/nio/channels/ByteChannel;", "Ljava/io/InputStream;", "input", "", "byteCount", "", "forever", "Lkotlin/m2;", "B0", "", "algorithm", "Lokio/p;", "D", "key", "d0", "f", "Ljava/io/OutputStream;", "k1", "G", "F", "M", "h1", "C0", "peek", "p1", "out", "offset", "m", "o", "n", "K1", "o0", "A0", "e", "", "readByte", "pos", "b0", "(J)B", "", "readShort", "", "readInt", "readLong", "V0", "H0", "Y0", "a0", "o1", "x0", "v", "Lokio/d0;", "options", "r1", "sink", "S", "Lokio/m0;", "Z0", "L0", "q", "Ljava/nio/charset/Charset;", "charset", "r0", "Q0", "W", "G0", "limit", "c0", "s0", "", "I", "K0", "read", "readFully", "Ljava/nio/ByteBuffer;", "c", "skip", "byteString", "m1", "t1", "string", "M1", "beginIndex", "endIndex", "N1", "codePoint", "O1", "I1", "H1", "source", "v1", "x1", "write", "Lokio/o0;", "v0", "u1", "b", "y1", "s", "F1", "G1", "i", "B1", "C1", "D1", "E1", "z1", "A1", "minimumCapacity", "Lokio/j0;", "i1", "(I)Lokio/j0;", "t0", "X0", "l1", "fromIndex", "Q", "toIndex", "T", "bytes", "K", "u", "targetBytes", "V", "e1", "q0", "bytesOffset", "I0", "flush", "isOpen", "close", "Lokio/q0;", "h", "k0", "O0", "R0", "U0", "e0", "g0", "i0", "", "other", "equals", "hashCode", "toString", "j", "d", "b1", "f1", "Lokio/m$a;", "unsafeCursor", "F0", "m0", "index", "a", "()J", "Lokio/j0;", "head", "<set-?>", "p", "J", "size", "M0", "(J)V", "()Lokio/m;", "buffer", "<init>", "()V", "okio"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes6.dex */
public final class m implements o, n, Cloneable, ByteChannel {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @d5.e
    @p3.f
    public j0 head;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private long size;

    /* compiled from: Buffer.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b$\u0010%J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010#\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\"\u0010 ¨\u0006&"}, d2 = {"Lokio/m$a;", "Ljava/io/Closeable;", "", "b", "", "offset", "d", "newSize", "c", "minByteCount", "a", "Lkotlin/m2;", "close", "Lokio/m;", "o", "Lokio/m;", "buffer", "", "p", "Z", "readWrite", "Lokio/j0;", "q", "Lokio/j0;", "segment", "r", "J", "", "s", "[B", "data", "t", "I", "start", "u", "end", "<init>", "()V", "okio"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes5.dex */
    public static final class a implements Closeable {

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        @d5.e
        @p3.f
        public m buffer;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata */
        @p3.f
        public boolean readWrite;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata */
        private j0 segment;

        /* renamed from: s, reason: collision with root package name and from kotlin metadata */
        @d5.e
        @p3.f
        public byte[] data;

        /* renamed from: r, reason: collision with root package name and from kotlin metadata */
        @p3.f
        public long offset = -1;

        /* renamed from: t, reason: collision with root package name and from kotlin metadata */
        @p3.f
        public int start = -1;

        /* renamed from: u, reason: collision with root package name and from kotlin metadata */
        @p3.f
        public int end = -1;

        public final long a(int minByteCount) {
            if (!(minByteCount > 0)) {
                throw new IllegalArgumentException(androidx.appcompat.view.menu.s.a(ProtectedSandApp.s("桒"), minByteCount).toString());
            }
            if (!(minByteCount <= 8192)) {
                throw new IllegalArgumentException(androidx.appcompat.view.menu.s.a(ProtectedSandApp.s("桑"), minByteCount).toString());
            }
            m mVar = this.buffer;
            if (mVar == null) {
                throw new IllegalStateException(ProtectedSandApp.s("桐").toString());
            }
            if (!this.readWrite) {
                throw new IllegalStateException(ProtectedSandApp.s("桏").toString());
            }
            long size = mVar.size();
            j0 i12 = mVar.i1(minByteCount);
            int i5 = 8192 - i12.limit;
            i12.limit = 8192;
            long j5 = i5;
            mVar.M0(size + j5);
            this.segment = i12;
            this.offset = size;
            this.data = i12.data;
            this.start = 8192 - i5;
            this.end = 8192;
            return j5;
        }

        public final int b() {
            long j5 = this.offset;
            m mVar = this.buffer;
            kotlin.jvm.internal.l0.m(mVar);
            if (!(j5 != mVar.size())) {
                throw new IllegalStateException(ProtectedSandApp.s("桓").toString());
            }
            long j6 = this.offset;
            return d(j6 == -1 ? 0L : j6 + (this.end - this.start));
        }

        public final long c(long newSize) {
            m mVar = this.buffer;
            if (mVar == null) {
                throw new IllegalStateException(ProtectedSandApp.s("桖").toString());
            }
            if (!this.readWrite) {
                throw new IllegalStateException(ProtectedSandApp.s("桕").toString());
            }
            long size = mVar.size();
            if (newSize <= size) {
                if ((newSize < 0 ? 0 : 1) == 0) {
                    throw new IllegalArgumentException(com.bumptech.glide.load.resource.bitmap.p0.a(ProtectedSandApp.s("桔"), newSize).toString());
                }
                long j5 = size - newSize;
                while (true) {
                    if (j5 <= 0) {
                        break;
                    }
                    j0 j0Var = mVar.head;
                    kotlin.jvm.internal.l0.m(j0Var);
                    j0 j0Var2 = j0Var.prev;
                    kotlin.jvm.internal.l0.m(j0Var2);
                    int i5 = j0Var2.limit;
                    long j6 = i5 - j0Var2.pos;
                    if (j6 > j5) {
                        j0Var2.limit = i5 - ((int) j5);
                        break;
                    }
                    mVar.head = j0Var2.b();
                    k0.d(j0Var2);
                    j5 -= j6;
                }
                this.segment = null;
                this.offset = newSize;
                this.data = null;
                this.start = -1;
                this.end = -1;
            } else if (newSize > size) {
                long j7 = newSize - size;
                boolean z5 = true;
                while (j7 > 0) {
                    j0 i12 = mVar.i1(r4);
                    int min = (int) Math.min(j7, 8192 - i12.limit);
                    int i6 = i12.limit + min;
                    i12.limit = i6;
                    j7 -= min;
                    if (z5) {
                        this.segment = i12;
                        this.offset = size;
                        this.data = i12.data;
                        this.start = i6 - min;
                        this.end = i6;
                        z5 = false;
                    }
                    r4 = 1;
                }
            }
            mVar.M0(newSize);
            return size;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!(this.buffer != null)) {
                throw new IllegalStateException(ProtectedSandApp.s("桗").toString());
            }
            this.buffer = null;
            this.segment = null;
            this.offset = -1L;
            this.data = null;
            this.start = -1;
            this.end = -1;
        }

        public final int d(long offset) {
            j0 j0Var;
            m mVar = this.buffer;
            if (mVar == null) {
                throw new IllegalStateException(ProtectedSandApp.s("桚").toString());
            }
            if (offset < -1 || offset > mVar.size()) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.f23622a;
                String format = String.format(ProtectedSandApp.s("桘"), Arrays.copyOf(new Object[]{Long.valueOf(offset), Long.valueOf(mVar.size())}, 2));
                kotlin.jvm.internal.l0.o(format, ProtectedSandApp.s("桙"));
                throw new ArrayIndexOutOfBoundsException(format);
            }
            if (offset == -1 || offset == mVar.size()) {
                this.segment = null;
                this.offset = offset;
                this.data = null;
                this.start = -1;
                this.end = -1;
                return -1;
            }
            long size = mVar.size();
            j0 j0Var2 = mVar.head;
            j0 j0Var3 = this.segment;
            long j5 = 0;
            if (j0Var3 != null) {
                long j6 = this.offset;
                int i5 = this.start;
                kotlin.jvm.internal.l0.m(j0Var3);
                long j7 = j6 - (i5 - j0Var3.pos);
                if (j7 > offset) {
                    j0Var = j0Var2;
                    j0Var2 = this.segment;
                    size = j7;
                } else {
                    j0Var = this.segment;
                    j5 = j7;
                }
            } else {
                j0Var = j0Var2;
            }
            if (size - offset > offset - j5) {
                while (true) {
                    kotlin.jvm.internal.l0.m(j0Var);
                    int i6 = j0Var.limit;
                    int i7 = j0Var.pos;
                    if (offset < (i6 - i7) + j5) {
                        break;
                    }
                    j5 += i6 - i7;
                    j0Var = j0Var.next;
                }
            } else {
                while (size > offset) {
                    kotlin.jvm.internal.l0.m(j0Var2);
                    j0Var2 = j0Var2.prev;
                    kotlin.jvm.internal.l0.m(j0Var2);
                    size -= j0Var2.limit - j0Var2.pos;
                }
                j5 = size;
                j0Var = j0Var2;
            }
            if (this.readWrite) {
                kotlin.jvm.internal.l0.m(j0Var);
                if (j0Var.shared) {
                    j0 f6 = j0Var.f();
                    if (mVar.head == j0Var) {
                        mVar.head = f6;
                    }
                    j0Var = j0Var.c(f6);
                    j0 j0Var4 = j0Var.prev;
                    kotlin.jvm.internal.l0.m(j0Var4);
                    j0Var4.b();
                }
            }
            this.segment = j0Var;
            this.offset = offset;
            kotlin.jvm.internal.l0.m(j0Var);
            this.data = j0Var.data;
            int i8 = j0Var.pos + ((int) (offset - j5));
            this.start = i8;
            int i9 = j0Var.limit;
            this.end = i9;
            return i9 - i8;
        }
    }

    /* compiled from: Buffer.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\fH\u0016¨\u0006\u000e"}, d2 = {"okio/m$c", "Ljava/io/OutputStream;", "", "b", "Lkotlin/m2;", "write", "", "data", "offset", "byteCount", "flush", "close", "", "toString", "okio"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes5.dex */
    public static final class c extends OutputStream {
        c() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }

        @d5.d
        public String toString() {
            return m.this + ProtectedSandApp.s("桝");
        }

        @Override // java.io.OutputStream
        public void write(int i5) {
            m.this.writeByte(i5);
        }

        @Override // java.io.OutputStream
        public void write(@d5.d byte[] bArr, int i5, int i6) {
            kotlin.jvm.internal.l0.p(bArr, ProtectedSandApp.s("桞"));
            m.this.write(bArr, i5, i6);
        }
    }

    public static /* synthetic */ m B(m mVar, m mVar2, long j5, long j6, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            j5 = 0;
        }
        return mVar.o(mVar2, j5, j6);
    }

    private final void B0(InputStream inputStream, long j5, boolean z5) throws IOException {
        while (true) {
            if (j5 <= 0 && !z5) {
                return;
            }
            j0 i12 = i1(1);
            int read = inputStream.read(i12.data, i12.limit, (int) Math.min(j5, 8192 - i12.limit));
            if (read == -1) {
                if (i12.pos == i12.limit) {
                    this.head = i12.b();
                    k0.d(i12);
                }
                if (!z5) {
                    throw new EOFException();
                }
                return;
            }
            i12.limit += read;
            long j6 = read;
            this.size += j6;
            j5 -= j6;
        }
    }

    private final p D(String algorithm) {
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        j0 j0Var = this.head;
        if (j0Var != null) {
            byte[] bArr = j0Var.data;
            int i5 = j0Var.pos;
            messageDigest.update(bArr, i5, j0Var.limit - i5);
            j0 j0Var2 = j0Var.next;
            kotlin.jvm.internal.l0.m(j0Var2);
            while (j0Var2 != j0Var) {
                byte[] bArr2 = j0Var2.data;
                int i6 = j0Var2.pos;
                messageDigest.update(bArr2, i6, j0Var2.limit - i6);
                j0Var2 = j0Var2.next;
                kotlin.jvm.internal.l0.m(j0Var2);
            }
        }
        byte[] digest = messageDigest.digest();
        kotlin.jvm.internal.l0.o(digest, ProtectedSandApp.s("錙"));
        return new p(digest);
    }

    public static /* synthetic */ a J0(m mVar, a aVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            aVar = new a();
        }
        return mVar.F0(aVar);
    }

    public static /* synthetic */ m L1(m mVar, OutputStream outputStream, long j5, int i5, Object obj) throws IOException {
        if ((i5 & 2) != 0) {
            j5 = mVar.size;
        }
        return mVar.K1(outputStream, j5);
    }

    private final p d0(String algorithm, p key) {
        try {
            Mac mac = Mac.getInstance(algorithm);
            mac.init(new SecretKeySpec(key.N(), algorithm));
            j0 j0Var = this.head;
            if (j0Var != null) {
                byte[] bArr = j0Var.data;
                int i5 = j0Var.pos;
                mac.update(bArr, i5, j0Var.limit - i5);
                j0 j0Var2 = j0Var.next;
                kotlin.jvm.internal.l0.m(j0Var2);
                while (j0Var2 != j0Var) {
                    byte[] bArr2 = j0Var2.data;
                    int i6 = j0Var2.pos;
                    mac.update(bArr2, i6, j0Var2.limit - i6);
                    j0Var2 = j0Var2.next;
                    kotlin.jvm.internal.l0.m(j0Var2);
                }
            }
            byte[] doFinal = mac.doFinal();
            kotlin.jvm.internal.l0.o(doFinal, ProtectedSandApp.s("錚"));
            return new p(doFinal);
        } catch (InvalidKeyException e6) {
            throw new IllegalArgumentException(e6);
        }
    }

    public static /* synthetic */ a n0(m mVar, a aVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            aVar = new a();
        }
        return mVar.m0(aVar);
    }

    public static /* synthetic */ m w(m mVar, OutputStream outputStream, long j5, long j6, int i5, Object obj) throws IOException {
        if ((i5 & 2) != 0) {
            j5 = 0;
        }
        long j7 = j5;
        if ((i5 & 4) != 0) {
            j6 = mVar.size - j7;
        }
        return mVar.m(outputStream, j7, j6);
    }

    public static /* synthetic */ m z(m mVar, m mVar2, long j5, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            j5 = 0;
        }
        return mVar.n(mVar2, j5);
    }

    @d5.d
    public final m A0(@d5.d InputStream input, long byteCount) throws IOException {
        kotlin.jvm.internal.l0.p(input, ProtectedSandApp.s("錛"));
        if (!(byteCount >= 0)) {
            throw new IllegalArgumentException(com.bumptech.glide.load.resource.bitmap.p0.a(ProtectedSandApp.s("錜"), byteCount).toString());
        }
        B0(input, byteCount, false);
        return this;
    }

    @Override // okio.n
    @d5.d
    /* renamed from: A1, reason: merged with bridge method [inline-methods] */
    public m w0(long v5) {
        if (v5 == 0) {
            return writeByte(48);
        }
        long j5 = (v5 >>> 1) | v5;
        long j6 = j5 | (j5 >>> 2);
        long j7 = j6 | (j6 >>> 4);
        long j8 = j7 | (j7 >>> 8);
        long j9 = j8 | (j8 >>> 16);
        long j10 = j9 | (j9 >>> 32);
        long j11 = j10 - ((j10 >>> 1) & 6148914691236517205L);
        long j12 = ((j11 >>> 2) & 3689348814741910323L) + (j11 & 3689348814741910323L);
        long j13 = ((j12 >>> 4) + j12) & 1085102592571150095L;
        long j14 = j13 + (j13 >>> 8);
        long j15 = j14 + (j14 >>> 16);
        int i5 = (int) ((((j15 & 63) + ((j15 >>> 32) & 63)) + 3) / 4);
        j0 i12 = i1(i5);
        byte[] bArr = i12.data;
        int i6 = i12.limit;
        for (int i7 = (i6 + i5) - 1; i7 >= i6; i7--) {
            bArr[i7] = v4.a.Z()[(int) (15 & v5)];
            v5 >>>= 4;
        }
        i12.limit += i5;
        this.size += i5;
        return this;
    }

    @Override // okio.n
    @d5.d
    /* renamed from: B1, reason: merged with bridge method [inline-methods] */
    public m writeInt(int i5) {
        j0 i12 = i1(4);
        byte[] bArr = i12.data;
        int i6 = i12.limit;
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((i5 >>> 24) & 255);
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((i5 >>> 16) & 255);
        int i9 = i8 + 1;
        bArr[i8] = (byte) ((i5 >>> 8) & 255);
        bArr[i9] = (byte) (i5 & 255);
        i12.limit = i9 + 1;
        this.size += 4;
        return this;
    }

    @Override // okio.o
    public boolean C0(long byteCount) {
        return this.size >= byteCount;
    }

    @Override // okio.n
    @d5.d
    /* renamed from: C1, reason: merged with bridge method [inline-methods] */
    public m L(int i5) {
        return writeInt(j.h(i5));
    }

    @Override // okio.n
    @d5.d
    /* renamed from: D1, reason: merged with bridge method [inline-methods] */
    public m writeLong(long v5) {
        j0 i12 = i1(8);
        byte[] bArr = i12.data;
        int i5 = i12.limit;
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((v5 >>> 56) & 255);
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((v5 >>> 48) & 255);
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((v5 >>> 40) & 255);
        int i9 = i8 + 1;
        bArr[i8] = (byte) ((v5 >>> 32) & 255);
        int i10 = i9 + 1;
        bArr[i9] = (byte) ((v5 >>> 24) & 255);
        int i11 = i10 + 1;
        bArr[i10] = (byte) ((v5 >>> 16) & 255);
        int i13 = i11 + 1;
        bArr[i11] = (byte) ((v5 >>> 8) & 255);
        bArr[i13] = (byte) (v5 & 255);
        i12.limit = i13 + 1;
        this.size += 8;
        return this;
    }

    @d5.d
    @p3.j
    public final a E0() {
        return J0(this, null, 1, null);
    }

    @Override // okio.n
    @d5.d
    /* renamed from: E1, reason: merged with bridge method [inline-methods] */
    public m E(long v5) {
        return writeLong(j.i(v5));
    }

    @d5.d
    public m F() {
        return this;
    }

    @d5.d
    @p3.j
    public final a F0(@d5.d a unsafeCursor) {
        kotlin.jvm.internal.l0.p(unsafeCursor, ProtectedSandApp.s("錝"));
        if (!(unsafeCursor.buffer == null)) {
            throw new IllegalStateException(ProtectedSandApp.s("錞").toString());
        }
        unsafeCursor.buffer = this;
        unsafeCursor.readWrite = false;
        return unsafeCursor;
    }

    @Override // okio.n
    @d5.d
    /* renamed from: F1, reason: merged with bridge method [inline-methods] */
    public m writeShort(int s5) {
        j0 i12 = i1(2);
        byte[] bArr = i12.data;
        int i5 = i12.limit;
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((s5 >>> 8) & 255);
        bArr[i6] = (byte) (s5 & 255);
        i12.limit = i6 + 1;
        this.size += 2;
        return this;
    }

    @d5.d
    public m G() {
        return this;
    }

    @Override // okio.o
    @d5.d
    public String G0() throws EOFException {
        return c0(Long.MAX_VALUE);
    }

    @Override // okio.n
    @d5.d
    /* renamed from: G1, reason: merged with bridge method [inline-methods] */
    public m h0(int s5) {
        return writeShort(j.j((short) s5));
    }

    @Override // okio.o
    public int H0() throws EOFException {
        return j.h(readInt());
    }

    @Override // okio.n
    @d5.d
    /* renamed from: H1, reason: merged with bridge method [inline-methods] */
    public m d1(@d5.d String string, int beginIndex, int endIndex, @d5.d Charset charset) {
        kotlin.jvm.internal.l0.p(string, ProtectedSandApp.s("錟"));
        kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("錠"));
        if (!(beginIndex >= 0)) {
            throw new IllegalArgumentException(androidx.appcompat.view.menu.s.a(ProtectedSandApp.s("錨"), beginIndex).toString());
        }
        if (!(endIndex >= beginIndex)) {
            throw new IllegalArgumentException(android.content.preferences.protobuf.v.a(ProtectedSandApp.s("錦"), endIndex, ProtectedSandApp.s("錧"), beginIndex).toString());
        }
        if (!(endIndex <= string.length())) {
            StringBuilder a6 = androidx.core.app.x.a(ProtectedSandApp.s("錤"), endIndex, ProtectedSandApp.s("錥"));
            a6.append(string.length());
            throw new IllegalArgumentException(a6.toString().toString());
        }
        if (kotlin.jvm.internal.l0.g(charset, Charsets.f27049b)) {
            return u0(string, beginIndex, endIndex);
        }
        String substring = string.substring(beginIndex, endIndex);
        kotlin.jvm.internal.l0.o(substring, ProtectedSandApp.s("錡"));
        if (substring == null) {
            throw new NullPointerException(ProtectedSandApp.s("錣"));
        }
        byte[] bytes = substring.getBytes(charset);
        kotlin.jvm.internal.l0.o(bytes, ProtectedSandApp.s("錢"));
        return write(bytes, 0, bytes.length);
    }

    @Override // okio.o
    @d5.d
    public byte[] I() {
        return K0(this.size);
    }

    @Override // okio.o
    public boolean I0(long offset, @d5.d p bytes, int bytesOffset, int byteCount) {
        kotlin.jvm.internal.l0.p(bytes, ProtectedSandApp.s("錩"));
        if (offset < 0 || bytesOffset < 0 || byteCount < 0 || this.size - offset < byteCount || bytes.i0() - bytesOffset < byteCount) {
            return false;
        }
        for (int i5 = 0; i5 < byteCount; i5++) {
            if (b0(i5 + offset) != bytes.x(bytesOffset + i5)) {
                return false;
            }
        }
        return true;
    }

    @Override // okio.n
    @d5.d
    /* renamed from: I1, reason: merged with bridge method [inline-methods] */
    public m z0(@d5.d String string, @d5.d Charset charset) {
        kotlin.jvm.internal.l0.p(string, ProtectedSandApp.s("錪"));
        kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("錫"));
        return d1(string, 0, string.length(), charset);
    }

    @d5.d
    @p3.j
    public final m J1(@d5.d OutputStream outputStream) throws IOException {
        return L1(this, outputStream, 0L, 2, null);
    }

    @Override // okio.o
    public long K(@d5.d p bytes) throws IOException {
        kotlin.jvm.internal.l0.p(bytes, ProtectedSandApp.s("錬"));
        return u(bytes, 0L);
    }

    @Override // okio.o
    @d5.d
    public byte[] K0(long byteCount) throws EOFException {
        if (!(byteCount >= 0 && byteCount <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(com.bumptech.glide.load.resource.bitmap.p0.a(ProtectedSandApp.s("錭"), byteCount).toString());
        }
        if (this.size < byteCount) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) byteCount];
        readFully(bArr);
        return bArr;
    }

    @d5.d
    @p3.j
    public final m K1(@d5.d OutputStream out, long byteCount) throws IOException {
        kotlin.jvm.internal.l0.p(out, ProtectedSandApp.s("錮"));
        j.e(this.size, 0L, byteCount);
        j0 j0Var = this.head;
        while (byteCount > 0) {
            kotlin.jvm.internal.l0.m(j0Var);
            int min = (int) Math.min(byteCount, j0Var.limit - j0Var.pos);
            out.write(j0Var.data, j0Var.pos, min);
            int i5 = j0Var.pos + min;
            j0Var.pos = i5;
            long j5 = min;
            this.size -= j5;
            byteCount -= j5;
            if (i5 == j0Var.limit) {
                j0 b6 = j0Var.b();
                this.head = b6;
                k0.d(j0Var);
                j0Var = b6;
            }
        }
        return this;
    }

    @Override // okio.o
    @d5.d
    public String L0() {
        return Q0(this.size, Charsets.f27049b);
    }

    @Override // okio.o
    public boolean M() {
        return this.size == 0;
    }

    public final void M0(long j5) {
        this.size = j5;
    }

    @Override // okio.n
    @d5.d
    /* renamed from: M1, reason: merged with bridge method [inline-methods] */
    public m j0(@d5.d String string) {
        kotlin.jvm.internal.l0.p(string, ProtectedSandApp.s("錯"));
        return u0(string, 0, string.length());
    }

    @Override // okio.n
    @d5.d
    /* renamed from: N1, reason: merged with bridge method [inline-methods] */
    public m u0(@d5.d String string, int beginIndex, int endIndex) {
        char charAt;
        kotlin.jvm.internal.l0.p(string, ProtectedSandApp.s("錰"));
        if (!(beginIndex >= 0)) {
            throw new IllegalArgumentException(androidx.appcompat.view.menu.s.a(ProtectedSandApp.s("錵"), beginIndex).toString());
        }
        if (!(endIndex >= beginIndex)) {
            throw new IllegalArgumentException(android.content.preferences.protobuf.v.a(ProtectedSandApp.s("錳"), endIndex, ProtectedSandApp.s("錴"), beginIndex).toString());
        }
        if (!(endIndex <= string.length())) {
            StringBuilder a6 = androidx.core.app.x.a(ProtectedSandApp.s("錱"), endIndex, ProtectedSandApp.s("録"));
            a6.append(string.length());
            throw new IllegalArgumentException(a6.toString().toString());
        }
        while (beginIndex < endIndex) {
            char charAt2 = string.charAt(beginIndex);
            if (charAt2 < 128) {
                j0 i12 = i1(1);
                byte[] bArr = i12.data;
                int i5 = i12.limit - beginIndex;
                int min = Math.min(endIndex, 8192 - i5);
                int i6 = beginIndex + 1;
                bArr[beginIndex + i5] = (byte) charAt2;
                while (true) {
                    beginIndex = i6;
                    if (beginIndex >= min || (charAt = string.charAt(beginIndex)) >= 128) {
                        break;
                    }
                    i6 = beginIndex + 1;
                    bArr[beginIndex + i5] = (byte) charAt;
                }
                int i7 = i12.limit;
                int i8 = (i5 + beginIndex) - i7;
                i12.limit = i7 + i8;
                this.size += i8;
            } else {
                if (charAt2 < 2048) {
                    j0 i13 = i1(2);
                    byte[] bArr2 = i13.data;
                    int i9 = i13.limit;
                    bArr2[i9] = (byte) ((charAt2 >> 6) | 192);
                    bArr2[i9 + 1] = (byte) ((charAt2 & '?') | 128);
                    i13.limit = i9 + 2;
                    this.size += 2;
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    j0 i14 = i1(3);
                    byte[] bArr3 = i14.data;
                    int i10 = i14.limit;
                    bArr3[i10] = (byte) ((charAt2 >> '\f') | 224);
                    bArr3[i10 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                    bArr3[i10 + 2] = (byte) ((charAt2 & '?') | 128);
                    i14.limit = i10 + 3;
                    this.size += 3;
                } else {
                    int i11 = beginIndex + 1;
                    char charAt3 = i11 < endIndex ? string.charAt(i11) : (char) 0;
                    if (charAt2 > 56319 || 56320 > charAt3 || 57343 < charAt3) {
                        writeByte(63);
                        beginIndex = i11;
                    } else {
                        int i15 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                        j0 i16 = i1(4);
                        byte[] bArr4 = i16.data;
                        int i17 = i16.limit;
                        bArr4[i17] = (byte) ((i15 >> 18) | 240);
                        bArr4[i17 + 1] = (byte) (((i15 >> 12) & 63) | 128);
                        bArr4[i17 + 2] = (byte) (((i15 >> 6) & 63) | 128);
                        bArr4[i17 + 3] = (byte) ((i15 & 63) | 128);
                        i16.limit = i17 + 4;
                        this.size += 4;
                        beginIndex += 2;
                    }
                }
                beginIndex++;
            }
        }
        return this;
    }

    @d5.d
    public final p O0() {
        return D(ProtectedSandApp.s("錶"));
    }

    @Override // okio.n
    @d5.d
    /* renamed from: O1, reason: merged with bridge method [inline-methods] */
    public m y(int codePoint) {
        if (codePoint < 128) {
            writeByte(codePoint);
        } else if (codePoint < 2048) {
            j0 i12 = i1(2);
            byte[] bArr = i12.data;
            int i5 = i12.limit;
            bArr[i5] = (byte) ((codePoint >> 6) | 192);
            bArr[i5 + 1] = (byte) ((codePoint & 63) | 128);
            i12.limit = i5 + 2;
            this.size += 2;
        } else if (55296 <= codePoint && 57343 >= codePoint) {
            writeByte(63);
        } else if (codePoint < 65536) {
            j0 i13 = i1(3);
            byte[] bArr2 = i13.data;
            int i6 = i13.limit;
            bArr2[i6] = (byte) ((codePoint >> 12) | 224);
            bArr2[i6 + 1] = (byte) (((codePoint >> 6) & 63) | 128);
            bArr2[i6 + 2] = (byte) ((codePoint & 63) | 128);
            i13.limit = i6 + 3;
            this.size += 3;
        } else {
            if (codePoint > 1114111) {
                throw new IllegalArgumentException(ProtectedSandApp.s("錷") + j.n(codePoint));
            }
            j0 i14 = i1(4);
            byte[] bArr3 = i14.data;
            int i7 = i14.limit;
            bArr3[i7] = (byte) ((codePoint >> 18) | 240);
            bArr3[i7 + 1] = (byte) (((codePoint >> 12) & 63) | 128);
            bArr3[i7 + 2] = (byte) (((codePoint >> 6) & 63) | 128);
            bArr3[i7 + 3] = (byte) ((codePoint & 63) | 128);
            i14.limit = i7 + 4;
            this.size += 4;
        }
        return this;
    }

    @Override // okio.o
    public long Q(byte b6, long fromIndex) {
        return T(b6, fromIndex, Long.MAX_VALUE);
    }

    @Override // okio.o
    @d5.d
    public String Q0(long byteCount, @d5.d Charset charset) throws EOFException {
        kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("錸"));
        if (!(byteCount >= 0 && byteCount <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(com.bumptech.glide.load.resource.bitmap.p0.a(ProtectedSandApp.s("錹"), byteCount).toString());
        }
        if (this.size < byteCount) {
            throw new EOFException();
        }
        if (byteCount == 0) {
            return "";
        }
        j0 j0Var = this.head;
        kotlin.jvm.internal.l0.m(j0Var);
        int i5 = j0Var.pos;
        if (i5 + byteCount > j0Var.limit) {
            return new String(K0(byteCount), charset);
        }
        int i6 = (int) byteCount;
        String str = new String(j0Var.data, i5, i6, charset);
        int i7 = j0Var.pos + i6;
        j0Var.pos = i7;
        this.size -= byteCount;
        if (i7 == j0Var.limit) {
            this.head = j0Var.b();
            k0.d(j0Var);
        }
        return str;
    }

    @d5.d
    public final p R0() {
        return D(ProtectedSandApp.s("錺"));
    }

    @Override // okio.o
    public void S(@d5.d m mVar, long j5) throws EOFException {
        kotlin.jvm.internal.l0.p(mVar, ProtectedSandApp.s("錻"));
        long j6 = this.size;
        if (j6 >= j5) {
            mVar.t0(this, j5);
        } else {
            mVar.t0(this, j6);
            throw new EOFException();
        }
    }

    @Override // okio.o
    public long T(byte b6, long fromIndex, long toIndex) {
        j0 j0Var;
        long j5 = fromIndex;
        long j6 = toIndex;
        long j7 = 0;
        if (!(0 <= j5 && j6 >= j5)) {
            throw new IllegalArgumentException((ProtectedSandApp.s("錼") + this.size + ProtectedSandApp.s("錽") + j5 + ProtectedSandApp.s("錾") + j6).toString());
        }
        long j8 = this.size;
        if (j6 > j8) {
            j6 = j8;
        }
        if (j5 != j6 && (j0Var = this.head) != null) {
            if (j8 - j5 < j5) {
                while (j8 > j5) {
                    j0Var = j0Var.prev;
                    kotlin.jvm.internal.l0.m(j0Var);
                    j8 -= j0Var.limit - j0Var.pos;
                }
                while (j8 < j6) {
                    byte[] bArr = j0Var.data;
                    int min = (int) Math.min(j0Var.limit, (j0Var.pos + j6) - j8);
                    for (int i5 = (int) ((j0Var.pos + j5) - j8); i5 < min; i5++) {
                        if (bArr[i5] == b6) {
                            return (i5 - j0Var.pos) + j8;
                        }
                    }
                    j8 += j0Var.limit - j0Var.pos;
                    j0Var = j0Var.next;
                    kotlin.jvm.internal.l0.m(j0Var);
                    j5 = j8;
                }
            } else {
                while (true) {
                    long j9 = (j0Var.limit - j0Var.pos) + j7;
                    if (j9 > j5) {
                        break;
                    }
                    j0Var = j0Var.next;
                    kotlin.jvm.internal.l0.m(j0Var);
                    j7 = j9;
                }
                while (j7 < j6) {
                    byte[] bArr2 = j0Var.data;
                    int min2 = (int) Math.min(j0Var.limit, (j0Var.pos + j6) - j7);
                    for (int i6 = (int) ((j0Var.pos + j5) - j7); i6 < min2; i6++) {
                        if (bArr2[i6] == b6) {
                            return (i6 - j0Var.pos) + j7;
                        }
                    }
                    j7 += j0Var.limit - j0Var.pos;
                    j0Var = j0Var.next;
                    kotlin.jvm.internal.l0.m(j0Var);
                    j5 = j7;
                }
            }
        }
        return -1L;
    }

    @d5.d
    public final p U0() {
        return D(ProtectedSandApp.s("錿"));
    }

    @Override // okio.o
    public long V(@d5.d p targetBytes) {
        kotlin.jvm.internal.l0.p(targetBytes, ProtectedSandApp.s("鍀"));
        return e1(targetBytes, 0L);
    }

    @Override // okio.o
    public short V0() throws EOFException {
        return j.j(readShort());
    }

    @Override // okio.o
    @d5.e
    public String W() throws EOFException {
        long l12 = l1((byte) 10);
        if (l12 != -1) {
            return v4.a.b0(this, l12);
        }
        long j5 = this.size;
        if (j5 != 0) {
            return q(j5);
        }
        return null;
    }

    @Override // okio.o0
    public long X0(@d5.d m sink, long byteCount) {
        kotlin.jvm.internal.l0.p(sink, ProtectedSandApp.s("鍁"));
        if (!(byteCount >= 0)) {
            throw new IllegalArgumentException(com.bumptech.glide.load.resource.bitmap.p0.a(ProtectedSandApp.s("鍂"), byteCount).toString());
        }
        long j5 = this.size;
        if (j5 == 0) {
            return -1L;
        }
        if (byteCount > j5) {
            byteCount = j5;
        }
        sink.t0(this, byteCount);
        return byteCount;
    }

    @Override // okio.n
    public n Y() {
        return this;
    }

    @Override // okio.o
    public long Y0() throws EOFException {
        return j.i(readLong());
    }

    @Override // okio.o
    public long Z0(@d5.d m0 sink) throws IOException {
        kotlin.jvm.internal.l0.p(sink, ProtectedSandApp.s("鍃"));
        long j5 = this.size;
        if (j5 > 0) {
            sink.t0(this, j5);
        }
        return j5;
    }

    @p3.i(name = "-deprecated_getByte")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to operator function", replaceWith = @ReplaceWith(expression = "this[index]", imports = {}))
    public final byte a(long index) {
        return b0(index);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b3 A[EDGE_INSN: B:46:0x00b3->B:40:0x00b3 BREAK  A[LOOP:0: B:4:0x000f->B:45:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ab  */
    @Override // okio.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long a0() throws java.io.EOFException {
        /*
            r15 = this;
            long r0 = r15.size
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lbe
            r0 = 0
            r4 = -7
            r1 = r0
            r5 = r4
            r3 = r2
            r2 = r1
        Lf:
            okio.j0 r7 = r15.head
            kotlin.jvm.internal.l0.m(r7)
            byte[] r8 = r7.data
            int r9 = r7.pos
            int r10 = r7.limit
        L1a:
            if (r9 >= r10) goto L9f
            r11 = r8[r9]
            r12 = 48
            byte r12 = (byte) r12
            if (r11 < r12) goto L6e
            r13 = 57
            byte r13 = (byte) r13
            if (r11 > r13) goto L6e
            int r12 = r12 - r11
            r13 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r13 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r13 < 0) goto L40
            if (r13 != 0) goto L3a
            long r13 = (long) r12
            int r13 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r13 >= 0) goto L3a
            goto L40
        L3a:
            r13 = 10
            long r3 = r3 * r13
            long r11 = (long) r12
            long r3 = r3 + r11
            goto L7a
        L40:
            okio.m r0 = new okio.m
            r0.<init>()
            okio.m r0 = r0.j1(r3)
            okio.m r0 = r0.writeByte(r11)
            if (r1 != 0) goto L52
            r0.readByte()
        L52:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "鍄"
            java.lang.String r3 = com.flashget.kidsdownloader.ProtectedSandApp.s(r3)
            r2.<init>(r3)
            java.lang.String r0 = r0.L0()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L6e:
            r12 = 45
            byte r12 = (byte) r12
            r13 = 1
            if (r11 != r12) goto L7f
            if (r0 != 0) goto L7f
            r11 = 1
            long r5 = r5 - r11
            r1 = r13
        L7a:
            int r9 = r9 + 1
            int r0 = r0 + 1
            goto L1a
        L7f:
            if (r0 == 0) goto L83
            r2 = r13
            goto L9f
        L83:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "鍅"
            java.lang.String r2 = com.flashget.kidsdownloader.ProtectedSandApp.s(r2)
            r1.<init>(r2)
            java.lang.String r2 = okio.j.m(r11)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L9f:
            if (r9 != r10) goto Lab
            okio.j0 r8 = r7.b()
            r15.head = r8
            okio.k0.d(r7)
            goto Lad
        Lab:
            r7.pos = r9
        Lad:
            if (r2 != 0) goto Lb3
            okio.j0 r7 = r15.head
            if (r7 != 0) goto Lf
        Lb3:
            long r5 = r15.size
            long r7 = (long) r0
            long r5 = r5 - r7
            r15.size = r5
            if (r1 == 0) goto Lbc
            goto Lbd
        Lbc:
            long r3 = -r3
        Lbd:
            return r3
        Lbe:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.m.a0():long");
    }

    @p3.i(name = "-deprecated_size")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "size", imports = {}))
    /* renamed from: b, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    @p3.i(name = "getByte")
    public final byte b0(long pos) {
        j.e(this.size, pos, 1L);
        j0 j0Var = this.head;
        if (j0Var == null) {
            kotlin.jvm.internal.l0.m(null);
            throw null;
        }
        long j5 = this.size;
        if (j5 - pos < pos) {
            while (j5 > pos) {
                j0Var = j0Var.prev;
                kotlin.jvm.internal.l0.m(j0Var);
                j5 -= j0Var.limit - j0Var.pos;
            }
            kotlin.jvm.internal.l0.m(j0Var);
            return j0Var.data[(int) ((j0Var.pos + pos) - j5)];
        }
        long j6 = 0;
        while (true) {
            long j7 = (j0Var.limit - j0Var.pos) + j6;
            if (j7 > pos) {
                kotlin.jvm.internal.l0.m(j0Var);
                return j0Var.data[(int) ((j0Var.pos + pos) - j6)];
            }
            j0Var = j0Var.next;
            kotlin.jvm.internal.l0.m(j0Var);
            j6 = j7;
        }
    }

    @d5.d
    public final p b1() {
        long j5 = this.size;
        if (j5 <= ((long) Integer.MAX_VALUE)) {
            return f1((int) j5);
        }
        throw new IllegalStateException((ProtectedSandApp.s("鍆") + this.size).toString());
    }

    public final void c() {
        skip(this.size);
    }

    @Override // okio.o
    @d5.d
    public String c0(long limit) throws EOFException {
        if (!(limit >= 0)) {
            throw new IllegalArgumentException(com.bumptech.glide.load.resource.bitmap.p0.a(ProtectedSandApp.s("鍉"), limit).toString());
        }
        long j5 = limit != Long.MAX_VALUE ? limit + 1 : Long.MAX_VALUE;
        byte b6 = (byte) 10;
        long T = T(b6, 0L, j5);
        if (T != -1) {
            return v4.a.b0(this, T);
        }
        if (j5 < this.size && b0(j5 - 1) == ((byte) 13) && b0(j5) == b6) {
            return v4.a.b0(this, j5);
        }
        m mVar = new m();
        o(mVar, 0L, Math.min(32, this.size));
        throw new EOFException(ProtectedSandApp.s("鍇") + Math.min(this.size, limit) + ProtectedSandApp.s("鍈") + mVar.x0().C() + Typography.F);
    }

    public Object clone() {
        return j();
    }

    @Override // okio.o0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @d5.d
    public m d() {
        return j();
    }

    public final long e() {
        long j5 = this.size;
        if (j5 == 0) {
            return 0L;
        }
        j0 j0Var = this.head;
        kotlin.jvm.internal.l0.m(j0Var);
        j0 j0Var2 = j0Var.prev;
        kotlin.jvm.internal.l0.m(j0Var2);
        if (j0Var2.limit < 8192 && j0Var2.owner) {
            j5 -= r3 - j0Var2.pos;
        }
        return j5;
    }

    @d5.d
    public final p e0(@d5.d p key) {
        kotlin.jvm.internal.l0.p(key, ProtectedSandApp.s("鍊"));
        return d0(ProtectedSandApp.s("鍋"), key);
    }

    @Override // okio.o
    public long e1(@d5.d p targetBytes, long fromIndex) {
        int i5;
        int i6;
        int i7;
        int i8;
        kotlin.jvm.internal.l0.p(targetBytes, ProtectedSandApp.s("鍌"));
        long j5 = 0;
        if (!(fromIndex >= 0)) {
            throw new IllegalArgumentException(com.bumptech.glide.load.resource.bitmap.p0.a(ProtectedSandApp.s("鍍"), fromIndex).toString());
        }
        j0 j0Var = this.head;
        if (j0Var == null) {
            return -1L;
        }
        long j6 = this.size;
        if (j6 - fromIndex < fromIndex) {
            while (j6 > fromIndex) {
                j0Var = j0Var.prev;
                kotlin.jvm.internal.l0.m(j0Var);
                j6 -= j0Var.limit - j0Var.pos;
            }
            if (targetBytes.i0() == 2) {
                byte x5 = targetBytes.x(0);
                byte x6 = targetBytes.x(1);
                while (j6 < this.size) {
                    byte[] bArr = j0Var.data;
                    i7 = (int) ((j0Var.pos + fromIndex) - j6);
                    int i9 = j0Var.limit;
                    while (i7 < i9) {
                        byte b6 = bArr[i7];
                        if (b6 == x5 || b6 == x6) {
                            i8 = j0Var.pos;
                        } else {
                            i7++;
                        }
                    }
                    j6 += j0Var.limit - j0Var.pos;
                    j0Var = j0Var.next;
                    kotlin.jvm.internal.l0.m(j0Var);
                    fromIndex = j6;
                }
                return -1L;
            }
            byte[] N = targetBytes.N();
            while (j6 < this.size) {
                byte[] bArr2 = j0Var.data;
                i7 = (int) ((j0Var.pos + fromIndex) - j6);
                int i10 = j0Var.limit;
                while (i7 < i10) {
                    byte b7 = bArr2[i7];
                    for (byte b8 : N) {
                        if (b7 == b8) {
                            i8 = j0Var.pos;
                        }
                    }
                    i7++;
                }
                j6 += j0Var.limit - j0Var.pos;
                j0Var = j0Var.next;
                kotlin.jvm.internal.l0.m(j0Var);
                fromIndex = j6;
            }
            return -1L;
            return (i7 - i8) + j6;
        }
        while (true) {
            long j7 = (j0Var.limit - j0Var.pos) + j5;
            if (j7 > fromIndex) {
                break;
            }
            j0Var = j0Var.next;
            kotlin.jvm.internal.l0.m(j0Var);
            j5 = j7;
        }
        if (targetBytes.i0() == 2) {
            byte x7 = targetBytes.x(0);
            byte x8 = targetBytes.x(1);
            while (j5 < this.size) {
                byte[] bArr3 = j0Var.data;
                i5 = (int) ((j0Var.pos + fromIndex) - j5);
                int i11 = j0Var.limit;
                while (i5 < i11) {
                    byte b9 = bArr3[i5];
                    if (b9 == x7 || b9 == x8) {
                        i6 = j0Var.pos;
                    } else {
                        i5++;
                    }
                }
                j5 += j0Var.limit - j0Var.pos;
                j0Var = j0Var.next;
                kotlin.jvm.internal.l0.m(j0Var);
                fromIndex = j5;
            }
            return -1L;
        }
        byte[] N2 = targetBytes.N();
        while (j5 < this.size) {
            byte[] bArr4 = j0Var.data;
            i5 = (int) ((j0Var.pos + fromIndex) - j5);
            int i12 = j0Var.limit;
            while (i5 < i12) {
                byte b10 = bArr4[i5];
                for (byte b11 : N2) {
                    if (b10 == b11) {
                        i6 = j0Var.pos;
                    }
                }
                i5++;
            }
            j5 += j0Var.limit - j0Var.pos;
            j0Var = j0Var.next;
            kotlin.jvm.internal.l0.m(j0Var);
            fromIndex = j5;
        }
        return -1L;
        return (i5 - i6) + j5;
    }

    public boolean equals(@d5.e Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof m) {
            long j5 = this.size;
            m mVar = (m) other;
            if (j5 == mVar.size) {
                if (j5 == 0) {
                    return true;
                }
                j0 j0Var = this.head;
                kotlin.jvm.internal.l0.m(j0Var);
                j0 j0Var2 = mVar.head;
                kotlin.jvm.internal.l0.m(j0Var2);
                int i5 = j0Var.pos;
                int i6 = j0Var2.pos;
                long j6 = 0;
                while (j6 < this.size) {
                    long min = Math.min(j0Var.limit - i5, j0Var2.limit - i6);
                    long j7 = 0;
                    while (j7 < min) {
                        int i7 = i5 + 1;
                        int i8 = i6 + 1;
                        if (j0Var.data[i5] == j0Var2.data[i6]) {
                            j7++;
                            i5 = i7;
                            i6 = i8;
                        }
                    }
                    if (i5 == j0Var.limit) {
                        j0Var = j0Var.next;
                        kotlin.jvm.internal.l0.m(j0Var);
                        i5 = j0Var.pos;
                    }
                    if (i6 == j0Var2.limit) {
                        j0Var2 = j0Var2.next;
                        kotlin.jvm.internal.l0.m(j0Var2);
                        i6 = j0Var2.pos;
                    }
                    j6 += min;
                }
                return true;
            }
        }
        return false;
    }

    @Override // okio.o
    @d5.d
    /* renamed from: f */
    public m getBufferField() {
        return this;
    }

    @d5.d
    public final p f1(int byteCount) {
        if (byteCount == 0) {
            return p.f31688s;
        }
        j.e(this.size, 0L, byteCount);
        j0 j0Var = this.head;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i6 < byteCount) {
            kotlin.jvm.internal.l0.m(j0Var);
            int i8 = j0Var.limit;
            int i9 = j0Var.pos;
            if (i8 == i9) {
                throw new AssertionError(ProtectedSandApp.s("鍎"));
            }
            i6 += i8 - i9;
            i7++;
            j0Var = j0Var.next;
        }
        byte[][] bArr = new byte[i7][];
        int[] iArr = new int[i7 * 2];
        j0 j0Var2 = this.head;
        int i10 = 0;
        while (i5 < byteCount) {
            kotlin.jvm.internal.l0.m(j0Var2);
            bArr[i10] = j0Var2.data;
            i5 += j0Var2.limit - j0Var2.pos;
            iArr[i10] = Math.min(i5, byteCount);
            iArr[i10 + i7] = j0Var2.pos;
            j0Var2.shared = true;
            i10++;
            j0Var2 = j0Var2.next;
        }
        return new l0(bArr, iArr);
    }

    @Override // okio.n, okio.m0, java.io.Flushable
    public void flush() {
    }

    @d5.d
    public final p g0(@d5.d p key) {
        kotlin.jvm.internal.l0.p(key, ProtectedSandApp.s("鍏"));
        return d0(ProtectedSandApp.s("鍐"), key);
    }

    @Override // okio.o0
    @d5.d
    public q0 h() {
        return q0.f31704d;
    }

    @Override // okio.o
    public void h1(long j5) throws EOFException {
        if (this.size < j5) {
            throw new EOFException();
        }
    }

    public int hashCode() {
        j0 j0Var = this.head;
        if (j0Var == null) {
            return 0;
        }
        int i5 = 1;
        do {
            int i6 = j0Var.limit;
            for (int i7 = j0Var.pos; i7 < i6; i7++) {
                i5 = (i5 * 31) + j0Var.data[i7];
            }
            j0Var = j0Var.next;
            kotlin.jvm.internal.l0.m(j0Var);
        } while (j0Var != this.head);
        return i5;
    }

    @Override // okio.o
    @d5.d
    public m i() {
        return this;
    }

    @d5.d
    public final p i0(@d5.d p key) {
        kotlin.jvm.internal.l0.p(key, ProtectedSandApp.s("鍑"));
        return d0(ProtectedSandApp.s("鍒"), key);
    }

    @d5.d
    public final j0 i1(int minimumCapacity) {
        if (!(minimumCapacity >= 1 && minimumCapacity <= 8192)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("鍓").toString());
        }
        j0 j0Var = this.head;
        if (j0Var != null) {
            kotlin.jvm.internal.l0.m(j0Var);
            j0 j0Var2 = j0Var.prev;
            kotlin.jvm.internal.l0.m(j0Var2);
            return (j0Var2.limit + minimumCapacity > 8192 || !j0Var2.owner) ? j0Var2.c(k0.e()) : j0Var2;
        }
        j0 e6 = k0.e();
        this.head = e6;
        e6.prev = e6;
        e6.next = e6;
        return e6;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @d5.d
    public final m j() {
        m mVar = new m();
        if (this.size != 0) {
            j0 j0Var = this.head;
            kotlin.jvm.internal.l0.m(j0Var);
            j0 d6 = j0Var.d();
            mVar.head = d6;
            d6.prev = d6;
            d6.next = d6;
            for (j0 j0Var2 = j0Var.next; j0Var2 != j0Var; j0Var2 = j0Var2.next) {
                j0 j0Var3 = d6.prev;
                kotlin.jvm.internal.l0.m(j0Var3);
                kotlin.jvm.internal.l0.m(j0Var2);
                j0Var3.c(j0Var2.d());
            }
            mVar.size = this.size;
        }
        return mVar;
    }

    @d5.d
    @p3.j
    public final m k(@d5.d OutputStream outputStream) throws IOException {
        return w(this, outputStream, 0L, 0L, 6, null);
    }

    @d5.d
    public final p k0() {
        return D(ProtectedSandApp.s("鍔"));
    }

    @Override // okio.n
    @d5.d
    public OutputStream k1() {
        return new c();
    }

    @d5.d
    @p3.j
    public final m l(@d5.d OutputStream outputStream, long j5) throws IOException {
        return w(this, outputStream, j5, 0L, 4, null);
    }

    @d5.d
    @p3.j
    public final a l0() {
        return n0(this, null, 1, null);
    }

    @Override // okio.o
    public long l1(byte b6) {
        return T(b6, 0L, Long.MAX_VALUE);
    }

    @d5.d
    @p3.j
    public final m m(@d5.d OutputStream out, long offset, long byteCount) throws IOException {
        kotlin.jvm.internal.l0.p(out, ProtectedSandApp.s("鍕"));
        j.e(this.size, offset, byteCount);
        if (byteCount == 0) {
            return this;
        }
        j0 j0Var = this.head;
        while (true) {
            kotlin.jvm.internal.l0.m(j0Var);
            int i5 = j0Var.limit;
            int i6 = j0Var.pos;
            if (offset < i5 - i6) {
                break;
            }
            offset -= i5 - i6;
            j0Var = j0Var.next;
        }
        while (byteCount > 0) {
            kotlin.jvm.internal.l0.m(j0Var);
            int min = (int) Math.min(j0Var.limit - r9, byteCount);
            out.write(j0Var.data, (int) (j0Var.pos + offset), min);
            byteCount -= min;
            j0Var = j0Var.next;
            offset = 0;
        }
        return this;
    }

    @d5.d
    @p3.j
    public final a m0(@d5.d a unsafeCursor) {
        kotlin.jvm.internal.l0.p(unsafeCursor, ProtectedSandApp.s("鍖"));
        if (!(unsafeCursor.buffer == null)) {
            throw new IllegalStateException(ProtectedSandApp.s("鍗").toString());
        }
        unsafeCursor.buffer = this;
        unsafeCursor.readWrite = true;
        return unsafeCursor;
    }

    @Override // okio.n
    @d5.d
    /* renamed from: m1, reason: merged with bridge method [inline-methods] */
    public m S0(@d5.d p byteString) {
        kotlin.jvm.internal.l0.p(byteString, ProtectedSandApp.s("鍘"));
        byteString.v0(this, 0, byteString.i0());
        return this;
    }

    @d5.d
    public final m n(@d5.d m out, long offset) {
        kotlin.jvm.internal.l0.p(out, ProtectedSandApp.s("鍙"));
        return o(out, offset, this.size - offset);
    }

    @d5.d
    public final m o(@d5.d m out, long offset, long byteCount) {
        kotlin.jvm.internal.l0.p(out, ProtectedSandApp.s("鍚"));
        j.e(this.size, offset, byteCount);
        if (byteCount != 0) {
            out.size += byteCount;
            j0 j0Var = this.head;
            while (true) {
                kotlin.jvm.internal.l0.m(j0Var);
                int i5 = j0Var.limit;
                int i6 = j0Var.pos;
                if (offset < i5 - i6) {
                    break;
                }
                offset -= i5 - i6;
                j0Var = j0Var.next;
            }
            while (byteCount > 0) {
                kotlin.jvm.internal.l0.m(j0Var);
                j0 d6 = j0Var.d();
                int i7 = d6.pos + ((int) offset);
                d6.pos = i7;
                d6.limit = Math.min(i7 + ((int) byteCount), d6.limit);
                j0 j0Var2 = out.head;
                if (j0Var2 == null) {
                    d6.prev = d6;
                    d6.next = d6;
                    out.head = d6;
                } else {
                    kotlin.jvm.internal.l0.m(j0Var2);
                    j0 j0Var3 = j0Var2.prev;
                    kotlin.jvm.internal.l0.m(j0Var3);
                    j0Var3.c(d6);
                }
                byteCount -= d6.limit - d6.pos;
                j0Var = j0Var.next;
                offset = 0;
            }
        }
        return this;
    }

    @d5.d
    public final m o0(@d5.d InputStream input) throws IOException {
        kotlin.jvm.internal.l0.p(input, ProtectedSandApp.s("鍛"));
        B0(input, Long.MAX_VALUE, true);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ae A[EDGE_INSN: B:39:0x00ae->B:36:0x00ae BREAK  A[LOOP:0: B:4:0x000b->B:38:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a6  */
    @Override // okio.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long o1() throws java.io.EOFException {
        /*
            r14 = this;
            long r0 = r14.size
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb5
            r0 = 0
            r1 = r0
            r4 = r2
        Lb:
            okio.j0 r6 = r14.head
            kotlin.jvm.internal.l0.m(r6)
            byte[] r7 = r6.data
            int r8 = r6.pos
            int r9 = r6.limit
        L16:
            if (r8 >= r9) goto L9a
            r10 = r7[r8]
            r11 = 48
            byte r11 = (byte) r11
            if (r10 < r11) goto L27
            r12 = 57
            byte r12 = (byte) r12
            if (r10 > r12) goto L27
            int r11 = r10 - r11
            goto L41
        L27:
            r11 = 97
            byte r11 = (byte) r11
            if (r10 < r11) goto L36
            r12 = 102(0x66, float:1.43E-43)
            byte r12 = (byte) r12
            if (r10 > r12) goto L36
        L31:
            int r11 = r10 - r11
            int r11 = r11 + 10
            goto L41
        L36:
            r11 = 65
            byte r11 = (byte) r11
            if (r10 < r11) goto L7a
            r12 = 70
            byte r12 = (byte) r12
            if (r10 > r12) goto L7a
            goto L31
        L41:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L51
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L16
        L51:
            okio.m r0 = new okio.m
            r0.<init>()
            okio.m r0 = r0.w0(r4)
            okio.m r0 = r0.writeByte(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "鍜"
            java.lang.String r3 = com.flashget.kidsdownloader.ProtectedSandApp.s(r3)
            r2.<init>(r3)
            java.lang.String r0 = r0.L0()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L7a:
            if (r0 == 0) goto L7e
            r1 = 1
            goto L9a
        L7e:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "鍝"
            java.lang.String r2 = com.flashget.kidsdownloader.ProtectedSandApp.s(r2)
            r1.<init>(r2)
            java.lang.String r2 = okio.j.m(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L9a:
            if (r8 != r9) goto La6
            okio.j0 r7 = r6.b()
            r14.head = r7
            okio.k0.d(r6)
            goto La8
        La6:
            r6.pos = r8
        La8:
            if (r1 != 0) goto Lae
            okio.j0 r6 = r14.head
            if (r6 != 0) goto Lb
        Lae:
            long r1 = r14.size
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.size = r1
            return r4
        Lb5:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.m.o1():long");
    }

    @Override // okio.o
    @d5.d
    public InputStream p1() {
        return new b();
    }

    @Override // okio.o
    @d5.d
    public o peek() {
        return c0.c(new f0(this));
    }

    @Override // okio.o
    @d5.d
    public String q(long byteCount) throws EOFException {
        return Q0(byteCount, Charsets.f27049b);
    }

    @Override // okio.o
    public boolean q0(long offset, @d5.d p bytes) {
        kotlin.jvm.internal.l0.p(bytes, ProtectedSandApp.s("鍞"));
        return I0(offset, bytes, 0, bytes.i0());
    }

    @Override // okio.o
    @d5.d
    public String r0(@d5.d Charset charset) {
        kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("鍟"));
        return Q0(this.size, charset);
    }

    @Override // okio.o
    public int r1(@d5.d d0 options) {
        kotlin.jvm.internal.l0.p(options, ProtectedSandApp.s("鍠"));
        int e02 = v4.a.e0(this, options, false, 2, null);
        if (e02 == -1) {
            return -1;
        }
        skip(options.getByteStrings()[e02].i0());
        return e02;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(@d5.d ByteBuffer sink) throws IOException {
        kotlin.jvm.internal.l0.p(sink, ProtectedSandApp.s("鍡"));
        j0 j0Var = this.head;
        if (j0Var == null) {
            return -1;
        }
        int min = Math.min(sink.remaining(), j0Var.limit - j0Var.pos);
        sink.put(j0Var.data, j0Var.pos, min);
        int i5 = j0Var.pos + min;
        j0Var.pos = i5;
        this.size -= min;
        if (i5 == j0Var.limit) {
            this.head = j0Var.b();
            k0.d(j0Var);
        }
        return min;
    }

    @Override // okio.o
    public byte readByte() throws EOFException {
        if (this.size == 0) {
            throw new EOFException();
        }
        j0 j0Var = this.head;
        kotlin.jvm.internal.l0.m(j0Var);
        int i5 = j0Var.pos;
        int i6 = j0Var.limit;
        int i7 = i5 + 1;
        byte b6 = j0Var.data[i5];
        this.size--;
        if (i7 == i6) {
            this.head = j0Var.b();
            k0.d(j0Var);
        } else {
            j0Var.pos = i7;
        }
        return b6;
    }

    @Override // okio.o
    public void readFully(@d5.d byte[] bArr) throws EOFException {
        kotlin.jvm.internal.l0.p(bArr, ProtectedSandApp.s("鍤"));
        int i5 = 0;
        while (i5 < bArr.length) {
            int read = read(bArr, i5, bArr.length - i5);
            if (read == -1) {
                throw new EOFException();
            }
            i5 += read;
        }
    }

    @Override // okio.o
    public int readInt() throws EOFException {
        if (this.size < 4) {
            throw new EOFException();
        }
        j0 j0Var = this.head;
        kotlin.jvm.internal.l0.m(j0Var);
        int i5 = j0Var.pos;
        int i6 = j0Var.limit;
        if (i6 - i5 < 4) {
            return ((readByte() & UByte.f27220r) << 24) | ((readByte() & UByte.f27220r) << 16) | ((readByte() & UByte.f27220r) << 8) | (readByte() & UByte.f27220r);
        }
        byte[] bArr = j0Var.data;
        int i7 = i5 + 1;
        int i8 = i7 + 1;
        int i9 = ((bArr[i5] & UByte.f27220r) << 24) | ((bArr[i7] & UByte.f27220r) << 16);
        int i10 = i8 + 1;
        int i11 = i9 | ((bArr[i8] & UByte.f27220r) << 8);
        int i12 = i10 + 1;
        int i13 = i11 | (bArr[i10] & UByte.f27220r);
        this.size -= 4;
        if (i12 == i6) {
            this.head = j0Var.b();
            k0.d(j0Var);
        } else {
            j0Var.pos = i12;
        }
        return i13;
    }

    @Override // okio.o
    public long readLong() throws EOFException {
        if (this.size < 8) {
            throw new EOFException();
        }
        j0 j0Var = this.head;
        kotlin.jvm.internal.l0.m(j0Var);
        int i5 = j0Var.pos;
        int i6 = j0Var.limit;
        if (i6 - i5 < 8) {
            return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
        }
        byte[] bArr = j0Var.data;
        long j5 = (bArr[i5] & 255) << 56;
        int i7 = i5 + 1 + 1 + 1;
        long j6 = j5 | ((bArr[r7] & 255) << 48) | ((bArr[r1] & 255) << 40);
        long j7 = j6 | ((bArr[i7] & 255) << 32) | ((bArr[r1] & 255) << 24);
        long j8 = j7 | ((bArr[r8] & 255) << 16);
        long j9 = j8 | ((bArr[r1] & 255) << 8);
        int i8 = i7 + 1 + 1 + 1 + 1 + 1;
        long j10 = j9 | (bArr[r8] & 255);
        this.size -= 8;
        if (i8 == i6) {
            this.head = j0Var.b();
            k0.d(j0Var);
        } else {
            j0Var.pos = i8;
        }
        return j10;
    }

    @Override // okio.o
    public short readShort() throws EOFException {
        if (this.size < 2) {
            throw new EOFException();
        }
        j0 j0Var = this.head;
        kotlin.jvm.internal.l0.m(j0Var);
        int i5 = j0Var.pos;
        int i6 = j0Var.limit;
        if (i6 - i5 < 2) {
            return (short) (((readByte() & UByte.f27220r) << 8) | (readByte() & UByte.f27220r));
        }
        byte[] bArr = j0Var.data;
        int i7 = i5 + 1;
        int i8 = i7 + 1;
        int i9 = ((bArr[i5] & UByte.f27220r) << 8) | (bArr[i7] & UByte.f27220r);
        this.size -= 2;
        if (i8 == i6) {
            this.head = j0Var.b();
            k0.d(j0Var);
        } else {
            j0Var.pos = i8;
        }
        return (short) i9;
    }

    @Override // okio.o
    public int s0() throws EOFException {
        int i5;
        int i6;
        int i7;
        if (this.size == 0) {
            throw new EOFException();
        }
        byte b02 = b0(0L);
        if ((b02 & ByteCompanionObject.f23584b) == 0) {
            i5 = b02 & ByteCompanionObject.f23585c;
            i7 = 0;
            i6 = 1;
        } else if ((b02 & 224) == 192) {
            i5 = b02 & 31;
            i6 = 2;
            i7 = 128;
        } else if ((b02 & 240) == 224) {
            i5 = b02 & 15;
            i6 = 3;
            i7 = 2048;
        } else {
            if ((b02 & 248) != 240) {
                skip(1L);
                return r0.f31712c;
            }
            i5 = b02 & 7;
            i6 = 4;
            i7 = 65536;
        }
        long j5 = i6;
        if (this.size < j5) {
            StringBuilder a6 = androidx.core.app.x.a(ProtectedSandApp.s("鍥"), i6, ProtectedSandApp.s("鍦"));
            a6.append(this.size);
            a6.append(ProtectedSandApp.s("鍧"));
            a6.append(j.m(b02));
            a6.append(')');
            throw new EOFException(a6.toString());
        }
        for (int i8 = 1; i8 < i6; i8++) {
            long j6 = i8;
            byte b03 = b0(j6);
            if ((b03 & 192) != 128) {
                skip(j6);
                return r0.f31712c;
            }
            i5 = (i5 << 6) | (b03 & r0.f31710a);
        }
        skip(j5);
        return i5 > 1114111 ? r0.f31712c : ((55296 <= i5 && 57343 >= i5) || i5 < i7) ? r0.f31712c : i5;
    }

    @p3.i(name = "size")
    public final long size() {
        return this.size;
    }

    @Override // okio.o
    public void skip(long j5) throws EOFException {
        while (j5 > 0) {
            j0 j0Var = this.head;
            if (j0Var == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j5, j0Var.limit - j0Var.pos);
            long j6 = min;
            this.size -= j6;
            j5 -= j6;
            int i5 = j0Var.pos + min;
            j0Var.pos = i5;
            if (i5 == j0Var.limit) {
                this.head = j0Var.b();
                k0.d(j0Var);
            }
        }
    }

    @Override // okio.m0
    public void t0(@d5.d m mVar, long j5) {
        j0 j0Var;
        kotlin.jvm.internal.l0.p(mVar, ProtectedSandApp.s("鍨"));
        if (!(mVar != this)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("鍩").toString());
        }
        j.e(mVar.size, 0L, j5);
        while (j5 > 0) {
            j0 j0Var2 = mVar.head;
            kotlin.jvm.internal.l0.m(j0Var2);
            int i5 = j0Var2.limit;
            kotlin.jvm.internal.l0.m(mVar.head);
            if (j5 < i5 - r2.pos) {
                j0 j0Var3 = this.head;
                if (j0Var3 != null) {
                    kotlin.jvm.internal.l0.m(j0Var3);
                    j0Var = j0Var3.prev;
                } else {
                    j0Var = null;
                }
                if (j0Var != null && j0Var.owner) {
                    if ((j0Var.limit + j5) - (j0Var.shared ? 0 : j0Var.pos) <= 8192) {
                        j0 j0Var4 = mVar.head;
                        kotlin.jvm.internal.l0.m(j0Var4);
                        j0Var4.g(j0Var, (int) j5);
                        mVar.size -= j5;
                        this.size += j5;
                        return;
                    }
                }
                j0 j0Var5 = mVar.head;
                kotlin.jvm.internal.l0.m(j0Var5);
                mVar.head = j0Var5.e((int) j5);
            }
            j0 j0Var6 = mVar.head;
            kotlin.jvm.internal.l0.m(j0Var6);
            long j6 = j0Var6.limit - j0Var6.pos;
            mVar.head = j0Var6.b();
            j0 j0Var7 = this.head;
            if (j0Var7 == null) {
                this.head = j0Var6;
                j0Var6.prev = j0Var6;
                j0Var6.next = j0Var6;
            } else {
                kotlin.jvm.internal.l0.m(j0Var7);
                j0 j0Var8 = j0Var7.prev;
                kotlin.jvm.internal.l0.m(j0Var8);
                j0Var8.c(j0Var6).a();
            }
            mVar.size -= j6;
            this.size += j6;
            j5 -= j6;
        }
    }

    @Override // okio.n
    @d5.d
    /* renamed from: t1, reason: merged with bridge method [inline-methods] */
    public m A(@d5.d p byteString, int offset, int byteCount) {
        kotlin.jvm.internal.l0.p(byteString, ProtectedSandApp.s("鍪"));
        byteString.v0(this, offset, byteCount);
        return this;
    }

    @d5.d
    public String toString() {
        return b1().toString();
    }

    @Override // okio.o
    public long u(@d5.d p bytes, long fromIndex) throws IOException {
        long j5 = fromIndex;
        kotlin.jvm.internal.l0.p(bytes, ProtectedSandApp.s("鍫"));
        if (!(bytes.i0() > 0)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("鍭").toString());
        }
        long j6 = 0;
        if (!(j5 >= 0)) {
            throw new IllegalArgumentException(com.bumptech.glide.load.resource.bitmap.p0.a(ProtectedSandApp.s("鍬"), j5).toString());
        }
        j0 j0Var = this.head;
        if (j0Var != null) {
            long j7 = this.size;
            if (j7 - j5 < j5) {
                while (j7 > j5) {
                    j0Var = j0Var.prev;
                    kotlin.jvm.internal.l0.m(j0Var);
                    j7 -= j0Var.limit - j0Var.pos;
                }
                byte[] N = bytes.N();
                byte b6 = N[0];
                int i02 = bytes.i0();
                long j8 = (this.size - i02) + 1;
                long j9 = j7;
                while (j9 < j8) {
                    byte[] bArr = j0Var.data;
                    long j10 = j8;
                    int min = (int) Math.min(j0Var.limit, (j0Var.pos + j8) - j9);
                    for (int i5 = (int) ((j0Var.pos + j5) - j9); i5 < min; i5++) {
                        if (bArr[i5] == b6 && v4.a.a0(j0Var, i5 + 1, N, 1, i02)) {
                            return (i5 - j0Var.pos) + j9;
                        }
                    }
                    j9 += j0Var.limit - j0Var.pos;
                    j0Var = j0Var.next;
                    kotlin.jvm.internal.l0.m(j0Var);
                    j5 = j9;
                    j8 = j10;
                }
            } else {
                while (true) {
                    long j11 = (j0Var.limit - j0Var.pos) + j6;
                    if (j11 > j5) {
                        break;
                    }
                    j0Var = j0Var.next;
                    kotlin.jvm.internal.l0.m(j0Var);
                    j6 = j11;
                }
                byte[] N2 = bytes.N();
                byte b7 = N2[0];
                int i03 = bytes.i0();
                long j12 = (this.size - i03) + 1;
                while (j6 < j12) {
                    byte[] bArr2 = j0Var.data;
                    long j13 = j12;
                    int min2 = (int) Math.min(j0Var.limit, (j0Var.pos + j12) - j6);
                    for (int i6 = (int) ((j0Var.pos + j5) - j6); i6 < min2; i6++) {
                        if (bArr2[i6] == b7 && v4.a.a0(j0Var, i6 + 1, N2, 1, i03)) {
                            return (i6 - j0Var.pos) + j6;
                        }
                    }
                    j6 += j0Var.limit - j0Var.pos;
                    j0Var = j0Var.next;
                    kotlin.jvm.internal.l0.m(j0Var);
                    j5 = j6;
                    j12 = j13;
                }
            }
        }
        return -1L;
    }

    @Override // okio.n
    @d5.d
    /* renamed from: u1, reason: merged with bridge method [inline-methods] */
    public m D0(@d5.d o0 source, long byteCount) throws IOException {
        kotlin.jvm.internal.l0.p(source, ProtectedSandApp.s("鍮"));
        while (byteCount > 0) {
            long X0 = source.X0(this, byteCount);
            if (X0 == -1) {
                throw new EOFException();
            }
            byteCount -= X0;
        }
        return this;
    }

    @Override // okio.o
    @d5.d
    public p v(long byteCount) throws EOFException {
        if (!(byteCount >= 0 && byteCount <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(com.bumptech.glide.load.resource.bitmap.p0.a(ProtectedSandApp.s("鍯"), byteCount).toString());
        }
        if (this.size < byteCount) {
            throw new EOFException();
        }
        if (byteCount < 4096) {
            return new p(K0(byteCount));
        }
        p f12 = f1((int) byteCount);
        skip(byteCount);
        return f12;
    }

    @Override // okio.n
    public long v0(@d5.d o0 source) throws IOException {
        kotlin.jvm.internal.l0.p(source, ProtectedSandApp.s("鍰"));
        long j5 = 0;
        while (true) {
            long X0 = source.X0(this, 8192);
            if (X0 == -1) {
                return j5;
            }
            j5 += X0;
        }
    }

    @Override // okio.n
    @d5.d
    /* renamed from: v1, reason: merged with bridge method [inline-methods] */
    public m write(@d5.d byte[] source) {
        kotlin.jvm.internal.l0.p(source, ProtectedSandApp.s("鍱"));
        return write(source, 0, source.length);
    }

    @Override // okio.n
    public n x() {
        return this;
    }

    @Override // okio.o
    @d5.d
    public p x0() {
        return v(this.size);
    }

    @Override // okio.n
    @d5.d
    /* renamed from: x1, reason: merged with bridge method [inline-methods] */
    public m write(@d5.d byte[] source, int offset, int byteCount) {
        kotlin.jvm.internal.l0.p(source, ProtectedSandApp.s("鍳"));
        long j5 = byteCount;
        j.e(source.length, offset, j5);
        int i5 = byteCount + offset;
        while (offset < i5) {
            j0 i12 = i1(1);
            int min = Math.min(i5 - offset, 8192 - i12.limit);
            int i6 = offset + min;
            kotlin.collections.p.v0(source, i12.data, i12.limit, offset, i6);
            i12.limit += min;
            offset = i6;
        }
        this.size += j5;
        return this;
    }

    @Override // okio.n
    @d5.d
    /* renamed from: y1, reason: merged with bridge method [inline-methods] */
    public m writeByte(int b6) {
        j0 i12 = i1(1);
        byte[] bArr = i12.data;
        int i5 = i12.limit;
        i12.limit = i5 + 1;
        bArr[i5] = (byte) b6;
        this.size++;
        return this;
    }

    @Override // okio.n
    @d5.d
    /* renamed from: z1, reason: merged with bridge method [inline-methods] */
    public m j1(long v5) {
        boolean z5;
        if (v5 == 0) {
            return writeByte(48);
        }
        int i5 = 1;
        if (v5 < 0) {
            v5 = -v5;
            if (v5 < 0) {
                return j0(ProtectedSandApp.s("鍴"));
            }
            z5 = true;
        } else {
            z5 = false;
        }
        if (v5 >= 100000000) {
            i5 = v5 < 1000000000000L ? v5 < okhttp3.internal.connection.f.f30880v ? v5 < 1000000000 ? 9 : 10 : v5 < 100000000000L ? 11 : 12 : v5 < 1000000000000000L ? v5 < 10000000000000L ? 13 : v5 < 100000000000000L ? 14 : 15 : v5 < 100000000000000000L ? v5 < 10000000000000000L ? 16 : 17 : v5 < 1000000000000000000L ? 18 : 19;
        } else if (v5 >= 10000) {
            i5 = v5 < 1000000 ? v5 < 100000 ? 5 : 6 : v5 < 10000000 ? 7 : 8;
        } else if (v5 >= 100) {
            i5 = v5 < 1000 ? 3 : 4;
        } else if (v5 >= 10) {
            i5 = 2;
        }
        if (z5) {
            i5++;
        }
        j0 i12 = i1(i5);
        byte[] bArr = i12.data;
        int i6 = i12.limit + i5;
        while (v5 != 0) {
            long j5 = 10;
            i6--;
            bArr[i6] = v4.a.Z()[(int) (v5 % j5)];
            v5 /= j5;
        }
        if (z5) {
            bArr[i6 - 1] = (byte) 45;
        }
        i12.limit += i5;
        this.size += i5;
        return this;
    }

    /* compiled from: Buffer.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016¨\u0006\r"}, d2 = {"okio/m$b", "Ljava/io/InputStream;", "", "read", "", "sink", "offset", "byteCount", "available", "Lkotlin/m2;", "close", "", "toString", "okio"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes5.dex */
    public static final class b extends InputStream {
        b() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(m.this.size(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.InputStream
        public int read() {
            if (m.this.size() > 0) {
                return m.this.readByte() & UByte.f27220r;
            }
            return -1;
        }

        @d5.d
        public String toString() {
            return m.this + ProtectedSandApp.s("桜");
        }

        @Override // java.io.InputStream
        public int read(@d5.d byte[] sink, int offset, int byteCount) {
            kotlin.jvm.internal.l0.p(sink, ProtectedSandApp.s("桛"));
            return m.this.read(sink, offset, byteCount);
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(@d5.d ByteBuffer source) throws IOException {
        kotlin.jvm.internal.l0.p(source, ProtectedSandApp.s("鍲"));
        int remaining = source.remaining();
        int i5 = remaining;
        while (i5 > 0) {
            j0 i12 = i1(1);
            int min = Math.min(i5, 8192 - i12.limit);
            source.get(i12.data, i12.limit, min);
            i5 -= min;
            i12.limit += min;
        }
        this.size += remaining;
        return remaining;
    }

    @Override // okio.o
    public int read(@d5.d byte[] sink) {
        kotlin.jvm.internal.l0.p(sink, ProtectedSandApp.s("鍢"));
        return read(sink, 0, sink.length);
    }

    @Override // okio.o
    public int read(@d5.d byte[] sink, int offset, int byteCount) {
        kotlin.jvm.internal.l0.p(sink, ProtectedSandApp.s("鍣"));
        j.e(sink.length, offset, byteCount);
        j0 j0Var = this.head;
        if (j0Var == null) {
            return -1;
        }
        int min = Math.min(byteCount, j0Var.limit - j0Var.pos);
        byte[] bArr = j0Var.data;
        int i5 = j0Var.pos;
        kotlin.collections.p.v0(bArr, sink, offset, i5, i5 + min);
        int i6 = j0Var.pos + min;
        j0Var.pos = i6;
        this.size -= min;
        if (i6 != j0Var.limit) {
            return min;
        }
        this.head = j0Var.b();
        k0.d(j0Var);
        return min;
    }
}
