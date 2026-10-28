package androidx.privacysandbox.ads.adservices.topics;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.b1;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;

/* compiled from: TopicsManager.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H§@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Landroidx/privacysandbox/ads/adservices/topics/d;", "", "<init>", "()V", "Landroidx/privacysandbox/ads/adservices/topics/a;", "request", "Landroidx/privacysandbox/ads/adservices/topics/b;", "a", "(Landroidx/privacysandbox/ads/adservices/topics/a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* compiled from: TopicsManager.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/privacysandbox/ads/adservices/topics/d$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroidx/privacysandbox/ads/adservices/topics/d;", "a", "(Landroid/content/Context;)Landroidx/privacysandbox/ads/adservices/topics/d;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.privacysandbox.ads.adservices.topics.d$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.m
        @kd.n
        @SuppressLint({"NewApi", "ClassVerificationFailure"})
        public final d a(@fg.l Context context) {
            l0.p(context, "context");
            androidx.privacysandbox.ads.adservices.internal.a aVar = androidx.privacysandbox.ads.adservices.internal.a.f32610a;
            if (aVar.a() >= 5) {
                return new l(context);
            }
            if (aVar.a() == 4) {
                return new g(context);
            }
            return null;
        }

        public Companion(w wVar) {
        }
    }

    @fg.m
    @kd.n
    @SuppressLint({"NewApi", "ClassVerificationFailure"})
    public static final d b(@fg.l Context context) {
        return INSTANCE.a(context);
    }

    @fg.m
    @b1("android.permission.ACCESS_ADSERVICES_TOPICS")
    public abstract Object a(@fg.l a aVar, @fg.l kotlin.coroutines.d<? super b> dVar);
}
