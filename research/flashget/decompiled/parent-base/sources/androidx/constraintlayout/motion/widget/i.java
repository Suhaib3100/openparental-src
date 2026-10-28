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
public class i {

    /* renamed from: b, reason: collision with root package name */
    public static final int f23386b = -1;

    /* renamed from: e, reason: collision with root package name */
    static HashMap<String, Constructor<? extends f>> f23389e;

    /* renamed from: a, reason: collision with root package name */
    private HashMap<Integer, ArrayList<f>> f23391a = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private static final String f23387c = "CustomMethod";

    /* renamed from: d, reason: collision with root package name */
    private static final String f23388d = "CustomAttribute";

    /* renamed from: f, reason: collision with root package name */
    private static final String f23390f = "KeyFrames";

    static {
        HashMap<String, Constructor<? extends f>> hashMap = new HashMap<>();
        f23389e = hashMap;
        try {
            hashMap.put("KeyAttribute", g.class.getConstructor(null));
            f23389e.put("KeyPosition", j.class.getConstructor(null));
            f23389e.put("KeyCycle", h.class.getConstructor(null));
            f23389e.put("KeyTimeCycle", l.class.getConstructor(null));
            f23389e.put("KeyTrigger", m.class.getConstructor(null));
        } catch (NoSuchMethodException unused) {
        }
    }

    public i() {
    }

    static String f(int viewId, Context context) {
        return context.getResources().getResourceEntryName(viewId);
    }

    public void a(o motionController) {
        ArrayList<f> arrayList = this.f23391a.get(-1);
        if (arrayList != null) {
            motionController.b(arrayList);
        }
    }

    public void b(o motionController) {
        ArrayList<f> arrayList = this.f23391a.get(Integer.valueOf(motionController.f23505c));
        if (arrayList != null) {
            motionController.b(arrayList);
        }
        ArrayList<f> arrayList2 = this.f23391a.get(-1);
        if (arrayList2 != null) {
            Iterator<f> it = arrayList2.iterator();
            while (it.hasNext()) {
                f next = it.next();
                if (next.g(((ConstraintLayout.LayoutParams) motionController.f23504b.getLayoutParams()).R2)) {
                    motionController.a(next);
                }
            }
        }
    }

    public void c(f key) {
        if (!this.f23391a.containsKey(Integer.valueOf(key.f23330b))) {
            this.f23391a.put(Integer.valueOf(key.f23330b), new ArrayList<>());
        }
        ArrayList<f> arrayList = this.f23391a.get(Integer.valueOf(key.f23330b));
        if (arrayList != null) {
            arrayList.add(key);
        }
    }

    public ArrayList<f> d(int id2) {
        return this.f23391a.get(Integer.valueOf(id2));
    }

    public Set<Integer> e() {
        return this.f23391a.keySet();
    }

    public i(Context context, XmlPullParser parser) {
        HashMap<String, androidx.constraintlayout.widget.a> hashMap;
        HashMap<String, androidx.constraintlayout.widget.a> hashMap2;
        try {
            int eventType = parser.getEventType();
            f fVar = null;
            while (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3 && "KeyFrameSet".equals(parser.getName())) {
                        return;
                    }
                } else {
                    String name = parser.getName();
                    if (f23389e.containsKey(name)) {
                        try {
                            Constructor<? extends f> constructor = f23389e.get(name);
                            if (constructor != null) {
                                f newInstance = constructor.newInstance(null);
                                try {
                                    newInstance.f(context, Xml.asAttributeSet(parser));
                                    c(newInstance);
                                } catch (Exception unused) {
                                }
                                fVar = newInstance;
                            } else {
                                throw new NullPointerException("Keymaker for " + name + " not found");
                            }
                        } catch (Exception unused2) {
                        }
                    } else if (name.equalsIgnoreCase("CustomAttribute")) {
                        if (fVar != null && (hashMap2 = fVar.f23333e) != null) {
                            androidx.constraintlayout.widget.a.q(context, parser, hashMap2);
                        }
                    } else if (name.equalsIgnoreCase("CustomMethod") && fVar != null && (hashMap = fVar.f23333e) != null) {
                        androidx.constraintlayout.widget.a.q(context, parser, hashMap);
                    }
                }
                eventType = parser.next();
            }
        } catch (IOException e4) {
            e4.printStackTrace();
        } catch (XmlPullParserException e5) {
            e5.printStackTrace();
        }
    }
}
