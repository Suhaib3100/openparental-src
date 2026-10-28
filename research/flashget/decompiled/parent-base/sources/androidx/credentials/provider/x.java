package androidx.credentials.provider;

import android.os.Bundle;
import kotlin.Metadata;

/* compiled from: BeginGetCustomCredentialOption.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 \t2\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Landroidx/credentials/provider/x;", "Landroidx/credentials/provider/u;", "", "id", "type", "Landroid/os/Bundle;", "candidateQueryData", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V", "e", "a", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nBeginGetCustomCredentialOption.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BeginGetCustomCredentialOption.kt\nandroidx/credentials/provider/BeginGetCustomCredentialOption\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,67:1\n1#2:68\n*E\n"})
/* loaded from: classes3.dex */
public class x extends u {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* compiled from: BeginGetCustomCredentialOption.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Landroidx/credentials/provider/x$a;", "", "<init>", "()V", "Landroid/os/Bundle;", "data", "", "id", "type", "Landroidx/credentials/provider/x;", "a", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/provider/x;", "b", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.credentials.provider.x$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        @kd.n
        public final x a(@fg.l Bundle data, @fg.l String id2, @fg.l String type) {
            kotlin.jvm.internal.l0.p(data, "data");
            kotlin.jvm.internal.l0.p(id2, "id");
            kotlin.jvm.internal.l0.p(type, "type");
            return new x(id2, type, data);
        }

        @fg.l
        @kd.n
        public final x b(@fg.l Bundle data, @fg.l String id2, @fg.l String type) {
            kotlin.jvm.internal.l0.p(data, "data");
            kotlin.jvm.internal.l0.p(id2, "id");
            kotlin.jvm.internal.l0.p(type, "type");
            return new x(id2, type, data);
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(@fg.l String id2, @fg.l String type, @fg.l Bundle candidateQueryData) {
        super(id2, type, candidateQueryData);
        kotlin.jvm.internal.l0.p(id2, "id");
        kotlin.jvm.internal.l0.p(type, "type");
        kotlin.jvm.internal.l0.p(candidateQueryData, "candidateQueryData");
        if (id2.length() <= 0) {
            throw new IllegalArgumentException("id should not be empty");
        }
        if (type.length() <= 0) {
            throw new IllegalArgumentException("type should not be empty");
        }
    }

    @fg.l
    @kd.n
    public static final x e(@fg.l Bundle bundle, @fg.l String str, @fg.l String str2) {
        return INSTANCE.a(bundle, str, str2);
    }

    @fg.l
    @kd.n
    public static final x f(@fg.l Bundle bundle, @fg.l String str, @fg.l String str2) {
        return INSTANCE.b(bundle, str, str2);
    }
}
