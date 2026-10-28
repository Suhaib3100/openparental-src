package androidx.credentials.exceptions.publickeycredential;

import androidx.annotation.c1;
import androidx.credentials.internal.FrameworkClassParsingException;
import fg.l;
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
import h1.m;
import h1.n;
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
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: DomExceptionUtils.kt */
@c1({c1.a.LIBRARY})
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/credentials/exceptions/publickeycredential/a;", "", "<init>", "()V", "a", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public static final String f27691b = "/";

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    public static final Companion INSTANCE = new Companion();

    /* compiled from: DomExceptionUtils.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000bJ:\u0010\u000e\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0004\u0018\u00012\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00028\u0000H\u0081\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/credentials/exceptions/publickeycredential/a$a;", "", "<init>", "()V", "T", "Lh1/e;", "domError", "", "msg", "t", "c", "(Lh1/e;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "type", "prefix", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "SEPARATOR", "Ljava/lang/String;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.credentials.exceptions.publickeycredential.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final <T> T c(e domError, String msg, T t4) {
            if (t4 instanceof CreatePublicKeyCredentialDomException) {
                return (T) new CreatePublicKeyCredentialDomException(domError, msg);
            }
            if (t4 instanceof GetPublicKeyCredentialDomException) {
                return (T) new GetPublicKeyCredentialDomException(domError, msg);
            }
            throw new FrameworkClassParsingException();
        }

        @c1({c1.a.LIBRARY})
        public final /* synthetic */ <T> T b(String type, String prefix, String msg, T t4) {
            l0.p(type, "type");
            l0.p(prefix, "prefix");
            if (l0.g(type, prefix + "androidx.credentials.TYPE_ABORT_ERROR")) {
                return (T) c(new h1.a(), msg, t4);
            }
            if (i1.a.a(prefix, "androidx.credentials.TYPE_CONSTRAINT_ERROR", type)) {
                return (T) c(new b(), msg, t4);
            }
            if (i1.a.a(prefix, "androidx.credentials.TYPE_DATA_CLONE_ERROR", type)) {
                return (T) c(new c(), msg, t4);
            }
            if (i1.a.a(prefix, "androidx.credentials.TYPE_DATA_ERROR", type)) {
                return (T) c(new d(), msg, t4);
            }
            if (i1.a.a(prefix, "androidx.credentials.TYPE_ENCODING_ERROR", type)) {
                return (T) c(new f(), msg, t4);
            }
            if (i1.a.a(prefix, "androidx.credentials.TYPE_HIERARCHY_REQUEST_ERROR", type)) {
                return (T) c(new g(), msg, t4);
            }
            if (i1.a.a(prefix, "androidx.credentials.TYPE_IN_USE_ATTRIBUTE_ERROR", type)) {
                return (T) c(new h(), msg, t4);
            }
            if (i1.a.a(prefix, "androidx.credentials.TYPE_INVALID_CHARACTER_ERROR", type)) {
                return (T) c(new i(), msg, t4);
            }
            if (i1.a.a(prefix, "androidx.credentials.TYPE_INVALID_MODIFICATION_ERROR", type)) {
                return (T) c(new j(), msg, t4);
            }
            if (i1.a.a(prefix, "androidx.credentials.TYPE_INVALID_NODE_TYPE_ERROR", type)) {
                return (T) c(new k(), msg, t4);
            }
            if (i1.a.a(prefix, "androidx.credentials.TYPE_INVALID_STATE_ERROR", type)) {
                return (T) c(new h1.l(), msg, t4);
            }
            if (i1.a.a(prefix, "androidx.credentials.TYPE_NAMESPACE_ERROR", type)) {
                return (T) c(new m(), msg, t4);
            }
            if (i1.a.a(prefix, "androidx.credentials.TYPE_NETWORK_ERROR", type)) {
                return (T) c(new n(), msg, t4);
            }
            if (i1.a.a(prefix, "androidx.credentials.TYPE_NO_MODIFICATION_ALLOWED_ERROR", type)) {
                return (T) c(new o(), msg, t4);
            }
            if (i1.a.a(prefix, "androidx.credentials.TYPE_NOT_ALLOWED_ERROR", type)) {
                return (T) c(new p(), msg, t4);
            }
            if (i1.a.a(prefix, "androidx.credentials.TYPE_NOT_FOUND_ERROR", type)) {
                return (T) c(new q(), msg, t4);
            }
            if (i1.a.a(prefix, "androidx.credentials.TYPE_NOT_READABLE_ERROR", type)) {
                return (T) c(new r(), msg, t4);
            }
            if (i1.a.a(prefix, "androidx.credentials.TYPE_NOT_SUPPORTED_ERROR", type)) {
                return (T) c(new s(), msg, t4);
            }
            if (i1.a.a(prefix, "androidx.credentials.TYPE_OPERATION_ERROR", type)) {
                return (T) c(new t(), msg, t4);
            }
            if (i1.a.a(prefix, "androidx.credentials.TYPE_OPT_OUT_ERROR", type)) {
                return (T) c(new u(), msg, t4);
            }
            if (i1.a.a(prefix, "androidx.credentials.TYPE_QUOTA_EXCEEDED_ERROR", type)) {
                return (T) c(new v(), msg, t4);
            }
            if (i1.a.a(prefix, "androidx.credentials.TYPE_READ_ONLY_ERROR", type)) {
                return (T) c(new w(), msg, t4);
            }
            if (i1.a.a(prefix, "androidx.credentials.TYPE_SECURITY_ERROR", type)) {
                return (T) c(new x(), msg, t4);
            }
            if (i1.a.a(prefix, "androidx.credentials.TYPE_SYNTAX_ERROR", type)) {
                return (T) c(new y(), msg, t4);
            }
            if (i1.a.a(prefix, "androidx.credentials.TYPE_TIMEOUT_ERROR", type)) {
                return (T) c(new z(), msg, t4);
            }
            if (i1.a.a(prefix, "androidx.credentials.TYPE_TRANSACTION_INACTIVE_ERROR", type)) {
                return (T) c(new a0(), msg, t4);
            }
            if (i1.a.a(prefix, "androidx.credentials.TYPE_UNKNOWN_ERROR", type)) {
                return (T) c(new b0(), msg, t4);
            }
            if (i1.a.a(prefix, "androidx.credentials.TYPE_VERSION_ERROR", type)) {
                return (T) c(new c0(), msg, t4);
            }
            if (i1.a.a(prefix, "androidx.credentials.TYPE_WRONG_DOCUMENT_ERROR", type)) {
                return (T) c(new d0(), msg, t4);
            }
            throw new FrameworkClassParsingException();
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }
}
