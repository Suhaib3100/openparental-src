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

/* compiled from: HashingSink.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001d2\u00020\u0001:\u0001\u0012B\u0019\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001c\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u001e"}, d2 = {"Lokio/w;", "Lokio/r;", "Lokio/m0;", "sink", "", "algorithm", "<init>", "(Lokio/m0;Ljava/lang/String;)V", "Lokio/p;", "key", "(Lokio/m0;Lokio/p;Ljava/lang/String;)V", "Lokio/m;", "source", "", "byteCount", "Lkotlin/k2;", "write", "(Lokio/m;J)V", "a", "()Lokio/p;", "Ljava/security/MessageDigest;", "b", "Ljava/security/MessageDigest;", "messageDigest", "Ljavax/crypto/Mac;", "c", "Ljavax/crypto/Mac;", "mac", "hash", "d", "okio"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class w extends r {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final MessageDigest messageDigest;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Mac mac;

    /* compiled from: HashingSink.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\bJ\u001f\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0010\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0011\u0010\u000f¨\u0006\u0012"}, d2 = {"Lokio/w$a;", "", "<init>", "()V", "Lokio/m0;", "sink", "Lokio/w;", "d", "(Lokio/m0;)Lokio/w;", "e", "f", "g", "Lokio/p;", "key", "a", "(Lokio/m0;Lokio/p;)Lokio/w;", "b", "c", "okio"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okio.w$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        @kd.n
        public final w a(@fg.l m0 sink, @fg.l p key) {
            kotlin.jvm.internal.l0.p(sink, ProtectedSandApp.s("⁁"));
            kotlin.jvm.internal.l0.p(key, ProtectedSandApp.s("⁂"));
            return new w(sink, key, ProtectedSandApp.s("⁃"));
        }

        @fg.l
        @kd.n
        public final w b(@fg.l m0 sink, @fg.l p key) {
            kotlin.jvm.internal.l0.p(sink, ProtectedSandApp.s("⁁"));
            kotlin.jvm.internal.l0.p(key, ProtectedSandApp.s("⁂"));
            return new w(sink, key, ProtectedSandApp.s("⁄"));
        }

        @fg.l
        @kd.n
        public final w c(@fg.l m0 sink, @fg.l p key) {
            kotlin.jvm.internal.l0.p(sink, ProtectedSandApp.s("⁁"));
            kotlin.jvm.internal.l0.p(key, ProtectedSandApp.s("⁂"));
            return new w(sink, key, ProtectedSandApp.s("⁅"));
        }

        @fg.l
        @kd.n
        public final w d(@fg.l m0 sink) {
            kotlin.jvm.internal.l0.p(sink, ProtectedSandApp.s("⁁"));
            return new w(sink, ProtectedSandApp.s("⁆"));
        }

        @fg.l
        @kd.n
        public final w e(@fg.l m0 sink) {
            kotlin.jvm.internal.l0.p(sink, ProtectedSandApp.s("⁁"));
            return new w(sink, ProtectedSandApp.s("⁇"));
        }

        @fg.l
        @kd.n
        public final w f(@fg.l m0 sink) {
            kotlin.jvm.internal.l0.p(sink, ProtectedSandApp.s("⁁"));
            return new w(sink, ProtectedSandApp.s("⁈"));
        }

        @fg.l
        @kd.n
        public final w g(@fg.l m0 sink) {
            kotlin.jvm.internal.l0.p(sink, ProtectedSandApp.s("⁁"));
            return new w(sink, ProtectedSandApp.s("⁉"));
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(@fg.l m0 m0Var, @fg.l String str) {
        super(m0Var);
        kotlin.jvm.internal.l0.p(m0Var, ProtectedSandApp.s("⁊"));
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("⁋"));
        this.messageDigest = MessageDigest.getInstance(str);
        this.mac = null;
    }

    @fg.l
    @kd.n
    public static final w c(@fg.l m0 m0Var, @fg.l p pVar) {
        return INSTANCE.a(m0Var, pVar);
    }

    @fg.l
    @kd.n
    public static final w d(@fg.l m0 m0Var, @fg.l p pVar) {
        return INSTANCE.b(m0Var, pVar);
    }

    @fg.l
    @kd.n
    public static final w e(@fg.l m0 m0Var, @fg.l p pVar) {
        return INSTANCE.c(m0Var, pVar);
    }

    @fg.l
    @kd.n
    public static final w f(@fg.l m0 m0Var) {
        return INSTANCE.d(m0Var);
    }

    @fg.l
    @kd.n
    public static final w g(@fg.l m0 m0Var) {
        return INSTANCE.e(m0Var);
    }

    @fg.l
    @kd.n
    public static final w h(@fg.l m0 m0Var) {
        return INSTANCE.f(m0Var);
    }

    @fg.l
    @kd.n
    public static final w i(@fg.l m0 m0Var) {
        return INSTANCE.g(m0Var);
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "hash", imports = {}))
    @kd.i(name = "-deprecated_hash")
    public final p a() {
        return b();
    }

    @fg.l
    @kd.i(name = "hash")
    public final p b() {
        byte[] doFinal;
        MessageDigest messageDigest = this.messageDigest;
        if (messageDigest != null) {
            doFinal = messageDigest.digest();
        } else {
            Mac mac = this.mac;
            kotlin.jvm.internal.l0.m(mac);
            doFinal = mac.doFinal();
        }
        kotlin.jvm.internal.l0.o(doFinal, ProtectedSandApp.s("⁍"));
        return new p(doFinal);
    }

    @Override // okio.r, okio.m0
    public void write(@fg.l m source, long byteCount) throws IOException {
        kotlin.jvm.internal.l0.p(source, ProtectedSandApp.s("⁎"));
        j.e(source.size(), 0L, byteCount);
        j0 j0Var = source.head;
        kotlin.jvm.internal.l0.m(j0Var);
        long j4 = 0;
        while (j4 < byteCount) {
            int min = (int) Math.min(byteCount - j4, j0Var.limit - j0Var.pos);
            MessageDigest messageDigest = this.messageDigest;
            if (messageDigest != null) {
                messageDigest.update(j0Var.data, j0Var.pos, min);
            } else {
                Mac mac = this.mac;
                kotlin.jvm.internal.l0.m(mac);
                mac.update(j0Var.data, j0Var.pos, min);
            }
            j4 += min;
            j0Var = j0Var.next;
            kotlin.jvm.internal.l0.m(j0Var);
        }
        super.write(source, byteCount);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(@fg.l m0 m0Var, @fg.l p pVar, @fg.l String str) {
        super(m0Var);
        kotlin.jvm.internal.l0.p(m0Var, ProtectedSandApp.s("⁊"));
        kotlin.jvm.internal.l0.p(pVar, ProtectedSandApp.s("⁌"));
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("⁋"));
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
