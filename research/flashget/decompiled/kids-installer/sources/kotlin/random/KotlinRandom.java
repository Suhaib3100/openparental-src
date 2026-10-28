package kotlin.random;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;

/* compiled from: PlatformRandom.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0002\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0014J\b\u0010\f\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\nH\u0016J\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\nH\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0018H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lkotlin/random/KotlinRandom;", "Ljava/util/Random;", "impl", "Lkotlin/random/Random;", "(Lkotlin/random/Random;)V", "getImpl", "()Lkotlin/random/Random;", "seedInitialized", "", "next", "", "bits", "nextBoolean", "nextBytes", "", "bytes", "", "nextDouble", "", "nextFloat", "", "nextInt", "bound", "nextLong", "", "setSeed", "seed", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.random.c, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
final class KotlinRandom extends Random {

    /* renamed from: q, reason: collision with root package name */
    @d5.d
    private static final a f23684q = new a(null);

    /* renamed from: r, reason: collision with root package name */
    private static final long f23685r = 0;

    /* renamed from: o, reason: collision with root package name */
    @d5.d
    private final Random f23686o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f23687p;

    /* compiled from: PlatformRandom.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lkotlin/random/KotlinRandom$Companion;", "", "()V", "serialVersionUID", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.random.c$a */
    private static final class a {
        private a() {
        }

        public a(w wVar) {
        }
    }

    public KotlinRandom(@d5.d Random random) {
        l0.p(random, ProtectedSandApp.s("䆿"));
        this.f23686o = random;
    }

    @d5.d
    /* renamed from: a, reason: from getter */
    public final Random getF23686o() {
        return this.f23686o;
    }

    @Override // java.util.Random
    protected int next(int bits) {
        return this.f23686o.b(bits);
    }

    @Override // java.util.Random
    public boolean nextBoolean() {
        return this.f23686o.c();
    }

    @Override // java.util.Random
    public void nextBytes(@d5.d byte[] bytes) {
        l0.p(bytes, ProtectedSandApp.s("䇀"));
        this.f23686o.e(bytes);
    }

    @Override // java.util.Random
    public double nextDouble() {
        return this.f23686o.h();
    }

    @Override // java.util.Random
    public float nextFloat() {
        return this.f23686o.k();
    }

    @Override // java.util.Random
    public int nextInt() {
        return this.f23686o.l();
    }

    @Override // java.util.Random
    public long nextLong() {
        return this.f23686o.o();
    }

    @Override // java.util.Random
    public void setSeed(long seed) {
        if (this.f23687p) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("䇁"));
        }
        this.f23687p = true;
    }

    @Override // java.util.Random
    public int nextInt(int bound) {
        return this.f23686o.m(bound);
    }
}
