package androidx.constraintlayout.motion.widget;

import java.util.Arrays;
import java.util.HashMap;

/* compiled from: KeyCache.java */
/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    HashMap<Object, HashMap<String, float[]>> f1848a = new HashMap<>();

    float a(Object obj, String str, int i5) {
        if (!this.f1848a.containsKey(obj)) {
            return Float.NaN;
        }
        HashMap<String, float[]> hashMap = this.f1848a.get(obj);
        if (!hashMap.containsKey(str)) {
            return Float.NaN;
        }
        float[] fArr = hashMap.get(str);
        if (fArr.length > i5) {
            return fArr[i5];
        }
        return Float.NaN;
    }

    void b(Object obj, String str, int i5, float f6) {
        if (!this.f1848a.containsKey(obj)) {
            HashMap<String, float[]> hashMap = new HashMap<>();
            float[] fArr = new float[i5 + 1];
            fArr[i5] = f6;
            hashMap.put(str, fArr);
            this.f1848a.put(obj, hashMap);
            return;
        }
        HashMap<String, float[]> hashMap2 = this.f1848a.get(obj);
        if (!hashMap2.containsKey(str)) {
            float[] fArr2 = new float[i5 + 1];
            fArr2[i5] = f6;
            hashMap2.put(str, fArr2);
            this.f1848a.put(obj, hashMap2);
            return;
        }
        float[] fArr3 = hashMap2.get(str);
        if (fArr3.length <= i5) {
            fArr3 = Arrays.copyOf(fArr3, i5 + 1);
        }
        fArr3[i5] = f6;
        hashMap2.put(str, fArr3);
    }
}
