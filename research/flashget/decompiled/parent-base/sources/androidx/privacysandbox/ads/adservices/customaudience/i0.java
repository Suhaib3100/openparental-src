package androidx.privacysandbox.ads.adservices.customaudience;

import android.net.Uri;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: TrustedBiddingData.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/privacysandbox/ads/adservices/customaudience/i0;", "", "Landroid/net/Uri;", "trustedBiddingUri", "", "", "trustedBiddingKeys", "<init>", "(Landroid/net/Uri;Ljava/util/List;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Landroid/net/Uri;", "b", "()Landroid/net/Uri;", "Ljava/util/List;", "()Ljava/util/List;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Uri trustedBiddingUri;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<String> trustedBiddingKeys;

    public i0(@fg.l Uri trustedBiddingUri, @fg.l List<String> trustedBiddingKeys) {
        l0.p(trustedBiddingUri, "trustedBiddingUri");
        l0.p(trustedBiddingKeys, "trustedBiddingKeys");
        this.trustedBiddingUri = trustedBiddingUri;
        this.trustedBiddingKeys = trustedBiddingKeys;
    }

    @fg.l
    public final List<String> a() {
        return this.trustedBiddingKeys;
    }

    @fg.l
    /* renamed from: b, reason: from getter */
    public final Uri getTrustedBiddingUri() {
        return this.trustedBiddingUri;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) other;
        return l0.g(this.trustedBiddingUri, i0Var.trustedBiddingUri) && l0.g(this.trustedBiddingKeys, i0Var.trustedBiddingKeys);
    }

    public int hashCode() {
        return this.trustedBiddingKeys.hashCode() + (this.trustedBiddingUri.hashCode() * 31);
    }

    @fg.l
    public String toString() {
        return "TrustedBiddingData: trustedBiddingUri=" + this.trustedBiddingUri + " trustedBiddingKeys=" + this.trustedBiddingKeys;
    }
}
