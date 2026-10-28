package androidx.credentials.playservices;

import android.content.Context;
import android.os.CancellationSignal;
import androidx.annotation.c1;
import androidx.annotation.m1;
import androidx.credentials.exceptions.ClearCredentialException;
import androidx.credentials.exceptions.ClearCredentialUnknownException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.h1;
import androidx.credentials.i1;
import androidx.credentials.o;
import androidx.credentials.p;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController;
import androidx.credentials.playservices.controllers.CreatePassword.CredentialProviderCreatePasswordController;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController;
import androidx.credentials.playservices.controllers.GetSignInIntent.CredentialProviderGetSignInIntentController;
import com.google.android.gms.auth.api.identity.Identity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import fg.m;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.w;
import kotlin.k2;

/* compiled from: CredentialProviderPlayServicesImpl.kt */
@c1({c1.a.LIBRARY})
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 -2\u00020\u0001:\u0001.B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJE\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015JE\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00162\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u000fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ?\u0010!\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u001e2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0014\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\u0004\u0012\u00020 0\u000fH\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#R(\u0010%\u001a\u00020$8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b%\u0010&\u0012\u0004\b+\u0010,\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006/"}, d2 = {"Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;", "Landroidx/credentials/p;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "isGooglePlayServicesAvailable", "(Landroid/content/Context;)I", "Landroidx/credentials/h1;", "request", "Landroid/os/CancellationSignal;", "cancellationSignal", "Ljava/util/concurrent/Executor;", "executor", "Landroidx/credentials/m;", "Landroidx/credentials/i1;", "Landroidx/credentials/exceptions/GetCredentialException;", "callback", "Lkotlin/k2;", "onGetCredential", "(Landroid/content/Context;Landroidx/credentials/h1;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Landroidx/credentials/m;)V", "Landroidx/credentials/b;", "Landroidx/credentials/c;", "Landroidx/credentials/exceptions/CreateCredentialException;", "onCreateCredential", "(Landroid/content/Context;Landroidx/credentials/b;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Landroidx/credentials/m;)V", "", "isAvailableOnDevice", "()Z", "Landroidx/credentials/a;", "Ljava/lang/Void;", "Landroidx/credentials/exceptions/ClearCredentialException;", "onClearCredential", "(Landroidx/credentials/a;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Landroidx/credentials/m;)V", "Landroid/content/Context;", "Lcom/google/android/gms/common/GoogleApiAvailability;", "googleApiAvailability", "Lcom/google/android/gms/common/GoogleApiAvailability;", "getGoogleApiAvailability", "()Lcom/google/android/gms/common/GoogleApiAvailability;", "setGoogleApiAvailability", "(Lcom/google/android/gms/common/GoogleApiAvailability;)V", "getGoogleApiAvailability$annotations", "()V", "Companion", "a", "credentials-play-services-auth_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CredentialProviderPlayServicesImpl implements p {

    @c1({c1.a.LIBRARY_GROUP})
    public static final int MIN_GMS_APK_VERSION = 230815045;

    @fg.l
    private final Context context;

    @fg.l
    private GoogleApiAvailability googleApiAvailability;

    @fg.l
    private static final String TAG = "PlayServicesImpl";

    /* renamed from: Companion, reason: from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* compiled from: CredentialProviderPlayServicesImpl.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl$a;", "", "<init>", "()V", "Landroid/os/CancellationSignal;", "cancellationSignal", "Lkotlin/Function0;", "Lkotlin/k2;", "callback", "b", "(Landroid/os/CancellationSignal;Lld/a;)V", "", "a", "(Landroid/os/CancellationSignal;)Z", "Landroidx/credentials/h1;", "request", "c", "(Landroidx/credentials/h1;)Z", "", "MIN_GMS_APK_VERSION", "I", "", "TAG", "Ljava/lang/String;", "credentials-play-services-auth_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final boolean a(@m CancellationSignal cancellationSignal) {
            return cancellationSignal != null && cancellationSignal.isCanceled();
        }

        public final void b(@m CancellationSignal cancellationSignal, @fg.l ld.a<k2> callback) {
            l0.p(callback, "callback");
            if (a(cancellationSignal)) {
                return;
            }
            callback.invoke();
        }

        public final boolean c(@fg.l h1 request) {
            l0.p(request, "request");
            Iterator<o> it = request.b().iterator();
            while (it.hasNext()) {
                if (it.next() instanceof r8.b) {
                    return true;
                }
            }
            return false;
        }

        public Companion(w wVar) {
        }
    }

    /* compiled from: CredentialProviderPlayServicesImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/lang/Void;", "kotlin.jvm.PlatformType", "it", "Lkotlin/k2;", "a", "(Ljava/lang/Void;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends n0 implements ld.l<Void, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CancellationSignal f27773b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Executor f27774c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.credentials.m<Void, ClearCredentialException> f27775d;

        /* compiled from: CredentialProviderPlayServicesImpl.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "b", "()V"}, k = 3, mv = {1, 8, 0})
        static final class a extends n0 implements ld.a<k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Executor f27776b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.credentials.m<Void, ClearCredentialException> f27777c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Executor executor, androidx.credentials.m<Void, ClearCredentialException> mVar) {
                super(0);
                this.f27776b = executor;
                this.f27777c = mVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void c(androidx.credentials.m callback) {
                l0.p(callback, "$callback");
                callback.onResult(null);
            }

            public final void b() {
                Executor executor = this.f27776b;
                final androidx.credentials.m<Void, ClearCredentialException> mVar = this.f27777c;
                executor.execute(new Runnable() { // from class: androidx.credentials.playservices.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        CredentialProviderPlayServicesImpl.b.a.c(androidx.credentials.m.this);
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
        b(CancellationSignal cancellationSignal, Executor executor, androidx.credentials.m<Void, ClearCredentialException> mVar) {
            super(1);
            this.f27773b = cancellationSignal;
            this.f27774c = executor;
            this.f27775d = mVar;
        }

        public final void a(Void r5) {
            CredentialProviderPlayServicesImpl.INSTANCE.b(this.f27773b, new a(this.f27774c, this.f27775d));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(Void r12) {
            a(r12);
            return k2.f75408a;
        }
    }

    /* compiled from: CredentialProviderPlayServicesImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class c extends n0 implements ld.a<k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Exception f27778b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Executor f27779c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.credentials.m<Void, ClearCredentialException> f27780d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Exception exc, Executor executor, androidx.credentials.m<Void, ClearCredentialException> mVar) {
            super(0);
            this.f27778b = exc;
            this.f27779c = executor;
            this.f27780d = mVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(androidx.credentials.m callback, Exception e4) {
            l0.p(callback, "$callback");
            l0.p(e4, "$e");
            callback.a(new ClearCredentialUnknownException(e4.getMessage()));
        }

        public final void b() {
            Objects.toString(this.f27778b);
            Executor executor = this.f27779c;
            final androidx.credentials.m<Void, ClearCredentialException> mVar = this.f27780d;
            final Exception exc = this.f27778b;
            executor.execute(new Runnable() { // from class: androidx.credentials.playservices.d
                @Override // java.lang.Runnable
                public final void run() {
                    CredentialProviderPlayServicesImpl.c.c(androidx.credentials.m.this, exc);
                }
            });
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ k2 invoke() {
            b();
            return k2.f75408a;
        }
    }

    public CredentialProviderPlayServicesImpl(@fg.l Context context) {
        l0.p(context, "context");
        this.context = context;
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        l0.o(googleApiAvailability, "getInstance()");
        this.googleApiAvailability = googleApiAvailability;
    }

    @m1
    public static /* synthetic */ void getGoogleApiAvailability$annotations() {
    }

    private final int isGooglePlayServicesAvailable(Context context) {
        return this.googleApiAvailability.isGooglePlayServicesAvailable(context, MIN_GMS_APK_VERSION);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$0(ld.l tmp0, Object obj) {
        l0.p(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$2(CredentialProviderPlayServicesImpl this$0, CancellationSignal cancellationSignal, Executor executor, androidx.credentials.m callback, Exception e4) {
        l0.p(this$0, "this$0");
        l0.p(executor, "$executor");
        l0.p(callback, "$callback");
        l0.p(e4, "e");
        INSTANCE.b(cancellationSignal, new c(e4, executor, callback));
    }

    @fg.l
    public final GoogleApiAvailability getGoogleApiAvailability() {
        return this.googleApiAvailability;
    }

    @Override // androidx.credentials.p
    public boolean isAvailableOnDevice() {
        int isGooglePlayServicesAvailable = isGooglePlayServicesAvailable(this.context);
        boolean z4 = isGooglePlayServicesAvailable == 0;
        if (!z4) {
            new ConnectionResult(isGooglePlayServicesAvailable).toString();
        }
        return z4;
    }

    @Override // androidx.credentials.p
    public void onClearCredential(@fg.l androidx.credentials.a request, @m final CancellationSignal cancellationSignal, @fg.l final Executor executor, @fg.l final androidx.credentials.m<Void, ClearCredentialException> callback) {
        l0.p(request, "request");
        l0.p(executor, "executor");
        l0.p(callback, "callback");
        if (INSTANCE.a(cancellationSignal)) {
            return;
        }
        Task<Void> signOut = Identity.getSignInClient(this.context).signOut();
        final b bVar = new b(cancellationSignal, executor, callback);
        signOut.addOnSuccessListener(new OnSuccessListener() { // from class: androidx.credentials.playservices.a
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$0(ld.l.this, obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: androidx.credentials.playservices.b
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$2(CredentialProviderPlayServicesImpl.this, cancellationSignal, executor, callback, exc);
            }
        });
    }

    @Override // androidx.credentials.p
    public void onCreateCredential(@fg.l Context context, @fg.l androidx.credentials.b request, @m CancellationSignal cancellationSignal, @fg.l Executor executor, @fg.l androidx.credentials.m<androidx.credentials.c, CreateCredentialException> callback) {
        l0.p(context, "context");
        l0.p(request, "request");
        l0.p(executor, "executor");
        l0.p(callback, "callback");
        if (INSTANCE.a(cancellationSignal)) {
            return;
        }
        if (request instanceof androidx.credentials.f) {
            CredentialProviderCreatePasswordController.INSTANCE.a(context).i((androidx.credentials.f) request, callback, executor, cancellationSignal);
        } else {
            if (!(request instanceof androidx.credentials.h)) {
                throw new UnsupportedOperationException("Create Credential request is unsupported, not password or publickeycredential");
            }
            CredentialProviderCreatePublicKeyCredentialController.INSTANCE.a(context).i((androidx.credentials.h) request, callback, executor, cancellationSignal);
        }
    }

    @Override // androidx.credentials.p
    public void onGetCredential(@fg.l Context context, @fg.l h1 request, @m CancellationSignal cancellationSignal, @fg.l Executor executor, @fg.l androidx.credentials.m<i1, GetCredentialException> callback) {
        l0.p(context, "context");
        l0.p(request, "request");
        l0.p(executor, "executor");
        l0.p(callback, "callback");
        Companion companion = INSTANCE;
        if (companion.a(cancellationSignal)) {
            return;
        }
        if (companion.c(request)) {
            new CredentialProviderGetSignInIntentController(context).i(request, callback, executor, cancellationSignal);
        } else {
            new CredentialProviderBeginSignInController(context).i(request, callback, executor, cancellationSignal);
        }
    }

    public final void setGoogleApiAvailability(@fg.l GoogleApiAvailability googleApiAvailability) {
        l0.p(googleApiAvailability, "<set-?>");
        this.googleApiAvailability = googleApiAvailability;
    }
}
