package com.google.android.libraries.places.internal;

import androidx.constraintlayout.core.e;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import kotlin.text.m0;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
final class zzaet {
    static String zza(zzaer zzaerVar, String str) {
        StringBuilder a5 = e.a(ProtectedSandApp.s("\ue7ac"), str);
        zzd(zzaerVar, a5, 0);
        return a5.toString();
    }

    static final void zzb(StringBuilder sb, int i4, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zzb(sb, i4, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zzb(sb, i4, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            sb.append(' ');
        }
        sb.append(str);
        boolean z4 = obj instanceof String;
        String s4 = ProtectedSandApp.s("\ue7ad");
        if (z4) {
            sb.append(s4);
            sb.append(zzafr.zza(zzacp.zzl((String) obj)));
            sb.append(m0.quote);
            return;
        }
        if (obj instanceof zzacp) {
            sb.append(s4);
            sb.append(zzafr.zza((zzacp) obj));
            sb.append(m0.quote);
            return;
        }
        boolean z5 = obj instanceof zzadk;
        String s5 = ProtectedSandApp.s("\ue7ae");
        String s6 = ProtectedSandApp.s("\ue7af");
        String s7 = ProtectedSandApp.s("\ue7b0");
        if (z5) {
            sb.append(s7);
            zzd((zzadk) obj, sb, i4 + 2);
            sb.append(s6);
            while (i5 < i4) {
                sb.append(' ');
                i5++;
            }
            sb.append(s5);
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(ProtectedSandApp.s("\ue7b3"));
            sb.append(obj);
            return;
        }
        sb.append(s7);
        Map.Entry entry = (Map.Entry) obj;
        int i7 = i4 + 2;
        zzb(sb, i7, ProtectedSandApp.s("\ue7b1"), entry.getKey());
        zzb(sb, i7, ProtectedSandApp.s("\ue7b2"), entry.getValue());
        sb.append(s6);
        while (i5 < i4) {
            sb.append(' ');
            i5++;
        }
        sb.append(s5);
    }

    private static final String zzc(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i4 = 0; i4 < str.length(); i4++) {
            char charAt = str.charAt(i4);
            if (Character.isUpperCase(charAt)) {
                sb.append(ProtectedSandApp.s("\ue7b4"));
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    private static void zzd(zzaer zzaerVar, StringBuilder sb, int i4) {
        String s4;
        boolean equals;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet treeSet = new TreeSet();
        Method[] declaredMethods = zzaerVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i5 = 0;
        while (true) {
            s4 = ProtectedSandApp.s("\ue7b5");
            if (i5 >= length) {
                break;
            }
            Method method = declaredMethods[i5];
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith(s4)) {
                    treeSet.add(method.getName());
                }
            }
            i5++;
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            String substring = str.startsWith(s4) ? str.substring(3) : str;
            String s5 = ProtectedSandApp.s("\ue7b6");
            if (substring.endsWith(s5) && !substring.endsWith(ProtectedSandApp.s("\ue7b7")) && !substring.equals(s5)) {
                String valueOf = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf2 = String.valueOf(substring.substring(1, substring.length() - 4));
                String concat = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    zzb(sb, i4, zzc(concat), zzadk.zzE(method2, zzaerVar, new Object[0]));
                }
            }
            String s6 = ProtectedSandApp.s("\ue7b8");
            if (substring.endsWith(s6) && !substring.equals(s6)) {
                String valueOf3 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf4 = String.valueOf(substring.substring(1, substring.length() - 3));
                String concat2 = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    zzb(sb, i4, zzc(concat2), zzadk.zzE(method3, zzaerVar, new Object[0]));
                }
            }
            int length2 = substring.length();
            String s7 = ProtectedSandApp.s("\ue7b9");
            if (((Method) hashMap2.get(length2 != 0 ? s7.concat(substring) : new String(s7))) != null) {
                if (substring.endsWith(ProtectedSandApp.s("\ue7ba"))) {
                    String valueOf5 = String.valueOf(substring.substring(0, substring.length() - 5));
                    if (!hashMap.containsKey(valueOf5.length() != 0 ? s4.concat(valueOf5) : new String(s4))) {
                    }
                }
                String valueOf6 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf7 = String.valueOf(substring.substring(1));
                String concat3 = valueOf7.length() != 0 ? valueOf6.concat(valueOf7) : new String(valueOf6);
                Method method4 = (Method) hashMap.get(substring.length() != 0 ? s4.concat(substring) : new String(s4));
                int length3 = substring.length();
                String s10 = ProtectedSandApp.s("\ue7bb");
                Method method5 = (Method) hashMap.get(length3 != 0 ? s10.concat(substring) : new String(s10));
                if (method4 != null) {
                    Object zzE = zzadk.zzE(method4, zzaerVar, new Object[0]);
                    if (method5 == null) {
                        if (zzE instanceof Boolean) {
                            if (((Boolean) zzE).booleanValue()) {
                                zzb(sb, i4, zzc(concat3), zzE);
                            }
                        } else if (zzE instanceof Integer) {
                            if (((Integer) zzE).intValue() != 0) {
                                zzb(sb, i4, zzc(concat3), zzE);
                            }
                        } else if (zzE instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) zzE).floatValue()) != 0) {
                                zzb(sb, i4, zzc(concat3), zzE);
                            }
                        } else if (!(zzE instanceof Double)) {
                            if (zzE instanceof String) {
                                equals = zzE.equals("");
                            } else if (zzE instanceof zzacp) {
                                equals = zzE.equals(zzacp.zzb);
                            } else if (!(zzE instanceof zzaer)) {
                                if ((zzE instanceof Enum) && ((Enum) zzE).ordinal() == 0) {
                                }
                                zzb(sb, i4, zzc(concat3), zzE);
                            } else if (zzE != ((zzaer) zzE).zzw()) {
                                zzb(sb, i4, zzc(concat3), zzE);
                            }
                            if (!equals) {
                                zzb(sb, i4, zzc(concat3), zzE);
                            }
                        } else if (Double.doubleToRawLongBits(((Double) zzE).doubleValue()) != 0) {
                            zzb(sb, i4, zzc(concat3), zzE);
                        }
                    } else if (((Boolean) zzadk.zzE(method5, zzaerVar, new Object[0])).booleanValue()) {
                        zzb(sb, i4, zzc(concat3), zzE);
                    }
                }
            }
        }
        if (zzaerVar instanceof zzadi) {
            throw null;
        }
        zzafu zzafuVar = ((zzadk) zzaerVar).zzc;
        if (zzafuVar != null) {
            zzafuVar.zze(sb, i4);
        }
    }
}
