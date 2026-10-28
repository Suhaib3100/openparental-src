package b5;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: OnViewChangedNotifier.java */
/* loaded from: classes5.dex */
public class c {

    /* renamed from: b, reason: collision with root package name */
    private static c f10549b;

    /* renamed from: a, reason: collision with root package name */
    private final Set<b> f10550a = new LinkedHashSet();

    public static void b(b bVar) {
        c cVar = f10549b;
        if (cVar != null) {
            cVar.f10550a.add(bVar);
        }
    }

    public static c c(c cVar) {
        c cVar2 = f10549b;
        f10549b = cVar;
        return cVar2;
    }

    public void a(a aVar) {
        Iterator<b> it = this.f10550a.iterator();
        while (it.hasNext()) {
            it.next().o(aVar);
        }
    }
}
