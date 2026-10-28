package androidx.credentials;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import android.os.CancellationSignal;
import androidx.credentials.exceptions.ClearCredentialException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.q1;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.k2;
import kotlin.z0;

/* compiled from: CredentialManager.kt */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000 /2\u00020\u0001:\u0001/J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ \u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0097@¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0097@¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017JE\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001d0\u001cH&¢\u0006\u0004\b\u001f\u0010 JE\u0010!\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001d0\u001cH'¢\u0006\u0004\b!\u0010\"J=\u0010#\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001d0\u001cH'¢\u0006\u0004\b#\u0010$JE\u0010&\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020%0\u001cH&¢\u0006\u0004\b&\u0010'J?\u0010*\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0014\u0010\u001e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010(\u0012\u0004\u0012\u00020)0\u001cH&¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020,H'¢\u0006\u0004\b-\u0010.ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u00060À\u0006\u0001"}, d2 = {"Landroidx/credentials/l;", "", "Landroid/content/Context;", "context", "Landroidx/credentials/h1;", "request", "Landroidx/credentials/i1;", "f", "(Landroid/content/Context;Landroidx/credentials/h1;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/credentials/q1$b;", "pendingGetCredentialHandle", "j", "(Landroid/content/Context;Landroidx/credentials/q1$b;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/credentials/q1;", "e", "(Landroidx/credentials/h1;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/credentials/b;", "Landroidx/credentials/c;", "p", "(Landroid/content/Context;Landroidx/credentials/b;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/credentials/a;", "Lkotlin/k2;", "k", "(Landroidx/credentials/a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroid/os/CancellationSignal;", "cancellationSignal", "Ljava/util/concurrent/Executor;", "executor", "Landroidx/credentials/m;", "Landroidx/credentials/exceptions/GetCredentialException;", "callback", "m", "(Landroid/content/Context;Landroidx/credentials/h1;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Landroidx/credentials/m;)V", "i", "(Landroid/content/Context;Landroidx/credentials/q1$b;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Landroidx/credentials/m;)V", "o", "(Landroidx/credentials/h1;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Landroidx/credentials/m;)V", "Landroidx/credentials/exceptions/CreateCredentialException;", "h", "(Landroid/content/Context;Landroidx/credentials/b;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Landroidx/credentials/m;)V", "Ljava/lang/Void;", "Landroidx/credentials/exceptions/ClearCredentialException;", "l", "(Landroidx/credentials/a;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Landroidx/credentials/m;)V", "Landroid/app/PendingIntent;", "g", "()Landroid/app/PendingIntent;", "a", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"ObsoleteSdkInt"})
@kotlin.jvm.internal.r1({"SMAP\nCredentialManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CredentialManager.kt\nandroidx/credentials/CredentialManager\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,472:1\n314#2,11:473\n314#2,11:484\n314#2,11:495\n314#2,11:506\n314#2,11:517\n*S KotlinDebug\n*F\n+ 1 CredentialManager.kt\nandroidx/credentials/CredentialManager\n*L\n110#1:473,11\n163#1:484,11\n210#1:495,11\n257#1:506,11\n306#1:517,11\n*E\n"})
/* loaded from: classes3.dex */
public interface l {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = Companion.f27731a;

    /* compiled from: CredentialManager.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/credentials/l$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroidx/credentials/l;", "a", "(Landroid/content/Context;)Landroidx/credentials/l;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.credentials.l$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f27731a = new Companion();

        private Companion() {
        }

        @fg.l
        @kd.n
        public final l a(@fg.l Context context) {
            kotlin.jvm.internal.l0.p(context, "context");
            return new n(context);
        }
    }

    /* compiled from: CredentialManager.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/k2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<Throwable, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CancellationSignal f27732b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(CancellationSignal cancellationSignal) {
            super(1);
            this.f27732b = cancellationSignal;
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(Throwable th) {
            invoke2(th);
            return k2.f75408a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@fg.m Throwable th) {
            this.f27732b.cancel();
        }
    }

    /* compiled from: CredentialManager.kt */
    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"androidx/credentials/l$c", "Landroidx/credentials/m;", "Ljava/lang/Void;", "Landroidx/credentials/exceptions/ClearCredentialException;", "result", "Lkotlin/k2;", "c", "(Ljava/lang/Void;)V", "e", "b", "(Landroidx/credentials/exceptions/ClearCredentialException;)V", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c implements m<Void, ClearCredentialException> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.p<k2> f27733a;

        /* JADX WARN: Multi-variable type inference failed */
        c(kotlinx.coroutines.p<? super k2> pVar) {
            this.f27733a = pVar;
        }

        @Override // androidx.credentials.m
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@fg.l ClearCredentialException e4) {
            kotlin.jvm.internal.l0.p(e4, "e");
            if (this.f27733a.isActive()) {
                kotlinx.coroutines.p<k2> pVar = this.f27733a;
                z0.Companion companion = kotlin.z0.INSTANCE;
                pVar.resumeWith(kotlin.a1.a(e4));
            }
        }

        @Override // androidx.credentials.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onResult(@fg.m Void result) {
            if (this.f27733a.isActive()) {
                kotlinx.coroutines.p<k2> pVar = this.f27733a;
                z0.Companion companion = kotlin.z0.INSTANCE;
                pVar.resumeWith(k2.f75408a);
            }
        }
    }

    /* compiled from: CredentialManager.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/k2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.jvm.internal.n0 implements ld.l<Throwable, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CancellationSignal f27734b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(CancellationSignal cancellationSignal) {
            super(1);
            this.f27734b = cancellationSignal;
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(Throwable th) {
            invoke2(th);
            return k2.f75408a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@fg.m Throwable th) {
            this.f27734b.cancel();
        }
    }

    /* compiled from: CredentialManager.kt */
    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"androidx/credentials/l$e", "Landroidx/credentials/m;", "Landroidx/credentials/c;", "Landroidx/credentials/exceptions/CreateCredentialException;", "result", "Lkotlin/k2;", "c", "(Landroidx/credentials/c;)V", "e", "b", "(Landroidx/credentials/exceptions/CreateCredentialException;)V", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class e implements m<androidx.credentials.c, CreateCredentialException> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.p<androidx.credentials.c> f27735a;

        /* JADX WARN: Multi-variable type inference failed */
        e(kotlinx.coroutines.p<? super androidx.credentials.c> pVar) {
            this.f27735a = pVar;
        }

        @Override // androidx.credentials.m
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@fg.l CreateCredentialException e4) {
            kotlin.jvm.internal.l0.p(e4, "e");
            if (this.f27735a.isActive()) {
                kotlinx.coroutines.p<androidx.credentials.c> pVar = this.f27735a;
                z0.Companion companion = kotlin.z0.INSTANCE;
                pVar.resumeWith(kotlin.a1.a(e4));
            }
        }

        @Override // androidx.credentials.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onResult(@fg.l androidx.credentials.c result) {
            kotlin.jvm.internal.l0.p(result, "result");
            if (this.f27735a.isActive()) {
                kotlinx.coroutines.p<androidx.credentials.c> pVar = this.f27735a;
                z0.Companion companion = kotlin.z0.INSTANCE;
                pVar.resumeWith(result);
            }
        }
    }

    /* compiled from: CredentialManager.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/k2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class f extends kotlin.jvm.internal.n0 implements ld.l<Throwable, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CancellationSignal f27736b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(CancellationSignal cancellationSignal) {
            super(1);
            this.f27736b = cancellationSignal;
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(Throwable th) {
            invoke2(th);
            return k2.f75408a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@fg.m Throwable th) {
            this.f27736b.cancel();
        }
    }

    /* compiled from: CredentialManager.kt */
    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"androidx/credentials/l$g", "Landroidx/credentials/m;", "Landroidx/credentials/i1;", "Landroidx/credentials/exceptions/GetCredentialException;", "result", "Lkotlin/k2;", "c", "(Landroidx/credentials/i1;)V", "e", "b", "(Landroidx/credentials/exceptions/GetCredentialException;)V", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class g implements m<i1, GetCredentialException> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.p<i1> f27737a;

        /* JADX WARN: Multi-variable type inference failed */
        g(kotlinx.coroutines.p<? super i1> pVar) {
            this.f27737a = pVar;
        }

        @Override // androidx.credentials.m
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@fg.l GetCredentialException e4) {
            kotlin.jvm.internal.l0.p(e4, "e");
            if (this.f27737a.isActive()) {
                kotlinx.coroutines.p<i1> pVar = this.f27737a;
                z0.Companion companion = kotlin.z0.INSTANCE;
                pVar.resumeWith(kotlin.a1.a(e4));
            }
        }

        @Override // androidx.credentials.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onResult(@fg.l i1 result) {
            kotlin.jvm.internal.l0.p(result, "result");
            if (this.f27737a.isActive()) {
                kotlinx.coroutines.p<i1> pVar = this.f27737a;
                z0.Companion companion = kotlin.z0.INSTANCE;
                pVar.resumeWith(result);
            }
        }
    }

    /* compiled from: CredentialManager.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/k2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class h extends kotlin.jvm.internal.n0 implements ld.l<Throwable, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CancellationSignal f27738b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(CancellationSignal cancellationSignal) {
            super(1);
            this.f27738b = cancellationSignal;
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(Throwable th) {
            invoke2(th);
            return k2.f75408a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@fg.m Throwable th) {
            this.f27738b.cancel();
        }
    }

    /* compiled from: CredentialManager.kt */
    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"androidx/credentials/l$i", "Landroidx/credentials/m;", "Landroidx/credentials/i1;", "Landroidx/credentials/exceptions/GetCredentialException;", "result", "Lkotlin/k2;", "c", "(Landroidx/credentials/i1;)V", "e", "b", "(Landroidx/credentials/exceptions/GetCredentialException;)V", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class i implements m<i1, GetCredentialException> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.p<i1> f27739a;

        /* JADX WARN: Multi-variable type inference failed */
        i(kotlinx.coroutines.p<? super i1> pVar) {
            this.f27739a = pVar;
        }

        @Override // androidx.credentials.m
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@fg.l GetCredentialException e4) {
            kotlin.jvm.internal.l0.p(e4, "e");
            if (this.f27739a.isActive()) {
                kotlinx.coroutines.p<i1> pVar = this.f27739a;
                z0.Companion companion = kotlin.z0.INSTANCE;
                pVar.resumeWith(kotlin.a1.a(e4));
            }
        }

        @Override // androidx.credentials.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onResult(@fg.l i1 result) {
            kotlin.jvm.internal.l0.p(result, "result");
            if (this.f27739a.isActive()) {
                kotlinx.coroutines.p<i1> pVar = this.f27739a;
                z0.Companion companion = kotlin.z0.INSTANCE;
                pVar.resumeWith(result);
            }
        }
    }

    /* compiled from: CredentialManager.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/k2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class j extends kotlin.jvm.internal.n0 implements ld.l<Throwable, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CancellationSignal f27740b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(CancellationSignal cancellationSignal) {
            super(1);
            this.f27740b = cancellationSignal;
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(Throwable th) {
            invoke2(th);
            return k2.f75408a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@fg.m Throwable th) {
            this.f27740b.cancel();
        }
    }

    /* compiled from: CredentialManager.kt */
    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"androidx/credentials/l$k", "Landroidx/credentials/m;", "Landroidx/credentials/q1;", "Landroidx/credentials/exceptions/GetCredentialException;", "result", "Lkotlin/k2;", "c", "(Landroidx/credentials/q1;)V", "e", "b", "(Landroidx/credentials/exceptions/GetCredentialException;)V", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class k implements m<q1, GetCredentialException> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.p<q1> f27741a;

        /* JADX WARN: Multi-variable type inference failed */
        k(kotlinx.coroutines.p<? super q1> pVar) {
            this.f27741a = pVar;
        }

        @Override // androidx.credentials.m
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@fg.l GetCredentialException e4) {
            kotlin.jvm.internal.l0.p(e4, "e");
            if (this.f27741a.isActive()) {
                kotlinx.coroutines.p<q1> pVar = this.f27741a;
                z0.Companion companion = kotlin.z0.INSTANCE;
                pVar.resumeWith(kotlin.a1.a(e4));
            }
        }

        @Override // androidx.credentials.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onResult(@fg.l q1 result) {
            kotlin.jvm.internal.l0.p(result, "result");
            if (this.f27741a.isActive()) {
                kotlinx.coroutines.p<q1> pVar = this.f27741a;
                z0.Companion companion = kotlin.z0.INSTANCE;
                pVar.resumeWith(result);
            }
        }
    }

    @androidx.annotation.x0(34)
    static Object a(l lVar, Context context, q1.b bVar, kotlin.coroutines.d<? super i1> dVar) {
        kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        qVar.e0();
        CancellationSignal cancellationSignal = new CancellationSignal();
        qVar.k0(new h(cancellationSignal));
        lVar.i(context, bVar, cancellationSignal, new androidx.credentials.k(), new i(qVar));
        Object y4 = qVar.y();
        if (y4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y4;
    }

    static Object b(l lVar, Context context, androidx.credentials.b bVar, kotlin.coroutines.d<? super androidx.credentials.c> dVar) {
        kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        qVar.e0();
        CancellationSignal cancellationSignal = new CancellationSignal();
        qVar.k0(new d(cancellationSignal));
        lVar.h(context, bVar, cancellationSignal, new androidx.credentials.k(), new e(qVar));
        Object y4 = qVar.y();
        if (y4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y4;
    }

    @androidx.annotation.x0(34)
    static Object c(l lVar, h1 h1Var, kotlin.coroutines.d<? super q1> dVar) {
        kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        qVar.e0();
        CancellationSignal cancellationSignal = new CancellationSignal();
        qVar.k0(new j(cancellationSignal));
        lVar.o(h1Var, cancellationSignal, new androidx.credentials.k(), new k(qVar));
        Object y4 = qVar.y();
        if (y4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y4;
    }

    @fg.l
    @kd.n
    static l create(@fg.l Context context) {
        return INSTANCE.a(context);
    }

    static Object d(l lVar, Context context, h1 h1Var, kotlin.coroutines.d<? super i1> dVar) {
        kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        qVar.e0();
        CancellationSignal cancellationSignal = new CancellationSignal();
        qVar.k0(new f(cancellationSignal));
        lVar.m(context, h1Var, cancellationSignal, new androidx.credentials.k(), new g(qVar));
        Object y4 = qVar.y();
        if (y4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y4;
    }

    static Object n(l lVar, a aVar, kotlin.coroutines.d<? super k2> dVar) {
        kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        qVar.e0();
        CancellationSignal cancellationSignal = new CancellationSignal();
        qVar.k0(new b(cancellationSignal));
        lVar.l(aVar, cancellationSignal, new androidx.credentials.k(), new c(qVar));
        Object y4 = qVar.y();
        kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
        if (y4 == aVar2) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y4 == aVar2 ? y4 : k2.f75408a;
    }

    @fg.m
    @androidx.annotation.x0(34)
    default Object e(@fg.l h1 h1Var, @fg.l kotlin.coroutines.d<? super q1> dVar) {
        return c(this, h1Var, dVar);
    }

    @fg.m
    default Object f(@fg.l Context context, @fg.l h1 h1Var, @fg.l kotlin.coroutines.d<? super i1> dVar) {
        return d(this, context, h1Var, dVar);
    }

    @fg.l
    @androidx.annotation.x0(34)
    PendingIntent g();

    void h(@fg.l Context context, @fg.l androidx.credentials.b request, @fg.m CancellationSignal cancellationSignal, @fg.l Executor executor, @fg.l m<androidx.credentials.c, CreateCredentialException> callback);

    @androidx.annotation.x0(34)
    void i(@fg.l Context context, @fg.l q1.b pendingGetCredentialHandle, @fg.m CancellationSignal cancellationSignal, @fg.l Executor executor, @fg.l m<i1, GetCredentialException> callback);

    @fg.m
    @androidx.annotation.x0(34)
    default Object j(@fg.l Context context, @fg.l q1.b bVar, @fg.l kotlin.coroutines.d<? super i1> dVar) {
        return a(this, context, bVar, dVar);
    }

    @fg.m
    default Object k(@fg.l a aVar, @fg.l kotlin.coroutines.d<? super k2> dVar) {
        return n(this, aVar, dVar);
    }

    void l(@fg.l a request, @fg.m CancellationSignal cancellationSignal, @fg.l Executor executor, @fg.l m<Void, ClearCredentialException> callback);

    void m(@fg.l Context context, @fg.l h1 request, @fg.m CancellationSignal cancellationSignal, @fg.l Executor executor, @fg.l m<i1, GetCredentialException> callback);

    @androidx.annotation.x0(34)
    void o(@fg.l h1 request, @fg.m CancellationSignal cancellationSignal, @fg.l Executor executor, @fg.l m<q1, GetCredentialException> callback);

    @fg.m
    default Object p(@fg.l Context context, @fg.l androidx.credentials.b bVar, @fg.l kotlin.coroutines.d<? super androidx.credentials.c> dVar) {
        return b(this, context, bVar, dVar);
    }
}
