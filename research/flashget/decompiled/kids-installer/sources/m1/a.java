package m1;

import android.util.SparseArray;
import androidx.annotation.o0;
import androidx.appcompat.view.menu.s;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.datatransport.e;
import java.util.HashMap;

/* compiled from: PriorityMapping.java */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static SparseArray<e> f29120a = new SparseArray<>();

    /* renamed from: b, reason: collision with root package name */
    private static HashMap<e, Integer> f29121b;

    static {
        HashMap<e, Integer> hashMap = new HashMap<>();
        f29121b = hashMap;
        hashMap.put(e.DEFAULT, 0);
        f29121b.put(e.VERY_LOW, 1);
        f29121b.put(e.HIGHEST, 2);
        for (e eVar : f29121b.keySet()) {
            f29120a.append(f29121b.get(eVar).intValue(), eVar);
        }
    }

    public static int a(@o0 e eVar) {
        Integer num = f29121b.get(eVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException(ProtectedSandApp.s("᭑") + eVar);
    }

    @o0
    public static e b(int i5) {
        e eVar = f29120a.get(i5);
        if (eVar != null) {
            return eVar;
        }
        throw new IllegalArgumentException(s.a(ProtectedSandApp.s("᭒"), i5));
    }
}
