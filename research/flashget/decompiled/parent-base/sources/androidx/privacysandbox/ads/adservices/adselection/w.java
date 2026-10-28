package androidx.privacysandbox.ads.adservices.adselection;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: AdSelectionOutcome.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/w;", "", "", "adSelectionId", "Landroid/net/Uri;", "renderUri", "<init>", "(JLandroid/net/Uri;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "J", "()J", "b", "Landroid/net/Uri;", "()Landroid/net/Uri;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long adSelectionId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Uri renderUri;

    public w(long j4, @fg.l Uri renderUri) {
        l0.p(renderUri, "renderUri");
        this.adSelectionId = j4;
        this.renderUri = renderUri;
    }

    /* renamed from: a, reason: from getter */
    public final long getAdSelectionId() {
        return this.adSelectionId;
    }

    @fg.l
    /* renamed from: b, reason: from getter */
    public final Uri getRenderUri() {
        return this.renderUri;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof w)) {
            return false;
        }
        w wVar = (w) other;
        return this.adSelectionId == wVar.adSelectionId && l0.g(this.renderUri, wVar.renderUri);
    }

    public int hashCode() {
        return this.renderUri.hashCode() + (Long.hashCode(this.adSelectionId) * 31);
    }

    @fg.l
    public String toString() {
        return "AdSelectionOutcome: adSelectionId=" + this.adSelectionId + ", renderUri=" + this.renderUri;
    }
}
