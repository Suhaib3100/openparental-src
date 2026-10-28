package x2;

import android.net.Uri;
import androidx.compose.foundation.layout.f3;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: AdData.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u0016"}, d2 = {"Lx2/a;", "", "Landroid/net/Uri;", "renderUri", "", "metadata", "<init>", "(Landroid/net/Uri;Ljava/lang/String;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Landroid/net/Uri;", "b", "()Landroid/net/Uri;", "Ljava/lang/String;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final Uri renderUri;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final String metadata;

    public a(@l Uri renderUri, @l String metadata) {
        l0.p(renderUri, "renderUri");
        l0.p(metadata, "metadata");
        this.renderUri = renderUri;
        this.metadata = metadata;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final String getMetadata() {
        return this.metadata;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final Uri getRenderUri() {
        return this.renderUri;
    }

    public boolean equals(@m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof a)) {
            return false;
        }
        a aVar = (a) other;
        return l0.g(this.renderUri, aVar.renderUri) && l0.g(this.metadata, aVar.metadata);
    }

    public int hashCode() {
        return this.metadata.hashCode() + (this.renderUri.hashCode() * 31);
    }

    @l
    public String toString() {
        StringBuilder sb = new StringBuilder("AdData: renderUri=");
        sb.append(this.renderUri);
        sb.append(", metadata='");
        return f3.a(sb, this.metadata, '\'');
    }
}
