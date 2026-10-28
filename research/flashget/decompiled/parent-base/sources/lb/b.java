package lb;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: CompositionTimeSampleExtension.java */
/* loaded from: classes6.dex */
public class b implements com.mp4parser.streaming.b {

    /* renamed from: b, reason: collision with root package name */
    public static Map<Integer, b> f81444b = Collections.synchronizedMap(new HashMap());

    /* renamed from: a, reason: collision with root package name */
    private int f81445a;

    public static b a(int i4) {
        b bVar = f81444b.get(Integer.valueOf(i4));
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b();
        bVar2.f81445a = i4;
        f81444b.put(Integer.valueOf(i4), bVar2);
        return bVar2;
    }

    public int b() {
        return this.f81445a;
    }
}
