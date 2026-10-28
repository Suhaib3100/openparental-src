package androidx.privacysandbox.ads.adservices.adselection;

import android.adservices.adselection.AdSelectionConfig;
import android.adservices.adselection.AdSelectionManager;
import android.adservices.adselection.AdSelectionOutcome;
import android.adservices.adselection.ReportImpressionRequest;
import android.adservices.common.AdSelectionSignals;
import android.adservices.common.AdTechIdentifier;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import androidx.annotation.b1;
import androidx.annotation.y0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: AdSelectionManager.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000e\fB\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H§@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH§@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/v;", "", "<init>", "()V", "Landroidx/privacysandbox/ads/adservices/adselection/a;", "adSelectionConfig", "Landroidx/privacysandbox/ads/adservices/adselection/w;", "c", "(Landroidx/privacysandbox/ads/adservices/adselection/a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/privacysandbox/ads/adservices/adselection/x;", "reportImpressionRequest", "Lkotlin/k2;", "b", "(Landroidx/privacysandbox/ads/adservices/adselection/x;Lkotlin/coroutines/d;)Ljava/lang/Object;", "a", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* compiled from: AdSelectionManager.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/v$b;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroidx/privacysandbox/ads/adservices/adselection/v;", "a", "(Landroid/content/Context;)Landroidx/privacysandbox/ads/adservices/adselection/v;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.privacysandbox.ads.adservices.adselection.v$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.m
        @kd.n
        @SuppressLint({"NewApi", "ClassVerificationFailure"})
        public final v a(@fg.l Context context) {
            l0.p(context, "context");
            if (androidx.privacysandbox.ads.adservices.internal.a.f32610a.a() >= 4) {
                return new a(context);
            }
            return null;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    @fg.m
    @kd.n
    @SuppressLint({"NewApi", "ClassVerificationFailure"})
    public static final v a(@fg.l Context context) {
        return INSTANCE.a(context);
    }

    @fg.m
    @b1("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    public abstract Object b(@fg.l x xVar, @fg.l kotlin.coroutines.d<? super k2> dVar);

    @fg.m
    @b1("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    public abstract Object c(@fg.l androidx.privacysandbox.ads.adservices.adselection.a aVar, @fg.l kotlin.coroutines.d<? super w> dVar);

    /* compiled from: AdSelectionManager.kt */
    @Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u001b\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0083@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ1\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u001d2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00120\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u000bH\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020%2\u0006\u0010\u000f\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J\u001b\u0010(\u001a\u00020!2\u0006\u0010\n\u001a\u00020\u000eH\u0097@ø\u0001\u0000¢\u0006\u0004\b(\u0010)J\u001b\u0010,\u001a\u00020+2\u0006\u0010*\u001a\u00020$H\u0097@ø\u0001\u0000¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010.\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006/"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/v$a;", "Landroidx/privacysandbox/ads/adservices/adselection/v;", "Landroid/adservices/adselection/AdSelectionManager;", "mAdSelectionManager", "<init>", "(Landroid/adservices/adselection/AdSelectionManager;)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;)V", "Landroid/adservices/adselection/AdSelectionConfig;", "adSelectionConfig", "Landroid/adservices/adselection/AdSelectionOutcome;", "m", "(Landroid/adservices/adselection/AdSelectionConfig;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/privacysandbox/ads/adservices/adselection/a;", "request", "g", "(Landroidx/privacysandbox/ads/adservices/adselection/a;)Landroid/adservices/adselection/AdSelectionConfig;", "Lx2/b;", "Landroid/adservices/common/AdSelectionSignals;", "h", "(Lx2/b;)Landroid/adservices/common/AdSelectionSignals;", "", "Lx2/c;", "buyers", "", "Landroid/adservices/common/AdTechIdentifier;", "i", "(Ljava/util/List;)Ljava/util/List;", "", "j", "(Ljava/util/Map;)Ljava/util/Map;", "response", "Landroidx/privacysandbox/ads/adservices/adselection/w;", "l", "(Landroid/adservices/adselection/AdSelectionOutcome;)Landroidx/privacysandbox/ads/adservices/adselection/w;", "Landroidx/privacysandbox/ads/adservices/adselection/x;", "Landroid/adservices/adselection/ReportImpressionRequest;", "k", "(Landroidx/privacysandbox/ads/adservices/adselection/x;)Landroid/adservices/adselection/ReportImpressionRequest;", "c", "(Landroidx/privacysandbox/ads/adservices/adselection/a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "reportImpressionRequest", "Lkotlin/k2;", "b", "(Landroidx/privacysandbox/ads/adservices/adselection/x;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroid/adservices/adselection/AdSelectionManager;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SuppressLint({"NewApi", "ClassVerificationFailure"})
    @y0(extension = 1000000, version = 4)
    @r1({"SMAP\nAdSelectionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdSelectionManager.kt\nandroidx/privacysandbox/ads/adservices/adselection/AdSelectionManager$Api33Ext4Impl\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,199:1\n314#2,11:200\n314#2,11:211\n*S KotlinDebug\n*F\n+ 1 AdSelectionManager.kt\nandroidx/privacysandbox/ads/adservices/adselection/AdSelectionManager$Api33Ext4Impl\n*L\n98#1:200,11\n162#1:211,11\n*E\n"})
    private static final class a extends v {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final AdSelectionManager mAdSelectionManager;

        /* compiled from: AdSelectionManager.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager$Api33Ext4Impl", f = "AdSelectionManager.kt", i = {}, l = {92}, m = "selectAds", n = {}, s = {})
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.privacysandbox.ads.adservices.adselection.v$a$a, reason: collision with other inner class name */
        static final class C0572a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: b, reason: collision with root package name */
            Object f32566b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f32567c;

            /* renamed from: e, reason: collision with root package name */
            int f32569e;

            C0572a(kotlin.coroutines.d<? super C0572a> dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                this.f32567c = obj;
                this.f32569e |= Integer.MIN_VALUE;
                return a.this.c(null, this);
            }
        }

        public a(@fg.l AdSelectionManager mAdSelectionManager) {
            l0.p(mAdSelectionManager, "mAdSelectionManager");
            this.mAdSelectionManager = mAdSelectionManager;
        }

        private final AdSelectionConfig g(androidx.privacysandbox.ads.adservices.adselection.a request) {
            AdSelectionConfig.Builder adSelectionSignals;
            AdSelectionConfig.Builder customAudienceBuyers;
            AdSelectionConfig.Builder decisionLogicUri;
            AdTechIdentifier fromString;
            AdSelectionConfig.Builder seller;
            AdSelectionConfig.Builder perBuyerSignals;
            AdSelectionConfig.Builder sellerSignals;
            AdSelectionConfig.Builder trustedScoringSignalsUri;
            AdSelectionConfig build;
            adSelectionSignals = j.a().setAdSelectionSignals(h(request.getAdSelectionSignals()));
            customAudienceBuyers = adSelectionSignals.setCustomAudienceBuyers(i(request.b()));
            decisionLogicUri = customAudienceBuyers.setDecisionLogicUri(request.getDecisionLogicUri());
            fromString = AdTechIdentifier.fromString(request.getSeller().getIdentifier());
            seller = decisionLogicUri.setSeller(fromString);
            perBuyerSignals = seller.setPerBuyerSignals(j(request.d()));
            sellerSignals = perBuyerSignals.setSellerSignals(h(request.getSellerSignals()));
            trustedScoringSignalsUri = sellerSignals.setTrustedScoringSignalsUri(request.getTrustedScoringSignalsUri());
            build = trustedScoringSignalsUri.build();
            l0.o(build, "Builder()\n              …\n                .build()");
            return build;
        }

        private final AdSelectionSignals h(x2.b request) {
            AdSelectionSignals fromString;
            fromString = AdSelectionSignals.fromString(request.getSignals());
            l0.o(fromString, "fromString(request.signals)");
            return fromString;
        }

        private final List<AdTechIdentifier> i(List<x2.c> buyers) {
            AdTechIdentifier fromString;
            ArrayList arrayList = new ArrayList();
            Iterator<x2.c> it = buyers.iterator();
            while (it.hasNext()) {
                fromString = AdTechIdentifier.fromString(it.next().getIdentifier());
                l0.o(fromString, "fromString(buyer.identifier)");
                arrayList.add(fromString);
            }
            return arrayList;
        }

        private final Map<AdTechIdentifier, AdSelectionSignals> j(Map<x2.c, x2.b> request) {
            AdTechIdentifier fromString;
            AdSelectionSignals adSelectionSignals;
            HashMap hashMap = new HashMap();
            for (x2.c cVar : request.keySet()) {
                fromString = AdTechIdentifier.fromString(cVar.getIdentifier());
                l0.o(fromString, "fromString(key.identifier)");
                if (request.get(cVar) != null) {
                    x2.b bVar = request.get(cVar);
                    l0.m(bVar);
                    adSelectionSignals = h(bVar);
                } else {
                    adSelectionSignals = null;
                }
                hashMap.put(fromString, adSelectionSignals);
            }
            return hashMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ReportImpressionRequest k(x request) {
            l.a();
            return k.a(request.getAdSelectionId(), g(request.getAdSelectionConfig()));
        }

        private final w l(AdSelectionOutcome response) {
            long adSelectionId;
            Uri renderUri;
            adSelectionId = response.getAdSelectionId();
            renderUri = response.getRenderUri();
            l0.o(renderUri, "response.renderUri");
            return new w(adSelectionId, renderUri);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @b1("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
        public final Object m(AdSelectionConfig adSelectionConfig, kotlin.coroutines.d<? super AdSelectionOutcome> dVar) {
            kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(kotlin.coroutines.intrinsics.b.e(dVar), 1);
            qVar.e0();
            this.mAdSelectionManager.selectAds(adSelectionConfig, new androidx.credentials.k(), androidx.core.os.v.a(qVar));
            Object y4 = qVar.y();
            if (y4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return y4;
        }

        @Override // androidx.privacysandbox.ads.adservices.adselection.v
        @androidx.annotation.u
        @fg.m
        @b1("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
        public Object b(@fg.l x xVar, @fg.l kotlin.coroutines.d<? super k2> dVar) {
            kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(kotlin.coroutines.intrinsics.b.e(dVar), 1);
            qVar.e0();
            this.mAdSelectionManager.reportImpression(k(xVar), new androidx.credentials.k(), androidx.core.os.v.a(qVar));
            Object y4 = qVar.y();
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            if (y4 == aVar) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return y4 == aVar ? y4 : k2.f75408a;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // androidx.privacysandbox.ads.adservices.adselection.v
        @androidx.annotation.u
        @fg.m
        @androidx.annotation.b1("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object c(@fg.l androidx.privacysandbox.ads.adservices.adselection.a r5, @fg.l kotlin.coroutines.d<? super androidx.privacysandbox.ads.adservices.adselection.w> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof androidx.privacysandbox.ads.adservices.adselection.v.a.C0572a
                if (r0 == 0) goto L13
                r0 = r6
                androidx.privacysandbox.ads.adservices.adselection.v$a$a r0 = (androidx.privacysandbox.ads.adservices.adselection.v.a.C0572a) r0
                int r1 = r0.f32569e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f32569e = r1
                goto L18
            L13:
                androidx.privacysandbox.ads.adservices.adselection.v$a$a r0 = new androidx.privacysandbox.ads.adservices.adselection.v$a$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f32567c
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r2 = r0.f32569e
                r3 = 1
                if (r2 == 0) goto L33
                if (r2 != r3) goto L2b
                java.lang.Object r5 = r0.f32566b
                androidx.privacysandbox.ads.adservices.adselection.v$a r5 = (androidx.privacysandbox.ads.adservices.adselection.v.a) r5
                kotlin.a1.n(r6)
                goto L46
            L2b:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L33:
                kotlin.a1.n(r6)
                android.adservices.adselection.AdSelectionConfig r5 = r4.g(r5)
                r0.f32566b = r4
                r0.f32569e = r3
                java.lang.Object r6 = r4.m(r5, r0)
                if (r6 != r1) goto L45
                return r1
            L45:
                r5 = r4
            L46:
                android.adservices.adselection.AdSelectionOutcome r6 = androidx.privacysandbox.ads.adservices.adselection.o.a(r6)
                androidx.privacysandbox.ads.adservices.adselection.w r5 = r5.l(r6)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.privacysandbox.ads.adservices.adselection.v.a.c(androidx.privacysandbox.ads.adservices.adselection.a, kotlin.coroutines.d):java.lang.Object");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public a(@fg.l android.content.Context r2) {
            /*
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.l0.p(r2, r0)
                java.lang.Class r0 = androidx.privacysandbox.ads.adservices.adselection.b.a()
                java.lang.Object r2 = r2.getSystemService(r0)
                java.lang.String r0 = "context.getSystemService…:class.java\n            )"
                kotlin.jvm.internal.l0.o(r2, r0)
                android.adservices.adselection.AdSelectionManager r2 = androidx.privacysandbox.ads.adservices.adselection.m.a(r2)
                r1.<init>(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.privacysandbox.ads.adservices.adselection.v.a.<init>(android.content.Context):void");
        }
    }
}
