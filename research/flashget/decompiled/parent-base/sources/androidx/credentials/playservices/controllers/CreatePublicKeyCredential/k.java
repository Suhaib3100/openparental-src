package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Base64;
import androidx.annotation.u;
import androidx.annotation.x0;
import androidx.credentials.exceptions.CreateCredentialCancellationException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.exceptions.publickeycredential.CreatePublicKeyCredentialDomException;
import androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialDomException;
import androidx.credentials.l1;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.Attachment;
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria;
import com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension;
import com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity;
import com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension;
import fg.m;
import h1.b0;
import h1.n;
import h1.p;
import h1.r;
import h1.s;
import h1.x;
import h1.z;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.collections.z0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.q0;
import kotlin.text.v;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PublicKeyCredentialControllerUtility.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00042\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/k;", "", "<init>", "()V", "a", "b", "credentials-play-services-auth_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class k {
    private static final long K = 241217000;
    private static final int L = 11;

    @fg.l
    private static final String A = "displayName";

    @fg.l
    private static final String B = "userVerificationMethod";

    @fg.l
    private static final String C = "keyProtectionType";

    @fg.l
    private static final String D = "matcherProtectionType";

    @fg.l
    private static final String E = "extensions";

    @fg.l
    private static final String F = "attestation";

    @fg.l
    private static final String G = "pubKeyCredParams";

    @fg.l
    private static final String H = "clientExtensionResults";

    @fg.l
    private static final String I = "rk";

    @fg.l
    private static final String J = "credProps";

    @fg.l
    private static final String M = "PublicKeyUtility";

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final String f27872b = "clientDataJSON";

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private static final String f27873c = "attestationObject";

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private static final String f27874d = "authenticatorData";

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private static final String f27875e = "signature";

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    private static final String f27876f = "userHandle";

    /* renamed from: g, reason: collision with root package name */
    @fg.l
    private static final String f27877g = "response";

    /* renamed from: h, reason: collision with root package name */
    @fg.l
    private static final String f27878h = "id";

    /* renamed from: i, reason: collision with root package name */
    @fg.l
    private static final String f27879i = "rawId";

    /* renamed from: j, reason: collision with root package name */
    @fg.l
    private static final String f27880j = "type";

    /* renamed from: k, reason: collision with root package name */
    @fg.l
    private static final String f27881k = "rpId";

    /* renamed from: l, reason: collision with root package name */
    @fg.l
    private static final String f27882l = "challenge";

    /* renamed from: m, reason: collision with root package name */
    @fg.l
    private static final String f27883m = "appid";

    /* renamed from: n, reason: collision with root package name */
    @fg.l
    private static final String f27884n = "thirdPartyPayment";

    /* renamed from: o, reason: collision with root package name */
    @fg.l
    private static final String f27885o = "authenticatorSelection";

    /* renamed from: p, reason: collision with root package name */
    @fg.l
    private static final String f27886p = "requireResidentKey";

    /* renamed from: q, reason: collision with root package name */
    @fg.l
    private static final String f27887q = "residentKey";

    /* renamed from: r, reason: collision with root package name */
    @fg.l
    private static final String f27888r = "authenticatorAttachment";

    /* renamed from: s, reason: collision with root package name */
    @fg.l
    private static final String f27889s = "timeout";

    /* renamed from: t, reason: collision with root package name */
    @fg.l
    private static final String f27890t = "excludeCredentials";

    /* renamed from: u, reason: collision with root package name */
    @fg.l
    private static final String f27891u = "transports";

    /* renamed from: v, reason: collision with root package name */
    @fg.l
    private static final String f27892v = "rp";

    /* renamed from: w, reason: collision with root package name */
    @fg.l
    private static final String f27893w = "name";

    /* renamed from: x, reason: collision with root package name */
    @fg.l
    private static final String f27894x = "icon";

    /* renamed from: y, reason: collision with root package name */
    @fg.l
    private static final String f27895y = "alg";

    /* renamed from: z, reason: collision with root package name */
    @fg.l
    private static final String f27896z = "user";

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    @fg.l
    private static final LinkedHashMap<ErrorCode, h1.e> N = z0.S(new q0(ErrorCode.UNKNOWN_ERR, new b0()), new q0(ErrorCode.ABORT_ERR, new h1.a()), new q0(ErrorCode.ATTESTATION_NOT_PRIVATE_ERR, new r()), new q0(ErrorCode.CONSTRAINT_ERR, new h1.b()), new q0(ErrorCode.DATA_ERR, new h1.d()), new q0(ErrorCode.INVALID_STATE_ERR, new h1.l()), new q0(ErrorCode.ENCODING_ERR, new h1.f()), new q0(ErrorCode.NETWORK_ERR, new n()), new q0(ErrorCode.NOT_ALLOWED_ERR, new p()), new q0(ErrorCode.NOT_SUPPORTED_ERR, new s()), new q0(ErrorCode.SECURITY_ERR, new x()), new q0(ErrorCode.TIMEOUT_ERR, new z()));

    /* compiled from: PublicKeyCredentialControllerUtility.kt */
    @Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\bK\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0015\u0010\u0016J7\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r2\u000e\u0010\u001b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001a0\u00192\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0015\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020(2\u0006\u0010$\u001a\u00020#H\u0007¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010 \u001a\u00020+¢\u0006\u0004\b-\u0010.J!\u00103\u001a\u0002022\u0006\u00100\u001a\u00020/2\b\u00101\u001a\u0004\u0018\u00010\u001aH\u0000¢\u0006\u0004\b3\u00104J\u001f\u00107\u001a\u00020\u001c2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00106\u001a\u000205H\u0000¢\u0006\u0004\b7\u00108J\u001f\u00109\u001a\u00020\u001c2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00106\u001a\u000205H\u0000¢\u0006\u0004\b9\u00108J\u001f\u0010:\u001a\u00020\u001c2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00106\u001a\u000205H\u0000¢\u0006\u0004\b:\u00108J\u001f\u0010;\u001a\u00020\u001c2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00106\u001a\u000205H\u0000¢\u0006\u0004\b;\u00108J\u001f\u0010<\u001a\u00020\u001c2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00106\u001a\u000205H\u0000¢\u0006\u0004\b<\u00108J\u001f\u0010=\u001a\u00020\u001c2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00106\u001a\u000205H\u0000¢\u0006\u0004\b=\u00108J\u0015\u0010?\u001a\u00020\r2\u0006\u0010>\u001a\u00020\u001a¢\u0006\u0004\b?\u0010@J\u0015\u0010B\u001a\u00020\u001a2\u0006\u0010A\u001a\u00020\r¢\u0006\u0004\bB\u0010CJ\u0015\u0010F\u001a\u00020\b2\u0006\u0010E\u001a\u00020D¢\u0006\u0004\bF\u0010GR\u001a\u0010H\u001a\u00020\u001a8\u0000X\u0080D¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u001a\u0010L\u001a\u00020\u001a8\u0000X\u0080D¢\u0006\f\n\u0004\bL\u0010I\u001a\u0004\bM\u0010KR\u001a\u0010N\u001a\u00020\u001a8\u0000X\u0080D¢\u0006\f\n\u0004\bN\u0010I\u001a\u0004\bO\u0010KR\u001a\u0010P\u001a\u00020\u001a8\u0000X\u0080D¢\u0006\f\n\u0004\bP\u0010I\u001a\u0004\bQ\u0010KR\u001a\u0010R\u001a\u00020\u001a8\u0000X\u0080D¢\u0006\f\n\u0004\bR\u0010I\u001a\u0004\bS\u0010KR\u001a\u0010T\u001a\u00020\u001a8\u0000X\u0080D¢\u0006\f\n\u0004\bT\u0010I\u001a\u0004\bU\u0010KR\u001a\u0010V\u001a\u00020\u001a8\u0000X\u0080D¢\u0006\f\n\u0004\bV\u0010I\u001a\u0004\bW\u0010KR\u001a\u0010X\u001a\u00020\u001a8\u0000X\u0080D¢\u0006\f\n\u0004\bX\u0010I\u001a\u0004\bY\u0010KR\u001a\u0010Z\u001a\u00020\u001a8\u0000X\u0080D¢\u0006\f\n\u0004\bZ\u0010I\u001a\u0004\b[\u0010KR\u001a\u0010\\\u001a\u00020\u001a8\u0000X\u0080D¢\u0006\f\n\u0004\b\\\u0010I\u001a\u0004\b]\u0010KR\u001a\u0010^\u001a\u00020\u001a8\u0000X\u0080D¢\u0006\f\n\u0004\b^\u0010I\u001a\u0004\b_\u0010KR\u001a\u0010`\u001a\u00020\u001a8\u0000X\u0080D¢\u0006\f\n\u0004\b`\u0010I\u001a\u0004\ba\u0010KR\u001a\u0010b\u001a\u00020\u001a8\u0000X\u0080D¢\u0006\f\n\u0004\bb\u0010I\u001a\u0004\bc\u0010KR\u001a\u0010d\u001a\u00020\u001a8\u0000X\u0080D¢\u0006\f\n\u0004\bd\u0010I\u001a\u0004\be\u0010KR\u001a\u0010f\u001a\u00020\u001a8\u0000X\u0080D¢\u0006\f\n\u0004\bf\u0010I\u001a\u0004\bg\u0010KR\u001a\u0010h\u001a\u00020\u001a8\u0000X\u0080D¢\u0006\f\n\u0004\bh\u0010I\u001a\u0004\bi\u0010KR\u001a\u0010j\u001a\u00020\u001a8\u0000X\u0080D¢\u0006\f\n\u0004\bj\u0010I\u001a\u0004\bk\u0010KR\u001a\u0010l\u001a\u00020\u001a8\u0000X\u0080D¢\u0006\f\n\u0004\bl\u0010I\u001a\u0004\bm\u0010KR\u001a\u0010n\u001a\u00020\u001a8\u0000X\u0080D¢\u0006\f\n\u0004\bn\u0010I\u001a\u0004\bo\u0010KR\u001a\u0010p\u001a\u00020\u001a8\u0000X\u0080D¢\u0006\f\n\u0004\bp\u0010I\u001a\u0004\bq\u0010KR\u001a\u0010r\u001a\u00020\u001a8\u0000X\u0080D¢\u0006\f\n\u0004\br\u0010I\u001a\u0004\bs\u0010KR\u001a\u0010t\u001a\u00020\u001a8\u0000X\u0080D¢\u0006\f\n\u0004\bt\u0010I\u001a\u0004\bu\u0010KR\u001a\u0010v\u001a\u00020\u001a8\u0000X\u0080D¢\u0006\f\n\u0004\bv\u0010I\u001a\u0004\bw\u0010KR\u001a\u0010x\u001a\u00020\u001a8\u0000X\u0080D¢\u0006\f\n\u0004\bx\u0010I\u001a\u0004\by\u0010KR\u001a\u0010z\u001a\u00020\u001a8\u0000X\u0080D¢\u0006\f\n\u0004\bz\u0010I\u001a\u0004\b{\u0010KR\u001a\u0010|\u001a\u00020\u001a8\u0000X\u0080D¢\u0006\f\n\u0004\b|\u0010I\u001a\u0004\b}\u0010KR\u001a\u0010~\u001a\u00020\u001a8\u0000X\u0080D¢\u0006\f\n\u0004\b~\u0010I\u001a\u0004\b\u007f\u0010KR\u001d\u0010\u0080\u0001\u001a\u00020\u001a8\u0000X\u0080D¢\u0006\u000e\n\u0005\b\u0080\u0001\u0010I\u001a\u0005\b\u0081\u0001\u0010KR\u001d\u0010\u0082\u0001\u001a\u00020\u001a8\u0000X\u0080D¢\u0006\u000e\n\u0005\b\u0082\u0001\u0010I\u001a\u0005\b\u0083\u0001\u0010KR\u001d\u0010\u0084\u0001\u001a\u00020\u001a8\u0000X\u0080D¢\u0006\u000e\n\u0005\b\u0084\u0001\u0010I\u001a\u0005\b\u0085\u0001\u0010KR\u001d\u0010\u0086\u0001\u001a\u00020\u001a8\u0000X\u0080D¢\u0006\u000e\n\u0005\b\u0086\u0001\u0010I\u001a\u0005\b\u0087\u0001\u0010KR\u001d\u0010\u0088\u0001\u001a\u00020\u001a8\u0000X\u0080D¢\u0006\u000e\n\u0005\b\u0088\u0001\u0010I\u001a\u0005\b\u0089\u0001\u0010KR\u001d\u0010\u008a\u0001\u001a\u00020\u001a8\u0000X\u0080D¢\u0006\u000e\n\u0005\b\u008a\u0001\u0010I\u001a\u0005\b\u008b\u0001\u0010KR\u001d\u0010\u008c\u0001\u001a\u00020\u001a8\u0000X\u0080D¢\u0006\u000e\n\u0005\b\u008c\u0001\u0010I\u001a\u0005\b\u008d\u0001\u0010KR\u001d\u0010\u008e\u0001\u001a\u00020\u001a8\u0000X\u0080D¢\u0006\u000e\n\u0005\b\u008e\u0001\u0010I\u001a\u0005\b\u008f\u0001\u0010KR?\u0010\u0093\u0001\u001a\"\u0012\u0004\u0012\u00020/\u0012\u0005\u0012\u00030\u0091\u00010\u0090\u0001j\u0010\u0012\u0004\u0012\u00020/\u0012\u0005\u0012\u00030\u0091\u0001`\u0092\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0093\u0001\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0016\u0010\u0097\u0001\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0097\u0001\u0010sR\u0017\u0010\u0098\u0001\u001a\u00020D8\u0002X\u0082T¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u008d\u0001R\u0016\u0010\u0099\u0001\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0099\u0001\u0010I¨\u0006\u009a\u0001"}, d2 = {"Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/k$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "version", "", "U", "(Landroid/content/Context;J)Z", "Lorg/json/JSONObject;", "json", "", "j", "(Lorg/json/JSONObject;)[B", "Landroidx/credentials/h;", "request", "Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions;", "f", "(Landroidx/credentials/h;Landroid/content/Context;)Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions;", "g", "(Lorg/json/JSONObject;)Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions;", "clientDataJSON", "attestationObject", "", "", "transportArray", "Lkotlin/k2;", "a", "([B[B[Ljava/lang/String;Lorg/json/JSONObject;)V", "Lcom/google/android/gms/auth/api/identity/SignInCredential;", "cred", "c0", "(Lcom/google/android/gms/auth/api/identity/SignInCredential;)Ljava/lang/String;", "Landroidx/credentials/l1;", "option", "Lcom/google/android/gms/auth/api/identity/BeginSignInRequest$PasskeyJsonRequestOptions;", "h", "(Landroidx/credentials/l1;)Lcom/google/android/gms/auth/api/identity/BeginSignInRequest$PasskeyJsonRequestOptions;", "Lcom/google/android/gms/auth/api/identity/BeginSignInRequest$PasskeysRequestOptions;", "i", "(Landroidx/credentials/l1;)Lcom/google/android/gms/auth/api/identity/BeginSignInRequest$PasskeysRequestOptions;", "Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredential;", "Landroidx/credentials/exceptions/CreateCredentialException;", "b0", "(Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredential;)Landroidx/credentials/exceptions/CreateCredentialException;", "Lcom/google/android/gms/fido/fido2/api/common/ErrorCode;", "code", "msg", "Landroidx/credentials/exceptions/GetCredentialException;", "d", "(Lcom/google/android/gms/fido/fido2/api/common/ErrorCode;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", "Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions$Builder;", "builder", "W", "(Lorg/json/JSONObject;Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions$Builder;)V", "V", "X", "Y", "a0", "Z", "str", "b", "(Ljava/lang/String;)[B", "data", "c", "([B)Ljava/lang/String;", "", "alg", "e", "(I)Z", "JSON_KEY_CLIENT_DATA", "Ljava/lang/String;", "s", "()Ljava/lang/String;", "JSON_KEY_ATTESTATION_OBJ", "n", "JSON_KEY_AUTH_DATA", "p", "JSON_KEY_SIGNATURE", "L", "JSON_KEY_USER_HANDLE", "R", "JSON_KEY_RESPONSE", "G", "JSON_KEY_ID", "z", "JSON_KEY_RAW_ID", "E", "JSON_KEY_TYPE", "P", "JSON_KEY_RPID", "K", "JSON_KEY_CHALLENGE", "r", "JSON_KEY_APPID", "l", "JSON_KEY_THIRD_PARTY_PAYMENT", "M", "JSON_KEY_AUTH_SELECTION", "q", "JSON_KEY_REQUIRE_RES_KEY", "F", "JSON_KEY_RES_KEY", "H", "JSON_KEY_AUTH_ATTACHMENT", "o", "JSON_KEY_TIMEOUT", "N", "JSON_KEY_EXCLUDE_CREDENTIALS", "w", "JSON_KEY_TRANSPORTS", "O", "JSON_KEY_RP", "J", "JSON_KEY_NAME", "C", "JSON_KEY_ICON", "y", "JSON_KEY_ALG", "k", "JSON_KEY_USER", "Q", "JSON_KEY_DISPLAY_NAME", "v", "JSON_KEY_USER_VERIFICATION_METHOD", "S", "JSON_KEY_KEY_PROTECTION_TYPE", "A", "JSON_KEY_MATCHER_PROTECTION_TYPE", "B", "JSON_KEY_EXTENSTIONS", "x", "JSON_KEY_ATTESTATION", "m", "JSON_KEY_PUB_KEY_CRED_PARAMS", "D", "JSON_KEY_CLIENT_EXTENSION_RESULTS", "t", "JSON_KEY_RK", "I", "JSON_KEY_CRED_PROPS", "u", "Ljava/util/LinkedHashMap;", "Lh1/e;", "Lkotlin/collections/LinkedHashMap;", "orderedErrorCodeToExceptions", "Ljava/util/LinkedHashMap;", "T", "()Ljava/util/LinkedHashMap;", "AUTH_MIN_VERSION_JSON_CREATE", "FLAGS", "TAG", "credentials-play-services-auth_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.k$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        private final boolean U(Context context, long version) {
            long j4;
            if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) != 0) {
                return false;
            }
            PackageManager packageManager = context.getPackageManager();
            l0.o(packageManager, "context.packageManager");
            if (Build.VERSION.SDK_INT >= 28) {
                PackageInfo packageInfo = packageManager.getPackageInfo("com.google.android.gms", 0);
                l0.o(packageInfo, "packageManager.getPackageInfo(packageName, 0)");
                j4 = b.a(packageInfo);
            } else {
                j4 = packageManager.getPackageInfo("com.google.android.gms", 0).versionCode;
            }
            return j4 > version;
        }

        private final byte[] j(JSONObject json) {
            String challengeB64 = json.optString(k.f27882l, "");
            l0.o(challengeB64, "challengeB64");
            if (challengeB64.length() != 0) {
                return b(challengeB64);
            }
            throw new JSONException("Challenge not found in request or is unexpectedly empty");
        }

        @fg.l
        public final String A() {
            return k.C;
        }

        @fg.l
        public final String B() {
            return k.D;
        }

        @fg.l
        public final String C() {
            return k.f27893w;
        }

        @fg.l
        public final String D() {
            return k.G;
        }

        @fg.l
        public final String E() {
            return k.f27879i;
        }

        @fg.l
        public final String F() {
            return k.f27886p;
        }

        @fg.l
        public final String G() {
            return k.f27877g;
        }

        @fg.l
        public final String H() {
            return k.f27887q;
        }

        @fg.l
        public final String I() {
            return k.I;
        }

        @fg.l
        public final String J() {
            return k.f27892v;
        }

        @fg.l
        public final String K() {
            return k.f27881k;
        }

        @fg.l
        public final String L() {
            return k.f27875e;
        }

        @fg.l
        public final String M() {
            return k.f27884n;
        }

        @fg.l
        public final String N() {
            return k.f27889s;
        }

        @fg.l
        public final String O() {
            return k.f27891u;
        }

        @fg.l
        public final String P() {
            return k.f27880j;
        }

        @fg.l
        public final String Q() {
            return k.f27896z;
        }

        @fg.l
        public final String R() {
            return k.f27876f;
        }

        @fg.l
        public final String S() {
            return k.B;
        }

        @fg.l
        public final LinkedHashMap<ErrorCode, h1.e> T() {
            return k.N;
        }

        public final void V(@fg.l JSONObject json, @fg.l PublicKeyCredentialCreationOptions.Builder builder) {
            l0.p(json, "json");
            l0.p(builder, "builder");
            if (json.has(k.f27885o)) {
                JSONObject jSONObject = json.getJSONObject(k.f27885o);
                AuthenticatorSelectionCriteria.Builder builder2 = new AuthenticatorSelectionCriteria.Builder();
                boolean optBoolean = jSONObject.optBoolean(k.f27886p, false);
                String residentKey = jSONObject.optString(k.f27887q, "");
                l0.o(residentKey, "residentKey");
                builder2.setRequireResidentKey(Boolean.valueOf(optBoolean)).setResidentKeyRequirement(residentKey.length() > 0 ? ResidentKeyRequirement.fromString(residentKey) : null);
                String authenticatorAttachmentString = jSONObject.optString(k.f27888r, "");
                l0.o(authenticatorAttachmentString, "authenticatorAttachmentString");
                if (authenticatorAttachmentString.length() > 0) {
                    builder2.setAttachment(Attachment.fromString(authenticatorAttachmentString));
                }
                builder.setAuthenticatorSelection(builder2.build());
            }
        }

        public final void W(@fg.l JSONObject json, @fg.l PublicKeyCredentialCreationOptions.Builder builder) {
            l0.p(json, "json");
            l0.p(builder, "builder");
            if (json.has(k.E)) {
                JSONObject jSONObject = json.getJSONObject(k.E);
                AuthenticationExtensions.Builder builder2 = new AuthenticationExtensions.Builder();
                String appIdExtension = jSONObject.optString(k.f27883m, "");
                l0.o(appIdExtension, "appIdExtension");
                if (appIdExtension.length() > 0) {
                    builder2.setFido2Extension(new FidoAppIdExtension(appIdExtension));
                }
                if (jSONObject.optBoolean(k.f27884n, false)) {
                    builder2.setGoogleThirdPartyPaymentExtension(new GoogleThirdPartyPaymentExtension(true));
                }
                if (jSONObject.optBoolean("uvm", false)) {
                    builder2.setUserVerificationMethodExtension(new UserVerificationMethodExtension(true));
                }
                builder.setAuthenticationExtensions(builder2.build());
            }
        }

        public final void X(@fg.l JSONObject json, @fg.l PublicKeyCredentialCreationOptions.Builder builder) {
            l0.p(json, "json");
            l0.p(builder, "builder");
            if (json.has(k.f27889s)) {
                builder.setTimeoutSeconds(Double.valueOf(json.getLong(k.f27889s) / 1000));
            }
        }

        public final void Y(@fg.l JSONObject json, @fg.l PublicKeyCredentialCreationOptions.Builder builder) {
            ArrayList arrayList;
            l0.p(json, "json");
            l0.p(builder, "builder");
            ArrayList arrayList2 = new ArrayList();
            if (json.has(k.f27890t)) {
                JSONArray jSONArray = json.getJSONArray(k.f27890t);
                int length = jSONArray.length();
                for (int i4 = 0; i4 < length; i4++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i4);
                    String string = jSONObject.getString(k.f27878h);
                    l0.o(string, "descriptorJSON.getString(JSON_KEY_ID)");
                    byte[] b5 = b(string);
                    String descriptorType = jSONObject.getString(k.f27880j);
                    l0.o(descriptorType, "descriptorType");
                    if (descriptorType.length() == 0) {
                        throw new JSONException("PublicKeyCredentialDescriptor type value is not found or unexpectedly empty");
                    }
                    if (b5.length == 0) {
                        throw new JSONException("PublicKeyCredentialDescriptor id value is not found or unexpectedly empty");
                    }
                    if (jSONObject.has(k.f27891u)) {
                        arrayList = new ArrayList();
                        JSONArray jSONArray2 = jSONObject.getJSONArray(k.f27891u);
                        int length2 = jSONArray2.length();
                        for (int i5 = 0; i5 < length2; i5++) {
                            try {
                                Transport fromString = Transport.fromString(jSONArray2.getString(i5));
                                l0.o(fromString, "fromString(descriptorTransports.getString(j))");
                                arrayList.add(fromString);
                            } catch (Transport.UnsupportedTransportException e4) {
                                throw new CreatePublicKeyCredentialDomException(new h1.f(), e4.getMessage());
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    arrayList2.add(new PublicKeyCredentialDescriptor(descriptorType, b5, arrayList));
                }
            }
            builder.setExcludeList(arrayList2);
            String attestationString = json.optString(k.F, "none");
            l0.o(attestationString, "attestationString");
            builder.setAttestationConveyancePreference(AttestationConveyancePreference.fromString(attestationString.length() != 0 ? attestationString : "none"));
        }

        public final void Z(@fg.l JSONObject json, @fg.l PublicKeyCredentialCreationOptions.Builder builder) {
            l0.p(json, "json");
            l0.p(builder, "builder");
            builder.setChallenge(j(json));
            JSONObject jSONObject = json.getJSONObject(k.f27896z);
            String string = jSONObject.getString(k.f27878h);
            l0.o(string, "user.getString(JSON_KEY_ID)");
            byte[] b5 = b(string);
            String userName = jSONObject.getString(k.f27893w);
            String displayName = jSONObject.getString(k.A);
            String optString = jSONObject.optString(k.f27894x, "");
            l0.o(displayName, "displayName");
            if (displayName.length() == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing displayName or they are unexpectedly empty");
            }
            if (b5.length == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing user id or they are unexpectedly empty");
            }
            l0.o(userName, "userName");
            if (userName.length() == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing user name or they are unexpectedly empty");
            }
            builder.setUser(new PublicKeyCredentialUserEntity(b5, userName, optString, displayName));
        }

        public final void a(@fg.l byte[] clientDataJSON, @fg.l byte[] attestationObject, @fg.l String[] transportArray, @fg.l JSONObject json) {
            l0.p(clientDataJSON, "clientDataJSON");
            l0.p(attestationObject, "attestationObject");
            l0.p(transportArray, "transportArray");
            l0.p(json, "json");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(k.f27872b, c(clientDataJSON));
            jSONObject.put(k.f27873c, c(attestationObject));
            jSONObject.put(k.f27891u, new JSONArray(transportArray));
            json.put(k.f27877g, jSONObject);
        }

        public final void a0(@fg.l JSONObject json, @fg.l PublicKeyCredentialCreationOptions.Builder builder) {
            l0.p(json, "json");
            l0.p(builder, "builder");
            JSONObject jSONObject = json.getJSONObject(k.f27892v);
            String rpId = jSONObject.getString(k.f27878h);
            String rpName = jSONObject.optString(k.f27893w, "");
            String optString = jSONObject.optString(k.f27894x, "");
            l0.m(optString);
            if (optString.length() == 0) {
                optString = null;
            }
            l0.o(rpName, "rpName");
            if (rpName.length() == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions rp name is missing or unexpectedly empty");
            }
            l0.o(rpId, "rpId");
            if (rpId.length() == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions rp ID is missing or unexpectedly empty");
            }
            builder.setRp(new PublicKeyCredentialRpEntity(rpId, rpName, optString));
            JSONArray jSONArray = json.getJSONArray(k.G);
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i4 = 0; i4 < length; i4++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i4);
                int i5 = (int) jSONObject2.getLong(k.f27895y);
                String typeParam = jSONObject2.optString(k.f27880j, "");
                l0.o(typeParam, "typeParam");
                if (typeParam.length() == 0) {
                    throw new JSONException("PublicKeyCredentialCreationOptions PublicKeyCredentialParameter type missing or unexpectedly empty");
                }
                if (e(i5)) {
                    arrayList.add(new PublicKeyCredentialParameters(typeParam, i5));
                }
            }
            builder.setParameters(arrayList);
        }

        @fg.l
        public final byte[] b(@fg.l String str) {
            l0.p(str, "str");
            byte[] decode = Base64.decode(str, 11);
            l0.o(decode, "decode(str, FLAGS)");
            return decode;
        }

        @m
        public final CreateCredentialException b0(@fg.l PublicKeyCredential cred) {
            l0.p(cred, "cred");
            AuthenticatorResponse response = cred.getResponse();
            l0.o(response, "cred.response");
            if (!(response instanceof AuthenticatorErrorResponse)) {
                return null;
            }
            AuthenticatorErrorResponse authenticatorErrorResponse = (AuthenticatorErrorResponse) response;
            ErrorCode errorCode = authenticatorErrorResponse.getErrorCode();
            l0.o(errorCode, "authenticatorResponse.errorCode");
            h1.e eVar = (h1.e) k.N.get(errorCode);
            String errorMessage = authenticatorErrorResponse.getErrorMessage();
            return eVar == null ? new CreatePublicKeyCredentialDomException(new b0(), androidx.constraintlayout.core.motion.key.c.a("unknown fido gms exception - ", errorMessage)) : (errorCode == ErrorCode.NOT_ALLOWED_ERR && errorMessage != null && v.T2(errorMessage, "Unable to get sync account", false, 2, null)) ? new CreateCredentialCancellationException("Passkey registration was cancelled by the user.") : new CreatePublicKeyCredentialDomException(eVar, errorMessage);
        }

        @fg.l
        public final String c(@fg.l byte[] data) {
            l0.p(data, "data");
            String encodeToString = Base64.encodeToString(data, 11);
            l0.o(encodeToString, "encodeToString(data, FLAGS)");
            return encodeToString;
        }

        @fg.l
        public final String c0(@fg.l SignInCredential cred) {
            l0.p(cred, "cred");
            JSONObject jSONObject = new JSONObject();
            PublicKeyCredential publicKeyCredential = cred.getPublicKeyCredential();
            AuthenticatorResponse response = publicKeyCredential != null ? publicKeyCredential.getResponse() : null;
            l0.m(response);
            if (response instanceof AuthenticatorErrorResponse) {
                AuthenticatorErrorResponse authenticatorErrorResponse = (AuthenticatorErrorResponse) response;
                ErrorCode errorCode = authenticatorErrorResponse.getErrorCode();
                l0.o(errorCode, "authenticatorResponse.errorCode");
                throw d(errorCode, authenticatorErrorResponse.getErrorMessage());
            }
            if (!(response instanceof AuthenticatorAssertionResponse)) {
                response.getClass();
                String jSONObject2 = jSONObject.toString();
                l0.o(jSONObject2, "json.toString()");
                return jSONObject2;
            }
            try {
                String json = publicKeyCredential.toJson();
                l0.o(json, "publicKeyCred.toJson()");
                return json;
            } catch (Throwable th) {
                throw new GetCredentialUnknownException(androidx.credentials.playservices.controllers.CreatePublicKeyCredential.b.a(th, new StringBuilder("The PublicKeyCredential response json had an unexpected exception when parsing: ")));
            }
        }

        @fg.l
        public final GetCredentialException d(@fg.l ErrorCode code, @m String msg) {
            l0.p(code, "code");
            h1.e eVar = (h1.e) k.N.get(code);
            return eVar == null ? new GetPublicKeyCredentialDomException(new b0(), androidx.constraintlayout.core.motion.key.c.a("unknown fido gms exception - ", msg)) : (code == ErrorCode.NOT_ALLOWED_ERR && msg != null && v.T2(msg, "Unable to get sync account", false, 2, null)) ? new GetCredentialCancellationException("Passkey retrieval was cancelled by the user.") : new GetPublicKeyCredentialDomException(eVar, msg);
        }

        public final boolean e(int alg) {
            try {
                COSEAlgorithmIdentifier.fromCoseValue(alg);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }

        @fg.l
        @kd.n
        public final PublicKeyCredentialCreationOptions f(@fg.l androidx.credentials.h request, @fg.l Context context) {
            l0.p(request, "request");
            l0.p(context, "context");
            return U(context, k.K) ? new PublicKeyCredentialCreationOptions(request.getRequestJson()) : g(new JSONObject(request.getRequestJson()));
        }

        @fg.l
        public final PublicKeyCredentialCreationOptions g(@fg.l JSONObject json) {
            l0.p(json, "json");
            PublicKeyCredentialCreationOptions.Builder builder = new PublicKeyCredentialCreationOptions.Builder();
            Z(json, builder);
            a0(json, builder);
            Y(json, builder);
            X(json, builder);
            V(json, builder);
            W(json, builder);
            PublicKeyCredentialCreationOptions build = builder.build();
            l0.o(build, "builder.build()");
            return build;
        }

        @fg.l
        public final BeginSignInRequest.PasskeyJsonRequestOptions h(@fg.l l1 option) {
            l0.p(option, "option");
            BeginSignInRequest.PasskeyJsonRequestOptions build = new BeginSignInRequest.PasskeyJsonRequestOptions.Builder().setSupported(true).setRequestJson(option.getRequestJson()).build();
            l0.o(build, "Builder()\n              …\n                .build()");
            return build;
        }

        @fg.l
        @kotlin.k(message = "Upgrade GMS version so 'convertToPlayAuthPasskeyJsonRequest' is used")
        public final BeginSignInRequest.PasskeysRequestOptions i(@fg.l l1 option) {
            l0.p(option, "option");
            JSONObject jSONObject = new JSONObject(option.getRequestJson());
            String rpId = jSONObject.optString(k.f27881k, "");
            l0.o(rpId, "rpId");
            if (rpId.length() == 0) {
                throw new JSONException("GetPublicKeyCredentialOption - rpId not specified in the request or is unexpectedly empty");
            }
            BeginSignInRequest.PasskeysRequestOptions build = new BeginSignInRequest.PasskeysRequestOptions.Builder().setSupported(true).setRpId(rpId).setChallenge(j(jSONObject)).build();
            l0.o(build, "Builder()\n              …\n                .build()");
            return build;
        }

        @fg.l
        public final String k() {
            return k.f27895y;
        }

        @fg.l
        public final String l() {
            return k.f27883m;
        }

        @fg.l
        public final String m() {
            return k.F;
        }

        @fg.l
        public final String n() {
            return k.f27873c;
        }

        @fg.l
        public final String o() {
            return k.f27888r;
        }

        @fg.l
        public final String p() {
            return k.f27874d;
        }

        @fg.l
        public final String q() {
            return k.f27885o;
        }

        @fg.l
        public final String r() {
            return k.f27882l;
        }

        @fg.l
        public final String s() {
            return k.f27872b;
        }

        @fg.l
        public final String t() {
            return k.H;
        }

        @fg.l
        public final String u() {
            return k.J;
        }

        @fg.l
        public final String v() {
            return k.A;
        }

        @fg.l
        public final String w() {
            return k.f27890t;
        }

        @fg.l
        public final String x() {
            return k.E;
        }

        @fg.l
        public final String y() {
            return k.f27894x;
        }

        @fg.l
        public final String z() {
            return k.f27878h;
        }

        public Companion(w wVar) {
        }
    }

    /* compiled from: PublicKeyCredentialControllerUtility.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/k$b;", "", "<init>", "()V", "Landroid/content/pm/PackageInfo;", "info", "", "a", "(Landroid/content/pm/PackageInfo;)J", "credentials-play-services-auth_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @x0(28)
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        @fg.l
        public static final b f27897a = new b();

        private b() {
        }

        @u
        @kd.n
        public static final long a(@fg.l PackageInfo info) {
            long longVersionCode;
            l0.p(info, "info");
            longVersionCode = info.getLongVersionCode();
            return longVersionCode;
        }
    }

    @fg.l
    @kd.n
    public static final PublicKeyCredentialCreationOptions K(@fg.l androidx.credentials.h hVar, @fg.l Context context) {
        return INSTANCE.f(hVar, context);
    }
}
