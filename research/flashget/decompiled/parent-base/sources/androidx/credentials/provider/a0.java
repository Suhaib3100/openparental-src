package androidx.credentials.provider;

import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import androidx.annotation.c1;
import androidx.compose.material3.s3;
import java.security.MessageDigest;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: CallingAppInfo.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0010\u0018\u0000 \u001d2\u00020\u0001:\u0002\u0018\u0014B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u0018\u0010\u001b¨\u0006\u001f"}, d2 = {"Landroidx/credentials/provider/a0;", "", "", "packageName", "Landroid/content/pm/SigningInfo;", "signingInfo", "origin", "<init>", "(Ljava/lang/String;Landroid/content/pm/SigningInfo;Ljava/lang/String;)V", "", "Landroidx/credentials/provider/utils/o1;", "candidateApps", "", "e", "(Ljava/util/List;)Z", "", "candidateFingerprints", "f", "(Ljava/util/Set;)Z", "privilegedAllowlist", "b", "(Ljava/lang/String;)Ljava/lang/String;", "g", "()Z", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Landroid/content/pm/SigningInfo;", "d", "()Landroid/content/pm/SigningInfo;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nCallingAppInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallingAppInfo.kt\nandroidx/credentials/provider/CallingAppInfo\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,192:1\n1#2:193\n*E\n"})
/* loaded from: classes3.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String packageName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final SigningInfo signingInfo;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final String origin;

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private static final String f27992e = "CallingAppInfo";

    /* compiled from: CallingAppInfo.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ#\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/credentials/provider/a0$b;", "", "Landroid/content/pm/SigningInfo;", "signingInfo", "<init>", "(Landroid/content/pm/SigningInfo;)V", "", "", "b", "()Ljava/util/Set;", "", "Landroid/content/pm/Signature;", "signatures", "a", "([Landroid/content/pm/Signature;)Ljava/util/Set;", "candidateSigFingerprints", "", "c", "(Ljava/util/Set;)Z", "Landroid/content/pm/SigningInfo;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.annotation.x0(28)
    private static final class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final SigningInfo signingInfo;

        /* compiled from: CallingAppInfo.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(B)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<Byte, CharSequence> {

            /* renamed from: b, reason: collision with root package name */
            public static final a f27997b = new a(1);

            a() {
                super(1);
            }

            @fg.l
            public final CharSequence a(byte b5) {
                return s3.a(new Object[]{Byte.valueOf(b5)}, 1, "%02X", "format(this, *args)");
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ CharSequence invoke(Byte b5) {
                return a(b5.byteValue());
            }
        }

        public b(@fg.l SigningInfo signingInfo) {
            kotlin.jvm.internal.l0.p(signingInfo, "signingInfo");
            this.signingInfo = signingInfo;
        }

        private final Set<String> a(Signature[] signatures) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (Signature signature : signatures) {
                byte[] digest = MessageDigest.getInstance("SHA-256").digest(signature.toByteArray());
                kotlin.jvm.internal.l0.o(digest, "digest");
                linkedHashSet.add(kotlin.collections.l.fh(digest, ":", null, null, 0, null, a.f27997b, 30, null));
            }
            return linkedHashSet;
        }

        private final Set<String> b() {
            boolean hasMultipleSigners;
            Signature[] signingCertificateHistory;
            Signature[] signingCertificateHistory2;
            Signature[] apkContentsSigners;
            Signature[] apkContentsSigners2;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            hasMultipleSigners = this.signingInfo.hasMultipleSigners();
            if (hasMultipleSigners) {
                apkContentsSigners = this.signingInfo.getApkContentsSigners();
                if (apkContentsSigners != null) {
                    apkContentsSigners2 = this.signingInfo.getApkContentsSigners();
                    kotlin.jvm.internal.l0.o(apkContentsSigners2, "signingInfo.apkContentsSigners");
                    linkedHashSet.addAll(a(apkContentsSigners2));
                    return linkedHashSet;
                }
            }
            signingCertificateHistory = this.signingInfo.getSigningCertificateHistory();
            if (signingCertificateHistory != null) {
                signingCertificateHistory2 = this.signingInfo.getSigningCertificateHistory();
                Signature signature = signingCertificateHistory2[0];
                kotlin.jvm.internal.l0.o(signature, "signingInfo.signingCertificateHistory[0]");
                linkedHashSet.addAll(a(new Signature[]{signature}));
            }
            return linkedHashSet;
        }

        public final boolean c(@fg.l Set<String> candidateSigFingerprints) {
            boolean hasMultipleSigners;
            kotlin.jvm.internal.l0.p(candidateSigFingerprints, "candidateSigFingerprints");
            Set<String> b5 = b();
            hasMultipleSigners = this.signingInfo.hasMultipleSigners();
            return hasMultipleSigners ? candidateSigFingerprints.containsAll(b5) : !kotlin.collections.w.i3(candidateSigFingerprints, b5).isEmpty();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kd.j
    public a0(@fg.l String packageName, @fg.l SigningInfo signingInfo) {
        this(packageName, signingInfo, null, 4, null);
        kotlin.jvm.internal.l0.p(packageName, "packageName");
        kotlin.jvm.internal.l0.p(signingInfo, "signingInfo");
    }

    private final boolean e(List<androidx.credentials.provider.utils.o1> candidateApps) {
        for (androidx.credentials.provider.utils.o1 o1Var : candidateApps) {
            if (kotlin.jvm.internal.l0.g(o1Var.h(), this.packageName)) {
                return f(o1Var.g());
            }
        }
        return false;
    }

    private final boolean f(Set<String> candidateFingerprints) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new b(this.signingInfo).c(candidateFingerprints);
        }
        return false;
    }

    @fg.m
    @androidx.annotation.c1({c1.a.LIBRARY})
    /* renamed from: a, reason: from getter */
    public final String getOrigin() {
        return this.origin;
    }

    @fg.m
    public final String b(@fg.l String privilegedAllowlist) {
        kotlin.jvm.internal.l0.p(privilegedAllowlist, "privilegedAllowlist");
        if (!androidx.credentials.provider.utils.p1.INSTANCE.a(privilegedAllowlist)) {
            throw new IllegalArgumentException("privilegedAllowlist must not be empty, and must be a valid JSON");
        }
        String str = this.origin;
        if (str == null) {
            return str;
        }
        try {
            if (e(androidx.credentials.provider.utils.o1.INSTANCE.b(new JSONObject(privilegedAllowlist)))) {
                return this.origin;
            }
            throw new IllegalStateException("Origin is not being returned as the calling app did notmatch the privileged allowlist");
        } catch (JSONException unused) {
            throw new IllegalArgumentException("privilegedAllowlist must be formatted properly");
        }
    }

    @fg.l
    /* renamed from: c, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    @fg.l
    /* renamed from: d, reason: from getter */
    public final SigningInfo getSigningInfo() {
        return this.signingInfo;
    }

    public final boolean g() {
        return this.origin != null;
    }

    @kd.j
    public a0(@fg.l String packageName, @fg.l SigningInfo signingInfo, @fg.m String str) {
        kotlin.jvm.internal.l0.p(packageName, "packageName");
        kotlin.jvm.internal.l0.p(signingInfo, "signingInfo");
        this.packageName = packageName;
        this.signingInfo = signingInfo;
        this.origin = str;
        if (packageName.length() <= 0) {
            throw new IllegalArgumentException("packageName must not be empty");
        }
    }

    public /* synthetic */ a0(String str, SigningInfo signingInfo, String str2, int i4, kotlin.jvm.internal.w wVar) {
        this(str, signingInfo, (i4 & 4) != 0 ? null : str2);
    }
}
