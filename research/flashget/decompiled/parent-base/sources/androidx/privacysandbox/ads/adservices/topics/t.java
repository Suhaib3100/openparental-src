package androidx.privacysandbox.ads.adservices.topics;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import android.adservices.topics.TopicsManager;
import android.annotation.SuppressLint;
import androidx.annotation.b1;
import androidx.annotation.c1;
import androidx.annotation.u;
import androidx.annotation.y0;
import androidx.core.os.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

/* compiled from: TopicsManagerImplCommon.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0083@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0097@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0010¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Landroidx/privacysandbox/ads/adservices/topics/t;", "Landroidx/privacysandbox/ads/adservices/topics/d;", "Landroid/adservices/topics/TopicsManager;", "mTopicsManager", "<init>", "(Landroid/adservices/topics/TopicsManager;)V", "Landroid/adservices/topics/GetTopicsRequest;", "getTopicsRequest", "Landroid/adservices/topics/GetTopicsResponse;", "h", "(Landroid/adservices/topics/GetTopicsRequest;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/privacysandbox/ads/adservices/topics/a;", "request", "Landroidx/privacysandbox/ads/adservices/topics/b;", "a", "(Landroidx/privacysandbox/ads/adservices/topics/a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "e", "(Landroidx/privacysandbox/ads/adservices/topics/a;)Landroid/adservices/topics/GetTopicsRequest;", "response", "f", "(Landroid/adservices/topics/GetTopicsResponse;)Landroidx/privacysandbox/ads/adservices/topics/b;", "b", "Landroid/adservices/topics/TopicsManager;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"NewApi"})
@y0(extension = 1000000, version = 4)
@c1({c1.a.LIBRARY})
@r1({"SMAP\nTopicsManagerImplCommon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopicsManagerImplCommon.kt\nandroidx/privacysandbox/ads/adservices/topics/TopicsManagerImplCommon\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,54:1\n314#2,11:55\n*S KotlinDebug\n*F\n+ 1 TopicsManagerImplCommon.kt\nandroidx/privacysandbox/ads/adservices/topics/TopicsManagerImplCommon\n*L\n28#1:55,11\n*E\n"})
/* loaded from: classes3.dex */
public class t extends d {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final TopicsManager mTopicsManager;

    /* compiled from: TopicsManagerImplCommon.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon", f = "TopicsManagerImplCommon.kt", i = {}, l = {22}, m = "getTopics$suspendImpl", n = {}, s = {})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f32714b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f32715c;

        /* renamed from: e, reason: collision with root package name */
        int f32717e;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f32715c = obj;
            this.f32717e |= Integer.MIN_VALUE;
            return t.g(t.this, null, this);
        }
    }

    public t(@fg.l TopicsManager mTopicsManager) {
        l0.p(mTopicsManager, "mTopicsManager");
        this.mTopicsManager = mTopicsManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @androidx.annotation.u
    @androidx.annotation.b1("android.permission.ACCESS_ADSERVICES_TOPICS")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.Object g(androidx.privacysandbox.ads.adservices.topics.t r4, androidx.privacysandbox.ads.adservices.topics.a r5, kotlin.coroutines.d<? super androidx.privacysandbox.ads.adservices.topics.b> r6) {
        /*
            boolean r0 = r6 instanceof androidx.privacysandbox.ads.adservices.topics.t.a
            if (r0 == 0) goto L13
            r0 = r6
            androidx.privacysandbox.ads.adservices.topics.t$a r0 = (androidx.privacysandbox.ads.adservices.topics.t.a) r0
            int r1 = r0.f32717e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32717e = r1
            goto L18
        L13:
            androidx.privacysandbox.ads.adservices.topics.t$a r0 = new androidx.privacysandbox.ads.adservices.topics.t$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f32715c
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f32717e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.f32714b
            androidx.privacysandbox.ads.adservices.topics.t r4 = (androidx.privacysandbox.ads.adservices.topics.t) r4
            kotlin.a1.n(r6)
            goto L45
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            kotlin.a1.n(r6)
            android.adservices.topics.GetTopicsRequest r5 = r4.e(r5)
            r0.f32714b = r4
            r0.f32717e = r3
            java.lang.Object r6 = r4.h(r5, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            android.adservices.topics.GetTopicsResponse r5 = androidx.privacysandbox.ads.adservices.topics.m.a(r6)
            androidx.privacysandbox.ads.adservices.topics.b r4 = r4.f(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.privacysandbox.ads.adservices.topics.t.g(androidx.privacysandbox.ads.adservices.topics.t, androidx.privacysandbox.ads.adservices.topics.a, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @b1("android.permission.ACCESS_ADSERVICES_TOPICS")
    public final Object h(GetTopicsRequest getTopicsRequest, kotlin.coroutines.d<? super GetTopicsResponse> dVar) {
        kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        qVar.e0();
        this.mTopicsManager.getTopics(getTopicsRequest, new androidx.credentials.k(), v.a(qVar));
        Object y4 = qVar.y();
        if (y4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y4;
    }

    @Override // androidx.privacysandbox.ads.adservices.topics.d
    @u
    @fg.m
    @b1("android.permission.ACCESS_ADSERVICES_TOPICS")
    public Object a(@fg.l androidx.privacysandbox.ads.adservices.topics.a aVar, @fg.l kotlin.coroutines.d<? super b> dVar) {
        return g(this, aVar, dVar);
    }

    @fg.l
    public GetTopicsRequest e(@fg.l androidx.privacysandbox.ads.adservices.topics.a request) {
        GetTopicsRequest.Builder adsSdkName;
        GetTopicsRequest build;
        l0.p(request, "request");
        adsSdkName = k.a().setAdsSdkName(request.getAdsSdkName());
        build = adsSdkName.build();
        l0.o(build, "Builder()\n            .s…ame)\n            .build()");
        return build;
    }

    @fg.l
    public final b f(@fg.l GetTopicsResponse response) {
        List topics;
        long taxonomyVersion;
        long modelVersion;
        int topicId;
        l0.p(response, "response");
        ArrayList arrayList = new ArrayList();
        topics = response.getTopics();
        Iterator it = topics.iterator();
        while (it.hasNext()) {
            Topic a5 = o.a(it.next());
            taxonomyVersion = a5.getTaxonomyVersion();
            modelVersion = a5.getModelVersion();
            topicId = a5.getTopicId();
            arrayList.add(new c(taxonomyVersion, modelVersion, topicId));
        }
        return new b(arrayList);
    }
}
