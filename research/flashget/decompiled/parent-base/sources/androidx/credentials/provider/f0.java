package androidx.credentials.provider;

import android.app.slice.Slice;
import android.app.slice.SliceSpec;
import android.os.Build;
import android.service.credentials.CredentialEntry;
import androidx.annotation.c1;
import kotlin.Metadata;

/* compiled from: CredentialEntry.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b&\u0018\u0000 \u000f2\u00020\u0001:\u0002\r\u0011B5\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018¨\u0006\u001c"}, d2 = {"Landroidx/credentials/provider/f0;", "", "", "type", "Landroidx/credentials/provider/u;", "beginGetCredentialOption", "", "entryGroupId", "", "isDefaultIconPreferredAsSingleProvider", "affiliatedDomain", "<init>", "(Ljava/lang/String;Landroidx/credentials/provider/u;Ljava/lang/CharSequence;ZLjava/lang/CharSequence;)V", "a", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "b", "Landroidx/credentials/provider/u;", "d", "()Landroidx/credentials/provider/u;", "c", "Ljava/lang/CharSequence;", "e", "()Ljava/lang/CharSequence;", "Z", "g", "()Z", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class f0 {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String type;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final u beginGetCredentialOption;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final CharSequence entryGroupId;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean isDefaultIconPreferredAsSingleProvider;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final CharSequence affiliatedDomain;

    /* compiled from: CredentialEntry.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/credentials/provider/f0$a;", "", "<init>", "()V", "Landroid/service/credentials/CredentialEntry;", "credentialEntry", "Landroidx/credentials/provider/f0;", "a", "(Landroid/service/credentials/CredentialEntry;)Landroidx/credentials/provider/f0;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.annotation.x0(34)
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        @fg.l
        public static final a f28047a = new a();

        private a() {
        }

        @fg.m
        @kd.n
        public static final f0 a(@fg.l CredentialEntry credentialEntry) {
            kotlin.jvm.internal.l0.p(credentialEntry, "credentialEntry");
            Slice slice = credentialEntry.getSlice();
            kotlin.jvm.internal.l0.o(slice, "credentialEntry.slice");
            return f0.INSTANCE.b(slice);
        }
    }

    /* compiled from: CredentialEntry.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/credentials/provider/f0$b;", "", "<init>", "()V", "Landroid/service/credentials/CredentialEntry;", "credentialEntry", "Landroidx/credentials/provider/f0;", "a", "(Landroid/service/credentials/CredentialEntry;)Landroidx/credentials/provider/f0;", "Landroid/app/slice/Slice;", "slice", "b", "(Landroid/app/slice/Slice;)Landroidx/credentials/provider/f0;", "entry", "c", "(Landroidx/credentials/provider/f0;)Landroid/app/slice/Slice;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.credentials.provider.f0$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.m
        @kd.n
        public final f0 a(@fg.l CredentialEntry credentialEntry) {
            kotlin.jvm.internal.l0.p(credentialEntry, "credentialEntry");
            if (Build.VERSION.SDK_INT >= 34) {
                return a.a(credentialEntry);
            }
            return null;
        }

        @fg.m
        @kd.n
        @androidx.annotation.c1({c1.a.LIBRARY})
        @androidx.annotation.x0(28)
        public final f0 b(@fg.l Slice slice) {
            SliceSpec spec;
            kotlin.jvm.internal.l0.p(slice, "slice");
            try {
                spec = slice.getSpec();
                String type = spec != null ? spec.getType() : null;
                if (kotlin.jvm.internal.l0.g(type, "android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
                    z0 b5 = z0.INSTANCE.b(slice);
                    kotlin.jvm.internal.l0.m(b5);
                    return b5;
                }
                if (kotlin.jvm.internal.l0.g(type, "androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
                    f2 b6 = f2.INSTANCE.b(slice);
                    kotlin.jvm.internal.l0.m(b6);
                    return b6;
                }
                q0 b7 = q0.INSTANCE.b(slice);
                kotlin.jvm.internal.l0.m(b7);
                return b7;
            } catch (Exception unused) {
                return q0.INSTANCE.b(slice);
            }
        }

        @fg.m
        @kd.n
        @androidx.annotation.x0(28)
        public final Slice c(@fg.l f0 entry) {
            kotlin.jvm.internal.l0.p(entry, "entry");
            if (entry instanceof z0) {
                return z0.INSTANCE.c((z0) entry);
            }
            if (entry instanceof f2) {
                return f2.INSTANCE.c((f2) entry);
            }
            if (entry instanceof q0) {
                return q0.INSTANCE.c((q0) entry);
            }
            return null;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    public f0(@fg.l String type, @fg.l u beginGetCredentialOption, @fg.l CharSequence entryGroupId, boolean z4, @fg.m CharSequence charSequence) {
        kotlin.jvm.internal.l0.p(type, "type");
        kotlin.jvm.internal.l0.p(beginGetCredentialOption, "beginGetCredentialOption");
        kotlin.jvm.internal.l0.p(entryGroupId, "entryGroupId");
        this.type = type;
        this.beginGetCredentialOption = beginGetCredentialOption;
        this.entryGroupId = entryGroupId;
        this.isDefaultIconPreferredAsSingleProvider = z4;
        this.affiliatedDomain = charSequence;
    }

    @fg.m
    @kd.n
    public static final f0 a(@fg.l CredentialEntry credentialEntry) {
        return INSTANCE.a(credentialEntry);
    }

    @fg.m
    @kd.n
    @androidx.annotation.c1({c1.a.LIBRARY})
    @androidx.annotation.x0(28)
    public static final f0 b(@fg.l Slice slice) {
        return INSTANCE.b(slice);
    }

    @fg.m
    @kd.n
    @androidx.annotation.x0(28)
    public static final Slice h(@fg.l f0 f0Var) {
        return INSTANCE.c(f0Var);
    }

    @fg.m
    /* renamed from: c, reason: from getter */
    public final CharSequence getAffiliatedDomain() {
        return this.affiliatedDomain;
    }

    @fg.l
    /* renamed from: d, reason: from getter */
    public final u getBeginGetCredentialOption() {
        return this.beginGetCredentialOption;
    }

    @fg.l
    /* renamed from: e, reason: from getter */
    public final CharSequence getEntryGroupId() {
        return this.entryGroupId;
    }

    @fg.l
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP})
    /* renamed from: f, reason: from getter */
    public String getType() {
        return this.type;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getIsDefaultIconPreferredAsSingleProvider() {
        return this.isDefaultIconPreferredAsSingleProvider;
    }

    public /* synthetic */ f0(String str, u uVar, CharSequence charSequence, boolean z4, CharSequence charSequence2, int i4, kotlin.jvm.internal.w wVar) {
        this(str, uVar, charSequence, z4, (i4 & 16) != 0 ? null : charSequence2);
    }
}
