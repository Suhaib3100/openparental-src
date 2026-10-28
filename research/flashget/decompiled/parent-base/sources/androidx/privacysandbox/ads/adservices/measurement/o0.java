package androidx.privacysandbox.ads.adservices.measurement;

import android.net.Uri;
import androidx.annotation.x0;
import kotlin.Metadata;

/* compiled from: WebSourceParams.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0011\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/privacysandbox/ads/adservices/measurement/o0;", "", "Landroid/net/Uri;", "registrationUri", "", "debugKeyAllowed", "<init>", "(Landroid/net/Uri;Z)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Landroid/net/Uri;", "b", "()Landroid/net/Uri;", "Z", "()Z", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@x0(33)
/* loaded from: classes3.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Uri registrationUri;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean debugKeyAllowed;

    public o0(@fg.l Uri registrationUri, boolean z4) {
        kotlin.jvm.internal.l0.p(registrationUri, "registrationUri");
        this.registrationUri = registrationUri;
        this.debugKeyAllowed = z4;
    }

    /* renamed from: a, reason: from getter */
    public final boolean getDebugKeyAllowed() {
        return this.debugKeyAllowed;
    }

    @fg.l
    /* renamed from: b, reason: from getter */
    public final Uri getRegistrationUri() {
        return this.registrationUri;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) other;
        return kotlin.jvm.internal.l0.g(this.registrationUri, o0Var.registrationUri) && this.debugKeyAllowed == o0Var.debugKeyAllowed;
    }

    public int hashCode() {
        return Boolean.hashCode(this.debugKeyAllowed) + (this.registrationUri.hashCode() * 31);
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder("WebSourceParams { RegistrationUri=");
        sb.append(this.registrationUri);
        sb.append(", DebugKeyAllowed=");
        return androidx.appcompat.app.h.a(sb, this.debugKeyAllowed, " }");
    }
}
