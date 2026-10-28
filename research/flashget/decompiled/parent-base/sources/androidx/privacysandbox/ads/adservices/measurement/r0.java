package androidx.privacysandbox.ads.adservices.measurement;

import android.net.Uri;
import androidx.annotation.x0;
import java.util.List;
import kotlin.Metadata;

/* compiled from: WebTriggerRegistrationRequest.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/privacysandbox/ads/adservices/measurement/r0;", "", "", "Landroidx/privacysandbox/ads/adservices/measurement/q0;", "webTriggerParams", "Landroid/net/Uri;", "destination", "<init>", "(Ljava/util/List;Landroid/net/Uri;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Landroid/net/Uri;", "()Landroid/net/Uri;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@x0(33)
/* loaded from: classes3.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<q0> webTriggerParams;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Uri destination;

    public r0(@fg.l List<q0> webTriggerParams, @fg.l Uri destination) {
        kotlin.jvm.internal.l0.p(webTriggerParams, "webTriggerParams");
        kotlin.jvm.internal.l0.p(destination, "destination");
        this.webTriggerParams = webTriggerParams;
        this.destination = destination;
    }

    @fg.l
    /* renamed from: a, reason: from getter */
    public final Uri getDestination() {
        return this.destination;
    }

    @fg.l
    public final List<q0> b() {
        return this.webTriggerParams;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) other;
        return kotlin.jvm.internal.l0.g(this.webTriggerParams, r0Var.webTriggerParams) && kotlin.jvm.internal.l0.g(this.destination, r0Var.destination);
    }

    public int hashCode() {
        return this.destination.hashCode() + (this.webTriggerParams.hashCode() * 31);
    }

    @fg.l
    public String toString() {
        return "WebTriggerRegistrationRequest { WebTriggerParams=" + this.webTriggerParams + ", Destination=" + this.destination;
    }
}
