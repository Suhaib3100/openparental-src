package androidx.privacysandbox.ads.adservices.java.topics;

import android.content.Context;
import androidx.annotation.b1;
import androidx.annotation.u;
import androidx.privacysandbox.ads.adservices.topics.b;
import androidx.privacysandbox.ads.adservices.topics.d;
import com.google.common.util.concurrent.ListenableFuture;
import fg.l;
import fg.m;
import kd.n;
import kotlin.Metadata;
import kotlin.a1;
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

/* compiled from: TopicsManagerFutures.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 \n2\u00020\u0001:\u0002\n\bB\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Landroidx/privacysandbox/ads/adservices/java/topics/a;", "", "<init>", "()V", "Landroidx/privacysandbox/ads/adservices/topics/a;", "request", "Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/privacysandbox/ads/adservices/topics/b;", "b", "(Landroidx/privacysandbox/ads/adservices/topics/a;)Lcom/google/common/util/concurrent/ListenableFuture;", "a", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    public static final Companion INSTANCE = new Companion();

    /* compiled from: TopicsManagerFutures.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\r"}, d2 = {"Landroidx/privacysandbox/ads/adservices/java/topics/a$a;", "Landroidx/privacysandbox/ads/adservices/java/topics/a;", "Landroidx/privacysandbox/ads/adservices/topics/d;", "mTopicsManager", "<init>", "(Landroidx/privacysandbox/ads/adservices/topics/d;)V", "Landroidx/privacysandbox/ads/adservices/topics/a;", "request", "Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/privacysandbox/ads/adservices/topics/b;", "b", "(Landroidx/privacysandbox/ads/adservices/topics/a;)Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/privacysandbox/ads/adservices/topics/d;", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.privacysandbox.ads.adservices.java.topics.a$a, reason: collision with other inner class name */
    private static final class C0587a extends a {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @l
        private final d mTopicsManager;

        /* compiled from: TopicsManagerFutures.kt */
        @f(c = "androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures$Api33Ext4JavaImpl$getTopicsAsync$1", f = "TopicsManagerFutures.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Landroidx/privacysandbox/ads/adservices/topics/b;", "<anonymous>", "(Lkotlinx/coroutines/r0;)Landroidx/privacysandbox/ads/adservices/topics/b;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.privacysandbox.ads.adservices.java.topics.a$a$a, reason: collision with other inner class name */
        static final class C0588a extends o implements p<r0, kotlin.coroutines.d<? super b>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f32662b;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ androidx.privacysandbox.ads.adservices.topics.a f32664d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0588a(androidx.privacysandbox.ads.adservices.topics.a aVar, kotlin.coroutines.d<? super C0588a> dVar) {
                super(2, dVar);
                this.f32664d = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d<k2> create(@m Object obj, @l kotlin.coroutines.d<?> dVar) {
                return C0587a.this.new C0588a(this.f32664d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f32662b;
                if (i4 == 0) {
                    a1.n(obj);
                    d dVar = C0587a.this.mTopicsManager;
                    androidx.privacysandbox.ads.adservices.topics.a aVar2 = this.f32664d;
                    this.f32662b = 1;
                    obj = dVar.a(aVar2, this);
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
            public final Object invoke(@l r0 r0Var, @m kotlin.coroutines.d<? super b> dVar) {
                return ((C0588a) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
            }
        }

        public C0587a(@l d mTopicsManager) {
            l0.p(mTopicsManager, "mTopicsManager");
            this.mTopicsManager = mTopicsManager;
        }

        @Override // androidx.privacysandbox.ads.adservices.java.topics.a
        @l
        @u
        @b1("android.permission.ACCESS_ADSERVICES_TOPICS")
        public ListenableFuture<b> b(@l androidx.privacysandbox.ads.adservices.topics.a request) {
            z0 b5;
            l0.p(request, "request");
            b5 = k.b(s0.a(j1.e()), null, null, new C0588a(request, null), 3, null);
            return androidx.privacysandbox.ads.adservices.java.internal.b.c(b5, null, 1, null);
        }
    }

    /* compiled from: TopicsManagerFutures.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/privacysandbox/ads/adservices/java/topics/a$b;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroidx/privacysandbox/ads/adservices/java/topics/a;", "a", "(Landroid/content/Context;)Landroidx/privacysandbox/ads/adservices/java/topics/a;", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nTopicsManagerFutures.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopicsManagerFutures.kt\nandroidx/privacysandbox/ads/adservices/java/topics/TopicsManagerFutures$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,73:1\n1#2:74\n*E\n"})
    /* renamed from: androidx.privacysandbox.ads.adservices.java.topics.a$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @m
        @n
        public final a a(@l Context context) {
            l0.p(context, "context");
            d a5 = d.INSTANCE.a(context);
            if (a5 != null) {
                return new C0587a(a5);
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
    @b1("android.permission.ACCESS_ADSERVICES_TOPICS")
    public abstract ListenableFuture<b> b(@l androidx.privacysandbox.ads.adservices.topics.a request);
}
