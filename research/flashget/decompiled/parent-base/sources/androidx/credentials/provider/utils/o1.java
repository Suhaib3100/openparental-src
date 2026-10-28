package androidx.credentials.provider.utils;

import android.os.Build;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: PrivilegedApp.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u0000 \f2\u00020\u0001:\u0001\bB\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ*\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, d2 = {"Landroidx/credentials/provider/utils/o1;", "", "", "packageName", "", "fingerprints", "<init>", "(Ljava/lang/String;Ljava/util/Set;)V", "a", "()Ljava/lang/String;", "b", "()Ljava/util/Set;", "c", "(Ljava/lang/String;Ljava/util/Set;)Landroidx/credentials/provider/utils/o1;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "h", "Ljava/util/Set;", "g", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class o1 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String packageName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Set<String> fingerprints;

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private static final String f28174d = "package_name";

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private static final String f28175e = "signatures";

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    private static final String f28176f = "cert_fingerprint_sha256";

    /* renamed from: g, reason: collision with root package name */
    @fg.l
    private static final String f28177g = "build";

    /* renamed from: h, reason: collision with root package name */
    @fg.l
    private static final String f28178h = "userdebug";

    /* renamed from: i, reason: collision with root package name */
    @fg.l
    private static final String f28179i = "type";

    /* renamed from: j, reason: collision with root package name */
    @fg.l
    private static final String f28180j = "info";

    /* renamed from: k, reason: collision with root package name */
    @fg.l
    private static final String f28181k = "android";

    /* renamed from: l, reason: collision with root package name */
    @fg.l
    private static final String f28182l = "userdebug";

    /* renamed from: m, reason: collision with root package name */
    @fg.l
    private static final String f28183m = "apps";

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* compiled from: PrivilegedApp.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011R\u0014\u0010\u0017\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011R\u0014\u0010\u0018\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0011R\u0014\u0010\u0019\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0011R\u0014\u0010\u001a\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0011¨\u0006\u001b"}, d2 = {"Landroidx/credentials/provider/utils/o1$a;", "", "<init>", "()V", "Lorg/json/JSONObject;", "jsonObject", "", "Landroidx/credentials/provider/utils/o1;", "b", "(Lorg/json/JSONObject;)Ljava/util/List;", "appInfoJsonObject", "", "filterUserDebug", "a", "(Lorg/json/JSONObject;Z)Landroidx/credentials/provider/utils/o1;", "", "ANDROID_TYPE_KEY", "Ljava/lang/String;", "APPS_KEY", "APP_INFO_KEY", "BUILD_KEY", "FINGERPRINT_KEY", "PACKAGE_NAME_KEY", "SIGNATURES_KEY", "TYPE_KEY", "USER_BUILD_TYPE", "USER_DEBUG_KEY", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.credentials.provider.utils.o1$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        @kd.n
        public final o1 a(@fg.l JSONObject appInfoJsonObject, boolean filterUserDebug) {
            kotlin.jvm.internal.l0.p(appInfoJsonObject, "appInfoJsonObject");
            JSONArray jSONArray = appInfoJsonObject.getJSONArray("signatures");
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int length = jSONArray.length();
            for (int i4 = 0; i4 < length; i4++) {
                if (!filterUserDebug || !kotlin.jvm.internal.l0.g("userdebug", jSONArray.getJSONObject(i4).optString("build")) || kotlin.jvm.internal.l0.g("userdebug", Build.TYPE)) {
                    String string = jSONArray.getJSONObject(i4).getString("cert_fingerprint_sha256");
                    kotlin.jvm.internal.l0.o(string, "signaturesJson.getJSONOb…etString(FINGERPRINT_KEY)");
                    linkedHashSet.add(string);
                }
            }
            String string2 = appInfoJsonObject.getString("package_name");
            kotlin.jvm.internal.l0.o(string2, "appInfoJsonObject.getString(PACKAGE_NAME_KEY)");
            return new o1(string2, linkedHashSet);
        }

        @fg.l
        @kd.n
        public final List<o1> b(@fg.l JSONObject jsonObject) {
            kotlin.jvm.internal.l0.p(jsonObject, "jsonObject");
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = jsonObject.getJSONArray("apps");
            int length = jSONArray.length();
            for (int i4 = 0; i4 < length; i4++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i4);
                if (kotlin.jvm.internal.l0.g(jSONObject.getString("type"), "android")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("info");
                    kotlin.jvm.internal.l0.o(jSONObject2, "appJsonObject.getJSONObject(APP_INFO_KEY)");
                    arrayList.add(a(jSONObject2, true));
                }
            }
            return arrayList;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    public o1(@fg.l String packageName, @fg.l Set<String> fingerprints) {
        kotlin.jvm.internal.l0.p(packageName, "packageName");
        kotlin.jvm.internal.l0.p(fingerprints, "fingerprints");
        this.packageName = packageName;
        this.fingerprints = fingerprints;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ o1 d(o1 o1Var, String str, Set set, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = o1Var.packageName;
        }
        if ((i4 & 2) != 0) {
            set = o1Var.fingerprints;
        }
        return o1Var.c(str, set);
    }

    @fg.l
    @kd.n
    public static final o1 e(@fg.l JSONObject jSONObject, boolean z4) {
        return INSTANCE.a(jSONObject, z4);
    }

    @fg.l
    @kd.n
    public static final List<o1> f(@fg.l JSONObject jSONObject) {
        return INSTANCE.b(jSONObject);
    }

    @fg.l
    /* renamed from: a, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    @fg.l
    public final Set<String> b() {
        return this.fingerprints;
    }

    @fg.l
    public final o1 c(@fg.l String packageName, @fg.l Set<String> fingerprints) {
        kotlin.jvm.internal.l0.p(packageName, "packageName");
        kotlin.jvm.internal.l0.p(fingerprints, "fingerprints");
        return new o1(packageName, fingerprints);
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) other;
        return kotlin.jvm.internal.l0.g(this.packageName, o1Var.packageName) && kotlin.jvm.internal.l0.g(this.fingerprints, o1Var.fingerprints);
    }

    @fg.l
    public final Set<String> g() {
        return this.fingerprints;
    }

    @fg.l
    public final String h() {
        return this.packageName;
    }

    public int hashCode() {
        return this.fingerprints.hashCode() + (this.packageName.hashCode() * 31);
    }

    @fg.l
    public String toString() {
        return "PrivilegedApp(packageName=" + this.packageName + ", fingerprints=" + this.fingerprints + ')';
    }
}
