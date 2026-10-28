package androidx.privacysandbox.ads.adservices.adselection;

import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: ReportImpressionRequest.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/x;", "", "", "adSelectionId", "Landroidx/privacysandbox/ads/adservices/adselection/a;", "adSelectionConfig", "<init>", "(JLandroidx/privacysandbox/ads/adservices/adselection/a;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "J", "b", "()J", "Landroidx/privacysandbox/ads/adservices/adselection/a;", "()Landroidx/privacysandbox/ads/adservices/adselection/a;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long adSelectionId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final a adSelectionConfig;

    public x(long j4, @fg.l a adSelectionConfig) {
        l0.p(adSelectionConfig, "adSelectionConfig");
        this.adSelectionId = j4;
        this.adSelectionConfig = adSelectionConfig;
    }

    @fg.l
    /* renamed from: a, reason: from getter */
    public final a getAdSelectionConfig() {
        return this.adSelectionConfig;
    }

    /* renamed from: b, reason: from getter */
    public final long getAdSelectionId() {
        return this.adSelectionId;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof x)) {
            return false;
        }
        x xVar = (x) other;
        return this.adSelectionId == xVar.adSelectionId && l0.g(this.adSelectionConfig, xVar.adSelectionConfig);
    }

    public int hashCode() {
        return this.adSelectionConfig.hashCode() + (Long.hashCode(this.adSelectionId) * 31);
    }

    @fg.l
    public String toString() {
        return "ReportImpressionRequest: adSelectionId=" + this.adSelectionId + ", adSelectionConfig=" + this.adSelectionConfig;
    }
}
