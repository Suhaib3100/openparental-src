package okio;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.k2;
import kotlin.x0;

/* compiled from: HashingSource.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB\u0019\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\nJ\u001f\u0010\u000f\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0014R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001a\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0012¨\u0006\u001d"}, d2 = {"Lokio/x;", "Lokio/s;", "Lokio/o0;", "source", "", "algorithm", "<init>", "(Lokio/o0;Ljava/lang/String;)V", "Lokio/p;", "key", "(Lokio/o0;Lokio/p;Ljava/lang/String;)V", "Lokio/m;", "sink", "", "byteCount", "w3", "(Lokio/m;J)J", "c", "()Lokio/p;", "Ljava/security/MessageDigest;", "Ljava/security/MessageDigest;", "messageDigest", "Ljavax/crypto/Mac;", "d", "Ljavax/crypto/Mac;", "mac", "hash", "e", "a", "okio"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class x extends s {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final MessageDigest messageDigest;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Mac mac;

    /* compiled from: HashingSource.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\bJ\u001f\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0010\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0011\u0010\u000f¨\u0006\u0012"}, d2 = {"Lokio/x$a;", "", "<init>", "()V", "Lokio/o0;", "source", "Lokio/x;", "d", "(Lokio/o0;)Lokio/x;", "e", "f", "g", "Lokio/p;", "key", "a", "(Lokio/o0;Lokio/p;)Lokio/x;", "b", "c", "okio"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okio.x$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        @kd.n
        public final x a(@fg.l o0 source, @fg.l p key) {
            kotlin.jvm.internal.l0.p(source, ProtectedSandApp.s("⁏"));
            kotlin.jvm.internal.l0.p(key, ProtectedSandApp.s("⁐"));
            return new x(source, key, ProtectedSandApp.s("⁑"));
        }

        @fg.l
        @kd.n
        public final x b(@fg.l o0 source, @fg.l p key) {
            kotlin.jvm.internal.l0.p(source, ProtectedSandApp.s("⁏"));
            kotlin.jvm.internal.l0.p(key, ProtectedSandApp.s("⁐"));
            return new x(source, key, ProtectedSandApp.s("⁒"));
        }

        @fg.l
        @kd.n
        public final x c(@fg.l o0 source, @fg.l p key) {
            kotlin.jvm.internal.l0.p(source, ProtectedSandApp.s("⁏"));
            kotlin.jvm.internal.l0.p(key, ProtectedSandApp.s("⁐"));
            return new x(source, key, ProtectedSandApp.s("⁓"));
        }

        @fg.l
        @kd.n
        public final x d(@fg.l o0 source) {
            kotlin.jvm.internal.l0.p(source, ProtectedSandApp.s("⁏"));
            return new x(source, ProtectedSandApp.s("⁔"));
        }

        @fg.l
        @kd.n
        public final x e(@fg.l o0 source) {
            kotlin.jvm.internal.l0.p(source, ProtectedSandApp.s("⁏"));
            return new x(source, ProtectedSandApp.s("⁕"));
        }

        @fg.l
        @kd.n
        public final x f(@fg.l o0 source) {
            kotlin.jvm.internal.l0.p(source, ProtectedSandApp.s("⁏"));
            return new x(source, ProtectedSandApp.s("⁖"));
        }

        @fg.l
        @kd.n
        public final x g(@fg.l o0 source) {
            kotlin.jvm.internal.l0.p(source, ProtectedSandApp.s("⁏"));
            return new x(source, ProtectedSandApp.s("⁗"));
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(@fg.l o0 o0Var, @fg.l String str) {
        super(o0Var);
        kotlin.jvm.internal.l0.p(o0Var, ProtectedSandApp.s("⁘"));
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("⁙"));
        this.messageDigest = MessageDigest.getInstance(str);
        this.mac = null;
    }

    @fg.l
    @kd.n
    public static final x e(@fg.l o0 o0Var, @fg.l p pVar) {
        return INSTANCE.a(o0Var, pVar);
    }

    @fg.l
    @kd.n
    public static final x f(@fg.l o0 o0Var, @fg.l p pVar) {
        return INSTANCE.b(o0Var, pVar);
    }

    @fg.l
    @kd.n
    public static final x g(@fg.l o0 o0Var, @fg.l p pVar) {
        return INSTANCE.c(o0Var, pVar);
    }

    @fg.l
    @kd.n
    public static final x h(@fg.l o0 o0Var) {
        return INSTANCE.d(o0Var);
    }

    @fg.l
    @kd.n
    public static final x i(@fg.l o0 o0Var) {
        return INSTANCE.e(o0Var);
    }

    @fg.l
    @kd.n
    public static final x k(@fg.l o0 o0Var) {
        return INSTANCE.f(o0Var);
    }

    @fg.l
    @kd.n
    public static final x l(@fg.l o0 o0Var) {
        return INSTANCE.g(o0Var);
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "hash", imports = {}))
    @kd.i(name = "-deprecated_hash")
    public final p c() {
        return d();
    }

    @fg.l
    @kd.i(name = "hash")
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
        kotlin.jvm.internal.l0.o(doFinal, ProtectedSandApp.s("⁛"));
        return new p(doFinal);
    }

    @Override // okio.s, okio.o0
    public long w3(@fg.l m sink, long byteCount) throws IOException {
        kotlin.jvm.internal.l0.p(sink, ProtectedSandApp.s("⁜"));
        long w32 = super.w3(sink, byteCount);
        if (w32 != -1) {
            long size = sink.size() - w32;
            long size2 = sink.size();
            j0 j0Var = sink.head;
            kotlin.jvm.internal.l0.m(j0Var);
            while (size2 > size) {
                j0Var = j0Var.prev;
                kotlin.jvm.internal.l0.m(j0Var);
                size2 -= j0Var.limit - j0Var.pos;
            }
            while (size2 < sink.size()) {
                int i4 = (int) ((j0Var.pos + size) - size2);
                MessageDigest messageDigest = this.messageDigest;
                if (messageDigest != null) {
                    messageDigest.update(j0Var.data, i4, j0Var.limit - i4);
                } else {
                    Mac mac = this.mac;
                    kotlin.jvm.internal.l0.m(mac);
                    mac.update(j0Var.data, i4, j0Var.limit - i4);
                }
                size2 += j0Var.limit - j0Var.pos;
                j0Var = j0Var.next;
                kotlin.jvm.internal.l0.m(j0Var);
                size = size2;
            }
        }
        return w32;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(@fg.l o0 o0Var, @fg.l p pVar, @fg.l String str) {
        super(o0Var);
        kotlin.jvm.internal.l0.p(o0Var, ProtectedSandApp.s("⁘"));
        kotlin.jvm.internal.l0.p(pVar, ProtectedSandApp.s("⁚"));
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("⁙"));
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(pVar.n0(), str));
            k2 k2Var = k2.f75408a;
            this.mac = mac;
            this.messageDigest = null;
        } catch (InvalidKeyException e4) {
            throw new IllegalArgumentException(e4);
        }
    }
}
