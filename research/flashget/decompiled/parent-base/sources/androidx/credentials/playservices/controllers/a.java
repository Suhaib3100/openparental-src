package androidx.credentials.playservices.controllers;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.ResultReceiver;
import androidx.credentials.exceptions.CreateCredentialCancellationException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.CreateCredentialInterruptedException;
import androidx.credentials.exceptions.CreateCredentialUnknownException;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialInterruptedException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.exceptions.NoCredentialException;
import fg.l;
import fg.m;
import java.util.Set;
import kd.n;
import kotlin.Metadata;
import kotlin.collections.l1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;

/* compiled from: CredentialProviderBaseController.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u0000 \u00142\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\t\u001a\u0004\u0018\u00010\u0006\"\n\b\u0000\u0010\u0007*\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0004¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroidx/credentials/playservices/controllers/a;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/os/ResultReceiver;", "T", "resultReceiver", "e", "(Landroid/os/ResultReceiver;)Landroid/os/ResultReceiver;", "Landroid/content/Intent;", "hiddenIntent", "", "typeTag", "Lkotlin/k2;", "c", "(Landroid/os/ResultReceiver;Landroid/content/Intent;Ljava/lang/String;)V", "a", "Landroid/content/Context;", "b", "credentials-play-services-auth_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final Context context;

    /* renamed from: e, reason: collision with root package name */
    @l
    public static final String f27928e = "GET_CANCELED_TAG";

    /* renamed from: f, reason: collision with root package name */
    @l
    public static final String f27929f = "GET_INTERRUPTED";

    /* renamed from: g, reason: collision with root package name */
    @l
    public static final String f27930g = "GET_NO_CREDENTIALS";

    /* renamed from: h, reason: collision with root package name */
    @l
    public static final String f27931h = "GET_UNKNOWN";

    /* renamed from: i, reason: collision with root package name */
    @l
    public static final String f27932i = "CREATE_CANCELED";

    /* renamed from: j, reason: collision with root package name */
    @l
    public static final String f27933j = "CREATE_INTERRUPTED";

    /* renamed from: k, reason: collision with root package name */
    @l
    public static final String f27934k = "CREATE_UNKNOWN";

    /* renamed from: l, reason: collision with root package name */
    @l
    public static final String f27935l = "TYPE";

    /* renamed from: m, reason: collision with root package name */
    @l
    public static final String f27936m = "BEGIN_SIGN_IN";

    /* renamed from: n, reason: collision with root package name */
    @l
    public static final String f27937n = "SIGN_IN_INTENT";

    /* renamed from: o, reason: collision with root package name */
    @l
    public static final String f27938o = "CREATE_PASSWORD";

    /* renamed from: p, reason: collision with root package name */
    @l
    public static final String f27939p = "CREATE_PUBLIC_KEY_CREDENTIAL";

    /* renamed from: q, reason: collision with root package name */
    @l
    public static final String f27940q = "REQUEST_TYPE";

    /* renamed from: r, reason: collision with root package name */
    @l
    public static final String f27941r = "RESULT_DATA";

    /* renamed from: s, reason: collision with root package name */
    @l
    public static final String f27942s = "FAILURE_RESPONSE";

    /* renamed from: t, reason: collision with root package name */
    @l
    public static final String f27943t = "EXCEPTION_TYPE";

    /* renamed from: u, reason: collision with root package name */
    @l
    public static final String f27944u = "EXCEPTION_MESSAGE";

    /* renamed from: v, reason: collision with root package name */
    @l
    public static final String f27945v = "ACTIVITY_REQUEST_CODE";

    /* renamed from: w, reason: collision with root package name */
    @l
    public static final String f27946w = "RESULT_RECEIVER";

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c, reason: collision with root package name */
    @l
    private static final Set<Integer> f27926c = l1.u(7, 20);

    /* renamed from: d, reason: collision with root package name */
    private static final int f27927d = 1;

    /* compiled from: CredentialProviderBaseController.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0019\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\u00020\r8\u0004X\u0085D¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u0014\u0010\u001f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u0014\u0010 \u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0019R\u0014\u0010!\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u0014\u0010\"\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u0014\u0010#\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u0014\u0010$\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u0019R\u0014\u0010%\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\u0019R\u0014\u0010&\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\u0019R\u0014\u0010'\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\u0019R\u0014\u0010(\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010\u0019R\u0014\u0010)\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010\u0019R\u0014\u0010*\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010\u0019R\u0014\u0010+\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b+\u0010\u0019¨\u0006,"}, d2 = {"Landroidx/credentials/playservices/controllers/a$a;", "", "<init>", "()V", "", "typeName", "msg", "Landroidx/credentials/exceptions/GetCredentialException;", "d", "(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", "Landroidx/credentials/exceptions/CreateCredentialException;", "a", "(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/CreateCredentialException;", "", "CONTROLLER_REQUEST_CODE", "I", "b", "()I", "c", "", "retryables", "Ljava/util/Set;", "e", "()Ljava/util/Set;", "ACTIVITY_REQUEST_CODE_TAG", "Ljava/lang/String;", "BEGIN_SIGN_IN_TAG", "CREATE_CANCELED", "CREATE_INTERRUPTED", "CREATE_PASSWORD_TAG", "CREATE_PUBLIC_KEY_CREDENTIAL_TAG", "CREATE_UNKNOWN", "EXCEPTION_MESSAGE_TAG", "EXCEPTION_TYPE_TAG", "FAILURE_RESPONSE_TAG", "GET_CANCELED", "GET_INTERRUPTED", "GET_NO_CREDENTIALS", "GET_UNKNOWN", "REQUEST_TAG", "RESULT_DATA_TAG", "RESULT_RECEIVER_TAG", "SIGN_IN_INTENT_TAG", "TYPE_TAG", "credentials-play-services-auth_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.credentials.playservices.controllers.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @n
        protected static /* synthetic */ void c() {
        }

        @l
        public final CreateCredentialException a(@m String typeName, @m String msg) {
            return l0.g(typeName, "CREATE_CANCELED") ? new CreateCredentialCancellationException(msg) : l0.g(typeName, "CREATE_INTERRUPTED") ? new CreateCredentialInterruptedException(msg) : new CreateCredentialUnknownException(msg);
        }

        protected final int b() {
            return a.f27927d;
        }

        @l
        public final GetCredentialException d(@m String typeName, @m String msg) {
            if (typeName != null) {
                int hashCode = typeName.hashCode();
                if (hashCode != -1567968963) {
                    if (hashCode != -154594663) {
                        if (hashCode == 1996705159 && typeName.equals("GET_NO_CREDENTIALS")) {
                            return new NoCredentialException(msg);
                        }
                    } else if (typeName.equals("GET_INTERRUPTED")) {
                        return new GetCredentialInterruptedException(msg);
                    }
                } else if (typeName.equals("GET_CANCELED_TAG")) {
                    return new GetCredentialCancellationException(msg);
                }
            }
            return new GetCredentialUnknownException(msg);
        }

        @l
        public final Set<Integer> e() {
            return a.f27926c;
        }

        private Companion() {
        }
    }

    public a(@l Context context) {
        l0.p(context, "context");
        this.context = context;
    }

    protected static final int d() {
        INSTANCE.getClass();
        return f27927d;
    }

    protected final void c(@l ResultReceiver resultReceiver, @l Intent hiddenIntent, @l String typeTag) {
        l0.p(resultReceiver, "resultReceiver");
        l0.p(hiddenIntent, "hiddenIntent");
        l0.p(typeTag, "typeTag");
        hiddenIntent.putExtra("TYPE", typeTag);
        hiddenIntent.putExtra("ACTIVITY_REQUEST_CODE", f27927d);
        hiddenIntent.putExtra("RESULT_RECEIVER", e(resultReceiver));
        hiddenIntent.setFlags(65536);
    }

    @m
    public final <T extends ResultReceiver> ResultReceiver e(T resultReceiver) {
        Parcel obtain = Parcel.obtain();
        l0.o(obtain, "obtain()");
        l0.m(resultReceiver);
        resultReceiver.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        ResultReceiver resultReceiver2 = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(obtain);
        obtain.recycle();
        return resultReceiver2;
    }
}
