package androidx.privacysandbox.ads.adservices.customaudience;

import android.net.Uri;
import java.time.Instant;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: CustomAudience.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001b\u0018\u00002\u00020\u0001:\u0001\u001eBe\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010&\u001a\u0004\b%\u0010(R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b'\u0010)\u001a\u0004\b\"\u0010*R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b\u001e\u0010-R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b$\u0010,\u001a\u0004\b+\u0010-R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b0\u00102\u001a\u0004\b.\u00103¨\u00064"}, d2 = {"Landroidx/privacysandbox/ads/adservices/customaudience/a;", "", "Lx2/c;", "buyer", "", "name", "Landroid/net/Uri;", "dailyUpdateUri", "biddingLogicUri", "", "Lx2/a;", "ads", "Ljava/time/Instant;", "activationTime", "expirationTime", "Lx2/b;", "userBiddingSignals", "Landroidx/privacysandbox/ads/adservices/customaudience/i0;", "trustedBiddingSignals", "<init>", "(Lx2/c;Ljava/lang/String;Landroid/net/Uri;Landroid/net/Uri;Ljava/util/List;Ljava/time/Instant;Ljava/time/Instant;Lx2/b;Landroidx/privacysandbox/ads/adservices/customaudience/i0;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Lx2/c;", "d", "()Lx2/c;", "b", "Ljava/lang/String;", "g", "c", "Landroid/net/Uri;", "e", "()Landroid/net/Uri;", "Ljava/util/List;", "()Ljava/util/List;", "f", "Ljava/time/Instant;", "()Ljava/time/Instant;", "h", "Lx2/b;", "i", "()Lx2/b;", "Landroidx/privacysandbox/ads/adservices/customaudience/i0;", "()Landroidx/privacysandbox/ads/adservices/customaudience/i0;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final x2.c buyer;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String name;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Uri dailyUpdateUri;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Uri biddingLogicUri;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<x2.a> ads;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final Instant activationTime;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final Instant expirationTime;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final x2.b userBiddingSignals;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final i0 trustedBiddingSignals;

    /* compiled from: CustomAudience.kt */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\"\u0010\u0019J\u001b\u0010#\u001a\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b#\u0010$J\r\u0010&\u001a\u00020%¢\u0006\u0004\b&\u0010'R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010(R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010)R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010*R\u0016\u0010\b\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010*R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010+R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010,R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010,R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010.¨\u00060"}, d2 = {"Landroidx/privacysandbox/ads/adservices/customaudience/a$a;", "", "Lx2/c;", "buyer", "", "name", "Landroid/net/Uri;", "dailyUpdateUri", "biddingLogicUri", "", "Lx2/a;", "ads", "<init>", "(Lx2/c;Ljava/lang/String;Landroid/net/Uri;Landroid/net/Uri;Ljava/util/List;)V", "e", "(Lx2/c;)Landroidx/privacysandbox/ads/adservices/customaudience/a$a;", "h", "(Ljava/lang/String;)Landroidx/privacysandbox/ads/adservices/customaudience/a$a;", "Ljava/time/Instant;", "activationTime", "b", "(Ljava/time/Instant;)Landroidx/privacysandbox/ads/adservices/customaudience/a$a;", "expirationTime", "g", "f", "(Landroid/net/Uri;)Landroidx/privacysandbox/ads/adservices/customaudience/a$a;", "Lx2/b;", "userBiddingSignals", "j", "(Lx2/b;)Landroidx/privacysandbox/ads/adservices/customaudience/a$a;", "Landroidx/privacysandbox/ads/adservices/customaudience/i0;", "trustedBiddingSignals", "i", "(Landroidx/privacysandbox/ads/adservices/customaudience/i0;)Landroidx/privacysandbox/ads/adservices/customaudience/a$a;", "d", "c", "(Ljava/util/List;)Landroidx/privacysandbox/ads/adservices/customaudience/a$a;", "Landroidx/privacysandbox/ads/adservices/customaudience/a;", "a", "()Landroidx/privacysandbox/ads/adservices/customaudience/a;", "Lx2/c;", "Ljava/lang/String;", "Landroid/net/Uri;", "Ljava/util/List;", "Ljava/time/Instant;", "Lx2/b;", "Landroidx/privacysandbox/ads/adservices/customaudience/i0;", "trustedBiddingData", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.privacysandbox.ads.adservices.customaudience.a$a, reason: collision with other inner class name */
    public static final class C0575a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private x2.c buyer;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private String name;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private Uri dailyUpdateUri;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private Uri biddingLogicUri;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private List<x2.a> ads;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private Instant activationTime;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private Instant expirationTime;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private x2.b userBiddingSignals;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private i0 trustedBiddingData;

        public C0575a(@fg.l x2.c buyer, @fg.l String name, @fg.l Uri dailyUpdateUri, @fg.l Uri biddingLogicUri, @fg.l List<x2.a> ads) {
            l0.p(buyer, "buyer");
            l0.p(name, "name");
            l0.p(dailyUpdateUri, "dailyUpdateUri");
            l0.p(biddingLogicUri, "biddingLogicUri");
            l0.p(ads, "ads");
            this.buyer = buyer;
            this.name = name;
            this.dailyUpdateUri = dailyUpdateUri;
            this.biddingLogicUri = biddingLogicUri;
            this.ads = ads;
        }

        @fg.l
        public final a a() {
            return new a(this.buyer, this.name, this.dailyUpdateUri, this.biddingLogicUri, this.ads, this.activationTime, this.expirationTime, this.userBiddingSignals, this.trustedBiddingData);
        }

        @fg.l
        public final C0575a b(@fg.l Instant activationTime) {
            l0.p(activationTime, "activationTime");
            this.activationTime = activationTime;
            return this;
        }

        @fg.l
        public final C0575a c(@fg.l List<x2.a> ads) {
            l0.p(ads, "ads");
            this.ads = ads;
            return this;
        }

        @fg.l
        public final C0575a d(@fg.l Uri biddingLogicUri) {
            l0.p(biddingLogicUri, "biddingLogicUri");
            this.biddingLogicUri = biddingLogicUri;
            return this;
        }

        @fg.l
        public final C0575a e(@fg.l x2.c buyer) {
            l0.p(buyer, "buyer");
            this.buyer = buyer;
            return this;
        }

        @fg.l
        public final C0575a f(@fg.l Uri dailyUpdateUri) {
            l0.p(dailyUpdateUri, "dailyUpdateUri");
            this.dailyUpdateUri = dailyUpdateUri;
            return this;
        }

        @fg.l
        public final C0575a g(@fg.l Instant expirationTime) {
            l0.p(expirationTime, "expirationTime");
            this.expirationTime = expirationTime;
            return this;
        }

        @fg.l
        public final C0575a h(@fg.l String name) {
            l0.p(name, "name");
            this.name = name;
            return this;
        }

        @fg.l
        public final C0575a i(@fg.l i0 trustedBiddingSignals) {
            l0.p(trustedBiddingSignals, "trustedBiddingSignals");
            this.trustedBiddingData = trustedBiddingSignals;
            return this;
        }

        @fg.l
        public final C0575a j(@fg.l x2.b userBiddingSignals) {
            l0.p(userBiddingSignals, "userBiddingSignals");
            this.userBiddingSignals = userBiddingSignals;
            return this;
        }
    }

    public a(@fg.l x2.c buyer, @fg.l String name, @fg.l Uri dailyUpdateUri, @fg.l Uri biddingLogicUri, @fg.l List<x2.a> ads, @fg.m Instant instant, @fg.m Instant instant2, @fg.m x2.b bVar, @fg.m i0 i0Var) {
        l0.p(buyer, "buyer");
        l0.p(name, "name");
        l0.p(dailyUpdateUri, "dailyUpdateUri");
        l0.p(biddingLogicUri, "biddingLogicUri");
        l0.p(ads, "ads");
        this.buyer = buyer;
        this.name = name;
        this.dailyUpdateUri = dailyUpdateUri;
        this.biddingLogicUri = biddingLogicUri;
        this.ads = ads;
        this.activationTime = instant;
        this.expirationTime = instant2;
        this.userBiddingSignals = bVar;
        this.trustedBiddingSignals = i0Var;
    }

    @fg.m
    /* renamed from: a, reason: from getter */
    public final Instant getActivationTime() {
        return this.activationTime;
    }

    @fg.l
    public final List<x2.a> b() {
        return this.ads;
    }

    @fg.l
    /* renamed from: c, reason: from getter */
    public final Uri getBiddingLogicUri() {
        return this.biddingLogicUri;
    }

    @fg.l
    /* renamed from: d, reason: from getter */
    public final x2.c getBuyer() {
        return this.buyer;
    }

    @fg.l
    /* renamed from: e, reason: from getter */
    public final Uri getDailyUpdateUri() {
        return this.dailyUpdateUri;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof a)) {
            return false;
        }
        a aVar = (a) other;
        return l0.g(this.buyer, aVar.buyer) && l0.g(this.name, aVar.name) && l0.g(this.activationTime, aVar.activationTime) && l0.g(this.expirationTime, aVar.expirationTime) && l0.g(this.dailyUpdateUri, aVar.dailyUpdateUri) && l0.g(this.userBiddingSignals, aVar.userBiddingSignals) && l0.g(this.trustedBiddingSignals, aVar.trustedBiddingSignals) && l0.g(this.ads, aVar.ads);
    }

    @fg.m
    /* renamed from: f, reason: from getter */
    public final Instant getExpirationTime() {
        return this.expirationTime;
    }

    @fg.l
    /* renamed from: g, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @fg.m
    /* renamed from: h, reason: from getter */
    public final i0 getTrustedBiddingSignals() {
        return this.trustedBiddingSignals;
    }

    public int hashCode() {
        int a5 = androidx.compose.foundation.text.modifiers.n.a(this.name, this.buyer.hashCode() * 31, 31);
        Instant instant = this.activationTime;
        int hashCode = (a5 + (instant != null ? instant.hashCode() : 0)) * 31;
        Instant instant2 = this.expirationTime;
        int hashCode2 = (this.dailyUpdateUri.hashCode() + ((hashCode + (instant2 != null ? instant2.hashCode() : 0)) * 31)) * 31;
        x2.b bVar = this.userBiddingSignals;
        int hashCode3 = (hashCode2 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        i0 i0Var = this.trustedBiddingSignals;
        int hashCode4 = i0Var != null ? i0Var.hashCode() : 0;
        return this.ads.hashCode() + ((this.biddingLogicUri.hashCode() + ((hashCode3 + hashCode4) * 31)) * 31);
    }

    @fg.m
    /* renamed from: i, reason: from getter */
    public final x2.b getUserBiddingSignals() {
        return this.userBiddingSignals;
    }

    @fg.l
    public String toString() {
        return "CustomAudience: buyer=" + this.biddingLogicUri + ", activationTime=" + this.activationTime + ", expirationTime=" + this.expirationTime + ", dailyUpdateUri=" + this.dailyUpdateUri + ", userBiddingSignals=" + this.userBiddingSignals + ", trustedBiddingSignals=" + this.trustedBiddingSignals + ", biddingLogicUri=" + this.biddingLogicUri + ", ads=" + this.ads;
    }

    public /* synthetic */ a(x2.c cVar, String str, Uri uri, Uri uri2, List list, Instant instant, Instant instant2, x2.b bVar, i0 i0Var, int i4, kotlin.jvm.internal.w wVar) {
        this(cVar, str, uri, uri2, list, (i4 & 32) != 0 ? null : instant, (i4 & 64) != 0 ? null : instant2, (i4 & 128) != 0 ? null : bVar, (i4 & 256) != 0 ? null : i0Var);
    }
}
