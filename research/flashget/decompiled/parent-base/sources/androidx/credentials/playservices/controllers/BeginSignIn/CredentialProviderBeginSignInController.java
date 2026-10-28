package androidx.credentials.playservices.controllers.BeginSignIn;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import androidx.annotation.m1;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialInterruptedException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.h1;
import androidx.credentials.i1;
import androidx.credentials.j;
import androidx.credentials.m;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.HiddenActivity;
import androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.k;
import androidx.credentials.playservices.controllers.a;
import androidx.credentials.playservices.controllers.b;
import androidx.credentials.s1;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.Identity;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.common.api.ApiException;
import fg.l;
import java.util.concurrent.Executor;
import kd.n;
import kotlin.Metadata;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.w;
import kotlin.k2;
import ld.p;
import r8.c;

/* compiled from: CredentialProviderBeginSignInController.kt */
@Metadata(d1 = {"\u0000]\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\b\u0007*\u00016\b\u0000\u0018\u0000 :2 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001:\u0001;B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ=\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u00022\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0002H\u0017¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\"\u0010#R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R4\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00108\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b&\u0010'\u0012\u0004\b+\u0010,\u001a\u0004\b(\u0010)\"\u0004\b$\u0010*R(\u0010\u0013\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b-\u0010.\u0012\u0004\b2\u0010,\u001a\u0004\b/\u00100\"\u0004\b&\u00101R\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b3\u00104\u0012\u0004\b5\u0010,R\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108¨\u0006<"}, d2 = {"Landroidx/credentials/playservices/controllers/BeginSignIn/CredentialProviderBeginSignInController;", "Landroidx/credentials/playservices/controllers/b;", "Landroidx/credentials/h1;", "Lcom/google/android/gms/auth/api/identity/BeginSignInRequest;", "Lcom/google/android/gms/auth/api/identity/SignInCredential;", "Landroidx/credentials/i1;", "Landroidx/credentials/exceptions/GetCredentialException;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "response", "Lr8/c;", "r", "(Lcom/google/android/gms/auth/api/identity/SignInCredential;)Lr8/c;", "request", "Landroidx/credentials/m;", "callback", "Ljava/util/concurrent/Executor;", "executor", "Landroid/os/CancellationSignal;", "cancellationSignal", "Lkotlin/k2;", "z", "(Landroidx/credentials/h1;Landroidx/credentials/m;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V", "", "uniqueRequestCode", "resultCode", "Landroid/content/Intent;", "data", "y", "(IILandroid/content/Intent;)V", "p", "(Landroidx/credentials/h1;)Lcom/google/android/gms/auth/api/identity/BeginSignInRequest;", "q", "(Lcom/google/android/gms/auth/api/identity/SignInCredential;)Landroidx/credentials/i1;", "A", "Landroid/content/Context;", "B", "Landroidx/credentials/m;", "s", "()Landroidx/credentials/m;", "(Landroidx/credentials/m;)V", "t", "()V", "C", "Ljava/util/concurrent/Executor;", "v", "()Ljava/util/concurrent/Executor;", "(Ljava/util/concurrent/Executor;)V", "w", "D", "Landroid/os/CancellationSignal;", "u", "androidx/credentials/playservices/controllers/BeginSignIn/CredentialProviderBeginSignInController$resultReceiver$1", "E", "Landroidx/credentials/playservices/controllers/BeginSignIn/CredentialProviderBeginSignInController$resultReceiver$1;", "resultReceiver", "F", "a", "credentials-play-services-auth_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CredentialProviderBeginSignInController extends androidx.credentials.playservices.controllers.b<h1, BeginSignInRequest, SignInCredential, i1, GetCredentialException> {

    /* renamed from: A, reason: from kotlin metadata */
    @l
    private final Context context;

    /* renamed from: B, reason: from kotlin metadata */
    public m<i1, GetCredentialException> callback;

    /* renamed from: C, reason: from kotlin metadata */
    public Executor executor;

    /* renamed from: D, reason: from kotlin metadata */
    @fg.m
    private CancellationSignal cancellationSignal;

    /* renamed from: E, reason: from kotlin metadata */
    @l
    private final CredentialProviderBeginSignInController$resultReceiver$1 resultReceiver;

    @l
    private static final String G = "BeginSignIn";

    /* renamed from: F, reason: from kotlin metadata */
    @l
    public static final Companion INSTANCE = new Companion();

    /* compiled from: CredentialProviderBeginSignInController.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/credentials/playservices/controllers/BeginSignIn/CredentialProviderBeginSignInController$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroidx/credentials/playservices/controllers/BeginSignIn/CredentialProviderBeginSignInController;", "a", "(Landroid/content/Context;)Landroidx/credentials/playservices/controllers/BeginSignIn/CredentialProviderBeginSignInController;", "", "TAG", "Ljava/lang/String;", "credentials-play-services-auth_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @l
        @n
        public final CredentialProviderBeginSignInController a(@l Context context) {
            l0.p(context, "context");
            return new CredentialProviderBeginSignInController(context);
        }

        public Companion(w wVar) {
        }
    }

    /* compiled from: CredentialProviderBeginSignInController.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/os/CancellationSignal;", "s", "Lkotlin/Function0;", "Lkotlin/k2;", "f", "a", "(Landroid/os/CancellationSignal;Lld/a;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends n0 implements p<CancellationSignal, ld.a<? extends k2>, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f27801b = new b(2);

        b() {
            super(2);
        }

        public final void a(@fg.m CancellationSignal cancellationSignal, @l ld.a<k2> f4) {
            l0.p(f4, "f");
            b.Companion companion = androidx.credentials.playservices.controllers.b.INSTANCE;
            androidx.credentials.playservices.controllers.b.f(cancellationSignal, f4);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(CancellationSignal cancellationSignal, ld.a<? extends k2> aVar) {
            a(cancellationSignal, aVar);
            return k2.f75408a;
        }
    }

    /* compiled from: CredentialProviderBeginSignInController.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/credentials/exceptions/GetCredentialException;", "e", "Lkotlin/k2;", "b", "(Landroidx/credentials/exceptions/GetCredentialException;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends n0 implements ld.l<GetCredentialException, k2> {
        c() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(CredentialProviderBeginSignInController this$0, GetCredentialException e4) {
            l0.p(this$0, "this$0");
            l0.p(e4, "$e");
            this$0.s().a(e4);
        }

        public final void b(@l final GetCredentialException e4) {
            l0.p(e4, "e");
            Executor v4 = CredentialProviderBeginSignInController.this.v();
            final CredentialProviderBeginSignInController credentialProviderBeginSignInController = CredentialProviderBeginSignInController.this;
            v4.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.BeginSignIn.b
                @Override // java.lang.Runnable
                public final void run() {
                    CredentialProviderBeginSignInController.c.c(CredentialProviderBeginSignInController.this, e4);
                }
            });
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(GetCredentialException getCredentialException) {
            b(getCredentialException);
            return k2.f75408a;
        }
    }

    /* compiled from: CredentialProviderBeginSignInController.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class d extends n0 implements ld.a<k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ i1 f27804c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(i1 i1Var) {
            super(0);
            this.f27804c = i1Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(CredentialProviderBeginSignInController this$0, i1 response) {
            l0.p(this$0, "this$0");
            l0.p(response, "$response");
            this$0.s().onResult(response);
        }

        public final void b() {
            Executor v4 = CredentialProviderBeginSignInController.this.v();
            final CredentialProviderBeginSignInController credentialProviderBeginSignInController = CredentialProviderBeginSignInController.this;
            final i1 i1Var = this.f27804c;
            v4.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.BeginSignIn.c
                @Override // java.lang.Runnable
                public final void run() {
                    CredentialProviderBeginSignInController.d.c(CredentialProviderBeginSignInController.this, i1Var);
                }
            });
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ k2 invoke() {
            b();
            return k2.f75408a;
        }
    }

    /* compiled from: CredentialProviderBeginSignInController.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class e extends n0 implements ld.a<k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k1.h<GetCredentialException> f27806c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(k1.h<GetCredentialException> hVar) {
            super(0);
            this.f27806c = hVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final void c(CredentialProviderBeginSignInController this$0, k1.h exception) {
            l0.p(this$0, "this$0");
            l0.p(exception, "$exception");
            this$0.s().a(exception.f75329b);
        }

        public final void b() {
            Executor v4 = CredentialProviderBeginSignInController.this.v();
            final CredentialProviderBeginSignInController credentialProviderBeginSignInController = CredentialProviderBeginSignInController.this;
            final k1.h<GetCredentialException> hVar = this.f27806c;
            v4.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.BeginSignIn.d
                @Override // java.lang.Runnable
                public final void run() {
                    CredentialProviderBeginSignInController.e.c(CredentialProviderBeginSignInController.this, hVar);
                }
            });
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ k2 invoke() {
            b();
            return k2.f75408a;
        }
    }

    /* compiled from: CredentialProviderBeginSignInController.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class f extends n0 implements ld.a<k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ GetCredentialException f27808c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(GetCredentialException getCredentialException) {
            super(0);
            this.f27808c = getCredentialException;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(CredentialProviderBeginSignInController this$0, GetCredentialException e4) {
            l0.p(this$0, "this$0");
            l0.p(e4, "$e");
            this$0.s().a(e4);
        }

        public final void b() {
            Executor v4 = CredentialProviderBeginSignInController.this.v();
            final CredentialProviderBeginSignInController credentialProviderBeginSignInController = CredentialProviderBeginSignInController.this;
            final GetCredentialException getCredentialException = this.f27808c;
            v4.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.BeginSignIn.e
                @Override // java.lang.Runnable
                public final void run() {
                    CredentialProviderBeginSignInController.f.c(CredentialProviderBeginSignInController.this, getCredentialException);
                }
            });
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ k2 invoke() {
            b();
            return k2.f75408a;
        }
    }

    /* compiled from: CredentialProviderBeginSignInController.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class g extends n0 implements ld.a<k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ GetCredentialUnknownException f27810c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(GetCredentialUnknownException getCredentialUnknownException) {
            super(0);
            this.f27810c = getCredentialUnknownException;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(CredentialProviderBeginSignInController this$0, GetCredentialUnknownException e4) {
            l0.p(this$0, "this$0");
            l0.p(e4, "$e");
            this$0.s().a(e4);
        }

        public final void b() {
            Executor v4 = CredentialProviderBeginSignInController.this.v();
            final CredentialProviderBeginSignInController credentialProviderBeginSignInController = CredentialProviderBeginSignInController.this;
            final GetCredentialUnknownException getCredentialUnknownException = this.f27810c;
            v4.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.BeginSignIn.f
                @Override // java.lang.Runnable
                public final void run() {
                    CredentialProviderBeginSignInController.g.c(CredentialProviderBeginSignInController.this, getCredentialUnknownException);
                }
            });
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ k2 invoke() {
            b();
            return k2.f75408a;
        }
    }

    /* compiled from: CredentialProviderBeginSignInController.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class h extends n0 implements ld.a<k2> {
        h() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(CredentialProviderBeginSignInController this$0) {
            l0.p(this$0, "this$0");
            this$0.s().a(new GetCredentialUnknownException("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context."));
        }

        public final void b() {
            Executor v4 = CredentialProviderBeginSignInController.this.v();
            final CredentialProviderBeginSignInController credentialProviderBeginSignInController = CredentialProviderBeginSignInController.this;
            v4.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.BeginSignIn.g
                @Override // java.lang.Runnable
                public final void run() {
                    CredentialProviderBeginSignInController.h.c(CredentialProviderBeginSignInController.this);
                }
            });
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ k2 invoke() {
            b();
            return k2.f75408a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController$resultReceiver$1] */
    public CredentialProviderBeginSignInController(@l Context context) {
        super(context);
        l0.p(context, "context");
        this.context = context;
        final Handler handler = new Handler(Looper.getMainLooper());
        this.resultReceiver = new ResultReceiver(handler) { // from class: androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController$resultReceiver$1

            /* compiled from: CredentialProviderBeginSignInController.kt */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            /* synthetic */ class a extends h0 implements p<String, String, GetCredentialException> {
                a(Object obj) {
                    super(2, obj, a.Companion.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0);
                }

                @Override // ld.p
                @l
                /* renamed from: Z, reason: merged with bridge method [inline-methods] */
                public final GetCredentialException invoke(@fg.m String str, @fg.m String str2) {
                    return ((a.Companion) this.receiver).d(str, str2);
                }
            }

            @Override // android.os.ResultReceiver
            public void onReceiveResult(int resultCode, @l Bundle resultData) {
                CancellationSignal cancellationSignal;
                boolean j4;
                l0.p(resultData, "resultData");
                CredentialProviderBeginSignInController credentialProviderBeginSignInController = CredentialProviderBeginSignInController.this;
                a aVar = new a(androidx.credentials.playservices.controllers.a.INSTANCE);
                Executor v4 = CredentialProviderBeginSignInController.this.v();
                m<i1, GetCredentialException> s4 = CredentialProviderBeginSignInController.this.s();
                cancellationSignal = CredentialProviderBeginSignInController.this.cancellationSignal;
                j4 = credentialProviderBeginSignInController.j(resultData, aVar, v4, s4, cancellationSignal);
                if (j4) {
                    return;
                }
                CredentialProviderBeginSignInController.this.y(resultData.getInt("ACTIVITY_REQUEST_CODE"), resultCode, (Intent) resultData.getParcelable("RESULT_DATA"));
            }
        };
    }

    private final r8.c r(SignInCredential response) {
        c.a aVar = new c.a();
        String id2 = response.getId();
        l0.o(id2, "response.id");
        c.a e4 = aVar.e(id2);
        String googleIdToken = response.getGoogleIdToken();
        l0.m(googleIdToken);
        c.a f4 = e4.f(googleIdToken);
        if (response.getDisplayName() != null) {
            f4.b(response.getDisplayName());
        }
        if (response.getGivenName() != null) {
            f4.d(response.getGivenName());
        }
        if (response.getFamilyName() != null) {
            f4.c(response.getFamilyName());
        }
        if (response.getPhoneNumber() != null) {
            f4.g(response.getPhoneNumber());
        }
        if (response.getProfilePictureUri() != null) {
            f4.h(response.getProfilePictureUri());
        }
        return f4.a();
    }

    @m1(otherwise = 2)
    public static /* synthetic */ void t() {
    }

    @m1(otherwise = 2)
    private static /* synthetic */ void u() {
    }

    @m1(otherwise = 2)
    public static /* synthetic */ void w() {
    }

    @l
    @n
    public static final CredentialProviderBeginSignInController x(@l Context context) {
        return INSTANCE.a(context);
    }

    public final void A(@l m<i1, GetCredentialException> mVar) {
        l0.p(mVar, "<set-?>");
        this.callback = mVar;
    }

    public final void B(@l Executor executor) {
        l0.p(executor, "<set-?>");
        this.executor = executor;
    }

    @Override // androidx.credentials.playservices.controllers.b
    @l
    @m1(otherwise = 4)
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public BeginSignInRequest g(@l h1 request) {
        l0.p(request, "request");
        return a.INSTANCE.a(request, this.context);
    }

    @Override // androidx.credentials.playservices.controllers.b
    @l
    @m1(otherwise = 4)
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public i1 h(@l SignInCredential response) {
        j r4;
        l0.p(response, "response");
        if (response.getPassword() != null) {
            String id2 = response.getId();
            l0.o(id2, "response.id");
            String password = response.getPassword();
            l0.m(password);
            r4 = new androidx.credentials.m1(id2, password);
        } else {
            r4 = response.getGoogleIdToken() != null ? r(response) : response.getPublicKeyCredential() != null ? new s1(k.INSTANCE.c0(response)) : null;
        }
        if (r4 != null) {
            return new i1(r4);
        }
        throw new GetCredentialUnknownException("When attempting to convert get response, null credential found");
    }

    @l
    public final m<i1, GetCredentialException> s() {
        m<i1, GetCredentialException> mVar = this.callback;
        if (mVar != null) {
            return mVar;
        }
        l0.S("callback");
        return null;
    }

    @l
    public final Executor v() {
        Executor executor = this.executor;
        if (executor != null) {
            return executor;
        }
        l0.S("executor");
        return null;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [T, androidx.credentials.exceptions.GetCredentialUnknownException] */
    /* JADX WARN: Type inference failed for: r5v7, types: [T, androidx.credentials.exceptions.GetCredentialInterruptedException] */
    /* JADX WARN: Type inference failed for: r5v9, types: [T, androidx.credentials.exceptions.GetCredentialCancellationException] */
    public final void y(int uniqueRequestCode, int resultCode, @fg.m Intent data) {
        if (uniqueRequestCode != androidx.credentials.playservices.controllers.a.d()) {
            androidx.credentials.playservices.controllers.a.d();
            return;
        }
        if (androidx.credentials.playservices.controllers.b.l(resultCode, b.f27801b, new c(), this.cancellationSignal)) {
            return;
        }
        try {
            SignInCredential signInCredentialFromIntent = Identity.getSignInClient(this.context).getSignInCredentialFromIntent(data);
            l0.o(signInCredentialFromIntent, "getSignInClient(context)…redentialFromIntent(data)");
            androidx.credentials.playservices.controllers.b.f(this.cancellationSignal, new d(h(signInCredentialFromIntent)));
        } catch (GetCredentialException e4) {
            androidx.credentials.playservices.controllers.b.f(this.cancellationSignal, new f(e4));
        } catch (ApiException e5) {
            k1.h hVar = new k1.h();
            hVar.f75329b = new GetCredentialUnknownException(e5.getMessage());
            if (e5.getStatusCode() == 16) {
                hVar.f75329b = new GetCredentialCancellationException(e5.getMessage());
            } else {
                androidx.credentials.playservices.controllers.a.INSTANCE.getClass();
                if (androidx.credentials.playservices.controllers.a.f27926c.contains(Integer.valueOf(e5.getStatusCode()))) {
                    hVar.f75329b = new GetCredentialInterruptedException(e5.getMessage());
                }
            }
            androidx.credentials.playservices.controllers.b.f(this.cancellationSignal, new e(hVar));
        } catch (Throwable th) {
            androidx.credentials.playservices.controllers.b.f(this.cancellationSignal, new g(new GetCredentialUnknownException(th.getMessage())));
        }
    }

    @Override // androidx.credentials.playservices.controllers.b
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void i(@l h1 request, @l m<i1, GetCredentialException> callback, @l Executor executor, @fg.m CancellationSignal cancellationSignal) {
        l0.p(request, "request");
        l0.p(callback, "callback");
        l0.p(executor, "executor");
        this.cancellationSignal = cancellationSignal;
        A(callback);
        B(executor);
        if (CredentialProviderPlayServicesImpl.INSTANCE.a(cancellationSignal)) {
            return;
        }
        BeginSignInRequest g4 = g(request);
        Intent intent = new Intent(this.context, (Class<?>) HiddenActivity.class);
        intent.putExtra("REQUEST_TYPE", g4);
        c(this.resultReceiver, intent, "BEGIN_SIGN_IN");
        try {
            this.context.startActivity(intent);
        } catch (Exception unused) {
            androidx.credentials.playservices.controllers.b.f(cancellationSignal, new h());
        }
    }
}
