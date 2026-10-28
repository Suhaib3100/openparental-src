package androidx.view;

import androidx.annotation.c1;
import fg.l;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: MethodCallsLogger.kt */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\nR \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\f¨\u0006\u000e"}, d2 = {"Landroidx/lifecycle/n0;", "", "<init>", "()V", "", "name", "", "type", "", "a", "(Ljava/lang/String;I)Z", "", "Ljava/util/Map;", "calledMethods", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public class n0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final Map<String, Integer> calledMethods = new HashMap();

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public boolean a(@l String name, int type) {
        l0.p(name, "name");
        Integer num = this.calledMethods.get(name);
        int intValue = num != null ? num.intValue() : 0;
        boolean z4 = (intValue & type) != 0;
        this.calledMethods.put(name, Integer.valueOf(type | intValue));
        return !z4;
    }
}
