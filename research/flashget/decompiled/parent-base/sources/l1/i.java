package l1;

import androidx.annotation.c1;
import androidx.compose.ui.graphics.l6;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: FidoDataTypes.kt */
@c1({c1.a.LIBRARY})
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f¨\u0006 "}, d2 = {"Ll1/i;", "", "", "type", "", "id", "", "transports", "<init>", "(Ljava/lang/String;[BLjava/util/List;)V", "a", "()Ljava/lang/String;", "b", "()[B", "c", "()Ljava/util/List;", "d", "(Ljava/lang/String;[BLjava/util/List;)Ll1/i;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "h", "[B", "f", "Ljava/util/List;", "g", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class i {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String type;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final byte[] id;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<String> transports;

    public i(@fg.l String type, @fg.l byte[] id2, @fg.l List<String> transports) {
        l0.p(type, "type");
        l0.p(id2, "id");
        l0.p(transports, "transports");
        this.type = type;
        this.id = id2;
        this.transports = transports;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ i e(i iVar, String str, byte[] bArr, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = iVar.type;
        }
        if ((i4 & 2) != 0) {
            bArr = iVar.id;
        }
        if ((i4 & 4) != 0) {
            list = iVar.transports;
        }
        return iVar.d(str, bArr, list);
    }

    @fg.l
    /* renamed from: a, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @fg.l
    /* renamed from: b, reason: from getter */
    public final byte[] getId() {
        return this.id;
    }

    @fg.l
    public final List<String> c() {
        return this.transports;
    }

    @fg.l
    public final i d(@fg.l String type, @fg.l byte[] id2, @fg.l List<String> transports) {
        l0.p(type, "type");
        l0.p(id2, "id");
        l0.p(transports, "transports");
        return new i(type, id2, transports);
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof i)) {
            return false;
        }
        i iVar = (i) other;
        return l0.g(this.type, iVar.type) && l0.g(this.id, iVar.id) && l0.g(this.transports, iVar.transports);
    }

    @fg.l
    public final byte[] f() {
        return this.id;
    }

    @fg.l
    public final List<String> g() {
        return this.transports;
    }

    @fg.l
    public final String h() {
        return this.type;
    }

    public int hashCode() {
        return this.transports.hashCode() + ((Arrays.hashCode(this.id) + (this.type.hashCode() * 31)) * 31);
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder("PublicKeyCredentialDescriptor(type=");
        sb.append(this.type);
        sb.append(", id=");
        sb.append(Arrays.toString(this.id));
        sb.append(", transports=");
        return l6.a(sb, this.transports, ')');
    }
}
