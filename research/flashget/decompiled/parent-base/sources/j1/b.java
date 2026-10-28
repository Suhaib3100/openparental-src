package j1;

import androidx.annotation.c1;
import fg.l;
import kd.n;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import org.json.JSONObject;

/* compiled from: RequestValidationHelper.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lj1/b;", "", "<init>", "()V", "a", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    public static final Companion INSTANCE = new Companion();

    /* compiled from: RequestValidationHelper.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lj1/b$a;", "", "<init>", "()V", "", "jsonString", "", "a", "(Ljava/lang/String;)Z", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: j1.b$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @n
        @c1({c1.a.LIBRARY})
        public final boolean a(@l String jsonString) {
            l0.p(jsonString, "jsonString");
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

        public Companion(w wVar) {
        }
    }

    @n
    @c1({c1.a.LIBRARY})
    public static final boolean a(@l String str) {
        return INSTANCE.a(str);
    }
}
