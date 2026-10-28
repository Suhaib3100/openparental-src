package androidx.credentials.playservices;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.annotation.c1;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.auth.api.identity.Identity;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.auth.api.identity.SavePasswordResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.fido.Fido;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.k2;

/* compiled from: HiddenActivity.kt */
@c1({c1.a.LIBRARY})
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0017\u0018\u0000 $2\u00020\u0001:\u0001%B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J'\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0003J\u0019\u0010\u0014\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0014\u0010\bJ\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0016\u0010\bJ)\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006&"}, d2 = {"Landroidx/credentials/playservices/HiddenActivity;", "Landroid/app/Activity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/k2;", "x", "(Landroid/os/Bundle;)V", "r", "Landroid/os/ResultReceiver;", "resultReceiver", "", "errName", "errMsg", "y", "(Landroid/os/ResultReceiver;Ljava/lang/String;Ljava/lang/String;)V", "u", "l", "o", "onCreate", "outState", "onSaveInstanceState", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "b", "Landroid/os/ResultReceiver;", "", "c", "Z", "mWaitingForActivityResult", "d", "a", "credentials-play-services-auth_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public class HiddenActivity extends Activity {

    /* renamed from: e, reason: collision with root package name */
    private static final int f27782e = 1;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @m
    private ResultReceiver resultReceiver;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean mWaitingForActivityResult;

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    private static final String f27783f = "HiddenActivity";

    /* renamed from: g, reason: collision with root package name */
    @fg.l
    private static final String f27784g = "androidx.credentials.playservices.AWAITING_RESULT";

    /* compiled from: HiddenActivity.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/android/gms/auth/api/identity/BeginSignInResult;", "kotlin.jvm.PlatformType", "it", "Lkotlin/k2;", "a", "(Lcom/google/android/gms/auth/api/identity/BeginSignInResult;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends n0 implements ld.l<BeginSignInResult, k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f27788c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i4) {
            super(1);
            this.f27788c = i4;
        }

        public final void a(BeginSignInResult beginSignInResult) {
            try {
                HiddenActivity.this.mWaitingForActivityResult = true;
                HiddenActivity.this.startIntentSenderForResult(beginSignInResult.getPendingIntent().getIntentSender(), this.f27788c, null, 0, 0, 0, null);
            } catch (IntentSender.SendIntentException e4) {
                HiddenActivity hiddenActivity = HiddenActivity.this;
                ResultReceiver resultReceiver = hiddenActivity.resultReceiver;
                l0.m(resultReceiver);
                hiddenActivity.y(resultReceiver, "GET_UNKNOWN", "During begin sign in, one tap ui intent sender failure: " + e4.getMessage());
            }
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(BeginSignInResult beginSignInResult) {
            a(beginSignInResult);
            return k2.f75408a;
        }
    }

    /* compiled from: HiddenActivity.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/android/gms/auth/api/identity/SavePasswordResult;", "kotlin.jvm.PlatformType", "it", "Lkotlin/k2;", "a", "(Lcom/google/android/gms/auth/api/identity/SavePasswordResult;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends n0 implements ld.l<SavePasswordResult, k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f27790c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i4) {
            super(1);
            this.f27790c = i4;
        }

        public final void a(SavePasswordResult savePasswordResult) {
            try {
                HiddenActivity.this.mWaitingForActivityResult = true;
                HiddenActivity.this.startIntentSenderForResult(savePasswordResult.getPendingIntent().getIntentSender(), this.f27790c, null, 0, 0, 0, null);
            } catch (IntentSender.SendIntentException e4) {
                HiddenActivity hiddenActivity = HiddenActivity.this;
                ResultReceiver resultReceiver = hiddenActivity.resultReceiver;
                l0.m(resultReceiver);
                hiddenActivity.y(resultReceiver, "CREATE_UNKNOWN", "During save password, found UI intent sender failure: " + e4.getMessage());
            }
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(SavePasswordResult savePasswordResult) {
            a(savePasswordResult);
            return k2.f75408a;
        }
    }

    /* compiled from: HiddenActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/app/PendingIntent;", "result", "Lkotlin/k2;", "a", "(Landroid/app/PendingIntent;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends n0 implements ld.l<PendingIntent, k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f27792c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i4) {
            super(1);
            this.f27792c = i4;
        }

        public final void a(@fg.l PendingIntent result) {
            l0.p(result, "result");
            try {
                HiddenActivity.this.mWaitingForActivityResult = true;
                HiddenActivity.this.startIntentSenderForResult(result.getIntentSender(), this.f27792c, null, 0, 0, 0, null);
            } catch (IntentSender.SendIntentException e4) {
                HiddenActivity hiddenActivity = HiddenActivity.this;
                ResultReceiver resultReceiver = hiddenActivity.resultReceiver;
                l0.m(resultReceiver);
                hiddenActivity.y(resultReceiver, "CREATE_UNKNOWN", "During public key credential, found IntentSender failure on public key creation: " + e4.getMessage());
            }
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(PendingIntent pendingIntent) {
            a(pendingIntent);
            return k2.f75408a;
        }
    }

    /* compiled from: HiddenActivity.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/app/PendingIntent;", "kotlin.jvm.PlatformType", "it", "Lkotlin/k2;", "a", "(Landroid/app/PendingIntent;)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends n0 implements ld.l<PendingIntent, k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f27794c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i4) {
            super(1);
            this.f27794c = i4;
        }

        public final void a(PendingIntent pendingIntent) {
            try {
                HiddenActivity.this.mWaitingForActivityResult = true;
                HiddenActivity.this.startIntentSenderForResult(pendingIntent.getIntentSender(), this.f27794c, null, 0, 0, 0, null);
            } catch (IntentSender.SendIntentException e4) {
                HiddenActivity hiddenActivity = HiddenActivity.this;
                ResultReceiver resultReceiver = hiddenActivity.resultReceiver;
                l0.m(resultReceiver);
                hiddenActivity.y(resultReceiver, "GET_UNKNOWN", "During get sign-in intent, one tap ui intent sender failure: " + e4.getMessage());
            }
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(PendingIntent pendingIntent) {
            a(pendingIntent);
            return k2.f75408a;
        }
    }

    private final void l() {
        Task<BeginSignInResult> task;
        BeginSignInRequest beginSignInRequest = (BeginSignInRequest) getIntent().getParcelableExtra("REQUEST_TYPE");
        int intExtra = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
        if (beginSignInRequest != null) {
            Task<BeginSignInResult> beginSignIn = Identity.getSignInClient((Activity) this).beginSignIn(beginSignInRequest);
            final b bVar = new b(intExtra);
            task = beginSignIn.addOnSuccessListener(new OnSuccessListener() { // from class: androidx.credentials.playservices.k
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    HiddenActivity.m(ld.l.this, obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: androidx.credentials.playservices.l
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    HiddenActivity.n(HiddenActivity.this, exc);
                }
            });
        } else {
            task = null;
        }
        if (task == null) {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(ld.l tmp0, Object obj) {
        l0.p(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(HiddenActivity this$0, Exception e4) {
        String str;
        l0.p(this$0, "this$0");
        l0.p(e4, "e");
        if (e4 instanceof ApiException) {
            androidx.credentials.playservices.controllers.a.INSTANCE.getClass();
            if (androidx.credentials.playservices.controllers.a.f27926c.contains(Integer.valueOf(((ApiException) e4).getStatusCode()))) {
                str = "GET_INTERRUPTED";
                ResultReceiver resultReceiver = this$0.resultReceiver;
                l0.m(resultReceiver);
                this$0.y(resultReceiver, str, "During begin sign in, failure response from one tap: " + e4.getMessage());
            }
        }
        str = "GET_NO_CREDENTIALS";
        ResultReceiver resultReceiver2 = this$0.resultReceiver;
        l0.m(resultReceiver2);
        this$0.y(resultReceiver2, str, "During begin sign in, failure response from one tap: " + e4.getMessage());
    }

    private final void o() {
        Task<SavePasswordResult> task;
        SavePasswordRequest savePasswordRequest = (SavePasswordRequest) getIntent().getParcelableExtra("REQUEST_TYPE");
        int intExtra = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
        if (savePasswordRequest != null) {
            Task<SavePasswordResult> savePassword = Identity.getCredentialSavingClient((Activity) this).savePassword(savePasswordRequest);
            final c cVar = new c(intExtra);
            task = savePassword.addOnSuccessListener(new OnSuccessListener() { // from class: androidx.credentials.playservices.g
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    HiddenActivity.p(ld.l.this, obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: androidx.credentials.playservices.h
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    HiddenActivity.q(HiddenActivity.this, exc);
                }
            });
        } else {
            task = null;
        }
        if (task == null) {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(ld.l tmp0, Object obj) {
        l0.p(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(HiddenActivity this$0, Exception e4) {
        String str;
        l0.p(this$0, "this$0");
        l0.p(e4, "e");
        if (e4 instanceof ApiException) {
            androidx.credentials.playservices.controllers.a.INSTANCE.getClass();
            if (androidx.credentials.playservices.controllers.a.f27926c.contains(Integer.valueOf(((ApiException) e4).getStatusCode()))) {
                str = "CREATE_INTERRUPTED";
                ResultReceiver resultReceiver = this$0.resultReceiver;
                l0.m(resultReceiver);
                this$0.y(resultReceiver, str, "During save password, found password failure response from one tap " + e4.getMessage());
            }
        }
        str = "CREATE_UNKNOWN";
        ResultReceiver resultReceiver2 = this$0.resultReceiver;
        l0.m(resultReceiver2);
        this$0.y(resultReceiver2, str, "During save password, found password failure response from one tap " + e4.getMessage());
    }

    private final void r() {
        Task<PendingIntent> task;
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) getIntent().getParcelableExtra("REQUEST_TYPE");
        int intExtra = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
        if (publicKeyCredentialCreationOptions != null) {
            Task<PendingIntent> registerPendingIntent = Fido.getFido2ApiClient((Activity) this).getRegisterPendingIntent(publicKeyCredentialCreationOptions);
            final d dVar = new d(intExtra);
            task = registerPendingIntent.addOnSuccessListener(new OnSuccessListener() { // from class: androidx.credentials.playservices.e
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    HiddenActivity.s(ld.l.this, obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: androidx.credentials.playservices.f
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    HiddenActivity.t(HiddenActivity.this, exc);
                }
            });
        } else {
            task = null;
        }
        if (task == null) {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(ld.l tmp0, Object obj) {
        l0.p(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(HiddenActivity this$0, Exception e4) {
        String str;
        l0.p(this$0, "this$0");
        l0.p(e4, "e");
        if (e4 instanceof ApiException) {
            androidx.credentials.playservices.controllers.a.INSTANCE.getClass();
            if (androidx.credentials.playservices.controllers.a.f27926c.contains(Integer.valueOf(((ApiException) e4).getStatusCode()))) {
                str = "CREATE_INTERRUPTED";
                ResultReceiver resultReceiver = this$0.resultReceiver;
                l0.m(resultReceiver);
                this$0.y(resultReceiver, str, "During create public key credential, fido registration failure: " + e4.getMessage());
            }
        }
        str = "CREATE_UNKNOWN";
        ResultReceiver resultReceiver2 = this$0.resultReceiver;
        l0.m(resultReceiver2);
        this$0.y(resultReceiver2, str, "During create public key credential, fido registration failure: " + e4.getMessage());
    }

    private final void u() {
        Task<PendingIntent> task;
        GetSignInIntentRequest getSignInIntentRequest = (GetSignInIntentRequest) getIntent().getParcelableExtra("REQUEST_TYPE");
        int intExtra = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
        if (getSignInIntentRequest != null) {
            Task<PendingIntent> signInIntent = Identity.getSignInClient((Activity) this).getSignInIntent(getSignInIntentRequest);
            final e eVar = new e(intExtra);
            task = signInIntent.addOnSuccessListener(new OnSuccessListener() { // from class: androidx.credentials.playservices.i
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    HiddenActivity.v(ld.l.this, obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: androidx.credentials.playservices.j
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    HiddenActivity.w(HiddenActivity.this, exc);
                }
            });
        } else {
            task = null;
        }
        if (task == null) {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(ld.l tmp0, Object obj) {
        l0.p(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(HiddenActivity this$0, Exception e4) {
        String str;
        l0.p(this$0, "this$0");
        l0.p(e4, "e");
        if (e4 instanceof ApiException) {
            androidx.credentials.playservices.controllers.a.INSTANCE.getClass();
            if (androidx.credentials.playservices.controllers.a.f27926c.contains(Integer.valueOf(((ApiException) e4).getStatusCode()))) {
                str = "GET_INTERRUPTED";
                ResultReceiver resultReceiver = this$0.resultReceiver;
                l0.m(resultReceiver);
                this$0.y(resultReceiver, str, "During get sign-in intent, failure response from one tap: " + e4.getMessage());
            }
        }
        str = "GET_NO_CREDENTIALS";
        ResultReceiver resultReceiver2 = this$0.resultReceiver;
        l0.m(resultReceiver2);
        this$0.y(resultReceiver2, str, "During get sign-in intent, failure response from one tap: " + e4.getMessage());
    }

    private final void x(Bundle savedInstanceState) {
        if (savedInstanceState != null) {
            this.mWaitingForActivityResult = savedInstanceState.getBoolean("androidx.credentials.playservices.AWAITING_RESULT", false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(ResultReceiver resultReceiver, String errName, String errMsg) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("FAILURE_RESPONSE", true);
        bundle.putString("EXCEPTION_TYPE", errName);
        bundle.putString("EXCEPTION_MESSAGE", errMsg);
        resultReceiver.send(Integer.MAX_VALUE, bundle);
        finish();
    }

    @Override // android.app.Activity
    protected void onActivityResult(int requestCode, int resultCode, @m Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Bundle bundle = new Bundle();
        bundle.putBoolean("FAILURE_RESPONSE", false);
        bundle.putInt("ACTIVITY_REQUEST_CODE", requestCode);
        bundle.putParcelable("RESULT_DATA", data);
        ResultReceiver resultReceiver = this.resultReceiver;
        if (resultReceiver != null) {
            resultReceiver.send(resultCode, bundle);
        }
        this.mWaitingForActivityResult = false;
        finish();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // android.app.Activity
    protected void onCreate(@m Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(0, 0);
        String stringExtra = getIntent().getStringExtra("TYPE");
        ResultReceiver resultReceiver = (ResultReceiver) getIntent().getParcelableExtra("RESULT_RECEIVER");
        this.resultReceiver = resultReceiver;
        if (resultReceiver == null) {
            finish();
        }
        x(savedInstanceState);
        if (this.mWaitingForActivityResult) {
            return;
        }
        if (stringExtra != null) {
            switch (stringExtra.hashCode()) {
                case -441061071:
                    if (stringExtra.equals("BEGIN_SIGN_IN")) {
                        l();
                        return;
                    }
                    break;
                case 15545322:
                    if (stringExtra.equals("CREATE_PUBLIC_KEY_CREDENTIAL")) {
                        r();
                        return;
                    }
                    break;
                case 1246634622:
                    if (stringExtra.equals("CREATE_PASSWORD")) {
                        o();
                        return;
                    }
                    break;
                case 1980564212:
                    if (stringExtra.equals("SIGN_IN_INTENT")) {
                        u();
                        return;
                    }
                    break;
            }
        }
        finish();
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(@fg.l Bundle outState) {
        l0.p(outState, "outState");
        outState.putBoolean("androidx.credentials.playservices.AWAITING_RESULT", this.mWaitingForActivityResult);
        super.onSaveInstanceState(outState);
    }
}
