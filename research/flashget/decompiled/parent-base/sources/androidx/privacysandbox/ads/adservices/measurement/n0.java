package androidx.privacysandbox.ads.adservices.measurement;

import android.adservices.measurement.DeletionRequest;
import android.adservices.measurement.MeasurementManager;
import android.adservices.measurement.WebSourceParams;
import android.adservices.measurement.WebSourceRegistrationRequest;
import android.adservices.measurement.WebTriggerParams;
import android.adservices.measurement.WebTriggerRegistrationRequest;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import androidx.annotation.b1;
import androidx.annotation.y0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: MeasurementManager.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b&\u0018\u0000 \u00072\u00020\u0001:\u0002\u0007\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH§@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\tH§@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H§@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0016H§@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u001a\u001a\u00020\u0019H§@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Landroidx/privacysandbox/ads/adservices/measurement/n0;", "", "<init>", "()V", "Landroidx/privacysandbox/ads/adservices/measurement/e;", "deletionRequest", "Lkotlin/k2;", "a", "(Landroidx/privacysandbox/ads/adservices/measurement/e;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroid/net/Uri;", "attributionSource", "Landroid/view/InputEvent;", "inputEvent", "d", "(Landroid/net/Uri;Landroid/view/InputEvent;Lkotlin/coroutines/d;)Ljava/lang/Object;", "trigger", "e", "(Landroid/net/Uri;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/privacysandbox/ads/adservices/measurement/p0;", "request", "f", "(Landroidx/privacysandbox/ads/adservices/measurement/p0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/privacysandbox/ads/adservices/measurement/r0;", "g", "(Landroidx/privacysandbox/ads/adservices/measurement/r0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "b", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class n0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: b, reason: collision with root package name */
    public static final int f32683b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final int f32684c = 1;

    /* compiled from: MeasurementManager.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Landroidx/privacysandbox/ads/adservices/measurement/n0$b;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroidx/privacysandbox/ads/adservices/measurement/n0;", "a", "(Landroid/content/Context;)Landroidx/privacysandbox/ads/adservices/measurement/n0;", "", "MEASUREMENT_API_STATE_DISABLED", "I", "MEASUREMENT_API_STATE_ENABLED", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.privacysandbox.ads.adservices.measurement.n0$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.m
        @kd.n
        @SuppressLint({"NewApi", "ClassVerificationFailure"})
        public final n0 a(@fg.l Context context) {
            kotlin.jvm.internal.l0.p(context, "context");
            androidx.privacysandbox.ads.adservices.internal.a aVar = androidx.privacysandbox.ads.adservices.internal.a.f32610a;
            aVar.a();
            if (aVar.a() >= 5) {
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
    public static final n0 c(@fg.l Context context) {
        return INSTANCE.a(context);
    }

    @fg.m
    public abstract Object a(@fg.l e eVar, @fg.l kotlin.coroutines.d<? super k2> dVar);

    @fg.m
    @b1("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    public abstract Object b(@fg.l kotlin.coroutines.d<? super Integer> dVar);

    @fg.m
    @b1("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    public abstract Object d(@fg.l Uri uri, @fg.m InputEvent inputEvent, @fg.l kotlin.coroutines.d<? super k2> dVar);

    @fg.m
    @b1("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    public abstract Object e(@fg.l Uri uri, @fg.l kotlin.coroutines.d<? super k2> dVar);

    @fg.m
    @b1("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    public abstract Object f(@fg.l p0 p0Var, @fg.l kotlin.coroutines.d<? super k2> dVar);

    @fg.m
    @b1("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    public abstract Object g(@fg.l r0 r0Var, @fg.l kotlin.coroutines.d<? super k2> dVar);

    /* compiled from: MeasurementManager.kt */
    @Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00122\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00122\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0012H\u0002¢\u0006\u0004\b\u001d\u0010\u0016J\u001b\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\tH\u0097@ø\u0001\u0000¢\u0006\u0004\b \u0010!J%\u0010&\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\"2\b\u0010%\u001a\u0004\u0018\u00010$H\u0097@ø\u0001\u0000¢\u0006\u0004\b&\u0010'J\u001b\u0010)\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020\"H\u0097@ø\u0001\u0000¢\u0006\u0004\b)\u0010*J\u001b\u0010+\u001a\u00020\u001f2\u0006\u0010\n\u001a\u00020\u000eH\u0097@ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u001b\u0010-\u001a\u00020\u001f2\u0006\u0010\n\u001a\u00020\u0017H\u0097@ø\u0001\u0000¢\u0006\u0004\b-\u0010.J\u0013\u00100\u001a\u00020/H\u0097@ø\u0001\u0000¢\u0006\u0004\b0\u00101R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u00102\u0082\u0002\u0004\n\u0002\b\u0019¨\u00063"}, d2 = {"Landroidx/privacysandbox/ads/adservices/measurement/n0$a;", "Landroidx/privacysandbox/ads/adservices/measurement/n0;", "Landroid/adservices/measurement/MeasurementManager;", "mMeasurementManager", "<init>", "(Landroid/adservices/measurement/MeasurementManager;)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;)V", "Landroidx/privacysandbox/ads/adservices/measurement/e;", "request", "Landroid/adservices/measurement/DeletionRequest;", "l", "(Landroidx/privacysandbox/ads/adservices/measurement/e;)Landroid/adservices/measurement/DeletionRequest;", "Landroidx/privacysandbox/ads/adservices/measurement/p0;", "Landroid/adservices/measurement/WebSourceRegistrationRequest;", "n", "(Landroidx/privacysandbox/ads/adservices/measurement/p0;)Landroid/adservices/measurement/WebSourceRegistrationRequest;", "", "Landroidx/privacysandbox/ads/adservices/measurement/o0;", "Landroid/adservices/measurement/WebSourceParams;", "m", "(Ljava/util/List;)Ljava/util/List;", "Landroidx/privacysandbox/ads/adservices/measurement/r0;", "Landroid/adservices/measurement/WebTriggerRegistrationRequest;", "p", "(Landroidx/privacysandbox/ads/adservices/measurement/r0;)Landroid/adservices/measurement/WebTriggerRegistrationRequest;", "Landroidx/privacysandbox/ads/adservices/measurement/q0;", "Landroid/adservices/measurement/WebTriggerParams;", "o", "deletionRequest", "Lkotlin/k2;", "a", "(Landroidx/privacysandbox/ads/adservices/measurement/e;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroid/net/Uri;", "attributionSource", "Landroid/view/InputEvent;", "inputEvent", "d", "(Landroid/net/Uri;Landroid/view/InputEvent;Lkotlin/coroutines/d;)Ljava/lang/Object;", "trigger", "e", "(Landroid/net/Uri;Lkotlin/coroutines/d;)Ljava/lang/Object;", "f", "(Landroidx/privacysandbox/ads/adservices/measurement/p0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "g", "(Landroidx/privacysandbox/ads/adservices/measurement/r0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "b", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroid/adservices/measurement/MeasurementManager;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SuppressLint({"NewApi", "ClassVerificationFailure"})
    @y0(extension = 1000000, version = 5)
    @r1({"SMAP\nMeasurementManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeasurementManager.kt\nandroidx/privacysandbox/ads/adservices/measurement/MeasurementManager$Api33Ext5Impl\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,263:1\n314#2,11:264\n314#2,11:275\n314#2,11:286\n314#2,11:297\n314#2,11:308\n314#2,11:319\n*S KotlinDebug\n*F\n+ 1 MeasurementManager.kt\nandroidx/privacysandbox/ads/adservices/measurement/MeasurementManager$Api33Ext5Impl\n*L\n106#1:264,11\n131#1:275,11\n144#1:286,11\n155#1:297,11\n193#1:308,11\n226#1:319,11\n*E\n"})
    private static final class a extends n0 {

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final MeasurementManager mMeasurementManager;

        public a(@fg.l MeasurementManager mMeasurementManager) {
            kotlin.jvm.internal.l0.p(mMeasurementManager, "mMeasurementManager");
            this.mMeasurementManager = mMeasurementManager;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final DeletionRequest l(e request) {
            DeletionRequest.Builder deletionMode;
            DeletionRequest.Builder matchBehavior;
            DeletionRequest.Builder start;
            DeletionRequest.Builder end;
            DeletionRequest.Builder domainUris;
            DeletionRequest.Builder originUris;
            DeletionRequest build;
            deletionMode = a0.a().setDeletionMode(request.getDeletionMode());
            matchBehavior = deletionMode.setMatchBehavior(request.getMatchBehavior());
            start = matchBehavior.setStart(request.getStart());
            end = start.setEnd(request.getEnd());
            domainUris = end.setDomainUris(request.b());
            originUris = domainUris.setOriginUris(request.e());
            build = originUris.build();
            kotlin.jvm.internal.l0.o(build, "Builder()\n              …\n                .build()");
            return build;
        }

        private final List<WebSourceParams> m(List<o0> request) {
            WebSourceParams.Builder debugKeyAllowed;
            WebSourceParams build;
            ArrayList arrayList = new ArrayList();
            for (o0 o0Var : request) {
                z.a();
                debugKeyAllowed = y.a(o0Var.getRegistrationUri()).setDebugKeyAllowed(o0Var.getDebugKeyAllowed());
                build = debugKeyAllowed.build();
                kotlin.jvm.internal.l0.o(build, "Builder(param.registrati…                 .build()");
                arrayList.add(build);
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final WebSourceRegistrationRequest n(p0 request) {
            WebSourceRegistrationRequest.Builder webDestination;
            WebSourceRegistrationRequest.Builder appDestination;
            WebSourceRegistrationRequest.Builder inputEvent;
            WebSourceRegistrationRequest.Builder verifiedDestination;
            WebSourceRegistrationRequest build;
            d0.a();
            webDestination = c0.a(m(request.f()), request.getTopOriginUri()).setWebDestination(request.getWebDestination());
            appDestination = webDestination.setAppDestination(request.getAppDestination());
            inputEvent = appDestination.setInputEvent(request.getInputEvent());
            verifiedDestination = inputEvent.setVerifiedDestination(request.getVerifiedDestination());
            build = verifiedDestination.build();
            kotlin.jvm.internal.l0.o(build, "Builder(\n               …\n                .build()");
            return build;
        }

        private final List<WebTriggerParams> o(List<q0> request) {
            WebTriggerParams.Builder debugKeyAllowed;
            WebTriggerParams build;
            ArrayList arrayList = new ArrayList();
            for (q0 q0Var : request) {
                x.a();
                debugKeyAllowed = w.a(q0Var.getRegistrationUri()).setDebugKeyAllowed(q0Var.getDebugKeyAllowed());
                build = debugKeyAllowed.build();
                kotlin.jvm.internal.l0.o(build, "Builder(param.registrati…                 .build()");
                arrayList.add(build);
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final WebTriggerRegistrationRequest p(r0 request) {
            WebTriggerRegistrationRequest build;
            f0.a();
            build = e0.a(o(request.b()), request.getDestination()).build();
            kotlin.jvm.internal.l0.o(build, "Builder(\n               …\n                .build()");
            return build;
        }

        @Override // androidx.privacysandbox.ads.adservices.measurement.n0
        @androidx.annotation.u
        @fg.m
        public Object a(@fg.l e eVar, @fg.l kotlin.coroutines.d<? super k2> dVar) {
            kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(kotlin.coroutines.intrinsics.b.e(dVar), 1);
            qVar.e0();
            this.mMeasurementManager.deleteRegistrations(l(eVar), new androidx.credentials.k(), androidx.core.os.v.a(qVar));
            Object y4 = qVar.y();
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            if (y4 == aVar) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return y4 == aVar ? y4 : k2.f75408a;
        }

        @Override // androidx.privacysandbox.ads.adservices.measurement.n0
        @androidx.annotation.u
        @fg.m
        @b1("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        public Object b(@fg.l kotlin.coroutines.d<? super Integer> dVar) {
            kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(kotlin.coroutines.intrinsics.b.e(dVar), 1);
            qVar.e0();
            this.mMeasurementManager.getMeasurementApiStatus(new androidx.credentials.k(), androidx.core.os.v.a(qVar));
            Object y4 = qVar.y();
            if (y4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return y4;
        }

        @Override // androidx.privacysandbox.ads.adservices.measurement.n0
        @androidx.annotation.u
        @fg.m
        @b1("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        public Object d(@fg.l Uri uri, @fg.m InputEvent inputEvent, @fg.l kotlin.coroutines.d<? super k2> dVar) {
            kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(kotlin.coroutines.intrinsics.b.e(dVar), 1);
            qVar.e0();
            this.mMeasurementManager.registerSource(uri, inputEvent, new androidx.credentials.k(), androidx.core.os.v.a(qVar));
            Object y4 = qVar.y();
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            if (y4 == aVar) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return y4 == aVar ? y4 : k2.f75408a;
        }

        @Override // androidx.privacysandbox.ads.adservices.measurement.n0
        @androidx.annotation.u
        @fg.m
        @b1("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        public Object e(@fg.l Uri uri, @fg.l kotlin.coroutines.d<? super k2> dVar) {
            kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(kotlin.coroutines.intrinsics.b.e(dVar), 1);
            qVar.e0();
            this.mMeasurementManager.registerTrigger(uri, new androidx.credentials.k(), androidx.core.os.v.a(qVar));
            Object y4 = qVar.y();
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            if (y4 == aVar) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return y4 == aVar ? y4 : k2.f75408a;
        }

        @Override // androidx.privacysandbox.ads.adservices.measurement.n0
        @androidx.annotation.u
        @fg.m
        @b1("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        public Object f(@fg.l p0 p0Var, @fg.l kotlin.coroutines.d<? super k2> dVar) {
            kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(kotlin.coroutines.intrinsics.b.e(dVar), 1);
            qVar.e0();
            this.mMeasurementManager.registerWebSource(n(p0Var), new androidx.credentials.k(), androidx.core.os.v.a(qVar));
            Object y4 = qVar.y();
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            if (y4 == aVar) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return y4 == aVar ? y4 : k2.f75408a;
        }

        @Override // androidx.privacysandbox.ads.adservices.measurement.n0
        @androidx.annotation.u
        @fg.m
        @b1("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        public Object g(@fg.l r0 r0Var, @fg.l kotlin.coroutines.d<? super k2> dVar) {
            kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(kotlin.coroutines.intrinsics.b.e(dVar), 1);
            qVar.e0();
            this.mMeasurementManager.registerWebTrigger(p(r0Var), new androidx.credentials.k(), androidx.core.os.v.a(qVar));
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
                java.lang.Class r0 = androidx.privacysandbox.ads.adservices.measurement.k.a()
                java.lang.Object r2 = r2.getSystemService(r0)
                java.lang.String r0 = "context.getSystemService…:class.java\n            )"
                kotlin.jvm.internal.l0.o(r2, r0)
                android.adservices.measurement.MeasurementManager r2 = androidx.privacysandbox.ads.adservices.measurement.l.a(r2)
                r1.<init>(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.privacysandbox.ads.adservices.measurement.n0.a.<init>(android.content.Context):void");
        }
    }
}
