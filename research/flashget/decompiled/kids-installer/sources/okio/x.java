package okio;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.m2;

/* compiled from: HashingSource.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001dB\u0019\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019B!\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u001bJ\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\r\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\t¨\u0006\u001e"}, d2 = {"Lokio/x;", "Lokio/s;", "Lokio/m;", "sink", "", "byteCount", "X0", "Lokio/p;", "c", "()Lokio/p;", "Ljava/security/MessageDigest;", "p", "Ljava/security/MessageDigest;", "messageDigest", "Ljavax/crypto/Mac;", "q", "Ljavax/crypto/Mac;", "mac", "d", "hash", "Lokio/o0;", "source", "", "algorithm", "<init>", "(Lokio/o0;Ljava/lang/String;)V", "key", "(Lokio/o0;Lokio/p;Ljava/lang/String;)V", "r", "a", "okio"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes6.dex */
public final class x extends s {

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final MessageDigest messageDigest;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final Mac mac;

    /* compiled from: HashingSource.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0007J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0007J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0007¨\u0006\u0010"}, d2 = {"Lokio/x$a;", "", "Lokio/o0;", "source", "Lokio/x;", "d", "e", "f", "g", "Lokio/p;", "key", "a", "b", "c", "<init>", "()V", "okio"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okio.x$a, reason: from kotlin metadata */
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        @d5.d
        @p3.n
        public final x a(@d5.d o0 source, @d5.d p key) {
            kotlin.jvm.internal.l0.p(source, ProtectedSandApp.s("棥"));
            kotlin.jvm.internal.l0.p(key, ProtectedSandApp.s("棦"));
            return new x(source, key, ProtectedSandApp.s("棧"));
        }

        @d5.d
        @p3.n
        public final x b(@d5.d o0 source, @d5.d p key) {
            kotlin.jvm.internal.l0.p(source, ProtectedSandApp.s("棨"));
            kotlin.jvm.internal.l0.p(key, ProtectedSandApp.s("棩"));
            return new x(source, key, ProtectedSandApp.s("棪"));
        }

        @d5.d
        @p3.n
        public final x c(@d5.d o0 source, @d5.d p key) {
            kotlin.jvm.internal.l0.p(source, ProtectedSandApp.s("棫"));
            kotlin.jvm.internal.l0.p(key, ProtectedSandApp.s("棬"));
            return new x(source, key, ProtectedSandApp.s("棭"));
        }

        @d5.d
        @p3.n
        public final x d(@d5.d o0 source) {
            kotlin.jvm.internal.l0.p(source, ProtectedSandApp.s("森"));
            return new x(source, ProtectedSandApp.s("棯"));
        }

        @d5.d
        @p3.n
        public final x e(@d5.d o0 source) {
            kotlin.jvm.internal.l0.p(source, ProtectedSandApp.s("棰"));
            return new x(source, ProtectedSandApp.s("棱"));
        }

        @d5.d
        @p3.n
        public final x f(@d5.d o0 source) {
            kotlin.jvm.internal.l0.p(source, ProtectedSandApp.s("棲"));
            return new x(source, ProtectedSandApp.s("棳"));
        }

        @d5.d
        @p3.n
        public final x g(@d5.d o0 source) {
            kotlin.jvm.internal.l0.p(source, ProtectedSandApp.s("棴"));
            return new x(source, ProtectedSandApp.s("棵"));
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(@d5.d o0 o0Var, @d5.d String str) {
        super(o0Var);
        kotlin.jvm.internal.l0.p(o0Var, ProtectedSandApp.s("鎛"));
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("鎜"));
        this.messageDigest = MessageDigest.getInstance(str);
        this.mac = null;
    }

    @d5.d
    @p3.n
    public static final x e(@d5.d o0 o0Var, @d5.d p pVar) {
        return INSTANCE.a(o0Var, pVar);
    }

    @d5.d
    @p3.n
    public static final x g(@d5.d o0 o0Var, @d5.d p pVar) {
        return INSTANCE.b(o0Var, pVar);
    }

    @d5.d
    @p3.n
    public static final x j(@d5.d o0 o0Var, @d5.d p pVar) {
        return INSTANCE.c(o0Var, pVar);
    }

    @d5.d
    @p3.n
    public static final x k(@d5.d o0 o0Var) {
        return INSTANCE.d(o0Var);
    }

    @d5.d
    @p3.n
    public static final x l(@d5.d o0 o0Var) {
        return INSTANCE.e(o0Var);
    }

    @d5.d
    @p3.n
    public static final x m(@d5.d o0 o0Var) {
        return INSTANCE.f(o0Var);
    }

    @d5.d
    @p3.n
    public static final x n(@d5.d o0 o0Var) {
        return INSTANCE.g(o0Var);
    }

    @Override // okio.s, okio.o0
    public long X0(@d5.d m sink, long byteCount) throws IOException {
        kotlin.jvm.internal.l0.p(sink, ProtectedSandApp.s("鎠"));
        long X0 = super.X0(sink, byteCount);
        if (X0 != -1) {
            long size = sink.size() - X0;
            long size2 = sink.size();
            j0 j0Var = sink.head;
            kotlin.jvm.internal.l0.m(j0Var);
            while (size2 > size) {
                j0Var = j0Var.prev;
                kotlin.jvm.internal.l0.m(j0Var);
                size2 -= j0Var.limit - j0Var.pos;
            }
            while (size2 < sink.size()) {
                int i5 = (int) ((j0Var.pos + size) - size2);
                MessageDigest messageDigest = this.messageDigest;
                if (messageDigest != null) {
                    messageDigest.update(j0Var.data, i5, j0Var.limit - i5);
                } else {
                    Mac mac = this.mac;
                    kotlin.jvm.internal.l0.m(mac);
                    mac.update(j0Var.data, i5, j0Var.limit - i5);
                }
                size2 += j0Var.limit - j0Var.pos;
                j0Var = j0Var.next;
                kotlin.jvm.internal.l0.m(j0Var);
                size = size2;
            }
        }
        return X0;
    }

    @p3.i(name = "-deprecated_hash")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "hash", imports = {}))
    @d5.d
    public final p c() {
        return d();
    }

    @p3.i(name = "hash")
    @d5.d
    public final p d() {
        byte[] doFinal;
        MessageDigest messageDigest = this.messageDigest;
        if (messageDigest != null) {
            doFinal = messageDigest.digest();
        } else {
            Mac mac = this.mac;
            kotlin.jvm.internal.l0.m(mac);
            doFinal = mac.doFinal();
        }
        kotlin.jvm.internal.l0.o(doFinal, ProtectedSandApp.s("鎡"));
        return new p(doFinal);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(@d5.d o0 o0Var, @d5.d p pVar, @d5.d String str) {
        super(o0Var);
        kotlin.jvm.internal.l0.p(o0Var, ProtectedSandApp.s("鎝"));
        kotlin.jvm.internal.l0.p(pVar, ProtectedSandApp.s("鎞"));
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("鎟"));
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(pVar.s0(), str));
            m2 m2Var = m2.f23662a;
            this.mac = mac;
            this.messageDigest = null;
        } catch (InvalidKeyException e6) {
            throw new IllegalArgumentException(e6);
        }
    }
}
