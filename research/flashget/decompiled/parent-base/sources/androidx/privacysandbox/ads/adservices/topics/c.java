package androidx.privacysandbox.ads.adservices.topics;

import kotlin.Metadata;

/* compiled from: Topic.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0011¨\u0006\u0018"}, d2 = {"Landroidx/privacysandbox/ads/adservices/topics/c;", "", "", "taxonomyVersion", "modelVersion", "", "topicId", "<init>", "(JJI)V", "", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "J", "b", "()J", "c", "I", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long taxonomyVersion;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long modelVersion;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int topicId;

    public c(long j4, long j5, int i4) {
        this.taxonomyVersion = j4;
        this.modelVersion = j5;
        this.topicId = i4;
    }

    /* renamed from: a, reason: from getter */
    public final long getModelVersion() {
        return this.modelVersion;
    }

    /* renamed from: b, reason: from getter */
    public final long getTaxonomyVersion() {
        return this.taxonomyVersion;
    }

    /* renamed from: c, reason: from getter */
    public final int getTopicId() {
        return this.topicId;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof c)) {
            return false;
        }
        c cVar = (c) other;
        return this.taxonomyVersion == cVar.taxonomyVersion && this.modelVersion == cVar.modelVersion && this.topicId == cVar.topicId;
    }

    public int hashCode() {
        return Integer.hashCode(this.topicId) + i0.k.a(this.modelVersion, Long.hashCode(this.taxonomyVersion) * 31, 31);
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder("TaxonomyVersion=");
        sb.append(this.taxonomyVersion);
        sb.append(", ModelVersion=");
        sb.append(this.modelVersion);
        sb.append(", TopicCode=");
        return androidx.constraintlayout.core.motion.key.c.a("Topic { ", android.support.v4.media.b.a(sb, this.topicId, " }"));
    }
}
