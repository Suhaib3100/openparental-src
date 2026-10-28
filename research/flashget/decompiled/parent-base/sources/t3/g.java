package t3;

import com.annimon.stream.function.q;
import java.util.Calendar;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements q {
    @Override // com.annimon.stream.function.q
    public final Object apply(Object obj) {
        return Long.valueOf(((Calendar) obj).getTimeInMillis());
    }
}
