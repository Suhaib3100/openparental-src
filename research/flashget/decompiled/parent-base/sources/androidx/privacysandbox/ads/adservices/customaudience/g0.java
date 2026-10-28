package androidx.privacysandbox.ads.adservices.customaudience;

import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: JoinCustomAudienceRequest.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/privacysandbox/ads/adservices/customaudience/g0;", "", "Landroidx/privacysandbox/ads/adservices/customaudience/a;", "customAudience", "<init>", "(Landroidx/privacysandbox/ads/adservices/customaudience/a;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Landroidx/privacysandbox/ads/adservices/customaudience/a;", "()Landroidx/privacysandbox/ads/adservices/customaudience/a;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final a customAudience;

    public g0(@fg.l a customAudience) {
        l0.p(customAudience, "customAudience");
        this.customAudience = customAudience;
    }

    @fg.l
    /* renamed from: a, reason: from getter */
    public final a getCustomAudience() {
        return this.customAudience;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof g0) {
            return l0.g(this.customAudience, ((g0) other).customAudience);
        }
        return false;
    }

    public int hashCode() {
        return this.customAudience.hashCode();
    }

    @fg.l
    public String toString() {
        return "JoinCustomAudience: customAudience=" + this.customAudience;
    }
}
