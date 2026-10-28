package okhttp3.internal.http2;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import okio.p;

/* compiled from: Header.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001a¨\u0006\u001c"}, d2 = {"Lokhttp3/internal/http2/b;", "", "Lokio/p;", "name", "value", "<init>", "(Lokio/p;Lokio/p;)V", "", "(Ljava/lang/String;Ljava/lang/String;)V", "(Lokio/p;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "a", "()Lokio/p;", "b", "c", "(Lokio/p;Lokio/p;)Lokhttp3/internal/http2/b;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "hpackSize", "Lokio/p;", "o", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final /* data */ class b {

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final p f84544d;

    /* renamed from: j, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final p f84550j;

    /* renamed from: k, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final p f84551k;

    /* renamed from: l, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final p f84552l;

    /* renamed from: m, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final p f84553m;

    /* renamed from: n, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final p f84554n;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @kd.f
    public final int hpackSize;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    @kd.f
    public final p name;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    @kd.f
    public final p value;

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    public static final String f84545e = ProtectedSandApp.s("ᱟ");

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    public static final String f84546f = ProtectedSandApp.s("ᱠ");

    /* renamed from: g, reason: collision with root package name */
    @fg.l
    public static final String f84547g = ProtectedSandApp.s("ᱡ");

    /* renamed from: h, reason: collision with root package name */
    @fg.l
    public static final String f84548h = ProtectedSandApp.s("ᱢ");

    /* renamed from: i, reason: collision with root package name */
    @fg.l
    public static final String f84549i = ProtectedSandApp.s("ᱣ");

    static {
        p.Companion companion = p.INSTANCE;
        f84544d = companion.l(ProtectedSandApp.s("ᱤ"));
        f84550j = companion.l(ProtectedSandApp.s("ᱟ"));
        f84551k = companion.l(ProtectedSandApp.s("ᱠ"));
        f84552l = companion.l(ProtectedSandApp.s("ᱡ"));
        f84553m = companion.l(ProtectedSandApp.s("ᱢ"));
        f84554n = companion.l(ProtectedSandApp.s("ᱣ"));
    }

    public b(@fg.l p pVar, @fg.l p pVar2) {
        l0.p(pVar, ProtectedSandApp.s("ᱥ"));
        l0.p(pVar2, ProtectedSandApp.s("ᱦ"));
        this.name = pVar;
        this.value = pVar2;
        this.hpackSize = pVar2.q() + pVar.q() + 32;
    }

    public static /* synthetic */ b d(b bVar, p pVar, p pVar2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            pVar = bVar.name;
        }
        if ((i4 & 2) != 0) {
            pVar2 = bVar.value;
        }
        return bVar.c(pVar, pVar2);
    }

    @fg.l
    /* renamed from: a, reason: from getter */
    public final p getName() {
        return this.name;
    }

    @fg.l
    /* renamed from: b, reason: from getter */
    public final p getValue() {
        return this.value;
    }

    @fg.l
    public final b c(@fg.l p name, @fg.l p value) {
        l0.p(name, ProtectedSandApp.s("ᱥ"));
        l0.p(value, ProtectedSandApp.s("ᱦ"));
        return new b(name, value);
    }

    public boolean equals(@m Object other) {
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

    @fg.l
    public String toString() {
        return this.name.o0() + ProtectedSandApp.s("ᱧ") + this.value.o0();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(@fg.l java.lang.String r2, @fg.l java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "ᱥ"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r2, r0)
            java.lang.String r0 = "ᱦ"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
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
    public b(@fg.l p pVar, @fg.l String str) {
        this(pVar, p.INSTANCE.l(str));
        l0.p(pVar, ProtectedSandApp.s("ᱥ"));
        l0.p(str, ProtectedSandApp.s("ᱦ"));
    }
}
