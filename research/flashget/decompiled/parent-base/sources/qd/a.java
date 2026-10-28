package qd;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: PlatformThreadLocalRandom.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lqd/a;", "Lkotlin/random/a;", "<init>", "()V", "", "from", "until", "n", "(II)I", "", "p", "(J)J", "q", "(JJ)J", "", "i", "(D)D", "Ljava/util/Random;", "r", "()Ljava/util/Random;", "impl", "kotlin-stdlib-jdk8"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class a extends kotlin.random.a {
    @Override // kotlin.random.f
    public double i(double until) {
        return ThreadLocalRandom.current().nextDouble(until);
    }

    @Override // kotlin.random.f
    public int n(int from, int until) {
        return ThreadLocalRandom.current().nextInt(from, until);
    }

    @Override // kotlin.random.f
    public long p(long until) {
        return ThreadLocalRandom.current().nextLong(until);
    }

    @Override // kotlin.random.f
    public long q(long from, long until) {
        return ThreadLocalRandom.current().nextLong(from, until);
    }

    @Override // kotlin.random.a
    @l
    public Random r() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        l0.o(current, ProtectedSandApp.s("ꋹ\u0001"));
        return current;
    }
}
