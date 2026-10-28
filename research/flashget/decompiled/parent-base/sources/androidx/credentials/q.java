package androidx.credentials;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.c1;
import com.android.internal.telephony.cdma.UserData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: CredentialProviderFactory.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0003¢\u0006\u0004\b\t\u0010\bJ'\u0010\r\u001a\u0004\u0018\u00010\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R*\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00118G@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR.\u0010$\u001a\u0004\u0018\u00010\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u00068G@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\b\"\u0004\b\"\u0010#R.\u0010'\u001a\u0004\u0018\u00010\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u00068G@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010 \u001a\u0004\b%\u0010\b\"\u0004\b&\u0010#¨\u0006("}, d2 = {"Landroidx/credentials/q;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroidx/credentials/p;", "m", "()Landroidx/credentials/p;", "l", "", "", "classNames", "h", "(Ljava/util/List;Landroid/content/Context;)Landroidx/credentials/p;", "a", "(Landroid/content/Context;)Ljava/util/List;", "", "shouldFallbackToPreU", "b", "(Z)Landroidx/credentials/p;", "Landroid/content/Context;", "d", "()Landroid/content/Context;", "<set-?>", "Z", "e", "()Z", "i", "(Z)V", "testMode", "c", "Landroidx/credentials/p;", "f", "j", "(Landroidx/credentials/p;)V", "testPostUProvider", "g", "k", "testPreUProvider", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class q {

    /* renamed from: g, reason: collision with root package name */
    private static final int f28253g = 33;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Context context;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean testMode;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private p testPostUProvider;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private p testPreUProvider;

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    private static final String f28252f = "CredProviderFactory";

    /* renamed from: h, reason: collision with root package name */
    @fg.l
    private static final String f28254h = "androidx.credentials.CREDENTIAL_PROVIDER_KEY";

    public q(@fg.l Context context) {
        kotlin.jvm.internal.l0.p(context, "context");
        this.context = context;
    }

    private final List<String> a(Context context) {
        String string;
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), UserData.IS91_MSG_TYPE_CLI);
        ArrayList arrayList = new ArrayList();
        ServiceInfo[] serviceInfoArr = packageInfo.services;
        if (serviceInfoArr != null) {
            kotlin.jvm.internal.l0.o(serviceInfoArr, "packageInfo.services");
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                Bundle bundle = serviceInfo.metaData;
                if (bundle != null && (string = bundle.getString("androidx.credentials.CREDENTIAL_PROVIDER_KEY")) != null) {
                    arrayList.add(string);
                }
            }
        }
        return kotlin.collections.w.V5(arrayList);
    }

    public static /* synthetic */ p c(q qVar, boolean z4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z4 = true;
        }
        return qVar.b(z4);
    }

    private final p h(List<String> classNames, Context context) {
        Iterator<String> it = classNames.iterator();
        p pVar = null;
        while (it.hasNext()) {
            try {
                Object newInstance = Class.forName(it.next()).getConstructor(Context.class).newInstance(context);
                kotlin.jvm.internal.l0.n(newInstance, "null cannot be cast to non-null type androidx.credentials.CredentialProvider");
                p pVar2 = (p) newInstance;
                if (!pVar2.isAvailableOnDevice()) {
                    continue;
                } else {
                    if (pVar != null) {
                        return null;
                    }
                    pVar = pVar2;
                }
            } catch (Throwable unused) {
            }
        }
        return pVar;
    }

    @androidx.annotation.x0(34)
    private final p l() {
        if (!this.testMode) {
            x0 x0Var = new x0(this.context);
            if (x0Var.isAvailableOnDevice()) {
                return x0Var;
            }
            return null;
        }
        p pVar = this.testPostUProvider;
        if (pVar == null) {
            return null;
        }
        kotlin.jvm.internal.l0.m(pVar);
        if (pVar.isAvailableOnDevice()) {
            return this.testPostUProvider;
        }
        return null;
    }

    private final p m() {
        if (!this.testMode) {
            List<String> a5 = a(this.context);
            if (a5.isEmpty()) {
                return null;
            }
            return h(a5, this.context);
        }
        p pVar = this.testPreUProvider;
        if (pVar == null) {
            return null;
        }
        kotlin.jvm.internal.l0.m(pVar);
        if (pVar.isAvailableOnDevice()) {
            return this.testPreUProvider;
        }
        return null;
    }

    @fg.m
    public final p b(boolean shouldFallbackToPreU) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 34) {
            p l4 = l();
            return (l4 == null && shouldFallbackToPreU) ? m() : l4;
        }
        if (i4 <= 33) {
            return m();
        }
        return null;
    }

    @fg.l
    /* renamed from: d, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    @androidx.annotation.c1({c1.a.LIBRARY})
    @androidx.annotation.m1
    /* renamed from: e, reason: from getter */
    public final boolean getTestMode() {
        return this.testMode;
    }

    @fg.m
    @androidx.annotation.c1({c1.a.LIBRARY})
    @androidx.annotation.m1
    /* renamed from: f, reason: from getter */
    public final p getTestPostUProvider() {
        return this.testPostUProvider;
    }

    @fg.m
    @androidx.annotation.c1({c1.a.LIBRARY})
    @androidx.annotation.m1
    /* renamed from: g, reason: from getter */
    public final p getTestPreUProvider() {
        return this.testPreUProvider;
    }

    @androidx.annotation.c1({c1.a.LIBRARY})
    @androidx.annotation.m1
    public final void i(boolean z4) {
        this.testMode = z4;
    }

    @androidx.annotation.c1({c1.a.LIBRARY})
    @androidx.annotation.m1
    public final void j(@fg.m p pVar) {
        this.testPostUProvider = pVar;
    }

    @androidx.annotation.c1({c1.a.LIBRARY})
    @androidx.annotation.m1
    public final void k(@fg.m p pVar) {
        this.testPreUProvider = pVar;
    }
}
