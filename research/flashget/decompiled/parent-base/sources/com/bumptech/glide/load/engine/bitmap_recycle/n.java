package com.bumptech.glide.load.engine.bitmap_recycle;

import androidx.compose.material3.j4;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: PrettyPrintTreeMap.java */
/* loaded from: classes3.dex */
class n<K, V> extends TreeMap<K, V> {
    n() {
    }

    @Override // java.util.AbstractMap
    public String toString() {
        StringBuilder a5 = j4.a(ProtectedSandApp.s("ࢱ"));
        for (Map.Entry<K, V> entry : entrySet()) {
            a5.append('{');
            a5.append(entry.getKey());
            a5.append(':');
            a5.append(entry.getValue());
            a5.append(ProtectedSandApp.s("ࢲ"));
        }
        if (!isEmpty()) {
            a5.replace(a5.length() - 2, a5.length(), "");
        }
        a5.append(ProtectedSandApp.s("ࢳ"));
        return a5.toString();
    }
}
