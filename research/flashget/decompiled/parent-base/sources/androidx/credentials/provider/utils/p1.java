package androidx.credentials.provider.utils;

import androidx.annotation.c1;
import kotlin.Metadata;
import org.json.JSONObject;

/* compiled from: RequestValidationUtil.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/credentials/provider/utils/p1;", "", "<init>", "()V", "a", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class p1 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* compiled from: RequestValidationUtil.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/credentials/provider/utils/p1$a;", "", "<init>", "()V", "", "jsonString", "", "a", "(Ljava/lang/String;)Z", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.credentials.provider.utils.p1$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @kd.n
        @androidx.annotation.c1({c1.a.LIBRARY})
        public final boolean a(@fg.l String jsonString) {
            kotlin.jvm.internal.l0.p(jsonString, "jsonString");
            if (jsonString.length() == 0) {
                return false;
            }
            try {
                new JSONObject(jsonString);
                return true;
            } catch (Exception unused) {
                return false;
            }
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    @kd.n
    @androidx.annotation.c1({c1.a.LIBRARY})
    public static final boolean a(@fg.l String str) {
        return INSTANCE.a(str);
    }
}
