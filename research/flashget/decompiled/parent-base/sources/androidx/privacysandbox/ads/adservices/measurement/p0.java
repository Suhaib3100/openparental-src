package androidx.privacysandbox.ads.adservices.measurement;

import android.net.Uri;
import android.view.InputEvent;
import androidx.annotation.x0;
import java.util.List;
import kotlin.Metadata;

/* compiled from: WebSourceRegistrationRequest.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0018BM\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b\u001c\u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b\u0018\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b#\u0010\u001fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001d\u001a\u0004\b\"\u0010\u001f¨\u0006$"}, d2 = {"Landroidx/privacysandbox/ads/adservices/measurement/p0;", "", "", "Landroidx/privacysandbox/ads/adservices/measurement/o0;", "webSourceParams", "Landroid/net/Uri;", "topOriginUri", "Landroid/view/InputEvent;", "inputEvent", "appDestination", "webDestination", "verifiedDestination", "<init>", "(Ljava/util/List;Landroid/net/Uri;Landroid/view/InputEvent;Landroid/net/Uri;Landroid/net/Uri;Landroid/net/Uri;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Ljava/util/List;", "f", "()Ljava/util/List;", "b", "Landroid/net/Uri;", "c", "()Landroid/net/Uri;", "Landroid/view/InputEvent;", "()Landroid/view/InputEvent;", "d", "e", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@x0(33)
/* loaded from: classes3.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<o0> webSourceParams;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Uri topOriginUri;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final InputEvent inputEvent;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final Uri appDestination;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final Uri webDestination;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final Uri verifiedDestination;

    /* compiled from: WebSourceRegistrationRequest.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0013\u0010\u000fJ\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0018R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0018R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0018R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018¨\u0006\u001b"}, d2 = {"Landroidx/privacysandbox/ads/adservices/measurement/p0$a;", "", "", "Landroidx/privacysandbox/ads/adservices/measurement/o0;", "webSourceParams", "Landroid/net/Uri;", "topOriginUri", "<init>", "(Ljava/util/List;Landroid/net/Uri;)V", "Landroid/view/InputEvent;", "inputEvent", "c", "(Landroid/view/InputEvent;)Landroidx/privacysandbox/ads/adservices/measurement/p0$a;", "appDestination", "b", "(Landroid/net/Uri;)Landroidx/privacysandbox/ads/adservices/measurement/p0$a;", "webDestination", "e", "verifiedDestination", "d", "Landroidx/privacysandbox/ads/adservices/measurement/p0;", "a", "()Landroidx/privacysandbox/ads/adservices/measurement/p0;", "Ljava/util/List;", "Landroid/net/Uri;", "Landroid/view/InputEvent;", "f", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final List<o0> webSourceParams;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final Uri topOriginUri;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private InputEvent inputEvent;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private Uri appDestination;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private Uri webDestination;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private Uri verifiedDestination;

        public a(@fg.l List<o0> webSourceParams, @fg.l Uri topOriginUri) {
            kotlin.jvm.internal.l0.p(webSourceParams, "webSourceParams");
            kotlin.jvm.internal.l0.p(topOriginUri, "topOriginUri");
            this.webSourceParams = webSourceParams;
            this.topOriginUri = topOriginUri;
        }

        @fg.l
        public final p0 a() {
            return new p0(this.webSourceParams, this.topOriginUri, this.inputEvent, this.appDestination, this.webDestination, this.verifiedDestination);
        }

        @fg.l
        public final a b(@fg.m Uri appDestination) {
            this.appDestination = appDestination;
            return this;
        }

        @fg.l
        public final a c(@fg.l InputEvent inputEvent) {
            kotlin.jvm.internal.l0.p(inputEvent, "inputEvent");
            this.inputEvent = inputEvent;
            return this;
        }

        @fg.l
        public final a d(@fg.m Uri verifiedDestination) {
            this.verifiedDestination = verifiedDestination;
            return this;
        }

        @fg.l
        public final a e(@fg.m Uri webDestination) {
            this.webDestination = webDestination;
            return this;
        }
    }

    public p0(@fg.l List<o0> webSourceParams, @fg.l Uri topOriginUri, @fg.m InputEvent inputEvent, @fg.m Uri uri, @fg.m Uri uri2, @fg.m Uri uri3) {
        kotlin.jvm.internal.l0.p(webSourceParams, "webSourceParams");
        kotlin.jvm.internal.l0.p(topOriginUri, "topOriginUri");
        this.webSourceParams = webSourceParams;
        this.topOriginUri = topOriginUri;
        this.inputEvent = inputEvent;
        this.appDestination = uri;
        this.webDestination = uri2;
        this.verifiedDestination = uri3;
    }

    @fg.m
    /* renamed from: a, reason: from getter */
    public final Uri getAppDestination() {
        return this.appDestination;
    }

    @fg.m
    /* renamed from: b, reason: from getter */
    public final InputEvent getInputEvent() {
        return this.inputEvent;
    }

    @fg.l
    /* renamed from: c, reason: from getter */
    public final Uri getTopOriginUri() {
        return this.topOriginUri;
    }

    @fg.m
    /* renamed from: d, reason: from getter */
    public final Uri getVerifiedDestination() {
        return this.verifiedDestination;
    }

    @fg.m
    /* renamed from: e, reason: from getter */
    public final Uri getWebDestination() {
        return this.webDestination;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) other;
        return kotlin.jvm.internal.l0.g(this.webSourceParams, p0Var.webSourceParams) && kotlin.jvm.internal.l0.g(this.webDestination, p0Var.webDestination) && kotlin.jvm.internal.l0.g(this.appDestination, p0Var.appDestination) && kotlin.jvm.internal.l0.g(this.topOriginUri, p0Var.topOriginUri) && kotlin.jvm.internal.l0.g(this.inputEvent, p0Var.inputEvent) && kotlin.jvm.internal.l0.g(this.verifiedDestination, p0Var.verifiedDestination);
    }

    @fg.l
    public final List<o0> f() {
        return this.webSourceParams;
    }

    public int hashCode() {
        int hashCode = this.topOriginUri.hashCode() + (this.webSourceParams.hashCode() * 31);
        InputEvent inputEvent = this.inputEvent;
        if (inputEvent != null) {
            hashCode = (hashCode * 31) + inputEvent.hashCode();
        }
        Uri uri = this.appDestination;
        if (uri != null) {
            hashCode = (hashCode * 31) + uri.hashCode();
        }
        Uri uri2 = this.webDestination;
        if (uri2 != null) {
            hashCode = (hashCode * 31) + uri2.hashCode();
        }
        int hashCode2 = this.topOriginUri.hashCode() + (hashCode * 31);
        InputEvent inputEvent2 = this.inputEvent;
        if (inputEvent2 != null) {
            hashCode2 = (hashCode2 * 31) + inputEvent2.hashCode();
        }
        Uri uri3 = this.verifiedDestination;
        return uri3 != null ? (hashCode2 * 31) + uri3.hashCode() : hashCode2;
    }

    @fg.l
    public String toString() {
        return android.support.v4.media.d.a("WebSourceRegistrationRequest { ", "WebSourceParams=[" + this.webSourceParams + "], TopOriginUri=" + this.topOriginUri + ", InputEvent=" + this.inputEvent + ", AppDestination=" + this.appDestination + ", WebDestination=" + this.webDestination + ", VerifiedDestination=" + this.verifiedDestination, " }");
    }

    public /* synthetic */ p0(List list, Uri uri, InputEvent inputEvent, Uri uri2, Uri uri3, Uri uri4, int i4, kotlin.jvm.internal.w wVar) {
        this(list, uri, (i4 & 4) != 0 ? null : inputEvent, (i4 & 8) != 0 ? null : uri2, (i4 & 16) != 0 ? null : uri3, (i4 & 32) != 0 ? null : uri4);
    }
}
