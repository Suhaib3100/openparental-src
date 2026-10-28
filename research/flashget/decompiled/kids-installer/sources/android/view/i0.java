package android.view;

import androidx.annotation.c1;
import java.util.HashMap;
import java.util.Map;

/* compiled from: MethodCallsLogger.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class i0 {

    /* renamed from: a, reason: collision with root package name */
    private Map<String, Integer> f8587a = new HashMap();

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public boolean a(String str, int i5) {
        Integer num = this.f8587a.get(str);
        int intValue = num != null ? num.intValue() : 0;
        boolean z5 = (intValue & i5) != 0;
        this.f8587a.put(str, Integer.valueOf(i5 | intValue));
        return !z5;
    }
}
