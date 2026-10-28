package androidx.content.preferences.protobuf;

import android.support.v4.media.b;
import androidx.constraintlayout.core.e;
import androidx.content.preferences.protobuf.i1;
import com.google.firebase.remoteconfig.p;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import kotlin.text.m0;

/* compiled from: MessageLiteToString.java */
/* loaded from: classes3.dex */
final class k2 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f28721a = "List";

    /* renamed from: b, reason: collision with root package name */
    private static final String f28722b = "OrBuilderList";

    /* renamed from: c, reason: collision with root package name */
    private static final String f28723c = "Map";

    /* renamed from: d, reason: collision with root package name */
    private static final String f28724d = "Bytes";

    k2() {
    }

    private static final String a(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i4 = 0; i4 < str.length(); i4++) {
            char charAt = str.charAt(i4);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    private static boolean b(Object obj) {
        return obj instanceof Boolean ? !((Boolean) obj).booleanValue() : obj instanceof Integer ? ((Integer) obj).intValue() == 0 : obj instanceof Float ? ((Float) obj).floatValue() == 0.0f : obj instanceof Double ? ((Double) obj).doubleValue() == p.f60679p : obj instanceof String ? obj.equals("") : obj instanceof w ? obj.equals(w.f28998f) : obj instanceof i2 ? obj == ((i2) obj).z() : (obj instanceof Enum) && ((Enum) obj).ordinal() == 0;
    }

    static final void c(StringBuilder sb, int i4, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                c(sb, i4, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                c(sb, i4, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(a4.e((String) obj));
            sb.append(m0.quote);
            return;
        }
        if (obj instanceof w) {
            sb.append(": \"");
            sb.append(a4.a((w) obj));
            sb.append(m0.quote);
            return;
        }
        if (obj instanceof i1) {
            sb.append(" {");
            d((i1) obj, sb, i4 + 2);
            sb.append("\n");
            while (i5 < i4) {
                sb.append(' ');
                i5++;
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
        int i7 = i4 + 2;
        c(sb, i7, "key", entry.getKey());
        c(sb, i7, "value", entry.getValue());
        sb.append("\n");
        while (i5 < i4) {
            sb.append(' ');
            i5++;
        }
        sb.append("}");
    }

    private static void d(i2 i2Var, StringBuilder sb, int i4) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet treeSet = new TreeSet();
        for (Method method : i2Var.getClass().getDeclaredMethods()) {
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
            boolean z4 = true;
            if (replaceFirst.endsWith("List") && !replaceFirst.endsWith("OrBuilderList") && !replaceFirst.equals("List")) {
                String str2 = replaceFirst.substring(0, 1).toLowerCase() + replaceFirst.substring(1, replaceFirst.length() - 4);
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    c(sb, i4, a(str2), i1.V1(method2, i2Var, new Object[0]));
                }
            }
            if (replaceFirst.endsWith("Map") && !replaceFirst.equals("Map")) {
                String str3 = replaceFirst.substring(0, 1).toLowerCase() + replaceFirst.substring(1, replaceFirst.length() - 3);
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    c(sb, i4, a(str3), i1.V1(method3, i2Var, new Object[0]));
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
                    Object V1 = i1.V1(method4, i2Var, new Object[0]);
                    if (method5 != null) {
                        z4 = ((Boolean) i1.V1(method5, i2Var, new Object[0])).booleanValue();
                    } else if (b(V1)) {
                        z4 = false;
                    }
                    if (z4) {
                        c(sb, i4, a(str4), V1);
                    }
                }
            }
        }
        if (i2Var instanceof i1.e) {
            Iterator<Map.Entry<i1.g, Object>> H = ((i1.e) i2Var).extensions.H();
            while (H.hasNext()) {
                Map.Entry<i1.g, Object> next = H.next();
                c(sb, i4, b.a(new StringBuilder("["), next.getKey().f28703c, "]"), next.getValue());
            }
        }
        m4 m4Var = ((i1) i2Var).unknownFields;
        if (m4Var != null) {
            m4Var.q(sb, i4);
        }
    }

    static String e(i2 i2Var, String str) {
        StringBuilder a5 = e.a("# ", str);
        d(i2Var, a5, 0);
        return a5.toString();
    }
}
