package androidx.privacysandbox.ads.adservices.adid;

import android.adservices.adid.AdId;
import android.adservices.adid.AdIdManager;
import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.b1;
import androidx.annotation.y0;
import androidx.core.os.v;
import androidx.credentials.k;
import fg.l;
import fg.m;
import kd.n;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.q;

/* compiled from: AdIdManager.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 \u00052\u00020\u0001:\u0002\u0005\u0007B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\u00020\u0004H§@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adid/h;", "", "<init>", "()V", "Landroidx/privacysandbox/ads/adservices/adid/a;", "a", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "b", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    public static final Companion INSTANCE = new Companion();

    /* compiled from: AdIdManager.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adid/h$b;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroidx/privacysandbox/ads/adservices/adid/h;", "a", "(Landroid/content/Context;)Landroidx/privacysandbox/ads/adservices/adid/h;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.privacysandbox.ads.adservices.adid.h$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @m
        @n
        @SuppressLint({"NewApi", "ClassVerificationFailure"})
        public final h a(@l Context context) {
            l0.p(context, "context");
            if (androidx.privacysandbox.ads.adservices.internal.a.f32610a.a() >= 4) {
                return new a(context);
            }
            return null;
        }

        public Companion(w wVar) {
        }
    }

    @m
    @n
    @SuppressLint({"NewApi", "ClassVerificationFailure"})
    public static final h b(@l Context context) {
        return INSTANCE.a(context);
    }

    @m
    @b1("android.permission.ACCESS_ADSERVICES_AD_ID")
    public abstract Object a(@l kotlin.coroutines.d<? super androidx.privacysandbox.ads.adservices.adid.a> dVar);

    /* compiled from: AdIdManager.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0013\u0010\n\u001a\u00020\tH\u0083@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\rH\u0097@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adid/h$a;", "Landroidx/privacysandbox/ads/adservices/adid/h;", "Landroid/adservices/adid/AdIdManager;", "mAdIdManager", "<init>", "(Landroid/adservices/adid/AdIdManager;)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;)V", "Landroid/adservices/adid/AdId;", "f", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "response", "Landroidx/privacysandbox/ads/adservices/adid/a;", "e", "(Landroid/adservices/adid/AdId;)Landroidx/privacysandbox/ads/adservices/adid/a;", "a", "b", "Landroid/adservices/adid/AdIdManager;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    @y0(extension = 1000000, version = 4)
    @r1({"SMAP\nAdIdManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdIdManager.kt\nandroidx/privacysandbox/ads/adservices/adid/AdIdManager$Api33Ext4Impl\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,98:1\n314#2,11:99\n*S KotlinDebug\n*F\n+ 1 AdIdManager.kt\nandroidx/privacysandbox/ads/adservices/adid/AdIdManager$Api33Ext4Impl\n*L\n67#1:99,11\n*E\n"})
    private static final class a extends h {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @l
        private final AdIdManager mAdIdManager;

        /* compiled from: AdIdManager.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.adid.AdIdManager$Api33Ext4Impl", f = "AdIdManager.kt", i = {}, l = {62}, m = "getAdId", n = {}, s = {})
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.privacysandbox.ads.adservices.adid.h$a$a, reason: collision with other inner class name */
        static final class C0571a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: b, reason: collision with root package name */
            Object f32553b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f32554c;

            /* renamed from: e, reason: collision with root package name */
            int f32556e;

            C0571a(kotlin.coroutines.d<? super C0571a> dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object obj) {
                this.f32554c = obj;
                this.f32556e |= Integer.MIN_VALUE;
                return a.this.a(this);
            }
        }

        public a(@l AdIdManager mAdIdManager) {
            l0.p(mAdIdManager, "mAdIdManager");
            this.mAdIdManager = mAdIdManager;
        }

        private final androidx.privacysandbox.ads.adservices.adid.a e(AdId response) {
            String adId;
            boolean isLimitAdTrackingEnabled;
            adId = response.getAdId();
            l0.o(adId, "response.adId");
            isLimitAdTrackingEnabled = response.isLimitAdTrackingEnabled();
            return new androidx.privacysandbox.ads.adservices.adid.a(adId, isLimitAdTrackingEnabled);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @b1("android.permission.ACCESS_ADSERVICES_AD_ID")
        public final Object f(kotlin.coroutines.d<? super AdId> dVar) {
            q qVar = new q(kotlin.coroutines.intrinsics.b.e(dVar), 1);
            qVar.e0();
            this.mAdIdManager.getAdId(new k(), v.a(qVar));
            Object y4 = qVar.y();
            if (y4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return y4;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // androidx.privacysandbox.ads.adservices.adid.h
        @androidx.annotation.u
        @fg.m
        @androidx.annotation.b1("android.permission.ACCESS_ADSERVICES_AD_ID")
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(@fg.l kotlin.coroutines.d<? super androidx.privacysandbox.ads.adservices.adid.a> r5) {
            /*
                r4 = this;
                boolean r0 = r5 instanceof androidx.privacysandbox.ads.adservices.adid.h.a.C0571a
                if (r0 == 0) goto L13
                r0 = r5
                androidx.privacysandbox.ads.adservices.adid.h$a$a r0 = (androidx.privacysandbox.ads.adservices.adid.h.a.C0571a) r0
                int r1 = r0.f32556e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f32556e = r1
                goto L18
            L13:
                androidx.privacysandbox.ads.adservices.adid.h$a$a r0 = new androidx.privacysandbox.ads.adservices.adid.h$a$a
                r0.<init>(r5)
            L18:
                java.lang.Object r5 = r0.f32554c
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r2 = r0.f32556e
                r3 = 1
                if (r2 == 0) goto L33
                if (r2 != r3) goto L2b
                java.lang.Object r0 = r0.f32553b
                androidx.privacysandbox.ads.adservices.adid.h$a r0 = (androidx.privacysandbox.ads.adservices.adid.h.a) r0
                kotlin.a1.n(r5)
                goto L42
            L2b:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L33:
                kotlin.a1.n(r5)
                r0.f32553b = r4
                r0.f32556e = r3
                java.lang.Object r5 = r4.f(r0)
                if (r5 != r1) goto L41
                return r1
            L41:
                r0 = r4
            L42:
                android.adservices.adid.AdId r5 = androidx.privacysandbox.ads.adservices.adid.d.a(r5)
                androidx.privacysandbox.ads.adservices.adid.a r5 = r0.e(r5)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.privacysandbox.ads.adservices.adid.h.a.a(kotlin.coroutines.d):java.lang.Object");
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
                java.lang.Class r0 = androidx.privacysandbox.ads.adservices.adid.e.a()
                java.lang.Object r2 = r2.getSystemService(r0)
                java.lang.String r0 = "context.getSystemService…:class.java\n            )"
                kotlin.jvm.internal.l0.o(r2, r0)
                android.adservices.adid.AdIdManager r2 = androidx.privacysandbox.ads.adservices.adid.f.a(r2)
                r1.<init>(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.privacysandbox.ads.adservices.adid.h.a.<init>(android.content.Context):void");
        }
    }
}
