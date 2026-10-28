package androidx.credentials.playservices.controllers.CreatePassword;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import androidx.annotation.m1;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.CreateCredentialUnknownException;
import androidx.credentials.f;
import androidx.credentials.g;
import androidx.credentials.m;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.HiddenActivity;
import androidx.credentials.playservices.controllers.CreatePassword.CredentialProviderCreatePasswordController;
import androidx.credentials.playservices.controllers.a;
import androidx.credentials.playservices.controllers.b;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.auth.api.identity.SignInPassword;
import fg.l;
import java.util.concurrent.Executor;
import kd.n;
import kotlin.Metadata;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.w;
import kotlin.k2;
import ld.p;

/* compiled from: CredentialProviderCreatePasswordController.kt */
@Metadata(d1 = {"\u0000G\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\b\u0007*\u0001)\b\u0000\u0018\u0000 -2 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001:\u0001.B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ=\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR(\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\f8\u0002@\u0002X\u0083.¢\u0006\f\n\u0004\b \u0010!\u0012\u0004\b\"\u0010#R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b&\u0010'\u0012\u0004\b(\u0010#R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006/"}, d2 = {"Landroidx/credentials/playservices/controllers/CreatePassword/CredentialProviderCreatePasswordController;", "Landroidx/credentials/playservices/controllers/b;", "Landroidx/credentials/f;", "Lcom/google/android/gms/auth/api/identity/SavePasswordRequest;", "Lkotlin/k2;", "Landroidx/credentials/c;", "Landroidx/credentials/exceptions/CreateCredentialException;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "request", "Landroidx/credentials/m;", "callback", "Ljava/util/concurrent/Executor;", "executor", "Landroid/os/CancellationSignal;", "cancellationSignal", "x", "(Landroidx/credentials/f;Landroidx/credentials/m;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V", "", "uniqueRequestCode", "resultCode", "w", "(II)V", "r", "(Landroidx/credentials/f;)Lcom/google/android/gms/auth/api/identity/SavePasswordRequest;", "response", "s", "(Lkotlin/k2;)Landroidx/credentials/c;", "A", "Landroid/content/Context;", "B", "Landroidx/credentials/m;", "t", "()V", "C", "Ljava/util/concurrent/Executor;", "D", "Landroid/os/CancellationSignal;", "u", "androidx/credentials/playservices/controllers/CreatePassword/CredentialProviderCreatePasswordController$resultReceiver$1", "E", "Landroidx/credentials/playservices/controllers/CreatePassword/CredentialProviderCreatePasswordController$resultReceiver$1;", "resultReceiver", "F", "a", "credentials-play-services-auth_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CredentialProviderCreatePasswordController extends androidx.credentials.playservices.controllers.b<f, SavePasswordRequest, k2, androidx.credentials.c, CreateCredentialException> {

    /* renamed from: A, reason: from kotlin metadata */
    @l
    private final Context context;

    /* renamed from: B, reason: from kotlin metadata */
    private m<androidx.credentials.c, CreateCredentialException> callback;

    /* renamed from: C, reason: from kotlin metadata */
    private Executor executor;

    /* renamed from: D, reason: from kotlin metadata */
    @fg.m
    private CancellationSignal cancellationSignal;

    /* renamed from: E, reason: from kotlin metadata */
    @l
    private final CredentialProviderCreatePasswordController$resultReceiver$1 resultReceiver;

    @l
    private static final String G = "CreatePassword";

    /* renamed from: F, reason: from kotlin metadata */
    @l
    public static final Companion INSTANCE = new Companion();

    /* compiled from: CredentialProviderCreatePasswordController.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/credentials/playservices/controllers/CreatePassword/CredentialProviderCreatePasswordController$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroidx/credentials/playservices/controllers/CreatePassword/CredentialProviderCreatePasswordController;", "a", "(Landroid/content/Context;)Landroidx/credentials/playservices/controllers/CreatePassword/CredentialProviderCreatePasswordController;", "", "TAG", "Ljava/lang/String;", "credentials-play-services-auth_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.credentials.playservices.controllers.CreatePassword.CredentialProviderCreatePasswordController$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @l
        @n
        public final CredentialProviderCreatePasswordController a(@l Context context) {
            l0.p(context, "context");
            return new CredentialProviderCreatePasswordController(context);
        }

        public Companion(w wVar) {
        }
    }

    /* compiled from: CredentialProviderCreatePasswordController.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/os/CancellationSignal;", "s", "Lkotlin/Function0;", "Lkotlin/k2;", "f", "a", "(Landroid/os/CancellationSignal;Lld/a;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends n0 implements p<CancellationSignal, ld.a<? extends k2>, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f27828b = new b(2);

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

    /* compiled from: CredentialProviderCreatePasswordController.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/credentials/exceptions/CreateCredentialException;", "e", "Lkotlin/k2;", "b", "(Landroidx/credentials/exceptions/CreateCredentialException;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends n0 implements ld.l<CreateCredentialException, k2> {
        c() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(CredentialProviderCreatePasswordController this$0, CreateCredentialException e4) {
            l0.p(this$0, "this$0");
            l0.p(e4, "$e");
            m mVar = this$0.callback;
            if (mVar == null) {
                l0.S("callback");
                mVar = null;
            }
            mVar.a(e4);
        }

        public final void b(@l final CreateCredentialException e4) {
            l0.p(e4, "e");
            Executor executor = CredentialProviderCreatePasswordController.this.executor;
            if (executor == null) {
                l0.S("executor");
                executor = null;
            }
            final CredentialProviderCreatePasswordController credentialProviderCreatePasswordController = CredentialProviderCreatePasswordController.this;
            executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.CreatePassword.a
                @Override // java.lang.Runnable
                public final void run() {
                    CredentialProviderCreatePasswordController.c.c(CredentialProviderCreatePasswordController.this, e4);
                }
            });
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(CreateCredentialException createCredentialException) {
            b(createCredentialException);
            return k2.f75408a;
        }
    }

    /* compiled from: CredentialProviderCreatePasswordController.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class d extends n0 implements ld.a<k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.credentials.c f27831c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(androidx.credentials.c cVar) {
            super(0);
            this.f27831c = cVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(CredentialProviderCreatePasswordController this$0, androidx.credentials.c response) {
            l0.p(this$0, "this$0");
            l0.p(response, "$response");
            m mVar = this$0.callback;
            if (mVar == null) {
                l0.S("callback");
                mVar = null;
            }
            mVar.onResult(response);
        }

        public final void b() {
            Executor executor = CredentialProviderCreatePasswordController.this.executor;
            if (executor == null) {
                l0.S("executor");
                executor = null;
            }
            final CredentialProviderCreatePasswordController credentialProviderCreatePasswordController = CredentialProviderCreatePasswordController.this;
            final androidx.credentials.c cVar = this.f27831c;
            executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.CreatePassword.b
                @Override // java.lang.Runnable
                public final void run() {
                    CredentialProviderCreatePasswordController.d.c(CredentialProviderCreatePasswordController.this, cVar);
                }
            });
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ k2 invoke() {
            b();
            return k2.f75408a;
        }
    }

    /* compiled from: CredentialProviderCreatePasswordController.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class e extends n0 implements ld.a<k2> {
        e() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(CredentialProviderCreatePasswordController this$0) {
            l0.p(this$0, "this$0");
            m mVar = this$0.callback;
            if (mVar == null) {
                l0.S("callback");
                mVar = null;
            }
            mVar.a(new CreateCredentialUnknownException("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context."));
        }

        public final void b() {
            Executor executor = CredentialProviderCreatePasswordController.this.executor;
            if (executor == null) {
                l0.S("executor");
                executor = null;
            }
            final CredentialProviderCreatePasswordController credentialProviderCreatePasswordController = CredentialProviderCreatePasswordController.this;
            executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.CreatePassword.c
                @Override // java.lang.Runnable
                public final void run() {
                    CredentialProviderCreatePasswordController.e.c(CredentialProviderCreatePasswordController.this);
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
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.credentials.playservices.controllers.CreatePassword.CredentialProviderCreatePasswordController$resultReceiver$1] */
    public CredentialProviderCreatePasswordController(@l Context context) {
        super(context);
        l0.p(context, "context");
        this.context = context;
        final Handler handler = new Handler(Looper.getMainLooper());
        this.resultReceiver = new ResultReceiver(handler) { // from class: androidx.credentials.playservices.controllers.CreatePassword.CredentialProviderCreatePasswordController$resultReceiver$1

            /* compiled from: CredentialProviderCreatePasswordController.kt */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            /* synthetic */ class a extends h0 implements p<String, String, CreateCredentialException> {
                a(Object obj) {
                    super(2, obj, a.Companion.class, "createCredentialExceptionTypeToException", "createCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/CreateCredentialException;", 0);
                }

                @Override // ld.p
                @l
                /* renamed from: Z, reason: merged with bridge method [inline-methods] */
                public final CreateCredentialException invoke(@fg.m String str, @fg.m String str2) {
                    return ((a.Companion) this.receiver).a(str, str2);
                }
            }

            @Override // android.os.ResultReceiver
            public void onReceiveResult(int resultCode, @l Bundle resultData) {
                Executor executor;
                m mVar;
                CancellationSignal cancellationSignal;
                boolean j4;
                l0.p(resultData, "resultData");
                CredentialProviderCreatePasswordController credentialProviderCreatePasswordController = CredentialProviderCreatePasswordController.this;
                a aVar = new a(androidx.credentials.playservices.controllers.a.INSTANCE);
                Executor executor2 = CredentialProviderCreatePasswordController.this.executor;
                if (executor2 == null) {
                    l0.S("executor");
                    executor = null;
                } else {
                    executor = executor2;
                }
                m mVar2 = CredentialProviderCreatePasswordController.this.callback;
                if (mVar2 == null) {
                    l0.S("callback");
                    mVar = null;
                } else {
                    mVar = mVar2;
                }
                cancellationSignal = CredentialProviderCreatePasswordController.this.cancellationSignal;
                j4 = credentialProviderCreatePasswordController.j(resultData, aVar, executor, mVar, cancellationSignal);
                if (j4) {
                    return;
                }
                CredentialProviderCreatePasswordController.this.w(resultData.getInt("ACTIVITY_REQUEST_CODE"), resultCode);
            }
        };
    }

    @m1(otherwise = 2)
    private static /* synthetic */ void t() {
    }

    @m1(otherwise = 2)
    private static /* synthetic */ void u() {
    }

    @l
    @n
    public static final CredentialProviderCreatePasswordController v(@l Context context) {
        return INSTANCE.a(context);
    }

    @Override // androidx.credentials.playservices.controllers.b
    @l
    @m1(otherwise = 4)
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public SavePasswordRequest g(@l f request) {
        l0.p(request, "request");
        SavePasswordRequest build = SavePasswordRequest.builder().setSignInPassword(new SignInPassword(request.getId(), request.getPassword())).build();
        l0.o(build, "builder()\n            .s…rd))\n            .build()");
        return build;
    }

    @Override // androidx.credentials.playservices.controllers.b
    @l
    @m1(otherwise = 4)
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public androidx.credentials.c h(@l k2 response) {
        l0.p(response, "response");
        return new g();
    }

    public final void w(int uniqueRequestCode, int resultCode) {
        if (uniqueRequestCode != androidx.credentials.playservices.controllers.a.d()) {
            androidx.credentials.playservices.controllers.a.d();
        } else {
            if (androidx.credentials.playservices.controllers.b.k(resultCode, b.f27828b, new c(), this.cancellationSignal)) {
                return;
            }
            androidx.credentials.playservices.controllers.b.f(this.cancellationSignal, new d(h(k2.f75408a)));
        }
    }

    @Override // androidx.credentials.playservices.controllers.b
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void i(@l f request, @l m<androidx.credentials.c, CreateCredentialException> callback, @l Executor executor, @fg.m CancellationSignal cancellationSignal) {
        l0.p(request, "request");
        l0.p(callback, "callback");
        l0.p(executor, "executor");
        this.cancellationSignal = cancellationSignal;
        this.callback = callback;
        this.executor = executor;
        if (CredentialProviderPlayServicesImpl.INSTANCE.a(cancellationSignal)) {
            return;
        }
        SavePasswordRequest g4 = g(request);
        Intent intent = new Intent(this.context, (Class<?>) HiddenActivity.class);
        intent.putExtra("REQUEST_TYPE", g4);
        c(this.resultReceiver, intent, "CREATE_PASSWORD");
        try {
            this.context.startActivity(intent);
        } catch (Exception unused) {
            androidx.credentials.playservices.controllers.b.f(cancellationSignal, new e());
        }
    }
}
