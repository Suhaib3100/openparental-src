package okhttp3.internal.http2;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import okio.p;

/* compiled from: Header.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0005B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0014B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0014\u0010\u0010\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011¨\u0006\u0017"}, d2 = {"Lokhttp3/internal/http2/b;", "", "", "toString", "Lokio/p;", "a", "b", "name", "value", "c", "", "hashCode", "other", "", "equals", "I", "hpackSize", "Lokio/p;", "<init>", "(Lokio/p;Lokio/p;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "(Lokio/p;Ljava/lang/String;)V", "o", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final /* data */ class b {

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final p f31017d;

    /* renamed from: j, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final p f31023j;

    /* renamed from: k, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final p f31024k;

    /* renamed from: l, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final p f31025l;

    /* renamed from: m, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final p f31026m;

    /* renamed from: n, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final p f31027n;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @p3.f
    public final int hpackSize;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @d5.d
    @p3.f
    public final p name;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @d5.d
    @p3.f
    public final p value;

    /* renamed from: e, reason: collision with root package name */
    @d5.d
    public static final String f31018e = ProtectedSandApp.s("掍");

    /* renamed from: f, reason: collision with root package name */
    @d5.d
    public static final String f31019f = ProtectedSandApp.s("掎");

    /* renamed from: g, reason: collision with root package name */
    @d5.d
    public static final String f31020g = ProtectedSandApp.s("掏");

    /* renamed from: h, reason: collision with root package name */
    @d5.d
    public static final String f31021h = ProtectedSandApp.s("掐");

    /* renamed from: i, reason: collision with root package name */
    @d5.d
    public static final String f31022i = ProtectedSandApp.s("掑");

    static {
        p.Companion companion = p.INSTANCE;
        f31017d = companion.l(ProtectedSandApp.s("排"));
        f31023j = companion.l(ProtectedSandApp.s("掓"));
        f31024k = companion.l(ProtectedSandApp.s("掔"));
        f31025l = companion.l(ProtectedSandApp.s("掕"));
        f31026m = companion.l(ProtectedSandApp.s("掖"));
        f31027n = companion.l(ProtectedSandApp.s("掗"));
    }

    public b(@d5.d p pVar, @d5.d p pVar2) {
        l0.p(pVar, ProtectedSandApp.s("掜"));
        l0.p(pVar2, ProtectedSandApp.s("掝"));
        this.name = pVar;
        this.value = pVar2;
        this.hpackSize = pVar2.i0() + pVar.i0() + 32;
    }

    public static /* synthetic */ b d(b bVar, p pVar, p pVar2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            pVar = bVar.name;
        }
        if ((i5 & 2) != 0) {
            pVar2 = bVar.value;
        }
        return bVar.c(pVar, pVar2);
    }

    @d5.d
    /* renamed from: a, reason: from getter */
    public final p getName() {
        return this.name;
    }

    @d5.d
    /* renamed from: b, reason: from getter */
    public final p getValue() {
        return this.value;
    }

    @d5.d
    public final b c(@d5.d p name, @d5.d p value) {
        l0.p(name, ProtectedSandApp.s("掞"));
        l0.p(value, ProtectedSandApp.s("掟"));
        return new b(name, value);
    }

    public boolean equals(@d5.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof b)) {
            return false;
        }
        b bVar = (b) other;
        return l0.g(this.name, bVar.name) && l0.g(this.value, bVar.value);
    }

    public int hashCode() {
        p pVar = this.name;
        int hashCode = (pVar != null ? pVar.hashCode() : 0) * 31;
        p pVar2 = this.value;
        return hashCode + (pVar2 != null ? pVar2.hashCode() : 0);
    }

    @d5.d
    public String toString() {
        return this.name.t0() + ProtectedSandApp.s("掠") + this.value.t0();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(@d5.d java.lang.String r2, @d5.d java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "掘"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r2, r0)
            java.lang.String r0 = "掙"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r3, r0)
            okio.p$a r0 = okio.p.INSTANCE
            okio.p r2 = r0.l(r2)
            okio.p r3 = r0.l(r3)
            r1.<init>(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.b.<init>(java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(@d5.d p pVar, @d5.d String str) {
        this(pVar, p.INSTANCE.l(str));
        l0.p(pVar, ProtectedSandApp.s("掚"));
        l0.p(str, ProtectedSandApp.s("掛"));
    }
}
