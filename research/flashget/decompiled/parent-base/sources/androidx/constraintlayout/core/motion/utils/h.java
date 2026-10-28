package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;
import java.util.HashMap;

/* compiled from: KeyCache.java */
/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    HashMap<Object, HashMap<String, float[]>> f22225a = new HashMap<>();

    public float a(Object obj, String str, int i4) {
        HashMap<String, float[]> hashMap;
        float[] fArr;
        if (this.f22225a.containsKey(obj) && (hashMap = this.f22225a.get(obj)) != null && hashMap.containsKey(str) && (fArr = hashMap.get(str)) != null && fArr.length > i4) {
            return fArr[i4];
        }
        return Float.NaN;
    }

    public void b(Object obj, String str, int i4, float f4) {
        if (!this.f22225a.containsKey(obj)) {
            HashMap<String, float[]> hashMap = new HashMap<>();
            float[] fArr = new float[i4 + 1];
            fArr[i4] = f4;
            hashMap.put(str, fArr);
            this.f22225a.put(obj, hashMap);
            return;
        }
        HashMap<String, float[]> hashMap2 = this.f22225a.get(obj);
        if (hashMap2 == null) {
            hashMap2 = new HashMap<>();
        }
        if (!hashMap2.containsKey(str)) {
            float[] fArr2 = new float[i4 + 1];
            fArr2[i4] = f4;
            hashMap2.put(str, fArr2);
            this.f22225a.put(obj, hashMap2);
            return;
        }
        float[] fArr3 = hashMap2.get(str);
        if (fArr3 == null) {
            fArr3 = new float[0];
        }
        if (fArr3.length <= i4) {
            fArr3 = Arrays.copyOf(fArr3, i4 + 1);
        }
        fArr3[i4] = f4;
        hashMap2.put(str, fArr3);
    }
}
