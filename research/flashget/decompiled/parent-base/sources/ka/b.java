package ka;

import android.os.Trace;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.d;
import com.google.firebase.components.g;
import com.google.firebase.components.i;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ComponentMonitor.java */
/* loaded from: classes6.dex */
public class b implements i {
    /* JADX INFO: Access modifiers changed from: private */
    public static Object c(String str, com.google.firebase.components.c cVar, d dVar) {
        try {
            Trace.beginSection(str);
            return cVar.k().a(dVar);
        } finally {
            Trace.endSection();
        }
    }

    @Override // com.google.firebase.components.i
    public List<com.google.firebase.components.c<?>> a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (final com.google.firebase.components.c<?> cVar : componentRegistrar.getComponents()) {
            final String l4 = cVar.l();
            if (l4 != null) {
                cVar = cVar.E(new g() { // from class: ka.a
                    @Override // com.google.firebase.components.g
                    public final Object a(d dVar) {
                        Object c5;
                        c5 = b.c(l4, cVar, dVar);
                        return c5;
                    }
                });
            }
            arrayList.add(cVar);
        }
        return arrayList;
    }
}
