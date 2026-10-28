package androidx.privacysandbox.ads.adservices.java.adid;

import android.content.Context;
import androidx.annotation.b1;
import androidx.annotation.u;
import androidx.privacysandbox.ads.adservices.adid.h;
import androidx.privacysandbox.ads.adservices.java.internal.b;
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

/* compiled from: AdIdManagerFutures.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 \b2\u00020\u0001:\u0002\b\u0006B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H'¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/privacysandbox/ads/adservices/java/adid/a;", "", "<init>", "()V", "Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/privacysandbox/ads/adservices/adid/a;", "b", "()Lcom/google/common/util/concurrent/ListenableFuture;", "a", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    public static final Companion INSTANCE = new Companion();

    /* compiled from: AdIdManagerFutures.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0017¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/privacysandbox/ads/adservices/java/adid/a$a;", "Landroidx/privacysandbox/ads/adservices/java/adid/a;", "Landroidx/privacysandbox/ads/adservices/adid/h;", "mAdIdManager", "<init>", "(Landroidx/privacysandbox/ads/adservices/adid/h;)V", "Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/privacysandbox/ads/adservices/adid/a;", "b", "()Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/privacysandbox/ads/adservices/adid/h;", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.privacysandbox.ads.adservices.java.adid.a$a, reason: collision with other inner class name */
    private static final class C0577a extends a {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @l
        private final h mAdIdManager;

        /* compiled from: AdIdManagerFutures.kt */
        @f(c = "androidx.privacysandbox.ads.adservices.java.adid.AdIdManagerFutures$Api33Ext4JavaImpl$getAdIdAsync$1", f = "AdIdManagerFutures.kt", i = {}, l = {54}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Landroidx/privacysandbox/ads/adservices/adid/a;", "<anonymous>", "(Lkotlinx/coroutines/r0;)Landroidx/privacysandbox/ads/adservices/adid/a;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.privacysandbox.ads.adservices.java.adid.a$a$a, reason: collision with other inner class name */
        static final class C0578a extends o implements p<r0, d<? super androidx.privacysandbox.ads.adservices.adid.a>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f32614b;

            C0578a(d<? super C0578a> dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @l
            public final d<k2> create(@m Object obj, @l d<?> dVar) {
                return C0577a.this.new C0578a(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f32614b;
                if (i4 == 0) {
                    a1.n(obj);
                    h hVar = C0577a.this.mAdIdManager;
                    this.f32614b = 1;
                    obj = hVar.a(this);
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
            public final Object invoke(@l r0 r0Var, @m d<? super androidx.privacysandbox.ads.adservices.adid.a> dVar) {
                return ((C0578a) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
            }
        }

        public C0577a(@l h mAdIdManager) {
            l0.p(mAdIdManager, "mAdIdManager");
            this.mAdIdManager = mAdIdManager;
        }

        @Override // androidx.privacysandbox.ads.adservices.java.adid.a
        @l
        @u
        @b1("android.permission.ACCESS_ADSERVICES_AD_ID")
        public ListenableFuture<androidx.privacysandbox.ads.adservices.adid.a> b() {
            z0 b5;
            b5 = k.b(s0.a(j1.a()), null, null, new C0578a(null), 3, null);
            return b.c(b5, null, 1, null);
        }
    }

    /* compiled from: AdIdManagerFutures.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/privacysandbox/ads/adservices/java/adid/a$b;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroidx/privacysandbox/ads/adservices/java/adid/a;", "a", "(Landroid/content/Context;)Landroidx/privacysandbox/ads/adservices/java/adid/a;", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nAdIdManagerFutures.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdIdManagerFutures.kt\nandroidx/privacysandbox/ads/adservices/java/adid/AdIdManagerFutures$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,71:1\n1#2:72\n*E\n"})
    /* renamed from: androidx.privacysandbox.ads.adservices.java.adid.a$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @m
        @n
        public final a a(@l Context context) {
            l0.p(context, "context");
            h a5 = h.INSTANCE.a(context);
            if (a5 != null) {
                return new C0577a(a5);
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
    @b1("android.permission.ACCESS_ADSERVICES_AD_ID")
    public abstract ListenableFuture<androidx.privacysandbox.ads.adservices.adid.a> b();
}
