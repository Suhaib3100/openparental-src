package androidx.privacysandbox.ads.adservices.java.customaudience;

import android.content.Context;
import androidx.annotation.b1;
import androidx.annotation.u;
import androidx.privacysandbox.ads.adservices.customaudience.f0;
import androidx.privacysandbox.ads.adservices.customaudience.g0;
import androidx.privacysandbox.ads.adservices.customaudience.h0;
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
import kotlin.jvm.internal.w;
import kotlin.k2;
import kotlinx.coroutines.j1;
import kotlinx.coroutines.k;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.z0;
import ld.p;

/* compiled from: CustomAudienceManagerFutures.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 \r2\u00020\u0001:\u0002\r\bB\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\nH'¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Landroidx/privacysandbox/ads/adservices/java/customaudience/a;", "", "<init>", "()V", "Landroidx/privacysandbox/ads/adservices/customaudience/g0;", "request", "Lcom/google/common/util/concurrent/ListenableFuture;", "Lkotlin/k2;", "b", "(Landroidx/privacysandbox/ads/adservices/customaudience/g0;)Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/privacysandbox/ads/adservices/customaudience/h0;", "c", "(Landroidx/privacysandbox/ads/adservices/customaudience/h0;)Lcom/google/common/util/concurrent/ListenableFuture;", "a", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    public static final Companion INSTANCE = new Companion();

    /* compiled from: CustomAudienceManagerFutures.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\fH\u0017¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/privacysandbox/ads/adservices/java/customaudience/a$a;", "Landroidx/privacysandbox/ads/adservices/java/customaudience/a;", "Landroidx/privacysandbox/ads/adservices/customaudience/f0;", "mCustomAudienceManager", "<init>", "(Landroidx/privacysandbox/ads/adservices/customaudience/f0;)V", "Landroidx/privacysandbox/ads/adservices/customaudience/g0;", "request", "Lcom/google/common/util/concurrent/ListenableFuture;", "Lkotlin/k2;", "b", "(Landroidx/privacysandbox/ads/adservices/customaudience/g0;)Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/privacysandbox/ads/adservices/customaudience/h0;", "c", "(Landroidx/privacysandbox/ads/adservices/customaudience/h0;)Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/privacysandbox/ads/adservices/customaudience/f0;", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.privacysandbox.ads.adservices.java.customaudience.a$a, reason: collision with other inner class name */
    private static final class C0583a extends a {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @m
        private final f0 mCustomAudienceManager;

        /* compiled from: CustomAudienceManagerFutures.kt */
        @f(c = "androidx.privacysandbox.ads.adservices.java.customaudience.CustomAudienceManagerFutures$Api33Ext4JavaImpl$joinCustomAudienceAsync$1", f = "CustomAudienceManagerFutures.kt", i = {}, l = {113}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.privacysandbox.ads.adservices.java.customaudience.a$a$a, reason: collision with other inner class name */
        static final class C0584a extends o implements p<r0, d<? super k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f32630b;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ g0 f32632d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0584a(g0 g0Var, d<? super C0584a> dVar) {
                super(2, dVar);
                this.f32632d = g0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @l
            public final d<k2> create(@m Object obj, @l d<?> dVar) {
                return C0583a.this.new C0584a(this.f32632d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f32630b;
                if (i4 == 0) {
                    a1.n(obj);
                    f0 f0Var = C0583a.this.mCustomAudienceManager;
                    l0.m(f0Var);
                    g0 g0Var = this.f32632d;
                    this.f32630b = 1;
                    if (f0Var.a(g0Var, this) == aVar) {
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
                return ((C0584a) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
            }
        }

        /* compiled from: CustomAudienceManagerFutures.kt */
        @f(c = "androidx.privacysandbox.ads.adservices.java.customaudience.CustomAudienceManagerFutures$Api33Ext4JavaImpl$leaveCustomAudienceAsync$1", f = "CustomAudienceManagerFutures.kt", i = {}, l = {123}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.privacysandbox.ads.adservices.java.customaudience.a$a$b */
        static final class b extends o implements p<r0, d<? super k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f32633b;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ h0 f32635d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(h0 h0Var, d<? super b> dVar) {
                super(2, dVar);
                this.f32635d = h0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @l
            public final d<k2> create(@m Object obj, @l d<?> dVar) {
                return C0583a.this.new b(this.f32635d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f32633b;
                if (i4 == 0) {
                    a1.n(obj);
                    f0 f0Var = C0583a.this.mCustomAudienceManager;
                    l0.m(f0Var);
                    h0 h0Var = this.f32635d;
                    this.f32633b = 1;
                    if (f0Var.b(h0Var, this) == aVar) {
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
                return ((b) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
            }
        }

        public C0583a(@m f0 f0Var) {
            this.mCustomAudienceManager = f0Var;
        }

        @Override // androidx.privacysandbox.ads.adservices.java.customaudience.a
        @l
        @u
        @b1("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
        public ListenableFuture<k2> b(@l g0 request) {
            z0 b5;
            l0.p(request, "request");
            b5 = k.b(s0.a(j1.a()), null, null, new C0584a(request, null), 3, null);
            return androidx.privacysandbox.ads.adservices.java.internal.b.c(b5, null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.customaudience.a
        @l
        @u
        @b1("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
        public ListenableFuture<k2> c(@l h0 request) {
            z0 b5;
            l0.p(request, "request");
            b5 = k.b(s0.a(j1.a()), null, null, new b(request, null), 3, null);
            return androidx.privacysandbox.ads.adservices.java.internal.b.c(b5, null, 1, null);
        }
    }

    /* compiled from: CustomAudienceManagerFutures.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/privacysandbox/ads/adservices/java/customaudience/a$b;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroidx/privacysandbox/ads/adservices/java/customaudience/a;", "a", "(Landroid/content/Context;)Landroidx/privacysandbox/ads/adservices/java/customaudience/a;", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nCustomAudienceManagerFutures.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomAudienceManagerFutures.kt\nandroidx/privacysandbox/ads/adservices/java/customaudience/CustomAudienceManagerFutures$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,140:1\n1#2:141\n*E\n"})
    /* renamed from: androidx.privacysandbox.ads.adservices.java.customaudience.a$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @m
        @n
        public final a a(@l Context context) {
            l0.p(context, "context");
            f0 a5 = f0.INSTANCE.a(context);
            if (a5 != null) {
                return new C0583a(a5);
            }
            return null;
        }

        public Companion(w wVar) {
        }
    }

    @m
    @n
    public static final a a(@l Context context) {
        return INSTANCE.a(context);
    }

    @l
    @b1("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    public abstract ListenableFuture<k2> b(@l g0 request);

    @l
    @b1("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    public abstract ListenableFuture<k2> c(@l h0 request);
}
