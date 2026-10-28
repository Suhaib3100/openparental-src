package androidx.privacysandbox.ads.adservices.adselection;

import android.net.Uri;
import androidx.compose.ui.graphics.k6;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: AdSelectionConfig.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u000b\u0012\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b\u001e\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u001a\u0010&R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010%\u001a\u0004\b'\u0010&R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u000b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b$\u0010)R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010\u001f\u001a\u0004\b*\u0010!¨\u0006+"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/a;", "", "Lx2/c;", "seller", "Landroid/net/Uri;", "decisionLogicUri", "", "customAudienceBuyers", "Lx2/b;", "adSelectionSignals", "sellerSignals", "", "perBuyerSignals", "trustedScoringSignalsUri", "<init>", "(Lx2/c;Landroid/net/Uri;Ljava/util/List;Lx2/b;Lx2/b;Ljava/util/Map;Landroid/net/Uri;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Lx2/c;", "e", "()Lx2/c;", "b", "Landroid/net/Uri;", "c", "()Landroid/net/Uri;", "Ljava/util/List;", "()Ljava/util/List;", "d", "Lx2/b;", "()Lx2/b;", "f", "Ljava/util/Map;", "()Ljava/util/Map;", "g", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final x2.c seller;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Uri decisionLogicUri;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<x2.c> customAudienceBuyers;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final x2.b adSelectionSignals;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final x2.b sellerSignals;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Map<x2.c, x2.b> perBuyerSignals;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Uri trustedScoringSignalsUri;

    public a(@fg.l x2.c seller, @fg.l Uri decisionLogicUri, @fg.l List<x2.c> customAudienceBuyers, @fg.l x2.b adSelectionSignals, @fg.l x2.b sellerSignals, @fg.l Map<x2.c, x2.b> perBuyerSignals, @fg.l Uri trustedScoringSignalsUri) {
        l0.p(seller, "seller");
        l0.p(decisionLogicUri, "decisionLogicUri");
        l0.p(customAudienceBuyers, "customAudienceBuyers");
        l0.p(adSelectionSignals, "adSelectionSignals");
        l0.p(sellerSignals, "sellerSignals");
        l0.p(perBuyerSignals, "perBuyerSignals");
        l0.p(trustedScoringSignalsUri, "trustedScoringSignalsUri");
        this.seller = seller;
        this.decisionLogicUri = decisionLogicUri;
        this.customAudienceBuyers = customAudienceBuyers;
        this.adSelectionSignals = adSelectionSignals;
        this.sellerSignals = sellerSignals;
        this.perBuyerSignals = perBuyerSignals;
        this.trustedScoringSignalsUri = trustedScoringSignalsUri;
    }

    @fg.l
    /* renamed from: a, reason: from getter */
    public final x2.b getAdSelectionSignals() {
        return this.adSelectionSignals;
    }

    @fg.l
    public final List<x2.c> b() {
        return this.customAudienceBuyers;
    }

    @fg.l
    /* renamed from: c, reason: from getter */
    public final Uri getDecisionLogicUri() {
        return this.decisionLogicUri;
    }

    @fg.l
    public final Map<x2.c, x2.b> d() {
        return this.perBuyerSignals;
    }

    @fg.l
    /* renamed from: e, reason: from getter */
    public final x2.c getSeller() {
        return this.seller;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof a)) {
            return false;
        }
        a aVar = (a) other;
        return l0.g(this.seller, aVar.seller) && l0.g(this.decisionLogicUri, aVar.decisionLogicUri) && l0.g(this.customAudienceBuyers, aVar.customAudienceBuyers) && l0.g(this.adSelectionSignals, aVar.adSelectionSignals) && l0.g(this.sellerSignals, aVar.sellerSignals) && l0.g(this.perBuyerSignals, aVar.perBuyerSignals) && l0.g(this.trustedScoringSignalsUri, aVar.trustedScoringSignalsUri);
    }

    @fg.l
    /* renamed from: f, reason: from getter */
    public final x2.b getSellerSignals() {
        return this.sellerSignals;
    }

    @fg.l
    /* renamed from: g, reason: from getter */
    public final Uri getTrustedScoringSignalsUri() {
        return this.trustedScoringSignalsUri;
    }

    public int hashCode() {
        return this.trustedScoringSignalsUri.hashCode() + ((this.perBuyerSignals.hashCode() + ((this.sellerSignals.hashCode() + ((this.adSelectionSignals.hashCode() + k6.a(this.customAudienceBuyers, (this.decisionLogicUri.hashCode() + (this.seller.hashCode() * 31)) * 31, 31)) * 31)) * 31)) * 31);
    }

    @fg.l
    public String toString() {
        return "AdSelectionConfig: seller=" + this.seller + ", decisionLogicUri='" + this.decisionLogicUri + "', customAudienceBuyers=" + this.customAudienceBuyers + ", adSelectionSignals=" + this.adSelectionSignals + ", sellerSignals=" + this.sellerSignals + ", perBuyerSignals=" + this.perBuyerSignals + ", trustedScoringSignalsUri=" + this.trustedScoringSignalsUri;
    }
}
