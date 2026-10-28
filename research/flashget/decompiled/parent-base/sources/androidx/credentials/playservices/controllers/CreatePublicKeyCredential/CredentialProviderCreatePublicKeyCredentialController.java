package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

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
import androidx.credentials.exceptions.publickeycredential.CreatePublicKeyCredentialDomException;
import androidx.credentials.m;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.HiddenActivity;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController;
import androidx.credentials.playservices.controllers.a;
import androidx.credentials.playservices.controllers.b;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import h1.b0;
import java.util.concurrent.Executor;
import kd.n;
import kotlin.Metadata;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.w;
import kotlin.k2;
import ld.p;
import org.json.JSONException;

/* compiled from: CredentialProviderCreatePublicKeyCredentialController.kt */
@Metadata(d1 = {"\u0000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\b\u0007*\u00010\b\u0000\u0018\u0000 42 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001:\u00015B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ=\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u00022\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0000¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0002H\u0017¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u0004H\u0017¢\u0006\u0004\b$\u0010%R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010&R(\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00118\u0002@\u0002X\u0083.¢\u0006\f\n\u0004\b'\u0010(\u0012\u0004\b)\u0010*R\u001c\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0083.¢\u0006\f\n\u0004\b\u0018\u0010+\u0012\u0004\b,\u0010*R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b-\u0010.\u0012\u0004\b/\u0010*R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00066"}, d2 = {"Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController;", "Landroidx/credentials/playservices/controllers/b;", "Landroidx/credentials/h;", "Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions;", "Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredential;", "Landroidx/credentials/c;", "Landroidx/credentials/exceptions/CreateCredentialException;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lorg/json/JSONException;", "exception", "Landroidx/credentials/exceptions/publickeycredential/CreatePublicKeyCredentialDomException;", "n", "(Lorg/json/JSONException;)Landroidx/credentials/exceptions/publickeycredential/CreatePublicKeyCredentialDomException;", "request", "Landroidx/credentials/m;", "callback", "Ljava/util/concurrent/Executor;", "executor", "Landroid/os/CancellationSignal;", "cancellationSignal", "Lkotlin/k2;", "C", "(Landroidx/credentials/h;Landroidx/credentials/m;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V", "", "uniqueRequestCode", "resultCode", "Landroid/content/Intent;", "data", "A", "(IILandroid/content/Intent;)V", "u", "(Landroidx/credentials/h;)Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions;", "response", "v", "(Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredential;)Landroidx/credentials/c;", "Landroid/content/Context;", "B", "Landroidx/credentials/m;", "w", "()V", "Ljava/util/concurrent/Executor;", "y", "D", "Landroid/os/CancellationSignal;", "x", "androidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1", "E", "Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1;", "resultReceiver", "F", "a", "credentials-play-services-auth_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CredentialProviderCreatePublicKeyCredentialController extends androidx.credentials.playservices.controllers.b<androidx.credentials.h, PublicKeyCredentialCreationOptions, PublicKeyCredential, androidx.credentials.c, CreateCredentialException> {

    /* renamed from: A, reason: from kotlin metadata */
    @fg.l
    private final Context context;

    /* renamed from: B, reason: from kotlin metadata */
    private m<androidx.credentials.c, CreateCredentialException> callback;

    /* renamed from: C, reason: from kotlin metadata */
    private Executor executor;

    /* renamed from: D, reason: from kotlin metadata */
    @fg.m
    private CancellationSignal cancellationSignal;

    /* renamed from: E, reason: from kotlin metadata */
    @fg.l
    private final CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1 resultReceiver;

    @fg.l
    private static final String G = "CreatePublicKey";

    /* renamed from: F, reason: from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* compiled from: CredentialProviderCreatePublicKeyCredentialController.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController;", "a", "(Landroid/content/Context;)Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController;", "", "TAG", "Ljava/lang/String;", "credentials-play-services-auth_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        @n
        public final CredentialProviderCreatePublicKeyCredentialController a(@fg.l Context context) {
            l0.p(context, "context");
            return new CredentialProviderCreatePublicKeyCredentialController(context);
        }

        public Companion(w wVar) {
        }
    }

    /* compiled from: CredentialProviderCreatePublicKeyCredentialController.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/os/CancellationSignal;", "s", "Lkotlin/Function0;", "Lkotlin/k2;", "f", "a", "(Landroid/os/CancellationSignal;Lld/a;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends n0 implements p<CancellationSignal, ld.a<? extends k2>, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f27839b = new b(2);

        b() {
            super(2);
        }

        public final void a(@fg.m CancellationSignal cancellationSignal, @fg.l ld.a<k2> f4) {
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

    /* compiled from: CredentialProviderCreatePublicKeyCredentialController.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/credentials/exceptions/CreateCredentialException;", "e", "Lkotlin/k2;", "b", "(Landroidx/credentials/exceptions/CreateCredentialException;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends n0 implements ld.l<CreateCredentialException, k2> {
        c() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(CredentialProviderCreatePublicKeyCredentialController this$0, CreateCredentialException e4) {
            l0.p(this$0, "this$0");
            l0.p(e4, "$e");
            m mVar = this$0.callback;
            if (mVar == null) {
                l0.S("callback");
                mVar = null;
            }
            mVar.a(e4);
        }

        public final void b(@fg.l final CreateCredentialException e4) {
            l0.p(e4, "e");
            Executor executor = CredentialProviderCreatePublicKeyCredentialController.this.executor;
            if (executor == null) {
                l0.S("executor");
                executor = null;
            }
            final CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = CredentialProviderCreatePublicKeyCredentialController.this;
            executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.c
                @Override // java.lang.Runnable
                public final void run() {
                    CredentialProviderCreatePublicKeyCredentialController.c.c(CredentialProviderCreatePublicKeyCredentialController.this, e4);
                }
            });
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(CreateCredentialException createCredentialException) {
            b(createCredentialException);
            return k2.f75408a;
        }
    }

    /* compiled from: CredentialProviderCreatePublicKeyCredentialController.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class d extends n0 implements ld.a<k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ CreateCredentialException f27842c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(CreateCredentialException createCredentialException) {
            super(0);
            this.f27842c = createCredentialException;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(CredentialProviderCreatePublicKeyCredentialController this$0, CreateCredentialException createCredentialException) {
            l0.p(this$0, "this$0");
            m mVar = this$0.callback;
            if (mVar == null) {
                l0.S("callback");
                mVar = null;
            }
            mVar.a(createCredentialException);
        }

        public final void b() {
            Executor executor = CredentialProviderCreatePublicKeyCredentialController.this.executor;
            if (executor == null) {
                l0.S("executor");
                executor = null;
            }
            final CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = CredentialProviderCreatePublicKeyCredentialController.this;
            final CreateCredentialException createCredentialException = this.f27842c;
            executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.d
                @Override // java.lang.Runnable
                public final void run() {
                    CredentialProviderCreatePublicKeyCredentialController.d.c(CredentialProviderCreatePublicKeyCredentialController.this, createCredentialException);
                }
            });
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ k2 invoke() {
            b();
            return k2.f75408a;
        }
    }

    /* compiled from: CredentialProviderCreatePublicKeyCredentialController.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class e extends n0 implements ld.a<k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.credentials.c f27844c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(androidx.credentials.c cVar) {
            super(0);
            this.f27844c = cVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(CredentialProviderCreatePublicKeyCredentialController this$0, androidx.credentials.c response) {
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
            Executor executor = CredentialProviderCreatePublicKeyCredentialController.this.executor;
            if (executor == null) {
                l0.S("executor");
                executor = null;
            }
            final CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = CredentialProviderCreatePublicKeyCredentialController.this;
            final androidx.credentials.c cVar = this.f27844c;
            executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.e
                @Override // java.lang.Runnable
                public final void run() {
                    CredentialProviderCreatePublicKeyCredentialController.e.c(CredentialProviderCreatePublicKeyCredentialController.this, cVar);
                }
            });
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ k2 invoke() {
            b();
            return k2.f75408a;
        }
    }

    /* compiled from: CredentialProviderCreatePublicKeyCredentialController.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class f extends n0 implements ld.a<k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ JSONException f27846c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(JSONException jSONException) {
            super(0);
            this.f27846c = jSONException;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(CredentialProviderCreatePublicKeyCredentialController this$0, JSONException e4) {
            l0.p(this$0, "this$0");
            l0.p(e4, "$e");
            m mVar = this$0.callback;
            if (mVar == null) {
                l0.S("callback");
                mVar = null;
            }
            mVar.a(new CreatePublicKeyCredentialDomException(new h1.f(), e4.getMessage()));
        }

        public final void b() {
            Executor executor = CredentialProviderCreatePublicKeyCredentialController.this.executor;
            if (executor == null) {
                l0.S("executor");
                executor = null;
            }
            final CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = CredentialProviderCreatePublicKeyCredentialController.this;
            final JSONException jSONException = this.f27846c;
            executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.f
                @Override // java.lang.Runnable
                public final void run() {
                    CredentialProviderCreatePublicKeyCredentialController.f.c(CredentialProviderCreatePublicKeyCredentialController.this, jSONException);
                }
            });
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ k2 invoke() {
            b();
            return k2.f75408a;
        }
    }

    /* compiled from: CredentialProviderCreatePublicKeyCredentialController.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class g extends n0 implements ld.a<k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Throwable f27848c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Throwable th) {
            super(0);
            this.f27848c = th;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(CredentialProviderCreatePublicKeyCredentialController this$0, Throwable t4) {
            l0.p(this$0, "this$0");
            l0.p(t4, "$t");
            m mVar = this$0.callback;
            if (mVar == null) {
                l0.S("callback");
                mVar = null;
            }
            mVar.a(new CreatePublicKeyCredentialDomException(new b0(), t4.getMessage()));
        }

        public final void b() {
            Executor executor = CredentialProviderCreatePublicKeyCredentialController.this.executor;
            if (executor == null) {
                l0.S("executor");
                executor = null;
            }
            final CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = CredentialProviderCreatePublicKeyCredentialController.this;
            final Throwable th = this.f27848c;
            executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.g
                @Override // java.lang.Runnable
                public final void run() {
                    CredentialProviderCreatePublicKeyCredentialController.g.c(CredentialProviderCreatePublicKeyCredentialController.this, th);
                }
            });
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ k2 invoke() {
            b();
            return k2.f75408a;
        }
    }

    /* compiled from: CredentialProviderCreatePublicKeyCredentialController.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class h extends n0 implements ld.a<k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ JSONException f27850c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(JSONException jSONException) {
            super(0);
            this.f27850c = jSONException;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(CredentialProviderCreatePublicKeyCredentialController this$0, JSONException e4) {
            l0.p(this$0, "this$0");
            l0.p(e4, "$e");
            m mVar = this$0.callback;
            if (mVar == null) {
                l0.S("callback");
                mVar = null;
            }
            mVar.a(this$0.n(e4));
        }

        public final void b() {
            Executor executor = CredentialProviderCreatePublicKeyCredentialController.this.executor;
            if (executor == null) {
                l0.S("executor");
                executor = null;
            }
            final CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = CredentialProviderCreatePublicKeyCredentialController.this;
            final JSONException jSONException = this.f27850c;
            executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.h
                @Override // java.lang.Runnable
                public final void run() {
                    CredentialProviderCreatePublicKeyCredentialController.h.c(CredentialProviderCreatePublicKeyCredentialController.this, jSONException);
                }
            });
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ k2 invoke() {
            b();
            return k2.f75408a;
        }
    }

    /* compiled from: CredentialProviderCreatePublicKeyCredentialController.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class i extends n0 implements ld.a<k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Throwable f27852c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(Throwable th) {
            super(0);
            this.f27852c = th;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(CredentialProviderCreatePublicKeyCredentialController this$0, Throwable t4) {
            l0.p(this$0, "this$0");
            l0.p(t4, "$t");
            m mVar = this$0.callback;
            if (mVar == null) {
                l0.S("callback");
                mVar = null;
            }
            mVar.a(new CreateCredentialUnknownException(t4.getMessage()));
        }

        public final void b() {
            Executor executor = CredentialProviderCreatePublicKeyCredentialController.this.executor;
            if (executor == null) {
                l0.S("executor");
                executor = null;
            }
            final CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = CredentialProviderCreatePublicKeyCredentialController.this;
            final Throwable th = this.f27852c;
            executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.i
                @Override // java.lang.Runnable
                public final void run() {
                    CredentialProviderCreatePublicKeyCredentialController.i.c(CredentialProviderCreatePublicKeyCredentialController.this, th);
                }
            });
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ k2 invoke() {
            b();
            return k2.f75408a;
        }
    }

    /* compiled from: CredentialProviderCreatePublicKeyCredentialController.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class j extends n0 implements ld.a<k2> {
        j() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(CredentialProviderCreatePublicKeyCredentialController this$0) {
            l0.p(this$0, "this$0");
            m mVar = this$0.callback;
            if (mVar == null) {
                l0.S("callback");
                mVar = null;
            }
            mVar.a(new CreateCredentialUnknownException("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context."));
        }

        public final void b() {
            Executor executor = CredentialProviderCreatePublicKeyCredentialController.this.executor;
            if (executor == null) {
                l0.S("executor");
                executor = null;
            }
            final CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = CredentialProviderCreatePublicKeyCredentialController.this;
            executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.j
                @Override // java.lang.Runnable
                public final void run() {
                    CredentialProviderCreatePublicKeyCredentialController.j.c(CredentialProviderCreatePublicKeyCredentialController.this);
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
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1] */
    public CredentialProviderCreatePublicKeyCredentialController(@fg.l Context context) {
        super(context);
        l0.p(context, "context");
        this.context = context;
        final Handler handler = new Handler(Looper.getMainLooper());
        this.resultReceiver = new ResultReceiver(handler) { // from class: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1

            /* compiled from: CredentialProviderCreatePublicKeyCredentialController.kt */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            /* synthetic */ class a extends h0 implements p<String, String, CreateCredentialException> {
                a(Object obj) {
                    super(2, obj, a.Companion.class, "createCredentialExceptionTypeToException", "createCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/CreateCredentialException;", 0);
                }

                @Override // ld.p
                @fg.l
                /* renamed from: Z, reason: merged with bridge method [inline-methods] */
                public final CreateCredentialException invoke(@fg.m String str, @fg.m String str2) {
                    return ((a.Companion) this.receiver).a(str, str2);
                }
            }

            @Override // android.os.ResultReceiver
            public void onReceiveResult(int resultCode, @fg.l Bundle resultData) {
                Executor executor;
                m mVar;
                CancellationSignal cancellationSignal;
                boolean j4;
                l0.p(resultData, "resultData");
                CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = CredentialProviderCreatePublicKeyCredentialController.this;
                a aVar = new a(androidx.credentials.playservices.controllers.a.INSTANCE);
                Executor executor2 = CredentialProviderCreatePublicKeyCredentialController.this.executor;
                if (executor2 == null) {
                    l0.S("executor");
                    executor = null;
                } else {
                    executor = executor2;
                }
                m mVar2 = CredentialProviderCreatePublicKeyCredentialController.this.callback;
                if (mVar2 == null) {
                    l0.S("callback");
                    mVar = null;
                } else {
                    mVar = mVar2;
                }
                cancellationSignal = CredentialProviderCreatePublicKeyCredentialController.this.cancellationSignal;
                j4 = credentialProviderCreatePublicKeyCredentialController.j(resultData, aVar, executor, mVar, cancellationSignal);
                if (j4) {
                    return;
                }
                CredentialProviderCreatePublicKeyCredentialController.this.A(resultData.getInt("ACTIVITY_REQUEST_CODE"), resultCode, (Intent) resultData.getParcelable("RESULT_DATA"));
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(CredentialProviderCreatePublicKeyCredentialController this$0) {
        l0.p(this$0, "this$0");
        m<androidx.credentials.c, CreateCredentialException> mVar = this$0.callback;
        if (mVar == null) {
            l0.S("callback");
            mVar = null;
        }
        mVar.a(new CreatePublicKeyCredentialDomException(new b0(), "Upon handling create public key credential response, fido module giving null bytes indicating internal error"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CreatePublicKeyCredentialDomException n(JSONException exception) {
        String message = exception.getMessage();
        return (message == null || message.length() <= 0) ? new CreatePublicKeyCredentialDomException(new h1.f(), "Unknown error") : new CreatePublicKeyCredentialDomException(new h1.f(), message);
    }

    @m1(otherwise = 2)
    private static /* synthetic */ void w() {
    }

    @m1(otherwise = 2)
    private static /* synthetic */ void x() {
    }

    @m1(otherwise = 2)
    private static /* synthetic */ void y() {
    }

    @fg.l
    @n
    public static final CredentialProviderCreatePublicKeyCredentialController z(@fg.l Context context) {
        return INSTANCE.a(context);
    }

    public final void A(int uniqueRequestCode, int resultCode, @fg.m Intent data) {
        if (uniqueRequestCode != androidx.credentials.playservices.controllers.a.d()) {
            androidx.credentials.playservices.controllers.a.d();
            return;
        }
        if (androidx.credentials.playservices.controllers.b.k(resultCode, b.f27839b, new c(), this.cancellationSignal)) {
            return;
        }
        Executor executor = null;
        byte[] byteArrayExtra = data != null ? data.getByteArrayExtra("FIDO2_CREDENTIAL_EXTRA") : null;
        if (byteArrayExtra == null) {
            if (CredentialProviderPlayServicesImpl.INSTANCE.a(this.cancellationSignal)) {
                return;
            }
            Executor executor2 = this.executor;
            if (executor2 == null) {
                l0.S("executor");
            } else {
                executor = executor2;
            }
            executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.a
                @Override // java.lang.Runnable
                public final void run() {
                    CredentialProviderCreatePublicKeyCredentialController.B(CredentialProviderCreatePublicKeyCredentialController.this);
                }
            });
            return;
        }
        PublicKeyCredential deserializeFromBytes = PublicKeyCredential.deserializeFromBytes(byteArrayExtra);
        l0.o(deserializeFromBytes, "deserializeFromBytes(bytes)");
        CreateCredentialException b02 = k.INSTANCE.b0(deserializeFromBytes);
        if (b02 != null) {
            androidx.credentials.playservices.controllers.b.f(this.cancellationSignal, new d(b02));
            return;
        }
        try {
            androidx.credentials.playservices.controllers.b.f(this.cancellationSignal, new e(h(deserializeFromBytes)));
        } catch (JSONException e4) {
            androidx.credentials.playservices.controllers.b.f(this.cancellationSignal, new f(e4));
        } catch (Throwable th) {
            androidx.credentials.playservices.controllers.b.f(this.cancellationSignal, new g(th));
        }
    }

    @Override // androidx.credentials.playservices.controllers.b
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public void i(@fg.l androidx.credentials.h request, @fg.l m<androidx.credentials.c, CreateCredentialException> callback, @fg.l Executor executor, @fg.m CancellationSignal cancellationSignal) {
        l0.p(request, "request");
        l0.p(callback, "callback");
        l0.p(executor, "executor");
        this.cancellationSignal = cancellationSignal;
        this.callback = callback;
        this.executor = executor;
        try {
            PublicKeyCredentialCreationOptions g4 = g(request);
            if (CredentialProviderPlayServicesImpl.INSTANCE.a(cancellationSignal)) {
                return;
            }
            Intent intent = new Intent(this.context, (Class<?>) HiddenActivity.class);
            intent.putExtra("REQUEST_TYPE", g4);
            c(this.resultReceiver, intent, "CREATE_PUBLIC_KEY_CREDENTIAL");
            try {
                this.context.startActivity(intent);
            } catch (Exception unused) {
                androidx.credentials.playservices.controllers.b.f(cancellationSignal, new j());
            }
        } catch (JSONException e4) {
            androidx.credentials.playservices.controllers.b.f(cancellationSignal, new h(e4));
        } catch (Throwable th) {
            androidx.credentials.playservices.controllers.b.f(cancellationSignal, new i(th));
        }
    }

    @Override // androidx.credentials.playservices.controllers.b
    @fg.l
    @m1(otherwise = 4)
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public PublicKeyCredentialCreationOptions g(@fg.l androidx.credentials.h request) {
        l0.p(request, "request");
        return k.INSTANCE.f(request, this.context);
    }

    @Override // androidx.credentials.playservices.controllers.b
    @fg.l
    @m1(otherwise = 4)
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public androidx.credentials.c h(@fg.l PublicKeyCredential response) {
        l0.p(response, "response");
        try {
            String json = response.toJson();
            l0.o(json, "response.toJson()");
            return new androidx.credentials.i(json);
        } catch (Throwable th) {
            throw new CreateCredentialUnknownException(androidx.credentials.playservices.controllers.CreatePublicKeyCredential.b.a(th, new StringBuilder("The PublicKeyCredential response json had an unexpected exception when parsing: ")));
        }
    }
}
