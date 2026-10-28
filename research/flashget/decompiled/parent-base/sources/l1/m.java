package l1;

import androidx.annotation.c1;
import androidx.compose.foundation.layout.f3;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: FidoDataTypes.kt */
@c1({c1.a.LIBRARY})
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b\u001c\u0010\n¨\u0006\u001d"}, d2 = {"Ll1/m;", "", "", "name", "", "id", "displayName", "<init>", "(Ljava/lang/String;[BLjava/lang/String;)V", "a", "()Ljava/lang/String;", "b", "()[B", "c", "d", "(Ljava/lang/String;[BLjava/lang/String;)Ll1/m;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "h", "[B", "g", "f", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class m {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String name;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final byte[] id;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String displayName;

    public m(@fg.l String name, @fg.l byte[] id2, @fg.l String displayName) {
        l0.p(name, "name");
        l0.p(id2, "id");
        l0.p(displayName, "displayName");
        this.name = name;
        this.id = id2;
        this.displayName = displayName;
    }

    public static /* synthetic */ m e(m mVar, String str, byte[] bArr, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = mVar.name;
        }
        if ((i4 & 2) != 0) {
            bArr = mVar.id;
        }
        if ((i4 & 4) != 0) {
            str2 = mVar.displayName;
        }
        return mVar.d(str, bArr, str2);
    }

    @fg.l
    /* renamed from: a, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @fg.l
    /* renamed from: b, reason: from getter */
    public final byte[] getId() {
        return this.id;
    }

    @fg.l
    /* renamed from: c, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    @fg.l
    public final m d(@fg.l String name, @fg.l byte[] id2, @fg.l String displayName) {
        l0.p(name, "name");
        l0.p(id2, "id");
        l0.p(displayName, "displayName");
        return new m(name, id2, displayName);
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof m)) {
            return false;
        }
        m mVar = (m) other;
        return l0.g(this.name, mVar.name) && l0.g(this.id, mVar.id) && l0.g(this.displayName, mVar.displayName);
    }

    @fg.l
    public final String f() {
        return this.displayName;
    }

    @fg.l
    public final byte[] g() {
        return this.id;
    }

    @fg.l
    public final String h() {
        return this.name;
    }

    public int hashCode() {
        return this.displayName.hashCode() + ((Arrays.hashCode(this.id) + (this.name.hashCode() * 31)) * 31);
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder("PublicKeyCredentialUserEntity(name=");
        sb.append(this.name);
        sb.append(", id=");
        sb.append(Arrays.toString(this.id));
        sb.append(", displayName=");
        return f3.a(sb, this.displayName, ')');
    }
}
