package l1;

import androidx.annotation.c1;
import androidx.collection.y0;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: FidoDataTypes.kt */
@c1({c1.a.LIBRARY})
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, d2 = {"Ll1/j;", "", "", "type", "", "alg", "<init>", "(Ljava/lang/String;J)V", "a", "()Ljava/lang/String;", "b", "()J", "c", "(Ljava/lang/String;J)Ll1/j;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "f", "J", "e", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class j {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String type;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long alg;

    public j(@fg.l String type, long j4) {
        l0.p(type, "type");
        this.type = type;
        this.alg = j4;
    }

    public static /* synthetic */ j d(j jVar, String str, long j4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = jVar.type;
        }
        if ((i4 & 2) != 0) {
            j4 = jVar.alg;
        }
        return jVar.c(str, j4);
    }

    @fg.l
    /* renamed from: a, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: b, reason: from getter */
    public final long getAlg() {
        return this.alg;
    }

    @fg.l
    public final j c(@fg.l String type, long alg) {
        l0.p(type, "type");
        return new j(type, alg);
    }

    public final long e() {
        return this.alg;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof j)) {
            return false;
        }
        j jVar = (j) other;
        return l0.g(this.type, jVar.type) && this.alg == jVar.alg;
    }

    @fg.l
    public final String f() {
        return this.type;
    }

    public int hashCode() {
        return Long.hashCode(this.alg) + (this.type.hashCode() * 31);
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder("PublicKeyCredentialParameters(type=");
        sb.append(this.type);
        sb.append(", alg=");
        return y0.a(sb, this.alg, ')');
    }
}
