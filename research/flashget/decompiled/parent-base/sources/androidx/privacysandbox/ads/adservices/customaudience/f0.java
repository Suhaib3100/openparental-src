package androidx.privacysandbox.ads.adservices.customaudience;

import android.adservices.common.AdData;
import android.adservices.common.AdSelectionSignals;
import android.adservices.common.AdTechIdentifier;
import android.adservices.customaudience.CustomAudience;
import android.adservices.customaudience.CustomAudienceManager;
import android.adservices.customaudience.JoinCustomAudienceRequest;
import android.adservices.customaudience.LeaveCustomAudienceRequest;
import android.adservices.customaudience.TrustedBiddingData;
import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.b1;
import androidx.annotation.y0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: CustomAudienceManager.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 \u00072\u00020\u0001:\u0002\u0007\nB\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H§@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH§@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Landroidx/privacysandbox/ads/adservices/customaudience/f0;", "", "<init>", "()V", "Landroidx/privacysandbox/ads/adservices/customaudience/g0;", "request", "Lkotlin/k2;", "a", "(Landroidx/privacysandbox/ads/adservices/customaudience/g0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/privacysandbox/ads/adservices/customaudience/h0;", "b", "(Landroidx/privacysandbox/ads/adservices/customaudience/h0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class f0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* compiled from: CustomAudienceManager.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/privacysandbox/ads/adservices/customaudience/f0$b;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroidx/privacysandbox/ads/adservices/customaudience/f0;", "a", "(Landroid/content/Context;)Landroidx/privacysandbox/ads/adservices/customaudience/f0;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.privacysandbox.ads.adservices.customaudience.f0$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.m
        @kd.n
        @SuppressLint({"NewApi", "ClassVerificationFailure"})
        public final f0 a(@fg.l Context context) {
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
    public static final f0 c(@fg.l Context context) {
        return INSTANCE.a(context);
    }

    @fg.m
    @b1("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    public abstract Object a(@fg.l g0 g0Var, @fg.l kotlin.coroutines.d<? super k2> dVar);

    @fg.m
    @b1("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    public abstract Object b(@fg.l h0 h0Var, @fg.l kotlin.coroutines.d<? super k2> dVar);

    /* compiled from: CustomAudienceManager.kt */
    @Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010\u0018\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b\"\u0010#J\u001b\u0010&\u001a\u0004\u0018\u00010%2\b\u0010\u0018\u001a\u0004\u0018\u00010$H\u0002¢\u0006\u0004\b&\u0010'J\u001b\u0010)\u001a\u00020(2\u0006\u0010\n\u001a\u00020\tH\u0097@ø\u0001\u0000¢\u0006\u0004\b)\u0010*J\u001b\u0010+\u001a\u00020(2\u0006\u0010\n\u001a\u00020\u000eH\u0097@ø\u0001\u0000¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010-\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006."}, d2 = {"Landroidx/privacysandbox/ads/adservices/customaudience/f0$a;", "Landroidx/privacysandbox/ads/adservices/customaudience/f0;", "Landroid/adservices/customaudience/CustomAudienceManager;", "customAudienceManager", "<init>", "(Landroid/adservices/customaudience/CustomAudienceManager;)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;)V", "Landroidx/privacysandbox/ads/adservices/customaudience/g0;", "request", "Landroid/adservices/customaudience/JoinCustomAudienceRequest;", "k", "(Landroidx/privacysandbox/ads/adservices/customaudience/g0;)Landroid/adservices/customaudience/JoinCustomAudienceRequest;", "Landroidx/privacysandbox/ads/adservices/customaudience/h0;", "Landroid/adservices/customaudience/LeaveCustomAudienceRequest;", "l", "(Landroidx/privacysandbox/ads/adservices/customaudience/h0;)Landroid/adservices/customaudience/LeaveCustomAudienceRequest;", "Landroidx/privacysandbox/ads/adservices/customaudience/a;", "Landroid/adservices/customaudience/CustomAudience;", "j", "(Landroidx/privacysandbox/ads/adservices/customaudience/a;)Landroid/adservices/customaudience/CustomAudience;", "", "Lx2/a;", "input", "Landroid/adservices/common/AdData;", "g", "(Ljava/util/List;)Ljava/util/List;", "Lx2/c;", "Landroid/adservices/common/AdTechIdentifier;", "h", "(Lx2/c;)Landroid/adservices/common/AdTechIdentifier;", "Landroidx/privacysandbox/ads/adservices/customaudience/i0;", "Landroid/adservices/customaudience/TrustedBiddingData;", "m", "(Landroidx/privacysandbox/ads/adservices/customaudience/i0;)Landroid/adservices/customaudience/TrustedBiddingData;", "Lx2/b;", "Landroid/adservices/common/AdSelectionSignals;", "i", "(Lx2/b;)Landroid/adservices/common/AdSelectionSignals;", "Lkotlin/k2;", "a", "(Landroidx/privacysandbox/ads/adservices/customaudience/g0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "b", "(Landroidx/privacysandbox/ads/adservices/customaudience/h0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroid/adservices/customaudience/CustomAudienceManager;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    @y0(extension = 1000000, version = 4)
    @r1({"SMAP\nCustomAudienceManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomAudienceManager.kt\nandroidx/privacysandbox/ads/adservices/customaudience/CustomAudienceManager$Api33Ext4Impl\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,220:1\n314#2,11:221\n314#2,11:232\n*S KotlinDebug\n*F\n+ 1 CustomAudienceManager.kt\nandroidx/privacysandbox/ads/adservices/customaudience/CustomAudienceManager$Api33Ext4Impl\n*L\n111#1:221,11\n123#1:232,11\n*E\n"})
    private static final class a extends f0 {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final CustomAudienceManager customAudienceManager;

        public a(@fg.l CustomAudienceManager customAudienceManager) {
            l0.p(customAudienceManager, "customAudienceManager");
            this.customAudienceManager = customAudienceManager;
        }

        private final List<AdData> g(List<x2.a> input) {
            AdData.Builder metadata;
            AdData.Builder renderUri;
            AdData build;
            ArrayList arrayList = new ArrayList();
            for (x2.a aVar : input) {
                metadata = s.a().setMetadata(aVar.getMetadata());
                renderUri = metadata.setRenderUri(aVar.getRenderUri());
                build = renderUri.build();
                l0.o(build, "Builder()\n              …                 .build()");
                arrayList.add(build);
            }
            return arrayList;
        }

        private final AdTechIdentifier h(x2.c input) {
            AdTechIdentifier fromString;
            fromString = AdTechIdentifier.fromString(input.getIdentifier());
            l0.o(fromString, "fromString(input.identifier)");
            return fromString;
        }

        private final AdSelectionSignals i(x2.b input) {
            AdSelectionSignals fromString;
            if (input == null) {
                return null;
            }
            fromString = AdSelectionSignals.fromString(input.getSignals());
            return fromString;
        }

        private final CustomAudience j(androidx.privacysandbox.ads.adservices.customaudience.a request) {
            CustomAudience.Builder activationTime;
            CustomAudience.Builder ads;
            CustomAudience.Builder biddingLogicUri;
            CustomAudience.Builder buyer;
            CustomAudience.Builder dailyUpdateUri;
            CustomAudience.Builder expirationTime;
            CustomAudience.Builder name;
            CustomAudience.Builder trustedBiddingData;
            CustomAudience.Builder userBiddingSignals;
            CustomAudience build;
            activationTime = t.a().setActivationTime(request.getActivationTime());
            ads = activationTime.setAds(g(request.b()));
            biddingLogicUri = ads.setBiddingLogicUri(request.getBiddingLogicUri());
            buyer = biddingLogicUri.setBuyer(h(request.getBuyer()));
            dailyUpdateUri = buyer.setDailyUpdateUri(request.getDailyUpdateUri());
            expirationTime = dailyUpdateUri.setExpirationTime(request.getExpirationTime());
            name = expirationTime.setName(request.getName());
            trustedBiddingData = name.setTrustedBiddingData(m(request.getTrustedBiddingSignals()));
            userBiddingSignals = trustedBiddingData.setUserBiddingSignals(i(request.getUserBiddingSignals()));
            build = userBiddingSignals.build();
            l0.o(build, "Builder()\n              …\n                .build()");
            return build;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final JoinCustomAudienceRequest k(g0 request) {
            JoinCustomAudienceRequest.Builder customAudience;
            JoinCustomAudienceRequest build;
            customAudience = v.a().setCustomAudience(j(request.getCustomAudience()));
            build = customAudience.build();
            l0.o(build, "Builder()\n              …\n                .build()");
            return build;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final LeaveCustomAudienceRequest l(h0 request) {
            LeaveCustomAudienceRequest.Builder buyer;
            LeaveCustomAudienceRequest.Builder name;
            LeaveCustomAudienceRequest build;
            buyer = u.a().setBuyer(h(request.getBuyer()));
            name = buyer.setName(request.getName());
            build = name.build();
            l0.o(build, "Builder()\n              …\n                .build()");
            return build;
        }

        private final TrustedBiddingData m(i0 input) {
            TrustedBiddingData.Builder trustedBiddingKeys;
            TrustedBiddingData.Builder trustedBiddingUri;
            TrustedBiddingData build;
            if (input == null) {
                return null;
            }
            trustedBiddingKeys = w.a().setTrustedBiddingKeys(input.a());
            trustedBiddingUri = trustedBiddingKeys.setTrustedBiddingUri(input.getTrustedBiddingUri());
            build = trustedBiddingUri.build();
            return build;
        }

        @Override // androidx.privacysandbox.ads.adservices.customaudience.f0
        @androidx.annotation.u
        @fg.m
        @b1("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
        public Object a(@fg.l g0 g0Var, @fg.l kotlin.coroutines.d<? super k2> dVar) {
            kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(kotlin.coroutines.intrinsics.b.e(dVar), 1);
            qVar.e0();
            this.customAudienceManager.joinCustomAudience(k(g0Var), new androidx.credentials.k(), androidx.core.os.v.a(qVar));
            Object y4 = qVar.y();
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            if (y4 == aVar) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return y4 == aVar ? y4 : k2.f75408a;
        }

        @Override // androidx.privacysandbox.ads.adservices.customaudience.f0
        @androidx.annotation.u
        @fg.m
        @b1("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
        public Object b(@fg.l h0 h0Var, @fg.l kotlin.coroutines.d<? super k2> dVar) {
            kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(kotlin.coroutines.intrinsics.b.e(dVar), 1);
            qVar.e0();
            this.customAudienceManager.leaveCustomAudience(l(h0Var), new androidx.credentials.k(), androidx.core.os.v.a(qVar));
            Object y4 = qVar.y();
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            if (y4 == aVar) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return y4 == aVar ? y4 : k2.f75408a;
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
                java.lang.Class r0 = androidx.privacysandbox.ads.adservices.customaudience.m.a()
                java.lang.Object r2 = r2.getSystemService(r0)
                java.lang.String r0 = "context.getSystemService…:class.java\n            )"
                kotlin.jvm.internal.l0.o(r2, r0)
                android.adservices.customaudience.CustomAudienceManager r2 = androidx.privacysandbox.ads.adservices.customaudience.x.a(r2)
                r1.<init>(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.privacysandbox.ads.adservices.customaudience.f0.a.<init>(android.content.Context):void");
        }
    }
}
