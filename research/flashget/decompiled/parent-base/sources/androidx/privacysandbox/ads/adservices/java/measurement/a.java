package androidx.privacysandbox.ads.adservices.java.measurement;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import androidx.annotation.b1;
import androidx.annotation.u;
import androidx.privacysandbox.ads.adservices.measurement.e;
import androidx.privacysandbox.ads.adservices.measurement.n0;
import androidx.privacysandbox.ads.adservices.measurement.p0;
import com.android.internal.telephony.cdma.UserData;
import com.google.common.util.concurrent.ListenableFuture;
import fg.l;
import fg.m;
import kd.n;
import kotlin.Metadata;
import kotlin.a1;
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

/* compiled from: MeasurementManagerFutures.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b&\u0018\u0000 \b2\u00020\u0001:\u0002\b\u001dB\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH'¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0010\u001a\u00020\nH'¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0014\u001a\u00020\u0013H'¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0014\u001a\u00020\u0017H'¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0006H'¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Landroidx/privacysandbox/ads/adservices/java/measurement/a;", "", "<init>", "()V", "Landroidx/privacysandbox/ads/adservices/measurement/e;", "deletionRequest", "Lcom/google/common/util/concurrent/ListenableFuture;", "Lkotlin/k2;", "a", "(Landroidx/privacysandbox/ads/adservices/measurement/e;)Lcom/google/common/util/concurrent/ListenableFuture;", "Landroid/net/Uri;", "attributionSource", "Landroid/view/InputEvent;", "inputEvent", "d", "(Landroid/net/Uri;Landroid/view/InputEvent;)Lcom/google/common/util/concurrent/ListenableFuture;", "trigger", "e", "(Landroid/net/Uri;)Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/privacysandbox/ads/adservices/measurement/p0;", "request", "f", "(Landroidx/privacysandbox/ads/adservices/measurement/p0;)Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/privacysandbox/ads/adservices/measurement/r0;", "g", "(Landroidx/privacysandbox/ads/adservices/measurement/r0;)Lcom/google/common/util/concurrent/ListenableFuture;", "", "c", "()Lcom/google/common/util/concurrent/ListenableFuture;", "b", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    public static final Companion INSTANCE = new Companion();

    /* compiled from: MeasurementManagerFutures.kt */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0012\u001a\u00020\fH\u0017¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0016\u001a\u00020\u0019H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\bH\u0017¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Landroidx/privacysandbox/ads/adservices/java/measurement/a$a;", "Landroidx/privacysandbox/ads/adservices/java/measurement/a;", "Landroidx/privacysandbox/ads/adservices/measurement/n0;", "mMeasurementManager", "<init>", "(Landroidx/privacysandbox/ads/adservices/measurement/n0;)V", "Landroidx/privacysandbox/ads/adservices/measurement/e;", "deletionRequest", "Lcom/google/common/util/concurrent/ListenableFuture;", "Lkotlin/k2;", "a", "(Landroidx/privacysandbox/ads/adservices/measurement/e;)Lcom/google/common/util/concurrent/ListenableFuture;", "Landroid/net/Uri;", "attributionSource", "Landroid/view/InputEvent;", "inputEvent", "d", "(Landroid/net/Uri;Landroid/view/InputEvent;)Lcom/google/common/util/concurrent/ListenableFuture;", "trigger", "e", "(Landroid/net/Uri;)Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/privacysandbox/ads/adservices/measurement/p0;", "request", "f", "(Landroidx/privacysandbox/ads/adservices/measurement/p0;)Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/privacysandbox/ads/adservices/measurement/r0;", "g", "(Landroidx/privacysandbox/ads/adservices/measurement/r0;)Lcom/google/common/util/concurrent/ListenableFuture;", "", "c", "()Lcom/google/common/util/concurrent/ListenableFuture;", "b", "Landroidx/privacysandbox/ads/adservices/measurement/n0;", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.privacysandbox.ads.adservices.java.measurement.a$a, reason: collision with other inner class name */
    private static final class C0585a extends a {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @l
        private final n0 mMeasurementManager;

        /* compiled from: MeasurementManagerFutures.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$deleteRegistrationsAsync$1", f = "MeasurementManagerFutures.kt", i = {}, l = {122}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.privacysandbox.ads.adservices.java.measurement.a$a$a, reason: collision with other inner class name */
        static final class C0586a extends o implements p<r0, kotlin.coroutines.d<? super k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f32642b;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ androidx.privacysandbox.ads.adservices.measurement.e f32644d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0586a(androidx.privacysandbox.ads.adservices.measurement.e eVar, kotlin.coroutines.d<? super C0586a> dVar) {
                super(2, dVar);
                this.f32644d = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d<k2> create(@m Object obj, @l kotlin.coroutines.d<?> dVar) {
                return C0585a.this.new C0586a(this.f32644d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f32642b;
                if (i4 == 0) {
                    a1.n(obj);
                    n0 n0Var = C0585a.this.mMeasurementManager;
                    androidx.privacysandbox.ads.adservices.measurement.e eVar = this.f32644d;
                    this.f32642b = 1;
                    if (n0Var.a(eVar, this) == aVar) {
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
            public final Object invoke(@l r0 r0Var, @m kotlin.coroutines.d<? super k2> dVar) {
                return ((C0586a) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
            }
        }

        /* compiled from: MeasurementManagerFutures.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$getMeasurementApiStatusAsync$1", f = "MeasurementManagerFutures.kt", i = {}, l = {169}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "", "<anonymous>", "(Lkotlinx/coroutines/r0;)I"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.privacysandbox.ads.adservices.java.measurement.a$a$b */
        static final class b extends o implements p<r0, kotlin.coroutines.d<? super Integer>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f32645b;

            b(kotlin.coroutines.d<? super b> dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d<k2> create(@m Object obj, @l kotlin.coroutines.d<?> dVar) {
                return C0585a.this.new b(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f32645b;
                if (i4 == 0) {
                    a1.n(obj);
                    n0 n0Var = C0585a.this.mMeasurementManager;
                    this.f32645b = 1;
                    obj = n0Var.b(this);
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
            public final Object invoke(@l r0 r0Var, @m kotlin.coroutines.d<? super Integer> dVar) {
                return ((b) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
            }
        }

        /* compiled from: MeasurementManagerFutures.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerSourceAsync$1", f = "MeasurementManagerFutures.kt", i = {}, l = {UserData.IS91_MSG_TYPE_SHORT_MESSAGE}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.privacysandbox.ads.adservices.java.measurement.a$a$c */
        static final class c extends o implements p<r0, kotlin.coroutines.d<? super k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f32647b;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Uri f32649d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InputEvent f32650e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(Uri uri, InputEvent inputEvent, kotlin.coroutines.d<? super c> dVar) {
                super(2, dVar);
                this.f32649d = uri;
                this.f32650e = inputEvent;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d<k2> create(@m Object obj, @l kotlin.coroutines.d<?> dVar) {
                return C0585a.this.new c(this.f32649d, this.f32650e, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f32647b;
                if (i4 == 0) {
                    a1.n(obj);
                    n0 n0Var = C0585a.this.mMeasurementManager;
                    Uri uri = this.f32649d;
                    InputEvent inputEvent = this.f32650e;
                    this.f32647b = 1;
                    if (n0Var.d(uri, inputEvent, this) == aVar) {
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
            public final Object invoke(@l r0 r0Var, @m kotlin.coroutines.d<? super k2> dVar) {
                return ((c) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
            }
        }

        /* compiled from: MeasurementManagerFutures.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerTriggerAsync$1", f = "MeasurementManagerFutures.kt", i = {}, l = {141}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.privacysandbox.ads.adservices.java.measurement.a$a$d */
        static final class d extends o implements p<r0, kotlin.coroutines.d<? super k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f32651b;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Uri f32653d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(Uri uri, kotlin.coroutines.d<? super d> dVar) {
                super(2, dVar);
                this.f32653d = uri;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d<k2> create(@m Object obj, @l kotlin.coroutines.d<?> dVar) {
                return C0585a.this.new d(this.f32653d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f32651b;
                if (i4 == 0) {
                    a1.n(obj);
                    n0 n0Var = C0585a.this.mMeasurementManager;
                    Uri uri = this.f32653d;
                    this.f32651b = 1;
                    if (n0Var.e(uri, this) == aVar) {
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
            public final Object invoke(@l r0 r0Var, @m kotlin.coroutines.d<? super k2> dVar) {
                return ((d) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
            }
        }

        /* compiled from: MeasurementManagerFutures.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerWebSourceAsync$1", f = "MeasurementManagerFutures.kt", i = {}, l = {151}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.privacysandbox.ads.adservices.java.measurement.a$a$e */
        static final class e extends o implements p<r0, kotlin.coroutines.d<? super k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f32654b;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ p0 f32656d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(p0 p0Var, kotlin.coroutines.d<? super e> dVar) {
                super(2, dVar);
                this.f32656d = p0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d<k2> create(@m Object obj, @l kotlin.coroutines.d<?> dVar) {
                return C0585a.this.new e(this.f32656d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f32654b;
                if (i4 == 0) {
                    a1.n(obj);
                    n0 n0Var = C0585a.this.mMeasurementManager;
                    p0 p0Var = this.f32656d;
                    this.f32654b = 1;
                    if (n0Var.f(p0Var, this) == aVar) {
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
            public final Object invoke(@l r0 r0Var, @m kotlin.coroutines.d<? super k2> dVar) {
                return ((e) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
            }
        }

        /* compiled from: MeasurementManagerFutures.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerWebTriggerAsync$1", f = "MeasurementManagerFutures.kt", i = {}, l = {161}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.privacysandbox.ads.adservices.java.measurement.a$a$f */
        static final class f extends o implements p<r0, kotlin.coroutines.d<? super k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f32657b;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ androidx.privacysandbox.ads.adservices.measurement.r0 f32659d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(androidx.privacysandbox.ads.adservices.measurement.r0 r0Var, kotlin.coroutines.d<? super f> dVar) {
                super(2, dVar);
                this.f32659d = r0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d<k2> create(@m Object obj, @l kotlin.coroutines.d<?> dVar) {
                return C0585a.this.new f(this.f32659d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f32657b;
                if (i4 == 0) {
                    a1.n(obj);
                    n0 n0Var = C0585a.this.mMeasurementManager;
                    androidx.privacysandbox.ads.adservices.measurement.r0 r0Var = this.f32659d;
                    this.f32657b = 1;
                    if (n0Var.g(r0Var, this) == aVar) {
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
            public final Object invoke(@l r0 r0Var, @m kotlin.coroutines.d<? super k2> dVar) {
                return ((f) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
            }
        }

        public C0585a(@l n0 mMeasurementManager) {
            l0.p(mMeasurementManager, "mMeasurementManager");
            this.mMeasurementManager = mMeasurementManager;
        }

        @Override // androidx.privacysandbox.ads.adservices.java.measurement.a
        @l
        @u
        @b1("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        public ListenableFuture<k2> a(@l androidx.privacysandbox.ads.adservices.measurement.e deletionRequest) {
            z0 b5;
            l0.p(deletionRequest, "deletionRequest");
            b5 = k.b(s0.a(j1.a()), null, null, new C0586a(deletionRequest, null), 3, null);
            return androidx.privacysandbox.ads.adservices.java.internal.b.c(b5, null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.measurement.a
        @l
        @u
        @b1("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        public ListenableFuture<Integer> c() {
            z0 b5;
            b5 = k.b(s0.a(j1.a()), null, null, new b(null), 3, null);
            return androidx.privacysandbox.ads.adservices.java.internal.b.c(b5, null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.measurement.a
        @l
        @u
        @b1("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        public ListenableFuture<k2> d(@l Uri attributionSource, @m InputEvent inputEvent) {
            z0 b5;
            l0.p(attributionSource, "attributionSource");
            b5 = k.b(s0.a(j1.a()), null, null, new c(attributionSource, inputEvent, null), 3, null);
            return androidx.privacysandbox.ads.adservices.java.internal.b.c(b5, null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.measurement.a
        @l
        @u
        @b1("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        public ListenableFuture<k2> e(@l Uri trigger) {
            z0 b5;
            l0.p(trigger, "trigger");
            b5 = k.b(s0.a(j1.a()), null, null, new d(trigger, null), 3, null);
            return androidx.privacysandbox.ads.adservices.java.internal.b.c(b5, null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.measurement.a
        @l
        @u
        @b1("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        public ListenableFuture<k2> f(@l p0 request) {
            z0 b5;
            l0.p(request, "request");
            b5 = k.b(s0.a(j1.a()), null, null, new e(request, null), 3, null);
            return androidx.privacysandbox.ads.adservices.java.internal.b.c(b5, null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.measurement.a
        @l
        @u
        @b1("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        public ListenableFuture<k2> g(@l androidx.privacysandbox.ads.adservices.measurement.r0 request) {
            z0 b5;
            l0.p(request, "request");
            b5 = k.b(s0.a(j1.a()), null, null, new f(request, null), 3, null);
            return androidx.privacysandbox.ads.adservices.java.internal.b.c(b5, null, 1, null);
        }
    }

    /* compiled from: MeasurementManagerFutures.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/privacysandbox/ads/adservices/java/measurement/a$b;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroidx/privacysandbox/ads/adservices/java/measurement/a;", "a", "(Landroid/content/Context;)Landroidx/privacysandbox/ads/adservices/java/measurement/a;", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nMeasurementManagerFutures.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeasurementManagerFutures.kt\nandroidx/privacysandbox/ads/adservices/java/measurement/MeasurementManagerFutures$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,186:1\n1#2:187\n*E\n"})
    /* renamed from: androidx.privacysandbox.ads.adservices.java.measurement.a$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @m
        @n
        public final a a(@l Context context) {
            l0.p(context, "context");
            n0 a5 = n0.INSTANCE.a(context);
            if (a5 != null) {
                return new C0585a(a5);
            }
            return null;
        }

        public Companion(w wVar) {
        }
    }

    @m
    @n
    public static final a b(@l Context context) {
        return INSTANCE.a(context);
    }

    @l
    public abstract ListenableFuture<k2> a(@l e deletionRequest);

    @l
    @b1("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    public abstract ListenableFuture<Integer> c();

    @l
    @b1("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    public abstract ListenableFuture<k2> d(@l Uri attributionSource, @m InputEvent inputEvent);

    @l
    @b1("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    public abstract ListenableFuture<k2> e(@l Uri trigger);

    @l
    @b1("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    public abstract ListenableFuture<k2> f(@l p0 request);

    @l
    @b1("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    public abstract ListenableFuture<k2> g(@l androidx.privacysandbox.ads.adservices.measurement.r0 request);
}
