package androidx.view.compose;

import android.content.Context;
import android.content.ContextWrapper;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: ActivityComposeUtils.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\"\u0010\u0003\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0080\b¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"T", "Landroid/content/Context;", "context", "a", "(Landroid/content/Context;)Ljava/lang/Object;", "activity-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a {
    public static final <T> T a(Context context) {
        for (Object obj = context; obj instanceof ContextWrapper; obj = (T) ((ContextWrapper) obj).getBaseContext()) {
            l0.P();
            if (obj != null) {
                return (T) obj;
            }
        }
        return null;
    }
}
