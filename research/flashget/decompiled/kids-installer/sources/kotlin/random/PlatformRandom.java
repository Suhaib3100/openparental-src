package kotlin.random;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.Serializable;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;

/* compiled from: PlatformRandom.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000 \t2\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\tB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lkotlin/random/PlatformRandom;", "Lkotlin/random/AbstractPlatformRandom;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "impl", "Ljava/util/Random;", "(Ljava/util/Random;)V", "getImpl", "()Ljava/util/Random;", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.random.d, reason: from Kotlin metadata */
/* loaded from: classes6.dex */
final class PlatformRandom extends AbstractPlatformRandom implements Serializable {

    /* renamed from: r, reason: collision with root package name */
    @d5.d
    private static final a f23688r = new a(null);

    /* renamed from: s, reason: collision with root package name */
    private static final long f23689s = 0;

    /* renamed from: q, reason: collision with root package name */
    @d5.d
    private final Random f23690q;

    /* compiled from: PlatformRandom.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lkotlin/random/PlatformRandom$Companion;", "", "()V", "serialVersionUID", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.random.d$a */
    /* loaded from: classes5.dex */
    private static final class a {
        private a() {
        }

        public a(w wVar) {
        }
    }

    public PlatformRandom(@d5.d Random random) {
        l0.p(random, ProtectedSandApp.s("罩"));
        this.f23690q = random;
    }

    @Override // kotlin.random.AbstractPlatformRandom
    @d5.d
    /* renamed from: r, reason: from getter */
    public Random getF23690q() {
        return this.f23690q;
    }
}
