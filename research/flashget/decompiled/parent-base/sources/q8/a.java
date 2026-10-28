package q8;

import android.util.SparseArray;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.datatransport.h;
import java.util.HashMap;

/* compiled from: PriorityMapping.java */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static SparseArray<h> f89522a = new SparseArray<>();

    /* renamed from: b, reason: collision with root package name */
    private static HashMap<h, Integer> f89523b;

    static {
        HashMap<h, Integer> hashMap = new HashMap<>();
        f89523b = hashMap;
        hashMap.put(h.DEFAULT, 0);
        f89523b.put(h.VERY_LOW, 1);
        f89523b.put(h.HIGHEST, 2);
        for (h hVar : f89523b.keySet()) {
            f89522a.append(f89523b.get(hVar).intValue(), hVar);
        }
    }

    public static int a(@o0 h hVar) {
        Integer num = f89523b.get(hVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException(ProtectedSandApp.s("\uefcb") + hVar);
    }

    @o0
    public static h b(int i4) {
        h hVar = f89522a.get(i4);
        if (hVar != null) {
            return hVar;
        }
        throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("\uefcc"), i4));
    }
}
