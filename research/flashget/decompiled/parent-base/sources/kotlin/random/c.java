package kotlin.random;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;

/* compiled from: PlatformRandom.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0002\u0018\u0000 (2\u00020\u0001:\u0001#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0016\u0010'\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lkotlin/random/c;", "Ljava/util/Random;", "Lkotlin/random/f;", "impl", "<init>", "(Lkotlin/random/f;)V", "", "bits", "next", "(I)I", "nextInt", "()I", "bound", "", "nextBoolean", "()Z", "", "nextLong", "()J", "", "nextFloat", "()F", "", "nextDouble", "()D", "", "bytes", "Lkotlin/k2;", "nextBytes", "([B)V", "seed", "setSeed", "(J)V", "b", "Lkotlin/random/f;", "a", "()Lkotlin/random/f;", "c", "Z", "seedInitialized", "d", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
final class c extends Random {

    /* renamed from: d, reason: collision with root package name */
    @l
    private static final a f75433d = new a();

    /* renamed from: e, reason: collision with root package name */
    private static final long f75434e = 0;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final f impl;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean seedInitialized;

    /* compiled from: PlatformRandom.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/random/c$a;", "", "<init>", "()V", "", "serialVersionUID", "J", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a {
        private a() {
        }

        public a(w wVar) {
        }
    }

    public c(@l f fVar) {
        l0.p(fVar, ProtectedSandApp.s("斡\u0001"));
        this.impl = fVar;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final f getImpl() {
        return this.impl;
    }

    @Override // java.util.Random
    protected int next(int bits) {
        return this.impl.b(bits);
    }

    @Override // java.util.Random
    public boolean nextBoolean() {
        return this.impl.c();
    }

    @Override // java.util.Random
    public void nextBytes(@l byte[] bytes) {
        l0.p(bytes, ProtectedSandApp.s("斢\u0001"));
        this.impl.e(bytes);
    }

    @Override // java.util.Random
    public double nextDouble() {
        return this.impl.h();
    }

    @Override // java.util.Random
    public float nextFloat() {
        return this.impl.k();
    }

    @Override // java.util.Random
    public int nextInt() {
        return this.impl.l();
    }

    @Override // java.util.Random
    public long nextLong() {
        return this.impl.o();
    }

    @Override // java.util.Random
    public void setSeed(long seed) {
        if (this.seedInitialized) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("斣\u0001"));
        }
        this.seedInitialized = true;
    }

    @Override // java.util.Random
    public int nextInt(int bound) {
        return this.impl.m(bound);
    }
}
