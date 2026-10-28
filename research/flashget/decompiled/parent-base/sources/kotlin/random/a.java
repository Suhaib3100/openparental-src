package kotlin.random;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

/* compiled from: PlatformRandom.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\u0007J\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lkotlin/random/a;", "Lkotlin/random/f;", "<init>", "()V", "", "bitCount", "b", "(I)I", "l", "()I", "until", "m", "", "o", "()J", "", "c", "()Z", "", "h", "()D", "", "k", "()F", "", "array", "e", "([B)[B", "Ljava/util/Random;", "r", "()Ljava/util/Random;", "impl", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nPlatformRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformRandom.kt\nkotlin/random/AbstractPlatformRandom\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n1#2:94\n*E\n"})
/* loaded from: classes7.dex */
public abstract class a extends f {
    @Override // kotlin.random.f
    public int b(int bitCount) {
        return g.j(r().nextInt(), bitCount);
    }

    @Override // kotlin.random.f
    public boolean c() {
        return r().nextBoolean();
    }

    @Override // kotlin.random.f
    @l
    public byte[] e(@l byte[] array) {
        l0.p(array, ProtectedSandApp.s("斟\u0001"));
        r().nextBytes(array);
        return array;
    }

    @Override // kotlin.random.f
    public double h() {
        return r().nextDouble();
    }

    @Override // kotlin.random.f
    public float k() {
        return r().nextFloat();
    }

    @Override // kotlin.random.f
    public int l() {
        return r().nextInt();
    }

    @Override // kotlin.random.f
    public int m(int until) {
        return r().nextInt(until);
    }

    @Override // kotlin.random.f
    public long o() {
        return r().nextLong();
    }

    @l
    public abstract Random r();
}
