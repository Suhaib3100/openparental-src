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

/* compiled from: HashingSink.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001eB\u0019\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aB!\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u001b\u001a\u00020\b\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001cJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u000f\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u0013\u0010\n¨\u0006\u001f"}, d2 = {"Lokio/w;", "Lokio/r;", "Lokio/m;", "source", "", "byteCount", "Lkotlin/m2;", "t0", "Lokio/p;", "c", "()Lokio/p;", "Ljava/security/MessageDigest;", "p", "Ljava/security/MessageDigest;", "messageDigest", "Ljavax/crypto/Mac;", "q", "Ljavax/crypto/Mac;", "mac", "d", "hash", "Lokio/m0;", "sink", "", "algorithm", "<init>", "(Lokio/m0;Ljava/lang/String;)V", "key", "(Lokio/m0;Lokio/p;Ljava/lang/String;)V", "r", "a", "okio"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes6.dex */
public final class w extends r {

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final MessageDigest messageDigest;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final Mac mac;

    /* compiled from: HashingSink.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0007J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0007J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0007¨\u0006\u0010"}, d2 = {"Lokio/w$a;", "", "Lokio/m0;", "sink", "Lokio/w;", "d", "e", "f", "g", "Lokio/p;", "key", "a", "b", "c", "<init>", "()V", "okio"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okio.w$a, reason: from kotlin metadata */
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        @d5.d
        @p3.n
        public final w a(@d5.d m0 sink, @d5.d p key) {
            kotlin.jvm.internal.l0.p(sink, ProtectedSandApp.s("棔"));
            kotlin.jvm.internal.l0.p(key, ProtectedSandApp.s("棕"));
            return new w(sink, key, ProtectedSandApp.s("棖"));
        }

        @d5.d
        @p3.n
        public final w b(@d5.d m0 sink, @d5.d p key) {
            kotlin.jvm.internal.l0.p(sink, ProtectedSandApp.s("棗"));
            kotlin.jvm.internal.l0.p(key, ProtectedSandApp.s("棘"));
            return new w(sink, key, ProtectedSandApp.s("棙"));
        }

        @d5.d
        @p3.n
        public final w c(@d5.d m0 sink, @d5.d p key) {
            kotlin.jvm.internal.l0.p(sink, ProtectedSandApp.s("棚"));
            kotlin.jvm.internal.l0.p(key, ProtectedSandApp.s("棛"));
            return new w(sink, key, ProtectedSandApp.s("棜"));
        }

        @d5.d
        @p3.n
        public final w d(@d5.d m0 sink) {
            kotlin.jvm.internal.l0.p(sink, ProtectedSandApp.s("棝"));
            return new w(sink, ProtectedSandApp.s("棞"));
        }

        @d5.d
        @p3.n
        public final w e(@d5.d m0 sink) {
            kotlin.jvm.internal.l0.p(sink, ProtectedSandApp.s("棟"));
            return new w(sink, ProtectedSandApp.s("棠"));
        }

        @d5.d
        @p3.n
        public final w f(@d5.d m0 sink) {
            kotlin.jvm.internal.l0.p(sink, ProtectedSandApp.s("棡"));
            return new w(sink, ProtectedSandApp.s("棢"));
        }

        @d5.d
        @p3.n
        public final w g(@d5.d m0 sink) {
            kotlin.jvm.internal.l0.p(sink, ProtectedSandApp.s("棣"));
            return new w(sink, ProtectedSandApp.s("棤"));
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(@d5.d m0 m0Var, @d5.d String str) {
        super(m0Var);
        kotlin.jvm.internal.l0.p(m0Var, ProtectedSandApp.s("鎔"));
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("鎕"));
        this.messageDigest = MessageDigest.getInstance(str);
        this.mac = null;
    }

    @d5.d
    @p3.n
    public static final w e(@d5.d m0 m0Var, @d5.d p pVar) {
        return INSTANCE.a(m0Var, pVar);
    }

    @d5.d
    @p3.n
    public static final w g(@d5.d m0 m0Var, @d5.d p pVar) {
        return INSTANCE.b(m0Var, pVar);
    }

    @d5.d
    @p3.n
    public static final w j(@d5.d m0 m0Var, @d5.d p pVar) {
        return INSTANCE.c(m0Var, pVar);
    }

    @d5.d
    @p3.n
    public static final w k(@d5.d m0 m0Var) {
        return INSTANCE.d(m0Var);
    }

    @d5.d
    @p3.n
    public static final w l(@d5.d m0 m0Var) {
        return INSTANCE.e(m0Var);
    }

    @d5.d
    @p3.n
    public static final w m(@d5.d m0 m0Var) {
        return INSTANCE.f(m0Var);
    }

    @d5.d
    @p3.n
    public static final w n(@d5.d m0 m0Var) {
        return INSTANCE.g(m0Var);
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
        kotlin.jvm.internal.l0.o(doFinal, ProtectedSandApp.s("鎙"));
        return new p(doFinal);
    }

    @Override // okio.r, okio.m0
    public void t0(@d5.d m mVar, long j5) throws IOException {
        kotlin.jvm.internal.l0.p(mVar, ProtectedSandApp.s("鎚"));
        j.e(mVar.size(), 0L, j5);
        j0 j0Var = mVar.head;
        kotlin.jvm.internal.l0.m(j0Var);
        long j6 = 0;
        while (j6 < j5) {
            int min = (int) Math.min(j5 - j6, j0Var.limit - j0Var.pos);
            MessageDigest messageDigest = this.messageDigest;
            if (messageDigest != null) {
                messageDigest.update(j0Var.data, j0Var.pos, min);
            } else {
                Mac mac = this.mac;
                kotlin.jvm.internal.l0.m(mac);
                mac.update(j0Var.data, j0Var.pos, min);
            }
            j6 += min;
            j0Var = j0Var.next;
            kotlin.jvm.internal.l0.m(j0Var);
        }
        super.t0(mVar, j5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(@d5.d m0 m0Var, @d5.d p pVar, @d5.d String str) {
        super(m0Var);
        kotlin.jvm.internal.l0.p(m0Var, ProtectedSandApp.s("鎖"));
        kotlin.jvm.internal.l0.p(pVar, ProtectedSandApp.s("鎗"));
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("鎘"));
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
