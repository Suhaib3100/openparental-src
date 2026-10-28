package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: KeyFrames.java */
/* loaded from: classes.dex */
public class l {

    /* renamed from: b, reason: collision with root package name */
    public static final int f1902b = -1;

    /* renamed from: c, reason: collision with root package name */
    static HashMap<String, Constructor<? extends f>> f1903c;

    /* renamed from: d, reason: collision with root package name */
    private static final String f1904d = "KeyFrames";

    /* renamed from: a, reason: collision with root package name */
    private HashMap<Integer, ArrayList<f>> f1905a = new HashMap<>();

    static {
        HashMap<String, Constructor<? extends f>> hashMap = new HashMap<>();
        f1903c = hashMap;
        try {
            hashMap.put("KeyAttribute", h.class.getConstructor(new Class[0]));
            f1903c.put("KeyPosition", m.class.getConstructor(new Class[0]));
            f1903c.put("KeyCycle", j.class.getConstructor(new Class[0]));
            f1903c.put("KeyTimeCycle", o.class.getConstructor(new Class[0]));
            f1903c.put("KeyTrigger", p.class.getConstructor(new Class[0]));
        } catch (NoSuchMethodException unused) {
        }
    }

    public l(Context context, XmlPullParser xmlPullParser) {
        HashMap<String, androidx.constraintlayout.widget.a> hashMap;
        try {
            int eventType = xmlPullParser.getEventType();
            f fVar = null;
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    if (f1903c.containsKey(name)) {
                        try {
                            f newInstance = f1903c.get(name).newInstance(new Object[0]);
                            try {
                                newInstance.c(context, Xml.asAttributeSet(xmlPullParser));
                                b(newInstance);
                            } catch (Exception unused) {
                            }
                            fVar = newInstance;
                        } catch (Exception unused2) {
                        }
                    } else if (name.equalsIgnoreCase("CustomAttribute") && fVar != null && (hashMap = fVar.f1826e) != null) {
                        androidx.constraintlayout.widget.a.h(context, xmlPullParser, hashMap);
                    }
                } else if (eventType == 3 && "KeyFrameSet".equals(xmlPullParser.getName())) {
                    return;
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e6) {
            e6.printStackTrace();
        } catch (XmlPullParserException e7) {
            e7.printStackTrace();
        }
    }

    private void b(f fVar) {
        if (!this.f1905a.containsKey(Integer.valueOf(fVar.f1823b))) {
            this.f1905a.put(Integer.valueOf(fVar.f1823b), new ArrayList<>());
        }
        this.f1905a.get(Integer.valueOf(fVar.f1823b)).add(fVar);
    }

    static String e(int i5, Context context) {
        return context.getResources().getResourceEntryName(i5);
    }

    public void a(s sVar) {
        ArrayList<f> arrayList = this.f1905a.get(Integer.valueOf(sVar.f1969b));
        if (arrayList != null) {
            sVar.b(arrayList);
        }
        ArrayList<f> arrayList2 = this.f1905a.get(-1);
        if (arrayList2 != null) {
            Iterator<f> it = arrayList2.iterator();
            while (it.hasNext()) {
                f next = it.next();
                if (next.d(((ConstraintLayout.LayoutParams) sVar.f1968a.getLayoutParams()).V)) {
                    sVar.a(next);
                }
            }
        }
    }

    public ArrayList<f> c(int i5) {
        return this.f1905a.get(Integer.valueOf(i5));
    }

    public Set<Integer> d() {
        return this.f1905a.keySet();
    }
}
