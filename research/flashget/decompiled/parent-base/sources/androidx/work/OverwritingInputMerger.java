package androidx.work;

import androidx.annotation.o0;
import androidx.work.f;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class OverwritingInputMerger extends o {
    @Override // androidx.work.o
    @o0
    public f b(@o0 List<f> inputs) {
        f.a aVar = new f.a();
        HashMap hashMap = new HashMap();
        Iterator<f> it = inputs.iterator();
        while (it.hasNext()) {
            hashMap.putAll(Collections.unmodifiableMap(it.next().f35971a));
        }
        aVar.d(hashMap);
        return aVar.a();
    }
}
