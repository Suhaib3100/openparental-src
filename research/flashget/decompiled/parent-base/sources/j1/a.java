package j1;

import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import androidx.annotation.c1;
import androidx.annotation.x0;
import androidx.credentials.f;
import androidx.credentials.h;
import androidx.credentials.t1;
import fg.l;
import kd.n;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;

/* compiled from: FrameworkImplHelper.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lj1/a;", "", "<init>", "()V", "a", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@x0(23)
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    public static final Companion INSTANCE = new Companion();

    /* compiled from: FrameworkImplHelper.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lj1/a$a;", "", "<init>", "()V", "Landroidx/credentials/b;", "request", "Landroid/content/Context;", "context", "Landroid/os/Bundle;", "a", "(Landroidx/credentials/b;Landroid/content/Context;)Landroid/os/Bundle;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: j1.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @l
        @n
        @c1({c1.a.LIBRARY})
        @x0(23)
        public final Bundle a(@l androidx.credentials.b request, @l Context context) {
            l0.p(request, "request");
            l0.p(context, "context");
            Bundle credentialData = request.getCredentialData();
            Bundle f4 = request.getDisplayInfo().f();
            f4.putParcelable("androidx.credentials.BUNDLE_KEY_CREDENTIAL_TYPE_ICON", Icon.createWithResource(context, request instanceof f ? t1.a.f28280c : request instanceof h ? t1.a.f28279b : t1.a.f28278a));
            credentialData.putBundle("androidx.credentials.BUNDLE_KEY_REQUEST_DISPLAY_INFO", f4);
            return credentialData;
        }

        public Companion(w wVar) {
        }
    }

    @l
    @n
    @c1({c1.a.LIBRARY})
    @x0(23)
    public static final Bundle a(@l androidx.credentials.b bVar, @l Context context) {
        return INSTANCE.a(bVar, context);
    }
}
