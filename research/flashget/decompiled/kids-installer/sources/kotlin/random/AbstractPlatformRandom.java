package kotlin.random;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;

/* compiled from: PlatformRandom.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b \u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\bH\u0016J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\bH\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0017"}, d2 = {"Lkotlin/random/AbstractPlatformRandom;", "Lkotlin/random/Random;", "()V", "impl", "Ljava/util/Random;", "getImpl", "()Ljava/util/Random;", "nextBits", "", "bitCount", "nextBoolean", "", "nextBytes", "", "array", "nextDouble", "", "nextFloat", "", "nextInt", "until", "nextLong", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPlatformRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformRandom.kt\nkotlin/random/AbstractPlatformRandom\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n1#2:94\n*E\n"})
/* renamed from: kotlin.random.a, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
public abstract class AbstractPlatformRandom extends Random {
    @Override // kotlin.random.Random
    public int b(int i5) {
        return g.j(r().nextInt(), i5);
    }

    @Override // kotlin.random.Random
    public boolean c() {
        return r().nextBoolean();
    }

    @Override // kotlin.random.Random
    @d5.d
    public byte[] e(@d5.d byte[] bArr) {
        l0.p(bArr, ProtectedSandApp.s("䆾"));
        r().nextBytes(bArr);
        return bArr;
    }

    @Override // kotlin.random.Random
    public double h() {
        return r().nextDouble();
    }

    @Override // kotlin.random.Random
    public float k() {
        return r().nextFloat();
    }

    @Override // kotlin.random.Random
    public int l() {
        return r().nextInt();
    }

    @Override // kotlin.random.Random
    public int m(int i5) {
        return r().nextInt(i5);
    }

    @Override // kotlin.random.Random
    public long o() {
        return r().nextLong();
    }

    @d5.d
    public abstract Random r();
}
