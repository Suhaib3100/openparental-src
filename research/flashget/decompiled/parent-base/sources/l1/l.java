package l1;

import androidx.annotation.c1;
import androidx.compose.foundation.layout.f3;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: FidoDataTypes.kt */
@c1({c1.a.LIBRARY})
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0016\u0010\b¨\u0006\u0017"}, d2 = {"Ll1/l;", "", "", "name", "id", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "()Ljava/lang/String;", "b", "c", "(Ljava/lang/String;Ljava/lang/String;)Ll1/l;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "f", "e", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class l {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String name;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String id;

    public l(@fg.l String name, @fg.l String id2) {
        l0.p(name, "name");
        l0.p(id2, "id");
        this.name = name;
        this.id = id2;
    }

    public static /* synthetic */ l d(l lVar, String str, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = lVar.name;
        }
        if ((i4 & 2) != 0) {
            str2 = lVar.id;
        }
        return lVar.c(str, str2);
    }

    @fg.l
    /* renamed from: a, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @fg.l
    /* renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @fg.l
    public final l c(@fg.l String name, @fg.l String id2) {
        l0.p(name, "name");
        l0.p(id2, "id");
        return new l(name, id2);
    }

    @fg.l
    public final String e() {
        return this.id;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof l)) {
            return false;
        }
        l lVar = (l) other;
        return l0.g(this.name, lVar.name) && l0.g(this.id, lVar.id);
    }

    @fg.l
    public final String f() {
        return this.name;
    }

    public int hashCode() {
        return this.id.hashCode() + (this.name.hashCode() * 31);
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder("PublicKeyCredentialRpEntity(name=");
        sb.append(this.name);
        sb.append(", id=");
        return f3.a(sb, this.id, ')');
    }
}
