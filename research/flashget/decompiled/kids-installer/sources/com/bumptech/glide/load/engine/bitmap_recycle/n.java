package com.bumptech.glide.load.engine.bitmap_recycle;

import androidx.constraintlayout.motion.widget.r;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: PrettyPrintTreeMap.java */
/* loaded from: classes.dex */
class n<K, V> extends TreeMap<K, V> {
    n() {
    }

    @Override // java.util.AbstractMap
    public String toString() {
        StringBuilder a6 = r.a(ProtectedSandApp.s("Ğ"));
        for (Map.Entry<K, V> entry : entrySet()) {
            a6.append('{');
            a6.append(entry.getKey());
            a6.append(':');
            a6.append(entry.getValue());
            a6.append(ProtectedSandApp.s("ğ"));
        }
        if (!isEmpty()) {
            a6.replace(a6.length() - 2, a6.length(), "");
        }
        a6.append(ProtectedSandApp.s("Ġ"));
        return a6.toString();
    }
}
