package kotlin;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.Serializable;

/* compiled from: Tuples.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\u00060\u0003j\u0002`\u0004B\u0015\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00028\u0001¢\u0006\u0002\u0010\u0007J\u000e\u0010\f\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\tJ\u000e\u0010\r\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\tJ.\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0005\u001a\u00028\u00002\b\b\u0002\u0010\u0006\u001a\u00028\u0001HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u0013\u0010\u0005\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0006\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\t¨\u0006\u0018"}, d2 = {"Lkotlin/Pair;", "A", "B", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "first", "second", "(Ljava/lang/Object;Ljava/lang/Object;)V", "getFirst", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getSecond", "component1", "component2", "copy", "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;", "equals", "", "other", "", "hashCode", "", "toString", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.q0, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
public final /* data */ class Pair<A, B> implements Serializable {

    /* renamed from: o, reason: collision with root package name */
    private final A f23679o;

    /* renamed from: p, reason: collision with root package name */
    private final B f23680p;

    public Pair(A a6, B b6) {
        this.f23679o = a6;
        this.f23680p = b6;
    }

    public static Pair d(Pair pair, Object obj, Object obj2, int i5, Object obj3) {
        if ((i5 & 1) != 0) {
            obj = pair.f23679o;
        }
        if ((i5 & 2) != 0) {
            obj2 = pair.f23680p;
        }
        pair.getClass();
        return new Pair(obj, obj2);
    }

    public final A a() {
        return this.f23679o;
    }

    public final B b() {
        return this.f23680p;
    }

    @d5.d
    public final Pair<A, B> c(A a6, B b6) {
        return new Pair<>(a6, b6);
    }

    public final A e() {
        return this.f23679o;
    }

    public boolean equals(@d5.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) other;
        return kotlin.jvm.internal.l0.g(this.f23679o, pair.f23679o) && kotlin.jvm.internal.l0.g(this.f23680p, pair.f23680p);
    }

    public final B f() {
        return this.f23680p;
    }

    public int hashCode() {
        A a6 = this.f23679o;
        int hashCode = (a6 == null ? 0 : a6.hashCode()) * 31;
        B b6 = this.f23680p;
        return hashCode + (b6 != null ? b6.hashCode() : 0);
    }

    @d5.d
    public String toString() {
        return ProtectedSandApp.s("䆴") + this.f23679o + ProtectedSandApp.s("䆵") + this.f23680p + ')';
    }
}
