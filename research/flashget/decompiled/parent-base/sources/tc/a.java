package tc;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Iterator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class a {
    public static /* synthetic */ String a(CharSequence charSequence, Iterable iterable) {
        if (charSequence == null) {
            throw new NullPointerException(ProtectedSandApp.s("ꌛ\u0001"));
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            while (true) {
                sb.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb.append(charSequence);
            }
        }
        return sb.toString();
    }
}
