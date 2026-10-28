package androidx.privacysandbox.ads.adservices.java.adselection;

import android.content.Context;
import androidx.annotation.b1;
import androidx.annotation.u;
import androidx.privacysandbox.ads.adservices.adselection.v;
import androidx.privacysandbox.ads.adservices.adselection.w;
import androidx.privacysandbox.ads.adservices.adselection.x;
import com.google.common.util.concurrent.ListenableFuture;
import fg.l;
import fg.m;
import kd.n;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlinx.coroutines.j1;
import kotlinx.coroutines.k;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.z0;
import ld.p;

/* compiled from: AdSelectionManagerFutures.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 \u000f2\u00020\u0001:\u0002\u000f\rB\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\u0006\u0010\u000b\u001a\u00020\nH'¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Landroidx/privacysandbox/ads/adservices/java/adselection/a;", "", "<init>", "()V", "Landroidx/privacysandbox/ads/adservices/adselection/a;", "adSelectionConfig", "Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/privacysandbox/ads/adservices/adselection/w;", "c", "(Landroidx/privacysandbox/ads/adservices/adselection/a;)Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/privacysandbox/ads/adservices/adselection/x;", "reportImpressionRequest", "Lkotlin/k2;", "b", "(Landroidx/privacysandbox/ads/adservices/adselection/x;)Lcom/google/common/util/concurrent/ListenableFuture;", "a", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    public static final Companion INSTANCE = new Companion();

    /* compiled from: AdSelectionManagerFutures.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\b2\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/privacysandbox/ads/adservices/java/adselection/a$a;", "Landroidx/privacysandbox/ads/adservices/java/adselection/a;", "Landroidx/privacysandbox/ads/adservices/adselection/v;", "mAdSelectionManager", "<init>", "(Landroidx/privacysandbox/ads/adservices/adselection/v;)V", "Landroidx/privacysandbox/ads/adservices/adselection/a;", "adSelectionConfig", "Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/privacysandbox/ads/adservices/adselection/w;", "c", "(Landroidx/privacysandbox/ads/adservices/adselection/a;)Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/privacysandbox/ads/adservices/adselection/x;", "reportImpressionRequest", "Lkotlin/k2;", "b", "(Landroidx/privacysandbox/ads/adservices/adselection/x;)Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/privacysandbox/ads/adservices/adselection/v;", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.privacysandbox.ads.adservices.java.adselection.a$a, reason: collision with other inner class name */
    private static final class C0579a extends a {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @m
        private final v mAdSelectionManager;

        /* compiled from: AdSelectionManagerFutures.kt */
        @f(c = "androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures$Api33Ext4JavaImpl$reportImpressionAsync$1", f = "AdSelectionManagerFutures.kt", i = {}, l = {104}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.privacysandbox.ads.adservices.java.adselection.a$a$a, reason: collision with other inner class name */
        static final class C0580a extends o implements p<r0, d<? super k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f32618b;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ x f32620d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0580a(x xVar, d<? super C0580a> dVar) {
                super(2, dVar);
                this.f32620d = xVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @l
            public final d<k2> create(@m Object obj, @l d<?> dVar) {
                return C0579a.this.new C0580a(this.f32620d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f32618b;
                if (i4 == 0) {
                    a1.n(obj);
                    v vVar = C0579a.this.mAdSelectionManager;
                    l0.m(vVar);
                    x xVar = this.f32620d;
                    this.f32618b = 1;
                    if (vVar.b(xVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a1.n(obj);
                }
                return k2.f75408a;
            }

            @Override // ld.p
            @m
            public final Object invoke(@l r0 r0Var, @m d<? super k2> dVar) {
                return ((C0580a) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
            }
        }

        /* compiled from: AdSelectionManagerFutures.kt */
        @f(c = "androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures$Api33Ext4JavaImpl$selectAdsAsync$1", f = "AdSelectionManagerFutures.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Landroidx/privacysandbox/ads/adservices/adselection/w;", "<anonymous>", "(Lkotlinx/coroutines/r0;)Landroidx/privacysandbox/ads/adservices/adselection/w;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.privacysandbox.ads.adservices.java.adselection.a$a$b */
        static final class b extends o implements p<r0, d<? super w>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f32621b;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ androidx.privacysandbox.ads.adservices.adselection.a f32623d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(androidx.privacysandbox.ads.adservices.adselection.a aVar, d<? super b> dVar) {
                super(2, dVar);
                this.f32623d = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @l
            public final d<k2> create(@m Object obj, @l d<?> dVar) {
                return C0579a.this.new b(this.f32623d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f32621b;
                if (i4 == 0) {
                    a1.n(obj);
                    v vVar = C0579a.this.mAdSelectionManager;
                    l0.m(vVar);
                    androidx.privacysandbox.ads.adservices.adselection.a aVar2 = this.f32623d;
                    this.f32621b = 1;
                    obj = vVar.c(aVar2, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a1.n(obj);
                }
                return obj;
            }

            @Override // ld.p
            @m
            public final Object invoke(@l r0 r0Var, @m d<? super w> dVar) {
                return ((b) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
            }
        }

        public C0579a(@m v vVar) {
            this.mAdSelectionManager = vVar;
        }

        @Override // androidx.privacysandbox.ads.adservices.java.adselection.a
        @l
        @u
        @b1("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
        public ListenableFuture<k2> b(@l x reportImpressionRequest) {
            z0 b5;
            l0.p(reportImpressionRequest, "reportImpressionRequest");
            b5 = k.b(s0.a(j1.a()), null, null, new C0580a(reportImpressionRequest, null), 3, null);
            return androidx.privacysandbox.ads.adservices.java.internal.b.c(b5, null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.adselection.a
        @l
        @u
        @b1("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
        public ListenableFuture<w> c(@l androidx.privacysandbox.ads.adservices.adselection.a adSelectionConfig) {
            z0 b5;
            l0.p(adSelectionConfig, "adSelectionConfig");
            b5 = k.b(s0.a(j1.a()), null, null, new b(adSelectionConfig, null), 3, null);
            return androidx.privacysandbox.ads.adservices.java.internal.b.c(b5, null, 1, null);
        }
    }

    /* compiled from: AdSelectionManagerFutures.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/privacysandbox/ads/adservices/java/adselection/a$b;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroidx/privacysandbox/ads/adservices/java/adselection/a;", "a", "(Landroid/content/Context;)Landroidx/privacysandbox/ads/adservices/java/adselection/a;", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nAdSelectionManagerFutures.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdSelectionManagerFutures.kt\nandroidx/privacysandbox/ads/adservices/java/adselection/AdSelectionManagerFutures$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,121:1\n1#2:122\n*E\n"})
    /* renamed from: androidx.privacysandbox.ads.adservices.java.adselection.a$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @m
        @n
        public final a a(@l Context context) {
            l0.p(context, "context");
            v a5 = v.INSTANCE.a(context);
            if (a5 != null) {
                return new C0579a(a5);
            }
            return null;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    @m
    @n
    public static final a a(@l Context context) {
        return INSTANCE.a(context);
    }

    @l
    @b1("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    public abstract ListenableFuture<k2> b(@l x reportImpressionRequest);

    @l
    @b1("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    public abstract ListenableFuture<w> c(@l androidx.privacysandbox.ads.adservices.adselection.a adSelectionConfig);
}
