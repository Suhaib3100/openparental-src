package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import androidx.constraintlayout.widget.f;
import androidx.core.view.y1;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: ConstraintAttribute.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: h, reason: collision with root package name */
    private static final String f2814h = "TransitionLayout";

    /* renamed from: a, reason: collision with root package name */
    String f2815a;

    /* renamed from: b, reason: collision with root package name */
    private b f2816b;

    /* renamed from: c, reason: collision with root package name */
    private int f2817c;

    /* renamed from: d, reason: collision with root package name */
    private float f2818d;

    /* renamed from: e, reason: collision with root package name */
    private String f2819e;

    /* renamed from: f, reason: collision with root package name */
    boolean f2820f;

    /* renamed from: g, reason: collision with root package name */
    private int f2821g;

    /* compiled from: ConstraintAttribute.java */
    /* renamed from: androidx.constraintlayout.widget.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0022a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2822a;

        static {
            int[] iArr = new int[b.values().length];
            f2822a = iArr;
            try {
                iArr[b.COLOR_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2822a[b.COLOR_DRAWABLE_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2822a[b.INT_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2822a[b.FLOAT_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2822a[b.STRING_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2822a[b.BOOLEAN_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2822a[b.DIMENSION_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: ConstraintAttribute.java */
    public enum b {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE
    }

    public a(String str, b bVar) {
        this.f2815a = str;
        this.f2816b = bVar;
    }

    private static int a(int i5) {
        int i6 = (i5 & (~(i5 >> 31))) - 255;
        return (i6 & (i6 >> 31)) + 255;
    }

    public static HashMap<String, a> c(HashMap<String, a> hashMap, View view) {
        HashMap<String, a> hashMap2 = new HashMap<>();
        Class<?> cls = view.getClass();
        for (String str : hashMap.keySet()) {
            a aVar = hashMap.get(str);
            try {
                if (str.equals("BackgroundColor")) {
                    hashMap2.put(str, new a(aVar, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())));
                } else {
                    hashMap2.put(str, new a(aVar, cls.getMethod("getMap" + str, new Class[0]).invoke(view, new Object[0])));
                }
            } catch (IllegalAccessException e6) {
                e6.printStackTrace();
            } catch (NoSuchMethodException e7) {
                e7.printStackTrace();
            } catch (InvocationTargetException e8) {
                e8.printStackTrace();
            }
        }
        return hashMap2;
    }

    public static void h(Context context, XmlPullParser xmlPullParser, HashMap<String, a> hashMap) {
        b bVar;
        Object string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), f.m.W9);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj = null;
        b bVar2 = null;
        for (int i5 = 0; i5 < indexCount; i5++) {
            int index = obtainStyledAttributes.getIndex(i5);
            if (index == f.m.X9) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == f.m.Y9) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                bVar2 = b.BOOLEAN_TYPE;
            } else {
                if (index == f.m.aa) {
                    bVar = b.COLOR_TYPE;
                    string = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == f.m.Z9) {
                    bVar = b.COLOR_DRAWABLE_TYPE;
                    string = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == f.m.ea) {
                    bVar = b.DIMENSION_TYPE;
                    string = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == f.m.ba) {
                    bVar = b.DIMENSION_TYPE;
                    string = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == f.m.ca) {
                    bVar = b.FLOAT_TYPE;
                    string = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == f.m.da) {
                    bVar = b.INT_TYPE;
                    string = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                } else if (index == f.m.fa) {
                    bVar = b.STRING_TYPE;
                    string = obtainStyledAttributes.getString(index);
                }
                Object obj2 = string;
                bVar2 = bVar;
                obj = obj2;
            }
        }
        if (str != null && obj != null) {
            hashMap.put(str, new a(str, bVar2, obj));
        }
        obtainStyledAttributes.recycle();
    }

    public static void i(View view, HashMap<String, a> hashMap) {
        Class<?> cls = view.getClass();
        for (String str : hashMap.keySet()) {
            a aVar = hashMap.get(str);
            String a6 = androidx.constraintlayout.motion.widget.g.a("set", str);
            try {
                switch (C0022a.f2822a[aVar.f2816b.ordinal()]) {
                    case 1:
                        cls.getMethod(a6, Integer.TYPE).invoke(view, Integer.valueOf(aVar.f2821g));
                        break;
                    case 2:
                        Method method = cls.getMethod(a6, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(aVar.f2821g);
                        method.invoke(view, colorDrawable);
                        break;
                    case 3:
                        cls.getMethod(a6, Integer.TYPE).invoke(view, Integer.valueOf(aVar.f2817c));
                        break;
                    case 4:
                        cls.getMethod(a6, Float.TYPE).invoke(view, Float.valueOf(aVar.f2818d));
                        break;
                    case 5:
                        cls.getMethod(a6, CharSequence.class).invoke(view, aVar.f2819e);
                        break;
                    case 6:
                        cls.getMethod(a6, Boolean.TYPE).invoke(view, Boolean.valueOf(aVar.f2820f));
                        break;
                    case 7:
                        cls.getMethod(a6, Float.TYPE).invoke(view, Float.valueOf(aVar.f2818d));
                        break;
                }
            } catch (IllegalAccessException e6) {
                e6.printStackTrace();
            } catch (NoSuchMethodException e7) {
                e7.getMessage();
            } catch (InvocationTargetException e8) {
                e8.printStackTrace();
            }
        }
    }

    public boolean b(a aVar) {
        b bVar;
        if (aVar == null || (bVar = this.f2816b) != aVar.f2816b) {
            return false;
        }
        switch (C0022a.f2822a[bVar.ordinal()]) {
            case 1:
            case 2:
                return this.f2821g == aVar.f2821g;
            case 3:
                return this.f2817c == aVar.f2817c;
            case 4:
                return this.f2818d == aVar.f2818d;
            case 5:
                return this.f2817c == aVar.f2817c;
            case 6:
                return this.f2820f == aVar.f2820f;
            case 7:
                return this.f2818d == aVar.f2818d;
            default:
                return false;
        }
    }

    public b d() {
        return this.f2816b;
    }

    public float e() {
        switch (C0022a.f2822a[this.f2816b.ordinal()]) {
            case 1:
            case 2:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 3:
                return this.f2817c;
            case 4:
                return this.f2818d;
            case 5:
                throw new RuntimeException("Cannot interpolate String");
            case 6:
                return this.f2820f ? 1.0f : 0.0f;
            case 7:
                return this.f2818d;
            default:
                return Float.NaN;
        }
    }

    public void f(float[] fArr) {
        switch (C0022a.f2822a[this.f2816b.ordinal()]) {
            case 1:
            case 2:
                int i5 = (this.f2821g >> 24) & 255;
                float pow = (float) Math.pow(((r0 >> 16) & 255) / 255.0f, 2.2d);
                float pow2 = (float) Math.pow(((r0 >> 8) & 255) / 255.0f, 2.2d);
                float pow3 = (float) Math.pow((r0 & 255) / 255.0f, 2.2d);
                fArr[0] = pow;
                fArr[1] = pow2;
                fArr[2] = pow3;
                fArr[3] = i5 / 255.0f;
                return;
            case 3:
                fArr[0] = this.f2817c;
                return;
            case 4:
                fArr[0] = this.f2818d;
                return;
            case 5:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 6:
                fArr[0] = this.f2820f ? 1.0f : 0.0f;
                return;
            case 7:
                fArr[0] = this.f2818d;
                return;
            default:
                return;
        }
    }

    public int g() {
        int i5 = C0022a.f2822a[this.f2816b.ordinal()];
        return (i5 == 1 || i5 == 2) ? 4 : 1;
    }

    public void j(int i5) {
        this.f2821g = i5;
    }

    public void k(float f6) {
        this.f2818d = f6;
    }

    public void l(int i5) {
        this.f2817c = i5;
    }

    public void m(View view, float[] fArr) {
        Class<?> cls = view.getClass();
        String str = "set" + this.f2815a;
        try {
            boolean z5 = true;
            switch (C0022a.f2822a[this.f2816b.ordinal()]) {
                case 1:
                    cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf((a((int) (fArr[3] * 255.0f)) << 24) | (a((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (a((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | a((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f))));
                    return;
                case 2:
                    Method method = cls.getMethod(str, Drawable.class);
                    int a6 = (a((int) (fArr[3] * 255.0f)) << 24) | (a((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (a((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | a((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(a6);
                    method.invoke(view, colorDrawable);
                    return;
                case 3:
                    cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf((int) fArr[0]));
                    return;
                case 4:
                    cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(fArr[0]));
                    return;
                case 5:
                    throw new RuntimeException("unable to interpolate strings " + this.f2815a);
                case 6:
                    Method method2 = cls.getMethod(str, Boolean.TYPE);
                    Object[] objArr = new Object[1];
                    if (fArr[0] <= 0.5f) {
                        z5 = false;
                    }
                    objArr[0] = Boolean.valueOf(z5);
                    method2.invoke(view, objArr);
                    return;
                case 7:
                    cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(fArr[0]));
                    return;
                default:
                    return;
            }
        } catch (IllegalAccessException e6) {
            androidx.constraintlayout.motion.widget.d.k(view);
            e6.printStackTrace();
        } catch (NoSuchMethodException e7) {
            androidx.constraintlayout.motion.widget.d.k(view);
            e7.printStackTrace();
        } catch (InvocationTargetException e8) {
            e8.printStackTrace();
        }
    }

    public void n(String str) {
        this.f2819e = str;
    }

    public void o(Object obj) {
        switch (C0022a.f2822a[this.f2816b.ordinal()]) {
            case 1:
            case 2:
                this.f2821g = ((Integer) obj).intValue();
                break;
            case 3:
                this.f2817c = ((Integer) obj).intValue();
                break;
            case 4:
                this.f2818d = ((Float) obj).floatValue();
                break;
            case 5:
                this.f2819e = (String) obj;
                break;
            case 6:
                this.f2820f = ((Boolean) obj).booleanValue();
                break;
            case 7:
                this.f2818d = ((Float) obj).floatValue();
                break;
        }
    }

    public void p(float[] fArr) {
        switch (C0022a.f2822a[this.f2816b.ordinal()]) {
            case 1:
            case 2:
                int HSVToColor = Color.HSVToColor(fArr);
                this.f2821g = HSVToColor;
                this.f2821g = (a((int) (fArr[3] * 255.0f)) << 24) | (HSVToColor & y1.f5757s);
                return;
            case 3:
                this.f2817c = (int) fArr[0];
                return;
            case 4:
                this.f2818d = fArr[0];
                return;
            case 5:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 6:
                this.f2820f = ((double) fArr[0]) > 0.5d;
                return;
            case 7:
                this.f2818d = fArr[0];
                return;
            default:
                return;
        }
    }

    public a(String str, b bVar, Object obj) {
        this.f2815a = str;
        this.f2816b = bVar;
        o(obj);
    }

    public a(a aVar, Object obj) {
        this.f2815a = aVar.f2815a;
        this.f2816b = aVar.f2816b;
        o(obj);
    }
}
