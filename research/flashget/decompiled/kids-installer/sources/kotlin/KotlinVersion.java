package kotlin;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.ranges.IntRange;

/* compiled from: KotlinVersion.kt */
@SinceKotlin(version = "1.1")
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0017B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u0011\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0000H\u0096\u0002J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u000e\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0003H\u0016J\u0016\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003J\u001e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003J\b\u0010\u0014\u001a\u00020\u0015H\u0016J \u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u000e\u0010\f\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lkotlin/KotlinVersion;", "", "major", "", "minor", "(II)V", "patch", "(III)V", "getMajor", "()I", "getMinor", "getPatch", "version", "compareTo", "other", "equals", "", "", "hashCode", "isAtLeast", "toString", "", "versionOf", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.y, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
public final class KotlinVersion implements Comparable<KotlinVersion> {

    /* renamed from: t, reason: collision with root package name */
    public static final int f27229t = 255;

    /* renamed from: o, reason: collision with root package name */
    private final int f27231o;

    /* renamed from: p, reason: collision with root package name */
    private final int f27232p;

    /* renamed from: q, reason: collision with root package name */
    private final int f27233q;

    /* renamed from: r, reason: collision with root package name */
    private final int f27234r;

    /* renamed from: s, reason: collision with root package name */
    @d5.d
    public static final a f27228s = new a(null);

    /* renamed from: u, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final KotlinVersion f27230u = KotlinVersionCurrentValue.a();

    /* compiled from: KotlinVersion.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lkotlin/KotlinVersion$Companion;", "", "()V", "CURRENT", "Lkotlin/KotlinVersion;", "MAX_COMPONENT_VALUE", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.y$a */
    public static final class a {
        private a() {
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    public KotlinVersion(int i5, int i6, int i7) {
        this.f27231o = i5;
        this.f27232p = i6;
        this.f27233q = i7;
        this.f27234r = q(i5, i6, i7);
    }

    private final int q(int i5, int i6, int i7) {
        boolean z5 = false;
        if (new IntRange(0, 255).v(i5) && new IntRange(0, 255).v(i6) && new IntRange(0, 255).v(i7)) {
            z5 = true;
        }
        if (z5) {
            return (i5 << 16) + (i6 << 8) + i7;
        }
        throw new IllegalArgumentException((ProtectedSandApp.s("岇") + i5 + org.apache.commons.io.k.f32026a + i6 + org.apache.commons.io.k.f32026a + i7).toString());
    }

    public boolean equals(@d5.e Object other) {
        if (this == other) {
            return true;
        }
        KotlinVersion kotlinVersion = other instanceof KotlinVersion ? (KotlinVersion) other : null;
        return kotlinVersion != null && this.f27234r == kotlinVersion.f27234r;
    }

    @Override // java.lang.Comparable
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public int compareTo(@d5.d KotlinVersion kotlinVersion) {
        kotlin.jvm.internal.l0.p(kotlinVersion, ProtectedSandApp.s("岈"));
        return this.f27234r - kotlinVersion.f27234r;
    }

    /* renamed from: h, reason: from getter */
    public final int getF27231o() {
        return this.f27231o;
    }

    /* renamed from: hashCode, reason: from getter */
    public int getF27234r() {
        return this.f27234r;
    }

    /* renamed from: j, reason: from getter */
    public final int getF27232p() {
        return this.f27232p;
    }

    /* renamed from: l, reason: from getter */
    public final int getF27233q() {
        return this.f27233q;
    }

    public final boolean o(int i5, int i6) {
        int i7 = this.f27231o;
        return i7 > i5 || (i7 == i5 && this.f27232p >= i6);
    }

    public final boolean p(int i5, int i6, int i7) {
        int i8;
        int i9 = this.f27231o;
        return i9 > i5 || (i9 == i5 && ((i8 = this.f27232p) > i6 || (i8 == i6 && this.f27233q >= i7)));
    }

    @d5.d
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f27231o);
        sb.append(org.apache.commons.io.k.f32026a);
        sb.append(this.f27232p);
        sb.append(org.apache.commons.io.k.f32026a);
        sb.append(this.f27233q);
        return sb.toString();
    }

    public KotlinVersion(int i5, int i6) {
        this(i5, i6, 0);
    }
}
