package kotlin.random;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.w;

/* compiled from: XorWowRandom.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0000\u0018\u0000 \u00122\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\u0012B\u0017\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007B7\b\u0000\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005H\u0016J\b\u0010\u0011\u001a\u00020\u0005H\u0016R\u000e\u0010\r\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lkotlin/random/XorWowRandom;", "Lkotlin/random/Random;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "seed1", "", "seed2", "(II)V", "x", "y", "z", "w", "v", "addend", "(IIIIII)V", "nextBits", "bitCount", "nextInt", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nXorWowRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 XorWowRandom.kt\nkotlin/random/XorWowRandom\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,60:1\n1#2:61\n*E\n"})
/* renamed from: kotlin.random.i, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
public final class XorWowRandom extends Random implements Serializable {

    /* renamed from: w, reason: collision with root package name */
    @d5.d
    private static final a f23695w = new a(null);

    /* renamed from: x, reason: collision with root package name */
    private static final long f23696x = 0;

    /* renamed from: q, reason: collision with root package name */
    private int f23697q;

    /* renamed from: r, reason: collision with root package name */
    private int f23698r;

    /* renamed from: s, reason: collision with root package name */
    private int f23699s;

    /* renamed from: t, reason: collision with root package name */
    private int f23700t;

    /* renamed from: u, reason: collision with root package name */
    private int f23701u;
    private int v;

    /* compiled from: XorWowRandom.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lkotlin/random/XorWowRandom$Companion;", "", "()V", "serialVersionUID", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.random.i$a */
    private static final class a {
        private a() {
        }

        public a(w wVar) {
        }
    }

    public XorWowRandom(int i5, int i6, int i7, int i8, int i9, int i10) {
        this.f23697q = i5;
        this.f23698r = i6;
        this.f23699s = i7;
        this.f23700t = i8;
        this.f23701u = i9;
        this.v = i10;
        int i11 = i5 | i6 | i7 | i8 | i9;
        if (!(i11 != 0)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("䇣").toString());
        }
        for (int i12 = 0; i12 < 64; i12++) {
            l();
        }
    }

    @Override // kotlin.random.Random
    public int b(int i5) {
        return g.j(l(), i5);
    }

    @Override // kotlin.random.Random
    public int l() {
        int i5 = this.f23697q;
        int i6 = i5 ^ (i5 >>> 2);
        this.f23697q = this.f23698r;
        this.f23698r = this.f23699s;
        this.f23699s = this.f23700t;
        int i7 = this.f23701u;
        this.f23700t = i7;
        int i8 = ((i6 ^ (i6 << 1)) ^ i7) ^ (i7 << 4);
        this.f23701u = i8;
        int i9 = this.v + 362437;
        this.v = i9;
        return i8 + i9;
    }

    public XorWowRandom(int i5, int i6) {
        this(i5, i6, 0, 0, ~i5, (i5 << 10) ^ (i6 >>> 4));
    }
}
