package androidx.credentials;

import android.os.Bundle;
import androidx.annotation.c1;
import androidx.credentials.internal.FrameworkClassParsingException;
import kotlin.Metadata;

/* compiled from: CreateCredentialResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u0000 \n2\u00020\u0001:\u0001\bB\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/credentials/c;", "", "", "type", "Landroid/os/Bundle;", "data", "<init>", "(Ljava/lang/String;Landroid/os/Bundle;)V", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", "Landroid/os/Bundle;", "()Landroid/os/Bundle;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class c {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String type;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Bundle data;

    /* compiled from: CreateCredentialResponse.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/credentials/c$a;", "", "<init>", "()V", "", "type", "Landroid/os/Bundle;", "data", "Landroidx/credentials/c;", "a", "(Ljava/lang/String;Landroid/os/Bundle;)Landroidx/credentials/c;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.credentials.c$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        @kd.n
        @androidx.annotation.c1({c1.a.LIBRARY})
        public final c a(@fg.l String type, @fg.l Bundle data) {
            kotlin.jvm.internal.l0.p(type, "type");
            kotlin.jvm.internal.l0.p(data, "data");
            try {
                if (kotlin.jvm.internal.l0.g(type, "android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
                    return g.INSTANCE.a(data);
                }
                if (kotlin.jvm.internal.l0.g(type, "androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
                    return i.INSTANCE.a(data);
                }
                throw new FrameworkClassParsingException();
            } catch (FrameworkClassParsingException unused) {
                return new e(type, data);
            }
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    public c(@fg.l String type, @fg.l Bundle data) {
        kotlin.jvm.internal.l0.p(type, "type");
        kotlin.jvm.internal.l0.p(data, "data");
        this.type = type;
        this.data = data;
    }

    @fg.l
    @kd.n
    @androidx.annotation.c1({c1.a.LIBRARY})
    public static final c a(@fg.l String str, @fg.l Bundle bundle) {
        return INSTANCE.a(str, bundle);
    }

    @fg.l
    /* renamed from: b, reason: from getter */
    public final Bundle getData() {
        return this.data;
    }

    @fg.l
    /* renamed from: c, reason: from getter */
    public final String getType() {
        return this.type;
    }
}
