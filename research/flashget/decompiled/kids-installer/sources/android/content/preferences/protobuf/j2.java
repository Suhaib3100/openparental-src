package android.content.preferences.protobuf;

import android.content.preferences.protobuf.i1;
import androidx.constraintlayout.motion.widget.c;
import androidx.constraintlayout.solver.e;
import com.google.firebase.remoteconfig.p;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import kotlin.text.Typography;

/* compiled from: MessageLiteToString.java */
/* loaded from: classes.dex */
final class j2 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f7278a = "List";

    /* renamed from: b, reason: collision with root package name */
    private static final String f7279b = "OrBuilderList";

    /* renamed from: c, reason: collision with root package name */
    private static final String f7280c = "Map";

    /* renamed from: d, reason: collision with root package name */
    private static final String f7281d = "Bytes";

    j2() {
    }

    private static final String a(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i5 = 0; i5 < str.length(); i5++) {
            char charAt = str.charAt(i5);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    private static boolean b(Object obj) {
        return obj instanceof Boolean ? !((Boolean) obj).booleanValue() : obj instanceof Integer ? ((Integer) obj).intValue() == 0 : obj instanceof Float ? ((Float) obj).floatValue() == 0.0f : obj instanceof Double ? ((Double) obj).doubleValue() == p.f18289o : obj instanceof String ? obj.equals("") : obj instanceof w ? obj.equals(w.f7553s) : obj instanceof h2 ? obj == ((h2) obj).m() : (obj instanceof Enum) && ((Enum) obj).ordinal() == 0;
    }

    static final void c(StringBuilder sb, int i5, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                c(sb, i5, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                c(sb, i5, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        int i6 = 0;
        for (int i7 = 0; i7 < i5; i7++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(x3.e((String) obj));
            sb.append(Typography.f27126b);
            return;
        }
        if (obj instanceof w) {
            sb.append(": \"");
            sb.append(x3.a((w) obj));
            sb.append(Typography.f27126b);
            return;
        }
        if (obj instanceof i1) {
            sb.append(" {");
            d((i1) obj, sb, i5 + 2);
            sb.append("\n");
            while (i6 < i5) {
                sb.append(' ');
                i6++;
            }
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj.toString());
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i8 = i5 + 2;
        c(sb, i8, "key", entry.getKey());
        c(sb, i8, "value", entry.getValue());
        sb.append("\n");
        while (i6 < i5) {
            sb.append(' ');
            i6++;
        }
        sb.append("}");
    }

    private static void d(h2 h2Var, StringBuilder sb, int i5) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet treeSet = new TreeSet();
        for (Method method : h2Var.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            String replaceFirst = str.replaceFirst("get", "");
            boolean z5 = true;
            if (replaceFirst.endsWith("List") && !replaceFirst.endsWith("OrBuilderList") && !replaceFirst.equals("List")) {
                String str2 = replaceFirst.substring(0, 1).toLowerCase() + replaceFirst.substring(1, replaceFirst.length() - 4);
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    c(sb, i5, a(str2), i1.Y1(method2, h2Var, new Object[0]));
                }
            }
            if (replaceFirst.endsWith("Map") && !replaceFirst.equals("Map")) {
                String str3 = replaceFirst.substring(0, 1).toLowerCase() + replaceFirst.substring(1, replaceFirst.length() - 3);
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    c(sb, i5, a(str3), i1.Y1(method3, h2Var, new Object[0]));
                }
            }
            if (((Method) hashMap2.get("set".concat(replaceFirst))) != null) {
                if (replaceFirst.endsWith("Bytes")) {
                    if (hashMap.containsKey("get" + replaceFirst.substring(0, replaceFirst.length() - 5))) {
                    }
                }
                String str4 = replaceFirst.substring(0, 1).toLowerCase() + replaceFirst.substring(1);
                Method method4 = (Method) hashMap.get("get".concat(replaceFirst));
                Method method5 = (Method) hashMap.get("has".concat(replaceFirst));
                if (method4 != null) {
                    Object Y1 = i1.Y1(method4, h2Var, new Object[0]);
                    if (method5 != null) {
                        z5 = ((Boolean) i1.Y1(method5, h2Var, new Object[0])).booleanValue();
                    } else if (b(Y1)) {
                        z5 = false;
                    }
                    if (z5) {
                        c(sb, i5, a(str4), Y1);
                    }
                }
            }
        }
        if (h2Var instanceof i1.e) {
            Iterator<Map.Entry<i1.g, Object>> H = ((i1.e) h2Var).extensions.H();
            while (H.hasNext()) {
                Map.Entry<i1.g, Object> next = H.next();
                c(sb, i5, e.a(new StringBuilder("["), next.getKey().f7248p, "]"), next.getValue());
            }
        }
        j4 j4Var = ((i1) h2Var).unknownFields;
        if (j4Var != null) {
            j4Var.q(sb, i5);
        }
    }

    static String e(h2 h2Var, String str) {
        StringBuilder a6 = c.a("# ", str);
        d(h2Var, a6, 0);
        return a6.toString();
    }
}
