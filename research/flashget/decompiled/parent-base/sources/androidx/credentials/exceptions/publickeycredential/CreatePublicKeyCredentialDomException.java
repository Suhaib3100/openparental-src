package androidx.credentials.exceptions.publickeycredential;

import androidx.annotation.c1;
import androidx.credentials.exceptions.CreateCredentialCustomException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.publickeycredential.a;
import androidx.credentials.internal.FrameworkClassParsingException;
import fg.l;
import fg.m;
import h1.a0;
import h1.b;
import h1.b0;
import h1.c;
import h1.c0;
import h1.d;
import h1.d0;
import h1.e;
import h1.f;
import h1.g;
import h1.h;
import h1.i;
import h1.j;
import h1.k;
import h1.o;
import h1.p;
import h1.q;
import h1.r;
import h1.s;
import h1.t;
import h1.u;
import h1.v;
import h1.w;
import h1.x;
import h1.y;
import h1.z;
import kd.n;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

/* compiled from: CreatePublicKeyCredentialDomException.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\n\u0018\u0000 \f2\u00020\u0001:\u0001\rB\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Landroidx/credentials/exceptions/publickeycredential/CreatePublicKeyCredentialDomException;", "Landroidx/credentials/exceptions/publickeycredential/CreatePublicKeyCredentialException;", "Lh1/e;", "domError", "", "errorMessage", "<init>", "(Lh1/e;Ljava/lang/CharSequence;)V", "f", "Lh1/e;", "d", "()Lh1/e;", "g", "a", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CreatePublicKeyCredentialDomException extends CreatePublicKeyCredentialException {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @l
    private final e domError;

    /* renamed from: h, reason: collision with root package name */
    @l
    public static final String f27681h = "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION";

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @l
    public static final Companion INSTANCE = new Companion();

    /* compiled from: CreatePublicKeyCredentialDomException.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/credentials/exceptions/publickeycredential/CreatePublicKeyCredentialDomException$a;", "", "<init>", "()V", "", "type", "msg", "Landroidx/credentials/exceptions/CreateCredentialException;", "a", "(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/CreateCredentialException;", "TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", "Ljava/lang/String;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nCreatePublicKeyCredentialDomException.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreatePublicKeyCredentialDomException.kt\nandroidx/credentials/exceptions/publickeycredential/CreatePublicKeyCredentialDomException$Companion\n+ 2 DomExceptionUtils.kt\nandroidx/credentials/exceptions/publickeycredential/DomExceptionUtils$Companion\n*L\n1#1,67:1\n67#2,75:68\n*S KotlinDebug\n*F\n+ 1 CreatePublicKeyCredentialDomException.kt\nandroidx/credentials/exceptions/publickeycredential/CreatePublicKeyCredentialDomException$Companion\n*L\n53#1:68,75\n*E\n"})
    /* renamed from: androidx.credentials.exceptions.publickeycredential.CreatePublicKeyCredentialDomException$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @l
        @n
        @c1({c1.a.LIBRARY})
        public final CreateCredentialException a(@l String type, @m String msg) {
            Object c5;
            l0.p(type, "type");
            try {
                a.Companion companion = a.INSTANCE;
                CreatePublicKeyCredentialDomException createPublicKeyCredentialDomException = new CreatePublicKeyCredentialDomException(new b0(), null, 2, 0 == true ? 1 : 0);
                if (l0.g(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ABORT_ERROR")) {
                    c5 = companion.c(new h1.a(), msg, createPublicKeyCredentialDomException);
                } else if (l0.g(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_CONSTRAINT_ERROR")) {
                    c5 = companion.c(new b(), msg, createPublicKeyCredentialDomException);
                } else if (l0.g(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_CLONE_ERROR")) {
                    c5 = companion.c(new c(), msg, createPublicKeyCredentialDomException);
                } else if (l0.g(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_ERROR")) {
                    c5 = companion.c(new d(), msg, createPublicKeyCredentialDomException);
                } else if (l0.g(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ENCODING_ERROR")) {
                    c5 = companion.c(new f(), msg, createPublicKeyCredentialDomException);
                } else if (l0.g(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_HIERARCHY_REQUEST_ERROR")) {
                    c5 = companion.c(new g(), msg, createPublicKeyCredentialDomException);
                } else if (l0.g(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_IN_USE_ATTRIBUTE_ERROR")) {
                    c5 = companion.c(new h(), msg, createPublicKeyCredentialDomException);
                } else if (l0.g(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_CHARACTER_ERROR")) {
                    c5 = companion.c(new i(), msg, createPublicKeyCredentialDomException);
                } else if (l0.g(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_MODIFICATION_ERROR")) {
                    c5 = companion.c(new j(), msg, createPublicKeyCredentialDomException);
                } else if (l0.g(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_NODE_TYPE_ERROR")) {
                    c5 = companion.c(new k(), msg, createPublicKeyCredentialDomException);
                } else if (l0.g(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_STATE_ERROR")) {
                    c5 = companion.c(new h1.l(), msg, createPublicKeyCredentialDomException);
                } else if (l0.g(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NAMESPACE_ERROR")) {
                    c5 = companion.c(new h1.m(), msg, createPublicKeyCredentialDomException);
                } else if (l0.g(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NETWORK_ERROR")) {
                    c5 = companion.c(new h1.n(), msg, createPublicKeyCredentialDomException);
                } else if (l0.g(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NO_MODIFICATION_ALLOWED_ERROR")) {
                    c5 = companion.c(new o(), msg, createPublicKeyCredentialDomException);
                } else if (l0.g(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_ALLOWED_ERROR")) {
                    c5 = companion.c(new p(), msg, createPublicKeyCredentialDomException);
                } else if (l0.g(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_FOUND_ERROR")) {
                    c5 = companion.c(new q(), msg, createPublicKeyCredentialDomException);
                } else if (l0.g(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_READABLE_ERROR")) {
                    c5 = companion.c(new r(), msg, createPublicKeyCredentialDomException);
                } else if (l0.g(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_SUPPORTED_ERROR")) {
                    c5 = companion.c(new s(), msg, createPublicKeyCredentialDomException);
                } else if (l0.g(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPERATION_ERROR")) {
                    c5 = companion.c(new t(), msg, createPublicKeyCredentialDomException);
                } else if (l0.g(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPT_OUT_ERROR")) {
                    c5 = companion.c(new u(), msg, createPublicKeyCredentialDomException);
                } else if (l0.g(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_QUOTA_EXCEEDED_ERROR")) {
                    c5 = companion.c(new v(), msg, createPublicKeyCredentialDomException);
                } else if (l0.g(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_READ_ONLY_ERROR")) {
                    c5 = companion.c(new w(), msg, createPublicKeyCredentialDomException);
                } else if (l0.g(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SECURITY_ERROR")) {
                    c5 = companion.c(new x(), msg, createPublicKeyCredentialDomException);
                } else if (l0.g(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SYNTAX_ERROR")) {
                    c5 = companion.c(new y(), msg, createPublicKeyCredentialDomException);
                } else if (l0.g(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TIMEOUT_ERROR")) {
                    c5 = companion.c(new z(), msg, createPublicKeyCredentialDomException);
                } else if (l0.g(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TRANSACTION_INACTIVE_ERROR")) {
                    c5 = companion.c(new a0(), msg, createPublicKeyCredentialDomException);
                } else if (l0.g(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_UNKNOWN_ERROR")) {
                    c5 = companion.c(new b0(), msg, createPublicKeyCredentialDomException);
                } else if (l0.g(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_VERSION_ERROR")) {
                    c5 = companion.c(new c0(), msg, createPublicKeyCredentialDomException);
                } else {
                    if (!l0.g(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_WRONG_DOCUMENT_ERROR")) {
                        throw new FrameworkClassParsingException();
                    }
                    c5 = companion.c(new d0(), msg, createPublicKeyCredentialDomException);
                }
                return (CreateCredentialException) c5;
            } catch (FrameworkClassParsingException unused) {
                return new CreateCredentialCustomException(type, msg);
            }
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @kd.j
    public CreatePublicKeyCredentialDomException(@l e domError) {
        this(domError, null, 2, 0 == true ? 1 : 0);
        l0.p(domError, "domError");
    }

    @l
    @n
    @c1({c1.a.LIBRARY})
    public static final CreateCredentialException c(@l String str, @m String str2) {
        return INSTANCE.a(str, str2);
    }

    @l
    /* renamed from: d, reason: from getter */
    public final e getDomError() {
        return this.domError;
    }

    public /* synthetic */ CreatePublicKeyCredentialDomException(e eVar, CharSequence charSequence, int i4, kotlin.jvm.internal.w wVar) {
        this(eVar, (i4 & 2) != 0 ? null : charSequence);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @kd.j
    public CreatePublicKeyCredentialDomException(@l e domError, @m CharSequence charSequence) {
        super("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/" + domError.getType(), charSequence);
        l0.p(domError, "domError");
        this.domError = domError;
    }
}
