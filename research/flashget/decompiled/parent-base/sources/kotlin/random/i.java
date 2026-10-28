package kotlin.random;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;

/* compiled from: XorWowRandom.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u001a\b\u0000\u0018\u0000 \u001c2\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\u001dB9\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fB\u0019\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0006\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0016\u0010\b\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016R\u0016\u0010\t\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0016R\u0016\u0010\n\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0016¨\u0006\u001e"}, d2 = {"Lkotlin/random/i;", "Lkotlin/random/f;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "x", "y", "z", "w", "v", "addend", "<init>", "(IIIIII)V", "seed1", "seed2", "(II)V", "l", "()I", "bitCount", "b", "(I)I", "d", "I", "e", "f", "g", "h", "i", "j", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nXorWowRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 XorWowRandom.kt\nkotlin/random/XorWowRandom\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,60:1\n1#2:61\n*E\n"})
/* loaded from: classes7.dex */
public final class i extends f implements Serializable {

    /* renamed from: j, reason: collision with root package name */
    @l
    private static final a f75444j = new a();

    /* renamed from: k, reason: collision with root package name */
    private static final long f75445k = 0;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int x;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int y;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int z;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int w;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int v;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int addend;

    /* compiled from: XorWowRandom.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/random/i$a;", "", "<init>", "()V", "", "serialVersionUID", "J", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a {
        private a() {
        }

        public a(w wVar) {
        }
    }

    public i(int i4, int i5, int i6, int i7, int i10, int i11) {
        this.x = i4;
        this.y = i5;
        this.z = i6;
        this.w = i7;
        this.v = i10;
        this.addend = i11;
        if ((i4 | i5 | i6 | i7 | i10) == 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("斷\u0001"));
        }
        for (int i12 = 0; i12 < 64; i12++) {
            l();
        }
    }

    @Override // kotlin.random.f
    public int b(int bitCount) {
        return g.j(l(), bitCount);
    }

    @Override // kotlin.random.f
    public int l() {
        int i4 = this.x;
        int i5 = i4 ^ (i4 >>> 2);
        this.x = this.y;
        this.y = this.z;
        this.z = this.w;
        int i6 = this.v;
        this.w = i6;
        int i7 = ((i5 ^ (i5 << 1)) ^ i6) ^ (i6 << 4);
        this.v = i7;
        int i10 = this.addend + 362437;
        this.addend = i10;
        return i7 + i10;
    }

    public i(int i4, int i5) {
        this(i4, i5, 0, 0, ~i4, (i4 << 10) ^ (i5 >>> 4));
    }
}
